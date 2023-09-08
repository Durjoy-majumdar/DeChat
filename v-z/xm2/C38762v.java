package xm2;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import te3.jo4;

/* renamed from: xm2.v */
public final class C38762v {
    /* renamed from: a */
    public static final List<jo4> m41920a(List<? extends jo4> list) {
        C87412m.m108594g(list, "authItems");
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (jo4 jo4 : list) {
            String str = jo4.f136232e;
            if ((str == null || str.length() == 0) || hashSet.contains(jo4.f136232e)) {
                Log.m105928w("MicroMsg.SettingsAuthUtils", "filterAuthScopeList scope_desc exist and ignore: " + jo4.f136231d + ", " + jo4.f136232e);
            } else {
                hashSet.add(jo4.f136232e);
                arrayList.add(jo4);
            }
        }
        Log.m105924i("MicroMsg.SettingsAuthUtils", "filterAuthScopeList final size: " + arrayList.size() + ", origin size: " + list.size());
        return arrayList;
    }
}
