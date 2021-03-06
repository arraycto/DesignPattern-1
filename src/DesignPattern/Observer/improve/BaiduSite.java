package DesignPattern.Observer.improve;

public class BaiduSite implements Observer {
    // 温度，气压，湿度
    private float temperature;
    private float pressure;
    private float humidity;

    // 更新天气情况，是由WeatherData来调用，使用推送模式
    @Override
    public void updata(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    // 显示
    public void display() {
        System.out.println("百度网站");
        System.out.println("***Baidu mTemperature: " + temperature + "***");
        System.out.println("***Baidu mPressure: " + pressure + "***");
        System.out.println("***Baidu mHumidity: " + humidity + "***");
    }
}
