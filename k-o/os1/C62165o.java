package os1;

import bl3.C0327w;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kf1.C9833k9;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.C51449tu2;

/* renamed from: os1.o */
public final class C62165o extends C0327w<FinderCommonFeatureService> {

    /* renamed from: i */
    public static final C62166a f176740i = new C62166a((C8480h) null);

    /* renamed from: e */
    public final ConcurrentHashMap<String, List<FinderObject>> f176741e = new ConcurrentHashMap<>();

    /* renamed from: f */
    public final HashMap<String, Integer> f176742f = new HashMap<>();

    /* renamed from: g */
    public final LinkedList<C51449tu2> f176743g = new LinkedList<>();

    /* renamed from: h */
    public final HashSet<Long> f176744h = new HashSet<>();

    /* renamed from: os1.o$a */
    public static final class C62166a {
        public C62166a(C8480h hVar) {
        }

        /* renamed from: a */
        public final String mo87218a(C9833k9 k9Var) {
            C87412m.m108594g(k9Var, "item");
            StringBuilder sb = new StringBuilder();
            sb.append(k9Var.f30387d.f184840d);
            sb.append('_');
            LinkedList<FinderObject> linkedList = k9Var.f30387d.f184844h;
            C87412m.m108593f(linkedList, "item.card.`object`");
            FinderObject finderObject = (FinderObject) C110818d0.m150916N(linkedList);
            Long l = null;
            sb.append(finderObject != null ? Long.valueOf(finderObject.f164794id) : null);
            sb.append('_');
            LinkedList<FinderObject> linkedList2 = k9Var.f30387d.f184844h;
            C87412m.m108593f(linkedList2, "item.card.`object`");
            FinderObject finderObject2 = (FinderObject) C110818d0.m150925W(linkedList2);
            if (finderObject2 != null) {
                l = Long.valueOf(finderObject2.f164794id);
            }
            sb.append(l);
            return sb.toString();
        }
    }

    /* renamed from: c3 */
    public final void mo87217c3(boolean z) {
        Log.m105924i("Finder.StreamCardVM", "clearAlbumReadFeeds... size=" + this.f176743g.size());
        synchronized (this.f176743g) {
            this.f176743g.clear();
            if (z) {
                this.f176744h.clear();
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }
}
