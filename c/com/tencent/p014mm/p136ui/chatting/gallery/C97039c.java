package com.tencent.p014mm.p136ui.chatting.gallery;

import com.tencent.p014mm.modelcdntran.C92755e0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import f03.C97785g;
import hd0.C98408n0;
import hd0.C98410o0;
import hd0.C98429r0;
import hd0.C98442x0;
import l03.C99277b;
import p1081gi.C98127h;
import p682rz.C101487r;
import p682rz.C101488s;
import p682rz.C101491u;
import p682rz.C63688n;
import te3.C101783gu2;
import z04.C112551y;

/* renamed from: com.tencent.mm.ui.chatting.gallery.c */
public final class C97039c implements C97785g {

    /* renamed from: a */
    public final C72963f4 f284655a;

    /* renamed from: b */
    public C98408n0 f284656b;

    /* renamed from: c */
    public final C99277b f284657c;

    /* renamed from: d */
    public final C98442x0 f284658d;

    /* renamed from: e */
    public C98127h f284659e;

    /* renamed from: f */
    public C98408n0 f284660f;

    /* renamed from: g */
    public int f284661g;

    /* renamed from: h */
    public int f284662h;

    /* renamed from: i */
    public int f284663i;

    /* renamed from: j */
    public int f284664j;

    /* JADX WARNING: Removed duplicated region for block: B:13:0x00ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C97039c(com.tencent.p014mm.storage.C72963f4 r9, hd0.C98408n0 r10, l03.C99277b r11, hd0.C98442x0 r12) {
        /*
            r8 = this;
            java.lang.String r0 = "msg"
            gy3.C87412m.m108594g(r9, r0)
            java.lang.String r0 = "videoInfo"
            gy3.C87412m.m108594g(r10, r0)
            java.lang.String r0 = "reporter"
            gy3.C87412m.m108594g(r11, r0)
            java.lang.String r0 = "parseInfo"
            gy3.C87412m.m108594g(r12, r0)
            r8.<init>()
            r8.f284655a = r9
            r8.f284656b = r10
            r8.f284657c = r11
            r8.f284658d = r12
            java.lang.Class<lc3.b> r9 = lc3.C10485b.class
            k40.a r9 = f40.C86709a0.m107533q(r9)
            lc3.b r9 = (lc3.C10485b) r9
            pj.f r9 = r9.vh0()
            java.lang.String r10 = "AndroidOnlineVideoArgs"
            java.lang.String r9 = r9.mo107405c(r10)
            r10 = 0
            r11 = 1
            if (r9 == 0) goto L_0x0042
            int r12 = r9.length()
            if (r12 != 0) goto L_0x0040
            goto L_0x0042
        L_0x0040:
            r12 = 0
            goto L_0x0043
        L_0x0042:
            r12 = 1
        L_0x0043:
            r0 = 1048576(0x100000, float:1.469368E-39)
            r1 = 75
            r2 = 5
            r3 = 3
            r4 = 2
            r5 = 4
            java.lang.String r6 = "MicroMsg.C2COriginVideoDownloadTask"
            if (r12 != 0) goto L_0x00a9
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r7 = "online video config : "
            r12.append(r7)
            r12.append(r9)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r12)
            java.lang.String r12 = "config"
            gy3.C87412m.m108593f(r9, r12)
            z04.k r12 = new z04.k
            java.lang.String r7 = ";"
            r12.<init>((java.lang.String) r7)
            java.util.List r9 = r12.mo90760e(r9, r10)
            java.lang.String[] r12 = new java.lang.String[r10]
            java.lang.Object[] r9 = r9.toArray(r12)
            java.lang.String r12 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            gy3.C87412m.m108592e(r9, r12)
            java.lang.String[] r9 = (java.lang.String[]) r9
            int r12 = r9.length
            if (r12 < r5) goto L_0x00a9
            r12 = r9[r10]
            int r12 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r12, (int) r2)
            r8.f284661g = r12
            r12 = r9[r11]
            int r12 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r12, (int) r11)
            r8.f284662h = r12
            r12 = r9[r4]
            int r12 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r12, (int) r1)
            r8.f284664j = r12
            r9 = r9[r3]
            int r9 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r9, (int) r11)
            int r9 = r9 * r0
            r8.f284663i = r9
            r9 = 1
            goto L_0x00aa
        L_0x00a9:
            r9 = 0
        L_0x00aa:
            if (r9 != 0) goto L_0x00b4
            r8.f284661g = r2
            r8.f284662h = r11
            r8.f284664j = r1
            r8.f284663i = r0
        L_0x00b4:
            java.lang.Object[] r9 = new java.lang.Object[r5]
            int r12 = r8.f284661g
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r9[r10] = r12
            int r10 = r8.f284662h
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r9[r11] = r10
            int r10 = r8.f284664j
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r9[r4] = r10
            int r10 = r8.f284663i
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r9[r3] = r10
            java.lang.String r10 = "parseConfig preload[%d] downloadSec[%d], needFinish[%d], minStreamSize[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r10, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.gallery.C97039c.<init>(com.tencent.mm.storage.f4, hd0.n0, l03.b, hd0.x0):void");
    }

    /* renamed from: a */
    public void mo126303a() {
        C98408n0 Zd = ((C101491u) C86312j.m106911c(C101491u.class)).mo140806Zd(mo126307e());
        if (Zd != null) {
            this.f284660f = Zd;
        }
    }

