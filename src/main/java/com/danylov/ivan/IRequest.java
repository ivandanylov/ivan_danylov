package com.danylov.ivan;

public interface IRequest {
    enum Action {BUY, SELL}
    enum Status {NEW, PROCESSED, PARTIALYPROCESSED}

    void setStatus(Status status);
    int getId();
    Action getAction();
    Status getStatus();
    String print();
}
