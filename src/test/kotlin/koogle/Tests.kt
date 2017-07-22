import com.natpryce.hamkrest.assertion.assert
import com.natpryce.hamkrest.equalTo
import org.junit.Test

class CrawlerTests {

    @Test
    fun `Crawler should download one web page`() {
        assert.that(Crawler().getWords("http://a.site"), equalTo(setOf("Kotlin")))
    }
}

class Crawler{
    fun getWords(url:String):Set<String> = HashSet()
}