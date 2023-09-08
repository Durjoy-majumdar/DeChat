package aw1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import a14.C53965x0;
import a14.C53973z1;
import android.content.Context;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.observer.IMvvmObserver;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.statecenter.IStateAction;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import eb0.C31543z5;
import f14.C58901s;
import f40.C86709a0;
import fy3.C32227p;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import lv1.C21461d;
import lv1.C99672i;
import ov1.C21890b;
import ov1.C21891f;
import pv1.C22019b;
import rx3.C13598b0;
import te3.pd4;
import uv1.C65479a;
import w00.C22833c;
import w00.C22840j;
import wx3.C15601d;
import xv1.C23137o;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: aw1.m */
public final class C16729m extends C21890b {

    /* renamed from: g */
    public HashSet<String> f45211g = new HashSet<>();

    /* renamed from: h */
    public C53973z1 f45212h;

    /* renamed from: i */
    public String f45213i;

    /* renamed from: j */
    public long f45214j;

    /* renamed from: n */
    public boolean f45215n = true;

    /* renamed from: o */
    public long f45216o;

    /* renamed from: p */
    public LinkedList<pd4> f45217p;

    /* renamed from: q */
    public String f45218q;

    /* renamed from: r */
    public boolean f45219r;

    /* renamed from: s */
    public boolean f45220s;

    /* renamed from: t */
    public String f45221t = "";

    /* renamed from: u */
    public int f45222u;

    /* renamed from: v */
    public C23137o f45223v;

    /* renamed from: aw1.m$a */
    public static final class C16730a<E> implements IMvvmObserver {

        /* renamed from: d */
        public final /* synthetic */ C16729m f45224d;

        /* renamed from: e */
        public final /* synthetic */ C21891f.C21893b f45225e;

        public C16730a(C16729m mVar, C21891f.C21893b bVar) {
            this.f45224d = mVar;
            this.f45225e = bVar;
        }

