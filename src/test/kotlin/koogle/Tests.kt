import com.natpryce.hamkrest.assertion.assert
import com.natpryce.hamkrest.equalTo
import org.junit.Test

class Tests {

    @Test
    fun `10 equals 10`() {
        assert.that(10, equalTo(10))
    }
}