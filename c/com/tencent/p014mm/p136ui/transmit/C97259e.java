package com.tencent.p014mm.p136ui.transmit;

import android.app.Activity;
import android.content.Context;
import com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI;

/* renamed from: com.tencent.mm.ui.transmit.e */
public class C97259e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MsgRetransmitUI.C97251g f285469d;

    public C97259e(MsgRetransmitUI.C97251g gVar) {
        this.f285469d = gVar;
    }

    public void run() {
        MsgRetransmitUI.C97251g gVar = this.f285469d;
        if (gVar.f285425l) {
            Context context = gVar.f285415b;
            if (context instanceof Activity) {
                ((Activity) context).finish();
            }
        }
    }
}
