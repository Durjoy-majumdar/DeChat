package rn3;

import android.content.DialogInterface;
import com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI;
import qo3.C77398g;

/* renamed from: rn3.l */
public class C101399l implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ MsgRetransmitUI f297007d;

    public C101399l(MsgRetransmitUI msgRetransmitUI) {
        this.f297007d = msgRetransmitUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C77398g gVar = this.f297007d.f285386t;
        if (gVar != null) {
            gVar.cancel();
        }
    }
}
