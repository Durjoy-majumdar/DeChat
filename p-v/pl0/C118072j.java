package pl0;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tencentmap.mapsdk.map.TencentMap;

/* renamed from: pl0.j */
public class C118072j implements TencentMap.OnScreenShotListener {

    /* renamed from: a */
    public final /* synthetic */ C118022a f352963a;

    public C118072j(C118022a aVar) {
        this.f352963a = aVar;
    }

    public void onMapScreenShot(Bitmap bitmap) {
        Log.m105926v("MicroMsg.Map.DefaultTencentMapView", "updateScreenCapture end");
        if (bitmap != null) {
            this.f352963a.f352852g.setImageBitmap(bitmap);
        }
        this.f352963a.f352871y0.set(false);
    }
}
