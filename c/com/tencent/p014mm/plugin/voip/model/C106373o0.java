package com.tencent.p014mm.plugin.voip.model;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import java.util.LinkedList;
import l33.C109247e;
import p206nj.C76861g;
import s33.C48223m;
import te3.C51018qv3;
import te3.aw4;
import te3.jv4;
import te3.su4;
import z33.C112597j;

/* renamed from: com.tencent.mm.plugin.voip.model.o0 */
public class C106373o0 {

    /* renamed from: a */
    public C106377r f317444a = null;

    /* renamed from: b */
    public jv4 f317445b = new jv4();

    /* renamed from: c */
    public su4 f317446c = null;

    /* renamed from: d */
    public int f317447d = 0;

    /* renamed from: com.tencent.mm.plugin.voip.model.o0$a */
    public class C106374a implements Runnable {
        public C106374a() {
        }

        public void run() {
            C106373o0.this.f317444a.mo152695I();
        }
    }

    public C106373o0(C106377r rVar) {
        this.f317444a = rVar;
    }

    /* renamed from: a */
    public int mo152682a(su4 su4, boolean z, int i) {
        C106377r rVar = this.f317444a;
        if (rVar.f317500x.f317656n == 0) {
            C112597j.m153937b("MicroMsg.Voip.VoipSyncHandle", C76861g.m92660c() + "failed to do voip sync , roomid = 0");
            return 0;
        } else if (rVar.f317455F) {
            C112597j.m153937b("MicroMsg.Voip.VoipSyncHandle", C76861g.m92660c() + "voip syncing, push to cache...");
            if (su4 == null) {
                C112597j.m153937b("MicroMsg.Voip.VoipSyncHandle", "failed to pushVoipCmdList , VoipCmdList = null");
                this.f317447d++;
            } else {
                if (this.f317446c == null) {
                    this.f317446c = new su4();
                }
                for (int i2 = 0; i2 < su4.f141766d; i2++) {
                    this.f317446c.f141767e.add(su4.f141767e.get(i2));
                }
                su4 su42 = this.f317446c;
                su42.f141766d = su42.f141767e.size();
            }
            return 0;
        } else {
            rVar.f317455F = true;
            if (su4 == null) {
                su4 = new su4();
                su4.f141766d = 0;
                su4.f141767e = new LinkedList<>();
            }
            su4 su43 = su4;
            su4 su44 = this.f317446c;
            if (su44 != null && su44.f141766d > 0) {
                int i3 = 0;
                while (true) {
                    su4 su45 = this.f317446c;
                    if (i3 >= su45.f141766d) {
                        break;
                    }
                    su43.f141767e.add(su45.f141767e.get(i3));
                    i3++;
                }
                su43.f141766d = su43.f141767e.size();
                su4 su46 = this.f317446c;
                if (su46 != null) {
                    su46.f141767e.clear();
                    this.f317446c.f141766d = 0;
                    this.f317446c = null;
                    this.f317447d = 0;
                }
            }
            this.f317447d = 0;
            C106377r rVar2 = this.f317444a;
            if (rVar2.f317452C == null) {
                rVar2.f317452C = "".getBytes();
            }
            C112597j.m153938c("MicroMsg.Voip.VoipSyncHandle", "____doVoipSync, fromjni:" + z + ",cmdList:" + su43.f141766d + ",syncKey.length:" + this.f317444a.f317452C.length + ",selector:" + i);
            C106377r rVar3 = this.f317444a;
            v2protocal v2protocal = rVar3.f317500x;
            C48223m mVar = new C48223m(v2protocal.f317656n, su43, rVar3.f317452C, v2protocal.f317665q, i);
            C106401z zVar = this.f317444a.f317500x.f317568G1;
            zVar.getClass();
            zVar.f317759N = System.currentTimeMillis();
            mVar.mo88544n1();
            return 0;
        }
    }