        public void onChanged(Object obj) {
            C65479a aVar = (C65479a) obj;
            C87412m.m108594g(aVar, LocaleUtil.ITALIAN);
            C16729m mVar = this.f45224d;
            C21891f.C21893b bVar = this.f45225e;
            IStateAction action = aVar.getAction();
            if (action != null && (action instanceof C22833c)) {
                C22833c cVar = (C22833c) action;
                mVar.f45219r = !cVar.f65650e;
                mVar.f45216o = C31543z5.m39453c();
                boolean z = cVar.f65650e;
                mVar.f45215n = z;
                if (!z && C87412m.m108589b(cVar.f65646a, mVar.f45213i) && cVar.f65647b == mVar.f45214j) {
                    C23137o oVar = mVar.f45223v;
                    if (oVar != null) {
                        oVar.mo36520m(cVar.f65649d, cVar.f65651f, cVar.f65652g);
                    }
                    mVar.f45217p = cVar.f65649d;
                    mVar.f45218q = cVar.f65651f;
                    String str = cVar.f65652g;
                    C87412m.m108594g(str, "<set-?>");
                    mVar.f45221t = str;
                    long j = mVar.f45214j;
                    String str2 = mVar.f45213i;
                    if (str2 == null) {
                        str2 = "";
                    }
                    Context context = mVar.f61902e;
                    if (context instanceof BaseMvvmActivity) {
                        C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity");
                        UIStateCenter stateCenter = ((BaseMvvmActivity) context).getStateCenter();
                        if (stateCenter != null) {
                            stateCenter.dispatch(new C22840j(j, str2, false));
                        }
                    }
                    mVar.f45220s = true;
                    LifecycleScope lifecycleScope = C86709a0.m107523b().f251755f.f123611e;
                    if (lifecycleScope != null) {
                        C53896h0 h0Var = C53872d1.f151117a;
                        C53895h.m60466d(lifecycleScope, C58901s.f168555a, (C53934p0) null, new C16728l(bVar, mVar, (C15601d<? super C16728l>) null), 2, (Object) null);
                    }
                }
            }
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.fts.ui.unit.FTSRelevantSearchUIUnit$searchData$2", mo125469f = "FTSRelevantSearchUIUnit.kt", mo125470l = {92}, mo125471m = "invokeSuspend")
    /* renamed from: aw1.m$b */
    public static final class C16731b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f45226d;

        /* renamed from: e */
        public final /* synthetic */ C16729m f45227e;

        /* renamed from: f */
        public final /* synthetic */ long f45228f;

        /* renamed from: g */
        public final /* synthetic */ String f45229g;

        @C91590f(mo125468c = "com.tencent.mm.plugin.fts.ui.unit.FTSRelevantSearchUIUnit$searchData$2$1", mo125469f = "FTSRelevantSearchUIUnit.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: aw1.m$b$a */
        public static final class C16732a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C16729m f45230d;

            /* renamed from: e */
            public final /* synthetic */ String f45231e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C16732a(C16729m mVar, String str, C15601d<? super C16732a> dVar) {
                super(2, dVar);
                this.f45230d = mVar;
                this.f45231e = str;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C16732a(this.f45230d, this.f45231e, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C16732a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                C16729m mVar = this.f45230d;
                C21891f.C21893b bVar = mVar.f61901d;
                if (bVar != null) {
                    String str = this.f45231e;
                    if (str == null) {
                        str = "";
                    }
                    bVar.mo23811a(mVar, str, true);
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16731b(C16729m mVar, long j, String str, C15601d<? super C16731b> dVar) {
            super(2, dVar);
            this.f45227e = mVar;
            this.f45228f = j;
            this.f45229g = str;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C16731b(this.f45227e, this.f45228f, this.f45229g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C16731b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f45226d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f45226d = 1;
                if (C53965x0.m60607b(500, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C16729m mVar = this.f45227e;
            mVar.f45215n = !mVar.f45219r;
            if (!mVar.f45220s) {
                mVar.f45220s = true;
                LifecycleScope lifecycleScope = C86709a0.m107523b().f251755f.f123611e;
                if (lifecycleScope != null) {
                    C53896h0 h0Var = C53872d1.f151117a;
                    C53895h.m60466d(lifecycleScope, C58901s.f168555a, (C53934p0) null, new C16732a(this.f45227e, this.f45229g, (C15601d<? super C16732a>) null), 2, (Object) null);
                }
                C16729m mVar2 = this.f45227e;
                long j = this.f45228f;
                String str = this.f45229g;
                if (str == null) {
                    str = "";
                }
                Context context = mVar2.f61902e;
                if (context instanceof BaseMvvmActivity) {
                    C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity");
                    UIStateCenter stateCenter = ((BaseMvvmActivity) context).getStateCenter();
                    if (stateCenter != null) {
                        stateCenter.dispatch(new C22840j(j, str, true));
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    public C16729m(Context context, C21891f.C21893b bVar, int i) {
        super(context, bVar, i);
        UIStateCenter stateCenter;
        if ((context instanceof BaseMvvmActivity) && (stateCenter = ((BaseMvvmActivity) context).getStateCenter()) != null) {
            stateCenter.observe((C0125s) context, new C16730a(this, bVar));
        }
        this.f45222u = Integer.MAX_VALUE;
    }

    /* renamed from: a */
    public long mo17719a() {
        return this.f45216o;
    }

    /* renamed from: c */
    public LinkedList<Integer> mo17720c() {
        return new LinkedList<>();
    }

    /* renamed from: d */
    public int mo17721d(int i) {
        if (this.f45215n) {
            this.f45222u = Integer.MAX_VALUE;
            return i;
        }
        this.f45222u = i;
        return i + 1;
    }

    /* renamed from: e */
    public void mo17722e() {
        C53973z1 z1Var = this.f45212h;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
    }

    /* renamed from: f */
    public C22019b mo17723f(int i) {
        if (i != this.f45222u) {
            return null;
        }
        C23137o oVar = new C23137o(18, i);
        String str = this.f45213i;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        oVar.f62327e = C99672i.m130094a(str, false);
        this.f45223v = oVar;
        LinkedList<pd4> linkedList = this.f45217p;
        if (linkedList != null) {
            String str3 = this.f45218q;
            if (str3 != null) {
                str2 = str3;
            }
            oVar.mo36520m(linkedList, str2, this.f45221t);
        }
        return oVar;
    }

    /* renamed from: g */
    public int mo17724g() {
        C23137o oVar = this.f45223v;
        if (oVar == null) {
            return 0;
        }
        int size = oVar.f66455q.size();
        if (size > 3) {
            return 3;
        }
        return size;
    }

    public int getType() {
        return 256;
    }

    /* renamed from: h */
    public void mo17725h(String str, MMHandler mMHandler, HashSet<String> hashSet, long j) {
        mo17722e();
        this.f45213i = str;
        this.f45214j = j;
        if (hashSet != null) {
            this.f45211g.addAll(hashSet);
        }
        this.f45219r = false;
        this.f45220s = false;
        C53973z1 z1Var = null;
        this.f45217p = null;
        this.f45221t = "";
        LifecycleScope lifecycleScope = C86709a0.m107523b().f251755f.f123611e;
        if (lifecycleScope != null) {
            z1Var = LifecycleScope.launchDefault$default(lifecycleScope, (C53934p0) null, new C16731b(this, j, str, (C15601d<? super C16731b>) null), 1, (Object) null);
        }
        this.f45212h = z1Var;
    }

    /* renamed from: i */
    public List<C21461d> mo17726i(long j) {
        ArrayList arrayList = new ArrayList();
        C21461d dVar = new C21461d();
        long c = C31543z5.m39453c();
        dVar.f60765g = "SOSItemRelevant:" + this.f45213i;
        dVar.f60760b = this.f45222u;
        dVar.f60759a = 0;
        dVar.f60761c = 0;
        long j2 = c - j;
        dVar.f60764f = j2;
        dVar.f60763e = j2;
        dVar.f60769k = c;
        dVar.f60762d = 1;
        arrayList.add(dVar);
        return arrayList;
    }

    /* renamed from: l */
    public void mo17727l() {
        this.f45222u = Integer.MAX_VALUE;
        this.f45211g.clear();
        this.f45211g = new HashSet<>();
        this.f45215n = true;
        this.f45213i = null;
        this.f45214j = 0;
        this.f45216o = 0;
        this.f45223v = null;
    }
}
