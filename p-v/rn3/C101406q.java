package rn3;

import com.tencent.p014mm.modelimage.C68129u;
import com.tencent.p014mm.modelimage.C92836k;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import p158gt.C98201k;
import p158gt.C98205r;

/* renamed from: rn3.q */
public class C101406q implements C98205r.C98206a {

    /* renamed from: a */
    public final /* synthetic */ String f297024a;

    /* renamed from: b */
    public final /* synthetic */ long f297025b;

    /* renamed from: c */
    public final /* synthetic */ long f297026c;

    /* renamed from: d */
    public final /* synthetic */ MsgRetransmitUI f297027d;

    public C101406q(MsgRetransmitUI msgRetransmitUI, String str, long j, long j2) {
        this.f297027d = msgRetransmitUI;
        this.f297024a = str;
        this.f297025b = j;
        this.f297026c = j2;
    }

    /* renamed from: a */
    public void mo103302a(long j, int i, int i2, int i3, String str) {
        Class cls = C98201k.class;
        Class cls2 = C75700k0.class;
        boolean z = false;
        Log.m105925i("MicroMsg.MsgRetransmitUI", "cdntra  NetSceneUploadMsgImgForCdn ret:[%d,%d]", Integer.valueOf(i2), Integer.valueOf(i3));
        if (i2 == 0 && i3 == 0) {
            z = true;
        }
        MsgRetransmitUI.m125190F7(Long.valueOf(this.f297027d.f285374f), this.f297024a, z, 2);
        if (i2 == 0 && i3 == 0) {
            C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls2)).mo96095LE()).b00(this.f297026c);
            b002.mo100991d(2);
            b002.mo108745Y2(j);
            b002.mo101012p4(str);
            ((C72972g4) ((C75700k0) C86709a0.m107533q(cls2)).mo96095LE()).xy0(this.f297026c, b002);
            C92836k nP = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127194nP(Long.valueOf(this.f297025b));
            nP.mo127125B(j);
            ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).Dx0(Long.valueOf(this.f297025b), nP);
            C68129u.m80533e((int) this.f297025b);
            return;
        }
        C68129u.m80534f((int) this.f297025b);
        C68129u.m80533e((int) this.f297025b);
    }
}
