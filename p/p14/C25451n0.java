package p14;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import gy3.C87412m;
import l14.C24951b;
import n14.C25217e;
import o14.C25349e;
import o14.C25350f;
import rx3.C13598b0;

/* renamed from: p14.n0 */
public final class C25451n0 implements C24951b<C13598b0> {

    /* renamed from: b */
    public static final C25451n0 f72058b = new C25451n0();

    /* renamed from: a */
    public final /* synthetic */ C25424c0<C13598b0> f72059a = new C25424c0<>("kotlin.Unit", C13598b0.f38549a);

    /* renamed from: a */
    public C25217e mo51996a() {
        return this.f72059a.f72010a;
    }

    /* renamed from: b */
    public void mo51999b(C25350f fVar, Object obj) {
        C13598b0 b0Var = (C13598b0) obj;
        C87412m.m108594g(fVar, FFmpegMetadataRetriever.METADATA_KEY_ENCODER);
        C87412m.m108594g(b0Var, "value");
        this.f72059a.mo51999b(fVar, b0Var);
    }

    /* renamed from: d */
    public Object mo51997d(C25349e eVar) {
        C87412m.m108594g(eVar, "decoder");
        this.f72059a.mo51997d(eVar);
        return C13598b0.f38549a;
    }
}
