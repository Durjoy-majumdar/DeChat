package com.tencent.p014mm.p136ui.transmit;

import android.content.DialogInterface;
import com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI;

/* renamed from: com.tencent.mm.ui.transmit.b */
public class C97255b implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ MsgRetransmitUI.C97251g f285448d;

    /* renamed from: e */
    public final /* synthetic */ MsgRetransmitUI f285449e;

    public C97255b(MsgRetransmitUI msgRetransmitUI, MsgRetransmitUI.C97251g gVar) {
        this.f285449e = msgRetransmitUI;
        this.f285448d = gVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f285448d.f285416c = true;
        this.f285449e.finish();
    }
}
