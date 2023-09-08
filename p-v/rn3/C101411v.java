package rn3;

import android.content.DialogInterface;
import android.content.Intent;
import com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI;

/* renamed from: rn3.v */
public class C101411v implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f297032d;

    /* renamed from: e */
    public final /* synthetic */ MsgRetransmitUI f297033e;

    public C101411v(MsgRetransmitUI msgRetransmitUI, String str) {
        this.f297033e = msgRetransmitUI;
        this.f297032d = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        MsgRetransmitUI msgRetransmitUI = this.f297033e;
        Intent intent = msgRetransmitUI.getIntent();
        String str = this.f297032d;
        int i2 = MsgRetransmitUI.f285342V0;
        msgRetransmitUI.mo136238T7(intent, str);
    }
}
