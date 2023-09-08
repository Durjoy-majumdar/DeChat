package com.tencent.stubs.logger;

import com.tencent.stubs.logger.Log;

final class AndroidLogcat implements Log.Logger {
    public boolean isLoggable(String str, int i) {
        return android.util.Log.isLoggable(str, i);
    }

    public void println(int i, String str, String str2) {
        android.util.Log.println(i, str, str2);
    }
}
