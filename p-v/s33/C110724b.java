package s33;

import com.tencent.p014mm.plugin.voip.model.C106357m;
import com.tencent.p014mm.plugin.voip.model.C106377r;
import com.tencent.p014mm.plugin.voip.model.C106401z;
import com.tencent.p014mm.plugin.voip.model.v2protocal;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import di3.C86312j;
import f40.C86709a0;
import java.io.IOException;
import java.util.LinkedList;
import l33.C109247e;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import q62.C101048b;
import te3.C101763c50;
import te3.C101851uq3;
import te3.C101858vq3;
import te3.C101864x23;
import te3.C110956b50;
import te3.C110963ht1;
import te3.C49798i42;
import te3.C51018qv3;
import te3.jv4;
import te3.pv4;
import te3.xt4;
import te3.yt4;
import z33.C112597j;

/* renamed from: s33.b */
public class C110724b extends C63696n<xt4, yt4> {

    /* renamed from: h */
    public String f331186h = "MicroMsg.NetSceneVoipAnswer";

    /* renamed from: s33.b$a */
    public class C110725a implements C11385n {

        /* renamed from: s33.b$a$a */
        public class C110726a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ jv4 f331188d;

            /* renamed from: s33.b$a$a$a */
            public class C110727a implements Runnable {
                public C110727a() {
                }

                public void run() {
                    C110724b.this.f180559g.mo152695I();
                }
            }

            public C110726a(jv4 jv4) {
                this.f331188d = jv4;
            }

