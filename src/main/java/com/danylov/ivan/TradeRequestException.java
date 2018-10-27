package com.danylov.ivan;

public class TradeRequestException extends RuntimeException {
    public TradeRequestException() {
        super();
    }

    public TradeRequestException(String message) {
        super(message);
    }

    public TradeRequestException(String message, Throwable cause) {
        super(message, cause);
    }

    public TradeRequestException(Throwable cause) {
        super(cause);
    }

    protected TradeRequestException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
