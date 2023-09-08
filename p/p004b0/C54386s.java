package p004b0;

import androidx.compose.foundation.lazy.layout.C54149b;
import androidx.compose.foundation.lazy.layout.C54150c;
import androidx.compose.foundation.lazy.layout.C54151d;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import my3.C61594j;
import p175j0.C108504h;
import p175j0.C24661b2;
import p175j0.C24665d;
import p175j0.C24715p;
import p175j0.C24724t1;
import p175j0.C33487v1;
import rx3.C13598b0;
import sx3.C36903g0;

/* renamed from: b0.s */
public final class C54386s {

    /* renamed from: a */
    public final C54150c<C54379j> f152577a;

    /* renamed from: b */
    public final List<Integer> f152578b;

    /* renamed from: c */
    public C54149b<C54379j> f152579c;

    /* renamed from: d */
    public final Map<Object, Integer> f152580d;

    /* renamed from: b0.s$a */
    public static final class C54387a extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C54386s f152581d;

        /* renamed from: e */
        public final /* synthetic */ C103941f f152582e;

        /* renamed from: f */
        public final /* synthetic */ int f152583f;

        /* renamed from: g */
        public final /* synthetic */ int f152584g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54387a(C54386s sVar, C103941f fVar, int i, int i2) {
            super(2);
            this.f152581d = sVar;
            this.f152582e = fVar;
            this.f152583f = i;
            this.f152584g = i2;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            this.f152581d.mo75152a(this.f152582e, this.f152583f, (C108504h) obj, this.f152584g | 1);
            return C13598b0.f38549a;
        }
    }

    public C54386s(C54150c<C54379j> cVar, List<Integer> list, C61594j jVar) {
        Map<Object, Integer> map;
        C87412m.m108594g(cVar, "list");
        C87412m.m108594g(list, "headerIndexes");
        C87412m.m108594g(jVar, "nearestItemsRange");
        this.f152577a = cVar;
        this.f152578b = list;
        int i = jVar.f175174d;
        if (i >= 0) {
            int min = Math.min(jVar.f175175e, cVar.getTotalSize() - 1);
            if (min < i) {
                map = C36903g0.f97931d;
            } else {
                HashMap hashMap = new HashMap();
                int a = C54151d.m60872a(cVar, i);
                while (i <= min) {
                    C54149b bVar = cVar.mo74967a().get(a);
                    C32226l<Integer, Object> lVar = ((C54379j) bVar.f152076c).f152563a;
                    if (lVar != null) {
                        int i2 = i - bVar.f152074a;
                        if (i2 == bVar.f152075b) {
                            a++;
                        } else {
                            hashMap.put(lVar.invoke(Integer.valueOf(i2)), Integer.valueOf(i));
                            i++;
                        }
                    } else {
                        a++;
                        i = bVar.f152074a + bVar.f152075b;
                    }
                }
                map = hashMap;
            }
            this.f152580d = map;
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: a */
    public final void mo75152a(C103941f fVar, int i, C108504h hVar, int i2) {
        C87412m.m108594g(fVar, "scope");
        C32228q<C24665d<?>, C24661b2, C24724t1, C13598b0> qVar = C24715p.f70494a;
        C108504h z = hVar.mo51623z(1922528915);
        C54149b<C54379j> b = mo75153b(i);
        ((C54379j) b.f152076c).f152565c.mo162I(fVar, Integer.valueOf(i - b.f152074a), z, Integer.valueOf(i2 & 14));
        C33487v1 l = z.mo51596l();
        if (l != null) {
            l.mo51650a(new C54387a(this, fVar, i, i2));
        }
    }

    /* renamed from: b */
    public final C54149b<C54379j> mo75153b(int i) {
        C54149b<C54379j> bVar = this.f152579c;
        if (bVar != null) {
            int i2 = bVar.f152074a;
            boolean z = false;
            if (i < bVar.f152075b + i2 && i2 <= i) {
                z = true;
            }
            if (z) {
                return bVar;
            }
        }
        C54150c<C54379j> cVar = this.f152577a;
        C87412m.m108594g(cVar, "<this>");
        C54149b<C54379j> bVar2 = cVar.mo74967a().get(C54151d.m60872a(cVar, i));
        this.f152579c = bVar2;
        return bVar2;
    }
}
