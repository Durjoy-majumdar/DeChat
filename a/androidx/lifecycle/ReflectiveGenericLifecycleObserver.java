package androidx.lifecycle;

import androidx.lifecycle.C103754b;
import androidx.lifecycle.C39623j;
import java.util.HashMap;
import java.util.List;

@Deprecated
class ReflectiveGenericLifecycleObserver implements C103764p {

    /* renamed from: d */
    public final Object f306502d;

    /* renamed from: e */
    public final C103754b.C103755a f306503e;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f306502d = obj;
        this.f306503e = C103754b.f306510c.mo145128b(obj.getClass());
    }

    /* renamed from: k4 */
    public void mo104k4(C0125s sVar, C39623j.C39625b bVar) {
        C103754b.C103755a aVar = this.f306503e;
        Object obj = this.f306502d;
        C103754b.C103755a.m138163a((List) ((HashMap) aVar.f306513a).get(bVar), sVar, bVar, obj);
        C103754b.C103755a.m138163a((List) ((HashMap) aVar.f306513a).get(C39623j.C39625b.ON_ANY), sVar, bVar, obj);
    }
}
