package s33;

import com.tencent.p014mm.plugin.voip.model.C106377r;
import com.tencent.p014mm.plugin.voip.model.C106401z;
import com.tencent.p014mm.plugin.voip.model.v2protocal;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.ITPEventID;
import di3.C86312j;
import f40.C86709a0;
import java.util.LinkedList;
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
import te3.C49798i42;
import te3.C51018qv3;
import te3.jv4;
import te3.pv4;
import te3.tt4;
import te3.ut4;
import z33.C112597j;

/* renamed from: s33.a */
public class C110721a extends C63696n<tt4, ut4> {

    /* renamed from: h */
    public String f331182h = "MicroMsg.NetSceneVoipAck";

    /* renamed from: s33.a$a */
    public class C110722a implements C11385n {

        /* renamed from: s33.a$a$a */
        public class C110723a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ jv4 f331184d;

            public C110723a(jv4 jv4) {
                this.f331184d = jv4;
            }

            public void run() {
                C101858vq3 vq32 = this.f331184d.f332091M;
                if (vq32 == null || vq32.f299682d == 0) {
                    C101851uq3 uq32 = new C101851uq3();
                    uq32.f299626d = 0;
                    uq32.f299627e = "";
                    uq32.f299628f = "";
                    uq32.f299629g = C110721a.this.f180559g.f317500x.f317629e;
                    uq32.f299630h = 4;
                    uq32.f299631i = 2;
                    jv4 jv4 = this.f331184d;
                    uq32.f299632j = jv4.f332097g;
                    uq32.f299633n = jv4.f332105r;
                    jv4.f332091M = new C101858vq3();
                    C101858vq3 vq33 = this.f331184d.f332091M;
                    vq33.f299682d = 1;
                    vq33.f299683e = new LinkedList<>();
                    this.f331184d.f332091M.f299683e.add(uq32);
                }
                C101763c50 c502 = this.f331184d.f332092N;
                if (c502 == null || c502.f297999d == 0) {
                    C110956b50 b502 = new C110956b50();
                    b502.f331878d = 1;
                    b502.f331879e = "";
                    b502.f331880f = "";
                    b502.f331881g = C110721a.this.f180559g.f317500x.f317629e;
                    b502.f331882h = 4;
                    b502.f331883i = 2;
                    jv4 jv42 = this.f331184d;
                    b502.f331884j = jv42.f332098h;
                    b502.f331885n = jv42.f332089K;
                    b502.f331886o = jv42.f332090L;
                    jv42.f332092N = new C101763c50();
                    C101763c50 c503 = this.f331184d.f332092N;
                    c503.f297999d = 1;
                    c503.f298000e = new LinkedList<>();
                    this.f331184d.f332092N.f298000e.add(b502);
                }
                String str = C110721a.this.f331182h;
                C112597j.m153938c(str, "relay conn cnt: " + this.f331184d.f332091M.f299682d);
                try {
                    C110721a.this.f180559g.f317500x.f317664p1 = this.f331184d.f332091M.toByteArray();
                } catch (Exception unused) {
                    Log.m105920e(C110721a.this.f331182h, "relay conn info to byte array fail..");
                }
                try {
                    C110721a.this.f180559g.f317500x.f317667q1 = this.f331184d.f332092N.toByteArray();
                } catch (Exception unused2) {
                    Log.m105920e(C110721a.this.f331182h, "direct conn info to byte array fail..");
                }
                try {
                    C49798i42 i422 = this.f331184d.f332093P;
                    if (i422.f135102d > 0) {
                        C110721a.this.f180559g.f317500x.f317670r1 = i422.toByteArray();
                    }
                } catch (Exception unused3) {
                    Log.m105920e(C110721a.this.f331182h, "nic query info to byte array fail..");
                }
                C106377r rVar = C110721a.this.f180559g;
                jv4 jv43 = this.f331184d;
                int i = jv43.f332080B;
                v2protocal v2protocal = rVar.f317500x;
                v2protocal.f317608V0 = i;
                v2protocal.f317625c1 = jv43.f332083E;
                int i2 = jv43.f332100j;
                int i3 = jv43.f332101n;
                v2protocal.f317689y = i2;
                v2protocal.f317692z = i3;
                C51018qv3 qv32 = jv43.f332113z;
                if (!(qv32 == null || jv43.f332079A == null)) {
                    int i4 = jv43.f332112y;
                    byte[] f = qv32.f140574f.mo123703f();
                    byte[] f2 = this.f331184d.f332079A.f140574f.mo123703f();
                    v2protocal v2protocal2 = rVar.f317500x;
                    v2protocal2.f317640h1 = i4;
                    v2protocal2.f317643i1 = f;
                    v2protocal2.f317646j1 = f2;
                }
                C112597j.m153938c(C110721a.this.f331182h, "ack success, try connect channel");
                C110721a.this.f180559g.mo152694H();
            }
        }

