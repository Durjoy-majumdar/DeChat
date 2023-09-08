package s33;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.voip.model.C106359m0;
import com.tencent.p014mm.plugin.voip.model.C106377r;
import com.tencent.p014mm.plugin.voip.model.C106401z;
import com.tencent.p014mm.plugin.voip.model.v2protocal;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import eb0.C75592q0;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import l33.C109247e;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import q62.C101048b;
import te3.C101864x23;
import te3.C110963ht1;
import te3.C51018qv3;
import te3.C51163rv3;
import te3.bv4;
import te3.cv4;
import te3.pv4;
import z33.C112597j;

/* renamed from: s33.g */
public class C110730g extends C63696n<bv4, cv4> {

    /* renamed from: s33.g$a */
    public class C110731a implements C11385n {
        public C110731a() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            C89349b bVar;
            C106359m0.C106366g gVar;
            int i3 = i;
            int i4 = i2;
            C112597j.m153938c("MicroMsg.NetSceneVoipInvite", "Invite response:" + i3 + " errCode:" + i4 + " status:" + C110730g.this.f180559g.f317476a);
            cv4 cv4 = (cv4) C110730g.this.mo88543m1();
            C106401z zVar = C110730g.this.f180559g.f317500x.f317568G1;
            zVar.getClass();
            zVar.f317753H = System.currentTimeMillis();
            C110730g.this.f180559g.f317454E = false;
            bv4 bv4 = (bv4) ((C110730g) yVar).f180556d.f127055a.f127080a;
            boolean z = C109247e.xx0().f317332a.f317402g == 2;
            boolean z2 = C109247e.xx0().f317332a.f317402g == 1;
            if (i4 != 238) {
                if (z) {
                    C109247e.xx0().mo152605d(cv4.f331925d, cv4.f331928g, bv4.f331904p);
                    C112597j.m153937b("MicroMsg.NetSceneVoipInvite", " steve:[simucall] new simul call invite response  return!, DO NOT use inviteresp info,  I'm callee!!");
                    C106377r rVar = C110730g.this.f180559g;
                    rVar.f317502z.mo152477l0(rVar.f317500x.f317569H);
                    C112597j.m153937b("MicroMsg.NetSceneVoipInvite", " danial:[simucall] new simul call invite response return! auto accept, I'm callee");
                    return;
                } else if (z2) {
                    C106359m0 m0Var = C109247e.xx0().f317332a;
                    if ((m0Var.f317402g == 1) && (gVar = m0Var.f317405j) != null) {
                        m0Var.mo152658d(gVar.f317430d, gVar.f317431e, 5, (byte[]) null, (byte[]) null, gVar.f317427a);
                    }
                    C112597j.m153937b("MicroMsg.NetSceneVoipInvite", " danial:[simucall] new simul call invite response  return!, send ack,  I'm caller!!");
                }
            }
            if (C110730g.this.f180559g.f317476a != 2) {
                if (i4 != 238) {
                    C112597j.m153937b("MicroMsg.NetSceneVoipInvite", " invite response with error status:" + C110730g.this.f180559g.f317476a + " should:" + 2);
                    return;
                } else if (z) {
                    C109247e.xx0().f317333b.mo152465d0(true, bv4.f331904p == 0);
                    C112597j.m153937b("MicroMsg.NetSceneVoipInvite", " danial:[simucall] resetStateMachine, isNewSimulCallee true");
                }
            }
            v2protocal v2protocal = C110730g.this.f180559g.f317500x;
            v2protocal.f317567G0 = cv4.f331933o;
            v2protocal.f317570H0 = cv4.f331934p;
            v2protocal.f317573I0 = cv4.f331935q;
            v2protocal.f317576J0 = cv4.f331936r;
            v2protocal.f317582L0 = cv4.f331939u;
            v2protocal.f317579K0 = cv4.f331914B;
            v2protocal.f317655m1 = cv4.f331915C;
            v2protocal.f317551B = cv4.f331918F;
            v2protocal.f317554C = cv4.f331923K;
            v2protocal.f317588N0 = cv4.f331920H;
            v2protocal.f317548A = cv4.f331940v;
            v2protocal.f317566G = cv4.f331919G;
            C51018qv3 qv32 = cv4.f331924L;
            if (qv32 == null || (bVar = qv32.f140574f) == null) {
                C112597j.m153937b("MicroMsg.NetSceneVoipInvite", "voip general strategy is null");
            } else {
                v2protocal.f317560E = bVar.mo123703f();
                C110963ht1 ht12 = null;
                try {
                    ht12 = (C110963ht1) new C110963ht1().parseFrom(C110730g.this.f180559g.f317500x.f317560E);
                } catch (IOException unused) {
                    C112597j.m153938c("MicroMsg.NetSceneVoipInvite", "parse Voip general strategy fail");
                }
                if (ht12 != null) {
                    int i5 = ht12.f332029f;
                    C112597j.m153936a("MicroMsg.NetSceneVoipInvite", "steve:nSvrBaseBRTuneRatio1:" + i5);
                    C110730g.this.f180559g.f317500x.f317585M0 = i5;
                }
            }
            C112597j.m153938c("MicroMsg.NetSceneVoipInvite", "setSvrConfig onInviteResp: audioTsdfBeyond3G = " + C110730g.this.f180559g.f317500x.f317567G0 + ",audioTsdEdge = " + C110730g.this.f180559g.f317500x.f317570H0 + ",passthroughQosAlgorithm = " + C110730g.this.f180559g.f317500x.f317573I0 + ",fastPlayRepair = " + C110730g.this.f180559g.f317500x.f317576J0 + ", audioDtx = " + C110730g.this.f180559g.f317500x.f317582L0 + ",switchtcpPktCnt = " + C110730g.this.f180559g.f317500x.f317548A + ",SvrCfgListV = " + C110730g.this.f180559g.f317500x.f317579K0 + ", setMaxBRForRelay=" + C110730g.this.f180559g.f317500x.f317588N0 + ",EnableDataAccept = " + C110730g.this.f180559g.f317500x.f317655m1 + ",WifiScanInterval = " + C110730g.this.f180559g.f317500x.f317566G + ",BaseBRTuneRatio=" + C110730g.this.f180559g.f317500x.f317585M0);
            C110730g.this.f180559g.f317500x.f317591O0 = cv4.f331913A;
            StringBuilder sb = new StringBuilder();
            sb.append("inviteResp AudioAecMode5 = ");
            sb.append(C110730g.this.f180559g.f317500x.f317591O0);
            C112597j.m153938c("MicroMsg.NetSceneVoipInvite", sb.toString());
            int e = C112597j.m153940e(MMApplicationContext.getContext());
            if (i3 == 0) {
                C106377r rVar2 = C110730g.this.f180559g;
                v2protocal v2protocal2 = rVar2.f317500x;
                v2protocal2.f317656n = cv4.f331925d;
                v2protocal2.f317665q = cv4.f331928g;
                v2protocal2.f317662p = cv4.f331929h;
                rVar2.mo152688B(4);
                C115669n.INSTANCE.mo160140o(11518, true, true, Integer.valueOf(C109247e.xx0().mo152615n()), Long.valueOf(C109247e.xx0().mo152616o()), Long.valueOf(C109247e.xx0().mo152617p()), 1, Integer.valueOf(e));
                int i6 = cv4.f331937s;
                if (i6 > 0) {
                    C110730g.this.f180559g.f317469T.startTimer((long) (i6 * 1000));
                }
                C109247e.xx0().f317332a.f317418w.startTimer(1000);
                C110730g.this.f180559g.mo152723z();
                C106401z zVar2 = C110730g.this.f180559g.f317500x.f317568G1;
                zVar2.getClass();
                zVar2.mo152874f((long) ((int) (System.currentTimeMillis() - zVar2.f317752G)));
                C112597j.m153938c("MicroMsg.NetSceneVoipInvite", "invite ok, roomid =" + C110730g.this.f180559g.f317500x.f317656n + ",memberid = " + C110730g.this.f180559g.f317500x.f317662p + "VoipSyncInterval = " + cv4.f331937s);
                C110730g.this.f180559g.f317502z.mo150001x0();
                if (C109247e.xx0().f317332a != null) {
                    C109247e.xx0().f317332a.getClass();
                }
                C112597j.m153945j(C109247e.xx0().mo152615n(), C109247e.xx0().mo152616o(), 0, 1);
            } else if (i3 == 4) {
                C112597j.m153938c("MicroMsg.NetSceneVoipInvite", "RoomId in InviteResp: " + cv4.f331925d + "," + cv4.f331928g);
                if (i4 == 211) {
                    C106401z zVar3 = C110730g.this.f180559g.f317500x.f317568G1;
                    zVar3.f317772a = 12;
                    zVar3.f317784m = 12;
                    C115669n.INSTANCE.mo160140o(11518, true, true, Integer.valueOf(C109247e.xx0().mo152615n()), Long.valueOf(C109247e.xx0().mo152616o()), Long.valueOf(C109247e.xx0().mo152617p()), 8, Integer.valueOf(e));
                } else if (i4 != 241) {
                    switch (i4) {
                        case 233:
                            C106401z zVar4 = C110730g.this.f180559g.f317500x.f317568G1;
                            zVar4.f317772a = 12;
                            zVar4.f317784m = 1;
                            C115669n.INSTANCE.mo160140o(11518, true, true, Integer.valueOf(C109247e.xx0().mo152615n()), Long.valueOf(C109247e.xx0().mo152616o()), Long.valueOf(C109247e.xx0().mo152617p()), 3, Integer.valueOf(e));
                            break;
                        case 234:
                            C106401z zVar5 = C110730g.this.f180559g.f317500x.f317568G1;
                            zVar5.f317772a = 13;
                            zVar5.f317784m = 11;
                            C115669n.INSTANCE.mo160140o(11518, true, true, Integer.valueOf(C109247e.xx0().mo152615n()), Long.valueOf(C109247e.xx0().mo152616o()), Long.valueOf(C109247e.xx0().mo152617p()), 4, Integer.valueOf(e));
                            break;
                        case 235:
                            C106401z zVar6 = C110730g.this.f180559g.f317500x.f317568G1;
                            zVar6.f317772a = 13;
                            zVar6.f317784m = 2;
                            C115669n.INSTANCE.mo160140o(11518, true, true, Integer.valueOf(C109247e.xx0().mo152615n()), Long.valueOf(C109247e.xx0().mo152616o()), Long.valueOf(C109247e.xx0().mo152617p()), 2, Integer.valueOf(e));
                            break;
                        case 236:
                            C106401z zVar7 = C110730g.this.f180559g.f317500x.f317568G1;
                            zVar7.f317772a = 12;
                            zVar7.f317784m = 10;
                            C115669n.INSTANCE.mo160140o(11518, true, true, Integer.valueOf(C109247e.xx0().mo152615n()), Long.valueOf(C109247e.xx0().mo152616o()), Long.valueOf(C109247e.xx0().mo152617p()), 7, Integer.valueOf(e));
                            break;
                        case 237:
                            C106401z zVar8 = C110730g.this.f180559g.f317500x.f317568G1;
                            zVar8.f317772a = 13;
                            zVar8.f317784m = 9;
                            C115669n.INSTANCE.mo160140o(11518, true, true, Integer.valueOf(C109247e.xx0().mo152615n()), Long.valueOf(C109247e.xx0().mo152616o()), Long.valueOf(C109247e.xx0().mo152617p()), 2, Integer.valueOf(e));
                            break;
                        case WXWebReporter.WXXWEB_PRE_DOWN_ARM32_SUC:
                            C106377r rVar3 = C110730g.this.f180559g;
                            rVar3.f317483g = true;
                            rVar3.f317485i = false;
                            rVar3.f317484h = false;
                            v2protocal v2protocal3 = rVar3.f317500x;
                            v2protocal3.f317564F0 = 0;
                            v2protocal3.f317561E0 = 0;
                            rVar3.mo152688B(3);
                            v2protocal v2protocal4 = C110730g.this.f180559g.f317500x;
                            v2protocal4.f317656n = cv4.f331925d;
                            v2protocal4.f317665q = cv4.f331928g;
                            v2protocal4.f317662p = cv4.f331929h;
                            v2protocal4.f317571H1 |= 1;
                            C112597j.m153938c("MicroMsg.NetSceneVoipInvite", "steve:[simucall]: use old svr-based simulcall! iSimulCallStatus: " + C110730g.this.f180559g.f317500x.f317571H1);
                            C110730g.this.f180559g.f317502z.mo152481n0(bv4.f331904p);
                            return;
                        default:
                            C106401z zVar9 = C110730g.this.f180559g.f317500x.f317568G1;
                            zVar9.f317772a = 12;
                            zVar9.f317784m = 99;
                            C115669n.INSTANCE.mo160140o(11518, true, true, Integer.valueOf(C109247e.xx0().mo152615n()), Long.valueOf(C109247e.xx0().mo152616o()), Long.valueOf(C109247e.xx0().mo152617p()), 5, Integer.valueOf(e));
                            break;
                    }
                } else {
                    Log.m105924i("MicroMsg.NetSceneVoipInvite", "invite fail cuz server unavailable! reInvtieInterval is : " + cv4.f331917E + " seconds!");
                    C109247e.xx0().f317342k = System.currentTimeMillis();
                    if (cv4.f331917E != 0) {
                        C109247e.xx0().f317343l = (long) (cv4.f331917E * 1000);
                    } else {
                        C109247e.xx0().f317343l = 30000;
                    }
                }
                C106377r rVar4 = C110730g.this.f180559g;
                rVar4.f317500x.f317568G1.f317773b = i4;
                rVar4.mo152719v(1, i4, str, -1);
            } else {
                C106401z zVar10 = C110730g.this.f180559g.f317500x.f317568G1;
                zVar10.f317772a = 12;
                zVar10.f317773b = i4;
                zVar10.f317784m = 99;
                zVar10.f317790s = 6;
                C115669n.INSTANCE.mo160140o(11518, true, true, Integer.valueOf(C109247e.xx0().mo152615n()), Long.valueOf(C109247e.xx0().mo152616o()), Long.valueOf(C109247e.xx0().mo152617p()), 9, Integer.valueOf(e));
                C110730g.this.f180559g.mo152719v(1, -9004, "", 3);
            }
        }
    }

    public C110730g(List<String> list, byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, LinkedList<C101864x23> linkedList) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new bv4();
        bVar.f127067b = new cv4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/voipinvite";
        bVar.f127069d = 170;
        bVar.f127070e = 63;
        bVar.f127071f = 1000000063;
        C47350c a = bVar.mo72403a();
        this.f180556d = a;
        int i5 = 1;
        a.setIsUserCmd(true);
        bv4 bv4 = (bv4) this.f180556d.f127055a.f127080a;
        LinkedList<C51163rv3> linkedList2 = new LinkedList<>();
        for (int i6 = 0; i6 < list.size(); i6++) {
            C51163rv3 rv32 = new C51163rv3();
            rv32.f141175d = list.get(i6);
            rv32.f141176e = true;
            linkedList2.add(rv32);
        }
        bv4.f331895d = C75592q0.m90789s();
        bv4.f331897f = linkedList2;
        bv4.f331896e = linkedList2.size();
        bv4.f331900i = i;
        bv4.f331901j = i2;
        bv4.f331904p = i3;
        bv4.f331907s = i4;
        pv4 pv4 = new pv4();
        pv4.f184900d = 2;
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(bArr);
        pv4.f184901e = qv32;
        bv4.f331898g = pv4;
        pv4 pv42 = new pv4();
        pv42.f184900d = 3;
        C51018qv3 qv33 = new C51018qv3();
        qv33.mo73350k(bArr2);
        pv42.f184901e = qv33;
        bv4.f331899h = pv42;
        bv4.f331905q = System.currentTimeMillis();
        bv4.f331911w = this.f180559g.f317500x.getIpStack();
        int Os = ((C101048b) C86312j.m106911c(C101048b.class)).mo60590Os(2);
        C112597j.m153938c("MicroMsg.NetSceneVoipInvite", "simType:" + Os + " ipstack:" + bv4.f331911w);
        if (Os == 0) {
            bv4.f331908t = 0;
        } else if (Os == 3) {
            bv4.f331908t = 3;
        } else {
            bv4.f331908t = Os != 1 ? 2 : i5;
        }
        bv4.f331909u = linkedList.size();
        bv4.f331910v = linkedList;
    }

    public int getType() {
        return 170;
    }

    /* renamed from: l1 */
    public C11385n mo72979l1() {
        return new C110731a();
    }
}
