package p301cd;

import com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.C17643a;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: cd.c0 */
public final class C92415c0 implements C92418k {

    /* renamed from: c */
    public final C17643a f264466c;

    public C92415c0(C17643a aVar) {
        C87412m.m108594g(aVar, "weEffectManager");
        this.f264466c = aVar;
    }

    /* renamed from: a */
    public void mo126419a(C17643a.C17646d dVar, String str) {
        C87412m.m108594g(dVar, "type");
        C87412m.m108594g(str, "path");
        Log.m105918d("MicroMsg.AppBrand.IWeEffectWorkaroundManager", "applySticker, type: " + dVar + ", path: " + str);
        this.f264466c.mo21055a(dVar, str);
    }
}
