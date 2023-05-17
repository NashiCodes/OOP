package nashicodes;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Animals> animais = new ArrayList<>();
//        animais.add(new Cao());
//        animais.add(new Gato());
//        animais.add(new Homem());
//        animais.add(new Cao());
//        animais.add(new Gato());
//        animais.add(new Homem());
//        animais.add(new Cao());
//        animais.add(new Gato());
//        animais.add(new Homem());
//        animais.add(new Cao());
        animais.add(new Animals() {
            @Override
            public void fala() {
                Animals.super.fala();
            }
        });

        for (Animals animal : animais) {
            animal.fala();
        }

    }
}