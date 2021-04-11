package Bridge;

public class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void typeOn(){
        device.turnOn();
    };

    public void typeOff(){
        device.turnOff();
    };
}

