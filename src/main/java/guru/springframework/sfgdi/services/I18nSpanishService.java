package guru.springframework.sfgdi.services;

//@Service("I18nService")
public class I18nSpanishService implements GreetingService {
    @Override
    public String sayGreeting(){
        return "Hola Mundo - ES";
    }
}
