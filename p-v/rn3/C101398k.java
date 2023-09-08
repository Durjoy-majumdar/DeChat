package rn3;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C117747y;
import ob0.C47355o;
import qo3.C77398g;

/* renamed from: rn3.k */
public class C101398k implements C47355o {

    /* renamed from: d */
    public final /* synthetic */ MsgRetransmitUI f297006d;

    public C101398k(MsgRetransmitUI msgRetransmitUI) {
        this.f297006d = msgRetransmitUI;
    }

    /* renamed from: m */
    public void mo26221m(int i, int i2, C117747y yVar) {
        MsgRetransmitUI msgRetransmitUI = this.f297006d;
        C77398g gVar = msgRetransmitUI.f285386t;
        if (gVar != null && i2 != 0) {
            int i3 = (int) ((((long) i) * 100) / ((long) i2));
            gVar.mo107533r(msgRetransmitUI.getString(C0966R.string.gxk, new Object[]{Integer.valueOf(msgRetransmitUI.f285344B), Integer.valueOf(this.f297006d.f285345C), Integer.valueOf(i3)}));
            Log.m105925i("MicroMsg.MsgRetransmitUI", "onSceneProgress: %d", Integer.valueOf(i3));
        }
    }
}
