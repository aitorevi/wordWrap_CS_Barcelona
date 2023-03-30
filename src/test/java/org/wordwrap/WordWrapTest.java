package org.wordwrap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class WordWrapTest {

    @Test
    void if_original_text_is_empty_then_expect_same_text() {
        assertThat(WordWrap.TransformTextWithConsole("",7)).isEqualTo("");
    }
    @Test
    void if_original_text_is_the_smaller_than_the_columns() {
        assertThat(WordWrap.TransformTextWithConsole("hola",7)).isEqualTo("hola");
    }
    @Test // "hola", 2 -> "ho\nla"
    void if_original_text_is_the_larger_than_the_columns() {
        assertThat(WordWrap.TransformTextWithConsole("hola",2)).isEqualTo("ho\nla");
    }
}
// TODO:
// "hola", 2 -> "ho\nla"
// "ohlala", 2 -> "oh\nla\nla"
// "hola", 3 -> "hol\na"
// "hola", 4 -> "hola"
// "hola mundo", 7 -> "hola\nmundo"
// "hola", -5 -> ???
// "", 4 -> ???
// "hola", 0 -> ???