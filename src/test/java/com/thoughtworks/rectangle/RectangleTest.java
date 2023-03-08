package com.thoughtworks.rectangle;

import org.junit.jupiter.api.Test;

public class RectangleTest{

    @Test
    void shouldReturnAreaWhenLengthAndBreadthAreGiven(){
        Rectangle rectangle = new Rectangle(10,10);

        int area = rectangle.area();

        assert(area==100);
    }

}