package f22;

import ac2.C39534d;
import ac2.C53996a;
import ac2.C53998c;
import android.database.Cursor;
import c14.C54637q;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.plugin.label.p067ui.searchContact.ContactDataItemList;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72996z1;
import d14.C45252f;
import d14.C58057l;
import di3.C86312j;
import eb0.C97625j3;
import f40.C86709a0;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kv1.C61173o;
import kv1.C99260q;
import lv1.C10656l;
import lv1.C76728k;
import lv1.C99681n;
import nv1.C100219b;

/* renamed from: f22.e */
public final class C58913e extends C53996a<C58909a> implements C61173o {

    /* renamed from: d */
    public String f168586d;

    /* renamed from: e */
    public MMHandler f168587e;

    /* renamed from: f */
    public HashSet<String> f168588f = new HashSet<>();

    /* renamed from: g */
    public ContactDataItemList f168589g;

    /* renamed from: h */
    public C61173o f168590h;

    /* renamed from: i */
    public String f168591i;

    /* renamed from: j */
    public ArrayList<C58909a> f168592j;

    /* renamed from: n */
    public ArrayList<String> f168593n;

    /* renamed from: o */
    public ArrayList<String> f168594o;

    /* renamed from: p */
    public ArrayList<String> f168595p;

    public C58913e(String str, MMHandler mMHandler) {
        C87412m.m108594g(str, SearchIntents.EXTRA_QUERY);
        C87412m.m108594g(mMHandler, "handler");
        this.f168586d = str;
        this.f168587e = mMHandler;
        Object e = C86709a0.m107535s().mo121142i().mo119684e(2, (Object) null);
        C87412m.m108592e(e, "null cannot be cast to non-null type kotlin.String");
        this.f168591i = Util.nullAs((String) e, "");
        this.f168592j = new ArrayList<>();
        this.f168593n = new ArrayList<>();
        this.f168594o = new ArrayList<>();
        this.f168595p = new ArrayList<>();
    }

    /* renamed from: H0 */
    public void mo293H0(C10656l lVar) {
        Log.m105924i("MicroMsg.Mvvm.ContactDataSource", "ftsResult = " + lVar);
        if (lVar != null) {
            this.f168592j.clear();
            ArrayList arrayList = new ArrayList();
            ArrayList<C58909a> arrayList2 = new ArrayList<>();
            this.f168594o.clear();
            this.f168593n.clear();
            this.f168595p.clear();
            List<C99681n> list = lVar.f32076e;
            if (list != null && list.size() == 0) {
                ContactDataItemList contactDataItemList = this.f168589g;
                if (contactDataItemList != null) {
                    contactDataItemList.mo129613q(this.f168592j);
                }
                ContactDataItemList contactDataItemList2 = this.f168589g;
                if (contactDataItemList2 != null) {
                    contactDataItemList2.f19778x = arrayList;
                }
                ContactDataItemList contactDataItemList3 = this.f168589g;
                if (contactDataItemList3 != null) {
                    contactDataItemList3.f19779y = arrayList2;
                }
                C61173o oVar = this.f168590h;
                if (oVar != null) {
                    oVar.mo293H0(lVar);
                    return;
                }
                return;
            }
            ArrayList arrayList3 = new ArrayList();
            HashMap hashMap = new HashMap();
            ArrayList arrayList4 = new ArrayList();
            int i = 0;
            for (C99681n next : lVar.f32076e) {
                arrayList3.add(next.f292151e);
                arrayList4.add(next.f292151e);
                hashMap.put(next.f292151e, next);
                if (arrayList3.size() > 300) {
                    i = mo84109f(arrayList3, arrayList, lVar, i, arrayList2, hashMap);
                }
            }
            if (arrayList3.size() > 0) {
                mo84109f(arrayList3, arrayList, lVar, i, arrayList2, hashMap);
            }
            this.f168593n.addAll(arrayList4);
            Iterator<String> it = this.f168593n.iterator();
            while (it.hasNext()) {
                String next2 = it.next();
                if (!this.f168594o.contains(next2)) {
                    this.f168595p.add(C97625j3.m125812b().mo105907v().get(next2).mo62909j3());
                    if (this.f168595p.size() >= 2) {
                        break;
                    }
                }
            }
            ContactDataItemList contactDataItemList4 = this.f168589g;
            if (contactDataItemList4 != null) {
                contactDataItemList4.f19778x = arrayList;
            }
            ContactDataItemList contactDataItemList5 = this.f168589g;
            if (contactDataItemList5 != null) {
                contactDataItemList5.f19779y = arrayList2;
            }
            C61173o oVar2 = this.f168590h;
            if (oVar2 != null) {
                oVar2.mo293H0(lVar);
            }
        }
    }

