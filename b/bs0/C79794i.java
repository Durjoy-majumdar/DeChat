package bs0;

import com.tencent.p014mm.plugin.appbrand.p026ui.privacy.manage.AppBrandPrivacyManagePage;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import rx3.C13598b0;
import rx3.C13604l;
import te3.y75;

/* renamed from: bs0.i */
public final class C79794i extends C87413o implements C32226l<C79799q, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C79798p f233848d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandPrivacyManagePage f233849e;

    /* renamed from: f */
    public final /* synthetic */ C79807t f233850f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C79794i(C79798p pVar, AppBrandPrivacyManagePage appBrandPrivacyManagePage, C79807t tVar) {
        super(1);
        this.f233848d = pVar;
        this.f233849e = appBrandPrivacyManagePage;
        this.f233850f = tVar;
    }

    public Object invoke(Object obj) {
        Object obj2;
        C79799q qVar = (C79799q) obj;
        C87412m.m108594g(qVar, "appAuthScopeInfo");
        C79798p pVar = this.f233848d;
        String str = qVar.f233862a;
        pVar.getClass();
        C87412m.m108594g(str, "username");
        C13604l lVar = pVar.f233861e.get(str);
        C79800r rVar = lVar != null ? (C79800r) lVar.f38555d : null;
        if (rVar != null) {
            AppBrandPrivacyManagePage appBrandPrivacyManagePage = this.f233849e;
            List<String> list = this.f233850f.f233879c;
            AppBrandPrivacyManagePage.C84576a aVar = AppBrandPrivacyManagePage.f246784e;
            appBrandPrivacyManagePage.getClass();
            String str2 = qVar.f233862a;
            List<C79795j> list2 = qVar.f233863b;
            ArrayList arrayList = new ArrayList();
            for (T next : list2) {
                if (list.contains(((C79795j) next).f233851a.f145164d)) {
                    arrayList.add(next);
                }
            }
            C87412m.m108594g(str2, "username");
            if (arrayList.isEmpty()) {
                Log.m105928w("MicroMsg.AppBrandPrivacyManagePage", "merge, not need");
            } else {
                LinkedList linkedList = new LinkedList(rVar.f233865b);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C79795j jVar = (C79795j) it.next();
                    Iterator it4 = linkedList.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it4.next();
                        if (C87412m.m108589b(jVar.f233851a.f145164d, ((y75) obj2).f145164d)) {
                            break;
                        }
                    }
                    y75 y75 = (y75) obj2;
                    if (!jVar.f233852b) {
                        if (y75 != null) {
                            linkedList.remove(y75);
                        }
                    } else if (y75 == null) {
                        y75 y752 = new y75();
                        y75 y753 = jVar.f233851a;
                        y752.f145164d = y753.f145164d;
                        y752.f145165e = y753.f145165e;
                        linkedList.addFirst(y752);
                    }
                }
                rVar = new C79800r(rVar.f233864a, linkedList, rVar.f233866c);
            }
            C79800r K = this.f233849e.mo117261K(rVar);
            C79798p pVar2 = this.f233848d;
            pVar2.getClass();
            String str3 = K.f233864a.field_username;
            C13604l remove = pVar2.f233861e.remove(str3);
            if (remove == null) {
                Log.m105928w("MicroMsg.AppBrandPrivacyManagePage", "onUserAuthorizeScopeChanged, " + str3 + " is not exists");
            } else {
                int intValue = ((Number) remove.f38556e).intValue();
                Log.m105924i("MicroMsg.AppBrandPrivacyManagePage", "onUserAuthorizeScopeChanged, pos: " + intValue);
                pVar2.f233860d.remove(intValue);
                pVar2.f233860d.add(intValue, K);
                HashMap<String, C13604l<C79800r, Integer>> hashMap = pVar2.f233861e;
                C87412m.m108593f(str3, "username");
                hashMap.put(str3, new C13604l(K, Integer.valueOf(intValue)));
                pVar2.notifyItemChanged(intValue);
            }
        }
        return C13598b0.f38549a;
    }
}
