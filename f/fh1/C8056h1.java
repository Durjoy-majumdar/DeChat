package fh1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: fh1.h1 */
public final class C8056h1 extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public static final C8056h1 f26794d = new C8056h1();

    public C8056h1() {
        super(1);
    }

    public Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        Log.m105924i("LiveMiniWindowController", "cdnStartPlay success: " + booleanValue);
        return C13598b0.f38549a;
    }
}
