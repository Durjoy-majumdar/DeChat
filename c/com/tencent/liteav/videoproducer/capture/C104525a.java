package com.tencent.liteav.videoproducer.capture;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.util.LiteavLog;

/* renamed from: com.tencent.liteav.videoproducer.capture.a */
public final class C104525a {
    /* renamed from: a */
    public static int m139840a() {
        CameraManager cameraManager = (CameraManager) ContextUtils.getApplicationContext().getSystemService("camera");
        try {
            String[] cameraIdList = cameraManager.getCameraIdList();
            if (cameraIdList.length <= 0) {
                return -1;
            }
            int i = -1;
            for (String cameraCharacteristics : cameraIdList) {
                CameraCharacteristics cameraCharacteristics2 = cameraManager.getCameraCharacteristics(cameraCharacteristics);
                Integer num = (Integer) cameraCharacteristics2.get(CameraCharacteristics.LENS_FACING);
                if (num == null || num.intValue() == 0 || num.intValue() == 1) {
                    Integer num2 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                    if (num2 == null) {
                        return -1;
                    }
                    i = num2.intValue();
                }
            }
            return i;
        } catch (Exception e) {
            LiteavLog.m16898e("CameraAbilityProvider", "getCamera2SupportLevel exception:".concat(String.valueOf(e)));
            return -1;
        }
    }
}
