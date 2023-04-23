package koschei.models;

import org.springframework.stereotype.Component;

@Component
public class Chest4 {

    private final Rabbit5 rabbit;

    public Chest4(Rabbit5 rabbit) {
        this.rabbit = rabbit;
    }

    @Override
    public String toString() {
        return "в сундуке - заяц, " + rabbit.toString()+"";
    }
}