    /* renamed from: b */
    public boolean mo126304b() {
        return true;
    }

    /* renamed from: c */
    public C97785g.C97786a mo126305c() {
        return null;
    }

    /* renamed from: d */
    public int mo126306d() {
        return this.f284664j;
    }

    /* renamed from: e */
    public String mo126307e() {
        C98127h hVar = this.f284659e;
        if (hVar != null) {
            return hVar.f287683S;
        }
        return null;
    }

    /* renamed from: f */
    public void mo126308f() {
        Log.m105924i("MicroMsg.C2COriginVideoDownloadTask", "finishRemaining()");
        C98127h hVar = this.f284659e;
        C98429r0.m127802H(hVar != null ? hVar.f287683S : null, 2);
    }

    /* renamed from: g */
    public Long mo126309g() {
        return Long.valueOf(this.f284655a.getMsgId());
    }

    public long getLength() {
        C98127h hVar = this.f284659e;
        return (long) (hVar != null ? hVar.f287687U : this.f284656b.f288566m);
    }

    public String getMediaId() {
        C98127h hVar = this.f284659e;
        if (hVar != null) {
            return hVar.field_mediaId;
        }
        return null;
    }

    /* renamed from: h */
    public String mo126312h() {
        C101783gu2 gu22;
        String str;
        Class cls = C101488s.class;
        if (Util.isNullOrNil(this.f284656b.f288546N)) {
            return null;
        }
        C98408n0 n0Var = this.f284656b;
        if (n0Var.f288576w == -1) {
            if (!C86013q1.m106450k(n0Var.mo137702f())) {
                str = ((C98410o0) ((C101488s) C86312j.m106911c(cls)).Kj0()).mo137728q(this.f284656b.f288546N);
            } else {
                str = this.f284656b.mo137702f();
            }
            return str;
        }
        String q = ((C98410o0) ((C101488s) C86312j.m106911c(cls)).Kj0()).mo137728q(this.f284656b.f288546N);
        if (this.f284655a.mo108769t2() == 1 && (gu22 = this.f284656b.f288538F) != null && gu22.f298309e) {
            try {
                String s = C86013q1.m106458s(q);
                if (s == null) {
                    s = "";
                }
                if (!C112551y.m153808h(s, "/", false, 2, (Object) null)) {
                    s = s + XVFSFile.SEPARATOR_CHAR;
                }
                String str2 = s + C86013q1.m106457r(q) + "_hd.mp4";
                boolean k = C86013q1.m106450k(str2);
                Log.m105924i("MicroMsg.C2COriginVideoDownloadTask", "local capture video, hdFilePath: " + str2 + ", exist: " + k);
                if (k) {
                    return str2;
                }
            } catch (Exception e) {
                Log.m105920e("MicroMsg.C2COriginVideoDownloadTask", "try to get hd filePath error: " + e.getMessage());
            }
        }
        return q;
    }

