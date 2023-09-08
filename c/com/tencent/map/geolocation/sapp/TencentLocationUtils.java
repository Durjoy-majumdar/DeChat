package com.tencent.map.geolocation.sapp;

import android.content.Context;
import com.tencent.map.geolocation.sapp.internal.TencentExtraKeys;
import p429c.p790t.p791m.sapp.p792c.C113233r;

public class TencentLocationUtils {
    public TencentLocationUtils() {
        throw new UnsupportedOperationException();
    }

    public static boolean contains(TencentLocation tencentLocation, double d, TencentLocation tencentLocation2) {
        if (tencentLocation != null && tencentLocation2 != null) {
            return distanceBetween(tencentLocation, tencentLocation2) <= d;
        }
        throw null;
    }

    public static double distanceBetween(TencentLocation tencentLocation, TencentLocation tencentLocation2) {
        if (tencentLocation != null && tencentLocation2 != null) {
            return C113233r.m154988a(tencentLocation.getLatitude(), tencentLocation.getLongitude(), tencentLocation2.getLatitude(), tencentLocation2.getLongitude());
        }
        throw null;
    }

    public static boolean isFromGps(TencentLocation tencentLocation) {
        if (tencentLocation == null) {
            return false;
        }
        return "gps".equals(tencentLocation.getProvider());
    }

    public static boolean isFromNetwork(TencentLocation tencentLocation) {
        if (tencentLocation == null) {
            return false;
        }
        return "network".equals(tencentLocation.getProvider());
    }

    public static boolean isSupportGps(Context context) {
        context.getClass();
        return (C113233r.m155024f(context) & 16) == 0;
    }

    public static boolean wgs84ToGcj02(double[] dArr, double[] dArr2) {
        if (!(dArr == null || dArr2 == null)) {
            try {
                if (dArr.length == 2 && dArr2.length == 2) {
                    return TencentExtraKeys.wgs84ToGcj02(dArr, dArr2);
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static double distanceBetween(double d, double d2, double d3, double d4) {
        return C113233r.m154988a(d, d2, d3, d4);
    }
}
