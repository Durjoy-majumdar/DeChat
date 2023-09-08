package y72;

import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C31461f3;
import eb0.C97625j3;
import f40.C86709a0;

/* renamed from: y72.f */
public class C102821f implements C31461f3 {

    /* renamed from: d */
    public final /* synthetic */ C102819d f303541d;

    /* renamed from: e */
    public final /* synthetic */ C102823h f303542e;

    public C102821f(C102823h hVar, C102819d dVar) {
        this.f303542e = hVar;
        this.f303541d = dVar;
    }

    /* renamed from: f4 */
    public void mo24653f4() {
        Log.m105925i("MicroMsg.MsgSynchronizeServer", "receive onNotifyUserStatusChange, needWaitExtLoginCallback[%b], isWebWXOnline:[%b]", Boolean.valueOf(this.f303542e.f303550d), Boolean.valueOf(C86709a0.m107523b().mo121120t()));
        if (this.f303542e.f303550d && C86709a0.m107523b().mo121120t()) {
            Log.m105924i("MicroMsg.MsgSynchronizeServer", "onNotifyUserStatusChange need send msgSynchronize appMsg.");
            C97625j3.m125812b().mo105885K(this);
            C102823h hVar = this.f303542e;
            hVar.f303550d = false;
            hVar.mo142553c(this.f303541d, false);
        }
    }
}
