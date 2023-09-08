package com.tencent.p014mm.plugin.voip.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import te3.C101858vq3;
import te3.iv4;
import z33.C112597j;

/* renamed from: com.tencent.mm.plugin.voip.model.p0 */
public class C96585p0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ iv4 f282745d;

    /* renamed from: e */
    public final /* synthetic */ boolean f282746e;

    /* renamed from: f */
    public final /* synthetic */ C106373o0 f282747f;

    public C96585p0(C106373o0 o0Var, iv4 iv4, boolean z) {
        this.f282747f = o0Var;
        this.f282745d = iv4;
        this.f282746e = z;
    }

    public void run() {
        byte[] bArr;
        if (this.f282745d != null) {
            C112597j.m153938c("MicroMsg.Voip.VoipSyncHandle", "__onGotNewConnData begin local conn set seq " + this.f282747f.f317444a.f317460K + " recv conn set seq " + this.f282745d.f298420j);
            int i = this.f282745d.f298420j;
            C106377r rVar = this.f282747f.f317444a;
            if (i <= rVar.f317460K) {
                C112597j.m153938c("MicroMsg.Voip.VoipSyncHandle", "the recieved conn set is too old");
                return;
            }
            rVar.f317460K = i;
            C112597j.m153938c("MicroMsg.Voip.VoipSyncHandle", "new relay conn cnt: " + this.f282745d.f298414d.f299682d + " new direct conn cnt: " + this.f282745d.f298415e.f297999d);
            byte[] bArr2 = null;
            try {
                bArr = this.f282745d.f298414d.toByteArray();
            } catch (Exception unused) {
                Log.m105920e("MicroMsg.Voip.VoipSyncHandle", "conn info to byte array fail..");
                bArr = null;
            }
            int i2 = 0;
            int AddNewRelayConns = this.f282747f.f317444a.f317500x.AddNewRelayConns(bArr, bArr.length, 0, false);
            if (AddNewRelayConns != 0) {
                C112597j.m153937b("MicroMsg.Voip.VoipSyncHandle", "add new relay conns fail ret:" + AddNewRelayConns);
            }
            try {
                bArr2 = this.f282745d.f298415e.toByteArray();
            } catch (Exception unused2) {
                Log.m105920e("MicroMsg.Voip.VoipSyncHandle", "conn info to byte array fail..");
            }
            int AddNewDirectConns = this.f282747f.f317444a.f317500x.AddNewDirectConns(bArr2, bArr2.length, 0);
            if (AddNewDirectConns != 0) {
                C112597j.m153937b("MicroMsg.Voip.VoipSyncHandle", "add new direct conns fail ret:" + AddNewDirectConns);
            }
            int i3 = 0;
            while (true) {
                iv4 iv4 = this.f282745d;
                if (i3 >= iv4.f298416f) {
                    break;
                }
                int ActivateConn = this.f282747f.f317444a.f317500x.ActivateConn(iv4.f298417g.get(i3).intValue());
                if (ActivateConn != 0) {
                    C112597j.m153937b("MicroMsg.Voip.VoipSyncHandle", "activate conn " + this.f282745d.f298417g.get(i3) + " ret:" + ActivateConn);
                }
                i3++;
            }
            while (true) {
                iv4 iv42 = this.f282745d;
                if (i2 >= iv42.f298418h) {
                    break;
                }
                int InactivateConn = this.f282747f.f317444a.f317500x.InactivateConn(iv42.f298419i.get(i2).intValue());
                if (InactivateConn != 0) {
                    C112597j.m153937b("MicroMsg.Voip.VoipSyncHandle", "inactivate conn " + this.f282745d.f298419i.get(i2) + " ret:" + InactivateConn);
                }
                i2++;
            }
            C112597j.m153938c("MicroMsg.Voip.VoipSyncHandle", "redirect relay conn cnt: " + this.f282745d.f298421n.f299682d);
            C101858vq3 vq32 = this.f282745d.f298421n;
            if (vq32.f299682d > 0) {
                try {
                    bArr = vq32.toByteArray();
                } catch (Exception unused3) {
                    Log.m105920e("MicroMsg.Voip.VoipSyncHandle", "conn info to byte array fail..");
                }
                int AddNewRelayConns2 = this.f282747f.f317444a.f317500x.AddNewRelayConns(bArr, bArr.length, 1, this.f282746e);
                if (AddNewRelayConns2 != 0) {
                    C112597j.m153937b("MicroMsg.Voip.VoipSyncHandle", "redirect relay conns fail ret:" + AddNewRelayConns2);
                }
            }
            C112597j.m153938c("MicroMsg.Voip.VoipSyncHandle", "__onGotNewConnData end");
        }
    }
}
