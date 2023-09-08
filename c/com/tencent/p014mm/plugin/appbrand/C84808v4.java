package com.tencent.p014mm.plugin.appbrand;

import com.tencent.luggage.sdk.config.AppBrandSysConfigLU;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import java.util.ArrayList;
import java.util.List;
import wi0.C90977d0;
import wi0.C90989n;

/* renamed from: com.tencent.mm.plugin.appbrand.v4 */
public class C84808v4 {

    /* renamed from: com.tencent.mm.plugin.appbrand.v4$a */
    public interface C84809a<T> {
    }

    /* renamed from: a */
    public static <T extends AppBrandSysConfigLU> T m104487a(C84809a<T> aVar, WxaAttributes wxaAttributes) {
        ((C90977d0) aVar).getClass();
        T appBrandSysConfigWC = new AppBrandSysConfigWC();
        appBrandSysConfigWC.f261061d = wxaAttributes.field_nickname;
        appBrandSysConfigWC.f261063f = wxaAttributes.field_smallHeadURL;
        appBrandSysConfigWC.f261062e = wxaAttributes.field_appId;
        appBrandSysConfigWC.f261064g = wxaAttributes.mo113941n2().f239507a.f239515c;
        appBrandSysConfigWC.f234860E = wxaAttributes.mo113941n2().f239507a.f239516d;
        appBrandSysConfigWC.f234863H = wxaAttributes.mo113941n2().f239507a.f239519g;
        appBrandSysConfigWC.f234864I = wxaAttributes.mo113941n2().f239507a.f239520h;
        appBrandSysConfigWC.f234865J = wxaAttributes.mo113941n2().f239507a.f239521i;
        appBrandSysConfigWC.f234866K = wxaAttributes.mo113941n2().f239507a.f239522j;
        appBrandSysConfigWC.f234867L = wxaAttributes.mo113941n2().f239507a.f239523k;
        appBrandSysConfigWC.f234862G = wxaAttributes.mo113941n2().f239507a.f239518f;
        appBrandSysConfigWC.f234861F = wxaAttributes.mo113941n2().f239507a.f239517e;
        appBrandSysConfigWC.f234870P = (long) wxaAttributes.mo113941n2().f239507a.f239524l;
        appBrandSysConfigWC.f234868M = (long) wxaAttributes.mo113941n2().f239507a.f239525m;
        appBrandSysConfigWC.f234869N = (long) wxaAttributes.mo113941n2().f239507a.f239526n;
        appBrandSysConfigWC.f234871Q = wxaAttributes.mo113941n2().f239507a.f239527o;
        appBrandSysConfigWC.f234875S = wxaAttributes.mo113941n2().f239507a.f239511C.length;
        appBrandSysConfigWC.f234873R = wxaAttributes.mo113941n2().f239507a.f239511C;
        ArrayList<String> arrayList = new ArrayList<>();
        List<String> list = wxaAttributes.mo113940m2().f239490f;
        if (list != null) {
            arrayList.addAll(list);
        }
        appBrandSysConfigWC.f234877T = arrayList;
        ArrayList<String> arrayList2 = new ArrayList<>();
        List<String> list2 = wxaAttributes.mo113940m2().f239491g;
        if (list2 != null) {
            arrayList2.addAll(list2);
        }
        appBrandSysConfigWC.f234879U = arrayList2;
        ArrayList<String> arrayList3 = new ArrayList<>();
        List<String> list3 = wxaAttributes.mo113940m2().f239493i;
        if (list3 != null) {
            arrayList3.addAll(list3);
        }
        appBrandSysConfigWC.f234883W = arrayList3;
        ArrayList<String> arrayList4 = new ArrayList<>();
        List<String> list4 = wxaAttributes.mo113940m2().f239492h;
        if (list4 != null) {
            arrayList4.addAll(list4);
        }
        appBrandSysConfigWC.f234881V = arrayList4;
        ArrayList<String> arrayList5 = new ArrayList<>();
        List<String> list5 = wxaAttributes.mo113940m2().f239494j;
        if (list5 != null) {
            arrayList5.addAll(list5);
        }
        appBrandSysConfigWC.f234884X = arrayList5;
        ArrayList<String> arrayList6 = new ArrayList<>();
        List<String> list6 = wxaAttributes.mo113940m2().f239495k;
        if (list6 != null) {
            arrayList6.addAll(list6);
        }
        appBrandSysConfigWC.f234885Y = arrayList6;
        appBrandSysConfigWC.f234880U0 = wxaAttributes.mo113940m2().f239485a;
        appBrandSysConfigWC.f261070p = wxaAttributes.mo113941n2().f239507a.f239528p;
        appBrandSysConfigWC.f261071q = wxaAttributes.mo113941n2().f239507a.f239529q;
        appBrandSysConfigWC.f234886Z = wxaAttributes.mo113941n2().f239507a.f239530r;
        boolean z = false;
        appBrandSysConfigWC.f234878T0 = new String[]{wxaAttributes.field_roundedSquareIconURL, wxaAttributes.field_brandIconURL, wxaAttributes.field_bigHeadURL};
        appBrandSysConfigWC.f234891x0 = wxaAttributes.mo113941n2().f239507a.f239513a;
        appBrandSysConfigWC.f234893y0 = wxaAttributes.mo113941n2().f239507a.f239514b;
        appBrandSysConfigWC.f234872Q0 = wxaAttributes.mo113941n2().f239507a.f239512D;
        String str = appBrandSysConfigWC.f261062e;
        MultiProcessMMKV multiProcessMMKV = C90989n.f261076a;
        if (multiProcessMMKV.getBoolean(str + "_AppDebugEnabled", false) || multiProcessMMKV.getBoolean("ENABLE_ALL_APP_DEBUG", false)) {
            z = true;
        }
        appBrandSysConfigWC.f234889w = z;
        return appBrandSysConfigWC;
    }
}
