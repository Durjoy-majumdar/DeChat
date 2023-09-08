package g23;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.tencent.p014mm.plugin.vlog.model.C96557v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.nio.IntBuffer;
import p80.C110194c;
import rx3.C13598b0;
import u80.C111140b;

/* renamed from: g23.f */
public final class C107701f {

    /* renamed from: a */
    public final int f322234a;

    /* renamed from: b */
    public final int f322235b;

    /* renamed from: c */
    public boolean f322236c;

    /* renamed from: d */
    public final boolean f322237d;

    /* renamed from: e */
    public C107713n f322238e;

    /* renamed from: f */
    public C111140b f322239f;

    /* renamed from: g */
    public C107715p f322240g;

    /* renamed from: h */
    public C32227p<? super Long, ? super Long, C13598b0> f322241h;

    /* renamed from: i */
    public C32226l<? super Long, C13598b0> f322242i;

    /* renamed from: j */
    public C32226l<? super IntBuffer, C13598b0> f322243j;

    /* renamed from: k */
    public float f322244k = 1.0f;

    /* renamed from: l */
    public float f322245l = 1.0f;

    /* renamed from: m */
    public boolean f322246m;

    /* renamed from: n */
    public long f322247n = -1;

    /* renamed from: o */
    public int f322248o;

    /* renamed from: p */
    public int f322249p;

    /* renamed from: q */
    public int f322250q;

    /* renamed from: r */
    public Rect f322251r;

    /* renamed from: g23.f$a */
    public static final class C107702a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C107701f f322252d;

        /* renamed from: e */
        public final /* synthetic */ C96557v0 f322253e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107702a(C107701f fVar, C96557v0 v0Var) {
            super(0);
            this.f322252d = fVar;
            this.f322253e = v0Var;
        }

