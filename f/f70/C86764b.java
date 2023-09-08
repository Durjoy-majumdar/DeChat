package f70;

import android.view.Surface;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import d42.C86180g;
import gy3.C87412m;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import k10.C88049a;
import k10.C88050b;
import k10.C88051c;
import k10.C88052d;
import k10.a$$a;
import k10.c$$b;
import k10.c$$c;
import k10.c$$d;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import p172io.flutter.plugin.common.BasicMessageChannel;
import p172io.flutter.view.TextureRegistry;
import r52.C89872c;
import rx3.C36570n;

/* renamed from: f70.b */
public final class C86764b implements C88049a, FlutterPlugin {

    /* renamed from: d */
    public TextureRegistry f251857d;

    /* renamed from: e */
    public C88051c f251858e;

    /* renamed from: f */
    public final float f251859f = MMApplicationContext.getContext().getResources().getDisplayMetrics().density;

    /* renamed from: g */
    public final HashMap<String, C86765a> f251860g = new HashMap<>();

    /* renamed from: f70.b$a */
    public static final class C86765a {

        /* renamed from: a */
        public final String f251861a;

        /* renamed from: b */
        public final C89872c f251862b;

        /* renamed from: c */
        public final TextureRegistry.SurfaceTextureEntry f251863c;

        /* renamed from: d */
        public long f251864d;

        /* renamed from: e */
        public long f251865e;

        /* renamed from: f */
        public long f251866f;

        /* renamed from: g */
        public long f251867g;

