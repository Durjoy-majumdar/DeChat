package wh1;

import com.tencent.p014mm.sdk.platformtools.Log;
import d50.C7170j;
import gy3.C87412m;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import te3.C64733to;
import te3.C64890zp2;

/* renamed from: wh1.b */
public final class C66115b {

    /* renamed from: a */
    public static final C66115b f190032a = new C66115b();

    /* renamed from: b */
    public static final HashSet<String> f190033b = new HashSet<>();

    /* renamed from: a */
    public final String mo90156a(String str, C64890zp2 zp22) {
        C87412m.m108594g(str, "defaultUrl");
        if (!f190033b.contains(str) || zp22 == null) {
            return str;
        }
        HashMap hashMap = new HashMap();
        LinkedList<C64733to> linkedList = zp22.f186812j;
        if (linkedList != null) {
            for (C64733to toVar : linkedList) {
                Integer valueOf = Integer.valueOf(toVar.f185623f);
                String str2 = toVar.f185622e;
                C87412m.m108593f(str2, "it.url");
                hashMap.put(valueOf, new C7170j(str2, toVar.f185627j, toVar.f185628n));
            }
        }
        Log.m105924i("FinderLivePlayerUtils", "cdn_quality_h265backcfg: " + zp22.f186818r + " cdnUrlMap: " + hashMap);
        C7170j jVar = (C7170j) hashMap.get(Integer.valueOf(zp22.f186818r));
        String str3 = jVar != null ? jVar.f25142a : null;
        return str3 == null ? str : str3;
    }

    /* renamed from: b */
    public final void mo90157b(String str) {
        C87412m.m108594g(str, "url");
        Log.m105924i("FinderLivePlayerUtils", "mark hasH265Error = " + str);
        f190033b.add(str);
    }
}
