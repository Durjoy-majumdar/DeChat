package com.tencent.p014mm.plugin.p081mv.jump;

import com.tencent.p014mm.plugin.p081mv.p082ui.open.text_status.MusicMvView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import go3.C59600d;
import gy3.C87412m;
import ht1.C60200t1;
import la2.C99364n;
import p182kk.C61104a;
import qc0.C101093a;
import qc0.C101106m;
import qc0.C62602o;
import rc0.C63389c;
import te3.C64488kb1;
import te3.C64719t23;
import up1.C65415e0;

/* renamed from: com.tencent.mm.plugin.mv.jump.MusicPullDownView */
public class MusicPullDownView extends C59600d {

    /* renamed from: e */
    public String f162988e = "MusicPullDownView";

    /* renamed from: f */
    public MusicMvView f162989f;

    /* renamed from: g */
    public C64719t23 f162990g;

    /* renamed from: h */
    public C64488kb1 f162991h;

    /* renamed from: i */
    public long f162992i;

    /* renamed from: j */
    public C101106m f162993j;

    /* renamed from: n */
    public C62602o f162994n;

    /* renamed from: o */
    public String f162995o;

    /* renamed from: p */
    public final MusicPullDownView$musicPlayerListener$1 f162996p;

    /* renamed from: q */
    public int f162997q;

    /* renamed from: r */
    public int f162998r;

    /* renamed from: s */
    public boolean f162999s;

    /* renamed from: t */
    public boolean f163000t;

    /* renamed from: u */
    public boolean f163001u;

    /* renamed from: v */
    public int f163002v;

    /* renamed from: com.tencent.mm.plugin.mv.jump.MusicPullDownView$a */
    public static final class C56895a implements Runnable {

        /* renamed from: d */
        public static final C56895a f163003d = new C56895a();

