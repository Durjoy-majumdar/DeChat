package com.tencent.p014mm.splash;

import android.app.PendingIntent;
import android.content.Context;
import com.tencent.p014mm.legacy.app.StartBlocker;

/* renamed from: com.tencent.mm.splash.p */
public class C85793p {
    /* renamed from: a */
    public static PendingIntent m105966a(Context context) {
        Class<StartBlocker> cls = StartBlocker.class;
        try {
            int i = StartBlocker.f237799a;
            return (PendingIntent) cls.getMethod("shouldBlock", new Class[]{Context.class}).invoke(cls, new Object[]{context});
        } catch (Exception unused) {
            return null;
        }
    }
}
