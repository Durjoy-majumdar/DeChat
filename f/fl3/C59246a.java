package fl3;

import ac2.C39534d;
import ac2.C53996a;
import ac2.C53998c;
import bi3.C0289a;
import c14.C54637q;
import com.tencent.p014mm.contact.ContactUpgradeHelper;
import com.tencent.p014mm.plugin.mvvmlist.MvvmList;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.observer.IStorageObserver;
import com.tencent.p014mm.sdk.storage.observer.StorageEventId;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverEvent;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.ISqlColumn;
import com.tencent.p014mm.sdk.storage.sql.ISqlCondition;
import com.tencent.p014mm.sdk.storage.sql.ISqlOrder;
import com.tencent.p014mm.storage.C44665r4;
import com.tencent.p014mm.storage.C44667s4;
import com.tencent.p014mm.storage.C72996z1;
import d14.C45252f;
import d14.C58057l;
import eb0.C97625j3;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import i40.C46166d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p749xh.C53339k1;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C26236u;
import z04.C112550d0;

/* renamed from: fl3.a */
public final class C59246a extends C53996a<C59252d> implements IStorageObserver<C72996z1> {

    /* renamed from: d */
    public final C13601g f169401d = C36568h.m40985a(C59247a.f169404d);

    /* renamed from: e */
    public ArrayList<String> f169402e = new ArrayList<>();

    /* renamed from: f */
    public MvvmList<C59252d> f169403f;

    /* renamed from: fl3.a$a */
    public static final class C59247a extends C87413o implements C32224a<C46166d> {

        /* renamed from: d */
        public static final C59247a f169404d = new C59247a();

        public C59247a() {
            super(0);
        }

        public Object invoke() {
            return new C46166d();
        }
    }

    /* renamed from: b */
    public C45252f<C39534d<C59252d>> mo70650e(LifecycleScope lifecycleScope, C53998c<C59252d> cVar) {
        C87412m.m108594g(lifecycleScope, "scope");
        C87412m.m108594g(cVar, "request");
        C39534d dVar = new C39534d(cVar);
        C54637q qVar = new C54637q();
        int i = cVar.f151264a;
        int i2 = cVar.f151265b;
        if (i < this.f169402e.size()) {
            int i3 = i2 + i;
            if (this.f169402e.size() > i3) {
                dVar.f106150a = true;
            } else {
                i3 = this.f169402e.size();
            }
            ArrayList arrayList = new ArrayList();
            while (i < i3) {
                arrayList.add(this.f169402e.get(i));
                i++;
            }
            for (C72996z1 z1Var : C0289a.f857a.mo338c(arrayList)) {
                if (((int) z1Var.f108320R1) != 0) {
                    dVar.f106151b.add(new C59252d(z1Var, 2, z1Var.mo62845A2()));
                }
            }
        }
        qVar.mo75539t(dVar);
        return new C58057l(qVar);
    }

    /* renamed from: c */
    public boolean mo84394c(C59252d dVar) {
        C87412m.m108594g(dVar, "item");
        if (!dVar.f169416d.mo62927s3() || dVar.f169416d.mo62936v3() || dVar.f169416d.mo62920o3() || dVar.f169416d.mo62916m3()) {
            return false;
        }
        String username = dVar.f169416d.getUsername();
        C87412m.m108593f(username, "item.contact.username");
        return !C112550d0.m153801u(username, "@", false);
    }

    /* renamed from: d */
    public int mo70649d() {
        return 0;
    }

    /* renamed from: f */
    public final void mo84395f(StorageObserverEvent<C72996z1> storageObserverEvent) {
        MvvmList<C59252d> mvvmList;
        MvvmList<C59252d> mvvmList2;
        C72996z1 obj = storageObserverEvent.getObj();
        if (obj != null) {
            C59252d dVar = new C59252d(obj, 2, obj.mo62845A2());
            StorageEventId eventId = storageObserverEvent.getEventId();
            StorageEventId.Companion companion = StorageEventId.Companion;
            if (C87412m.m108589b(eventId, companion.getINSERT())) {
                if (mo84394c(dVar) && (mvvmList2 = this.f169403f) != null) {
                    MvvmList.m119209l(mvvmList2, dVar, false, 2, (Object) null);
                }
            } else if (C87412m.m108589b(eventId, companion.getUPDATE())) {
                if (mo84394c(dVar)) {
                    MvvmList<C59252d> mvvmList3 = this.f169403f;
                    if (mvvmList3 != null) {
                        mvvmList3.mo129615s(dVar, true);
                        return;
                    }
                    return;
                }
                MvvmList<C59252d> mvvmList4 = this.f169403f;
                if (mvvmList4 != null) {
                    mvvmList4.mo129612p(dVar);
                }
            } else if (C87412m.m108589b(eventId, companion.getDELETE()) && (mvvmList = this.f169403f) != null) {
                mvvmList.mo129612p(dVar);
            }
        }
    }

    public void onChanged(Object obj) {
        StorageObserverEvent storageObserverEvent = (StorageObserverEvent) obj;
        C87412m.m108594g(storageObserverEvent, "event");
        if (C87412m.m108589b(storageObserverEvent.getEventId(), StorageEventId.Companion.getBATCH_EVENT())) {
            HashMap objEventMap = storageObserverEvent.getObjEventMap();
            if (objEventMap != null) {
                for (Map.Entry value : objEventMap.entrySet()) {
                    mo84395f((StorageObserverEvent) value.getValue());
                }
                return;
            }
            return;
        }
        mo84395f(storageObserverEvent);
    }

    public void onCreate() {
        this.f169402e.clear();
        ArrayList arrayList = new ArrayList();
        C44665r4 jo = ((C44667s4) C97625j3.m125812b().mo105877C()).mo69821jo("@t.qq.com");
        if (jo != null) {
            arrayList.add(jo.f121095b);
        }
        arrayList.add("blogapp");
        arrayList.add("tmessage");
        arrayList.add("officialaccounts");
        arrayList.add("helper_entry");
        boolean a = ContactUpgradeHelper.f10280h.mo1134a();
        C0289a.C0290a aVar = C0289a.f857a;
        ISqlCondition and = aVar.mo339d().and(a ? C53339k1.f149479m1.inString(C26236u.m33719b("0")) : C53339k1.f149475i1.notLike("'%@%'"));
        Column column = C53339k1.f149475i1;
        for (String add : C53339k1.f149474h1.select((List<? extends ISqlColumn>) C26236u.m33719b(column)).log("MicroMsg.Mvvm.AddressDataSource").where(and.and(column.notInString(arrayList)).mo81855or(column.equal("weixin"))).orderBy((List<? extends ISqlOrder>) aVar.mo340e()).build().multiString(((C46166d) ((C36570n) this.f169401d).getValue()).getDB())) {
            this.f169402e.add(add);
        }
        Log.m105924i("MicroMsg.Mvvm.AddressDataSource", "onCreate blockList=" + arrayList + " contactListSize=" + this.f169402e.size());
    }
}
