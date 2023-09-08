package ju0;

import com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.C17643a;
import com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.C17648b;
import com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.C17652c;
import com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo;
import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import org.json.JSONObject;
import p301cd.C113283b;
import p301cd.C113284c;
import p301cd.C113285d;
import p301cd.C113286e;
import p301cd.C16923f;
import p301cd.C92417j;

/* renamed from: ju0.q */
public final class C21285q implements C17648b {

    /* renamed from: c */
    public final C17643a f60139c;

    /* renamed from: d */
    public final C92417j f60140d;

    /* renamed from: e */
    public final C16923f f60141e;

    public C21285q(C17643a aVar, C92417j jVar, C16923f fVar, int i, C8480h hVar) {
        jVar = (i & 2) != 0 ? new C99038j(aVar) : jVar;
        fVar = (i & 4) != 0 ? new C21284h(aVar) : fVar;
        C87412m.m108594g(aVar, "weEffectManager");
        C87412m.m108594g(jVar, "stickerApplyAdapter");
        C87412m.m108594g(fVar, "makeupApplyAdapter");
        this.f60139c = aVar;
        this.f60140d = jVar;
        this.f60141e = fVar;
    }

    /* renamed from: a */
    public void mo21055a(C17643a.C17646d dVar, String str) {
        this.f60139c.mo21055a(dVar, str);
    }

    /* renamed from: b */
    public void mo21056b(C17643a.C17645c cVar, String str) {
        this.f60139c.mo21056b(cVar, str);
    }

    /* renamed from: c */
    public boolean mo18015c(C113283b bVar) {
        C87412m.m108594g(bVar, "info");
        return this.f60141e.mo18015c(bVar);
    }

    public void clearFilters() {
        this.f60139c.clearFilters();
    }

    /* renamed from: d */
    public boolean mo18016d(C113285d dVar) {
        C87412m.m108594g(dVar, "info");
        return this.f60141e.mo18016d(dVar);
    }

    /* renamed from: f */
    public void mo21058f() {
        this.f60139c.mo21058f();
    }

    /* renamed from: g */
    public boolean mo18020g(C17643a.C17646d dVar, List<StickerItemInfo> list, JSONObject jSONObject) {
        C87412m.m108594g(dVar, "type");
        C87412m.m108594g(list, "stickerInfo");
        return this.f60140d.mo18020g(dVar, list, jSONObject);
    }

    /* renamed from: i */
    public boolean mo18017i(C113284c cVar) {
        C87412m.m108594g(cVar, "info");
        return this.f60141e.mo18017i(cVar);
    }

    public boolean isEnabled() {
        return this.f60139c.isEnabled();
    }

    /* renamed from: j */
    public void mo21060j(C17643a.C17644b bVar, float f) {
        this.f60139c.mo21060j(bVar, f);
    }

    /* renamed from: k */
    public boolean mo18018k(C17652c cVar) {
        C87412m.m108594g(cVar, "info");
        return this.f60141e.mo18018k(cVar);
    }

    /* renamed from: l */
    public boolean mo18019l(C113286e eVar) {
        C87412m.m108594g(eVar, "info");
        return this.f60141e.mo18019l(eVar);
    }

    /* renamed from: m */
    public void mo21061m(String str, float f) {
        this.f60139c.mo21061m(str, f);
    }

    /* renamed from: n */
    public void mo21062n() {
        this.f60139c.mo21062n();
    }

    public void onDetectFacePoints(float[] fArr) {
        this.f60139c.onDetectFacePoints(fArr);
    }

    public int onTextureCustomProcess(int i, int i2, int i3) {
        return this.f60139c.onTextureCustomProcess(i, i2, i3);
    }

    public void onTextureDestoryed() {
        this.f60139c.onTextureDestoryed();
    }
}
