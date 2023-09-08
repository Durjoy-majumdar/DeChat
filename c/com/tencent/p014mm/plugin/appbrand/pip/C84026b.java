package com.tencent.p014mm.plugin.appbrand.pip;

import com.tencent.p014mm.plugin.appbrand.pip.C84028c;
import com.tencent.p014mm.plugin.appbrand.widget.AppBrandPipContainerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import hm0.C87560g;

/* renamed from: com.tencent.mm.plugin.appbrand.pip.b */
public class C84026b implements C87560g.C87561a {

    /* renamed from: a */
    public final /* synthetic */ C84028c f245312a;

    public C84026b(C84028c cVar) {
        this.f245312a = cVar;
    }

    /* renamed from: a */
    public void mo116681a(int i, int i2) {
        if (this.f245312a.f245339i) {
            Log.m105924i(this.f245312a.f245331a, "onConfigurationChanged, onVideoPositionGot, released");
            return;
        }
        C84028c cVar = this.f245312a;
        AppBrandPipContainerView appBrandPipContainerView = cVar.f245333c;
        if (cVar.f245342l == null) {
            cVar.f245342l = new C84028c.C84031c((C84026b) null);
        }
        C84028c.C84031c cVar2 = cVar.f245342l;
        cVar2.f245365a = i;
        cVar2.f245366b = i2;
        cVar2.f245367c = null;
        appBrandPipContainerView.mo117657a(cVar2);
    }
}
