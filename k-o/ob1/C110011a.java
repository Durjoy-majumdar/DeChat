package ob1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ImageFormat;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.HandlerThread;
import android.view.TextureView;
import android.widget.ImageView;
import android.widget.TextView;
import au1.C0222b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.memory.C92702a;
import com.tencent.p014mm.p136ui.base.MMTextureView;
import com.tencent.p014mm.plugin.facedetect.model.C105224h;
import com.tencent.p014mm.plugin.facedetect.model.C93390g;
import com.tencent.p014mm.plugin.facedetectaction.p046ui.FaceActionMask;
import com.tencent.p014mm.plugin.facedetectaction.p046ui.FaceActionUI;
import com.tencent.p014mm.plugin.facedetectlight.p1100ui.PreviewFrameLayout;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.youtu.ytposedetect.YTPoseDetectInterface;
import di3.C86312j;
import eu3.C58834h;
import eu3.C97749e;
import h81.C32735h;
import java.io.IOException;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicInteger;
import mb1.C109594b;
import mb1.C109595c;
import mb1.C109603j;
import nb1.C109728a;
import p156gj.C107831f;
import p156gj.C107848z;
import zt3.C119157j;

/* renamed from: ob1.a */
public class C110011a implements TextureView.SurfaceTextureListener {

    /* renamed from: A */
    public PreviewFrameLayout f329220A;

    /* renamed from: B */
    public int f329221B = 0;

    /* renamed from: C */
    public ImageView f329222C;

    /* renamed from: D */
    public ImageView f329223D;

    /* renamed from: E */
    public Bitmap f329224E;

    /* renamed from: F */
    public boolean f329225F;

    /* renamed from: G */
    public int f329226G;

    /* renamed from: H */
    public C109595c.C109596a f329227H;

    /* renamed from: I */
    public C107831f f329228I;

    /* renamed from: J */
    public MMHandler f329229J = new MMHandler("mPreviewHandlerThread");

    /* renamed from: K */
    public int f329230K;

    /* renamed from: L */
    public volatile AtomicInteger f329231L;

    /* renamed from: M */
    public boolean f329232M;

    /* renamed from: N */
    public boolean f329233N;

    /* renamed from: P */
    public Camera.PreviewCallback f329234P;

    /* renamed from: Q */
    public C105224h.C105226b f329235Q;

    /* renamed from: d */
    public MMTextureView f329236d;

    /* renamed from: e */
    public HandlerThread f329237e;

    /* renamed from: f */
    public MMHandler f329238f;

    /* renamed from: g */
    public C107848z f329239g;

    /* renamed from: h */
    public int f329240h;

    /* renamed from: i */
    public int f329241i;

    /* renamed from: j */
    public int f329242j;

    /* renamed from: n */
    public boolean f329243n;

    /* renamed from: o */
    public boolean f329244o;

    /* renamed from: p */
    public volatile boolean f329245p;

    /* renamed from: q */
    public volatile boolean f329246q;

    /* renamed from: r */
    public volatile boolean f329247r;

    /* renamed from: s */
    public int f329248s;

    /* renamed from: t */
    public String f329249t;

    /* renamed from: u */
    public Point f329250u = null;

    /* renamed from: v */
    public Point f329251v = null;

    /* renamed from: w */
    public Point f329252w = null;

    /* renamed from: x */
    public FaceActionUI f329253x;

    /* renamed from: y */
    public TextView f329254y;

    /* renamed from: z */
    public FaceActionMask f329255z;

    /* renamed from: ob1.a$a */
    public class C110012a implements Camera.PreviewCallback {

        /* renamed from: d */
        public final /* synthetic */ Camera.PreviewCallback f329256d;

        /* renamed from: ob1.a$a$a */
        public class C110013a implements Runnable {
            public C110013a() {
            }

            public void run() {
                MMTextureView mMTextureView = C110011a.this.f329236d;
                if (mMTextureView != null) {
                    mMTextureView.setAlpha(1.0f);
                }
            }
        }

        public C110012a(Camera.PreviewCallback previewCallback) {
            this.f329256d = previewCallback;
        }

        public void onPreviewFrame(byte[] bArr, Camera camera) {
            MMHandlerThread.postToMainThread(new C110013a());
            Camera.PreviewCallback previewCallback = this.f329256d;
            if (previewCallback != null) {
                previewCallback.onPreviewFrame(bArr, camera);
            }
            camera.addCallbackBuffer(bArr);
        }
    }

    /* renamed from: ob1.a$b */
    public class C110014b implements Camera.PreviewCallback {
        public C110014b() {
        }

        public void onPreviewFrame(byte[] bArr, Camera camera) {
            C110011a aVar = C110011a.this;
            if (!aVar.f329233N) {
                if (aVar.f329229J != null) {
                    if (aVar.f329232M) {
                        int i = aVar.f329231L.get();
                        C110011a aVar2 = C110011a.this;
                        if (i >= aVar2.f329230K) {
                            Log.m105925i("MicroMsg.FaceReflectCam", "drop frame  %d", Integer.valueOf(aVar2.f329231L.get()));
                            return;
                        }
                    }
                    C110011a aVar3 = C110011a.this;
                    aVar3.f329229J.postToWorker(aVar3.f329232M ? new C110021h(bArr, camera) : new C110022i(bArr, camera));
                }
            } else if (aVar.f329246q && C110011a.this.f329247r && C110011a.this.f329226G == 2) {
                C109595c.C109597b.f328115a.mo160807a(bArr, camera);
            }
        }
    }

