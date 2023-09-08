package tf1;

import androidx.recyclerview.widget.C54248l;
import androidx.recyclerview.widget.C54258u;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import fy3.C32226l;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import rx3.C13598b0;
import tf1.C13914m;
import up1.C37521f;

/* renamed from: tf1.e */
public abstract class C13897e<T extends C13914m> {
    private final boolean DEBUG = ((Boolean) C37521f.f99307V1.mo60266n()).booleanValue();

    /* renamed from: tf1.e$a */
    public final class C13898a extends C54248l.C54250b {

        /* renamed from: a */
        public final List<T> f39064a;

        /* renamed from: b */
        public final List<T> f39065b;

        /* renamed from: c */
        public final /* synthetic */ C13897e<T> f39066c;

        public C13898a(C13897e eVar, List<? extends T> list, List<? extends T> list2) {
            C87412m.m108594g(list, "oldList");
            C87412m.m108594g(list2, "newList");
            this.f39066c = eVar;
            this.f39064a = list;
            this.f39065b = list2;
        }

        /* renamed from: a */
        public boolean mo11465a(int i, int i2) {
            return this.f39066c.areContentsTheSame((C13914m) this.f39064a.get(i), (C13914m) this.f39065b.get(i2));
        }

        /* renamed from: b */
        public boolean mo11466b(int i, int i2) {
            return this.f39066c.areItemsTheSame((C13914m) this.f39064a.get(i), (C13914m) this.f39065b.get(i2));
        }

        /* renamed from: c */
        public Object mo11467c(int i, int i2) {
            return this.f39066c.getChangePayload((C13914m) this.f39064a.get(i), (C13914m) this.f39065b.get(i2));
        }

        /* renamed from: d */
        public int mo11468d() {
            return this.f39065b.size();
        }

        /* renamed from: e */
        public int mo11469e() {
            return this.f39064a.size();
        }
    }

    public C13897e() {
        C37521f.f99374d.getClass();
    }

    public static /* synthetic */ int findMergeIndex$default(C13897e eVar, ArrayList arrayList, List list, int i, Object obj, int i2, Object obj2) {
        if (obj2 == null) {
            if ((i2 & 8) != 0) {
                obj = null;
            }
            return eVar.findMergeIndex(arrayList, list, i, obj);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findMergeIndex");
    }

    public static /* synthetic */ C13921q mergeDataAndNotify$default(C13897e eVar, int i, List list, boolean z, Object obj, int i2, Object obj2) {
        if (obj2 == null) {
            if ((i2 & 8) != 0) {
                obj = null;
            }
            return eVar.mergeDataAndNotify(i, list, z, obj);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: mergeDataAndNotify");
    }

    public static /* synthetic */ void mergeInit$default(C13897e eVar, IResponse iResponse, C32226l lVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                lVar = null;
            }
            eVar.mergeInit(iResponse, lVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: mergeInit");
    }

    public static /* synthetic */ void mergeInsert$default(C13897e eVar, IResponse iResponse, C32226l lVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                lVar = null;
            }
            eVar.mergeInsert(iResponse, lVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: mergeInsert");
    }

    public static /* synthetic */ void mergeInsertSpecifiedLocation$default(C13897e eVar, IResponse iResponse, C13920p pVar, C32226l lVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                lVar = null;
            }
            eVar.mergeInsertSpecifiedLocation(iResponse, pVar, lVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: mergeInsertSpecifiedLocation");
    }

    public static /* synthetic */ void mergeLoadMore$default(C13897e eVar, IResponse iResponse, C32226l lVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                lVar = null;
            }
            eVar.mergeLoadMore(iResponse, lVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: mergeLoadMore");
    }

    public static /* synthetic */ void mergeRefresh$default(C13897e eVar, IResponse iResponse, C32226l lVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                lVar = null;
            }
            eVar.mergeRefresh(iResponse, lVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: mergeRefresh");
    }

    public boolean areContentsTheSame(T t, T t2) {
        C87412m.m108594g(t, "item1");
        C87412m.m108594g(t2, "item2");
        return true;
    }

    public boolean areItemsTheSame(T t, T t2) {
        C87412m.m108594g(t, "item1");
        C87412m.m108594g(t2, "item2");
        return t.mo76f(t2) == 0;
    }

    public final void diff(List<? extends T> list, List<? extends T> list2) {
        C87412m.m108594g(list, "oldList");
        C87412m.m108594g(list2, "newList");
        C54248l.m60949a(getDiffCallback(list, list2), true).mo75045a(getListUpdateCallback());
    }

    public boolean diffDetectMoves() {
        return false;
    }

    public boolean finallyHandleMergeList(ArrayList<T> arrayList, LinkedList<T> linkedList, int i, int i2, Object obj) {
        C87412m.m108594g(arrayList, "srcList");
        C87412m.m108594g(linkedList, "newList");
        return false;
    }

    public int findMergeIndex(ArrayList<T> arrayList, List<? extends T> list, int i, Object obj) {
        C87412m.m108594g(arrayList, "srcList");
        C87412m.m108594g(list, "newList");
        return 0;
    }

    public Object getChangePayload(T t, T t2) {
        C87412m.m108594g(t, "item1");
        C87412m.m108594g(t2, "item2");
        return null;
    }

    public final boolean getDEBUG() {
        return this.DEBUG;
    }

    public C54248l.C54250b getDiffCallback(List<? extends T> list, List<? extends T> list2) {
        C87412m.m108594g(list, "oldList");
        C87412m.m108594g(list2, "newList");
        return new C13898a(this, list, list2);
    }

    public abstract C54258u getListUpdateCallback();

    public abstract C13921q mergeDataAndNotify(int i, List<? extends T> list, boolean z, Object obj);

    public abstract void mergeInit(IResponse<T> iResponse, C32226l<? super IResponse<T>, C13598b0> lVar);

    public abstract void mergeInsert(IResponse<T> iResponse, C32226l<? super IResponse<T>, C13598b0> lVar);

    public abstract void mergeInsertSpecifiedLocation(IResponse<T> iResponse, C13920p pVar, C32226l<? super IResponse<T>, C13598b0> lVar);

    public abstract void mergeLoadMore(IResponse<T> iResponse, C32226l<? super IResponse<T>, C13598b0> lVar);

    public abstract void mergeRefresh(IResponse<T> iResponse, C32226l<? super IResponse<T>, C13598b0> lVar);

    public boolean needCleanWhenRefresh(List<? extends T> list) {
        C87412m.m108594g(list, "newList");
        return true;
    }
}
