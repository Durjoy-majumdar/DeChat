package v70;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Parcelable;
import com.tencent.p014mm.media.camera.CameraSupportInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import gy3.C8480h;
import gy3.C87412m;
import sx3.C110823p;

/* renamed from: v70.a */
public final class C111386a {

    /* renamed from: a */
    public static final C111386a f333469a = new C111386a();

    /* renamed from: b */
    public static final Integer[] f333470b = (Build.VERSION.SDK_INT < 28 ? new Integer[]{0, 1} : new Integer[]{0, 1, 3, 4});

    /* renamed from: c */
    public static final CameraSupportInfo f333471c;

    /* renamed from: d */
    public static final CameraSupportInfo f333472d;

    /* renamed from: e */
    public static final MultiProcessMMKV f333473e;

    static {
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("MicroMsg.Camera.CameraKitUtil");
        f333473e = mmkv;
        Parcelable decodeParcelable = mmkv.decodeParcelable("key_front_support_info", CameraSupportInfo.class, new CameraSupportInfo((String) null, 0, 0, (String) null, 15, (C8480h) null));
        C87412m.m108593f(decodeParcelable, "mmkv.decodeParcelable(\n …raSupportInfo()\n        )");
        CameraSupportInfo cameraSupportInfo = (CameraSupportInfo) decodeParcelable;
        f333471c = cameraSupportInfo;
        Parcelable decodeParcelable2 = mmkv.decodeParcelable("key_back_support_info", CameraSupportInfo.class, new CameraSupportInfo((String) null, 0, 0, (String) null, 15, (C8480h) null));
        C87412m.m108593f(decodeParcelable2, "mmkv.decodeParcelable(\n …raSupportInfo()\n        )");
        CameraSupportInfo cameraSupportInfo2 = (CameraSupportInfo) decodeParcelable2;
        f333472d = cameraSupportInfo2;
        Log.m105924i("MicroMsg.Camera.CameraKitUtil", "init camera support info from mmkv, front info:" + cameraSupportInfo + "  back info:" + cameraSupportInfo2);
        if (!(cameraSupportInfo2.f79446g.length() == 0)) {
            if (!(cameraSupportInfo.f79446g.length() == 0)) {
                return;
            }
        }
        Object systemService = MMApplicationContext.getContext().getSystemService("camera");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
        CameraManager cameraManager = (CameraManager) systemService;
        String[] cameraIdList = cameraManager.getCameraIdList();
        C87412m.m108593f(cameraIdList, "manager.cameraIdList");
        for (String str : cameraIdList) {
            try {
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                C87412m.m108593f(cameraCharacteristics, "manager.getCameraCharacteristics(it)");
                Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                int i = -1;
                if (num != null) {
                    if (num.intValue() == 1) {
                        Integer num2 = (Integer) cameraManager.getCameraCharacteristics(str).get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                        CameraSupportInfo cameraSupportInfo3 = f333472d;
                        C87412m.m108593f(str, LocaleUtil.ITALIAN);
                        cameraSupportInfo3.getClass();
                        cameraSupportInfo3.f79443d = str;
                        cameraSupportInfo3.f79444e = 1;
                        if (num2 != null) {
                            i = num2.intValue();
                        }
                        cameraSupportInfo3.f79445f = i;
                        String b = f333469a.mo163053b(num2);
                        cameraSupportInfo3.getClass();
                        cameraSupportInfo3.f79446g = b;
                        Log.m105924i("MicroMsg.Camera.CameraKitUtil", "back camera info id:" + str + " level:" + num2 + " str:" + f333471c.f79446g);
                    }
                }
                Integer num3 = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                if (num3 != null) {
                    if (num3.intValue() == 0) {
                        Integer num4 = (Integer) cameraManager.getCameraCharacteristics(str).get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                        CameraSupportInfo cameraSupportInfo4 = f333471c;
                        C87412m.m108593f(str, LocaleUtil.ITALIAN);
                        cameraSupportInfo4.getClass();
                        cameraSupportInfo4.f79443d = str;
                        cameraSupportInfo4.f79444e = 0;
                        if (num4 != null) {
                            i = num4.intValue();
                        }
                        cameraSupportInfo4.f79445f = i;
                        String b2 = f333469a.mo163053b(num4);
                        cameraSupportInfo4.getClass();
                        cameraSupportInfo4.f79446g = b2;
                        Log.m105924i("MicroMsg.Camera.CameraKitUtil", "front camera info id:" + str + " level:" + num4 + " str:" + cameraSupportInfo4.f79446g);
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Camera.CameraKitUtil", e, "getCameraCharacteristics error!", new Object[0]);
            }
        }
        MultiProcessMMKV multiProcessMMKV = f333473e;
        multiProcessMMKV.encode("key_front_support_info", (Parcelable) f333471c);
        multiProcessMMKV.encode("key_back_support_info", (Parcelable) f333472d);
    }

    /* renamed from: a */
    public final boolean mo163052a() {
        boolean y = C110823p.m151009y(f333470b, Integer.valueOf(f333472d.f79445f));
        Log.m105924i("MicroMsg.Camera.CameraKitUtil", "enableCamerax :" + y);
        return y;
    }

    /* renamed from: b */
    public final String mo163053b(Integer num) {
        return (num != null && num.intValue() == 0) ? "LIMITED" : (num != null && num.intValue() == 1) ? "FULL" : (num != null && num.intValue() == 2) ? "LEGACY" : (num != null && num.intValue() == 3) ? "LEVEL_3" : (num != null && num.intValue() == 4) ? "EXTERNAL" : "UNKNOW";
    }
}
