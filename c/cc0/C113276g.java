package cc0;

import com.tencent.map.geolocation.sapp.TencentLocation;
import com.tencent.map.geolocation.sapp.TencentLocationListener;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: cc0.g */
public abstract class C113276g implements TencentLocationListener {

    /* renamed from: a */
    public final Map<String, Integer> f338929a;

    public C113276g() {
        HashMap hashMap = new HashMap();
        this.f338929a = hashMap;
        hashMap.put("gps", 0);
        hashMap.put("network", 1);
    }

    /* renamed from: a */
    public abstract void mo165816a(boolean z, double d, double d2, int i, double d3, double d4, double d5, String str, String str2, int i2);

    public void onLocationChanged(TencentLocation tencentLocation, int i, String str) {
        int i2 = i;
        if (tencentLocation == null) {
            mo165816a(false, 0.0d, 0.0d, 0, 0.0d, 0.0d, 0.0d, (String) null, (String) null, 0);
            return;
        }
        Log.m105925i("MicroMsg.SLocationListener", "lat=%f, lng=%f, accuracy=%f errcode=%d, areastat=%d, speed=%f, bearing=%f, reason=%s, provider=%s", Double.valueOf(tencentLocation.getLatitude()), Double.valueOf(tencentLocation.getLongitude()), Float.valueOf(tencentLocation.getAccuracy()), Integer.valueOf(i), tencentLocation.getAreaStat(), Float.valueOf(tencentLocation.getSpeed()), Float.valueOf(tencentLocation.getBearing()), str, tencentLocation.getProvider());
        if (i2 == 0) {
            C115669n.INSTANCE.idkeyStat(584, 1, 1, true);
            double latitude = tencentLocation.getLatitude();
            double longitude = tencentLocation.getLongitude();
            HashMap hashMap = (HashMap) this.f338929a;
            mo165816a(true, latitude, longitude, ((Integer) hashMap.get(tencentLocation.getProvider())).intValue(), (double) tencentLocation.getSpeed(), (double) tencentLocation.getAccuracy(), tencentLocation.getAltitude(), tencentLocation.getIndoorBuildingId(), tencentLocation.getIndoorBuildingFloor(), tencentLocation.getIndoorLocationType());
            return;
        }
        C115669n nVar = C115669n.INSTANCE;
        nVar.idkeyStat(584, 2, 1, true);
        if (i2 == 1) {
            nVar.idkeyStat(584, 3, 1, true);
        } else if (i2 == 4) {
            nVar.idkeyStat(584, 4, 1, true);
        }
        double latitude2 = tencentLocation.getLatitude();
        double longitude2 = tencentLocation.getLongitude();
        HashMap hashMap2 = (HashMap) this.f338929a;
        mo165816a(false, latitude2, longitude2, ((Integer) hashMap2.get(tencentLocation.getProvider())).intValue(), (double) tencentLocation.getSpeed(), (double) tencentLocation.getAccuracy(), tencentLocation.getAltitude(), tencentLocation.getIndoorBuildingId(), tencentLocation.getIndoorBuildingFloor(), tencentLocation.getIndoorLocationType());
    }
}
