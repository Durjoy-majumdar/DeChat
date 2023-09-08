package hl1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: hl1.v */
public final class C8587v extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C59988k f27676d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8587v(C59988k kVar) {
        super(1);
        this.f27676d = kVar;
    }

    public Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        String str = this.f27676d.f171222i;
        Log.m105924i(str, "linkMic realname :" + booleanValue);
        return C13598b0.f38549a;
    }
}
