package p14;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import gy3.C87412m;
import l14.C24951b;
import n14.C25207d;
import n14.C25217e;
import o14.C25349e;
import o14.C25350f;

/* renamed from: p14.e */
public final class C25427e implements C24951b<Boolean> {

    /* renamed from: a */
    public static final C25217e f72014a = new C25436g0("kotlin.Boolean", C25207d.C25208a.f71672a);

    /* renamed from: b */
    public static final C25427e f72015b = new C25427e();

    /* renamed from: a */
    public C25217e mo51996a() {
        return f72014a;
    }

    /* renamed from: b */
    public void mo51999b(C25350f fVar, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C87412m.m108594g(fVar, FFmpegMetadataRetriever.METADATA_KEY_ENCODER);
        fVar.mo52526f(booleanValue);
    }

    /* renamed from: d */
    public Object mo51997d(C25349e eVar) {
        C87412m.m108594g(eVar, "decoder");
        return Boolean.valueOf(eVar.mo52522u());
    }
}
