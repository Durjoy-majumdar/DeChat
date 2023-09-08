package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import js0.C88015a;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.h2 */
public class C84534h2 extends C88015a {

    /* renamed from: d */
    public final AtomicBoolean f246688d = new AtomicBoolean(false);

    /* renamed from: e */
    public final /* synthetic */ Context f246689e;

    /* renamed from: f */
    public final /* synthetic */ C84543i2 f246690f;

    public C84534h2(C84543i2 i2Var, Context context) {
        this.f246690f = i2Var;
        this.f246689e = context;
    }

    public void onActivityDestroyed(Activity activity) {
        if (this.f246689e == activity && !this.f246688d.getAndSet(true)) {
            ((Application) this.f246690f.getApplicationContext()).unregisterActivityLifecycleCallbacks(this);
            C119179t tVar = C119157j.f356862d;
            h2$$a h2__a = new h2$$a(this, this.f246689e);
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183892w(h2__a, 0, false);
        }
    }
}
