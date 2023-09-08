package w80;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.GLES20;
import android.os.HandlerThread;
import android.view.Surface;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.gpudetector.JniGPUDetector;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import eu3.C58834h;
import eu3.C97749e;
import gy3.C8480h;
import gy3.C87412m;
import kj2.C117407d;
import org.json.JSONObject;
import p206nj.C88957l;
import w80.C111742d;

/* renamed from: w80.e */
public final class C111744e {

    /* renamed from: d */
    public static final C111745a f334654d;

    /* renamed from: a */
    public HandlerThread f334655a;

    /* renamed from: b */
    public C111742d.C65942b f334656b;

    /* renamed from: c */
    public MMHandler f334657c;

    /* renamed from: w80.e$a */
    public static final class C111745a {
        public C111745a(C8480h hVar) {
        }

        /* renamed from: a */
        public final String mo163478a() {
            String string = mo163481d().getString("gpu_detector_version", (String) null);
            if (string == null || string.length() == 0) {
                mo163484g();
            }
            return string;
        }

        /* renamed from: b */
        public final String mo163479b() {
            String string = mo163481d().getString("gpu_info_device_model", (String) null);
            if (string == null || string.length() == 0) {
                mo163484g();
            }
            return string;
        }

        /* renamed from: c */
        public final int mo163480c() {
            int i = mo163481d().getInt("gpu_info_rating", -1);
            if (i == -1) {
                mo163484g();
            }
            return i;
        }

        /* renamed from: d */
        public final MultiProcessMMKV mo163481d() {
            MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("mmkv_gpu_info");
            C87412m.m108593f(mmkv, "getMMKV(KV_NAME)");
            return mmkv;
        }

        /* renamed from: e */
        public final String mo163482e() {
            try {
                String b = mo163479b();
                if (b != null) {
                    return b;
                }
                new C111744e().mo163475a();
                return b;
            } catch (Exception e) {
                Log.printInfoStack("MicroMsg.GpuDetectorUtil", "error happened " + e, new Object[0]);
                return null;
            }
        }

