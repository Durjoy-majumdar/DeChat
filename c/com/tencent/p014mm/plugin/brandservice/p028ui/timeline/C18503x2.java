package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import a14.C0000n0;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C18479j;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C20583z;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kotlin.ResultKt;
import o40.C61926c;
import rx3.C13598b0;
import te3.C22508lo3;
import te3.C64522lg;
import te3.C64546m72;
import te3.C64635po3;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineAdapter$Companion$getMoreRecommendFeeds$2", mo125469f = "BizTimeLineAdapter.kt", mo125470l = {1416}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.x2 */
public final class C18503x2 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f51394d;

    /* renamed from: e */
    public final /* synthetic */ WeakReference<C18508z2> f51395e;

    /* renamed from: f */
    public final /* synthetic */ WeakReference<BizTimeLineUI> f51396f;

    /* renamed from: g */
    public final /* synthetic */ C64522lg f51397g;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.x2$a */
    public static final class C18504a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ WeakReference<BizTimeLineUI> f51398d;

        /* renamed from: e */
        public final /* synthetic */ WeakReference<C18508z2> f51399e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18504a(WeakReference<BizTimeLineUI> weakReference, WeakReference<C18508z2> weakReference2) {
            super(0);
            this.f51398d = weakReference;
            this.f51399e = weakReference2;
        }

        public Object invoke() {
            BizTimeLineUI bizTimeLineUI = this.f51398d.get();
            boolean z = true;
            if (bizTimeLineUI == null || !bizTimeLineUI.isFinishing()) {
                z = false;
            }
            if (!z) {
                C18508z2 z2Var = this.f51399e.get();
                if (z2Var != null) {
                    C18508z2.m19167a(z2Var);
                }
                C18508z2 z2Var2 = this.f51399e.get();
                if (z2Var2 != null) {
                    z2Var2.f51435H = false;
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.x2$b */
    public static final class C18505b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ WeakReference<BizTimeLineUI> f51400d;

        /* renamed from: e */
        public final /* synthetic */ WeakReference<C18508z2> f51401e;

        /* renamed from: f */
        public final /* synthetic */ List<C22508lo3> f51402f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18505b(WeakReference<BizTimeLineUI> weakReference, WeakReference<C18508z2> weakReference2, List<? extends C22508lo3> list) {
            super(0);
            this.f51400d = weakReference;
            this.f51401e = weakReference2;
            this.f51402f = list;
        }

        public Object invoke() {
            C18479j jVar;
            BizTimeLineUI bizTimeLineUI = this.f51400d.get();
            boolean z = true;
            if (bizTimeLineUI == null || !bizTimeLineUI.isFinishing()) {
                z = false;
            }
            if (!z) {
                C18508z2 z2Var = this.f51401e.get();
                if (z2Var != null) {
                    List<C22508lo3> list = this.f51402f;
                    C18508z2.C18509a aVar = C18508z2.f51409I;
                    z2Var.mo23150i(list);
                }
                C18508z2 z2Var2 = this.f51401e.get();
                if (!(z2Var2 == null || (jVar = z2Var2.f51445p) == null)) {
                    jVar.mo23105f();
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18503x2(WeakReference<C18508z2> weakReference, WeakReference<BizTimeLineUI> weakReference2, C64522lg lgVar, C15601d<? super C18503x2> dVar) {
        super(2, dVar);
        this.f51395e = weakReference;
        this.f51396f = weakReference2;
        this.f51397g = lgVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C18503x2(this.f51395e, this.f51396f, this.f51397g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C18503x2) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        LinkedList<C22508lo3> linkedList;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f51394d;
        boolean z = true;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C115669n.INSTANCE.idkeyStat(1590, 1, 1, false);
            if (this.f51395e.get() == null) {
                return C13598b0.f38549a;
            }
            if (this.f51396f.get() == null) {
                return C13598b0.f38549a;
            }
            C20583z.C20584b bVar = C20583z.f57949a;
            C20583z.C20585c cVar = C20583z.C20585c.GET_RECOMMEND_FEEDS_SCENE_LOAD_MORE;
            C64522lg lgVar = this.f51397g;
            this.f51394d = 1;
            obj = C20583z.C20584b.m22405e(bVar, cVar, (C64635po3) null, lgVar, this, 2, (Object) null);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C64546m72 m722 = (C64546m72) obj;
        ArrayList arrayList = null;
        if (!(m722 == null || (linkedList = m722.f184214d) == null)) {
            WeakReference<C18508z2> weakReference = this.f51395e;
            ArrayList arrayList2 = new ArrayList();
            for (T next : linkedList) {
                C22508lo3 lo32 = (C22508lo3) next;
                C20583z.C20584b bVar2 = C20583z.f57949a;
                C18508z2 z2Var = weakReference.get();
                if (bVar2.mo32228a(lo32, z2Var != null ? z2Var.f51440h : null)) {
                    arrayList2.add(next);
                }
            }
            arrayList = arrayList2;
        }
        C18508z2.f51426p0 = false;
        if (arrayList != null && !arrayList.isEmpty()) {
            z = false;
        }
        if (z) {
            Log.m105928w("MicroMsg.BizTimeLineAdapter", "getMoreRecommendFeeds list is empty");
            C61926c.m72668M(new C18504a(this.f51396f, this.f51395e));
        } else {
            C61926c.m72668M(new C18505b(this.f51396f, this.f51395e, arrayList));
        }
        return C13598b0.f38549a;
    }
}
