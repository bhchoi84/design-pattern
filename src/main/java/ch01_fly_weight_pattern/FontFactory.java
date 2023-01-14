package ch01_fly_weight_pattern;

import java.util.*;

public class FontFactory {
    private Map<String, Font> cache = new HashMap();

    public Font getFont(String font){
        if(cache.containsKey(font)){
            System.out.println("cache된 값"+font.toString());
            return cache.get(font); // Font cache에서 가져간다.
        } else {
            System.out.println("신규 "+font.toString());
            String[] split = font.split(":");
            Font newFont = new Font(split[0], Integer.parseInt(split[1]));
            cache.put(font, newFont);
            return newFont;
        }
    }
}
