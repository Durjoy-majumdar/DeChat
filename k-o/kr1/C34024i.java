package kr1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87413o;
import kr1.C109039b;
import rx3.C13598b0;

/* renamed from: kr1.i */
public final class C34024i extends C87413o implements C32227p<Integer, Integer, C13598b0> {

    /* renamed from: d */
    public static final C34024i f91832d = new C34024i();

    public C34024i() {
        super(2);
    }

    public Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        C109039b.C109042c cVar = C109039b.f326557v;
        Log.m105924i("MicroMsg.FinderRecordBeautifyPlugin", "#detailsView.onWriteSeek key=" + intValue + " seek=" + intValue2);
        return C13598b0.f38549a;
    }
}
