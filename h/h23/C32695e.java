package h23;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.nio.IntBuffer;
import rx3.C13598b0;

/* renamed from: h23.e */
public final class C32695e extends C87413o implements C32226l<IntBuffer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C108026d f86742d;

    /* renamed from: e */
    public final /* synthetic */ C32227p<IntBuffer, Integer, C13598b0> f86743e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32695e(C108026d dVar, C32227p<? super IntBuffer, ? super Integer, C13598b0> pVar) {
        super(1);
        this.f86742d = dVar;
        this.f86743e = pVar;
    }

    public Object invoke(Object obj) {
        IntBuffer intBuffer = (IntBuffer) obj;
        C87412m.m108594g(intBuffer, LocaleUtil.ITALIAN);
        Log.m105924i("MicroMsg.VLogDecoder", "on Snapshot callback, frameCount:" + this.f86742d.f323500e);
        C32227p<IntBuffer, Integer, C13598b0> pVar = this.f86743e;
        if (pVar != null) {
            pVar.invoke(intBuffer, Integer.valueOf(this.f86742d.f323500e));
        }
        return C13598b0.f38549a;
    }
}
