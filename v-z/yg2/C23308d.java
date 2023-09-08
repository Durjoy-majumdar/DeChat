package yg2;

import com.tencent.p014mm.plugin.appbrand.jsapi.camera.AppBrandCameraView;
import com.tencent.p014mm.plugin.mmsight.api.MMSightRecordView;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;
import vk0.C22765i;

/* renamed from: yg2.d */
public final class C23308d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C112445a f66991d;

    public C23308d(C112445a aVar) {
        this.f66991d = aVar;
    }

    public final void run() {
        MMSightRecordView.C18934c cVar = this.f66991d.f336694v;
        if (cVar != null) {
            AppBrandCameraView.C17872d dVar = (AppBrandCameraView.C17872d) cVar;
            AppBrandCameraView.this.f49275P = true;
            Log.m105924i("MicroMsg.AppBrandCameraView", "InitDoneCallback");
            C22765i iVar = new C22765i();
            HashMap hashMap = new HashMap();
            hashMap.put("cameraId", Integer.valueOf(AppBrandCameraView.this.f49288i));
            MMSightRecordView mMSightRecordView = AppBrandCameraView.this.f49265E;
            float[] supportZoomMultiple = mMSightRecordView != null ? mMSightRecordView.getSupportZoomMultiple() : null;
            if (supportZoomMultiple != null && supportZoomMultiple.length > 0) {
                AppBrandCameraView.this.f49276Q = supportZoomMultiple[supportZoomMultiple.length - 1];
            }
            hashMap.put("maxZoom", Float.valueOf(AppBrandCameraView.this.f49276Q));
            iVar.f242407f = new JSONObject(hashMap).toString();
            AppBrandCameraView.this.f49284e.mo109669n(iVar, (int[]) null);
            List<Runnable> list = AppBrandCameraView.this.f49281V;
            if (list != null) {
                for (Runnable run : list) {
                    run.run();
                }
                AppBrandCameraView.this.f49281V.clear();
            }
        }
    }
}
