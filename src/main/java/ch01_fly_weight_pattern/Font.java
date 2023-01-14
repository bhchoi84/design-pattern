package ch01_fly_weight_pattern;

/**
 * 변경되지 않는 속성
 */
public final class Font {
    private final String family;
    private final int size;

    public Font(String family, int size){
        this.family = family;
        this.size = size;
    }

    public String getFamily(){
        return family;
    }

    public int getSize(){
        return size;
    }
}
