package eu.europeana.corelib.search.utils;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringReader;

import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;
import org.apache.lucene.analysis.tokenattributes.OffsetAttribute;
import org.junit.Test;

import eu.europeana.corelib.search.utils.SimpleAnalyzer;

public class SimpleAnalyzerTest {

	@Test
	public void test() {
		SimpleAnalyzer analyzer = new SimpleAnalyzer();
		try {
			TokenStream ts = analyzer.tokenStream("text", new StringReader("this OR boring"));

			OffsetAttribute offsetAttribute = ts.addAttribute(OffsetAttribute.class);
			CharTermAttribute charTermAttribute = ts.addAttribute(CharTermAttribute.class);

			ts.reset();
			while (ts.incrementToken()) {
				int startOffset = offsetAttribute.startOffset();
				int endOffset = offsetAttribute.endOffset();
				String term = charTermAttribute.toString();
				System.out.println(String.format("[%d-%d] %s", startOffset, endOffset, term));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
