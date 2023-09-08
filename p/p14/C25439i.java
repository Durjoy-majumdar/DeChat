package p14;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import gy3.C87412m;
import l14.C24951b;
import n14.C25207d;
import n14.C25217e;
import o14.C25349e;
import o14.C25350f;

/* renamed from: p14.i */
public final class C25439i implements C24951b<Float> {

    /* renamed from: a */
    public static final C25217e f72041a = new C25436g0("kotlin.Float", C25207d.C25212e.f71676a);

    /* renamed from: b */
    public static final C25439i f72042b = new C25439i();

    /* renamed from: a */
    public C25217e mo51996a() {
        return f72041a;
    }

    /* renamed from: b */
    public void mo51999b(C25350f fVar, Object obj) {
        float floatValue = ((Number) obj).floatValue();
        C87412m.m108594g(fVar, FFmpegMetadataRetriever.METADATA_KEY_ENCODER);
        fVar.mo52531n(floatValue);
    }

    /* renamed from: d */
    public Object mo51997d(C25349e eVar) {
        C87412m.m108594g(eVar, "decoder");
        return Float.valueOf(eVar.mo52521t());
    }
}
