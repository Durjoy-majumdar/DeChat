package b43;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.hardware.Camera;
import android.os.Build;
import c43.C104298b;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import p149ej.C107276c;
import p156gj.C107825d;
import p156gj.C107835h0;
import qe3.C89625d;
import zt3.C119157j;

/* renamed from: b43.d */
public class C104035d {

    /* renamed from: a */
    public static C104298b f307670a = null;

    /* renamed from: b */
    public static int f307671b = -1;

    /* renamed from: c */
    public static int f307672c = -1;

    /* renamed from: d */
    public static int f307673d = 0;

    /* renamed from: e */
    public static int f307674e = 0;

    /* renamed from: f */
    public static int f307675f = 0;

    /* renamed from: g */
    public static boolean f307676g = true;

    /* renamed from: h */
    public static boolean f307677h;

    /* renamed from: i */
    public static int f307678i;

    /* renamed from: b43.d$a */
    public class C104036a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f307679d;

        public C104036a(int i) {
            this.f307679d = i;
        }

        public void run() {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(this.f307679d, cameraInfo);
            C107276c.f320945a.mo157754g(this.f307679d, cameraInfo);
        }
    }

    /* renamed from: a */
    public static boolean m138787a() {
        if (!f307677h) {
            boolean z = false;
            try {
                if (Class.forName("android.hardware.Camera").getDeclaredMethod("getNumberOfCameras", (Class[]) null) == null) {
                    Log.m105918d("GetfcMethod", "GetfcMethod is null");
                } else {
                    z = true;
                }
            } catch (Exception e) {
                Log.m105920e("MicroMsg.CameraUtil", "find getNumberOfCameras failed: " + e.getMessage());
            }
            f307676g = z;
            f307678i = C107276c.f320945a.mo157751d();
            f307677h = true;
        }
        return f307676g;
    }

    /* renamed from: b */
    public static void m138788b(Context context) {
        if (f307670a == null) {
            f307670a = new C104298b("*", 15, 1, false, true, 0, 0, (Point) null, (Point) null);
            if (m138787a() && !C107835h0.f322845b.f322803b) {
                m138789c();
            } else if (!m138787a() || !C107835h0.f322845b.f322803b) {
                m138790d(context);
            } else {
                m138789c();
                m138790d(context);
            }
            C107825d dVar = C107835h0.f322845b;
            if (dVar.f322809h) {
                f307675f = dVar.f322808g;
            }
            Log.m105924i("MicroMsg.CameraUtil", "gCameraNum:" + f307670a.f308688b + "\ngIsHasFrontCamera:" + f307670a.f308689c + "\ngIsHasBackCamera:" + f307670a.f308690d + "\ngFrontCameraId:" + f307671b + "\ngBackCameraId:" + f307672c + "\ngBackOrientation:" + f307670a.f308692f + "\ngFrontOrientation:" + f307670a.f308691e + "\ngBestFps:" + f307670a.f308687a + "\ngFacePreviewSize:" + f307670a.f308693g + "\ngNonFacePreviewSize:" + f307670a.f308694h + "\ngFaceCameraIsRotate180:" + f307673d + "\ngMainCameraIsRotate180:" + f307674e + "\ngCameraFormat:" + f307675f + "\ngFaceNotRotate:SDK:" + Build.VERSION.SDK_INT + "\n");
        }
    }

    /* renamed from: c */
    public static void m138789c() {
        int i;
        int i2;
        f307670a.f308688b = f307678i;
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        boolean z = MultiProcessMMKV.getDefault().decodeBool("clicfg_voip_camera_info_use_cache_new", true) || C89625d.f257845k || BuildInfo.DEBUG;
        Log.m105925i("MicroMsg.CameraUtil", "mCameraNumber = %d, useCache = %b", Integer.valueOf(f307678i), Boolean.valueOf(z));
        int i3 = 0;
        while (true) {
            try {
                if (i3 >= f307670a.f308688b) {
                    break;
                }
                if (z) {
                    cameraInfo = C107276c.f320945a.mo157750c(i3);
                    i2 = cameraInfo.facing;
                    i = cameraInfo.orientation;
                    ((C119157j) C119157j.f356862d).mo183876g(new C104036a(i3), "initDeviceFromAPI-checkCache");
                } else {
                    Camera.getCameraInfo(i3, cameraInfo);
                    i2 = cameraInfo.facing;
                    i = cameraInfo.orientation;
                }
                if (i2 == 1) {
                    if (f307671b != -1) {
                        Log.m105925i("MicroMsg.CameraUtil", "device has other camera id %s in front", Integer.valueOf(i3));
                        break;
                    }
                    f307671b = i3;
                    C104298b bVar = f307670a;
                    bVar.f308691e = i;
                    bVar.f308689c = true;
                } else if (i2 != 0) {
                    continue;
                } else if (f307672c != -1) {
                    Log.m105925i("MicroMsg.CameraUtil", "device has other camera id %s in back", Integer.valueOf(i3));
                    break;
                } else {
                    f307672c = i3;
                    C104298b bVar2 = f307670a;
                    bVar2.f308692f = i;
                    bVar2.f308690d = true;
                }
                i3++;
            } catch (Exception e) {
                Log.m105921e("MicroMsg.CameraUtil", "get camera info error: %s", e.getMessage());
            }
        }
        String property = System.getProperty("ro.media.enc.camera.platform", (String) null);
        boolean equalsIgnoreCase = property == null ? false : property.equalsIgnoreCase("Mediatek");
        C104298b bVar3 = f307670a;
        int i4 = bVar3.f308691e;
        if (i4 == 270 || (equalsIgnoreCase && i4 == 0)) {
            f307673d = 1;
        } else {
            f307673d = 0;
        }
        int i5 = bVar3.f308692f;
        if (i5 == 270 || (equalsIgnoreCase && i5 == 0)) {
            f307674e = 1;
        } else {
            f307674e = 0;
        }
    }

    /* renamed from: d */
    public static void m138790d(Context context) {
        int i;
        int i2;
        int i3;
        int i4;
        Log.m105924i("MicroMsg.CameraUtil", "initDeviceFromServerConf");
        C107825d dVar = C107835h0.f322845b;
        if (dVar.f322803b) {
            Log.m105925i("MicroMsg.CameraUtil", "initDeviceFromServerConf setCameraNum %d", Integer.valueOf(dVar.f322802a));
            f307670a.f308688b = C107835h0.f322845b.f322802a;
        }
        C107825d dVar2 = C107835h0.f322845b;
        boolean z = dVar2.f322813l;
        if (z) {
            if (dVar2.f322812k.f322828a != 0) {
                f307670a.f308690d = true;
            } else {
                f307670a.f308690d = false;
            }
        }
        boolean z2 = dVar2.f322811j;
        if (z2) {
            if (dVar2.f322810i.f322828a != 0) {
                f307670a.f308689c = true;
            } else {
                f307670a.f308689c = false;
            }
        }
        if (z2 && (i4 = dVar2.f322810i.f322830c) >= 0) {
            f307670a.f308691e = i4;
            f307673d = i4;
        }
        if (z && (i3 = dVar2.f322812k.f322830c) >= 0) {
            f307670a.f308692f = i3;
            f307674e = i3;
        }
        if (z2) {
            C104298b bVar = f307670a;
            if (bVar.f308693g == null) {
                bVar.f308693g = new Point(0, 0);
            }
            C104298b bVar2 = f307670a;
            C107825d.C107826a aVar = C107835h0.f322845b.f322810i;
            bVar2.f308693g = new Point(aVar.f322833f, aVar.f322834g);
        }
        if (C107835h0.f322845b.f322813l) {
            C104298b bVar3 = f307670a;
            if (bVar3.f308694h == null) {
                bVar3.f308694h = new Point(0, 0);
            }
            C104298b bVar4 = f307670a;
            C107825d.C107826a aVar2 = C107835h0.f322845b.f322812k;
            bVar4.f308694h = new Point(aVar2.f322833f, aVar2.f322834g);
        }
        C107825d dVar3 = C107835h0.f322845b;
        if (dVar3.f322813l && (i2 = dVar3.f322812k.f322829b) != 0) {
            f307670a.f308687a = i2;
        }
        if (dVar3.f322811j && (i = dVar3.f322810i.f322829b) != 0) {
            f307670a.f308687a = i;
        }
        PackageManager packageManager = context.getPackageManager();
        if (!C107835h0.f322845b.f322803b && !packageManager.hasSystemFeature("android.hardware.camera")) {
            C104298b bVar5 = f307670a;
            bVar5.f308688b = 0;
            bVar5.f308689c = false;
            bVar5.f308690d = false;
        }
    }
}
