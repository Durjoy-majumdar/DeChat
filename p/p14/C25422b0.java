package p14;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import gy3.C24560g0;
import gy3.C87412m;
import l14.C24951b;
import n14.C25217e;
import o14.C25349e;
import o14.C25350f;

/* renamed from: p14.b0 */
public final class C25422b0<T> implements C24951b<T> {

    /* renamed from: a */
    public final C25217e f72008a;

    /* renamed from: b */
    public final C24951b<T> f72009b;

    public C25422b0(C24951b<T> bVar) {
        C87412m.m108594g(bVar, "serializer");
        this.f72009b = bVar;
        this.f72008a = new C25438h0(bVar.mo51996a());
    }

    /* renamed from: a */
    public C25217e mo51996a() {
        return this.f72008a;
    }

    /* renamed from: b */
    public void mo51999b(C25350f fVar, T t) {
        C87412m.m108594g(fVar, FFmpegMetadataRetriever.METADATA_KEY_ENCODER);
        if (t != null) {
            fVar.mo52534s();
            fVar.mo52506t(this.f72009b, t);
            return;
        }
        fVar.mo52533r();
    }

    /* renamed from: d */
    public T mo51997d(C25349e eVar) {
        C87412m.m108594g(eVar, "decoder");
        return eVar.mo52499w() ? eVar.mo52498v(this.f72009b) : eVar.mo52491d();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && !(C87412m.m108589b(C24560g0.m30725a(C25422b0.class), C24560g0.m30725a(obj.getClass())) ^ true) && !(C87412m.m108589b(this.f72009b, ((C25422b0) obj).f72009b) ^ true);
    }

    public int hashCode() {
        return this.f72009b.hashCode();
    }
}
