package com.tencent.p014mm.p136ui.transmit;

import com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI;
import f40.C86709a0;
import hd0.C76151b1;
import hd0.C98398h0;
import hd0.C98447z0;

/* renamed from: com.tencent.mm.ui.transmit.a */
public class C97254a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MsgRetransmitUI f285447d;

    public C97254a(MsgRetransmitUI msgRetransmitUI) {
        this.f285447d = msgRetransmitUI;
    }

    public void run() {
        C98447z0 Dx0 = C98398h0.Dx0();
        MsgRetransmitUI msgRetransmitUI = this.f285447d;
        String str = msgRetransmitUI.f285375g;
        Dx0.f288768x.put(str, new MsgRetransmitUI.C97252h(msgRetransmitUI.f285376h, str, msgRetransmitUI.f285388v, msgRetransmitUI.f285380o, msgRetransmitUI.f285373e, msgRetransmitUI.f285384r, msgRetransmitUI.f285374f, msgRetransmitUI.f285356N));
        C86709a0.m107525e().postToWorker(new C76151b1(Dx0, str, 3));
    }
}
