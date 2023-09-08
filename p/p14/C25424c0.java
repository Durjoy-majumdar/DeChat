package p14;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import gy3.C87412m;
import l14.C24951b;
import n14.C25217e;
import n14.C25221g;
import n14.C25222h;
import n14.C25226j;
import o14.C25349e;
import o14.C25350f;

/* renamed from: p14.c0 */
public final class C25424c0<T> implements C24951b<T> {

    /* renamed from: a */
    public final C25217e f72010a;

    /* renamed from: b */
    public final T f72011b;

    public C25424c0(String str, T t) {
        C87412m.m108594g(str, "serialName");
        C87412m.m108594g(t, "objectInstance");
        this.f72011b = t;
        this.f72010a = C25222h.m32168a(str, C25226j.C25230d.f71699a, new C25217e[0], C25221g.f71693d);
    }

    /* renamed from: a */
    public C25217e mo51996a() {
        return this.f72010a;
    }

    /* renamed from: b */
    public void mo51999b(C25350f fVar, T t) {
        C87412m.m108594g(fVar, FFmpegMetadataRetriever.METADATA_KEY_ENCODER);
        C87412m.m108594g(t, "value");
        fVar.mo52523b(this.f72010a).mo52513a(this.f72010a);
    }

    /* renamed from: d */
    public T mo51997d(C25349e eVar) {
        C87412m.m108594g(eVar, "decoder");
        eVar.mo52515b(this.f72010a).mo52508a(this.f72010a);
        return this.f72011b;
    }
}
