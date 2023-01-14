package ch01_fly_weight_pattern;

/**
 * fly-weight 패턴
 *
 * Structural pattern ( 구조적 패턴) 
 *  - 클래스와 객체의 구성과 관련
 *  동일하거나 유사한 객체들 사이에 가능한 많은 데이터를 서로 공유하여 사용하도록 하여
 *  메모리 사용량을 최소화하는 소프트웨어 디자인 패턴이다.
 *  종종 오브젝트의 일부 상태 정보는 공유될 수 있는데,
 *  플라이웨이트 패턴에서는 이와 같은 상태 정보를 외부 자료 구조에 저장하여
 *  플라이웨이트 오브젝트가 잠깐 동안 사용할 수 있도록 전달한다.
 *
 * 1. intrinsic ( 본래 가진 or 변경안되는 )
 *  locationX
 *  locationY
 *
 * 2. extrinsic ( 외부에 노출된 or 공유 되는 )
 *  fontEffect ( 굵게, 이탤릭으로 .. )
 *
 * # 참고 사이트
 * https://hirlawldo.tistory.com/m/173
 * https://m.blog.naver.com/2feelus/220669069127
 * https://www.oodesign.com/flyweight-pattern-wargame-example-java-sourcecode
 * https://keichee.tistory.com/175
 * https://ko.wikipedia.org/wiki/%ED%94%8C%EB%9D%BC%EC%9D%B4%EC%9B%A8%EC%9D%B4%ED%8A%B8_%ED%8C%A8%ED%84%B4
 * https://has3ong.github.io/programming/designpattern-flyweight/
 *
 * https://donghyeon.dev/design%20pattern/2020/04/07/%ED%94%8C%EB%9D%BC%EC%9D%B4%EC%9B%A8%EC%9D%B4%ED%8A%B8-%ED%8C%A8%ED%84%B4/
 * https://code-overflow.tistory.com/entry/%EB%94%94%EC%9E%90%EC%9D%B8-%ED%8C%A8%ED%84%B4Design-Pattern-%EA%B5%AC%EC%A1%B0-%ED%8C%A8%ED%84%B4%ED%94%8C%EB%9D%BC%EC%9D%B4%EC%9B%A8%EC%9D%B4%ED%8A%B8-%ED%8C%A8%ED%84%B4Flyweight-Pattern-%EC%9E%90%EB%B0%94Java-%EA%B5%AC%ED%98%84?category=901107?category=901107
 */
public class Client {
    public static void main(String[] args) {
        FontFactory fontFactory = new FontFactory();
        Character c1 = new Character('a', "black", fontFactory.getFont("nanum:12"));
        Character c2 = new Character('b', "red", fontFactory.getFont("nanum:12"));
        Character c3 = new Character('c', "green", fontFactory.getFont("nanum:12"));

    }
}
