package p14;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import gy3.C87412m;
import l14.C24951b;
import n14.C25207d;
import n14.C25217e;
import o14.C25349e;
import o14.C25350f;

/* renamed from: p14.h */
public final class C25437h implements C24951b<Double> {

    /* renamed from: a */
    public static final C25217e f72037a = new C25436g0("kotlin.Double", C25207d.C25211d.f71675a);

    /* renamed from: b */
    public static final C25437h f72038b = new C25437h();

    /* renamed from: a */
    public C25217e mo51996a() {
        return f72037a;
    }

    /* renamed from: b */
    public void mo51999b(C25350f fVar, Object obj) {
        double doubleValue = ((Number) obj).doubleValue();
        C87412m.m108594g(fVar, FFmpegMetadataRetriever.METADATA_KEY_ENCODER);
        fVar.mo52532p(doubleValue);
    }

    /* renamed from: d */
    public Object mo51997d(C25349e eVar) {
        C87412m.m108594g(eVar, "decoder");
        return Double.valueOf(eVar.mo52516f());
    }
}
