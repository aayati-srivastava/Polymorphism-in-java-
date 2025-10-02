// Base class
class SmartDevice {
    String deviceName;

    SmartDevice(String deviceName) {
        this.deviceName = deviceName;
    }

    void powerOn() {
        System.out.println(deviceName + " powered ON.");
    }

    void powerOff() {
        System.out.println(deviceName + " powered OFF.");
    }
}

// Smart TV subclass
class SmartTV extends SmartDevice {
    SmartTV(String deviceName) {
        super(deviceName);
    }

    void changeChannel(int channel) {
        System.out.println(deviceName + " changed to channel " + channel);
    }

    void adjustVolume(int volume) {
        System.out.println(deviceName + " volume set to " + volume);
    }

    void openStreamingApp(String appName) {
        System.out.println(deviceName + " opened " + appName + " app.");
    }
}

// Smart Thermostat subclass
class SmartThermostat extends SmartDevice {
    SmartThermostat(String deviceName) {
        super(deviceName);
    }

    void setTemperature(double temp) {
        System.out.println(deviceName + " temperature set to " + temp + "°C");
    }

    void setHumidity(double humidity) {
        System.out.println(deviceName + " humidity set to " + humidity + "%");
    }

    void enableEnergySavingMode() {
        System.out.println(deviceName + " energy-saving mode enabled.");
    }
}

// Smart Security System subclass
class SmartSecuritySystem extends SmartDevice {
    SmartSecuritySystem(String deviceName) {
        super(deviceName);
    }

    void activateCameras() {
        System.out.println(deviceName + " cameras activated.");
    }

    void armAlarm() {
        System.out.println(deviceName + " alarm armed.");
    }

    void grantAccess(String person) {
        System.out.println(deviceName + " granted access to " + person);
    }
}

// Smart Kitchen Appliance subclass
class SmartKitchenAppliance extends SmartDevice {
    SmartKitchenAppliance(String deviceName) {
        super(deviceName);
    }

    void setCookingTime(int minutes) {
        System.out.println(deviceName + " cooking time set to " + minutes + " minutes.");
    }

    void setTemperature(double temp) {
        System.out.println(deviceName + " cooking temperature set to " + temp + "°C");
    }

    void selectRecipe(String recipe) {
        System.out.println(deviceName + " selected recipe: " + recipe);
    }
}

// Main class
public class SmartHomeAutomation {
    public static void main(String[] args) {
        SmartDevice[] devices = new SmartDevice[4];

        devices[0] = new SmartTV("Living Room TV");
        devices[1] = new SmartThermostat("Hallway Thermostat");
        devices[2] = new SmartSecuritySystem("Home Security System");
        devices[3] = new SmartKitchenAppliance("Smart Oven");

        System.out.println("🏠 Smart Home Automation Control System 🏠\n");

        for (SmartDevice device : devices) {
            device.powerOn();

            // Safe Downcasting with instanceof
            if (device instanceof SmartTV) {
                SmartTV tv = (SmartTV) device;
                tv.changeChannel(5);
                tv.adjustVolume(20);
                tv.openStreamingApp("Netflix");
            } else if (device instanceof SmartThermostat) {
                SmartThermostat thermostat = (SmartThermostat) device;
                thermostat.setTemperature(24.5);
                thermostat.setHumidity(45.0);
                thermostat.enableEnergySavingMode();
            } else if (device instanceof SmartSecuritySystem) {
                SmartSecuritySystem security = (SmartSecuritySystem) device;
                security.activateCameras();
                security.armAlarm();
                security.grantAccess("John");
            } else if (device instanceof SmartKitchenAppliance) {
                SmartKitchenAppliance kitchen = (SmartKitchenAppliance) device;
                kitchen.setCookingTime(30);
                kitchen.setTemperature(180.0);
                kitchen.selectRecipe("Lasagna");
            }

            device.powerOff();
            System.out.println();
        }
    }
}
