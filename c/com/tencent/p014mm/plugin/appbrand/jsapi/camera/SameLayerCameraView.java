package com.tencent.p014mm.plugin.appbrand.jsapi.camera;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import com.tencent.p014mm.plugin.appbrand.jsapi.camera.AppBrandCameraView;
import com.tencent.p014mm.plugin.appbrand.jsapi.scanner.JsApiScanCode;
import com.tencent.p014mm.plugin.mmsight.api.MMSightRecordView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import vk0.C90816h;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.camera.SameLayerCameraView */
public class SameLayerCameraView extends AppBrandCameraView implements C90816h {

    /* renamed from: y0 */
    public static final /* synthetic */ int f49326y0 = 0;

    /* renamed from: x0 */
    public Surface f49327x0;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.camera.SameLayerCameraView$a */
    public class C17882a extends AppBrandCameraView.C17880i {
        public C17882a(SameLayerCameraView sameLayerCameraView) {
            super();
        }

        public void init() {
            this.f49322j = 1;
            super.init();
        }
    }

    public SameLayerCameraView(Context context) {
        super(context);
    }

    /* renamed from: f */
    public void mo22147f(MotionEvent motionEvent) {
        if (getRecordView() != null) {
            getRecordView().f53165d.mo24079p(motionEvent);
        }
    }

    /* renamed from: k */
    public MMSightRecordView mo22098k(Context context, int i, int i2) {
        return new MMSightRecordView(context, this.f49327x0, i, i2);
    }

    /* renamed from: o */
    public AppBrandCameraView.C17875g mo22100o(String str) {
        return (Util.isNullOrNil(str) || !str.equals(JsApiScanCode.NAME)) ? super.mo22100o(str) : new C17882a(this);
    }

    public void setCustomSurface(Surface surface) {
        Log.m105925i("MicroMsg.SameLayerCameraView", "setCustomSurface:%s", surface);
        this.f49327x0 = surface;
    }

    public SameLayerCameraView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SameLayerCameraView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
