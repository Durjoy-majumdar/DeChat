package d80;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import a80.C103320a;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.CameraState;
import androidx.camera.core.FocusMeteringResult;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Preview;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.ZoomState;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.extensions.ExtensionsManager;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.lifecycle.C0120a0;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.LiveData;
import com.tencent.p014mm.autogen.mmdata.rpt.CameraReportStruct;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import d14.C58087u0;
import e80.C107254b;
import e80.C107261i;
import f14.C58901s;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import h80.C108171a;
import i80.C108399b;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutionException;
import kotlin.Result;
import kotlin.ResultKt;
import p1167z8.C112608f;
import p329d3.C86165a;
import rx3.C13598b0;
import rx3.C13604l;
import v70.C111389d;
import v70.C111406s;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: d80.b */
public final class C107007b extends C103320a implements C0120a0<CameraState> {

    /* renamed from: C */
    public static final Size f320329C = new Size(3000, 3000);

    /* renamed from: A */
    public boolean f320330A;

    /* renamed from: B */
    public C32226l<? super C15601d<? super C13598b0>, ? extends Object> f320331B;

    /* renamed from: q */
    public C58087u0<C13604l<C108399b, Bundle>> f320332q;

    /* renamed from: r */
    public ProcessCameraProvider f320333r;

    /* renamed from: s */
    public ExtensionsManager f320334s;

    /* renamed from: t */
    public C112608f<ProcessCameraProvider> f320335t;

    /* renamed from: u */
    public C112608f<ExtensionsManager> f320336u;

    /* renamed from: v */
    public ImageCapture f320337v;

    /* renamed from: w */
    public Preview f320338w;

    /* renamed from: x */
    public volatile Camera f320339x;

    /* renamed from: y */
    public C107024g f320340y = new C107024g();

    /* renamed from: z */
    public final C107006a f320341z = new C107006a();

    /* renamed from: d80.b$a */
    public /* synthetic */ class C20447a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f57465a;

