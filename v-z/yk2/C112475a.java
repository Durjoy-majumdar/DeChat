package yk2;

import android.hardware.Camera;
import com.tencent.p014mm.sdk.platformtools.Log;
import gt3.C20839a;
import ht3.C108258a;
import java.util.List;

/* renamed from: yk2.a */
public class C112475a extends C108258a {
    /* renamed from: r */
    public void mo164193r() {
        Log.m105924i("MicroMsg.WxScanCamera", String.format("closeFlash, camera: %s, isPreviewing: %s", new Object[]{this.f324139a, Boolean.valueOf(this.f324141c)}));
        if (this.f324139a != null && this.f324141c) {
            try {
                this.f324148j = false;
                Camera.Parameters parameters = this.f324139a.getParameters();
                List<String> supportedFlashModes = parameters.getSupportedFlashModes();
                if (supportedFlashModes == null || !supportedFlashModes.contains("off")) {
                    Log.m105924i("MicroMsg.WxScanCamera", "camera not support close flash!!");
                    return;
                }
                parameters.setFlashMode("off");
                this.f324139a.setParameters(parameters);
                Log.m105924i("MicroMsg.WxScanCamera", "close flash");
            } catch (Exception e) {
                Log.m105920e("MicroMsg.WxScanCamera", "closeFlash error: " + e.getMessage());
            }
        }
    }

    /* renamed from: s */
    public void mo164194s(boolean z) {
        try {
            Camera camera = this.f324139a;
            if (camera != null) {
                Camera.Parameters parameters = camera.getParameters();
                String str = parameters.get("zoom-supported");
                if (!C20839a.m22868d(str)) {
                    if (Boolean.parseBoolean(str)) {
                        List<Integer> zoomRatios = parameters.getZoomRatios();
                        if (zoomRatios == null) {
                            return;
                        }
                        if (zoomRatios.size() > 0) {
                            if (z) {
                                int size = zoomRatios.size() / 5;
                                this.f324151m = size;
                                if (zoomRatios.get(size).intValue() > 150) {
                                    this.f324151m = mo158647i(zoomRatios, 150);
                                }
                            } else {
                                this.f324151m = 0;
                            }
                            this.f324152n = (int) (((double) zoomRatios.size()) / 1.5d);
                            Log.m105919d("MicroMsg.WxScanCamera", "divideRatio: %f,max zoom: %d", Double.valueOf(1.5d), Integer.valueOf(this.f324152n));
                            int i = this.f324152n;
                            int i2 = this.f324151m;
                            if (i < i2) {
                                this.f324152n = i2;
                            } else if (zoomRatios.get(i).intValue() > 400) {
                                this.f324152n = mo158647i(zoomRatios, 400);
                            }
                            Log.m105925i("MicroMsg.WxScanCamera", "default zoom:%d,default ratio:%d,max zoom:%d,max ratio:%d", Integer.valueOf(this.f324151m), zoomRatios.get(this.f324151m), Integer.valueOf(this.f324152n), zoomRatios.get(this.f324152n));
                            return;
                        }
                        return;
                    }
                }
                Log.m105924i("MicroMsg.WxScanCamera", "not support zoom");
            }
        } catch (Exception e) {
            Log.m105920e("MicroMsg.WxScanCamera", "init zoom exception! " + e.getMessage());
        }
    }

    /* renamed from: t */
    public boolean mo164195t() {
        int i;
        if (this.f324149k < 0) {
            if (this.f324139a != null && this.f324141c) {
                try {
                    List<String> supportedFlashModes = this.f324139a.getParameters().getSupportedFlashModes();
                    if (supportedFlashModes == null || !supportedFlashModes.contains("torch")) {
                        Log.m105924i("MicroMsg.WxScanCamera", "camera not support flash!!");
                    } else {
                        i = 1;
                        this.f324149k = i;
                    }
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.WxScanCamera", "isFlashSupported error: " + e.getMessage());
                }
            }
            i = 0;
            this.f324149k = i;
        }
        return this.f324149k == 1;
    }

    /* renamed from: u */
    public void mo164196u() {
        Log.m105924i("MicroMsg.WxScanCamera", String.format("openFlash, camera: %s, isPreviewing: %s", new Object[]{this.f324139a, Boolean.valueOf(this.f324141c)}));
        if (this.f324139a != null && this.f324141c) {
            try {
                this.f324148j = true;
                Camera.Parameters parameters = this.f324139a.getParameters();
                List<String> supportedFlashModes = parameters.getSupportedFlashModes();
                if (supportedFlashModes == null || !supportedFlashModes.contains("torch")) {
                    Log.m105924i("MicroMsg.WxScanCamera", "camera not support flash!!");
                    return;
                }
                parameters.setFlashMode("torch");
                this.f324139a.setParameters(parameters);
                Log.m105924i("MicroMsg.WxScanCamera", "open flash");
            } catch (Exception e) {
                Log.m105920e("MicroMsg.WxScanCamera", "openFlash error: " + e.getMessage());
            }
        }
    }

    /* renamed from: v */
    public void mo164197v() {
        try {
            Log.m105924i("MicroMsg.WxScanCamera", "set picture focus");
            Camera.Parameters parameters = this.f324139a.getParameters();
            if (parameters == null) {
                Log.m105928w("MicroMsg.WxScanCamera", "camera parameters is null");
                return;
            }
            List<String> supportedFocusModes = parameters.getSupportedFocusModes();
            if (supportedFocusModes != null) {
                Log.m105918d("MicroMsg.WxScanCamera", "supported focus modes size = " + supportedFocusModes.size());
                for (String str : supportedFocusModes) {
                    Log.m105918d("MicroMsg.WxScanCamera", "supported focus modes : " + str);
                }
                if (supportedFocusModes.contains("continuous-picture")) {
                    Log.m105918d("MicroMsg.WxScanCamera", "camera support continuous picture focus");
                    parameters.setFocusMode("continuous-picture");
                } else if (supportedFocusModes.contains("continuous-video")) {
                    Log.m105918d("MicroMsg.WxScanCamera", "camera support continuous video focus");
                    parameters.setFocusMode("continuous-video");
                } else if (supportedFocusModes.contains("auto")) {
                    Log.m105918d("MicroMsg.WxScanCamera", "camera support auto focus");
                    parameters.setFocusMode("auto");
                }
                this.f324139a.setParameters(parameters);
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.WxScanCamera", "setPictureFocus error: %s", e.getMessage());
        }
    }
}
