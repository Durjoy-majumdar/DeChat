package px0;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.xeffect.effect.EffectManager;
import fy3.C32226l;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import java.util.concurrent.CountDownLatch;
import rx3.C13598b0;

/* renamed from: px0.a */
public final class C118142a extends C87413o implements C32226l<Bitmap, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C8479f0<Bitmap> f353155d;

    /* renamed from: e */
    public final /* synthetic */ CountDownLatch f353156e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C118142a(C8479f0<Bitmap> f0Var, CountDownLatch countDownLatch) {
        super(1);
        this.f353155d = f0Var;
        this.f353156e = countDownLatch;
    }

    public Object invoke(Object obj) {
        T t = (Bitmap) obj;
        C87412m.m108594g(t, LocaleUtil.ITALIAN);
        this.f353155d.f27484d = t;
        EffectManager effectManager = C22038c.f62372a;
        Log.m105924i("MicroMsg.NativeFinderDrawCardManager", "latch.countDown()");
        this.f353156e.countDown();
        return C13598b0.f38549a;
    }
}
