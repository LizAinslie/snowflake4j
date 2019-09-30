package tk.racket.utils.snowflake;

import org.junit.Test;

public class SnowflakeGeneratorTest {
    private final static SnowflakeGenerator gen = new SnowflakeGenerator();
    
    @Test
    public void SnowflakeGenerator_nextId() {
        long id = gen.nextId();
        System.out.println(id);
    }
}