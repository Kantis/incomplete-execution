import org.junit.jupiter.api.Test
import org.opentest4j.TestAbortedException

class Junit {

    @Test
    fun `TestAbortedException acts as an escape hatch`() {
        throw TestAbortedException("Aborting since pre-conditions fail")
    }
}
