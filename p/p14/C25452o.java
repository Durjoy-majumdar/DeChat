package p14;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import gy3.C87412m;
import l14.C24951b;
import n14.C25207d;
import n14.C25217e;
import o14.C25349e;
import o14.C25350f;

/* renamed from: p14.o */
public final class C25452o implements C24951b<Integer> {

    /* renamed from: a */
    public static final C25217e f72060a = new C25436g0("kotlin.Int", C25207d.C25213f.f71677a);

    /* renamed from: b */
    public static final C25452o f72061b = new C25452o();

    /* renamed from: a */
    public C25217e mo51996a() {
        return f72060a;
    }

    /* renamed from: b */
    public void mo51999b(C25350f fVar, Object obj) {
        int intValue = ((Number) obj).intValue();
        C87412m.m108594g(fVar, FFmpegMetadataRetriever.METADATA_KEY_ENCODER);
        fVar.mo52501g(intValue);
    }

    /* renamed from: d */
    public Object mo51997d(C25349e eVar) {
        C87412m.m108594g(eVar, "decoder");
        return Integer.valueOf(eVar.mo52497s());
    }
}
