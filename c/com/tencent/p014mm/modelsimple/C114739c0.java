package com.tencent.p014mm.modelsimple;

import android.content.Context;
import android.os.Build;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86312j;
import eb0.C116734h6;
import eb0.C116746l3;
import eb0.C116749n3;
import eb0.C75576f4;
import eb0.C7624i3;
import f40.C86709a0;
import f40.C86718e;
import f62.C75700k0;
import java.util.Iterator;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.y$$c;
import ob0.y$$d;
import p156gj.C87203t;
import p823sg.C77710q;
import qe3.C101127f;
import qe3.C118194t0;
import qe3.C118195u0;
import ru0.C118231b;
import sf0.C48374j0;
import tc0.C37007j;
import tc0.C77885p;
import tc2.C118418g;
import te3.C118465s33;
import te3.C118468t33;
import te3.d54;
import te3.vc4;

/* renamed from: com.tencent.mm.modelsimple.c0 */
public class C114739c0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f343994d;

    /* renamed from: e */
    public C114799u f343995e;

    /* renamed from: f */
    public final String f343996f;

    /* renamed from: g */
    public final String f343997g;

    /* renamed from: h */
    public final String f343998h;

    /* renamed from: i */
    public final String f343999i;

    /* renamed from: j */
    public final String f344000j;

    /* renamed from: n */
    public final int f344001n;

    /* renamed from: o */
    public final int f344002o;

    /* renamed from: p */
    public boolean f344003p = true;

    /* renamed from: q */
    public int f344004q = 2;

    /* renamed from: com.tencent.mm.modelsimple.c0$a */
    public class C114740a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f344005d;

        /* renamed from: com.tencent.mm.modelsimple.c0$a$a */
        public class C114741a implements C11385n {
            public C114741a() {
            }

            public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
                Log.m105919d("MicroMsg.NetSceneReg", "summerauth dkcert getcert type:%d ret [%d,%d]", Integer.valueOf(yVar.getType()), Integer.valueOf(i), Integer.valueOf(i2));
                if (i == 0 && i2 == 0) {
                    C114739c0 c0Var = C114739c0.this;
                    c0Var.doScene(c0Var.dispatcher(), C114739c0.this.f343994d);
                    return;
                }
                C114739c0 c0Var2 = C114739c0.this;
                c0Var2.f343994d.onSceneEnd(i, i2, "", c0Var2);
            }
        }

        public C114740a(int i) {
            this.f344005d = i;
        }

        public void run() {
            new C40371t(this.f344005d).doScene(C114739c0.this.dispatcher(), new C114741a());
        }
    }

    /* renamed from: com.tencent.mm.modelsimple.c0$b */
    public class C114742b implements C75576f4.C75578b {

        /* renamed from: a */
        public final /* synthetic */ C118195u0 f344008a;

        public C114742b(C114739c0 c0Var, C118195u0 u0Var) {
            this.f344008a = u0Var;
        }

        /* renamed from: a */
        public void mo57753a(C114770g gVar) {
            if (gVar != null) {
                gVar.mo55443A3().mo55422X0(this.f344008a.mo182990a(1), this.f344008a.mo182990a(2), this.f344008a.mo182990a(3), this.f344008a.f353324a.f354415d);
            }
        }
    }

    public C114739c0(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8, int i2, String str9, String str10, String str11, boolean z, boolean z2) {
        String str12 = str;
        String str13 = str3;
        int i3 = i;
        String str14 = str4;
        String str15 = str5;
        String str16 = str8;
        int i4 = i2;
        String str17 = str9;
        String str18 = str10;
        String str19 = str11;
        Log.m105925i("MicroMsg.NetSceneReg", "init: use:%s pwd:%s nick:%s bindqq:%d email:%s mobile:%s [%s,%s,%s] regmode:%d alias:%s [%s,%s] force:%b avatar:%b", str12, Util.secPrint(str2), str13, Integer.valueOf(i), str14, str15, str6, str7, str16, Integer.valueOf(i2), str17, str19, str18, Boolean.valueOf(z), Boolean.valueOf(z2));
        this.f344002o = i4;
        C116749n3 n3Var = new C116749n3();
        this.f343995e = n3Var;
        C118194t0 t0Var = (C118194t0) n3Var.getReqObj();
        t0Var.setUin(0);
        C118465s33 s332 = t0Var.f353322a;
        s332.f354353d = str12;
        s332.f354354e = Util.getCutPasswordMD5(str2);
        if (i4 == 4) {
            t0Var.f353322a.f354354e = str16;
            Log.m105928w("MicroMsg.NetSceneReg", "dkreg rand:" + str16 + " reqMd5:" + t0Var.f353322a.f354354e);
        }
        C118465s33 s333 = t0Var.f353322a;
        s333.f354355f = str13;
        s333.f354356g = i3;
        s333.f354357h = str14;
        s333.f354358i = str15;
        s333.f354359j = str16;
        s333.f354362p = i4;
        s333.f354363q = "" + Util.getTimeZoneOffset();
        t0Var.f353322a.f354366t = C87203t.m108277m();
        t0Var.f353322a.f354364r = LocaleUtil.getApplicationLanguage();
        C118465s33 s334 = t0Var.f353322a;
        s334.f354360n = 0;
        s334.f354368v = str17;
        s334.f354370x = str19;
        s334.f354369w = str18;
        s334.f354365s = z ? 1 : 0;
        s334.f354371y = z2 ? 1 : 0;
        s334.f354331A = C86718e.m107547e();
        t0Var.f353322a.f354333C = C87203t.m108266b();
        t0Var.f353322a.f354334D = Util.nullAsNil(C87203t.f252879d.mo121645a());
        t0Var.f353322a.f354335E = MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).getString("installreferer", "");
        t0Var.f353322a.f354336F = C118418g.INSTANCE.mo175810Zb(2);
        C118465s33 s335 = t0Var.f353322a;
        Context context = MMApplicationContext.getContext();
        s335.f354338H = context.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath() + "_google_aid", 4).getString("getgoogleaid", "");
        t0Var.f353322a.f354350U = MMApplicationContext.getApplicationId();
        this.f343996f = str12;
        this.f343997g = str13;
        this.f343998h = str14;
        this.f343999i = str15;
        this.f344001n = i3;
        this.f344000j = str17;
        this.f344003p = (str16 == null || str8.length() <= 0) && (str14 == null || str4.length() <= 0);
        Log.m105925i("MicroMsg.NetSceneReg", "reg json=%s", t0Var.f353322a.toJSON());
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f343994d = nVar;
        return dispatch(gVar, this.f343995e, this);
    }

    public int getType() {
        return 126;
    }

    /* renamed from: j1 */
    public byte[] mo174371j1() {
        return C48374j0.m53716e(((C116749n3) this.f343995e).f350053b.f353324a.f354405F, new byte[0]);
    }

    /* renamed from: k1 */
    public String mo174372k1() {
        return ((C116749n3) this.f343995e).f350053b.f353324a.f354404E;
    }

    /* renamed from: l1 */
    public String mo174373l1() {
        LinkedList<vc4> linkedList;
        d54 d54 = ((C116749n3) this.f343995e).f350053b.f353324a.f354406G;
        if (!(d54 == null || (linkedList = d54.f182633e) == null || linkedList.size() <= 0)) {
            Iterator<vc4> it = d54.f182633e.iterator();
            while (it.hasNext()) {
                vc4 next = it.next();
                if (next.f185871d == 2) {
                    return next.f185872e;
                }
            }
        }
        return "";
    }

    /* renamed from: m1 */
    public int mo174374m1() {
        LinkedList<vc4> linkedList;
        d54 d54 = ((C116749n3) this.f343995e).f350053b.f353324a.f354406G;
        if (d54 == null || (linkedList = d54.f182633e) == null || linkedList.size() <= 0) {
            return 2;
        }
        Iterator<vc4> it = d54.f182633e.iterator();
        while (it.hasNext()) {
            vc4 next = it.next();
            if (next.f185871d == 3) {
                return Util.getInt(next.f185872e, 2);
            }
        }
        return 2;
    }

    /* renamed from: n1 */
    public String mo174375n1() {
        LinkedList<vc4> linkedList;
        d54 d54 = ((C116749n3) this.f343995e).f350053b.f353324a.f354406G;
        if (d54 == null || (linkedList = d54.f182633e) == null || linkedList.size() <= 0) {
            return null;
        }
        Iterator<vc4> it = d54.f182633e.iterator();
        while (it.hasNext()) {
            vc4 next = it.next();
            if (next.f185871d == 17) {
                return next.f185872e;
            }
        }
        return null;
    }

    /* renamed from: o1 */
    public String mo174376o1() {
        return ((C116749n3) this.f343995e).f350053b.f353324a.f354403D;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C118195u0 u0Var;
        String str2;
        C114739c0 c0Var = this;
        int i4 = i2;
        int i5 = i3;
        String str3 = str;
        C118195u0 u0Var2 = (C118195u0) uVar.getRespObj();
        C118468t33 t332 = u0Var2.f353324a;
        if (t332 != null) {
            int i6 = t332.f354410K;
            Log.m105925i("MicroMsg.NetSceneReg", "summerauth mmtls reg json:%s", t332.toJSON());
            C86709a0.m107528h();
            C86709a0.m107535s().f251803a.mo119664f(47, Integer.valueOf(i6));
            C114770g gVar = C86709a0.m107529k().f251779b.f256809d;
            if (gVar != null) {
                gVar.mo55468b3((i6 & 1) == 0);
            }
        } else {
            Log.m105925i("MicroMsg.NetSceneReg", "summerauth mmtls reg not set as ret:%s", Integer.valueOf(u0Var2.getRetCode()));
        }
        if (i4 == 4 && i5 == -301) {
            C118468t33 t333 = u0Var2.f353324a;
            C116746l3.m164676c(true, t333.f354424p, t333.f354428t, t333.f354400A, true, 0);
            int i7 = c0Var.f344004q - 1;
            c0Var.f344004q = i7;
            if (i7 <= 0) {
                c0Var.f343994d.onSceneEnd(3, -1, "", c0Var);
            } else {
                c0Var.doScene(dispatcher(), c0Var.f343994d);
            }
        } else if (i4 == 4 && i5 == -240) {
            Log.m105925i("MicroMsg.NetSceneReg", "summerauth auth MM_ERR_AUTO_RETRY_REQUEST redirectCount:%s", Integer.valueOf(c0Var.f344004q));
            int i8 = c0Var.f344004q - 1;
            c0Var.f344004q = i8;
            if (i8 <= 0) {
                c0Var.f343994d.onSceneEnd(3, -1, "", c0Var);
            } else {
                c0Var.doScene(dispatcher(), c0Var.f343994d);
            }
        } else if (i4 == 4 && i5 == -102) {
            int i9 = uVar.getReqObj().getRsaInfo().f296014c;
            Log.m105925i("MicroMsg.NetSceneReg", "summerauth auth MM_ERR_CERT_EXPIRED  getcert now  old ver:%d", Integer.valueOf(i9));
            C86709a0.m107525e().postToWorker(new C114740a(i9));
        } else if (i4 == 4 && (i5 == -305 || i5 == -306)) {
            Log.m105925i("MicroMsg.NetSceneReg", "summerauth newreg MM_ERR_CERT_SWITCH or MM_ERR_ECDHFAIL_ROLLBACK errCode:%d ver:%d", Integer.valueOf(i3), Integer.valueOf(C101127f.m132548a()));
            c0Var.doScene(dispatcher(), c0Var.f343994d);
        } else if (i4 == 0 && i5 == 0) {
            C118194t0 t0Var = (C118194t0) uVar.getReqObj();
            Log.m105918d("MicroMsg.NetSceneReg", "dkreg: pass:" + u0Var2.f353324a.f354433y + " regtype:" + u0Var2.f353324a.f354430v + " mode:" + t0Var.f353322a.f354362p);
            if (u0Var2.f353324a.f354415d != 0 && !c0Var.f344003p) {
                C86709a0.m107528h().mo121098i(u0Var2.f353324a.f354415d);
                C86709a0.m107535s().mo121142i().mo119676J(2, t0Var.f353322a.f354353d);
                C86709a0.m107535s().mo121142i().mo119676J(16, 1);
                C86709a0.m107535s().mo121142i().mo119676J(52, Integer.valueOf(u0Var2.f353324a.f354430v));
                C86709a0.m107535s().mo121142i().mo119676J(340240, Long.valueOf(System.currentTimeMillis()));
                C86709a0.m107535s().mo121142i().mo119676J(340241, Boolean.TRUE);
                C116734h6.m164660p(u0Var2.f353324a.f354412M);
                C116734h6.m164658n(u0Var2.f353324a.f354413N);
                C116734h6.m164654j(u0Var2.f353324a.f354414P);
                String str4 = c0Var.f343996f;
                if (!(str4 == null || str4.length() <= 0 || c0Var.f344002o == 1)) {
                    u0Var2.f353324a.f354426r = c0Var.f343996f;
                }
                C118468t33 t334 = u0Var2.f353324a;
                t334.f354420i = c0Var.f343998h;
                t334.f354427s = 0;
                if (!C86709a0.m107522a() || C86709a0.m107535s().mo121142i() == null) {
                    u0Var = u0Var2;
                    str2 = "MicroMsg.NetSceneReg";
                    Log.m105921e(str2, "dkwt ERR: updateProfile acc:%b uin:%s userConfigStg:%s", Boolean.valueOf(C86709a0.m107522a()), C77710q.m93738a(C86709a0.m107523b().mo121110g()), C86709a0.m107535s().mo121142i());
                } else {
                    String str5 = c0Var.f344000j;
                    int i15 = c0Var.f344001n;
                    String str6 = c0Var.f343997g;
                    String str7 = c0Var.f343999i;
                    C118468t33 t335 = u0Var2.f353324a;
                    String str8 = t335.f354426r;
                    String str9 = t335.f354420i;
                    int i16 = t335.f354427s;
                    String str10 = t335.f354417f;
                    String str11 = t335.f354418g;
                    int i17 = t335.f354421j;
                    int i18 = t335.f354422n;
                    String str12 = t335.f354416e;
                    u0Var = u0Var2;
                    String str13 = t335.f354425q;
                    String str14 = t335.f354431w;
                    Log.m105925i("MicroMsg.HandleAuthResponse", "dkwt updateProfile user:%s alias:%s qq:%s nick:%s email:%s mobile:%s status:%d offuser:%s offnick:%s pushmail:%d sendCard:%d session:%s fsurl:%s pluginFlag:%d atuhkey:%s a2:%s newa2:%s kisd:%s safedev:%d MicroBlog:%s emailpwd:%d", str8, str5, C77710q.m93738a(i15), str6, str9, str7, Integer.valueOf(i16), str10, str11, Integer.valueOf(i17), Integer.valueOf(i18), Util.secPrint(str12), str13, 0, Util.secPrint(str14), Util.secPrint((String) null), Util.secPrint((String) null), Util.secPrint((String) null), -1, t335.f354419h, 0);
                    C85801v1 i19 = C86709a0.m107535s().mo121142i();
                    C7624i3.f25910c.mo8756d("login_weixin_username", str8);
                    C7624i3.f25910c.mo8756d("last_login_nick_name", str6);
                    C7624i3.f25910c.mo8755c(str7, i15, str9);
                    i19.mo119676J(2, str8);
                    i19.mo119676J(42, str5);
                    i19.mo119676J(9, Integer.valueOf(i15));
                    i19.mo119676J(4, str6);
                    i19.mo119676J(5, str9);
                    i19.mo119676J(6, str7);
                    i19.mo119676J(7, Integer.valueOf(i16));
                    i19.mo119676J(21, str10);
                    i19.mo119676J(22, str11);
                    i19.mo119676J(57, 0);
                    i19.mo119676J(17, Integer.valueOf(i17));
                    i19.mo119676J(25, Integer.valueOf(i18));
                    i19.mo119676J(1, str12);
                    i19.mo119676J(29, str13);
                    i19.mo119676J(34, 0);
                    i19.mo119676J(256, Boolean.FALSE);
                    Log.m105924i("MicroMsg.HandleAuthResponse", "summerstatus USERINFO_FORCE_UPDATE_AUTH set false");
                    i19.mo119676J(-1535680990, str14);
                    i19.mo119676J(46, (Object) null);
                    i19.mo119676J(72, (Object) null);
                    i19.mo119676J(64, -1);
                    i19.mo119681a(true);
                    c0Var = this;
                    ((C118231b) C86312j.m106911c(C118231b.class)).f353396d.onRegResponse(u0Var, c0Var.f344000j, c0Var.f344001n, c0Var.f343997g, c0Var.f343999i, 0);
                    str2 = "MicroMsg.NetSceneReg";
                }
                C118195u0 u0Var3 = u0Var;
                C118468t33 t336 = u0Var3.f353324a;
                C116746l3.m164676c(false, t336.f354424p, t336.f354428t, t336.f354400A, false, 0);
                C86709a0.m107535s().mo121142i().mo119681a(true);
                C86709a0.m107524d().mo123460f(new C75576f4(new C114742b(c0Var, u0Var3), (String) null));
                Log.m105918d(str2, "resp return flag" + u0Var3.f353324a.f354429u);
                int i25 = u0Var3.f353324a.f354429u;
            }
            LinkedList linkedList = new LinkedList();
            linkedList.add(new C37007j.C37008a(21, "android-" + Build.VERSION.SDK_INT + "-" + C87203t.m108275k()));
            ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C37007j(linkedList));
            c0Var.f343994d.onSceneEnd(i2, i3, str, c0Var);
        } else {
            String str15 = str3;
            c0Var.f343994d.onSceneEnd(i4, i5, str15, c0Var);
        }
    }

    /* renamed from: p1 */
    public void mo174377p1(int i) {
        ((C118194t0) this.f343995e.getReqObj()).f353322a.f354344N = i;
    }

    /* renamed from: q1 */
    public void mo174378q1(String str) {
        if (!Util.isNullOrNil(str)) {
            ((C118194t0) this.f343995e.getReqObj()).f353322a.f354345P = str;
            Log.m105925i("MicroMsg.NetSceneReg", "setRegSessionId %s", str);
        }
    }

    /* renamed from: r1 */
    public void mo174379r1(String str) {
        if (!Util.isNullOrNil(str)) {
            ((C118194t0) this.f343995e.getReqObj()).f353322a.f354347R = str;
            Log.m105925i("MicroMsg.NetSceneReg", "thirdAppTicket %s", str);
        }
    }

    public int securityLimitCount() {
        return 3;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return y$$d.EOk;
    }

    public void setSecurityCheckError(y$$c y__c) {
    }
}
