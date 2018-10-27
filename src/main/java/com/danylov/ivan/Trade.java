package com.danylov.ivan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Trade implements ITrade{
    private Map<Integer, Request> buyRequests;
    private Map<Integer, Request> sellRequests;

    public Trade() {
        buyRequests = new HashMap<Integer, Request>();
        sellRequests = new HashMap<Integer, Request>();
    }

    public void addRequest(IRequest request) {
        if (request == null) {
            throw new TradeRequestException("Bad request");
        }

        if (request.getAction() == IRequest.Action.BUY) {
            buyRequests.put(request.getId(), (Request) request);
        }

        if (request.getAction() == IRequest.Action.SELL) {
            sellRequests.put(request.getId(), (Request) request);
        }
    }

    public void list() {

    }

    public void addToHistory(IRequest request) {

    }

    public void processRequsets() {

    }
}
