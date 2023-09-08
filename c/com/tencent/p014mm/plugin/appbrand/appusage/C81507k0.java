package com.tencent.p014mm.plugin.appbrand.appusage;

import android.os.Bundle;
import com.tencent.p014mm.plugin.appbrand.config.C81652f;
import com.tencent.p014mm.plugin.appbrand.config.C81662k;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import te3.e55;

/* renamed from: com.tencent.mm.plugin.appbrand.appusage.k0 */
public enum C81507k0 {
    ;

    /* renamed from: a */
    public static void m99998a(int i, Bundle bundle, LinkedList<e55> linkedList, C81662k.C81674j jVar) {
        HashSet hashSet = new HashSet();
        Iterator<e55> it = linkedList.iterator();
        while (it.hasNext()) {
            e55 next = it.next();
            if (!Util.isNullOrNil(next.f132708d)) {
                hashSet.add(next.f132708d);
            }
        }
        ArrayList arrayList = new ArrayList(hashSet.size());
        arrayList.addAll(hashSet);
        C81662k.m100184c(arrayList, i == 3 ? C81652f.C81653a.RECENTS_LIST : C81652f.C81653a.DEFAULT, jVar);
    }
}
