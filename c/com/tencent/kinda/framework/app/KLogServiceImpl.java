package com.tencent.kinda.framework.app;

import com.tencent.kinda.gen.KLogService;
import com.tencent.p014mm.sdk.platformtools.Log;

public class KLogServiceImpl implements KLogService {
    public void debug(String str, String str2) {
        Log.m105918d(str, str2);
    }

    public void error(String str, String str2) {
        Log.m105920e(str, str2);
    }

    public void info(String str, String str2) {
        Log.m105924i(str, str2);
    }

    public void verbose(String str, String str2) {
        Log.m105926v(str, str2);
    }

    public void warning(String str, String str2) {
        Log.m105928w(str, str2);
    }
}
