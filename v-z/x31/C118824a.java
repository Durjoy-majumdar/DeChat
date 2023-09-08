package x31;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.WCWebUpdater;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import k31.C117373a;
import k41.C117389a;
import q31.C118148a;
import u24.C90599h;
import v31.C118642b;

/* renamed from: x31.a */
public class C118824a {
    /* renamed from: a */
    public static Map<String, Object> m167528a(String str, C118642b bVar) {
        Object obj;
        C118148a aVar;
        Map<String, Object> b;
        Object obj2;
        if (bVar == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        C117373a.xx0();
        if (C117373a.wx0() == 0) {
            List<WeakReference<C118148a>> list = bVar.f355013h;
            if (list == null || ((CopyOnWriteArrayList) list).size() <= 0) {
                return null;
            }
            Iterator it = ((CopyOnWriteArrayList) bVar.f355013h).iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference != null) {
                    Object obj3 = weakReference.get();
                    if (obj3 == null || !(obj3 instanceof C118148a)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("[getPageDynamicParams] fail, pageName : ");
                        sb.append(bVar.f355007b);
                        sb.append(", dynamicParamObj : ");
                        String str2 = "null";
                        sb.append(obj3 == null ? str2 : obj3.getClass().getCanonicalName());
                        Log.m105920e("Amoeba.PageDataEntityWrapper", sb.toString());
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("pageName : ");
                        sb4.append(bVar.f355007b);
                        sb4.append(", dynamicParamObj : ");
                        if (obj3 != null) {
                            str2 = obj3.getClass().getCanonicalName();
                        }
                        sb4.append(str2);
                        String sb5 = sb4.toString();
                        if (C117389a.m165527a() && !C90599h.m113511d(sb5)) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN);
                            arrayList.add(sb5);
                            C115669n.INSTANCE.mo160137l(24504, arrayList);
                        }
                        aVar = null;
                    } else {
                        aVar = (C118148a) obj3;
                    }
                    if (!(aVar == null || (b = aVar.mo37b(str)) == null || b.size() <= 0)) {
                        for (String next : b.keySet()) {
                            if (!C90599h.m113511d(next) && (obj2 = b.get(next)) != null) {
                                hashMap.put(next, obj2);
                            }
                        }
                    }
                }
            }
        } else {
            C117373a.xx0();
            if (C117373a.wx0() == 1) {
                List<C118148a> list2 = bVar.f355014i;
                if (list2 == null || ((CopyOnWriteArrayList) list2).size() <= 0) {
                    return null;
                }
                Iterator it4 = ((CopyOnWriteArrayList) bVar.f355014i).iterator();
                while (it4.hasNext()) {
                    Map<String, Object> b2 = ((C118148a) it4.next()).mo37b(str);
                    if (b2 != null && b2.size() > 0) {
                        for (String next2 : b2.keySet()) {
                            if (!C90599h.m113511d(next2) && (obj = b2.get(next2)) != null) {
                                hashMap.put(next2, obj);
                            }
                        }
                    }
                }
            }
        }
        return hashMap;
    }
}
