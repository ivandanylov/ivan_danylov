package com.danylov.ivan;

import org.junit.Assert;
import org.junit.Test;

public class TestOrderingMatchingSystem {

    @Test
    public void testAddRequest (){
        Request request = new Request(1, IRequest.Action.BUY, 12.5, 10);

        Assert.assertEquals("BUY 12,50 10", request.print());
    }
}
