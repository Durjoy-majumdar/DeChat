package t91;

import android.util.Pair;
import gy3.C87412m;
import j20.C21153d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import t91.C36981l;

/* renamed from: t91.i */
public final class C22464i {

    /* renamed from: a */
    public final C36981l f63617a;

    /* renamed from: b */
    public final HashMap<String, List<Pair<String, String>>> f63618b;

    /* renamed from: c */
    public final C22465a f63619c = new C22465a(this);

    /* renamed from: t91.i$a */
    public static final class C22465a implements C21153d {

        /* renamed from: a */
        public final /* synthetic */ C22464i f63620a;

        public C22465a(C22464i iVar) {
            this.f63620a = iVar;
        }

        /* renamed from: a */
        public void mo32409a(String str, String str2, String str3, Object obj, Object obj2) {
        }

        /* renamed from: b */
        public void mo32410b(String str, String str2, String str3, Object obj, Object[] objArr) {
            if (C87412m.m108589b(str2, "onFetchDone") && C87412m.m108589b(str3, "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V") && objArr != null) {
                C22464i iVar = this.f63620a;
                boolean z = true;
                if (!(objArr.length == 0)) {
                    C36981l.C36982a a = iVar.f63617a.mo60923a(objArr);
                    if (a == null || a.f98073c != 2) {
                        z = false;
                    }
                    if (!z) {
                        C22466j.f63621a.mo35606d(str, a);
                    } else {
                        C22466j.f63621a.mo35605c(str, a);
                    }
                }
            }
        }
    }

    public C22464i(C36981l lVar) {
        C87412m.m108594g(lVar, "mRLCallback");
        this.f63617a = lVar;
        HashMap<String, List<Pair<String, String>>> hashMap = new HashMap<>();
        this.f63618b = hashMap;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Pair.create("onFetchDone", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V"));
        hashMap.put("com/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader", arrayList);
    }
}
