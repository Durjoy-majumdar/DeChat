package com.tencent.p014mm.plugin.appbrand.appstorage;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81414g0;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.p014mm.plugin.appbrand.config.C81649e;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C110821n;
import sx3.C110823p;
import wi0.C90980f0;

/* renamed from: com.tencent.mm.plugin.appbrand.appstorage.m0 */
public final class C81420m0 {

    /* renamed from: a */
    public static final Object[] f238952a = {C81414g0.C29326a.NO_SUCH_KEY};

    /* renamed from: a */
    public static final void m99895a(String str, int i, C32226l<? super String, String> lVar, C32227p<? super String, ? super String, C13598b0> pVar) {
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(lVar, "getter");
        C87412m.m108594g(pVar, "setter");
        int[] f = m99900f(str, lVar, pVar);
        if (!C110823p.m151008x(f, i)) {
            JSONArray jSONArray = new JSONArray(C110821n.m150957d(f));
            jSONArray.put(i);
            String d = m99898d(str, "@@@TOTAL@STORAGE@ID@@@");
            String jSONArray2 = jSONArray.toString();
            C87412m.m108593f(jSONArray2, "json.toString()");
            pVar.invoke(d, jSONArray2);
        }
    }

    /* renamed from: b */
    public static final int m99896b(String str, String str2) {
        if (str == null) {
            str = "";
        }
        int length = str.length();
        if (str2 == null) {
            str2 = "";
        }
        return length + str2.length();
    }

    /* renamed from: c */
    public static final boolean m99897c(int i) {
        return i < 0 || i > 3;
    }

    /* renamed from: d */
    public static final String m99898d(String str, String str2) {
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(str2, "key");
        return m99899e(0, str, str2, "++");
    }

    /* renamed from: e */
    public static final String m99899e(int i, String str, String str2, String str3) {
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(str2, "key");
        C87412m.m108594g(str3, "separator");
        StringBuilder sb = new StringBuilder();
        if (i > 0) {
            sb.append(i);
            sb.append(str3);
        }
        sb.append(str);
        sb.append(str3);
        sb.append(str2);
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "sb.toString()");
        return sb4;
    }

    /* renamed from: f */
    public static final int[] m99900f(String str, C32226l<? super String, String> lVar, C32227p<? super String, ? super String, C13598b0> pVar) {
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(lVar, "getter");
        C87412m.m108594g(pVar, "setter");
        String d = m99898d(str, "@@@TOTAL@STORAGE@ID@@@");
        if (Util.isNullOrNil(d)) {
            return new int[]{0};
        }
        String invoke = lVar.invoke(d);
        if (Util.isNullOrNil(invoke)) {
            return new int[]{0};
        }
        JSONArray jSONArray = new JSONArray(invoke);
        if (jSONArray.length() <= 0) {
            return new int[]{0};
        }
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(Integer.valueOf(jSONArray.getInt(i)));
        }
        if (!arrayList.contains(0)) {
            arrayList.add(0);
        }
        return C110818d0.m150952x0(arrayList);
    }

    /* renamed from: g */
    public static final int m99901g(int i, String str) {
        int i2;
        int i3;
        C87412m.m108594g(str, "appId");
        if (C87412m.m108589b("wxGlobal", str)) {
            return AppBrandGlobalSystemConfig.m100099b().f239310n;
        }
        int i4 = 5;
        WxaAttributes wxaAttributes = null;
        int i5 = -1;
        if (i == 0 || i == 2) {
            C81649e.C81651b bVar = C81649e.f239670d;
            bVar.getClass();
            if (TextUtils.isEmpty(str)) {
                i3 = -1;
            } else {
                synchronized (bVar.f239673a) {
                    i3 = bVar.f239673a.get(str.hashCode(), -1);
                }
            }
            if (i2 <= 0) {
                try {
                    wxaAttributes = C90980f0.f261056b.mo125058c(str, "dynamicInfo");
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.AppServiceSettingsResolver", e, "queryWithAppId(%s)", str);
                }
                Object[] objArr = new Object[2];
                objArr[0] = str;
                if (wxaAttributes != null) {
                    i5 = wxaAttributes.mo113941n2().f239507a.f239513a;
                }
                objArr[1] = Integer.valueOf(i5);
                Log.m105925i("MicroMsg.AppServiceSettingsResolver", "readAppFileStorageMaxSizeInBytes, appId = %s, MaxLocalstorageSize = %d", objArr);
                if (wxaAttributes != null) {
                    i4 = wxaAttributes.mo113941n2().f239507a.f239513a;
                }
                C81649e.C81651b bVar2 = C81649e.f239670d;
                bVar2.getClass();
                if (!TextUtils.isEmpty(str)) {
                    synchronized (bVar2.f239673a) {
                        bVar2.f239673a.put(str.hashCode(), i4);
                    }
                }
            }
            return i2 * 1048576;
        }
        C81649e.C81651b bVar3 = C81649e.f239671e;
        bVar3.getClass();
        if (TextUtils.isEmpty(str)) {
            i2 = -1;
        } else {
            synchronized (bVar3.f239673a) {
                i2 = bVar3.f239673a.get(str.hashCode(), -1);
            }
        }
        if (i2 <= 0) {
            try {
                wxaAttributes = C90980f0.f261056b.mo125058c(str, "dynamicInfo");
            } catch (Exception e2) {
                Log.printErrStackTrace("MicroMsg.AppServiceSettingsResolver", e2, "queryWithAppId(%s)", str);
            }
            Object[] objArr2 = new Object[2];
            objArr2[0] = str;
            if (wxaAttributes != null) {
                i5 = wxaAttributes.mo113941n2().f239507a.f239514b;
            }
            objArr2[1] = Integer.valueOf(i5);
            Log.m105925i("MicroMsg.AppServiceSettingsResolver", "readAppOpendataLocalStorageMaxSizeInBytes, appId = %s, MaxLocalstorageSize = %d", objArr2);
            if (wxaAttributes != null) {
                i4 = wxaAttributes.mo113941n2().f239507a.f239514b;
            }
            C81649e.C81651b bVar4 = C81649e.f239671e;
            bVar4.getClass();
            if (!TextUtils.isEmpty(str)) {
                synchronized (bVar4.f239673a) {
                    bVar4.f239673a.put(str.hashCode(), i4);
                }
            }
        }
        return i2 * 1048576;
        i2 = i4;
        return i2 * 1048576;
    }

    /* renamed from: h */
    public static final void m99902h(String str, int i, C32226l<? super String, String> lVar, C32227p<? super String, ? super String, C13598b0> pVar) {
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(lVar, "getter");
        C87412m.m108594g(pVar, "setter");
        List<Integer> b0 = C110823p.m151002b0(m99900f(str, lVar, pVar));
        ((ArrayList) b0).remove(Integer.valueOf(i));
        String d = m99898d(str, "@@@TOTAL@STORAGE@ID@@@");
        String jSONArray = new JSONArray(b0).toString();
        C87412m.m108593f(jSONArray, "JSONArray(list).toString()");
        pVar.invoke(d, jSONArray);
    }
}
