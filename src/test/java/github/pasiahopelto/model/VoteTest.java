package github.pasiahopelto.model;

import org.junit.jupiter.api.Test;
import org.meanbean.test.BeanVerifier;

public class VoteTest {

    @Test
    void verifyBean() {
        BeanVerifier.verifyBean(Vote.class);
    }
}
