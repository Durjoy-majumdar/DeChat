package g23;

import ac3.C103355g1;
import com.tencent.p014mm.plugin.vlog.model.C96557v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import java.util.ArrayList;
import p80.C110193b;
import q00.C110264g;

/* renamed from: g23.n */
public final class C107713n {

    /* renamed from: a */
    public boolean f322282a;

    /* renamed from: b */
    public C96557v0 f322283b;

    /* renamed from: c */
    public C103355g1 f322284c;

    /* renamed from: d */
    public boolean f322285d = true;

    /* renamed from: e */
    public ArrayList<C107697b> f322286e = new ArrayList<>();

    /* renamed from: f */
    public C107714o f322287f = new C107714o();

    /* renamed from: g */
    public long f322288g = 33;

    /* renamed from: h */
    public long f322289h = 16;

    /* renamed from: i */
    public long f322290i = 33;

    /* renamed from: j */
    public int f322291j;

    /* renamed from: k */
    public int f322292k;

    public C107713n(boolean z) {
        this.f322282a = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x0104 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo158121a(java.util.ArrayList<com.tencent.p014mm.plugin.vlog.model.C96533c0> r19, java.util.ArrayList<com.tencent.p014mm.plugin.vlog.model.C96533c0> r20, int r21, long r22) {
        /*
            r18 = this;
            r0 = r18
            r12 = r22
            int r1 = r0.f322291j
            int r2 = r0.f322292k
            r14 = 0
            android.opengl.GLES20.glViewport(r14, r14, r1, r2)
            w80.d$a r1 = w80.C111742d.f334647a
            r1.mo163463f()
            java.util.ArrayList<g23.b> r1 = r0.f322286e
            java.util.Iterator r1 = r1.iterator()
        L_0x0017:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0026
            java.lang.Object r2 = r1.next()
            g23.b r2 = (g23.C107697b) r2
            r2.f322223m = r14
            goto L_0x0017
        L_0x0026:
            java.util.Iterator r1 = r19.iterator()
        L_0x002a:
            boolean r2 = r1.hasNext()
            java.lang.String r15 = "MicroMsg.VLogScriptReader"
            r11 = 1
            if (r2 == 0) goto L_0x00e3
            java.lang.Object r2 = r1.next()
            com.tencent.mm.plugin.vlog.model.c0 r2 = (com.tencent.p014mm.plugin.vlog.model.C96533c0) r2
            java.util.ArrayList<g23.b> r3 = r0.f322286e
            java.util.Iterator r3 = r3.iterator()
        L_0x003f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0068
            java.lang.Object r4 = r3.next()
            r5 = r4
            g23.b r5 = (g23.C107697b) r5
            com.tencent.mm.plugin.vlog.model.c0 r6 = r5.f322214d
            java.lang.String r6 = r6.f282491c
            java.lang.String r7 = r2.f282491c
            boolean r6 = gy3.C87412m.m108589b(r6, r7)
            if (r6 == 0) goto L_0x0064
            com.tencent.mm.plugin.vlog.model.c0 r5 = r5.f322214d
            long r5 = r5.f282489a
            long r7 = r2.f282489a
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 < 0) goto L_0x0064
            r5 = 1
            goto L_0x0065
        L_0x0064:
            r5 = 0
        L_0x0065:
            if (r5 == 0) goto L_0x003f
            goto L_0x0069
        L_0x0068:
            r4 = 0
        L_0x0069:
            g23.b r4 = (g23.C107697b) r4
            if (r4 == 0) goto L_0x00d6
            boolean r3 = r4.f322225o
            java.lang.String r5 = ", "
            if (r3 != 0) goto L_0x009a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "drawImpl prepare material player: "
            r3.append(r6)
            r3.append(r12)
            r3.append(r5)
            long r6 = r2.f282489a
            r3.append(r6)
            r3.append(r5)
            java.lang.String r6 = r2.f282491c
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r3)
            r4.mo158105c()
        L_0x009a:
            boolean r3 = r4.f322224n
            if (r3 != 0) goto L_0x00cb
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "drawImpl play material player: "
            r3.append(r6)
            r3.append(r12)
            r3.append(r5)
            long r6 = r2.f282489a
            r3.append(r6)
            r3.append(r5)
            java.lang.String r5 = r2.f282491c
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r3)
            com.tencent.mm.plugin.vlog.model.c0 r3 = r4.f322214d
            long r5 = r3.f282489a
            long r5 = r12 - r5
            r4.mo158106d(r5)
        L_0x00cb:
            r4.f322223m = r11
            com.tencent.mm.plugin.vlog.model.c0 r3 = r4.f322214d
            long r5 = r3.f282489a
            long r5 = r12 - r5
            r4.mo158104b(r5, r11)
        L_0x00d6:
            boolean r2 = r2 instanceof com.tencent.p014mm.plugin.vlog.model.C96559y0
            if (r2 == 0) goto L_0x00dd
            long r2 = r0.f322288g
            goto L_0x00df
        L_0x00dd:
            long r2 = r0.f322289h
        L_0x00df:
            r0.f322290i = r2
            goto L_0x002a
        L_0x00e3:
            ac3.g1 r1 = r0.f322284c
            if (r1 == 0) goto L_0x00fc
            r2 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 120(0x78, float:1.68E-43)
            r16 = 0
            r3 = r21
            r4 = r22
            r17 = 1
            r11 = r16
            q00.C110264g.C110265b.m149907b(r1, r2, r3, r4, r6, r7, r8, r9, r10, r11)
            goto L_0x00fe
        L_0x00fc:
            r17 = 1
        L_0x00fe:
            java.util.ArrayList<g23.b> r1 = r0.f322286e
            java.util.Iterator r1 = r1.iterator()
        L_0x0104:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x017d
            java.lang.Object r2 = r1.next()
            g23.b r2 = (g23.C107697b) r2
            boolean r3 = r2.f322223m
            if (r3 != 0) goto L_0x0104
            if (r20 == 0) goto L_0x013d
            boolean r3 = r20.isEmpty()
            if (r3 == 0) goto L_0x011e
        L_0x011c:
            r11 = 0
            goto L_0x013b
        L_0x011e:
            java.util.Iterator r3 = r20.iterator()
        L_0x0122:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x011c
            java.lang.Object r4 = r3.next()
            com.tencent.mm.plugin.vlog.model.c0 r4 = (com.tencent.p014mm.plugin.vlog.model.C96533c0) r4
            java.lang.String r4 = r4.f282491c
            com.tencent.mm.plugin.vlog.model.c0 r5 = r2.f322214d
            java.lang.String r5 = r5.f282491c
            boolean r4 = gy3.C87412m.m108589b(r4, r5)
            if (r4 == 0) goto L_0x0122
            r11 = 1
        L_0x013b:
            if (r11 != 0) goto L_0x0104
        L_0x013d:
            com.tencent.mm.plugin.vlog.model.c0 r3 = r2.f322214d
            long r3 = r3.f282490b
            long r3 = r12 - r3
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0104
            boolean r3 = r2.f322224n
            if (r3 == 0) goto L_0x0104
            r2.mo158108f()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "stop player "
            r3.append(r4)
            com.tencent.mm.plugin.vlog.model.c0 r4 = r2.f322214d
            java.lang.String r4 = r4.f282491c
            r3.append(r4)
            java.lang.String r4 = ", pts:"
            r3.append(r4)
            r3.append(r12)
            java.lang.String r4 = ", endTime:"
            r3.append(r4)
            com.tencent.mm.plugin.vlog.model.c0 r2 = r2.f322214d
            long r4 = r2.f282490b
            r3.append(r4)
            java.lang.String r2 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r2)
            goto L_0x0104
        L_0x017d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g23.C107713n.mo158121a(java.util.ArrayList, java.util.ArrayList, int, long):void");
    }

    /* renamed from: b */
    public final void mo158122b(int i, int i2) {
        this.f322291j = i;
        this.f322292k = i2;
        Log.m105924i("MicroMsg.VLogScriptReader", "set target size:[" + this.f322291j + ", " + this.f322292k + ']');
        C103355g1 g1Var = new C103355g1(0, false, false, false, false, false, (C110264g.C47730a) null, 127, (C8480h) null);
        this.f322284c = g1Var;
        g1Var.mo143224C(this.f322291j, this.f322292k);
        C107714o oVar = this.f322287f;
        oVar.getClass();
        Log.m105924i("MicroMsg.VLogScriptTexCache", "init cache, cacheTexsNum:2");
        for (int i3 = 0; i3 < 2; i3++) {
            oVar.f322293a[i3] = C110193b.m149776b(false, 11);
            oVar.f322294b[i3] = C110193b.m149776b(true, 11);
        }
    }

    /* renamed from: c */
    public final void mo158123c(boolean z) {
        Log.m105924i("MicroMsg.VLogScriptReader", "resetAllPlayers size:" + this.f322286e.size());
        for (C107697b bVar : this.f322286e) {
            bVar.mo158108f();
            if (z) {
                bVar.mo158107e();
            }
        }
    }
}
