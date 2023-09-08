package com.tencent.mapsdk.internal;

import android.graphics.PointF;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Pair;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.map.tools.IndexCallback;
import com.tencent.map.tools.Util;
import com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/* renamed from: com.tencent.mapsdk.internal.kw */
public final class C113904kw {
    /* renamed from: a */
    public static double m157741a(double d) {
        double d2 = d % 360.0d;
        return d2 > 180.0d ? d2 - 360.0d : d2 < -180.0d ? d2 + 360.0d : d2;
    }

    /* renamed from: a */
    public static double m157742a(double d, double d2, double d3, double d4, double d5, double d6) {
        return ((((d2 - d4) * d5) + ((d3 - d) * d6)) + (d * d4)) - (d3 * d2);
    }

    /* renamed from: a */
    private static double m157743a(double d, int i) {
        try {
            return new BigDecimal(d).setScale(i, 4).doubleValue();
        } catch (Exception unused) {
            return d;
        }
    }

    /* renamed from: b */
    private static double m157762b(double d) {
        return (d * 3.141592653589793d) / 180.0d;
    }

    /* renamed from: b */
    private static double[] m157765b(LatLng latLng, LatLng latLng2, LatLng latLng3) {
        double d;
        double[] a = m157761a(latLng2, latLng3);
        double d2 = Double.NaN;
        if (Double.isNaN(a[0])) {
            d = latLng.latitude;
            d2 = 0.0d;
        } else {
            double d3 = a[0];
            if (d3 == 0.0d) {
                d = Double.NaN;
            } else {
                d2 = -1.0d / d3;
                d = latLng.latitude + ((1.0d / d3) * latLng.longitude);
            }
        }
        return new double[]{d2, d};
    }

    /* renamed from: c */
    private static double m157766c(double d) {
        return (d * 180.0d) / 3.141592653589793d;
    }

    /* renamed from: c */
    private static boolean m157769c(LatLng latLng, LatLng latLng2, LatLng latLng3) {
        return (m157744a((Coordinate) latLng2, (Coordinate) latLng3) - m157744a((Coordinate) latLng, (Coordinate) latLng2)) - m157744a((Coordinate) latLng, (Coordinate) latLng3) < 1.0E-6d;
    }

    /* renamed from: a */
    private static float m157748a(float f, int i) {
        try {
            return new BigDecimal((double) f).setScale(i, 4).floatValue();
        } catch (Exception unused) {
            return f;
        }
    }

    /* renamed from: c */
    private static double m157768c(Coordinate coordinate, Coordinate coordinate2, Coordinate coordinate3) {
        return Math.atan((m157744a(coordinate, coordinate2) / 2.0d) / m157746a(coordinate3, coordinate, coordinate2)) * 2.0d;
    }

    /* renamed from: a */
    private static PointF m157750a(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        float f = pointF2.x;
        float f2 = pointF.x;
        if (f != f2) {
            float f3 = pointF4.x;
            float f4 = pointF3.x;
            if (f3 != f4) {
                float f5 = pointF2.y;
                float f6 = pointF.y;
                float f7 = (f5 - f6) / (f - f2);
                float f8 = pointF4.y;
                float f9 = pointF3.y;
                float f15 = (f8 - f9) / (f3 - f4);
                if (f7 == f15) {
                    return null;
                }
                float f16 = ((f9 * f3) - (f8 * f4)) / (f3 - f4);
                float f17 = (f16 - (((f6 * f) - (f5 * f2)) / (f - f2))) / (f7 - f15);
                return new PointF(f17, (f15 * f17) + f16);
            }
        }
        return null;
    }

    /* renamed from: b */
    private static double m157763b(Coordinate coordinate, Coordinate coordinate2) {
        return (coordinate.mo172090y() - coordinate2.mo172090y()) / (coordinate.mo172089x() - coordinate2.mo172089x());
    }

    /* renamed from: b */
    public static double m157764b(Coordinate coordinate, Coordinate coordinate2, Coordinate coordinate3) {
        return Math.atan((m157744a(coordinate, coordinate2) / 2.0d) / m157746a(coordinate3, coordinate, coordinate2)) * 2.0d * m157744a(coordinate, coordinate3);
    }

    /* renamed from: c */
    private static double m157767c(Coordinate coordinate, Coordinate coordinate2) {
        return (Math.atan((coordinate.mo172090y() - coordinate2.mo172090y()) / (coordinate.mo172089x() - coordinate2.mo172089x())) * 180.0d) / 3.141592653589793d;
    }

