package com.tencent.p014mm.p136ui.chatting.gallery;

import android.app.Activity;
import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.message.C68065f;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.plugin.gallery.model.C93958f;
import com.tencent.p014mm.plugin.thumbplayer.downloader.CdnVideoResourceDownloader;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86312j;
import eb0.C97625j3;
import f03.C97787h;
import gy3.C87412m;
import hd0.C98408n0;
import hd0.C98410o0;
import hd0.C98426q0;
import iy3.C60641c;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import mk3.C99910f;
import p682rz.C101488s;
import p682rz.C101491u;
import p823sg.C101614i;
import s90.C48300n;

/* renamed from: com.tencent.mm.ui.chatting.gallery.g */
public abstract class C97052g extends C97030a implements C97787h.C97791d {

    /* renamed from: h */
    public static C48300n f284696h;

    /* renamed from: e */
    public C99910f f284697e = null;

    /* renamed from: f */
    public C99910f f284698f = null;

    /* renamed from: g */
    public int f284699g = 0;

    /* renamed from: com.tencent.mm.ui.chatting.gallery.g$a */
    public class C97053a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C97087m1 f284700d;

        /* renamed from: e */
        public final /* synthetic */ C72963f4 f284701e;

        public C97053a(C97087m1 m1Var, C72963f4 f4Var) {
            this.f284700d = m1Var;
            this.f284701e = f4Var;
        }

