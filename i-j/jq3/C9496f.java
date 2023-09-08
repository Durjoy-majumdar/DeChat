package jq3;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C24564k0;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p573jk.C33586b;
import sx3.C48501y0;
import zp3.C23555k;
import zp3.C23564m;

/* renamed from: jq3.f */
public final class C9496f {

    /* renamed from: jq3.f$a */
    public static final class C9497a extends C23555k.C23558c {

        /* renamed from: a */
        public Set<C9494d<T>> f29670a = new HashSet();

        /* renamed from: b */
        public final /* synthetic */ C9499g<T> f29671b;

        /* renamed from: c */
        public final /* synthetic */ C32226l<View, Boolean> f29672c;

        public C9497a(C9499g<T> gVar, C32226l<? super View, Boolean> lVar) {
            this.f29671b = gVar;
            this.f29672c = lVar;
        }

        /* renamed from: a */
        public boolean mo10181a(RecyclerView.C16631z zVar) {
            C32226l<View, Boolean> lVar = this.f29672c;
            C87412m.m108591d(zVar);
            View view = zVar.f44854d;
            C87412m.m108593f(view, "holder!!.itemView");
            return lVar.invoke(view).booleanValue();
        }

        /* renamed from: b */
        public float mo10182b(View view) {
            C87412m.m108594g(view, "view");
            C9499g<T> gVar = this.f29671b;
            if (gVar != null) {
                return gVar.mo10184a(view);
            }
            return 0.0f;
        }

        /* renamed from: c */
        public long mo10183c(RecyclerView.C16631z zVar) {
            if (this.f29671b == null) {
                return super.mo10183c(zVar);
            }
            C9493c cVar = null;
            C60905o oVar = zVar instanceof C60905o ? (C60905o) zVar : null;
            C9493c cVar2 = oVar != null ? (C9493c) oVar.f173503E : null;
            if (cVar2 instanceof C9493c) {
                cVar = cVar2;
            }
            if (cVar != null) {
                return cVar.getItemId();
            }
            return 0;
        }

        /* renamed from: d */
        public boolean mo777d() {
            return true;
        }

        /* renamed from: e */
        public void mo778e(View view, List<? extends RecyclerView.C16631z> list) {
            C87412m.m108594g(view, "parent");
            C87412m.m108594g(list, "exposedHolders");
            if (list.isEmpty()) {
                Log.m105924i("MicroMsg.ExposeTimeRecordListener", "current exposed exposeHolders is empty");
                C9496f.m9180a(this.f29670a);
                C9499g<T> gVar = this.f29671b;
                if (gVar != null) {
                    gVar.mo752b(this.f29670a);
                }
                this.f29670a.clear();
                return;
            }
            HashSet hashSet = new HashSet();
            ArrayList<C60905o> arrayList = new ArrayList<>();
            for (T next : list) {
                if (next instanceof C60905o) {
                    arrayList.add(next);
                }
            }
            C9499g<T> gVar2 = this.f29671b;
            for (C60905o oVar : arrayList) {
                C9493c cVar = (C9493c) oVar.f173503E;
                if (cVar != null) {
                    C9494d dVar = new C9494d(cVar);
                    if (!this.f29670a.contains(dVar)) {
                        dVar.f29664b = C33586b.m40132a();
                        dVar.f29667e = oVar.mo17363j();
                        dVar.f29668f = oVar.f44854d;
                        this.f29670a.add(dVar);
                        Log.m105924i("MicroMsg.ExposeTimeRecordListener", "add new record: " + dVar);
                        if (gVar2 != null) {
                            gVar2.mo753c(dVar);
                        }
                    }
                    hashSet.add(dVar);
                }
            }
            if (this.f29670a.size() > hashSet.size()) {
                Set<T> f = C48501y0.m53871f(this.f29670a, hashSet);
                Log.m105924i("MicroMsg.ExposeTimeRecordListener", "find diff record: size = " + f.size());
                C9496f.m9180a(f);
                C9499g<T> gVar3 = this.f29671b;
                if (gVar3 != null) {
                    gVar3.mo752b(f);
                }
                Set<C9494d<T>> f2 = C48501y0.m53871f(this.f29670a, f);
                if (!C24564k0.m30745i(f2)) {
                    f2 = null;
                }
                if (f2 != null) {
                    this.f29670a = f2;
                }
            }
        }
    }

    /* renamed from: jq3.f$b */
    public static final class C9498b extends C23555k.C23562d {

        /* renamed from: a */
        public final /* synthetic */ RecyclerView f29673a;

        public C9498b(RecyclerView recyclerView) {
            this.f29673a = recyclerView;
        }

        /* renamed from: a */
        public long mo52a(View view) {
            C87412m.m108594g(view, "view");
            return (long) this.f29673a.hashCode();
        }

        /* renamed from: b */
        public void mo53b(View view, long j, long j2, boolean z) {
            C87412m.m108594g(view, "view");
        }
    }

    /* renamed from: a */
    public static final void m9180a(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C9494d dVar = (C9494d) it.next();
            long a = C33586b.m40132a();
            dVar.f29665c = a;
            dVar.f29666d = a - dVar.f29664b;
            Log.m105924i("MicroMsg.ExposeTimeRecordListener", "updateTimeRecord: " + dVar);
        }
    }

    /* renamed from: b */
    public static final <T extends C9493c> void m9181b(RecyclerView recyclerView, C9499g<T> gVar, C32226l<? super View, Boolean> lVar) {
        C87412m.m108594g(recyclerView, "<this>");
        C87412m.m108594g(lVar, "canStartExpose");
        C23564m.m28137g(recyclerView, new C9497a(gVar, lVar));
        C23564m.m28138h(recyclerView, new C9498b(recyclerView));
    }
}
