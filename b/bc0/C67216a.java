package bc0;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelsimple.C40371t;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C116746l3;
import f40.C86709a0;
import f40.C86718e;
import fw0.C87107w;
import java.util.Iterator;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117746w;
import ob0.C117747y;
import ob0.y$$c;
import ob0.y$$d;
import p550hn.C108251c;
import qe3.C101127f;
import qe3.C101131z;
import qe3.C118176a0;
import qe3.C89625d;
import qe3.C89631w;
import te3.C51018qv3;
import te3.C77928fd;
import te3.C77934gd;
import te3.d54;
import te3.lx4;
import te3.vc4;

/* renamed from: bc0.a */
public class C67216a extends C117747y implements C1311n, C108251c {

    /* renamed from: g */
    public static C67219b f193009g;

    /* renamed from: d */
    public final C114799u f193010d;

    /* renamed from: e */
    public C11385n f193011e;

    /* renamed from: f */
    public int f193012f;

    /* renamed from: bc0.a$a */
    public class C67217a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f193013d;

        /* renamed from: bc0.a$a$a */
        public class C67218a implements C11385n {
            public C67218a() {
            }

            public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
                Log.m105919d("MicroMsg.NetSceneBindMobileForReg", "summerauth dkcert getcert type:%d ret [%d,%d]", Integer.valueOf(yVar.getType()), Integer.valueOf(i), Integer.valueOf(i2));
                if (i == 0 && i2 == 0) {
                    C67216a aVar = C67216a.this;
                    aVar.doScene(aVar.dispatcher(), C67216a.this.f193011e);
                    return;
                }
                C67216a aVar2 = C67216a.this;
                aVar2.f193011e.onSceneEnd(i, i2, "", aVar2);
            }
        }

        public C67217a(int i) {
            this.f193013d = i;
        }

        public void run() {
            new C40371t(this.f193013d).doScene(C67216a.this.dispatcher(), new C67218a());
        }
    }

    /* renamed from: bc0.a$b */
    public interface C67219b {
    }

    /* renamed from: bc0.a$c */
    public static class C67220c extends C117746w {

        /* renamed from: a */
        public final C101131z f193016a = new C101131z();

        /* renamed from: b */
        public final C118176a0 f193017b = new C118176a0();

        public int getOptions() {
            return 1;
        }

        public C89631w.C89634d getReqObjImp() {
            return this.f193016a;
        }

        public C89631w.C89636e getRespObj() {
            return this.f193017b;
        }

        public int getType() {
            return 145;
        }

        public String getUri() {
            return "/cgi-bin/micromsg-bin/bindopmobileforreg";
        }
    }

    public C67216a(String str, int i, String str2, int i2, String str3, String str4) {
        this(str, i, str2, i2, str3);
        ((C101131z) this.f193010d.getReqObj()).f296026a.f227367j = str4;
    }

    /* renamed from: I */
    public String mo91362I() {
        LinkedList<vc4> linkedList;
        d54 d54 = ((C67220c) this.f193010d).f193017b.f353291a.f227456v;
        if (d54 == null || (linkedList = d54.f182633e) == null || linkedList.size() <= 0) {
            return null;
        }
        Iterator<vc4> it = d54.f182633e.iterator();
        while (it.hasNext()) {
            vc4 next = it.next();
            if (next.f185871d == 15) {
                return next.f185872e;
            }
        }
        return null;
    }

    /* renamed from: K0 */
    public String mo91363K0() {
        return ((C67220c) this.f193010d).f193017b.f353291a.f227454t;
    }

    /* renamed from: O */
    public void mo91364O(int i) {
        ((C101131z) this.f193010d.getReqObj()).f296026a.f227373s = i;
    }

    /* renamed from: T */
    public void mo91365T(lx4 lx4) {
        if (lx4 != null) {
            try {
                C77928fd fdVar = ((C101131z) this.f193010d.getReqObj()).f296026a;
                C51018qv3 qv32 = new C51018qv3();
                qv32.mo73350k(lx4.toByteArray());
                fdVar.f227379y = qv32;
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: V0 */
    public String mo91366V0() {
        return ((C67220c) this.f193010d).f193017b.f353291a.f227436A;
    }

    /* renamed from: W */
    public void mo91367W(String str) {
        ((C101131z) this.f193010d.getReqObj()).f296026a.f227377w = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        String str;
        this.f193011e = nVar;
        C101131z zVar = (C101131z) this.f193010d.getReqObj();
        String str2 = zVar.f296026a.f227362e;
        if (str2 == null || str2.length() <= 0) {
            Log.m105920e("MicroMsg.NetSceneBindMobileForReg", "doScene getMobile Error: " + zVar.f296026a.f227362e);
            return -1;
        }
        C77928fd fdVar = zVar.f296026a;
        int i = fdVar.f227363f;
        if ((i != 6 && i != 9) || ((str = fdVar.f227364g) != null && str.length() > 0)) {
            return dispatch(gVar, this.f193010d, this);
        }
        Log.m105920e("MicroMsg.NetSceneBindMobileForReg", "doScene getVerifyCode Error: " + zVar.f296026a.f227362e);
        return -1;
    }

    /* renamed from: f */
    public int mo91368f() {
        return ((C101131z) this.f193010d.getReqObj()).f296026a.f227363f;
    }

    /* renamed from: f0 */
    public void mo91369f0(String str) {
        ((C101131z) this.f193010d.getReqObj()).f296026a.f227357C = str;
    }

    /* renamed from: g0 */
    public void mo91370g0(int i) {
        ((C101131z) this.f193010d.getReqObj()).f296026a.f227374t = i;
    }

    public int getType() {
        return 145;
    }

    public String getUsername() {
        return ((C67220c) this.f193010d).f193017b.f353291a.f227445h;
    }

    /* renamed from: j1 */
    public int mo91372j1() {
        return ((C67220c) this.f193010d).f193017b.f353291a.f227460z;
    }

    /* renamed from: k1 */
    public int mo91373k1() {
        LinkedList<vc4> linkedList;
        d54 d54 = ((C67220c) this.f193010d).f193017b.f353291a.f227456v;
        if (d54 == null || (linkedList = d54.f182633e) == null || linkedList.size() <= 0) {
            return 30;
        }
        Iterator<vc4> it = d54.f182633e.iterator();
        while (it.hasNext()) {
            vc4 next = it.next();
            if (next.f185871d == 4) {
                return Util.getInt(next.f185872e, 30);
            }
        }
        return 30;
    }

    /* renamed from: l1 */
    public int mo91374l1() {
        LinkedList<vc4> linkedList;
        d54 d54 = ((C67220c) this.f193010d).f193017b.f353291a.f227456v;
        if (d54 == null || (linkedList = d54.f182633e) == null || linkedList.size() <= 0) {
            return 0;
        }
        Iterator<vc4> it = d54.f182633e.iterator();
        while (it.hasNext()) {
            vc4 next = it.next();
            if (next.f185871d == 5) {
                return Util.getInt(next.f185872e, 0);
            }
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* renamed from: m1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo91375m1() {
        /*
            r5 = this;
            com.tencent.mm.network.u r0 = r5.f193010d
            bc0.a$c r0 = (bc0.C67216a.C67220c) r0
            qe3.a0 r0 = r0.f193017b
            te3.gd r0 = r0.f353291a
            te3.d54 r0 = r0.f227456v
            r1 = 0
            if (r0 == 0) goto L_0x0035
            java.util.LinkedList<te3.vc4> r2 = r0.f182633e
            if (r2 == 0) goto L_0x0035
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x0035
            java.util.LinkedList<te3.vc4> r0 = r0.f182633e
            java.util.Iterator r0 = r0.iterator()
        L_0x001d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0035
            java.lang.Object r2 = r0.next()
            te3.vc4 r2 = (te3.vc4) r2
            int r3 = r2.f185871d
            r4 = 7
            if (r3 != r4) goto L_0x001d
            java.lang.String r0 = r2.f185872e
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r1)
            goto L_0x0036
        L_0x0035:
            r0 = 0
        L_0x0036:
            if (r0 <= 0) goto L_0x0039
            r1 = 1
        L_0x0039:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bc0.C67216a.mo91375m1():boolean");
    }

    /* renamed from: n1 */
    public int mo91376n1() {
        return ((C67220c) this.f193010d).f193017b.f353291a.f227440E;
    }

    /* renamed from: o1 */
    public int mo91377o1() {
        LinkedList<vc4> linkedList;
        d54 d54 = ((C67220c) this.f193010d).f193017b.f353291a.f227456v;
        if (d54 == null || (linkedList = d54.f182633e) == null || linkedList.size() <= 0) {
            return 3;
        }
        Iterator<vc4> it = d54.f182633e.iterator();
        while (it.hasNext()) {
            vc4 next = it.next();
            if (next.f185871d == 6) {
                return Util.getInt(next.f185872e, 3);
            }
        }
        return 3;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C77934gd gdVar;
        int i4 = i2;
        int i5 = i3;
        String str2 = str;
        Log.m105925i("MicroMsg.NetSceneBindMobileForReg", "dkidc onGYNetEnd  errType:%d errCode:%d", Integer.valueOf(i2), Integer.valueOf(i3));
        C118176a0 a0Var = (C118176a0) uVar.getRespObj();
        if (a0Var == null || (gdVar = a0Var.f353291a) == null) {
            Log.m105925i("MicroMsg.NetSceneBindMobileForReg", "summerauth mmtls bindopreg not set as ret:%s", a0Var);
        } else {
            Log.m105925i("MicroMsg.NetSceneBindMobileForReg", "summerauth mmtls bindopreg json:%s", gdVar.toJSON());
            int i6 = a0Var.f353291a.f227457w;
            C86709a0.m107528h();
            C86709a0.m107535s().f251803a.mo119664f(47, Integer.valueOf(i6));
            C114770g gVar = C86709a0.m107529k().f251779b.f256809d;
            if (gVar != null) {
                gVar.mo55468b3((i6 & 1) == 0);
            }
        }
        if (i4 == 4 && i5 == -301) {
            C77934gd gdVar2 = a0Var.f353291a;
            C116746l3.m164676c(true, gdVar2.f227447j, gdVar2.f227448n, gdVar2.f227446i, true, 0);
            int i7 = this.f193012f - 1;
            this.f193012f = i7;
            if (i7 <= 0) {
                this.f193011e.onSceneEnd(3, -1, "", this);
            } else {
                doScene(dispatcher(), this.f193011e);
            }
        } else if (i4 == 4 && i5 == -240) {
            Log.m105925i("MicroMsg.NetSceneBindMobileForReg", "summerauth bindopreg MM_ERR_AUTO_RETRY_REQUEST redirectCount:%s", Integer.valueOf(this.f193012f));
            int i8 = this.f193012f - 1;
            this.f193012f = i8;
            if (i8 <= 0) {
                this.f193011e.onSceneEnd(3, -1, "", this);
            } else {
                doScene(dispatcher(), this.f193011e);
            }
        } else if (i4 == 4 && i5 == -102) {
            int i9 = uVar.getReqObj().getRsaInfo().f296014c;
            Log.m105919d("MicroMsg.NetSceneBindMobileForReg", "summerauth auth MM_ERR_CERT_EXPIRED  getcert now  old ver:%d", Integer.valueOf(i9));
            C86709a0.m107525e().postToWorker(new C67217a(i9));
        } else if (i4 == 4 && (i5 == -305 || i5 == -306)) {
            Log.m105925i("MicroMsg.NetSceneBindMobileForReg", "summerauth bindmobilereg MM_ERR_CERT_SWITCH or MM_ERR_ECDHFAIL_ROLLBACK errCode:%d ver:%d", Integer.valueOf(i3), Integer.valueOf(C101127f.m132548a()));
            doScene(dispatcher(), this.f193011e);
        } else if (i4 == 0 && i5 == 0) {
            C77934gd gdVar3 = a0Var.f353291a;
            C116746l3.m164676c(false, gdVar3.f227447j, gdVar3.f227448n, gdVar3.f227446i, false, 0);
            this.f193011e.onSceneEnd(i4, i5, str2, this);
        } else {
            this.f193011e.onSceneEnd(i4, i5, str2, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* renamed from: p1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo91378p1() {
        /*
            r5 = this;
            com.tencent.mm.network.u r0 = r5.f193010d
            bc0.a$c r0 = (bc0.C67216a.C67220c) r0
            qe3.a0 r0 = r0.f193017b
            te3.gd r0 = r0.f353291a
            te3.d54 r0 = r0.f227456v
            r1 = 0
            if (r0 == 0) goto L_0x0036
            java.util.LinkedList<te3.vc4> r2 = r0.f182633e
            if (r2 == 0) goto L_0x0036
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x0036
            java.util.LinkedList<te3.vc4> r0 = r0.f182633e
            java.util.Iterator r0 = r0.iterator()
        L_0x001d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0036
            java.lang.Object r2 = r0.next()
            te3.vc4 r2 = (te3.vc4) r2
            int r3 = r2.f185871d
            r4 = 10
            if (r3 != r4) goto L_0x001d
            java.lang.String r0 = r2.f185872e
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r1)
            goto L_0x0037
        L_0x0036:
            r0 = 0
        L_0x0037:
            if (r0 <= 0) goto L_0x003a
            r1 = 1
        L_0x003a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bc0.C67216a.mo91378p1():boolean");
    }

    /* renamed from: q0 */
    public String mo91379q0() {
        LinkedList<vc4> linkedList;
        d54 d54 = ((C67220c) this.f193010d).f193017b.f353291a.f227456v;
        if (d54 == null || (linkedList = d54.f182633e) == null || linkedList.size() <= 0) {
            return null;
        }
        Iterator<vc4> it = d54.f182633e.iterator();
        while (it.hasNext()) {
            vc4 next = it.next();
            if (next.f185871d == 14) {
                return next.f185872e;
            }
        }
        return null;
    }

    /* renamed from: q1 */
    public String mo91380q1() {
        return ((C67220c) this.f193010d).f193017b.f353291a.f227444g;
    }

    /* renamed from: r1 */
    public String mo91381r1() {
        return ((C67220c) this.f193010d).f193017b.f353291a.f227441d;
    }

    public int securityLimitCount() {
        return 3;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return y$$d.EOk;
    }

    public void setSecurityCheckError(y$$c y__c) {
    }

    public C67216a(String str, int i, String str2, int i2, String str3) {
        this(str, i, str2, i2, str3, 0);
    }

    public C67216a(String str, int i, String str2, int i2, String str3, int i3) {
        String str4;
        this.f193011e = null;
        this.f193012f = 2;
        C67220c cVar = new C67220c();
        this.f193010d = cVar;
        C101131z zVar = (C101131z) cVar.getReqObj();
        zVar.f296026a.f227363f = i;
        Log.m105918d("MicroMsg.NetSceneBindMobileForReg", "Get mobile:" + str + " opcode:" + i + " verifyCode:" + str2);
        C77928fd fdVar = zVar.f296026a;
        fdVar.f227362e = str;
        fdVar.f227364g = str2;
        fdVar.f227376v = i3;
        fdVar.f227365h = i2;
        fdVar.f227366i = str3;
        fdVar.f227372r = LocaleUtil.getApplicationLanguage();
        zVar.f296026a.f227375u = C86718e.m107547e();
        if (Util.isNullOrNil(zVar.f296026a.f227369o) && Util.isNullOrNil(zVar.f296026a.f227370p)) {
            C77928fd fdVar2 = zVar.f296026a;
            C67219b bVar = f193009g;
            if (bVar != null) {
                ((C87107w.C75814f) bVar).getClass();
                str4 = ChannelUtil.isNokiaAol ? MMApplicationContext.getContext().getString(C0966R.string.i_r) : MMApplicationContext.getContext().getString(C0966R.string.i_q);
            } else {
                str4 = "";
            }
            fdVar2.f227369o = str4;
            zVar.f296026a.f227370p = C89625d.f257838d;
        }
        Log.m105925i("MicroMsg.NetSceneBindMobileForReg", "req json %s", zVar.f296026a.toJSON());
    }
}
