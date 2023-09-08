package com.tencent.p014mm.plugin.magicbrush;

import android.content.Context;
import com.tencent.p014mm.appbrand.commonjni.AppBrandJsBridgeBinding;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82366d;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83139a;
import com.tencent.p014mm.plugin.magicbrush.p074fs.C30190c;
import com.tencent.p014mm.plugin.magicbrush.p074fs.C85262e;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import d42.C31064a0;
import d42.C86179f;
import d42.C86186n;
import di3.C86301e;
import e42.C7594e;
import e42.C86430i;
import ei3.C86522b;
import f42.C86757e;
import gy3.C87412m;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import p52.C35370b;
import q52.C62582g;
import q52.C89468h;
import q52.C89479t;

@C86522b
/* renamed from: com.tencent.mm.plugin.magicbrush.v0 */
public final class C30237v0 extends C86301e implements C30172a0 {
    public <T extends C7594e> C86430i<T> Cu0(C82268c<?> cVar, String str) {
        C87412m.m108594g(cVar, "jsapi");
        C87412m.m108594g(str, "appId");
        if (BuildInfo.DEBUG) {
            boolean z = cVar instanceof C82366d;
        }
        return new C89479t(cVar, str);
    }

    /* renamed from: Eo */
    public C81415h0 mo57189Eo(String str, String str2, C81415h0 h0Var) {
        C87412m.m108594g(str, "instanceName");
        return C30190c.f81604a.mo57216a(str, str2, h0Var);
    }

    public C31064a0 H20(String str, String str2, C81415h0 h0Var, List<String> list) {
        C31064a0 a0Var;
        C87412m.m108594g(str, "instanceName");
        C87412m.m108594g(list, "bizNameList");
        C30190c cVar = C30190c.f81604a;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        C87412m.m108593f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        HashMap<String, C31064a0> hashMap = C30190c.f81606c;
        if (hashMap.containsKey(lowerCase)) {
            a0Var = hashMap.get(lowerCase);
            if (a0Var == null) {
                synchronized (cVar) {
                    hashMap.remove(lowerCase);
                }
                a0Var = new C85262e(lowerCase, str2, h0Var, list);
                synchronized (cVar) {
                    hashMap.put(lowerCase, a0Var);
                }
            } else {
                a0Var.mo57959ks(lowerCase, str2, h0Var);
            }
        } else {
            a0Var = new C85262e(lowerCase, str2, h0Var, list);
            synchronized (cVar) {
                hashMap.put(lowerCase, a0Var);
            }
        }
        return a0Var;
    }

    public C86179f Uk0(Object[] objArr) {
        C87412m.m108594g(objArr, "params");
        Context context = objArr[0];
        C87412m.m108592e(context, "null cannot be cast to non-null type android.content.Context");
        String str = objArr[1];
        C87412m.m108592e(str, "null cannot be cast to non-null type kotlin.String");
        C83139a aVar = objArr[2];
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsruntime.AbstractMultiContextJsEngine");
        AppBrandJsBridgeBinding appBrandJsBridgeBinding = objArr[3];
        C87412m.m108592e(appBrandJsBridgeBinding, "null cannot be cast to non-null type com.tencent.mm.appbrand.commonjni.AppBrandJsBridgeBinding");
        C86186n nVar = objArr[4];
        C87412m.m108592e(nVar, "null cannot be cast to non-null type com.tencent.mm.plugin.magicbrush.api.IMBPkgManagement");
        HashSet hashSet = objArr[5];
        C87412m.m108592e(hashSet, "null cannot be cast to non-null type java.util.HashSet<kotlin.String>{ kotlin.collections.TypeAliasesKt.HashSet<kotlin.String> }");
        return new MBAppBrandAdaptor(context, str, aVar, appBrandJsBridgeBinding, nVar, hashSet);
    }

    /* renamed from: VF */
    public void mo57192VF(String str, List<String> list) {
        C87412m.m108594g(str, "bizName");
        C87412m.m108594g(list, "bizNameList");
        C35370b bVar = C35370b.f94703a;
        C35370b.f94705c.put(str, list);
    }

    /* renamed from: fo */
    public C81415h0 mo57193fo(C86757e eVar) {
        C87412m.m108594g(eVar, "record");
        return new C85279p0(eVar);
    }

    /* renamed from: rr */
    public void mo57194rr(String str) {
        C31064a0 a0Var;
        C87412m.m108594g(str, "instanceName");
        C30190c cVar = C30190c.f81604a;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        C87412m.m108593f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        HashMap<String, C31064a0> hashMap = C30190c.f81605b;
        if (hashMap.containsKey(lowerCase)) {
            C31064a0 a0Var2 = hashMap.get(lowerCase);
            if (a0Var2 != null) {
                a0Var2.mo57958Ud(lowerCase);
                return;
            }
            return;
        }
        HashMap<String, C31064a0> hashMap2 = C30190c.f81606c;
        if (hashMap2.containsKey(lowerCase) && (a0Var = hashMap2.get(lowerCase)) != null) {
            a0Var.mo57958Ud(lowerCase);
        }
    }

    /* renamed from: t7 */
    public C62582g mo57195t7(Context context) {
        C87412m.m108594g(context, "context");
        return new C89468h(context);
    }
}
