package rn3;

import com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI;

/* renamed from: rn3.x */
public class C101413x implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MsgRetransmitUI f297035d;

    public C101413x(MsgRetransmitUI msgRetransmitUI) {
        this.f297035d = msgRetransmitUI;
    }

    public void run() {
        this.f297035d.finish();
    }
}
