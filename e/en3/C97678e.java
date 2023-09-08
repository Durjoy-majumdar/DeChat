package en3;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import gy3.C8477a0;
import gy3.C8479f0;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import kotlin.Result;
import kotlin.ResultKt;
import rx3.C13598b0;
import sx3.C36907w;

/* renamed from: en3.e */
public final class C97678e extends C97674b {

    /* renamed from: b */
    public final /* synthetic */ C8479f0<Runnable> f286494b;

    /* renamed from: c */
    public final /* synthetic */ MMHandler f286495c;

    /* renamed from: d */
    public final /* synthetic */ List<int[]> f286496d;

    /* renamed from: e */
    public final /* synthetic */ C8477a0 f286497e;

    /* renamed from: f */
    public final /* synthetic */ C97680h f286498f;

    /* renamed from: g */
    public final /* synthetic */ RecyclerView f286499g;

    /* renamed from: en3.e$a */
    public static final class C97679a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ List f286500d;

        /* renamed from: e */
        public final /* synthetic */ C97678e f286501e;

        /* renamed from: f */
        public final /* synthetic */ C8477a0 f286502f;

        /* renamed from: g */
        public final /* synthetic */ C97680h f286503g;

        /* renamed from: h */
        public final /* synthetic */ RecyclerView.C16613e f286504h;

        /* renamed from: i */
        public final /* synthetic */ RecyclerView f286505i;

        public C97679a(List list, C97678e eVar, C8477a0 a0Var, C97680h hVar, RecyclerView.C16613e eVar2, RecyclerView recyclerView) {
            this.f286500d = list;
            this.f286501e = eVar;
            this.f286502f = a0Var;
            this.f286503g = hVar;
            this.f286504h = eVar2;
            this.f286505i = recyclerView;
        }

        public final void run() {
            Object obj;
            long currentTimeMillis = System.currentTimeMillis();
            try {
                Result.Companion companion = Result.Companion;
                for (int[] iArr : this.f286500d) {
                    if (!this.f286502f.f27482d) {
                        int i = iArr[1];
                        ConcurrentLinkedDeque concurrentLinkedDeque = this.f286503g.f286506c.get(Integer.valueOf(iArr[0]));
                        int size = concurrentLinkedDeque != null ? concurrentLinkedDeque.size() : 0;
                        if (i > 0) {
                            if (size < i) {
                                int i2 = i - size;
                                for (int i3 = 0; i3 < i2; i3++) {
                                    RecyclerView.C16631z createViewHolder = this.f286504h.createViewHolder(this.f286505i, iArr[0]);
                                    C87412m.m108593f(createViewHolder, "adapter.createViewHolder…tPreCreateView, types[0])");
                                    this.f286503g.mo10384d(createViewHolder);
                                }
                            }
                        }
                    } else {
                        return;
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("[supportPreCreateView] cost=");
                sb.append(System.currentTimeMillis() - currentTimeMillis);
                sb.append("ms types=");
                List<int[]> list = this.f286500d;
                ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
                for (int[] iArr2 : list) {
                    arrayList.add(iArr2[0] + " => " + iArr2[1]);
                }
                sb.append(arrayList);
                sb.append(" tag=");
                sb.append(this.f286501e.hashCode());
                Log.m105924i("DynamicViewCacheEx", sb.toString());
                obj = Result.m168114constructorimpl(C13598b0.f38549a);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.m168114constructorimpl(ResultKt.createFailure(th));
            }
            Throwable r1 = Result.m168117exceptionOrNullimpl(obj);
            if (r1 != null) {
                Log.printErrStackTrace("DynamicViewCacheEx", r1, "", new Object[0]);
            }
        }
    }

    public C97678e(C8479f0<Runnable> f0Var, MMHandler mMHandler, List<int[]> list, C8477a0 a0Var, C97680h hVar, RecyclerView recyclerView) {
        this.f286494b = f0Var;
        this.f286495c = mMHandler;
        this.f286496d = list;
        this.f286497e = a0Var;
        this.f286498f = hVar;
        this.f286499g = recyclerView;
    }

    /* renamed from: a */
    public void mo26320a(RecyclerView.C16613e<RecyclerView.C16631z> eVar) {
        C87412m.m108594g(eVar, "adapter");
        C8479f0<Runnable> f0Var = this.f286494b;
        C97679a aVar = new C97679a(this.f286496d, this, this.f286497e, this.f286498f, eVar, this.f286499g);
        f0Var.f27484d = aVar;
        this.f286495c.postAtFrontOfQueue(aVar);
    }
}
