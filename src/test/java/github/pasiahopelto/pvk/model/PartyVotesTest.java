package github.pasiahopelto.pvk.model;

import org.junit.jupiter.api.Test;
import org.meanbean.test.BeanVerifier;

public class PartyVotesTest {

    @Test
    void verifyBean() {
        BeanVerifier.verifyBean(PartyVotes.class);
    }
}
