package a90;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.ImageReader;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Range;
import android.util.Size;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import c90.C104325a;
import c90.C104326b;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import d90.C107026a;
import e90.C107267a;
import fy3.C32226l;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import i72.C108382h;
import i72.C108383i;
import i72.C108393s;
import iy3.C60641c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import k20.C9556a;
import p156gj.C107835h0;
import p206nj.C11171e;
import p966fj.C86869a;
import rx3.C13598b0;
import sx3.C110821n;
import sx3.C110823p;
import sx3.C26236u;
import sx3.C64197v;
import ux3.C65486b;
import y80.C112397a;
import z80.C112609a;

/* renamed from: a90.d */
public class C103332d extends C112397a {

    /* renamed from: A */
    public final Semaphore f304691A = new Semaphore(1);

    /* renamed from: B */
    public CameraManager f304692B;

    /* renamed from: C */
    public CameraDevice f304693C;

    /* renamed from: D */
    public CaptureRequest.Builder f304694D;

    /* renamed from: E */
    public CameraCaptureSession f304695E;

    /* renamed from: F */
    public CaptureRequest f304696F;

    /* renamed from: G */
    public CameraCharacteristics f304697G;

    /* renamed from: H */
    public C103330b f304698H;

    /* renamed from: I */
    public Rect f304699I;

    /* renamed from: J */
    public boolean f304700J;

    /* renamed from: K */
    public boolean f304701K;

    /* renamed from: L */
    public Surface f304702L;

    /* renamed from: M */
    public Rect f304703M;

    /* renamed from: N */
    public float[] f304704N;

    /* renamed from: O */
    public ImageReader f304705O;

    /* renamed from: P */
    public final C103337e f304706P;

    /* renamed from: Q */
    public final C103335c f304707Q;

    /* renamed from: R */
    public int f304708R;

    /* renamed from: S */
    public C32226l<? super Boolean, C13598b0> f304709S;

    /* renamed from: T */
    public final CameraCaptureSession.CaptureCallback f304710T;

    /* renamed from: U */
    public int f304711U;

    /* renamed from: x */
    public final String f304712x = "MicroMsg.CommonCamera2";

    /* renamed from: y */
    public final String f304713y = "MicroMsg.CommonCamera2.FoucsTag";

    /* renamed from: z */
    public float f304714z = 0.1f;

    /* renamed from: a90.d$a */
    public static final class C103333a extends C87413o implements C32228q<ArrayList<C104325a>, ArrayList<C107026a>, ArrayList<C107267a>, C13598b0> {

        /* renamed from: d */
        public static final C103333a f304715d = new C103333a();

        public C103333a() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            ArrayList<C104325a> arrayList = (ArrayList) obj;
            ArrayList<C107026a> arrayList2 = (ArrayList) obj2;
            ArrayList<C107267a> arrayList3 = (ArrayList) obj3;
            C87412m.m108594g(arrayList, "request");
            C87412m.m108594g(arrayList2, "result");
            C87412m.m108594g(arrayList3, "sessionType");
            C103331c.f304688q = arrayList;
            C103331c.f304689r = arrayList2;
            C103331c.f304690s = arrayList3;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a90.d$b */
    public static final class C103334b extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a */
        public final /* synthetic */ C103332d f304716a;

