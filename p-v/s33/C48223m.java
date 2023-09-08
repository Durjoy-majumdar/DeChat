package s33;

import com.tencent.p014mm.plugin.voip.model.C106373o0;
import com.tencent.p014mm.plugin.voip.model.C106377r;
import com.tencent.p014mm.plugin.voip.model.C106391r0;
import com.tencent.p014mm.plugin.voip.model.C106401z;
import com.tencent.p014mm.plugin.voip.model.C96586q0;
import com.tencent.p014mm.plugin.voip.model.v2protocal;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.util.WXWebReporter;
import eb0.C75592q0;
import f40.C86709a0;
import java.io.IOException;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51018qv3;
import te3.aw4;
import te3.bw4;
import te3.cw4;
import te3.iv4;
import te3.pv4;
import te3.ru4;
import te3.su4;
import z33.C112597j;

/* renamed from: s33.m */
public class C48223m extends C63696n<bw4, cw4> {

    /* renamed from: s33.m$a */
    public class C48224a implements C11385n {
        public C48224a() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            iv4 iv4;
            int i3 = i;
            int i4 = i2;
            C112597j.m153938c("MicroMsg.NetSceneVoipSync", "onSceneEnd type:" + yVar.getType() + " errType:" + i3 + " errCode:" + i4);
            C106401z zVar = C48223m.this.f180559g.f317500x.f317568G1;
            zVar.getClass();
            zVar.mo152874f((long) ((int) (System.currentTimeMillis() - zVar.f317759N)));
            if (i3 != 0) {
                C112597j.m153937b("MicroMsg.NetSceneVoipSync", "VoipSync Failed, type:" + yVar.getType() + " errType:" + i3 + " errCode:" + i4);
                if (i3 == 4) {
                    try {
                        cw4 cw4 = (cw4) C48223m.this.mo88543m1();
                        if (cw4.f131996d != C48223m.this.f180559g.f317500x.f317656n) {
                            C112597j.m153937b("MicroMsg.NetSceneVoipSync", "syncOnSceneEnd: recv roomId %d " + cw4.f131996d + " != current roomid %d " + C48223m.this.f180559g.f317500x.f317656n);
                            return;
                        }
                    } catch (Exception unused) {
                    }
                    C48223m.this.f180559g.f317500x.f317568G1.f317790s = 3;
                } else {
                    C48223m.this.f180559g.f317500x.f317568G1.f317790s = 6;
                }
                C106377r rVar = C48223m.this.f180559g;
                C106401z zVar2 = rVar.f317500x.f317568G1;
                zVar2.f317772a = 11;
                zVar2.f317774c = i4;
                zVar2.f317773b = i4;
                if (i3 == 1) {
                    zVar2.f317784m = 8;
                } else {
                    zVar2.f317784m = 99;
                }
                rVar.mo152719v(1, -9004, "", 3);
                return;
            }
            C106373o0 o0Var = C48223m.this.f180559g.f317451B;
            o0Var.getClass();
            Log.m105924i("MicroMsg.Voip.VoipSyncHandle", "____VoipSyncResp");
            o0Var.f317444a.f317455F = false;
            C48223m mVar = (C48223m) yVar;
            cw4 cw42 = (cw4) mVar.mo88543m1();
            C106377r rVar2 = o0Var.f317444a;
            byte[] bArr = rVar2.f317452C;
            if (bArr != null) {
                rVar2.f317500x.parseSyncKeyBuff(bArr, bArr.length);
                v2protocal v2protocal = o0Var.f317444a.f317500x;
                int i5 = v2protocal.field_statusSyncKey;
                int i6 = v2protocal.field_relayDataSyncKey;
                int i7 = v2protocal.field_connectingStatusKey;
                v2protocal.parseSyncKeyBuff(cw42.f131997e.f140574f.mo123703f(), cw42.f131997e.f140572d);
                v2protocal v2protocal2 = o0Var.f317444a.f317500x;
                int i8 = v2protocal2.field_statusSyncKey;
                int i9 = v2protocal2.field_relayDataSyncKey;
                int i15 = v2protocal2.field_connectingStatusKey;
                Log.m105924i("MicroMsg.Voip.VoipSyncHandle", "VoipSyncResp: oldStatusSyncKey:" + i5 + " oldRelayDataSyncKey:" + i6 + " oldConnectingStatusSyncKey:" + i7);
                Log.m105924i("MicroMsg.Voip.VoipSyncHandle", "VoipSyncResp: newStatusSyncKey:" + i8 + " newRelayDataSyncKey:" + i9 + " newConnectingStatusSyncKey:" + i15);
                o0Var.f317444a.f317452C = cw42.f131997e.f140574f.mo123703f();
                StringBuilder sb = new StringBuilder();
                sb.append("voipSync response: continueflag=");
                sb.append(cw42.f131999g);
                Log.m105924i("MicroMsg.Voip.VoipSyncHandle", sb.toString());
                LinkedList<ru4> linkedList = cw42.f131998f.f141767e;
                if (!(linkedList == null || linkedList.size() == 0)) {
                    Log.m105924i("MicroMsg.Voip.VoipSyncHandle", " syncOnSceneEnd cmdlist size" + linkedList.size());
                    int i16 = ((bw4) mVar.f180556d.f127055a.f127080a).f131360i;
                    Log.m105924i("MicroMsg.Voip.VoipSyncHandle", " syncOnSceneEnd cmdlist size:" + linkedList.size() + ",selector = " + i16);
                    int i17 = 0;
                    while (i17 < linkedList.size()) {
                        ru4 ru4 = linkedList.get(i17);
                        int i18 = ru4.f141157d;
                        Log.m105924i("MicroMsg.Voip.VoipSyncHandle", "__parse sync resp, item cmdid:" + i18);
                        if (i18 == 1) {
                            if (i8 > i5) {
                                if (o0Var.f317444a.f317500x.f317656n == 0) {
                                    C112597j.m153937b("MicroMsg.Voip.VoipSyncHandle", "voipSyncStatus ignored , roomid = 0");
                                } else {
                                    try {
                                        aw4 aw4 = (aw4) new aw4().parseFrom(ru4.f141158e.f140574f.mo123703f());
                                        C112597j.m153938c("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncStatus in...from user=" + ru4.f141159f + ",itemStatus =  " + aw4.f130810e);
                                        o0Var.mo152684c(aw4, 3);
                                    } catch (IOException e) {
                                        Log.printErrStackTrace("MicroMsg.Voip.VoipSyncHandle", e, "", new Object[0]);
                                    }
                                }
                            }
                        } else if (i18 != 2) {
                            if (i18 == 3 && i15 > i7) {
                                if (o0Var.f317444a.f317500x.f317656n == 0) {
                                    Log.m105920e("MicroMsg.Voip.VoipSyncHandle", "voipSync(ClientStatus) ignored , roomid = 0");
                                } else {
                                    try {
                                        C51018qv3 qv32 = new C51018qv3();
                                        qv32.mo73348f(ru4.f141158e.f140574f.mo123703f());
                                        if (ru4.f141159f.equals(C75592q0.m90789s())) {
                                            C112597j.m153937b("MicroMsg.Voip.VoipSyncHandle", "svr response: local connecting status changed.");
                                        } else {
                                            o0Var.mo152683b(qv32);
                                        }
                                    } catch (IOException e2) {
                                        Log.printErrStackTrace("MicroMsg.Voip.VoipSyncHandle", e2, "", new Object[0]);
                                    }
                                }
                            }
                            i17++;
                        } else if (i9 > i6) {
                            if (o0Var.f317444a.f317500x.f317656n == 0) {
                                C112597j.m153937b("MicroMsg.Voip.VoipSyncHandle", "RelayData ignored , roomid = 0");
                            } else {
                                try {
                                    pv4 pv4 = (pv4) new pv4().parseFrom(ru4.f141158e.f140574f.mo123703f());
                                    C112597j.m153938c("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncRelayData ...relayType = " + pv4.f184900d + ",from user = " + ru4.f141159f);
                                    int i19 = pv4.f184900d;
                                    if (i19 == 5) {
                                        C86709a0.m107525e().postToWorker(new C106391r0(o0Var, pv4));
                                    } else if (i19 == 3) {
                                        o0Var.f317444a.mo152697K(pv4.f184901e.f140574f.mo123703f());
                                        C51018qv3 qv33 = pv4.f184901e;
                                        if (!(qv33 == null || qv33.f140574f == null)) {
                                            o0Var.f317445b.f332095e = pv4;
                                        }
                                    } else if (i19 == 2) {
                                        o0Var.f317444a.mo152698L(pv4.f184901e.f140574f.mo123703f());
                                        C51018qv3 qv34 = pv4.f184901e;
                                        if (!(qv34 == null || qv34.f140574f == null)) {
                                            o0Var.f317445b.f332094d = pv4;
                                        }
                                    } else if (i19 == 1) {
                                        C106377r rVar3 = o0Var.f317444a;
                                        rVar3.f317500x.f317677u = pv4.f184901e.f140574f.mo123703f();
                                        rVar3.mo152712o();
                                    } else if (i19 == 6) {
                                        try {
                                            iv4 = (iv4) new iv4().parseFrom(pv4.f184901e.f140574f.mo123703f());
                                        } catch (IOException e3) {
                                            Log.printErrStackTrace("MicroMsg.Voip.VoipSyncHandle", e3, "", new Object[0]);
                                            iv4 = null;
                                        }
                                        if (iv4 != null) {
                                            C106373o0 o0Var2 = o0Var.f317444a.f317451B;
                                            o0Var2.getClass();
                                            C86709a0.m107525e().postToWorker(new C96586q0(o0Var2, iv4, false));
                                        }
                                    }
                                } catch (IOException e4) {
                                    Log.printErrStackTrace("MicroMsg.Voip.VoipSyncHandle", e4, "", new Object[0]);
                                }
                            }
                        }
                        i17++;
                    }
                }
                Log.m105924i("MicroMsg.Voip.VoipSyncHandle", "__parse sync resp end");
                su4 su4 = o0Var.f317446c;
                if ((su4 != null && su4.f141766d > 0) || o0Var.f317447d > 0) {
                    o0Var.mo152682a((su4) null, false, 7);
                }
            }
        }
    }

    public C48223m(int i, su4 su4, byte[] bArr, long j, int i2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new bw4();
        bVar.f127067b = new cw4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/voipsync";
        bVar.f127069d = WXWebReporter.WXWEB_IDKEY_X5WEBVIEW_ONSHOWCUSTOMVIEW_SPECIAL_NATIVE;
        bVar.f127070e = 62;
        bVar.f127071f = 1000000062;
        C47350c a = bVar.mo72403a();
        this.f180556d = a;
        bw4 bw4 = (bw4) a.f127055a.f127080a;
        bw4.f131356e = i;
        bw4.f131358g = su4;
        bw4.f131359h = j;
        bw4.f131355d = C75592q0.m90789s();
        bw4.f131360i = i2;
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(bArr);
        bw4.f131357f = qv32;
        bw4.f131361j = System.currentTimeMillis();
        Log.m105924i("MicroMsg.NetSceneVoipSync", "sync timestamp: " + bw4.f131361j);
    }

    public int getType() {
        return WXWebReporter.WXWEB_IDKEY_X5WEBVIEW_ONSHOWCUSTOMVIEW_SPECIAL_NATIVE;
    }

    /* renamed from: l1 */
    public C11385n mo72979l1() {
        return new C48224a();
    }
}
