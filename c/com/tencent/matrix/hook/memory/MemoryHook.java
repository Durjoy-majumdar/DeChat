package com.tencent.matrix.hook.memory;

import com.tencent.matrix.hook.C80379a;
import java.util.HashSet;
import java.util.Set;
import p723vf.C118672d;

public class MemoryHook extends C80379a {

    /* renamed from: j */
    public static final MemoryHook f235293j = new MemoryHook();

    /* renamed from: b */
    public final Set<String> f235294b = new HashSet();

    /* renamed from: c */
    public final Set<String> f235295c = new HashSet();

    /* renamed from: d */
    public int f235296d;

    /* renamed from: e */
    public int f235297e;

    /* renamed from: f */
    public int f235298f = 10485760;

    /* renamed from: g */
    public boolean f235299g;

    /* renamed from: h */
    public boolean f235300h;

    /* renamed from: i */
    public boolean f235301i = false;

    private native void dumpNative(String str, String str2);

    private native void enableMmapHookNative(boolean z);

    private native void enableStacktraceNative(boolean z);

    private native void installHooksNative(String[] strArr, String[] strArr2, boolean z);

    private native void setStacktraceLogThresholdNative(int i);

    private native void setTracingAllocSizeRangeNative(int i, int i2);

    /* renamed from: a */
    public String mo111834a() {
        return "matrix-memoryhook";
    }

    /* renamed from: b */
    public boolean mo111835b() {
        int i;
        int i2 = this.f235296d;
        if (i2 < 0 || ((i = this.f235297e) != 0 && i < i2)) {
            throw new IllegalArgumentException("sizes should not be negative and maxSize should be 0 or greater than minSize: min = " + this.f235296d + ", max = " + this.f235297e);
        }
        C118672d.m167351a("Matrix.MemoryHook", "enable mmap? " + this.f235300h, new Object[0]);
        enableMmapHookNative(this.f235300h);
        setTracingAllocSizeRangeNative(this.f235296d, this.f235297e);
        setStacktraceLogThresholdNative(this.f235298f);
        enableStacktraceNative(this.f235299g);
        return true;
    }

    /* renamed from: c */
    public boolean mo111836c(boolean z) {
        if (!this.f235301i) {
            installHooksNative((String[]) this.f235294b.toArray(new String[0]), (String[]) this.f235295c.toArray(new String[0]), z);
            this.f235301i = true;
        }
        return true;
    }

    /* renamed from: d */
    public void mo111842d(String str, String str2) {
        if (this.f235272a == C80379a.C80380a.COMMIT_SUCCESS) {
            dumpNative(str, str2);
        }
    }
}
