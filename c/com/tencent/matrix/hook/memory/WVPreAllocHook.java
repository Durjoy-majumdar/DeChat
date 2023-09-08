package com.tencent.matrix.hook.memory;

import android.os.Build;
import com.tencent.matrix.hook.C80379a;

public class WVPreAllocHook extends C80379a {

    /* renamed from: b */
    public static final WVPreAllocHook f235302b = new WVPreAllocHook();

    private native boolean installHooksNative(int i, ClassLoader classLoader, boolean z);

    /* renamed from: a */
    public String mo111834a() {
        return "matrix-memoryhook";
    }

    /* renamed from: b */
    public boolean mo111835b() {
        return true;
    }

    /* renamed from: c */
    public boolean mo111836c(boolean z) {
        return installHooksNative(Build.VERSION.SDK_INT, getClass().getClassLoader(), z);
    }
}
