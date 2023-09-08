package androidx.work;

import a14.C0000n0;
import a14.C0002w;
import a14.C53872d1;
import a14.C53873d2;
import a14.C53895h;
import a14.C53896h0;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53973z1;
import android.content.Context;
import androidx.work.ListenableWorker;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import p1014o4.C109939f;
import p1014o4.C117692l;
import p1167z8.C112608f;
import p1169a5.C112758b;
import p283z4.C119049a;
import p283z4.C119060c;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo182094d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/ListenableWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime-ktx_release"}, mo182095k = 1, mo182096mv = {1, 5, 1})
public abstract class CoroutineWorker extends ListenableWorker {

    /* renamed from: i */
    public final C0002w f338316i = C53873d2.m60389a((C53973z1) null, 1, (Object) null);

    /* renamed from: j */
    public final C119060c<ListenableWorker.C113032a> f338317j;

    /* renamed from: n */
    public final C53896h0 f338318n;

    /* renamed from: androidx.work.CoroutineWorker$a */
    public static final class C113029a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ CoroutineWorker f338319d;

        public C113029a(CoroutineWorker coroutineWorker) {
            this.f338319d = coroutineWorker;
        }

        public final void run() {
            if (this.f338319d.f338317j.f356565d instanceof C119049a.C119052c) {
                C53973z1.C53974a.m60623a(this.f338319d.f338316i, (CancellationException) null, 1, (Object) null);
            }
        }
    }

    @C91590f(mo125468c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", mo125469f = "CoroutineWorker.kt", mo125470l = {134}, mo125471m = "invokeSuspend")
    /* renamed from: androidx.work.CoroutineWorker$b */
    public static final class C113030b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f338320d;

        /* renamed from: e */
        public int f338321e;

        /* renamed from: f */
        public final /* synthetic */ C117692l<C109939f> f338322f;

        /* renamed from: g */
        public final /* synthetic */ CoroutineWorker f338323g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C113030b(C117692l<C109939f> lVar, CoroutineWorker coroutineWorker, C15601d<? super C113030b> dVar) {
            super(2, dVar);
            this.f338322f = lVar;
            this.f338323g = coroutineWorker;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C113030b(this.f338322f, this.f338323g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C113030b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            int i = this.f338321e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C117692l<C109939f> lVar = this.f338322f;
                CoroutineWorker coroutineWorker = this.f338323g;
                this.f338320d = lVar;
                this.f338321e = 1;
                coroutineWorker.getClass();
                throw new IllegalStateException("Not implemented");
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                ((C117692l) this.f338320d).f352014e.mo183732i(obj);
                return C13598b0.f38549a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @C91590f(mo125468c = "androidx.work.CoroutineWorker$startWork$1", mo125469f = "CoroutineWorker.kt", mo125470l = {68}, mo125471m = "invokeSuspend")
    /* renamed from: androidx.work.CoroutineWorker$c */
    public static final class C113031c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f338324d;

        /* renamed from: e */
        public final /* synthetic */ CoroutineWorker f338325e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C113031c(CoroutineWorker coroutineWorker, C15601d<? super C113031c> dVar) {
            super(2, dVar);
            this.f338325e = coroutineWorker;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C113031c(this.f338325e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C113031c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f338324d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineWorker coroutineWorker = this.f338325e;
                this.f338324d = 1;
                obj = coroutineWorker.mo134652h(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Throwable th) {
                    this.f338325e.f338317j.mo183733j(th);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f338325e.f338317j.mo183732i((ListenableWorker.C113032a) obj);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C87412m.m108594g(context, "appContext");
        C87412m.m108594g(workerParameters, "params");
        C119060c<ListenableWorker.C113032a> cVar = new C119060c<>();
        this.f338317j = cVar;
        cVar.addListener(new C113029a(this), ((C112758b) this.f338327e.f338339d).f337642a);
        this.f338318n = C53872d1.f151117a;
    }

    /* renamed from: a */
    public final C112608f<C109939f> mo165503a() {
        C0002w a = C53873d2.m60389a((C53973z1) null, 1, (Object) null);
        C0000n0 a2 = C53930o0.m60554a(this.f338318n.plus(a));
        C117692l lVar = new C117692l(a, (C119060c) null, 2, (C8480h) null);
        C53895h.m60466d(a2, (C66212f) null, (C53934p0) null, new C113030b(lVar, this, (C15601d<? super C113030b>) null), 3, (Object) null);
        return lVar;
    }

    /* renamed from: c */
    public final void mo165504c() {
        this.f338317j.cancel(false);
    }

    /* renamed from: e */
    public final C112608f<ListenableWorker.C113032a> mo165505e() {
        C53895h.m60466d(C53930o0.m60554a(this.f338318n.plus(this.f338316i)), (C66212f) null, (C53934p0) null, new C113031c(this, (C15601d<? super C113031c>) null), 3, (Object) null);
        return this.f338317j;
    }

    /* renamed from: h */
    public abstract Object mo134652h(C15601d<? super ListenableWorker.C113032a> dVar);
}
