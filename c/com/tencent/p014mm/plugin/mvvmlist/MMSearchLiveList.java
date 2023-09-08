package com.tencent.p014mm.plugin.mvvmlist;

import a14.C0000n0;
import a14.C53934p0;
import a14.C53973z1;
import ac2.C39534d;
import ac2.C53997b;
import ac2.C53998c;
import ac2.C54000f;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import d14.C45252f;
import d14.C45253g;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import zb2.C103001d;
import zb2.C53769h;
import zb2.C66781o;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u0001*\u0004\b\u0001\u0010\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004BQ\u0012$\u0010\b\u001a \u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, mo182094d2 = {"Lcom/tencent/mm/plugin/mvvmlist/MMSearchLiveList;", "Lzb2/d;", "T", "Q", "Lcom/tencent/mm/plugin/mvvmlist/MvvmList;", "Lac2/f;", "Lac2/c;", "Lac2/d;", "dataSource", "Lac2/b;", "searchDataSource", "Lzb2/h;", "config", "Landroidx/lifecycle/s;", "lifecycleOwner", "<init>", "(Lac2/f;Lac2/b;Lzb2/h;Landroidx/lifecycle/s;)V", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.mvvmlist.MMSearchLiveList */
public class MMSearchLiveList<T extends C103001d<T>, Q> extends MvvmList<T> {

    /* renamed from: x */
    public final C53997b<T, Q> f163774x;

    /* renamed from: y */
    public C53973z1 f163775y;

    @C91590f(mo125468c = "com.tencent.mm.plugin.mvvmlist.MMSearchLiveList$startSearch$1", mo125469f = "MvvmSearchList.kt", mo125470l = {21}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.mvvmlist.MMSearchLiveList$a */
    public static final class C57147a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f163776d;

        /* renamed from: e */
        public final /* synthetic */ MMSearchLiveList<T, Q> f163777e;

        /* renamed from: f */
        public final /* synthetic */ Q f163778f;

        /* renamed from: com.tencent.mm.plugin.mvvmlist.MMSearchLiveList$a$a */
        public static final class C57148a<T> implements C45253g {

            /* renamed from: d */
            public final /* synthetic */ MMSearchLiveList<T, Q> f163779d;

            public C57148a(MMSearchLiveList<T, Q> mMSearchLiveList) {
                this.f163779d = mMSearchLiveList;
            }

            public Object emit(Object obj, C15601d dVar) {
                this.f163779d.mo129613q(((C39534d) obj).f106151b);
                this.f163779d.f163775y = null;
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57147a(MMSearchLiveList<T, Q> mMSearchLiveList, Q q, C15601d<? super C57147a> dVar) {
            super(2, dVar);
            this.f163777e = mMSearchLiveList;
            this.f163778f = q;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C57147a(this.f163777e, this.f163778f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C57147a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f163776d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MMSearchLiveList<T, Q> mMSearchLiveList = this.f163777e;
                C45252f<C39534d<T>> b = mMSearchLiveList.f163774x.mo70650e(mMSearchLiveList.f272348g, new C66781o(this.f163778f, 0, mMSearchLiveList.f272346e.f150921b));
                C57148a aVar2 = new C57148a(this.f163777e);
                this.f163776d = 1;
                if (b.mo31880a(aVar2, this) == aVar) {
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMSearchLiveList(C54000f<T, C53998c<T>, C39534d<T>> fVar, C53997b<T, Q> bVar, C53769h hVar, C0125s sVar) {
        super(fVar, hVar, sVar, (LifecycleScope) null, (List) null, 24, (C8480h) null);
        C87412m.m108594g(fVar, "dataSource");
        C87412m.m108594g(bVar, "searchDataSource");
        C87412m.m108594g(hVar, "config");
        C87412m.m108594g(sVar, "lifecycleOwner");
        this.f163774x = bVar;
    }

    /* renamed from: u */
    public final void mo80726u(Q q) {
        C53973z1 z1Var;
        C53973z1 z1Var2 = this.f163775y;
        boolean z = false;
        if (z1Var2 != null && z1Var2.mo74466a()) {
            z = true;
        }
        if (z && (z1Var = this.f163775y) != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        this.f163775y = LifecycleScope.launchDefault$default(this.f272348g, (C53934p0) null, new C57147a(this, q, (C15601d<? super C57147a>) null), 1, (Object) null);
    }
}
