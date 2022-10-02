package pl.mlopatka;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

    private static final FeatureService SERVICE = new FeatureService();

    public static void main(String[] args) {
        SERVICE.doSth();
    }
}
