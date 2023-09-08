package com.tencent.p014mm.plugin.wallet.wecoin.model;

import com.tencent.midas.api.IMidasLogCallback;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.wallet.wecoin.model.MidasPayLogCallbackImpl */
public class MidasPayLogCallbackImpl implements IMidasLogCallback {
    private static final int LOG_LEVEL_DEBUG = 2;
    private static final int LOG_LEVEL_ERROR = 5;
    private static final int LOG_LEVEL_INFO = 3;
    private static final int LOG_LEVEL_VERBOSE = 1;
    private static final int LOG_LEVEL_WARN = 4;
    private static final String TAG = "MicroMsg.MidasPayLogCallbackImpl";

    public void onLogging(int i, String str, String str2) {
        if (i == 1) {
            Log.m105927v(TAG, "tag:%s msg:%s", str, str2);
        } else if (i == 2) {
            Log.m105919d(TAG, "tag:%s msg:%s", str, str2);
        } else if (i == 3) {
            Log.m105925i(TAG, "tag:%s msg:%s", str, str2);
        } else if (i == 4) {
            Log.m105929w(TAG, "tag:%s msg:%s", str, str2);
        } else if (i == 5) {
            Log.m105921e(TAG, "tag:%s msg:%s", str, str2);
        }
    }
}
