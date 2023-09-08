package p14;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import gy3.C87412m;
import l14.C24951b;
import n14.C25207d;
import n14.C25217e;
import o14.C25349e;
import o14.C25350f;

/* renamed from: p14.k0 */
public final class C25443k0 implements C24951b<String> {

    /* renamed from: a */
    public static final C25217e f72045a = new C25436g0("kotlin.String", C25207d.C25216i.f71680a);

    /* renamed from: b */
    public static final C25443k0 f72046b = new C25443k0();

    /* renamed from: a */
    public C25217e mo51996a() {
        return f72045a;
    }

    /* renamed from: b */
    public void mo51999b(C25350f fVar, Object obj) {
        String str = (String) obj;
        C87412m.m108594g(fVar, FFmpegMetadataRetriever.METADATA_KEY_ENCODER);
        C87412m.m108594g(str, "value");
        fVar.encodeString(str);
    }

    /* renamed from: d */
    public Object mo51997d(C25349e eVar) {
        C87412m.m108594g(eVar, "decoder");
        return eVar.mo52494p();
    }
}
