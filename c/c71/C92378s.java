package c71;

import android.view.Surface;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j71.C108587c;
import p206nj.C11171e;
import rx3.C13598b0;

/* renamed from: c71.s */
public final class C92378s extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C92379t f264339d;

    /* renamed from: e */
    public final /* synthetic */ C94554a f264340e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92378s(C92379t tVar, C94554a aVar) {
        super(0);
        this.f264339d = tVar;
        this.f264340e = aVar;
    }

    public Object invoke() {
        C92380u uVar;
        C92379t tVar = this.f264339d;
        if (C11171e.m11046c(23)) {
            Log.m105924i("MicroMsg.EmojiMixer", "api level 23 user async decoder");
            C92379t tVar2 = this.f264339d;
            String str = tVar2.f264341a;
            C94554a aVar = this.f264340e;
            int i = aVar != null ? aVar.f273443a : 0;
            C108587c cVar = tVar2.f264349i;
            if (cVar != null) {
                Surface surface = cVar.f325061j;
                if (surface != null) {
                    uVar = new C104301k(str, i, surface);
                } else {
                    C87412m.m108603p("videoDecodeSurface");
                    throw null;
                }
            } else {
                C87412m.m108603p("mixPixelBuffer");
                throw null;
            }
        } else {
            Log.m105924i("MicroMsg.EmojiMixer", "api level below 23 user sync decoder");
            C92379t tVar3 = this.f264339d;
            String str2 = tVar3.f264341a;
            C108587c cVar2 = tVar3.f264349i;
            if (cVar2 != null) {
                Surface surface2 = cVar2.f325061j;
                if (surface2 != null) {
                    uVar = new C104299j(str2, surface2);
                } else {
                    C87412m.m108603p("videoDecodeSurface");
                    throw null;
                }
            } else {
                C87412m.m108603p("mixPixelBuffer");
                throw null;
            }
        }
        tVar.f264348h = uVar;
        C92379t tVar4 = this.f264339d;
        C92380u uVar2 = tVar4.f264348h;
        if (uVar2 != null) {
            uVar2.f264356a = C0428p.f1052d;
            uVar2.f264357b = new C92377r(tVar4);
            C92380u uVar3 = this.f264339d.f264348h;
            if (uVar3 != null) {
                if (uVar3.mo126339a() < 0) {
                    Log.m105924i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markVideoDecoderInitFailed");
                    C115669n.INSTANCE.mo175913w(1012, 26, 1);
                }
                C92380u uVar4 = this.f264339d.f264348h;
                if (uVar4 != null) {
                    uVar4.mo126341c();
                    return C13598b0.f38549a;
                }
                C87412m.m108603p("videoDecoder");
                throw null;
            }
            C87412m.m108603p("videoDecoder");
            throw null;
        }
        C87412m.m108603p("videoDecoder");
        throw null;
    }
}
