package com.tencent.p014mm.plugin.appbrand.jsapi.camera;

import a70.C112760b;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiStopRecordVoice;
import com.tencent.p014mm.plugin.appbrand.jsapi.scanner.JsApiScanCode;
import com.tencent.p014mm.plugin.appbrand.utils.C84800z1;
import com.tencent.p014mm.plugin.mmsight.api.MMSightRecordView;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tavkit.component.TAVExporter;
import com.tencent.wxmm.v2helper;
import di3.C86312j;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import js0.C9514m;
import org.json.JSONObject;
import p159gw.C98250h;
import p625nu.C100196e;
import p910lj.C76701a;
import vk0.C111546e;
import vk0.C22764c;
import vk0.C22766l;
import vk0.C22767n;
import vk0.C90809a;
import vk0.C90812b;
import vk0.C90813d;
import vk0.C90815g;
import vk0.C90817j;
import vk0.C90820o;
import vk0.o$$b;
import vk0.o$$b$$b;
import wk0.C22912a;
import wk0.C22913b;
import wk0.C22918d;
import wk0.C22920e;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView */
public class AppBrandCameraView extends RelativeLayout implements C82531i.C82535d, C82531i.C82533b, C82531i.C82534c, C90815g {

    /* renamed from: p0 */
    public static final /* synthetic */ int f49260p0 = 0;

    /* renamed from: A */
    public Size f49261A;

    /* renamed from: B */
    public boolean f49262B;

    /* renamed from: C */
    public C90813d f49263C;

    /* renamed from: D */
    public ImageView f49264D;

    /* renamed from: E */
    public MMSightRecordView f49265E;

    /* renamed from: F */
    public String f49266F;

    /* renamed from: G */
    public String f49267G;

    /* renamed from: H */
    public String f49268H;

    /* renamed from: I */
    public int f49269I = -1;

    /* renamed from: J */
    public boolean f49270J = false;

    /* renamed from: K */
    public long f49271K = -1;

    /* renamed from: L */
    public long f49272L = -1;

    /* renamed from: M */
    public WindowManager f49273M = ((WindowManager) MMApplicationContext.getContext().getSystemService("window"));

    /* renamed from: N */
    public C111546e f49274N;

    /* renamed from: P */
    public boolean f49275P;

    /* renamed from: Q */
    public float f49276Q;

    /* renamed from: R */
    public long f49277R;

    /* renamed from: S */
    public boolean f49278S;

    /* renamed from: T */
    public C84800z1.C84801a f49279T = C84800z1.C84801a.LANDSCAPE;

    /* renamed from: U */
    public AtomicBoolean f49280U = new AtomicBoolean(false);

    /* renamed from: V */
    public List<Runnable> f49281V;

    /* renamed from: W */
    public C84800z1 f49282W = new C84800z1(MMApplicationContext.getContext(), new C17881a());

    /* renamed from: d */
    public Context f49283d;

    /* renamed from: e */
    public C82381f f49284e;

    /* renamed from: f */
    public String f49285f = JsApiScanCode.NAME;

    /* renamed from: g */
    public int f49286g;

    /* renamed from: h */
    public C17875g f49287h;

    /* renamed from: i */
    public int f49288i;

    /* renamed from: j */
    public String f49289j = "back";

    /* renamed from: n */
    public String f49290n = "auto";

    /* renamed from: o */
    public String f49291o = "high";

    /* renamed from: p */
    public String f49292p;

    /* renamed from: q */
    public boolean f49293q = false;

    /* renamed from: r */
    public boolean f49294r = false;

    /* renamed from: s */
    public boolean f49295s;

    /* renamed from: t */
    public boolean f49296t = false;

    /* renamed from: u */
    public int f49297u = 1080;

    /* renamed from: v */
    public int f49298v = 1920;

    /* renamed from: w */
    public int f49299w = 1080;

    /* renamed from: x */
    public int f49300x = 1920;

    /* renamed from: y */
    public Rect f49301y;

    /* renamed from: z */
    public int f49302z;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView$b */
    public class C17870b implements MMSightRecordView.C18932a {
        public C17870b() {
        }