    /* renamed from: ob1.a$c */
    public class C110015c implements Runnable {
        public C110015c() {
        }

        public void run() {
            C110011a.this.f329222C.setVisibility(8);
            C110011a.this.f329223D.setVisibility(8);
            C110011a.this.f329225F = true;
        }
    }

    /* renamed from: ob1.a$d */
    public class C110016d implements Runnable {

        /* renamed from: ob1.a$d$a */
        public class C110017a implements Runnable {
            public C110017a() {
            }

            public void run() {
                C107848z zVar = C110011a.this.f329239g;
                if (zVar == null || zVar.f322938c || !C110011a.this.f329245p) {
                    Log.m105920e("MicroMsg.FaceReflectCam", "camera is null or has released!");
                    return;
                }
                C110011a aVar = C110011a.this;
                if (aVar.f329226G != 1) {
                    C109595c cVar = C109595c.C109597b.f328115a;
                    Context applicationContext = aVar.f329253x.getApplicationContext();
                    C110011a aVar2 = C110011a.this;
                    FaceActionUI faceActionUI = aVar2.f329253x;
                    Camera camera = aVar2.f329239g.f322936a;
                    int i = aVar2.f329221B;
                    TextView textView = aVar2.f329254y;
                    C109595c.C109596a aVar3 = aVar2.f329227H;
                    int i2 = aVar2.f329242j;
                    C110011a aVar4 = C110011a.this;
                    Point point = new Point(aVar4.f329240h, aVar4.f329241i);
                    C110011a aVar5 = C110011a.this;
                    int i3 = aVar5.f329248s;
                    String str = aVar5.f329249t;
                    int i4 = aVar5.f329240h;
                    int i5 = aVar5.f329241i;
                    Log.m105924i("MicroMsg.FaceActionLogic", "initFaceDetect（）");
                    cVar.f328104a = applicationContext;
                    cVar.f328105b = i;
                    cVar.f328108e = textView;
                    cVar.f328109f = faceActionUI.getResources().getDisplayMetrics().widthPixels;
                    cVar.f328110g = faceActionUI.getResources().getDisplayMetrics().heightPixels;
                    Log.m105925i("MicroMsg.FaceActionLogic", "mUiWidth:%s  mUiHeight：%s", Integer.valueOf(cVar.f328109f), Integer.valueOf(cVar.f328110g));
                    cVar.f328106c = i3;
                    cVar.f328107d = str;
                    cVar.f328111h = i4;
                    cVar.f328112i = i5;
                    new Rect(0, 0, 0, 0);
                    new Rect(0, 0, 0, 0);
                    cVar.f328114k = true;
                    Log.m105925i("MicroMsg.FaceActionLogic", "action：%s,mActionHint:%s", Integer.valueOf(cVar.f328106c), cVar.f328107d);
                    String str2 = cVar.f328107d;
                    if (str2 != null) {
                        cVar.f328108e.setText(str2);
                    } else {
                        int i6 = cVar.f328106c;
                        if (i6 == 1) {
                            cVar.f328108e.setText(C0966R.string.chq);
                        } else if (i6 == 2) {
                            cVar.f328108e.setText(C0966R.string.chr);
                        }
                    }
                    YTPoseDetectInterface.start(applicationContext.getApplicationContext(), camera, i, new C109594b(cVar));
                    Log.m105925i("MicroMsg.FaceActionLogic", "init face detect, camera, rotate: %s", Integer.valueOf(i2));
                    C109603j jVar = C109603j.f328125A;
                    jVar.f328140u = i2;
                    int i7 = point.x;
                    int i8 = point.y;
                    jVar.f328141v = i7;
                    jVar.f328142w = i8;
                }
            }
        }

        public C110016d() {
        }

        public void run() {
            C110011a aVar = C110011a.this;
            aVar.f329245p = C110011a.m149536b(aVar);
            if (!C110011a.this.f329245p) {
                C115669n.INSTANCE.idkeyStat(917, C110011a.this.f329226G == 1 ? 3 : 39, 1, false);
                C110011a aVar2 = C110011a.this;
                aVar2.f329245p = C110011a.m149536b(aVar2);
            }
            C115669n.INSTANCE.idkeyStat(917, C110011a.this.f329226G == 1 ? 2 : 38, 1, false);
            MMHandlerThread.postToMainThread(new C110017a());
        }
    }

    /* renamed from: ob1.a$e */
    public class C110018e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ SurfaceTexture f329263d;

        public C110018e(SurfaceTexture surfaceTexture) {
            this.f329263d = surfaceTexture;
        }

