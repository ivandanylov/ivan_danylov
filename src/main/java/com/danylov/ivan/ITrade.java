package com.danylov.ivan;

public interface ITrade {
    void addRequest(IRequest request);
    void list();
    void addToHistory(IRequest request);
    void processRequsets();
}
