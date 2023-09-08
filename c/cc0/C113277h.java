package cc0;

import com.tencent.map.geolocation.sapp.TencentLocation;
import com.tencent.map.geolocation.sapp.TencentLocationListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: cc0.h */
public abstract class C113277h implements TencentLocationListener {

    /* renamed from: a */
    public final Map<String, Integer> f338930a;

    public C113277h() {
        HashMap hashMap = new HashMap();
        this.f338930a = hashMap;
        hashMap.put("gps", 0);
        hashMap.put("network", 1);
    }

    /* renamed from: a */
    public abstract void mo165819a(boolean z, double d, double d2, int i, double d3, double d4, double d5, String str, String str2, int i2);

    public void onLocationChanged(TencentLocation tencentLocation, int i, String str) {
        if (tencentLocation == null) {
            mo165819a(false, 0.0d, 0.0d, 0, 0.0d, 0.0d, 0.0d, (String) null, (String) null, 0);
            return;
        }
        Log.m105925i("MicroMsg.SLocationListenerWgs84", "lat=%f, lng=%f, accuracy=%f errcode=%d, areastat=%d, speed=%f, bearing=%f, reason=%s, provider=%s", Double.valueOf(tencentLocation.getLatitude()), Double.valueOf(tencentLocation.getLongitude()), Float.valueOf(tencentLocation.getAccuracy()), Integer.valueOf(i), tencentLocation.getAreaStat(), Float.valueOf(tencentLocation.getSpeed()), Float.valueOf(tencentLocation.getBearing()), str, tencentLocation.getProvider());
        if (i == 0) {
            double latitude = tencentLocation.getLatitude();
            double longitude = tencentLocation.getLongitude();
            HashMap hashMap = (HashMap) this.f338930a;
            mo165819a(true, latitude, longitude, ((Integer) hashMap.get(tencentLocation.getProvider())).intValue(), (double) tencentLocation.getSpeed(), (double) tencentLocation.getAccuracy(), tencentLocation.getAltitude(), tencentLocation.getIndoorBuildingId(), tencentLocation.getIndoorBuildingFloor(), tencentLocation.getIndoorLocationType());
            return;
        }
        double latitude2 = tencentLocation.getLatitude();
        double longitude2 = tencentLocation.getLongitude();
        HashMap hashMap2 = (HashMap) this.f338930a;
        mo165819a(false, latitude2, longitude2, ((Integer) hashMap2.get(tencentLocation.getProvider())).intValue(), (double) tencentLocation.getSpeed(), (double) tencentLocation.getAccuracy(), tencentLocation.getAltitude(), tencentLocation.getIndoorBuildingId(), tencentLocation.getIndoorBuildingFloor(), tencentLocation.getIndoorLocationType());
    }

    public void onStatusUpdate(String str, int i, String str2) {
        Log.m105919d("MicroMsg.SLocationListenerWgs84", "onStatusUpdate, name=%s, status=%d, desc=%s", str, Integer.valueOf(i), str2);
    }
}
