package p14;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import gy3.C87412m;
import l14.C24951b;
import n14.C25207d;
import n14.C25217e;
import o14.C25349e;
import o14.C25350f;

/* renamed from: p14.w */
public final class C25460w implements C24951b<Long> {

    /* renamed from: a */
    public static final C25217e f72069a = new C25436g0("kotlin.Long", C25207d.C25214g.f71678a);

    /* renamed from: b */
    public static final C25460w f72070b = new C25460w();

    /* renamed from: a */
    public C25217e mo51996a() {
        return f72069a;
    }

    /* renamed from: b */
    public void mo51999b(C25350f fVar, Object obj) {
        long longValue = ((Number) obj).longValue();
        C87412m.m108594g(fVar, FFmpegMetadataRetriever.METADATA_KEY_ENCODER);
        fVar.mo52527i(longValue);
    }

    /* renamed from: d */
    public Object mo51997d(C25349e eVar) {
        C87412m.m108594g(eVar, "decoder");
        return Long.valueOf(eVar.mo52518k());
    }
}