        /* JADX WARNING: type inference failed for: r8v9, types: [g23.h] */
        /* JADX WARNING: type inference failed for: r8v15, types: [g23.j] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r18 = this;
                r0 = r18
                g23.f r1 = r0.f322252d
                g23.n r2 = r1.f322238e
                com.tencent.mm.plugin.vlog.model.v0 r3 = r0.f322253e
                float r4 = r1.f322244k
                float r1 = r1.f322245l
                r2.getClass()
                java.lang.String r5 = "scriptModel"
                gy3.C87412m.m108594g(r3, r5)
                r2.f322283b = r3
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "setEffectConfig "
                r5.append(r6)
                int r6 = r2.hashCode()
                r5.append(r6)
                java.lang.String r6 = ", previewPlay:"
                r5.append(r6)
                boolean r6 = r2.f322282a
                r5.append(r6)
                java.lang.String r6 = ", scale:["
                r5.append(r6)
                r5.append(r4)
                java.lang.String r4 = ", "
                r5.append(r4)
                r5.append(r1)
                java.lang.String r1 = "] : "
                r5.append(r1)
                te3.cs4 r1 = r3.f282614d
                r5.append(r1)
                java.lang.String r1 = r5.toString()
                java.lang.String r4 = "MicroMsg.VLogScriptReader"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
                r1 = 1
                r2.mo158123c(r1)
                java.util.ArrayList<g23.b> r5 = r2.f322286e
                r5.clear()
                long r5 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
                java.util.List<? extends com.tencent.mm.plugin.vlog.model.c0> r3 = r3.f282612b
                java.util.Iterator r3 = r3.iterator()
            L_0x0067:
                boolean r7 = r3.hasNext()
                if (r7 == 0) goto L_0x0158
                java.lang.Object r7 = r3.next()
                com.tencent.mm.plugin.vlog.model.c0 r7 = (com.tencent.p014mm.plugin.vlog.model.C96533c0) r7
                boolean r8 = r7 instanceof com.tencent.p014mm.plugin.vlog.model.C96559y0
                java.lang.String r9 = ", texture:"
                java.lang.String r10 = "MicroMsg.VLogScriptTexCache"
                r11 = -1
                if (r8 == 0) goto L_0x00e5
                g23.o r8 = r2.f322287f
                p80.c[] r12 = r8.f322293a
                int r13 = r8.f322295c
                int r14 = r13 + 1
                r8.f322295c = r14
                int r13 = r13 % 2
                r8 = r12[r13]
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "requestExternalTex: "
                r12.append(r13)
                r12.append(r8)
                java.lang.String r12 = r12.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r12)
                if (r8 == 0) goto L_0x00a4
                int r11 = r8.f329652e
                r13 = r11
                goto L_0x00a5
            L_0x00a4:
                r13 = -1
            L_0x00a5:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r10 = "prepare VideoMaterial:"
                r8.append(r10)
                java.lang.String r10 = r7.f282491c
                r8.append(r10)
                r8.append(r9)
                r8.append(r13)
                java.lang.String r8 = r8.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r8)
                boolean r8 = r2.f322282a
                if (r8 == 0) goto L_0x00d8
                g23.r r8 = new g23.r
                int r14 = r2.f322291j
                int r15 = r2.f322292k
                r16 = r7
                com.tencent.mm.plugin.vlog.model.y0 r16 = (com.tencent.p014mm.plugin.vlog.model.C96559y0) r16
                boolean r9 = r2.f322285d
                r12 = r8
                r17 = r9
                r12.<init>(r13, r14, r15, r16, r17)
                goto L_0x0139
            L_0x00d8:
                g23.j r8 = new g23.j
                int r9 = r2.f322291j
                int r10 = r2.f322292k
                r11 = r7
                com.tencent.mm.plugin.vlog.model.y0 r11 = (com.tencent.p014mm.plugin.vlog.model.C96559y0) r11
                r8.<init>(r13, r9, r10, r11)
                goto L_0x0139
            L_0x00e5:
                boolean r8 = r7 instanceof com.tencent.p014mm.plugin.vlog.model.C96530a0
                if (r8 == 0) goto L_0x0138
                g23.o r8 = r2.f322287f
                p80.c[] r12 = r8.f322294b
                int r13 = r8.f322296d
                int r14 = r13 + 1
                r8.f322296d = r14
                int r13 = r13 % 2
                r8 = r12[r13]
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "requestNormalTex: "
                r12.append(r13)
                r12.append(r8)
                java.lang.String r12 = r12.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r12)
                if (r8 == 0) goto L_0x010f
                int r11 = r8.f329652e
            L_0x010f:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r10 = "prepare ImageMaterial:"
                r8.append(r10)
                java.lang.String r10 = r7.f282491c
                r8.append(r10)
                r8.append(r9)
                r8.append(r11)
                java.lang.String r8 = r8.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r8)
                g23.h r8 = new g23.h
                int r9 = r2.f322291j
                int r10 = r2.f322292k
                r12 = r7
                com.tencent.mm.plugin.vlog.model.a0 r12 = (com.tencent.p014mm.plugin.vlog.model.C96530a0) r12
                r8.<init>(r11, r9, r10, r12)
                goto L_0x0139
            L_0x0138:
                r8 = 0
            L_0x0139:
                if (r8 == 0) goto L_0x0067
                java.util.ArrayList<g23.b> r9 = r2.f322286e
                r9.add(r8)
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "init cacheMaterialPlayer put "
                r8.append(r9)
                java.lang.String r7 = r7.f282491c
                r8.append(r7)
                java.lang.String r7 = r8.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r7)
                goto L_0x0067
            L_0x0158:
                java.util.ArrayList<g23.b> r2 = r2.f322286e
                java.util.List r1 = sx3.C110818d0.m150947s0(r2, r1)
                java.util.Iterator r1 = r1.iterator()
            L_0x0162:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x0172
                java.lang.Object r2 = r1.next()
                g23.b r2 = (g23.C107697b) r2
                r2.mo158105c()
                goto L_0x0162
            L_0x0172:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "init prepare all material player cost:"
                r1.append(r2)
                long r2 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r5)
                r1.append(r2)
                java.lang.String r2 = "ms"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: g23.C107701f.C107702a.invoke():java.lang.Object");
        }
    }

    /* renamed from: g23.f$b */
    public static final class C107703b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C107701f f322254d;

        /* renamed from: e */
        public final /* synthetic */ C107715p f322255e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107703b(C107701f fVar, C107715p pVar) {
            super(0);
            this.f322254d = fVar;
            this.f322255e = pVar;
        }

