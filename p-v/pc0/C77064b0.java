package pc0;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.modelgetchatroommsg.C68111c;
import com.tencent.p014mm.modelgetchatroommsg.GetChatroomMsgReceiver;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import f62.C75700k0;
import g62.C75882t;
import lc3.C117474c;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: pc0.b0 */
public class C77064b0 extends C86301e {

    /* renamed from: d */
    public GetChatroomMsgReceiver f225105d;

    public static C118002e0 yn0() {
        return ((C117474c) C86312j.m106911c(C117474c.class)).yn0();
    }

    /* renamed from: mC */
    public C75882t mo107372mC() {
        C86709a0.m107528h();
        C86709a0.m107523b().mo121108c();
        return ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96102mC();
    }

    public void onAccountInitialized(Context context) {
        super.onAccountInitialized(context);
        GetChatroomMsgReceiver getChatroomMsgReceiver = new GetChatroomMsgReceiver();
        this.f225105d = getChatroomMsgReceiver;
        getChatroomMsgReceiver.alive();
    }

    public void onAccountReleased(Context context) {
        super.onAccountReleased(context);
        GetChatroomMsgReceiver getChatroomMsgReceiver = this.f225105d;
        if (getChatroomMsgReceiver != null) {
            getChatroomMsgReceiver.f195752d.dead();
            C68111c.m80513e().f195761d = null;
            ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku().remove(getChatroomMsgReceiver);
            ((C77064b0) C86312j.m106911c(C77064b0.class)).mo107372mC().remove(getChatroomMsgReceiver);
            this.f225105d.dead();
        }
    }
}