            public void run() {
                C89349b bVar;
                C51018qv3 qv32;
                C89349b bVar2;
                C89349b bVar3;
                C51018qv3 qv33;
                C109247e.xx0().f317332a.f317418w.startTimer(1000);
                C112597j.m153938c(C110724b.this.f331186h, "steve:doublelink timer started!");
                C101858vq3 vq32 = this.f331188d.f332091M;
                if (vq32 == null || vq32.f299682d == 0) {
                    C101851uq3 uq32 = new C101851uq3();
                    uq32.f299626d = 0;
                    uq32.f299627e = "";
                    uq32.f299628f = "";
                    uq32.f299629g = C110724b.this.f180559g.f317500x.f317629e;
                    uq32.f299630h = 4;
                    uq32.f299631i = 2;
                    jv4 jv4 = this.f331188d;
                    uq32.f299632j = jv4.f332097g;
                    uq32.f299633n = jv4.f332105r;
                    jv4.f332091M = new C101858vq3();
                    C101858vq3 vq33 = this.f331188d.f332091M;
                    vq33.f299682d = 1;
                    vq33.f299683e = new LinkedList<>();
                    this.f331188d.f332091M.f299683e.add(uq32);
                }
                C101763c50 c502 = this.f331188d.f332092N;
                if (c502 == null || c502.f297999d == 0) {
                    C110956b50 b502 = new C110956b50();
                    b502.f331878d = 1;
                    b502.f331879e = "";
                    b502.f331880f = "";
                    b502.f331881g = C110724b.this.f180559g.f317500x.f317629e;
                    b502.f331882h = 4;
                    b502.f331883i = 2;
                    jv4 jv42 = this.f331188d;
                    b502.f331884j = jv42.f332098h;
                    b502.f331885n = jv42.f332089K;
                    b502.f331886o = jv42.f332090L;
                    jv42.f332092N = new C101763c50();
                    C101763c50 c503 = this.f331188d.f332092N;
                    c503.f297999d = 1;
                    c503.f298000e = new LinkedList<>();
                    this.f331188d.f332092N.f298000e.add(b502);
                }
                String str = C110724b.this.f331186h;
                C112597j.m153938c(str, "relay conn cnt: " + this.f331188d.f332091M.f299682d);
                try {
                    C110724b.this.f180559g.f317500x.f317664p1 = this.f331188d.f332091M.toByteArray();
                } catch (Exception unused) {
                    Log.m105920e(C110724b.this.f331186h, "relay conn info to byte array fail..");
                }
                try {
                    C110724b.this.f180559g.f317500x.f317667q1 = this.f331188d.f332092N.toByteArray();
                } catch (Exception unused2) {
                    Log.m105920e(C110724b.this.f331186h, "direct conn info to byte array fail..");
                }
                try {
                    C49798i42 i422 = this.f331188d.f332093P;
                    if (i422.f135102d > 0) {
                        C110724b.this.f180559g.f317500x.f317670r1 = i422.toByteArray();
                    }
                } catch (Exception unused3) {
                    Log.m105920e(C110724b.this.f331186h, "nic query info to byte array fail..");
                }
                C89349b bVar4 = this.f331188d.f332094d.f184901e.f140574f;
                if (bVar4 != null) {
                    C110724b.this.f180559g.mo152698L(bVar4.mo123703f());
                } else {
                    Log.m105920e(C110724b.this.f331186h, "multiRelayData.PeerId.Buffer.getBuffer() is null");
                }
                jv4 jv43 = this.f331188d;
                C51018qv3 qv34 = jv43.f332103p;
                if (!(qv34 == null || (bVar3 = qv34.f140574f) == null || (qv33 = jv43.f332081C) == null || qv33.f140574f == null)) {
                    C106377r rVar = C110724b.this.f180559g;
                    byte[] f = bVar3.mo123703f();
                    jv4 jv44 = this.f331188d;
                    int i = jv44.f332102o;
                    int i2 = jv44.f332111x;
                    byte[] f2 = jv44.f332081C.f140574f.mo123703f();
                    v2protocal v2protocal = rVar.f317500x;
                    v2protocal.f317680v = i;
                    v2protocal.f317683w = f;
                    v2protocal.f317619a1 = i2;
                    v2protocal.f317622b1 = f2;
                }
                C106377r rVar2 = C110724b.this.f180559g;
                jv4 jv45 = this.f331188d;
                int i3 = jv45.f332106s;
                int i4 = jv45.f332107t;
                int i5 = jv45.f332108u;
                int i6 = jv45.f332109v;
                int i7 = jv45.f332110w;
                v2protocal v2protocal2 = rVar2.f317500x;
                v2protocal2.f317597Q0 = i3;
                v2protocal2.f317600R0 = i4;
                v2protocal2.f317602S0 = i5;
                v2protocal2.f317604T0 = i6;
                v2protocal2.f317606U0 = i7;
                v2protocal2.f317608V0 = jv45.f332080B;
                C51018qv3 qv35 = jv45.f332113z;
                if (!(qv35 == null || (qv32 = jv45.f332079A) == null || (bVar2 = qv35.f140574f) == null || qv32.f140574f == null)) {
                    int i8 = jv45.f332112y;
                    byte[] f3 = bVar2.mo123703f();
                    byte[] f4 = this.f331188d.f332079A.f140574f.mo123703f();
                    v2protocal v2protocal3 = rVar2.f317500x;
                    v2protocal3.f317640h1 = i8;
                    v2protocal3.f317643i1 = f3;
                    v2protocal3.f317646j1 = f4;
                }
                C89349b bVar5 = this.f331188d.f332095e.f184901e.f140574f;
                if (bVar5 != null) {
                    C110724b.this.f180559g.mo152697K(bVar5.mo123703f());
                } else {
                    Log.m105920e(C110724b.this.f331186h, "multiRelayData.CapInfo.Buffer.getBuffer() is null");
                }
                C106377r rVar3 = C110724b.this.f180559g;
                jv4 jv46 = this.f331188d;
                int i9 = jv46.f332083E;
                v2protocal v2protocal4 = rVar3.f317500x;
                v2protocal4.f317625c1 = i9;
                int i15 = jv46.f332100j;
                int i16 = jv46.f332101n;
                v2protocal4.f317689y = i15;
                v2protocal4.f317692z = i16;
                v2protocal4.f317628d1 = jv46.f332084F;
                C51018qv3 qv36 = jv46.f332086H;
                if (!(qv36 == null || (bVar = qv36.f140574f) == null)) {
                    v2protocal4.f317557D = bVar.mo123703f();
                }
                C110724b bVar6 = C110724b.this;
                C106377r rVar4 = bVar6.f180559g;
                if (rVar4.f317485i) {
                    rVar4.f317485i = false;
                    if (rVar4.f317480d) {
                        C112597j.m153938c(bVar6.f331186h, "channel pre-connect already success, start talk");
                        MMHandlerThread.postToMainThread(new C110727a());
                    } else if (rVar4.f317484h) {
                        C112597j.m153938c(bVar6.f331186h, "channel pre-connect already failed");
                        C110724b.this.f180559g.mo152719v(1, -9000, "", -1);
                        return;
                    } else {
                        C112597j.m153938c(bVar6.f331186h, "channel pre-connect still connecting...");
                    }
                } else {
                    Log.m105924i(bVar6.f331186h, "isPreConnect is false");
                }
                C110724b.this.f180559g.mo152692F();
                C110724b.this.f180559g.mo152694H();
            }
        }

