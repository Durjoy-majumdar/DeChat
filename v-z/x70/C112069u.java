package x70;

import a14.C0000n0;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.tencent.p014mm.autogen.mmdata.rpt.CameraReportStruct;
import fy3.C32227p;
import gy3.C87412m;
import h80.C108171a;
import kotlin.ResultKt;
import rx3.C13598b0;
import v70.C111389d;
import v70.C111395e;
import v70.C111401n;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: x70.u */
public abstract class C112069u extends C112068t {

    @C91590f(mo125468c = "com.tencent.mm.media.camera.camerakit.CameraKitUIChange$bindSurface$1", mo125469f = "CameraKitUIChange.kt", mo125470l = {61}, mo125471m = "invokeSuspend")
    /* renamed from: x70.u$a */
    public static final class C112070a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f335494d;

        /* renamed from: e */
        public final /* synthetic */ C112069u f335495e;

        /* renamed from: f */
        public final /* synthetic */ Surface f335496f;

        /* renamed from: g */
        public final /* synthetic */ Integer f335497g;

        /* renamed from: h */
        public final /* synthetic */ Integer f335498h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112070a(C112069u uVar, Surface surface, Integer num, Integer num2, C15601d<? super C112070a> dVar) {
            super(2, dVar);
            this.f335495e = uVar;
            this.f335496f = surface;
            this.f335497g = num;
            this.f335498h = num2;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C112070a(this.f335495e, this.f335496f, this.f335497g, this.f335498h, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C112070a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f335494d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C111389d p = this.f335495e.mo163767p();
                Surface surface = this.f335496f;
                Integer num = this.f335497g;
                Integer num2 = this.f335498h;
                this.f335494d = 1;
                p.getClass();
                if (p.mo163058p("bindSurface", new C111395e(surface, p, num, num2, (C15601d<? super C111395e>) null), this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CameraReportStruct a = C108171a.f323903a.mo158577a(this.f335495e.f335419d);
            if (a != null) {
                a.f310105x = a.mo86045b("ScreenViewType", "surface", true);
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.media.camera.camerakit.CameraKitUIChange$bindSurfaceTexture$1", mo125469f = "CameraKitUIChange.kt", mo125470l = {68}, mo125471m = "invokeSuspend")
    /* renamed from: x70.u$b */
    public static final class C112071b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f335499d;

        /* renamed from: e */
        public final /* synthetic */ C112069u f335500e;

        /* renamed from: f */
        public final /* synthetic */ SurfaceTexture f335501f;

        /* renamed from: g */
        public final /* synthetic */ Integer f335502g;

        /* renamed from: h */
        public final /* synthetic */ Integer f335503h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112071b(C112069u uVar, SurfaceTexture surfaceTexture, Integer num, Integer num2, C15601d<? super C112071b> dVar) {
            super(2, dVar);
            this.f335500e = uVar;
            this.f335501f = surfaceTexture;
            this.f335502g = num;
            this.f335503h = num2;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C112071b(this.f335500e, this.f335501f, this.f335502g, this.f335503h, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C112071b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f335499d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C111389d p = this.f335500e.mo163767p();
                SurfaceTexture surfaceTexture = this.f335501f;
                Integer num = this.f335502g;
                Integer num2 = this.f335503h;
                this.f335499d = 1;
                p.getClass();
                if (p.mo163058p("bindSurface", new C111395e(new Surface(surfaceTexture), p, num, num2, (C15601d<? super C111395e>) null), this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CameraReportStruct a = C108171a.f323903a.mo158577a(this.f335500e.f335419d);
            if (a != null) {
                a.f310105x = a.mo86045b("ScreenViewType", "texture", true);
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.media.camera.camerakit.CameraKitUIChange$unbindSurface$1", mo125469f = "CameraKitUIChange.kt", mo125470l = {75}, mo125471m = "invokeSuspend")
    /* renamed from: x70.u$c */
    public static final class C112072c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f335504d;

        /* renamed from: e */
        public final /* synthetic */ C112069u f335505e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112072c(C112069u uVar, C15601d<? super C112072c> dVar) {
            super(2, dVar);
            this.f335505e = uVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C112072c(this.f335505e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C112072c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f335504d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C111389d p = this.f335505e.mo163767p();
                this.f335504d = 1;
                p.getClass();
                if (p.mo163058p("unbindSurface", new C111401n(p, (C15601d<? super C111401n>) null), this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.media.camera.camerakit.CameraKitUIChange$updateScreenSize$1", mo125469f = "CameraKitUIChange.kt", mo125470l = {25, 26, 27, 28, 29, 35, 38, 39, 41}, mo125471m = "invokeSuspend")
    /* renamed from: x70.u$d */
    public static final class C112073d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f335506d;

        /* renamed from: e */
        public int f335507e;

        /* renamed from: f */
        public final /* synthetic */ C112069u f335508f;

        /* renamed from: g */
        public final /* synthetic */ int f335509g;

        /* renamed from: h */
        public final /* synthetic */ int f335510h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112073d(C112069u uVar, int i, int i2, C15601d<? super C112073d> dVar) {
            super(2, dVar);
            this.f335508f = uVar;
            this.f335509g = i;
            this.f335510h = i2;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C112073d(this.f335508f, this.f335509g, this.f335510h, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C112073d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00f0, code lost:
            r11 = r10.f335508f.mo163767p();
            r1 = r10.f335509g;
            r2 = r10.f335510h;
            r10.f335507e = 2;
            r11.getClass();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0109, code lost:
            if (r11.mo163058p("updateScreenSize", new v70.C111405r(r1, r2, r11, (wx3.C15601d<? super v70.C111405r>) null), r10) != r0) goto L_0x010c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x010b, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x010c, code lost:
            r11 = r10.f335508f.f335420e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0110, code lost:
            if (r11 == null) goto L_0x011c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0112, code lost:
            r10.f335507e = 3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0119, code lost:
            if (r11.mo143115u(r10) != r0) goto L_0x011c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x011b, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x011c, code lost:
            r11 = r10.f335508f.mo163767p();
            r10.f335507e = 4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x0129, code lost:
            if (r11.mo163054g(r10) != r0) goto L_0x012c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x012b, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x012c, code lost:
            r11 = r10.f335508f.mo163767p();
            r10.f335507e = 5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x0139, code lost:
            if (r11.mo163059q(r10) != r0) goto L_0x013c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x013b, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x013e, code lost:
            return rx3.C13598b0.f38549a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x0160, code lost:
            r11 = new java.lang.StringBuilder();
            r11.append("updateScreenSize resumeCameraState:");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x016a, code lost:
            if (r1 == 0) goto L_0x016d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x016c, code lost:
            r2 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x016d, code lost:
            r11.append(r2);
            r11.append(" width:");
            r11.append(r10.f335509g);
            r11.append(" height:");
            r11.append(r10.f335510h);
            com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.Camera.CameraKit", r11.toString());
            r11 = r10.f335508f.mo163767p();
            r2 = r10.f335509g;
            r5 = r10.f335510h;
            r10.f335506d = r1;
            r10.f335507e = 7;
            r11.getClass();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x01a4, code lost:
            if (r11.mo163058p("updateScreenSize", new v70.C111405r(r2, r5, r11, (wx3.C15601d<? super v70.C111405r>) null), r10) != r0) goto L_0x01a7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x01a6, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x01a7, code lost:
            r11 = r10.f335508f.f335420e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x01ab, code lost:
            if (r11 == null) goto L_0x01be;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x01ad, code lost:
            r2 = r10.f335509g;
            r3 = r10.f335510h;
            r10.f335506d = r1;
            r10.f335507e = 8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x01bb, code lost:
            if (r11.mo143108m(r2, r3, r10) != r0) goto L_0x01be;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x01bd, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x01be, code lost:
            if (r1 == 0) goto L_0x01d1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x01c0, code lost:
            r11 = r10.f335508f.f335420e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x01c4, code lost:
            if (r11 == null) goto L_0x01d1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x01c6, code lost:
            r10.f335507e = 9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x01ce, code lost:
            if (r11.mo143112q((java.lang.Boolean) null, r10) != r0) goto L_0x01d1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x01d0, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x01d3, code lost:
            return rx3.C13598b0.f38549a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r10.f335507e
                r2 = 0
                java.lang.String r3 = "updateScreenSize"
                r4 = 0
                r5 = 1
                java.lang.String r6 = " height:"
                java.lang.String r7 = "MicroMsg.Camera.CameraKit"
                switch(r1) {
                    case 0: goto L_0x004b;
                    case 1: goto L_0x0046;
                    case 2: goto L_0x0041;
                    case 3: goto L_0x003c;
                    case 4: goto L_0x0037;
                    case 5: goto L_0x0032;
                    case 6: goto L_0x002b;
                    case 7: goto L_0x0024;
                    case 8: goto L_0x001d;
                    case 9: goto L_0x0018;
                    default: goto L_0x0010;
                }
            L_0x0010:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x0018:
                kotlin.ResultKt.throwOnFailure(r11)
                goto L_0x01d1
            L_0x001d:
                int r1 = r10.f335506d
                kotlin.ResultKt.throwOnFailure(r11)
                goto L_0x01be
            L_0x0024:
                int r1 = r10.f335506d
                kotlin.ResultKt.throwOnFailure(r11)
                goto L_0x01a7
            L_0x002b:
                int r1 = r10.f335506d
                kotlin.ResultKt.throwOnFailure(r11)
                goto L_0x0160
            L_0x0032:
                kotlin.ResultKt.throwOnFailure(r11)
                goto L_0x013c
            L_0x0037:
                kotlin.ResultKt.throwOnFailure(r11)
                goto L_0x012c
            L_0x003c:
                kotlin.ResultKt.throwOnFailure(r11)
                goto L_0x011c
            L_0x0041:
                kotlin.ResultKt.throwOnFailure(r11)
                goto L_0x010c
            L_0x0046:
                kotlin.ResultKt.throwOnFailure(r11)
                goto L_0x00f0
            L_0x004b:
                kotlin.ResultKt.throwOnFailure(r11)
                h80.a r11 = h80.C108171a.f323903a
                x70.u r1 = r10.f335508f
                int r1 = r1.f335419d
                int r8 = r10.f335509g
                int r9 = r10.f335510h
                com.tencent.mm.autogen.mmdata.rpt.CameraReportStruct r11 = r11.mo158577a(r1)
                if (r11 == 0) goto L_0x0062
                r11.f310089h = r8
                r11.f310090i = r9
            L_0x0062:
                x70.u r11 = r10.f335508f
                v70.d r11 = r11.mo163767p()
                e80.j r11 = r11.f333482j
                e80.i r11 = r11.f320922a
                int r11 = r11.f320920a
                int r1 = r10.f335509g
                if (r11 != r1) goto L_0x00a3
                x70.u r11 = r10.f335508f
                v70.d r11 = r11.mo163767p()
                e80.j r11 = r11.f333482j
                e80.i r11 = r11.f320922a
                int r11 = r11.f320921b
                int r1 = r10.f335510h
                if (r11 != r1) goto L_0x00a3
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r0 = "updateScreenSize no change,width:"
                r11.append(r0)
                int r0 = r10.f335509g
                r11.append(r0)
                r11.append(r6)
                int r0 = r10.f335510h
                r11.append(r0)
                java.lang.String r11 = r11.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r11)
                rx3.b0 r11 = rx3.C13598b0.f38549a
                return r11
            L_0x00a3:
                x70.u r11 = r10.f335508f
                v70.d r11 = r11.mo163767p()
                e80.j r11 = r11.f333482j
                e80.i r11 = r11.f320922a
                int r11 = r11.f320920a
                int r1 = r10.f335510h
                if (r11 != r1) goto L_0x013f
                x70.u r11 = r10.f335508f
                v70.d r11 = r11.mo163767p()
                e80.j r11 = r11.f333482j
                e80.i r11 = r11.f320922a
                int r11 = r11.f320921b
                int r1 = r10.f335509g
                if (r11 != r1) goto L_0x013f
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r1 = "updateScreenSize with rotate,width:"
                r11.append(r1)
                int r1 = r10.f335509g
                r11.append(r1)
                r11.append(r6)
                int r1 = r10.f335510h
                r11.append(r1)
                java.lang.String r11 = r11.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r11)
                x70.u r11 = r10.f335508f
                v70.d r11 = r11.mo163767p()
                r10.f335507e = r5
                java.lang.Object r11 = r11.mo163056j(r10)
                if (r11 != r0) goto L_0x00f0
                return r0
            L_0x00f0:
                x70.u r11 = r10.f335508f
                v70.d r11 = r11.mo163767p()
                int r1 = r10.f335509g
                int r2 = r10.f335510h
                r5 = 2
                r10.f335507e = r5
                r11.getClass()
                v70.r r5 = new v70.r
                r5.<init>(r1, r2, r11, r4)
                java.lang.Object r11 = r11.mo163058p(r3, r5, r10)
                if (r11 != r0) goto L_0x010c
                return r0
            L_0x010c:
                x70.u r11 = r10.f335508f
                a80.c r11 = r11.f335420e
                if (r11 == 0) goto L_0x011c
                r1 = 3
                r10.f335507e = r1
                java.lang.Object r11 = r11.mo143115u(r10)
                if (r11 != r0) goto L_0x011c
                return r0
            L_0x011c:
                x70.u r11 = r10.f335508f
                v70.d r11 = r11.mo163767p()
                r1 = 4
                r10.f335507e = r1
                java.lang.Object r11 = r11.mo163054g(r10)
                if (r11 != r0) goto L_0x012c
                return r0
            L_0x012c:
                x70.u r11 = r10.f335508f
                v70.d r11 = r11.mo163767p()
                r1 = 5
                r10.f335507e = r1
                java.lang.Object r11 = r11.mo163059q(r10)
                if (r11 != r0) goto L_0x013c
                return r0
            L_0x013c:
                rx3.b0 r11 = rx3.C13598b0.f38549a
                return r11
            L_0x013f:
                x70.u r11 = r10.f335508f
                a80.c r11 = r11.f335420e
                if (r11 == 0) goto L_0x014b
                boolean r11 = r11.mo143105g()
                r1 = r11
                goto L_0x014c
            L_0x014b:
                r1 = 0
            L_0x014c:
                if (r1 == 0) goto L_0x0160
                x70.u r11 = r10.f335508f
                a80.c r11 = r11.f335420e
                if (r11 == 0) goto L_0x0160
                r10.f335506d = r1
                r8 = 6
                r10.f335507e = r8
                java.lang.Object r11 = r11.mo143111p(r10)
                if (r11 != r0) goto L_0x0160
                return r0
            L_0x0160:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r8 = "updateScreenSize resumeCameraState:"
                r11.append(r8)
                if (r1 == 0) goto L_0x016d
                r2 = 1
            L_0x016d:
                r11.append(r2)
                java.lang.String r2 = " width:"
                r11.append(r2)
                int r2 = r10.f335509g
                r11.append(r2)
                r11.append(r6)
                int r2 = r10.f335510h
                r11.append(r2)
                java.lang.String r11 = r11.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r11)
                x70.u r11 = r10.f335508f
                v70.d r11 = r11.mo163767p()
                int r2 = r10.f335509g
                int r5 = r10.f335510h
                r10.f335506d = r1
                r6 = 7
                r10.f335507e = r6
                r11.getClass()
                v70.r r6 = new v70.r
                r6.<init>(r2, r5, r11, r4)
                java.lang.Object r11 = r11.mo163058p(r3, r6, r10)
                if (r11 != r0) goto L_0x01a7
                return r0
            L_0x01a7:
                x70.u r11 = r10.f335508f
                a80.c r11 = r11.f335420e
                if (r11 == 0) goto L_0x01be
                int r2 = r10.f335509g
                int r3 = r10.f335510h
                r10.f335506d = r1
                r5 = 8
                r10.f335507e = r5
                java.lang.Object r11 = r11.mo143108m(r2, r3, r10)
                if (r11 != r0) goto L_0x01be
                return r0
            L_0x01be:
                if (r1 == 0) goto L_0x01d1
                x70.u r11 = r10.f335508f
                a80.c r11 = r11.f335420e
                if (r11 == 0) goto L_0x01d1
                r1 = 9
                r10.f335507e = r1
                java.lang.Object r11 = r11.mo143112q(r4, r10)
                if (r11 != r0) goto L_0x01d1
                return r0
            L_0x01d1:
                rx3.b0 r11 = rx3.C13598b0.f38549a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: x70.C112069u.C112073d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: c */
    public void mo163066c(int i, int i2) {
        mo163061C("updateScreenSize", new C112073d(this, i, i2, (C15601d<? super C112073d>) null));
    }

    /* renamed from: h */
    public void mo163067h() {
        mo163062D("unbindSurface", new C112072c(this, (C15601d<? super C112072c>) null));
    }

    /* renamed from: j */
    public void mo163068j(SurfaceTexture surfaceTexture, Integer num, Integer num2) {
        C87412m.m108594g(surfaceTexture, "texture");
        mo163062D("bindSurfaceTexture", new C112071b(this, surfaceTexture, num, num2, (C15601d<? super C112071b>) null));
    }

    /* renamed from: o */
    public void mo163069o(Surface surface, Integer num, Integer num2) {
        C87412m.m108594g(surface, "surface");
        mo163062D("bindSurface", new C112070a(this, surface, num, num2, (C15601d<? super C112070a>) null));
    }
}
