package com.tencent.p014mm.plugin.mvvmlist;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import ac2.C39534d;
import ac2.C39535k;
import ac2.C53998c;
import ac2.C54000f;
import ac2.C91988j;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C103766u;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import androidx.lifecycle.C54219z;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.C54248l;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.event.pending.UIPendingEventNotifier;
import com.tencent.p014mm.sdk.platformtools.Log;
import d14.C45253g;
import f14.C58901s;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import o40.C61926c;
import p573jk.C33586b;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C26236u;
import sx3.C36907w;
import sx3.C64186f0;
import sx3.C77813z;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import zb2.C103001d;
import zb2.C103002e;
import zb2.C103003f;
import zb2.C103006g;
import zb2.C103007j;
import zb2.C103008k;
import zb2.C53769h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\b\u0016\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u00032\u00020\u0004:\u0001\u0014BW\u0012$\u0010\n\u001a \u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0006\u001a\u00020\u0005H\u0003¨\u0006\u0015"}, mo182094d2 = {"Lcom/tencent/mm/plugin/mvvmlist/MvvmList;", "Lzb2/d;", "T", "Landroidx/lifecycle/r;", "Landroidx/lifecycle/s;", "Lrx3/b0;", "destroy", "Lac2/f;", "Lac2/c;", "Lac2/d;", "dataSource", "Lzb2/h;", "config", "lifecycleOwner", "Lcom/tencent/mm/sdk/coroutines/LifecycleScope;", "liveListScope", "", "initDataList", "<init>", "(Lac2/f;Lzb2/h;Landroidx/lifecycle/s;Lcom/tencent/mm/sdk/coroutines/LifecycleScope;Ljava/util/List;)V", "d", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.mvvmlist.MvvmList */
public class MvvmList<T extends C103001d<T>> implements C0124r, C0125s {

    /* renamed from: d */
    public final C54000f<T, C53998c<T>, C39534d<T>> f272345d;

    /* renamed from: e */
    public final C53769h f272346e;

    /* renamed from: f */
    public final C0125s f272347f;

    /* renamed from: g */
    public final LifecycleScope f272348g;

    /* renamed from: h */
    public final List<T> f272349h;

    /* renamed from: i */
    public boolean f272350i;

    /* renamed from: j */
    public boolean f272351j;

    /* renamed from: n */
    public volatile int f272352n;

    /* renamed from: o */
    public ArrayList<T> f272353o;

    /* renamed from: p */
    public ArrayList<T> f272354p;

    /* renamed from: q */
    public C103006g<T> f272355q;

    /* renamed from: r */
    public final C54219z<C91988j<T>> f272356r;

    /* renamed from: s */
    public long f272357s;

    /* renamed from: t */
    public final LiveData<C91988j<T>> f272358t;

    /* renamed from: u */
    public final C13601g f272359u;

    /* renamed from: v */
    public final C13601g f272360v;

    /* renamed from: w */
    public final C13601g f272361w;

