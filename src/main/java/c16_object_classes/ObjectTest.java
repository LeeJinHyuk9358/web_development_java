package c16_object_classes;
/*
    모든 클래스는 Object 클래스를 상속 받는다. -> 우리가 정의한 것 말고 기존에 있는 class들을 의미합니다.
 */
public class ObjectTest extends Object {
    private String name;
    private String adress;

    // NoArgsConstructor 정의하세요

    public ObjectTest() {
    }

    // AllArgsConstructor 정의하세요

    public ObjectTest(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }

    // setter / Getter 정의하세요

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    // displayInfo() 정의하세요
    // 실행 예
    // 이름 : 안근수
    // 주소 : 부산광역시 연제구
    public void displayInfo(){
        System.out.println("이름 : " + getName() + "\n주소 : " + getAdress());
    }
    
    // showInfo()를 정의하는데 sout말고 return 형으로 작성한 후, main에서 콘솔에 출력하세요
    public String showInfo() {
        // 여기에 이렇게 쓰시고 -> ObjectTestMain으로 가세요.
        return "이름 : " + name + "\n주소 : " + adress;
    }

    // 즉 기본적으로 toString()이라는 메서드는 어떤 특정한 클래스의 인스턴스를 전부 다 String형태로 바꿔주는 것을 의미하며, 이는
    // Object 클래스의 메서드를 Override 했음을 확인할 수 있음.  -> 재정의
    @Override
    public String toString() {
        return "이름 : " + name + "\n주소 : " + adress ;
    }
}
