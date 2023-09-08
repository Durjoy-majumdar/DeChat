package com.tencent.mapsdk.internal;

import android.graphics.Point;
import android.location.Location;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mapsdk.internal.ke */
public final class C113883ke {

    /* renamed from: a */
    public static final int f340699a = 256;

    /* renamed from: b */
    public static final int f340700b = 20;

    /* renamed from: c */
    public static final double f340701c = 4.272282972352698E7d;

    /* renamed from: d */
    private static final int f340702d = 20037508;

    /* renamed from: e */
    private static final int f340703e = 30240971;

    /* renamed from: f */
    private static final double f340704f = 111319.49077777778d;

    /* renamed from: g */
    private static final double f340705g = 0.017453292519943295d;

    /* renamed from: h */
    private static final double f340706h = 0.008726646259971648d;

    /* renamed from: i */
    private static final double f340707i = 114.59155902616465d;

    /* renamed from: a */
    private static float m157462a(GeoPoint geoPoint, GeoPoint geoPoint2) {
        if (geoPoint != null && geoPoint2 != null) {
            return (float) m157461a(((double) geoPoint.getLatitudeE6()) / 1000000.0d, ((double) geoPoint.getLongitudeE6()) / 1000000.0d, ((double) geoPoint2.getLatitudeE6()) / 1000000.0d, ((double) geoPoint2.getLongitudeE6()) / 1000000.0d);
        }
        throw new IllegalArgumentException("point is null");
    }

    /* renamed from: a */
    private static int m157463a(double d) {
        return (int) ((d * f340704f) + 2.0037508E7d);
    }

    /* renamed from: a */
    private static int m157464a(int i) {
        return i + f340702d;
    }

    /* renamed from: b */
    private static int m157470b(double d) {
        return (int) (((Math.log(Math.tan((d + 90.0d) * f340706h)) / f340705g) * f340704f) + 3.0240971E7d);
    }

    /* renamed from: b */
    private static int m157471b(int i) {
        return i + f340703e;
    }

    /* renamed from: c */
    private static double m157475c(double d) {
        return (d * 3.141592653589793d) / 180.0d;
    }

    /* renamed from: c */
    private static int m157476c(int i) {
        return i - f340702d;
    }

    /* renamed from: c */
    private static GeoPoint m157478c(int i, int i2) {
        return new GeoPoint((int) (m157483f(i2 + f340703e) * 1000000.0d), (int) (m157482e(i + f340702d) * 1000000.0d));
    }

    /* renamed from: d */
    private static int m157479d(int i) {
        return i - f340703e;
    }

    /* renamed from: d */
    private static Point m157480d(int i, int i2) {
        return new Point(m157463a(((double) i) / 1000000.0d) - f340702d, m157470b(((double) i2) / 1000000.0d) - f340703e);
    }

    /* renamed from: e */
    private static double m157482e(int i) {
        return ((double) (i - f340702d)) / f340704f;
    }

    /* renamed from: f */
    private static double m157483f(int i) {
        return (Math.atan(Math.exp((((double) (i - f340703e)) / f340704f) * f340705g)) * f340707i) - 90.0d;
    }

    /* renamed from: b */
    private static void m157474b(double d, double d2, double d3, double d4, float[] fArr) {
        double d5;
        double d6;
        float[] fArr2 = fArr;
        double d7 = d * f340705g;
        double d8 = d3 * f340705g;
        double d9 = (f340705g * d4) - (d2 * f340705g);
        double atan = Math.atan(Math.tan(d7) * 0.996647189328169d);
        double atan2 = Math.atan(Math.tan(d8) * 0.996647189328169d);
        double cos = Math.cos(atan);
        double cos2 = Math.cos(atan2);
        double sin = Math.sin(atan);
        double sin2 = Math.sin(atan2);
        double d15 = cos * cos2;
        double d16 = sin * sin2;
        double d17 = d9;
        double d18 = 0.0d;
        double d19 = 0.0d;
        double d25 = 0.0d;
        double d26 = 0.0d;
        double d27 = 0.0d;
        int i = 0;
        while (true) {
            if (i >= 20) {
                d5 = sin;
                d6 = sin2;
                break;
            }
            d18 = Math.cos(d17);
            d25 = Math.sin(d17);
            double d28 = cos2 * d25;
            double d29 = (cos * sin2) - ((sin * cos2) * d18);
            d5 = sin;
            double sqrt = Math.sqrt((d28 * d28) + (d29 * d29));
            d6 = sin2;
            double d35 = d16 + (d15 * d18);
            d26 = Math.atan2(sqrt, d35);
            double d36 = sqrt == 0.0d ? 0.0d : (d15 * d25) / sqrt;
            double d37 = 1.0d - (d36 * d36);
            double d38 = d37 == 0.0d ? 0.0d : d35 - ((d16 * 2.0d) / d37);
            double d39 = 0.006739496756586903d * d37;
            double d44 = ((d39 / 16384.0d) * (((((320.0d - (175.0d * d39)) * d39) - 0.005859375d) * d39) + 4096.0d)) + 1.0d;
            double d45 = (d39 / 1024.0d) * ((d39 * (((74.0d - (47.0d * d39)) * d39) - 0.03125d)) + 256.0d);
            double d46 = 2.0955066698943685E-4d * d37 * (((4.0d - (d37 * 3.0d)) * 0.0033528106718309896d) + 4.0d);
            double d47 = d38 * d38;
            d27 = d45 * sqrt * (d38 + ((d45 / 4.0d) * ((((d47 * 2.0d) - 4.0d) * d35) - ((((d45 / 6.0d) * d38) * (((sqrt * 4.0d) * sqrt) - 1.5d)) * ((d47 * 4.0d) - 1.5d)))));
            double d48 = d9 + ((1.0d - d46) * 0.0033528106718309896d * d36 * (d26 + (sqrt * d46 * (d38 + (d46 * d35 * (((2.0d * d38) * d38) - 4.0d))))));
            if (Math.abs((d48 - d17) / d48) < 1.0E-12d) {
                d19 = d44;
                break;
            }
            i++;
            sin = d5;
            sin2 = d6;
            d17 = d48;
            d19 = d44;
        }
        float[] fArr3 = fArr;
        fArr3[0] = (float) (d19 * 6356752.3142d * (d26 - d27));
        if (fArr3.length > 1) {
            double d49 = d6 * cos;
            double d54 = d5;
            fArr3[1] = (float) (((double) ((float) Math.atan2(cos2 * d25, d49 - ((d54 * cos2) * d18)))) * 57.29577951308232d);
            if (fArr3.length > 2) {
                fArr3[2] = (float) (((double) ((float) Math.atan2(cos * d25, ((-d54) * cos2) + (d49 * d18)))) * 57.29577951308232d);
            }
        }
    }