    /* renamed from: a */
    private static Rect m157751a(GeoPoint geoPoint, Rect rect) {
        int max = Math.max(Math.abs(rect.left - geoPoint.getLongitudeE6()), Math.abs(rect.right - geoPoint.getLongitudeE6()));
        int max2 = Math.max(Math.abs(rect.top - geoPoint.getLatitudeE6()), Math.abs(rect.bottom - geoPoint.getLatitudeE6()));
        return new Rect(geoPoint.getLongitudeE6() - max2, geoPoint.getLatitudeE6() - max, geoPoint.getLongitudeE6() + max2, geoPoint.getLatitudeE6() + max);
    }

    /* renamed from: a */
    private static Rect m157752a(GeoPoint geoPoint, GeoPoint geoPoint2) {
        if (geoPoint == null || geoPoint2 == null || geoPoint.equals(geoPoint2)) {
            return null;
        }
        int abs = Math.abs(geoPoint.getLongitudeE6() - geoPoint2.getLongitudeE6());
        int abs2 = Math.abs(geoPoint.getLatitudeE6() - geoPoint2.getLatitudeE6());
        return new Rect(geoPoint.getLongitudeE6() - abs, geoPoint.getLatitudeE6() - abs2, geoPoint.getLongitudeE6() + abs, geoPoint.getLatitudeE6() + abs2);
    }

    /* renamed from: a */
    private static GeoPoint m157753a(GeoPoint geoPoint, GeoPoint geoPoint2, GeoPoint geoPoint3) {
        int latitudeE6 = geoPoint2.getLatitudeE6() - geoPoint.getLatitudeE6();
        int longitudeE6 = geoPoint2.getLongitudeE6() - geoPoint.getLongitudeE6();
        if (latitudeE6 == 0 && longitudeE6 == 0) {
            return null;
        }
        double latitudeE62 = ((double) (((geoPoint3.getLatitudeE6() - geoPoint.getLatitudeE6()) * latitudeE6) + ((geoPoint3.getLongitudeE6() - geoPoint.getLongitudeE6()) * longitudeE6))) / ((double) ((latitudeE6 * latitudeE6) + (longitudeE6 * longitudeE6)));
        if (latitudeE62 < 0.0d) {
            return new GeoPoint(geoPoint);
        }
        if (latitudeE62 > 1.0d) {
            return new GeoPoint(geoPoint2);
        }
        return new GeoPoint(geoPoint.getLatitudeE6() + ((int) (((double) latitudeE6) * latitudeE62)), geoPoint.getLongitudeE6() + ((int) (((double) longitudeE6) * latitudeE62)));
    }

    /* renamed from: a */
    private static double[] m157761a(LatLng latLng, LatLng latLng2) {
        double d;
        double d2 = Double.NaN;
        if (Math.abs(latLng.longitude - latLng2.longitude) < 1.0E-6d) {
            d = Double.NaN;
        } else if (Math.abs(latLng.latitude - latLng2.latitude) < 1.0E-6d) {
            d2 = 0.0d;
            d = latLng.latitude;
        } else {
            double d3 = latLng2.latitude;
            double d4 = latLng.latitude;
            double d5 = latLng2.longitude;
            double d6 = latLng.longitude;
            double d7 = (d3 - d4) / (d5 - d6);
            d = ((d5 * d4) - (d6 * d3)) / (d5 - d4);
            d2 = d7;
        }
        return new double[]{d2, d};
    }

    /* renamed from: a */
    public static double m157746a(Coordinate coordinate, Coordinate coordinate2, Coordinate coordinate3) {
        double a = m157744a(coordinate, coordinate2);
        double a2 = m157744a(coordinate, coordinate3);
        double a3 = m157744a(coordinate2, coordinate3);
        double d = a + a2;
        if (d == a3) {
            return 0.0d;
        }
        if (a3 <= 1.0E-6d) {
            return a;
        }
        double d2 = a2 * a2;
        double d3 = a * a;
        double d4 = a3 * a3;
        if (d2 >= d3 + d4) {
            return a;
        }
        if (d3 >= d2 + d4) {
            return a2;
        }
        double d5 = (d + a3) / 2.0d;
        return (Math.sqrt((((d5 - a) * d5) * (d5 - a2)) * (d5 - a3)) * 2.0d) / a3;
    }