    /* renamed from: i */
    public final C98408n0 mo135897i(String str) {
        if (str == null) {
            return null;
        }
        C98408n0 n0Var = this.f284656b;
        n0Var.f288546N = str;
        n0Var.f288552T = true;
        C98408n0 n0Var2 = new C98408n0();
        n0Var2.f288570q = this.f284656b.mo137707k();
        n0Var2.f288571r = this.f284656b.mo137701e();
        n0Var2.f288563j = this.f284655a.getCreateTime();
        C98408n0 n0Var3 = this.f284656b;
        n0Var2.f288556c = n0Var3.f288556c;
        n0Var2.f288567n = n0Var3.f288567n;
        n0Var2.f288559f = this.f284658d.f288743g;
        n0Var2.f288566m = n0Var3.f288566m;
        n0Var2.f288572s = 0;
        n0Var2.f288554a = str;
        n0Var2.f288564k = Util.nowSecond();
        n0Var2.f288568o = 0;
        n0Var2.f288576w = 1;
        n0Var2.f288562i = 111;
        return n0Var2;
    }

    public boolean isFinished() {
        C98408n0 n0Var = this.f284660f;
        if (n0Var != null) {
            return n0Var.mo137710n() || n0Var.f288562i == 123;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x01e6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x01e7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean start() {
        /*
            r13 = this;
            java.lang.Class<rz.u> r0 = p682rz.C101491u.class
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "start task: path="
            r1.append(r2)
            java.lang.String r2 = r13.mo126312h()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.C2COriginVideoDownloadTask"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            com.tencent.mm.storage.f4 r1 = r13.f284655a
            int r1 = r1.mo108769t2()
            r3 = 1
            r4 = 0
            if (r1 != r3) goto L_0x0030
            com.tencent.mm.storage.f4 r1 = r13.f284655a
            boolean r1 = r1.mo100983V3()
            if (r1 != 0) goto L_0x0030
            return r4
        L_0x0030:
            java.lang.Class<rz.s> r1 = p682rz.C101488s.class
            hd0.n0 r5 = r13.f284656b
            java.lang.String r5 = r5.f288546N
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            r7 = 0
            if (r6 != 0) goto L_0x0076
            di3.d r6 = di3.C86312j.m106911c(r1)
            rz.s r6 = (p682rz.C101488s) r6
            rz.t r6 = r6.Kj0()
            hd0.o0 r6 = (hd0.C98410o0) r6
            java.lang.String r6 = r6.mo137728q(r5)
            boolean r8 = com.tencent.p014mm.vfs.C86013q1.m106450k(r6)
            di3.d r9 = di3.C86312j.m106911c(r0)
            rz.u r9 = (p682rz.C101491u) r9
            hd0.n0 r5 = r9.mo140806Zd(r5)
            if (r8 == 0) goto L_0x0076
            if (r5 == 0) goto L_0x0076
            int r8 = r5.f288562i
            r9 = 199(0xc7, float:2.79E-43)
            if (r8 != r9) goto L_0x0076
            long r8 = com.tencent.p014mm.vfs.C86013q1.m106451l(r6)
            int r6 = (int) r8
            int r5 = r5.f288559f
            if (r6 < r5) goto L_0x0076
            java.lang.String r1 = "origin file had been downloaded, return"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            goto L_0x01e2
        L_0x0076:
            hd0.n0 r5 = r13.f284656b
            java.lang.String r5 = r5.f288546N
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r6 == 0) goto L_0x00e6
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            hd0.n0 r6 = r13.f284656b
            java.lang.String r6 = r6.mo137700d()
            r5.append(r6)
            java.lang.String r6 = "origin"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            hd0.n0 r6 = r13.mo135897i(r5)
            if (r6 != 0) goto L_0x00b4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r6 = "create info Error fileName:"
            r1.append(r6)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r1)
            goto L_0x01e2
        L_0x00b4:
            di3.d r5 = di3.C86312j.m106911c(r1)
            rz.s r5 = (p682rz.C101488s) r5
            rz.t r5 = r5.Kj0()
            hd0.o0 r5 = (hd0.C98410o0) r5
            boolean r5 = r5.mo137730s(r6)
            if (r5 != 0) goto L_0x00e0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "Insert Error fileName:"
            r1.append(r5)
            java.lang.String r5 = r6.mo137700d()
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r1)
            goto L_0x01e2
        L_0x00e0:
            hd0.n0 r5 = r13.f284656b
            hd0.C98429r0.m127808N(r5)
            goto L_0x0124
        L_0x00e6:
            di3.d r6 = di3.C86312j.m106911c(r0)
            rz.u r6 = (p682rz.C101491u) r6
            hd0.n0 r6 = r6.mo140806Zd(r5)
            if (r6 != 0) goto L_0x00f7
            hd0.n0 r5 = r13.mo135897i(r5)
            r6 = r5
        L_0x00f7:
            di3.d r5 = di3.C86312j.m106911c(r1)
            rz.s r5 = (p682rz.C101488s) r5
            rz.t r5 = r5.Kj0()
            hd0.o0 r5 = (hd0.C98410o0) r5
            boolean r5 = r5.mo137733w(r6)
            if (r5 != 0) goto L_0x0124
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "update Error fileName:"
            r1.append(r5)
            java.lang.String r5 = r6.mo137700d()
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r1)
            goto L_0x01e2
        L_0x0124:
            r13.f284660f = r6
            gi.h r7 = new gi.h
            r7.<init>()
            java.lang.String r5 = "task_NetSceneDownloadVideo"
            r7.f287660d = r5
            long r8 = r6.f288563j
            hd0.n0 r5 = r13.f284656b
            java.lang.String r5 = r5.mo137707k()
            java.lang.String r10 = r6.mo137700d()
            java.lang.String r11 = "downvideo"
            java.lang.String r5 = com.tencent.p014mm.modelcdntran.C1297x.m1387b(r11, r8, r5, r10)
            r7.field_mediaId = r5
            java.lang.String r5 = r6.mo137700d()
            r7.f287683S = r5
            hd0.x0 r5 = r13.f284658d
            java.lang.String r8 = r5.f288739c
            r7.f287685T = r8
            int r5 = r5.f288743g
            r7.f287687U = r5
            r7.f287689V = r4
            hd0.n0 r5 = r13.f284656b
            java.lang.String r5 = r5.mo137701e()
            r7.f287693X = r5
            hd0.n0 r5 = r13.f284656b
            java.lang.String r5 = r5.mo137707k()
            r7.f287691W = r5
            hd0.n0 r5 = r13.f284656b
            java.lang.String r5 = r5.mo137707k()
            boolean r5 = com.tencent.p014mm.storage.C72996z1.m85807K5(r5)
            if (r5 == 0) goto L_0x0185
            java.lang.Class<wo.b> r5 = p740wo.C53193b.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            wo.b r5 = (p740wo.C53193b) r5
            hd0.n0 r8 = r13.f284656b
            java.lang.String r8 = r8.mo137707k()
            int r5 = r5.mo73729p1(r8)
            goto L_0x0186
        L_0x0185:
            r5 = 0
        L_0x0186:
            r7.f287695Y = r5
            di3.d r1 = di3.C86312j.m106911c(r1)
            rz.s r1 = (p682rz.C101488s) r1
            rz.t r1 = r1.Kj0()
            java.lang.String r5 = r6.mo137700d()
            hd0.o0 r1 = (hd0.C98410o0) r1
            java.lang.String r1 = r1.mo137728q(r5)
            r7.field_fullpath = r1
            r1 = 4
            r7.field_fileType = r1
            int r1 = r6.f288559f
            r7.field_totalLen = r1
            hd0.x0 r1 = r13.f284658d
            java.lang.String r5 = r1.f288742f
            r7.field_aesKey = r5
            java.lang.String r1 = r1.f288740d
            r7.field_fileId = r1
            r1 = 2
            r7.field_priority = r1
            hd0.n0 r1 = r13.f284656b
            java.lang.String r1 = r1.mo137707k()
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85807K5(r1)
            r7.field_chattype = r1
            r7.f287697Z = r3
            r7.field_autostart = r4
            r7.f287669p = r4
            r7.f287670q = r4
            com.tencent.mm.storage.f4 r1 = r13.f284655a
            long r8 = r1.getCreateTime()
            r7.f287707y0 = r8
            com.tencent.mm.storage.f4 r1 = r13.f284655a
            long r8 = r1.mo108774y2()
            r7.f287680Q0 = r8
            r7.f287692W0 = r4
            int r1 = xb0.C102609h.wx0(r4, r6)
            r7.field_requestVideoFormat = r1
            java.lang.String r1 = r7.field_mediaId
            r6.f288555b = r1
        L_0x01e2:
            r13.f284659e = r7
            if (r7 != 0) goto L_0x01e7
            return r4
        L_0x01e7:
            java.lang.String r1 = r13.getMediaId()
            if (r1 == 0) goto L_0x01f6
            int r1 = r1.length()
            if (r1 != 0) goto L_0x01f4
            goto L_0x01f6
        L_0x01f4:
            r1 = 0
            goto L_0x01f7
        L_0x01f6:
            r1 = 1
        L_0x01f7:
            if (r1 == 0) goto L_0x01fa
            return r4
        L_0x01fa:
            hd0.n0 r1 = r13.f284656b
            int r1 = r1.f288559f
            long r5 = (long) r1
            long r7 = (long) r4
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x0240
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "video size["
            r1.append(r3)
            r1.append(r5)
            java.lang.String r3 = "] less than config size["
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = "], do not stream video"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            di3.d r0 = di3.C86312j.m106911c(r0)
            rz.u r0 = (p682rz.C101491u) r0
            hd0.n0 r1 = r13.f284656b
            r2 = 9
            r0.mo140799IH(r1, r2)
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r6 = 354(0x162, double:1.75E-321)
            r8 = 17
            r10 = 1
            r12 = 0
            r5.idkeyStat(r6, r8, r10, r12)
            return r4
        L_0x0240:
            java.lang.Class<fy.j> r1 = p154fy.C87121j.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            fy.j r1 = (p154fy.C87121j) r1
            com.tencent.mm.storage.f4 r2 = r13.f284655a
            r1.j90(r2)
            hd0.z0 r1 = hd0.C98398h0.Dx0()
            boolean r1 = r1.mo137786c()
            java.lang.Class<rz.r> r2 = p682rz.C101487r.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            rz.r r2 = (p682rz.C101487r) r2
            rz.n r2 = r2.mo140795W6()
            gi.h r4 = r13.f284659e
            com.tencent.mm.modelcdntran.e0 r2 = (com.tencent.p014mm.modelcdntran.C92755e0) r2
            r2.mo126981e(r4, r1)
            di3.d r0 = di3.C86312j.m106911c(r0)
            rz.u r0 = (p682rz.C101491u) r0
            hd0.n0 r1 = r13.f284656b
            r0.mo140799IH(r1, r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.gallery.C97039c.start():boolean");
    }

    public void stop() {
        Log.m105924i("MicroMsg.C2COriginVideoDownloadTask", "stop()");
        C63688n W6 = ((C101487r) C86312j.m106911c(C101487r.class)).mo140795W6();
        String mediaId = getMediaId();
        C99277b.C99278a y = this.f284657c.mo138685y();
        ((C92755e0) W6).mo126983g(mediaId, new Integer[]{Integer.valueOf(y.f291113a), Integer.valueOf(y.f291114b), Integer.valueOf(y.f291115c), Integer.valueOf(y.f291116d), Integer.valueOf(y.f291117e), Integer.valueOf(y.f291118f), Integer.valueOf(y.f291119g)});
    }
}
