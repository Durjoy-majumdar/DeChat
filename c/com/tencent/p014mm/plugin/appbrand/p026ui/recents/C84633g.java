package com.tencent.p014mm.plugin.appbrand.p026ui.recents;

import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.appbrand.p026ui.recents.C84628f;
import lb0.C88394b;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.g */
public class C84633g implements C88394b.C88411m {

    /* renamed from: d */
    public final /* synthetic */ C84628f.C84631b f246931d;

    public C84633g(C84628f.C84631b bVar) {
        this.f246931d = bVar;
    }

    /* renamed from: b */
    public void mo1907b() {
        this.f246931d.mo117343a();
    }

    /* renamed from: d */
    public void mo1908d() {
    }

    public String key() {
        return "LoadShowcaseImageTask";
    }

    public void onBitmapLoaded(Bitmap bitmap) {
        C84628f.C84631b bVar = this.f246931d;
        bVar.f246929e = bitmap;
        bVar.mo117343a();
    }
}
