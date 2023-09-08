package rn3;

import com.tencent.p014mm.modelimage.C92834j;
import com.tencent.p014mm.p136ui.transmit.C97256c;
import com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import hd0.C98408n0;
import hd0.C98410o0;
import p682rz.C101488s;
import p682rz.C101491u;

/* renamed from: rn3.t */
public class C101409t implements C92834j {

    /* renamed from: a */
    public final /* synthetic */ C97256c f297031a;

    public C101409t(C97256c cVar) {
        this.f297031a = cVar;
    }

    /* renamed from: a */
    public void mo127120a(int i, int i2) {
        C98408n0 Zd = ((C101491u) C86312j.m106911c(C101491u.class)).mo140806Zd(this.f297031a.f285452f);
        Zd.f288562i = 111;
        Zd.f288548P = 256;
        ((C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0()).mo137733w(Zd);
        boolean z = false;
        Log.m105919d("MicroMsg.MsgRetransmitUI", "NetSceneUploadVideoForCdn callback, errType: %s, errCode: %s", Integer.valueOf(i), Integer.valueOf(i2));
        if (i == 0 && i2 == 0) {
            z = true;
        }
        MsgRetransmitUI.m125190F7(Long.valueOf(this.f297031a.f285466w.f285374f), this.f297031a.f285460q, z, 3);
    }
}
