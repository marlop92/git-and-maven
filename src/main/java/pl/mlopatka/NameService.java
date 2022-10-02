package pl.mlopatka;

import java.util.List;
import java.util.Random;

public class NameService {

    private static final List<String> NAMES = List.of("Marcin", "Tadeusz", "Jadwiga", "Matylda", "Amdaeusz");
    private static final Random RANDOM = new Random();

    public String generateName() {
        return NAMES.get(RANDOM.nextInt(5));
    }
}
