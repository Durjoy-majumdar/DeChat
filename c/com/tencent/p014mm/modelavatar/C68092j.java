package com.tencent.p014mm.modelavatar;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.p014mm.modelstat.C29048w;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.ImgUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.QueueWorkerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C31519v2;
import eb0.C31536y2;
import f40.C86709a0;
import f62.C75700k0;
import junit.framework.Assert;
import ob0.C11385n;
import ob0.C117747y;
import p196ln.C61311l;
import p206nj.C76861g;
import z51.C102975i;
import zt3.C119157j;

/* renamed from: com.tencent.mm.modelavatar.j */
public class C68092j implements C11385n, C61311l {

    /* renamed from: d */
    public C68097n f195708d = null;

    /* renamed from: e */
    public C61311l.C61312a f195709e = null;

    /* renamed from: f */
    public C92727q f195710f = null;

    /* renamed from: g */
    public boolean f195711g = true;

    /* renamed from: h */
    public boolean f195712h = true;

    /* renamed from: i */
    public Handler f195713i = null;

    /* renamed from: com.tencent.mm.modelavatar.j$a */
    public static abstract class C68093a implements QueueWorkerThread.ThreadObject, Runnable {

        /* renamed from: d */
        public final Handler f195714d;

        /* renamed from: com.tencent.mm.modelavatar.j$a$a */
        public class C68094a implements Runnable {
            public C68094a() {
            }

            public void run() {
                C68093a.this.onPostExecute();
            }
        }

        public C68093a(Handler handler) {
            this.f195714d = handler;
        }

        public void run() {
            if (doInBackground()) {
                this.f195714d.post(new C68094a());
            }
        }
    }

    /* renamed from: com.tencent.mm.modelavatar.j$b */
    public class C68095b extends C68093a {

        /* renamed from: e */
        public C68097n f195716e;

        /* renamed from: f */
        public String f195717f;

        /* renamed from: g */
        public String f195718g;

        /* renamed from: h */
        public boolean f195719h = true;

        /* renamed from: i */
        public boolean f195720i = false;

        public C68095b(C68097n nVar, String str, String str2, boolean z) {
            super(C68092j.this.f195713i);
            this.f195716e = nVar;
            this.f195717f = str;
            this.f195718g = str2;
        }

        public boolean doInBackground() {
            if (ImgUtil.isWXGF(this.f195718g)) {
                this.f195720i = true;
                Log.m105924i("MicroMsg.GetHDHeadImgHelper", "DecryptAvatar: hevc to pic start");
                C115669n nVar = C115669n.INSTANCE;
                nVar.mo175911u(138, 63);
                String str = this.f195718g + "_hevc";
                boolean x = C86013q1.m106463x(this.f195718g, str);
                boolean e = C86013q1.m106444e(this.f195718g);
                String i = C86013q1.m106448i(this.f195718g, true);
                String i2 = C86013q1.m106448i(str, false);
                if (i == null || i2 == null) {
                    Log.m105925i("MicroMsg.GetHDHeadImgHelper", "DecryptAvatar: uri is null %s, %s; path %s, %s; result %s, %s", i, i2, this.f195718g, str, Boolean.valueOf(x), Boolean.valueOf(e));
                    nVar.mo175911u(138, 65);
                    return true;
                }
                int GF = ((C102975i) C86312j.m106911c(C102975i.class)).mo141694GF(i2, i);
                C86013q1.m106447h(str);
                if (GF != 0) {
                    nVar.mo175911u(138, 64);
                    Log.m105924i("MicroMsg.GetHDHeadImgHelper", "DecryptAvatar: hevc to pic failed");
                    return true;
                }
            }
            this.f195719h = false;
            return true;
        }

