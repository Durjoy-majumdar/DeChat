package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntime$$o */
public class AppBrandRuntime$$o implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C81974j3 f238191d;

    /* renamed from: e */
    public final /* synthetic */ int f238192e;

    /* renamed from: f */
    public final /* synthetic */ int f238193f;

    /* renamed from: g */
    public final /* synthetic */ AppBrandRuntime f238194g;

    public AppBrandRuntime$$o(AppBrandRuntime appBrandRuntime, C81974j3 j3Var, int i, int i2) {
        this.f238194g = appBrandRuntime;
        this.f238191d = j3Var;
        this.f238192e = i;
        this.f238193f = i2;
    }

    public void run() {
        Log.m105924i("MicroMsg.AppBrandRuntime", "addKeyEventObserver#scheduled");
        C81974j3 j3Var = this.f238191d;
        j3Var.f240378b = this.f238192e;
        int i = this.f238193f;
        j3Var.f240377a = i;
        boolean z = this.f238194g.f238139b1.get(i) != null;
        Set copyOnWriteArraySet = z ? this.f238194g.f238139b1.get(this.f238191d.f240377a) : new CopyOnWriteArraySet();
        copyOnWriteArraySet.add(this.f238191d);
        if (!z) {
            this.f238194g.f238139b1.put(this.f238191d.f240377a, copyOnWriteArraySet);
        }
    }
}