    /* renamed from: b */
    public C45252f<C39534d<C58909a>> mo70650e(LifecycleScope lifecycleScope, C53998c<C58909a> cVar) {
        C87412m.m108594g(lifecycleScope, "scope");
        C87412m.m108594g(cVar, "request");
        C39534d dVar = new C39534d(cVar);
        C54637q qVar = new C54637q();
        int i = cVar.f151264a;
        int i2 = cVar.f151265b;
        if (i < this.f168592j.size()) {
            int i3 = i2 + i;
            if (this.f168592j.size() > i3) {
                dVar.f106150a = true;
            } else {
                i3 = this.f168592j.size();
            }
            while (i < i3) {
                dVar.f106151b.add(this.f168592j.get(i));
                i++;
            }
        }
        qVar.mo75539t(dVar);
        return new C58057l(qVar);
    }

    /* renamed from: c */
    public final void mo84108c(String str) {
        C87412m.m108594g(str, SearchIntents.EXTRA_QUERY);
        if (!Util.isNullOrNil(str)) {
            HashSet<String> hashSet = this.f168588f;
            if (hashSet != null) {
                hashSet.add(this.f168591i);
            }
            C76728k kVar = new C76728k();
            kVar.f224468c = str;
            kVar.f224472g = new int[]{131072, 131081};
            kVar.f224477l = C100219b.f293645d;
            kVar.f224475j = this.f168588f;
            kVar.f224478m = this;
            kVar.f224479n = this.f168587e;
            kVar.f224467b = 16;
            ((C99260q) C86312j.m106911c(C99260q.class)).Xn0(2, kVar);
        }
    }

    /* renamed from: d */
    public int mo70649d() {
        return 1;
    }

    /* renamed from: f */
    public final int mo84109f(ArrayList<String> arrayList, List<String> list, C10656l lVar, int i, ArrayList<C58909a> arrayList2, HashMap<String, C99681n> hashMap) {
        List<String> list2;
        ArrayList arrayList3 = new ArrayList();
        C44668u3 v = C97625j3.m125812b().mo105907v();
        Object[] array = arrayList.toArray(new String[0]);
        C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        Cursor Y3 = v.mo69679Y3((String[]) array, "@all.contact.android", (String) null, new ArrayList());
        if (Y3 != null && Y3.getCount() > 0) {
            while (Y3.moveToNext()) {
                boolean z = true;
                Log.m105919d("MicroMsg.Mvvm.ContactDataSource", "create contact item position=%d | index=%d", Integer.valueOf(i), Integer.valueOf(i));
                C72996z1 z1Var = new C72996z1();
                z1Var.convertFrom(Y3);
                C58909a aVar = new C58909a(i);
                aVar.f168570n = z1Var;
                aVar.f168565f = hashMap.get(z1Var.getUsername());
                aVar.f168571o = this.f168586d;
                aVar.f168572p = lVar != null ? lVar.f32075d : null;
                C72996z1 z1Var2 = aVar.f168570n;
                if (z1Var2 != null) {
                    arrayList3.add(z1Var2);
                }
                this.f168592j.add(aVar);
                ContactDataItemList contactDataItemList = this.f168589g;
                if (contactDataItemList == null || (list2 = contactDataItemList.f19778x) == null || !list2.contains(z1Var.getUsername())) {
                    z = false;
                }
                if (z) {
                    String username = z1Var.getUsername();
                    C87412m.m108593f(username, "contact.username");
                    list.add(username);
                    arrayList2.add(aVar);
                }
                i++;
                this.f168594o.add(z1Var.getUsername());
            }
            Y3.close();
        }
        ContactDataItemList contactDataItemList2 = this.f168589g;
        if (contactDataItemList2 != null) {
            contactDataItemList2.mo129613q(this.f168592j);
        }
        arrayList.clear();
        return i;
    }

    public void onCreate() {
        this.f168592j.clear();
        mo84108c(this.f168586d);
    }
}
