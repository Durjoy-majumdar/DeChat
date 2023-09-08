package sx2;

import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import eb0.C97625j3;
import tx2.C52385d;

/* renamed from: sx2.o */
public class C118334o implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ C118325m f353674d;

    public C118334o(C118325m mVar) {
        this.f353674d = mVar;
    }

    public boolean onTimerExpired() {
        C118325m mVar = this.f353674d;
        int i = mVar.f353650i;
        long j = mVar.f353651j;
        String str = mVar.f353649h;
        C97625j3.m125815e().mo123460f(new C52385d(i, j, 1, str, mVar.mo183119l(str)));
        return true;
    }
}
