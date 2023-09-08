package os1;

import android.util.LongSparseArray;
import bl3.C0327w;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import dp1.C58417y0;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import je1.C46518f;
import o40.C61926c;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C36907w;
import te3.C49173do1;
import te3.C49712hj1;

/* renamed from: os1.q */
public final class C11749q extends C0327w<FinderCommonFeatureService> {

    /* renamed from: e */
    public final C11750a f34399e = new C11750a(1);

    /* renamed from: f */
    public final C11750a f34400f = new C11750a(3);

    /* renamed from: g */
    public final C11750a f34401g = new C11750a(4);

    /* renamed from: h */
    public final C11750a f34402h = new C11750a(10000);

    /* renamed from: os1.q$a */
    public static final class C11750a {

        /* renamed from: a */
        public final int f34403a;

        /* renamed from: b */
        public final LongSparseArray<String> f34404b = new LongSparseArray<>();

        /* renamed from: c */
        public final LongSparseArray<String> f34405c = new LongSparseArray<>();

        /* renamed from: d */
        public final Object f34406d = new Object();

        /* renamed from: os1.q$a$a */
        public static final class C11751a extends C87413o implements C32227p<Long, String, Boolean> {

            /* renamed from: d */
            public final /* synthetic */ C11750a f34407d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C11751a(C11750a aVar) {
                super(2);
                this.f34407d = aVar;
            }

            public Object invoke(Object obj, Object obj2) {
                long longValue = ((Number) obj).longValue();
                C87412m.m108594g((String) obj2, "<anonymous parameter 1>");
                return Boolean.valueOf(this.f34407d.f34404b.indexOfKey(longValue) < 0);
            }
        }

        public C11750a(int i) {
            this.f34403a = i;
        }

        /* renamed from: a */
        public final void mo11615a() {
            Class cls = C58417y0.class;
            LinkedList<C49173do1> linkedList = new LinkedList<>();
            C49712hj1 hj12 = new C49712hj1();
            hj12.f134675i = ((C58417y0) C86312j.m106911c(cls)).mo83328dc(this.f34403a);
            synchronized (this.f34406d) {
                LongSparseArray<T> l = C61926c.m72687l(this.f34405c, new C11751a(this));
                int size = l.size();
                for (int i = 0; i < size; i++) {
                    long keyAt = l.keyAt(i);
                    C49173do1 do12 = new C49173do1();
                    do12.f132446d = keyAt;
                    do12.f132447e = (String) l.valueAt(i);
                    do12.f132448f = this.f34403a;
                    do12.f132449g = ((C58417y0) C86312j.m106911c(cls)).mo83281Cu(do12.f132446d, hj12.f134675i);
                    linkedList.add(do12);
                }
                if (this.f34405c.size() > 0) {
                    this.f34405c.clear();
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
            if (!linkedList.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append("[checkReport] tabType=");
                sb.append(this.f34403a);
                sb.append(", begin to report unread... ");
                ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
                for (C49173do1 do13 : linkedList) {
                    arrayList.add(C61926c.m72691p(do13.f132446d));
                }
                sb.append(arrayList);
                Log.m105924i("Finder.TabStreamUnreadVM", sb.toString());
                new C46518f(linkedList, hj12).mo9225i();
            }
        }

        /* renamed from: b */
        public final C11750a mo11616b(List<? extends C0740i2> list) {
            C87412m.m108594g(list, "readList");
            synchronized (this.f34406d) {
                for (C0740i2 i2Var : list) {
                    if (this.f34404b.indexOfKey(i2Var.getItemId()) < 0) {
                        this.f34404b.append(i2Var.getItemId(), i2Var instanceof BaseFinderFeed ? ((BaseFinderFeed) i2Var).mo3513o().getObjectNonceId() : "");
                    }
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
            return this;
        }

        /* renamed from: c */
        public final boolean mo11617c(long j) {
            return this.f34404b.indexOfKey(j) >= 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11750a) && this.f34403a == ((C11750a) obj).f34403a;
        }

        public int hashCode() {
            return this.f34403a;
        }

        public String toString() {
            return "TabStreamCollector(tabType=" + this.f34403a + ')';
        }
    }

    /* renamed from: c3 */
    public final void mo11612c3(int i, List<? extends C0740i2> list) {
        if (list != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("[collectReadFeeds] commentScene=");
            sb.append(i);
            sb.append(" readList=");
            sb.append(list.size());
            sb.append(" first=");
            C0740i2 i2Var = (C0740i2) C110818d0.m150916N(list);
            sb.append(C61926c.m72691p(i2Var != null ? i2Var.getItemId() : 0));
            Log.m105924i("Finder.TabStreamUnreadVM", sb.toString());
            if (i != 25) {
                if (!(i == 155 || i == 156 || i == 170 || i == 171)) {
                    switch (i) {
                        case 17:
                            break;
                        case 18:
                            C11750a aVar = this.f34399e;
                            aVar.mo11616b(list);
                            aVar.mo11615a();
                            return;
                        case 19:
                            C11750a aVar2 = this.f34401g;
                            aVar2.mo11616b(list);
                            aVar2.mo11615a();
                            return;
                        default:
                            return;
                    }
                }
                C11750a aVar3 = this.f34400f;
                aVar3.mo11616b(list);
                aVar3.mo11615a();
                return;
            }
            this.f34402h.mo11616b(list);
        }
    }

    /* renamed from: d3 */
    public final boolean mo11613d3(long j) {
        return this.f34400f.mo11617c(j) || this.f34399e.mo11617c(j) || this.f34401g.mo11617c(j);
    }

    /* renamed from: e3 */
    public final boolean mo11614e3(int i, long j) {
        if (i == 1) {
            return this.f34399e.mo11617c(j);
        }
        if (i == 10000) {
            return this.f34402h.mo11617c(j);
        }
        if (i == 3) {
            return this.f34400f.mo11617c(j);
        }
        if (i != 4) {
            return true;
        }
        return this.f34401g.mo11617c(j);
    }
}