        public C110725a() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            C89349b bVar;
            int i3;
            yt4 yt4;
            String str2 = C110724b.this.f331186h;
            C112597j.m153938c(str2, "Anwser response:" + i + " errCode:" + i2 + " status:" + C110724b.this.f180559g.f317476a);
            C110724b bVar2 = C110724b.this;
            xt4 xt4 = (xt4) bVar2.f180556d.f127055a.f127080a;
            if (xt4 != null && (((i3 = xt4.f332327f) == 2 || i3 == 3) && (yt4 = (yt4) bVar2.mo88543m1()) != null)) {
                C106357m.m143313k((long) yt4.f332349f, yt4.f332350g, 0);
            }
            C106401z zVar = C110724b.this.f180559g.f317500x.f317568G1;
            zVar.getClass();
            zVar.f317758M = System.currentTimeMillis();
            C110724b bVar3 = C110724b.this;
            C106377r rVar = bVar3.f180559g;
            int i4 = rVar.f317476a;
            if (i4 == 1) {
                C112597j.m153938c(bVar3.f331186h, "reject ok!");
            } else if (i4 != 4) {
                C112597j.m153937b(bVar3.f331186h, "Anwser response not within WAITCONNECT, ignored.");
            } else if (i == 0) {
                yt4 yt42 = (yt4) bVar3.mo88543m1();
                v2protocal v2protocal = C110724b.this.f180559g.f317500x;
                v2protocal.f317656n = yt42.f332349f;
                v2protocal.f317665q = yt42.f332350g;
                v2protocal.f317662p = yt42.f332351h;
                v2protocal.f317567G0 = yt42.f332355o;
                v2protocal.f317570H0 = yt42.f332356p;
                v2protocal.f317573I0 = yt42.f332357q;
                v2protocal.f317576J0 = yt42.f332358r;
                v2protocal.f317582L0 = yt42.f332360t;
                v2protocal.f317579K0 = yt42.f332338A;
                v2protocal.f317551B = yt42.f332340C;
                v2protocal.f317554C = yt42.f332345H;
                v2protocal.f317588N0 = yt42.f332342E;
                v2protocal.f317548A = yt42.f332361u;
                v2protocal.f317566G = yt42.f332341D;
                C51018qv3 qv32 = yt42.f332346I;
                if (!(qv32 == null || (bVar = qv32.f140574f) == null)) {
                    v2protocal.f317560E = bVar.mo123703f();
                    C110963ht1 ht12 = null;
                    try {
                        ht12 = (C110963ht1) new C110963ht1().parseFrom(C110724b.this.f180559g.f317500x.f317560E);
                    } catch (IOException unused) {
                        C112597j.m153938c(C110724b.this.f331186h, "parse Voip general strategy fail");
                    }
                    if (ht12 != null) {
                        int i5 = ht12.f332029f;
                        String str3 = C110724b.this.f331186h;
                        C112597j.m153936a(str3, "steve:nSvrBaseBRTuneRatio1:" + i5);
                        C110724b.this.f180559g.f317500x.f317585M0 = i5;
                    }
                }
                String str4 = C110724b.this.f331186h;
                C112597j.m153938c(str4, "onAnwserResp: audioTsdfBeyond3G = " + C110724b.this.f180559g.f317500x.f317567G0 + ",audioTsdEdge = " + C110724b.this.f180559g.f317500x.f317570H0 + ",passthroughQosAlgorithm = " + C110724b.this.f180559g.f317500x.f317573I0 + ",fastPlayRepair = " + C110724b.this.f180559g.f317500x.f317576J0 + ", audioDtx = " + C110724b.this.f180559g.f317500x.f317582L0 + ", switchtcppktCnt=" + C110724b.this.f180559g.f317500x.f317548A + ", SvrCfgListV=" + C110724b.this.f180559g.f317500x.f317579K0 + ", setMaxBRForRelay=" + C110724b.this.f180559g.f317500x.f317588N0 + ", RedirectreqThreshold=" + yt42.f332352i.f332083E + ", BothSideSwitchFlag=" + yt42.f332352i.f332084F + ", WifiScanInterval=" + yt42.f332341D + ", BaseBRTuneRatio=" + C110724b.this.f180559g.f317500x.f317585M0);
                C110724b bVar4 = C110724b.this;
                bVar4.f180559g.f317500x.f317591O0 = yt42.f332366z;
                String str5 = bVar4.f331186h;
                StringBuilder sb = new StringBuilder();
                sb.append("answerResp AudioAecMode5 = ");
                sb.append(C110724b.this.f180559g.f317500x.f317591O0);
                C112597j.m153938c(str5, sb.toString());
                C110724b.this.f180559g.mo152723z();
                C106377r rVar2 = C110724b.this.f180559g;
                rVar2.f317483g = true;
                C106401z zVar2 = rVar2.f317500x.f317568G1;
                zVar2.getClass();
                zVar2.mo152874f((long) ((int) (System.currentTimeMillis() - zVar2.f317757L)));
                String str6 = C110724b.this.f331186h;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("answer ok, roomid =");
                sb4.append(C110724b.this.f180559g.f317500x.f317656n);
                sb4.append(",memberid = ");
                sb4.append(C110724b.this.f180559g.f317500x.f317662p);
                C112597j.m153938c(str6, sb4.toString());
                jv4 jv4 = yt42.f332352i;
                int i6 = jv4.f332111x;
                if (i6 > 0) {
                    jv4.f332111x = i6 - 1;
                    String str7 = C110724b.this.f331186h;
                    C112597j.m153938c(str7, "zhengxue[ENCRYPT] got encryptStrategy[" + jv4.f332111x + "] from answerresp relaydata");
                } else {
                    jv4.f332111x = 1;
                    C112597j.m153938c(C110724b.this.f331186h, "zhengxue[LOGIC]:got no EncryptStrategy in answerresp mrdata");
                }
                String str8 = C110724b.this.f331186h;
                C112597j.m153938c(str8, "answer with relayData peerid.length =" + jv4.f332094d.f184901e.f140572d);
                String str9 = C110724b.this.f331186h;
                C112597j.m153938c(str9, "answer with relayData capinfo.length =" + jv4.f332095e.f184901e.f140572d);
                C106377r rVar3 = C110724b.this.f180559g;
                int i7 = jv4.f332096f;
                v2protocal v2protocal2 = rVar3.f317500x;
                v2protocal2.f317568G1.f317778g = 1;
                v2protocal2.f317686x = i7;
                rVar3.f317464O.mo152533b(jv4.f332088J, jv4.f332087I, v2protocal2.f317656n, v2protocal2.f317665q);
                try {
                    C86709a0.m107525e().postToWorker(new C110726a(jv4));
                } catch (Exception unused2) {
                    Log.m105920e(C110724b.this.f331186h, "get proxy ip fail..");
                }
            } else if (i == 4) {
                C106401z zVar3 = rVar.f317500x.f317568G1;
                zVar3.f317772a = 12;
                zVar3.f317773b = i2;
                rVar.mo152719v(1, i2, "", -1);
            } else {
                C106401z zVar4 = rVar.f317500x.f317568G1;
                zVar4.f317772a = 12;
                zVar4.f317773b = i2;
                rVar.mo152719v(1, -9004, "", -1);
            }
        }
    }

    public C110724b(int i, int i2, int i3, byte[] bArr, byte[] bArr2, long j, boolean z, boolean z2, LinkedList<C101864x23> linkedList) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new xt4();
        bVar.f127067b = new yt4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/voipanswer";
        bVar.f127069d = 172;
        bVar.f127070e = 65;
        bVar.f127071f = 1000000065;
        C47350c a = bVar.mo72403a();
        this.f180556d = a;
        xt4 xt4 = (xt4) a.f127055a.f127080a;
        xt4.f332327f = i;
        xt4.f332326e = i3;
        xt4.f332331j = i2;
        pv4 pv4 = new pv4();
        int i4 = 2;
        pv4.f184900d = 2;
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(bArr);
        pv4.f184901e = qv32;
        xt4.f332328g = pv4;
        pv4 pv42 = new pv4();
        pv42.f184900d = 3;
        C51018qv3 qv33 = new C51018qv3();
        qv33.mo73350k(bArr2);
        pv42.f184901e = qv33;
        xt4.f332329h = pv42;
        xt4.f332337s = this.f180559g.f317500x.getIpStack();
        xt4.f332330i = j;
        if (z2) {
            xt4.f332333o = z ? 1 : 0;
        }
        xt4.f332332n = System.currentTimeMillis();
        int Os = ((C101048b) C86312j.m106911c(C101048b.class)).mo60590Os(2);
        String str = this.f331186h;
        C112597j.m153938c(str, "simType:" + Os + " ipstack:" + xt4.f332337s);
        if (Os == 0) {
            xt4.f332334p = 0;
        } else if (Os == 3) {
            xt4.f332334p = 3;
        } else {
            xt4.f332334p = Os == 1 ? 1 : i4;
        }
        if (linkedList != null) {
            xt4.f332335q = linkedList.size();
            xt4.f332336r = linkedList;
        }
    }

    public int getType() {
        return 172;
    }

    /* renamed from: l1 */
    public C11385n mo72979l1() {
        return new C110725a();
    }
}
