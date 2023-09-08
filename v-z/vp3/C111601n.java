package vp3;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.p014mm.xeffect.InputAnimation;
import com.tencent.p014mm.xeffect.LayoutInfo;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;
import rx3.C13598b0;
import yp3.C112478a;

/* renamed from: vp3.n */
public final class C111601n extends C111592h {

    /* renamed from: t */
    public final String f334078t = ("MultiInputEffectRenderController@" + hashCode());

    /* renamed from: u */
    public final ConcurrentLinkedDeque<C111602a> f334079u = new ConcurrentLinkedDeque<>();

    /* renamed from: vp3.n$a */
    public static final class C111602a {

        /* renamed from: a */
        public String f334080a;

        /* renamed from: b */
        public final C111603b f334081b;

        /* renamed from: c */
        public C111604c f334082c;

        public C111602a(String str, C111603b bVar, C111604c cVar) {
            C87412m.m108595h(str, "key");
            C87412m.m108595h(bVar, "data");
            this.f334080a = str;
            this.f334081b = bVar;
            this.f334082c = cVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C111602a)) {
                return false;
            }
            C111602a aVar = (C111602a) obj;
            return C87412m.m108589b(this.f334080a, aVar.f334080a) && C87412m.m108589b(this.f334081b, aVar.f334081b) && C87412m.m108589b(this.f334082c, aVar.f334082c);
        }

        public int hashCode() {
            String str = this.f334080a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            C111603b bVar = this.f334081b;
            int hashCode2 = (hashCode + (bVar != null ? bVar.hashCode() : 0)) * 31;
            C111604c cVar = this.f334082c;
            if (cVar != null) {
                i = cVar.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            return "EffectInputTexture(key=" + this.f334080a + ", data=" + this.f334081b + ", animate=" + this.f334082c + ")";
        }
    }

    /* renamed from: vp3.n$b */
    public static final class C111603b {

        /* renamed from: a */
        public int f334083a;

        /* renamed from: b */
        public boolean f334084b;

        /* renamed from: c */
        public int f334085c;

        /* renamed from: d */
        public int f334086d;

        /* renamed from: e */
        public int f334087e;

        /* renamed from: f */
        public SurfaceTexture f334088f;

        public C111603b() {
            this(0, false, 0, 0, 0, (SurfaceTexture) null, 63, (C8480h) null);
        }

        public C111603b(int i, boolean z, int i2, int i3, int i4, SurfaceTexture surfaceTexture) {
            this.f334083a = i;
            this.f334084b = z;
            this.f334085c = i2;
            this.f334086d = i3;
            this.f334087e = i4;
            this.f334088f = surfaceTexture;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C111603b) {
                    C111603b bVar = (C111603b) obj;
                    if (this.f334083a == bVar.f334083a) {
                        if (this.f334084b == bVar.f334084b) {
                            if (this.f334085c == bVar.f334085c) {
                                if (this.f334086d == bVar.f334086d) {
                                    if (!(this.f334087e == bVar.f334087e) || !C87412m.m108589b(this.f334088f, bVar.f334088f)) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i = this.f334083a * 31;
            boolean z = this.f334084b;
            if (z) {
                z = true;
            }
            int i2 = (((((((i + (z ? 1 : 0)) * 31) + this.f334085c) * 31) + this.f334086d) * 31) + this.f334087e) * 31;
            SurfaceTexture surfaceTexture = this.f334088f;
            return i2 + (surfaceTexture != null ? surfaceTexture.hashCode() : 0);
        }

        public String toString() {
            return "InputTextureData(textureId=" + this.f334083a + ", isOES=" + this.f334084b + ", width=" + this.f334085c + ", height=" + this.f334086d + ", rotate=" + this.f334087e + ", surfaceTexture=" + this.f334088f + ")";
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ C111603b(int r5, boolean r6, int r7, int r8, int r9, android.graphics.SurfaceTexture r10, int r11, gy3.C8480h r12) {
            /*
                r4 = this;
                r12 = r11 & 1
                r0 = 0
                if (r12 == 0) goto L_0x0007
                r12 = 0
                goto L_0x0008
            L_0x0007:
                r12 = r5
            L_0x0008:
                r5 = r11 & 2
                if (r5 == 0) goto L_0x000e
                r1 = 0
                goto L_0x000f
            L_0x000e:
                r1 = r6
            L_0x000f:
                r5 = r11 & 4
                if (r5 == 0) goto L_0x0015
                r2 = 0
                goto L_0x0016
            L_0x0015:
                r2 = r7
            L_0x0016:
                r5 = r11 & 8
                if (r5 == 0) goto L_0x001c
                r3 = 0
                goto L_0x001d
            L_0x001c:
                r3 = r8
            L_0x001d:
                r5 = r11 & 16
                if (r5 == 0) goto L_0x0022
                goto L_0x0023
            L_0x0022:
                r0 = r9
            L_0x0023:
                r5 = r11 & 32
                if (r5 == 0) goto L_0x0028
                r10 = 0
            L_0x0028:
                r11 = r10
                r5 = r4
                r6 = r12
                r7 = r1
                r8 = r2
                r9 = r3
                r10 = r0
                r5.<init>(r6, r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: vp3.C111601n.C111603b.<init>(int, boolean, int, int, int, android.graphics.SurfaceTexture, int, gy3.h):void");
        }
    }

    /* renamed from: vp3.n$c */
    public static final class C111604c {

        /* renamed from: a */
        public LayoutInfo f334089a;

        /* renamed from: b */
        public LayoutInfo f334090b;

        /* renamed from: c */
        public InputAnimation f334091c;

        public C111604c(LayoutInfo layoutInfo, LayoutInfo layoutInfo2, InputAnimation inputAnimation) {
            C87412m.m108595h(layoutInfo, "fromLayout");
            C87412m.m108595h(layoutInfo2, "toLayout");
            C87412m.m108595h(inputAnimation, "animate");
            this.f334089a = layoutInfo;
            this.f334090b = layoutInfo2;
            this.f334091c = inputAnimation;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C111604c)) {
                return false;
            }
            C111604c cVar = (C111604c) obj;
            return C87412m.m108589b(this.f334089a, cVar.f334089a) && C87412m.m108589b(this.f334090b, cVar.f334090b) && C87412m.m108589b(this.f334091c, cVar.f334091c);
        }

        public int hashCode() {
            LayoutInfo layoutInfo = this.f334089a;
            int i = 0;
            int hashCode = (layoutInfo != null ? layoutInfo.hashCode() : 0) * 31;
            LayoutInfo layoutInfo2 = this.f334090b;
            int hashCode2 = (hashCode + (layoutInfo2 != null ? layoutInfo2.hashCode() : 0)) * 31;
            InputAnimation inputAnimation = this.f334091c;
            if (inputAnimation != null) {
                i = inputAnimation.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            return "TextureLayoutAnimation(fromLayout=" + this.f334089a + ", toLayout=" + this.f334090b + ", animate=" + this.f334091c + ")";
        }
    }

    /* renamed from: vp3.n$d */
    public static final class C111605d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C111601n f334092d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111605d(C111601n nVar) {
            super(0);
            this.f334092d = nVar;
        }

        public Object invoke() {
            Iterator<C111602a> it = this.f334092d.f334079u.iterator();
            while (it.hasNext()) {
                C111602a next = it.next();
                GLES20.glDeleteTextures(1, new int[]{next.f334081b.f334083a}, 0);
                SurfaceTexture surfaceTexture = next.f334081b.f334088f;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
            }
            this.f334092d.f334079u.clear();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: vp3.n$e */
    public static final class C111606e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C111602a f334093d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111606e(C111602a aVar) {
            super(0);
            this.f334093d = aVar;
        }

        public Object invoke() {
            GLES20.glDeleteTextures(1, new int[]{this.f334093d.f334081b.f334083a}, 0);
            SurfaceTexture surfaceTexture = this.f334093d.f334081b.f334088f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0088 A[Catch:{ Exception -> 0x008c }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<qr3.C110469c> mo163258a(long r13) {
        /*
            r12 = this;
            java.util.concurrent.ConcurrentLinkedDeque<vp3.n$a> r13 = r12.f334079u
            boolean r13 = r13.isEmpty()
            if (r13 == 0) goto L_0x000b
            sx3.f0 r13 = sx3.C64186f0.f181907d
            return r13
        L_0x000b:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.concurrent.ConcurrentLinkedDeque<vp3.n$a> r14 = r12.f334079u
            java.util.Iterator r14 = r14.iterator()
        L_0x0016:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x00eb
            java.lang.Object r0 = r14.next()
            vp3.n$a r0 = (vp3.C111601n.C111602a) r0
            vp3.n$b r1 = r0.f334081b
            int r3 = r1.f334083a
            r8 = 0
            if (r3 <= 0) goto L_0x00ab
            int r4 = r1.f334085c
            if (r4 <= 0) goto L_0x00ab
            int r5 = r1.f334086d
            if (r5 > 0) goto L_0x0033
            goto L_0x00ab
        L_0x0033:
            int r2 = r1.f334087e
            r9 = 1
            r10 = 2
            if (r2 == 0) goto L_0x004d
            r6 = 90
            if (r2 == r6) goto L_0x004b
            r6 = 180(0xb4, float:2.52E-43)
            if (r2 == r6) goto L_0x0049
            r6 = 270(0x10e, float:3.78E-43)
            if (r2 == r6) goto L_0x0046
            goto L_0x004d
        L_0x0046:
            r2 = 3
            r7 = 3
            goto L_0x004e
        L_0x0049:
            r7 = 2
            goto L_0x004e
        L_0x004b:
            r7 = 1
            goto L_0x004e
        L_0x004d:
            r7 = 0
        L_0x004e:
            qr3.c r11 = new qr3.c
            boolean r6 = r1.f334084b
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            vp3.n$c r1 = r0.f334082c
            if (r1 == 0) goto L_0x0072
            com.tencent.mm.xeffect.LayoutInfo r2 = r1.f334089a
            java.lang.String r3 = "<set-?>"
            gy3.C87412m.m108595h(r2, r3)
            r11.f330360i = r2
            com.tencent.mm.xeffect.LayoutInfo r2 = r1.f334090b
            gy3.C87412m.m108595h(r2, r3)
            r11.f330361j = r2
            com.tencent.mm.xeffect.InputAnimation r1 = r1.f334091c
            gy3.C87412m.m108595h(r1, r3)
            r11.f330362k = r1
            goto L_0x0080
        L_0x0072:
            com.tencent.mm.xeffect.LayoutInfo r1 = r11.f330360i
            int r2 = r12.f334034c
            int r2 = r2 / r10
            r1.f319976b = r2
            int r2 = r12.f334035d
            int r2 = r2 / r10
            r1.f319977c = r2
            r1.f319979e = r9
        L_0x0080:
            r11.f330357f = r8
            vp3.n$b r1 = r0.f334081b     // Catch:{ Exception -> 0x008c }
            android.graphics.SurfaceTexture r1 = r1.f334088f     // Catch:{ Exception -> 0x008c }
            if (r1 == 0) goto L_0x00a6
            r1.updateTexImage()     // Catch:{ Exception -> 0x008c }
            goto L_0x00a6
        L_0x008c:
            java.lang.String r1 = r12.f334078t
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "update surfaceTexture error key:"
            r2.append(r3)
            java.lang.String r0 = r0.f334080a
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.Object[] r2 = new java.lang.Object[r8]
            yp3.C112478a.m153624b(r1, r0, r2)
        L_0x00a6:
            r13.add(r11)
            goto L_0x0016
        L_0x00ab:
            java.lang.String r1 = r12.f334078t
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "error input "
            r2.append(r3)
            java.lang.String r3 = r0.f334080a
            r2.append(r3)
            java.lang.String r3 = ", id:"
            r2.append(r3)
            vp3.n$b r3 = r0.f334081b
            int r3 = r3.f334083a
            r2.append(r3)
            java.lang.String r3 = " width:"
            r2.append(r3)
            vp3.n$b r3 = r0.f334081b
            int r3 = r3.f334085c
            r2.append(r3)
            java.lang.String r3 = " height:"
            r2.append(r3)
            vp3.n$b r0 = r0.f334081b
            int r0 = r0.f334086d
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.Object[] r2 = new java.lang.Object[r8]
            yp3.C112478a.m153628f(r1, r0, r2)
            goto L_0x0016
        L_0x00eb:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: vp3.C111601n.mo163258a(long):java.util.List");
    }

    /* renamed from: b */
    public void mo163259b() {
        mo163269e(new C111605d(this));
        super.mo163259b();
    }

    /* renamed from: c */
    public String mo163260c() {
        return this.f334078t;
    }

    /* renamed from: j */
    public final void mo163276j(String str) {
        T t;
        HandlerThread handlerThread;
        C87412m.m108595h(str, "key");
        String str2 = this.f334078t;
        C112478a.m153625c(str2, "removeInputTexture:" + str, new Object[0]);
        Iterator<T> it = this.f334079u.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C87412m.m108589b(((C111602a) t).f334080a, str)) {
                break;
            }
        }
        C111602a aVar = (C111602a) t;
        if (aVar != null) {
            C111606e eVar = new C111606e(aVar);
            if (this.f334043l == null || (handlerThread = this.f334044m) == null || !handlerThread.isAlive() || this.f334042k || !this.f334041j) {
                synchronized (this.f334045n) {
                    this.f334045n.add(0, eVar);
                    C13598b0 b0Var = C13598b0.f38549a;
                }
            } else {
                Handler handler = this.f334043l;
                if (handler != null) {
                    handler.postAtFrontOfQueue(new C111597j(eVar));
                }
            }
            this.f334079u.remove(aVar);
        }
    }
}
