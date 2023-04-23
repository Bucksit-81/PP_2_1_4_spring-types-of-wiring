package koschei.models;

import org.springframework.stereotype.Component;

@Component
public class Duck6 {

    private final Egg7 egg6;

    public Duck6(Egg7 egg6) {
        this.egg6 = egg6;
    }

    @Override
    public String toString() {
        return "в утке - яйцо, " + egg6.toString()+"";
    }
}
