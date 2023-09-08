package j50;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: j50.p */
public final class C60768p extends C87413o implements C32227p<Integer, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C60735a f173088d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60768p(C60735a aVar) {
        super(2);
        this.f173088d = aVar;
    }

    public Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        Log.m105924i("MicroMsg.LiveCore", "startPreviewToRemote onViewSizeChanged");
        this.f173088d.f173031q.mo162269d(intValue, intValue2);
        return C13598b0.f38549a;
    }
}
