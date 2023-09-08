package com.tencent.stubs.logger;

import com.tencent.stubs.logger.Log;

final class NativeLogger implements Log.Logger {
    private static final NativeLogger sInstance = new NativeLogger();

    private static void setLogger(long j) {
        Log.sLoggerPtr = j;
        Log.sLogger = sInstance;
    }

    public native boolean isLoggable(String str, int i);

    public native void println(int i, String str, String str2);
}