    /* renamed from: c */
    private static Point m157477c(GeoPoint geoPoint) {
        if (geoPoint != null) {
            return new Point(m157463a(((double) geoPoint.getLongitudeE6()) / 1000000.0d) - f340702d, m157470b(((double) geoPoint.getLatitudeE6()) / 1000000.0d) - f340703e);
        }
        throw new IllegalArgumentException("point is null");
    }

    /* renamed from: d */
    private static Point m157481d(GeoPoint geoPoint) {
        if (geoPoint != null) {
            Point point = new Point();
            point.x = (int) ((((((double) geoPoint.getLongitudeE6()) / 1000000.0d) + 180.0d) / 360.0d) * 2.68435456E8d);
            point.y = (int) (((180.0d - (Math.log(Math.tan(((((double) geoPoint.getLatitudeE6()) / 1000000.0d) + 90.0d) * f340706h)) / 0.01745329238474369d)) / 360.0d) * 2.68435456E8d);
            return point;
        }
        throw new IllegalArgumentException("point is null");
    }

    /* renamed from: a */
    private static void m157468a(double d, double d2, double d3, double d4, float[] fArr) {
        Location.distanceBetween(d, d2, d3, d4, fArr);
        fArr[0] = (float) m157461a(d, d2, d3, d4);
    }

    /* renamed from: a */
    private static double m157461a(double d, double d2, double d3, double d4) {
        double c = m157475c(d3 - d);
        double c2 = m157475c(d4 - d2);
        double d5 = c / 2.0d;
        double d6 = c2 / 2.0d;
        double sin = (Math.sin(d5) * Math.sin(d5)) + (Math.sin(d6) * Math.sin(d6) * Math.cos(m157475c(d)) * Math.cos(m157475c(d3)));
        return Math.atan2(Math.sqrt(sin), Math.sqrt(1.0d - sin)) * 2.0d * 6371.0d * 1000.0d;
    }

    /* renamed from: a */
    public static GeoPoint m157465a(int i, int i2) {
        return new GeoPoint((int) (Math.toDegrees((Math.atan(Math.exp(3.141592653589793d - (((double) i2) / 4.272282972352698E7d))) - 0.7853981633974483d) * 2.0d) * 1000000.0d), (int) (Math.toDegrees((((double) i) / 4.272282972352698E7d) - 3.141592653589793d) * 1000000.0d));
    }

    /* renamed from: a */
    public static LatLng m157466a(GeoPoint geoPoint) {
        if (geoPoint == null) {
            return null;
        }
        return new LatLng(((double) geoPoint.getLatitudeE6()) / 1000000.0d, ((double) geoPoint.getLongitudeE6()) / 1000000.0d);
    }

    /* renamed from: b */
    private static GeoPoint m157473b(int i, int i2) {
        return new GeoPoint((int) (m157483f(i2) * 1000000.0d), (int) (m157482e(i) * 1000000.0d));
    }

    /* renamed from: a */
    public static List<LatLng> m157467a(List<GeoPoint> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (GeoPoint a : list) {
            arrayList.add(m157466a(a));
        }
        return arrayList;
    }

    /* renamed from: b */
    private static Point m157472b(GeoPoint geoPoint) {
        if (geoPoint != null) {
            return new Point(m157463a(((double) geoPoint.getLongitudeE6()) / 1000000.0d), m157470b(((double) geoPoint.getLatitudeE6()) / 1000000.0d));
        }
        throw new IllegalArgumentException("point is null");
    }

    /* renamed from: b */
    private static float m157469b(GeoPoint geoPoint, GeoPoint geoPoint2) {
        if (geoPoint == null || geoPoint2 == null) {
            return 0.0f;
        }
        float[] fArr = new float[10];
        double latitudeE6 = ((double) geoPoint.getLatitudeE6()) / 1000000.0d;
        double longitudeE6 = ((double) geoPoint.getLongitudeE6()) / 1000000.0d;
        double latitudeE62 = ((double) geoPoint2.getLatitudeE6()) / 1000000.0d;
        double longitudeE62 = ((double) geoPoint2.getLongitudeE6()) / 1000000.0d;
        Location.distanceBetween(latitudeE6, longitudeE6, latitudeE62, longitudeE62, fArr);
        fArr[0] = (float) m157461a(latitudeE6, longitudeE6, latitudeE62, longitudeE62);
        return fArr[1];
    }
}
