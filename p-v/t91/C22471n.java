package t91;

import android.util.Pair;
import gy3.C87412m;
import j20.C21153d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import t91.C36981l;

/* renamed from: t91.n */
public final class C22471n {

    /* renamed from: a */
    public final C36981l f63638a;

    /* renamed from: b */
    public final HashMap<String, List<Pair<String, String>>> f63639b;

    /* renamed from: c */
    public final C22472a f63640c = new C22472a(this);

    /* renamed from: t91.n$a */
    public static final class C22472a implements C21153d {

        /* renamed from: a */
        public final /* synthetic */ C22471n f63641a;

        public C22472a(C22471n nVar) {
            this.f63641a = nVar;
        }

        /* renamed from: a */
        public void mo32409a(String str, String str2, String str3, Object obj, Object obj2) {
        }

        /* renamed from: b */
        public void mo32410b(String str, String str2, String str3, Object obj, Object[] objArr) {
            if (C87412m.m108589b("onLoadEnd", str2) && C87412m.m108589b("(Lcom/tencent/mm/plugin/finder/feed/model/FinderTopicFeedLoader$TopicResponse;)V", str3) && objArr != null) {
                C22471n nVar = this.f63641a;
                boolean z = true;
                if (!(objArr.length == 0)) {
                    C36981l.C36982a a = nVar.f63638a.mo60923a(objArr);
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

    public C22471n(C36981l lVar) {
        C87412m.m108594g(lVar, "mParent");
        this.f63638a = lVar;
        HashMap<String, List<Pair<String, String>>> hashMap = new HashMap<>();
        this.f63639b = hashMap;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Pair.create("onLoadEnd", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderTopicFeedLoader$TopicResponse;)V"));
        hashMap.put("com/tencent/mm/plugin/finder/feed/model/FinderTopicFeedLoader$FeedLoadCallback", arrayList);
    }
}
