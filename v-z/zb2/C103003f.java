package zb2;

import a14.C0000n0;
import ac2.C39534d;
import ac2.C39535k;
import ac2.C53998c;
import ac2.C54000f;
import ac2.C91988j;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.plugin.mvvmlist.MvvmList;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Log;
import d14.C45252f;
import d14.C45253g;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87413o;
import java.util.Iterator;
import kotlin.ResultKt;
import o40.C61926c;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.mvvmlist.MvvmList$create$1", mo125469f = "MvvmList.kt", mo125470l = {116}, mo125471m = "invokeSuspend")
/* renamed from: zb2.f */
public final class C103003f extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f303947d;

    /* renamed from: e */
    public final /* synthetic */ MvvmList<C103001d<Object>> f303948e;

    /* renamed from: f */
    public final /* synthetic */ MvvmList.C94267d f303949f;

    /* renamed from: zb2.f$a */
    public static final class C103004a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MvvmList<C103001d<Object>> f303950d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C103004a(MvvmList<C103001d<Object>> mvvmList) {
            super(0);
            this.f303950d = mvvmList;
        }

        public Object invoke() {
            C39623j.C39626c cVar = this.f303950d.mo129601a().f306531b;
            C39623j.C39626c cVar2 = C39623j.C39626c.CREATED;
            if (cVar.compareTo(cVar2) < 0) {
                this.f303950d.mo129601a().mo145136d(cVar2);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: zb2.f$b */
    public static final class C103005b<T> implements C45253g {

        /* renamed from: d */
        public final /* synthetic */ MvvmList<T> f303951d;

        /* renamed from: e */
        public final /* synthetic */ MvvmList.C94267d f303952e;

        public C103005b(MvvmList<T> mvvmList, MvvmList.C94267d dVar) {
            this.f303951d = mvvmList;
            this.f303952e = dVar;
        }

        public Object emit(Object obj, C15601d dVar) {
            C39534d dVar2 = (C39534d) obj;
            String b = this.f303951d.mo5660b();
            Log.m105924i(b, "getData continueFlag:" + dVar2.f106150a + " size:" + dVar2.f106151b.size() + " offset:" + this.f303951d.f272354p.size());
            MvvmList<T> mvvmList = this.f303951d;
            mvvmList.f272350i = dVar2.f106150a;
            Iterator<T> it = dVar2.f106151b.iterator();
            while (it.hasNext()) {
                C103001d dVar3 = (C103001d) it.next();
                if (!mvvmList.f272354p.contains(dVar3)) {
                    mvvmList.f272354p.add(dVar3);
                }
            }
            this.f303951d.mo129605g(false);
            this.f303951d.mo129606h(this.f303952e, false);
            this.f303951d.f272356r.postValue(new C91988j(C39535k.AfterLoadPage, dVar2));
            MvvmList<T> mvvmList2 = this.f303951d;
            if (mvvmList2.f272350i) {
                C53769h hVar = mvvmList2.f272346e;
                if (hVar.f150920a) {
                    Object f = mvvmList2.mo129604f(dVar2.f106152c, hVar.f150921b, dVar);
                    return f == C15911a.COROUTINE_SUSPENDED ? f : C13598b0.f38549a;
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C103003f(MvvmList<C103001d<Object>> mvvmList, MvvmList.C94267d dVar, C15601d<? super C103003f> dVar2) {
        super(2, dVar2);
        this.f303948e = mvvmList;
        this.f303949f = dVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C103003f(this.f303948e, this.f303949f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C103003f) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f303947d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f303948e.mo129605g(true);
            if (this.f303949f == MvvmList.C94267d.RefreshAll) {
                this.f303948e.f272354p.clear();
            }
            this.f303948e.f272345d.onCreate();
            C61926c.m72668M(new C103004a(this.f303948e));
            this.f303948e.f272356r.postValue(new C91988j(C39535k.BeforeLoadPage, (C39534d) null));
            MvvmList<C103001d<Object>> mvvmList = this.f303948e;
            C54000f<T, C53998c<T>, C39534d<T>> fVar = mvvmList.f272345d;
            LifecycleScope lifecycleScope = mvvmList.f272348g;
            int size = mvvmList.f272354p.size();
            C53769h hVar = this.f303948e.f272346e;
            int i2 = hVar.f150921b;
            hVar.getClass();
            C45252f<C39534d<T>> e = fVar.mo70650e(lifecycleScope, new C53998c(size, i2, (Object) null));
            C103005b bVar = new C103005b(this.f303948e, this.f303949f);
            this.f303947d = 1;
            if (e.mo31880a(bVar, this) == aVar) {
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
