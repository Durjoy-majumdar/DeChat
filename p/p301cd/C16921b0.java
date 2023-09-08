package p301cd;

import com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.C17643a;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: cd.b0 */
public final class C16921b0 implements C16924g {

    /* renamed from: c */
    public final C17643a f45746c;

    public C16921b0(C17643a aVar) {
        C87412m.m108594g(aVar, "weEffectManager");
        this.f45746c = aVar;
    }

    /* renamed from: b */
    public void mo18012b(C17643a.C17645c cVar, String str) {
        C87412m.m108594g(cVar, "type");
        C87412m.m108594g(str, "path");
        Log.m105918d("MicroMsg.AppBrand.IWeEffectWorkaroundManager", "applyMakeup, type: " + cVar + ", path: " + str);
        this.f45746c.mo21056b(cVar, str);
    }
}
