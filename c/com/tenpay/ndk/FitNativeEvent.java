package com.tenpay.ndk;

public class FitNativeEvent {
    private static Logger eventLogger;

    public interface Logger {
        void onLog(int i, String str);
    }

    private FitNativeEvent() {
    }

    public static Logger getListener() {
        return eventLogger;
    }

    private static void onNativeEvent(int i, String str) {
        Logger logger = eventLogger;
        if (logger != null) {
            logger.onLog(i, str);
        }
    }

    public static void setListener(Logger logger) {
        eventLogger = logger;
    }
}
