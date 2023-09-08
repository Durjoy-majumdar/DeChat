package com.tencent.p014mm.plugin.crashfix.jni;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.reflect.Method;

/* renamed from: com.tencent.mm.plugin.crashfix.jni.NativeAllocationRegistryApplyFreeFunctionHook */
public class NativeAllocationRegistryApplyFreeFunctionHook {

    /* renamed from: a */
    public static long f12185a;

    /* renamed from: b */
    public static long f12186b;

    public static native long getTestMethodAddr();

    public static native void hook(Method method, Method method2);

    public static boolean isNeedRelease(long j, long j2) {
        if (j == 0 && j2 == 0) {
            return true;
        }
        if (f12185a == j && f12186b == j2) {
            Log.m105920e("NativeAllocationRegistryApplyFreeFunctionHook", "protect succ");
            C115669n.INSTANCE.idkeyStat(1113, 7, 1, false);
            return false;
        }
        f12185a = j;
        f12186b = j2;
        return true;
    }
}
