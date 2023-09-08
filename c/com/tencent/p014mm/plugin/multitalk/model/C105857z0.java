package com.tencent.p014mm.plugin.multitalk.model;

import android.graphics.Bitmap;
import android.os.HandlerThread;
import c92.C104329g;
import com.tencent.p014mm.sdk.p134kt.CommonKt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import fy3.C32228q;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.multitalk.model.z0 */
public final class C105857z0 implements C105855y0 {

    /* renamed from: a */
    public ArrayList<C105810k> f314837a;

    /* renamed from: b */
    public volatile int f314838b;

    /* renamed from: c */
    public String f314839c = "";

    /* renamed from: d */
    public final C105858a f314840d = new C105858a("", 0, 0, (Bitmap) null, 14, (C8480h) null);

    /* renamed from: e */
    public final ConcurrentHashMap<String, C105858a> f314841e = new ConcurrentHashMap<>();

    /* renamed from: f */
    public C105834r0 f314842f;

    /* renamed from: g */
    public C105815m f314843g;

    /* renamed from: h */
    public boolean f314844h = true;

    /* renamed from: i */
    public int f314845i;

    /* renamed from: j */
    public String f314846j = "";

    /* renamed from: com.tencent.mm.plugin.multitalk.model.z0$a */
    public static final class C105858a {

        /* renamed from: a */
        public String f314847a;

        /* renamed from: b */
        public int f314848b;

        /* renamed from: c */
        public int f314849c;

        /* renamed from: d */
        public Bitmap f314850d;

