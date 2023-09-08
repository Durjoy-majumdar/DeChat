package rn3;

import com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: rn3.n */
public class C101403n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f297011d;

    /* renamed from: e */
    public final /* synthetic */ MsgRetransmitUI f297012e;

    public C101403n(MsgRetransmitUI msgRetransmitUI, String str) {
        this.f297012e = msgRetransmitUI;
        this.f297011d = str;
    }

    public void run() {
        Log.m105924i("MicroMsg.MsgRetransmitUI", "before send image from external");
        MsgRetransmitUI msgRetransmitUI = this.f297012e;
        msgRetransmitUI.mo136239U7(this.f297011d, 6, msgRetransmitUI.f285343A);
    }
}
