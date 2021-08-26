import io.kotest.core.spec.style.FunSpec
import org.opentest4j.TestAbortedException

class Kotest : FunSpec(
    {
        test("TestAbortedException shows test failed") {
            throw TestAbortedException("Aborting since pre-conditions fail")
        }
    }
)
