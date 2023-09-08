package k43;

import a43.C103310i;
import android.os.Looper;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82956d;
import com.tencent.p014mm.plugin.voip_cs.p845ui.VoipCSMainUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import f40.C86709a0;
import fm0.C86956l0;
import java.util.Arrays;
import java.util.LinkedList;
import l43.C109254a;
import n43.C109682e;
import n43.C47156a;
import n43.C47157b;
import n43.C47158c;
import n43.C47159d;
import n43.C47160f;
import ob0.C11385n;
import ob0.C117747y;
import p567iu.C46287c;
import pe3.C89349b;
import te3.C101851uq3;
import te3.C101858vq3;
import te3.au4;
import te3.cu4;
import te3.gu4;
import te3.ju4;
import te3.mu4;
import te3.mv4;
import te3.ou4;
import te3.vt4;
import te3.wt4;
import z33.C112597j;

/* renamed from: k43.g */
public class C108888g implements C11385n {

    /* renamed from: d */
    public C108885c f326111d;

    /* renamed from: e */
    public int f326112e = 0;

    /* renamed from: f */
    public int f326113f = 0;

    /* renamed from: g */
    public int f326114g = 0;

    /* renamed from: h */
    public int f326115h = 0;

    /* renamed from: i */
    public byte[] f326116i = null;

    /* renamed from: j */
    public int f326117j = 0;

    /* renamed from: n */
    public int f326118n = 0;

    /* renamed from: o */
    public String f326119o = "";

    /* renamed from: p */
    public int f326120p = 0;

    /* renamed from: q */
    public int f326121q = 0;

    /* renamed from: r */
    public int f326122r = 999;

