package p14;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import gy3.C87412m;
import l14.C24951b;
import n14.C25207d;
import n14.C25217e;
import o14.C25349e;
import o14.C25350f;

/* renamed from: p14.j0 */
public final class C25441j0 implements C24951b<Short> {

    /* renamed from: a */
    public static final C25217e f72043a = new C25436g0("kotlin.Short", C25207d.C25215h.f71679a);

    /* renamed from: b */
    public static final C25441j0 f72044b = new C25441j0();

    /* renamed from: a */
    public C25217e mo51996a() {
        return f72043a;
    }

    /* renamed from: b */
    public void mo51999b(C25350f fVar, Object obj) {
        short shortValue = ((Number) obj).shortValue();
        C87412m.m108594g(fVar, FFmpegMetadataRetriever.METADATA_KEY_ENCODER);
        fVar.mo52525e(shortValue);
    }

    /* renamed from: d */
    public Object mo51997d(C25349e eVar) {
        C87412m.m108594g(eVar, "decoder");
        return Short.valueOf(eVar.mo52519n());
    }
}
