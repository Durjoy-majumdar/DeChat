package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.C96986x1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f40.C86709a0;
import java.util.Vector;
import jr2.C99014h;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89137b0;
import os2.C100398c0;
import os2.C100399d0;
import p239sv.C77792p;
import re0.C36313j;
import te3.n94;
import te3.o94;
import te3.p94;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.model.t0 */
public class C94948t0 extends C117747y implements C1311n, C99014h {

    /* renamed from: D */
    public static Vector<String> f275216D = new Vector<>();

    /* renamed from: A */
    public int f275217A;

    /* renamed from: B */
    public int f275218B;

    /* renamed from: C */
    public int f275219C;

    /* renamed from: d */
    public C47350c f275220d;

    /* renamed from: e */
    public String f275221e;

    /* renamed from: f */
    public boolean f275222f;

    /* renamed from: g */
    public boolean f275223g;

    /* renamed from: h */
    public long f275224h;

    /* renamed from: i */
    public long f275225i;

    /* renamed from: j */
    public long f275226j;

    /* renamed from: n */
    public int f275227n;

    /* renamed from: o */
    public boolean f275228o;

    /* renamed from: p */
    public String f275229p;

    /* renamed from: q */
    public String f275230q;

    /* renamed from: r */
    public boolean f275231r;

    /* renamed from: s */
    public boolean f275232s;

    /* renamed from: t */
    public boolean f275233t;

    /* renamed from: u */
    public boolean f275234u;

    /* renamed from: v */
    public int f275235v;

    /* renamed from: w */
    public int f275236w;

    /* renamed from: x */
    public C11385n f275237x;

    /* renamed from: y */
    public long f275238y;

    /* renamed from: z */
    public int f275239z;

    /* renamed from: com.tencent.mm.plugin.sns.model.t0$a */
    public class C94949a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ o94 f275240d;

