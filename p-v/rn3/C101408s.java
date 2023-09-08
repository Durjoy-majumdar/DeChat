package rn3;

import com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI;

/* renamed from: rn3.s */
public class C101408s implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MsgRetransmitUI f297030d;

    public C101408s(MsgRetransmitUI msgRetransmitUI) {
        this.f297030d = msgRetransmitUI;
    }

    public void run() {
        this.f297030d.finish();
    }
}
