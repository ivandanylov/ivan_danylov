package com.danylov.ivan;

public class Request implements IRequest{
    private int id;
    private double price;
    private int quantity;
    private IRequest.Action action;
    private IRequest.Status status = Status.NEW;

    public Request(int id, Action action, double price, int quantity) {
        this.id = id;

        this.action = action;

        if(price <= 0) {
            throw new TradeRequestException("Price can not be lower or equal 0");
        }

        if (quantity <= 0) {
            throw new TradeRequestException("Quantity can not be lower or equal 0");
        }

        this.price = price;
        this.quantity = quantity;
    }

    public void setStatus(Status status) {
        if (this.status == Status.PROCESSED && (status == Status.NEW || status == Status.PARTIALYPROCESSED)) {
            throw new TradeRequestException("com.danylov.ivan.Request already processed");
        }

        this.status = status;
    }

    public String print() {
        String prefix = this.action == Action.BUY ? "BUY" : "SELL";
        return prefix.format("%s %.2f %d", prefix, price, quantity);
    }

    public Action getAction() {
        return this.action;
    }

    public Status getStatus() {
        return this.status;
    }

    public int getId() {
        return this.id;
    }
}
