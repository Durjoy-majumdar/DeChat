package com.tencent.matrix.hook.pthread;

import android.text.TextUtils;
import com.tencent.matrix.hook.C80379a;
import java.util.HashSet;
import java.util.Set;
import p723vf.C118672d;

public class PthreadHook extends C80379a {

    /* renamed from: h */
    public static final PthreadHook f235303h = new PthreadHook();

    /* renamed from: b */
    public Set<String> f235304b = new HashSet();

    /* renamed from: c */
    public boolean f235305c = false;

    /* renamed from: d */
    public boolean f235306d = false;

    /* renamed from: e */
    public boolean f235307e = false;

    /* renamed from: f */
    public C80382a f235308f = null;

    /* renamed from: g */
    public boolean f235309g = false;

    /* renamed from: com.tencent.matrix.hook.pthread.PthreadHook$a */
    public static class C80382a {

        /* renamed from: a */
        public boolean f235310a = false;

        /* renamed from: b */
        public final Set<String> f235311b = new HashSet(5);

        /* renamed from: a */
        public C80382a mo111845a(String str) {
            ((HashSet) this.f235311b).add(str);
            return this;
        }
    }

    private native void addHookThreadNameNative(String[] strArr);

    private native void dumpNative(String str);

    private native void enableLoggerNative(boolean z);

    private native void enableQuickenNative(boolean z);

    private native void enableTracePthreadReleaseNative(boolean z);

    private native void installHooksNative(boolean z);

    private native void setThreadStackShrinkEnabledNative(boolean z);

    private native boolean setThreadStackShrinkIgnoredCreatorSoPatternsNative(String[] strArr);

    private native void setThreadTraceEnabledNative(boolean z);

    /* renamed from: a */
    public String mo111834a() {
        return "matrix-pthreadhook";
    }

    /* renamed from: b */
    public boolean mo111835b() {
        addHookThreadNameNative((String[]) this.f235304b.toArray(new String[0]));
        enableQuickenNative(this.f235305c);
        enableLoggerNative(false);
        enableTracePthreadReleaseNative(false);
        C80382a aVar = this.f235308f;
        if (aVar != null) {
            if (setThreadStackShrinkIgnoredCreatorSoPatternsNative((String[]) this.f235308f.f235311b.toArray(new String[((HashSet) aVar.f235311b).size()]))) {
                setThreadStackShrinkEnabledNative(this.f235308f.f235310a);
            } else {
                C118672d.m167352b("Matrix.Pthread", "setThreadStackShrinkIgnoredCreatorSoPatternsNative return false, do not enable ThreadStackShrinker.", new Object[0]);
                setThreadStackShrinkEnabledNative(false);
            }
        } else {
            setThreadStackShrinkIgnoredCreatorSoPatternsNative((String[]) null);
            setThreadStackShrinkEnabledNative(false);
        }
        setThreadTraceEnabledNative(this.f235307e);
        this.f235306d = true;
        return true;
    }

    /* renamed from: c */
    public boolean mo111836c(boolean z) {
        C80382a aVar;
        if ((this.f235307e || ((aVar = this.f235308f) != null && aVar.f235310a)) && !this.f235309g) {
            installHooksNative(z);
            this.f235309g = true;
        }
        return true;
    }

    /* renamed from: d */
    public void mo111843d(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("path NOT valid: " + str);
        } else if (this.f235272a == C80379a.C80380a.COMMIT_SUCCESS) {
            dumpNative(str);
        }
    }

    /* renamed from: e */
    public void mo111844e(boolean z) {
        this.f235305c = z;
        if (this.f235306d) {
            enableQuickenNative(z);
        }
    }
}