        /* renamed from: a */
        public void mo22127a(byte[] bArr, int i, int i2) {
            C17875g gVar = AppBrandCameraView.this.f49287h;
            if (gVar != null) {
                gVar.mo22131a(bArr, i, i2);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView$c */
    public class C17871c implements MMSightRecordView.C18935d {
        public C17871c() {
        }

        /* renamed from: a */
        public void mo22128a() {
            Log.m105928w("MicroMsg.AppBrandCameraView", "InitErrorCallback");
            HashMap hashMap = new HashMap();
            hashMap.put("cameraId", Integer.valueOf(AppBrandCameraView.this.f49288i));
            String jSONObject = new JSONObject(hashMap).toString();
            C90817j jVar = new C90817j();
            jVar.f242407f = jSONObject;
            AppBrandCameraView.this.f49284e.mo109669n(jVar, (int[]) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView$d */
    public class C17872d implements MMSightRecordView.C18934c {
        public C17872d() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView$e */
    public class C17873e implements Runnable {
        public C17873e() {
        }

        public void run() {
            int i;
            int i2 = AppBrandCameraView.this.f49265E.getDrawSizePoint().x;
            int i3 = AppBrandCameraView.this.f49265E.getDrawSizePoint().y;
            AppBrandCameraView appBrandCameraView = AppBrandCameraView.this;
            C111546e eVar = appBrandCameraView.f49274N;
            MMSightRecordView mMSightRecordView = appBrandCameraView.f49265E;
            if (mMSightRecordView == null) {
                eVar.getClass();
                Log.m105928w("MicroMsg.FrameDataCallbackHelper", "listenFrameChange recordView null");
                i = -1;
            } else if (eVar.f333966b == null) {
                i = -2;
            } else {
                int i4 = eVar.f333968d;
                if (i4 != Integer.MIN_VALUE) {
                    Log.m105925i("MicroMsg.FrameDataCallbackHelper", "listenFrameChange destroy last one bufferId:%d", Integer.valueOf(i4));
                    eVar.f333966b.mo115415j1(eVar.f333968d);
                }
                int Q0 = eVar.f333966b.mo115396Q0(i2 * i3 * 4);
                eVar.f333968d = Q0;
                Log.m105925i("MicroMsg.FrameDataCallbackHelper", "listenFrameChange bufferId:%d height:%d width:%d", Integer.valueOf(Q0), Integer.valueOf(i3), Integer.valueOf(i2));
                eVar.f333967c = true;
                mMSightRecordView.mo24026a(eVar.f333966b.mo115398S(eVar.f333968d), eVar);
                i = eVar.f333968d;
            }
            if (i < 0) {
                C90813d dVar = AppBrandCameraView.this.f49263C;
                o$$b$$b o__b__b = (o$$b$$b) dVar;
                o__b__b.mo124934a(String.format(Locale.US, "illegal state:%d", new Object[]{Integer.valueOf(i)}), -1, -1, -1);
                return;
            }
            ((o$$b$$b) AppBrandCameraView.this.f49263C).mo124934a((String) null, i, i2, i3);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView$f */
    public class C17874f implements Runnable {
        public C17874f() {
        }

        public void run() {
            if (AppBrandCameraView.this.f49290n.equals("auto")) {
                AppBrandCameraView.this.f49265E.setFlashMode(3);
            } else if (AppBrandCameraView.this.f49290n.equals("torch")) {
                AppBrandCameraView.this.f49265E.setFlashMode(1);
            } else if (AppBrandCameraView.this.f49290n.equals("on")) {
                AppBrandCameraView appBrandCameraView = AppBrandCameraView.this;
                int i = appBrandCameraView.f49269I;
                if (i == 2 || i == 4 || !appBrandCameraView.f49290n.equals("on")) {
                    AppBrandCameraView.this.f49265E.setFlashMode(1);
                } else {
                    AppBrandCameraView.this.f49265E.setFlashMode(2);
                }
            } else if (AppBrandCameraView.this.f49290n.equals("torch")) {
                AppBrandCameraView.this.f49265E.setFlashMode(1);
            } else {
                AppBrandCameraView.this.f49265E.setFlashMode(2);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView$g */
    public interface C17875g {
        /* renamed from: a */
        void mo22131a(byte[] bArr, int i, int i2);

        /* renamed from: g */
        void mo22132g(boolean z);

        /* renamed from: h */
        void mo22133h(boolean z);

        /* renamed from: i */
        void mo22134i();

        void init();

        void release();
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView$h */
    public class C17876h implements C17875g {

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView$h$a */
        public class C17877a implements MMSightRecordView.C18937g {

            /* renamed from: a */
            public final /* synthetic */ boolean f49309a;

            public C17877a(boolean z) {
                this.f49309a = z;
            }

            /* renamed from: a */
            public void mo22142a() {
                AppBrandCameraView.m18281d(AppBrandCameraView.this, -1, (String) null, "take picture error");
            }

            /* renamed from: b */
            public void mo22143b(Bitmap bitmap) {
                if (bitmap != null) {
                    if ("front".equals(AppBrandCameraView.this.f49289j) && !this.f49309a) {
                        C17876h.this.getClass();
                        Matrix matrix = new Matrix();
                        matrix.postScale(-1.0f, 1.0f);
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                        bitmap.recycle();
                        bitmap = createBitmap;
                    }
                    C17876h hVar = C17876h.this;
                    if (hVar.mo22137c(bitmap, AppBrandCameraView.this.f49268H)) {
                        C17876h hVar2 = C17876h.this;
                        AppBrandCameraView appBrandCameraView = AppBrandCameraView.this;
                        AppBrandCameraView.m18281d(appBrandCameraView, 0, hVar2.mo22138d(appBrandCameraView.f49284e, appBrandCameraView.f49268H), "");
                        return;
                    }
                    AppBrandCameraView.m18281d(AppBrandCameraView.this, -1, (String) null, "save fail");
                    return;
                }
                AppBrandCameraView.m18281d(AppBrandCameraView.this, -1, (String) null, "bitmap is null");
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView$h$b */
        public class C17878b implements MMSightRecordView.C18938h {
            public C17878b() {
            }

            /* renamed from: a */
            public void mo22144a(boolean z) {
                Log.m105925i("MicroMsg.AppBrandCameraView", "onRecordFinish error %b", Boolean.valueOf(z));
                AppBrandCameraView appBrandCameraView = AppBrandCameraView.this;
                MMSightRecordView mMSightRecordView = appBrandCameraView.f49265E;
                if (mMSightRecordView == null) {
                    Log.m105924i("MicroMsg.AppBrandCameraView", "onRecordFinish recordView is null");
                    C17876h.this.mo22140f(-1, "camera is null", (String) null, (String) null);
                    return;
                }
                appBrandCameraView.f49269I = 1;
                String videoFilePath = mMSightRecordView.getVideoFilePath();
                if (z) {
                    C17876h.this.mo22140f(-1, "stop error", (String) null, (String) null);
                } else {
                    C17876h hVar = C17876h.this;
                    if (AppBrandCameraView.this.f49294r) {
                        hVar.getClass();
                        ((C119157j) C119157j.f356862d).mo183875f(new C17883b(hVar, videoFilePath));
                    } else {
                        C17876h.m18308b(hVar, videoFilePath);
                    }
                }
                C17876h hVar2 = C17876h.this;
                AppBrandCameraView appBrandCameraView2 = AppBrandCameraView.this;
                int i = AppBrandCameraView.f49260p0;
                appBrandCameraView2.mo22106s();
                AppBrandCameraView.this.f49296t = false;
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView$h$c */
        public class C17879c implements Runnable {
            public C17879c() {
            }

            public void run() {
                C17876h.this.mo22141j();
            }
        }

        public C17876h(C17881a aVar) {
        }

        /* renamed from: b */
        public static void m18308b(C17876h hVar, String str) {
            hVar.getClass();
            if (Util.isNullOrNil(str)) {
                hVar.mo22140f(-1, "record file not exist", AppBrandCameraView.this.f49267G, str);
                return;
            }
            hVar.mo22137c(((C100196e) C86312j.m106911c(C100196e.class)).mo139319rk(str), AppBrandCameraView.this.f49267G);
            hVar.mo22140f(0, "", AppBrandCameraView.this.f49267G, str);
        }

        /* renamed from: a */
        public void mo22131a(byte[] bArr, int i, int i2) {
            boolean z = AppBrandCameraView.this.f49295s;
        }

        /* renamed from: c */
        public final boolean mo22137c(Bitmap bitmap, String str) {
            if (bitmap != null && !bitmap.isRecycled()) {
                try {
                    AppBrandCameraView.this.f49299w = bitmap.getWidth();
                    AppBrandCameraView.this.f49300x = bitmap.getHeight();
                    int i = 90;
                    if ("normal".equals(AppBrandCameraView.this.f49291o)) {
                        i = 44;
                    } else if ("low".equals(AppBrandCameraView.this.f49291o)) {
                        i = 25;
                    }
                    BitmapUtil.saveBitmapToImage(bitmap, i, Bitmap.CompressFormat.JPEG, str, true);
                    Log.m105925i("MicroMsg.AppBrandCameraView", "bitmap temp file: %s, exported system file: %s", str, ((C98250h) C86312j.m106911c(C98250h.class)).mo137350sE(MMApplicationContext.getContext(), str));
                    Log.m105925i("MicroMsg.AppBrandCameraView", "bitmap filelen %s", Long.valueOf(C86013q1.m106451l(str)));
                    return true;
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.AppBrandCameraView", "error for saveBitmapToImage %s", e.getMessage());
                }
            }
            return false;
        }

        /* renamed from: d */
        public final String mo22138d(C82381f fVar, String str) {
            if (Util.isNullOrNil(str)) {
                return str;
            }
            C9514m mVar = new C9514m();
            if (fVar.getFileSystem().createTempFileFrom(new C86009m1(str), "", true, mVar) == C81410b0.OK) {
                return (String) mVar.f29691a;
            }
            return null;
        }

        /* renamed from: e */
        public final void mo22139e(int i, String str) {
            C90813d dVar = AppBrandCameraView.this.f49263C;
            if (dVar != null) {
                o$$b$$b o__b__b = (o$$b$$b) dVar;
                if (i == 0) {
                    o$$b o__b = o__b__b.f260768a;
                    o__b.f260774e.mo109647a(o__b.f260775f, o__b.f260776g.mo115109j("ok"));
                    return;
                }
                o$$b o__b2 = o__b__b.f260768a;
                C82381f fVar = o__b2.f260774e;
                int i2 = o__b2.f260775f;
                C90820o oVar = o__b2.f260776g;
                fVar.mo109647a(i2, oVar.mo115109j("fail:" + str));
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x00a3  */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo22140f(int r18, java.lang.String r19, java.lang.String r20, java.lang.String r21) {
            /*
                r17 = this;
                r1 = r17
                r0 = r21
                com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView r2 = com.tencent.p014mm.plugin.appbrand.jsapi.camera.AppBrandCameraView.this
                vk0.d r2 = r2.f49263C
                if (r2 == 0) goto L_0x015f
                r2 = 0
                r4 = 3
                r5 = 2
                r6 = 1
                r7 = 0
                if (r18 != 0) goto L_0x00a7
                int[] r2 = new int[r4]
                boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106450k(r21)
                if (r3 != 0) goto L_0x0026
                java.lang.Object[] r3 = new java.lang.Object[r6]
                r3[r7] = r0
                java.lang.String r8 = "MicroMsg.AppBrandCameraView"
                java.lang.String r9 = "getInfoFromMetaData file isn't exist, filename: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r9, r3)
                goto L_0x007e
            L_0x0026:
                r3 = 0
                oj.c r8 = new oj.c     // Catch:{ all -> 0x00a0 }
                r8.<init>()     // Catch:{ all -> 0x00a0 }
                r8.setDataSource(r0)     // Catch:{ all -> 0x009d }
                r3 = 9
                java.lang.String r3 = r8.extractMetadata(r3)     // Catch:{ all -> 0x009d }
                int r3 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r3, (int) r7)     // Catch:{ all -> 0x009d }
                r2[r7] = r3     // Catch:{ all -> 0x009d }
                r3 = 24
                java.lang.String r3 = r8.extractMetadata(r3)     // Catch:{ all -> 0x009d }
                int r3 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r3, (int) r7)     // Catch:{ all -> 0x009d }
                r9 = 90
                r10 = 18
                r11 = 19
                if (r3 == r9) goto L_0x0067
                r9 = 270(0x10e, float:3.78E-43)
                if (r3 != r9) goto L_0x0052
                goto L_0x0067
            L_0x0052:
                java.lang.String r3 = r8.extractMetadata(r10)     // Catch:{ all -> 0x009d }
                int r3 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r3, (int) r7)     // Catch:{ all -> 0x009d }
                r2[r6] = r3     // Catch:{ all -> 0x009d }
                java.lang.String r3 = r8.extractMetadata(r11)     // Catch:{ all -> 0x009d }
                int r3 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r3, (int) r7)     // Catch:{ all -> 0x009d }
                r2[r5] = r3     // Catch:{ all -> 0x009d }
                goto L_0x007b
            L_0x0067:
                java.lang.String r3 = r8.extractMetadata(r11)     // Catch:{ all -> 0x009d }
                int r3 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r3, (int) r7)     // Catch:{ all -> 0x009d }
                r2[r6] = r3     // Catch:{ all -> 0x009d }
                java.lang.String r3 = r8.extractMetadata(r10)     // Catch:{ all -> 0x009d }
                int r3 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r3, (int) r7)     // Catch:{ all -> 0x009d }
                r2[r5] = r3     // Catch:{ all -> 0x009d }
            L_0x007b:
                r8.release()
            L_0x007e:
                r3 = r2[r7]
                double r8 = (double) r3
                r10 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                double r8 = r8 * r10
                r10 = 4652007308841189376(0x408f400000000000, double:1000.0)
                double r8 = r8 / r10
                long r8 = java.lang.Math.round(r8)
                int r3 = (int) r8
                long r8 = com.tencent.p014mm.vfs.C86013q1.m106451l(r21)
                r10 = r2[r6]
                r2 = r2[r5]
                r15 = r8
                r8 = r2
                r9 = r3
                r2 = r15
                goto L_0x00aa
            L_0x009d:
                r0 = move-exception
                r3 = r8
                goto L_0x00a1
            L_0x00a0:
                r0 = move-exception
            L_0x00a1:
                if (r3 == 0) goto L_0x00a6
                r3.release()
            L_0x00a6:
                throw r0
            L_0x00a7:
                r8 = 0
                r9 = 0
                r10 = 0
            L_0x00aa:
                com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView r11 = com.tencent.p014mm.plugin.appbrand.jsapi.camera.AppBrandCameraView.this
                vk0.d r12 = r11.f49263C
                com.tencent.mm.plugin.appbrand.jsapi.f r11 = r11.f49284e
                r13 = r20
                java.lang.String r11 = r1.mo22138d(r11, r13)
                com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView r13 = com.tencent.p014mm.plugin.appbrand.jsapi.camera.AppBrandCameraView.this
                com.tencent.mm.plugin.appbrand.jsapi.f r13 = r13.f49284e
                java.lang.String r0 = r1.mo22138d(r13, r0)
                vk0.o$$b$$b r12 = (vk0.o$$b$$b) r12
                r12.getClass()
                r13 = 7
                java.lang.Object[] r13 = new java.lang.Object[r13]
                java.lang.Integer r14 = java.lang.Integer.valueOf(r18)
                r13[r7] = r14
                r13[r6] = r11
                r13[r5] = r0
                java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
                r13[r4] = r5
                java.lang.Long r4 = java.lang.Long.valueOf(r2)
                r5 = 4
                r13[r5] = r4
                java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
                r5 = 5
                r13[r5] = r4
                java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
                r5 = 6
                r13[r5] = r4
                java.lang.String r4 = "MicroMsg.JsApiOperateCamera"
                java.lang.String r5 = "onStopRecord ret %d, thumbPath %s,tempVideoPath %s,duration %d,size %d,width %d,height %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r5, r13)
                if (r18 != 0) goto L_0x013d
                java.util.HashMap r4 = new java.util.HashMap
                r4.<init>()
                java.lang.String r5 = "tempThumbPath"
                r4.put(r5, r11)
                java.lang.String r5 = "tempVideoPath"
                r4.put(r5, r0)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
                java.lang.String r5 = "duration"
                r4.put(r5, r0)
                java.lang.Long r0 = java.lang.Long.valueOf(r2)
                java.lang.String r2 = "size"
                r4.put(r2, r0)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
                java.lang.String r2 = "height"
                r4.put(r2, r0)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
                java.lang.String r2 = "width"
                r4.put(r2, r0)
                vk0.o$$b r0 = r12.f260768a
                com.tencent.mm.plugin.appbrand.jsapi.f r2 = r0.f260774e
                int r3 = r0.f260775f
                vk0.o r0 = r0.f260776g
                java.lang.String r5 = "ok"
                java.lang.String r0 = r0.mo115112m(r5, r4)
                r2.mo109647a(r3, r0)
                goto L_0x015f
            L_0x013d:
                vk0.o$$b r0 = r12.f260768a
                com.tencent.mm.plugin.appbrand.jsapi.f r2 = r0.f260774e
                int r3 = r0.f260775f
                vk0.o r0 = r0.f260776g
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "fail:"
                r4.append(r5)
                r5 = r19
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                java.lang.String r0 = r0.mo115109j(r4)
                r2.mo109647a(r3, r0)
            L_0x015f:
                com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView r0 = com.tencent.p014mm.plugin.appbrand.jsapi.camera.AppBrandCameraView.this
                r0.mo22103q()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.camera.AppBrandCameraView.C17876h.mo22140f(int, java.lang.String, java.lang.String, java.lang.String):void");
        }

        /* renamed from: g */
        public void mo22132g(boolean z) {
            Log.m105924i("MicroMsg.AppBrandCameraView", "startRecord.");
            C90809a aVar = C90809a.C90811b.f260763a;
            if (!aVar.f260759a || !aVar.f260760b) {
                Log.m105924i("MicroMsg.AppBrandCameraMrg", "no all permission");
            }
            if (!(aVar.f260759a && aVar.f260760b)) {
                C76701a.makeText(AppBrandCameraView.this.f49283d, (int) C0966R.string.gt9, 1).show();
                Log.m105928w("MicroMsg.AppBrandCameraView", "no micro phone permission");
                mo22139e(-1, "permission");
                return;
            }
            AppBrandCameraView appBrandCameraView = AppBrandCameraView.this;
            if (appBrandCameraView.f49269I == 2) {
                Log.m105928w("MicroMsg.AppBrandCameraView", "startRecord is recording!!");
                mo22139e(-1, "is recording");
            } else if (!appBrandCameraView.f49275P) {
                Log.m105928w("MicroMsg.AppBrandCameraView", "startRecord err, isn't init done");
                mo22139e(-1, "camera has not been initialized");
            } else if (appBrandCameraView.f49265E.f53165d.mo24066P(z)) {
                AppBrandCameraView.this.f49272L = Util.currentTicks();
                AppBrandCameraView.this.f49269I = 2;
                mo22139e(0, "");
                AppBrandCameraView.this.mo22103q();
            } else {
                Log.m105928w("MicroMsg.AppBrandCameraView", "startRecord fail !!");
                mo22139e(-1, "startRecord fail");
            }
        }

        /* renamed from: h */
        public void mo22133h(boolean z) {
            Log.m105924i("MicroMsg.AppBrandCameraView", "takePicture.");
            AppBrandCameraView appBrandCameraView = AppBrandCameraView.this;
            if (appBrandCameraView.f49265E == null) {
                Log.m105924i("MicroMsg.AppBrandCameraView", "recordView is null");
            } else if (appBrandCameraView.f49269I == 2) {
                Log.m105928w("MicroMsg.AppBrandCameraView", "takePicture is recording!!");
            } else if (appBrandCameraView.f49270J || Util.ticksToNow(appBrandCameraView.f49271K) < 300) {
                Log.m105924i("MicroMsg.AppBrandCameraView", "not the right time to take picture.");
            } else {
                AppBrandCameraView appBrandCameraView2 = AppBrandCameraView.this;
                if (!appBrandCameraView2.f49275P) {
                    Log.m105928w("MicroMsg.AppBrandCameraView", "takePicture err, isn't init done");
                    AppBrandCameraView.m18281d(AppBrandCameraView.this, -1, (String) null, "camera has not been initialized");
                    return;
                }
                appBrandCameraView2.f49271K = Util.currentTicks();
                AppBrandCameraView appBrandCameraView3 = AppBrandCameraView.this;
                appBrandCameraView3.f49270J = true;
                appBrandCameraView3.f49269I = 3;
                MMSightRecordView mMSightRecordView = appBrandCameraView3.f49265E;
                mMSightRecordView.f53165d.mo24069S(new C17877a(z), "on".equals(appBrandCameraView3.f49290n));
            }
        }

        /* renamed from: i */
        public void mo22134i() {
            long ticksToNow = Util.ticksToNow(AppBrandCameraView.this.f49272L);
            if (ticksToNow < 1500) {
                long j = 1500 - ticksToNow;
                Log.m105925i("MicroMsg.AppBrandCameraView", "stopRecord in %d ms later", Long.valueOf(j));
                MMHandlerThread.postToMainThreadDelayed(new C17879c(), j);
                return;
            }
            mo22141j();
        }

        public void init() {
        }

        /* renamed from: j */
        public void mo22141j() {
            Log.m105924i("MicroMsg.AppBrandCameraView", JsApiStopRecordVoice.NAME);
            AppBrandCameraView appBrandCameraView = AppBrandCameraView.this;
            MMSightRecordView mMSightRecordView = appBrandCameraView.f49265E;
            if (mMSightRecordView == null) {
                Log.m105924i("MicroMsg.AppBrandCameraView", "recordView is null");
                mo22140f(-1, "camera is null", (String) null, (String) null);
            } else if (appBrandCameraView.f49269I != 2) {
                Log.m105928w("MicroMsg.AppBrandCameraView", "stopRecord is not recording!!");
                mo22140f(-1, "is not recording", (String) null, (String) null);
            } else if (appBrandCameraView.f49296t) {
                Log.m105924i("MicroMsg.AppBrandCameraView", "recordView is IsStopping");
                mo22140f(-1, "is stopping", (String) null, (String) null);
            } else {
                appBrandCameraView.f49296t = true;
                mMSightRecordView.f53165d.mo24067Q(new C17878b());
            }
        }

        public void release() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView$i */
    public class C17880i implements C17875g, C22918d.C22919a {

        /* renamed from: a */
        public C22918d f49313a;

        /* renamed from: b */
        public AtomicBoolean f49314b = new AtomicBoolean(false);

        /* renamed from: c */
        public int f49315c = 200;

        /* renamed from: d */
        public float f49316d;

        /* renamed from: e */
        public int f49317e;

        /* renamed from: f */
        public int f49318f;

        /* renamed from: g */
        public Point f49319g;

        /* renamed from: h */
        public Rect f49320h;

        /* renamed from: i */
        public int f49321i;

        /* renamed from: j */
        public int f49322j;

        /* renamed from: k */
        public int f49323k;

        public C17880i() {
            this.f49316d = (((float) AppBrandCameraView.this.f49297u) * 1.0f) / ((float) AppBrandCameraView.this.f49298v);
            this.f49322j = AppBrandCameraView.this.f49293q ? 1 : 0;
        }

        /* renamed from: a */
        public void mo22131a(byte[] bArr, int i, int i2) {
            Point point;
            int i3 = i;
            int i4 = i2;
            int i5 = this.f49317e;
            AppBrandCameraView appBrandCameraView = AppBrandCameraView.this;
            if (!(i5 == appBrandCameraView.f49297u && this.f49318f == appBrandCameraView.f49298v)) {
                int rotation = appBrandCameraView.f49273M.getDefaultDisplay().getRotation();
                boolean z = false;
                int i6 = rotation != 1 ? rotation != 2 ? rotation != 3 ? 0 : 270 : 180 : 90;
                int cameraRotation = AppBrandCameraView.this.f49265E.getCameraRotation();
                if ("front".equals(AppBrandCameraView.this.f49289j)) {
                    int i7 = cameraRotation % v2helper.VOIP_ENC_HEIGHT_LV1;
                    this.f49321i = i7;
                    this.f49321i = (360 - i7) % v2helper.VOIP_ENC_HEIGHT_LV1;
                } else {
                    this.f49321i = ((cameraRotation - i6) + v2helper.VOIP_ENC_HEIGHT_LV1) % v2helper.VOIP_ENC_HEIGHT_LV1;
                }
                AppBrandCameraView appBrandCameraView2 = AppBrandCameraView.this;
                if (appBrandCameraView2.f49265E != null) {
                    this.f49317e = appBrandCameraView2.f49297u;
                    this.f49318f = appBrandCameraView2.f49298v;
                }
                int i8 = this.f49321i;
                float f = this.f49316d;
                Rect rect = null;
                if (i3 <= 0 || i4 <= 0) {
                    point = null;
                } else {
                    if (i8 == 90 || i8 == 270) {
                        f = 1.0f / f;
                    }
                    if (((float) i4) * f < ((float) i3)) {
                        z = true;
                    }
                    float f2 = 1.0f / f;
                    if (!z) {
                        this.f49322j = 1;
                        int max = Math.max(i4, i3);
                        int i9 = (int) (((float) max) * f2);
                        point = (i8 == 90 || i8 == 270) ? new Point(i9, max) : new Point(max, i9);
                    } else {
                        int min = Math.min(i4, i3);
                        int i15 = (int) (((float) min) / f2);
                        point = (i8 == 90 || i8 == 270) ? new Point(min, i15) : new Point(i15, min);
                    }
                }
                this.f49319g = point;
                if (point != null) {
                    AppBrandCameraView appBrandCameraView3 = AppBrandCameraView.this;
                    Rect rect2 = appBrandCameraView3.f49301y;
                    int i16 = appBrandCameraView3.f49297u;
                    int i17 = point.x;
                    if (rect2 != null) {
                        float f3 = (((float) i16) * 1.0f) / ((float) i17);
                        rect = new Rect(Math.round(((float) rect2.left) / f3), Math.round(((float) rect2.top) / f3), Math.round(((float) rect2.right) / f3), Math.round(((float) rect2.bottom) / f3));
                    }
                    this.f49320h = rect;
                }
            }
            if (this.f49314b.get()) {
                Log.m105918d("MicroMsg.AppBrandCameraView", "[onFrameData] isScanPause, return");
                return;
            }
            C22918d dVar = this.f49313a;
            if (dVar != null) {
                AppBrandCameraView appBrandCameraView4 = AppBrandCameraView.this;
                if (appBrandCameraView4.f49265E != null) {
                    int i18 = appBrandCameraView4.f49297u;
                    int i19 = appBrandCameraView4.f49298v;
                    Point point2 = this.f49319g;
                    Rect rect3 = this.f49320h;
                    int i25 = this.f49321i;
                    int i26 = this.f49322j;
                    dVar.getClass();
                    C22912a aVar = ((C22920e) dVar).f65895b;
                    if (bArr == null) {
                        aVar.getClass();
                    } else {
                        aVar.f65886c.postToWorker(new C22913b(aVar, bArr, i25, i, i2, i18, i19, point2, rect3, i26));
                    }
                }
            }
        }

        /* renamed from: g */
        public void mo22132g(boolean z) {
            Log.m105920e("MicroMsg.AppBrandCameraView", "ScanCodeMode, startRecord err");
        }

        /* renamed from: h */
        public void mo22133h(boolean z) {
            Log.m105920e("MicroMsg.AppBrandCameraView", "ScanCodeMode, takePicture err");
        }

        /* renamed from: i */
        public void mo22134i() {
            Log.m105920e("MicroMsg.AppBrandCameraView", "ScanCodeMode, safeStopRecord err");
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x007a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void init() {
            /*
                r12 = this;
                wk0.e r0 = new wk0.e
                r0.<init>()
                r12.f49313a = r0
                wk0.a r0 = r0.f65895b
                r0.getClass()
                java.lang.String r1 = "MicroMsg.appbrand.ScanQBarDecoder"
                java.lang.String r2 = "init"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
                java.lang.String r1 = r0.f65868d
                java.lang.Object r2 = r0.f65870f
                monitor-enter(r2)
                boolean r3 = r0.f65871g     // Catch:{ all -> 0x00d4 }
                r4 = 0
                if (r3 == 0) goto L_0x0028
                java.lang.String r0 = "MicroMsg.appbrand.ScanQBarDecoder"
                java.lang.String r1 = "the QbarDecoder is already init"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ all -> 0x00d4 }
                monitor-exit(r2)     // Catch:{ all -> 0x00d4 }
                goto L_0x00bf
            L_0x0028:
                it3.a r3 = r0.f65869e     // Catch:{ all -> 0x00d4 }
                boolean r5 = r3.f59753c     // Catch:{ all -> 0x00d4 }
                r6 = 1
                if (r5 != 0) goto L_0x0050
                android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x00d4 }
                java.lang.Class<lx.d0> r7 = p200lx.C21473d0.class
                di3.d r7 = di3.C86312j.m106911c(r7)     // Catch:{ all -> 0x00d4 }
                lx.d0 r7 = (p200lx.C21473d0) r7     // Catch:{ all -> 0x00d4 }
                com.tencent.qbar.QbarNative$QbarAiModelParam r7 = r7.mo33645Gw()     // Catch:{ all -> 0x00d4 }
                r3.mo33089f(r5, r4, r7)     // Catch:{ all -> 0x00d4 }
                it3.a r3 = r0.f65869e     // Catch:{ all -> 0x00d4 }
                boolean r5 = r3.f59753c     // Catch:{ all -> 0x00d4 }
                if (r5 == 0) goto L_0x004e
                lx.i0 r3 = (p200lx.C21474i0) r3     // Catch:{ all -> 0x00d4 }
                r3.mo27322b()     // Catch:{ all -> 0x00d4 }
                goto L_0x0050
            L_0x004e:
                r3 = 0
                goto L_0x0051
            L_0x0050:
                r3 = 1
            L_0x0051:
                int[] r1 = r0.mo36091b(r1)     // Catch:{ all -> 0x00d4 }
                it3.a r5 = r0.f65869e     // Catch:{ all -> 0x00d4 }
                int r5 = r5.mo33091h(r1)     // Catch:{ all -> 0x00d4 }
                java.lang.String r7 = "MicroMsg.appbrand.ScanQBarDecoder"
                java.lang.String r8 = "QbarNative.Init = [%b], SetReaders = [%d], readers: %s"
                r9 = 3
                java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ all -> 0x00d4 }
                java.lang.Boolean r10 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x00d4 }
                r9[r4] = r10     // Catch:{ all -> 0x00d4 }
                java.lang.Integer r10 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x00d4 }
                r9[r6] = r10     // Catch:{ all -> 0x00d4 }
                r10 = 2
                java.lang.String r1 = java.util.Arrays.toString(r1)     // Catch:{ all -> 0x00d4 }
                r9[r10] = r1     // Catch:{ all -> 0x00d4 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r9)     // Catch:{ all -> 0x00d4 }
                if (r3 == 0) goto L_0x00b4
                if (r5 == 0) goto L_0x007d
                goto L_0x00b4
            L_0x007d:
                r0.f65871g = r6     // Catch:{ all -> 0x00d4 }
                java.lang.Class<lx.a0> r0 = p200lx.C34390a0.class
                di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ all -> 0x00d4 }
                lx.a0 r0 = (p200lx.C34390a0) r0     // Catch:{ all -> 0x00d4 }
                int r0 = r0.mo59453VC()     // Catch:{ all -> 0x00d4 }
                if (r0 != r6) goto L_0x0090
                r0 = 1722(0x6ba, float:2.413E-42)
                goto L_0x0092
            L_0x0090:
                r0 = 1229(0x4cd, float:1.722E-42)
            L_0x0092:
                java.lang.String r1 = "MicroMsg.appbrand.ScanQBarDecoder"
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d4 }
                r3.<init>()     // Catch:{ all -> 0x00d4 }
                java.lang.String r5 = "reportScanPerformance idKey:"
                r3.append(r5)     // Catch:{ all -> 0x00d4 }
                r3.append(r0)     // Catch:{ all -> 0x00d4 }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00d4 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)     // Catch:{ all -> 0x00d4 }
                com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x00d4 }
                long r6 = (long) r0     // Catch:{ all -> 0x00d4 }
                r8 = 20
                r10 = 1
                r5.mo175913w(r6, r8, r10)     // Catch:{ all -> 0x00d4 }
                monitor-exit(r2)     // Catch:{ all -> 0x00d4 }
                goto L_0x00bf
            L_0x00b4:
                java.lang.String r1 = "MicroMsg.appbrand.ScanQBarDecoder"
                java.lang.String r3 = "QbarNative failed"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r3)     // Catch:{ all -> 0x00d4 }
                r0.mo36092c()     // Catch:{ all -> 0x00d4 }
                monitor-exit(r2)     // Catch:{ all -> 0x00d4 }
            L_0x00bf:
                wk0.d r0 = r12.f49313a
                r0.f65894a = r12
                com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView r0 = com.tencent.p014mm.plugin.appbrand.jsapi.camera.AppBrandCameraView.this
                r1 = 4
                r0.f49269I = r1
                int r0 = r0.f49302z
                if (r0 <= 0) goto L_0x00d1
                r1 = 1000(0x3e8, float:1.401E-42)
                int r1 = r1 / r0
                r12.f49315c = r1
            L_0x00d1:
                r12.f49323k = r4
                return
            L_0x00d4:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x00d4 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.camera.AppBrandCameraView.C17880i.init():void");
        }

        public void release() {
            C22918d dVar = this.f49313a;
            if (dVar != null) {
                dVar.getClass();
                C22912a aVar = ((C22920e) dVar).f65895b;
                aVar.getClass();
                Log.m105924i("MicroMsg.appbrand.ScanQBarDecoder", "release");
                aVar.mo36092c();
            }
            this.f49319g = null;
            this.f49323k = 0;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView$a */
    public class C17881a implements C84800z1.C84802b {
        public C17881a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0032, code lost:
            if (r0.getRequestedOrientation() != 1) goto L_0x0035;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo22146a(com.tencent.p014mm.plugin.appbrand.utils.C84800z1.C84801a r5, com.tencent.p014mm.plugin.appbrand.utils.C84800z1.C84801a r6) {
            /*
                r4 = this;
                com.tencent.mm.plugin.appbrand.utils.z1$a r5 = com.tencent.p014mm.plugin.appbrand.utils.C84800z1.C84801a.REVERSE_LANDSCAPE
                com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView r0 = com.tencent.p014mm.plugin.appbrand.jsapi.camera.AppBrandCameraView.this
                int r1 = com.tencent.p014mm.plugin.appbrand.jsapi.camera.AppBrandCameraView.f49260p0
                android.content.Context r0 = r0.getContext()
                android.content.ContentResolver r0 = r0.getContentResolver()
                java.lang.String r1 = "accelerometer_rotation"
                r2 = 0
                int r0 = android.provider.Settings.System.getInt(r0, r1, r2)
                r1 = 1
                if (r0 != 0) goto L_0x001a
                r0 = 1
                goto L_0x001b
            L_0x001a:
                r0 = 0
            L_0x001b:
                if (r0 == 0) goto L_0x0038
                com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView r0 = com.tencent.p014mm.plugin.appbrand.jsapi.camera.AppBrandCameraView.this
                android.content.Context r0 = r0.f49283d
                boolean r3 = r0 instanceof android.app.Activity
                if (r3 != 0) goto L_0x0026
                goto L_0x0034
            L_0x0026:
                android.app.Activity r0 = (android.app.Activity) r0
                int r3 = r0.getRequestedOrientation()
                if (r3 == 0) goto L_0x0034
                int r0 = r0.getRequestedOrientation()
                if (r0 != r1) goto L_0x0035
            L_0x0034:
                r2 = 1
            L_0x0035:
                if (r2 == 0) goto L_0x0038
                return
            L_0x0038:
                com.tencent.mm.plugin.appbrand.utils.z1$a r0 = com.tencent.p014mm.plugin.appbrand.utils.C84800z1.C84801a.LANDSCAPE
                if (r6 != r0) goto L_0x0047
                com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView r1 = com.tencent.p014mm.plugin.appbrand.jsapi.camera.AppBrandCameraView.this
                com.tencent.mm.plugin.appbrand.utils.z1$a r2 = r1.f49279T
                if (r2 != r5) goto L_0x0047
                r1.f49279T = r6
                com.tencent.p014mm.plugin.appbrand.jsapi.camera.AppBrandCameraView.m18282e(r1)
            L_0x0047:
                if (r6 != r5) goto L_0x0054
                com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView r5 = com.tencent.p014mm.plugin.appbrand.jsapi.camera.AppBrandCameraView.this
                com.tencent.mm.plugin.appbrand.utils.z1$a r1 = r5.f49279T
                if (r1 != r0) goto L_0x0054
                r5.f49279T = r6
                com.tencent.p014mm.plugin.appbrand.jsapi.camera.AppBrandCameraView.m18282e(r5)
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.camera.AppBrandCameraView.C17881a.mo22146a(com.tencent.mm.plugin.appbrand.utils.z1$a, com.tencent.mm.plugin.appbrand.utils.z1$a):void");
        }
    }

    public AppBrandCameraView(Context context) {
        super(context);
        m18283l(context);
    }

    /* renamed from: d */
    public static void m18281d(AppBrandCameraView appBrandCameraView, int i, String str, String str2) {
        appBrandCameraView.getClass();
        Log.m105925i("MicroMsg.AppBrandCameraView", "onTakePhoto.ret:%d, path:%s, errMsg:%s", Integer.valueOf(i), str, str2);
        C90813d dVar = appBrandCameraView.f49263C;
        if (dVar != null) {
            int i2 = appBrandCameraView.f49299w;
            int i3 = appBrandCameraView.f49300x;
            o$$b$$b o__b__b = (o$$b$$b) dVar;
            if (i == 0) {
                HashMap hashMap = new HashMap();
                hashMap.put("tempImagePath", str);
                hashMap.put("width", Integer.valueOf(i2));
                hashMap.put("height", Integer.valueOf(i3));
                o$$b o__b = o__b__b.f260768a;
                o__b.f260774e.mo109647a(o__b.f260775f, o__b.f260776g.mo115112m("ok", hashMap));
            } else {
                o$$b o__b2 = o__b__b.f260768a;
                C82381f fVar = o__b2.f260774e;
                int i4 = o__b2.f260775f;
                C90820o oVar = o__b2.f260776g;
                fVar.mo109647a(i4, oVar.mo115109j("fail:" + str2));
            }
        }
        appBrandCameraView.f49270J = false;
        appBrandCameraView.mo22104r();
        appBrandCameraView.f49269I = 1;
    }

    /* renamed from: e */
    public static void m18282e(AppBrandCameraView appBrandCameraView) {
        if (appBrandCameraView.f49278S) {
            Log.m105924i("MicroMsg.AppBrandCameraView", "camera already in pre rotate mode");
            return;
        }
        appBrandCameraView.f49278S = true;
        C84800z1.C84801a aVar = appBrandCameraView.f49279T;
        Log.m105924i("MicroMsg.AppBrandCameraView", "wait for another release called");
        MMHandlerThread.postToMainThreadDelayed(new C22764c(appBrandCameraView, aVar), 750);
    }

    /* renamed from: l */
    private void m18283l(Context context) {
        this.f49283d = context;
        this.f49280U.set(false);
        LayoutInflater.from(context).inflate(C0966R.C0971layout.f6390dj, this);
    }

    /* renamed from: n */
    private void m18284n() {
        Log.m105924i("MicroMsg.AppBrandCameraView", "initCamera.");
        C90809a aVar = C90809a.C90811b.f260763a;
        if (!aVar.f260759a) {
            Log.m105924i("MicroMsg.AppBrandCameraMrg", "no camera permission");
        }
        if (!aVar.f260759a) {
            C76701a.makeText(this.f49283d, (int) C0966R.string.gt9, 1).show();
            Log.m105928w("MicroMsg.AppBrandCameraView", "no permission");
        } else if (this.f49265E != null) {
            Log.m105924i("MicroMsg.AppBrandCameraView", "initCamera recordView not null.");
        } else {
            int[] a = C90809a.C90811b.f260763a.mo124931a();
            if (a.length > 0) {
                for (int i : a) {
                    if (i != this.f49288i) {
                        C90809a.C90811b.f260763a.mo124932b(i, false);
                        Log.m105925i("MicroMsg.AppBrandCameraView", "release camera before init new camera, id: %d", Integer.valueOf(i));
                    }
                }
            }
            ImageView imageView = this.f49264D;
            char c = 65535;
            if (imageView == null) {
                ImageView imageView2 = new ImageView(this.f49283d);
                this.f49264D = imageView2;
                imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
                addView(this.f49264D, new ViewGroup.LayoutParams(-1, -1));
            } else {
                imageView.setImageBitmap((Bitmap) null);
            }
            MMSightRecordView k = mo22098k(this.f49283d, this.f49297u, this.f49298v);
            this.f49265E = k;
            if (k == null) {
                this.f49265E = new MMSightRecordView(this.f49283d);
            }
            this.f49275P = false;
            addView(this.f49265E);
            boolean isNullOrNil = Util.isNullOrNil(this.f49292p);
            int i2 = TAVExporter.VIDEO_EXPORT_WIDTH;
            if (!isNullOrNil) {
                String str = this.f49292p;
                int hashCode = str.hashCode();
                if (hashCode != -1078030475) {
                    if (hashCode != 107348) {
                        if (hashCode == 3202466 && str.equals("high")) {
                            c = 0;
                        }
                    } else if (str.equals("low")) {
                        c = 1;
                    }
                } else if (str.equals(FirebaseAnalytics.C113379b.MEDIUM)) {
                    c = 2;
                }
                if (c == 0) {
                    i2 = 1080;
                } else if (c == 1) {
                    i2 = 480;
                }
            }
            int i3 = this.f49286g;
            if (i3 > i2) {
                Log.m105925i("MicroMsg.AppBrandCameraView", "framesize is : %d, large than preview size: %d", Integer.valueOf(i3), Integer.valueOf(i2));
                i2 = this.f49286g;
            }
            this.f49265E.setPreviewSizeLimit(i2);
            this.f49265E.setRGBSizeLimit(this.f49286g);
            this.f49265E.f53165d.mo24084u();
            this.f49265E.setDisplayRatio((((float) this.f49297u) * 1.0f) / ((float) this.f49298v));
            this.f49265E.setPreviewMode(this.f49293q ? 1 : 0);
            this.f49265E.f53165d.mo24063M(600000, 4800000, 30, 64000, 44100);
            this.f49265E.setVideoFilePath(this.f49266F);
            this.f49265E.setClipPictureSize(true);
            this.f49265E.setClipVideoSize(true);
            this.f49265E.setDisplayScreenSize(this.f49261A);
            this.f49265E.setUseBackCamera("back".equals(this.f49289j));
            this.f49265E.setFrameDataCallback(new C17870b());
            this.f49265E.setInitErrorCallback(new C17871c());
            this.f49265E.setInitDoneCallback(new C17872d());
            this.f49265E.f53165d.mo24065O();
            this.f49265E.f53165d.mo24082s();
            this.f49269I = 1;
        }
    }

    /* renamed from: a */
    public void mo22088a() {
        Log.m105924i("MicroMsg.AppBrandCameraView", "initView");
        C90809a aVar = C90809a.C90811b.f260763a;
        if (!aVar.f260759a) {
            Log.m105924i("MicroMsg.AppBrandCameraMrg", "no camera permission");
        }
        if (aVar.f260759a) {
            mo22106s();
            mo22104r();
            m18284n();
            mo22102p();
            this.f49280U.compareAndSet(false, true);
            if (this.f49262B) {
                C84800z1 z1Var = this.f49282W;
                z1Var.f247232b = 60;
                z1Var.enable();
            }
        }
    }

    /* renamed from: b */
    public void mo22089b() {
        Bitmap currentFramePicture;
        if (C90809a.C90811b.f260763a.f260761c) {
            Log.m105924i("MicroMsg.AppBrandCameraView", "onBackground, but is requesting microphone permission");
            return;
        }
        Log.m105924i("MicroMsg.AppBrandCameraView", "onUIPause");
        if (this.f49262B) {
            this.f49282W.disable();
        }
        if (this.f49269I == 2) {
            Log.m105918d("MicroMsg.AppBrandCameraView", "onStopRecord fromOnPause");
            HashMap hashMap = new HashMap();
            hashMap.put("cameraId", Integer.valueOf(this.f49288i));
            hashMap.put("errMsg", "stop on record");
            String jSONObject = new JSONObject(hashMap).toString();
            C22767n nVar = new C22767n();
            nVar.f242407f = jSONObject;
            this.f49284e.mo109669n(nVar, (int[]) null);
        }
        MMSightRecordView mMSightRecordView = this.f49265E;
        if (!(mMSightRecordView == null || (currentFramePicture = mMSightRecordView.getCurrentFramePicture()) == null)) {
            this.f49264D.setImageBitmap(currentFramePicture);
        }
        C111546e eVar = this.f49274N;
        if (eVar != null) {
            MMSightRecordView mMSightRecordView2 = this.f49265E;
            Log.m105925i("MicroMsg.FrameDataCallbackHelper", "onUIPause mNeedCallback:%b", Boolean.valueOf(eVar.f333967c));
            if (mMSightRecordView2 == null) {
                Log.m105928w("MicroMsg.FrameDataCallbackHelper", "onUIPause recordView null");
            } else {
                mMSightRecordView2.mo24026a((ByteBuffer) null, (MMSightRecordView.C18936f) null);
            }
        }
        release();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("cameraId", Integer.valueOf(getCameraId()));
        String jSONObject2 = new JSONObject(hashMap2).toString();
        C22766l lVar = new C22766l();
        lVar.f242407f = jSONObject2;
        this.f49284e.mo109669n(lVar, (int[]) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo22090c() {
        /*
            r3 = this;
            java.lang.String r0 = "MicroMsg.AppBrandCameraView"
            java.lang.String r1 = "onUIResume"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            java.lang.Class<com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView> r0 = com.tencent.p014mm.plugin.appbrand.jsapi.camera.AppBrandCameraView.class
            monitor-enter(r0)
            boolean r1 = r3.f49262B     // Catch:{ all -> 0x0039 }
            if (r1 == 0) goto L_0x0017
            com.tencent.mm.plugin.appbrand.utils.z1 r1 = r3.f49282W     // Catch:{ all -> 0x0039 }
            r2 = 60
            r1.f247232b = r2     // Catch:{ all -> 0x0039 }
            r1.enable()     // Catch:{ all -> 0x0039 }
        L_0x0017:
            java.util.concurrent.atomic.AtomicBoolean r1 = r3.f49280U     // Catch:{ all -> 0x0039 }
            boolean r1 = r1.get()     // Catch:{ all -> 0x0039 }
            if (r1 != 0) goto L_0x0028
            java.lang.String r1 = "MicroMsg.AppBrandCameraView"
            java.lang.String r2 = "no execute initView"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r2)     // Catch:{ all -> 0x0039 }
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            goto L_0x0038
        L_0x0028:
            r3.m18284n()     // Catch:{ all -> 0x0039 }
            r3.mo22102p()     // Catch:{ all -> 0x0039 }
            vk0.e r1 = r3.f49274N     // Catch:{ all -> 0x0039 }
            if (r1 == 0) goto L_0x0037
            com.tencent.mm.plugin.mmsight.api.MMSightRecordView r2 = r3.f49265E     // Catch:{ all -> 0x0039 }
            r1.mo163237a(r2)     // Catch:{ all -> 0x0039 }
        L_0x0037:
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
        L_0x0038:
            return
        L_0x0039:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.camera.AppBrandCameraView.mo22090c():void");
    }

    /* renamed from: g */
    public void mo22091g(boolean z) {
        C17875g gVar = this.f49287h;
        if (gVar != null) {
            gVar.mo22132g(z);
        }
    }

    public int getCameraId() {
        return this.f49288i;
    }

    public MMSightRecordView getRecordView() {
        return this.f49265E;
    }

    public View getView() {
        return this;
    }

    /* renamed from: h */
    public void mo22095h(boolean z) {
        C17875g gVar = this.f49287h;
        if (gVar != null) {
            gVar.mo22133h(z);
        }
    }

    /* renamed from: i */
    public void mo22096i() {
        C17875g gVar = this.f49287h;
        if (gVar != null) {
            gVar.mo22134i();
        }
    }

    /* renamed from: j */
    public void mo22097j(int i, int i2, int i3, int i4) {
        Log.m105925i("MicroMsg.AppBrandCameraView", "x:%d, y:%d, w:%d, h:%d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        if (i3 > 0 && i4 > 0) {
            this.f49301y = new Rect(i, i2, i3 + i, i4 + i2);
        }
    }

    /* renamed from: k */
    public MMSightRecordView mo22098k(Context context, int i, int i2) {
        return null;
    }

    /* renamed from: m */
    public void mo22099m(String str, boolean z) {
        MMSightRecordView mMSightRecordView;
        if (!Util.isEqual(this.f49289j, str) && !Util.isEqual(this.f49285f, JsApiScanCode.NAME)) {
            this.f49289j = str;
            if (!z && (mMSightRecordView = this.f49265E) != null) {
                mMSightRecordView.f53165d.mo24068R();
            }
        }
    }

    /* renamed from: o */
    public C17875g mo22100o(String str) {
        return (Util.isNullOrNil(str) || !str.equals(JsApiScanCode.NAME)) ? new C17876h((C17881a) null) : new C17880i();
    }

    public void onDestroy() {
        C111546e eVar = this.f49274N;
        if (eVar != null) {
            MMSightRecordView mMSightRecordView = this.f49265E;
            eVar.f333967c = false;
            if (mMSightRecordView != null) {
                mMSightRecordView.mo24026a((ByteBuffer) null, (MMSightRecordView.C18936f) null);
            }
            int i = eVar.f333968d;
            if (i != Integer.MIN_VALUE) {
                eVar.f333966b.mo115415j1(i);
                eVar.f333968d = Integer.MIN_VALUE;
            }
        }
        release();
        this.f49280U.compareAndSet(true, false);
    }

    /* renamed from: p */
    public void mo22102p() {
        if (this.f49265E == null) {
            Log.m105924i("MicroMsg.AppBrandCameraView", "recordView is null");
            return;
        }
        Log.m105925i("MicroMsg.AppBrandCameraView", "setCameraMode mode:%s", this.f49285f);
        C17875g gVar = this.f49287h;
        if (gVar != null) {
            gVar.release();
            this.f49287h = null;
        }
        C17875g o = mo22100o(this.f49285f);
        this.f49287h = o;
        o.init();
        mo22103q();
    }

    /* renamed from: q */
    public final void mo22103q() {
        if (this.f49265E != null && this.f49290n != null) {
            C17874f fVar = new C17874f();
            if (!this.f49275P) {
                if (this.f49281V == null) {
                    this.f49281V = new ArrayList();
                }
                ((ArrayList) this.f49281V).add(fVar);
                Log.m105924i("MicroMsg.AppBrandCameraView", "set flash mode before camera init done");
                return;
            }
            fVar.run();
        }
    }

    /* renamed from: r */
    public final void mo22104r() {
        String format = String.format("%s%d.%s", new Object[]{"capture", Long.valueOf(System.currentTimeMillis()), "jpg"});
        this.f49268H = C112760b.m154203K() + format;
    }

    public void release() {
        Log.m105924i("MicroMsg.AppBrandCameraView", "release");
        synchronized (AppBrandCameraView.class) {
            try {
                this.f49277R = Util.currentTicks();
                if (this.f49262B) {
                    this.f49282W.disable();
                }
                MMSightRecordView mMSightRecordView = this.f49265E;
                if (mMSightRecordView != null) {
                    mMSightRecordView.f53165d.mo24083t();
                    removeView(this.f49265E);
                    this.f49269I = -1;
                    this.f49265E.setFrameDataCallback((MMSightRecordView.C18932a) null);
                    this.f49265E.setInitErrorCallback((MMSightRecordView.C18935d) null);
                    this.f49265E.setInitDoneCallback((MMSightRecordView.C18934c) null);
                    this.f49265E = null;
                }
                ImageView imageView = this.f49264D;
                if (imageView != null) {
                    imageView.setImageBitmap((Bitmap) null);
                }
                List<Runnable> list = this.f49281V;
                if (list != null) {
                    ((ArrayList) list).clear();
                }
                this.f49276Q = 0.0f;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        C17875g gVar = this.f49287h;
        if (gVar != null) {
            gVar.release();
            this.f49287h = null;
        }
    }

    /* renamed from: s */
    public final void mo22106s() {
        String str = "MicroMsg_" + System.currentTimeMillis();
        if (!C86013q1.m106450k(C112760b.m154203K())) {
            C86013q1.m106461v(C112760b.m154203K());
        }
        this.f49266F = C112760b.m154203K() + str + ".mp4";
        this.f49267G = C112760b.m154203K() + str + ".jpeg";
        MMSightRecordView mMSightRecordView = this.f49265E;
        if (mMSightRecordView != null) {
            mMSightRecordView.setVideoFilePath(this.f49266F);
        }
    }

    public void setAppId(String str) {
    }

    public void setCameraId(int i) {
        this.f49288i = i;
    }

    public void setCompressRecord(boolean z) {
        this.f49294r = z;
    }

    public void setDisplayScreenSize(Size size) {
        if (size != null && size.getHeight() > 0 && size.getWidth() > 0) {
            this.f49261A = size;
        }
    }

    public void setFlash(String str) {
        if (!Util.isEqual(this.f49290n, str)) {
            this.f49290n = str;
        }
    }

    public void setFrameLimitSize(int i) {
        Log.m105925i("MicroMsg.AppBrandCameraView", "setFrameLimitSize:%d", Integer.valueOf(i));
        this.f49286g = i;
    }

    public void setMode(String str) {
        this.f49285f = str;
    }

    public void setNeedOutput(boolean z) {
        this.f49295s = z;
    }

    public void setOperateCallBack(C90813d dVar) {
        this.f49263C = dVar;
    }

    public void setOutPutCallBack(C90812b bVar) {
    }

    public void setPage(C82520h hVar) {
        this.f49284e = hVar;
    }

    public void setPageOrientation(boolean z) {
        this.f49262B = z;
        Log.m105925i("MicroMsg.AppBrandCameraView", "setPageOrientation: %b", Boolean.valueOf(z));
    }

    public void setPreviewCenterCrop(boolean z) {
        this.f49293q = z;
    }

    public void setQuality(String str) {
        if (!Util.isEqual(this.f49291o, str)) {
            this.f49291o = str;
        }
    }

    public void setResolution(String str) {
        if (!Util.isEqual(this.f49292p, str)) {
            Log.m105925i("MicroMsg.AppBrandCameraView", "setPreviewResolution: %s", str);
            this.f49292p = str;
        }
    }

    public void setScanFreq(int i) {
        Log.m105925i("MicroMsg.AppBrandCameraView", "scanFreq:%d", Integer.valueOf(i));
        if (i <= 0) {
            Log.m105920e("MicroMsg.AppBrandCameraView", "scanFreq is err");
        } else {
            this.f49302z = i;
        }
    }

    public float setZoom(float f) {
        if (this.f49265E == null) {
            return 0.0f;
        }
        if (f < 1.0f) {
            return f;
        }
        float f2 = this.f49276Q;
        if (f > f2) {
            f = f2;
        }
        while (!this.f49265E.f53165d.mo24064N(f) && f > 0.0f) {
            f -= 0.1f;
        }
        return f;
    }

    /* renamed from: v */
    public void mo22124v() {
        C111546e eVar;
        if (this.f49263C != null && (eVar = this.f49274N) != null) {
            MMSightRecordView mMSightRecordView = this.f49265E;
            eVar.f333967c = false;
            if (mMSightRecordView != null) {
                mMSightRecordView.mo24026a((ByteBuffer) null, (MMSightRecordView.C18936f) null);
            }
            int i = eVar.f333968d;
            if (i != Integer.MIN_VALUE) {
                eVar.f333966b.mo115415j1(i);
                eVar.f333968d = Integer.MIN_VALUE;
            }
            this.f49274N = null;
        }
    }

    /* renamed from: x */
    public boolean mo22125x(int i, int i2, boolean z) {
        if (this.f49297u == i && this.f49298v == i2) {
            return false;
        }
        Log.m105924i("MicroMsg.AppBrandCameraView", "setViewSize");
        this.f49297u = i;
        this.f49298v = i2;
        return true;
    }

    /* renamed from: y */
    public void mo22126y(C82381f fVar, String str) {
        Log.m105924i("MicroMsg.AppBrandCameraView", "listenFrameChange");
        if (this.f49263C != null) {
            if (this.f49265E == null) {
                Log.m105928w("MicroMsg.AppBrandCameraView", "listenFrameChange recordView null");
                ((o$$b$$b) this.f49263C).mo124934a("camera illegal state", -1, -1, -1);
                return;
            }
            if (this.f49274N == null) {
                this.f49274N = new C111546e(fVar);
            }
            C17873e eVar = new C17873e();
            if (!this.f49275P) {
                if (this.f49281V == null) {
                    this.f49281V = new ArrayList();
                }
                Log.m105924i("MicroMsg.AppBrandCameraView", "listen frame change before camera init done");
                ((ArrayList) this.f49281V).add(eVar);
                return;
            }
            eVar.run();
        }
    }

    public AppBrandCameraView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m18283l(context);
    }

    public AppBrandCameraView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m18283l(context);
    }
}
