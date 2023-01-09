package github.pasiahopelto.pvk.model;

import org.junit.jupiter.api.Test;
import org.meanbean.test.BeanVerifier;

public class UserVoteTest {

    @Test
    void verifyBean() {
        BeanVerifier.verifyBean(UserVote.class);

    }
}
