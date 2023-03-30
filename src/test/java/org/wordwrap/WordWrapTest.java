package org.wordwrap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class WordWrapTest {

    @Test
    void if_original_text_is_empty_then_expect_same_text() {
        assertThat(WordWrap.TransformTextWithConsole("")).isEqualTo("");
    }
}