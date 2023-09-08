package com.tencent.p014mm.pluginsdk.model;

import android.os.Bundle;

/* renamed from: com.tencent.mm.pluginsdk.model.h1 */
public final class C19447h1 {

    /* renamed from: a */
    public static volatile C19447h1 f54937a;

    /* renamed from: a */
    public static C19447h1 m20801a() {
        if (f54937a == null) {
            synchronized (C19447h1.class) {
                if (f54937a == null) {
                    f54937a = new C19447h1();
                }
            }
        }
        return f54937a;
    }

    /* renamed from: b */
    public C19446g1 mo25208b(int i, Bundle bundle) {
        return i != 1 ? i != 2 ? new C19444f1() : new C19466w(bundle) : new C19454k1();
    }
}
