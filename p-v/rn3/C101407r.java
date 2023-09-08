package rn3;

import com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C47355o;

/* renamed from: rn3.r */
public class C101407r implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f297028d;

    /* renamed from: e */
    public final /* synthetic */ MsgRetransmitUI f297029e;

    public C101407r(MsgRetransmitUI msgRetransmitUI, String str) {
        this.f297029e = msgRetransmitUI;
        this.f297028d = str;
    }

    public void run() {
        Log.m105924i("MicroMsg.MsgRetransmitUI", "test before sendMutiImage");
        MsgRetransmitUI msgRetransmitUI = this.f297029e;
        String str = this.f297028d;
        int i = MsgRetransmitUI.f285342V0;
        msgRetransmitUI.mo136239U7(str, 4, (C47355o) null);
    }
}
