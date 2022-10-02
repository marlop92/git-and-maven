package pl.mlopatka;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

    private static final TestService TEST_SERVICE = new TestService();
    private static final FeatureService SERVICE = new FeatureService();
    private static final NameService NAME_SERVICE = new NameService();

    public static void main(String[] args) {
        System.out.println("Test status: " + TEST_SERVICE.testStatus());
        SERVICE.doSth();
        System.out.println(NAME_SERVICE.generateName());
    }
}
