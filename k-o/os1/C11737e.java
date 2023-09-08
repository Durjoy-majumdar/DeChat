package os1;

import bl3.C0327w;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedList;
import te3.C49161dl1;
import te3.C49712hj1;
import z04.C112551y;

/* renamed from: os1.e */
public final class C11737e extends C0327w<FinderCommonFeatureService> {

    /* renamed from: e */
    public final LinkedList<C49161dl1> f34349e = new LinkedList<>();

    /* renamed from: os1.e$a */
    public static final class C11738a {

        /* renamed from: a */
        public int f34350a;

        /* renamed from: b */
        public int f34351b;

        /* renamed from: c */
        public int f34352c;

        /* renamed from: d */
        public int f34353d;

        /* renamed from: e */
        public int f34354e;

        /* renamed from: f */
        public int f34355f;

        /* renamed from: g */
        public int f34356g;

        /* renamed from: h */
        public int f34357h;
    }

    /* renamed from: c3 */
    public final C11738a mo11599c3(C49712hj1 hj12) {
        C49161dl1 dl12;
        boolean z;
        boolean z2;
        boolean z3;
        C87412m.m108594g(hj12, "contextObj");
        Log.m105924i("Finder.GuideConfigVM", "[getConfig] contextId=" + hj12.f134671e);
        String str = hj12.f134671e;
        T t = null;
        if (str != null && C112551y.m153819s(str, "34-", false)) {
            Iterator<T> it = this.f34349e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (((C49161dl1) next).f132392d == 1) {
                    z3 = true;
                    continue;
                } else {
                    z3 = false;
                    continue;
                }
                if (z3) {
                    t = next;
                    break;
                }
            }
            dl12 = (C49161dl1) t;
        } else {
            String str2 = hj12.f134671e;
            if (str2 != null && C112551y.m153819s(str2, "29-", false)) {
                Iterator<T> it4 = this.f34349e.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    T next2 = it4.next();
                    if (((C49161dl1) next2).f132392d == 2) {
                        z2 = true;
                        continue;
                    } else {
                        z2 = false;
                        continue;
                    }
                    if (z2) {
                        t = next2;
                        break;
                    }
                }
                dl12 = (C49161dl1) t;
            } else {
                Iterator<T> it5 = this.f34349e.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    T next3 = it5.next();
                    if (((C49161dl1) next3).f132392d == 3) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        t = next3;
                        break;
                    }
                }
                dl12 = (C49161dl1) t;
            }
        }
        C11738a aVar = new C11738a();
        if (dl12 != null) {
            aVar.f34350a = dl12.f132392d;
            aVar.f34351b = dl12.f132393e;
            aVar.f34352c = dl12.f132396h;
            aVar.f34353d = dl12.f132397i;
            aVar.f34354e = dl12.f132394f;
            aVar.f34355f = dl12.f132398j;
            aVar.f34356g = dl12.f132395g;
            aVar.f34357h = dl12.f132399n;
        }
        return aVar;
    }
}
