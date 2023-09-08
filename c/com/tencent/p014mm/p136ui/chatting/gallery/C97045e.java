package com.tencent.p014mm.p136ui.chatting.gallery;

import com.tencent.p014mm.modelcdntran.C92755e0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import f03.C97785g;
import fy3.C32226l;
import hd0.C98398h0;
import hd0.C98408n0;
import hd0.C98410o0;
import hd0.C98429r0;
import l03.C99277b;
import p1081gi.C98127h;
import p154fy.C87121j;
import p682rz.C101487r;
import p682rz.C101488s;
import p682rz.C101491u;
import p682rz.C63688n;
import rx3.C13598b0;
import te3.C101783gu2;
import z04.C112551y;

/* renamed from: com.tencent.mm.ui.chatting.gallery.e */
public final class C97045e implements C97785g {

    /* renamed from: a */
    public final C72963f4 f284681a;

    /* renamed from: b */
    public C98408n0 f284682b;

    /* renamed from: c */
    public final C99277b f284683c;

    /* renamed from: d */
    public final C32226l<C98127h, C13598b0> f284684d;

    /* renamed from: e */
    public C98127h f284685e;

    /* renamed from: f */
    public int f284686f;

    /* renamed from: g */
    public int f284687g;

    /* renamed from: h */
    public int f284688h;

