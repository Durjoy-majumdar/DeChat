package p14;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import gy3.C87412m;
import l14.C24951b;
import n14.C25207d;
import n14.C25217e;
import o14.C25349e;
import o14.C25350f;

/* renamed from: p14.f */
public final class C25433f implements C24951b<Byte> {

    /* renamed from: a */
    public static final C25217e f72030a = new C25436g0("kotlin.Byte", C25207d.C25209b.f71673a);

    /* renamed from: b */
    public static final C25433f f72031b = new C25433f();

    /* renamed from: a */
    public C25217e mo51996a() {
        return f72030a;
    }

    /* renamed from: b */
    public void mo51999b(C25350f fVar, Object obj) {
        byte byteValue = ((Number) obj).byteValue();
        C87412m.m108594g(fVar, FFmpegMetadataRetriever.METADATA_KEY_ENCODER);
        fVar.mo52529l(byteValue);
    }

    /* renamed from: d */
    public Object mo51997d(C25349e eVar) {
        C87412m.m108594g(eVar, "decoder");
        return Byte.valueOf(eVar.mo52517j());
    }
}