        public C110722a() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            C89349b bVar;
            C51018qv3 qv32;
            C89349b bVar2;
            C89349b bVar3;
            String str2 = C110721a.this.f331182h;
            C112597j.m153938c(str2, "ack response:" + i + " errCode:" + i2 + " status:" + C110721a.this.f180559g.f317476a);
            C106401z zVar = C110721a.this.f180559g.f317500x.f317568G1;
            zVar.getClass();
            zVar.mo152874f((long) ((int) (System.currentTimeMillis() - zVar.f317755J)));
            C106401z zVar2 = C110721a.this.f180559g.f317500x.f317568G1;
            zVar2.getClass();
            zVar2.f317756K = System.currentTimeMillis();
            C110721a aVar = C110721a.this;
            C106377r rVar = aVar.f180559g;
            int i3 = rVar.f317476a;
            if (i3 == 1) {
                C112597j.m153938c(aVar.f331182h, "reject ok!");
            } else if (i3 != 3) {
                C112597j.m153937b(aVar.f331182h, "ack response not within WAITCONNECT, ignored.");
            } else if (i == 0) {
                ut4 ut4 = (ut4) aVar.mo88543m1();
                if (ut4.f332283h != 1) {
                    C112597j.m153938c(C110721a.this.f331182h, "onVoipAckResp: do not use preconnect");
                    return;
                }
                C110721a aVar2 = C110721a.this;
                C106377r rVar2 = aVar2.f180559g;
                rVar2.f317485i = true;
                v2protocal v2protocal = rVar2.f317500x;
                v2protocal.f317561E0 = 1;
                v2protocal.f317656n = ut4.f332279d;
                v2protocal.f317665q = ut4.f332280e;
                v2protocal.f317662p = ut4.f332281f;
                v2protocal.f317551B = ut4.f332286n;
                v2protocal.f317554C = ut4.f332289q;
                v2protocal.f317566G = ut4.f332287o;
                v2protocal.f317548A = ut4.f332284i;
                String str3 = aVar2.f331182h;
                C112597j.m153938c(str3, "ack ok, roomid =" + C110721a.this.f180559g.f317500x.f317656n + ",memberid = " + C110721a.this.f180559g.f317500x.f317662p);
                jv4 jv4 = ut4.f332282g;
                int i4 = jv4.f332111x;
                if (i4 > 0) {
                    jv4.f332111x = i4 - 1;
                    String str4 = C110721a.this.f331182h;
                    C112597j.m153938c(str4, "zhengxue[ENCRYPT] got encryptStrategy[" + jv4.f332111x + "] from ackresp relaydata");
                } else {
                    jv4.f332111x = 1;
                    C112597j.m153938c(C110721a.this.f331182h, "zhengxue[LOGIC]:got no EncryptStrategy in ackresp mrdata");
                }
                String str5 = C110721a.this.f331182h;
                C112597j.m153938c(str5, "ack with switchtcpcnt  =" + C110721a.this.f180559g.f317500x.f317548A + " RedirectReqThreshold =" + jv4.f332083E + " BothSideSwitchFlag =" + jv4.f332084F + " WifiScanInterval =" + ut4.f332287o);
                v2protocal v2protocal2 = C110721a.this.f180559g.f317500x;
                v2protocal2.f317628d1 = jv4.f332084F;
                C51018qv3 qv33 = jv4.f332086H;
                if (!(qv33 == null || (bVar3 = qv33.f140574f) == null)) {
                    v2protocal2.f317557D = bVar3.mo123703f();
                }
                C51018qv3 qv34 = ut4.f332290r;
                if (!(qv34 == null || (bVar2 = qv34.f140574f) == null)) {
                    C110721a.this.f180559g.f317500x.f317560E = bVar2.mo123703f();
                }
                C106377r rVar3 = C110721a.this.f180559g;
                int i5 = jv4.f332096f;
                v2protocal v2protocal3 = rVar3.f317500x;
                v2protocal3.f317568G1.f317778g = 1;
                v2protocal3.f317686x = i5;
                rVar3.mo152698L(jv4.f332094d.f184901e.f140574f.mo123703f());
                C110721a.this.f180559g.mo152723z();
                C51018qv3 qv35 = jv4.f332103p;
                if (!(qv35 == null || (bVar = qv35.f140574f) == null || (qv32 = jv4.f332081C) == null || qv32.f140574f == null)) {
                    C106377r rVar4 = C110721a.this.f180559g;
                    byte[] f = bVar.mo123703f();
                    int i6 = jv4.f332102o;
                    int i7 = jv4.f332111x;
                    byte[] f2 = jv4.f332081C.f140574f.mo123703f();
                    v2protocal v2protocal4 = rVar4.f317500x;
                    v2protocal4.f317680v = i6;
                    v2protocal4.f317683w = f;
                    v2protocal4.f317619a1 = i7;
                    v2protocal4.f317622b1 = f2;
                }
                C106377r rVar5 = C110721a.this.f180559g;
                int i8 = jv4.f332106s;
                int i9 = jv4.f332107t;
                int i15 = jv4.f332108u;
                int i16 = jv4.f332109v;
                int i17 = jv4.f332110w;
                v2protocal v2protocal5 = rVar5.f317500x;
                v2protocal5.f317597Q0 = i8;
                v2protocal5.f317600R0 = i9;
                v2protocal5.f317602S0 = i15;
                v2protocal5.f317604T0 = i16;
                v2protocal5.f317606U0 = i17;
                rVar5.mo152697K(jv4.f332095e.f184901e.f140574f.mo123703f());
                C86709a0.m107525e().postToWorker(new C110723a(jv4));
            } else if (i == 4) {
                C106401z zVar3 = rVar.f317500x.f317568G1;
                zVar3.f317772a = 12;
                zVar3.f317773b = i2;
                rVar.mo152719v(1, i2, "", -1);
            } else {
                C106401z zVar4 = rVar.f317500x.f317568G1;
                zVar4.f317772a = 12;
                zVar4.f317773b = i2;
                rVar.mo152719v(1, -9004, "", 3);
            }
        }
    }

    public C110721a(int i, long j, int i2, byte[] bArr, byte[] bArr2, String str, LinkedList<C101864x23> linkedList) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new tt4();
        bVar.f127067b = new ut4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/voipack";
        bVar.f127069d = ITPEventID.RICH_MEDIA_SYNCHRONIZER_DESELECT_DONE;
        bVar.f127070e = 123;
        bVar.f127071f = 1000000123;
        C47350c a = bVar.mo72403a();
        this.f180556d = a;
        tt4 tt4 = (tt4) a.f127055a.f127080a;
        tt4.f332265d = i;
        tt4.f332266e = j;
        tt4.f332273o = i2;
        int i3 = 1;
        if (i2 != 1) {
            tt4.f332268g = 0;
            return;
        }
        tt4.f332272n = str;
        pv4 pv4 = new pv4();
        pv4.f184900d = 2;
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(bArr);
        pv4.f184901e = qv32;
        tt4.f332269h = pv4;
        pv4 pv42 = new pv4();
        pv42.f184900d = 3;
        C51018qv3 qv33 = new C51018qv3();
        qv33.mo73350k(bArr2);
        pv42.f184901e = qv33;
        tt4.f332270i = pv42;
        tt4.f332274p = System.currentTimeMillis();
        tt4.f332278t = this.f180559g.f317500x.getIpStack();
        tt4.f332268g = 1;
        int Os = ((C101048b) C86312j.m106911c(C101048b.class)).mo60590Os(2);
        String str2 = this.f331182h;
        C112597j.m153938c(str2, "simType:" + Os + " ipstack:" + tt4.f332278t);
        if (Os == 0) {
            tt4.f332275q = 0;
        } else if (Os == 3) {
            tt4.f332275q = 3;
        } else {
            tt4.f332275q = Os != 1 ? 2 : i3;
        }
        tt4.f332276r = linkedList.size();
        tt4.f332277s = linkedList;
    }

    public int getType() {
        return ITPEventID.RICH_MEDIA_SYNCHRONIZER_DESELECT_DONE;
    }

    /* renamed from: l1 */
    public C11385n mo72979l1() {
        return new C110722a();
    }
}