    /* renamed from: s */
    public MTimerHandler f326123s = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C108889a(), true);

    /* renamed from: t */
    public MTimerHandler f326124t = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C108890b(), true);

    /* renamed from: k43.g$a */
    public class C108889a implements MTimerHandler.CallBack {
        public C108889a() {
        }

        public boolean onTimerExpired() {
            Log.m105926v("MicroMsg.voipcs.VoipCSService", "voipcs repeat sync");
            C108888g.this.mo160021b();
            return true;
        }
    }

    /* renamed from: k43.g$b */
    public class C108890b implements MTimerHandler.CallBack {
        public C108890b() {
        }

        public boolean onTimerExpired() {
            Log.m105926v("MicroMsg.voipcs.VoipCSService", "voipcs heart beat");
            C108888g gVar = C108888g.this;
            gVar.getClass();
            C86709a0.m107524d().mo123455a(C82956d.CTRL_INDEX, gVar);
            C86709a0.m107524d().mo123460f(new C47157b(C108886d.wx0().f327737a.f317659o, C108886d.wx0().f327737a.f317665q));
            return true;
        }
    }

    /* renamed from: a */
    public final void mo160020a(ou4 ou4) {
        ou4 ou42 = ou4;
        if (ou42.f139374f > this.f326112e && C108886d.xx0().f326118n != 3) {
            Log.m105924i("MicroMsg.voipcs.VoipCSService", "get callee sync resp,notifySeq:" + ou42.f139374f + ",calleeMemberId:" + ou42.f139375g + ",calleeStatus:" + ou42.f139376h + ",calleeSubStatus:" + ou42.f139377i + ",recv roomId:" + ou42.f139372d + ",recv roomKey:" + ou42.f139373e);
            if (C108886d.wx0().f327737a.f317659o == 0 || C108886d.wx0().f327737a.f317659o == ou42.f139372d) {
                this.f326112e = ou42.f139374f;
                this.f326113f = ou42.f139375g;
                this.f326114g = ou42.f139376h;
                this.f326115h = ou42.f139377i;
                C108886d.vx0().f326103s = this.f326113f;
                int i = this.f326114g;
                if (i == 2) {
                    Log.m105924i("MicroMsg.voipcs.VoipCSService", "callee accept!");
                    this.f326123s.stopTimer();
                    mo160021b();
                    C108886d.wx0().f327737a.f317665q = ou42.f139373e;
                    Log.m105924i("MicroMsg.voipcs.VoipCSService", "csroomId:" + ou42.f139372d + ",roomkey:" + ou42.f139373e);
                    C89349b bVar = ou42.f139378j;
                    this.f326116i = bVar != null ? bVar.mo123703f() : null;
                    if (C108886d.wx0().f327737a.field_capInfo != null && this.f326116i != null) {
                        C108887f vx02 = C108886d.vx0();
                        vx02.getClass();
                        Log.m105918d("MicroMsg.VoipCSReportHelper", "markUserAccept");
                        if (vx02.f326062H == 0) {
                            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                            vx02.f326078X = currentTimeMillis;
                            vx02.f326062H = (long) (currentTimeMillis - vx02.f326077W);
                        }
                        C108886d.wx0().f327737a.f317674t = this.f326116i;
                        Log.m105924i("MicroMsg.voipcs.VoipCSService", "calleeCapDump is " + Arrays.toString(C108886d.wx0().f327737a.f317674t));
                        Log.m105924i("MicroMsg.voipcs.VoipCSService", "calleeCap length:" + this.f326116i.length);
                        if (C108886d.wx0().f327737a.f317674t != null && C108886d.wx0().f327737a.exchangeCabInfo(C108886d.wx0().f327737a.f317674t, C108886d.wx0().f327737a.f317674t.length) < 0) {
                            Log.m105924i("MicroMsg.voipcs.VoipCSService", "exchangeCabInfo fail!");
                        }
                        int configInfo = C108886d.wx0().f327737a.setConfigInfo(C108886d.wx0().f327737a.f317653m, C108886d.wx0().f327737a.f317659o, C108886d.wx0().f327737a.f317662p, 0, C108886d.wx0().f327737a.f317665q, C108886d.wx0().f327737a.field_peerId, 1, C108886d.wx0().f327737a.f317689y, C108886d.wx0().f327737a.f317692z, C108886d.wx0().f327737a.f317680v, C108886d.wx0().f327737a.f317683w == null ? 0 : C108886d.wx0().f327737a.f317683w.length, C108886d.wx0().f327737a.f317683w, this.f326122r, 1, C108886d.wx0().f327737a.f317629e, C108886d.wx0().f327737a.f317619a1, C108886d.wx0().f327737a.f317622b1, 255, 0, 0, 0, (byte[]) null, 0, (byte[]) null, 0, 0, 0, 0, "", "", "");
                        if (configInfo != 0) {
                            Log.m105921e("MicroMsg.voipcs.VoipCSService", "setConfig fail, ret:%d", Integer.valueOf(configInfo));
                        }
                        if (C108886d.wx0().f327737a.f317664p1 == null) {
                            C112597j.m153937b("MicroMsg.voipcs.VoipCSService", "relay conns buf null");
                        } else {
                            int AddNewRelayConns = C108886d.wx0().f327737a.AddNewRelayConns(C108886d.wx0().f327737a.f317664p1, C108886d.wx0().f327737a.f317664p1.length, 0, false);
                            if (AddNewRelayConns < 0) {
                                C112597j.m153937b("MicroMsg.voipcs.VoipCSService", "add relayconns err:" + AddNewRelayConns);
                            }
                        }
                        if (this.f326124t.stopped()) {
                            this.f326124t.startTimer(50000);
                        }
                        C108886d.vx0().f326055A = 1;
                    }
                } else if (i != 0 && i != 1 && i == 3) {
                    Log.m105924i("MicroMsg.voipcs.VoipCSService", "callee hangup!");
                    C108886d.vx0().f326081a = 5;
                    C108886d.vx0().mo160019a();
                    C108886d.vx0().f326059E = 2;
                    int i2 = this.f326115h;
                    if (i2 == 1) {
                        C108886d.vx0().f326106v = 12;
                    } else if (i2 == 3) {
                        C108886d.vx0().f326106v = 99;
                    }
                    C108885c cVar = this.f326111d;
                    if (cVar != null) {
                        ((VoipCSMainUI) cVar).mo153175J7(1);
                    }
                }
            } else {
                Log.m105924i("MicroMsg.voipcs.VoipCSService", "csRoomId:" + C108886d.wx0().f327737a.f317659o + ",recv roomId:" + ou42.f139372d + ",current and recv not equal!!");
            }
        }
    }

    /* renamed from: b */
    public void mo160021b() {
        C86709a0.m107524d().mo123455a(818, this);
        C86709a0.m107524d().mo123460f(new C47160f(C108886d.wx0().f327737a.f317659o, C108886d.wx0().f327737a.f317665q, this.f326112e));
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int AddNewRelayConns;
        String str2;
        int i3 = i;
        int i4 = i2;
        Log.m105925i("MicroMsg.voipcs.VoipCSService", "onSceneEnd :netId:%s,errType:%s,errCode:%s,errMsg:%s", Integer.valueOf(yVar.getType()), Integer.valueOf(i), Integer.valueOf(i2), str);
        String str3 = "";
        if (i3 != 0 || i4 != 0) {
            Log.m105925i("MicroMsg.voipcs.VoipCSService", "onSceneEnd  resp error!:netId:%s,errType:%s,errCode:%s,errMsg:%s", Integer.valueOf(yVar.getType()), Integer.valueOf(i), Integer.valueOf(i2), str);
            if (i3 != 0 && i3 != 4) {
                this.f326121q = -1;
                ((VoipCSMainUI) this.f326111d).mo153177d(10);
            } else if (yVar.getType() == 823) {
                if (i4 == 406) {
                    Log.m105924i("MicroMsg.voipcs.VoipCSService", "CS_INVITE_RESP_REPEAT_INVTIE 503..");
                    return;
                }
                C108886d.vx0().f326081a = 1;
                this.f326121q = 823;
                ((VoipCSMainUI) this.f326111d).mo153177d(i4);
            } else if (yVar.getType() != 880 && yVar.getType() != 818 && yVar.getType() == 106) {
                ((VoipCSMainUI) this.f326111d).mo153174I7(str3, str3);
            }
        } else if (yVar.getType() == 823) {
            gu4 gu4 = (gu4) ((C47158c) yVar).f126689e.f127056b.f127083a;
            long j = gu4.f134280d;
            long j2 = gu4.f134281e;
            LinkedList<au4> linkedList = gu4.f134282f;
            LinkedList<au4> linkedList2 = gu4.f134292s;
            this.f326117j = gu4.f134283g;
            this.f326122r = gu4.f134291r;
            Log.m105924i("MicroMsg.voipcs.VoipCSService", "tcpStartCnt : " + this.f326122r);
            C108886d.wx0().f327737a.f317692z = gu4.f134284h;
            C108886d.wx0().f327737a.f317619a1 = gu4.f134287n;
            C108886d.wx0().f327737a.f317622b1 = gu4.f134290q.mo123703f();
            C108886d.wx0().f327737a.f317689y = gu4.f134285i;
            wt4 wt4 = new wt4();
            for (au4 next : linkedList) {
                vt4 vt4 = new vt4();
                vt4.f143696f = next.f130775d;
                vt4.f143695e = next.f130776e;
                wt4.f299811e.add(vt4);
            }
            wt4.f299810d = linkedList.size();
            wt4 wt42 = new wt4();
            for (au4 next2 : linkedList2) {
                vt4 vt42 = new vt4();
                vt42.f143696f = next2.f130775d;
                vt42.f143695e = next2.f130776e;
                wt42.f299811e.add(vt42);
            }
            wt42.f299810d = linkedList2.size();
            C108886d.wx0().f327737a.f317659o = j;
            C108886d.wx0().f327737a.f317665q = j2;
            Log.m105924i("MicroMsg.voipcs.VoipCSService", "recv invite resp csRoomId : " + j + ",roomKey:" + j2);
            C108886d.wx0().f327737a.f317649k1 = gu4.f134288o;
            C108886d.wx0().f327737a.f317652l1 = gu4.f134289p;
            mv4 mv4 = new mv4();
            mv4.f332178d = 0;
            mv4.f332179e = 0;
            mv4.f332180f = 0;
            mv4.f332181g = str3;
            mv4.f332182h = str3;
            C101851uq3 uq32 = new C101851uq3();
            uq32.f299626d = 0;
            uq32.f299627e = str3;
            uq32.f299628f = str3;
            uq32.f299629g = 4;
            uq32.f299630h = 4;
            uq32.f299631i = 2;
            uq32.f299632j = wt4;
            uq32.f299633n = wt42;
            C101858vq3 vq32 = new C101858vq3();
            vq32.f299682d = 1;
            LinkedList<C101851uq3> linkedList3 = new LinkedList<>();
            vq32.f299683e = linkedList3;
            linkedList3.add(uq32);
            try {
                C108886d.wx0().f327737a.f317664p1 = vq32.toByteArray();
            } catch (Exception unused) {
                Log.m105920e("MicroMsg.voipcs.VoipCSService", "relay conn info to byte array fail..");
            }
            C108887f vx02 = C108886d.vx0();
            String str4 = this.f326119o;
            vx02.getClass();
            Log.m105918d("MicroMsg.VoipCSReportHelper", "setVoipCSBaseInfo");
            vx02.f326100p = j;
            vx02.f326101q = j2;
            vx02.f326102r = str4;
            if (this.f326123s.stopped()) {
                int i5 = this.f326117j;
                if (i5 > 0) {
                    this.f326123s.startTimer((long) (i5 * 1000));
                } else {
                    this.f326123s.startTimer(4000);
                }
            }
            C108887f vx03 = C108886d.vx0();
            vx03.getClass();
            Log.m105918d("MicroMsg.VoipCSReportHelper", "markRecvInvite");
            if (vx03.f326077W != 0) {
                long currentTimeMillis = System.currentTimeMillis() / 1000;
            }
        } else if (yVar.getType() == 818) {
            ou4 ou4 = (ou4) ((C47160f) yVar).f126693e.f127056b.f127083a;
            Log.m105924i("MicroMsg.voipcs.VoipCSService", "sync status = " + ou4.f139376h + ",notifySeq = " + ou4.f139374f);
            mo160020a(ou4);
        } else if (yVar.getType() == 880) {
            cu4 cu4 = (cu4) ((C47156a) yVar).f126685e.f127056b.f127083a;
            if (C108886d.wx0().f327737a.f317659o == cu4.f131969d && C108886d.wx0().f327737a.f317665q == cu4.f131970e) {
                Log.m105924i("MicroMsg.voipcs.VoipCSService", "hangup success!");
            }
            C86709a0.m107524d().mo123470p(C86956l0.CTRL_INDEX, this);
            C108887f vx04 = C108886d.vx0();
            C109254a aVar = C109254a.f327084b;
            if (aVar == null) {
                if (aVar == null) {
                    C109254a.f327084b = new C109254a();
                }
                C109254a.f327084b = C109254a.f327084b;
            }
            C103310i iVar = C109254a.f327084b.f327085a;
            iVar.getClass();
            Log.m105918d("MicroMsg.RingPlayer", "RingPlayer  mRingPlayerErrState:" + iVar.f304602f);
            int i6 = iVar.f304602f;
            vx04.getClass();
            vx04.f326109y = Math.abs(i6);
        } else if (yVar.getType() == 106) {
            C46287c cVar = (C46287c) yVar;
            if (cVar.mo70811l0() != null) {
                str3 = cVar.mo70811l0().f227847F;
                str2 = cVar.mo70811l0().f227858e.f141175d;
            } else {
                Log.m105924i("MicroMsg.voipcs.VoipCSService", "search Or Recommend items is null or empty !");
                str2 = str3;
            }
            ((VoipCSMainUI) this.f326111d).mo153174I7(str3, str2);
        } else if (yVar.getType() == 285) {
            Log.m105924i("MicroMsg.voipcs.VoipCSService", "Redirect response:" + i3 + " errCode:" + i4);
            if (i4 != 0) {
                Log.m105924i("MicroMsg.voipcs.VoipCSService", " redirect response with error code:" + i4);
                return;
            }
            ju4 ju4 = (ju4) ((C47159d) yVar).f126691e.f127056b.f127083a;
            Log.m105924i("MicroMsg.voipcs.VoipCSService", "roomid " + ju4.f136346d + " key " + ju4.f136347e + "relay addr cnt " + ju4.f136348f.size());
            LinkedList<au4> linkedList4 = ju4.f136348f;
            wt4 wt43 = new wt4();
            for (au4 next3 : linkedList4) {
                vt4 vt43 = new vt4();
                vt43.f143696f = next3.f130775d;
                vt43.f143695e = next3.f130776e;
                wt43.f299811e.add(vt43);
            }
            wt43.f299810d = linkedList4.size();
            C101858vq3 vq33 = new C101858vq3();
            C101851uq3 uq33 = new C101851uq3();
            uq33.f299626d = 0;
            uq33.f299627e = str3;
            uq33.f299628f = str3;
            uq33.f299629g = 4;
            uq33.f299630h = 4;
            uq33.f299631i = 2;
            uq33.f299632j = wt43;
            uq33.f299633n = new wt4();
            vq33.f299683e.add(uq33);
            vq33.f299682d = 1;
            byte[] bArr = null;
            try {
                bArr = vq33.toByteArray();
            } catch (Exception unused2) {
                Log.m105920e("MicroMsg.voipcs.VoipCSService", "conn info to byte array fail..");
            }
            if (bArr != null && (AddNewRelayConns = C108886d.wx0().f327737a.AddNewRelayConns(bArr, bArr.length, 1, false)) != 0) {
                C112597j.m153937b("MicroMsg.voipcs.VoipCSService", "redirect relay conns fail ret:" + AddNewRelayConns);
            }
        } else if (yVar.getType() == 312) {
            mu4 mu4 = (mu4) ((C109682e) yVar).f328323e.f127056b.f127083a;
            if (mu4.f138219d == C108886d.wx0().f327737a.f317659o && mu4.f138220e == C108886d.wx0().f327737a.f317665q) {
                Log.m105924i("MicroMsg.voipcs.VoipCSService", "report data success!");
            }
        }
    }
}
