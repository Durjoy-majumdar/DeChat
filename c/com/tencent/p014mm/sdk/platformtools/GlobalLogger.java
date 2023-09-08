package com.tencent.p014mm.sdk.platformtools;

import bp3.C28361q;
import com.tencent.stubs.logger.Log;

/* renamed from: com.tencent.mm.sdk.platformtools.GlobalLogger */
public class GlobalLogger implements Log.Logger {
    private static final C28361q<GlobalLogger> sInstanceCache = new C28361q<GlobalLogger>() {
        public GlobalLogger create() {
            return new GlobalLogger();
        }
    };

    private GlobalLogger() {
    }

    public static GlobalLogger getInstance() {
        return sInstanceCache.get();
    }

    public boolean isLoggable(String str, int i) {
        return true;
    }

    public void println(int i, String str, String str2) {
        if (i == 2) {
            Log.m105926v(str, str2);
        } else if (i == 3) {
            Log.m105918d(str, str2);
        } else if (i == 4) {
            Log.m105924i(str, str2);
        } else if (i == 5) {
            Log.m105928w(str, str2);
        } else if (i == 6) {
            Log.m105920e(str, str2);
        }
    }
}
