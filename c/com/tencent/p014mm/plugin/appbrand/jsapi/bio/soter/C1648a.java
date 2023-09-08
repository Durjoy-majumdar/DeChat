package com.tencent.p014mm.plugin.appbrand.jsapi.bio.soter;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import org.json.JSONArray;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bio.soter.a */
public class C1648a {
    /* renamed from: a */
    public static int m1700a(String str) {
        if ("fingerPrint".equals(str)) {
            return 1;
        }
        if ("facial".equals(str)) {
            return 8;
        }
        if ("speech".equals(str)) {
            return 2;
        }
        Log.m105920e("MicroMsg.AppBrandSoterTranslateUtil", "hy: invalid item");
        return 0;
    }

    /* renamed from: b */
    public static JSONArray m1701b(int i) {
        if (i <= 0) {
            return new JSONArray();
        }
        ArrayList arrayList = new ArrayList(3);
        if ((i & 1) == 1) {
            arrayList.add("fingerPrint");
        }
        if ((i & 8) == 8) {
            arrayList.add("facial");
        }
        if ((i & 2) == 2) {
            arrayList.add("speech");
        }
        Log.m105925i("MicroMsg.AppBrandSoterTranslateUtil", "hy: final string is: %s", arrayList.toString());
        return new JSONArray(arrayList);
    }
}
