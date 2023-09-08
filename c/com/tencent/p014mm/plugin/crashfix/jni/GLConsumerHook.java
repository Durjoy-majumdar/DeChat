package com.tencent.p014mm.plugin.crashfix.jni;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.crashfix.jni.GLConsumerHook */
public class GLConsumerHook {
    public static native int hook();

    public static void report(long j) {
        if (j == -1) {
            Log.m105924i("MicroMsg.GLConsumerHook", "test succ");
        } else if (j == 0) {
            Log.m105920e("MicroMsg.GLConsumerHook", "null pointer");
        } else {
            Log.m105924i("MicroMsg.GLConsumerHook", "pointer addr " + Long.toHexString(j));
        }
    }
}