        /* renamed from: f */
        public final int mo163483f() {
            try {
                int c = mo163480c();
                String a = mo163478a();
                String version = JniGPUDetector.Companion.getVersion();
                if (c == -1 || a == null || !C87412m.m108589b(version, version)) {
                    new C111744e().mo163475a();
                }
                return c;
            } catch (Exception e) {
                Log.printInfoStack("MicroMsg.GpuDetectorUtil", "error happened " + e, new Object[0]);
                return -1;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x003c A[Catch:{ Exception -> 0x0053 }] */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0045 A[Catch:{ Exception -> 0x0053 }] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x004f A[Catch:{ Exception -> 0x0053 }] */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo163484g() {
            /*
                r10 = this;
                java.lang.String r0 = "gpu_detector_version"
                java.lang.String r1 = "gpu_info_device_model"
                java.lang.String r2 = "gpu_info_rating"
                java.lang.String r3 = "MicroMsg.GpuDetectorUtil"
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r4 = r10.mo163481d()
                r5 = 0
                java.lang.String r6 = "spToMMKV: "
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r6)     // Catch:{ Exception -> 0x0053 }
                android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0053 }
                java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreferencePath()     // Catch:{ Exception -> 0x0053 }
                android.content.SharedPreferences r6 = r6.getSharedPreferences(r7, r5)     // Catch:{ Exception -> 0x0053 }
                r7 = -1
                int r8 = r6.getInt(r2, r7)     // Catch:{ Exception -> 0x0053 }
                if (r8 == r7) goto L_0x0028
                r4.putInt(r2, r8)     // Catch:{ Exception -> 0x0053 }
            L_0x0028:
                r2 = 0
                java.lang.String r7 = r6.getString(r1, r2)     // Catch:{ Exception -> 0x0053 }
                r8 = 1
                if (r7 == 0) goto L_0x0039
                int r9 = r7.length()     // Catch:{ Exception -> 0x0053 }
                if (r9 != 0) goto L_0x0037
                goto L_0x0039
            L_0x0037:
                r9 = 0
                goto L_0x003a
            L_0x0039:
                r9 = 1
            L_0x003a:
                if (r9 != 0) goto L_0x003f
                r4.putString(r1, r7)     // Catch:{ Exception -> 0x0053 }
            L_0x003f:
                java.lang.String r1 = r6.getString(r0, r2)     // Catch:{ Exception -> 0x0053 }
                if (r1 == 0) goto L_0x004d
                int r2 = r1.length()     // Catch:{ Exception -> 0x0053 }
                if (r2 != 0) goto L_0x004c
                goto L_0x004d
            L_0x004c:
                r8 = 0
            L_0x004d:
                if (r8 != 0) goto L_0x005b
                r4.putString(r0, r1)     // Catch:{ Exception -> 0x0053 }
                goto L_0x005b
            L_0x0053:
                r0 = move-exception
                java.lang.Object[] r1 = new java.lang.Object[r5]
                java.lang.String r2 = ""
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r2, r1)
            L_0x005b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: w80.C111744e.C111745a.mo163484g():void");
        }
    }

    /* renamed from: w80.e$b */
    public static final class C111746b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C111744e f334658d;

        /* renamed from: w80.e$b$a */
        public static final class C111747a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C111744e f334659d;

            public C111747a(C111744e eVar) {
                this.f334659d = eVar;
            }

            public final void run() {
                C111742d.C65942b bVar = this.f334659d.f334656b;
                if (bVar != null) {
                    C111742d.C111743a aVar = C111742d.f334647a;
                    C87412m.m108591d(bVar);
                    aVar.mo163471q(bVar);
                }
                HandlerThread handlerThread = this.f334659d.f334655a;
                if (handlerThread != null) {
                    handlerThread.quitSafely();
                }
            }
        }

        public C111746b(C111744e eVar) {
            this.f334658d = eVar;
        }

        public final void run() {
            C111744e eVar = this.f334658d;
            C111742d.C111743a aVar = C111742d.f334647a;
            eVar.f334656b = C111742d.C111743a.m152352k(aVar, (Surface) null, (SurfaceTexture) null, 1, 1, (EGLContext) null, 16, (Object) null);
            C111744e eVar2 = this.f334658d;
            String glGetString = GLES20.glGetString(7939);
            C87412m.m108593f(glGetString, "glGetString(GLES30.GL_EXTENSIONS)");
            eVar2.getClass();
            C111745a aVar2 = C111744e.f334654d;
            aVar2.mo163481d().putString("gl_extension_support_list", glGetString);
            C111744e eVar3 = this.f334658d;
            eVar3.getClass();
            try {
                JniGPUDetector.GpuDeviceModel gpuDeviceModel = new JniGPUDetector.GpuDeviceModel();
                JniGPUDetector jniGPUDetector = new JniGPUDetector();
                if (jniGPUDetector.GetGPUDeviceModel(gpuDeviceModel)) {
                    int i = aVar.mo163461d("GL_OES_EGL_image_external_essl3") ? 1 : 0;
                    int arch = gpuDeviceModel.getArch();
                    int code = gpuDeviceModel.getCode();
                    int numCores = gpuDeviceModel.getNumCores();
                    String name = gpuDeviceModel.getName();
                    String vendor = gpuDeviceModel.getVendor();
                    String version = gpuDeviceModel.getVersion();
                    int gpuPerfScoreInfo = jniGPUDetector.getGpuPerfScoreInfo();
                    JniGPUDetector.Companion companion = JniGPUDetector.Companion;
                    eVar3.mo163476b(arch, code, numCores, name, vendor, version, gpuPerfScoreInfo, companion.getArchNameDetail(gpuDeviceModel.getArch()), i);
                    aVar2.mo163481d().putInt("gpu_info_rating", jniGPUDetector.getGpuPerfScoreInfo());
                    aVar2.mo163481d().putString("gpu_detector_version", companion.getVersion());
                    eVar3.mo163477c(gpuDeviceModel);
                }
            } catch (Exception e) {
                Log.printInfoStack("MicroMsg.GpuDetectorUtil", "Failed to detect GPU " + e, new Object[0]);
            }
            MMHandler mMHandler = this.f334658d.f334657c;
            if (mMHandler != null) {
                mMHandler.removeCallbacksAndMessages((Object) null);
            }
            C111744e eVar4 = this.f334658d;
            MMHandler mMHandler2 = eVar4.f334657c;
            if (mMHandler2 != null) {
                mMHandler2.post(new C111747a(eVar4));
            }
        }
    }

    static {
        C111745a aVar = new C111745a((C8480h) null);
        f334654d = aVar;
        C88957l.m111079o("GPUDetector", aVar.getClass().getClassLoader());
    }

    /* renamed from: a */
    public final void mo163475a() {
        try {
            C111745a aVar = f334654d;
            if (aVar.mo163480c() != -1) {
                String string = aVar.mo163481d().getString("gl_extension_support_list", "");
                if (string == null) {
                    string = "";
                }
                if (!(C87412m.m108589b(string, "") || aVar.mo163479b() == null || aVar.mo163478a() == null)) {
                    if (C87412m.m108589b(JniGPUDetector.Companion.getVersion(), aVar.mo163478a())) {
                        Log.m105924i("MicroMsg.GpuDetectorUtil", "sp has value and not to do queryGpuInfo");
                        return;
                    }
                }
            }
            int i = C58834h.f168432b;
            HandlerThread a = C97749e.m126093a("GpuDetectorUtil", 5);
            this.f334655a = a;
            a.start();
            HandlerThread handlerThread = this.f334655a;
            MMHandler mMHandler = new MMHandler(handlerThread != null ? handlerThread.getLooper() : null);
            this.f334657c = mMHandler;
            mMHandler.post(new C111746b(this));
        } catch (Exception e) {
            Log.printInfoStack("MicroMsg.GpuDetectorUtil", "error happened " + e, new Object[0]);
        }
    }

    /* renamed from: b */
    public final void mo163476b(int i, int i2, int i3, String str, String str2, String str3, int i4, String str4, int i5) {
        C117407d.INSTANCE.mo160140o(20128, true, true, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str, str2, str3, Integer.valueOf(i4), str4, Integer.valueOf(i5));
    }

    /* renamed from: c */
    public final void mo163477c(JniGPUDetector.GpuDeviceModel gpuDeviceModel) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("arch", String.valueOf(gpuDeviceModel.getArch()));
        jSONObject.put("code", String.valueOf(gpuDeviceModel.getCode()));
        jSONObject.put("numCores", String.valueOf(gpuDeviceModel.getNumCores()));
        jSONObject.put("name", gpuDeviceModel.getName());
        jSONObject.put("vendor", gpuDeviceModel.getVendor());
        jSONObject.put(ProviderConstants.API_COLNAME_FEATURE_VERSION, gpuDeviceModel.getVersion());
        jSONObject.put("archDetail", JniGPUDetector.Companion.getArchNameDetail(gpuDeviceModel.getArch()));
        f334654d.mo163481d().putString("gpu_info_device_model", jSONObject.toString());
    }
}