        public C86765a(String str, C89872c cVar, TextureRegistry.SurfaceTextureEntry surfaceTextureEntry, long j, long j2, long j3, long j4) {
            C87412m.m108594g(str, "viewId");
            C87412m.m108594g(cVar, "view");
            C87412m.m108594g(surfaceTextureEntry, "textureEntry");
            this.f251861a = str;
            this.f251862b = cVar;
            this.f251863c = surfaceTextureEntry;
            this.f251864d = j;
            this.f251865e = j2;
            this.f251866f = j3;
            this.f251867g = j4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C86765a)) {
                return false;
            }
            C86765a aVar = (C86765a) obj;
            return C87412m.m108589b(this.f251861a, aVar.f251861a) && C87412m.m108589b(this.f251862b, aVar.f251862b) && C87412m.m108589b(this.f251863c, aVar.f251863c) && this.f251864d == aVar.f251864d && this.f251865e == aVar.f251865e && this.f251866f == aVar.f251866f && this.f251867g == aVar.f251867g;
        }

        public int hashCode() {
            long j = this.f251864d;
            long j2 = this.f251865e;
            long j3 = this.f251866f;
            long j4 = this.f251867g;
            return (((((((((((this.f251861a.hashCode() * 31) + this.f251862b.hashCode()) * 31) + this.f251863c.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)));
        }

        public String toString() {
            return "ViewInfo(viewId=" + this.f251861a + ", view=" + this.f251862b + ", textureEntry=" + this.f251863c + ", left=" + this.f251864d + ", top=" + this.f251865e + ", width=" + this.f251866f + ", height=" + this.f251867g + ')';
        }
    }

    /* renamed from: f70.b$b */
    public static final class C86766b<T> implements c$$d {

        /* renamed from: a */
        public static final C86766b<T> f251868a = new C86766b<>();

        public /* bridge */ /* synthetic */ void reply(Object obj) {
            Void voidR = (Void) obj;
        }
    }

    /* renamed from: f70.b$c */
    public static final class C86767c<T> implements c$$d {

        /* renamed from: a */
        public static final C86767c<T> f251869a = new C86767c<>();

        public /* bridge */ /* synthetic */ void reply(Object obj) {
            Void voidR = (Void) obj;
        }
    }

    /* renamed from: f70.b$d */
    public static final class C86768d<T> implements c$$d {

        /* renamed from: a */
        public static final C86768d<T> f251870a = new C86768d<>();

        public /* bridge */ /* synthetic */ void reply(Object obj) {
            Void voidR = (Void) obj;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0312, code lost:
        if (r5 != false) goto L_0x0315;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Boolean mo121184a(java.lang.String r45, java.util.List r46) {
        /*
            r44 = this;
            r0 = r44
            r1 = r45
            r2 = r46
            java.lang.String r3 = "viewId"
            gy3.C87412m.m108594g(r1, r3)
            java.lang.String r3 = "event"
            gy3.C87412m.m108594g(r2, r3)
            r3 = 0
            java.lang.Object r4 = r2.get(r3)
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Number"
            gy3.C87412m.m108592e(r4, r5)
            java.lang.Number r4 = (java.lang.Number) r4
            r6 = 1
            java.lang.Object r7 = r2.get(r6)
            gy3.C87412m.m108592e(r7, r5)
            java.lang.Number r7 = (java.lang.Number) r7
            r5 = 2
            java.lang.Object r8 = r2.get(r5)
            java.lang.String r9 = "null cannot be cast to non-null type kotlin.Int"
            gy3.C87412m.m108592e(r8, r9)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r10 = 3
            java.lang.Object r11 = r2.get(r10)
            gy3.C87412m.m108592e(r11, r9)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r15 = r11.intValue()
            r11 = 4
            java.lang.Object r12 = r2.get(r11)
            r13 = 5
            java.lang.Object r14 = r2.get(r13)
            r13 = 6
            java.lang.Object r11 = r2.get(r13)
            gy3.C87412m.m108592e(r11, r9)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r18 = r11.intValue()
            r11 = 7
            java.lang.Object r13 = r2.get(r11)
            gy3.C87412m.m108592e(r13, r9)
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r20 = r13.intValue()
            r13 = 8
            java.lang.Object r11 = r2.get(r13)
            java.lang.String r13 = "null cannot be cast to non-null type kotlin.Double"
            gy3.C87412m.m108592e(r11, r13)
            java.lang.Double r11 = (java.lang.Double) r11
            double r10 = r11.doubleValue()
            float r10 = (float) r10
            r11 = 9
            java.lang.Object r11 = r2.get(r11)
            gy3.C87412m.m108592e(r11, r13)
            java.lang.Double r11 = (java.lang.Double) r11
            double r5 = r11.doubleValue()
            float r5 = (float) r5
            r6 = 10
            java.lang.Object r6 = r2.get(r6)
            gy3.C87412m.m108592e(r6, r9)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r11 = 11
            java.lang.Object r11 = r2.get(r11)
            gy3.C87412m.m108592e(r11, r9)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r25 = r11.intValue()
            r11 = 12
            java.lang.Object r11 = r2.get(r11)
            gy3.C87412m.m108592e(r11, r9)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r26 = r11.intValue()
            r11 = 13
            java.lang.Object r2 = r2.get(r11)
            gy3.C87412m.m108592e(r2, r9)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.String r11 = "null cannot be cast to non-null type kotlin.collections.List<*>"
            gy3.C87412m.m108592e(r12, r11)
            java.util.List r12 = (java.util.List) r12
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r12 = r12.iterator()
        L_0x00d9:
            boolean r27 = r12.hasNext()
            if (r27 == 0) goto L_0x0121
            java.lang.Object r27 = r12.next()
            gy3.C87412m.m108591d(r27)
            r28 = r10
            r10 = r27
            java.util.List r10 = (java.util.List) r10
            r46 = r12
            android.view.MotionEvent$PointerProperties r12 = new android.view.MotionEvent$PointerProperties
            r12.<init>()
            r27 = r2
            r1 = 0
            java.lang.Object r2 = r10.get(r1)
            gy3.C87412m.m108592e(r2, r9)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r1 = r2.intValue()
            r12.id = r1
            r1 = 1
            java.lang.Object r2 = r10.get(r1)
            gy3.C87412m.m108592e(r2, r9)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r1 = r2.intValue()
            r12.toolType = r1
            r3.add(r12)
            r1 = r45
            r12 = r46
            r2 = r27
            r10 = r28
            goto L_0x00d9
        L_0x0121:
            r27 = r2
            r28 = r10
            r1 = 0
            android.view.MotionEvent$PointerProperties[] r2 = new android.view.MotionEvent.PointerProperties[r1]
            java.lang.Object[] r2 = r3.toArray(r2)
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            gy3.C87412m.m108592e(r2, r3)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r15)
            android.view.MotionEvent$PointerProperties[] r10 = new android.view.MotionEvent.PointerProperties[r1]
            java.lang.Object[] r1 = r9.toArray(r10)
            gy3.C87412m.m108592e(r1, r3)
            int r9 = r2.length
            int r10 = r1.length
            r36 = 0
            if (r9 <= r10) goto L_0x0146
            goto L_0x015f
        L_0x0146:
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 14
            r35 = 0
            r29 = r2
            r30 = r1
            sx3.C110821n.m150966m(r29, r30, r31, r32, r33, r34, r35)
            int r9 = r1.length
            int r10 = r2.length
            if (r9 <= r10) goto L_0x015e
            int r2 = r2.length
            r1[r2] = r36
        L_0x015e:
            r2 = r1
        L_0x015f:
            r1 = r2
            android.view.MotionEvent$PointerProperties[] r1 = (android.view.MotionEvent.PointerProperties[]) r1
            float r2 = r0.f251859f
            gy3.C87412m.m108592e(r14, r11)
            java.util.List r14 = (java.util.List) r14
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r10 = r14.iterator()
        L_0x0172:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x023d
            java.lang.Object r11 = r10.next()
            gy3.C87412m.m108591d(r11)
            java.util.List r11 = (java.util.List) r11
            android.view.MotionEvent$PointerCoords r12 = new android.view.MotionEvent$PointerCoords
            r12.<init>()
            r46 = r10
            r14 = 0
            java.lang.Object r10 = r11.get(r14)
            gy3.C87412m.m108592e(r10, r13)
            java.lang.Double r10 = (java.lang.Double) r10
            r29 = r5
            r30 = r6
            double r5 = r10.doubleValue()
            float r5 = (float) r5
            r12.orientation = r5
            r5 = 1
            java.lang.Object r6 = r11.get(r5)
            gy3.C87412m.m108592e(r6, r13)
            java.lang.Double r6 = (java.lang.Double) r6
            double r5 = r6.doubleValue()
            float r5 = (float) r5
            r12.pressure = r5
            r5 = 2
            java.lang.Object r6 = r11.get(r5)
            gy3.C87412m.m108592e(r6, r13)
            java.lang.Double r6 = (java.lang.Double) r6
            double r5 = r6.doubleValue()
            float r5 = (float) r5
            r12.size = r5
            r5 = 3
            java.lang.Object r6 = r11.get(r5)
            gy3.C87412m.m108592e(r6, r13)
            java.lang.Double r6 = (java.lang.Double) r6
            double r5 = r6.doubleValue()
            float r5 = (float) r5
            float r5 = r5 * r2
            r12.toolMajor = r5
            r5 = 4
            java.lang.Object r6 = r11.get(r5)
            gy3.C87412m.m108592e(r6, r13)
            java.lang.Double r6 = (java.lang.Double) r6
            double r5 = r6.doubleValue()
            float r5 = (float) r5
            float r5 = r5 * r2
            r12.toolMinor = r5
            r5 = 5
            java.lang.Object r6 = r11.get(r5)
            gy3.C87412m.m108592e(r6, r13)
            java.lang.Double r6 = (java.lang.Double) r6
            double r5 = r6.doubleValue()
            float r5 = (float) r5
            float r5 = r5 * r2
            r12.touchMajor = r5
            r5 = 6
            java.lang.Object r6 = r11.get(r5)
            gy3.C87412m.m108592e(r6, r13)
            java.lang.Double r6 = (java.lang.Double) r6
            double r5 = r6.doubleValue()
            float r5 = (float) r5
            float r5 = r5 * r2
            r12.touchMinor = r5
            r5 = 7
            java.lang.Object r6 = r11.get(r5)
            gy3.C87412m.m108592e(r6, r13)
            java.lang.Double r6 = (java.lang.Double) r6
            double r5 = r6.doubleValue()
            float r5 = (float) r5
            float r5 = r5 * r2
            r12.x = r5
            r5 = 8
            java.lang.Object r6 = r11.get(r5)
            gy3.C87412m.m108592e(r6, r13)
            java.lang.Double r6 = (java.lang.Double) r6
            double r10 = r6.doubleValue()
            float r6 = (float) r10
            float r6 = r6 * r2
            r12.y = r6
            r9.add(r12)
            r10 = r46
            r5 = r29
            r6 = r30
            goto L_0x0172
        L_0x023d:
            r29 = r5
            r30 = r6
            r6 = 0
            android.view.MotionEvent$PointerCoords[] r2 = new android.view.MotionEvent.PointerCoords[r6]
            java.lang.Object[] r2 = r9.toArray(r2)
            gy3.C87412m.m108592e(r2, r3)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r15)
            android.view.MotionEvent$PointerCoords[] r9 = new android.view.MotionEvent.PointerCoords[r6]
            java.lang.Object[] r5 = r5.toArray(r9)
            gy3.C87412m.m108592e(r5, r3)
            int r3 = r2.length
            int r6 = r5.length
            if (r3 <= r6) goto L_0x025e
            goto L_0x0277
        L_0x025e:
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 14
            r43 = 0
            r37 = r2
            r38 = r5
            sx3.C110821n.m150966m(r37, r38, r39, r40, r41, r42, r43)
            int r3 = r5.length
            int r6 = r2.length
            if (r3 <= r6) goto L_0x0276
            int r2 = r2.length
            r5[r2] = r36
        L_0x0276:
            r2 = r5
        L_0x0277:
            r17 = r2
            android.view.MotionEvent$PointerCoords[] r17 = (android.view.MotionEvent.PointerCoords[]) r17
            long r10 = r4.longValue()
            long r12 = r7.longValue()
            r2 = r28
            r14 = r8
            r16 = r1
            r19 = r20
            r20 = r2
            r21 = r29
            r22 = r30
            r23 = r25
            r24 = r26
            r25 = r27
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r10, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            int r2 = r1.getPointerCount()
            int[] r15 = new int[r2]
            int r2 = r1.getPointerCount()
            float[] r2 = new float[r2]
            int r3 = r1.getPointerCount()
            float[] r3 = new float[r3]
            int r4 = r1.getPointerCount()
            r5 = 0
        L_0x02b1:
            if (r5 >= r4) goto L_0x02c8
            int r6 = r1.getPointerId(r5)
            r15[r5] = r6
            float r6 = r1.getX(r5)
            r2[r5] = r6
            float r6 = r1.getY(r5)
            r3[r5] = r6
            int r5 = r5 + 1
            goto L_0x02b1
        L_0x02c8:
            long r13 = r7.longValue()
            int r12 = r1.getActionIndex()
            int r11 = r1.getActionMasked()
            java.util.HashMap<java.lang.String, f70.b$a> r4 = r0.f251860g
            r5 = r45
            java.lang.Object r4 = r4.get(r5)
            f70.b$a r4 = (f70.C86764b.C86765a) r4
            if (r4 == 0) goto L_0x032a
            r52.c r4 = r4.f251862b
            if (r4 == 0) goto L_0x032a
            if (r8 != 0) goto L_0x0315
            java.util.List<? extends android.graphics.RectF> r5 = r4.f258316n
            if (r5 == 0) goto L_0x0310
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L_0x02f2
        L_0x02f0:
            r7 = 0
            goto L_0x030e
        L_0x02f2:
            java.util.Iterator r5 = r5.iterator()
        L_0x02f6:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x02f0
            java.lang.Object r6 = r5.next()
            android.graphics.RectF r6 = (android.graphics.RectF) r6
            r7 = 0
            r8 = r2[r7]
            r9 = r3[r7]
            boolean r6 = r6.contains(r8, r9)
            if (r6 == 0) goto L_0x02f6
            goto L_0x0311
        L_0x030e:
            r5 = 0
            goto L_0x0312
        L_0x0310:
            r7 = 0
        L_0x0311:
            r5 = 1
        L_0x0312:
            if (r5 != 0) goto L_0x0315
            goto L_0x032b
        L_0x0315:
            d42.g r9 = r4.f258318p
            if (r9 == 0) goto L_0x0324
            int r10 = r4.f258317o
            r16 = r2
            r17 = r3
            r9.mo120583l(r10, r11, r12, r13, r15, r16, r17)
            r3 = 1
            goto L_0x032c
        L_0x0324:
            java.lang.String r1 = "canvasEventConsumer"
            gy3.C87412m.m108603p(r1)
            throw r36
        L_0x032a:
            r7 = 0
        L_0x032b:
            r3 = 0
        L_0x032c:
            r1.recycle()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f70.C86764b.mo121184a(java.lang.String, java.util.List):java.lang.Boolean");
    }

    /* renamed from: b */
    public final void mo121185b(String str) {
        TextureRegistry.SurfaceTextureEntry surfaceTextureEntry;
        C87412m.m108594g(str, "viewId");
        C86765a aVar = this.f251860g.get(str);
        if (!(aVar == null || (surfaceTextureEntry = aVar.f251863c) == null)) {
            long id = surfaceTextureEntry.mo159349id();
            C88051c cVar = this.f251858e;
            if (cVar != null) {
                Long valueOf = Long.valueOf(id);
                C86766b<T> bVar = C86766b.f251868a;
                new BasicMessageChannel(cVar.f254687a, "dev.flutter.pigeon.MagicBrushResponse.onViewTextureReady", C88052d.f254691a).send(new ArrayList(Arrays.asList(new Serializable[]{str, valueOf})), new c$$c(bVar));
            }
        }
        Log.m105924i("MagicBrushFlutterPlugin", "frameFrameRendered for viewId: " + str);
    }

    /* renamed from: c */
    public final void mo121186c(String str, String str2, C89872c cVar) {
        String str3 = str2;
        C89872c cVar2 = cVar;
        C87412m.m108594g(str, "viewGroupId");
        C87412m.m108594g(str3, "viewId");
        C87412m.m108594g(cVar2, "view");
        this.f251860g.containsKey(str3);
        TextureRegistry textureRegistry = this.f251857d;
        TextureRegistry.SurfaceTextureEntry registerSurfaceTexture = textureRegistry != null ? textureRegistry.registerSurfaceTexture(cVar2.f258310e) : null;
        Log.m105924i("MBExternalViewStub", "currentSize=(" + cVar2.f258314i + ',' + cVar2.f258315j + ", targetSize=(" + 100 + ", " + 100 + ')');
        if (!(100 == cVar2.f258314i && 100 == cVar2.f258315j)) {
            cVar2.f258314i = 100;
            cVar2.f258315j = 100;
            if (!cVar2.f258312g) {
                C86180g gVar = cVar2.f258318p;
                if (gVar != null) {
                    gVar.mo120582j(cVar2.f258317o, (Surface) ((C36570n) cVar2.f258311f).getValue(), 100, 100);
                    cVar2.f258312g = true;
                } else {
                    C87412m.m108603p("canvasEventConsumer");
                    throw null;
                }
            } else {
                C86180g gVar2 = cVar2.f258318p;
                if (gVar2 != null) {
                    gVar2.mo120581g(cVar2.f258317o, 100, 100);
                } else {
                    C87412m.m108603p("canvasEventConsumer");
                    throw null;
                }
            }
        }
        if (registerSurfaceTexture != null) {
            C86765a aVar = r2;
            C86765a aVar2 = new C86765a(str2, cVar, registerSurfaceTexture, 0, 0, 0, 0);
            this.f251860g.put(str3, aVar);
        }
        C88051c cVar3 = this.f251858e;
        if (cVar3 != null) {
            new BasicMessageChannel(cVar3.f254687a, "dev.flutter.pigeon.MagicBrushResponse.onSubViewCreated", C88052d.f254691a).send(new ArrayList(Arrays.asList(new String[]{str, str3})), new c$$b(C86767c.f251869a));
        }
        Log.m105924i("MagicBrushFlutterPlugin", "insert viewId: " + str3 + ' ' + this.f251857d);
    }

    /* renamed from: d */
    public final void mo121187d(String str) {
        TextureRegistry.SurfaceTextureEntry surfaceTextureEntry;
        C87412m.m108594g(str, "viewId");
        C86765a remove = this.f251860g.remove(str);
        if (!(remove == null || (surfaceTextureEntry = remove.f251863c) == null)) {
            surfaceTextureEntry.release();
        }
        Log.m105924i("MagicBrushFlutterPlugin", "remove viewId: " + str);
    }

    /* renamed from: e */
    public final void mo121188e(String str, long j, long j2, long j3, long j4) {
        String str2 = str;
        long j5 = j;
        long j6 = j2;
        long j7 = j3;
        long j8 = j4;
        C87412m.m108594g(str2, "viewId");
        C86765a aVar = this.f251860g.get(str2);
        if (aVar != null) {
            aVar.f251864d = j5;
            aVar.f251865e = j6;
            aVar.f251866f = j7;
            aVar.f251867g = j8;
        }
        C88051c cVar = this.f251858e;
        if (cVar != null) {
            cVar.mo122497a(str, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), C86768d.f251870a);
        }
        Log.m105924i("MagicBrushFlutterPlugin", "layout viewId: " + str2 + ", offset = (" + j5 + ", " + j6 + "), size = (" + j7 + ", " + j4 + ')');
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
        this.f251857d = flutterPluginBinding.getTextureRegistry();
        this.f251858e = new C88051c(flutterPluginBinding.getBinaryMessenger());
        new BasicMessageChannel(flutterPluginBinding.getBinaryMessenger(), "dev.flutter.pigeon.MagicBrushRequest.dispatchTouchEvent", C88050b.f254686a).setMessageHandler(new a$$a(this));
        Log.m105924i("MagicBrushFlutterPlugin", "attachToEngine");
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
        new BasicMessageChannel(flutterPluginBinding.getBinaryMessenger(), "dev.flutter.pigeon.MagicBrushRequest.dispatchTouchEvent", C88050b.f254686a).setMessageHandler((BasicMessageChannel.MessageHandler) null);
        this.f251857d = null;
        this.f251858e = null;
        Log.m105924i("MagicBrushFlutterPlugin", "detachFromEngine");
    }
}