        public C94949a(o94 o94) {
            this.f275240d = o94;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage$1");
            Log.m105925i("MicroMsg.NetSceneSnsWwUserPage", "doFetchByContinueID continueID:%s", Long.valueOf(this.f275240d.f184642f));
            C86709a0.m107528h();
            C89137b0 b0Var = C86709a0.m107529k().f251779b;
            o94 o94 = this.f275240d;
            String str = o94.f184641e;
            long j = o94.f184642f;
            C94948t0 t0Var = C94948t0.this;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
            boolean z = t0Var.f275223g;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
            o94 o942 = this.f275240d;
            int i = o942.f184643g;
            C94948t0 t0Var2 = C94948t0.this;
            int i2 = t0Var2.f275239z;
            int i3 = o942.f184646j;
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
            int i4 = t0Var2.f275235v;
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
            C94948t0 t0Var3 = C94948t0.this;
            int i5 = t0Var3.f275217A;
            SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
            int i6 = t0Var3.f275219C;
            SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
            int i7 = i5;
            C94948t0 t0Var4 = r5;
            C94948t0 t0Var5 = new C94948t0(str, j, z, i, i2, i3, i4, i7, 1 + i6);
            b0Var.mo123460f(t0Var4);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage$1");
        }
    }

    public C94948t0(String str, long j, boolean z, int i, int i2, int i3, int i4, int i5) {
        this(str, j, z, i, i2, i3, i4, i5, 1);
    }

    /* renamed from: j1 */
    public static synchronized boolean m120584j1(String str) {
        synchronized (C94948t0.class) {
            SnsMethodCalculate.markStartTimeMs("addSnsWwUserReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
            if (f275216D.contains(str)) {
                SnsMethodCalculate.markEndTimeMs("addSnsWwUserReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
                return false;
            }
            f275216D.add(str);
            SnsMethodCalculate.markEndTimeMs("addSnsWwUserReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
            return true;
        }
    }

    /* renamed from: o1 */
    public static synchronized boolean m120585o1(String str) {
        synchronized (C94948t0.class) {
            SnsMethodCalculate.markStartTimeMs("removeWwUserReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
            f275216D.remove(str);
            SnsMethodCalculate.markEndTimeMs("removeWwUserReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        }
        return true;
    }

    /* renamed from: C */
    public String mo131161C() {
        SnsMethodCalculate.markStartTimeMs("getRecentTips", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        String str = this.f275230q;
        SnsMethodCalculate.markEndTimeMs("getRecentTips", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        return str;
    }

    /* renamed from: C0 */
    public boolean mo131162C0() {
        SnsMethodCalculate.markStartTimeMs("isBgChange", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        boolean z = this.f275228o;
        SnsMethodCalculate.markEndTimeMs("isBgChange", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        return z;
    }

    /* renamed from: D0 */
    public boolean mo131163D0() {
        SnsMethodCalculate.markStartTimeMs("isPrivacy", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        boolean z = this.f275234u;
        SnsMethodCalculate.markEndTimeMs("isPrivacy", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        return z;
    }

    /* renamed from: M0 */
    public int mo131164M0() {
        SnsMethodCalculate.markStartTimeMs("getFetchMode", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        int i = this.f275239z;
        SnsMethodCalculate.markEndTimeMs("getFetchMode", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        return i;
    }

    /* renamed from: Z0 */
    public boolean mo131165Z0() {
        SnsMethodCalculate.markStartTimeMs("isFp", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        boolean z = this.f275222f;
        SnsMethodCalculate.markEndTimeMs("isFp", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        return z;
    }

    /* renamed from: a0 */
    public long mo131166a0() {
        SnsMethodCalculate.markStartTimeMs("getUserLastId", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        long j = this.f275226j;
        SnsMethodCalculate.markEndTimeMs("getUserLastId", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        return j;
    }

    public final int doScene(C114770g gVar, C11385n nVar) {
        SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        this.f275237x = nVar;
        int dispatch = dispatch(gVar, this.f275220d, this);
        SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        return dispatch;
    }

    /* renamed from: g1 */
    public boolean mo131167g1() {
        SnsMethodCalculate.markStartTimeMs("isUpAll", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        boolean z = this.f275232s;
        SnsMethodCalculate.markEndTimeMs("isUpAll", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        return z;
    }

    public int getType() {
        SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        return 5203;
    }

    public String getUserName() {
        SnsMethodCalculate.markStartTimeMs("getUserName", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        String str = this.f275221e;
        SnsMethodCalculate.markEndTimeMs("getUserName", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        return str;
    }

    /* renamed from: k */
    public boolean mo131169k() {
        SnsMethodCalculate.markStartTimeMs("isUpFetchFinish", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        SnsMethodCalculate.markEndTimeMs("isUpFetchFinish", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        return false;
    }

    /* renamed from: k1 */
    public final void mo131272k1(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("checkLocalData", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        int X90 = C94866e1.Yx0().X90(11, this.f275221e, this.f275223g);
        if (X90 <= 10 && X90 > 0 && i == 0 && i2 == 0) {
            this.f275233t = true;
        } else if (X90 == 0 || (X90 <= 10 && i2 == 207)) {
            this.f275231r = true;
        }
        SnsMethodCalculate.markEndTimeMs("checkLocalData", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
    }

    /* renamed from: l1 */
    public final void mo131273l1(o94 o94) {
        SnsMethodCalculate.markStartTimeMs("doFetchByContinueID", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        C94866e1.my0().post(new C94949a(o94));
        SnsMethodCalculate.markEndTimeMs("doFetchByContinueID", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
    }

    /* renamed from: m1 */
    public final void mo131274m1(p94 p94, String str) {
        SnsMethodCalculate.markStartTimeMs("insertListAndUpdateFaultInfo", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        C94897n1.m120370h(this.f275221e, this.f275235v, p94.f299104f, str);
        long j = this.f275225i;
        if (j == 0) {
            this.f275225i = p94.f299104f.getFirst().f283891Id;
        } else {
            this.f275225i = C43038l.m46673a(j);
        }
        this.f275226j = p94.f299104f.getLast().f283891Id;
        Log.m105925i("MicroMsg.NetSceneSnsWwUserPage", "insertListAndUpdateFaultInfo userName %s maxId %s minId %s NewRequestTime %s", this.f275221e, Long.valueOf(this.f275225i), Long.valueOf(this.f275226j), Integer.valueOf(p94.f299107i));
        C43038l.m46676d(this.f275221e, this.f275225i, this.f275226j, p94.f299107i);
        SnsMethodCalculate.markEndTimeMs("insertListAndUpdateFaultInfo", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
    }

    /* renamed from: n0 */
    public boolean mo131173n0() {
        SnsMethodCalculate.markStartTimeMs("isOtherFetch", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        int i = this.f275239z;
        boolean z = true;
        if (!(i == 0 || i == 2 || i == 1)) {
            z = false;
        }
        SnsMethodCalculate.markEndTimeMs("isOtherFetch", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        return z;
    }

    /* renamed from: n1 */
    public final boolean mo131275n1() {
        SnsMethodCalculate.markStartTimeMs("isAlbumSelf", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        boolean z = this.f275235v == 64;
        SnsMethodCalculate.markEndTimeMs("isAlbumSelf", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        return z;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        String str2;
        String str3;
        String str4;
        String str5;
        int i4 = i2;
        int i5 = i3;
        String str6 = str;
        SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        Log.m105924i("MicroMsg.NetSceneSnsWwUserPage", "netId : " + i + " errType :" + i4 + " errCode: " + i5 + " errMsg :" + str6);
        p94 p94 = (p94) ((C47350c) uVar).f127056b.f127083a;
        if (this.f275239z == -1) {
            SnsMethodCalculate.markStartTimeMs("handleNormalRequest", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
            if (this.f275220d.f127056b.getRetCode() == 207 || this.f275220d.f127056b.getRetCode() == 0 || C96986x1.m124656a(this.f275220d.f127056b.getRetCode())) {
                if (this.f275220d.f127056b.getRetCode() == 2003) {
                    C94866e1.Yx0().mo139823kD(this.f275221e);
                }
                this.f275230q = p94.f299112q;
                this.f275236w = p94.f299108j;
                Log.m105924i("MicroMsg.NetSceneSnsWwUserPage", "ForSameMd5 count: " + p94.f299108j + " , objCount:" + p94.f299103e + ", retTips:" + this.f275230q + ", ContinueID:" + p94.f299111p + ", requestTime:" + this.f275219C);
                this.f275238y = p94.f299110o;
                String p0 = C102236a0.m134763p0(this.f275225i);
                this.f275218B = p94.f299104f.size();
                if (!this.f275222f) {
                    Log.m105918d("MicroMsg.NetSceneSnsWwUserPage", "np  " + p94.f299104f.size());
                    if (!p94.f299104f.isEmpty()) {
                        mo131274m1(p94, p0);
                    } else if (p94.f299111p == 0 || this.f275220d.f127056b.getRetCode() == 207 || this.f275219C > 50) {
                        this.f275234u = this.f275220d.f127056b.getRetCode() == 203;
                        C94866e1.Yx0().Bx0(this.f275221e, this.f275223g, p0);
                        this.f275231r = true;
                        this.f275226j = this.f275225i;
                    } else {
                        o94 o94 = (o94) this.f275220d.f127055a.f127080a;
                        o94.f184642f = p94.f299111p;
                        mo131273l1(o94);
                    }
                    m120585o1(this.f275221e);
                    this.f275237x.onSceneEnd(i4, i5, str6, this);
                    SnsMethodCalculate.markEndTimeMs("handleNormalRequest", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
                } else {
                    C94866e1.Xx0().mo139777NQ(this.f275221e, p94.f299114s);
                    if (this.f275229p.equals(p94.f299102d)) {
                        long Ab0 = C94866e1.Yx0().Ab0(this.f275222f ? 0 : this.f275224h, this.f275236w, this.f275221e, this.f275223g);
                        this.f275226j = Ab0;
                        Log.m105925i("MicroMsg.NetSceneSnsWwUserPage", "md5 is nochange the new minid %s", Long.valueOf(Ab0));
                        mo131272k1(i4, i5);
                        m120585o1(this.f275221e);
                        C100398c0 Yt = C94866e1.Xx0().mo139782Yt(this.f275221e);
                        this.f275237x.onSceneEnd(Yt.field_lastFirstPageRequestErrType, Yt.field_lastFirstPageRequestErrCode, str6, this);
                        SnsMethodCalculate.markEndTimeMs("handleNormalRequest", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
                    } else {
                        Log.m105924i("MicroMsg.NetSceneSnsWwUserPage", "fp  " + p94.f299104f.size());
                        SnsMethodCalculate.markStartTimeMs("readfpInfo", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
                        if (!this.f275222f || this.f275229p.equals(p94.f299102d)) {
                            str2 = "onGYNetEnd";
                            str4 = "handleNormalRequest";
                            str3 = p0;
                            SnsMethodCalculate.markEndTimeMs("readfpInfo", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
                        } else {
                            this.f275227n = p94.f299105g;
                            C100398c0 Yt2 = C94866e1.Xx0().mo139782Yt(this.f275221e);
                            Yt2.field_icount = this.f275227n;
                            n94 n94 = p94.f299116u;
                            if (n94 != null) {
                                String str7 = n94.f298908j;
                                str2 = "onGYNetEnd";
                                String YO = C94866e1.m120262YO();
                                str3 = p0;
                                StringBuilder sb = new StringBuilder();
                                str4 = "handleNormalRequest";
                                sb.append(this.f275221e);
                                sb.append("bg_");
                                String sb4 = sb.toString();
                                String str8 = this.f275221e + "tbg_";
                                if (Yt2.field_bgUrl == null || (str5 = Yt2.field_bgId) == null || !str5.equals(str7)) {
                                    Yt2.field_older_bgId = Yt2.field_bgId;
                                    if (C86013q1.m106450k(C94938q1.m120518e(YO, this.f275221e) + sb4)) {
                                        C86013q1.m106447h(C94938q1.m120518e(YO, this.f275221e) + str8);
                                        C86013q1.m106435Q(C94938q1.m120518e(YO, this.f275221e), sb4, str8);
                                    }
                                    this.f275228o = true;
                                    Yt2.mo139772o2();
                                    Log.m105918d("MicroMsg.NetSceneSnsWwUserPage", "get new BGurl: " + n94.f298903e);
                                }
                                Yt2.field_bgId = str7;
                                Yt2.field_bgUrl = n94.f298903e;
                                Yt2.field_snsBgId = 0;
                                Yt2.field_imBGaeskey = n94.f298906h;
                                Yt2.field_imBGauthkey = n94.f298907i;
                                Yt2.field_imBGmd5sum = n94.f298905g;
                                Yt2.field_imBGfileid = n94.f298909n;
                                C72996z1 z1Var = C94866e1.Jx0().get(this.f275221e);
                                if (z1Var != null) {
                                    if ((((C36313j) ((C77792p) C86312j.m106911c(C77792p.class)).T20()).mo60611Lo(this.f275221e) & 2) == 0) {
                                        z1Var.mo62902g4("");
                                    } else {
                                        z1Var.mo62902g4(n94.f298902d);
                                    }
                                }
                                Log.m105925i("MicroMsg.NetSceneSnsWwUserPage", "readfpInfo, id:%s, url:%s", Yt2.field_bgId, Yt2.field_bgUrl);
                            } else {
                                str2 = "onGYNetEnd";
                                str4 = "handleNormalRequest";
                                str3 = p0;
                            }
                            C94866e1.Xx0().mo139775LL(Yt2);
                            SnsMethodCalculate.markEndTimeMs("readfpInfo", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
                        }
                        if (this.f275220d.f127056b.getRetCode() == 207 || this.f275220d.f127056b.getRetCode() == 2001 || this.f275220d.f127056b.getRetCode() == 2004 || this.f275220d.f127056b.getRetCode() == 2005) {
                            int i6 = i2;
                            int i7 = i3;
                            String str9 = str3;
                            String str10 = str4;
                            C94866e1.Xx0().mo139785bO(this.f275221e, "");
                            if (!p94.f299104f.isEmpty()) {
                                if (mo131275n1()) {
                                    C94866e1.Xx0().mo139780TE(this.f275221e, p94.f299102d, i6, i7);
                                } else {
                                    C94866e1.Xx0().mo139788mI(this.f275221e, p94.f299102d, i6, i7);
                                }
                                C94866e1.Yx0().zx0(this.f275221e, this.f275223g, C102236a0.m134763p0(p94.f299104f.getFirst().f283891Id));
                                C94866e1.Yx0().Bx0(this.f275221e, this.f275223g, C102236a0.m134763p0(p94.f299104f.getLast().f283891Id));
                                mo131274m1(p94, str9);
                            } else if (p94.f299111p == 0 || this.f275220d.f127056b.getRetCode() == 207 || this.f275219C > 50) {
                                C94866e1.Yx0().Ax0(this.f275221e, this.f275223g);
                                this.f275226j = this.f275225i;
                            } else {
                                o94 o942 = (o94) this.f275220d.f127055a.f127080a;
                                o942.f184642f = p94.f299111p;
                                mo131273l1(o942);
                            }
                            mo131272k1(i6, i7);
                            m120585o1(this.f275221e);
                            this.f275237x.onSceneEnd(i6, i7, str6, this);
                            SnsMethodCalculate.markEndTimeMs(str10, "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
                        } else if (p94.f299104f.size() == 0) {
                            if (p94.f299111p == 0 || this.f275220d.f127056b.getRetCode() == 207 || this.f275219C > 50) {
                                Log.m105918d("MicroMsg.NetSceneSnsWwUserPage", "error: server give size zero");
                                this.f275237x.onSceneEnd(i2, i3, str6, this);
                            } else {
                                o94 o943 = (o94) this.f275220d.f127055a.f127080a;
                                o943.f184642f = p94.f299111p;
                                mo131273l1(o943);
                            }
                            SnsMethodCalculate.markEndTimeMs(str4, "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
                        } else {
                            int i8 = i2;
                            int i9 = i3;
                            String str11 = str4;
                            if (mo131275n1()) {
                                C94866e1.Xx0().mo139780TE(this.f275221e, p94.f299102d, i8, i9);
                            } else {
                                C94866e1.Xx0().mo139788mI(this.f275221e, p94.f299102d, i8, i9);
                            }
                            mo131274m1(p94, str3);
                            m120585o1(this.f275221e);
                            this.f275237x.onSceneEnd(i8, i9, str6, this);
                            SnsMethodCalculate.markEndTimeMs(str11, "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
                        }
                    }
                }
            } else {
                m120585o1(this.f275221e);
                this.f275237x.onSceneEnd(i4, i5, str6, this);
                SnsMethodCalculate.markEndTimeMs("handleNormalRequest", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
            }
            str2 = "onGYNetEnd";
        } else {
            str2 = "onGYNetEnd";
            int i15 = i5;
            int i16 = i4;
            SnsMethodCalculate.markStartTimeMs("handleAdvanceRequest", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
            if (this.f275220d.f127056b.getRetCode() == 207 || this.f275220d.f127056b.getRetCode() == 0 || C96986x1.m124656a(this.f275220d.f127056b.getRetCode())) {
                this.f275230q = p94.f299112q;
                this.f275236w = p94.f299108j;
                Log.m105924i("MicroMsg.NetSceneSnsWwUserPage", "ForSameMd5: " + p94.f299108j + " , objCount:  " + p94.f299103e + ", retTips:" + this.f275230q + ", prePageDayEndFlag:" + p94.f299115t + ", ObjectList:" + p94.f299104f.size() + ", ContinueID:" + p94.f299111p + ", requestTime:" + this.f275219C);
                this.f275238y = p94.f299110o;
                if (p94.f299104f.size() == 0) {
                    if (p94.f299111p == 0 || this.f275220d.f127056b.getRetCode() == 207 || this.f275219C > 50) {
                        Log.m105920e("MicroMsg.NetSceneSnsWwUserPage", "error: server give size zero");
                        this.f275234u = this.f275220d.f127056b.getRetCode() == 203;
                        if (this.f275239z == 1) {
                            this.f275232s = true;
                        } else {
                            this.f275231r = true;
                        }
                        m120585o1(this.f275221e);
                        this.f275237x.onSceneEnd(i16, i15, str6, this);
                        this.f275226j = this.f275225i;
                    } else {
                        o94 o944 = (o94) this.f275220d.f127055a.f127080a;
                        o944.f184642f = p94.f299111p;
                        mo131273l1(o944);
                    }
                    SnsMethodCalculate.markEndTimeMs("handleAdvanceRequest", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
                } else {
                    int i17 = this.f275239z;
                    if (i17 == 1) {
                        if (p94.f299115t) {
                            long j = p94.f299104f.getFirst().f283891Id;
                        }
                    } else if (i17 == 0) {
                        long j2 = p94.f299104f.getFirst().f283891Id;
                    }
                    String p05 = C102236a0.m134763p0(p94.f299104f.getFirst().f283891Id);
                    SnsMethodCalculate.markStartTimeMs("insertSearchCacheList", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
                    C94897n1.m120370h(this.f275221e, this.f275235v, p94.f299104f, p05);
                    C94897n1.m120382t(p94.f299104f, this.f275239z);
                    Log.m105925i("MicroMsg.NetSceneSnsWwUserPage", "insertSearchCacheList userName:%s maxId:%s minId:%s NewRequestTime:%s", this.f275221e, Long.valueOf(C94897n1.f274987a), Long.valueOf(C94897n1.f274988b), Integer.valueOf(p94.f299107i));
                    SnsMethodCalculate.markEndTimeMs("insertSearchCacheList", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
                    m120585o1(this.f275221e);
                    this.f275237x.onSceneEnd(i16, i15, str6, this);
                    SnsMethodCalculate.markEndTimeMs("handleAdvanceRequest", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
                }
            } else {
                m120585o1(this.f275221e);
                this.f275237x.onSceneEnd(i16, i15, str6, this);
                SnsMethodCalculate.markEndTimeMs("handleAdvanceRequest", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
            }
        }
        SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
    }

    /* renamed from: p0 */
    public long mo131174p0() {
        SnsMethodCalculate.markStartTimeMs("getRecentLimitID", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        long j = this.f275238y;
        SnsMethodCalculate.markEndTimeMs("getRecentLimitID", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        return j;
    }

    /* renamed from: t0 */
    public boolean mo131175t0() {
        SnsMethodCalculate.markStartTimeMs("isDownAll", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        boolean z = this.f275231r;
        SnsMethodCalculate.markEndTimeMs("isDownAll", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        return z;
    }

    /* renamed from: w */
    public boolean mo131176w() {
        SnsMethodCalculate.markStartTimeMs("isNeedGetNextPage", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        boolean z = this.f275233t;
        SnsMethodCalculate.markEndTimeMs("isNeedGetNextPage", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        return z;
    }

    /* renamed from: y */
    public int mo131177y() {
        SnsMethodCalculate.markStartTimeMs("respCount", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        int i = this.f275218B;
        SnsMethodCalculate.markEndTimeMs("respCount", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage");
        return i;
    }

    public C94948t0(String str, long j, boolean z, int i, int i2, int i3, int i4, int i5, int i6) {
        String str2 = str;
        long j2 = j;
        int i7 = i;
        int i8 = i2;
        long j3 = 0;
        this.f275224h = 0;
        this.f275226j = 0;
        this.f275227n = 0;
        this.f275228o = false;
        this.f275229p = "";
        this.f275230q = "";
        this.f275231r = false;
        this.f275232s = false;
        this.f275233t = false;
        this.f275234u = false;
        this.f275236w = 0;
        this.f275217A = 0;
        this.f275218B = 0;
        this.f275219C = i6;
        this.f275221e = str2;
        this.f275225i = j2;
        this.f275223g = z;
        this.f275239z = i8;
        int i9 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (i9 == 0) {
            Log.m105924i("MicroMsg.NetSceneSnsWwUserPage", "fp userName " + str2);
        } else {
            Log.m105924i("MicroMsg.NetSceneSnsWwUserPage", "np userName " + str2);
        }
        this.f275235v = i4;
        this.f275217A = i5;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new o94();
        bVar.f127067b = new p94();
        bVar.f127068c = "/cgi-bin/micromsg-bin/mmsnswwuserpage";
        bVar.f127069d = 5203;
        C47350c a = bVar.mo72403a();
        this.f275220d = a;
        o94 o94 = (o94) a.f127055a.f127080a;
        o94.f184641e = str2;
        o94.f184642f = j2;
        o94.f184646j = i3;
        this.f275222f = i9 == 0;
        if (i8 == 1 || i8 == 2 || i8 == 0) {
            o94.f184644h = 0;
            o94.f184643g = i7;
            if (i8 == 1) {
                o94.f184647n = 1;
            }
            this.f275235v = 16;
            Log.m105925i("MicroMsg.NetSceneSnsWwUserPage", "maxId:%s, minId:%s, snsSource:%s, pullType:%s", C102236a0.m134765q0(j), C102236a0.m134765q0(this.f275226j), Integer.valueOf(i), Integer.valueOf(o94.f184647n));
        } else {
            int i15 = C94866e1.dy0().mo6418i(str2);
            long Ab0 = C94866e1.Yx0().Ab0(!this.f275222f ? j2 : j3, i15, str, z);
            this.f275226j = Ab0;
            o94.f184644h = Ab0;
            int c = C43038l.m46675c(Ab0, j2, str2);
            o94.f184645i = c;
            o94.f184643g = i7;
            if (this.f275222f) {
                if (mo131275n1()) {
                    C100399d0 Xx0 = C94866e1.Xx0();
                    Xx0.getClass();
                    SnsMethodCalculate.markStartTimeMs("getAlbumMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
                    String str3 = Xx0.mo139782Yt(str2).field_albumMd5;
                    SnsMethodCalculate.markEndTimeMs("getAlbumMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
                    this.f275229p = str3;
                } else {
                    C100399d0 Xx02 = C94866e1.Xx0();
                    Xx02.getClass();
                    SnsMethodCalculate.markStartTimeMs("getMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
                    String str4 = Xx02.mo139782Yt(str2).field_md5;
                    SnsMethodCalculate.markEndTimeMs("getMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
                    this.f275229p = str4;
                }
                if (this.f275229p == null) {
                    this.f275229p = "";
                }
                o94.f184640d = this.f275229p;
            }
            Log.m105924i("MicroMsg.NetSceneSnsWwUserPage", "nextCount: " + i15 + " maxId:" + C102236a0.m134765q0(j) + " minId:" + C102236a0.m134765q0(this.f275226j) + " lastReqTime:" + c + " snsSource:" + i7 + " FirstPageMd5:" + this.f275229p);
        }
        this.f275224h = j2;
    }
}