    /* renamed from: a */
    public static LatLng m157755a(LatLng latLng, LatLng latLng2, LatLng latLng3) {
        double d;
        double d2;
        double[] a = m157761a(latLng2, latLng3);
        if (Double.isNaN(a[0])) {
            d = latLng2.longitude;
            d2 = latLng.latitude;
        } else {
            double d3 = a[0];
            if (d3 == 0.0d) {
                d = latLng.longitude;
                d2 = latLng2.latitude;
            } else {
                double d4 = d3 * d3;
                double d5 = latLng2.longitude;
                double d6 = latLng.latitude;
                double d7 = latLng2.latitude;
                double d8 = (((d4 * d5) + ((d6 - d7) * d3)) + latLng.longitude) / (d4 + 1.0d);
                d2 = (d3 * (d8 - d5)) + d7;
                d = d8;
            }
        }
        return new LatLng(d2, d);
    }

    /* renamed from: a */
    public static LatLng m157754a(LatLng latLng, LatLng latLng2, int i) {
        double d = latLng2.longitude;
        double d2 = latLng.longitude;
        double d3 = d > d2 ? d2 - ((double) i) : d2 + ((double) i);
        double d4 = latLng2.latitude;
        double d5 = latLng.latitude;
        return new LatLng(d4 > d5 ? d5 - ((double) i) : d5 + ((double) i), d3);
    }

    /* renamed from: a */
    public static double m157744a(Coordinate coordinate, Coordinate coordinate2) {
        double x = coordinate.mo172089x() - coordinate2.mo172089x();
        double y = coordinate.mo172090y() - coordinate2.mo172090y();
        return Math.sqrt((x * x) + (y * y));
    }

    /* renamed from: a */
    public static boolean m157760a(LatLng latLng, double d, LatLng latLng2, LatLng latLng3) {
        if (m157746a((Coordinate) latLng, (Coordinate) latLng2, (Coordinate) latLng3) - d > 1.0E-6d) {
            return false;
        }
        LatLng a = m157755a(latLng, latLng2, latLng3);
        double a2 = m157744a((Coordinate) a, (Coordinate) latLng2);
        if ((m157744a((Coordinate) latLng2, (Coordinate) latLng3) - a2) - m157744a((Coordinate) a, (Coordinate) latLng3) < 1.0E-6d) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static String m157756a() {
        byte[] bArr = new byte[20];
        new SecureRandom().nextBytes(bArr);
        return new String(bArr);
    }

    /* renamed from: a */
    private static int m157749a(int i) {
        int i2 = i - 0;
        if (i2 > 0) {
            return new SecureRandom().nextInt(i2) + 0;
        }
        return 0;
    }

    /* renamed from: a */
    public static String m157758a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return Util.getMD5String(str.getBytes());
    }

