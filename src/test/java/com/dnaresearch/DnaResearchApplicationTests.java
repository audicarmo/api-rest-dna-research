package com.dnaresearch;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class DnaResearchApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void initApplication() {
        DnaResearchApplication.main(new String[] {});
    }
}