        public C103334b(C103332d dVar) {
            this.f304716a = dVar;
        }

        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            C87412m.m108594g(cameraCaptureSession, "session");
            C87412m.m108594g(captureRequest, "request");
            C87412m.m108594g(totalCaptureResult, "result");
            C103331c cVar = C103331c.f304672a;
            CaptureRequest.Builder builder = this.f304716a.f304694D;
            C87412m.m108591d(builder);
            cVar.mo143138e(builder);
        }
    }

    /* renamed from: a90.d$c */
    public static final class C103335c extends C103339e {

        /* renamed from: a */
        public final /* synthetic */ C103332d f304717a;

        public C103335c(C103332d dVar) {
            this.f304717a = dVar;
        }

        public void onDisconnected(CameraDevice cameraDevice) {
            C87412m.m108594g(cameraDevice, "camera");
            this.f304717a.f304691A.release();
            cameraDevice.close();
            this.f304717a.f304693C = null;
        }

        public void onError(CameraDevice cameraDevice, int i) {
            C87412m.m108594g(cameraDevice, "camera");
            onDisconnected(cameraDevice);
        }

        public void onOpened(CameraDevice cameraDevice) {
            C87412m.m108594g(cameraDevice, "camera");
            this.f304717a.f304691A.release();
            this.f304717a.f304693C = cameraDevice;
        }
    }

    /* renamed from: a90.d$d */
    public static final class C103336d extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a */
        public final /* synthetic */ C103332d f304718a;

        public C103336d(C103332d dVar) {
            this.f304718a = dVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: android.hardware.camera2.CaptureRequest} */
        /* JADX WARNING: type inference failed for: r1v0 */
        /* JADX WARNING: type inference failed for: r1v12 */
        /* JADX WARNING: type inference failed for: r1v13 */
        /* JADX WARNING: type inference failed for: r1v14 */
        /* JADX WARNING: type inference failed for: r1v15 */
        /* JADX WARNING: type inference failed for: r1v16 */
        /* JADX WARNING: type inference failed for: r1v17 */
        /* JADX WARNING: type inference failed for: r1v18 */
        /* JADX WARNING: type inference failed for: r1v19 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:122:0x01e8  */
        /* JADX WARNING: Removed duplicated region for block: B:147:0x0243  */
        /* JADX WARNING: Removed duplicated region for block: B:185:0x01de A[EDGE_INSN: B:185:0x01de->B:117:0x01de ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:189:0x0238 A[EDGE_INSN: B:189:0x0238->B:142:0x0238 ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:208:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo143193a(android.hardware.camera2.CaptureResult r10) {
            /*
                r9 = this;
                a90.d r0 = r9.f304718a
                int r0 = r0.f304708R
                r1 = 0
                r2 = 0
                r3 = 1
                r4 = 2
                if (r0 == 0) goto L_0x017b
                r5 = 4
                r6 = 5
                if (r0 == r3) goto L_0x00f4
                r7 = 3
                if (r0 == r4) goto L_0x00d8
                if (r0 == r7) goto L_0x00c1
                if (r0 == r6) goto L_0x0017
                goto L_0x0312
            L_0x0017:
                android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AF_STATE
                java.lang.Object r0 = r10.get(r0)
                java.lang.Integer r0 = (java.lang.Integer) r0
                if (r0 != 0) goto L_0x0022
                goto L_0x0028
            L_0x0022:
                int r7 = r0.intValue()
                if (r7 == r5) goto L_0x0032
            L_0x0028:
                if (r0 != 0) goto L_0x002c
                goto L_0x0312
            L_0x002c:
                int r0 = r0.intValue()
                if (r0 != r6) goto L_0x0312
            L_0x0032:
                a90.d r0 = r9.f304718a
                boolean r0 = r0.mo164109B()
                if (r0 == 0) goto L_0x00b6
                a90.d r0 = r9.f304718a
                boolean r5 = r0.f304700J
                if (r5 != 0) goto L_0x00b6
                java.lang.String r0 = r0.f304713y
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "STATE_TOUCH_FOCUSING and state is  "
                r5.append(r6)
                android.hardware.camera2.CaptureResult$Key r6 = android.hardware.camera2.CaptureResult.CONTROL_AF_STATE
                java.lang.Object r10 = r10.get(r6)
                r5.append(r10)
                java.lang.String r10 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r10)
                a90.d r10 = r9.f304718a
                android.hardware.camera2.CaptureRequest$Builder r10 = r10.f304694D
                if (r10 == 0) goto L_0x006b
                android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r10.set(r0, r4)
            L_0x006b:
                a90.d r10 = r9.f304718a
                android.hardware.camera2.CaptureRequest$Builder r10 = r10.f304694D
                if (r10 == 0) goto L_0x007a
                android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER
                java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
                r10.set(r0, r4)
            L_0x007a:
                a90.d r10 = r9.f304718a
                android.hardware.camera2.CaptureRequest$Builder r0 = r10.f304694D
                if (r0 == 0) goto L_0x0085
                android.hardware.camera2.CaptureRequest r0 = r0.build()
                goto L_0x0086
            L_0x0085:
                r0 = r1
            L_0x0086:
                gy3.C87412m.m108591d(r0)
                r10.f304696F = r0
                a90.d r10 = r9.f304718a     // Catch:{ CameraAccessException -> 0x00a3 }
                android.hardware.camera2.CameraCaptureSession r0 = r10.f304695E     // Catch:{ CameraAccessException -> 0x00a3 }
                if (r0 == 0) goto L_0x00ac
                android.hardware.camera2.CaptureRequest r4 = r10.f304696F     // Catch:{ CameraAccessException -> 0x00a3 }
                if (r4 == 0) goto L_0x009d
                z80.a r10 = r10.f336531e     // Catch:{ CameraAccessException -> 0x00a3 }
                android.os.Handler r10 = r10.f337229d     // Catch:{ CameraAccessException -> 0x00a3 }
                r0.setRepeatingRequest(r4, r9, r10)     // Catch:{ CameraAccessException -> 0x00a3 }
                goto L_0x00ac
            L_0x009d:
                java.lang.String r10 = "previewRequest"
                gy3.C87412m.m108603p(r10)     // Catch:{ CameraAccessException -> 0x00a3 }
                throw r1     // Catch:{ CameraAccessException -> 0x00a3 }
            L_0x00a3:
                a90.d r10 = r9.f304718a
                java.lang.String r10 = r10.f304712x
                java.lang.String r0 = "setRepeatingRequest failed, errMsg: "
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            L_0x00ac:
                a90.d r10 = r9.f304718a
                z80.a r0 = r10.f336531e
                r0.f337237l = r3
                r10.f304708R = r2
                goto L_0x0312
            L_0x00b6:
                a90.d r10 = r9.f304718a
                java.lang.String r10 = r10.f304712x
                java.lang.String r0 = "current is not allowed to do anything casue capturing"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
                goto L_0x0312
            L_0x00c1:
                android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AE_STATE
                java.lang.Object r10 = r10.get(r0)
                java.lang.Integer r10 = (java.lang.Integer) r10
                if (r10 == 0) goto L_0x00d1
                int r10 = r10.intValue()
                if (r10 == r6) goto L_0x0312
            L_0x00d1:
                a90.d r10 = r9.f304718a
                r10.mo143147L()
                goto L_0x0312
            L_0x00d8:
                android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AE_STATE
                java.lang.Object r10 = r10.get(r0)
                java.lang.Integer r10 = (java.lang.Integer) r10
                if (r10 == 0) goto L_0x00ee
                int r0 = r10.intValue()
                if (r0 == r6) goto L_0x00ee
                int r10 = r10.intValue()
                if (r10 != r5) goto L_0x0312
            L_0x00ee:
                a90.d r10 = r9.f304718a
                r10.f304708R = r7
                goto L_0x0312
            L_0x00f4:
                android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AF_STATE
                java.lang.Object r0 = r10.get(r0)
                java.lang.Integer r0 = (java.lang.Integer) r0
                if (r0 == 0) goto L_0x0174
                int r2 = r0.intValue()
                if (r4 == r2) goto L_0x0174
                r2 = 6
                int r7 = r0.intValue()
                if (r2 != r7) goto L_0x010c
                goto L_0x0174
            L_0x010c:
                int r2 = r0.intValue()
                if (r5 == r2) goto L_0x0118
                int r0 = r0.intValue()
                if (r6 != r0) goto L_0x0312
            L_0x0118:
                android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AE_STATE
                java.lang.Object r10 = r10.get(r0)
                java.lang.Integer r10 = (java.lang.Integer) r10
                if (r10 == 0) goto L_0x016d
                int r10 = r10.intValue()
                if (r10 != r4) goto L_0x0129
                goto L_0x016d
            L_0x0129:
                a90.d r10 = r9.f304718a
                boolean r0 = r10.f304700J
                if (r0 != 0) goto L_0x0164
                android.hardware.camera2.CaptureRequest$Builder r0 = r10.f304694D     // Catch:{ CameraAccessException -> 0x0158 }
                if (r0 == 0) goto L_0x013c
                android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER     // Catch:{ CameraAccessException -> 0x0158 }
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ CameraAccessException -> 0x0158 }
                r0.set(r2, r3)     // Catch:{ CameraAccessException -> 0x0158 }
            L_0x013c:
                r10.f304708R = r4     // Catch:{ CameraAccessException -> 0x0158 }
                android.hardware.camera2.CameraCaptureSession r0 = r10.f304695E     // Catch:{ CameraAccessException -> 0x0158 }
                if (r0 == 0) goto L_0x0312
                android.hardware.camera2.CaptureRequest$Builder r2 = r10.f304694D     // Catch:{ CameraAccessException -> 0x0158 }
                if (r2 == 0) goto L_0x014a
                android.hardware.camera2.CaptureRequest r1 = r2.build()     // Catch:{ CameraAccessException -> 0x0158 }
            L_0x014a:
                gy3.C87412m.m108591d(r1)     // Catch:{ CameraAccessException -> 0x0158 }
                android.hardware.camera2.CameraCaptureSession$CaptureCallback r2 = r10.f304710T     // Catch:{ CameraAccessException -> 0x0158 }
                z80.a r3 = r10.f336531e     // Catch:{ CameraAccessException -> 0x0158 }
                android.os.Handler r3 = r3.f337229d     // Catch:{ CameraAccessException -> 0x0158 }
                r0.capture(r1, r2, r3)     // Catch:{ CameraAccessException -> 0x0158 }
                goto L_0x0312
            L_0x0158:
                r0 = move-exception
                java.lang.String r10 = r10.f304712x
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
                goto L_0x0312
            L_0x0164:
                java.lang.String r10 = r10.f304712x
                java.lang.String r0 = "capture session has been close, abandon this capture"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
                goto L_0x0312
            L_0x016d:
                a90.d r10 = r9.f304718a
                r10.mo143147L()
                goto L_0x0312
            L_0x0174:
                a90.d r10 = r9.f304718a
                r10.mo143147L()
                goto L_0x0312
            L_0x017b:
                a90.c r0 = a90.C103331c.f304672a
                java.lang.String r0 = "result"
                gy3.C87412m.m108594g(r10, r0)
                java.util.ArrayList<d90.a> r0 = a90.C103331c.f304689r
                if (r0 == 0) goto L_0x0312
                boolean r0 = a90.C103331c.f304679h
                if (r0 == 0) goto L_0x0312
                java.lang.String r0 = a90.C103331c.f304674c
                gy3.C87412m.m108591d(r0)
                java.util.ArrayList<d90.a> r5 = a90.C103331c.f304689r
                java.lang.String r6 = "0"
                boolean r0 = gy3.C87412m.m108589b(r0, r6)
                if (r0 == 0) goto L_0x019a
                r4 = 1
            L_0x019a:
                java.lang.String r0 = "cameraeffect.result.hdrdetected"
                if (r5 == 0) goto L_0x01e5
                java.util.Iterator r5 = r5.iterator()
            L_0x01a2:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto L_0x01dd
                java.lang.Object r6 = r5.next()
                r7 = r6
                d90.a r7 = (d90.C107026a) r7
                java.lang.String r8 = r7.f320424f
                boolean r8 = gy3.C87412m.m108589b(r8, r0)
                if (r8 == 0) goto L_0x01d9
                java.lang.Integer r8 = r7.f320425g
                if (r8 == 0) goto L_0x01c4
                int r8 = r8.intValue()
                r8 = r8 & r4
                if (r8 != 0) goto L_0x01c4
                r8 = 1
                goto L_0x01c5
            L_0x01c4:
                r8 = 0
            L_0x01c5:
                if (r8 != 0) goto L_0x01d9
                java.lang.Integer r7 = r7.f320427i
                if (r7 == 0) goto L_0x01d4
                int r7 = r7.intValue()
                r7 = r7 & r3
                if (r7 != 0) goto L_0x01d4
                r7 = 1
                goto L_0x01d5
            L_0x01d4:
                r7 = 0
            L_0x01d5:
                if (r7 != 0) goto L_0x01d9
                r7 = 1
                goto L_0x01da
            L_0x01d9:
                r7 = 0
            L_0x01da:
                if (r7 == 0) goto L_0x01a2
                goto L_0x01de
            L_0x01dd:
                r6 = r1
            L_0x01de:
                d90.a r6 = (d90.C107026a) r6
                if (r6 != 0) goto L_0x01e3
                goto L_0x01e5
            L_0x01e3:
                r4 = 1
                goto L_0x01e6
            L_0x01e5:
                r4 = 0
            L_0x01e6:
                if (r4 == 0) goto L_0x0312
                d90.b r4 = new d90.b
                java.lang.String r5 = a90.C103331c.f304674c
                gy3.C87412m.m108591d(r5)
                java.util.ArrayList<d90.a> r6 = a90.C103331c.f304689r
                r4.<init>(r10, r5, r6)
                android.hardware.camera2.CaptureResult r10 = r4.f320429a
                android.hardware.camera2.CaptureResult$Key r5 = r4.mo157458a(r0)
                java.lang.Object r10 = r10.get(r5)
                if (r10 != 0) goto L_0x0202
                goto L_0x02eb
            L_0x0202:
                java.util.ArrayList<d90.a> r10 = r4.f320430b
                if (r10 == 0) goto L_0x0240
                java.util.Iterator r10 = r10.iterator()
            L_0x020a:
                boolean r5 = r10.hasNext()
                if (r5 == 0) goto L_0x0237
                java.lang.Object r5 = r10.next()
                r6 = r5
                d90.a r6 = (d90.C107026a) r6
                java.lang.String r7 = r6.f320424f
                boolean r7 = gy3.C87412m.m108589b(r7, r0)
                if (r7 == 0) goto L_0x0233
                java.lang.Integer r6 = r6.f320425g
                if (r6 == 0) goto L_0x022e
                int r6 = r6.intValue()
                int r7 = r4.f320431c
                r6 = r6 & r7
                if (r6 != 0) goto L_0x022e
                r6 = 1
                goto L_0x022f
            L_0x022e:
                r6 = 0
            L_0x022f:
                if (r6 != 0) goto L_0x0233
                r6 = 1
                goto L_0x0234
            L_0x0233:
                r6 = 0
            L_0x0234:
                if (r6 == 0) goto L_0x020a
                goto L_0x0238
            L_0x0237:
                r5 = r1
            L_0x0238:
                d90.a r5 = (d90.C107026a) r5
                if (r5 != 0) goto L_0x023d
                goto L_0x0240
            L_0x023d:
                java.lang.String r10 = r5.f320428j
                goto L_0x0241
            L_0x0240:
                r10 = r1
            L_0x0241:
                if (r10 == 0) goto L_0x02eb
                int r5 = r10.hashCode()
                switch(r5) {
                    case -1808118735: goto L_0x02bc;
                    case 73679: goto L_0x0293;
                    case 2086184: goto L_0x026a;
                    case 1729365000: goto L_0x024c;
                    default: goto L_0x024a;
                }
            L_0x024a:
                goto L_0x02eb
            L_0x024c:
                java.lang.String r5 = "Boolean"
                boolean r10 = r10.equals(r5)
                if (r10 != 0) goto L_0x0256
                goto L_0x02eb
            L_0x0256:
                android.hardware.camera2.CaptureResult r10 = r4.f320429a
                android.hardware.camera2.CaptureResult$Key r0 = r4.mo157458a(r0)
                java.lang.Object r10 = r10.get(r0)
                java.lang.String r0 = "null cannot be cast to non-null type kotlin.Boolean"
                gy3.C87412m.m108592e(r10, r0)
                r1 = r10
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                goto L_0x02eb
            L_0x026a:
                java.lang.String r5 = "Byte"
                boolean r10 = r10.equals(r5)
                if (r10 != 0) goto L_0x0274
                goto L_0x02eb
            L_0x0274:
                android.hardware.camera2.CaptureResult r10 = r4.f320429a
                android.hardware.camera2.CaptureResult$Key r0 = r4.mo157458a(r0)
                java.lang.Object r10 = r10.get(r0)
                java.lang.String r0 = "null cannot be cast to non-null type kotlin.Byte"
                gy3.C87412m.m108592e(r10, r0)
                java.lang.Byte r10 = (java.lang.Byte) r10
                byte r10 = r10.byteValue()
                if (r10 != 0) goto L_0x028e
                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                goto L_0x02eb
            L_0x028e:
                if (r10 != r3) goto L_0x02eb
                java.lang.Boolean r1 = java.lang.Boolean.TRUE
                goto L_0x02eb
            L_0x0293:
                java.lang.String r5 = "Int"
                boolean r10 = r10.equals(r5)
                if (r10 != 0) goto L_0x029c
                goto L_0x02eb
            L_0x029c:
                android.hardware.camera2.CaptureResult r10 = r4.f320429a
                android.hardware.camera2.CaptureResult$Key r0 = r4.mo157458a(r0)
                java.lang.Object r10 = r10.get(r0)
                java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
                gy3.C87412m.m108592e(r10, r0)
                java.lang.Integer r10 = (java.lang.Integer) r10
                int r10 = r10.intValue()
                if (r10 == 0) goto L_0x02b9
                if (r10 == r3) goto L_0x02b6
                goto L_0x02eb
            L_0x02b6:
                java.lang.Boolean r1 = java.lang.Boolean.TRUE
                goto L_0x02eb
            L_0x02b9:
                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                goto L_0x02eb
            L_0x02bc:
                java.lang.String r5 = "String"
                boolean r10 = r10.equals(r5)
                if (r10 != 0) goto L_0x02c5
                goto L_0x02eb
            L_0x02c5:
                android.hardware.camera2.CaptureResult r10 = r4.f320429a
                android.hardware.camera2.CaptureResult$Key r0 = r4.mo157458a(r0)
                java.lang.Object r10 = r10.get(r0)
                java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
                gy3.C87412m.m108592e(r10, r0)
                java.lang.String r10 = (java.lang.String) r10
                java.lang.String r0 = "false"
                boolean r0 = gy3.C87412m.m108589b(r10, r0)
                if (r0 == 0) goto L_0x02e1
                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                goto L_0x02eb
            L_0x02e1:
                java.lang.String r0 = "true"
                boolean r10 = gy3.C87412m.m108589b(r10, r0)
                if (r10 == 0) goto L_0x02eb
                java.lang.Boolean r1 = java.lang.Boolean.TRUE
            L_0x02eb:
                java.lang.Boolean r10 = a90.C103331c.f304687p
                boolean r10 = gy3.C87412m.m108589b(r10, r1)
                if (r10 != 0) goto L_0x0312
                if (r1 == 0) goto L_0x0312
                a90.C103331c.f304687p = r1
                fy3.l<? super java.lang.Boolean, rx3.b0> r10 = a90.C103331c.f304686o
                if (r10 == 0) goto L_0x02fe
                r10.invoke(r1)
            L_0x02fe:
                java.lang.Boolean r10 = a90.C103331c.f304687p
                gy3.C87412m.m108591d(r10)
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto L_0x030e
                a90.C103331c.f304677f = r3
                a90.C103331c.f304678g = r2
                goto L_0x0312
            L_0x030e:
                a90.C103331c.f304677f = r2
                a90.C103331c.f304678g = r3
            L_0x0312:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: a90.C103332d.C103336d.mo143193a(android.hardware.camera2.CaptureResult):void");
        }

        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            C87412m.m108594g(cameraCaptureSession, "session");
            C87412m.m108594g(captureRequest, "request");
            C87412m.m108594g(totalCaptureResult, "result");
            mo143193a(totalCaptureResult);
        }

        public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            C87412m.m108594g(cameraCaptureSession, "session");
            C87412m.m108594g(captureRequest, "request");
            C87412m.m108594g(captureResult, "partialResult");
            mo143193a(captureResult);
        }
    }

    /* renamed from: a90.d$e */
    public static final class C103337e extends CameraCaptureSession.StateCallback {

        /* renamed from: a */
        public final /* synthetic */ C103332d f304719a;

        public C103337e(C103332d dVar) {
            this.f304719a = dVar;
        }

        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            C87412m.m108594g(cameraCaptureSession, "session");
            super.onClosed(cameraCaptureSession);
            Log.m105924i(this.f304719a.f304712x, "session on close");
            this.f304719a.f304700J = true;
        }

        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            C87412m.m108594g(cameraCaptureSession, "session");
            Log.m105924i(this.f304719a.f304712x, "configure failed ");
            Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markCameraOpenFailed");
            C115669n.INSTANCE.mo175913w(985, 5, 1);
            Log.m105924i("MicroMsg.Camera2ProcessIDKeyStat", "markCamera2OpenFailed");
            C115669n.INSTANCE.mo175913w(1099, 2, 1);
        }

        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            C87412m.m108594g(cameraCaptureSession, "session");
            Log.m105924i(this.f304719a.f304712x, "session on onConfigured");
            C103332d dVar = this.f304719a;
            if (dVar.f304693C != null) {
                dVar.f304700J = false;
                dVar.f304695E = cameraCaptureSession;
                Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markCameraOpenSuccess");
                C115669n nVar = C115669n.INSTANCE;
                nVar.mo175913w(985, 4, 1);
                Log.m105924i("MicroMsg.Camera2ProcessIDKeyStat", "markCamera2OpenSuccess");
                nVar.mo175913w(1099, 1, 1);
                C103332d dVar2 = this.f304719a;
                dVar2.getClass();
                try {
                    CaptureRequest.Builder builder = dVar2.f304694D;
                    C87412m.m108591d(builder);
                    CaptureRequest build = builder.build();
                    C87412m.m108593f(build, "mPreviewBuilder!!.build()");
                    dVar2.f304696F = build;
                    CameraCaptureSession cameraCaptureSession2 = dVar2.f304695E;
                    if (cameraCaptureSession2 != null) {
                        cameraCaptureSession2.setRepeatingRequest(build, dVar2.f304710T, dVar2.f336531e.f337229d);
                    }
                } catch (CameraAccessException unused) {
                }
            }
        }
    }

    /* renamed from: a90.d$f */
    public static final class C103338f<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C65486b.m77169a(Integer.valueOf(((Size) t2).getWidth()), Integer.valueOf(((Size) t).getWidth()));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.append(0, 90);
        sparseIntArray.append(1, 0);
        sparseIntArray.append(2, 270);
        sparseIntArray.append(3, 180);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0022, code lost:
        r0 = r0.f322672u;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C103332d(android.content.Context r6) {
        /*
            r5 = this;
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r6, r0)
            r5.<init>(r6)
            java.lang.String r0 = "MicroMsg.CommonCamera2"
            r5.f304712x = r0
            java.lang.String r0 = "MicroMsg.CommonCamera2.FoucsTag"
            r5.f304713y = r0
            r0 = 1036831949(0x3dcccccd, float:0.1)
            r5.f304714z = r0
            java.util.concurrent.Semaphore r0 = new java.util.concurrent.Semaphore
            r1 = 1
            r0.<init>(r1)
            r5.f304691A = r0
            gj.b0 r0 = p156gj.C107835h0.f322852i
            r2 = 0
            if (r0 == 0) goto L_0x002b
            int r0 = r0.f322672u
            r3 = -1
            if (r0 == r3) goto L_0x002b
            if (r0 != r1) goto L_0x002b
            r0 = 1
            goto L_0x002c
        L_0x002b:
            r0 = 0
        L_0x002c:
            if (r0 == 0) goto L_0x0063
            b90.e r0 = new b90.e
            r0.<init>(r6)
            a90.d$a r6 = a90.C103332d.C103333a.f304715d
            java.lang.String r3 = "mSupportWCKeyAvailable"
            gy3.C87412m.m108594g(r6, r3)
            b90.d r3 = new b90.d
            r3.<init>(r0, r6)
            java.lang.Thread r6 = new java.lang.Thread
            b90.c r4 = new b90.c
            r4.<init>(r0, r3)
            r6.<init>(r4)
            r6.start()
            a90.c r6 = a90.C103331c.f304672a
            a90.C103331c.f304677f = r1
            a90.C103331c.f304678g = r2
            a90.C103331c.f304679h = r1
            a90.C103331c.f304681j = r1
            r6 = 0
            a90.C103331c.f304682k = r6
            r0 = 40
            a90.C103331c.f304683l = r0
            a90.C103331c.f304684m = r0
            a90.C103331c.f304685n = r2
            a90.C103331c.f304687p = r6
        L_0x0063:
            a90.d$e r6 = new a90.d$e
            r6.<init>(r5)
            r5.f304706P = r6
            a90.d$c r6 = new a90.d$c
            r6.<init>(r5)
            r5.f304707Q = r6
            a90.d$d r6 = new a90.d$d
            r6.<init>(r5)
            r5.f304710T = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a90.C103332d.<init>(android.content.Context):void");
    }

    /* renamed from: A */
    public boolean mo143140A(Rect rect, Rect rect2) {
        int i;
        CameraCaptureSession cameraCaptureSession;
        CaptureRequest.Builder builder;
        CaptureRequest.Builder builder2;
        C87412m.m108594g(rect, "focusArea");
        C87412m.m108594g(rect2, "meteringArea");
        Log.m105925i(this.f304712x, "focus on area :: focus rect %s, meter rect %s", rect, rect2);
        if (mo164109B()) {
            CameraCharacteristics cameraCharacteristics = this.f304697G;
            int[] iArr = cameraCharacteristics != null ? (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES) : null;
            if (iArr != null) {
                int length = iArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        i = iArr[0];
                        break;
                    } else if (iArr[i2] == 1) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            i = 1;
            CaptureRequest.Builder builder3 = this.f304694D;
            if (builder3 != null) {
                builder3.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(i));
            }
            CaptureRequest.Builder builder4 = this.f304694D;
            if (builder4 != null) {
                builder4.set(CaptureRequest.CONTROL_MODE, 1);
            }
            if (mo143150O(true) && (builder2 = this.f304694D) != null) {
                builder2.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, 1000)});
            }
            if (mo143150O(false) && (builder = this.f304694D) != null) {
                builder.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect2, 1000)});
            }
            CaptureRequest.Builder builder5 = this.f304694D;
            if (builder5 != null) {
                builder5.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
            }
            try {
                if (!this.f304700J && (cameraCaptureSession = this.f304695E) != null) {
                    CaptureRequest.Builder builder6 = this.f304694D;
                    C87412m.m108591d(builder6);
                    cameraCaptureSession.setRepeatingRequest(builder6.build(), (CameraCaptureSession.CaptureCallback) null, this.f336531e.f337229d);
                }
            } catch (CameraAccessException e) {
                e.getMessage();
            } catch (IllegalStateException e2) {
                e2.getMessage();
            }
            CaptureRequest.Builder builder7 = this.f304694D;
            if (builder7 != null) {
                builder7.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
            }
            try {
                if (!this.f304700J) {
                    Log.m105924i(this.f304713y, "params set and try focus");
                    CameraCaptureSession cameraCaptureSession2 = this.f304695E;
                    if (cameraCaptureSession2 != null) {
                        CaptureRequest.Builder builder8 = this.f304694D;
                        C87412m.m108591d(builder8);
                        cameraCaptureSession2.setRepeatingRequest(builder8.build(), this.f304710T, this.f336531e.f337229d);
                    }
                    this.f304708R = 5;
                } else {
                    Log.m105924i(this.f304713y, "something happened casue focus no request");
                    Log.m105920e(this.f304712x, "this has been camera session close");
                    return false;
                }
            } catch (CameraAccessException unused) {
                Log.m105920e(this.f304712x, "setRepeatingRequest failed, ");
                return false;
            }
        }
        return true;
    }

    /* renamed from: C */
    public boolean mo143141C() {
        C103331c cVar = C103331c.f304672a;
        int i = C103331c.f304675d;
        return i == 90 || i == 270;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        r2 = r3.getCameraCharacteristics(r2);
     */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Size[] mo143142E() {
        /*
            r4 = this;
            r0 = 0
            android.hardware.camera2.CameraManager r1 = r4.f304692B     // Catch:{ Exception -> 0x0043 }
            if (r1 == 0) goto L_0x0011
            a90.c r2 = a90.C103331c.f304672a     // Catch:{ Exception -> 0x0043 }
            java.lang.String r2 = a90.C103331c.f304674c     // Catch:{ Exception -> 0x0043 }
            gy3.C87412m.m108591d(r2)     // Catch:{ Exception -> 0x0043 }
            android.hardware.camera2.CameraCharacteristics r1 = r1.getCameraCharacteristics(r2)     // Catch:{ Exception -> 0x0043 }
            goto L_0x0012
        L_0x0011:
            r1 = r0
        L_0x0012:
            r4.f304697G = r1     // Catch:{ Exception -> 0x0043 }
            a90.c r1 = a90.C103331c.f304672a
            java.lang.String r2 = a90.C103331c.f304674c
            if (r2 != 0) goto L_0x001f
            r2 = 1
            java.lang.String r2 = r1.mo143135b(r2)
        L_0x001f:
            android.hardware.camera2.CameraManager r3 = a90.C103331c.f304673b
            if (r3 == 0) goto L_0x0032
            android.hardware.camera2.CameraCharacteristics r2 = r3.getCameraCharacteristics(r2)
            if (r2 == 0) goto L_0x0032
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP
            java.lang.Object r2 = r2.get(r3)
            android.hardware.camera2.params.StreamConfigurationMap r2 = (android.hardware.camera2.params.StreamConfigurationMap) r2
            goto L_0x0033
        L_0x0032:
            r2 = r0
        L_0x0033:
            if (r2 == 0) goto L_0x003b
            java.lang.Class<android.graphics.SurfaceTexture> r0 = android.graphics.SurfaceTexture.class
            android.util.Size[] r0 = r2.getOutputSizes(r0)
        L_0x003b:
            gy3.C87412m.m108591d(r0)
            java.lang.String r2 = "preview"
            r1.mo143137d(r0, r2)
        L_0x0043:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a90.C103332d.mo143142E():android.util.Size[]");
    }

    /* renamed from: F */
    public boolean mo143143F(int i) {
        try {
            super.mo143143F(i);
            boolean C = mo143141C();
            Point D = mo164110D();
            C103331c cVar = C103331c.f304672a;
            C108383i.C108387d b = C108383i.m146828b(cVar.mo143136c(), D, i, C);
            if (b.f324531a == null) {
                b = C108383i.m146833g(cVar.mo143136c(), new Point(Math.min(mo164110D().x, mo164110D().y), Math.max(mo164110D().x, mo164110D().y)), this.f336530d, C);
            }
            if (b.f324531a == null) {
                Log.m105924i("MicroMsg.Camera2ProcessIDKeyStat", "markErrorFindImage");
                C115669n.INSTANCE.mo175913w(1099, 12, 1);
                Log.m105925i(this.f304712x, "checkMore start %s", b.toString());
                b.f324531a = b.f324534d;
                b.f324532b = b.f324535e;
                b.f324533c = b.f324536f;
            }
            C103331c.f304676e = D;
            Point point = b.f324531a;
            Size size = new Size(point.x, point.y);
            ImageReader newInstance = ImageReader.newInstance(size.getWidth(), size.getHeight(), 35, 1);
            C112609a aVar = this.f336531e;
            newInstance.setOnImageAvailableListener(aVar.f337239n, aVar.f337229d);
            this.f304705O = newInstance;
            return true;
        } catch (CameraAccessException e) {
            Log.printErrStackTrace(this.f304712x, e, "selectNoCropPreviewSize Exception by camera access exception, %s, %s", Looper.myLooper(), e.getMessage());
            return false;
        } catch (Exception e2) {
            Log.printErrStackTrace(this.f304712x, e2, "selectNoCropPreviewSize Exception, %s, %s", Looper.myLooper(), e2.getMessage());
            return false;
        }
    }

    /* renamed from: G */
    public boolean mo143144G(int i, int i2) {
        try {
            SurfaceTexture surfaceTexture = this.f336540n;
            C87412m.m108591d(surfaceTexture);
            surfaceTexture.setDefaultBufferSize(i, i2);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: J */
    public void mo143145J(SurfaceHolder surfaceHolder, boolean z, int i) {
        this.f304691A.acquire();
        this.f304691A.release();
        this.f336541o = surfaceHolder;
        this.f336535i = z;
        this.f336542p = i;
        mo143158W((SurfaceTexture) null, surfaceHolder, i);
    }

    /* renamed from: K */
    public final void mo143146K() {
        mo143154S(this.f304697G);
        CaptureRequest.Builder builder = this.f304694D;
        if (builder != null) {
            builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
        }
        CaptureRequest.Builder builder2 = this.f304694D;
        if (builder2 != null) {
            builder2.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
        }
        CaptureRequest.Builder builder3 = this.f304694D;
        if (builder3 != null) {
            builder3.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 0);
        }
        CaptureRequest.Builder builder4 = this.f304694D;
        CaptureRequest build = builder4 != null ? builder4.build() : null;
        C87412m.m108591d(build);
        this.f304696F = build;
        if (!this.f304700J) {
            try {
                CameraCaptureSession cameraCaptureSession = this.f304695E;
                if (cameraCaptureSession != null) {
                    cameraCaptureSession.setRepeatingRequest(build, this.f304710T, this.f336531e.f337229d);
                }
            } catch (CameraAccessException unused) {
                Log.m105920e(this.f304712x, "setRepeatingRequest failed, errMsg: ");
            }
        }
        this.f304708R = 0;
    }

    /* renamed from: L */
    public final void mo143147L() {
        try {
            if (this.f304708R == 4) {
                Log.printInfoStack(this.f304712x, "capture still picture more than twice", new Object[0]);
                return;
            }
            this.f304708R = 4;
            Log.m105924i(this.f304712x, "captureStillPicture");
            if (this.f304693C != null) {
                CaptureRequest.Builder builder = this.f304694D;
                Rect rect = builder != null ? (Rect) builder.get(CaptureRequest.SCALER_CROP_REGION) : null;
                CameraDevice cameraDevice = this.f304693C;
                if (cameraDevice == null) {
                    return;
                }
                if (!this.f304700J) {
                    CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(2);
                    if (createCaptureRequest != null) {
                        createCaptureRequest.set(CaptureRequest.SCALER_CROP_REGION, rect);
                        ImageReader imageReader = this.f304705O;
                        Surface surface = imageReader != null ? imageReader.getSurface() : null;
                        C87412m.m108591d(surface);
                        createCaptureRequest.addTarget(surface);
                        ImageReader imageReader2 = this.f304705O;
                        if (imageReader2 != null) {
                            C112609a aVar = this.f336531e;
                            imageReader2.setOnImageAvailableListener(aVar.f337239n, aVar.f337229d);
                        }
                        mo143151P(createCaptureRequest);
                        createCaptureRequest.set(CaptureRequest.CONTROL_AF_MODE, 4);
                        mo143155T(createCaptureRequest);
                    } else {
                        createCaptureRequest = null;
                    }
                    this.f304694D = createCaptureRequest;
                    CameraCaptureSession cameraCaptureSession = this.f304695E;
                    if (cameraCaptureSession != null) {
                        cameraCaptureSession.stopRepeating();
                        Log.m105924i(this.f304713y, "this time happened a cancel auto foucs while capture");
                        CaptureRequest.Builder builder2 = this.f304694D;
                        if (builder2 != null) {
                            builder2.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                        }
                        CaptureRequest.Builder builder3 = this.f304694D;
                        CaptureRequest build = builder3 != null ? builder3.build() : null;
                        C87412m.m108591d(build);
                        cameraCaptureSession.capture(build, new C103334b(this), (Handler) null);
                    }
                }
            }
        } catch (Exception e) {
            if (!C87412m.m108589b(C103331c.f304674c, C103331c.f304672a.mo143135b(1))) {
                Log.m105924i("MicroMsg.Camera2ProcessIDKeyStat", "markCamera2TakePhotoBackError");
                C86869a.INSTANCE.mo121330b(1099, 7, 1);
            }
            Log.m105920e(this.f304712x, e.toString());
        }
    }

    /* renamed from: M */
    public final void mo143148M() {
        try {
            CaptureRequest.Builder builder = this.f304694D;
            if (builder != null) {
                C103331c cVar = C103331c.f304672a;
                C87412m.m108591d(builder);
                cVar.mo143138e(builder);
            }
            this.f304691A.acquire();
            CameraCaptureSession cameraCaptureSession = this.f304695E;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.close();
            }
            this.f304695E = null;
            CameraDevice cameraDevice = this.f304693C;
            if (cameraDevice != null) {
                cameraDevice.close();
            }
            this.f304693C = null;
            ImageReader imageReader = this.f304705O;
            if (imageReader != null) {
                imageReader.setOnImageAvailableListener((ImageReader.OnImageAvailableListener) null, this.f336531e.f337229d);
            }
            ImageReader imageReader2 = this.f304705O;
            if (imageReader2 != null) {
                imageReader2.close();
            }
            this.f304705O = null;
            this.f304691A.release();
        } catch (InterruptedException e) {
            throw new RuntimeException("Interrupt while trying to lock camera closing", e);
        } catch (Throwable th) {
            this.f304691A.release();
            throw th;
        }
    }

    /* renamed from: N */
    public boolean mo143149N(SurfaceTexture surfaceTexture, SurfaceHolder surfaceHolder) {
        int i;
        CaptureRequest.Builder builder = this.f304694D;
        if (builder == null) {
            return false;
        }
        if (surfaceTexture == null && surfaceHolder == null) {
            Log.m105924i(this.f304712x, "doStartPreview error, surfaceTexture and surface is null");
            Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markCameraOpenFailed");
            C115669n.INSTANCE.mo175913w(985, 5, 1);
            Log.m105924i("MicroMsg.Camera2ProcessIDKeyStat", "markCamera2OpenFailed");
            C115669n.INSTANCE.mo175913w(1099, 2, 1);
            return false;
        }
        if (surfaceTexture != null) {
            this.f304702L = new Surface(surfaceTexture);
        } else if (surfaceHolder != null) {
            this.f304702L = surfaceHolder.getSurface();
        }
        Surface surface = this.f304702L;
        C87412m.m108591d(surface);
        builder.addTarget(surface);
        C103331c cVar = C103331c.f304672a;
        ArrayList<C107267a> arrayList = C103331c.f304690s;
        Surface surface2 = null;
        if (arrayList != null ? !arrayList.isEmpty() : false) {
            if (this.f304701K) {
                CaptureRequest.Builder builder2 = this.f304694D;
                C87412m.m108591d(builder2);
                i = cVar.mo143134a(builder2, C26236u.m33719b("cameraeffect.request.stabilization"));
                if (Build.VERSION.SDK_INT >= 28) {
                    Surface surface3 = this.f304702L;
                    C87412m.m108591d(surface3);
                    SessionConfiguration sessionConfiguration = new SessionConfiguration(i, C26236u.m33719b(new OutputConfiguration(surface3)), AsyncTask.THREAD_POOL_EXECUTOR, this.f304706P);
                    CameraDevice cameraDevice = this.f304693C;
                    C87412m.m108591d(cameraDevice);
                    cameraDevice.createCaptureSession(sessionConfiguration);
                }
            } else {
                CaptureRequest.Builder builder3 = this.f304694D;
                C87412m.m108591d(builder3);
                i = cVar.mo143134a(builder3, C64197v.m75537f("cameraeffect.request.hdr", "cameraeffect.request.denois", "cameraeffect.request.hdrchecker"));
                if (Build.VERSION.SDK_INT >= 28) {
                    OutputConfiguration[] outputConfigurationArr = new OutputConfiguration[2];
                    Surface surface4 = this.f304702L;
                    C87412m.m108591d(surface4);
                    outputConfigurationArr[0] = new OutputConfiguration(surface4);
                    ImageReader imageReader = this.f304705O;
                    Surface surface5 = imageReader != null ? imageReader.getSurface() : null;
                    C87412m.m108591d(surface5);
                    outputConfigurationArr[1] = new OutputConfiguration(surface5);
                    SessionConfiguration sessionConfiguration2 = new SessionConfiguration(i, C64197v.m75537f(outputConfigurationArr), AsyncTask.THREAD_POOL_EXECUTOR, this.f304706P);
                    CameraDevice cameraDevice2 = this.f304693C;
                    C87412m.m108591d(cameraDevice2);
                    cameraDevice2.createCaptureSession(sessionConfiguration2);
                }
            }
            if (i == 0) {
                CameraDevice cameraDevice3 = this.f304693C;
                C87412m.m108591d(cameraDevice3);
                Surface[] surfaceArr = new Surface[2];
                surfaceArr[0] = this.f304702L;
                ImageReader imageReader2 = this.f304705O;
                if (imageReader2 != null) {
                    surface2 = imageReader2.getSurface();
                }
                surfaceArr[1] = surface2;
                cameraDevice3.createCaptureSession(C64197v.m75537f(surfaceArr), this.f304706P, this.f336531e.f337229d);
            }
        } else {
            CameraDevice cameraDevice4 = this.f304693C;
            C87412m.m108591d(cameraDevice4);
            Surface[] surfaceArr2 = new Surface[2];
            surfaceArr2[0] = this.f304702L;
            ImageReader imageReader3 = this.f304705O;
            if (imageReader3 != null) {
                surface2 = imageReader3.getSurface();
            }
            surfaceArr2[1] = surface2;
            cameraDevice4.createCaptureSession(C64197v.m75537f(surfaceArr2), this.f304706P, this.f336531e.f337229d);
        }
        Log.m105924i(this.f304712x, "doStartPreview finish");
        return true;
    }

    /* renamed from: O */
    public final boolean mo143150O(boolean z) {
        Integer num;
        if (z) {
            CameraCharacteristics cameraCharacteristics = this.f304697G;
            C87412m.m108591d(cameraCharacteristics);
            Object obj = cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
            C87412m.m108591d(obj);
            num = (Integer) obj;
        } else {
            CameraCharacteristics cameraCharacteristics2 = this.f304697G;
            C87412m.m108591d(cameraCharacteristics2);
            Object obj2 = cameraCharacteristics2.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
            C87412m.m108591d(obj2);
            num = (Integer) obj2;
        }
        return num.intValue() > 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: int[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo143151P(android.hardware.camera2.CaptureRequest.Builder r6) {
        /*
            r5 = this;
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_MODE
            r1 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r6.set(r0, r2)
            android.hardware.camera2.CameraCharacteristics r0 = r5.f304697G
            r3 = 0
            if (r0 == 0) goto L_0x0018
            android.hardware.camera2.CameraCharacteristics$Key r4 = android.hardware.camera2.CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE
            java.lang.Object r0 = r0.get(r4)
            java.lang.Float r0 = (java.lang.Float) r0
            goto L_0x0019
        L_0x0018:
            r0 = r3
        L_0x0019:
            if (r0 == 0) goto L_0x0025
            r4 = 0
            boolean r0 = gy3.C87412m.m108588a(r0, r4)
            if (r0 == 0) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r0 = 0
            goto L_0x0026
        L_0x0025:
            r0 = 1
        L_0x0026:
            if (r0 != 0) goto L_0x004c
            android.hardware.camera2.CameraCharacteristics r0 = r5.f304697G
            if (r0 == 0) goto L_0x0035
            android.hardware.camera2.CameraCharacteristics$Key r4 = android.hardware.camera2.CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES
            java.lang.Object r0 = r0.get(r4)
            int[] r0 = (int[]) r0
            goto L_0x0036
        L_0x0035:
            r0 = r3
        L_0x0036:
            r4 = 4
            boolean r0 = p977hj.C87526a.m108856a(r0, r4)
            if (r0 == 0) goto L_0x0047
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6.set(r0, r4)
            goto L_0x004c
        L_0x0047:
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE
            r6.set(r0, r2)
        L_0x004c:
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE
            r6.set(r0, r2)
            android.hardware.camera2.CameraCharacteristics r0 = r5.f304697G
            if (r0 == 0) goto L_0x005e
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES
            java.lang.Object r0 = r0.get(r3)
            r3 = r0
            int[] r3 = (int[]) r3
        L_0x005e:
            boolean r0 = p977hj.C87526a.m108856a(r3, r1)
            if (r0 == 0) goto L_0x0069
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AWB_MODE
            r6.set(r0, r2)
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a90.C103332d.mo143151P(android.hardware.camera2.CaptureRequest$Builder):void");
    }

    /* renamed from: Q */
    public final void mo143152Q(String str) {
        Context context = this.f336527a;
        C87412m.m108591d(context);
        if (!Util.checkPermission(context, "android.permission.CAMERA")) {
            Log.m105920e(this.f304712x, "it was lack of the camera permision to open camera");
            return;
        }
        try {
            if (this.f304691A.tryAcquire(2500, TimeUnit.MILLISECONDS)) {
                try {
                    CameraManager cameraManager = this.f304692B;
                    C87412m.m108591d(cameraManager);
                    C103335c cVar = this.f304707Q;
                    Handler handler = this.f336531e.f337229d;
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(handler);
                    aVar.mo10233c(cVar);
                    aVar.mo10233c(str);
                    C117292a.m165364j(cameraManager, aVar.mo10232b(), "com/tencent/mm/media/widget/camera2/CommonCamera2", "openCamera", "(Ljava/lang/String;)V", "android/hardware/camera2/CameraManager", "openCamera", "(Ljava/lang/String;Landroid/hardware/camera2/CameraDevice$StateCallback;Landroid/os/Handler;)V");
                } catch (CameraAccessException unused) {
                }
                C103331c cVar2 = C103331c.f304672a;
                C103331c.f304674c = str;
                C87412m.m108591d(str);
                CameraManager cameraManager2 = C103331c.f304673b;
                CameraCharacteristics cameraCharacteristics = cameraManager2 != null ? cameraManager2.getCameraCharacteristics(str) : null;
                C87412m.m108591d(cameraCharacteristics);
                Object obj = cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
                C87412m.m108591d(obj);
                C103331c.f304675d = ((Number) obj).intValue();
                return;
            }
            throw new RuntimeException("Time out waiting to lock camera opening");
        } catch (InterruptedException e) {
            throw new RuntimeException("interrupt while  trying to lock camera opening", e);
        }
    }

    /* renamed from: R */
    public final void mo143153R() {
        CaptureRequest.Builder builder = this.f304694D;
        if (builder != null && this.f304693C != null && !this.f304700J) {
            if (builder != null) {
                builder.set(CaptureRequest.CONTROL_AF_MODE, 4);
            }
            CaptureRequest.Builder builder2 = this.f304694D;
            C87412m.m108591d(builder2);
            mo143155T(builder2);
            CameraCaptureSession cameraCaptureSession = this.f304695E;
            if (cameraCaptureSession != null) {
                CaptureRequest.Builder builder3 = this.f304694D;
                CaptureRequest build = builder3 != null ? builder3.build() : null;
                C87412m.m108591d(build);
                cameraCaptureSession.setRepeatingRequest(build, this.f304710T, this.f336531e.f337229d);
            }
        }
    }

    /* renamed from: S */
    public boolean mo143154S(CameraCharacteristics cameraCharacteristics) {
        int[] iArr;
        if (this.f304693C == null) {
            return false;
        }
        if (cameraCharacteristics != null) {
            try {
                iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
            } catch (Exception e) {
                Log.m105925i(this.f304712x, "setFocusMode Exception, %s, %s", Looper.myLooper(), e.getMessage());
                return false;
            }
        } else {
            iArr = null;
        }
        if (iArr != null && C110823p.m151008x(iArr, 4)) {
            Log.m105924i(this.f304712x, "support continuous picture");
            CaptureRequest.Builder builder = this.f304694D;
            if (builder != null) {
                builder.set(CaptureRequest.CONTROL_AF_MODE, 4);
            }
        } else if (iArr != null && C110823p.m151008x(iArr, 3)) {
            Log.m105924i(this.f304712x, "support continuous video");
            CaptureRequest.Builder builder2 = this.f304694D;
            if (builder2 != null) {
                builder2.set(CaptureRequest.CONTROL_AF_MODE, 3);
            }
        } else if (iArr == null || !C110823p.m151008x(iArr, 1)) {
            Log.m105924i(this.f304712x, "not support continuous video or auto focus");
        } else {
            Log.m105924i(this.f304712x, "support auto focus");
            CaptureRequest.Builder builder3 = this.f304694D;
            if (builder3 != null) {
                builder3.set(CaptureRequest.CONTROL_AF_MODE, 1);
            }
        }
        return true;
    }

    /* renamed from: T */
    public final void mo143155T(CaptureRequest.Builder builder) {
        CaptureRequest.Builder builder2 = builder;
        C103331c cVar = C103331c.f304672a;
        C87412m.m108594g(builder2, "builder");
        String str = C103331c.f304674c;
        C87412m.m108591d(str);
        if (new C104326b(builder2, str, C103331c.f304688q).mo146019a("cameraeffect.request.hdr", 2)) {
            String str2 = C103331c.f304674c;
            C87412m.m108591d(str2);
            new C104326b(builder2, str2, C103331c.f304688q).mo146020b("cameraeffect.request.hdr", C103331c.f304677f, 2);
        }
        String str3 = C103331c.f304674c;
        C87412m.m108591d(str3);
        if (new C104326b(builder2, str3, C103331c.f304688q).mo146019a("cameraeffect.request.denois", 2)) {
            String str4 = C103331c.f304674c;
            C87412m.m108591d(str4);
            new C104326b(builder2, str4, C103331c.f304688q).mo146020b("cameraeffect.request.denois", C103331c.f304678g, 2);
        }
        String str5 = C103331c.f304674c;
        C87412m.m108591d(str5);
        if (new C104326b(builder2, str5, C103331c.f304688q).mo146019a("cameraeffect.request.hdrchecker", 1)) {
            String str6 = C103331c.f304674c;
            C87412m.m108591d(str6);
            new C104326b(builder2, str6, C103331c.f304688q).mo146020b("cameraeffect.request.hdrchecker", C103331c.f304679h, 1);
        }
        if (!C103331c.f304685n) {
            String str7 = C103331c.f304674c;
            C87412m.m108591d(str7);
            if (new C104326b(builder2, str7, C103331c.f304688q).mo146019a("cameraeffect.request.facebeauty", 1)) {
                String str8 = C103331c.f304674c;
                C87412m.m108591d(str8);
                new C104326b(builder2, str8, C103331c.f304688q).mo146020b("cameraeffect.request.facebeauty", C103331c.f304681j, 1);
            }
        } else {
            String str9 = C103331c.f304674c;
            C87412m.m108591d(str9);
            C104326b bVar = new C104326b(builder2, str9, C103331c.f304688q);
            boolean z = C103331c.f304681j;
            String str10 = C103331c.f304682k;
            C87412m.m108591d(str10);
            bVar.mo146021c("cameraeffect.request.facebeauty", FirebaseAnalytics.C113379b.LEVEL, z, str10, 1);
            String str11 = C103331c.f304674c;
            C87412m.m108591d(str11);
            new C104326b(builder2, str11, C103331c.f304688q).mo146021c("cameraeffect.request.facebeauty", "slim", C103331c.f304681j, Integer.valueOf(C103331c.f304683l), 1);
            String str12 = C103331c.f304674c;
            C87412m.m108591d(str12);
            new C104326b(builder2, str12, C103331c.f304688q).mo146021c("cameraeffect.request.facebeauty", "skin", C103331c.f304681j, Integer.valueOf(C103331c.f304684m), 1);
        }
        String str13 = C103331c.f304674c;
        C87412m.m108591d(str13);
        if (new C104326b(builder2, str13, C103331c.f304688q).mo146019a("cameraeffect.request.stabilization", 4)) {
            String str14 = C103331c.f304674c;
            C87412m.m108591d(str14);
            new C104326b(builder2, str14, C103331c.f304688q).mo146020b("cameraeffect.request.stabilization", C103331c.f304680i, 4);
        }
    }

    /* renamed from: U */
    public final boolean mo143156U(float f, int i) {
        Size size;
        try {
            CameraCharacteristics cameraCharacteristics = this.f304697G;
            C87412m.m108591d(cameraCharacteristics);
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            if (streamConfigurationMap != null) {
                Size[] outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
                C87412m.m108593f(outputSizes, "map.getOutputSizes(SurfaceTexture::class.java)");
                if (outputSizes.length > 1) {
                    C110821n.m150973t(outputSizes, new C103338f());
                }
                Size[] outputSizes2 = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
                C87412m.m108593f(outputSizes2, "map.getOutputSizes(SurfaceTexture::class.java)");
                int length = outputSizes2.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        size = null;
                        break;
                    }
                    size = outputSizes2[i2];
                    if (((double) Math.abs(((((float) size.getWidth()) * 1.0f) / ((float) size.getHeight())) - f)) <= 0.1d && size.getWidth() <= i) {
                        break;
                    }
                    i2++;
                }
                if (size == null) {
                    return false;
                }
                String str = this.f304712x;
                Log.m105924i(str, "selectRatioAndResolutionLimitPreviewSize final select target:" + size.getWidth() + 'x' + size.getHeight());
                SurfaceTexture surfaceTexture = this.f336540n;
                if (surfaceTexture != null) {
                    surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                }
                this.f336537k.f324562c = size.getWidth();
                this.f336537k.f324561b = size.getHeight();
                C108393s sVar = this.f336537k;
                Size size2 = new Size(sVar.f324562c, sVar.f324561b);
                int width = size2.getWidth();
                int height = size2.getHeight();
                C103331c cVar = C103331c.f304672a;
                ImageReader newInstance = ImageReader.newInstance(width, height, 35, 1);
                C112609a aVar = this.f336531e;
                newInstance.setOnImageAvailableListener(aVar.f337239n, aVar.f337229d);
                this.f304705O = newInstance;
                return true;
            }
        } catch (CameraAccessException unused) {
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: int[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: V */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo143157V() {
        /*
            r15 = this;
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            j72.m r2 = j72.C108619m.f325223b
            com.tencent.mm.plugin.mmsight.SightParams r2 = r2.f325224a
            if (r2 == 0) goto L_0x0011
            int r1 = r2.f248463t
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L_0x0011:
            java.lang.String r2 = r15.f304712x
            r3 = 6
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r1
            gj.d r4 = p156gj.C107835h0.f322845b
            int r5 = r4.f322824w
            r6 = 1
            if (r5 != r6) goto L_0x0022
            java.lang.String r5 = "Range"
            goto L_0x002b
        L_0x0022:
            int r5 = r4.f322823v
            if (r5 != r6) goto L_0x0029
            java.lang.String r5 = "Fix"
            goto L_0x002b
        L_0x0029:
            java.lang.String r5 = "Error"
        L_0x002b:
            r3[r6] = r5
            int r4 = r4.f322825x
            if (r4 != r6) goto L_0x0033
            r4 = 1
            goto L_0x0034
        L_0x0033:
            r4 = 0
        L_0x0034:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r5 = 2
            r3[r5] = r4
            r4 = 3
            gj.d r7 = p156gj.C107835h0.f322845b
            int r7 = r7.f322826y
            if (r7 != r6) goto L_0x0044
            r7 = 1
            goto L_0x0045
        L_0x0044:
            r7 = 0
        L_0x0045:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r3[r4] = r7
            gj.d r4 = p156gj.C107835h0.f322845b
            int r4 = r4.f322827z
            if (r4 != r6) goto L_0x0053
            r4 = 1
            goto L_0x0054
        L_0x0053:
            r4 = 0
        L_0x0054:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r7 = 4
            r3[r7] = r4
            gj.d r4 = p156gj.C107835h0.f322845b
            int r4 = r4.f322786A
            if (r4 != r6) goto L_0x0063
            r4 = 1
            goto L_0x0064
        L_0x0063:
            r4 = 0
        L_0x0064:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r8 = 5
            r3[r8] = r4
            java.lang.String r4 = "startPreview Texture:: sightTest %s, config list: setFPS[%s], setYUV420SP[%B], useMetering[%B], useContinueFocus[%B] mUseContinueVideoFocusMode[%B]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r3)
            gj.d r2 = p156gj.C107835h0.f322845b
            int r2 = r2.f322824w
            if (r2 != r6) goto L_0x0083
            int r2 = r1.intValue()
            if (r2 == 0) goto L_0x0097
            int r2 = r1.intValue()
            if (r2 != r6) goto L_0x0083
            goto L_0x0097
        L_0x0083:
            gj.d r2 = p156gj.C107835h0.f322845b
            int r2 = r2.f322823v
            if (r2 != r6) goto L_0x0097
            int r2 = r1.intValue()
            if (r2 == 0) goto L_0x0095
            int r2 = r1.intValue()
            if (r2 != r8) goto L_0x0097
        L_0x0095:
            r2 = 1
            goto L_0x0098
        L_0x0097:
            r2 = 0
        L_0x0098:
            l90.b$a r3 = r15.f336539m
            r4 = 0
            if (r3 == 0) goto L_0x00e7
            if (r3 == 0) goto L_0x00a2
            java.util.HashMap<java.lang.Integer, l90.b$a$a> r8 = r3.f174308a
            goto L_0x00a3
        L_0x00a2:
            r8 = r4
        L_0x00a3:
            if (r8 == 0) goto L_0x00e7
            if (r3 == 0) goto L_0x00ba
            java.util.HashMap<java.lang.Integer, l90.b$a$a> r3 = r3.f174308a
            if (r3 == 0) goto L_0x00ba
            int r8 = r15.mo143180s()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object r3 = r3.get(r8)
            l90.b$a$a r3 = (l90.C109292b.C61240a.C61241a) r3
            goto L_0x00bb
        L_0x00ba:
            r3 = r4
        L_0x00bb:
            if (r3 == 0) goto L_0x00e7
            l90.b$a r3 = r15.f336539m
            if (r3 == 0) goto L_0x00e7
            java.util.HashMap<java.lang.Integer, l90.b$a$a> r3 = r3.f174308a
            if (r3 == 0) goto L_0x00e7
            int r8 = r15.mo143180s()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object r3 = r3.get(r8)
            l90.b$a$a r3 = (l90.C109292b.C61240a.C61241a) r3
            if (r3 == 0) goto L_0x00e7
            java.lang.Integer r8 = r3.f174312c
            if (r8 == 0) goto L_0x00df
            int r8 = r8.intValue()
            r15.f304711U = r8
        L_0x00df:
            java.lang.Boolean r3 = r3.f174313d
            if (r3 == 0) goto L_0x00e7
            boolean r2 = r3.booleanValue()
        L_0x00e7:
            android.hardware.camera2.CameraCharacteristics r3 = r15.f304697G
            if (r3 != 0) goto L_0x00ec
            goto L_0x012f
        L_0x00ec:
            if (r2 == 0) goto L_0x00f4
            int r8 = r15.f304711U     // Catch:{ Exception -> 0x0119 }
            r15.mo143160Y(r3, r8)     // Catch:{ Exception -> 0x0119 }
            goto L_0x00f9
        L_0x00f4:
            int r8 = r15.f304711U     // Catch:{ Exception -> 0x0119 }
            r15.mo143159X(r3, r8)     // Catch:{ Exception -> 0x0119 }
        L_0x00f9:
            android.hardware.camera2.CaptureRequest$Builder r3 = r15.f304694D     // Catch:{ Exception -> 0x0119 }
            if (r3 == 0) goto L_0x0106
            android.hardware.camera2.CaptureRequest$Key r8 = android.hardware.camera2.CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE     // Catch:{ Exception -> 0x0119 }
            java.lang.Object r3 = r3.get(r8)     // Catch:{ Exception -> 0x0119 }
            android.util.Range r3 = (android.util.Range) r3     // Catch:{ Exception -> 0x0119 }
            goto L_0x0107
        L_0x0106:
            r3 = r4
        L_0x0107:
            java.lang.String r8 = r15.f336529c     // Catch:{ Exception -> 0x0119 }
            java.lang.String r9 = "use fix mode %B, supported preview frame rates %s"
            java.lang.Object[] r10 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0119 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ Exception -> 0x0119 }
            r10[r0] = r2     // Catch:{ Exception -> 0x0119 }
            r10[r6] = r3     // Catch:{ Exception -> 0x0119 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r9, r10)     // Catch:{ Exception -> 0x0119 }
            goto L_0x012f
        L_0x0119:
            r2 = move-exception
            java.lang.String r3 = r15.f336529c
            java.lang.Object[] r8 = new java.lang.Object[r5]
            android.os.Looper r9 = android.os.Looper.myLooper()
            r8[r0] = r9
            java.lang.String r2 = r2.getMessage()
            r8[r6] = r2
            java.lang.String r2 = "setPreviewFrameRate Exception, %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r2, r8)
        L_0x012f:
            gj.d r2 = p156gj.C107835h0.f322845b
            int r2 = r2.f322825x
            if (r2 != r6) goto L_0x013e
            int r2 = r1.intValue()
            if (r2 == 0) goto L_0x013e
            r1.intValue()
        L_0x013e:
            gj.b0 r2 = p156gj.C107835h0.f322852i
            int r2 = r2.f322660i
            r3 = -1
            if (r2 == r3) goto L_0x01cf
            if (r2 != r6) goto L_0x01cf
            r2 = 14
            boolean r2 = p206nj.C11171e.m11045b(r2)
            if (r2 == 0) goto L_0x01cf
            android.hardware.camera2.CameraCharacteristics r2 = r15.f304697G
            if (r2 != 0) goto L_0x0155
            goto L_0x01cf
        L_0x0155:
            java.lang.String r3 = r15.f304712x     // Catch:{ Exception -> 0x01b9 }
            java.lang.String r8 = "safeSetMetering"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r8)     // Catch:{ Exception -> 0x01b9 }
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE     // Catch:{ Exception -> 0x01b9 }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ Exception -> 0x01b9 }
            android.graphics.Rect r2 = (android.graphics.Rect) r2     // Catch:{ Exception -> 0x01b9 }
            android.hardware.camera2.params.MeteringRectangle[] r3 = new android.hardware.camera2.params.MeteringRectangle[r6]     // Catch:{ Exception -> 0x01b9 }
            android.hardware.camera2.params.MeteringRectangle r14 = new android.hardware.camera2.params.MeteringRectangle     // Catch:{ Exception -> 0x01b9 }
            if (r2 == 0) goto L_0x0171
            int r8 = r2.right     // Catch:{ Exception -> 0x01b9 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x01b9 }
            goto L_0x0172
        L_0x0171:
            r8 = r4
        L_0x0172:
            gy3.C87412m.m108591d(r8)     // Catch:{ Exception -> 0x01b9 }
            int r8 = r8.intValue()     // Catch:{ Exception -> 0x01b9 }
            int r8 = r8 / r5
            int r9 = r8 + -500
            int r2 = r2.bottom     // Catch:{ Exception -> 0x01b9 }
            int r2 = r2 / r5
            int r10 = r2 + -500
            r11 = 1000(0x3e8, float:1.401E-42)
            r12 = 1000(0x3e8, float:1.401E-42)
            r13 = 0
            r8 = r14
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x01b9 }
            r3[r0] = r14     // Catch:{ Exception -> 0x01b9 }
            android.hardware.camera2.CaptureRequest$Builder r2 = r15.f304694D     // Catch:{ Exception -> 0x01b9 }
            if (r2 == 0) goto L_0x0195
            android.hardware.camera2.CaptureRequest$Key r8 = android.hardware.camera2.CaptureRequest.CONTROL_AE_REGIONS     // Catch:{ Exception -> 0x01b9 }
            r2.set(r8, r3)     // Catch:{ Exception -> 0x01b9 }
        L_0x0195:
            android.hardware.camera2.CaptureRequest$Builder r2 = r15.f304694D     // Catch:{ Exception -> 0x01b9 }
            if (r2 == 0) goto L_0x019e
            android.hardware.camera2.CaptureRequest$Key r8 = android.hardware.camera2.CaptureRequest.CONTROL_AF_REGIONS     // Catch:{ Exception -> 0x01b9 }
            r2.set(r8, r3)     // Catch:{ Exception -> 0x01b9 }
        L_0x019e:
            android.hardware.camera2.CaptureRequest$Builder r2 = r15.f304694D     // Catch:{ Exception -> 0x01b9 }
            if (r2 == 0) goto L_0x01ab
            android.hardware.camera2.CaptureRequest$Key r3 = android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER     // Catch:{ Exception -> 0x01b9 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x01b9 }
            r2.set(r3, r8)     // Catch:{ Exception -> 0x01b9 }
        L_0x01ab:
            android.hardware.camera2.CaptureRequest$Builder r2 = r15.f304694D     // Catch:{ Exception -> 0x01b9 }
            if (r2 == 0) goto L_0x01cf
            android.hardware.camera2.CaptureRequest$Key r3 = android.hardware.camera2.CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER     // Catch:{ Exception -> 0x01b9 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x01b9 }
            r2.set(r3, r8)     // Catch:{ Exception -> 0x01b9 }
            goto L_0x01cf
        L_0x01b9:
            r2 = move-exception
            java.lang.String r3 = r15.f304712x
            java.lang.Object[] r5 = new java.lang.Object[r5]
            android.os.Looper r8 = android.os.Looper.myLooper()
            r5[r0] = r8
            java.lang.String r2 = r2.getMessage()
            r5[r6] = r2
            java.lang.String r2 = "safeSetMetering Exception, %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r2, r5)
        L_0x01cf:
            gj.d r2 = p156gj.C107835h0.f322845b
            int r2 = r2.f322827z
            if (r2 != r6) goto L_0x01e6
            int r2 = r1.intValue()
            if (r2 == 0) goto L_0x01e1
            int r2 = r1.intValue()
            if (r2 != r7) goto L_0x01e6
        L_0x01e1:
            android.hardware.camera2.CameraCharacteristics r2 = r15.f304697G
            r15.mo143154S(r2)
        L_0x01e6:
            gj.d r2 = p156gj.C107835h0.f322845b
            int r2 = r2.f322786A
            if (r2 != r6) goto L_0x01f5
            int r2 = r1.intValue()
            if (r2 == 0) goto L_0x01f5
            r1.intValue()
        L_0x01f5:
            android.hardware.camera2.CameraCharacteristics r1 = r15.f304697G
            if (r1 == 0) goto L_0x0202
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE
            java.lang.Object r1 = r1.get(r2)
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            goto L_0x0203
        L_0x0202:
            r1 = r4
        L_0x0203:
            if (r1 == 0) goto L_0x0223
            android.graphics.Rect r2 = new android.graphics.Rect
            int r3 = r1.left
            int r3 = r3 * 1
            int r5 = r1.top
            int r5 = r5 * 1
            int r7 = r1.right
            int r7 = r7 * 1
            int r1 = r1.bottom
            int r1 = r1 * 1
            r2.<init>(r3, r5, r7, r1)
            android.hardware.camera2.CaptureRequest$Builder r1 = r15.f304694D
            if (r1 == 0) goto L_0x0223
            android.hardware.camera2.CaptureRequest$Key r3 = android.hardware.camera2.CaptureRequest.SCALER_CROP_REGION
            r1.set(r3, r2)
        L_0x0223:
            android.hardware.camera2.CameraCharacteristics r1 = r15.f304697G
            if (r1 == 0) goto L_0x0230
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION
            java.lang.Object r1 = r1.get(r2)
            r4 = r1
            int[] r4 = (int[]) r4
        L_0x0230:
            if (r4 == 0) goto L_0x027c
            java.lang.String r1 = r15.f304712x
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "oisMode:"
            r2.append(r3)
            java.lang.String r3 = java.util.Arrays.toString(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            int r1 = r4.length
            if (r1 != 0) goto L_0x0251
            r1 = 1
            goto L_0x0252
        L_0x0251:
            r1 = 0
        L_0x0252:
            r1 = r1 ^ r6
            if (r1 == 0) goto L_0x027c
            boolean r1 = sx3.C110823p.m151008x(r4, r6)
            if (r1 == 0) goto L_0x027c
            java.lang.String r1 = "MicroMsg.Camera2ProcessIDKeyStat"
            java.lang.String r2 = "markCamera2UseOISSystem"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r8 = 1099(0x44b, double:5.43E-321)
            r10 = 9
            r12 = 1
            r7.mo175913w(r8, r10, r12)
            a90.C103331c.f304680i = r0
            android.hardware.camera2.CaptureRequest$Builder r0 = r15.f304694D
            if (r0 == 0) goto L_0x027c
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r0.set(r1, r2)
        L_0x027c:
            android.hardware.camera2.CaptureRequest$Builder r0 = r15.f304694D
            gy3.C87412m.m108591d(r0)
            r15.mo143155T(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a90.C103332d.mo143157V():void");
    }

    /* renamed from: W */
    public void mo143158W(SurfaceTexture surfaceTexture, SurfaceHolder surfaceHolder, int i) {
        long currentTicks = Util.currentTicks();
        String str = this.f304712x;
        Log.m105924i(str, "start startPreviewWithGPU,Looper.myLooper(): " + Looper.myLooper() + "  ,surfaceTexture:" + surfaceTexture + ", surface:" + surfaceHolder);
        if (mo164109B()) {
            Log.m105924i(this.f304712x, "startPreviewWithGPU, camera previewing");
            return;
        }
        try {
            CaptureRequest.Builder builder = null;
            if (this.f304701K) {
                CameraDevice cameraDevice = this.f304693C;
                if (cameraDevice != null) {
                    builder = cameraDevice.createCaptureRequest(3);
                }
            } else {
                CameraDevice cameraDevice2 = this.f304693C;
                if (cameraDevice2 != null) {
                    builder = cameraDevice2.createCaptureRequest(1);
                }
            }
            this.f304694D = builder;
            mo143143F(i);
            mo143157V();
            if (mo143149N(surfaceTexture, surfaceHolder)) {
                this.f336534h = C112397a.C112398a.CAMERA_IS_PREVIEWING;
                this.f304708R = 0;
            }
        } catch (Exception e) {
            Log.m105921e(this.f304712x, "start preview FAILED, %s, %s", Looper.myLooper(), e.getMessage());
            Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markCameraOpenFailed");
            C115669n.INSTANCE.mo175913w(985, 5, 1);
        }
        Log.m105925i(this.f304712x, "start preview end, use %dms %s", Long.valueOf(Util.ticksToNow(currentTicks)), Looper.myLooper());
    }

    /* renamed from: X */
    public void mo143159X(CameraCharacteristics cameraCharacteristics, int i) {
        CameraCharacteristics cameraCharacteristics2 = cameraCharacteristics;
        int i2 = i;
        if (C107835h0.f322845b.f322821t > 0) {
            Log.m105924i(this.f336529c, "set frame rate > 0, do not try set preview fps range");
            return;
        }
        Range[] rangeArr = cameraCharacteristics2 != null ? (Range[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES) : null;
        if (rangeArr != null) {
            if (!(rangeArr.length == 0)) {
                int length = rangeArr.length;
                int i3 = Integer.MIN_VALUE;
                int i4 = Integer.MIN_VALUE;
                boolean z = false;
                for (int i5 = 0; i5 < length; i5++) {
                    Range range = rangeArr[i5];
                    if (range != null) {
                        Integer num = (Integer) range.getLower();
                        Integer num2 = (Integer) range.getUpper();
                        Log.m105925i(this.f304712x, "dkfps %d:[%d %d]", Integer.valueOf(i5), num, num2);
                        C87412m.m108593f(num, "min");
                        if (num.intValue() >= 0) {
                            C87412m.m108593f(num2, "max");
                            if (num2.intValue() >= num.intValue()) {
                                int i6 = i2 == 0 ? 30 : i2;
                                if (num2.intValue() >= i4 && !z && num2.intValue() <= i6) {
                                    i3 = num.intValue();
                                    i4 = num2.intValue();
                                }
                                if (i2 != 0) {
                                    if (num2.intValue() != i2) {
                                    }
                                } else if (num2.intValue() != 30) {
                                }
                                z = true;
                            }
                        }
                    }
                }
                Log.m105925i(this.f336529c, "dkfps get fit  [%d %d], max target fps %d", Integer.valueOf(i3), Integer.valueOf(i4), 30);
                if (i3 != Integer.MAX_VALUE && i4 != Integer.MAX_VALUE) {
                    try {
                        CaptureRequest.Builder builder = this.f304694D;
                        if (builder != null) {
                            builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, new Range(Integer.valueOf(i3), Integer.valueOf(i4)));
                        }
                        Log.m105925i(this.f336529c, "set fps range %d %d", Integer.valueOf(i3), Integer.valueOf(i4));
                    } catch (Exception e) {
                        Log.m105925i(this.f336529c, "trySetPreviewFpsRangeParameters Exception, %s, %s", Looper.myLooper(), e.getMessage());
                    }
                }
            }
        }
    }

    /* renamed from: Y */
    public final void mo143160Y(CameraCharacteristics cameraCharacteristics, int i) {
        int i2;
        if (C107835h0.f322845b.f322821t > 0) {
            Log.m105924i(this.f336529c, "set frame rate > 0, do not try set preview frame rate");
        } else if (cameraCharacteristics == null) {
            Log.m105920e(this.f304712x, "trySetPreviewFrameRateParameters error, p is null!");
        } else {
            try {
                Range[] rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                if (rangeArr != null) {
                    i2 = 0;
                    for (Range range : rangeArr) {
                        Comparable upper = range.getUpper();
                        C87412m.m108593f(upper, "it.upper");
                        if (i2 < ((Number) upper).intValue()) {
                            Comparable upper2 = range.getUpper();
                            C87412m.m108593f(upper2, "it.upper");
                            i2 = ((Number) upper2).intValue();
                        }
                    }
                } else {
                    i2 = 0;
                }
                int min = i == 0 ? Math.min(30, i2) : Math.min(i, i2);
                Range range2 = new Range(Integer.valueOf(min), Integer.valueOf(min));
                CaptureRequest.Builder builder = this.f304694D;
                if (builder != null) {
                    builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range2);
                }
            } catch (Exception e) {
                Log.m105925i(this.f336529c, "trySetPreviewFrameRateParameters Exception, %s, %s", Looper.myLooper(), e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public boolean mo143161a() {
        try {
            CaptureRequest.Builder builder = this.f304694D;
            if (builder != null) {
                builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
            }
            CaptureRequest.Builder builder2 = this.f304694D;
            if (builder2 != null) {
                builder2.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
            }
            return true;
        } catch (Exception unused) {
            Log.m105924i(this.f304712x, "triggerAutoFocus failed");
            return false;
        }
    }

    /* renamed from: b */
    public boolean mo143162b(C32226l<? super Bitmap, C13598b0> lVar) {
        CameraCaptureSession cameraCaptureSession;
        C87412m.m108594g(lVar, "dataCallback");
        Log.m105924i(this.f304712x, "takePhoto");
        this.f336534h = C112397a.C112398a.CAMERA_IS_CAPTURING;
        if (C87412m.m108589b(C103331c.f304674c, C103331c.f304672a.mo143135b(1))) {
            Log.m105924i("MicroMsg.Camera2ProcessIDKeyStat", "markCamera2TakePhotoBack");
            C115669n.INSTANCE.mo175913w(1099, 5, 1);
            try {
                if (this.f304708R != 0) {
                    mo143146K();
                }
                CaptureRequest captureRequest = null;
                this.f336531e.removeCallbacksAndMessages((Object) null);
                CaptureRequest.Builder builder = this.f304694D;
                if (builder != null) {
                    builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                }
                this.f304708R = 1;
                if (!this.f304700J) {
                    CaptureRequest.Builder builder2 = this.f304694D;
                    if (!((builder2 != null ? builder2.build() : null) == null || (cameraCaptureSession = this.f304695E) == null)) {
                        CaptureRequest.Builder builder3 = this.f304694D;
                        if (builder3 != null) {
                            captureRequest = builder3.build();
                        }
                        C87412m.m108591d(captureRequest);
                        cameraCaptureSession.capture(captureRequest, this.f304710T, this.f336531e.f337229d);
                    }
                }
            } catch (Exception e) {
                Log.m105924i("MicroMsg.Camera2ProcessIDKeyStat", "markCamera2TakePhotoBackError");
                C115669n.INSTANCE.mo175913w(1099, 6, 1);
                Log.printInfoStack(this.f304712x, "take photo in back camera error", e);
            }
        } else {
            Log.m105924i("MicroMsg.Camera2ProcessIDKeyStat", "markCamera2TakePhotoFront");
            C115669n.INSTANCE.mo175913w(1099, 4, 1);
            mo143147L();
        }
        this.f336531e.f337231f = lVar;
        return true;
    }

    /* renamed from: c */
    public int mo143163c() {
        C103331c cVar = C103331c.f304672a;
        return C103331c.f304675d;
    }

    /* renamed from: d */
    public boolean mo143164d(Context context, boolean z) {
        C87412m.m108594g(context, "context");
        try {
            Object systemService = MMApplicationContext.getContext().getSystemService("camera");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
            CameraManager cameraManager = (CameraManager) systemService;
            this.f304692B = cameraManager;
            C103331c cVar = C103331c.f304672a;
            C103331c.f304673b = cameraManager;
            if (this.f336549w) {
                Log.m105924i(this.f304712x, "initCamera, already open");
                return true;
            }
            Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markCameraOpen");
            C115669n.INSTANCE.mo175913w(985, 3, 1);
            this.f336533g = z;
            release();
            mo143148M();
            String b = z ? cVar.mo143135b(1) : cVar.mo143135b(0);
            Log.printInfoStack(this.f304712x, "use camera id %s, SrvDeviceInfo id %d", b, Integer.valueOf(C107835h0.f322845b.f322787B));
            Log.m105924i("MicroMsg.Camera2ProcessIDKeyStat", "markCamera2Open");
            C115669n.INSTANCE.mo175913w(1099, 0, 1);
            mo143152Q(b);
            return true;
        } catch (Exception e) {
            Log.printErrStackTrace(this.f304712x, e, "init camera failed!", new Object[0]);
            Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markCameraOpenFailed");
            C115669n.INSTANCE.mo175913w(985, 5, 1);
            return false;
        }
    }

    /* renamed from: e */
    public void mo143165e(String str, int i) {
        T t;
        C87412m.m108594g(str, "tag");
        C103331c cVar = C103331c.f304672a;
        C87412m.m108591d(this.f304694D);
        if (C87412m.m108589b(str, FirebaseAnalytics.C113379b.LEVEL)) {
            String str2 = C103331c.f304674c;
            C87412m.m108591d(str2);
            ArrayList<C104325a> arrayList = C103331c.f304688q;
            int i2 = C87412m.m108589b(str2, "0") ? 1 : 2;
            Object obj = null;
            if (arrayList != null) {
                Iterator<T> it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    C104325a aVar = (C104325a) t;
                    boolean z = false;
                    if (C87412m.m108589b(aVar.f308794h, "cameraeffect.request.facebeauty")) {
                        Integer num = aVar.f308795i;
                        if (num != null && (num.intValue() & i2) == 0) {
                            continue;
                        } else {
                            Integer num2 = aVar.f308800n;
                            if (!(num2 != null && (num2.intValue() & 1) == 0) && C87412m.m108589b(aVar.f308797k, FirebaseAnalytics.C113379b.LEVEL)) {
                                z = true;
                                continue;
                            }
                        }
                    }
                    if (z) {
                        break;
                    }
                }
                C104325a aVar2 = (C104325a) t;
                if (aVar2 != null) {
                    Object obj2 = aVar2.f308798l;
                    if (obj2 instanceof ArrayList) {
                        C87412m.m108592e(obj2, "null cannot be cast to non-null type java.util.ArrayList<*>{ kotlin.collections.TypeAliasesKt.ArrayList<*> }");
                        obj = ((ArrayList) obj2).get(i);
                    }
                }
            }
            C87412m.m108592e(obj, "null cannot be cast to non-null type kotlin.String");
            C103331c.f304682k = (String) obj;
        } else if (C87412m.m108589b(str, "slim")) {
            C103331c.f304683l = i;
        } else if (C87412m.m108589b(str, "skin")) {
            C103331c.f304684m = i;
        }
        C103331c.f304685n = true;
        mo143153R();
    }

    /* renamed from: f */
    public void mo143166f(float f) {
        if (this.f336547u) {
            Log.m105918d(this.f304712x, "setForceZoomTargetRatio, zooming, ignore");
            return;
        }
        CameraCharacteristics cameraCharacteristics = this.f304697G;
        if (cameraCharacteristics != null && this.f304694D != null) {
            try {
                C87412m.m108591d(cameraCharacteristics);
                Rect rect = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                C87412m.m108591d(rect);
                int width = rect.width() - C60641c.m70921b(((float) rect.width()) / f);
                int height = rect.height() - C60641c.m70921b(((float) rect.height()) / f);
                this.f304703M = new Rect(width / 2, height / 2, rect.width() - (width / 2), rect.height() - (height / 2));
                CaptureRequest.Builder builder = this.f304694D;
                C87412m.m108591d(builder);
                builder.set(CaptureRequest.SCALER_CROP_REGION, this.f304703M);
                if (!this.f304700J) {
                    try {
                        CameraCaptureSession cameraCaptureSession = this.f304695E;
                        if (cameraCaptureSession != null) {
                            CaptureRequest.Builder builder2 = this.f304694D;
                            C87412m.m108591d(builder2);
                            cameraCaptureSession.setRepeatingRequest(builder2.build(), this.f304710T, this.f336531e.f337229d);
                        }
                    } catch (CameraAccessException unused) {
                    }
                }
            } catch (Exception e) {
                Log.m105921e(this.f304712x, "setForceZoomTargetRatio error: %s", e.getMessage());
            } catch (Throwable th) {
                this.f336547u = false;
                throw th;
            }
            this.f336547u = false;
        }
    }

    /* renamed from: g */
    public Rect mo143167g(float f, float f2, float f3, int i, int i2) {
        int i3 = (int) (f3 * ((float) 4));
        Rect rect = this.f304699I;
        C87412m.m108591d(rect);
        int width = ((int) f) - ((rect.width() / i3) / 2);
        Rect rect2 = this.f304699I;
        C87412m.m108591d(rect2);
        int i4 = rect2.left;
        Rect rect3 = this.f304699I;
        C87412m.m108591d(rect3);
        int i5 = rect3.right;
        Rect rect4 = this.f304699I;
        C87412m.m108591d(rect4);
        int width2 = i5 - (rect4.width() / i3);
        if (width <= width2) {
            if (width < i4) {
                width = i4;
            }
            width2 = width;
        }
        int i6 = (int) f2;
        Rect rect5 = this.f304699I;
        C87412m.m108591d(rect5);
        int width3 = i6 - ((rect5.width() / i3) / 2);
        Rect rect6 = this.f304699I;
        C87412m.m108591d(rect6);
        int i7 = rect6.top;
        Rect rect7 = this.f304699I;
        C87412m.m108591d(rect7);
        int i8 = rect7.bottom;
        Rect rect8 = this.f304699I;
        C87412m.m108591d(rect8);
        int width4 = i8 - (rect8.width() / i3);
        if (width3 <= width4) {
            if (width3 < i7) {
                width3 = i7;
            }
            width4 = width3;
        }
        Rect rect9 = this.f304699I;
        C87412m.m108591d(rect9);
        Rect rect10 = this.f304699I;
        C87412m.m108591d(rect10);
        RectF rectF = new RectF((float) width2, (float) width4, (float) (width2 + (rect9.width() / i3)), (float) (width4 + (rect10.width() / i3)));
        C103330b bVar = this.f304698H;
        C87412m.m108591d(bVar);
        RectF rectF2 = new RectF();
        Matrix matrix = bVar.f304670a;
        if (matrix != null) {
            matrix.mapRect(rectF2, rectF);
        }
        return new Rect(Math.round(rectF2.left), Math.round(rectF2.top), Math.round(rectF2.right), Math.round(rectF2.bottom));
    }

    public int getFlashMode() {
        C103331c cVar = C103331c.f304672a;
        CaptureRequest.Builder builder = this.f304694D;
        C87412m.m108591d(builder);
        Integer num = (Integer) builder.get(CaptureRequest.CONTROL_AE_MODE);
        int i = 2;
        if (num != null && num.intValue() == 2) {
            return 3;
        }
        Integer num2 = (Integer) builder.get(CaptureRequest.FLASH_MODE);
        if (num2 == null || num2.intValue() != 0) {
            if ((num2 != null && num2.intValue() == 2) || (num2 != null && num2.intValue() == 1)) {
                i = 1;
            }
        }
        return i;
    }

    /* renamed from: h */
    public void mo143169h(SurfaceTexture surfaceTexture, boolean z, int i) {
        this.f304691A.acquire();
        this.f304691A.release();
        this.f336540n = surfaceTexture;
        this.f336535i = z;
        this.f336542p = i;
        mo143158W(surfaceTexture, (SurfaceHolder) null, i);
    }

    /* renamed from: i */
    public void mo143170i(boolean z) {
        C103331c cVar = C103331c.f304672a;
        CaptureRequest.Builder builder = this.f304694D;
        C87412m.m108591d(builder);
        cVar.mo143139f(z, builder);
    }

    /* renamed from: j */
    public void mo143171j(boolean z, boolean z2, int i) {
        if (this.f304693C != null && mo164109B()) {
            try {
                Log.m105919d(this.f304712x, "triggerSmallZoom, zoom: %s", Boolean.valueOf(z));
                if (this.f336547u) {
                    Log.m105918d(this.f304712x, "triggerSmallZoom, zooming, ignore");
                    this.f336547u = false;
                    return;
                }
                this.f336547u = true;
                CaptureRequest.Builder builder = this.f304694D;
                Rect rect = null;
                Rect rect2 = builder != null ? (Rect) builder.get(CaptureRequest.SCALER_CROP_REGION) : null;
                CameraCharacteristics cameraCharacteristics = this.f304697G;
                if (cameraCharacteristics != null) {
                    rect = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                }
                C87412m.m108591d(rect);
                C87412m.m108591d(rect2);
                float width = ((float) rect.width()) / ((float) rect2.width());
                CameraCharacteristics cameraCharacteristics2 = this.f304697G;
                C87412m.m108591d(cameraCharacteristics2);
                Float f = (Float) cameraCharacteristics2.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
                if (f == null) {
                    f = Float.valueOf(0.0f);
                }
                float floatValue = f.floatValue();
                if (!z) {
                    if (width == 1.0f) {
                        this.f336547u = false;
                        return;
                    }
                    floatValue = width - this.f304714z;
                    if (floatValue <= 1.0f) {
                        floatValue = 1.0f;
                    }
                } else if (width >= floatValue) {
                    this.f336547u = false;
                    return;
                } else {
                    float f2 = width + this.f304714z;
                    if (f2 < floatValue) {
                        floatValue = f2;
                    }
                }
                Log.m105919d(this.f304712x, "triggerSmallZoom, nextZoom: %s", Float.valueOf(floatValue));
                float width2 = ((float) rect.width()) / floatValue;
                float height = ((float) rect.height()) / floatValue;
                float f3 = (float) 2;
                float width3 = (((float) rect.width()) - width2) / f3;
                float height2 = (((float) rect.height()) - height) / f3;
                Rect rect3 = new Rect((int) width3, (int) height2, (int) (width3 + width2), (int) (height2 + height));
                CaptureRequest.Builder builder2 = this.f304694D;
                if (builder2 != null) {
                    builder2.set(CaptureRequest.SCALER_CROP_REGION, rect3);
                }
                if (!this.f304700J) {
                    try {
                        CameraCaptureSession cameraCaptureSession = this.f304695E;
                        if (cameraCaptureSession != null) {
                            CaptureRequest.Builder builder3 = this.f304694D;
                            C87412m.m108591d(builder3);
                            cameraCaptureSession.setRepeatingRequest(builder3.build(), this.f304710T, this.f336531e.f337229d);
                        }
                    } catch (CameraAccessException unused) {
                    }
                }
                this.f336547u = false;
            } catch (Exception e) {
                Log.m105921e(this.f304712x, "triggerSmallZoom error: %s", e.getMessage());
            } catch (Throwable th) {
                this.f336547u = false;
                throw th;
            }
        }
    }

    /* renamed from: k */
    public void mo143172k(int i, int i2) {
        if (this.f336546t <= 0) {
            Point h = C85875k4.m106184h(MMApplicationContext.getContext());
            int i3 = h.y;
            Log.m105925i(this.f304712x, "calcScrollZoomStep, recordButtonTopLocation: %s, screenSize: %s", Integer.valueOf(i), h);
            if (i3 / 2 < i) {
                try {
                    CameraCharacteristics cameraCharacteristics = this.f304697G;
                    C87412m.m108591d(cameraCharacteristics);
                    Float f = (Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
                    if (f == null) {
                        f = Float.valueOf(0.0f);
                    }
                    float floatValue = f.floatValue();
                    double d = ((double) floatValue) / ((((double) i) / 3.0d) / ((double) i2));
                    if (d > 0.0d) {
                        this.f336546t = ((int) d) + 1;
                    }
                    Log.m105925i(this.f304712x, "scrollSmallZoomStep: %s, maxZoom: %s", Integer.valueOf(this.f336546t), Float.valueOf(floatValue));
                } catch (Exception e) {
                    Log.m105921e(this.f304712x, "calcScrollZoomStep error: %s", e.getMessage());
                }
            }
        }
    }

    /* renamed from: l */
    public Point mo143173l(boolean z) {
        if (!z) {
            C108393s sVar = this.f336537k;
            return new Point(sVar.f324562c, sVar.f324561b);
        }
        Point point = this.f336545s;
        if (point != null) {
            C87412m.m108591d(point);
            return point;
        }
        C108393s sVar2 = this.f336537k;
        return new Point(sVar2.f324562c, sVar2.f324561b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
        r0 = r5.f336545s;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0059 A[SYNTHETIC, Splitter:B:25:0x0059] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c0  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public y80.C66557b mo143174m() {
        /*
            r5 = this;
            java.lang.String r0 = r5.f304712x
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "generateCameraConfig"
            com.tencent.p014mm.sdk.platformtools.Log.printInfoStack(r0, r3, r2)
            android.hardware.camera2.CameraDevice r0 = r5.f304693C
            r2 = 0
            if (r0 != 0) goto L_0x0017
            java.lang.String r0 = r5.f304712x
            java.lang.String r1 = "generateCameraConfig, camera is null!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            return r2
        L_0x0017:
            boolean r0 = r5.mo164109B()
            if (r0 != 0) goto L_0x0025
            java.lang.String r0 = r5.f304712x
            java.lang.String r1 = "generateCameraConfig, camera not previewing"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            return r2
        L_0x0025:
            android.hardware.camera2.CameraDevice r0 = r5.f304693C
            r2 = 1
            if (r0 != 0) goto L_0x002c
        L_0x002a:
            r0 = 0
            goto L_0x0051
        L_0x002c:
            android.hardware.camera2.CameraManager r0 = r5.f304692B
            if (r0 == 0) goto L_0x002a
            boolean r0 = r5.f336535i     // Catch:{ Exception -> 0x0040 }
            if (r0 == 0) goto L_0x003b
            android.graphics.Point r0 = r5.f336545s     // Catch:{ Exception -> 0x0040 }
            if (r0 == 0) goto L_0x003b
            int r0 = r0.x     // Catch:{ Exception -> 0x0040 }
            goto L_0x0051
        L_0x003b:
            i72.s r0 = r5.f336537k     // Catch:{ Exception -> 0x0040 }
            int r0 = r0.f324562c     // Catch:{ Exception -> 0x0040 }
            goto L_0x0051
        L_0x0040:
            r0 = move-exception
            java.lang.String r3 = r5.f304712x
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r0 = r0.getMessage()
            r4[r1] = r0
            java.lang.String r0 = "getPreviewWidth: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r0, r4)
            goto L_0x002a
        L_0x0051:
            y80.C66557b.f191416c = r0
            android.hardware.camera2.CameraDevice r0 = r5.f304693C
            if (r0 != 0) goto L_0x0059
        L_0x0057:
            r0 = 0
            goto L_0x007a
        L_0x0059:
            boolean r0 = r5.f336535i     // Catch:{ Exception -> 0x0069 }
            if (r0 == 0) goto L_0x0064
            android.graphics.Point r0 = r5.f336545s     // Catch:{ Exception -> 0x0069 }
            if (r0 == 0) goto L_0x0064
            int r0 = r0.y     // Catch:{ Exception -> 0x0069 }
            goto L_0x007a
        L_0x0064:
            i72.s r0 = r5.f336537k     // Catch:{ Exception -> 0x0069 }
            int r0 = r0.f324561b     // Catch:{ Exception -> 0x0069 }
            goto L_0x007a
        L_0x0069:
            r0 = move-exception
            java.lang.String r3 = r5.f304712x
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r0 = r0.getMessage()
            r4[r1] = r0
            java.lang.String r0 = "getPreviewHeight: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r0, r4)
            goto L_0x0057
        L_0x007a:
            y80.C66557b.f191415b = r0
            android.hardware.camera2.CameraCharacteristics r0 = r5.f304697G
            if (r0 == 0) goto L_0x00a7
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION
            java.lang.Object r3 = r0.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            r4 = 90
            if (r3 != 0) goto L_0x008d
            goto L_0x0093
        L_0x008d:
            int r3 = r3.intValue()
            if (r3 == r4) goto L_0x00a6
        L_0x0093:
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION
            java.lang.Object r0 = r0.get(r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r3 = 270(0x10e, float:3.78E-43)
            if (r0 != 0) goto L_0x00a0
            goto L_0x00a7
        L_0x00a0:
            int r0 = r0.intValue()
            if (r0 != r3) goto L_0x00a7
        L_0x00a6:
            r1 = 1
        L_0x00a7:
            i72.s r0 = r5.f336537k
            int r3 = r0.f324562c
            y80.C66557b.f191418e = r3
            int r0 = r0.f324561b
            y80.C66557b.f191419f = r0
            if (r1 == 0) goto L_0x00b7
            y80.C66557b.f191418e = r0
            y80.C66557b.f191419f = r3
        L_0x00b7:
            boolean r0 = r5.mo164109B()
            if (r0 == 0) goto L_0x00c0
            int r0 = a90.C103331c.f304675d
            goto L_0x00c1
        L_0x00c0:
            r0 = -1
        L_0x00c1:
            y80.C66557b.f191417d = r0
            boolean r0 = r5.f336533g
            r0 = r0 ^ r2
            y80.C66557b.f191420g = r0
            boolean r0 = r5.f336535i
            y80.C66557b.f191421h = r0
            y80.b r0 = r5.f336538l
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a90.C103332d.mo143174m():y80.b");
    }

    /* renamed from: n */
    public float[] mo143175n() {
        CameraCharacteristics cameraCharacteristics;
        if (this.f304704N == null && (cameraCharacteristics = this.f304697G) != null) {
            Float f = (Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
            if (f == null) {
                f = Float.valueOf(0.0f);
            }
            float f2 = (float) 10;
            int floatValue = (int) (((((float) ((int) (f.floatValue() * f2))) * 1.0f) / f2) * f2);
            this.f304704N = new float[floatValue];
            for (int i = 0; i < floatValue; i++) {
                float[] fArr = this.f304704N;
                C87412m.m108591d(fArr);
                fArr[i] = ((float) 1) + ((((float) i) * 1.0f) / f2);
            }
        }
        return this.f304704N;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.util.Range} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo143176o(int r9) {
        /*
            r8 = this;
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            j72.m r2 = j72.C108619m.f325223b
            com.tencent.mm.plugin.mmsight.SightParams r2 = r2.f325224a
            if (r2 == 0) goto L_0x0011
            int r1 = r2.f248463t
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L_0x0011:
            java.lang.String r2 = r8.f304712x
            r3 = 6
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r1
            gj.d r4 = p156gj.C107835h0.f322845b
            int r5 = r4.f322824w
            r6 = 1
            if (r5 != r6) goto L_0x0022
            java.lang.String r5 = "Range"
            goto L_0x002b
        L_0x0022:
            int r5 = r4.f322823v
            if (r5 != r6) goto L_0x0029
            java.lang.String r5 = "Fix"
            goto L_0x002b
        L_0x0029:
            java.lang.String r5 = "Error"
        L_0x002b:
            r3[r6] = r5
            int r4 = r4.f322825x
            if (r4 != r6) goto L_0x0033
            r4 = 1
            goto L_0x0034
        L_0x0033:
            r4 = 0
        L_0x0034:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r5 = 2
            r3[r5] = r4
            r4 = 3
            gj.d r7 = p156gj.C107835h0.f322845b
            int r7 = r7.f322826y
            if (r7 != r6) goto L_0x0044
            r7 = 1
            goto L_0x0045
        L_0x0044:
            r7 = 0
        L_0x0045:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r3[r4] = r7
            r4 = 4
            gj.d r7 = p156gj.C107835h0.f322845b
            int r7 = r7.f322827z
            if (r7 != r6) goto L_0x0054
            r7 = 1
            goto L_0x0055
        L_0x0054:
            r7 = 0
        L_0x0055:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r3[r4] = r7
            gj.d r4 = p156gj.C107835h0.f322845b
            int r4 = r4.f322786A
            if (r4 != r6) goto L_0x0063
            r4 = 1
            goto L_0x0064
        L_0x0063:
            r4 = 0
        L_0x0064:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r7 = 5
            r3[r7] = r4
            java.lang.String r4 = "startPreview Texture:: sightTest %s, config list: setFPS[%s], setYUV420SP[%B], useMetering[%B], useContinueFocus[%B] mUseContinueVideoFocusMode[%B]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r3)
            gj.d r2 = p156gj.C107835h0.f322845b
            int r2 = r2.f322824w
            if (r2 != r6) goto L_0x0083
            int r2 = r1.intValue()
            if (r2 == 0) goto L_0x0097
            int r2 = r1.intValue()
            if (r2 != r6) goto L_0x0083
            goto L_0x0097
        L_0x0083:
            gj.d r2 = p156gj.C107835h0.f322845b
            int r2 = r2.f322823v
            if (r2 != r6) goto L_0x0097
            int r2 = r1.intValue()
            if (r2 == 0) goto L_0x0095
            int r1 = r1.intValue()
            if (r1 != r7) goto L_0x0097
        L_0x0095:
            r1 = 1
            goto L_0x0098
        L_0x0097:
            r1 = 0
        L_0x0098:
            l90.b$a r2 = r8.f336539m
            r3 = 0
            if (r2 == 0) goto L_0x00dd
            if (r2 == 0) goto L_0x00a2
            java.util.HashMap<java.lang.Integer, l90.b$a$a> r4 = r2.f174308a
            goto L_0x00a3
        L_0x00a2:
            r4 = r3
        L_0x00a3:
            if (r4 == 0) goto L_0x00dd
            if (r2 == 0) goto L_0x00ba
            java.util.HashMap<java.lang.Integer, l90.b$a$a> r2 = r2.f174308a
            if (r2 == 0) goto L_0x00ba
            int r4 = r8.mo143180s()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r2 = r2.get(r4)
            l90.b$a$a r2 = (l90.C109292b.C61240a.C61241a) r2
            goto L_0x00bb
        L_0x00ba:
            r2 = r3
        L_0x00bb:
            if (r2 == 0) goto L_0x00dd
            l90.b$a r2 = r8.f336539m
            if (r2 == 0) goto L_0x00dd
            java.util.HashMap<java.lang.Integer, l90.b$a$a> r2 = r2.f174308a
            if (r2 == 0) goto L_0x00dd
            int r4 = r8.mo143180s()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r2 = r2.get(r4)
            l90.b$a$a r2 = (l90.C109292b.C61240a.C61241a) r2
            if (r2 == 0) goto L_0x00dd
            java.lang.Boolean r2 = r2.f174313d
            if (r2 == 0) goto L_0x00dd
            boolean r1 = r2.booleanValue()
        L_0x00dd:
            android.hardware.camera2.CameraCharacteristics r2 = r8.f304697G
            if (r2 == 0) goto L_0x0122
            if (r1 == 0) goto L_0x00e7
            r8.mo143160Y(r2, r9)     // Catch:{ Exception -> 0x010c }
            goto L_0x00ea
        L_0x00e7:
            r8.mo143159X(r2, r9)     // Catch:{ Exception -> 0x010c }
        L_0x00ea:
            android.hardware.camera2.CaptureRequest$Builder r9 = r8.f304694D     // Catch:{ Exception -> 0x010c }
            if (r9 == 0) goto L_0x00f7
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE     // Catch:{ Exception -> 0x010c }
            java.lang.Object r9 = r9.get(r2)     // Catch:{ Exception -> 0x010c }
            r3 = r9
            android.util.Range r3 = (android.util.Range) r3     // Catch:{ Exception -> 0x010c }
        L_0x00f7:
            java.lang.String r9 = r8.f336529c     // Catch:{ Exception -> 0x010c }
            java.lang.String r2 = "use fix mode %B, supported preview frame rates %s"
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x010c }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ Exception -> 0x010c }
            r4[r0] = r1     // Catch:{ Exception -> 0x010c }
            r4[r6] = r3     // Catch:{ Exception -> 0x010c }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r2, r4)     // Catch:{ Exception -> 0x010c }
            r8.mo143153R()     // Catch:{ Exception -> 0x010c }
            goto L_0x0122
        L_0x010c:
            r9 = move-exception
            java.lang.String r1 = r8.f336529c
            java.lang.Object[] r2 = new java.lang.Object[r5]
            android.os.Looper r3 = android.os.Looper.myLooper()
            r2[r0] = r3
            java.lang.String r9 = r9.getMessage()
            r2[r6] = r9
            java.lang.String r9 = "setPreviewFrameRate Exception, %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r9, r2)
        L_0x0122:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a90.C103332d.mo143176o(int):void");
    }

    /* renamed from: p */
    public void mo143177p(C32226l<? super Boolean, C13598b0> lVar) {
        this.f304709S = lVar;
        C103331c cVar = C103331c.f304672a;
        C103331c.f304686o = lVar;
    }

    /* renamed from: q */
    public boolean mo143178q() {
        this.f304701K = true;
        C103331c cVar = C103331c.f304672a;
        C103331c.f304680i = true;
        Log.m105924i("MicroMsg.Camera2ProcessIDKeyStat", "markCamera2UseRecordStream");
        C115669n.INSTANCE.mo175913w(1099, 18, 1);
        return true;
    }

    public void release() {
        this.f336534h = C112397a.C112398a.CAMERA_IS_DEFAULT;
        if (this.f304693C != null) {
            long currentTicks = Util.currentTicks();
            Log.m105925i(this.f304712x, "release camera beg, %s", Looper.myLooper());
            this.f336531e.removeCallbacksAndMessages((Object) null);
            mo143148M();
            Surface surface = this.f304702L;
            if (surface != null) {
                surface.release();
            }
            Log.m105925i(this.f304712x, "release camera end, use %dms, %s", Long.valueOf(Util.ticksToNow(currentTicks)), Looper.myLooper());
        }
        this.f336545s = null;
        this.f336549w = false;
        Log.m105924i("MicroMsg.Camera2ProcessIDKeyStat", "markCamera2Release");
        C115669n.INSTANCE.mo175913w(1099, 3, 1);
    }

    /* renamed from: s */
    public int mo143180s() {
        return C87412m.m108589b(C103331c.f304674c, C103331c.f304672a.mo143135b(1)) ^ true ? 1 : 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
        r4 = r4.getCameraCharacteristics(java.lang.String.valueOf(a90.C103331c.f304674c));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setFlashMode(int r4) {
        /*
            r3 = this;
            android.hardware.camera2.CaptureRequest$Builder r0 = r3.f304694D
            if (r0 == 0) goto L_0x0042
            a90.c r1 = a90.C103331c.f304672a
            r2 = 1
            if (r4 == r2) goto L_0x003f
            r2 = 2
            if (r4 == r2) goto L_0x003a
            r1 = 3
            if (r4 == r1) goto L_0x0010
            goto L_0x0042
        L_0x0010:
            android.hardware.camera2.CameraManager r4 = a90.C103331c.f304673b
            if (r4 == 0) goto L_0x0029
            java.lang.String r1 = a90.C103331c.f304674c
            java.lang.String r1 = java.lang.String.valueOf(r1)
            android.hardware.camera2.CameraCharacteristics r4 = r4.getCameraCharacteristics(r1)
            if (r4 == 0) goto L_0x0029
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES
            java.lang.Object r4 = r4.get(r1)
            int[] r4 = (int[]) r4
            goto L_0x002a
        L_0x0029:
            r4 = 0
        L_0x002a:
            boolean r4 = p977hj.C87526a.m108856a(r4, r2)
            if (r4 == 0) goto L_0x0042
            android.hardware.camera2.CaptureRequest$Key r4 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.set(r4, r1)
            goto L_0x0042
        L_0x003a:
            r4 = 0
            r1.mo143139f(r4, r0)
            goto L_0x0042
        L_0x003f:
            r1.mo143139f(r2, r0)
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a90.C103332d.setFlashMode(int):void");
    }

    /* renamed from: t */
    public void mo143182t(C108382h hVar) {
    }

    /* renamed from: u */
    public void mo143183u(float f, float f2, int i, int i2, long j) {
        if (!C11171e.m11044a(14) && this.f304693C != null && this.f304695E != null && mo164109B()) {
            Rect rect = new Rect(0, 0, i, i2);
            this.f304699I = rect;
            CameraCharacteristics cameraCharacteristics = this.f304697G;
            if (cameraCharacteristics != null) {
                this.f304698H = new C103330b(cameraCharacteristics, rect);
            }
            C112609a aVar = this.f336531e;
            int i3 = C112609a.f337225o;
            aVar.removeMessages(4354);
            C112609a aVar2 = this.f336531e;
            aVar2.f337233h = f;
            aVar2.f337234i = f2;
            aVar2.f337235j = i;
            aVar2.f337236k = i2;
            aVar2.sendMessageDelayed(aVar2.obtainMessage(4354), j);
        }
    }

    /* renamed from: v */
    public void mo143184v(String str, boolean z) {
        C87412m.m108594g(str, "tag");
        if (C87412m.m108589b(str, "cameraeffect.request.facebeauty")) {
            C103331c cVar = C103331c.f304672a;
            C103331c.f304681j = z;
        } else if (C87412m.m108589b(str, "cameraeffect.request.hdr")) {
            C103331c cVar2 = C103331c.f304672a;
            C103331c.f304677f = z;
        } else if (C87412m.m108589b(str, "cameraeffect.request.denois")) {
            C103331c cVar3 = C103331c.f304672a;
            C103331c.f304678g = z;
        } else if (C87412m.m108589b(str, "cameraeffect.request.hdrchecker")) {
            C103331c cVar4 = C103331c.f304672a;
            C103331c.f304679h = z;
        } else if (C87412m.m108589b(str, "cameraeffect.request.stabilization")) {
            C103331c cVar5 = C103331c.f304672a;
            C103331c.f304680i = z;
        }
        mo143153R();
    }

    /* renamed from: w */
    public void mo143185w(C108382h hVar) {
    }

    /* renamed from: x */
    public String mo143186x() {
        CaptureRequest captureRequest = this.f304696F;
        if (captureRequest != null) {
            Integer num = (Integer) captureRequest.get(CaptureRequest.CONTROL_AF_MODE);
            if (num == null || num.intValue() != 1) {
                if (num != null && num.intValue() == 4) {
                    return "continue-picture";
                }
                if (num != null && num.intValue() == 3) {
                    return "continue-video";
                }
            }
            return "auto";
        }
        C87412m.m108603p("previewRequest");
        throw null;
    }

    /* renamed from: y */
    public void mo143187y() {
        if (mo164109B()) {
            C112609a aVar = this.f336531e;
            int i = C112609a.f337225o;
            aVar.removeMessages(4354);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a8 A[Catch:{ Exception -> 0x00af }] */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo143188z(android.graphics.SurfaceTexture r20, boolean r21, java.lang.Float r22, int r23) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            java.util.concurrent.Semaphore r5 = r1.f304691A
            r5.acquire()
            java.util.concurrent.Semaphore r5 = r1.f304691A
            r5.release()
            r1.f336540n = r0
            r1.f336535i = r2
            r1.f336542p = r4
            r1.f336544r = r3
            if (r3 == 0) goto L_0x00f9
            float r2 = r22.floatValue()
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            java.lang.String r3 = r1.f304712x
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "start startPreviewWithGPU,Looper.myLooper(): "
            r7.append(r8)
            android.os.Looper r8 = android.os.Looper.myLooper()
            r7.append(r8)
            java.lang.String r8 = "  ,surfaceTexture:"
            r7.append(r8)
            r7.append(r0)
            java.lang.String r8 = ", surface:"
            r7.append(r8)
            r8 = 0
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r7)
            boolean r3 = r19.mo164109B()
            if (r3 == 0) goto L_0x0060
            java.lang.String r0 = r1.f304712x
            java.lang.String r2 = "startPreviewWithGPU, camera previewing"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            goto L_0x00fc
        L_0x0060:
            android.hardware.camera2.CameraManager r3 = r1.f304692B
            java.lang.String r7 = a90.C103331c.f304674c
            if (r3 == 0) goto L_0x00f1
            boolean r9 = android.text.TextUtils.isEmpty(r7)
            if (r9 == 0) goto L_0x006e
            goto L_0x00f1
        L_0x006e:
            r9 = 2
            r10 = 1
            r11 = 0
            gy3.C87412m.m108591d(r7)     // Catch:{ Exception -> 0x00af }
            android.hardware.camera2.CameraCharacteristics r3 = r3.getCameraCharacteristics(r7)     // Catch:{ Exception -> 0x00af }
            r1.f304697G = r3     // Catch:{ Exception -> 0x00af }
            boolean r2 = r1.mo143156U(r2, r4)     // Catch:{ Exception -> 0x00af }
            if (r2 != 0) goto L_0x0085
            r1.mo143158W(r0, r8, r4)     // Catch:{ Exception -> 0x00af }
            goto L_0x00fc
        L_0x0085:
            boolean r2 = r1.f304701K     // Catch:{ Exception -> 0x00af }
            if (r2 == 0) goto L_0x0093
            android.hardware.camera2.CameraDevice r2 = r1.f304693C     // Catch:{ Exception -> 0x00af }
            if (r2 == 0) goto L_0x009c
            r3 = 3
            android.hardware.camera2.CaptureRequest$Builder r2 = r2.createCaptureRequest(r3)     // Catch:{ Exception -> 0x00af }
            goto L_0x009d
        L_0x0093:
            android.hardware.camera2.CameraDevice r2 = r1.f304693C     // Catch:{ Exception -> 0x00af }
            if (r2 == 0) goto L_0x009c
            android.hardware.camera2.CaptureRequest$Builder r2 = r2.createCaptureRequest(r10)     // Catch:{ Exception -> 0x00af }
            goto L_0x009d
        L_0x009c:
            r2 = r8
        L_0x009d:
            r1.f304694D = r2     // Catch:{ Exception -> 0x00af }
            r19.mo143157V()     // Catch:{ Exception -> 0x00af }
            boolean r0 = r1.mo143149N(r0, r8)     // Catch:{ Exception -> 0x00af }
            if (r0 == 0) goto L_0x00d7
            y80.a$a r0 = y80.C112397a.C112398a.CAMERA_IS_PREVIEWING     // Catch:{ Exception -> 0x00af }
            r1.f336534h = r0     // Catch:{ Exception -> 0x00af }
            r1.f304708R = r11     // Catch:{ Exception -> 0x00af }
            goto L_0x00d7
        L_0x00af:
            r0 = move-exception
            java.lang.String r2 = r1.f304712x
            java.lang.Object[] r3 = new java.lang.Object[r9]
            android.os.Looper r4 = android.os.Looper.myLooper()
            r3[r11] = r4
            java.lang.String r0 = r0.getMessage()
            r3[r10] = r0
            java.lang.String r0 = "start preview FAILED, %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r0, r3)
            java.lang.String r0 = "MicroMsg.MediaEditorIDKeyStat"
            java.lang.String r2 = "markCameraOpenFailed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            com.tencent.mm.plugin.report.service.n r12 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r13 = 985(0x3d9, double:4.867E-321)
            r15 = 5
            r17 = 1
            r12.mo175913w(r13, r15, r17)
        L_0x00d7:
            java.lang.String r0 = r1.f304712x
            java.lang.Object[] r2 = new java.lang.Object[r9]
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r5)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2[r11] = r3
            android.os.Looper r3 = android.os.Looper.myLooper()
            r2[r10] = r3
            java.lang.String r3 = "start preview end, use %dms %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r3, r2)
            goto L_0x00fc
        L_0x00f1:
            java.lang.String r0 = r1.f304712x
            java.lang.String r2 = "startPreviewWithGPURatio error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)
            goto L_0x00fc
        L_0x00f9:
            r1.mo143169h(r0, r2, r4)
        L_0x00fc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a90.C103332d.mo143188z(android.graphics.SurfaceTexture, boolean, java.lang.Float, int):void");
    }
}
