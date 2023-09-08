package t22;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.tencent.p014mm.plugin.location.model.LocationInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: t22.i */
public class C101715i {
    /* renamed from: a */
    public static double[] m133624a(double[] dArr) {
        double[] dArr2 = dArr;
        if (dArr2 == null && dArr2.length != 2) {
            return dArr2;
        }
        double d = dArr2[0];
        double d2 = dArr2[1];
        if (d < 72.004d || d > 137.8347d || d2 < 0.8293d || d2 > 55.8271d) {
            return new double[]{d, d2};
        }
        double d3 = d - 105.0d;
        double d4 = d2 - 35.0d;
        double d5 = d3 * 2.0d;
        double d6 = d3 * 0.1d;
        double d7 = d6 * d4;
        double d8 = 6.0d * d3 * 3.141592653589793d;
        double d9 = d5 * 3.141592653589793d;
        double d15 = d4 * 3.141592653589793d;
        double sqrt = (d5 - 0.044921875d) + (d4 * 3.0d) + (d4 * 0.2d * d4) + d7 + (Math.sqrt(Math.abs(d3)) * 0.2d) + ((((Math.sin(d8) * 20.0d) + (Math.sin(d9) * 20.0d)) * 2.0d) / 3.0d) + ((((Math.sin(d15) * 20.0d) + (Math.sin((d4 / 3.0d) * 3.141592653589793d) * 40.0d)) * 2.0d) / 3.0d) + ((((Math.sin((d4 / 12.0d) * 3.141592653589793d) * 160.0d) + (Math.sin(d15 / 30.0d) * 320.0d)) * 2.0d) / 3.0d);
        double sqrt2 = d3 + 300.0d + (d4 * 2.0d) + (d6 * d3) + d7 + (Math.sqrt(Math.abs(d3)) * 0.1d) + ((((Math.sin(d8) * 20.0d) + (Math.sin(d9) * 20.0d)) * 2.0d) / 3.0d) + ((((Math.sin(d3 * 3.141592653589793d) * 20.0d) + (Math.sin((d3 / 3.0d) * 3.141592653589793d) * 40.0d)) * 2.0d) / 3.0d) + ((((Math.sin((d3 / 12.0d) * 3.141592653589793d) * 150.0d) + (Math.sin((d3 / 30.0d) * 3.141592653589793d) * 300.0d)) * 2.0d) / 3.0d);
        double d16 = (d2 / 180.0d) * 3.141592653589793d;
        double sin = Math.sin(d16);
        double d17 = 1.0d - ((0.006693421622965943d * sin) * sin);
        double sqrt3 = Math.sqrt(d17);
        return new double[]{(d * 2.0d) - (d + ((sqrt2 * 180.0d) / (((6378245.0d / sqrt3) * Math.cos(d16)) * 3.141592653589793d))), (d2 * 2.0d) - (d2 + ((sqrt * 180.0d) / ((6335552.717000426d / (d17 * sqrt3)) * 3.141592653589793d)))};
    }

    /* renamed from: b */
    public static String m133625b(LocationInfo locationInfo) {
        if (locationInfo.f271935j == null) {
            locationInfo.f271935j = "";
        }
        return "<msg><location x=\"" + locationInfo.f271930e + "\" y=\"" + locationInfo.f271931f + "\" scale=\"" + locationInfo.f271932g + "\" label=\"" + Util.escapeStringForXml(locationInfo.f271933h) + "\" poiname=\"" + Util.escapeStringForXml(locationInfo.f271935j) + "\" maptype=\"" + 0 + "\" poiid=\"" + locationInfo.f271938p + "\" isFromPoiList=\"" + locationInfo.f271939q + "\" poiCategoryTips=\"" + Util.nullAsNil(locationInfo.f271940r) + "\" poiBusinessHour=\"" + Util.nullAsNil(locationInfo.f271941s) + "\" poiPhone=\"" + Util.nullAsNil(locationInfo.f271942t) + "\" poiPriceTips=\"" + locationInfo.f271943u + "\" buildingId=\"" + locationInfo.f271944v + "\" floorName=\"" + locationInfo.f271945w + "\" /></msg>";
    }

    /* renamed from: c */
    public static PackageInfo m133626c(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 1);
        } catch (PackageManager.NameNotFoundException e) {
            Log.printErrStackTrace("MicroMsg.MapUtil", e, "", new Object[0]);
            return null;
        } catch (ActivityNotFoundException e2) {
            Log.printErrStackTrace("MicroMsg.MapUtil", e2, "", new Object[0]);
            return null;
        }
    }

    /* renamed from: d */
    public static boolean m133627d(double d, double d2) {
        return Math.abs(d2) <= 180.0d && Math.abs(d) <= 90.0d;
    }
}
