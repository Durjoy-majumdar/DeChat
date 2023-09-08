package com.tencent.p014mm.plugin.qqmail.p090ui;

import android.app.Activity;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: com.tencent.mm.plugin.qqmail.ui.h */
public class C85397h implements C11385n {

    /* renamed from: f */
    public static long f248853f;

    /* renamed from: d */
    public C85398a f248854d;

    /* renamed from: e */
    public Activity f248855e;

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.h$a */
    public static abstract class C85398a {
        /* renamed from: a */
        public abstract void mo118649a();

        /* renamed from: b */
        public abstract void mo118650b();
    }

    public C85397h(Activity activity) {
        C86709a0.m107529k().f251779b.mo123455a(138, this);
        this.f248855e = activity;
    }

    /* renamed from: a */
    public void mo118714a() {
        C86709a0.m107529k().f251779b.mo123470p(138, this);
    }

    public void finalize() {
        mo118714a();
        super.finalize();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (i == 0 && i2 == 0) {
            C85398a aVar = this.f248854d;
            if (aVar != null) {
                aVar.mo118649a();
                this.f248854d = null;
            }
        } else {
            C85398a aVar2 = this.f248854d;
            if (aVar2 != null) {
                aVar2.mo118650b();
                this.f248854d = null;
            }
        }
        f248853f = System.currentTimeMillis();
    }
}