        public void run() {
            try {
                C110011a.m149535a(C110011a.this, this.f329263d);
                C110011a aVar = C110011a.this;
                aVar.mo161350f(aVar.f329234P);
                C0222b.m172k("openCamera");
            } catch (Exception unused) {
                C0222b.m173l("openCamera", -1);
                if (C110011a.this.f329226G != 1) {
                    Log.m105924i("MicroMsg.FaceReflectCam", "preview error");
                    FaceActionUI faceActionUI = C110011a.this.f329253x;
                    faceActionUI.getClass();
                    ((C119157j) C119157j.f356862d).mo183895z(new C109728a(faceActionUI));
                }
            }
        }
    }

    /* renamed from: ob1.a$f */
    public class C110019f implements Runnable {
        public C110019f() {
        }

        public void run() {
            C110011a.this.mo161348c();
        }
    }

    /* renamed from: ob1.a$g */
    public class C110020g implements C105224h.C105226b {
        public C110020g(C110011a aVar) {
        }

        /* renamed from: a */
        public void mo149592a(byte[] bArr) {
            C93390g gVar = C93390g.f269584d;
            synchronized (gVar) {
                gVar.mo126900k(bArr);
            }
        }

        /* renamed from: b */
        public C92702a<byte[]> mo149593b() {
            return C93390g.f269584d;
        }
    }

    /* renamed from: ob1.a$h */
    public class C110021h implements Runnable {

        /* renamed from: d */
        public byte[] f329266d;

        /* renamed from: e */
        public Camera f329267e;

        public C110021h(byte[] bArr, Camera camera) {
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f329266d = bArr2;
            this.f329267e = camera;
            C110011a.this.f329231L.set(C110011a.this.f329231L.get() + 1);
        }

        public void run() {
            byte[] bArr;
            if (C110011a.this.f329246q && C110011a.this.f329247r && C110011a.this.f329226G == 2 && (bArr = this.f329266d) != null && bArr.length > 0) {
                C109595c.C109597b.f328115a.mo160807a(bArr, this.f329267e);
                this.f329266d = null;
                C110011a.this.f329231L.set(C110011a.this.f329231L.get() - 1);
            }
        }
    }

    /* renamed from: ob1.a$i */
    public class C110022i implements Runnable {

        /* renamed from: d */
        public byte[] f329269d;

        /* renamed from: e */
        public Camera f329270e;

        public C110022i(byte[] bArr, Camera camera) {
            this.f329269d = bArr;
            this.f329270e = camera;
        }

        public void run() {
            if (C110011a.this.f329246q && C110011a.this.f329247r && C110011a.this.f329226G == 2) {
                C109595c.C109597b.f328115a.mo160807a(this.f329269d, this.f329270e);
            }
        }
    }

    /* renamed from: ob1.a$j */
    public static class C110023j implements Comparator<Camera.Size> {
        public C110023j(C110014b bVar) {
        }

        public int compare(Object obj, Object obj2) {
            Camera.Size size = (Camera.Size) obj;
            Camera.Size size2 = (Camera.Size) obj2;
            int i = size.height * size.width;
            int i2 = size2.height * size2.width;
            if (i2 < i) {
                return -1;
            }
            return i2 > i ? 1 : 0;
        }
    }

    public C110011a(FaceActionUI faceActionUI, C109595c.C109596a aVar) {
        Class cls = C32735h.class;
        this.f329230K = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_face_action_cache_data_size, 5);
        this.f329231L = new AtomicInteger(0);
        this.f329232M = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_face_action_copy_data, true);
        this.f329233N = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_face_action_old_ui_camera_preview_sy, false);
        this.f329234P = new C110014b();
        this.f329235Q = new C110020g(this);
        this.f329226G = 2;
        this.f329253x = faceActionUI;
        this.f329245p = false;
        this.f329247r = false;
        this.f329237e = null;
        this.f329245p = false;
        this.f329225F = false;
        this.f329227H = aVar;
        Log.m105925i("MicroMsg.FaceReflectCam", "clicfg_face_action_copy_data :%b，enableCameraPreviewSy：%b", Boolean.valueOf(this.f329232M), Boolean.valueOf(this.f329233N));
    }

    /* renamed from: a */
    public static void m149535a(C110011a aVar, SurfaceTexture surfaceTexture) {
        aVar.getClass();
        Log.m105924i("MicroMsg.FaceReflectCam", "start Preview");
        Log.m105924i("MicroMsg.FaceReflectCam", "mIsPreviewing is " + aVar.f329247r);
        if (aVar.f329239g != null && !aVar.f329247r) {
            try {
                aVar.f329239g.mo158265i(surfaceTexture);
            } catch (IOException e) {
                Log.m105924i("MicroMsg.FaceReflectCam", "start Preview failed:" + e.getMessage());
            }
            C93390g.m117951o(aVar.f329240h, aVar.f329241i, 5);
            aVar.f329239g.mo158267k();
            aVar.f329247r = true;
            Log.m105924i("MicroMsg.FaceReflectCam", "start preview, is previewing");
            if (aVar.f329226G == 1) {
                MMHandlerThread.postToMainThreadDelayed(new C110025c(aVar), 500);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:162:0x04f4  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m149536b(ob1.C110011a r19) {
        /*
            r1 = r19
            r19.getClass()
            java.lang.String r2 = "MicroMsg.FaceReflectCam"
            java.lang.String r0 = "start open camera"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            r3 = 0
            r1.f329245p = r3
            r4 = 1
            r1.f329244o = r4
            ej.c r0 = p149ej.C107276c.f320945a
            int r0 = r0.mo157751d()
            r5 = 0
        L_0x001a:
            r6 = -1
            if (r5 >= r0) goto L_0x0040
            android.hardware.Camera$CameraInfo r7 = new android.hardware.Camera$CameraInfo
            r7.<init>()
            android.hardware.Camera.getCameraInfo(r5, r7)
            int r7 = r7.facing
            java.lang.String r8 = "hy: front Camera found"
            if (r7 != r4) goto L_0x0033
            boolean r9 = r1.f329244o
            if (r9 == 0) goto L_0x0033
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r8)
            goto L_0x0041
        L_0x0033:
            if (r7 != 0) goto L_0x003d
            boolean r7 = r1.f329244o
            if (r7 != 0) goto L_0x003d
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r8)
            goto L_0x0041
        L_0x003d:
            int r5 = r5 + 1
            goto L_0x001a
        L_0x0040:
            r5 = -1
        L_0x0041:
            if (r5 != r6) goto L_0x004a
            java.lang.String r0 = "not found available camera id"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            goto L_0x0595
        L_0x004a:
            long r6 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r8 = "openCameraRes："
            r0.append(r8)
            gj.f r8 = r1.f329228I
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            gj.f r0 = r1.f329228I
            r8 = 0
            if (r0 != 0) goto L_0x0091
            java.lang.String r0 = "openCameraRes is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            int r0 = r1.f329226G
            if (r0 != r4) goto L_0x0080
            java.lang.String r0 = "mFaceReflectController openCameraRe"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            gj.f r0 = p156gj.C107828e.m146101d(r8, r5, r8)     // Catch:{ Exception -> 0x0595 }
            r1.f329228I = r0     // Catch:{ Exception -> 0x0595 }
            goto L_0x0091
        L_0x0080:
            java.lang.String r0 = "mFaceActionUI openCameraRe"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI r0 = r1.f329253x
            androidx.appcompat.app.AppCompatActivity r0 = r0.getContext()
            gj.f r0 = p156gj.C107828e.m146101d(r0, r5, r8)
            r1.f329228I = r0
        L_0x0091:
            gj.f r0 = r1.f329228I
            if (r0 == 0) goto L_0x0570
            r1.f329221B = r5
            r1.f329245p = r4
            r9 = 2
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0[r3] = r5
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r6)
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r0[r4] = r5
            java.lang.String r5 = "openCamera done, cameraId=[%s] costTime=[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r5, r0)
            gj.f r0 = r1.f329228I
            int r5 = r0.f322840b
            r1.f329242j = r5
            int r5 = r5 % 180
            if (r5 == 0) goto L_0x00be
            r5 = 1
            goto L_0x00bf
        L_0x00be:
            r5 = 0
        L_0x00bf:
            r1.f329243n = r5
            gj.z r0 = r0.f322839a
            r1.f329239g = r0
            if (r0 == 0) goto L_0x00c8
            goto L_0x00f5
        L_0x00c8:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r0[r3] = r5
            java.lang.String r5 = "in open(), camera == null, bNeedRotate=[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r5, r0)
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x00db }
            r0.<init>()     // Catch:{ IOException -> 0x00db }
            throw r0     // Catch:{ IOException -> 0x00db }
        L_0x00db:
            r0 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "set cameraRotation exception"
            r5.append(r6)
            java.lang.String r0 = r0.getMessage()
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
        L_0x00f5:
            gj.z r0 = r1.f329239g     // Catch:{ Exception -> 0x0560 }
            android.hardware.Camera$Parameters r5 = r0.mo158259c()     // Catch:{ Exception -> 0x0560 }
            int r0 = r1.f329226G
            if (r0 == r4) goto L_0x055e
            com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI r0 = r1.f329253x
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.widthPixels
            com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI r6 = r1.f329253x
            android.content.res.Resources r6 = r6.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            int r6 = r6.heightPixels
            if (r5 != 0) goto L_0x011b
            goto L_0x0595
        L_0x011b:
            android.graphics.Point r7 = new android.graphics.Point
            r7.<init>(r0, r6)
            r1.f329251v = r7
            java.lang.String r0 = "preview-size-values"
            java.lang.String r0 = r5.get(r0)
            if (r0 != 0) goto L_0x0132
            java.lang.String r0 = "preview-size-value"
            java.lang.String r0 = r5.get(r0)
        L_0x0132:
            r6 = 3
            if (r0 == 0) goto L_0x02a8
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "preview-size-values parameter: "
            r10.append(r11)
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r10 = r5.getSupportedPreviewSizes()
            r0.<init>(r10)
            ob1.a$j r10 = new ob1.a$j
            r10.<init>(r8)
            java.util.Collections.sort(r0, r10)
            int r10 = r7.x
            float r11 = (float) r10
            int r12 = r7.y
            float r12 = (float) r12
            float r11 = r11 / r12
            java.lang.Object[] r12 = new java.lang.Object[r6]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r12[r3] = r10
            int r10 = r7.y
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r12[r4] = r10
            java.lang.Float r10 = java.lang.Float.valueOf(r11)
            r12[r9] = r10
            java.lang.String r10 = "screen.x: %d, screen.y: %d, ratio: %f"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r10, r12)
            android.content.Context r10 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            long r12 = com.tencent.p014mm.sdk.platformtools.Util.getAvailableMemoryMB(r10)
            java.lang.Object[] r10 = new java.lang.Object[r4]
            java.lang.Long r14 = java.lang.Long.valueOf(r12)
            r10[r3] = r14
            java.lang.String r14 = "systemAvailableMemInMB: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r14, r10)
            java.util.Iterator r0 = r0.iterator()
            r10 = 2139095040(0x7f800000, float:Infinity)
            r14 = r8
        L_0x019b:
            boolean r15 = r0.hasNext()
            if (r15 == 0) goto L_0x0267
            java.lang.Object r15 = r0.next()
            android.hardware.Camera$Size r15 = (android.hardware.Camera.Size) r15
            int r8 = r15.width
            int r15 = r15.height
            java.lang.Object[] r6 = new java.lang.Object[r9]
            java.lang.Integer r16 = java.lang.Integer.valueOf(r8)
            r6[r3] = r16
            java.lang.Integer r16 = java.lang.Integer.valueOf(r15)
            r6[r4] = r16
            java.lang.String r4 = "realWidth: %d, realHeight: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r6)
            int r4 = r8 * r15
            r6 = 150400(0x24b80, float:2.10755E-40)
            if (r4 >= r6) goto L_0x01c7
            goto L_0x01cb
        L_0x01c7:
            r6 = 983040(0xf0000, float:1.377532E-39)
            if (r4 <= r6) goto L_0x01cf
        L_0x01cb:
            r17 = r0
            goto L_0x025f
        L_0x01cf:
            if (r8 <= r15) goto L_0x01d3
            r4 = 1
            goto L_0x01d4
        L_0x01d3:
            r4 = 0
        L_0x01d4:
            if (r4 == 0) goto L_0x01d8
            r6 = r15
            goto L_0x01d9
        L_0x01d8:
            r6 = r8
        L_0x01d9:
            r17 = r0
            if (r4 == 0) goto L_0x01df
            r4 = r8
            goto L_0x01e0
        L_0x01df:
            r4 = r15
        L_0x01e0:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Integer r18 = java.lang.Integer.valueOf(r6)
            r0[r3] = r18
            java.lang.Integer r18 = java.lang.Integer.valueOf(r4)
            r16 = 1
            r0[r16] = r18
            java.lang.String r9 = "maybeFlippedWidth: %d, maybeFlippedHeight: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r9, r0)
            int r0 = r7.x
            if (r6 != r0) goto L_0x021e
            int r0 = r7.y
            if (r4 != r0) goto L_0x021e
            boolean r0 = m149537d(r6, r4, r12)
            if (r0 == 0) goto L_0x021e
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>(r8, r15)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Found preview size exactly matching screen size: "
            r4.append(r6)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            goto L_0x02a9
        L_0x021e:
            float r0 = (float) r6
            float r4 = (float) r4
            float r0 = r0 / r4
            float r0 = r0 - r11
            float r0 = java.lang.Math.abs(r0)
            int r4 = r8 % 10
            if (r4 == 0) goto L_0x022b
            goto L_0x025f
        L_0x022b:
            int r4 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r4 >= 0) goto L_0x023c
            boolean r4 = m149537d(r8, r15, r12)
            if (r4 == 0) goto L_0x023c
            android.graphics.Point r4 = new android.graphics.Point
            r4.<init>(r8, r15)
            r10 = r0
            r14 = r4
        L_0x023c:
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Float r6 = java.lang.Float.valueOf(r10)
            r4[r3] = r6
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r6 = 1
            r4[r6] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r6 = 2
            r4[r6] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            r6 = 3
            r4[r6] = r0
            java.lang.String r0 = "diff:[%s] newdiff:[%s] w:[%s] h:[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r0, r4)
        L_0x025f:
            r0 = r17
            r4 = 1
            r6 = 3
            r8 = 0
            r9 = 2
            goto L_0x019b
        L_0x0267:
            if (r14 != 0) goto L_0x0292
            android.hardware.Camera$Size r0 = r5.getPreviewSize()
            if (r0 == 0) goto L_0x028d
            android.graphics.Point r14 = new android.graphics.Point
            int r4 = r0.width
            int r0 = r0.height
            r14.<init>(r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "No suitable preview sizes, using default: "
            r0.append(r4)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            goto L_0x0292
        L_0x028d:
            java.lang.String r0 = "hy: can not find default size!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
        L_0x0292:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "Found best approximate preview size: "
            r0.append(r4)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            r0 = r14
            goto L_0x02a9
        L_0x02a8:
            r0 = 0
        L_0x02a9:
            if (r0 == 0) goto L_0x055a
            r1.f329250u = r0
            android.graphics.Point r0 = new android.graphics.Point
            android.graphics.Point r4 = r1.f329250u
            r0.<init>(r4)
            r1.f329252w = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "getCameraResolution: "
            r0.append(r4)
            android.graphics.Point r4 = r1.f329251v
            r0.append(r4)
            java.lang.String r4 = " camera:"
            r0.append(r4)
            android.graphics.Point r4 = r1.f329250u
            r0.append(r4)
            java.lang.String r4 = "bestVideoEncodeSize: "
            r0.append(r4)
            android.graphics.Point r4 = r1.f329252w
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)
            android.graphics.Point r0 = r1.f329250u
            int r4 = r0.x
            r1.f329240h = r4
            int r0 = r0.y
            r1.f329241i = r0
            r5.setPreviewSize(r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "mDesiredPreviewWidth："
            r0.append(r4)
            int r4 = r1.f329240h
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "mDesiredPreviewHeight："
            r0.append(r4)
            int r4 = r1.f329241i
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            r5.setZoom(r3)
            java.lang.String r0 = "auto"
            r5.setSceneMode(r0)
            java.util.List r4 = r5.getSupportedFocusModes()     // Catch:{ Exception -> 0x0341 }
            if (r4 == 0) goto L_0x033b
            java.util.List r4 = r5.getSupportedFocusModes()     // Catch:{ Exception -> 0x0341 }
            boolean r4 = r4.contains(r0)     // Catch:{ Exception -> 0x0341 }
            if (r4 == 0) goto L_0x033b
            java.lang.String r4 = "set FocusMode to FOCUS_MODE_AUTO"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)     // Catch:{ Exception -> 0x0341 }
            r5.setFocusMode(r0)     // Catch:{ Exception -> 0x0341 }
            goto L_0x0351
        L_0x033b:
            java.lang.String r0 = "camera not support FOCUS_MODE_AUTO"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)     // Catch:{ Exception -> 0x0341 }
            goto L_0x0351
        L_0x0341:
            r0 = move-exception
            r4 = 1
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.String r0 = r0.getMessage()
            r6[r3] = r0
            java.lang.String r0 = "set focus mode error: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r0, r6)
        L_0x0351:
            java.util.List r0 = r5.getSupportedPreviewFormats()
            java.util.Iterator r4 = r0.iterator()
            r6 = 0
        L_0x035a:
            boolean r7 = r4.hasNext()
            r8 = 842094169(0x32315659, float:1.0322389E-8)
            r9 = 17
            if (r7 == 0) goto L_0x038c
            java.lang.Object r7 = r4.next()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "supportedPreviewFormat: "
            r10.append(r11)
            r10.append(r7)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r10)
            if (r7 != r9) goto L_0x0388
            r4 = 1
            goto L_0x038d
        L_0x0388:
            if (r7 != r8) goto L_0x035a
            r6 = 1
            goto L_0x035a
        L_0x038c:
            r4 = 0
        L_0x038d:
            if (r4 == 0) goto L_0x0393
            r5.setPreviewFormat(r9)
            goto L_0x03b9
        L_0x0393:
            if (r6 == 0) goto L_0x039e
            java.lang.String r0 = "Preview not support PixelFormat.YCbCr_420_SP, but hasYU12"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            r5.setPreviewFormat(r8)
            goto L_0x03b9
        L_0x039e:
            r4 = 1
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.Object r4 = r0.get(r3)
            r6[r3] = r4
            java.lang.String r4 = "Preview not support PixelFormat.YCbCr_420_SP. Use format: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r4, r6)
            java.lang.Object r0 = r0.get(r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r5.setPreviewFormat(r0)
        L_0x03b9:
            boolean r0 = r1.f329243n
            if (r0 == 0) goto L_0x03c2
            int r0 = r1.f329242j
            r5.setRotation(r0)
        L_0x03c2:
            com.tencent.mm.plugin.facedetectlight.ui.PreviewFrameLayout r0 = r1.f329220A
            double r6 = r0.getmAspectRatio()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "original ratio="
            r0.append(r4)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)
            int r0 = r1.f329240h
            double r8 = (double) r0
            int r0 = r1.f329241i
            double r10 = (double) r0
            double r8 = r8 / r10
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "new ratio="
            r0.append(r4)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0402
            java.lang.String r0 = "NO NEED reset ratio"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)
            goto L_0x0410
        L_0x0402:
            java.lang.String r0 = "start reset ratio"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)
            ob1.b r0 = new ob1.b
            r0.<init>(r1, r8)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
        L_0x0410:
            gj.d r0 = p156gj.C107835h0.f322845b
            int r0 = r0.f322821t
            if (r0 <= 0) goto L_0x041e
            java.lang.String r0 = "set frame rate > 0, do not try set preview fps range"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            goto L_0x04d0
        L_0x041e:
            java.util.List r0 = r5.getSupportedPreviewFpsRange()
            if (r0 == 0) goto L_0x04d0
            int r4 = r0.size()
            if (r4 != 0) goto L_0x042c
            goto L_0x04d0
        L_0x042c:
            int r4 = r0.size()
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = 0
            r9 = 0
        L_0x0436:
            if (r9 >= r4) goto L_0x0477
            java.lang.Object r10 = r0.get(r9)
            int[] r10 = (int[]) r10
            if (r10 == 0) goto L_0x0474
            int r11 = r10.length
            r12 = 1
            if (r11 > r12) goto L_0x0445
            goto L_0x0474
        L_0x0445:
            r11 = r10[r3]
            r10 = r10[r12]
            r13 = 3
            java.lang.Object[] r14 = new java.lang.Object[r13]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r9)
            r14[r3] = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)
            r14[r12] = r13
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            r13 = 2
            r14[r13] = r12
            java.lang.String r12 = "dkfps %d:[%d %d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r12, r14)
            if (r11 < 0) goto L_0x0474
            if (r10 >= r11) goto L_0x0469
            goto L_0x0474
        L_0x0469:
            if (r10 < r7) goto L_0x046f
            if (r8 != 0) goto L_0x046f
            r7 = r10
            r6 = r11
        L_0x046f:
            r11 = 30000(0x7530, float:4.2039E-41)
            if (r10 < r11) goto L_0x0474
            r8 = 1
        L_0x0474:
            int r9 = r9 + 1
            goto L_0x0436
        L_0x0477:
            r8 = 3
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r0[r3] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r8 = 1
            r0[r8] = r4
            r4 = 30
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r8 = 2
            r0[r8] = r4
            java.lang.String r4 = "dkfps get fit  [%d %d], max target fps %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r0)
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == r0) goto L_0x04d0
            if (r7 != r0) goto L_0x049d
            goto L_0x04d0
        L_0x049d:
            r5.setPreviewFpsRange(r6, r7)     // Catch:{ Exception -> 0x04b9 }
            java.lang.String r0 = "set fps range %d %d"
            r4 = 2
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x04b7 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x04b9 }
            r8[r3] = r4     // Catch:{ Exception -> 0x04b9 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x04b9 }
            r6 = 1
            r8[r6] = r4     // Catch:{ Exception -> 0x04b9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r0, r8)     // Catch:{ Exception -> 0x04b9 }
            goto L_0x04d0
        L_0x04b7:
            r0 = move-exception
            goto L_0x04bb
        L_0x04b9:
            r0 = move-exception
            r4 = 2
        L_0x04bb:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            android.os.Looper r6 = android.os.Looper.myLooper()
            r4[r3] = r6
            java.lang.String r0 = r0.getMessage()
            r6 = 1
            r4[r6] = r0
            java.lang.String r0 = "trySetPreviewFpsRangeParameters Exception, %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r0, r4)
        L_0x04d0:
            java.util.List r0 = r5.getSupportedPreviewFpsRange()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "range:"
            r4.append(r6)
            int r6 = r0.size()
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r4)
            r4 = 0
        L_0x04ee:
            int r6 = r0.size()
            if (r4 >= r6) goto L_0x0514
            java.lang.Object r6 = r0.get(r4)
            int[] r6 = (int[]) r6
            r7 = 0
        L_0x04fb:
            int r8 = r6.length
            if (r7 >= r8) goto L_0x0511
            r8 = 1
            java.lang.Object[] r9 = new java.lang.Object[r8]
            r8 = r6[r7]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r9[r3] = r8
            java.lang.String r8 = "Camera SupportedPreviewFpsRange："
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r8, r9)
            int r7 = r7 + 1
            goto L_0x04fb
        L_0x0511:
            int r4 = r4 + 1
            goto L_0x04ee
        L_0x0514:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "Camera preview-fps-range："
            r0.append(r4)
            java.lang.String r6 = "preview-fps-range"
            java.lang.String r6 = r5.get(r6)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r4 = "preview-frame-rate"
            java.lang.String r4 = r5.get(r4)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            gj.z r0 = r1.f329239g     // Catch:{ Exception -> 0x054e }
            r0.mo158262f(r5)     // Catch:{ Exception -> 0x054e }
            goto L_0x0557
        L_0x054e:
            r0 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "setParameters error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r4, r3)
        L_0x0557:
            boolean r3 = r1.f329245p
            goto L_0x0595
        L_0x055a:
            android.graphics.Point r0 = new android.graphics.Point
            r1 = 0
            throw r1
        L_0x055e:
            r1 = r8
            throw r1
        L_0x0560:
            r0 = move-exception
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r4 = r0.getMessage()
            r1[r3] = r4
            java.lang.String r4 = "camera getParameters error: %s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r4, r1)
            goto L_0x0595
        L_0x0570:
            java.lang.String r0 = "in open(), openCameraRes == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x057b }
            r0.<init>()     // Catch:{ IOException -> 0x057b }
            throw r0     // Catch:{ IOException -> 0x057b }
        L_0x057b:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "set cameraRes exception"
            r1.append(r4)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
        L_0x0595:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ob1.C110011a.m149536b(ob1.a):boolean");
    }

    /* renamed from: d */
    public static boolean m149537d(int i, int i2, long j) {
        double d = ((((((double) i) * ((double) i2)) * 3.0d) / 2.0d) / 1024.0d) / 1024.0d;
        Log.m105919d("MicroMsg.FaceReflectCam", "dataSizeInMB: %f, availableMemInMb: %d", Double.valueOf(d), Long.valueOf(j));
        return ((double) j) / d >= 5.0d;
    }

    /* renamed from: c */
    public void mo161348c() {
        Log.m105924i("MicroMsg.FaceReflectCam", "closeCamera start");
        this.f329236d = null;
        this.f329227H = null;
        MMHandler mMHandler = this.f329229J;
        if (mMHandler != null) {
            mMHandler.quit();
            this.f329229J = null;
        }
        if (this.f329239g != null) {
            try {
                if (this.f329247r) {
                    this.f329247r = false;
                    this.f329239g.mo158268l();
                    this.f329239g.mo158263g((Camera.PreviewCallback) null);
                    Log.m105924i("MicroMsg.FaceReflectCam", "stop preview, not previewing");
                }
            } catch (Exception e) {
                Log.m105924i("MicroMsg.FaceReflectCam", "Error setting camera preview: " + e.getMessage());
            }
            try {
                this.f329239g.mo158260d();
                this.f329239g = null;
                C105224h.m141309b().mo149590d(this.f329235Q);
                C109595c.C109597b.f328115a.f328108e = null;
            } catch (Exception e2) {
                Log.m105924i("MicroMsg.FaceReflectCam", "Error setting camera preview: " + e2.getMessage());
            } catch (Throwable th) {
                this.f329239g = null;
                throw th;
            }
            this.f329239g = null;
        }
        Log.m105924i("MicroMsg.FaceReflectCam", "closeCamera end");
    }

    /* renamed from: e */
    public final void mo161349e(SurfaceTexture surfaceTexture) {
        Log.m105924i("MicroMsg.FaceReflectCam", "openCameraForSurfaceTexture");
        if (this.f329226G != 1) {
            this.f329255z.setVisibility(0);
            mo161352h();
            MMHandler mMHandler = this.f329238f;
            if (mMHandler != null) {
                mMHandler.post(new C110016d());
                this.f329238f.post(new C110018e(surfaceTexture));
                return;
            }
            Log.m105924i("MicroMsg.FaceReflectCam", "back thread is not running");
            return;
        }
        throw null;
    }

    /* renamed from: f */
    public void mo161350f(Camera.PreviewCallback previewCallback) {
        C107848z zVar = this.f329239g;
        if (zVar == null) {
            Log.m105928w("MicroMsg.FaceReflectCam", "hy: camera is null. setPreviewCallback failed");
            return;
        }
        int bitsPerPixel = ((this.f329240h * this.f329241i) * ImageFormat.getBitsPerPixel(zVar.mo158259c().getPreviewFormat())) / 8;
        for (int i = 0; i < this.f329230K; i++) {
            this.f329239g.mo158257a(C93390g.f269584d.mo126905m(Integer.valueOf(bitsPerPixel)));
        }
        this.f329239g.mo158264h(new C110012a(previewCallback));
        C105224h.m141309b().mo149588a(this.f329235Q);
    }

    /* renamed from: g */
    public void mo161351g(MMTextureView mMTextureView) {
        this.f329236d = mMTextureView;
        if (mMTextureView.isAvailable()) {
            mo161349e(mMTextureView.getSurfaceTexture());
        }
        this.f329236d.setSurfaceTextureListener(this);
        this.f329236d.setVisibility(0);
        this.f329236d.setAlpha(0.0f);
        if (this.f329226G == 2 && !this.f329225F) {
            MMHandlerThread.postToMainThreadDelayed(new C110015c(), 700);
        }
    }

    /* renamed from: h */
    public void mo161352h() {
        if (this.f329237e == null) {
            Log.m105924i("MicroMsg.FaceReflectCam", "start camera thread");
            int i = C58834h.f168432b;
            HandlerThread a = C97749e.m126093a("cameraBackground", 5);
            this.f329237e = a;
            a.start();
            this.f329238f = new MMHandler(this.f329237e.getLooper());
        }
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Log.m105925i("MicroMsg.FaceReflectCam", "onSurfaceTextureAvailable, width: %s, height: %s", Integer.valueOf(i), Integer.valueOf(i2));
        mo161349e(surfaceTexture);
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Log.m105924i("MicroMsg.FaceReflectCam", "surfaceDestroyed");
        MMHandler mMHandler = this.f329238f;
        if (mMHandler != null) {
            mMHandler.post(new C110019f());
            if (this.f329237e != null) {
                Log.m105924i("MicroMsg.FaceReflectCam", "stop camera thread");
                try {
                    Thread.sleep(500, 0);
                } catch (InterruptedException e) {
                    Log.m105924i("MicroMsg.FaceReflectCam", "background thread sleep error：" + e.getMessage());
                }
                this.f329237e.quitSafely();
                try {
                    this.f329237e.join();
                    this.f329237e = null;
                    this.f329238f = null;
                } catch (InterruptedException e2) {
                    Log.m105924i("MicroMsg.FaceReflectCam", "stop xbackground thread error：" + e2.getMessage());
                }
                Log.m105924i("MicroMsg.FaceReflectCam", "stop camera thread finish");
            }
        } else {
            Log.m105924i("MicroMsg.FaceReflectCam", "back thread is not running");
        }
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
