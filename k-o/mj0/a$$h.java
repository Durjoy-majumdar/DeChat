package mj0;

import android.util.SparseArray;
import com.tencent.p014mm.plugin.appbrand.C84081q4;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.plugin.appbrand.jsapi.C83033t;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.C82025h;
import com.tencent.p014mm.plugin.appbrand.jsapi.webview.C83113m;
import com.tencent.p014mm.plugin.appbrand.jsapi.webview.C83119r;
import com.tencent.p014mm.plugin.appbrand.jsapi.webview.C83121t;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import p141db.C7257a;
import p141db.C7259c;
import p141db.C86222g;
import p141db.C86223h;
import p518fb.C86784f;
import p518fb.C86795q;
import p518fb.C86797s;
import p968gb.C87172c;
import rj0.C89970a;
import rj0.C89971b;
import rj0.C89973c;
import rj0.C89977d;
import rj0.C89979e;
import rj0.C89980f;
import sj0.C13681h;
import sj0.C90208e;
import sj0.C90210f;
import sj0.C90211g;
import sl0.C90220f;
import tj0.C90507c;
import ul0.C90695c;

public class a$$h implements C32224a<Map<String, C82870p>> {
    public a$$h(C88732a aVar) {
    }

    public Object invoke() {
        String[] strArr = C89977d.f258538a;
        C83033t tVar = new C83033t();
        tVar.mo115291h();
        HashMap hashMap = (HashMap) tVar.f242761c;
        hashMap.putAll(C83033t.m101845f());
        HashSet hashSet = new HashSet();
        hashSet.add(new C86795q());
        hashSet.add(new C86797s());
        hashSet.add(new C86784f());
        hashSet.add(new C7257a());
        hashSet.add(new C7259c());
        hashSet.add(new C89971b());
        SparseArray sparseArray = new SparseArray(1);
        hashSet.add(new C89973c(sparseArray));
        hashSet.add(new C89979e(sparseArray));
        hashSet.add(new C89980f());
        hashSet.add(new C86222g());
        hashSet.add(new C86223h());
        hashSet.add(new C87172c());
        hashSet.add(new C90210f());
        hashSet.add(new C90208e());
        hashSet.add(new C90211g());
        hashSet.add(new C13681h());
        hashSet.add(new C83113m());
        hashSet.add(new C83121t());
        hashSet.add(new C83119r());
        hashSet.add(new C82025h(C84081q4.f245496e));
        hashSet.add(new C89970a());
        hashSet.add(new C90220f(1, C84081q4.f245493b));
        hashSet.add(new C90507c());
        hashSet.add(new C90695c(0, C84081q4.f245494c));
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            C82870p pVar = (C82870p) it.next();
            if (pVar != null && !Util.isNullOrNil(pVar.mo114779e())) {
                hashMap.put(pVar.mo114779e(), pVar);
            }
        }
        for (String remove : C89977d.f258538a) {
            hashMap.remove(remove);
        }
        return hashMap;
    }
}
