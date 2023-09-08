package no0;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.MotionEvent;
import android.view.Surface;
import com.tencent.p014mm.plugin.location_soso.api.SoSoMapView;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tencentmap.mapsdk.map.TencentMapOptions;
import java.util.Map;
import pl0.C118022a;
import pl0.C118116u;

/* renamed from: no0.f */
public class C117632f extends C118022a {

    /* renamed from: j1 */
    public Surface f351884j1;

    /* renamed from: k1 */
    public int f351885k1;

    /* renamed from: l1 */
    public int f351886l1;

    public C117632f(Context context, String str, Map<String, Object> map) {
        super(context, str, map);
    }

    /* renamed from: C0 */
    public TencentMapOptions mo182355C0(Map<String, Object> map) {
        TencentMapOptions C0 = super.mo182355C0(map);
        Surface surface = null;
        if (map != null) {
            Object obj = map.get("surface");
            if (obj instanceof Surface) {
                surface = (Surface) obj;
            }
        }
        this.f351884j1 = surface;
        if (surface == null) {
            Log.m105920e("MicroMsg.SameLayerMapView", "mSurface is null, return");
            this.f351884j1 = new Surface(new SurfaceTexture(0));
        }
        C0.setExtSurface(this.f351884j1);
        this.f351885k1 = C118116u.m166639d(map, "width", 0);
        this.f351886l1 = C118116u.m166639d(map, "height", 0);
        Log.m105925i("MicroMsg.SameLayerMapView", "handler insert, position:[%d, %d]", Integer.valueOf(this.f351885k1), Integer.valueOf(this.f351886l1));
        C0.setExtSurfaceDimension(this.f351885k1, this.f351886l1);
        C0.setMapType(2);
        return C0;
    }

    /* renamed from: b */
    public void mo182356b(int i, int i2) {
        if (this.f351884j1 != null) {
            this.f351885k1 = i;
            this.f351886l1 = i2;
        }
        try {
            this.f352854h.onSizeChanged(i, i2, i, i2);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.SameLayerMapView", "onSizeChanged :%s", e);
            if (BuildInfo.IS_FLAVOR_RED || BuildInfo.DEBUG) {
                throw e;
            }
        }
    }

    /* renamed from: o0 */
    public void mo182357o0(Surface surface) {
        Surface surface2;
        if (surface != null && (surface2 = this.f351884j1) != surface) {
            this.f351884j1 = surface;
            this.f352854h.onSurfaceChanged(surface, this.f351885k1, this.f351886l1);
            if (surface2 != null) {
                surface2.release();
            }
        }
    }

    public void onTouchEvent(MotionEvent motionEvent) {
        SoSoMapView soSoMapView;
        if (this.f351884j1 != null && (soSoMapView = this.f352854h) != null) {
            soSoMapView.dispatchTouchEvent(motionEvent);
        }
    }
}