        public C105858a(String str, int i, int i2, Bitmap bitmap, int i3, C8480h hVar) {
            i = (i3 & 2) != 0 ? 0 : i;
            i2 = (i3 & 4) != 0 ? 0 : i2;
            bitmap = (i3 & 8) != 0 ? null : bitmap;
            C87412m.m108594g(str, "userName");
            this.f314847a = str;
            this.f314848b = i;
            this.f314849c = i2;
            this.f314850d = bitmap;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C105858a)) {
                return false;
            }
            C105858a aVar = (C105858a) obj;
            return C87412m.m108589b(this.f314847a, aVar.f314847a) && this.f314848b == aVar.f314848b && this.f314849c == aVar.f314849c && C87412m.m108589b(this.f314850d, aVar.f314850d);
        }

        public int hashCode() {
            int hashCode = ((((this.f314847a.hashCode() * 31) + this.f314848b) * 31) + this.f314849c) * 31;
            Bitmap bitmap = this.f314850d;
            return hashCode + (bitmap == null ? 0 : bitmap.hashCode());
        }

        public String toString() {
            return "BitmapHolder(userName=" + this.f314847a + ", angle=" + this.f314848b + ", mirror=" + this.f314849c + ", dataBitmap=" + this.f314850d + ')';
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.model.z0$b */
    public static final class C105859b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C105810k f314851d;

        /* renamed from: e */
        public final /* synthetic */ C105808j f314852e;

        /* renamed from: f */
        public final /* synthetic */ String f314853f;

        /* renamed from: g */
        public final /* synthetic */ Bitmap f314854g;

        /* renamed from: h */
        public final /* synthetic */ int f314855h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105859b(C105810k kVar, C105808j jVar, String str, Bitmap bitmap, int i) {
            super(0);
            this.f314851d = kVar;
            this.f314852e = jVar;
            this.f314853f = str;
            this.f314854g = bitmap;
            this.f314855h = i;
        }

        public Object invoke() {
            this.f314851d.mo150702c();
            long currentTicks = Util.currentTicks();
            this.f314852e.mo150771a(this.f314853f, this.f314854g, 90, this.f314855h);
            C104329g.f308829a.mo146027a(4, Util.ticksToNow(currentTicks));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.model.z0$c */
    public static final class C105860c extends C87413o implements C32228q<ByteBuffer, Integer, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C105857z0 f314856d;

        /* renamed from: e */
        public final /* synthetic */ C105810k f314857e;

        /* renamed from: f */
        public final /* synthetic */ int f314858f;

        /* renamed from: g */
        public final /* synthetic */ String f314859g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105860c(C105857z0 z0Var, C105810k kVar, int i, String str) {
            super(3);
            this.f314856d = z0Var;
            this.f314857e = kVar;
            this.f314858f = i;
            this.f314859g = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0054, code lost:
            if (r5.getHeight() != r10) goto L_0x0056;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r8, java.lang.Object r9, java.lang.Object r10) {
            /*
                r7 = this;
                java.nio.ByteBuffer r8 = (java.nio.ByteBuffer) r8
                java.lang.Number r9 = (java.lang.Number) r9
                int r9 = r9.intValue()
                java.lang.Number r10 = (java.lang.Number) r10
                int r10 = r10.intValue()
                java.lang.String r0 = "byteBuffer"
                gy3.C87412m.m108594g(r8, r0)
                com.tencent.mm.plugin.multitalk.model.z0 r0 = r7.f314856d
                java.lang.String r1 = r0.f314846j
                boolean r0 = r0.mo150843g(r1)
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                boolean r1 = r0.booleanValue()
                if (r1 == 0) goto L_0x0026
                goto L_0x0027
            L_0x0026:
                r0 = 0
            L_0x0027:
                if (r0 == 0) goto L_0x007b
                com.tencent.mm.plugin.multitalk.model.k r2 = r7.f314857e
                com.tencent.mm.plugin.multitalk.model.z0 r1 = r7.f314856d
                int r6 = r7.f314858f
                java.lang.String r4 = r7.f314859g
                r0.booleanValue()
                int r0 = r1.f314845i
                com.tencent.mm.plugin.multitalk.model.j r3 = r2.mo150700a(r0)
                if (r3 == 0) goto L_0x007b
                com.tencent.mm.plugin.multitalk.model.z0$a r0 = r1.f314840d
                java.lang.System.currentTimeMillis()
                android.graphics.Bitmap r5 = r0.f314850d
                if (r5 == 0) goto L_0x0056
                int r5 = r5.getWidth()
                if (r5 != r9) goto L_0x0056
                android.graphics.Bitmap r5 = r0.f314850d
                gy3.C87412m.m108591d(r5)
                int r5 = r5.getHeight()
                if (r5 == r10) goto L_0x005e
            L_0x0056:
                android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
                android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r9, r10, r5)
                r0.f314850d = r9
            L_0x005e:
                android.graphics.Bitmap r9 = r0.f314850d
                if (r9 == 0) goto L_0x0065
                r9.copyPixelsFromBuffer(r8)
            L_0x0065:
                java.lang.System.currentTimeMillis()
                r0.f314849c = r6
                int r8 = r1.f314845i
                r0.f314848b = r8
                android.graphics.Bitmap r5 = r0.f314850d
                if (r5 == 0) goto L_0x007b
                com.tencent.mm.plugin.multitalk.model.b1 r8 = new com.tencent.mm.plugin.multitalk.model.b1
                r1 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                com.tencent.p014mm.sdk.p134kt.CommonKt.uiThread(r8)
            L_0x007b:
                rx3.b0 r8 = rx3.C13598b0.f38549a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.multitalk.model.C105857z0.C105860c.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.model.z0$d */
    public static final class C105861d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C105857z0 f314860d;

        /* renamed from: e */
        public final /* synthetic */ C105834r0 f314861e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105861d(C105857z0 z0Var, C105834r0 r0Var) {
            super(0);
            this.f314860d = z0Var;
            this.f314861e = r0Var;
        }

        public Object invoke() {
            int i;
            C105857z0 z0Var = this.f314860d;
            C105815m mVar = new C105815m(this.f314861e.f314772c);
            C105791c1 c1Var = new C105791c1(this.f314861e);
            mVar.f314674w = c1Var;
            int i2 = mVar.f314672u;
            if (!(i2 == 0 || (i = mVar.f314673v) == 0)) {
                c1Var.mo150732b(i2, i);
            }
            z0Var.f314843g = mVar;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.model.z0$e */
    public static final class C105862e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ ArrayList<C105808j> f314862d;

        /* renamed from: e */
        public final /* synthetic */ String f314863e;

        /* renamed from: f */
        public final /* synthetic */ Bitmap f314864f;

        /* renamed from: g */
        public final /* synthetic */ int f314865g;

        /* renamed from: h */
        public final /* synthetic */ int f314866h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105862e(ArrayList<C105808j> arrayList, String str, Bitmap bitmap, int i, int i2) {
            super(0);
            this.f314862d = arrayList;
            this.f314863e = str;
            this.f314864f = bitmap;
            this.f314865g = i;
            this.f314866h = i2;
        }

        public Object invoke() {
            ArrayList<C105808j> arrayList = this.f314862d;
            String str = this.f314863e;
            Bitmap bitmap = this.f314864f;
            int i = this.f314865g;
            int i2 = this.f314866h;
            for (C105808j a : arrayList) {
                long currentTicks = Util.currentTicks();
                a.mo150771a(str, bitmap, i, i2);
                C104329g.f308829a.mo146027a(3, Util.ticksToNow(currentTicks));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public void mo150837a() {
        C105815m mVar = this.f314843g;
        if (mVar != null) {
            mVar.f314663i = false;
            mVar.f314664j = false;
            mVar.f314666o = 0;
            Log.m105918d("MeidaCodec[HWDec]", "steve: Stop Decode Thread!");
            C105834r0 r0Var = this.f314842f;
            if (r0Var != null) {
                r0Var.mo150816a(new C105830p0(r0Var));
                HandlerThread handlerThread = r0Var.f314773d;
                if (handlerThread != null) {
                    handlerThread.quitSafely();
                }
            }
            this.f314842f = null;
        }
        this.f314843g = null;
    }

    /* renamed from: b */
    public void mo150838b(String str, int[] iArr, int i, int i2, int i3, int i4) {
        C87412m.m108594g(str, "userName");
        C87412m.m108594g(iArr, "pBuffer");
        boolean z = true;
        this.f314844h = true;
        Boolean valueOf = Boolean.valueOf(mo150843g(str));
        if (!valueOf.booleanValue() || i <= 0 || i2 <= 0) {
            z = false;
        }
        if (!z) {
            valueOf = null;
        }
        if (valueOf != null) {
            valueOf.booleanValue();
            ArrayList<C105810k> arrayList = this.f314837a;
            if (arrayList != null) {
                for (C105810k kVar : arrayList) {
                    C105808j a = kVar.mo150700a(i4);
                    if (a != null) {
                        this.f314845i = i4;
                        C105858a aVar = this.f314840d;
                        mo150841e(aVar, iArr, i, i2);
                        aVar.f314849c = i3;
                        aVar.f314848b = i4;
                        Bitmap bitmap = aVar.f314850d;
                        if (bitmap != null) {
                            CommonKt.uiThread(new C105859b(kVar, a, str, bitmap, i3));
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:116:0x03dc  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x03e6  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x02e8 A[SYNTHETIC, Splitter:B:75:0x02e8] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo150839c(java.lang.String r25, byte[] r26, int r27, int r28, int r29, int r30) {
        /*
            r24 = this;
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r28
            java.lang.String r0 = "userName"
            gy3.C87412m.m108594g(r2, r0)
            java.lang.String r0 = "pBuffer"
            gy3.C87412m.m108594g(r3, r0)
            boolean r0 = r24.mo150843g(r25)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r5 = r0.booleanValue()
            if (r5 == 0) goto L_0x0021
            goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            if (r0 == 0) goto L_0x0501
            r0.booleanValue()
            java.util.ArrayList<com.tencent.mm.plugin.multitalk.model.k> r0 = r1.f314837a
            if (r0 == 0) goto L_0x0501
            java.util.Iterator r5 = r0.iterator()
        L_0x002f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0501
            java.lang.Object r0 = r5.next()
            com.tencent.mm.plugin.multitalk.model.k r0 = (com.tencent.p014mm.plugin.multitalk.model.C105810k) r0
            r7 = 0
            com.tencent.mm.plugin.multitalk.model.j r8 = r0.mo150700a(r7)
            if (r8 == 0) goto L_0x04f4
            r8 = r30
            r1.f314845i = r8
            r1.f314846j = r2
            com.tencent.mm.plugin.multitalk.model.m r9 = r1.f314843g
            r10 = 1
            if (r9 == 0) goto L_0x0055
            com.tencent.mm.plugin.multitalk.model.r0 r9 = r1.f314842f
            if (r9 != 0) goto L_0x0052
            goto L_0x0055
        L_0x0052:
            r12 = r29
            goto L_0x009b
        L_0x0055:
            com.tencent.mm.plugin.multitalk.model.r0 r9 = new com.tencent.mm.plugin.multitalk.model.r0
            r9.<init>()
            android.os.HandlerThread r11 = r9.f314773d
            if (r11 == 0) goto L_0x005f
            goto L_0x0080
        L_0x005f:
            r11 = -4
            int r12 = eu3.C58834h.f168432b
            java.lang.String r12 = "multatalk_HW_render_thread"
            android.os.HandlerThread r11 = eu3.C97749e.m126093a(r12, r11)
            r11.start()
            android.os.Handler r12 = new android.os.Handler
            android.os.Looper r13 = r11.getLooper()
            r12.<init>(r13)
            r9.f314775f = r12
            r9.f314773d = r11
            com.tencent.mm.plugin.multitalk.model.o0 r11 = new com.tencent.mm.plugin.multitalk.model.o0
            r11.<init>(r9, r10, r10)
            r9.mo150816a(r11)
        L_0x0080:
            com.tencent.mm.plugin.multitalk.model.z0$c r11 = new com.tencent.mm.plugin.multitalk.model.z0$c
            r12 = r29
            r11.<init>(r1, r0, r12, r2)
            com.tencent.mm.plugin.multitalk.model.t0 r0 = new com.tencent.mm.plugin.multitalk.model.t0
            r0.<init>(r9, r11)
            r9.mo150816a(r0)
            com.tencent.mm.plugin.multitalk.model.z0$d r0 = new com.tencent.mm.plugin.multitalk.model.z0$d
            r0.<init>(r1, r9)
            r9.mo150816a(r0)
            r1.f314842f = r9
            r1.f314844h = r7
        L_0x009b:
            long r13 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            com.tencent.mm.plugin.multitalk.model.m r9 = r1.f314843g
            r11 = 2
            if (r9 == 0) goto L_0x04e5
            boolean r0 = r1.f314844h
            boolean r15 = r9.f314663i
            if (r15 != 0) goto L_0x00b3
            java.lang.String r0 = "TAG"
            java.lang.String r7 = "DECODER_THREAD:: HWDec NOT supported!"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r7)
            goto L_0x04e5
        L_0x00b3:
            if (r0 == 0) goto L_0x00bb
            com.tencent.mm.compatible.deviceinfo.a r0 = r9.f314658d
            if (r0 == 0) goto L_0x00bb
            r9.f314662h = r7
        L_0x00bb:
            java.lang.System.currentTimeMillis()
            java.lang.String r15 = "MeidaCodec[HWDec]"
            if (r4 != r11) goto L_0x0221
            te3.af2 r0 = new te3.af2     // Catch:{ Exception -> 0x0202 }
            r0.<init>()     // Catch:{ Exception -> 0x0202 }
            pe3.a r0 = r0.parseFrom(r3)     // Catch:{ Exception -> 0x0202 }
            te3.af2 r0 = (te3.C110955af2) r0     // Catch:{ Exception -> 0x0202 }
            pe3.b r11 = r0.f331877g     // Catch:{ Exception -> 0x0202 }
            if (r11 != 0) goto L_0x00d3
            r11 = 0
            goto L_0x00d6
        L_0x00d3:
            byte[] r11 = r11.f257327a     // Catch:{ Exception -> 0x0202 }
            int r11 = r11.length     // Catch:{ Exception -> 0x0202 }
        L_0x00d6:
            pe3.b r6 = r0.f331875e     // Catch:{ Exception -> 0x0202 }
            byte[] r6 = r6.f257327a     // Catch:{ Exception -> 0x0202 }
            int r6 = r6.length     // Catch:{ Exception -> 0x0202 }
            pe3.b r10 = r0.f331876f     // Catch:{ Exception -> 0x0202 }
            byte[] r10 = r10.f257327a     // Catch:{ Exception -> 0x0202 }
            int r10 = r10.length     // Catch:{ Exception -> 0x0202 }
            if (r11 == 0) goto L_0x0157
            boolean r7 = r9.f314661g     // Catch:{ Exception -> 0x0202 }
            if (r7 != 0) goto L_0x00e9
            r7 = 0
            r9.f314662h = r7     // Catch:{ Exception -> 0x0202 }
        L_0x00e9:
            r7 = 1
            r9.f314661g = r7     // Catch:{ Exception -> 0x0202 }
            int r11 = r11 + 4
            byte[] r7 = new byte[r11]     // Catch:{ Exception -> 0x0202 }
            com.tencent.p014mm.plugin.multitalk.model.C105815m.f314656y = r7     // Catch:{ Exception -> 0x0202 }
            int r11 = r6 + 4
            byte[] r11 = new byte[r11]     // Catch:{ Exception -> 0x0202 }
            com.tencent.p014mm.plugin.multitalk.model.C105815m.f314657z = r11     // Catch:{ Exception -> 0x0202 }
            int r10 = r10 + 4
            byte[] r10 = new byte[r10]     // Catch:{ Exception -> 0x0202 }
            com.tencent.p014mm.plugin.multitalk.model.C105815m.f314653A = r10     // Catch:{ Exception -> 0x0202 }
            byte[] r10 = r9.f314667p     // Catch:{ Exception -> 0x0202 }
            r1 = 0
            r11 = 4
            java.lang.System.arraycopy(r10, r1, r7, r1, r11)     // Catch:{ Exception -> 0x0202 }
            byte[] r7 = r9.f314667p     // Catch:{ Exception -> 0x0202 }
            byte[] r10 = com.tencent.p014mm.plugin.multitalk.model.C105815m.f314657z     // Catch:{ Exception -> 0x0202 }
            java.lang.System.arraycopy(r7, r1, r10, r1, r11)     // Catch:{ Exception -> 0x0202 }
            byte[] r7 = r9.f314667p     // Catch:{ Exception -> 0x0202 }
            byte[] r10 = com.tencent.p014mm.plugin.multitalk.model.C105815m.f314653A     // Catch:{ Exception -> 0x0202 }
            java.lang.System.arraycopy(r7, r1, r10, r1, r11)     // Catch:{ Exception -> 0x0202 }
            pe3.b r1 = r0.f331877g     // Catch:{ Exception -> 0x0202 }
            byte[] r7 = com.tencent.p014mm.plugin.multitalk.model.C105815m.f314656y     // Catch:{ Exception -> 0x0202 }
            r1.mo123700c(r7, r11)     // Catch:{ Exception -> 0x0202 }
            pe3.b r1 = r0.f331875e     // Catch:{ Exception -> 0x0202 }
            byte[] r7 = com.tencent.p014mm.plugin.multitalk.model.C105815m.f314657z     // Catch:{ Exception -> 0x0202 }
            r1.mo123700c(r7, r11)     // Catch:{ Exception -> 0x0202 }
            pe3.b r0 = r0.f331876f     // Catch:{ Exception -> 0x0202 }
            byte[] r1 = com.tencent.p014mm.plugin.multitalk.model.C105815m.f314653A     // Catch:{ Exception -> 0x0202 }
            r0.mo123700c(r1, r11)     // Catch:{ Exception -> 0x0202 }
            byte[] r0 = com.tencent.p014mm.plugin.multitalk.model.C105815m.f314656y     // Catch:{ Exception -> 0x0202 }
            int r1 = r0.length     // Catch:{ Exception -> 0x0202 }
            byte[] r7 = com.tencent.p014mm.plugin.multitalk.model.C105815m.f314657z     // Catch:{ Exception -> 0x0202 }
            int r7 = r7.length     // Catch:{ Exception -> 0x0202 }
            int r1 = r1 + r7
            byte[] r7 = com.tencent.p014mm.plugin.multitalk.model.C105815m.f314653A     // Catch:{ Exception -> 0x0202 }
            int r7 = r7.length     // Catch:{ Exception -> 0x0202 }
            int r1 = r1 + r7
            byte[] r1 = new byte[r1]     // Catch:{ Exception -> 0x0202 }
            r9.f314660f = r1     // Catch:{ Exception -> 0x0202 }
            int r7 = r0.length     // Catch:{ Exception -> 0x0202 }
            r10 = 0
            java.lang.System.arraycopy(r0, r10, r1, r10, r7)     // Catch:{ Exception -> 0x0202 }
            byte[] r0 = com.tencent.p014mm.plugin.multitalk.model.C105815m.f314656y     // Catch:{ Exception -> 0x0202 }
            int r0 = r0.length     // Catch:{ Exception -> 0x0202 }
            int r0 = r0 + r10
            byte[] r1 = com.tencent.p014mm.plugin.multitalk.model.C105815m.f314657z     // Catch:{ Exception -> 0x0202 }
            byte[] r7 = r9.f314660f     // Catch:{ Exception -> 0x0202 }
            int r11 = r1.length     // Catch:{ Exception -> 0x0202 }
            java.lang.System.arraycopy(r1, r10, r7, r0, r11)     // Catch:{ Exception -> 0x0202 }
            byte[] r1 = com.tencent.p014mm.plugin.multitalk.model.C105815m.f314657z     // Catch:{ Exception -> 0x0202 }
            int r1 = r1.length     // Catch:{ Exception -> 0x0202 }
            int r0 = r0 + r1
            byte[] r1 = com.tencent.p014mm.plugin.multitalk.model.C105815m.f314653A     // Catch:{ Exception -> 0x0202 }
            byte[] r7 = r9.f314660f     // Catch:{ Exception -> 0x0202 }
            int r10 = r1.length     // Catch:{ Exception -> 0x0202 }
            r11 = 0
            java.lang.System.arraycopy(r1, r11, r7, r0, r10)     // Catch:{ Exception -> 0x0202 }
            goto L_0x01ee
        L_0x0157:
            boolean r1 = r9.f314661g     // Catch:{ Exception -> 0x0202 }
            if (r1 == 0) goto L_0x015f
            r1 = 0
            r9.f314662h = r1     // Catch:{ Exception -> 0x0202 }
            goto L_0x0160
        L_0x015f:
            r1 = 0
        L_0x0160:
            r9.f314661g = r1     // Catch:{ Exception -> 0x0202 }
            int r7 = r6 + 4
            byte[] r7 = new byte[r7]     // Catch:{ Exception -> 0x0202 }
            byte[] r11 = r9.f314667p     // Catch:{ Exception -> 0x0202 }
            r2 = 4
            java.lang.System.arraycopy(r11, r1, r7, r1, r2)     // Catch:{ Exception -> 0x0202 }
            pe3.b r1 = r0.f331875e     // Catch:{ Exception -> 0x0202 }
            r1.mo123700c(r7, r2)     // Catch:{ Exception -> 0x0202 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0202 }
            r1.<init>()     // Catch:{ Exception -> 0x0202 }
            java.lang.String r2 = " old sps: "
            r1.append(r2)     // Catch:{ Exception -> 0x0202 }
            r1.append(r7)     // Catch:{ Exception -> 0x0202 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0202 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r15, r1)     // Catch:{ Exception -> 0x0202 }
            r1 = 0
            boolean r2 = r9.mo150786e(r7, r1)     // Catch:{ Exception -> 0x0202 }
            if (r2 == 0) goto L_0x0194
            java.lang.String r1 = " Hack code existed!! NO modify "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r1)     // Catch:{ Exception -> 0x0202 }
            com.tencent.p014mm.plugin.multitalk.model.C105815m.f314657z = r7     // Catch:{ Exception -> 0x0202 }
            goto L_0x019f
        L_0x0194:
            com.tencent.mm.plugin.voip.model.h r1 = new com.tencent.mm.plugin.voip.model.h     // Catch:{ Exception -> 0x0202 }
            r1.<init>()     // Catch:{ Exception -> 0x0202 }
            byte[] r1 = r1.mo152583a(r7)     // Catch:{ Exception -> 0x0202 }
            com.tencent.p014mm.plugin.multitalk.model.C105815m.f314657z = r1     // Catch:{ Exception -> 0x0202 }
        L_0x019f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0202 }
            r1.<init>()     // Catch:{ Exception -> 0x0202 }
            java.lang.String r2 = " Parsing protobuf, spsLen = "
            r1.append(r2)     // Catch:{ Exception -> 0x0202 }
            byte[] r2 = com.tencent.p014mm.plugin.multitalk.model.C105815m.f314657z     // Catch:{ Exception -> 0x0202 }
            int r2 = r2.length     // Catch:{ Exception -> 0x0202 }
            r1.append(r2)     // Catch:{ Exception -> 0x0202 }
            java.lang.String r2 = ", original="
            r1.append(r2)     // Catch:{ Exception -> 0x0202 }
            r1.append(r6)     // Catch:{ Exception -> 0x0202 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0202 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r15, r1)     // Catch:{ Exception -> 0x0202 }
            int r10 = r10 + 4
            byte[] r1 = new byte[r10]     // Catch:{ Exception -> 0x0202 }
            com.tencent.p014mm.plugin.multitalk.model.C105815m.f314653A = r1     // Catch:{ Exception -> 0x0202 }
            byte[] r2 = r9.f314667p     // Catch:{ Exception -> 0x0202 }
            r7 = 4
            r10 = 0
            java.lang.System.arraycopy(r2, r10, r1, r10, r7)     // Catch:{ Exception -> 0x0202 }
            pe3.b r0 = r0.f331876f     // Catch:{ Exception -> 0x0202 }
            byte[] r1 = com.tencent.p014mm.plugin.multitalk.model.C105815m.f314653A     // Catch:{ Exception -> 0x0202 }
            r0.mo123700c(r1, r7)     // Catch:{ Exception -> 0x0202 }
            byte[] r0 = com.tencent.p014mm.plugin.multitalk.model.C105815m.f314657z     // Catch:{ Exception -> 0x0202 }
            int r1 = r0.length     // Catch:{ Exception -> 0x0202 }
            byte[] r2 = com.tencent.p014mm.plugin.multitalk.model.C105815m.f314653A     // Catch:{ Exception -> 0x0202 }
            int r2 = r2.length     // Catch:{ Exception -> 0x0202 }
            int r1 = r1 + r2
            byte[] r1 = new byte[r1]     // Catch:{ Exception -> 0x0202 }
            r9.f314660f = r1     // Catch:{ Exception -> 0x0202 }
            int r2 = r0.length     // Catch:{ Exception -> 0x0202 }
            r7 = 0
            java.lang.System.arraycopy(r0, r7, r1, r7, r2)     // Catch:{ Exception -> 0x0202 }
            byte[] r0 = com.tencent.p014mm.plugin.multitalk.model.C105815m.f314657z     // Catch:{ Exception -> 0x0202 }
            int r0 = r0.length     // Catch:{ Exception -> 0x0202 }
            int r0 = r0 + r7
            byte[] r1 = com.tencent.p014mm.plugin.multitalk.model.C105815m.f314653A     // Catch:{ Exception -> 0x0202 }
            byte[] r2 = r9.f314660f     // Catch:{ Exception -> 0x0202 }
            int r10 = r1.length     // Catch:{ Exception -> 0x0202 }
            java.lang.System.arraycopy(r1, r7, r2, r0, r10)     // Catch:{ Exception -> 0x0202 }
        L_0x01ee:
            r9.f314670s = r6     // Catch:{ Exception -> 0x0202 }
            byte[] r0 = com.tencent.p014mm.plugin.multitalk.model.C105815m.f314657z     // Catch:{ Exception -> 0x0202 }
            int r1 = r0.length     // Catch:{ Exception -> 0x0202 }
            r2 = 4
            int r1 = r1 - r2
            byte[] r6 = new byte[r1]     // Catch:{ Exception -> 0x0202 }
            int r7 = r0.length     // Catch:{ Exception -> 0x0202 }
            int r7 = r7 - r2
            r10 = 0
            java.lang.System.arraycopy(r0, r2, r6, r10, r7)     // Catch:{ Exception -> 0x0202 }
            r9.mo150787f(r6, r1)     // Catch:{ Exception -> 0x0202 }
            r0 = 1
            goto L_0x021c
        L_0x0202:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = " sps/pps parsing error:"
            r1.append(r2)
            java.lang.String r0 = r0.toString()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r0)
            r0 = 0
        L_0x021c:
            r16 = r5
            r10 = 0
            goto L_0x02e4
        L_0x0221:
            te3.ze2 r0 = new te3.ze2     // Catch:{ Exception -> 0x02c7 }
            r0.<init>()     // Catch:{ Exception -> 0x02c7 }
            pe3.a r0 = r0.parseFrom(r3)     // Catch:{ Exception -> 0x02c7 }
            te3.ze2 r0 = (te3.C110976ze2) r0     // Catch:{ Exception -> 0x02c7 }
            java.util.LinkedList<java.lang.Integer> r1 = r0.f332384g     // Catch:{ Exception -> 0x02c7 }
            java.lang.Object r1 = r1.getFirst()     // Catch:{ Exception -> 0x02c7 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Exception -> 0x02c7 }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x02c7 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02c7 }
            r2.<init>()     // Catch:{ Exception -> 0x02c7 }
            java.lang.String r6 = " Parsing protobuf, framelen = "
            r2.append(r6)     // Catch:{ Exception -> 0x02c7 }
            r2.append(r1)     // Catch:{ Exception -> 0x02c7 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x02c7 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r15, r2)     // Catch:{ Exception -> 0x02c7 }
            r2 = 1
            if (r4 != r2) goto L_0x025d
            byte[] r2 = r9.f314660f     // Catch:{ Exception -> 0x02c7 }
            int r6 = r2.length     // Catch:{ Exception -> 0x02c7 }
            int r7 = r1 + r6
            byte[] r10 = new byte[r7]     // Catch:{ Exception -> 0x02c7 }
            r11 = 0
            java.lang.System.arraycopy(r2, r11, r10, r11, r6)     // Catch:{ Exception -> 0x02c7 }
            int r2 = r6 + 0
            goto L_0x0262
        L_0x025d:
            byte[] r2 = new byte[r1]     // Catch:{ Exception -> 0x02c7 }
            r7 = r1
            r10 = r2
            r2 = 0
        L_0x0262:
            r6 = 0
        L_0x0263:
            r11 = 4
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r11)     // Catch:{ Exception -> 0x02c7 }
            pe3.b r11 = r0.f332381d     // Catch:{ Exception -> 0x02c7 }
            r16 = r5
            byte[] r5 = r3.array()     // Catch:{ Exception -> 0x02c5 }
            byte[] r11 = r11.f257327a     // Catch:{ Exception -> 0x02c5 }
            r8 = 4
            r12 = 0
            java.lang.System.arraycopy(r11, r6, r5, r12, r8)     // Catch:{ Exception -> 0x02c5 }
            java.nio.ByteOrder r5 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ Exception -> 0x02c5 }
            r3.order(r5)     // Catch:{ Exception -> 0x02c5 }
            int r3 = r3.getInt(r12)     // Catch:{ Exception -> 0x02c5 }
            byte[] r5 = r9.f314667p     // Catch:{ Exception -> 0x02c5 }
            int r8 = r6 + r2
            r11 = 4
            java.lang.System.arraycopy(r5, r12, r10, r8, r11)     // Catch:{ Exception -> 0x02c5 }
            int r6 = r6 + 4
            pe3.b r5 = r0.f332381d     // Catch:{ Exception -> 0x02c5 }
            int r8 = r6 + r2
            byte[] r5 = r5.f257327a     // Catch:{ Exception -> 0x02c5 }
            java.lang.System.arraycopy(r5, r6, r10, r8, r3)     // Catch:{ Exception -> 0x02c5 }
            int r6 = r6 + r3
            int r5 = r3 + 4
            int r1 = r1 - r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02c5 }
            r5.<init>()     // Catch:{ Exception -> 0x02c5 }
            java.lang.String r8 = "steve: nTmpLen :"
            r5.append(r8)     // Catch:{ Exception -> 0x02c5 }
            r5.append(r3)     // Catch:{ Exception -> 0x02c5 }
            java.lang.String r3 = ", framelen:"
            r5.append(r3)     // Catch:{ Exception -> 0x02c5 }
            r5.append(r7)     // Catch:{ Exception -> 0x02c5 }
            java.lang.String r3 = ", naluType:"
            r5.append(r3)     // Catch:{ Exception -> 0x02c5 }
            r5.append(r4)     // Catch:{ Exception -> 0x02c5 }
            java.lang.String r3 = r5.toString()     // Catch:{ Exception -> 0x02c5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r15, r3)     // Catch:{ Exception -> 0x02c5 }
            if (r1 > 0) goto L_0x02be
            goto L_0x02e3
        L_0x02be:
            r12 = r29
            r8 = r30
            r5 = r16
            goto L_0x0263
        L_0x02c5:
            r0 = move-exception
            goto L_0x02ca
        L_0x02c7:
            r0 = move-exception
            r16 = r5
        L_0x02ca:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = " frame parsing error:"
            r1.append(r2)
            java.lang.String r0 = r0.toString()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r0)
            r10 = 0
        L_0x02e3:
            r0 = 0
        L_0x02e4:
            r1 = 8
            if (r0 == 0) goto L_0x03d7
            byte[] r0 = com.tencent.p014mm.plugin.multitalk.model.C105815m.f314657z     // Catch:{ Exception -> 0x03bc }
            if (r0 == 0) goto L_0x03d7
            byte[] r0 = com.tencent.p014mm.plugin.multitalk.model.C105815m.f314653A     // Catch:{ Exception -> 0x03bc }
            if (r0 == 0) goto L_0x03d7
            boolean r0 = r9.f314662h     // Catch:{ Exception -> 0x03bc }
            if (r0 != 0) goto L_0x03b9
            com.tencent.mm.compatible.deviceinfo.a r0 = r9.f314658d     // Catch:{ Exception -> 0x03bc }
            if (r0 == 0) goto L_0x031d
            r0.mo148223z()     // Catch:{ Exception -> 0x0304 }
            com.tencent.mm.compatible.deviceinfo.a r0 = r9.f314658d     // Catch:{ Exception -> 0x0304 }
            r0.mo148214p()     // Catch:{ Exception -> 0x0304 }
            r2 = 0
            r9.f314658d = r2     // Catch:{ Exception -> 0x0304 }
            goto L_0x031d
        L_0x0304:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03bc }
            r2.<init>()     // Catch:{ Exception -> 0x03bc }
            java.lang.String r3 = " decoder stop  error:"
            r2.append(r3)     // Catch:{ Exception -> 0x03bc }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x03bc }
            r2.append(r0)     // Catch:{ Exception -> 0x03bc }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x03bc }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r0)     // Catch:{ Exception -> 0x03bc }
        L_0x031d:
            boolean r0 = r9.f314661g     // Catch:{ Exception -> 0x03bc }
            if (r0 == 0) goto L_0x032c
            java.lang.String r0 = "video/hevc"
            int r2 = com.tencent.p014mm.plugin.multitalk.model.C105815m.f314654B     // Catch:{ Exception -> 0x03bc }
            int r3 = com.tencent.p014mm.plugin.multitalk.model.C105815m.f314655C     // Catch:{ Exception -> 0x03bc }
            android.media.MediaFormat r0 = android.media.MediaFormat.createVideoFormat(r0, r2, r3)     // Catch:{ Exception -> 0x03bc }
            goto L_0x0336
        L_0x032c:
            java.lang.String r0 = "video/avc"
            int r2 = com.tencent.p014mm.plugin.multitalk.model.C105815m.f314654B     // Catch:{ Exception -> 0x03bc }
            int r3 = com.tencent.p014mm.plugin.multitalk.model.C105815m.f314655C     // Catch:{ Exception -> 0x03bc }
            android.media.MediaFormat r0 = android.media.MediaFormat.createVideoFormat(r0, r2, r3)     // Catch:{ Exception -> 0x03bc }
        L_0x0336:
            java.lang.String r2 = "rotation-degrees"
            r3 = 90
            r0.setInteger(r2, r3)     // Catch:{ Exception -> 0x03bc }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03bc }
            r2.<init>()     // Catch:{ Exception -> 0x03bc }
            java.lang.String r3 = "create HW decoder, format : "
            r2.append(r3)     // Catch:{ Exception -> 0x03bc }
            r2.append(r0)     // Catch:{ Exception -> 0x03bc }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x03bc }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r2)     // Catch:{ Exception -> 0x03bc }
            java.lang.String r2 = "mime"
            java.lang.String r2 = r0.getString(r2)     // Catch:{ Exception -> 0x03bc }
            java.lang.String r3 = "video/"
            boolean r3 = r2.startsWith(r3)     // Catch:{ Exception -> 0x03bc }
            if (r3 == 0) goto L_0x03b9
            com.tencent.mm.compatible.deviceinfo.a r3 = com.tencent.p014mm.compatible.deviceinfo.C104619a.m140211c(r2)     // Catch:{ Exception -> 0x03bc }
            r9.f314658d = r3     // Catch:{ Exception -> 0x03bc }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0391 }
            r3.<init>()     // Catch:{ Exception -> 0x0391 }
            java.lang.String r5 = "configure, format : "
            r3.append(r5)     // Catch:{ Exception -> 0x0391 }
            r3.append(r0)     // Catch:{ Exception -> 0x0391 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0391 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r15, r3)     // Catch:{ Exception -> 0x0391 }
            com.tencent.mm.compatible.deviceinfo.a r3 = r9.f314658d     // Catch:{ Exception -> 0x0391 }
            android.view.Surface r5 = r9.f314659e     // Catch:{ Exception -> 0x0391 }
            r6 = 0
            r7 = 0
            r3.mo148202a(r0, r5, r6, r7)     // Catch:{ Exception -> 0x038f }
            com.tencent.mm.compatible.deviceinfo.a r0 = r9.f314658d     // Catch:{ Exception -> 0x03b7 }
            r0.mo148222y()     // Catch:{ Exception -> 0x03b7 }
            r2 = 1
            r9.f314662h = r2     // Catch:{ Exception -> 0x03b7 }
            r9.start()     // Catch:{ Exception -> 0x03b7 }
            goto L_0x04e9
        L_0x038f:
            r0 = move-exception
            goto L_0x0393
        L_0x0391:
            r0 = move-exception
            r6 = 0
        L_0x0393:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03b7 }
            r3.<init>()     // Catch:{ Exception -> 0x03b7 }
            java.lang.String r5 = "codec '"
            r3.append(r5)     // Catch:{ Exception -> 0x03b7 }
            r3.append(r2)     // Catch:{ Exception -> 0x03b7 }
            java.lang.String r2 = "' failed configuration. "
            r3.append(r2)     // Catch:{ Exception -> 0x03b7 }
            r3.append(r0)     // Catch:{ Exception -> 0x03b7 }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x03b7 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r0)     // Catch:{ Exception -> 0x03b7 }
            r2 = 0
            r9.f314663i = r2     // Catch:{ Exception -> 0x03b7 }
            r9.mo150782a()     // Catch:{ Exception -> 0x03b7 }
            goto L_0x04e9
        L_0x03b7:
            r0 = move-exception
            goto L_0x03be
        L_0x03b9:
            r6 = 0
            goto L_0x04e9
        L_0x03bc:
            r0 = move-exception
            r6 = 0
        L_0x03be:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = " error:"
            r2.append(r3)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r0)
            goto L_0x03d8
        L_0x03d7:
            r6 = 0
        L_0x03d8:
            boolean r0 = r9.f314662h
            if (r0 != 0) goto L_0x03e6
            java.lang.String r0 = "DECODER_THREAD:: decoder not ready yet"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r0)
            r9.mo150782a()
            goto L_0x04e9
        L_0x03e6:
            if (r10 != 0) goto L_0x03ef
            java.lang.String r0 = "currentFrame is null!!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r0)
            goto L_0x04e9
        L_0x03ef:
            boolean r0 = r9.f314664j
            if (r0 != 0) goto L_0x03f6
            r2 = 1
            r9.f314664j = r2
        L_0x03f6:
            int r0 = r10.length
            r2 = 4
            byte r2 = r10[r2]
            r2 = r2 & 31
            r3 = 7
            r5 = 80
            if (r2 == r3) goto L_0x0411
            if (r2 != r1) goto L_0x0404
            goto L_0x0411
        L_0x0404:
            r1 = 5
            if (r2 == r1) goto L_0x040e
            r1 = 6
            if (r2 != r1) goto L_0x040b
            goto L_0x040e
        L_0x040b:
            r1 = 80
            goto L_0x0413
        L_0x040e:
            r1 = 73
            goto L_0x0413
        L_0x0411:
            r1 = 83
        L_0x0413:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r7 = "steve: before dequeueInputBuffer, frameLen="
            r3.append(r7)
            r3.append(r0)
            java.lang.String r7 = ", fNalType="
            r3.append(r7)
            r3.append(r2)
            java.lang.String r2 = ", frmType="
            r3.append(r2)
            r3.append(r1)
            java.lang.String r7 = ", mInputCnt="
            r3.append(r7)
            int r7 = r9.f314669r
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r15, r3)
            boolean r3 = r9.f314665n
            if (r3 == 0) goto L_0x044e
            if (r1 != r5) goto L_0x044e
            java.lang.String r0 = "DECODER_THREAD:: IRequest, not decodeable!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r0)
            goto L_0x04e9
        L_0x044e:
            com.tencent.mm.compatible.deviceinfo.a r3 = r9.f314658d
            r7 = 10000(0x2710, double:4.9407E-320)
            int r3 = r3.mo148204f(r7)
            if (r3 < 0) goto L_0x04d3
            if (r0 <= 0) goto L_0x04e9
            long r7 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r11 = "steve: (10000us)put data into inputbuffer,idx="
            r5.append(r11)
            r5.append(r3)
            java.lang.String r11 = ", frameLen="
            r5.append(r11)
            r5.append(r0)
            r5.append(r2)
            r5.append(r1)
            java.lang.String r1 = ", inputpts="
            r5.append(r1)
            r5.append(r7)
            java.lang.String r1 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r15, r1)
            com.tencent.mm.compatible.deviceinfo.a r1 = r9.f314658d
            java.nio.ByteBuffer r1 = r1.mo148207i(r3)
            r1.clear()
            r2 = 0
            r1.put(r10, r2, r0)
            com.tencent.mm.compatible.deviceinfo.a r1 = r9.f314658d
            r19 = 0
            r23 = 0
            r17 = r1
            r18 = r3
            r20 = r0
            r21 = r7
            r17.mo148213o(r18, r19, r20, r21, r23)
            int r0 = r9.f314669r
            r1 = 1
            int r0 = r0 + r1
            r9.f314669r = r0
            r2 = 0
            r9.f314666o = r2
            boolean r0 = r9.f314665n
            if (r0 == 0) goto L_0x04e9
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r1)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            r0.order(r3)
            r0.put(r2)
            com.tencent.mm.plugin.multitalk.model.w r3 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.xx0()
            ds3.d r3 = r3.f314798d
            r5 = 28
            byte[] r0 = r0.array()
            nw3.e r3 = (nw3.C109779e) r3
            r3.mo161038i(r5, r0, r1)
            r9.f314665n = r2
            goto L_0x04e9
        L_0x04d3:
            r2 = 0
            boolean r0 = r9.f314665n
            if (r0 == 0) goto L_0x04dc
            if (r1 == r5) goto L_0x04dc
            r9.f314663i = r2
        L_0x04dc:
            r9.mo150782a()
            java.lang.String r0 = "steve: fail to input data into mediacodec inputbuffer!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r0)
            goto L_0x04e9
        L_0x04e5:
            r16 = r5
            goto L_0x03b9
        L_0x04e9:
            c92.g r0 = c92.C104329g.f308829a
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r13)
            r3 = 2
            r0.mo146027a(r3, r1)
            goto L_0x04f7
        L_0x04f4:
            r16 = r5
            r6 = 0
        L_0x04f7:
            r1 = r24
            r2 = r25
            r3 = r26
            r5 = r16
            goto L_0x002f
        L_0x0501:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.multitalk.model.C105857z0.mo150839c(java.lang.String, byte[], int, int, int, int):void");
    }

    /* renamed from: d */
    public void mo150840d(String str, int[] iArr, int i, int i2, int i3, int i4) {
        C105858a aVar;
        String str2 = str;
        int[] iArr2 = iArr;
        C87412m.m108594g(str2, "userName");
        C87412m.m108594g(iArr2, "pBuffer");
        ArrayList arrayList = new ArrayList();
        ArrayList<C105810k> arrayList2 = this.f314837a;
        if (arrayList2 != null) {
            Iterator<C105810k> it = arrayList2.iterator();
            while (it.hasNext()) {
                C105810k next = it.next();
                if (this.f314838b == 1 && C87412m.m108589b(str2, this.f314839c)) {
                    C105808j a = next.mo150700a(0);
                    if (a != null) {
                        arrayList.add(a);
                    }
                } else {
                    C105808j b = next.mo150701b(str2);
                    if (b != null) {
                        arrayList.add(b);
                    }
                }
            }
        }
        if (!(!arrayList.isEmpty())) {
            arrayList = null;
        }
        ArrayList<C105808j> arrayList3 = arrayList;
        if (arrayList3 != null) {
            for (C105808j jVar : arrayList3) {
                if (this.f314838b == 1 && C87412m.m108589b(jVar.getUsername(), this.f314839c)) {
                    aVar = this.f314840d;
                } else if (this.f314841e.get(jVar.getUsername()) == null) {
                    C105858a aVar2 = new C105858a(jVar.getUsername(), 0, 0, (Bitmap) null, 14, (C8480h) null);
                    this.f314841e.put(jVar.getUsername(), aVar2);
                    aVar = aVar2;
                } else {
                    aVar = this.f314841e.get(jVar.getUsername());
                }
                if (aVar != null) {
                    mo150841e(aVar, iArr2, i, i2);
                    aVar.f314849c = i3;
                    aVar.f314848b = i4;
                    Bitmap bitmap = aVar.f314850d;
                    if (bitmap != null) {
                        CommonKt.uiThread(new C105862e(arrayList3, str, bitmap, i4, i3));
                    }
                } else {
                    int i5 = i;
                    int i6 = i2;
                    int i7 = i3;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r0.getHeight() != r13) goto L_0x0019;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo150841e(com.tencent.p014mm.plugin.multitalk.model.C105857z0.C105858a r10, int[] r11, int r12, int r13) {
        /*
            r9 = this;
            monitor-enter(r9)
            android.graphics.Bitmap r0 = r10.f314850d     // Catch:{ all -> 0x0063 }
            if (r0 == 0) goto L_0x0019
            gy3.C87412m.m108591d(r0)     // Catch:{ all -> 0x0063 }
            int r0 = r0.getWidth()     // Catch:{ all -> 0x0063 }
            if (r0 != r12) goto L_0x0019
            android.graphics.Bitmap r0 = r10.f314850d     // Catch:{ all -> 0x0063 }
            gy3.C87412m.m108591d(r0)     // Catch:{ all -> 0x0063 }
            int r0 = r0.getHeight()     // Catch:{ all -> 0x0063 }
            if (r0 == r13) goto L_0x0021
        L_0x0019:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x0063 }
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r12, r13, r0)     // Catch:{ all -> 0x0063 }
            r10.f314850d = r0     // Catch:{ all -> 0x0063 }
        L_0x0021:
            android.graphics.Bitmap r10 = r10.f314850d     // Catch:{ all -> 0x0063 }
            if (r10 == 0) goto L_0x0061
            r3 = 0
            r5 = 0
            r6 = 0
            r1 = r10
            r2 = r11
            r4 = r12
            r7 = r12
            r8 = r13
            r1.setPixels(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0031 }
            goto L_0x0061
        L_0x0031:
            java.lang.String r11 = "VideoDisplayDataMuxer"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0063 }
            r0.<init>()     // Catch:{ all -> 0x0063 }
            java.lang.String r1 = "error happened in set pixel while w is "
            r0.append(r1)     // Catch:{ all -> 0x0063 }
            r0.append(r12)     // Catch:{ all -> 0x0063 }
            java.lang.String r12 = " and h is "
            r0.append(r12)     // Catch:{ all -> 0x0063 }
            r0.append(r13)     // Catch:{ all -> 0x0063 }
            java.lang.String r12 = " and bitmap bound is "
            r0.append(r12)     // Catch:{ all -> 0x0063 }
            int r12 = r10.getWidth()     // Catch:{ all -> 0x0063 }
            int r10 = r10.getHeight()     // Catch:{ all -> 0x0063 }
            int r12 = r12 * r10
            r0.append(r12)     // Catch:{ all -> 0x0063 }
            java.lang.String r10 = r0.toString()     // Catch:{ all -> 0x0063 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r10)     // Catch:{ all -> 0x0063 }
        L_0x0061:
            monitor-exit(r9)
            return
        L_0x0063:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.multitalk.model.C105857z0.mo150841e(com.tencent.mm.plugin.multitalk.model.z0$a, int[], int, int):void");
    }

    /* renamed from: f */
    public final void mo150842f(C105810k kVar) {
        C87412m.m108594g(kVar, "targetContainer");
        ArrayList<C105810k> arrayList = this.f314837a;
        boolean z = true;
        if (arrayList == null || !arrayList.contains(kVar)) {
            z = false;
        }
        if (!z) {
            if (this.f314837a == null) {
                this.f314837a = new ArrayList<>();
            }
            ArrayList<C105810k> arrayList2 = this.f314837a;
            if (arrayList2 != null) {
                arrayList2.add(kVar);
            }
        }
    }

    /* renamed from: g */
    public final boolean mo150843g(String str) {
        return this.f314838b == 2 && C87412m.m108589b(str, this.f314839c);
    }

    /* renamed from: h */
    public final void mo150844h(int i, String str) {
        C87412m.m108594g(str, "largeHostName");
        Log.printInfoStack("VideoDisplayDataMuxer", "setLargeTargetState " + i, new Object[0]);
        this.f314838b = i;
        this.f314839c = str;
    }

    /* renamed from: i */
    public final void mo150845i(C105810k kVar) {
        C87412m.m108594g(kVar, "targetContainer");
        ArrayList<C105810k> arrayList = new ArrayList<>();
        ArrayList<C105810k> arrayList2 = this.f314837a;
        if (arrayList2 != null) {
            Iterator<C105810k> it = arrayList2.iterator();
            while (it.hasNext()) {
                C105810k next = it.next();
                if (!C87412m.m108589b(next, kVar)) {
                    arrayList.add(next);
                }
            }
        }
        this.f314837a = arrayList;
    }
}