    /* renamed from: i */
    public int f284689i;

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0141  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C97045e(com.tencent.p014mm.storage.C72963f4 r9, hd0.C98408n0 r10, l03.C99277b r11, fy3.C32226l<? super p1081gi.C98127h, rx3.C13598b0> r12) {
        /*
            r8 = this;
            java.lang.String r0 = "msg"
            gy3.C87412m.m108594g(r9, r0)
            java.lang.String r0 = "videoInfo"
            gy3.C87412m.m108594g(r10, r0)
            java.lang.String r0 = "reporter"
            gy3.C87412m.m108594g(r11, r0)
            java.lang.String r0 = "onGotTask"
            gy3.C87412m.m108594g(r12, r0)
            r8.<init>()
            r8.f284681a = r9
            r8.f284682b = r10
            r8.f284683c = r11
            r8.f284684d = r12
            boolean r10 = hd0.C98429r0.m127810a()
            java.lang.String r11 = "MicroMsg.C2CVideoDownloadTask"
            r12 = 1
            if (r10 == 0) goto L_0x005b
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "create c2c online task: filename="
            r10.append(r0)
            java.lang.String r0 = r9.mo108765s2()
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r10)
            java.lang.Class<rz.r> r10 = p682rz.C101487r.class
            di3.d r10 = di3.C86312j.m106911c(r10)
            rz.r r10 = (p682rz.C101487r) r10
            rz.n r10 = r10.mo140795W6()
            java.lang.String r0 = r9.mo108765s2()
            com.tencent.mm.modelcdntran.e0 r10 = (com.tencent.p014mm.modelcdntran.C92755e0) r10
            gi.h r10 = r10.mo126986j(r0, r12)
            goto L_0x005c
        L_0x005b:
            r10 = 0
        L_0x005c:
            r0 = 4
            if (r10 != 0) goto L_0x00ba
            boolean r9 = r9.mo100983V3()
            if (r9 == 0) goto L_0x00ba
            gi.h r10 = new gi.h
            r10.<init>()
            java.lang.String r9 = "task_OnlineVideoUIHelper"
            r10.f287660d = r9
            hd0.n0 r9 = r8.f284682b
            long r1 = r9.f288563j
            java.lang.String r9 = r9.mo137707k()
            hd0.n0 r3 = r8.f284682b
            java.lang.String r3 = r3.mo137700d()
            java.lang.String r4 = "downvideo"
            java.lang.String r9 = com.tencent.p014mm.modelcdntran.C1297x.m1387b(r4, r1, r9, r3)
            r10.field_mediaId = r9
            hd0.n0 r9 = r8.f284682b
            te3.tc4 r1 = r9.f288535C
            java.lang.String r1 = r1.f299537d
            r10.f287705p0 = r1
            r10.f287689V = r12
            r1 = 7
            r10.f287655L = r1
            r10.f287696Y0 = r0
            java.lang.String r9 = r9.mo137700d()
            r10.f287683S = r9
            java.lang.Class<rz.s> r9 = p682rz.C101488s.class
            di3.d r9 = di3.C86312j.m106911c(r9)
            rz.s r9 = (p682rz.C101488s) r9
            rz.t r9 = r9.Kj0()
            hd0.n0 r1 = r8.f284682b
            java.lang.String r1 = r1.mo137700d()
            hd0.o0 r9 = (hd0.C98410o0) r9
            java.lang.String r9 = r9.mo137728q(r1)
            r10.field_fullpath = r9
            hd0.n0 r9 = r8.f284682b
            int r9 = r9.f288559f
            r10.f287687U = r9
        L_0x00ba:
            r8.f284685e = r10
            java.lang.Class<lc3.b> r9 = lc3.C10485b.class
            k40.a r9 = f40.C86709a0.m107533q(r9)
            lc3.b r9 = (lc3.C10485b) r9
            pj.f r9 = r9.vh0()
            java.lang.String r10 = "AndroidOnlineVideoArgs"
            java.lang.String r9 = r9.mo107405c(r10)
            r10 = 0
            if (r9 == 0) goto L_0x00da
            int r1 = r9.length()
            if (r1 != 0) goto L_0x00d8
            goto L_0x00da
        L_0x00d8:
            r1 = 0
            goto L_0x00db
        L_0x00da:
            r1 = 1
        L_0x00db:
            r2 = 1048576(0x100000, float:1.469368E-39)
            r3 = 75
            r4 = 5
            r5 = 3
            r6 = 2
            if (r1 != 0) goto L_0x013e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r7 = "online video config : "
            r1.append(r7)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r1)
            java.lang.String r1 = "config"
            gy3.C87412m.m108593f(r9, r1)
            z04.k r1 = new z04.k
            java.lang.String r7 = ";"
            r1.<init>((java.lang.String) r7)
            java.util.List r9 = r1.mo90760e(r9, r10)
            java.lang.String[] r1 = new java.lang.String[r10]
            java.lang.Object[] r9 = r9.toArray(r1)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            gy3.C87412m.m108592e(r9, r1)
            java.lang.String[] r9 = (java.lang.String[]) r9
            int r1 = r9.length
            if (r1 < r0) goto L_0x013e
            r1 = r9[r10]
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r4)
            r8.f284686f = r1
            r1 = r9[r12]
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r12)
            r8.f284687g = r1
            r1 = r9[r6]
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r3)
            r8.f284689i = r1
            r9 = r9[r5]
            int r9 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r9, (int) r12)
            int r9 = r9 * r2
            r8.f284688h = r9
            r9 = 1
            goto L_0x013f
        L_0x013e:
            r9 = 0
        L_0x013f:
            if (r9 != 0) goto L_0x0149
            r8.f284686f = r4
            r8.f284687g = r12
            r8.f284689i = r3
            r8.f284688h = r2
        L_0x0149:
            java.lang.Object[] r9 = new java.lang.Object[r0]
            int r0 = r8.f284686f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9[r10] = r0
            int r10 = r8.f284687g
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r9[r12] = r10
            int r10 = r8.f284689i
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r9[r6] = r10
            int r10 = r8.f284688h
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r9[r5] = r10
            java.lang.String r10 = "parseConfig preload[%d] downloadSec[%d], needFinish[%d], minStreamSize[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r10, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.gallery.C97045e.<init>(com.tencent.mm.storage.f4, hd0.n0, l03.b, fy3.l):void");
    }

    /* renamed from: a */
    public void mo126303a() {
        C98408n0 Zd = ((C101491u) C86312j.m106911c(C101491u.class)).mo140806Zd(mo126307e());
        if (Zd != null) {
            this.f284682b = Zd;
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
        return this.f284689i;
    }

    /* renamed from: e */
    public String mo126307e() {
        C98127h hVar = this.f284685e;
        if (hVar != null) {
            return hVar.f287683S;
        }
        return null;
    }

    /* renamed from: f */
    public void mo126308f() {
        Log.m105924i("MicroMsg.C2CVideoDownloadTask", "finishRemaining()");
        C98127h hVar = this.f284685e;
        C98429r0.m127802H(hVar != null ? hVar.f287683S : null, 2);
    }

    /* renamed from: g */
    public Long mo126309g() {
        return null;
    }

    public long getLength() {
        C98127h hVar = this.f284685e;
        return (long) (hVar != null ? hVar.f287687U : this.f284682b.f288566m);
    }

    public String getMediaId() {
        C98127h hVar = this.f284685e;
        if (hVar != null) {
            return hVar.field_mediaId;
        }
        return null;
    }

    /* renamed from: h */
    public String mo126312h() {
        C101783gu2 gu22;
        Class cls = C101488s.class;
        C98408n0 n0Var = this.f284682b;
        if (n0Var.f288576w != -1) {
            String q = ((C98410o0) ((C101488s) C86312j.m106911c(cls)).Kj0()).mo137728q(this.f284681a.mo108765s2());
            if (this.f284681a.mo108769t2() == 1 && (gu22 = this.f284682b.f288538F) != null && gu22.f298309e) {
                try {
                    String s = C86013q1.m106458s(q);
                    if (s == null) {
                        s = "";
                    }
                    if (!C112551y.m153808h(s, "/", false, 2, (Object) null)) {
                        s = s + XVFSFile.SEPARATOR_CHAR;
                    }
                    String str = s + C86013q1.m106457r(q) + "_hd.mp4";
                    boolean k = C86013q1.m106450k(str);
                    Log.m105924i("MicroMsg.C2CVideoDownloadTask", "local capture video, hdFilePath: " + str + ", exist: " + k);
                    if (k) {
                        return str;
                    }
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.C2CVideoDownloadTask", "try to get hd filePath error: " + e.getMessage());
                }
            }
            return q;
        } else if (C86013q1.m106450k(n0Var.mo137702f())) {
            return this.f284682b.mo137702f();
        } else {
            return ((C98410o0) ((C101488s) C86312j.m106911c(cls)).Kj0()).mo137728q(this.f284681a.mo108765s2());
        }
    }

    public boolean isFinished() {
        return this.f284682b.mo137710n() || this.f284682b.f288562i == 123;
    }

    public boolean start() {
        C98127h hVar;
        Class cls = C101491u.class;
        Log.m105924i("MicroMsg.C2CVideoDownloadTask", "start task: path=" + mo126312h());
        if ((this.f284681a.mo108769t2() == 1 && !this.f284681a.mo100983V3()) || (hVar = this.f284685e) == null) {
            return false;
        }
        if (hVar != null) {
            this.f284684d.invoke(hVar);
        }
        String mediaId = getMediaId();
        if (mediaId == null || mediaId.length() == 0) {
            return false;
        }
        long j = (long) this.f284682b.f288559f;
        if (j < ((long) 0)) {
            Log.m105924i("MicroMsg.C2CVideoDownloadTask", "video size[" + j + "] less than config size[" + 0 + "], do not stream video");
            ((C101491u) C86312j.m106911c(cls)).mo140799IH(this.f284682b, 9);
            C115669n.INSTANCE.idkeyStat(354, 17, 1, false);
            return false;
        }
        ((C87121j) C86312j.m106911c(C87121j.class)).j90(this.f284681a);
        ((C92755e0) ((C101487r) C86312j.m106911c(C101487r.class)).mo140795W6()).mo126981e(this.f284685e, C98398h0.Dx0().mo137786c());
        ((C101491u) C86312j.m106911c(cls)).mo140799IH(this.f284682b, 1);
        return true;
    }

    public void stop() {
        Log.m105924i("MicroMsg.C2CVideoDownloadTask", "stop()");
        C63688n W6 = ((C101487r) C86312j.m106911c(C101487r.class)).mo140795W6();
        String mediaId = getMediaId();
        C99277b.C99278a y = this.f284683c.mo138685y();
        ((C92755e0) W6).mo126983g(mediaId, new Integer[]{Integer.valueOf(y.f291113a), Integer.valueOf(y.f291114b), Integer.valueOf(y.f291115c), Integer.valueOf(y.f291116d), Integer.valueOf(y.f291117e), Integer.valueOf(y.f291118f), Integer.valueOf(y.f291119g)});
    }
}
