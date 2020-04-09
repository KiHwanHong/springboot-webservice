package com.kihwan.book.springboot.web.dto;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void lombokFunctionTest(){

        String name = "Test";

        int amount = 1000;

        HelloResponseDto dto = new HelloResponseDto(name, amount);

        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }



}
