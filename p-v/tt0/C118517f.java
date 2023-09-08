package tt0;

import com.tencent.mapsdk.raster.model.LatLng;

/* renamed from: tt0.f */
public class C118517f {
    /* renamed from: a */
    public C118516e mo183239a(LatLng latLng) {
        double sin = Math.sin(Math.toRadians(latLng.getLatitude()));
        return new C118516e(((latLng.getLongitude() / 360.0d) + 0.5d) * 4.007501668557849E7d, (((Math.log((sin + 1.0d) / (1.0d - sin)) * 0.5d) / -6.283185307179586d) + 0.5d) * 4.007501668557849E7d);
    }
}
