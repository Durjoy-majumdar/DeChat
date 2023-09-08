package p14;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import gy3.C87412m;
import l14.C24951b;
import n14.C25207d;
import n14.C25217e;
import o14.C25349e;
import o14.C25350f;

/* renamed from: p14.g */
public final class C25435g implements C24951b<Character> {

    /* renamed from: a */
    public static final C25217e f72033a = new C25436g0("kotlin.Char", C25207d.C25210c.f71674a);

    /* renamed from: b */
    public static final C25435g f72034b = new C25435g();

    /* renamed from: a */
    public C25217e mo51996a() {
        return f72033a;
    }

    /* renamed from: b */
    public void mo51999b(C25350f fVar, Object obj) {
        char charValue = ((Character) obj).charValue();
        C87412m.m108594g(fVar, FFmpegMetadataRetriever.METADATA_KEY_ENCODER);
        fVar.mo52528j(charValue);
    }

    /* renamed from: d */
    public Object mo51997d(C25349e eVar) {
        C87412m.m108594g(eVar, "decoder");
        return Character.valueOf(eVar.mo52520o());
    }
}
