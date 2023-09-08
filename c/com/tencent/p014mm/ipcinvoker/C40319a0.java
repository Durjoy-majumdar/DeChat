package com.tencent.p014mm.ipcinvoker;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.tencent.mm.ipcinvoker.a0 */
public class C40319a0 {

    /* renamed from: c */
    public static volatile C40319a0 f108391c;

    /* renamed from: a */
    public Handler f108392a = new Handler(C80922v.f237774d.getLooper());

    /* renamed from: b */
    public Handler f108393b = new Handler(Looper.getMainLooper());

    public C40319a0() {
        C80922v vVar = C80922v.f237772b;
    }

    /* renamed from: a */
    public static C40319a0 m43493a() {
        if (f108391c == null) {
            synchronized (C40319a0.class) {
                if (f108391c == null) {
                    f108391c = new C40319a0();
                }
            }
        }
        return f108391c;
    }

    /* renamed from: b */
    public static boolean m43494b(Runnable runnable) {
        return m43493a().f108392a.post(runnable);
    }

    /* renamed from: c */
    public static boolean m43495c(boolean z, Runnable runnable) {
        return z ? m43493a().f108393b.post(runnable) : m43493a().f108392a.post(runnable);
    }

    /* renamed from: d */
    public static boolean m43496d(Runnable runnable, long j) {
        return m43493a().f108392a.postDelayed(runnable, j);
    }
}