        public final void run() {
            ((C63389c) C86312j.m106911c(C63389c.class)).mo88298vr();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x006d A[Catch:{ Exception -> 0x00c8, all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007a A[Catch:{ Exception -> 0x00c8, all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0093 A[Catch:{ Exception -> 0x00c8, all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0096 A[Catch:{ Exception -> 0x00c8, all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009d A[Catch:{ Exception -> 0x00c8, all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a0 A[Catch:{ Exception -> 0x00c8, all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a6 A[Catch:{ Exception -> 0x00c8, all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a9 A[Catch:{ Exception -> 0x00c8, all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00af A[Catch:{ Exception -> 0x00c8, all -> 0x00c5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MusicPullDownView(java.lang.String r11, android.widget.FrameLayout r12, uz2.C65488a0 r13, uz2.C65490m r14, int r15) {
        /*
            r10 = this;
            java.lang.String r11 = "container"
            gy3.C87412m.m108594g(r12, r11)
            r10.<init>()
            java.lang.String r11 = "MusicPullDownView"
            r10.f162988e = r11
            java.lang.String r14 = ""
            r10.f162995o = r14
            com.tencent.mm.app.f r15 = com.tencent.p014mm.app.C40008f.f107254d
            com.tencent.mm.plugin.mv.jump.MusicPullDownView$musicPlayerListener$1 r0 = new com.tencent.mm.plugin.mv.jump.MusicPullDownView$musicPlayerListener$1
            r0.<init>(r10, r15)
            r10.f162996p = r0
            com.tencent.mm.plugin.mv.ui.open.text_status.MusicMvView r15 = new com.tencent.mm.plugin.mv.ui.open.text_status.MusicMvView
            android.content.Context r0 = r12.getContext()
            java.lang.String r1 = "container.context"
            gy3.C87412m.m108593f(r0, r1)
            r1 = 0
            r2 = 0
            r15.<init>(r0, r1, r2)
            r12.addView(r15)
            java.lang.String r12 = ".MusicVideoStatusOpenParams"
            java.lang.String r0 = ", cover_url:"
            java.lang.String r3 = ", musicShareOjbect:"
            java.lang.String r4 = "finderMvSongInfo:"
            java.lang.String r5 = r10.mo80346k()
            java.lang.String r6 = "parseXml"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            r5 = 1
            if (r13 != 0) goto L_0x0043
            goto L_0x010e
        L_0x0043:
            java.lang.String r6 = "MusicVideoStatusOpenParams"
            java.lang.String r7 = r13.f188441f     // Catch:{ Exception -> 0x00c8 }
            java.util.Map r6 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r7, r6, r1)     // Catch:{ Exception -> 0x00c8 }
            if (r6 == 0) goto L_0x00bb
            te3.kb1 r7 = new te3.kb1     // Catch:{ Exception -> 0x00c8 }
            r7.<init>()     // Catch:{ Exception -> 0x00c8 }
            fb2.C58937d.m68814a(r7, r12, r6)     // Catch:{ Exception -> 0x00c8 }
            r10.f162991h = r7     // Catch:{ Exception -> 0x00c8 }
            te3.t23 r12 = ht1.C98521u5.m127974b(r12, r6)     // Catch:{ Exception -> 0x00c8 }
            r10.f162990g = r12     // Catch:{ Exception -> 0x00c8 }
            java.lang.String r12 = r12.f185461f     // Catch:{ Exception -> 0x00c8 }
            if (r12 == 0) goto L_0x006a
            int r12 = r12.length()     // Catch:{ Exception -> 0x00c8 }
            if (r12 != 0) goto L_0x0068
            goto L_0x006a
        L_0x0068:
            r12 = 0
            goto L_0x006b
        L_0x006a:
            r12 = 1
        L_0x006b:
            if (r12 != 0) goto L_0x007a
            te3.t23 r12 = r10.f162990g     // Catch:{ Exception -> 0x00c8 }
            if (r12 == 0) goto L_0x0074
            java.lang.String r12 = r12.f185461f     // Catch:{ Exception -> 0x00c8 }
            goto L_0x0075
        L_0x0074:
            r12 = r1
        L_0x0075:
            java.lang.String r14 = java.lang.String.valueOf(r12)     // Catch:{ Exception -> 0x00c8 }
            goto L_0x0084
        L_0x007a:
            te3.kb1 r12 = r10.f162991h     // Catch:{ Exception -> 0x00c8 }
            if (r12 == 0) goto L_0x0084
            java.lang.String r12 = r12.f183912o     // Catch:{ Exception -> 0x00c8 }
            if (r12 != 0) goto L_0x0083
            goto L_0x0084
        L_0x0083:
            r14 = r12
        L_0x0084:
            r10.f162995o = r14     // Catch:{ Exception -> 0x00c8 }
            java.lang.String r12 = r10.mo80346k()     // Catch:{ Exception -> 0x00c8 }
            java.lang.String r14 = "jumpToMv ext: %s, %s, identification: %s, %s, xml: %s"
            r6 = 5
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x00c8 }
            te3.kb1 r7 = r10.f162991h     // Catch:{ Exception -> 0x00c8 }
            if (r7 == 0) goto L_0x0096
            java.lang.String r8 = r7.f183916s     // Catch:{ Exception -> 0x00c8 }
            goto L_0x0097
        L_0x0096:
            r8 = r1
        L_0x0097:
            r6[r2] = r8     // Catch:{ Exception -> 0x00c8 }
            te3.t23 r8 = r10.f162990g     // Catch:{ Exception -> 0x00c8 }
            if (r8 == 0) goto L_0x00a0
            java.lang.String r9 = r8.f185465j     // Catch:{ Exception -> 0x00c8 }
            goto L_0x00a1
        L_0x00a0:
            r9 = r1
        L_0x00a1:
            r6[r5] = r9     // Catch:{ Exception -> 0x00c8 }
            r9 = 2
            if (r7 == 0) goto L_0x00a9
            java.lang.String r7 = r7.f183917t     // Catch:{ Exception -> 0x00c8 }
            goto L_0x00aa
        L_0x00a9:
            r7 = r1
        L_0x00aa:
            r6[r9] = r7     // Catch:{ Exception -> 0x00c8 }
            r7 = 3
            if (r8 == 0) goto L_0x00b1
            java.lang.String r1 = r8.f185468p     // Catch:{ Exception -> 0x00c8 }
        L_0x00b1:
            r6[r7] = r1     // Catch:{ Exception -> 0x00c8 }
            r1 = 4
            java.lang.String r13 = r13.f188441f     // Catch:{ Exception -> 0x00c8 }
            r6[r1] = r13     // Catch:{ Exception -> 0x00c8 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r14, r6)     // Catch:{ Exception -> 0x00c8 }
        L_0x00bb:
            java.lang.String r12 = r10.mo80346k()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            goto L_0x00ef
        L_0x00c5:
            r11 = move-exception
            goto L_0x016b
        L_0x00c8:
            r12 = move-exception
            java.lang.String r13 = r10.mo80346k()     // Catch:{ all -> 0x00c5 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c5 }
            r14.<init>()     // Catch:{ all -> 0x00c5 }
            java.lang.String r1 = "process TextStatusJumpInfo fail:"
            r14.append(r1)     // Catch:{ all -> 0x00c5 }
            java.lang.String r12 = r12.getLocalizedMessage()     // Catch:{ all -> 0x00c5 }
            r14.append(r12)     // Catch:{ all -> 0x00c5 }
            java.lang.String r12 = r14.toString()     // Catch:{ all -> 0x00c5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r12)     // Catch:{ all -> 0x00c5 }
            java.lang.String r12 = r10.mo80346k()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
        L_0x00ef:
            r13.append(r4)
            te3.kb1 r14 = r10.f162991h
            r13.append(r14)
            r13.append(r3)
            te3.t23 r14 = r10.f162990g
            r13.append(r14)
            r13.append(r0)
            java.lang.String r14 = r10.f162995o
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r13)
        L_0x010e:
            te3.t23 r12 = r10.f162990g
            if (r12 == 0) goto L_0x0134
            java.lang.String r13 = r12.f185459d
            java.lang.String r14 = r12.f185460e
            if (r13 == 0) goto L_0x0134
            if (r14 == 0) goto L_0x0134
            int r13 = r13.length()
            if (r13 <= 0) goto L_0x0122
            r13 = 1
            goto L_0x0123
        L_0x0122:
            r13 = 0
        L_0x0123:
            if (r13 == 0) goto L_0x0134
            int r13 = r14.length()
            if (r13 <= 0) goto L_0x012d
            r13 = 1
            goto L_0x012e
        L_0x012d:
            r13 = 0
        L_0x012e:
            if (r13 == 0) goto L_0x0134
            r15.mo80408g(r12)
            r2 = 1
        L_0x0134:
            if (r2 != 0) goto L_0x013d
            te3.kb1 r12 = r10.f162991h
            if (r12 == 0) goto L_0x013d
            r15.mo80407f(r12)
        L_0x013d:
            r10.f162989f = r15
            com.tencent.mm.plugin.mv.jump.MusicPullDownView$musicPlayerListener$1 r12 = r10.f162996p
            r12.alive()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "bindMvView "
            r12.append(r13)
            int r13 = r10.hashCode()
            r12.append(r13)
            java.lang.String r13 = " - mv:"
            r12.append(r13)
            int r13 = r15.hashCode()
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r12)
            r10.f163002v = r5
            return
        L_0x016b:
            java.lang.String r12 = r10.mo80346k()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r4)
            te3.kb1 r14 = r10.f162991h
            r13.append(r14)
            r13.append(r3)
            te3.t23 r14 = r10.f162990g
            r13.append(r14)
            r13.append(r0)
            java.lang.String r14 = r10.f162995o
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r13)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.p081mv.jump.MusicPullDownView.<init>(java.lang.String, android.widget.FrameLayout, uz2.a0, uz2.m, int):void");
    }

    /* renamed from: c */
    public long mo79974c() {
        return (long) this.f163002v;
    }

    /* renamed from: e */
    public void mo79961e() {
        this.f170310d = false;
        mo80347l();
    }

    /* renamed from: f */
    public void mo79962f() {
        this.f170310d = true;
        mo80348m();
    }

    /* renamed from: g */
    public void mo79963g() {
        this.f162996p.dead();
    }

    public String getTag() {
        return "MusicPullDownView";
    }

    /* renamed from: h */
    public void mo79964h() {
        this.f162996p.alive();
    }

    /* renamed from: i */
    public void mo79965i(float f) {
    }

    /* renamed from: j */
    public final boolean mo80345j() {
        if (!C61104a.m71668x()) {
            MusicMvView musicMvView = this.f162989f;
            return C61104a.m71642B(musicMvView != null ? musicMvView.getContext() : null, false);
        }
    }

    /* renamed from: k */
    public String mo80346k() {
        return this.f162988e;
    }

    /* renamed from: l */
    public void mo80347l() {
        Class cls = C63389c.class;
        this.f163001u = false;
        boolean j = mo80345j();
        boolean z = Util.secondsToNow(this.f162992i) >= 5;
        if (mo80345j()) {
            C99364n.m129616h().mo138835p();
        } else if (this.f163000t) {
            ((C63389c) C86312j.m106911c(cls)).mo88298vr();
        } else {
            boolean Pu0 = ((C60200t1) C86312j.m106911c(C60200t1.class)).Pu0();
            if (!z || !Pu0) {
                this.f162998r = C99364n.m129616h().mo138822a().getPlayPosition();
                C101093a.m132490l();
                if (this.f162999s) {
                    C101106m mVar = this.f162993j;
                    if (mVar != null) {
                        mVar.f295953N = true;
                    }
                    ((C63389c) C86312j.m106911c(cls)).mo88294IM(this.f162993j, this.f162994n);
                    C101093a.m132488j(this.f162993j);
                }
            } else {
                this.f162993j = null;
                this.f162997q = 0;
                MusicMvView musicMvView = this.f162989f;
                if (musicMvView != null) {
                    musicMvView.post(C56895a.f163003d);
                }
            }
        }
        MusicMvView musicMvView2 = this.f162989f;
        if (musicMvView2 != null) {
            musicMvView2.mo80405d();
        }
        String k = mo80346k();
        Log.m105924i(k, "onPostClose@" + hashCode() + ' ' + j + ' ' + this.f163000t + ' ' + z + ' ' + this.f162999s + ' ' + this.f162998r + ' ' + this.f162997q);
    }

    /* renamed from: m */
    public void mo80348m() {
        boolean z;
        Class cls = C63389c.class;
        boolean c = C101093a.m132481c();
        this.f162999s = c;
        this.f163001u = true;
        this.f163000t = false;
        if (!c) {
            C64488kb1 kb12 = this.f162991h;
            if (kb12 != null) {
                C65415e0 e0Var = C65415e0.f188260a;
                C64719t23 t232 = this.f162990g;
                String str = kb12.f183909i;
                if (str == null) {
                    str = String.valueOf(System.currentTimeMillis());
                }
                String str2 = str;
                C87412m.m108593f(str2, "it.songId\n              …ntTimeMillis().toString()");
                e0Var.mo89508f(kb12, t232, str2, 14, this.f162995o);
            }
        } else {
            C101106m b = C101093a.m132480b();
            if (b != null) {
                String str3 = b.f295966n;
                C64488kb1 kb13 = this.f162991h;
                z = C87412m.m108589b(str3, kb13 != null ? kb13.f183906f : null);
            } else {
                z = false;
            }
            this.f163000t = z;
            if (z) {
                C101106m b2 = C101093a.m132480b();
                if (b2 != null) {
                    b2.f295953N = false;
                    C101093a.m132491m(b2);
                }
                ((C63389c) C86312j.m106911c(cls)).mo88293H4(false);
            } else {
                this.f162997q = C99364n.m129616h().mo138822a().getPlayPosition();
                this.f162999s = C101093a.m132481c();
                this.f162993j = C101093a.m132480b();
                C101093a.m132479a();
                this.f162994n = ((C63389c) C86312j.m106911c(cls)).mo88297ll();
                C101093a.m132490l();
                C64488kb1 kb14 = this.f162991h;
                if (kb14 != null) {
                    C65415e0 e0Var2 = C65415e0.f188260a;
                    C64719t23 t233 = this.f162990g;
                    String str4 = kb14.f183909i;
                    if (str4 == null) {
                        str4 = String.valueOf(System.currentTimeMillis());
                    }
                    String str5 = str4;
                    C87412m.m108593f(str5, "it.songId\n              …ntTimeMillis().toString()");
                    e0Var2.mo89508f(kb14, t233, str5, 14, this.f162995o);
                }
            }
        }
        String k = mo80346k();
        Log.m105924i(k, "onPostOpen@" + hashCode() + ' ' + this.f163000t + "  " + this.f162999s);
        MusicMvView musicMvView = this.f162989f;
        if (musicMvView != null) {
            musicMvView.mo80406e();
        }
        this.f162992i = Util.nowSecond();
    }

    public void onDestroy() {
        String k = mo80346k();
        Log.m105924i(k, "onDestroy@" + hashCode());
        MusicMvView musicMvView = this.f162989f;
        if (musicMvView != null) {
            musicMvView.mo80409h();
        }
        this.f162996p.dead();
    }
}