        static {
            int[] iArr = new int[CameraState.Type.values().length];
            iArr[CameraState.Type.PENDING_OPEN.ordinal()] = 1;
            iArr[CameraState.Type.OPENING.ordinal()] = 2;
            iArr[CameraState.Type.OPEN.ordinal()] = 3;
            iArr[CameraState.Type.CLOSING.ordinal()] = 4;
            iArr[CameraState.Type.CLOSED.ordinal()] = 5;
            f57465a = iArr;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.media.camera.instance.camerax.CameraXImpl", mo125469f = "CameraXImpl.kt", mo125470l = {124, 128}, mo125471m = "buildCameraUsage")
    /* renamed from: d80.b$b */
    public static final class C107008b extends C66704d {

        /* renamed from: d */
        public Object f320342d;

        /* renamed from: e */
        public Object f320343e;

        /* renamed from: f */
        public Object f320344f;

        /* renamed from: g */
        public Object f320345g;

        /* renamed from: h */
        public /* synthetic */ Object f320346h;

        /* renamed from: i */
        public final /* synthetic */ C107007b f320347i;

        /* renamed from: j */
        public int f320348j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107008b(C107007b bVar, C15601d<? super C107008b> dVar) {
            super(dVar);
            this.f320347i = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f320346h = obj;
            this.f320348j |= Integer.MIN_VALUE;
            C107007b bVar = this.f320347i;
            Size size = C107007b.f320329C;
            return bVar.mo157452J(this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.media.camera.instance.camerax.CameraXImpl$buildCameraUsage$2", mo125469f = "CameraXImpl.kt", mo125470l = {185}, mo125471m = "invokeSuspend")
    /* renamed from: d80.b$c */
    public static final class C107009c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f320349d;

        /* renamed from: e */
        public final /* synthetic */ C107007b f320350e;

        /* renamed from: f */
        public final /* synthetic */ C111389d f320351f;

        /* renamed from: g */
        public final /* synthetic */ C111406s f320352g;

        /* renamed from: d80.b$c$a */
        public static final class C107010a implements Preview.SurfaceProvider {

            /* renamed from: a */
            public final /* synthetic */ C111406s f320353a;

            /* renamed from: b */
            public final /* synthetic */ C107007b f320354b;

            /* renamed from: c */
            public final /* synthetic */ C111389d f320355c;

            @C91590f(mo125468c = "com.tencent.mm.media.camera.instance.camerax.CameraXImpl$buildCameraUsage$2$1$1", mo125469f = "CameraXImpl.kt", mo125470l = {165}, mo125471m = "invokeSuspend")
            /* renamed from: d80.b$c$a$a */
            public static final class C107011a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

                /* renamed from: d */
                public int f320356d;

                /* renamed from: e */
                public final /* synthetic */ SurfaceRequest f320357e;

                /* renamed from: f */
                public final /* synthetic */ C107007b f320358f;

                /* renamed from: g */
                public final /* synthetic */ C111389d f320359g;

                /* renamed from: h */
                public final /* synthetic */ C111406s f320360h;

                @C91590f(mo125468c = "com.tencent.mm.media.camera.instance.camerax.CameraXImpl$buildCameraUsage$2$1$1$1", mo125469f = "CameraXImpl.kt", mo125470l = {167, 168, 169}, mo125471m = "invokeSuspend")
                /* renamed from: d80.b$c$a$a$a */
                public static final class C107012a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

                    /* renamed from: d */
                    public int f320361d;

                    /* renamed from: e */
                    public final /* synthetic */ SurfaceRequest f320362e;

                    /* renamed from: f */
                    public final /* synthetic */ C107007b f320363f;

                    /* renamed from: g */
                    public final /* synthetic */ C111389d f320364g;

                    /* renamed from: h */
                    public final /* synthetic */ C111406s f320365h;

                    /* renamed from: d80.b$c$a$a$a$a */
                    public static final class C107013a<T> implements C86165a {

                        /* renamed from: a */
                        public final /* synthetic */ C111406s f320366a;

                        /* renamed from: b */
                        public final /* synthetic */ C107007b f320367b;

                        public C107013a(C111406s sVar, C107007b bVar) {
                            this.f320366a = sVar;
                            this.f320367b = bVar;
                        }

                        public void accept(Object obj) {
                            Log.m105924i("MicroMsg.Camera.CameraXImpl", "provideSurface result:" + ((SurfaceRequest.Result) obj));
                            this.f320366a.mo163061C("ProvideSurfaceCallback", new C58244d(this.f320367b, (C15601d<? super C58244d>) null));
                        }
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C107012a(SurfaceRequest surfaceRequest, C107007b bVar, C111389d dVar, C111406s sVar, C15601d<? super C107012a> dVar2) {
                        super(2, dVar2);
                        this.f320362e = surfaceRequest;
                        this.f320363f = bVar;
                        this.f320364g = dVar;
                        this.f320365h = sVar;
                    }

                    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                        return new C107012a(this.f320362e, this.f320363f, this.f320364g, this.f320365h, dVar);
                    }

                    public Object invoke(Object obj, Object obj2) {
                        return ((C107012a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a8 A[RETURN] */
                    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ad  */
                    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b5  */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                        /*
                            r8 = this;
                            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                            int r1 = r8.f320361d
                            r2 = 0
                            java.lang.String r3 = "MicroMsg.Camera.CameraXImpl"
                            r4 = 3
                            r5 = 2
                            r6 = 1
                            if (r1 == 0) goto L_0x0027
                            if (r1 == r6) goto L_0x0023
                            if (r1 == r5) goto L_0x001f
                            if (r1 != r4) goto L_0x0017
                            kotlin.ResultKt.throwOnFailure(r9)
                            goto L_0x00a9
                        L_0x0017:
                            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r9.<init>(r0)
                            throw r9
                        L_0x001f:
                            kotlin.ResultKt.throwOnFailure(r9)
                            goto L_0x0094
                        L_0x0023:
                            kotlin.ResultKt.throwOnFailure(r9)
                            goto L_0x0086
                        L_0x0027:
                            kotlin.ResultKt.throwOnFailure(r9)
                            java.lang.StringBuilder r9 = new java.lang.StringBuilder
                            r9.<init>()
                            java.lang.String r1 = "onSurfaceRequested:"
                            r9.append(r1)
                            androidx.camera.core.SurfaceRequest r1 = r8.f320362e
                            android.util.Size r1 = r1.getResolution()
                            r9.append(r1)
                            java.lang.String r1 = " rotate:"
                            r9.append(r1)
                            d80.b r1 = r8.f320363f
                            androidx.camera.core.Preview r1 = r1.f320338w
                            if (r1 == 0) goto L_0x0052
                            int r1 = r1.getTargetRotation()
                            java.lang.Integer r7 = new java.lang.Integer
                            r7.<init>(r1)
                            goto L_0x0053
                        L_0x0052:
                            r7 = r2
                        L_0x0053:
                            r9.append(r7)
                            java.lang.String r9 = r9.toString()
                            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r9)
                            v70.d r9 = r8.f320364g
                            androidx.camera.core.SurfaceRequest r1 = r8.f320362e
                            android.util.Size r1 = r1.getResolution()
                            int r1 = r1.getWidth()
                            androidx.camera.core.SurfaceRequest r7 = r8.f320362e
                            android.util.Size r7 = r7.getResolution()
                            int r7 = r7.getHeight()
                            r8.f320361d = r6
                            r9.getClass()
                            v70.q r6 = new v70.q
                            r6.<init>(r9, r1, r7, r2)
                            java.lang.String r1 = "updateInputSize"
                            java.lang.Object r9 = r9.mo163058p(r1, r6, r8)
                            if (r9 != r0) goto L_0x0086
                            return r0
                        L_0x0086:
                            d80.b r9 = r8.f320363f
                            r8.f320361d = r5
                            r9.getClass()
                            java.lang.Object r9 = a80.C103320a.m136822G(r9, r8)
                            if (r9 != r0) goto L_0x0094
                            return r0
                        L_0x0094:
                            v70.d r9 = r8.f320364g
                            r8.f320361d = r4
                            r9.getClass()
                            v70.h r1 = new v70.h
                            r1.<init>(r9, r2)
                            java.lang.String r2 = "getGlInputSurface"
                            java.lang.Object r9 = r9.mo163058p(r2, r1, r8)
                            if (r9 != r0) goto L_0x00a9
                            return r0
                        L_0x00a9:
                            android.view.Surface r9 = (android.view.Surface) r9
                            if (r9 != 0) goto L_0x00b5
                            java.lang.String r9 = "getGLInputSurface error"
                            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r9)
                            rx3.b0 r9 = rx3.C13598b0.f38549a
                            return r9
                        L_0x00b5:
                            androidx.camera.core.SurfaceRequest r0 = r8.f320362e
                            v70.s r1 = r8.f320365h
                            d80.b$c$a$a$a$a r2 = new d80.b$c$a$a$a$a
                            d80.b r3 = r8.f320363f
                            r2.<init>(r1, r3)
                            r0.provideSurface(r9, r1, r2)
                            rx3.b0 r9 = rx3.C13598b0.f38549a
                            return r9
                        */
                        throw new UnsupportedOperationException("Method not decompiled: d80.C107007b.C107009c.C107010a.C107011a.C107012a.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C107011a(SurfaceRequest surfaceRequest, C107007b bVar, C111389d dVar, C111406s sVar, C15601d<? super C107011a> dVar2) {
                    super(2, dVar2);
                    this.f320357e = surfaceRequest;
                    this.f320358f = bVar;
                    this.f320359g = dVar;
                    this.f320360h = sVar;
                }

                public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                    return new C107011a(this.f320357e, this.f320358f, this.f320359g, this.f320360h, dVar);
                }

                public Object invoke(Object obj, Object obj2) {
                    return ((C107011a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                }

                public final Object invokeSuspend(Object obj) {
                    C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                    int i = this.f320356d;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        C53896h0 h0Var = C53872d1.f151117a;
                        C53915k2 k2Var = C58901s.f168555a;
                        C107012a aVar2 = new C107012a(this.f320357e, this.f320358f, this.f320359g, this.f320360h, (C15601d<? super C107012a>) null);
                        this.f320356d = 1;
                        if (C53895h.m60469g(k2Var, aVar2, this) == aVar) {
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

            public C107010a(C111406s sVar, C107007b bVar, C111389d dVar) {
                this.f320353a = sVar;
                this.f320354b = bVar;
                this.f320355c = dVar;
            }

            public final void onSurfaceRequested(SurfaceRequest surfaceRequest) {
                C87412m.m108594g(surfaceRequest, "request");
                C111406s sVar = this.f320353a;
                sVar.mo163061C("SurfaceProviderCallback", new C107011a(surfaceRequest, this.f320354b, this.f320355c, sVar, (C15601d<? super C107011a>) null));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107009c(C107007b bVar, C111389d dVar, C111406s sVar, C15601d<? super C107009c> dVar2) {
            super(2, dVar2);
            this.f320350e = bVar;
            this.f320351f = dVar;
            this.f320352g = sVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C107009c(this.f320350e, this.f320351f, this.f320352g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C107009c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v19, resolved type: android.util.Size} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:100:0x0262  */
        /* JADX WARNING: Removed duplicated region for block: B:101:0x0280  */
        /* JADX WARNING: Removed duplicated region for block: B:104:0x02a3  */
        /* JADX WARNING: Removed duplicated region for block: B:107:0x02ac  */
        /* JADX WARNING: Removed duplicated region for block: B:110:0x02d3  */
        /* JADX WARNING: Removed duplicated region for block: B:112:0x02d7 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:97:0x0207  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                r17 = this;
                r0 = r17
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r0.f320349d
                r3 = 1
                if (r2 == 0) goto L_0x0018
                if (r2 != r3) goto L_0x0010
                kotlin.ResultKt.throwOnFailure(r18)
                goto L_0x02d8
            L_0x0010:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0018:
                kotlin.ResultKt.throwOnFailure(r18)
                java.lang.String r2 = "MicroMsg.Camera.CameraXImpl"
                java.lang.String r4 = "buildCameraUsage switch context finish"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
                d80.b r4 = r0.f320350e
                androidx.camera.core.Preview r4 = r4.f320338w
                r5 = 0
                if (r4 == 0) goto L_0x002c
                r4.setSurfaceProvider(r5)
            L_0x002c:
                v70.d r4 = r0.f320351f
                e80.j r4 = r4.f333482j
                e80.i r4 = r4.f320922a
                r4.getClass()
                android.util.Size r6 = new android.util.Size
                int r7 = r4.f320920a
                int r4 = r4.f320921b
                r6.<init>(r7, r4)
                d80.b r4 = r0.f320350e
                e80.b r4 = r4.f304630i
                if (r4 == 0) goto L_0x0047
                int r7 = r4.f320901b
                goto L_0x0048
            L_0x0047:
                r7 = -1
            L_0x0048:
                r8 = 500(0x1f4, float:7.0E-43)
                if (r7 <= r8) goto L_0x005f
                if (r4 == 0) goto L_0x0056
                int r4 = r4.f320901b
                java.lang.Integer r7 = new java.lang.Integer
                r7.<init>(r4)
                goto L_0x0057
            L_0x0056:
                r7 = r5
            L_0x0057:
                gy3.C87412m.m108591d(r7)
                int r4 = r7.intValue()
                goto L_0x0061
            L_0x005f:
                r4 = 2600(0xa28, float:3.643E-42)
            L_0x0061:
                d80.b r7 = r0.f320350e
                androidx.camera.lifecycle.ProcessCameraProvider r9 = r7.f320333r
                e80.c r7 = r7.f304631j
                boolean r7 = r7.f320908c
                int r10 = r6.getWidth()
                int r11 = r6.getHeight()
                r12 = 0
                if (r9 == 0) goto L_0x01ff
                java.util.List r9 = r9.getAvailableCameraInfos()
                if (r9 != 0) goto L_0x007c
                goto L_0x01ff
            L_0x007c:
                java.util.ArrayList r9 = (java.util.ArrayList) r9
                java.util.Iterator r9 = r9.iterator()
            L_0x0082:
                boolean r13 = r9.hasNext()
                if (r13 == 0) goto L_0x00b1
                java.lang.Object r13 = r9.next()
                r14 = r13
                androidx.camera.core.CameraInfo r14 = (androidx.camera.core.CameraInfo) r14
                boolean r15 = r14 instanceof androidx.camera.camera2.internal.Camera2CameraInfoImpl
                if (r15 != 0) goto L_0x0094
                goto L_0x00ad
            L_0x0094:
                androidx.camera.camera2.internal.Camera2CameraInfoImpl r14 = (androidx.camera.camera2.internal.Camera2CameraInfoImpl) r14
                androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r14 = r14.getCameraCharacteristicsCompat()
                android.hardware.camera2.CameraCharacteristics$Key r15 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
                java.lang.Object r14 = r14.get(r15)
                java.lang.Integer r14 = (java.lang.Integer) r14
                if (r14 != 0) goto L_0x00a5
                goto L_0x00ad
            L_0x00a5:
                int r14 = r14.intValue()
                if (r14 != r7) goto L_0x00ad
                r14 = 1
                goto L_0x00ae
            L_0x00ad:
                r14 = 0
            L_0x00ae:
                if (r14 == 0) goto L_0x0082
                goto L_0x00b2
            L_0x00b1:
                r13 = r5
            L_0x00b2:
                androidx.camera.core.CameraInfo r13 = (androidx.camera.core.CameraInfo) r13
                if (r13 != 0) goto L_0x00bd
                java.lang.String r4 = "selectInfo is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r4)
                goto L_0x0204
            L_0x00bd:
                boolean r7 = r13 instanceof androidx.camera.camera2.internal.Camera2CameraInfoImpl
                if (r7 != 0) goto L_0x00c3
                goto L_0x0204
            L_0x00c3:
                androidx.camera.camera2.internal.Camera2CameraInfoImpl r13 = (androidx.camera.camera2.internal.Camera2CameraInfoImpl) r13
                androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r7 = r13.getCameraCharacteristicsCompat()
                android.hardware.camera2.CameraCharacteristics$Key r9 = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP
                java.lang.Object r7 = r7.get(r9)
                android.hardware.camera2.params.StreamConfigurationMap r7 = (android.hardware.camera2.params.StreamConfigurationMap) r7
                if (r7 != 0) goto L_0x00d5
                goto L_0x0204
            L_0x00d5:
                r9 = 34
                int r14 = android.os.Build.VERSION.SDK_INT
                r15 = 23
                if (r14 >= r15) goto L_0x00e4
                java.lang.Class<android.graphics.SurfaceTexture> r9 = android.graphics.SurfaceTexture.class
                android.util.Size[] r9 = r7.getOutputSizes(r9)
                goto L_0x00e8
            L_0x00e4:
                android.util.Size[] r9 = r7.getOutputSizes(r9)
            L_0x00e8:
                java.lang.String r14 = "previewSizes"
                gy3.C87412m.m108593f(r9, r14)
                int r14 = r9.length
                if (r14 != 0) goto L_0x00f2
                r14 = 1
                goto L_0x00f3
            L_0x00f2:
                r14 = 0
            L_0x00f3:
                if (r14 == 0) goto L_0x00f7
                goto L_0x0204
            L_0x00f7:
                android.util.Size[] r14 = new android.util.Size[r12]
                y70.a r15 = y70.C38971a.f104993a
                int r15 = r15.mo61853a()
                r3 = 2
                if (r15 != r3) goto L_0x010d
                r3 = 256(0x100, float:3.59E-43)
                android.util.Size[] r14 = r7.getOutputSizes(r3)
                java.lang.String r3 = "resolutionMap.getOutputSizes(ImageFormat.JPEG)"
                gy3.C87412m.m108593f(r14, r3)
            L_0x010d:
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                int r7 = r14.length
                if (r7 != 0) goto L_0x0117
                r7 = 1
                goto L_0x0118
            L_0x0117:
                r7 = 0
            L_0x0118:
                if (r7 == 0) goto L_0x011e
                sx3.C64175a0.m75509q(r3, r9)
                goto L_0x0131
            L_0x011e:
                int r7 = r9.length
                r15 = 0
            L_0x0120:
                if (r15 >= r7) goto L_0x0131
                r12 = r9[r15]
                boolean r16 = sx3.C110823p.m151009y(r14, r12)
                if (r16 == 0) goto L_0x012d
                r3.add(r12)
            L_0x012d:
                int r15 = r15 + 1
                r12 = 0
                goto L_0x0120
            L_0x0131:
                int r7 = java.lang.Math.max(r11, r10)
                float r7 = (float) r7
                r9 = 1065353216(0x3f800000, float:1.0)
                float r7 = r7 * r9
                int r9 = java.lang.Math.min(r11, r10)
                float r9 = (float) r9
                float r7 = r7 / r9
                d80.f r9 = new d80.f
                r9.<init>(r7)
                sx3.C77813z.m93909o(r3, r9)
                java.util.Iterator r7 = r3.iterator()
                r9 = 0
            L_0x014d:
                boolean r10 = r7.hasNext()
                if (r10 == 0) goto L_0x017f
                java.lang.Object r10 = r7.next()
                int r11 = r9 + 1
                if (r9 < 0) goto L_0x017b
                android.util.Size r10 = (android.util.Size) r10
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r14 = "index:"
                r12.append(r14)
                r12.append(r9)
                java.lang.String r9 = " resolution:"
                r12.append(r9)
                r12.append(r10)
                java.lang.String r9 = r12.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r9)
                r9 = r11
                goto L_0x014d
            L_0x017b:
                sx3.C64197v.m75542k()
                throw r5
            L_0x017f:
                java.util.Iterator r7 = r3.iterator()
            L_0x0183:
                boolean r9 = r7.hasNext()
                if (r9 == 0) goto L_0x01b2
                java.lang.Object r9 = r7.next()
                r10 = r9
                android.util.Size r10 = (android.util.Size) r10
                int r11 = r10.getWidth()
                int r12 = r10.getHeight()
                int r11 = java.lang.Math.min(r11, r12)
                if (r11 <= r8) goto L_0x01ae
                int r11 = r10.getWidth()
                int r10 = r10.getHeight()
                int r10 = java.lang.Math.max(r11, r10)
                if (r10 > r4) goto L_0x01ae
                r10 = 1
                goto L_0x01af
            L_0x01ae:
                r10 = 0
            L_0x01af:
                if (r10 == 0) goto L_0x0183
                goto L_0x01b3
            L_0x01b2:
                r9 = r5
            L_0x01b3:
                android.util.Size r9 = (android.util.Size) r9
                if (r9 != 0) goto L_0x01be
                java.lang.Object r3 = sx3.C110818d0.m150914L(r3)
                r9 = r3
                android.util.Size r9 = (android.util.Size) r9
            L_0x01be:
                androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r3 = r13.getCameraCharacteristicsCompat()
                android.hardware.camera2.CameraCharacteristics$Key r4 = android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION
                java.lang.Object r3 = r3.get(r4)
                java.lang.Integer r3 = (java.lang.Integer) r3
                if (r3 != 0) goto L_0x01d1
                r4 = 0
                java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            L_0x01d1:
                int r3 = r3.intValue()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r7 = "calculatePreviewResolution result:"
                r4.append(r7)
                r4.append(r9)
                java.lang.String r7 = " rotation:"
                r4.append(r7)
                r4.append(r3)
                java.lang.String r3 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
                android.util.Size r3 = new android.util.Size
                int r4 = r9.getHeight()
                int r7 = r9.getWidth()
                r3.<init>(r4, r7)
                goto L_0x0205
            L_0x01ff:
                java.lang.String r3 = "availableCameraInfos is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            L_0x0204:
                r3 = r5
            L_0x0205:
                if (r3 != 0) goto L_0x0208
                r3 = r6
            L_0x0208:
                d80.b r4 = r0.f320350e
                androidx.camera.core.Preview$Builder r7 = new androidx.camera.core.Preview$Builder
                r7.<init>()
                android.util.Size r8 = d80.C107007b.f320329C
                androidx.camera.core.Preview$Builder r7 = r7.setMaxResolution((android.util.Size) r8)
                androidx.camera.core.Preview$Builder r7 = r7.setTargetResolution((android.util.Size) r3)
                r9 = 0
                androidx.camera.core.Preview$Builder r7 = r7.setTargetRotation((int) r9)
                androidx.camera.core.Preview r7 = r7.build()
                r4.f320338w = r7
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r7 = "imageResolution "
                r4.append(r7)
                r4.append(r3)
                java.lang.String r4 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
                d80.b r4 = r0.f320350e
                androidx.camera.core.ImageCapture$Builder r7 = new androidx.camera.core.ImageCapture$Builder
                r7.<init>()
                androidx.camera.core.ImageCapture$Builder r7 = r7.setMaxResolution((android.util.Size) r8)
                androidx.camera.core.ImageCapture$Builder r7 = r7.setTargetResolution((android.util.Size) r3)
                r8 = 0
                androidx.camera.core.ImageCapture$Builder r7 = r7.setTargetRotation((int) r8)
                r8 = 100
                androidx.camera.core.ImageCapture$Builder r7 = r7.setJpegQuality(r8)
                androidx.camera.core.ImageCapture r7 = r7.build()
                r4.f320337v = r7
                int r4 = r3.getWidth()
                int r3 = r3.getHeight()
                if (r4 <= r3) goto L_0x0280
                android.util.Rational r3 = new android.util.Rational
                int r4 = r6.getWidth()
                int r7 = r6.getHeight()
                int r4 = java.lang.Math.max(r4, r7)
                int r7 = r6.getWidth()
                int r6 = r6.getHeight()
                int r6 = java.lang.Math.min(r7, r6)
                r3.<init>(r4, r6)
                goto L_0x029d
            L_0x0280:
                android.util.Rational r3 = new android.util.Rational
                int r4 = r6.getWidth()
                int r7 = r6.getHeight()
                int r4 = java.lang.Math.min(r4, r7)
                int r7 = r6.getWidth()
                int r6 = r6.getHeight()
                int r6 = java.lang.Math.max(r7, r6)
                r3.<init>(r4, r6)
            L_0x029d:
                d80.b r4 = r0.f320350e
                androidx.camera.core.ImageCapture r4 = r4.f320337v
                if (r4 == 0) goto L_0x02a6
                r4.setCropAspectRatio(r3)
            L_0x02a6:
                d80.b r3 = r0.f320350e
                androidx.camera.core.Preview r4 = r3.f320338w
                if (r4 == 0) goto L_0x02b8
                v70.s r6 = r0.f320352g
                d80.b$c$a r7 = new d80.b$c$a
                v70.d r8 = r0.f320351f
                r7.<init>(r6, r3, r8)
                r4.setSurfaceProvider(r6, r7)
            L_0x02b8:
                d80.b r3 = r0.f320350e
                r4 = 1
                r0.f320349d = r4
                r3.getClass()
                java.lang.String r4 = "bindCameraUseCases"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
                w70.a r2 = w70.C111737a.f334621a
                d80.c r4 = new d80.c
                r4.<init>(r3, r5)
                java.lang.Object r2 = r2.mo163452a(r4, r0)
                if (r2 != r1) goto L_0x02d3
                goto L_0x02d5
            L_0x02d3:
                rx3.b0 r2 = rx3.C13598b0.f38549a
            L_0x02d5:
                if (r2 != r1) goto L_0x02d8
                return r1
            L_0x02d8:
                d80.b r1 = r0.f320350e
                android.util.Size r2 = d80.C107007b.f320329C
                boolean r2 = r1.f304634p
                r1.mo143124i(r2)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: d80.C107007b.C107009c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: d80.b$d */
    public static final class C107014d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C112608f<FocusMeteringResult> f320368d;

        public C107014d(C112608f<FocusMeteringResult> fVar) {
            this.f320368d = fVar;
        }

        public final void run() {
            try {
                Futures.getDone(this.f320368d);
            } catch (ExecutionException e) {
                Log.m105924i("MicroMsg.Camera.CameraXImpl", "focusOn error:" + e.getCause());
            } catch (RuntimeException e2) {
                Log.m105924i("MicroMsg.Camera.CameraXImpl", "focusOn error:" + e2);
            } catch (Error e3) {
                Log.m105924i("MicroMsg.Camera.CameraXImpl", "focusOn error:" + e3);
            }
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.media.camera.instance.camerax.CameraXImpl", mo125469f = "CameraXImpl.kt", mo125470l = {83, 85, 87}, mo125471m = "setup")
    /* renamed from: d80.b$e */
    public static final class C107015e extends C66704d {

        /* renamed from: d */
        public Object f320369d;

        /* renamed from: e */
        public Object f320370e;

        /* renamed from: f */
        public Object f320371f;

        /* renamed from: g */
        public /* synthetic */ Object f320372g;

        /* renamed from: h */
        public final /* synthetic */ C107007b f320373h;

        /* renamed from: i */
        public int f320374i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107015e(C107007b bVar, C15601d<? super C107015e> dVar) {
            super(dVar);
            this.f320373h = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f320372g = obj;
            this.f320374i |= Integer.MIN_VALUE;
            return this.f320373h.mo143107l((Context) null, (C0125s) null, (C111389d) null, (C111406s) null, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.media.camera.instance.camerax.CameraXImpl", mo125469f = "CameraXImpl.kt", mo125470l = {108, 109, 111}, mo125471m = "startPreview")
    /* renamed from: d80.b$f */
    public static final class C107016f extends C66704d {

        /* renamed from: d */
        public Object f320375d;

        /* renamed from: e */
        public Object f320376e;

        /* renamed from: f */
        public /* synthetic */ Object f320377f;

        /* renamed from: g */
        public final /* synthetic */ C107007b f320378g;

        /* renamed from: h */
        public int f320379h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107016f(C107007b bVar, C15601d<? super C107016f> dVar) {
            super(dVar);
            this.f320378g = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f320377f = obj;
            this.f320379h |= Integer.MIN_VALUE;
            return this.f320378g.mo143112q((Boolean) null, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.media.camera.instance.camerax.CameraXImpl", mo125469f = "CameraXImpl.kt", mo125470l = {281}, mo125471m = "switchCamera")
    /* renamed from: d80.b$g */
    public static final class C107017g extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f320380d;

        /* renamed from: e */
        public final /* synthetic */ C107007b f320381e;

        /* renamed from: f */
        public int f320382f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107017g(C107007b bVar, C15601d<? super C107017g> dVar) {
            super(dVar);
            this.f320381e = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f320380d = obj;
            this.f320382f |= Integer.MIN_VALUE;
            return this.f320381e.mo143129x(this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.media.camera.instance.camerax.CameraXImpl$switchCamera$2", mo125469f = "CameraXImpl.kt", mo125470l = {283, 289}, mo125471m = "invokeSuspend")
    /* renamed from: d80.b$h */
    public static final class C107018h extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f320383d;

        /* renamed from: e */
        public final /* synthetic */ C107007b f320384e;

        @C91590f(mo125468c = "com.tencent.mm.media.camera.instance.camerax.CameraXImpl$switchCamera$2$1", mo125469f = "CameraXImpl.kt", mo125470l = {285, 286}, mo125471m = "invokeSuspend")
        /* renamed from: d80.b$h$a */
        public static final class C107019a extends C91594j implements C32226l<C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f320385d;

            /* renamed from: e */
            public final /* synthetic */ C107007b f320386e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C107019a(C107007b bVar, C15601d<? super C107019a> dVar) {
                super(1, dVar);
                this.f320386e = bVar;
            }

            public final C15601d<C13598b0> create(C15601d<?> dVar) {
                return new C107019a(this.f320386e, dVar);
            }

            public Object invoke(Object obj) {
                return ((C107019a) create((C15601d) obj)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f320385d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C107007b bVar = this.f320386e;
                    Size size = C107007b.f320329C;
                    C111389d dVar = bVar.f304629h;
                    if (dVar != null) {
                        this.f320385d = 1;
                        if (dVar.mo163054g(this) == aVar) {
                            return aVar;
                        }
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    C13598b0 b0Var = (C13598b0) obj;
                    return C13598b0.f38549a;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C107007b bVar2 = this.f320386e;
                Size size2 = C107007b.f320329C;
                C111389d dVar2 = bVar2.f304629h;
                if (dVar2 != null) {
                    this.f320385d = 2;
                    obj = dVar2.mo163059q(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    C13598b0 b0Var2 = (C13598b0) obj;
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107018h(C107007b bVar, C15601d<? super C107018h> dVar) {
            super(2, dVar);
            this.f320384e = bVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C107018h(this.f320384e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C107018h) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x004e A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r4.f320383d
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x001c
                if (r1 == r3) goto L_0x0018
                if (r1 != r2) goto L_0x0010
                kotlin.ResultKt.throwOnFailure(r5)
                goto L_0x004f
            L_0x0010:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L_0x0018:
                kotlin.ResultKt.throwOnFailure(r5)
                goto L_0x0036
            L_0x001c:
                kotlin.ResultKt.throwOnFailure(r5)
                d80.b r5 = r4.f320384e
                e80.c r1 = r5.f304631j
                boolean r1 = r1.f320911f
                if (r1 == 0) goto L_0x0042
                android.util.Size r1 = d80.C107007b.f320329C
                v70.d r5 = r5.f304629h
                if (r5 == 0) goto L_0x0038
                r4.f320383d = r3
                java.lang.Object r5 = r5.mo163056j(r4)
                if (r5 != r0) goto L_0x0036
                return r0
            L_0x0036:
                rx3.b0 r5 = (rx3.C13598b0) r5
            L_0x0038:
                d80.b r5 = r4.f320384e
                d80.b$h$a r1 = new d80.b$h$a
                r3 = 0
                r1.<init>(r5, r3)
                r5.f320331B = r1
            L_0x0042:
                d80.b r5 = r4.f320384e
                r4.f320383d = r2
                android.util.Size r1 = d80.C107007b.f320329C
                java.lang.Object r5 = r5.mo157452J(r4)
                if (r5 != r0) goto L_0x004f
                return r0
            L_0x004f:
                rx3.b0 r5 = rx3.C13598b0.f38549a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: d80.C107007b.C107018h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.media.camera.instance.camerax.CameraXImpl", mo125469f = "CameraXImpl.kt", mo125470l = {296, 306, 368}, mo125471m = "takePictureAsync")
    /* renamed from: d80.b$i */
    public static final class C107020i extends C66704d {

        /* renamed from: d */
        public Object f320387d;

        /* renamed from: e */
        public Object f320388e;

        /* renamed from: f */
        public long f320389f;

        /* renamed from: g */
        public /* synthetic */ Object f320390g;

        /* renamed from: h */
        public final /* synthetic */ C107007b f320391h;

        /* renamed from: i */
        public int f320392i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107020i(C107007b bVar, C15601d<? super C107020i> dVar) {
            super(dVar);
            this.f320391h = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f320390g = obj;
            this.f320392i |= Integer.MIN_VALUE;
            return this.f320391h.mo143114s(0, 0, 0, false, this);
        }
    }

    /* renamed from: d80.b$j */
    public static final class C107021j extends ImageCapture.OnImageCapturedCallback {

        /* renamed from: a */
        public final /* synthetic */ C107007b f320393a;

        /* renamed from: b */
        public final /* synthetic */ long f320394b;

        /* renamed from: c */
        public final /* synthetic */ int f320395c;

        /* renamed from: d */
        public final /* synthetic */ int f320396d;

        /* renamed from: e */
        public final /* synthetic */ int f320397e;

        /* renamed from: f */
        public final /* synthetic */ C15601d<Bitmap> f320398f;

        public C107021j(C107007b bVar, long j, int i, int i2, int i3, C15601d<? super Bitmap> dVar) {
            this.f320393a = bVar;
            this.f320394b = j;
            this.f320395c = i;
            this.f320396d = i2;
            this.f320397e = i3;
            this.f320398f = dVar;
        }

        public void onCaptureSuccess(ImageProxy imageProxy) {
            C87412m.m108594g(imageProxy, "image");
            C108171a aVar = C108171a.f323903a;
            int i = this.f320393a.f304625d;
            int width = imageProxy.getWidth();
            int height = imageProxy.getHeight();
            CameraReportStruct a = aVar.mo158577a(i);
            if (a != null) {
                a.f310106y = width;
                a.f310107z = height;
            }
            Rect cropRect = imageProxy.getCropRect();
            C87412m.m108593f(cropRect, "image.cropRect");
            ByteBuffer buffer = imageProxy.getPlanes()[0].getBuffer();
            C87412m.m108593f(buffer, "planes[0].buffer");
            buffer.rewind();
            int capacity = buffer.capacity();
            byte[] bArr = new byte[capacity];
            buffer.get(bArr);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, capacity);
            C87412m.m108593f(decodeByteArray, "decodeByteArray(bytes, 0, bytes.size)");
            Bitmap cropBitmap = BitmapUtil.cropBitmap(decodeByteArray, cropRect.left, cropRect.top, cropRect.width(), cropRect.height(), false);
            int rotationDegrees = imageProxy.getImageInfo().getRotationDegrees();
            Log.m105924i("MicroMsg.Camera.CameraXImpl", "takePictureAsync from imageCapture cost:" + (System.currentTimeMillis() - this.f320394b) + " size:[" + cropBitmap.getWidth() + ' ' + cropBitmap.getHeight() + "] screen rotation:" + this.f320395c + " imageDegree:" + rotationDegrees);
            C107007b bVar = this.f320393a;
            int i2 = this.f320396d;
            int i3 = this.f320397e;
            int i4 = this.f320395c + rotationDegrees;
            Integer num = null;
            boolean z = bVar.f304631j.f320908c;
            bVar.getClass();
            Bitmap f = bVar.mo143104f(i2, i3, i4, cropBitmap, z ^ true);
            imageProxy.close();
            long currentTimeMillis = System.currentTimeMillis() - this.f320394b;
            StringBuilder sb = new StringBuilder();
            sb.append("takePictureAsync total cost:");
            sb.append(currentTimeMillis);
            sb.append(" size:[");
            sb.append(f != null ? Integer.valueOf(f.getWidth()) : null);
            sb.append(' ');
            if (f != null) {
                num = Integer.valueOf(f.getHeight());
            }
            sb.append(num);
            sb.append(']');
            Log.m105924i("MicroMsg.Camera.CameraXImpl", sb.toString());
            CameraReportStruct a2 = aVar.mo158577a(this.f320393a.f304625d);
            if (a2 != null) {
                a2.f310102u = currentTimeMillis;
            }
            CameraReportStruct a3 = aVar.mo158577a(this.f320393a.f304625d);
            if (a3 != null) {
                a3.f310081X = (long) 1;
            }
            this.f320398f.resumeWith(Result.m168114constructorimpl(f));
        }

        public void onError(ImageCaptureException imageCaptureException) {
            C87412m.m108594g(imageCaptureException, "exception");
            super.onError(imageCaptureException);
            Log.m105920e("MicroMsg.Camera.CameraXImpl", "takePictureAsync from imageCapture happen error:" + imageCaptureException + " cost:" + (System.currentTimeMillis() - this.f320394b));
            CameraReportStruct a = C108171a.f323903a.mo158577a(this.f320393a.f304625d);
            if (a != null) {
                a.f310081X = (long) 1;
            }
            this.f320398f.resumeWith(Result.m168114constructorimpl((Object) null));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107007b(C58087u0<C13604l<C108399b, Bundle>> u0Var, int i) {
        super(i);
        C87412m.m108594g(u0Var, "stateFlow");
        this.f320332q = u0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m144815I(d80.C107007b r11, androidx.camera.core.CameraSelector r12, wx3.C15601d r13) {
        /*
            r11.getClass()
            boolean r0 = r13 instanceof d80.C107023e
            if (r0 == 0) goto L_0x0016
            r0 = r13
            d80.e r0 = (d80.C107023e) r0
            int r1 = r0.f320411i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f320411i = r1
            goto L_0x001b
        L_0x0016:
            d80.e r0 = new d80.e
            r0.<init>(r11, r13)
        L_0x001b:
            java.lang.Object r13 = r0.f320409g
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f320411i
            java.lang.String r3 = "key_ext_night_enable"
            java.lang.String r4 = "key_ext_hdr_enable"
            java.lang.String r5 = "key_ext_bokeh_enable"
            java.lang.String r6 = "key_ext_faceretouch_enable"
            java.lang.String r7 = "key_ext_auto_enable"
            r8 = 1
            if (r2 == 0) goto L_0x0049
            if (r2 != r8) goto L_0x0041
            java.lang.Object r11 = r0.f320408f
            d80.b r11 = (d80.C107007b) r11
            java.lang.Object r12 = r0.f320407e
            androidx.camera.core.CameraSelector r12 = (androidx.camera.core.CameraSelector) r12
            java.lang.Object r0 = r0.f320406d
            d80.b r0 = (d80.C107007b) r0
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x00ba
        L_0x0041:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0049:
            kotlin.ResultKt.throwOnFailure(r13)
            v70.a r13 = v70.C111386a.f333469a
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r13 = v70.C111386a.f333473e
            r2 = -1
            int r9 = r13.decodeInt(r7, r2)
            if (r9 == r2) goto L_0x00a1
            h80.a r12 = h80.C108171a.f323903a
            int r0 = r11.f304625d
            int r1 = r13.decodeInt(r7, r2)
            com.tencent.mm.autogen.mmdata.rpt.CameraReportStruct r0 = r12.mo158577a(r0)
            if (r0 == 0) goto L_0x0067
            r0.f310072O = r1
        L_0x0067:
            int r0 = r11.f304625d
            int r1 = r13.decodeInt(r6, r2)
            com.tencent.mm.autogen.mmdata.rpt.CameraReportStruct r0 = r12.mo158577a(r0)
            if (r0 == 0) goto L_0x0075
            r0.f310071N = r1
        L_0x0075:
            int r0 = r11.f304625d
            int r1 = r13.decodeInt(r5, r2)
            com.tencent.mm.autogen.mmdata.rpt.CameraReportStruct r0 = r12.mo158577a(r0)
            if (r0 == 0) goto L_0x0083
            r0.f310068K = r1
        L_0x0083:
            int r0 = r11.f304625d
            int r1 = r13.decodeInt(r4, r2)
            com.tencent.mm.autogen.mmdata.rpt.CameraReportStruct r0 = r12.mo158577a(r0)
            if (r0 == 0) goto L_0x0091
            r0.f310069L = r1
        L_0x0091:
            int r11 = r11.f304625d
            int r13 = r13.decodeInt(r3, r2)
            com.tencent.mm.autogen.mmdata.rpt.CameraReportStruct r11 = r12.mo158577a(r11)
            if (r11 == 0) goto L_0x01a7
            r11.f310070M = r13
            goto L_0x01a7
        L_0x00a1:
            androidx.camera.extensions.ExtensionsManager r13 = r11.f320334s
            if (r13 != 0) goto L_0x00c9
            z8.f<androidx.camera.extensions.ExtensionsManager> r13 = r11.f320336u
            if (r13 == 0) goto L_0x00bd
            r0.f320406d = r11
            r0.f320407e = r12
            r0.f320408f = r11
            r0.f320411i = r8
            java.lang.Object r13 = p202m2.C109472d.m148692a(r13, r0)
            if (r13 != r1) goto L_0x00b9
            goto L_0x01a9
        L_0x00b9:
            r0 = r11
        L_0x00ba:
            androidx.camera.extensions.ExtensionsManager r13 = (androidx.camera.extensions.ExtensionsManager) r13
            goto L_0x00bf
        L_0x00bd:
            r13 = 0
            r0 = r11
        L_0x00bf:
            r11.f320334s = r13
            java.lang.String r11 = "MicroMsg.Camera.CameraXImpl"
            java.lang.String r13 = "buildCameraUsage await extensionsManager init"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r13)
            r11 = r0
        L_0x00c9:
            r13 = 5
            int r13 = r11.mo157453K(r12, r13)
            r0 = 4
            int r0 = r11.mo157453K(r12, r0)
            r1 = 3
            int r1 = r11.mo157453K(r12, r1)
            r2 = 2
            int r2 = r11.mo157453K(r12, r2)
            int r12 = r11.mo157453K(r12, r8)
            h80.a r9 = h80.C108171a.f323903a
            int r10 = r11.f304625d
            com.tencent.mm.autogen.mmdata.rpt.CameraReportStruct r10 = r9.mo158577a(r10)
            if (r10 == 0) goto L_0x00ed
            r10.f310072O = r13
        L_0x00ed:
            int r10 = r11.f304625d
            com.tencent.mm.autogen.mmdata.rpt.CameraReportStruct r10 = r9.mo158577a(r10)
            if (r10 == 0) goto L_0x00f7
            r10.f310071N = r0
        L_0x00f7:
            int r10 = r11.f304625d
            com.tencent.mm.autogen.mmdata.rpt.CameraReportStruct r10 = r9.mo158577a(r10)
            if (r10 == 0) goto L_0x0101
            r10.f310068K = r12
        L_0x0101:
            int r10 = r11.f304625d
            com.tencent.mm.autogen.mmdata.rpt.CameraReportStruct r10 = r9.mo158577a(r10)
            if (r10 == 0) goto L_0x010b
            r10.f310069L = r2
        L_0x010b:
            int r11 = r11.f304625d
            com.tencent.mm.autogen.mmdata.rpt.CameraReportStruct r11 = r9.mo158577a(r11)
            if (r11 == 0) goto L_0x0115
            r11.f310070M = r1
        L_0x0115:
            v70.a r11 = v70.C111386a.f333469a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r9 = "setAutoEnable "
            r11.append(r9)
            r9 = 0
            if (r13 != r8) goto L_0x0126
            r10 = 1
            goto L_0x0127
        L_0x0126:
            r10 = 0
        L_0x0127:
            r11.append(r10)
            java.lang.String r11 = r11.toString()
            java.lang.String r10 = "MicroMsg.Camera.CameraKitUtil"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r11)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r11 = v70.C111386a.f333473e
            r11.encode((java.lang.String) r7, (int) r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r7 = "setFacereTouchEnable "
            r13.append(r7)
            if (r0 != r8) goto L_0x0146
            r7 = 1
            goto L_0x0147
        L_0x0146:
            r7 = 0
        L_0x0147:
            r13.append(r7)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r13)
            r11.encode((java.lang.String) r6, (int) r0)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "setNightEnable "
            r13.append(r0)
            if (r1 != r8) goto L_0x0162
            r0 = 1
            goto L_0x0163
        L_0x0162:
            r0 = 0
        L_0x0163:
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r13)
            r11.encode((java.lang.String) r3, (int) r1)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "setHdrEnable "
            r13.append(r0)
            if (r2 != r8) goto L_0x017e
            r0 = 1
            goto L_0x017f
        L_0x017e:
            r0 = 0
        L_0x017f:
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r13)
            r11.encode((java.lang.String) r4, (int) r2)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "setBokehEnable "
            r13.append(r0)
            if (r12 != r8) goto L_0x0199
            goto L_0x019a
        L_0x0199:
            r8 = 0
        L_0x019a:
            r13.append(r8)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r13)
            r11.encode((java.lang.String) r5, (int) r12)
        L_0x01a7:
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x01a9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d80.C107007b.m144815I(d80.b, androidx.camera.core.CameraSelector, wx3.d):java.lang.Object");
    }

    /* renamed from: F */
    public void mo143101F(int i) {
        this.f304631j.f320910e = i;
        C111389d dVar = this.f304629h;
        C87412m.m108591d(dVar);
        C107261i iVar = dVar.f333482j.f320922a;
        C107024g gVar = this.f320340y;
        boolean B = mo143099B();
        gVar.f320412a.mo143119a(B, i, mo143098A().f320920a, mo143098A().f320921b, iVar.f320920a, iVar.f320921b);
        gVar.f320413b.reset();
        gVar.f320413b.setScale(B ? -1.0f : 1.0f, 1.0f);
        gVar.f320413b.setRotate(-((float) i), 0.5f, 0.5f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ac A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo157452J(wx3.C15601d<? super rx3.C13598b0> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof d80.C107007b.C107008b
            if (r0 == 0) goto L_0x0013
            r0 = r10
            d80.b$b r0 = (d80.C107007b.C107008b) r0
            int r1 = r0.f320348j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f320348j = r1
            goto L_0x0018
        L_0x0013:
            d80.b$b r0 = new d80.b$b
            r0.<init>(r9, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f320346h
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f320348j
            r3 = 2
            r4 = 1
            java.lang.String r5 = "MicroMsg.Camera.CameraXImpl"
            r6 = 0
            if (r2 == 0) goto L_0x004a
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x00ad
        L_0x002e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0036:
            java.lang.Object r2 = r0.f320345g
            d80.b r2 = (d80.C107007b) r2
            java.lang.Object r4 = r0.f320344f
            v70.s r4 = (v70.C111406s) r4
            java.lang.Object r7 = r0.f320343e
            v70.d r7 = (v70.C111389d) r7
            java.lang.Object r8 = r0.f320342d
            d80.b r8 = (d80.C107007b) r8
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x007d
        L_0x004a:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.String r10 = "buildCameraUsage"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r10)
            v70.d r7 = r9.f304629h
            if (r7 != 0) goto L_0x0059
            rx3.b0 r10 = rx3.C13598b0.f38549a
            return r10
        L_0x0059:
            v70.s r10 = r9.f304628g
            if (r10 != 0) goto L_0x0060
            rx3.b0 r10 = rx3.C13598b0.f38549a
            return r10
        L_0x0060:
            androidx.camera.lifecycle.ProcessCameraProvider r2 = r9.f320333r
            if (r2 != 0) goto L_0x008d
            z8.f<androidx.camera.lifecycle.ProcessCameraProvider> r2 = r9.f320335t
            if (r2 == 0) goto L_0x0080
            r0.f320342d = r9
            r0.f320343e = r7
            r0.f320344f = r10
            r0.f320345g = r9
            r0.f320348j = r4
            java.lang.Object r2 = p202m2.C109472d.m148692a(r2, r0)
            if (r2 != r1) goto L_0x0079
            return r1
        L_0x0079:
            r8 = r9
            r4 = r10
            r10 = r2
            r2 = r8
        L_0x007d:
            androidx.camera.lifecycle.ProcessCameraProvider r10 = (androidx.camera.lifecycle.ProcessCameraProvider) r10
            goto L_0x0084
        L_0x0080:
            r2 = r9
            r8 = r2
            r4 = r10
            r10 = r6
        L_0x0084:
            r2.f320333r = r10
            java.lang.String r10 = "buildCameraUsage await provider init"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r10)
            r10 = r4
            goto L_0x008e
        L_0x008d:
            r8 = r9
        L_0x008e:
            java.lang.String r2 = "buildCameraUsage switch context start"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            a14.h0 r2 = a14.C53872d1.f151117a
            a14.k2 r2 = f14.C58901s.f168555a
            d80.b$c r4 = new d80.b$c
            r4.<init>(r8, r7, r10, r6)
            r0.f320342d = r6
            r0.f320343e = r6
            r0.f320344f = r6
            r0.f320345g = r6
            r0.f320348j = r3
            java.lang.Object r10 = a14.C53895h.m60469g(r2, r4, r0)
            if (r10 != r1) goto L_0x00ad
            return r1
        L_0x00ad:
            rx3.b0 r10 = rx3.C13598b0.f38549a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: d80.C107007b.mo157452J(wx3.d):java.lang.Object");
    }

    /* renamed from: K */
    public final int mo157453K(CameraSelector cameraSelector, int i) {
        ExtensionsManager extensionsManager = this.f320334s;
        return (extensionsManager == null || !extensionsManager.isExtensionAvailable(cameraSelector, i)) ? 0 : 1;
    }

    /* renamed from: a */
    public void mo143120a() {
        CameraControl cameraControl;
        Camera camera;
        CameraInfo cameraInfo;
        LiveData<ZoomState> zoomState;
        ZoomState value;
        Camera camera2 = this.f320339x;
        if (camera2 != null && (cameraControl = camera2.getCameraControl()) != null && (camera = this.f320339x) != null && (cameraInfo = camera.getCameraInfo()) != null && (zoomState = cameraInfo.getZoomState()) != null && (value = zoomState.getValue()) != null) {
            float maxZoomRatio = value.getMaxZoomRatio();
            ZoomState value2 = zoomState.getValue();
            if (value2 != null) {
                float min = Math.min(maxZoomRatio, value2.getZoomRatio() + 0.15f);
                Log.m105924i("MicroMsg.Camera.CameraXImpl", "onZoomOut current:" + min + " max:" + maxZoomRatio);
                cameraControl.setZoomRatio(min);
            }
        }
    }

    /* renamed from: b */
    public void mo143121b() {
        CameraControl cameraControl;
        Camera camera;
        CameraInfo cameraInfo;
        LiveData<ZoomState> zoomState;
        ZoomState value;
        Camera camera2 = this.f320339x;
        if (camera2 != null && (cameraControl = camera2.getCameraControl()) != null && (camera = this.f320339x) != null && (cameraInfo = camera.getCameraInfo()) != null && (zoomState = cameraInfo.getZoomState()) != null && (value = zoomState.getValue()) != null) {
            float minZoomRatio = value.getMinZoomRatio();
            ZoomState value2 = zoomState.getValue();
            if (value2 != null) {
                float max = Math.max(minZoomRatio, value2.getZoomRatio() - 0.15f);
                Log.m105924i("MicroMsg.Camera.CameraXImpl", "onZoomIn current:" + max + " min:" + minZoomRatio);
                cameraControl.setZoomRatio(max);
            }
        }
    }

    /* renamed from: c */
    public int mo143122c() {
        CameraInfo cameraInfo;
        Camera camera = this.f320339x;
        if (camera == null || (cameraInfo = camera.getCameraInfo()) == null) {
            return 0;
        }
        return cameraInfo.getSensorRotationDegrees();
    }

    /* renamed from: h */
    public void mo143123h(int i) {
        Log.m105924i("MicroMsg.Camera.CameraXImpl", "onReduceExpo >> " + i);
        C107006a aVar = this.f320341z;
        aVar.getClass();
        Log.m105924i("MicroMsg.CameraXExpoHelper", "reduceExpoDuration >> " + i + ", " + aVar.f320324b + ", " + aVar.f320325c);
        Range<Integer> range = aVar.f320325c;
        if (range != null) {
            Integer valueOf = range.contains(Integer.valueOf(aVar.f320324b - i)) ? Integer.valueOf(aVar.f320324b - i) : range.getLower();
            int i2 = aVar.f320324b;
            if (valueOf == null || i2 != valueOf.intValue()) {
                C87412m.m108593f(valueOf, "toDur");
                aVar.f320324b = valueOf.intValue();
                Log.m105924i("MicroMsg.CameraXExpoHelper", "reduce after >> " + aVar.f320324b);
                aVar.mo157451c(aVar.f320324b);
            }
        }
    }

    /* renamed from: i */
    public void mo143124i(boolean z) {
        C107254b bVar = this.f304630i;
        boolean z2 = false;
        int i = 1;
        if (bVar != null && bVar.f320904e) {
            z2 = true;
        }
        Log.m105924i("MicroMsg.Camera.CameraXImpl", "switchFlash >> " + z + ", " + this.f304634p + ", " + mo143099B() + ", " + z2);
        if (z2) {
            this.f304634p = z;
            if (mo143099B()) {
                Log.m105924i("MicroMsg.Camera.CameraXImpl", "switchFlash >> " + z);
                ImageCapture imageCapture = this.f320337v;
                if (imageCapture != null) {
                    if (!z) {
                        i = 2;
                    }
                    imageCapture.setFlashMode(i);
                }
            }
        }
    }

    /* renamed from: j */
    public void mo143125j(int i) {
        Log.m105924i("MicroMsg.Camera.CameraXImpl", "onLargeExpo >> " + i);
        C107006a aVar = this.f320341z;
        aVar.getClass();
        Log.m105924i("MicroMsg.CameraXExpoHelper", "enlargeExpoDuration >> " + i + ", " + aVar.f320324b + ", " + aVar.f320325c);
        Range<Integer> range = aVar.f320325c;
        if (range != null) {
            Integer valueOf = range.contains(Integer.valueOf(aVar.f320324b + i)) ? Integer.valueOf(aVar.f320324b + i) : range.getUpper();
            int i2 = aVar.f320324b;
            if (valueOf == null || valueOf.intValue() != i2) {
                C87412m.m108593f(valueOf, "toDur");
                aVar.f320324b = valueOf.intValue();
                Log.m105924i("MicroMsg.CameraXExpoHelper", "enlarge after >> " + aVar.f320324b);
                aVar.mo157451c(aVar.f320324b);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo143107l(android.content.Context r15, androidx.lifecycle.C0125s r16, v70.C111389d r17, v70.C111406s r18, wx3.C15601d<? super rx3.C13598b0> r19) {
        /*
            r14 = this;
            r6 = r14
            r0 = r19
            boolean r1 = r0 instanceof d80.C107007b.C107015e
            if (r1 == 0) goto L_0x0016
            r1 = r0
            d80.b$e r1 = (d80.C107007b.C107015e) r1
            int r2 = r1.f320374i
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0016
            int r2 = r2 - r3
            r1.f320374i = r2
            goto L_0x001b
        L_0x0016:
            d80.b$e r1 = new d80.b$e
            r1.<init>(r14, r0)
        L_0x001b:
            r7 = r1
            java.lang.Object r0 = r7.f320372g
            xx3.a r8 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r7.f320374i
            java.lang.String r9 = "MicroMsg.Camera.CameraXImpl"
            r10 = 3
            r11 = 2
            r2 = 1
            r12 = 0
            if (r1 == 0) goto L_0x0063
            if (r1 == r2) goto L_0x0055
            if (r1 == r11) goto L_0x0045
            if (r1 != r10) goto L_0x003d
            java.lang.Object r1 = r7.f320370e
            d80.b r1 = (d80.C107007b) r1
            java.lang.Object r2 = r7.f320369d
            d80.b r2 = (d80.C107007b) r2
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x00c2
        L_0x003d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0045:
            java.lang.Object r1 = r7.f320371f
            d80.b r1 = (d80.C107007b) r1
            java.lang.Object r2 = r7.f320370e
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r3 = r7.f320369d
            d80.b r3 = (d80.C107007b) r3
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x009c
        L_0x0055:
            java.lang.Object r1 = r7.f320370e
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r2 = r7.f320369d
            d80.b r2 = (d80.C107007b) r2
            kotlin.ResultKt.throwOnFailure(r0)
            r13 = r1
            r1 = r2
            goto L_0x0083
        L_0x0063:
            kotlin.ResultKt.throwOnFailure(r0)
            java.lang.String r0 = "setup"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            r7.f320369d = r6
            r13 = r15
            r7.f320370e = r13
            r7.f320374i = r2
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r7
            java.lang.Object r0 = super.mo143107l(r1, r2, r3, r4, r5)
            if (r0 != r8) goto L_0x0082
            return r8
        L_0x0082:
            r1 = r6
        L_0x0083:
            z8.f r0 = androidx.camera.lifecycle.ProcessCameraProvider.getInstance(r13)
            r1.f320335t = r0
            if (r0 == 0) goto L_0x00a0
            r7.f320369d = r1
            r7.f320370e = r13
            r7.f320371f = r1
            r7.f320374i = r11
            java.lang.Object r0 = p202m2.C109472d.m148692a(r0, r7)
            if (r0 != r8) goto L_0x009a
            return r8
        L_0x009a:
            r3 = r1
            r2 = r13
        L_0x009c:
            androidx.camera.lifecycle.ProcessCameraProvider r0 = (androidx.camera.lifecycle.ProcessCameraProvider) r0
            r13 = r2
            goto L_0x00a2
        L_0x00a0:
            r3 = r1
            r0 = r12
        L_0x00a2:
            r1.f320333r = r0
            androidx.camera.lifecycle.ProcessCameraProvider r0 = r3.f320333r
            gy3.C87412m.m108591d(r0)
            z8.f r0 = androidx.camera.extensions.ExtensionsManager.getInstanceAsync(r13, r0)
            r3.f320336u = r0
            if (r0 == 0) goto L_0x00c7
            r7.f320369d = r3
            r7.f320370e = r3
            r7.f320371f = r12
            r7.f320374i = r10
            java.lang.Object r0 = p202m2.C109472d.m148692a(r0, r7)
            if (r0 != r8) goto L_0x00c0
            return r8
        L_0x00c0:
            r1 = r3
            r2 = r1
        L_0x00c2:
            r12 = r0
            androidx.camera.extensions.ExtensionsManager r12 = (androidx.camera.extensions.ExtensionsManager) r12
            r3 = r1
            goto L_0x00c8
        L_0x00c7:
            r2 = r3
        L_0x00c8:
            r3.f320334s = r12
            e80.c r0 = r2.f304631j
            e80.a r0 = r0.f320906a
            androidx.camera.lifecycle.ProcessCameraProvider r1 = r2.f320333r
            gy3.C87412m.m108591d(r1)
            java.util.List r1 = r1.getAvailableCameraInfos()
            java.lang.String r3 = "cameraProvider!!.availableCameraInfos"
            gy3.C87412m.m108593f(r1, r3)
            int r1 = r1.size()
            r0.f320897a = r1
            boolean r1 = r2.mo143110o()
            r0.f320899c = r1
            boolean r1 = r2.mo143109n()
            r0.f320898b = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "cameraCount:"
            r1.append(r2)
            int r2 = r0.f320897a
            r1.append(r2)
            java.lang.String r2 = " hasFrontCamera:"
            r1.append(r2)
            boolean r2 = r0.f320899c
            r1.append(r2)
            java.lang.String r2 = " hasBackCamera:"
            r1.append(r2)
            boolean r0 = r0.f320898b
            r1.append(r0)
            r0 = 32
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d80.C107007b.mo143107l(android.content.Context, androidx.lifecycle.s, v70.d, v70.s, wx3.d):java.lang.Object");
    }

    /* renamed from: n */
    public boolean mo143109n() {
        ProcessCameraProvider processCameraProvider = this.f320333r;
        if (processCameraProvider != null) {
            return processCameraProvider.hasCamera(CameraSelector.DEFAULT_BACK_CAMERA);
        }
        return false;
    }

    public boolean needMirror() {
        return mo143099B();
    }

    /* renamed from: o */
    public boolean mo143110o() {
        ProcessCameraProvider processCameraProvider = this.f320333r;
        if (processCameraProvider != null) {
            return processCameraProvider.hasCamera(CameraSelector.DEFAULT_FRONT_CAMERA);
        }
        return false;
    }

    public void onChanged(Object obj) {
        CameraState cameraState = (CameraState) obj;
        C87412m.m108594g(cameraState, "cameraState");
        int i = C20447a.f57465a[cameraState.getType().ordinal()];
        if (i == 1) {
            Log.m105924i("MicroMsg.Camera.CameraXImpl", "CameraState: Pending Open");
        } else if (i == 2) {
            Log.m105924i("MicroMsg.Camera.CameraXImpl", "CameraState: Opening");
        } else if (i == 3) {
            Log.m105924i("MicroMsg.Camera.CameraXImpl", "CameraState: Open");
            C108171a.f323903a.mo158578b(this.f304625d, true);
        } else if (i == 4) {
            Log.m105924i("MicroMsg.Camera.CameraXImpl", "CameraState: Closing");
        } else if (i == 5) {
            Log.m105924i("MicroMsg.Camera.CameraXImpl", "CameraState: Closed");
        }
        CameraState.StateError error = cameraState.getError();
        if (error != null) {
            switch (error.getCode()) {
                case 1:
                    Log.m105920e("MicroMsg.Camera.CameraXImpl", "Max cameras in use");
                    C108171a.f323903a.mo158578b(this.f304625d, false);
                    return;
                case 2:
                    Log.m105920e("MicroMsg.Camera.CameraXImpl", "Camera in use");
                    C108171a.f323903a.mo158578b(this.f304625d, false);
                    return;
                case 3:
                    Log.m105920e("MicroMsg.Camera.CameraXImpl", "Other recoverable error");
                    C108171a.f323903a.mo158578b(this.f304625d, false);
                    return;
                case 4:
                    Log.m105920e("MicroMsg.Camera.CameraXImpl", "Stream config error");
                    C108171a.f323903a.mo158578b(this.f304625d, false);
                    return;
                case 5:
                    Log.m105920e("MicroMsg.Camera.CameraXImpl", "Camera disabled");
                    return;
                case 6:
                    Log.m105920e("MicroMsg.Camera.CameraXImpl", "Fatal error");
                    return;
                case 7:
                    Log.m105920e("MicroMsg.Camera.CameraXImpl", "Do not disturb mode enabled");
                    return;
                default:
                    return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo143112q(java.lang.Boolean r8, wx3.C15601d<? super rx3.C13598b0> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof d80.C107007b.C107016f
            if (r0 == 0) goto L_0x0013
            r0 = r9
            d80.b$f r0 = (d80.C107007b.C107016f) r0
            int r1 = r0.f320379h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f320379h = r1
            goto L_0x0018
        L_0x0013:
            d80.b$f r0 = new d80.b$f
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f320377f
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f320379h
            java.lang.String r3 = "MicroMsg.Camera.CameraXImpl"
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0050
            if (r2 == r6) goto L_0x0044
            if (r2 == r5) goto L_0x003c
            if (r2 != r4) goto L_0x0034
            java.lang.Object r8 = r0.f320375d
            d80.b r8 = (d80.C107007b) r8
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x00b3
        L_0x0034:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003c:
            java.lang.Object r8 = r0.f320375d
            d80.b r8 = (d80.C107007b) r8
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x00a3
        L_0x0044:
            java.lang.Object r8 = r0.f320376e
            v70.d r8 = (v70.C111389d) r8
            java.lang.Object r2 = r0.f320375d
            d80.b r2 = (d80.C107007b) r2
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x0094
        L_0x0050:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r2 = "startPreview backCamera:"
            r9.append(r2)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r9)
            v70.d r9 = r7.f304629h
            if (r9 != 0) goto L_0x006e
            rx3.b0 r8 = rx3.C13598b0.f38549a
            return r8
        L_0x006e:
            e80.c r2 = r7.f304631j
            boolean r2 = r2.f320911f
            if (r2 == 0) goto L_0x0085
            boolean r2 = r7.mo143099B()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r2 = gy3.C87412m.m108589b(r8, r2)
            if (r2 == 0) goto L_0x0085
            rx3.b0 r8 = rx3.C13598b0.f38549a
            return r8
        L_0x0085:
            r0.f320375d = r7
            r0.f320376e = r9
            r0.f320379h = r6
            java.lang.Object r8 = super.mo143112q(r8, r0)
            if (r8 != r1) goto L_0x0092
            return r1
        L_0x0092:
            r2 = r7
            r8 = r9
        L_0x0094:
            r0.f320375d = r2
            r9 = 0
            r0.f320376e = r9
            r0.f320379h = r5
            java.lang.Object r8 = r8.mo163055h(r0)
            if (r8 != r1) goto L_0x00a2
            return r1
        L_0x00a2:
            r8 = r2
        L_0x00a3:
            java.lang.String r9 = "makeSureEnvSetup finish"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r9)
            r0.f320375d = r8
            r0.f320379h = r4
            java.lang.Object r9 = r8.mo157452J(r0)
            if (r9 != r1) goto L_0x00b3
            return r1
        L_0x00b3:
            r9 = 0
            r8.f320330A = r9
            rx3.b0 r8 = rx3.C13598b0.f38549a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: d80.C107007b.mo143112q(java.lang.Boolean, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo143114s(int r17, int r18, int r19, boolean r20, wx3.C15601d<? super android.graphics.Bitmap> r21) {
        /*
            r16 = this;
            r8 = r16
            r0 = r21
            boolean r1 = r0 instanceof d80.C107007b.C107020i
            if (r1 == 0) goto L_0x0017
            r1 = r0
            d80.b$i r1 = (d80.C107007b.C107020i) r1
            int r2 = r1.f320392i
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.f320392i = r2
            goto L_0x001c
        L_0x0017:
            d80.b$i r1 = new d80.b$i
            r1.<init>(r8, r0)
        L_0x001c:
            r5 = r1
            java.lang.Object r0 = r5.f320390g
            xx3.a r9 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r5.f320392i
            java.lang.String r6 = "MicroMsg.Camera.CameraXImpl"
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x004b
            if (r1 == r4) goto L_0x0047
            if (r1 == r3) goto L_0x003e
            if (r1 != r2) goto L_0x0036
            long r1 = r5.f320389f
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x0098
        L_0x0036:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003e:
            java.lang.Object r1 = r5.f320388e
            v70.s r1 = (v70.C111406s) r1
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x011f
        L_0x0047:
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x0065
        L_0x004b:
            kotlin.ResultKt.throwOnFailure(r0)
            v70.s r10 = r8.f304628g
            if (r10 != 0) goto L_0x0066
            r5.f320392i = r4
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            java.lang.Object r0 = a80.C103320a.m136821E(r0, r1, r2, r3, r4, r5)
            if (r0 != r9) goto L_0x0065
            return r9
        L_0x0065:
            return r0
        L_0x0066:
            long r11 = java.lang.System.currentTimeMillis()
            y70.a r0 = y70.C38971a.f104993a
            int r0 = r0.mo61853a()
            if (r0 == r3) goto L_0x00b4
            boolean r0 = r16.mo143100C()
            if (r0 == 0) goto L_0x0079
            goto L_0x00b4
        L_0x0079:
            d80.a r0 = r8.f320341z
            android.util.Range<java.lang.Integer> r1 = r0.f320325c
            int r0 = r0.f320324b
            r8.mo143118z(r1, r0, r4)
            r5.f320389f = r11
            r5.f320392i = r2
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            java.lang.Object r0 = a80.C103320a.m136821E(r0, r1, r2, r3, r4, r5)
            if (r0 != r9) goto L_0x0097
            return r9
        L_0x0097:
            r1 = r11
        L_0x0098:
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "takePictureAsync from read pixel cost:"
            r3.append(r4)
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r1
            r3.append(r4)
            java.lang.String r1 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            return r0
        L_0x00b4:
            d80.a r0 = r8.f320341z
            android.util.Range<java.lang.Integer> r1 = r0.f320325c
            int r0 = r0.f320324b
            r8.mo143118z(r1, r0, r3)
            boolean r0 = r8.f320330A
            r1 = 0
            if (r0 != 0) goto L_0x0126
            e80.c r0 = r8.f304631j
            boolean r0 = r0.f320911f
            if (r0 != 0) goto L_0x00c9
            goto L_0x0126
        L_0x00c9:
            r8.f320330A = r4
            r5.f320387d = r8
            r5.f320388e = r10
            r5.f320389f = r11
            r5.f320392i = r3
            wx3.h r13 = new wx3.h
            wx3.d r0 = xx3.C66447b.m78392b(r5)
            r13.<init>(r0)
            if (r20 == 0) goto L_0x00e1
            r0 = 0
            r4 = 0
            goto L_0x00e9
        L_0x00e1:
            r0 = r19
            int r0 = -r0
            int r0 = r0 + 360
            int r0 = r0 % 360
            r4 = r0
        L_0x00e9:
            androidx.camera.core.ImageCapture r0 = r8.f320337v
            if (r0 != 0) goto L_0x00ee
            goto L_0x0103
        L_0x00ee:
            android.content.Context r2 = r8.f304626e
            if (r2 == 0) goto L_0x0120
            android.app.Activity r2 = (android.app.Activity) r2
            android.view.WindowManager r1 = r2.getWindowManager()
            android.view.Display r1 = r1.getDefaultDisplay()
            int r1 = r1.getRotation()
            r0.setTargetRotation(r1)
        L_0x0103:
            androidx.camera.core.ImageCapture r14 = r8.f320337v
            if (r14 == 0) goto L_0x0118
            d80.b$j r15 = new d80.b$j
            r0 = r15
            r1 = r16
            r2 = r11
            r5 = r17
            r6 = r18
            r7 = r13
            r0.<init>(r1, r2, r4, r5, r6, r7)
            r14.lambda$takePicture$3(r10, r15)
        L_0x0118:
            java.lang.Object r0 = r13.mo90314b()
            if (r0 != r9) goto L_0x011f
            return r9
        L_0x011f:
            return r0
        L_0x0120:
            java.lang.String r0 = "context"
            gy3.C87412m.m108603p(r0)
            throw r1
        L_0x0126:
            java.lang.String r0 = "isTaking picture ignore"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d80.C107007b.mo143114s(int, int, int, boolean, wx3.d):java.lang.Object");
    }

    public void setLightTorch(boolean z) {
        Camera camera;
        CameraControl cameraControl;
        C107254b bVar = this.f304630i;
        boolean z2 = true;
        if (bVar == null || !bVar.f320904e) {
            z2 = false;
        }
        Log.m105924i("MicroMsg.Camera.CameraXImpl", "setRecordStatus >> " + z2 + ' ' + this.f304634p + ' ' + mo143099B() + ' ' + z);
        if (z2 && this.f304634p && mo143099B() && (camera = this.f320339x) != null && (cameraControl = camera.getCameraControl()) != null) {
            cameraControl.enableTorch(z);
        }
    }

    /* renamed from: t */
    public C13604l<Range<Integer>, Integer> mo143128t() {
        C107006a aVar = this.f320341z;
        Range<Integer> range = aVar.f320325c;
        int i = aVar.f320326d;
        Log.m105924i("MicroMsg.Camera.CameraXImpl", "getExpoData >> " + range + ", " + i);
        return new C13604l<>(range, Integer.valueOf(i));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo143129x(wx3.C15601d<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof d80.C107007b.C107017g
            if (r0 == 0) goto L_0x0013
            r0 = r6
            d80.b$g r0 = (d80.C107007b.C107017g) r0
            int r1 = r0.f320382f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f320382f = r1
            goto L_0x0018
        L_0x0013:
            d80.b$g r0 = new d80.b$g
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f320380d
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f320382f
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x004c
        L_0x0027:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x002f:
            kotlin.ResultKt.throwOnFailure(r6)
            e80.c r6 = r5.f304631j
            boolean r2 = r6.f320908c
            r2 = r2 ^ r3
            r6.f320908c = r2
            a14.h0 r6 = a14.C53872d1.f151117a
            a14.k2 r6 = f14.C58901s.f168555a
            d80.b$h r2 = new d80.b$h
            r4 = 0
            r2.<init>(r5, r4)
            r0.f320382f = r3
            java.lang.Object r6 = a14.C53895h.m60469g(r6, r2, r0)
            if (r6 != r1) goto L_0x004c
            return r1
        L_0x004c:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: d80.C107007b.mo143129x(wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0020, code lost:
        r4 = r4.getCameraControl();
     */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo143130y(float r3, float r4) {
        /*
            r2 = this;
            d80.g r0 = r2.f320340y
            androidx.camera.core.MeteringPoint r3 = r0.createPoint(r3, r4)
            androidx.camera.core.FocusMeteringAction$Builder r4 = new androidx.camera.core.FocusMeteringAction$Builder
            r4.<init>(r3)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            r0 = 3
            androidx.camera.core.FocusMeteringAction$Builder r3 = r4.setAutoCancelDuration(r0, r3)
            androidx.camera.core.FocusMeteringAction r3 = r3.build()
            java.lang.String r4 = "Builder(it)\n            …\n                .build()"
            gy3.C87412m.m108593f(r3, r4)
            androidx.camera.core.Camera r4 = r2.f320339x
            if (r4 == 0) goto L_0x002b
            androidx.camera.core.CameraControl r4 = r4.getCameraControl()
            if (r4 == 0) goto L_0x002b
            z8.f r3 = r4.startFocusAndMetering(r3)
            goto L_0x002c
        L_0x002b:
            r3 = 0
        L_0x002c:
            if (r3 == 0) goto L_0x003b
            d80.b$d r4 = new d80.b$d
            r4.<init>(r3)
            v70.s r0 = r2.f304628g
            gy3.C87412m.m108591d(r0)
            r3.addListener(r4, r0)
        L_0x003b:
            d80.a r3 = r2.f320341z
            r3.mo157450b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d80.C107007b.mo143130y(float, float):void");
    }
}