        public boolean onPostExecute() {
            C68092j.this.getClass();
            if (this.f195719h) {
                if (!this.f195720i || !C68092j.this.f195711g) {
                    C68092j.this.f195709e.mo1218a(3, -1);
                } else {
                    Log.m105924i("MicroMsg.GetHDHeadImgHelper", "onPostExecute: first request hevc failed");
                    C68092j jVar = C68092j.this;
                    jVar.f195711g = false;
                    jVar.f195712h = false;
                    ((C119157j) C119157j.f356862d).mo183885p(new C68096c(this.f195716e), "get-hd-headimg");
                }
                return false;
            }
            C86013q1.m106447h(this.f195717f);
            C86013q1.m106463x(this.f195718g, this.f195717f);
            C92727q.m116894k1(this.f195717f, this.f195716e.mo93598g());
            C68092j.this.f195709e.mo1218a(0, 0);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.modelavatar.j$c */
    public class C68096c extends C68093a {

        /* renamed from: e */
        public C68097n f195722e;

        /* renamed from: f */
        public String f195723f = null;

        /* renamed from: g */
        public String f195724g;

        /* renamed from: h */
        public boolean f195725h = true;

        /* renamed from: i */
        public C76861g.C47263a f195726i;

        public C68096c(C68097n nVar) {
            super(C68092j.this.f195713i);
            this.f195722e = nVar;
            this.f195723f = C68102u.wx0().mo93559h(nVar.mo93598g(), true);
            this.f195724g = this.f195723f + ".tmp";
            this.f195726i = new C76861g.C47263a();
        }

        /* JADX WARNING: Removed duplicated region for block: B:57:0x0195 A[SYNTHETIC, Splitter:B:57:0x0195] */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x019d A[Catch:{ Exception -> 0x0199 }] */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x01bb A[SYNTHETIC, Splitter:B:67:0x01bb] */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x01c3 A[Catch:{ Exception -> 0x01bf }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean doInBackground() {
            /*
                r15 = this;
                java.lang.String r0 = "Size"
                java.lang.String r1 = "close conn failed : %s"
                java.lang.String r2 = "exception:%s"
                com.tencent.mm.modelavatar.n r3 = r15.f195722e
                r4 = 0
                if (r3 != 0) goto L_0x000c
                return r4
            L_0x000c:
                java.lang.String r3 = r3.mo93594c()
                java.lang.Class<z51.i> r5 = z51.C102975i.class
                di3.d r5 = di3.C86312j.m106911c(r5)
                z51.i r5 = (z51.C102975i) r5
                boolean r5 = r5.mo141697he()
                com.tencent.mm.modelavatar.j r6 = com.tencent.p014mm.modelavatar.C68092j.this
                boolean r6 = r6.f195712h
                java.lang.String r7 = "MicroMsg.GetHDHeadImgHelper"
                if (r6 == 0) goto L_0x005f
                if (r5 == 0) goto L_0x005f
                java.lang.String r5 = "GetHeadImgObj: get hevc"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r5)
                java.lang.String r5 = "?"
                boolean r5 = r3.contains(r5)
                if (r5 == 0) goto L_0x0045
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r3)
                java.lang.String r3 = "&tp=wxpic"
                r5.append(r3)
                java.lang.String r3 = r5.toString()
                goto L_0x0056
            L_0x0045:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r3)
                java.lang.String r3 = "?tp=wxpic"
                r5.append(r3)
                java.lang.String r3 = r5.toString()
            L_0x0056:
                com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r6 = 138(0x8a, float:1.93E-43)
                r8 = 60
                r5.mo175911u(r6, r8)
            L_0x005f:
                f40.e r5 = f40.C86709a0.m107523b()
                boolean r5 = r5.mo121114l()
                r6 = 2
                r8 = 3
                r9 = 1
                if (r5 == 0) goto L_0x00c1
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r10 = "https://"
                r5.append(r10)
                r10 = 2131831344(0x7f112a30, float:1.929571E38)
                java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.WeChatHosts.domainString(r10)
                r5.append(r10)
                java.lang.String r10 = "/?version=%d&uin=%s&nettype=%d&signal=%d"
                r5.append(r10)
                java.lang.String r5 = r5.toString()
                r10 = 4
                java.lang.Object[] r10 = new java.lang.Object[r10]
                int r11 = qe3.C89625d.f257841g
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
                r10[r4] = r11
                f40.e r11 = f40.C86709a0.m107523b()
                int r11 = r11.mo121110g()
                java.lang.String r11 = p823sg.C77710q.m93738a(r11)
                r10[r9] = r11
                android.content.Context r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                int r11 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.getNetTypeForStat(r11)
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
                r10[r6] = r11
                com.tencent.mm.sdk.platformtools.ConnectivityCompat$Companion r11 = com.tencent.p014mm.sdk.platformtools.ConnectivityCompat.Companion
                int r11 = r11.getCompatMixStrength()
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
                r10[r8] = r11
                java.lang.String r5 = java.lang.String.format(r5, r10)
                goto L_0x00c3
            L_0x00c1:
                java.lang.String r5 = ""
            L_0x00c3:
                java.lang.Object[] r10 = new java.lang.Object[r8]
                com.tencent.mm.modelavatar.n r11 = r15.f195722e
                java.lang.String r11 = r11.mo93598g()
                r10[r4] = r11
                r10[r9] = r5
                r10[r6] = r3
                java.lang.String r11 = "dkreferer dkavatar user: %s referer: %s  url:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r11, r10)
                r15.f195725h = r9
                r10 = 0
                com.tencent.mm.network.d0 r11 = com.tencent.p014mm.network.C81035d.m98964e(r3, r10)     // Catch:{ Exception -> 0x0185, all -> 0x0181 }
                r11.f238063s = r9     // Catch:{ Exception -> 0x0177, all -> 0x0175 }
                r12 = 1223(0x4c7, float:1.714E-42)
                r11.f238062r = r12     // Catch:{ Exception -> 0x0177, all -> 0x0175 }
                java.lang.String r12 = "GET"
                r11.f238053i = r12     // Catch:{ Exception -> 0x0177, all -> 0x0175 }
                java.lang.String r12 = "referer"
                r11.mo112921e(r12, r5)     // Catch:{ Exception -> 0x0177, all -> 0x0175 }
                r5 = 5000(0x1388, float:7.006E-42)
                r11.f238049e = r5     // Catch:{ Exception -> 0x0177, all -> 0x0175 }
                r11.f238050f = r5     // Catch:{ Exception -> 0x0177, all -> 0x0175 }
                int r5 = com.tencent.p014mm.network.C81035d.m98960a(r11)     // Catch:{ Exception -> 0x0177, all -> 0x0175 }
                if (r5 == 0) goto L_0x0102
                java.lang.String r0 = "checkHttpConnection failed! url:%s"
                java.lang.Object[] r5 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x0177, all -> 0x0175 }
                r5[r4] = r3     // Catch:{ Exception -> 0x0177, all -> 0x0175 }
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r0, r5)     // Catch:{ Exception -> 0x0177, all -> 0x0175 }
                return r9
            L_0x0102:
                java.lang.String r3 = "X-Enc"
                int r3 = r11.mo112939m(r3, r4)     // Catch:{ Exception -> 0x0177, all -> 0x0175 }
                java.io.InputStream r3 = r11.getInputStream()     // Catch:{ Exception -> 0x0177, all -> 0x0175 }
                r5 = 1024(0x400, float:1.435E-42)
                byte[] r5 = new byte[r5]     // Catch:{ Exception -> 0x0172, all -> 0x016f }
                java.lang.String r12 = r15.f195724g     // Catch:{ Exception -> 0x0172, all -> 0x016f }
                java.io.OutputStream r10 = com.tencent.p014mm.vfs.C86013q1.m106429K(r12, r4)     // Catch:{ Exception -> 0x0172, all -> 0x016f }
                r12 = 0
            L_0x0117:
                int r13 = r3.read(r5)     // Catch:{ Exception -> 0x0172, all -> 0x016f }
                r14 = -1
                if (r13 == r14) goto L_0x0123
                r10.write(r5, r4, r13)     // Catch:{ Exception -> 0x0172, all -> 0x016f }
                int r12 = r12 + r13
                goto L_0x0117
            L_0x0123:
                int r5 = r11.mo112936j()     // Catch:{ Exception -> 0x0172, all -> 0x016f }
                int r5 = r11.mo112939m(r0, r5)     // Catch:{ Exception -> 0x0172, all -> 0x016f }
                if (r12 != r5) goto L_0x0130
                r15.f195725h = r4     // Catch:{ Exception -> 0x0172, all -> 0x016f }
                goto L_0x014d
            L_0x0130:
                java.lang.String r5 = "download size error. %d, %s, %d"
                java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x0172, all -> 0x016f }
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ Exception -> 0x0172, all -> 0x016f }
                r8[r4] = r12     // Catch:{ Exception -> 0x0172, all -> 0x016f }
                java.lang.String r0 = r11.mo112922f(r0)     // Catch:{ Exception -> 0x0172, all -> 0x016f }
                r8[r9] = r0     // Catch:{ Exception -> 0x0172, all -> 0x016f }
                int r0 = r11.mo112936j()     // Catch:{ Exception -> 0x0172, all -> 0x016f }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0172, all -> 0x016f }
                r8[r6] = r0     // Catch:{ Exception -> 0x0172, all -> 0x016f }
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r5, r8)     // Catch:{ Exception -> 0x0172, all -> 0x016f }
            L_0x014d:
                r3.close()     // Catch:{ Exception -> 0x0157 }
                if (r10 == 0) goto L_0x01b7
                r10.close()     // Catch:{ Exception -> 0x0157 }
                goto L_0x01b7
            L_0x0157:
                r0 = move-exception
                java.lang.Object[] r3 = new java.lang.Object[r9]
                java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
                r3[r4] = r5
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r2, r3)
                java.lang.Object[] r2 = new java.lang.Object[r9]
                java.lang.String r0 = r0.getMessage()
                r2[r4] = r0
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r1, r2)
                goto L_0x01b7
            L_0x016f:
                r0 = move-exception
                r5 = r10
                goto L_0x017b
            L_0x0172:
                r0 = move-exception
                r5 = r10
                goto L_0x017f
            L_0x0175:
                r0 = move-exception
                goto L_0x0179
            L_0x0177:
                r0 = move-exception
                goto L_0x017d
            L_0x0179:
                r3 = r10
                r5 = r3
            L_0x017b:
                r10 = r11
                goto L_0x01b9
            L_0x017d:
                r3 = r10
                r5 = r3
            L_0x017f:
                r10 = r11
                goto L_0x0188
            L_0x0181:
                r0 = move-exception
                r3 = r10
                r5 = r3
                goto L_0x01b9
            L_0x0185:
                r0 = move-exception
                r3 = r10
                r5 = r3
            L_0x0188:
                java.lang.Object[] r6 = new java.lang.Object[r9]     // Catch:{ all -> 0x01b8 }
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)     // Catch:{ all -> 0x01b8 }
                r6[r4] = r0     // Catch:{ all -> 0x01b8 }
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r2, r6)     // Catch:{ all -> 0x01b8 }
                if (r3 == 0) goto L_0x019b
                r3.close()     // Catch:{ Exception -> 0x0199 }
                goto L_0x019b
            L_0x0199:
                r0 = move-exception
                goto L_0x01a1
            L_0x019b:
                if (r5 == 0) goto L_0x01b7
                r5.close()     // Catch:{ Exception -> 0x0199 }
                goto L_0x01b7
            L_0x01a1:
                java.lang.Object[] r3 = new java.lang.Object[r9]
                java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
                r3[r4] = r5
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r2, r3)
                java.lang.Object[] r2 = new java.lang.Object[r9]
                java.lang.String r0 = r0.getMessage()
                r2[r4] = r0
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r1, r2)
            L_0x01b7:
                return r9
            L_0x01b8:
                r0 = move-exception
            L_0x01b9:
                if (r3 == 0) goto L_0x01c1
                r3.close()     // Catch:{ Exception -> 0x01bf }
                goto L_0x01c1
            L_0x01bf:
                r3 = move-exception
                goto L_0x01c7
            L_0x01c1:
                if (r5 == 0) goto L_0x01dd
                r5.close()     // Catch:{ Exception -> 0x01bf }
                goto L_0x01dd
            L_0x01c7:
                java.lang.Object[] r5 = new java.lang.Object[r9]
                java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r3)
                r5[r4] = r6
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r2, r5)
                java.lang.Object[] r2 = new java.lang.Object[r9]
                java.lang.String r3 = r3.getMessage()
                r2[r4] = r3
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r1, r2)
            L_0x01dd:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelavatar.C68092j.C68096c.doInBackground():boolean");
        }

        public boolean onPostExecute() {
            C68092j.this.getClass();
            if (this.f195725h || Util.isNullOrNil(this.f195723f)) {
                C68092j.this.f195709e.mo1218a(4, -1);
                return false;
            }
            Log.m105918d("MicroMsg.GetHDHeadImgHelper", "dkavatar user:" + this.f195722e.mo93598g() + " urltime:" + this.f195726i.mo72288a());
            C31536y2 y2Var = C31519v2.f84271a;
            if (y2Var != null) {
                ((C29048w.C29055f) y2Var).mo56422a((int) C86013q1.m106451l(this.f195724g), 0, 0);
            }
            C68092j jVar = C68092j.this;
            ((C119157j) C119157j.f356862d).mo183885p(new C68095b(jVar.f195708d, this.f195723f, this.f195724g, false), "get-hd-headimg");
            return true;
        }
    }

    public C68092j() {
        C86709a0.m107524d().mo123455a(158, this);
    }

    /* renamed from: a */
    public void mo86278a() {
        C86709a0.m107524d().mo123470p(158, this);
    }

    /* renamed from: b */
    public int mo86279b(String str, C61311l.C61312a aVar) {
        return mo93589c(str, aVar, "");
    }

    /* renamed from: c */
    public int mo93589c(String str, C61311l.C61312a aVar, String str2) {
        Assert.assertTrue("GetHDHeadImg must set callback", aVar != null);
        if (Util.isNullOrNil(str)) {
            aVar.mo1218a(3, -101);
            return -101;
        } else if (((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str).mo62932t3()) {
            aVar.mo1218a(3, -104);
            return -104;
        } else {
            this.f195709e = aVar;
            String Z5 = C72996z1.m85811N4(str) ? C72996z1.m85829Z5(str) : str;
            this.f195708d = C68102u.zx0().mo93607Lo(Z5);
            Log.m105919d("MicroMsg.GetHDHeadImgHelper", "GetHDHeadImg: %s", Z5);
            C68097n nVar = this.f195708d;
            if (nVar == null || !nVar.mo93598g().equals(Z5)) {
                C68097n nVar2 = new C68097n();
                this.f195708d = nVar2;
                nVar2.mo93606o(Z5);
                if (!TextUtils.isEmpty(str2)) {
                    this.f195708d.mo93599h(str2);
                }
            }
            if (Util.isNullOrNil(this.f195708d.mo93594c())) {
                Log.m105929w("MicroMsg.GetHDHeadImgHelper", "dkhurl [%s] has NO URL flag:%d !", str, Integer.valueOf(this.f195708d.mo93596e()));
                this.f195710f = new C92727q(Z5);
                if (C86709a0.m107524d().mo123460f(this.f195710f)) {
                    return 0;
                }
                aVar.mo1218a(3, -102);
                return -102;
            }
            C68097n nVar3 = this.f195708d;
            if (this.f195713i == null) {
                this.f195713i = new Handler(Looper.myLooper());
            }
            ((C119157j) C119157j.f356862d).mo183885p(new C68096c(nVar3), "get-hd-headimg");
            return 0;
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C61311l.C61312a aVar = this.f195709e;
        if (aVar != null) {
            aVar.mo1218a(i, i2);
        }
    }
}
