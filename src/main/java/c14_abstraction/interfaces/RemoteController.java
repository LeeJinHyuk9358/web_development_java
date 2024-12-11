package c14_abstraction.interfaces;

public class RemoteController {
    // 필드 선언
    private PowerButton powerButton;
    private ChannelDownButton channelDownButton;
    private ChannelUpButton channelUpButton;
    // 추가된 필드
    private VolumeDownButton volumeDownButton;
    private VolumeUpButton volumeUpButton;  // 이 필드들을 추가하는 순간에 AllArgsConstructor가 아님
    
    /*
        AllArgsConstructor를 정의하세요.
     */

    public RemoteController(PowerButton powerButton, ChannelDownButton channelDownButton, ChannelUpButton channelUpButton, VolumeDownButton volumeDownButton, VolumeUpButton volumeUpButton) {
        this.powerButton = powerButton;
        this.channelDownButton = channelDownButton;
        this.channelUpButton = channelUpButton;
        // 소괄호 내에 매개변수를 수정했기 때문에 이하의 코드가 필요함
        this.volumeDownButton = volumeDownButton;
        this.volumeUpButton = volumeUpButton;
        // 마찬가지로 이걸 완성하는 순간 Main 단계에서 오류가 발생함 -> 아까전에는 Main이 AllArgs를 만족했으나
        // 이젠 아니기 때문
    }
    
    // 메서드 정의
    // PowerButton의 메서드 구현
    public void onPressedPowerButton() {
        powerButton.onPressed();        // 필드로 powerButton 객체를 지니고 있기 때문에
                                        // PowerButton 클래스에서 정의했던 메서드를 호출 가능
    }
    // channelDownButton의 메서드 구현
    public void onPressedChannelDownButton() {
        channelDownButton.onPressed();
    }
    public void onDownChannelDownButton() {
        channelDownButton.onDown();
    }

    // channelUpButton의 메서드 구현
    public void onPressedChannelUpButton() {
        channelUpButton.onPressed();
    }
    public void onUpChannelUpButton() {
        channelUpButton.onUp();
    }

    // VolumeDownButton의 메서드 구현
    public void onPressedVolumeDownButton() {
        volumeDownButton.onPressed();
    }
    public void onDownVolumeDownButton() {
        volumeDownButton.onDown();
    }

    // VolumeUpButton의 메서드 구현
    public void onPressedVolumeUpButton() {
        volumeUpButton.onPressed();
    }
    public void onUpVolumeUpButton() {
        volumeUpButton.onUp();
    }
}
/*
    1. VolumeDownButton, VolumeUpButton 클래스를 만들고 method들 구현하세요.
    2. RemoteController.java의 필드에 위에서 만든 클래스들의 객체를 추가하시오.
    3. RemoteController.java의 AllArgsConstructror를 만족하기 위해 생성자를 수정하시오.
    4. VolumeDownButton, VolumeUpButton에 있는 메서드들을 RemoteController.java에 재구현하시오.
    5. Main으로 넘어와서 볼륨 한 칸 내리기, 계속 내리기, 한 칸 올리기, 계속 올리기를 실행하세요.

    추가 과제

    온도 조절 버튼과 에어컨 리모콘 구현하기

    TemperatureDownButton, TemperatureUpButton, AirconditionerController.java 클래스를 만들어서
    Main에 AirConditionerController의 객체를 생성한 후

    전원이 켜졌습니다.
    전원이 꺼졌습니다.

    온도를 한 칸 내립니다.
    온도를 계속 내립니다.

    온도를 한 칸 올립니다.
    온도를 계속 올립니다.
 */
