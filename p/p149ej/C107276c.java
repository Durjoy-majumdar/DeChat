package p149ej;

import android.hardware.Camera;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.util.ArrayMap;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import gy3.C87412m;
import java.util.concurrent.FutureTask;
import rx3.C13598b0;

/* renamed from: ej.c */
public final class C107276c {

    /* renamed from: a */
    public static final C107276c f320945a = new C107276c();

    /* renamed from: b */
    public static int f320946b = -1;

    /* renamed from: c */
    public static boolean f320947c = false;

    /* renamed from: d */
    public static FutureTask<Integer> f320948d = null;

    /* renamed from: e */
    public static int f320949e = -1;

    /* renamed from: f */
    public static String f320950f;

    /* renamed from: g */
    public static ArrayMap<Integer, Camera.CameraInfo> f320951g = new ArrayMap<>();

    /* renamed from: h */
    public static int f320952h = -1;

    /* renamed from: i */
    public static int f320953i = -1;

    /* renamed from: a */
    public final void mo157748a() {
        try {
            f320950f = null;
            Object systemService = MMApplicationContext.getContext().getSystemService("camera");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
            CameraManager cameraManager = (CameraManager) systemService;
            String[] cameraIdList = cameraManager.getCameraIdList();
            C87412m.m108593f(cameraIdList, "manager.cameraIdList");
            for (String str : cameraIdList) {
                if (f320950f == null) {
                    f320950f = str + '-' + cameraManager.getCameraCharacteristics(str).get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL) + '-' + cameraManager.getCameraCharacteristics(str).get(CameraCharacteristics.LENS_FACING) + '+';
                } else {
                    f320950f += str + '-' + cameraManager.getCameraCharacteristics(str).get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL) + '-' + cameraManager.getCameraCharacteristics(str).get(CameraCharacteristics.LENS_FACING) + '+';
                }
            }
        } catch (Exception unused) {
            Log.m105920e("MicroMsg.PluginCamera", "a camera access exception happend");
        } catch (AssertionError unused2) {
            Log.m105920e("MicroMsg.PluginCamera", "some device has some problem in LegecyCamera ");
        }
    }

    /* renamed from: b */
    public final void mo157749b() {
        try {
            Object systemService = MMApplicationContext.getContext().getSystemService("camera");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
            f320949e = ((CameraManager) systemService).getCameraIdList().length;
        } catch (Exception unused) {
            Log.m105920e("MicroMsg.PluginCamera", "a camera access exception happend");
        } catch (AssertionError unused2) {
            Log.m105920e("MicroMsg.PluginCamera", "some device has some problem in LegecyCamera ");
        }
    }

    /* renamed from: c */
    public final Camera.CameraInfo mo157750c(int i) {
        if (mo157751d() != 2) {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(i, cameraInfo);
            return cameraInfo;
        }
        if (!f320951g.containsKey(Integer.valueOf(i))) {
            Log.m105924i("MicroMsg.PluginCamera", "cameraInfoList is empty, miss Cache, to make CameraInfo Cache");
            Camera.CameraInfo cameraInfo2 = new Camera.CameraInfo();
            MultiProcessMMKV multiProcessMMKV = MultiProcessMMKV.getDefault();
            int decodeInt = multiProcessMMKV.decodeInt("PluginCamera_CameraInfo_facing_" + i, -1);
            MultiProcessMMKV multiProcessMMKV2 = MultiProcessMMKV.getDefault();
            int decodeInt2 = multiProcessMMKV2.decodeInt("PluginCamera_CameraInfo_orientation_" + i, -1);
            MultiProcessMMKV multiProcessMMKV3 = MultiProcessMMKV.getDefault();
            boolean z = false;
            boolean decodeBool = multiProcessMMKV3.decodeBool("PluginCamera_CameraInfo_canDisableShutterSound_" + i, false);
            Log.m105924i("MicroMsg.PluginCamera", "getCameraInfoFromMMKVCacheById, id = " + i + ", facing = " + decodeInt + ", orientation =" + decodeInt2 + ", canDisableShutterSound = " + decodeBool);
            if (decodeInt == -1 || decodeInt2 == -1) {
                Log.m105924i("MicroMsg.PluginCamera", "getCameraInfoFromMMKVCacheById no MMKV cache");
            } else {
                cameraInfo2.facing = decodeInt;
                cameraInfo2.orientation = decodeInt2;
                cameraInfo2.canDisableShutterSound = decodeBool;
                f320951g.put(Integer.valueOf(i), cameraInfo2);
                z = true;
            }
            if (!z) {
                Log.m105924i("MicroMsg.PluginCamera", "getCameraInfoFromMMKVCacheById failed, refresh CameraCache");
                mo157752e();
            }
        }
        Camera.CameraInfo cameraInfo3 = f320951g.get(Integer.valueOf(i));
        Log.m105924i("MicroMsg.PluginCamera", "getCameraInfo cameraInfoList.size = " + f320951g.size());
        Log.m105924i("MicroMsg.PluginCamera", "getCameraInfo id = " + i + ", ret = " + cameraInfo3);
        return cameraInfo3;
    }

    /* renamed from: d */
    public final int mo157751d() {
        int i = f320946b;
        if (i == -1) {
            Log.m105924i("MicroMsg.PluginCamera", "mCameraNumber == -1，slow initCameraNumbers, use MMKV cache");
            int i2 = MultiProcessMMKV.getDefault().getInt("cameraNumberCache", -1);
            Log.m105924i("MicroMsg.PluginCamera", "get cameraNumberCache from MMKV cameraNumberCache is " + i2);
            if (i2 == -1) {
                Log.m105924i("MicroMsg.PluginCamera", "cameraNumberCache from MMKV failed, just getNumberOfCameras freshly");
                f320946b = Camera.getNumberOfCameras();
                Log.m105924i("MicroMsg.PluginCamera", "cameraNumberCache from MMKV failed, just getNumberOfCameras freshly DONE");
                MultiProcessMMKV.getDefault().putInt("cameraNumberCache", f320946b);
                Log.m105924i("MicroMsg.PluginCamera", "cameraNumberCache from MMKV failed, just getNumberOfCameras freshly save cache done");
            } else {
                Log.m105924i("MicroMsg.PluginCamera", "cameraNumberCache from MMKV successful, return cameraNumberCache : " + i2);
                if (!f320947c) {
                    int numberOfCameras = Camera.getNumberOfCameras();
                    f320946b = numberOfCameras;
                    return numberOfCameras;
                } else if (i2 == 0) {
                    Log.m105924i("MicroMsg.PluginCamera", "cameraNumberCache from MMKV is 0, error, getNumberOfCameras freshly ");
                    int numberOfCameras2 = Camera.getNumberOfCameras();
                    f320946b = numberOfCameras2;
                    return numberOfCameras2;
                } else {
                    f320946b = i2;
                    return i2;
                }
            }
        } else if (i == 0) {
            Log.m105924i("MicroMsg.PluginCamera", "mCameraNumber == 0， happened error to get camera number and try again");
            f320946b = Camera.getNumberOfCameras();
            Log.m105924i("MicroMsg.PluginCamera", "mCameraNumber == 0， happened error to get camera number and try again DONE");
            MultiProcessMMKV.getDefault().putInt("cameraNumberCache", f320946b);
        }
        Log.m105924i("MicroMsg.PluginCamera", "mCameraNumber is " + f320946b);
        return f320946b;
    }

    /* renamed from: e */
    public final void mo157752e() {
        Log.m105924i("MicroMsg.PluginCamera", "makeCameraInfoCache");
        synchronized (this) {
            try {
                Log.m105924i("MicroMsg.PluginCamera", "before getCameraNumbers");
                int d = f320945a.mo157751d();
                Log.m105924i("MicroMsg.PluginCamera", "after getCameraNumbers");
                for (int i = 0; i < d; i++) {
                    Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                    Camera.getCameraInfo(i, cameraInfo);
                    f320951g.put(Integer.valueOf(i), cameraInfo);
                    f320945a.mo157753f(i, cameraInfo.facing, cameraInfo.orientation, cameraInfo.canDisableShutterSound);
                    boolean z = true;
                    if (f320952h == -1) {
                        Camera.CameraInfo cameraInfo2 = f320951g.get(Integer.valueOf(i));
                        if (cameraInfo2 != null && cameraInfo2.facing == 0) {
                            f320952h = i;
                            MultiProcessMMKV.getDefault().encode("PluginCamera_BackCameraId", i);
                        }
                    }
                    if (f320953i == -1) {
                        Camera.CameraInfo cameraInfo3 = f320951g.get(Integer.valueOf(i));
                        if (cameraInfo3 == null || cameraInfo3.facing != 1) {
                            z = false;
                        }
                        if (z) {
                            f320953i = i;
                            MultiProcessMMKV.getDefault().encode("PluginCamera_FrontCameraId", i);
                        }
                    }
                    Log.m105924i("MicroMsg.PluginCamera", "makeCameraInfoCache, id = " + i + ", facint = " + cameraInfo.facing);
                }
                Log.m105924i("MicroMsg.PluginCamera", "makeCameraInfoCache mBackCameraId = " + f320952h + ", mFrontCameraId = " + f320953i);
            } catch (Throwable th) {
                Log.m105920e("MicroMsg.PluginCamera", "makeCameraInfoCache failed : " + th.getMessage() + ", clear cameraInfoList");
                f320951g.clear();
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* renamed from: f */
    public final void mo157753f(int i, int i2, int i3, boolean z) {
        Log.m105924i("MicroMsg.PluginCamera", "saveCameraInfoToMMKVCache, id = " + i + ", orientation = " + i3 + ", canDisableShutterSound = " + z);
        MultiProcessMMKV multiProcessMMKV = MultiProcessMMKV.getDefault();
        StringBuilder sb = new StringBuilder();
        sb.append("PluginCamera_CameraInfo_facing_");
        sb.append(i);
        multiProcessMMKV.encode(sb.toString(), i2);
        MultiProcessMMKV multiProcessMMKV2 = MultiProcessMMKV.getDefault();
        multiProcessMMKV2.encode("PluginCamera_CameraInfo_orientation_" + i, i3);
        MultiProcessMMKV multiProcessMMKV3 = MultiProcessMMKV.getDefault();
        multiProcessMMKV3.encode("PluginCamera_CameraInfo_canDisableShutterSound_" + i, z);
    }

    /* renamed from: g */
    public final void mo157754g(int i, Camera.CameraInfo cameraInfo) {
        C87412m.m108594g(cameraInfo, "cameraInfo");
        Log.m105924i("MicroMsg.PluginCamera", "updateCameraInfoCache " + i);
        f320951g.put(Integer.valueOf(i), cameraInfo);
    }
}
