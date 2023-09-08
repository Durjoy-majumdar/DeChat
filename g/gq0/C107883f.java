package gq0;

import com.tencent.p014mm.plugin.appbrand.openmaterial.p470ui.hybrid.OpenMaterialJsBridge;
import js0.C88020k;
import kq0.C109031a;

/* renamed from: gq0.f */
public final class C107883f implements C109031a.C109032a {

    /* renamed from: a */
    public final /* synthetic */ C107869a f323039a;

    public C107883f(C107869a aVar) {
        this.f323039a = aVar;
    }

    /* renamed from: b */
    public void mo158302b(int i) {
        OpenMaterialJsBridge openMaterialJsBridge = this.f323039a.f323016j;
        if (openMaterialJsBridge != null) {
            openMaterialJsBridge.onWindowHeightChange(C88020k.m109554e(i));
        }
    }
}
