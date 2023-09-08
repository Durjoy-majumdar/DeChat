package qs0;

import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import com.tencent.p014mm.plugin.appbrand.video.player.thumb.C18046c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import in0.d$$e;
import ns0.C89084e;
import qs0.C101246f;
import rx3.C13598b0;
import zt3.C119157j;

/* renamed from: qs0.d */
public final class C101242d extends C18046c {

    /* renamed from: G */
    public static final C89834a f296447G = new C89834a((C8480h) null);

    /* renamed from: H */
    public static int f296448H;

    /* renamed from: E */
    public final C89084e f296449E;

    /* renamed from: F */
    public C101251i f296450F;

    /* renamed from: qs0.d$b */
    public static final class C63322b {

        /* renamed from: a */
        public final boolean f179680a;

        /* renamed from: b */
        public final String f179681b;

        public C63322b(boolean z, String str) {
            C87412m.m108594g(str, "realSrc");
            this.f179680a = z;
            this.f179681b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C63322b)) {
                return false;
            }
            C63322b bVar = (C63322b) obj;
            return this.f179680a == bVar.f179680a && C87412m.m108589b(this.f179681b, bVar.f179681b);
        }

        public int hashCode() {
            boolean z = this.f179680a;
            if (z) {
                z = true;
            }
            return ((z ? 1 : 0) * true) + this.f179681b.hashCode();
        }

        public String toString() {
            return "DataSourceInfo(isHls=" + this.f179680a + ", realSrc=" + this.f179681b + ')';
        }
    }

    /* renamed from: qs0.d$c */
    public static final class C63323c extends C87413o implements C32224a<C63322b> {

        /* renamed from: d */
        public final /* synthetic */ String f179682d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63323c(String str) {
            super(0);
            this.f179682d = str;
        }

        public Object invoke() {
            return new C63322b(false, this.f179682d);
        }
    }

    /* renamed from: qs0.d$e */
    public static final class C63324e extends C87413o implements C32224a<C63322b> {

        /* renamed from: d */
        public final /* synthetic */ int f179683d;

        /* renamed from: e */
        public final /* synthetic */ String f179684e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63324e(int i, String str) {
            super(0);
            this.f179683d = i;
            this.f179684e = str;
        }

        public Object invoke() {
            return new C63322b(2 == this.f179683d, this.f179684e);
        }
    }

    /* renamed from: qs0.d$a */
    public static final class C89834a {
        public C89834a(C8480h hVar) {
        }

        /* renamed from: b */
        public static /* synthetic */ C101242d m112326b(C89834a aVar, Context context, Looper looper, boolean z, C89084e eVar, int i, Object obj) {
            if ((i & 2) != 0) {
                looper = null;
            }
            if ((i & 4) != 0) {
                z = false;
            }
            if ((i & 8) != 0) {
                eVar = null;
            }
            return aVar.mo124112a(context, looper, z, eVar);
        }

        /* renamed from: a */
        public final C101242d mo124112a(Context context, Looper looper, boolean z, C89084e eVar) {
            C87412m.m108594g(context, "context");
            synchronized (this) {
                Log.m105918d("MicroMsg.AppBrandThumbMediaPlayer", "create, totalCount: " + C101242d.f296448H + ", TOTAL_PLAYER_COUNT_THRESHOLD: " + 16);
                int i = C101242d.f296448H;
                if (16 <= i) {
                    Log.m105924i("MicroMsg.AppBrandThumbMediaPlayer", "create, reach limit");
                    return null;
                }
                C101242d.f296448H = i + 1;
                return new C101242d(context, looper, z, eVar, (C8480h) null);
            }
        }
    }

    /* renamed from: qs0.d$d */
    public static final class C89835d extends C87413o implements C32224a<C63322b> {

        /* renamed from: d */
        public final /* synthetic */ String f258247d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89835d(String str) {
            super(0);
            this.f258247d = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0059, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x005a, code lost:
            cy3.C58003b.m67160a(r2, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x005d, code lost:
            throw r1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r8 = this;
                java.lang.String r0 = r8.f258247d
                java.lang.String r1 = "src"
                gy3.C87412m.m108594g(r0, r1)
                java.lang.String r1 = "MicroMsg.AppBrand.ThumbContainerFormatInferer"
                fy3.l<java.lang.String, os0.c> r2 = os0.C89295c.f257244e
                os0.c$a r2 = (os0.C89295c.C89296a) r2
                java.lang.Object r2 = r2.invoke(r0)
                os0.c r2 = (os0.C89295c) r2
                r3 = 0
                in0.b r4 = in0.C87758b.f254077a     // Catch:{ Exception -> 0x0042 }
                boolean r4 = r4.mo122162a(r2)     // Catch:{ Exception -> 0x0042 }
                java.lang.String r5 = r2.mo123636b()     // Catch:{ Exception -> 0x0042 }
                if (r5 != 0) goto L_0x0022
                r5 = r0
            L_0x0022:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0042 }
                r6.<init>()     // Catch:{ Exception -> 0x0042 }
                java.lang.String r7 = "isHls, src: "
                r6.append(r7)     // Catch:{ Exception -> 0x0042 }
                r6.append(r0)     // Catch:{ Exception -> 0x0042 }
                java.lang.String r7 = ", finalUrl: "
                r6.append(r7)     // Catch:{ Exception -> 0x0042 }
                r6.append(r5)     // Catch:{ Exception -> 0x0042 }
                java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0042 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r6)     // Catch:{ Exception -> 0x0042 }
                r0 = r5
                goto L_0x004f
            L_0x0040:
                r0 = move-exception
                goto L_0x0058
            L_0x0042:
                r4 = move-exception
                java.lang.String r5 = "judge isHls fail"
                r6 = 0
                java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x0040 }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r4, r5, r6)     // Catch:{ all -> 0x0040 }
                boolean r4 = fn0.C87002g.m108019m(r0)     // Catch:{ all -> 0x0040 }
            L_0x004f:
                cy3.C58003b.m67160a(r2, r3)
                qs0.d$b r1 = new qs0.d$b
                r1.<init>(r4, r0)
                return r1
            L_0x0058:
                throw r0     // Catch:{ all -> 0x0059 }
            L_0x0059:
                r1 = move-exception
                cy3.C58003b.m67160a(r2, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: qs0.C101242d.C89835d.invoke():java.lang.Object");
        }
    }

    /* renamed from: qs0.d$f */
    public static final class C101243f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C101242d f296451d;

        /* renamed from: e */
        public final /* synthetic */ String f296452e;

        /* renamed from: f */
        public final /* synthetic */ String f296453f;

        /* renamed from: g */
        public final /* synthetic */ d$$e f296454g;

        public C101243f(C101242d dVar, String str, String str2, d$$e d__e) {
            this.f296451d = dVar;
            this.f296452e = str;
            this.f296453f = str2;
            this.f296454g = d__e;
        }

        public final void run() {
            C101242d.super.mo22580m(this.f296452e, this.f296453f, this.f296454g);
        }
    }

    /* renamed from: qs0.d$g */
    public static final class C101244g extends C87413o implements C32227p<Long, Long, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C101242d f296455d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C101244g(C101242d dVar) {
            super(2);
            this.f296455d = dVar;
        }

        public Object invoke(Object obj, Object obj2) {
            this.f296455d.mo22556w((int) ((((float) ((Number) obj).longValue()) * 100.0f) / ((float) ((Number) obj2).longValue())));
            return C13598b0.f38549a;
        }
    }

    public C101242d(Context context, Looper looper, boolean z, C89084e eVar, C8480h hVar) {
        super(context, looper, z, false);
        this.f296449E = eVar;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: L */
    public final void mo140714L(java.lang.String r14, java.lang.String r15, fy3.C32224a<qs0.C101242d.C63322b> r16) {
        /*
            r13 = this;
            r8 = r13
            r0 = r14
            qs0.e r1 = qs0.C101245e.PROXY_CDN
            java.lang.Class<h81.h> r2 = h81.C32735h.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            h81.h r2 = (h81.C32735h) r2
            r3 = 2
            if (r2 == 0) goto L_0x0016
            h81.h$c r4 = h81.C32735h.C32737c.clicfg_android_wxa_tp_download_strategy
            int r2 = r2.mo58779Qe(r4, r3)
            goto L_0x0017
        L_0x0016:
            r2 = 2
        L_0x0017:
            qs0.e[] r4 = qs0.C101245e.values()
            int r5 = r4.length
            r6 = 0
            r7 = 0
        L_0x001e:
            r9 = 0
            r10 = 1
            if (r7 >= r5) goto L_0x0031
            r11 = r4[r7]
            int r12 = r11.f296459d
            if (r2 != r12) goto L_0x002a
            r12 = 1
            goto L_0x002b
        L_0x002a:
            r12 = 0
        L_0x002b:
            if (r12 == 0) goto L_0x002e
            goto L_0x0032
        L_0x002e:
            int r7 = r7 + 1
            goto L_0x001e
        L_0x0031:
            r11 = r9
        L_0x0032:
            if (r11 != 0) goto L_0x0035
            goto L_0x0036
        L_0x0035:
            r1 = r11
        L_0x0036:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "get, strategy: "
            r2.append(r4)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "MicroMsg.AppBrand.TPDownloadStrategy"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            qs0.e r2 = qs0.C101245e.NOT_PROXY
            if (r2 != r1) goto L_0x0078
            java.lang.String r1 = "MicroMsg.AppBrandThumbMediaPlayer"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "setDataSource, path: "
            r2.append(r3)
            r2.append(r14)
            java.lang.String r3 = ", not proxy"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            r4 = 0
            r5 = 0
            r6 = 8
            r7 = 0
            r1 = r13
            r2 = r14
            r3 = r15
            com.tencent.p014mm.plugin.appbrand.video.player.thumb.C18046c.m18615J(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0078:
            java.lang.Object r2 = r16.invoke()
            qs0.d$b r2 = (qs0.C101242d.C63322b) r2
            boolean r4 = r2.f179680a
            java.lang.String r2 = r2.f179681b
            java.lang.String r5 = "MicroMsg.AppBrandThumbMediaPlayer"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r11 = "setDataSource, path: "
            r7.append(r11)
            r7.append(r14)
            java.lang.String r11 = ", isHls: "
            r7.append(r11)
            r7.append(r4)
            java.lang.String r11 = ", realSrc: "
            r7.append(r11)
            r7.append(r2)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r7)
            if (r4 == 0) goto L_0x00b7
            r4 = 0
            r5 = 0
            r6 = 8
            r7 = 0
            r1 = r13
            r3 = r15
            com.tencent.p014mm.plugin.appbrand.video.player.thumb.C18046c.m18615J(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x015f
        L_0x00b7:
            qs0.f r4 = qs0.C101246f.f296460a
            com.tencent.mm.vfs.m1 r4 = r4.mo140717b()
            boolean r4 = r4.mo119967g()
            if (r4 != 0) goto L_0x00d6
            java.lang.String r0 = "MicroMsg.AppBrandThumbMediaPlayer"
            java.lang.String r1 = "setDataSource, cache not touchable"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            r4 = 0
            r5 = 0
            r6 = 8
            r7 = 0
            r1 = r13
            r3 = r15
            com.tencent.p014mm.plugin.appbrand.video.player.thumb.C18046c.m18615J(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x00d6:
            ns0.e r4 = r8.f296449E
            if (r4 == 0) goto L_0x00e3
            java.lang.Long r4 = r4.f256743c
            if (r4 == 0) goto L_0x00e3
            long r4 = r4.longValue()
            goto L_0x00e5
        L_0x00e3:
            r4 = 0
        L_0x00e5:
            java.lang.String r7 = "MicroMsg.AppBrandThumbMediaPlayer"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "setDataSource, totalContentLengthHint: "
            r11.append(r12)
            r11.append(r4)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r11)
            float r4 = (float) r4
            r5 = 1296039936(0x4d400000, float:2.01326592E8)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x010f
            r4 = 1
            r5 = 0
            r6 = 8
            r7 = 0
            r1 = r13
            r2 = r14
            r3 = r15
            com.tencent.p014mm.plugin.appbrand.video.player.thumb.C18046c.m18615J(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x010f:
            int r0 = r1.ordinal()
            if (r0 == r10) goto L_0x0155
            if (r0 == r3) goto L_0x0118
            goto L_0x015f
        L_0x0118:
            java.lang.String r0 = "http"
            boolean r0 = z04.C112551y.m153820t(r2, r0, r6, r3, r9)
            if (r0 == 0) goto L_0x014a
            com.tencent.thumbplayer.api.ITPPlayer r0 = r8.f49877q
            qs0.i r1 = new qs0.i
            qs0.d$g r3 = new qs0.d$g
            r3.<init>(r13)
            r1.<init>(r2, r3)
            monitor-enter(r13)
            monitor-enter(r13)     // Catch:{ all -> 0x0143 }
            qs0.i r3 = r8.f296450F     // Catch:{ all -> 0x0145 }
            if (r3 == 0) goto L_0x0135
            r3.mo140724a()     // Catch:{ all -> 0x0145 }
        L_0x0135:
            monitor-exit(r13)     // Catch:{ all -> 0x0143 }
            r8.f296450F = r1     // Catch:{ all -> 0x0143 }
            monitor-exit(r13)
            r0.enableTPAssetResourceLoader(r1)
            r0 = 11
            r3 = r15
            r13.mo22531I(r2, r15, r10, r0)
            goto L_0x015f
        L_0x0143:
            r0 = move-exception
            goto L_0x0148
        L_0x0145:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0143 }
            throw r0     // Catch:{ all -> 0x0143 }
        L_0x0148:
            monitor-exit(r13)
            throw r0
        L_0x014a:
            r3 = r15
            r4 = 0
            r5 = 0
            r6 = 8
            r7 = 0
            r1 = r13
            com.tencent.p014mm.plugin.appbrand.video.player.thumb.C18046c.m18615J(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x015f
        L_0x0155:
            r3 = r15
            r4 = 1
            r5 = 0
            r6 = 8
            r7 = 0
            r1 = r13
            com.tencent.p014mm.plugin.appbrand.video.player.thumb.C18046c.m18615J(r1, r2, r3, r4, r5, r6, r7)
        L_0x015f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qs0.C101242d.mo140714L(java.lang.String, java.lang.String, fy3.a):void");
    }

    /* renamed from: d */
    public void mo22534d(String str, String str2) {
        C87412m.m108594g(str, "path");
        if (this.f49875o) {
            mo140714L(str, str2, new C63323c(str));
        } else {
            mo140714L(str, str2, new C89835d(str));
        }
    }

    /* renamed from: g */
    public void mo22577g(String str, String str2, int i) {
        C87412m.m108594g(str, "path");
        mo140714L(str, str2, new C63324e(i, str));
    }

    /* renamed from: m */
    public void mo22580m(String str, String str2, d$$e d__e) {
        ((C119157j) C119157j.f356862d).mo183875f(new C101243f(this, str, str2, d__e));
    }

    public void pause() {
        super.pause();
        synchronized (this) {
            C101251i iVar = this.f296450F;
            if (iVar != null) {
                iVar.mo140726d();
            }
        }
    }

    public void prepareAsync() {
        super.prepareAsync();
        synchronized (this) {
            C101251i iVar = this.f296450F;
            if (iVar != null) {
                iVar.mo140725c();
            }
        }
    }

    public void release() {
        super.release();
        synchronized (this) {
            C101251i iVar = this.f296450F;
            if (iVar != null) {
                iVar.mo140724a();
            }
        }
        synchronized (f296447G) {
            Log.m105918d("MicroMsg.AppBrandThumbMediaPlayer", "onRelease, totalCount: " + f296448H + ", TOTAL_PLAYER_COUNT_THRESHOLD: " + 16);
            f296448H = f296448H + -1;
        }
    }

    public void start() {
        super.start();
        synchronized (this) {
            C101251i iVar = this.f296450F;
            if (iVar != null) {
                iVar.mo140725c();
            }
        }
    }

    public void stop() {
        super.stop();
        synchronized (this) {
            C101251i iVar = this.f296450F;
            if (iVar != null) {
                iVar.mo140726d();
            }
        }
    }

    /* renamed from: z */
    public boolean mo32891z(int i, int i2) {
        Uri.Builder builder;
        Uri.Builder builder2;
        Uri.Builder builder3;
        boolean z = super.mo32891z(i, i2);
        C101251i iVar = this.f296450F;
        if (iVar != null) {
            Log.m105924i(iVar.f296481f, "onError");
            C101246f fVar = C101246f.f296460a;
            C101246f.C101248b bVar = iVar.f296482g;
            C87412m.m108594g(bVar, "cacheInfoHolder");
            C101246f.C101247a aVar = bVar.f296466a;
            Log.m105924i("MicroMsg.AppBrand.ThumbCdnCacheManager", "onCacheError, cacheInfo: " + aVar);
            C86009m1 b = fVar.mo140717b();
            String str = aVar.f296463b + ".res";
            Uri uri = b == null ? null : b.f250486d;
            if (uri == null) {
                builder = new Uri.Builder().path(str);
            } else {
                builder = uri.buildUpon();
                if (!str.isEmpty()) {
                    builder.appendPath(str);
                }
            }
            Uri build = builder.build();
            String path = build.getPath();
            boolean z2 = false;
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!build.getPath().equals(k)) {
                    build = builder.path(k).build();
                }
            }
            C116281f0 f0Var = C116281f0.C116289i.f348994a;
            C116281f0.C116288h l = f0Var.mo177799l(build, (C116281f0.C116288h) null);
            Log.m105924i("MicroMsg.AppBrand.ThumbCdnCacheManager", "onCacheError, cacheDeleted: " + (l.mo177810a() && l.f348991a.mo119933c(l.f348992b)));
            String str2 = aVar.f296463b;
            C86009m1 b2 = fVar.mo140717b();
            String str3 = str2 + ".mark";
            Uri uri2 = b2 == null ? null : b2.f250486d;
            if (uri2 == null) {
                builder2 = new Uri.Builder().path(str3);
            } else {
                builder2 = uri2.buildUpon();
                if (!str3.isEmpty()) {
                    builder2.appendPath(str3);
                }
            }
            Uri build2 = builder2.build();
            String path2 = build2.getPath();
            if (path2 != null) {
                String k2 = C116299g2.m163855k(path2, false, false);
                if (!build2.getPath().equals(k2)) {
                    build2 = builder2.path(k2).build();
                }
            }
            C116281f0.C116288h l2 = f0Var.mo177799l(build2, (C116281f0.C116288h) null);
            boolean z3 = l2.mo177810a() && l2.f348991a.mo119933c(l2.f348992b);
            C86009m1 b3 = fVar.mo140717b();
            String str4 = str2 + ".temp.mark";
            Uri uri3 = b3 == null ? null : b3.f250486d;
            if (uri3 == null) {
                builder3 = new Uri.Builder().path(str4);
            } else {
                builder3 = uri3.buildUpon();
                if (!str4.isEmpty()) {
                    builder3.appendPath(str4);
                }
            }
            Uri build3 = builder3.build();
            String path3 = build3.getPath();
            if (path3 != null) {
                String k3 = C116299g2.m163855k(path3, false, false);
                if (!build3.getPath().equals(k3)) {
                    build3 = builder3.path(k3).build();
                }
            }
            C116281f0.C116288h l3 = f0Var.mo177799l(build3, (C116281f0.C116288h) null);
            if (l3.mo177810a() && l3.f348991a.mo119933c(l3.f348992b)) {
                z2 = true;
            }
            Log.m105924i("MicroMsg.AppBrand.ThumbCdnCacheManager", "clearMark, markDeleted: " + z3 + ", tempMarkDeleted: " + z2);
            bVar.f296466a = C101246f.C101247a.m132824a(aVar, (String) null, (String) null, (String) null, false, 7, (Object) null);
        }
        return z;
    }
}
