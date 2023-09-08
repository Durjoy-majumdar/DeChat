package ac2;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import c14.C54637q;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Log;
import d14.C45252f;
import d14.C45253g;
import d14.C58057l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import kotlin.ResultKt;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C64175a0;
import sx3.C77813z;
import ux3.C65486b;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import zb2.C103001d;

/* renamed from: ac2.i */
public final class C54004i<T extends C103001d<T>> extends C53996a<T> {

    /* renamed from: d */
    public final C54000f<T, C53998c<T>, C39534d<T>>[] f151271d;

    /* renamed from: e */
    public final ArrayList<C54000f<T, C53998c<T>, C39534d<T>>> f151272e;

    /* renamed from: f */
    public int f151273f;

    /* renamed from: g */
    public final HashMap<Integer, Integer> f151274g;

    @C91590f(mo125468c = "com.tencent.mm.plugin.mvvmlist.datasource.MergeDataSource$getSingleData$1$1", mo125469f = "MergeDataSource.kt", mo125470l = {52}, mo125471m = "invokeSuspend")
    /* renamed from: ac2.i$a */
    public static final class C54005a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f151275d;

        /* renamed from: e */
        public final /* synthetic */ C54000f<T, C53998c<T>, C39534d<T>> f151276e;

        /* renamed from: f */
        public final /* synthetic */ LifecycleScope f151277f;

        /* renamed from: g */
        public final /* synthetic */ C53998c<T> f151278g;

        /* renamed from: h */
        public final /* synthetic */ C39534d<T> f151279h;

        /* renamed from: i */
        public final /* synthetic */ C54004i<T> f151280i;

        /* renamed from: j */
        public final /* synthetic */ C54637q<C39534d<T>> f151281j;

        /* renamed from: ac2.i$a$a */
        public static final class C54006a<T> implements C45253g {

            /* renamed from: d */
            public final /* synthetic */ C39534d<T> f151282d;

            /* renamed from: e */
            public final /* synthetic */ C54004i<T> f151283e;

            /* renamed from: f */
            public final /* synthetic */ C53998c<T> f151284f;

            /* renamed from: g */
            public final /* synthetic */ C54637q<C39534d<T>> f151285g;

            /* renamed from: h */
            public final /* synthetic */ LifecycleScope f151286h;

            public C54006a(C39534d<T> dVar, C54004i<T> iVar, C53998c<T> cVar, C54637q<C39534d<T>> qVar, LifecycleScope lifecycleScope) {
                this.f151282d = dVar;
                this.f151283e = iVar;
                this.f151284f = cVar;
                this.f151285g = qVar;
                this.f151286h = lifecycleScope;
            }

            public Object emit(Object obj, C15601d dVar) {
                C39534d dVar2 = (C39534d) obj;
                this.f151282d.f106151b.addAll(dVar2.f106151b);
                C39534d<T> dVar3 = this.f151282d;
                dVar3.f106150a = true;
                if (!dVar2.f106150a) {
                    C54004i<T> iVar = this.f151283e;
                    int i = iVar.f151273f + 1;
                    iVar.f151273f = i;
                    if (!iVar.f151274g.containsKey(new Integer(i))) {
                        C54004i<T> iVar2 = this.f151283e;
                        iVar2.f151274g.put(new Integer(iVar2.f151273f), new Integer(this.f151284f.f151264a + dVar2.f106151b.size()));
                    }
                    if (this.f151282d.f106151b.size() >= this.f151284f.f151265b) {
                        this.f151285g.mo75539t(this.f151282d);
                    } else {
                        Log.m105924i("MicroMsg.Mvvm.MergeDataSource", "continue to request next datasource:" + this.f151283e.f151273f);
                        this.f151283e.mo74669c(this.f151286h, new C53998c(0, this.f151284f.f151265b - this.f151282d.f106151b.size(), (Object) null, 4, (C8480h) null), this.f151282d, this.f151285g);
                    }
                } else {
                    this.f151285g.mo75539t(dVar3);
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54005a(C54000f<T, C53998c<T>, C39534d<T>> fVar, LifecycleScope lifecycleScope, C53998c<T> cVar, C39534d<T> dVar, C54004i<T> iVar, C54637q<C39534d<T>> qVar, C15601d<? super C54005a> dVar2) {
            super(2, dVar2);
            this.f151276e = fVar;
            this.f151277f = lifecycleScope;
            this.f151278g = cVar;
            this.f151279h = dVar;
            this.f151280i = iVar;
            this.f151281j = qVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C54005a(this.f151276e, this.f151277f, this.f151278g, this.f151279h, this.f151280i, this.f151281j, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C54005a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f151275d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C45252f<C39534d<T>> e = this.f151276e.mo70650e(this.f151277f, this.f151278g);
                C54006a aVar2 = new C54006a(this.f151279h, this.f151280i, this.f151278g, this.f151281j, this.f151277f);
                this.f151275d = 1;
                if (e.mo31880a(aVar2, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ac2.i$b */
    public static final class C54007b<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C65486b.m77169a(Integer.valueOf(((C54000f) t2).mo70649d()), Integer.valueOf(((C54000f) t).mo70649d()));
        }
    }

    public C54004i(C54000f<T, C53998c<T>, C39534d<T>>... fVarArr) {
        C87412m.m108594g(fVarArr, "dataSource");
        this.f151271d = fVarArr;
        ArrayList<C54000f<T, C53998c<T>, C39534d<T>>> arrayList = new ArrayList<>();
        this.f151272e = arrayList;
        C64175a0.m75509q(arrayList, fVarArr);
        if (arrayList.size() > 1) {
            C77813z.m93909o(arrayList, new C54007b());
        }
        this.f151274g = new HashMap<>();
    }

    /* renamed from: b */
    public C45252f<C39534d<T>> mo70650e(LifecycleScope lifecycleScope, C53998c<T> cVar) {
        C87412m.m108594g(lifecycleScope, "scope");
        C87412m.m108594g(cVar, "request");
        Log.m105924i("MicroMsg.Mvvm.MergeDataSource", "getData request:" + cVar.f151264a + " dataSourceIndex:" + this.f151273f + " dataSourceSize:" + this.f151272e.size());
        C54637q qVar = new C54637q();
        int i = cVar.f151264a;
        HashMap<Integer, Integer> hashMap = this.f151274g;
        Integer valueOf = Integer.valueOf(this.f151273f);
        int i2 = hashMap.get(valueOf);
        if (i2 == null) {
            i2 = 0;
            hashMap.put(valueOf, 0);
        }
        mo74669c(lifecycleScope, new C53998c(i - i2.intValue(), cVar.f151265b, (Object) null, 4, (C8480h) null), new C39534d(cVar), qVar);
        return new C58057l(qVar);
    }

    /* renamed from: c */
    public final void mo74669c(LifecycleScope lifecycleScope, C53998c<T> cVar, C39534d<T> dVar, C54637q<C39534d<T>> qVar) {
        C54000f fVar = (C54000f) C110818d0.m150917O(this.f151272e, this.f151273f);
        if (fVar != null) {
            LifecycleScope lifecycleScope2 = lifecycleScope;
            C53895h.m60466d(lifecycleScope2, (C66212f) null, (C53934p0) null, new C54005a(fVar, lifecycleScope2, cVar, dVar, this, qVar, (C15601d<? super C54005a>) null), 3, (Object) null);
            return;
        }
        qVar.mo75539t(dVar);
    }

    public void onCreate() {
        this.f151273f = 0;
        this.f151274g.clear();
        this.f151274g.put(0, 0);
        for (C54000f onCreate : this.f151272e) {
            onCreate.onCreate();
        }
    }
}
