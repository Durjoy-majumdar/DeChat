package fh1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: fh1.c */
public final class C32049c extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C58989a f85288d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32049c(C58989a aVar) {
        super(1);
        this.f85288d = aVar;
    }

    public Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        String str = this.f85288d.f168783j;
        Log.m105924i(str, "cdnStartPlay success: " + booleanValue);
        return C13598b0.f38549a;
    }
}
