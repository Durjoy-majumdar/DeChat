package c71;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: c71.l */
public final class C92372l extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C92379t f264332d;

    /* renamed from: e */
    public final /* synthetic */ boolean f264333e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92372l(C92379t tVar, boolean z) {
        super(0);
        this.f264332d = tVar;
        this.f264333e = z;
    }

    public Object invoke() {
        C92379t tVar = this.f264332d;
        tVar.f264354n = Util.milliSecondsToNow(tVar.f264355o);
        Log.m105924i("MicroMsg.EmojiMixer", "mix used " + this.f264332d.f264354n + "ms, frame:" + this.f264332d.f264350j);
        if (this.f264333e) {
            C92379t tVar2 = this.f264332d;
            long j = tVar2.f264354n;
            boolean z = tVar2.f264345e;
            Log.m105924i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markEmojiMixSucc, costTime:" + j + ", removeBackground:" + z);
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo175913w(1012, 21, 1);
            if (z) {
                nVar.mo175913w(1012, 23, 1);
            } else {
                nVar.mo175913w(1012, 22, 1);
            }
            if (z) {
                nVar.mo175913w(1012, 42, j);
            } else {
                nVar.mo175913w(1012, 39, j);
            }
        }
        C32226l<? super Boolean, C13598b0> lVar = this.f264332d.f264353m;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(this.f264333e));
        }
        return C13598b0.f38549a;
    }
}