    /* renamed from: a */
    public static String m157757a(File file) {
        int i;
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                MessageDigest instance = MessageDigest.getInstance("SHA-1");
                byte[] bArr = new byte[10485760];
                while (true) {
                    int read = fileInputStream2.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    instance.update(bArr, 0, read);
                }
                String bigInteger = new BigInteger(1, instance.digest()).toString(16);
                int length = 40 - bigInteger.length();
                if (length > 0) {
                    for (i = 0; i < length; i++) {
                        bigInteger = "0".concat(String.valueOf(bigInteger));
                    }
                }
                C113886kg.m157515a((Closeable) fileInputStream2);
                return bigInteger;
            } catch (IOException | NoSuchAlgorithmException unused) {
                fileInputStream = fileInputStream2;
                C113886kg.m157515a((Closeable) fileInputStream);
                return "";
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                C113886kg.m157515a((Closeable) fileInputStream);
                throw th;
            }
        } catch (IOException | NoSuchAlgorithmException unused2) {
            C113886kg.m157515a((Closeable) fileInputStream);
            return "";
        } catch (Throwable th4) {
            th = th4;
            C113886kg.m157515a((Closeable) fileInputStream);
            throw th;
        }
    }

    /* renamed from: a */
    public static double m157747a(Coordinate coordinate, Coordinate coordinate2, Coordinate coordinate3, Coordinate coordinate4) {
        Coordinate coordinate5 = coordinate4;
        double x = (coordinate2.mo172089x() - coordinate.mo172089x()) * 2.0d;
        double y = (coordinate2.mo172090y() - coordinate.mo172090y()) * 2.0d;
        double x2 = (((coordinate2.mo172089x() * coordinate2.mo172089x()) + (coordinate2.mo172090y() * coordinate2.mo172090y())) - (coordinate.mo172089x() * coordinate.mo172089x())) - (coordinate.mo172090y() * coordinate.mo172090y());
        double x3 = (coordinate3.mo172089x() - coordinate2.mo172089x()) * 2.0d;
        double y2 = (coordinate3.mo172090y() - coordinate2.mo172090y()) * 2.0d;
        double x4 = (((coordinate3.mo172089x() * coordinate3.mo172089x()) + (coordinate3.mo172090y() * coordinate3.mo172090y())) - (coordinate2.mo172089x() * coordinate2.mo172089x())) - (coordinate2.mo172090y() * coordinate2.mo172090y());
        double d = (y2 * x) - (y * x3);
        double d2 = ((x2 * y2) - (x4 * y)) / d;
        double d3 = ((x * x4) - (x3 * x2)) / d;
        coordinate5.setX(d2);
        coordinate5.setY(d3);
        return Math.sqrt(Math.pow(coordinate.mo172089x() - d2, 2.0d) + Math.pow(coordinate.mo172090y() - d3, 2.0d));
    }

    /* renamed from: a */
    public static double m157745a(Coordinate coordinate, Coordinate coordinate2, double d, boolean z, Coordinate coordinate3) {
        Coordinate coordinate4 = coordinate3;
        double a = (m157744a(coordinate, coordinate2) * 0.5d) / Math.sin(m157762b(0.5d * d));
        double x = (coordinate.mo172089x() + coordinate2.mo172089x()) / 2.0d;
        double y = (coordinate.mo172090y() + coordinate2.mo172090y()) / 2.0d;
        double sqrt = Math.sqrt((Math.pow(a, 2.0d) / (Math.pow(coordinate.mo172089x() - coordinate2.mo172089x(), 2.0d) + Math.pow(coordinate.mo172090y() - coordinate2.mo172090y(), 2.0d))) - 0.25d);
        double y2 = (coordinate.mo172090y() - coordinate2.mo172090y()) * sqrt;
        double x2 = (coordinate2.mo172089x() - coordinate.mo172089x()) * sqrt;
        if (d - 90.0d <= 1.0E-6d) {
            y2 = -y2;
            x2 = -x2;
        }
        if (Double.isNaN(y2)) {
            y2 = 0.0d;
        }
        if (Double.isNaN(x2)) {
            x2 = 0.0d;
        }
        double d2 = z ? x + y2 : x - y2;
        double d3 = z ? y + x2 : y - x2;
        coordinate4.setX(d2);
        coordinate4.setY(d3);
        return a;
    }

    /* renamed from: a */
    public static <T extends Coordinate> void m157759a(T t, double d, T t2, T t3, boolean z, IndexCallback<Pair<Double, Double>> indexCallback) {
        boolean z2 = z;
        double atan = (Math.atan((t.mo172090y() - t2.mo172090y()) / (t.mo172089x() - t2.mo172089x())) * 180.0d) / 3.141592653589793d;
        boolean z3 = t.mo172089x() > t2.mo172089x() ? !z2 : z2;
        int i = 0;
        double d2 = 0.0d;
        while (i < 360) {
            double d3 = (double) i;
            double tan = Math.tan(m157762b(z2 ? atan - d3 : d3 + atan));
            if (d2 != 0.0d && d2 * tan < 0.0d && Math.abs(tan) > 1.0d) {
                z3 = !z3;
            }
            double sqrt = d / Math.sqrt((tan * tan) + 1.0d);
            double d4 = tan * sqrt;
            C113889km.m157545b(C0949kl.f2236f, i + ":curDeltaK[" + tan + "]deltaKChanged[" + z3 + "]clockwise[" + z2 + "]deltaX[" + sqrt + "]deltaY[" + d4 + "]");
            if (z3) {
                sqrt = -sqrt;
                d4 = -d4;
            }
            double x = t.mo172089x();
            double d5 = z2 ? x - sqrt : x + sqrt;
            double y = t.mo172090y();
            double d6 = z2 ? y - d4 : y + d4;
            double a = m157742a(t2.mo172089x(), t2.mo172090y(), t3.mo172089x(), t3.mo172090y(), d5, d6);
            if (!z2 ? a >= 0.0d : a <= 0.0d) {
                IndexCallback<Pair<Double, Double>> indexCallback2 = indexCallback;
            } else {
                indexCallback.callback(i, new Pair(Double.valueOf(d5), Double.valueOf(d6)));
            }
            i++;
            d2 = tan;
        }
    }
}