        public Object invoke() {
            int i;
            C107701f fVar = this.f322254d;
            int i2 = fVar.f322249p;
            if (i2 <= 0 || (i = fVar.f322250q) <= 0) {
                fVar.f322238e.mo158122b(fVar.f322234a, fVar.f322235b);
            } else {
                fVar.f322238e.mo158122b(i2, i);
            }
            C107701f fVar2 = this.f322254d;
            fVar2.f322239f = new C111140b(0, 0, fVar2.f322234a, fVar2.f322235b, 0, 4, 16, (C8480h) null);
            Log.m105924i("MicroMsg.VLogDirector", this.f322254d.hashCode() + " setVLogSurface, updateDrawViewSize:[" + this.f322254d.f322234a + ", " + this.f322254d.f322235b + ']');
            C107701f fVar3 = this.f322254d;
            C111140b bVar = fVar3.f322239f;
            if (bVar != null) {
                bVar.mo158522s(fVar3.f322234a, fVar3.f322235b);
            }
            C107701f fVar4 = this.f322254d;
            if (fVar4.f322249p <= 0 || fVar4.f322250q <= 0) {
                Log.m105924i("MicroMsg.VLogDirector", this.f322254d.hashCode() + " setVLogSurface, update texture and draw size:[" + this.f322254d.f322234a + ", " + this.f322254d.f322235b + ']');
                C107701f fVar5 = this.f322254d;
                C111140b bVar2 = fVar5.f322239f;
                if (bVar2 != null) {
                    bVar2.mo143263u(fVar5.f322234a, fVar5.f322235b);
                }
            } else {
                Log.m105924i("MicroMsg.VLogDirector", this.f322254d.hashCode() + " setVLogSurface, update texture size from texture:[" + this.f322254d.f322249p + ", " + this.f322254d.f322250q + ']');
                C107701f fVar6 = this.f322254d;
                C111140b bVar3 = fVar6.f322239f;
                if (bVar3 != null) {
                    bVar3.mo143263u(fVar6.f322249p, fVar6.f322250q);
                }
            }
            C107701f fVar7 = this.f322254d;
            C111140b bVar4 = fVar7.f322239f;
            if (bVar4 != null) {
                bVar4.f332795Y = 3553;
            }
            if (bVar4 != null) {
                C110194c cVar = this.f322255e.f322299c;
                bVar4.f332773C = cVar != null ? cVar.f329652e : -1;
            }
            Rect rect = fVar7.f322251r;
            if (!(rect == null || bVar4 == null)) {
                bVar4.f332761p = rect;
            }
            if (bVar4 != null) {
                bVar4.f332762q = new C107704g(fVar7);
            }
            return C13598b0.f38549a;
        }
    }

    public C107701f(int i, int i2, boolean z, boolean z2) {
        this.f322234a = i;
        this.f322235b = i2;
        this.f322236c = z;
        this.f322237d = z2;
        this.f322238e = new C107713n(z2);
    }

    /* renamed from: a */
    public static void m145877a(C107701f fVar, Bitmap bitmap, boolean z, C32224a aVar, int i, Object obj) {
        C107715p pVar;
        Bitmap bitmap2 = (i & 1) != 0 ? null : bitmap;
        boolean z2 = (i & 2) != 0 ? false : z;
        C32224a aVar2 = (i & 4) != 0 ? null : aVar;
        if (fVar.f322246m && (pVar = fVar.f322240g) != null) {
            pVar.mo158117c(new C107698c(fVar, pVar, bitmap2, z2, aVar2));
        }
    }

    /* renamed from: b */
    public final void mo158109b(Rect rect) {
        if (rect != null) {
            Log.m105924i("MicroMsg.VLogDirector", "setCropRect:" + rect + ", width:" + this.f322234a + ", height:" + this.f322235b + ", textureWidth:" + this.f322249p + ", textureHeight:" + this.f322250q);
            Rect rect2 = new Rect(rect);
            this.f322251r = rect2;
            C111140b bVar = this.f322239f;
            if (bVar != null) {
                bVar.f332761p = rect2;
            }
        }
    }

    /* renamed from: c */
    public final void mo158110c(int i, int i2) {
        C107713n nVar = this.f322238e;
        nVar.getClass();
        nVar.f322288g = (long) (1000 / i);
        nVar.f322289h = (long) (1000 / i2);
        Log.m105924i("MicroMsg.VLogScriptReader", "videoPtsStep :" + nVar.f322288g + " imagePtsStep:" + nVar.f322289h);
    }

    /* renamed from: d */
    public final void mo158111d(C96557v0 v0Var, int i, String str) {
        C87412m.m108594g(v0Var, "scriptModel");
        C87412m.m108594g(str, "musicUrl");
        Log.m105924i("MicroMsg.VLogDirector", hashCode() + "  setScript  durationMs :" + i + "  musicUrl:" + str);
        this.f322248o = i;
        this.f322247n = 0;
        this.f322246m = true;
        C107715p pVar = this.f322240g;
        if (pVar != null) {
            pVar.mo158117c(new C107702a(this, v0Var));
        }
    }

    /* renamed from: e */
    public final void mo158112e(C107715p pVar) {
        C87412m.m108594g(pVar, "vLogSurface");
        Log.m105924i("MicroMsg.VLogDirector", hashCode() + " setSurface");
        this.f322240g = pVar;
        pVar.mo158117c(new C107703b(this, pVar));
    }
}
