package com.tencent.p014mm.plugin.scanner.p101ui;

import android.graphics.Rect;
import android.hardware.Camera;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import gt3.C20839a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import yk2.C112475a;

/* renamed from: com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI$$c */
public class ScanTranslationCaptureUI$$c implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ ScanTranslationCaptureUI f315845d;

    /* renamed from: com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI$$c$a */
    public class C106085a implements Camera.AutoFocusCallback {
        public C106085a() {
        }

        public void onAutoFocus(boolean z, Camera camera) {
            Log.m105924i("MicroMsg.ScanTranslationCaptureUI", "camera auto focus call back");
            C112475a aVar = ScanTranslationCaptureUI$$c.this.f315845d.f347062f;
            aVar.getClass();
            try {
                Camera camera2 = aVar.f324139a;
                if (camera2 != null) {
                    camera2.cancelAutoFocus();
                }
            } catch (Exception e) {
                com.tencent.stubs.logger.Log.m106513w("BaseScanCamera", "cancelAutoFocus " + e.getMessage());
            }
            ScanTranslationCaptureUI$$c.this.f315845d.f347062f.mo164197v();
        }
    }

    public ScanTranslationCaptureUI$$c(ScanTranslationCaptureUI scanTranslationCaptureUI) {
        this.f315845d = scanTranslationCaptureUI;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        List<String> supportedFocusModes;
        View view2 = view;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI$11", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        ScanTranslationCaptureUI scanTranslationCaptureUI = this.f315845d;
        if (scanTranslationCaptureUI.f347050H == 0 && view2 == scanTranslationCaptureUI.f347047E) {
            if (motionEvent.getAction() == 0) {
                Log.m105925i("MicroMsg.ScanTranslationCaptureUI", "event down, (%f, %f)", Float.valueOf(motionEvent.getX()), Float.valueOf(motionEvent.getY()));
                float x = motionEvent.getX() / ((float) this.f315845d.f347047E.getWidth());
                float y = motionEvent.getY() / ((float) this.f315845d.f347047E.getHeight());
                C112475a aVar = this.f315845d.f347062f;
                C106085a aVar2 = new C106085a();
                aVar.getClass();
                int i = (int) (x * 2000.0f);
                int i2 = (int) (2000.0f * y);
                try {
                    Log.m105924i("MicroMsg.WxScanCamera", String.format("fx %f, fy %f, x %d, y %d", new Object[]{Float.valueOf(x), Float.valueOf(y), Integer.valueOf(i), Integer.valueOf(i2)}));
                    Rect rect = new Rect();
                    if (aVar.f324146h) {
                        int i3 = i2 - 1000;
                        rect.left = i3 - 250;
                        rect.right = i3 + 250;
                        int i4 = (2000 - i) - 1000;
                        rect.top = i4 - 250;
                        rect.bottom = i4 + 250;
                    } else {
                        int i5 = i - 1000;
                        rect.left = i5 - 250;
                        rect.right = i5 + 250;
                        int i6 = i2 - 1000;
                        rect.top = i6 - 250;
                        rect.bottom = i6 + 250;
                    }
                    Camera.Parameters parameters = aVar.f324139a.getParameters();
                    if (rect.left < -1000) {
                        rect.left = -1000;
                    }
                    if (rect.right > 1000) {
                        rect.right = 1000;
                    }
                    if (rect.top < -1000) {
                        rect.top = -1000;
                    }
                    if (rect.bottom > 1000) {
                        rect.bottom = 1000;
                    }
                    Log.m105924i("MicroMsg.WxScanCamera", "focus area " + rect);
                    Rect rect2 = new Rect(rect);
                    if (parameters.getMaxNumMeteringAreas() > 0) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(new Camera.Area(rect2, 1000));
                        parameters.setMeteringAreas(arrayList2);
                        if (parameters.getMaxNumFocusAreas() > 0) {
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(new Camera.Area(rect, 1000));
                            parameters.setFocusAreas(arrayList3);
                            aVar.f324139a.cancelAutoFocus();
                            if (aVar.f324139a != null && aVar.f324141c && (supportedFocusModes = parameters.getSupportedFocusModes()) != null && supportedFocusModes.contains("auto") && !C20839a.m22868d(parameters.getFocusMode()) && !parameters.getFocusMode().equals("auto")) {
                                parameters.setFocusMode("auto");
                            }
                            aVar.f324139a.setParameters(parameters);
                            aVar.f324139a.autoFocus(aVar2);
                        } else {
                            Log.m105924i("MicroMsg.WxScanCamera", "setCaptureFocusAndMeteringArea, camera not support area focus");
                        }
                    } else {
                        Log.m105924i("MicroMsg.WxScanCamera", "setCaptureFocusAndMeteringArea, camera not support set metering area");
                    }
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.WxScanCamera", "setCaptureFocusAndMeteringArea error: " + e.getMessage());
                }
            }
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI$11", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI$11", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