    /* renamed from: b */
    public void mo152683b(C51018qv3 qv32) {
        byte[] f = qv32.f140574f.mo123703f();
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            i |= (f[i2] & ExifInterface.MARKER) << (i2 * 8);
        }
        C112597j.m153938c("MicroMsg.Voip.VoipSyncHandle", "voipSync remote status changed, status = " + i);
        C106377r rVar = this.f317444a;
        int i3 = i & 255;
        rVar.getClass();
        if (!(8 == i3 || 9 == i3)) {
            rVar.f317497u = i3;
            rVar.f317495s = i3;
        }
        if (1 == i3 || 3 == i3) {
            rVar.mo152693G(2);
            C109247e.xx0().f317332a.f317414s = false;
        }
        C109247e.xx0().mo152588B();
        rVar.f317502z.mo152420B0(i3);
    }

    /* renamed from: c */
    public void mo152684c(aw4 aw4, int i) {
        aw4 aw42 = aw4;
        int i2 = i;
        C112597j.m153938c("MicroMsg.Voip.VoipSyncHandle", "onStatusChanged:  status:" + aw42.f130810e);
        int i3 = aw42.f130810e;
        if (i3 == 1) {
            C106377r rVar = this.f317444a;
            rVar.f317481e = true;
            if (1 == i2) {
                C106401z zVar = rVar.f317500x.f317568G1;
                if (0 == zVar.f317748C) {
                    zVar.f317748C = System.currentTimeMillis();
                    C112597j.m153938c("MicroMsg.VoipDailReport", "accept received timestamp:" + zVar.f317748C);
                }
            }
            if (3 == i2) {
                C106401z zVar2 = this.f317444a.f317500x.f317568G1;
                if (0 == zVar2.f317749D) {
                    zVar2.f317749D = System.currentTimeMillis();
                    C112597j.m153938c("MicroMsg.VoipDailReport", "sync accept received timestamp:" + zVar2.f317749D);
                }
            }
            C112597j.m153938c("MicroMsg.Voip.VoipSyncHandle", "zhengxue[DataAccept]onVoipSyncStatus:ACCEPTdata Flag: " + i2);
            this.f317444a.f317502z.mo152423D0();
            C106359m0 m0Var = C109247e.xx0().f317332a;
            if (m0Var.f317416u != null) {
                C112597j.m153938c("MicroMsg.Voip.VoipServiceEx", "devincdai: voip reset timecount");
                m0Var.f317416u.stopTimer();
                m0Var.f317416u.startTimer(60000);
            }
            C106377r rVar2 = this.f317444a;
            rVar2.f317483g = true;
            if (rVar2.f317485i) {
                rVar2.f317485i = false;
                if (rVar2.f317480d) {
                    C112597j.m153938c("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncStatus:ACCEPT, pre-connect already success");
                    MMHandlerThread.postToMainThread(new C106374a());
                } else if (rVar2.f317484h) {
                    C112597j.m153938c("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncStatus: ACCEPT, pre-connect already fail");
                    this.f317444a.mo152719v(1, -9000, "", -1);
                } else {
                    C112597j.m153938c("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncStatus: ACCEPT, pre-connect still connecting...");
                }
            }
            C115669n.INSTANCE.mo160131h(11519, Integer.valueOf(C109247e.xx0().mo152615n()), Long.valueOf(C109247e.xx0().mo152616o()), Long.valueOf(C109247e.xx0().mo152617p()), 2);
            this.f317444a.mo152694H();
            this.f317444a.mo152692F();
        } else if (i3 == 6) {
            C112597j.m153938c("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncStatus: ACKED");
            C112597j.m153938c("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncStatus: try use pre-connect");
            C106377r rVar3 = this.f317444a;
            rVar3.f317485i = true;
            C106401z zVar3 = rVar3.f317500x.f317568G1;
            zVar3.getClass();
            zVar3.f317751F = System.currentTimeMillis();
            C106377r rVar4 = this.f317444a;
            rVar4.f317500x.f317561E0 = 1;
            rVar4.mo152694H();
        } else if (i3 == 8) {
            C112597j.m153938c("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncStatus: ACK BUSY");
            C106401z zVar4 = this.f317444a.f317500x.f317568G1;
            zVar4.f317773b = 211;
            zVar4.f317772a = 11;
            zVar4.f317784m = 12;
            C115669n.INSTANCE.mo160131h(11519, Integer.valueOf(C109247e.xx0().mo152615n()), Long.valueOf(C109247e.xx0().mo152616o()), Long.valueOf(C109247e.xx0().mo152617p()), 3);
            this.f317444a.mo152719v(1, 211, "", -1);
            this.f317444a.mo152692F();
        } else if (i3 == 2) {
            C112597j.m153938c("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncStatus...MM_VOIP_SYNC_STATUS_REJECT");
            C106401z zVar5 = this.f317444a.f317500x.f317568G1;
            zVar5.f317772a = 103;
            zVar5.f317784m = 4;
            zVar5.f317791t = (int) (System.currentTimeMillis() - this.f317444a.f317500x.f317568G1.f317783l);
            C115669n.INSTANCE.mo160131h(11519, Integer.valueOf(C109247e.xx0().mo152615n()), Long.valueOf(C109247e.xx0().mo152616o()), Long.valueOf(C109247e.xx0().mo152617p()), 1);
            this.f317444a.mo152692F();
            this.f317444a.mo152719v(4, 0, "", -1);
        } else if (i3 == 3) {
            this.f317444a.f317500x.f317568G1.f317784m = 5;
        } else if (i3 == 4) {
            C112597j.m153938c("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncStatus...MM_VOIP_SYNC_STATUS_SHUTDOWN");
            C106377r rVar5 = this.f317444a;
            if (rVar5.f317476a < 6) {
                rVar5.f317500x.f317568G1.f317785n = 1;
            }
            rVar5.f317500x.f317568G1.f317772a = 110;
            rVar5.mo152719v(6, 0, "", -1);
            this.f317444a.mo152692F();
        } else {
            C112597j.m153938c("MicroMsg.Voip.VoipSyncHandle", "onStatusChanged: unknow status:" + aw42.f130810e);
        }
    }
}