    @C91590f(mo125468c = "com.tencent.mm.plugin.mvvmlist.MvvmList$getSnapshotList$1", mo125469f = "MvvmList.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.mvvmlist.MvvmList$h */
    public static final class C69870h extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ MvvmList<T> f201592d;

        /* renamed from: e */
        public final /* synthetic */ C32226l<List<? extends T>, C13598b0> f201593e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C69870h(MvvmList<T> mvvmList, C32226l<? super List<? extends T>, C13598b0> lVar, C15601d<? super C69870h> dVar) {
            super(2, dVar);
            this.f201592d = mvvmList;
            this.f201593e = lVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C69870h(this.f201592d, this.f201593e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C69870h) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C77813z.m93908n(this.f201592d.f272354p);
            this.f201593e.invoke(this.f201592d.f272354p);
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.mvvmlist.MvvmList$1", mo125469f = "MvvmList.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.mvvmlist.MvvmList$a */
    public static final class C94264a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ MvvmList<T> f272362d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C94264a(MvvmList<T> mvvmList, C15601d<? super C94264a> dVar) {
            super(2, dVar);
            this.f272362d = mvvmList;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C94264a(this.f272362d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C94264a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            MvvmList<T> mvvmList = this.f272362d;
            for (T Ow : mvvmList.f272349h) {
                mvvmList.f272354p.add(Ow.mo90777Ow());
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.mvvmlist.MvvmList$2", mo125469f = "MvvmList.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.mvvmlist.MvvmList$b */
    public static final class C94265b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ MvvmList<T> f272363d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C94265b(MvvmList<T> mvvmList, C15601d<? super C94265b> dVar) {
            super(2, dVar);
            this.f272363d = mvvmList;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C94265b(this.f272363d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C94265b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C39623j.C39626c cVar = this.f272363d.mo129601a().f306531b;
            C39623j.C39626c cVar2 = C39623j.C39626c.CREATED;
            if (cVar.compareTo(cVar2) < 0) {
                this.f272363d.mo129601a().mo145136d(cVar2);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.mvvmlist.MvvmList$c */
    public static final class C94266c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MvvmList<T> f272364d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C94266c(MvvmList<T> mvvmList) {
            super(0);
            this.f272364d = mvvmList;
        }

        public Object invoke() {
            this.f272364d.mo129601a().mo145136d(C39623j.C39626c.INITIALIZED);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.mvvmlist.MvvmList$d */
    public enum C94267d {
        Insert,
        Update,
        Delete,
        Reset,
        RefreshAll,
        LoadMore,
        FirstCreate
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.mvvmlist.MvvmList$destroy$1", mo125469f = "MvvmList.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.mvvmlist.MvvmList$e */
    public static final class C94268e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ MvvmList<T> f272373d;

        /* renamed from: com.tencent.mm.plugin.mvvmlist.MvvmList$e$a */
        public static final class C94269a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ MvvmList<T> f272374d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C94269a(MvvmList<T> mvvmList) {
                super(0);
                this.f272374d = mvvmList;
            }

            public Object invoke() {
                this.f272374d.mo129601a().mo145136d(C39623j.C39626c.DESTROYED);
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C94268e(MvvmList<T> mvvmList, C15601d<? super C94268e> dVar) {
            super(2, dVar);
            this.f272373d = mvvmList;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C94268e(this.f272373d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C94268e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            MvvmList<T> mvvmList = this.f272373d;
            mvvmList.f272351j = false;
            mvvmList.f272354p.clear();
            C61926c.m72668M(new C94269a(this.f272373d));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.mvvmlist.MvvmList$f */
    public static final class C94270f extends C87413o implements C32224a<C94284a> {

        /* renamed from: d */
        public final /* synthetic */ MvvmList<T> f272375d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C94270f(MvvmList<T> mvvmList) {
            super(0);
            this.f272375d = mvvmList;
        }

        public Object invoke() {
            return new C94284a(this.f272375d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.mvvmlist.MvvmList$g */
    public static final class C94271g extends C87413o implements C32224a<UIPendingEventNotifier<C103007j<T>>> {

        /* renamed from: d */
        public final /* synthetic */ MvvmList<T> f272376d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C94271g(MvvmList<T> mvvmList) {
            super(0);
            this.f272376d = mvvmList;
        }

        public Object invoke() {
            MvvmList<T> mvvmList = this.f272376d;
            return new UIPendingEventNotifier(mvvmList.f272357s, (C94284a) ((C36570n) mvvmList.f272359u).getValue(), this.f272376d.f272347f);
        }
    }

    /* renamed from: com.tencent.mm.plugin.mvvmlist.MvvmList$i */
    public static final class C94272i extends C87413o implements C32224a<C103766u> {

        /* renamed from: d */
        public final /* synthetic */ MvvmList<T> f272377d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C94272i(MvvmList<T> mvvmList) {
            super(0);
            this.f272377d = mvvmList;
        }

        public Object invoke() {
            return new C103766u(this.f272377d);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.mvvmlist.MvvmList$loadMore$1", mo125469f = "MvvmList.kt", mo125470l = {175}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.mvvmlist.MvvmList$j */
    public static final class C94273j extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f272378d;

        /* renamed from: e */
        public final /* synthetic */ MvvmList<T> f272379e;

        /* renamed from: f */
        public final /* synthetic */ Object f272380f;

        /* renamed from: g */
        public final /* synthetic */ int f272381g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C94273j(MvvmList<T> mvvmList, Object obj, int i, C15601d<? super C94273j> dVar) {
            super(2, dVar);
            this.f272379e = mvvmList;
            this.f272380f = obj;
            this.f272381g = i;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C94273j(this.f272379e, this.f272380f, this.f272381g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C94273j) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f272378d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Log.m105924i(this.f272379e.mo5660b(), "check load more");
                MvvmList<T> mvvmList = this.f272379e;
                if (mvvmList.f272351j) {
                    Log.m105924i(mvvmList.mo5660b(), "already loading");
                } else {
                    Object obj2 = this.f272380f;
                    int i2 = this.f272381g;
                    this.f272378d = 1;
                    if (mvvmList.mo129604f(obj2, i2, this) == aVar) {
                        return aVar;
                    }
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.mvvmlist.MvvmList$k */
    public static final class C94274k<T> implements C45253g {

        /* renamed from: d */
        public final /* synthetic */ MvvmList<T> f272382d;

        public C94274k(MvvmList<T> mvvmList) {
            this.f272382d = mvvmList;
        }

        public Object emit(Object obj, C15601d dVar) {
            C39534d dVar2 = (C39534d) obj;
            String b = this.f272382d.mo5660b();
            Log.m105924i(b, "getData continueFlag:" + dVar2.f106150a + " size:" + dVar2.f106151b.size() + " offset:" + this.f272382d.f272354p.size());
            MvvmList<T> mvvmList = this.f272382d;
            mvvmList.f272350i = dVar2.f106150a;
            Iterator<T> it = dVar2.f106151b.iterator();
            while (it.hasNext()) {
                C103001d dVar3 = (C103001d) it.next();
                if (!mvvmList.f272354p.contains(dVar3)) {
                    mvvmList.f272354p.add(dVar3);
                }
            }
            this.f272382d.mo129605g(false);
            MvvmList.m119208i(this.f272382d, C94267d.LoadMore, false, 2, (Object) null);
            this.f272382d.f272356r.postValue(new C91988j(C39535k.AfterLoadPage, dVar2));
            MvvmList<T> mvvmList2 = this.f272382d;
            C53769h hVar = mvvmList2.f272346e;
            if (!hVar.f150920a) {
                return C13598b0.f38549a;
            }
            Object f = mvvmList2.mo129604f(dVar2.f106152c, hVar.f150921b, dVar);
            return f == C15911a.COROUTINE_SUSPENDED ? f : C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.mvvmlist.MvvmList$submitInsert$1", mo125469f = "MvvmList.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.mvvmlist.MvvmList$l */
    public static final class C94275l extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ boolean f272383d;

        /* renamed from: e */
        public final /* synthetic */ MvvmList<T> f272384e;

        /* renamed from: f */
        public final /* synthetic */ T f272385f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C94275l(boolean z, MvvmList<T> mvvmList, T t, C15601d<? super C94275l> dVar) {
            super(2, dVar);
            this.f272383d = z;
            this.f272384e = mvvmList;
            this.f272385f = t;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C94275l(this.f272383d, this.f272384e, this.f272385f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C94275l) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C94267d dVar = C94267d.Insert;
            ResultKt.throwOnFailure(obj);
            if (this.f272383d) {
                this.f272384e.f272354p.add(this.f272385f);
                MvvmList.m119208i(this.f272384e, dVar, false, 2, (Object) null);
            } else if (!this.f272384e.f272354p.contains(this.f272385f)) {
                this.f272384e.f272354p.add(this.f272385f);
                MvvmList.m119208i(this.f272384e, dVar, false, 2, (Object) null);
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.mvvmlist.MvvmList$submitInsert$2", mo125469f = "MvvmList.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.mvvmlist.MvvmList$m */
    public static final class C94276m extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ List<T> f272386d;

        /* renamed from: e */
        public final /* synthetic */ MvvmList<T> f272387e;

        /* renamed from: f */
        public final /* synthetic */ boolean f272388f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C94276m(List<? extends T> list, MvvmList<T> mvvmList, boolean z, C15601d<? super C94276m> dVar) {
            super(2, dVar);
            this.f272386d = list;
            this.f272387e = mvvmList;
            this.f272388f = z;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C94276m(this.f272386d, this.f272387e, this.f272388f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C94276m) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            List<T> list = this.f272386d;
            boolean z = this.f272388f;
            MvvmList<T> mvvmList = this.f272387e;
            for (T t : list) {
                if (z) {
                    mvvmList.f272354p.add(t);
                } else if (!mvvmList.f272354p.contains(t)) {
                    mvvmList.f272354p.add(t);
                }
            }
            MvvmList.m119208i(this.f272387e, C94267d.Insert, false, 2, (Object) null);
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.mvvmlist.MvvmList$submitRefreshAll$1", mo125469f = "MvvmList.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.mvvmlist.MvvmList$n */
    public static final class C94277n extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ MvvmList<T> f272389d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C94277n(MvvmList<T> mvvmList, C15601d<? super C94277n> dVar) {
            super(2, dVar);
            this.f272389d = mvvmList;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C94277n(this.f272389d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C94277n) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            MvvmList<T> mvvmList = this.f272389d;
            if (!mvvmList.f272351j) {
                LifecycleScope.launchDefault$default(mvvmList.f272348g, (C53934p0) null, new C103003f(mvvmList, C94267d.RefreshAll, (C15601d<? super C103003f>) null), 1, (Object) null);
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.mvvmlist.MvvmList$submitRemove$1", mo125469f = "MvvmList.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.mvvmlist.MvvmList$o */
    public static final class C94278o extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ MvvmList<T> f272390d;

        /* renamed from: e */
        public final /* synthetic */ String f272391e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C94278o(MvvmList<T> mvvmList, String str, C15601d<? super C94278o> dVar) {
            super(2, dVar);
            this.f272390d = mvvmList;
            this.f272391e = str;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C94278o(this.f272390d, this.f272391e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C94278o) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            Iterator<T> it = this.f272390d.f272354p.iterator();
            C87412m.m108593f(it, "snapshotList.iterator()");
            while (it.hasNext()) {
                T next = it.next();
                C87412m.m108593f(next, "iterator.next()");
                if (C87412m.m108589b(this.f272391e, ((C103001d) next).mo344Oa())) {
                    it.remove();
                }
            }
            MvvmList.m119208i(this.f272390d, C94267d.Delete, false, 2, (Object) null);
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.mvvmlist.MvvmList$submitRemove$2", mo125469f = "MvvmList.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.mvvmlist.MvvmList$p */
    public static final class C94279p extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ MvvmList<T> f272392d;

        /* renamed from: e */
        public final /* synthetic */ List<String> f272393e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C94279p(MvvmList<T> mvvmList, List<String> list, C15601d<? super C94279p> dVar) {
            super(2, dVar);
            this.f272392d = mvvmList;
            this.f272393e = list;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C94279p(this.f272392d, this.f272393e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C94279p) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            Iterator<T> it = this.f272392d.f272354p.iterator();
            C87412m.m108593f(it, "snapshotList.iterator()");
            while (it.hasNext()) {
                T next = it.next();
                C87412m.m108593f(next, "iterator.next()");
                if (this.f272393e.contains(((C103001d) next).mo344Oa())) {
                    it.remove();
                }
            }
            MvvmList.m119208i(this.f272392d, C94267d.Delete, false, 2, (Object) null);
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.mvvmlist.MvvmList$submitRemove$3", mo125469f = "MvvmList.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.mvvmlist.MvvmList$q */
    public static final class C94280q extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ MvvmList<T> f272394d;

        /* renamed from: e */
        public final /* synthetic */ T f272395e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C94280q(MvvmList<T> mvvmList, T t, C15601d<? super C94280q> dVar) {
            super(2, dVar);
            this.f272394d = mvvmList;
            this.f272395e = t;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C94280q(this.f272394d, this.f272395e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C94280q) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            Iterator<T> it = this.f272394d.f272354p.iterator();
            C87412m.m108593f(it, "snapshotList.iterator()");
            while (it.hasNext()) {
                T next = it.next();
                C87412m.m108593f(next, "iterator.next()");
                if (C87412m.m108589b(this.f272395e.mo344Oa(), ((C103001d) next).mo344Oa())) {
                    it.remove();
                }
            }
            MvvmList.m119208i(this.f272394d, C94267d.Delete, false, 2, (Object) null);
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.mvvmlist.MvvmList$submitReset$1", mo125469f = "MvvmList.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.mvvmlist.MvvmList$r */
    public static final class C94281r extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ MvvmList<T> f272396d;

        /* renamed from: e */
        public final /* synthetic */ List<T> f272397e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C94281r(MvvmList<T> mvvmList, List<? extends T> list, C15601d<? super C94281r> dVar) {
            super(2, dVar);
            this.f272396d = mvvmList;
            this.f272397e = list;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C94281r(this.f272396d, this.f272397e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C94281r) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            this.f272396d.f272354p.clear();
            this.f272396d.f272354p.addAll(this.f272397e);
            this.f272396d.mo129606h(C94267d.Reset, false);
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.mvvmlist.MvvmList$submitUpdate$1", mo125469f = "MvvmList.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.mvvmlist.MvvmList$s */
    public static final class C94282s extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ MvvmList<T> f272398d;

        /* renamed from: e */
        public final /* synthetic */ T f272399e;

        /* renamed from: f */
        public final /* synthetic */ boolean f272400f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C94282s(MvvmList<T> mvvmList, T t, boolean z, C15601d<? super C94282s> dVar) {
            super(2, dVar);
            this.f272398d = mvvmList;
            this.f272399e = t;
            this.f272400f = z;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C94282s(this.f272398d, this.f272399e, this.f272400f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C94282s) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            boolean z;
            ResultKt.throwOnFailure(obj);
            if (this.f272398d.f272354p.contains(this.f272399e)) {
                z = true;
                this.f272398d.f272354p.remove(this.f272399e);
            } else {
                z = false;
            }
            if (z) {
                this.f272398d.f272354p.add(this.f272399e);
                MvvmList.m119208i(this.f272398d, C94267d.Update, false, 2, (Object) null);
            } else {
                if (this.f272400f) {
                    this.f272398d.f272354p.add(this.f272399e);
                    MvvmList.m119208i(this.f272398d, C94267d.Insert, false, 2, (Object) null);
                }
                String b = this.f272398d.mo5660b();
                Log.m105924i(b, "submitUpdate not find item: " + this.f272399e.mo344Oa());
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.mvvmlist.MvvmList$submitUpdate$2", mo125469f = "MvvmList.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.mvvmlist.MvvmList$t */
    public static final class C94283t extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C32226l<ArrayList<T>, C13598b0> f272401d;

        /* renamed from: e */
        public final /* synthetic */ MvvmList<T> f272402e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C94283t(C32226l<? super ArrayList<T>, C13598b0> lVar, MvvmList<T> mvvmList, C15601d<? super C94283t> dVar) {
            super(2, dVar);
            this.f272401d = lVar;
            this.f272402e = mvvmList;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C94283t(this.f272401d, this.f272402e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C94283t) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            this.f272401d.invoke(this.f272402e.f272354p);
            MvvmList.m119208i(this.f272402e, C94267d.Update, false, 2, (Object) null);
            return C13598b0.f38549a;
        }
    }

    public MvvmList(C54000f<T, C53998c<T>, C39534d<T>> fVar, C53769h hVar, C0125s sVar, LifecycleScope lifecycleScope, List<? extends T> list) {
        C94267d dVar = C94267d.FirstCreate;
        C87412m.m108594g(fVar, "dataSource");
        C87412m.m108594g(hVar, "config");
        C87412m.m108594g(sVar, "lifecycleOwner");
        C87412m.m108594g(lifecycleScope, "liveListScope");
        C87412m.m108594g(list, "initDataList");
        this.f272345d = fVar;
        this.f272346e = hVar;
        this.f272347f = sVar;
        this.f272348g = lifecycleScope;
        this.f272349h = list;
        this.f272350i = true;
        this.f272353o = new ArrayList<>(list);
        this.f272354p = new ArrayList<>();
        C54219z<C91988j<T>> zVar = new C54219z<>();
        this.f272356r = zVar;
        this.f272357s = 100;
        this.f272358t = zVar;
        this.f272359u = C36568h.m40985a(new C94270f(this));
        this.f272360v = C36568h.m40985a(new C94271g(this));
        this.f272361w = C36568h.m40985a(new C94272i(this));
        sVar.getLifecycle().addObserver(this);
        if (!list.isEmpty()) {
            LifecycleScope.launchDefault$default(lifecycleScope, (C53934p0) null, new C94264a(this, (C15601d<? super C94264a>) null), 1, (Object) null);
            if (hVar.f150920a) {
                LifecycleScope.launchDefault$default(lifecycleScope, (C53934p0) null, new C103003f(this, dVar, (C15601d<? super C103003f>) null), 1, (Object) null);
            } else {
                C53896h0 h0Var = C53872d1.f151117a;
                C53895h.m60466d(lifecycleScope, C58901s.f168555a, (C53934p0) null, new C94265b(this, (C15601d<? super C94265b>) null), 2, (Object) null);
            }
        } else {
            LifecycleScope.launchDefault$default(lifecycleScope, (C53934p0) null, new C103003f(this, dVar, (C15601d<? super C103003f>) null), 1, (Object) null);
        }
        C61926c.m72668M(new C94266c(this));
    }

    @C112974b0(C39623j.C39625b.ON_DESTROY)
    private final void destroy() {
        LifecycleScope.launchDefault$default(this.f272348g, (C53934p0) null, new C94268e(this, (C15601d<? super C94268e>) null), 1, (Object) null);
    }

    /* renamed from: i */
    public static /* synthetic */ void m119208i(MvvmList mvvmList, C94267d dVar, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = true;
            }
            mvvmList.mo129606h(dVar, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitChange");
    }

    /* renamed from: l */
    public static /* synthetic */ void m119209l(MvvmList mvvmList, C103001d dVar, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            mvvmList.mo129608k(dVar, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitInsert");
    }

    /* renamed from: t */
    public static /* synthetic */ void m119210t(MvvmList mvvmList, C103001d dVar, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            mvvmList.mo129615s(dVar, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitUpdate");
    }

    /* renamed from: a */
    public final C103766u mo129601a() {
        return (C103766u) this.f272361w.getValue();
    }

    /* renamed from: b */
    public String mo5660b() {
        return "MicroMsg.Mvvm.MvvmList";
    }

    /* renamed from: c */
    public final void mo129602c(C32226l<? super List<? extends T>, C13598b0> lVar) {
        C87412m.m108594g(lVar, "callback");
        LifecycleScope.launchDefault$default(this.f272348g, (C53934p0) null, new C69870h(this, lVar, (C15601d<? super C69870h>) null), 1, (Object) null);
    }

    /* renamed from: d */
    public List<T> mo5661d(List<T> list) {
        C87412m.m108594g(list, "snapshotList");
        C77813z.m93908n(list);
        ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
        for (T Ow : list) {
            Object Ow2 = Ow.mo90777Ow();
            C87412m.m108592e(Ow2, "null cannot be cast to non-null type T of com.tencent.mm.plugin.mvvmlist.MvvmList.handleSnapshotList$lambda-2");
            arrayList.add((C103001d) Ow2);
        }
        return arrayList;
    }

    /* renamed from: e */
    public final void mo129603e(Object obj, int i) {
        if (this.f272346e.f150920a) {
            Log.m105924i(mo5660b(), "auto load mode");
        } else {
            LifecycleScope.launchDefault$default(this.f272348g, (C53934p0) null, new C94273j(this, obj, i, (C15601d<? super C94273j>) null), 1, (Object) null);
        }
    }

    /* renamed from: f */
    public final Object mo129604f(Object obj, int i, C15601d<? super C13598b0> dVar) {
        String b = mo5660b();
        Log.m105924i(b, "postLoadMoreTask " + this.f272350i);
        if (!this.f272350i) {
            return C13598b0.f38549a;
        }
        mo129605g(true);
        this.f272356r.postValue(new C91988j(C39535k.BeforeLoadPage, (C39534d) null));
        Object a = this.f272345d.mo70650e(this.f272348g, new C53998c(this.f272354p.size(), i, obj)).mo31880a(new C94274k(this), dVar);
        return a == C15911a.COROUTINE_SUSPENDED ? a : C13598b0.f38549a;
    }

    /* renamed from: g */
    public final void mo129605g(boolean z) {
        String b = mo5660b();
        Log.m105924i(b, "updateLoadingDataState:" + z);
        this.f272351j = z;
    }

    public C39623j getLifecycle() {
        return mo129601a();
    }

    /* renamed from: h */
    public final void mo129606h(C94267d dVar, boolean z) {
        int i;
        boolean z2 = z;
        String b = mo5660b();
        Log.m105924i(b, "submitChange type:" + dVar + " pending:" + z2);
        long a = C33586b.m40132a();
        List<T> d = mo5661d(this.f272354p);
        long a2 = C33586b.m40132a();
        ArrayList arrayList = new ArrayList();
        synchronized (this.f272353o) {
            arrayList.addAll(this.f272353o);
            i = this.f272352n;
        }
        long a3 = C33586b.m40132a();
        C54248l.C54251c a4 = C54248l.m60949a(new C103002e(arrayList, d), true);
        C103008k kVar = new C103008k();
        a4.mo75045a(kVar);
        C103007j jVar = r6;
        C103007j jVar2 = new C103007j(d, i, kVar.f303958a, C26236u.m33719b(dVar), 0);
        ((UIPendingEventNotifier) ((C36570n) this.f272360v).getValue()).doNotify(jVar, z2);
        String b2 = mo5660b();
        Log.m105924i(b2, "check snapshot diff step1:" + (a2 - a) + " step2:" + (a3 - a2) + " step3:" + (C33586b.m40132a() - a2) + " dataListVersion:" + i);
    }

    /* renamed from: j */
    public final void mo129607j(List<? extends T> list, boolean z) {
        C87412m.m108594g(list, "itemList");
        String b = mo5660b();
        Log.m105924i(b, "submitInsert: " + list.size() + " allowDuplicated:" + z);
        LifecycleScope.launchDefault$default(this.f272348g, (C53934p0) null, new C94276m(list, this, z, (C15601d<? super C94276m>) null), 1, (Object) null);
    }

    /* renamed from: k */
    public final void mo129608k(T t, boolean z) {
        C87412m.m108594g(t, "item");
        String b = mo5660b();
        Log.m105924i(b, "submitInsert: " + t.mo344Oa() + " allowDuplicated:" + z);
        LifecycleScope.launchDefault$default(this.f272348g, (C53934p0) null, new C94275l(z, this, t, (C15601d<? super C94275l>) null), 1, (Object) null);
    }

    /* renamed from: m */
    public void mo129609m() {
        Log.m105924i(mo5660b(), "submitRefreshAll");
        LifecycleScope.launchDefault$default(this.f272348g, (C53934p0) null, new C94277n(this, (C15601d<? super C94277n>) null), 1, (Object) null);
    }

    /* renamed from: n */
    public final void mo129610n(String str) {
        C87412m.m108594g(str, "uniqueId");
        String b = mo5660b();
        Log.m105924i(b, "submitRemove: uniqueId = " + str);
        LifecycleScope.launchDefault$default(this.f272348g, (C53934p0) null, new C94278o(this, str, (C15601d<? super C94278o>) null), 1, (Object) null);
    }

    /* renamed from: o */
    public final void mo129611o(List<String> list) {
        C87412m.m108594g(list, "uniqueIdList");
        String b = mo5660b();
        Log.m105924i(b, "submitRemove: uniqueIdList = " + list.size());
        LifecycleScope.launchDefault$default(this.f272348g, (C53934p0) null, new C94279p(this, list, (C15601d<? super C94279p>) null), 1, (Object) null);
    }

    /* renamed from: p */
    public final void mo129612p(T t) {
        C87412m.m108594g(t, "item");
        String b = mo5660b();
        Log.m105924i(b, "submitRemove: " + t.mo344Oa());
        LifecycleScope.launchDefault$default(this.f272348g, (C53934p0) null, new C94280q(this, t, (C15601d<? super C94280q>) null), 1, (Object) null);
    }

    /* renamed from: q */
    public final void mo129613q(List<? extends T> list) {
        C87412m.m108594g(list, "itemList");
        String b = mo5660b();
        Log.m105924i(b, "submitReset: " + list.size());
        LifecycleScope.launchDefault$default(this.f272348g, (C53934p0) null, new C94281r(this, list, (C15601d<? super C94281r>) null), 1, (Object) null);
    }

    /* renamed from: r */
    public final void mo129614r(C32226l<? super ArrayList<T>, C13598b0> lVar) {
        C87412m.m108594g(lVar, "handler");
        LifecycleScope.launchDefault$default(this.f272348g, (C53934p0) null, new C94283t(lVar, this, (C15601d<? super C94283t>) null), 1, (Object) null);
    }

    /* renamed from: s */
    public final void mo129615s(T t, boolean z) {
        C87412m.m108594g(t, "item");
        String b = mo5660b();
        Log.m105924i(b, "submitUpdate: " + t.mo344Oa() + " notFoundInsert:" + z);
        LifecycleScope.launchDefault$default(this.f272348g, (C53934p0) null, new C94282s(this, t, z, (C15601d<? super C94282s>) null), 1, (Object) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MvvmList(C54000f fVar, C53769h hVar, C0125s sVar, LifecycleScope lifecycleScope, List list, int i, C8480h hVar2) {
        this(fVar, hVar, sVar, (i & 8) != 0 ? new LifecycleScope("MvvmList.LifecycleScope", sVar, 0, 4, (C8480h) null) : lifecycleScope, (i & 16) != 0 ? C64186f0.f181907d : list);
    }
}
