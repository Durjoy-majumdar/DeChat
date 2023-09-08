package c80;

import a14.C0000n0;
import a80.C103320a;
import a90.C103339e;
import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Bundle;
import android.util.Range;
import android.view.Surface;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import d14.C58087u0;
import e80.C107261i;
import fy3.C32227p;
import gy3.C87412m;
import h80.C108171a;
import i80.C108399b;
import kotlin.ResultKt;
import rx3.C13598b0;
import rx3.C13604l;
import v70.C111389d;
import v70.C111406s;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: c80.e */
public final class C104306e extends C103320a {

    /* renamed from: A */
    public final C104307a f308728A;

    /* renamed from: B */
    public final C104311b f308729B;

    /* renamed from: q */
    public C58087u0<C13604l<C108399b, Bundle>> f308730q;

    /* renamed from: r */
    public final CameraManager f308731r;

    /* renamed from: s */
    public int f308732s = 1;

    /* renamed from: t */
    public CaptureRequest.Builder f308733t;

    /* renamed from: u */
    public CameraDevice f308734u;

    /* renamed from: v */
    public CameraCharacteristics f308735v;

    /* renamed from: w */
    public CameraCaptureSession f308736w;

    /* renamed from: x */
    public final C104321g f308737x = new C104321g();

    /* renamed from: y */
    public final C104304b f308738y = new C104304b();

    /* renamed from: z */
    public final C104316g f308739z = new C104316g(this);

    /* renamed from: c80.e$a */
    public static final class C104307a extends C103339e {

        /* renamed from: a */
        public final /* synthetic */ C104306e f308740a;

        /* renamed from: b */
        public final /* synthetic */ int f308741b;

