import java.util.*;

interface WeatherService {
    String getWeatherInfo(String location);
}

class main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        WeatherService w = new WeatherService() {
            public String getWeatherInfo(String location) {
                return "Weather in " + location + " is sunny , Temperature is 25 degrees Celcius";
            }
        };
        System.out.println("Enter a Location : ");
        String location = sc.nextLine();
        String getWeather = w.getWeatherInfo(location);
        System.out.println(getWeather);
        sc.close();
    }
}