        public void run() {
            ImageGalleryUI imageGalleryUI = C97052g.this.f284638d.f284714g;
            imageGalleryUI.getClass();
            C93958f.m118753m().mo128895c(new C97075j0(imageGalleryUI));
            C97052g.this.mo135851y(this.f284700d);
            C97052g.this.mo135824A(this.f284701e, this.f284700d.f284836c);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.gallery.g$b */
    public class C97054b implements C40324j.C40326a {

        /* renamed from: a */
        public final /* synthetic */ C48300n f284703a;

        /* renamed from: b */
        public final /* synthetic */ C72963f4 f284704b;

        /* renamed from: c */
        public final /* synthetic */ WeakReference f284705c;

        /* renamed from: d */
        public final /* synthetic */ int f284706d;

        /* renamed from: e */
        public final /* synthetic */ C98408n0 f284707e;

        /* renamed from: f */
        public final /* synthetic */ boolean f284708f;

        public C97054b(C48300n nVar, C72963f4 f4Var, WeakReference weakReference, int i, C98408n0 n0Var, boolean z) {
            this.f284703a = nVar;
            this.f284704b = f4Var;
            this.f284705c = weakReference;
            this.f284706d = i;
            this.f284707e = n0Var;
            this.f284708f = z;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x00b1, code lost:
            r8 = r8.f284714g;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo288a(int r7, int r8, java.lang.String r9, ob0.C47350c r10) {
            /*
                r6 = this;
                java.lang.Class<rz.s> r0 = p682rz.C101488s.class
                r1 = 1
                r2 = 0
                java.lang.String r3 = "MicroMsg.Imagegallery.handler.video"
                if (r7 != 0) goto L_0x0167
                if (r8 != 0) goto L_0x0167
                java.lang.String r7 = "MP_VIDEO  end do exchange video link success"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r7)
                ob0.c$d r7 = r10.f127056b
                pe3.a r7 = r7.f127083a
                te3.f62 r7 = (te3.C49387f62) r7
                com.tencent.mm.ui.chatting.gallery.q1 r8 = com.tencent.p014mm.p136ui.chatting.gallery.C85820q1.f249947a
                s90.n r8 = r6.f284703a
                com.tencent.mm.storage.f4 r9 = r6.f284704b
                java.lang.String r9 = r9.mo108765s2()
                java.lang.String r8 = r8.mo73008d(r9)
                java.lang.String r9 = "key"
                gy3.C87412m.m108594g(r8, r9)
                java.lang.String r9 = "resp"
                gy3.C87412m.m108594g(r7, r9)
                java.lang.String r9 = "MpShareVideoPlayInfo"
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r9 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getSingleMMKV(r9)
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r8)
                java.lang.String r4 = "VideoSize"
                r10.append(r4)
                java.lang.String r10 = r10.toString()
                int r4 = r7.f133318g
                r9.encode((java.lang.String) r10, (int) r4)
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r8)
                java.lang.String r4 = "block"
                r10.append(r4)
                java.lang.String r10 = r10.toString()
                int r4 = r7.f133316e
                r9.encode((java.lang.String) r10, (int) r4)
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r8)
                java.lang.String r4 = "errMsg"
                r10.append(r4)
                java.lang.String r10 = r10.toString()
                java.lang.String r4 = r7.f133317f
                r9.encode((java.lang.String) r10, (java.lang.String) r4)
                eb0.v0 r9 = eb0.C86493v0.m107224d()
                eb0.v0$c r8 = r9.mo120947c(r8, r1)
                java.lang.String r9 = r7.f133315d
                java.lang.String r10 = "PlayUrl"
                r8.mo120964k(r10, r9)
                long r9 = java.lang.System.currentTimeMillis()
                java.lang.String r4 = "SaveTime"
                boolean r5 = android.text.TextUtils.isEmpty(r4)
                if (r5 != 0) goto L_0x009d
                java.util.Map<java.lang.String, java.lang.Object> r8 = r8.f251318a
                java.lang.Long r9 = java.lang.Long.valueOf(r9)
                eb0.v0$b r8 = (eb0.C86493v0.C86494b) r8
                r8.put(r4, r9)
            L_0x009d:
                java.lang.ref.WeakReference r8 = r6.f284705c
                java.lang.Object r8 = r8.get()
                if (r8 == 0) goto L_0x0166
                java.lang.ref.WeakReference r8 = r6.f284705c
                java.lang.Object r8 = r8.get()
                com.tencent.mm.ui.chatting.gallery.g r8 = (com.tencent.p014mm.p136ui.chatting.gallery.C97052g) r8
                com.tencent.mm.ui.chatting.gallery.h r8 = r8.f284638d
                if (r8 == 0) goto L_0x00bb
                com.tencent.mm.ui.chatting.gallery.ImageGalleryUI r8 = r8.f284714g
                if (r8 != 0) goto L_0x00b6
                goto L_0x00bb
            L_0x00b6:
                boolean r8 = r8.isFinishing()
                goto L_0x00bc
            L_0x00bb:
                r8 = 1
            L_0x00bc:
                if (r8 == 0) goto L_0x00c0
                goto L_0x0166
            L_0x00c0:
                java.lang.ref.WeakReference r8 = r6.f284705c
                java.lang.Object r8 = r8.get()
                com.tencent.mm.ui.chatting.gallery.g r8 = (com.tencent.p014mm.p136ui.chatting.gallery.C97052g) r8
                int r9 = r6.f284706d
                com.tencent.mm.ui.chatting.gallery.m1 r9 = r8.mo135877h(r9)
                int r10 = r7.f133316e
                if (r10 != r1) goto L_0x0124
                java.lang.Object[] r10 = new java.lang.Object[r1]
                java.lang.String r1 = r7.f133317f
                r10[r2] = r1
                java.lang.String r1 = "doGetPlayUrl block %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r1, r10)
                int r10 = r6.f284706d
                com.tencent.mm.ui.chatting.gallery.m1 r10 = r8.mo135877h(r10)
                r8.mo135851y(r10)
                di3.d r10 = di3.C86312j.m106911c(r0)
                rz.s r10 = (p682rz.C101488s) r10
                rz.t r10 = r10.Kj0()
                com.tencent.mm.storage.f4 r1 = r6.f284704b
                java.lang.String r1 = r1.mo108765s2()
                hd0.o0 r10 = (hd0.C98410o0) r10
                java.lang.String r10 = r10.mo137728q(r1)
                com.tencent.p014mm.vfs.C86013q1.m106447h(r10)
                hd0.n0 r10 = r6.f284707e
                r1 = 111(0x6f, float:1.56E-43)
                r10.f288562i = r1
                di3.d r10 = di3.C86312j.m106911c(r0)
                rz.s r10 = (p682rz.C101488s) r10
                rz.t r10 = r10.Kj0()
                hd0.n0 r0 = r6.f284707e
                hd0.o0 r10 = (hd0.C98410o0) r10
                r10.mo137733w(r0)
                com.tencent.mm.ui.chatting.gallery.h r10 = r8.f284638d
                com.tencent.mm.ui.chatting.gallery.m1 r10 = r10.mo135934v()
                if (r10 != r9) goto L_0x0123
                java.lang.String r7 = r7.f133317f
                r8.mo135911x(r9, r7)
            L_0x0123:
                return
            L_0x0124:
                boolean r10 = r6.f284708f
                if (r10 != 0) goto L_0x0145
                hd0.n0 r10 = r6.f284707e
                int r1 = r7.f133318g
                r10.f288566m = r1
                te3.tc4 r10 = r10.f288535C
                java.lang.String r7 = r7.f133315d
                r10.f299537d = r7
                di3.d r7 = di3.C86312j.m106911c(r0)
                rz.s r7 = (p682rz.C101488s) r7
                rz.t r7 = r7.Kj0()
                hd0.n0 r10 = r6.f284707e
                hd0.o0 r7 = (hd0.C98410o0) r7
                r7.mo137733w(r10)
            L_0x0145:
                boolean r7 = r6.f284708f
                if (r7 != 0) goto L_0x017e
                com.tencent.mm.ui.chatting.gallery.h r7 = r8.f284638d
                com.tencent.mm.ui.chatting.gallery.m1 r7 = r7.mo135934v()
                if (r7 != r9) goto L_0x017e
                com.tencent.mm.ui.chatting.gallery.h r7 = r8.f284638d
                com.tencent.mm.ui.chatting.gallery.ImageGalleryUI r7 = r7.f284714g
                r7.mo135781o8()
                com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBar r7 = r7.f284400U0
                boolean r7 = r7.f283824z
                if (r7 != 0) goto L_0x017e
                com.tencent.mm.storage.f4 r7 = r6.f284704b
                int r9 = r6.f284706d
                r8.mo135824A(r7, r9)
                goto L_0x017e
            L_0x0166:
                return
            L_0x0167:
                r10 = 3
                java.lang.Object[] r10 = new java.lang.Object[r10]
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                r10[r2] = r8
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r10[r1] = r7
                r7 = 2
                r10[r7] = r9
                java.lang.String r7 = "MP_VIDEO_ERROR  end do exchange video link fail %d/%d %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r7, r10)
            L_0x017e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.gallery.C97052g.C97054b.mo288a(int, int, java.lang.String, ob0.c):void");
        }
    }

    public C97052g(C97056h hVar) {
        super(hVar);
        f284696h = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0064  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m124924l(hd0.C98408n0 r9, s90.C48300n r10, com.tencent.p014mm.storage.C72963f4 r11, int r12, boolean r13, com.tencent.p014mm.p136ui.chatting.gallery.C97052g r14) {
        /*
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r14)
            com.tencent.mm.ui.chatting.gallery.q1 r14 = com.tencent.p014mm.p136ui.chatting.gallery.C85820q1.f249947a
            java.lang.String r7 = r11.mo108765s2()
            com.tencent.mm.ui.chatting.gallery.g$b r8 = new com.tencent.mm.ui.chatting.gallery.g$b
            r0 = r8
            r1 = r10
            r2 = r11
            r4 = r12
            r5 = r9
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            java.lang.String r9 = "mPShareVideoInfo"
            gy3.C87412m.m108594g(r10, r9)
            java.lang.String r9 = "imgPath"
            gy3.C87412m.m108594g(r7, r9)
            java.lang.String r9 = r10.mo73008d(r7)
            eb0.v0 r11 = eb0.C86493v0.m107224d()
            r12 = 1
            eb0.v0$c r11 = r11.mo120947c(r9, r12)
            r11.getClass()
            java.lang.String r13 = "SaveTime"
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 != 0) goto L_0x004c
            java.util.Map<java.lang.String, java.lang.Object> r11 = r11.f251318a
            eb0.v0$b r11 = (eb0.C86493v0.C86494b) r11
            java.lang.Object r11 = r11.get(r13)
            boolean r13 = r11 instanceof java.lang.Long
            if (r13 == 0) goto L_0x004c
            java.lang.Long r11 = (java.lang.Long) r11
            long r0 = r11.longValue()
            goto L_0x004e
        L_0x004c:
            r0 = 0
        L_0x004e:
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r0
            long r0 = java.lang.Math.abs(r2)
            java.lang.String r11 = "key"
            java.lang.String r13 = "MicroMsg.MpShareViewUtil"
            r2 = 300000(0x493e0, double:1.482197E-318)
            r4 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto L_0x0078
            gy3.C87412m.m108593f(r9, r11)
            java.lang.String r14 = r14.mo119746a(r9)
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r14 != 0) goto L_0x0078
            java.lang.String r9 = "not do cgi in 5 min"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r9)
            goto L_0x00a9
        L_0x0078:
            java.util.HashMap<java.lang.String, java.lang.Boolean> r14 = com.tencent.p014mm.p136ui.chatting.gallery.C85820q1.f249948b
            boolean r0 = r14.containsKey(r9)
            if (r0 == 0) goto L_0x00ab
            java.lang.Object r0 = r14.get(r9)
            if (r0 == 0) goto L_0x00ab
            java.lang.Object r0 = r14.get(r9)
            gy3.C87412m.m108591d(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00ab
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            java.lang.String r9 = " is doing"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r9)
        L_0x00a9:
            r12 = 0
            goto L_0x0103
        L_0x00ab:
            java.lang.String r0 = "MP_VIDEO  start do exchange video link"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
            gy3.C87412m.m108593f(r9, r11)
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            r14.put(r9, r11)
            gy3.f0 r11 = new gy3.f0
            r11.<init>()
            java.lang.ref.WeakReference r13 = new java.lang.ref.WeakReference
            r13.<init>(r8)
            r11.f27484d = r13
            te3.e62 r13 = new te3.e62
            r13.<init>()
            java.lang.String r14 = r10.f133368f
            r13.f132733d = r14
            java.lang.String r14 = r10.f133366d
            r13.f132734e = r14
            java.lang.String r10 = r10.f133367e
            r13.f132735f = r10
            ob0.c$b r10 = new ob0.c$b
            r10.<init>()
            r10.f127066a = r13
            te3.f62 r13 = new te3.f62
            r13.<init>()
            r10.f127067b = r13
            java.lang.String r13 = "/cgi-bin/mmbiz-bin/appmsg/getplayurl"
            r10.f127068c = r13
            r13 = 2962(0xb92, float:4.15E-42)
            r10.f127069d = r13
            r10.f127070e = r4
            r10.f127071f = r4
            java.lang.Class<com.tencent.mm.ipcinvoker.wx_extension.j> r13 = com.tencent.p014mm.ipcinvoker.wx_extension.C40324j.class
            di3.d r13 = di3.C86312j.m106911c(r13)
            com.tencent.mm.ipcinvoker.wx_extension.j r13 = (com.tencent.p014mm.ipcinvoker.wx_extension.C40324j) r13
            ob0.c r10 = r10.mo72403a()
            com.tencent.mm.ui.chatting.gallery.p1 r14 = new com.tencent.mm.ui.chatting.gallery.p1
            r14.<init>(r9, r11)
            r13.mo63014eH(r10, r14)
        L_0x0103:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.gallery.C97052g.m124924l(hd0.n0, s90.n, com.tencent.mm.storage.f4, int, boolean, com.tencent.mm.ui.chatting.gallery.g):boolean");
    }

    /* renamed from: m */
    public static C72963f4 m124925m(String str, Activity activity) {
        C48300n nVar;
        C72963f4 f4Var = new C72963f4();
        f4Var.setType(486539313);
        f4Var.mo108749c3(str);
        f4Var.f212664C1 = true;
        if (f284696h == null) {
            byte[] byteArrayExtra = activity.getIntent().getByteArrayExtra("img_gallery_mp_share_video_info");
            if (Util.isNullOrNil(byteArrayExtra)) {
                Log.m105920e("MicroMsg.Imagegallery.handler.video", "initMPShareVideoInfo data is null");
                activity.finish();
                nVar = null;
                f4Var.f212663B1 = nVar;
                f4Var.mo108739S2(activity.getIntent().getStringExtra("img_gallery_path"));
                return f4Var;
            }
            try {
                C48300n nVar2 = new C48300n();
                nVar2.parseFrom(byteArrayExtra);
                f284696h = nVar2;
            } catch (IOException e) {
                Log.m105921e("MicroMsg.Imagegallery.handler.video", "initMPShareVideoInfo ex %s", e.getMessage());
                activity.finish();
            }
        }
        nVar = f284696h;
        f4Var.f212663B1 = nVar;
        f4Var.mo108739S2(activity.getIntent().getStringExtra("img_gallery_path"));
        return f4Var;
    }

    /* renamed from: n */
    public static C48300n m124926n(C72963f4 f4Var) {
        C48300n nVar;
        if (f4Var.mo100974M3()) {
            return new C48300n().mo73007b(f4Var.f212663B1);
        }
        C68070l.C68072b u = C68070l.C68072b.m80422u(f4Var.getContent(), f4Var.mo108775z2());
        if (u == null) {
            Log.m105928w("MicroMsg.Imagegallery.handler.video", "getVideoInfo content is null");
            return null;
        }
        C68065f fVar = (C68065f) u.mo93555w(C68065f.class);
        if (fVar == null || (nVar = fVar.f195427l) == null) {
            return null;
        }
        return nVar;
    }

    /* renamed from: o */
    public static C98408n0 m124927o(C72963f4 f4Var) {
        if (!C97056h.m124955K(f4Var)) {
            return null;
        }
        return ((C101491u) C86312j.m106911c(C101491u.class)).mo140806Zd(f4Var.mo108765s2());
    }

    /* renamed from: p */
    public static C98408n0 m124928p(C72963f4 f4Var) {
        C98408n0 o = m124927o(f4Var);
        if (o != null) {
            return o;
        }
        Log.m105924i("MicroMsg.Imagegallery.handler.video", "insert video info:" + f4Var.toString());
        C98408n0 n0Var = new C98408n0();
        n0Var.f288570q = f4Var.mo108768t();
        n0Var.f288554a = f4Var.mo108765s2();
        n0Var.f288563j = f4Var.getCreateTime() <= 0 ? System.currentTimeMillis() : f4Var.getCreateTime();
        n0Var.f288556c = f4Var.mo108774y2();
        n0Var.f288575v = f4Var.getContent();
        n0Var.f288567n = (long) ((int) f4Var.getMsgId());
        C48300n n = m124926n(f4Var);
        if (n != null) {
            if (TextUtils.isEmpty(f4Var.mo108765s2())) {
                String t = f4Var.mo108768t();
                C101614i<String, ArrayList<C98408n0>> iVar = C98410o0.f288586c;
                f4Var.mo108739S2(C98426q0.m127793a(t));
                ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(f4Var.getMsgId(), f4Var);
            }
            n0Var.f288554a = f4Var.mo108765s2();
            n0Var.mo137714r(Util.nullAs(C85820q1.f249947a.mo119746a(n.mo73008d(f4Var.mo108765s2())), n.f133367e), n.f133371i, n.f133369g, n.f133366d, "", "", "");
            n0Var.f288562i = 111;
        }
        ((C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0()).mo137730s(n0Var);
        return n0Var;
    }

    /* renamed from: A */
    public abstract void mo135824A(C72963f4 f4Var, int i);

    /* renamed from: B */
    public abstract void mo135825B(C72963f4 f4Var, int i);

    /* renamed from: a */
    public void mo135904a(Long l, long j, long j2) {
        if (l == null) {
            Log.m105924i("MicroMsg.Imagegallery.handler.video", "onMoovReady, it's not origin video task, return");
        }
    }

    /* renamed from: b */
    public void mo135905b(Long l, long j, long j2) {
        if (l == null) {
            Log.m105924i("MicroMsg.Imagegallery.handler.video", "onDownloadProgress, it's not origin video task, return");
        } else if (C73703d.f216412a.mo102767a(l.longValue()) == null) {
            Log.m105924i("MicroMsg.Imagegallery.handler.video", "onFinishDownload, downloader is null, ignore it");
        } else {
            C97056h hVar = this.f284638d;
            if (hVar != null && hVar.f284714g != null && this.f284699g == 0) {
                if (l.longValue() == hVar.mo135935w().getMsgId() && j2 > 0) {
                    int round = Math.round((((float) j) * 100.0f) / ((float) j2));
                    ImageGalleryUI imageGalleryUI = this.f284638d.f284714g;
                    imageGalleryUI.getClass();
                    C93958f.m118753m().mo128895c(new C97072i0(imageGalleryUI, round));
                }
            }
        }
    }

    /* renamed from: c */
    public void mo135906c(Long l) {
        if (l == null) {
            Log.m105924i("MicroMsg.Imagegallery.handler.video", "onStartDownload, it's not origin video task, return");
        }
    }

    /* renamed from: d */
    public void mo135907d(Long l, long j, long j2) {
        if (l == null) {
            Log.m105924i("MicroMsg.Imagegallery.handler.video", "onDataAvailable, it's not origin video task, return");
        }
    }

    /* renamed from: e */
    public void mo135908e(Long l, int i) {
        C97087m1 v;
        if (l == null) {
            Log.m105924i("MicroMsg.Imagegallery.handler.video", "onFinishDownload, it's not origin video task, return");
            return;
        }
        CdnVideoResourceDownloader b = C73703d.f216412a.mo102768b(l.longValue());
        if (b == null) {
            Log.m105924i("MicroMsg.Imagegallery.handler.video", "onFinishDownload, downloader is null, ignore it");
            return;
        }
        b.f282445j = null;
        C97056h hVar = this.f284638d;
        if (hVar != null && hVar.f284714g != null) {
            C72963f4 w = hVar.mo135935w();
            if (l.longValue() == w.getMsgId() && (v = this.f284638d.mo135934v()) != null && v.f284849p != null) {
                C99910f fVar = this.f284698f;
                if (fVar != null) {
                    fVar.f292761g.f266512l = C60641c.m70922c((double) (((float) (System.currentTimeMillis() - fVar.f292760f)) / 1000.0f));
                    this.f284698f.mo139264a();
                    this.f284698f = null;
                }
                v.f284834a.post(new C97053a(v, w));
            }
        }
    }

    /* renamed from: f */
    public void mo135909f(Long l) {
        if (l == null) {
            Log.m105924i("MicroMsg.Imagegallery.handler.video", "onStopDownload, it's not origin video task, return");
            return;
        }
        CdnVideoResourceDownloader b = C73703d.f216412a.mo102768b(l.longValue());
        if (b == null) {
            Log.m105924i("MicroMsg.Imagegallery.handler.video", "onFinishDownload, downloader is null, ignore it");
        } else {
            b.f282445j = null;
        }
    }

    /* renamed from: k */
    public void mo135844k() {
        this.f284638d = null;
        C73703d dVar = C73703d.f216412a;
        Set<Long> keySet = C73703d.f216413b.keySet();
        C87412m.m108593f(keySet, "downloaderMap.keys");
        for (Long longValue : keySet) {
            long longValue2 = longValue.longValue();
            HashMap<Long, CdnVideoResourceDownloader> hashMap = C73703d.f216413b;
            CdnVideoResourceDownloader cdnVideoResourceDownloader = hashMap.get(Long.valueOf(longValue2));
            if (cdnVideoResourceDownloader != null) {
                cdnVideoResourceDownloader.f282445j = null;
            }
            boolean z = true;
            if (cdnVideoResourceDownloader == null || !cdnVideoResourceDownloader.f282440e) {
                z = false;
            }
            if (z) {
                hashMap.remove(Long.valueOf(longValue2));
            }
        }
        C99910f fVar = this.f284697e;
        if (fVar != null) {
            fVar.mo139264a();
        }
        C99910f fVar2 = this.f284698f;
        if (fVar2 != null) {
            fVar2.mo139264a();
        }
    }

    /* renamed from: q */
    public void mo135910q(C97087m1 m1Var) {
        if (m1Var != null) {
            m1Var.mo135970f();
            m1Var.mo135970f();
            m1Var.f284852s.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public abstract void mo135845r();

    /* renamed from: s */
    public abstract void mo135846s();

    /* renamed from: t */
    public abstract void mo135847t(int i, int i2);

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public abstract void mo135848u();

    /* renamed from: v */
    public abstract void mo135849v(int i);

    /* renamed from: w */
    public abstract void mo135850w(int i);

    /* renamed from: x */
    public void mo135911x(C97087m1 m1Var, String str) {
        if (m1Var != null) {
            m1Var.mo135970f();
            if (this.f284638d != null) {
                m1Var.mo135970f();
                m1Var.f284852s.setVisibility(0);
                m1Var.mo135970f();
                m1Var.f284853t.setText(Util.nullAs(str, this.f284638d.f284714g.getString(C0966R.string.kb4)));
                m1Var.mo135970f();
                m1Var.f284847n.setVisibility(0);
                m1Var.mo135970f();
                m1Var.f284848o.setVisibility(8);
                mo135851y(m1Var);
            }
        }
    }

    /* renamed from: y */
    public abstract void mo135851y(C97087m1 m1Var);

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public abstract void mo135852z();
}