        @C91590f(mo125468c = "com.tencent.mm.media.camera.instance.camera2.Camera2Impl$cameraStateCallBack$1$onDisconnected$1", mo125469f = "Camera2Impl.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: c80.e$a$a */
        public static final class C104308a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ CameraDevice f308742d;

            /* renamed from: e */
            public final /* synthetic */ C104306e f308743e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C104308a(CameraDevice cameraDevice, C104306e eVar, C15601d<? super C104308a> dVar) {
                super(2, dVar);
                this.f308742d = cameraDevice;
                this.f308743e = eVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C104308a(this.f308742d, this.f308743e, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C104308a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                Log.m105920e("MicroMsg.Camera.Camera2Impl", "sessionCallback onDisconnected " + this.f308742d.hashCode());
                this.f308742d.close();
                this.f308743e.mo145992K();
                return C13598b0.f38549a;
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.media.camera.instance.camera2.Camera2Impl$cameraStateCallBack$1$onError$1", mo125469f = "Camera2Impl.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: c80.e$a$b */
        public static final class C104309b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ CameraDevice f308744d;

            /* renamed from: e */
            public final /* synthetic */ C104306e f308745e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C104309b(CameraDevice cameraDevice, C104306e eVar, C15601d<? super C104309b> dVar) {
                super(2, dVar);
                this.f308744d = cameraDevice;
                this.f308745e = eVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C104309b(this.f308744d, this.f308745e, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C104309b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                this.f308744d.close();
                this.f308745e.mo145992K();
                return C13598b0.f38549a;
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.media.camera.instance.camera2.Camera2Impl$cameraStateCallBack$1$onOpened$1", mo125469f = "Camera2Impl.kt", mo125470l = {84}, mo125471m = "invokeSuspend")
        /* renamed from: c80.e$a$c */
        public static final class C104310c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f308746d;

            /* renamed from: e */
            public final /* synthetic */ CameraDevice f308747e;

            /* renamed from: f */
            public final /* synthetic */ C104306e f308748f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C104310c(CameraDevice cameraDevice, C104306e eVar, C15601d<? super C104310c> dVar) {
                super(2, dVar);
                this.f308747e = cameraDevice;
                this.f308748f = eVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C104310c(this.f308747e, this.f308748f, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C104310c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f308746d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Log.m105924i("MicroMsg.Camera.Camera2Impl", "sessionCallback onOpened " + this.f308747e.hashCode());
                    C104306e eVar = this.f308748f;
                    eVar.f308734u = this.f308747e;
                    this.f308746d = 1;
                    if (C104306e.m139268J(eVar, this) == aVar) {
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

        public C104307a(C104306e eVar, int i) {
            this.f308740a = eVar;
            this.f308741b = i;
        }

        public void onDisconnected(CameraDevice cameraDevice) {
            C87412m.m108594g(cameraDevice, "camera");
            Log.m105920e("MicroMsg.Camera.Camera2Impl", "sessionCallback onDisconnected " + cameraDevice.hashCode());
            C104306e eVar = this.f308740a;
            C111406s sVar = eVar.f304628g;
            if (sVar != null) {
                sVar.mo163062D("Camera2Close", new C104308a(cameraDevice, eVar, (C15601d<? super C104308a>) null));
            }
        }

        public void onError(CameraDevice cameraDevice, int i) {
            C87412m.m108594g(cameraDevice, "camera");
            Log.m105920e("MicroMsg.Camera.Camera2Impl", "sessionCallback onError:" + i);
            C108171a.f323903a.mo158578b(this.f308741b, false);
            C104306e eVar = this.f308740a;
            C111406s sVar = eVar.f304628g;
            if (sVar != null) {
                sVar.mo163062D("Camera2Close", new C104309b(cameraDevice, eVar, (C15601d<? super C104309b>) null));
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x002c, code lost:
            r0 = r4.f308740a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onOpened(android.hardware.camera2.CameraDevice r5) {
            /*
                r4 = this;
                java.lang.String r0 = "camera"
                gy3.C87412m.m108594g(r5, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "sessionCallback onOpened "
                r0.append(r1)
                int r1 = r5.hashCode()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "MicroMsg.Camera.Camera2Impl"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
                c80.e r0 = r4.f308740a
                e80.c r0 = r0.f304631j
                e80.j r0 = r0.f320907b
                e80.i r0 = r0.f320922a
                int r0 = r0.f320920a
                if (r0 > 0) goto L_0x002c
                return
            L_0x002c:
                c80.e r0 = r4.f308740a
                v70.s r1 = r0.f304628g
                if (r1 == 0) goto L_0x003d
                c80.e$a$c r2 = new c80.e$a$c
                r3 = 0
                r2.<init>(r5, r0, r3)
                java.lang.String r5 = "createCaptureSession"
                r1.mo163062D(r5, r2)
            L_0x003d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: c80.C104306e.C104307a.onOpened(android.hardware.camera2.CameraDevice):void");
        }
    }

    /* renamed from: c80.e$b */
    public static final class C104311b extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a */
        public final /* synthetic */ int f308749a;

        /* renamed from: b */
        public final /* synthetic */ C104306e f308750b;

        public C104311b(int i, C104306e eVar) {
            this.f308749a = i;
            this.f308750b = eVar;
        }

        public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
            C87412m.m108594g(cameraCaptureSession, "session");
            C87412m.m108594g(captureRequest, "request");
            C87412m.m108594g(surface, "target");
            super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
            Log.m105924i("MicroMsg.Camera.Camera2Impl", "onCaptureBufferLost request:" + captureRequest);
        }

        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            C87412m.m108594g(cameraCaptureSession, "session");
            C87412m.m108594g(captureRequest, "request");
            C87412m.m108594g(totalCaptureResult, "result");
            Log.m105924i("MicroMsg.Camera.Camera2Impl", "onCaptureCompleted");
            super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
            Log.m105924i("MicroMsg.Camera.Camera2Impl", "handleAFResult");
            Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
            if ((num != null && num.intValue() == 4) || (num != null && num.intValue() == 5)) {
                Log.m105924i("MicroMsg.Camera.Camera2Impl", "STATE_TOUCH_FOCUSING and state is  " + totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE));
                CaptureRequest.Builder builder = this.f308750b.f308733t;
                if (builder != null) {
                    builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                }
                CaptureRequest.Builder builder2 = this.f308750b.f308733t;
                if (builder2 != null) {
                    builder2.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 0);
                }
                this.f308750b.mo145996O();
            }
        }

        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            C87412m.m108594g(cameraCaptureSession, "session");
            C87412m.m108594g(captureRequest, "request");
            C87412m.m108594g(captureFailure, "failure");
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            C108171a.f323903a.mo158578b(this.f308749a, false);
            Log.m105920e("MicroMsg.Camera.Camera2Impl", "onCaptureFailed request:" + captureRequest);
        }

        public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            C87412m.m108594g(cameraCaptureSession, "session");
            C87412m.m108594g(captureRequest, "request");
            C87412m.m108594g(captureResult, "partialResult");
            super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
            Log.m105924i("MicroMsg.Camera.Camera2Impl", "onCaptureProgressed request:" + captureRequest);
        }

        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
            C87412m.m108594g(cameraCaptureSession, "session");
            super.onCaptureSequenceAborted(cameraCaptureSession, i);
            Log.m105924i("MicroMsg.Camera.Camera2Impl", "onCaptureSequenceAborted");
        }

        public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
            C87412m.m108594g(cameraCaptureSession, "session");
            super.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
            Log.m105924i("MicroMsg.Camera.Camera2Impl", "onCaptureSequenceCompleted sequenceId:" + i);
        }

        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
            C87412m.m108594g(cameraCaptureSession, "session");
            C87412m.m108594g(captureRequest, "request");
            Log.m105924i("MicroMsg.Camera.Camera2Impl", "onCaptureStarted");
            super.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.media.camera.instance.camera2.Camera2Impl", mo125469f = "Camera2Impl.kt", mo125470l = {211}, mo125471m = "createCamera")
    /* renamed from: c80.e$c */
    public static final class C104312c extends C66704d {

        /* renamed from: d */
        public Object f308751d;

        /* renamed from: e */
        public boolean f308752e;

        /* renamed from: f */
        public /* synthetic */ Object f308753f;

        /* renamed from: g */
        public final /* synthetic */ C104306e f308754g;

        /* renamed from: h */
        public int f308755h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C104312c(C104306e eVar, C15601d<? super C104312c> dVar) {
            super(dVar);
            this.f308754g = eVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f308753f = obj;
            this.f308755h |= Integer.MIN_VALUE;
            return this.f308754g.mo145993L(false, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.media.camera.instance.camera2.Camera2Impl", mo125469f = "Camera2Impl.kt", mo125470l = {261, 262, 263}, mo125471m = "createCaptureSurfaceList")
    /* renamed from: c80.e$d */
    public static final class C104313d extends C66704d {

        /* renamed from: d */
        public Object f308756d;

        /* renamed from: e */
        public /* synthetic */ Object f308757e;

        /* renamed from: f */
        public final /* synthetic */ C104306e f308758f;

        /* renamed from: g */
        public int f308759g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C104313d(C104306e eVar, C15601d<? super C104313d> dVar) {
            super(dVar);
            this.f308758f = eVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f308757e = obj;
            this.f308759g |= Integer.MIN_VALUE;
            return this.f308758f.mo145994M(0, 0, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.media.camera.instance.camera2.Camera2Impl$onZoomIn$1", mo125469f = "Camera2Impl.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: c80.e$e */
    public static final class C104314e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C104306e f308760d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C104314e(C104306e eVar, C15601d<? super C104314e> dVar) {
            super(2, dVar);
            this.f308760d = eVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C104314e(this.f308760d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C104314e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            if (this.f308760d.f308737x.mo146010a(false)) {
                Log.m105924i("MicroMsg.Camera.Camera2Impl", "onZoomInt to send Req");
                this.f308760d.mo145996O();
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.media.camera.instance.camera2.Camera2Impl$onZoomOut$1", mo125469f = "Camera2Impl.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: c80.e$f */
    public static final class C104315f extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C104306e f308761d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C104315f(C104306e eVar, C15601d<? super C104315f> dVar) {
            super(2, dVar);
            this.f308761d = eVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C104315f(this.f308761d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C104315f) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            if (this.f308761d.f308737x.mo146010a(true)) {
                Log.m105924i("MicroMsg.Camera.Camera2Impl", "onZoomOut to send req");
                this.f308761d.mo145996O();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: c80.e$g */
    public static final class C104316g extends CameraCaptureSession.StateCallback {

        /* renamed from: a */
        public final /* synthetic */ C104306e f308762a;

        @C91590f(mo125468c = "com.tencent.mm.media.camera.instance.camera2.Camera2Impl$sessionCallback$1$onConfigured$1", mo125469f = "Camera2Impl.kt", mo125470l = {58}, mo125471m = "invokeSuspend")
        /* renamed from: c80.e$g$a */
        public static final class C104317a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f308763d;

            /* renamed from: e */
            public final /* synthetic */ C104306e f308764e;

            /* renamed from: f */
            public final /* synthetic */ CameraCaptureSession f308765f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C104317a(C104306e eVar, CameraCaptureSession cameraCaptureSession, C15601d<? super C104317a> dVar) {
                super(2, dVar);
                this.f308764e = eVar;
                this.f308765f = cameraCaptureSession;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C104317a(this.f308764e, this.f308765f, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C104317a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f308763d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C104306e eVar = this.f308764e;
                    eVar.f308736w = this.f308765f;
                    this.f308763d = 1;
                    if (C104306e.m139267I(eVar, this) == aVar) {
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

        public C104316g(C104306e eVar) {
            this.f308762a = eVar;
        }

        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            C87412m.m108594g(cameraCaptureSession, "session");
            super.onClosed(cameraCaptureSession);
            Log.m105924i("MicroMsg.Camera.Camera2Impl", "sessionCallback onClosed");
        }

        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            C87412m.m108594g(cameraCaptureSession, "session");
            Log.m105920e("MicroMsg.Camera.Camera2Impl", "sessionCallback onConfigureFailed");
        }

        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            C87412m.m108594g(cameraCaptureSession, "session");
            Log.m105924i("MicroMsg.Camera.Camera2Impl", "sessionCallback onConfigured");
            C104306e eVar = this.f308762a;
            C111406s sVar = eVar.f304628g;
            if (sVar != null) {
                sVar.mo163062D("afterSessionFinishToPreview", new C104317a(eVar, cameraCaptureSession, (C15601d<? super C104317a>) null));
            }
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.media.camera.instance.camera2.Camera2Impl", mo125469f = "Camera2Impl.kt", mo125470l = {204, 205}, mo125471m = "startPreview")
    /* renamed from: c80.e$h */
    public static final class C104318h extends C66704d {

        /* renamed from: d */
        public Object f308766d;

        /* renamed from: e */
        public /* synthetic */ Object f308767e;

        /* renamed from: f */
        public final /* synthetic */ C104306e f308768f;

        /* renamed from: g */
        public int f308769g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C104318h(C104306e eVar, C15601d<? super C104318h> dVar) {
            super(dVar);
            this.f308768f = eVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f308767e = obj;
            this.f308769g |= Integer.MIN_VALUE;
            return this.f308768f.mo143112q((Boolean) null, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.media.camera.instance.camera2.Camera2Impl", mo125469f = "Camera2Impl.kt", mo125470l = {320, 324, 325, 326, 327}, mo125471m = "switchCamera")
    /* renamed from: c80.e$i */
    public static final class C104319i extends C66704d {

        /* renamed from: d */
        public Object f308770d;

        /* renamed from: e */
        public /* synthetic */ Object f308771e;

        /* renamed from: f */
        public final /* synthetic */ C104306e f308772f;

        /* renamed from: g */
        public int f308773g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C104319i(C104306e eVar, C15601d<? super C104319i> dVar) {
            super(dVar);
            this.f308772f = eVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f308771e = obj;
            this.f308773g |= Integer.MIN_VALUE;
            return this.f308772f.mo143129x(this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104306e(C58087u0<C13604l<C108399b, Bundle>> u0Var, int i) {
        super(i);
        C87412m.m108594g(u0Var, "stateFlow");
        this.f308730q = u0Var;
        Object systemService = MMApplicationContext.getContext().getSystemService("camera");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
        this.f308731r = (CameraManager) systemService;
        this.f308728A = new C104307a(this, i);
        this.f308729B = new C104311b(i, this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: android.graphics.Rect} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m139267I(c80.C104306e r10, wx3.C15601d r11) {
        /*
            r10.getClass()
            boolean r0 = r11 instanceof c80.C104305c
            if (r0 == 0) goto L_0x0016
            r0 = r11
            c80.c r0 = (c80.C104305c) r0
            int r1 = r0.f308727h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f308727h = r1
            goto L_0x001b
        L_0x0016:
            c80.c r0 = new c80.c
            r0.<init>(r10, r11)
        L_0x001b:
            java.lang.Object r11 = r0.f308725f
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f308727h
            java.lang.String r3 = "MicroMsg.Camera.Camera2Impl"
            r4 = 1
            r5 = 0
            r6 = 0
            if (r2 == 0) goto L_0x0042
            if (r2 != r4) goto L_0x003a
            java.lang.Object r10 = r0.f308724e
            android.hardware.camera2.CaptureRequest$Builder r10 = (android.hardware.camera2.CaptureRequest.Builder) r10
            java.lang.Object r0 = r0.f308723d
            c80.e r0 = (c80.C104306e) r0
            kotlin.ResultKt.throwOnFailure(r11)
            r9 = r11
            r11 = r10
            r10 = r0
            r0 = r9
            goto L_0x0098
        L_0x003a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0042:
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r2 = "afterSessionFinishToPreview "
            r11.append(r2)
            android.hardware.camera2.CameraDevice r2 = r10.f308734u
            if (r2 == 0) goto L_0x0058
            int r2 = r2.hashCode()
            goto L_0x0059
        L_0x0058:
            r2 = 0
        L_0x0059:
            r11.append(r2)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r11)
            android.hardware.camera2.CameraDevice r11 = r10.f308734u
            if (r11 == 0) goto L_0x006c
            android.hardware.camera2.CaptureRequest$Builder r11 = r11.createCaptureRequest(r4)
            goto L_0x006d
        L_0x006c:
            r11 = r6
        L_0x006d:
            if (r11 != 0) goto L_0x007f
            h80.a r11 = h80.C108171a.f323903a
            int r10 = r10.f304625d
            r11.mo158578b(r10, r5)
            java.lang.String r10 = "afterSessionFinishToPreview >> builder is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r10)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0141
        L_0x007f:
            v70.d r2 = r10.f304629h
            if (r2 == 0) goto L_0x009b
            r0.f308723d = r10
            r0.f308724e = r11
            r0.f308727h = r4
            v70.h r7 = new v70.h
            r7.<init>(r2, r6)
            java.lang.String r8 = "getGlInputSurface"
            java.lang.Object r0 = r2.mo163058p(r8, r7, r0)
            if (r0 != r1) goto L_0x0098
            goto L_0x0141
        L_0x0098:
            android.view.Surface r0 = (android.view.Surface) r0
            goto L_0x009c
        L_0x009b:
            r0 = r6
        L_0x009c:
            if (r0 != 0) goto L_0x00ae
            java.lang.String r11 = "afterSessionFinishToPreview >> surface is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r11)
            h80.a r11 = h80.C108171a.f323903a
            int r10 = r10.f304625d
            r11.mo158578b(r10, r5)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0141
        L_0x00ae:
            h80.a r1 = h80.C108171a.f323903a
            int r2 = r10.f304625d
            r1.mo158578b(r2, r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "startPreview surface:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            r11.addTarget(r0)
            r10.f308733t = r11
            android.hardware.camera2.CaptureRequest$Key r11 = android.hardware.camera2.CaptureRequest.CONTROL_MODE
            java.lang.String r0 = "CONTROL_MODE"
            gy3.C87412m.m108593f(r11, r0)
            r10.mo145995N(r11, r4)
            c80.g r11 = r10.f308737x
            android.hardware.camera2.CaptureRequest$Builder r0 = r10.f308733t
            android.hardware.camera2.CameraCharacteristics r1 = r10.f308735v
            r11.getClass()
            java.lang.String r2 = "MicroMsg.Camera.Camera2ZoomHelper"
            java.lang.String r4 = "bindCameraRes"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            r11.f308779a = r0
            r11.f308780b = r1
            c80.b r11 = r10.f308738y
            android.hardware.camera2.CameraCharacteristics r10 = r10.f308735v
            r11.f308720e = r10
            if (r10 == 0) goto L_0x00fd
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE
            java.lang.Object r10 = r10.get(r0)
            r6 = r10
            android.graphics.Rect r6 = (android.graphics.Rect) r6
        L_0x00fd:
            c80.a r10 = new c80.a
            boolean r0 = r11.f308722g
            int r1 = r11.f304663c
            int r1 = -r1
            android.graphics.RectF r2 = r11.f304664d
            android.graphics.RectF r4 = new android.graphics.RectF
            r4.<init>(r6)
            r10.<init>(r0, r1, r2, r4)
            r11.f308721f = r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "bindCameraRes sensor rect:"
            r10.append(r0)
            r10.append(r6)
            java.lang.String r0 = " rotate:"
            r10.append(r0)
            int r0 = r11.f304663c
            r10.append(r0)
            java.lang.String r0 = " mirrorX:"
            r10.append(r0)
            boolean r11 = r11.f308722g
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = "MicroMsg.Camera.Camera2FocusHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r10)
            java.lang.String r10 = "start preview finish"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r10)
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x0141:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c80.C104306e.m139267I(c80.e, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m139268J(c80.C104306e r8, wx3.C15601d r9) {
        /*
            r8.getClass()
            boolean r0 = r9 instanceof c80.C104320f
            if (r0 == 0) goto L_0x0016
            r0 = r9
            c80.f r0 = (c80.C104320f) r0
            int r1 = r0.f308778h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f308778h = r1
            goto L_0x001b
        L_0x0016:
            c80.f r0 = new c80.f
            r0.<init>(r8, r9)
        L_0x001b:
            java.lang.Object r9 = r0.f308776f
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f308778h
            java.lang.String r3 = "MicroMsg.Camera.Camera2Impl"
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0042
            if (r2 != r4) goto L_0x003a
            java.lang.Object r8 = r0.f308775e
            android.hardware.camera2.CameraDevice r8 = (android.hardware.camera2.CameraDevice) r8
            java.lang.Object r0 = r0.f308774d
            c80.e r0 = (c80.C104306e) r0
            kotlin.ResultKt.throwOnFailure(r9)     // Catch:{ CameraAccessException -> 0x0037 }
            r2 = r8
            r8 = r0
            goto L_0x009a
        L_0x0037:
            r8 = move-exception
            goto L_0x00ae
        L_0x003a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0042:
            kotlin.ResultKt.throwOnFailure(r9)
            e80.c r9 = r8.f304631j
            e80.j r9 = r9.f320907b
            e80.i r9 = r9.f320922a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "createCaptureSession >> "
            r2.append(r6)
            int r6 = r9.f320920a
            r2.append(r6)
            java.lang.String r6 = ", "
            r2.append(r6)
            int r7 = r9.f320921b
            r2.append(r7)
            r2.append(r6)
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            r2.append(r7)
            r2.append(r6)
            android.hardware.camera2.CameraDevice r6 = r8.f308734u
            if (r6 == 0) goto L_0x007a
            int r6 = r6.hashCode()
            goto L_0x007b
        L_0x007a:
            r6 = 0
        L_0x007b:
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            android.hardware.camera2.CameraDevice r2 = r8.f308734u     // Catch:{ CameraAccessException -> 0x00ab }
            if (r2 == 0) goto L_0x00cd
            int r6 = r9.f320920a     // Catch:{ CameraAccessException -> 0x00ab }
            int r9 = r9.f320921b     // Catch:{ CameraAccessException -> 0x00ab }
            r0.f308774d = r8     // Catch:{ CameraAccessException -> 0x00ab }
            r0.f308775e = r2     // Catch:{ CameraAccessException -> 0x00ab }
            r0.f308778h = r4     // Catch:{ CameraAccessException -> 0x00ab }
            java.lang.Object r9 = r8.mo145994M(r6, r9, r0)     // Catch:{ CameraAccessException -> 0x00ab }
            if (r9 != r1) goto L_0x009a
            goto L_0x00cf
        L_0x009a:
            java.util.List r9 = (java.util.List) r9     // Catch:{ CameraAccessException -> 0x00ab }
            c80.e$g r0 = r8.f308739z     // Catch:{ CameraAccessException -> 0x00ab }
            v70.s r1 = r8.f304628g     // Catch:{ CameraAccessException -> 0x00ab }
            gy3.C87412m.m108591d(r1)     // Catch:{ CameraAccessException -> 0x00ab }
            android.os.Handler r1 = r1.mo163063J()     // Catch:{ CameraAccessException -> 0x00ab }
            r2.createCaptureSession(r9, r0, r1)     // Catch:{ CameraAccessException -> 0x00ab }
            goto L_0x00cd
        L_0x00ab:
            r9 = move-exception
            r0 = r8
            r8 = r9
        L_0x00ae:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r1 = "createCaptureSession error >> "
            r9.append(r1)
            java.lang.String r8 = r8.getMessage()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r8)
            h80.a r8 = h80.C108171a.f323903a
            int r9 = r0.f304625d
            r8.mo158578b(r9, r5)
        L_0x00cd:
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x00cf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c80.C104306e.m139268J(c80.e, wx3.d):java.lang.Object");
    }

    /* renamed from: B */
    public boolean mo143099B() {
        return this.f308732s == 1;
    }

    /* renamed from: F */
    public void mo143101F(int i) {
        this.f304631j.f320910e = i;
        C111389d dVar = this.f304629h;
        C87412m.m108591d(dVar);
        C107261i iVar = dVar.f333482j.f320922a;
        Log.m105924i("MicroMsg.Camera.Camera2Impl", "updateFocusParam >> " + i + ", " + iVar.f320921b + ", " + iVar.f320920a);
        this.f308738y.mo143119a(mo143099B() ^ true, i, mo143098A().f320920a, mo143098A().f320921b, iVar.f320920a, iVar.f320921b);
    }

    /* renamed from: K */
    public final void mo145992K() {
        Log.m105924i("MicroMsg.Camera.Camera2Impl", "close >> " + Thread.currentThread());
        CameraCaptureSession cameraCaptureSession = this.f308736w;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
        }
        this.f308736w = null;
        CameraDevice cameraDevice = this.f308734u;
        if (cameraDevice != null) {
            cameraDevice.close();
        }
        this.f308734u = null;
        this.f308733t = null;
        this.f308735v = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo145993L(boolean r20, wx3.C15601d<? super rx3.C13598b0> r21) {
        /*
            r19 = this;
            r1 = r19
            r0 = r21
            boolean r2 = r0 instanceof c80.C104306e.C104312c
            if (r2 == 0) goto L_0x0017
            r2 = r0
            c80.e$c r2 = (c80.C104306e.C104312c) r2
            int r3 = r2.f308755h
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f308755h = r3
            goto L_0x001c
        L_0x0017:
            c80.e$c r2 = new c80.e$c
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.f308753f
            xx3.a r3 = xx3.C15911a.COROUTINE_SUSPENDED
            int r4 = r2.f308755h
            r5 = 1
            if (r4 == 0) goto L_0x003a
            if (r4 != r5) goto L_0x0032
            boolean r3 = r2.f308752e
            java.lang.Object r2 = r2.f308751d
            c80.e r2 = (c80.C104306e) r2
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r3
            goto L_0x005c
        L_0x0032:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x003a:
            kotlin.ResultKt.throwOnFailure(r0)
            r2.f308751d = r1
            r0 = r20
            r2.f308752e = r0
            r2.f308755h = r5
            h80.a r2 = h80.C108171a.f323903a
            int r4 = r1.f304625d
            com.tencent.mm.autogen.mmdata.rpt.CameraReportStruct r2 = r2.mo158577a(r4)
            if (r2 != 0) goto L_0x0050
            goto L_0x0056
        L_0x0050:
            long r6 = java.lang.System.currentTimeMillis()
            r2.f310095n = r6
        L_0x0056:
            rx3.b0 r2 = rx3.C13598b0.f38549a
            if (r2 != r3) goto L_0x005b
            return r3
        L_0x005b:
            r2 = r1
        L_0x005c:
            java.lang.String r3 = "MicroMsg.Camera.Camera2Impl"
            java.lang.String r4 = "createCamera"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            v70.s r4 = r2.f304628g
            if (r4 == 0) goto L_0x0142
            android.os.Handler r4 = r4.mo163063J()
            if (r4 != 0) goto L_0x006f
            goto L_0x0142
        L_0x006f:
            r2.f308732s = r0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "getCameraIdStr >> "
            r6.append(r7)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r6)
            android.hardware.camera2.CameraManager r6 = r2.f308731r
            java.lang.String[] r6 = r6.getCameraIdList()
            java.lang.String r7 = "cameraManager.cameraIdList"
            gy3.C87412m.m108593f(r6, r7)
            int r7 = r6.length
            r8 = 0
            r9 = 0
        L_0x0093:
            if (r9 >= r7) goto L_0x00bc
            r10 = r6[r9]
            android.hardware.camera2.CameraManager r11 = r2.f308731r
            android.hardware.camera2.CameraCharacteristics r11 = r11.getCameraCharacteristics(r10)
            java.lang.String r12 = "cameraManager.getCameraCharacteristics(it)"
            gy3.C87412m.m108593f(r11, r12)
            android.hardware.camera2.CameraCharacteristics$Key r12 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r11 = r11.get(r12)
            java.lang.Integer r11 = (java.lang.Integer) r11
            if (r11 != 0) goto L_0x00ad
            goto L_0x00b5
        L_0x00ad:
            int r11 = r11.intValue()
            if (r11 != r0) goto L_0x00b5
            r11 = 1
            goto L_0x00b6
        L_0x00b5:
            r11 = 0
        L_0x00b6:
            if (r11 == 0) goto L_0x00b9
            goto L_0x00bd
        L_0x00b9:
            int r9 = r9 + 1
            goto L_0x0093
        L_0x00bc:
            r10 = 0
        L_0x00bd:
            if (r10 == 0) goto L_0x00c0
            goto L_0x00d1
        L_0x00c0:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r5[r8] = r6
            java.lang.String r6 = "can not find the id: %s in camera manage"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r6, r5)
            java.lang.String r10 = java.lang.String.valueOf(r0)
        L_0x00d1:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "createCamera cameraId:"
            r0.append(r5)
            int r5 = r2.f308732s
            r0.append(r5)
            java.lang.String r5 = " cameraStr:"
            r0.append(r5)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            android.hardware.camera2.CameraManager r11 = r2.f308731r     // Catch:{ CameraAccessException -> 0x011f }
            c80.e$a r0 = r2.f308728A     // Catch:{ CameraAccessException -> 0x011f }
            k20.a r5 = new k20.a     // Catch:{ CameraAccessException -> 0x011f }
            r5.<init>()     // Catch:{ CameraAccessException -> 0x011f }
            r5.mo10233c(r4)     // Catch:{ CameraAccessException -> 0x011f }
            r5.mo10233c(r0)     // Catch:{ CameraAccessException -> 0x011f }
            r5.mo10233c(r10)     // Catch:{ CameraAccessException -> 0x011f }
            java.lang.Object[] r12 = r5.mo10232b()     // Catch:{ CameraAccessException -> 0x011f }
            java.lang.String r13 = "com/tencent/mm/media/camera/instance/camera2/Camera2Impl"
            java.lang.String r14 = "createCamera"
            java.lang.String r15 = "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            java.lang.String r16 = "android/hardware/camera2/CameraManager"
            java.lang.String r17 = "openCamera"
            java.lang.String r18 = "(Ljava/lang/String;Landroid/hardware/camera2/CameraDevice$StateCallback;Landroid/os/Handler;)V"
            j20.C117292a.m165364j(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ CameraAccessException -> 0x011f }
            android.hardware.camera2.CameraManager r0 = r2.f308731r
            android.hardware.camera2.CameraCharacteristics r0 = r0.getCameraCharacteristics(r10)
            r2.f308735v = r0
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        L_0x011f:
            r0 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "createCamera error >> "
            r4.append(r5)
            java.lang.String r0 = r0.getMessage()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            h80.a r0 = h80.C108171a.f323903a
            int r2 = r2.f304625d
            r0.mo158578b(r2, r8)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        L_0x0142:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c80.C104306e.mo145993L(boolean, wx3.d):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: android.util.Size} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0188 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo145994M(int r13, int r14, wx3.C15601d<? super java.util.List<? extends android.view.Surface>> r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof c80.C104306e.C104313d
            if (r0 == 0) goto L_0x0013
            r0 = r15
            c80.e$d r0 = (c80.C104306e.C104313d) r0
            int r1 = r0.f308759g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f308759g = r1
            goto L_0x0018
        L_0x0013:
            c80.e$d r0 = new c80.e$d
            r0.<init>(r12, r15)
        L_0x0018:
            java.lang.Object r15 = r0.f308757e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f308759g
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0049
            if (r2 == r5) goto L_0x0040
            if (r2 == r4) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x019f
        L_0x002f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0037:
            java.lang.Object r13 = r0.f308756d
            c80.e r13 = (c80.C104306e) r13
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x0189
        L_0x0040:
            java.lang.Object r13 = r0.f308756d
            c80.e r13 = (c80.C104306e) r13
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x0177
        L_0x0049:
            kotlin.ResultKt.throwOnFailure(r15)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r2 = "createCaptureSurfaceList >> "
            r15.append(r2)
            r15.append(r14)
            java.lang.String r2 = ", "
            r15.append(r2)
            r15.append(r14)
            java.lang.String r15 = r15.toString()
            java.lang.String r7 = "MicroMsg.Camera.Camera2Impl"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r15)
            android.hardware.camera2.CameraCharacteristics r15 = r12.f308735v
            if (r15 != 0) goto L_0x0074
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            return r13
        L_0x0074:
            android.hardware.camera2.CameraCharacteristics$Key r8 = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP
            java.lang.Object r15 = r15.get(r8)
            android.hardware.camera2.params.StreamConfigurationMap r15 = (android.hardware.camera2.params.StreamConfigurationMap) r15
            if (r15 != 0) goto L_0x0084
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            return r13
        L_0x0084:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "calculateCameraSize >> "
            r8.append(r9)
            r8.append(r14)
            r8.append(r2)
            r8.append(r13)
            java.lang.String r2 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
            java.lang.Class<android.graphics.SurfaceTexture> r2 = android.graphics.SurfaceTexture.class
            android.util.Size[] r15 = r15.getOutputSizes(r2)
            java.lang.String r2 = "map.getOutputSizes(SurfaceTexture::class.java)"
            gy3.C87412m.m108593f(r15, r2)
            java.util.List r15 = sx3.C110823p.m151001a0(r15)
            int r2 = java.lang.Math.max(r14, r13)
            float r2 = (float) r2
            r8 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 * r8
            int r13 = java.lang.Math.min(r14, r13)
            float r13 = (float) r13
            float r2 = r2 / r13
            c80.d r13 = new c80.d
            r13.<init>(r2)
            java.util.Collections.sort(r15, r13)
            java.util.Iterator r13 = r15.iterator()
            r14 = 0
            r2 = 0
        L_0x00ca:
            boolean r8 = r13.hasNext()
            if (r8 == 0) goto L_0x00fc
            java.lang.Object r8 = r13.next()
            int r9 = r2 + 1
            if (r2 < 0) goto L_0x00f8
            android.util.Size r8 = (android.util.Size) r8
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "index:"
            r10.append(r11)
            r10.append(r2)
            java.lang.String r2 = " resolution:"
            r10.append(r2)
            r10.append(r8)
            java.lang.String r2 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
            r2 = r9
            goto L_0x00ca
        L_0x00f8:
            sx3.C64197v.m75542k()
            throw r6
        L_0x00fc:
            java.util.Iterator r13 = r15.iterator()
        L_0x0100:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L_0x0133
            java.lang.Object r2 = r13.next()
            r8 = r2
            android.util.Size r8 = (android.util.Size) r8
            int r9 = r8.getWidth()
            int r10 = r8.getHeight()
            int r9 = java.lang.Math.min(r9, r10)
            r10 = 500(0x1f4, float:7.0E-43)
            if (r9 <= r10) goto L_0x012f
            int r9 = r8.getWidth()
            int r8 = r8.getHeight()
            int r8 = java.lang.Math.max(r9, r8)
            r9 = 2600(0xa28, float:3.643E-42)
            if (r8 > r9) goto L_0x012f
            r8 = 1
            goto L_0x0130
        L_0x012f:
            r8 = 0
        L_0x0130:
            if (r8 == 0) goto L_0x0100
            goto L_0x0134
        L_0x0133:
            r2 = r6
        L_0x0134:
            android.util.Size r2 = (android.util.Size) r2
            if (r2 != 0) goto L_0x013f
            java.lang.Object r13 = sx3.C110818d0.m150914L(r15)
            r2 = r13
            android.util.Size r2 = (android.util.Size) r2
        L_0x013f:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "calculateCameraSize:"
            r13.append(r14)
            r13.append(r2)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r13)
            java.lang.String r13 = "target"
            gy3.C87412m.m108593f(r2, r13)
            v70.d r13 = r12.f304629h
            if (r13 == 0) goto L_0x017a
            int r14 = r2.getWidth()
            int r15 = r2.getHeight()
            r0.f308756d = r12
            r0.f308759g = r5
            v70.q r2 = new v70.q
            r2.<init>(r13, r14, r15, r6)
            java.lang.String r14 = "updateInputSize"
            java.lang.Object r15 = r13.mo163058p(r14, r2, r0)
            if (r15 != r1) goto L_0x0176
            return r1
        L_0x0176:
            r13 = r12
        L_0x0177:
            rx3.b0 r15 = (rx3.C13598b0) r15
            goto L_0x017b
        L_0x017a:
            r13 = r12
        L_0x017b:
            r0.f308756d = r13
            r0.f308759g = r4
            r13.getClass()
            java.lang.Object r14 = a80.C103320a.m136822G(r13, r0)
            if (r14 != r1) goto L_0x0189
            return r1
        L_0x0189:
            v70.d r13 = r13.f304629h
            if (r13 == 0) goto L_0x01a9
            r0.f308756d = r6
            r0.f308759g = r3
            v70.h r14 = new v70.h
            r14.<init>(r13, r6)
            java.lang.String r15 = "getGlInputSurface"
            java.lang.Object r15 = r13.mo163058p(r15, r14, r0)
            if (r15 != r1) goto L_0x019f
            return r1
        L_0x019f:
            android.view.Surface r15 = (android.view.Surface) r15
            if (r15 != 0) goto L_0x01a4
            goto L_0x01a9
        L_0x01a4:
            java.util.List r13 = sx3.C26236u.m33719b(r15)
            return r13
        L_0x01a9:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: c80.C104306e.mo145994M(int, int, wx3.d):java.lang.Object");
    }

    /* renamed from: N */
    public final void mo145995N(CaptureRequest.Key<Integer> key, int i) {
        Log.m105924i("MicroMsg.Camera.Camera2Impl", "makeCaptureRequest key:" + key + " value:" + i);
        CaptureRequest.Builder builder = this.f308733t;
        if (builder != null) {
            builder.set(key, Integer.valueOf(i));
        }
        mo145996O();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.Integer} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v2, types: [android.os.Handler] */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Integer mo145996O() {
        /*
            r7 = this;
            java.lang.String r0 = "MicroMsg.Camera.Camera2Impl"
            r1 = -1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ CameraAccessException -> 0x0061 }
            r2.<init>()     // Catch:{ CameraAccessException -> 0x0061 }
            java.lang.String r3 = "setSessionReq >> "
            r2.append(r3)     // Catch:{ CameraAccessException -> 0x0061 }
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch:{ CameraAccessException -> 0x0061 }
            r2.append(r3)     // Catch:{ CameraAccessException -> 0x0061 }
            java.lang.String r2 = r2.toString()     // Catch:{ CameraAccessException -> 0x0061 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)     // Catch:{ CameraAccessException -> 0x0061 }
            android.hardware.camera2.CaptureRequest$Builder r2 = r7.f308733t     // Catch:{ CameraAccessException -> 0x0061 }
            if (r2 == 0) goto L_0x005c
            android.hardware.camera2.CaptureRequest r2 = r2.build()     // Catch:{ CameraAccessException -> 0x0061 }
            if (r2 != 0) goto L_0x0026
            goto L_0x005c
        L_0x0026:
            android.hardware.camera2.CameraCaptureSession r3 = r7.f308736w     // Catch:{ CameraAccessException -> 0x0061 }
            r4 = 0
            if (r3 == 0) goto L_0x003d
            c80.e$b r5 = r7.f308729B     // Catch:{ CameraAccessException -> 0x0061 }
            v70.s r6 = r7.f304628g     // Catch:{ CameraAccessException -> 0x0061 }
            if (r6 == 0) goto L_0x0035
            android.os.Handler r4 = r6.mo163063J()     // Catch:{ CameraAccessException -> 0x0061 }
        L_0x0035:
            int r2 = r3.setRepeatingRequest(r2, r5, r4)     // Catch:{ CameraAccessException -> 0x0061 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)     // Catch:{ CameraAccessException -> 0x0061 }
        L_0x003d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ CameraAccessException -> 0x0061 }
            r2.<init>()     // Catch:{ CameraAccessException -> 0x0061 }
            java.lang.String r3 = "setSessionReq captureSession:"
            r2.append(r3)     // Catch:{ CameraAccessException -> 0x0061 }
            android.hardware.camera2.CameraCaptureSession r3 = r7.f308736w     // Catch:{ CameraAccessException -> 0x0061 }
            r2.append(r3)     // Catch:{ CameraAccessException -> 0x0061 }
            java.lang.String r3 = " sequence:"
            r2.append(r3)     // Catch:{ CameraAccessException -> 0x0061 }
            r2.append(r4)     // Catch:{ CameraAccessException -> 0x0061 }
            java.lang.String r2 = r2.toString()     // Catch:{ CameraAccessException -> 0x0061 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)     // Catch:{ CameraAccessException -> 0x0061 }
            return r4
        L_0x005c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ CameraAccessException -> 0x0061 }
            return r0
        L_0x0061:
            java.lang.String r2 = "setRepeatingRequest failed, errMsg: "
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c80.C104306e.mo145996O():java.lang.Integer");
    }

    /* renamed from: a */
    public void mo143120a() {
        Log.m105924i("MicroMsg.Camera.Camera2Impl", "onZoomOut");
        C111406s sVar = this.f304628g;
        if (sVar != null) {
            sVar.mo163062D("onZoomOut", new C104315f(this, (C15601d<? super C104315f>) null));
        }
    }

    /* renamed from: b */
    public void mo143121b() {
        Log.m105924i("MicroMsg.Camera.Camera2Impl", "onZoomIn");
        C111406s sVar = this.f304628g;
        if (sVar != null) {
            sVar.mo163062D("onZoomIn", new C104314e(this, (C15601d<? super C104314e>) null));
        }
    }

    /* renamed from: c */
    public int mo143122c() {
        Integer num;
        CameraCharacteristics cameraCharacteristics = this.f308735v;
        if (cameraCharacteristics == null || (num = (Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION)) == null) {
            return 0;
        }
        int intValue = num.intValue();
        Log.m105924i("MicroMsg.Camera.Camera2Impl", "getCameraOrientation sensorRotation:" + intValue + " lensFace:" + ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)));
        return intValue;
    }

    /* renamed from: h */
    public void mo143123h(int i) {
    }

    /* renamed from: i */
    public void mo143124i(boolean z) {
    }

    /* renamed from: j */
    public void mo143125j(int i) {
    }

    public boolean needMirror() {
        return mo143099B();
    }

    /* renamed from: p */
    public Object mo143111p(C15601d<? super C13598b0> dVar) {
        Log.m105924i("MicroMsg.Camera.Camera2Impl", "stopPreview");
        mo145992K();
        Object p = super.mo143111p(dVar);
        return p == C15911a.COROUTINE_SUSPENDED ? p : C13598b0.f38549a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0078 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo143112q(java.lang.Boolean r6, wx3.C15601d<? super rx3.C13598b0> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof c80.C104306e.C104318h
            if (r0 == 0) goto L_0x0013
            r0 = r7
            c80.e$h r0 = (c80.C104306e.C104318h) r0
            int r1 = r0.f308769g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f308769g = r1
            goto L_0x0018
        L_0x0013:
            c80.e$h r0 = new c80.e$h
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f308767e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f308769g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0079
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0032:
            java.lang.Object r6 = r0.f308766d
            c80.e r6 = (c80.C104306e) r6
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0069
        L_0x003a:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r2 = "startPreview >> "
            r7.append(r2)
            e80.c r2 = r5.f304631j
            boolean r2 = r2.f320911f
            r7.append(r2)
            java.lang.String r7 = r7.toString()
            java.lang.String r2 = "MicroMsg.Camera.Camera2Impl"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r7)
            e80.c r7 = r5.f304631j
            boolean r7 = r7.f320911f
            if (r7 != 0) goto L_0x007c
            r0.f308766d = r5
            r0.f308769g = r4
            java.lang.Object r6 = super.mo143112q(r6, r0)
            if (r6 != r1) goto L_0x0068
            return r1
        L_0x0068:
            r6 = r5
        L_0x0069:
            boolean r7 = r6.mo143099B()
            r2 = 0
            r0.f308766d = r2
            r0.f308769g = r3
            java.lang.Object r6 = r6.mo145993L(r7, r0)
            if (r6 != r1) goto L_0x0079
            return r1
        L_0x0079:
            rx3.b0 r6 = rx3.C13598b0.f38549a
            return r6
        L_0x007c:
            rx3.b0 r6 = rx3.C13598b0.f38549a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: c80.C104306e.mo143112q(java.lang.Boolean, wx3.d):java.lang.Object");
    }

    public void setLightTorch(boolean z) {
    }

    /* renamed from: t */
    public C13604l<Range<Integer>, Integer> mo143128t() {
        return new C13604l<>(null, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo143129x(wx3.C15601d<? super java.lang.Boolean> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof c80.C104306e.C104319i
            if (r0 == 0) goto L_0x0013
            r0 = r9
            c80.e$i r0 = (c80.C104306e.C104319i) r0
            int r1 = r0.f308773g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f308773g = r1
            goto L_0x0018
        L_0x0013:
            c80.e$i r0 = new c80.e$i
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f308771e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f308773g
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L_0x005e
            if (r2 == r7) goto L_0x0056
            if (r2 == r6) goto L_0x004e
            if (r2 == r5) goto L_0x0045
            if (r2 == r4) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x00e1
        L_0x0034:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x003c:
            java.lang.Object r2 = r0.f308770d
            c80.e r2 = (c80.C104306e) r2
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x00d1
        L_0x0045:
            java.lang.Object r2 = r0.f308770d
            c80.e r2 = (c80.C104306e) r2
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x00c2
        L_0x004e:
            java.lang.Object r2 = r0.f308770d
            c80.e r2 = (c80.C104306e) r2
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x00b2
        L_0x0056:
            java.lang.Object r2 = r0.f308770d
            c80.e r2 = (c80.C104306e) r2
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x008b
        L_0x005e:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r2 = "switchCamera >> "
            r9.append(r2)
            boolean r2 = r8.mo143099B()
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            java.lang.String r2 = "MicroMsg.Camera.Camera2Impl"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r9)
            v70.d r9 = r8.f304629h
            if (r9 == 0) goto L_0x008e
            r0.f308770d = r8
            r0.f308773g = r7
            java.lang.Object r9 = r9.mo163056j(r0)
            if (r9 != r1) goto L_0x008a
            return r1
        L_0x008a:
            r2 = r8
        L_0x008b:
            rx3.b0 r9 = (rx3.C13598b0) r9
            goto L_0x008f
        L_0x008e:
            r2 = r8
        L_0x008f:
            e80.c r9 = r2.f304631j
            boolean r9 = r9.f320908c
            if (r9 == 0) goto L_0x009b
            boolean r9 = r2.mo143110o()
            if (r9 != 0) goto L_0x00a7
        L_0x009b:
            e80.c r9 = r2.f304631j
            boolean r9 = r9.f320908c
            if (r9 != 0) goto L_0x00e6
            boolean r9 = r2.mo143109n()
            if (r9 == 0) goto L_0x00e6
        L_0x00a7:
            r0.f308770d = r2
            r0.f308773g = r6
            java.lang.Object r9 = r2.mo143111p(r0)
            if (r9 != r1) goto L_0x00b2
            return r1
        L_0x00b2:
            boolean r9 = r2.mo143099B()
            r9 = r9 ^ r7
            r0.f308770d = r2
            r0.f308773g = r5
            java.lang.Object r9 = r2.mo145993L(r9, r0)
            if (r9 != r1) goto L_0x00c2
            return r1
        L_0x00c2:
            v70.d r9 = r2.f304629h
            if (r9 == 0) goto L_0x00d1
            r0.f308770d = r2
            r0.f308773g = r4
            java.lang.Object r9 = r9.mo163054g(r0)
            if (r9 != r1) goto L_0x00d1
            return r1
        L_0x00d1:
            v70.d r9 = r2.f304629h
            if (r9 == 0) goto L_0x00e3
            r2 = 0
            r0.f308770d = r2
            r0.f308773g = r3
            java.lang.Object r9 = r9.mo163059q(r0)
            if (r9 != r1) goto L_0x00e1
            return r1
        L_0x00e1:
            rx3.b0 r9 = (rx3.C13598b0) r9
        L_0x00e3:
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            return r9
        L_0x00e6:
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: c80.C104306e.mo143129x(wx3.d):java.lang.Object");
    }

    /* renamed from: y */
    public void mo143130y(float f, float f2) {
        int i;
        int i2;
        Log.m105924i("MicroMsg.Camera.Camera2Impl", "focusOn >> " + f + ", " + f2);
        C104304b bVar = this.f308738y;
        CaptureRequest.Builder builder = this.f308733t;
        int i3 = bVar.f304662b;
        if (i3 <= 0 || (i = bVar.f304661a) <= 0) {
            Log.m105924i("MicroMsg.Camera.Camera2FocusHelper", "ignore focus,for width:" + bVar.f304661a + " height:" + bVar.f304662b);
        } else if (bVar.f308720e == null) {
            Log.m105924i("MicroMsg.Camera.Camera2FocusHelper", "when focus on, but characteristics is null");
        } else {
            C104304b bVar2 = bVar;
            float f3 = f;
            float f4 = f2;
            Rect b = bVar2.mo145990b(f3, f4, 1.25f, i, i3);
            Rect b2 = bVar2.mo145990b(f3, f4, 1.0f, bVar.f304661a, bVar.f304662b);
            CameraCharacteristics cameraCharacteristics = bVar.f308720e;
            int[] iArr = cameraCharacteristics != null ? (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES) : null;
            if (iArr != null) {
                int length = iArr.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        i2 = iArr[0];
                        break;
                    } else if (iArr[i4] == 1) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            i2 = 1;
            if (builder != null) {
                builder.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(i2));
            }
            if (builder != null) {
                builder.set(CaptureRequest.CONTROL_MODE, 1);
            }
            if (bVar.mo145991c(true)) {
                Log.m105924i("MicroMsg.Camera.Camera2FocusHelper", "focusOn focusRect:" + b);
                if (builder != null) {
                    builder.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(b, 1000)});
                }
            }
            if (bVar.mo145991c(false)) {
                Log.m105924i("MicroMsg.Camera.Camera2FocusHelper", "focusOn meteringRect:" + b2);
                if (builder != null) {
                    builder.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(b2, 1000)});
                }
            }
        }
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
        C87412m.m108593f(key, "CONTROL_AF_TRIGGER");
        mo145995N(key, 1);
    }
}
