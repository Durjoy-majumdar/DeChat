package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import a14.C0000n0;
import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C18479j;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C19613h1;
import com.tencent.p014mm.storage.C19623o0;
import eb0.C20583z;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kotlin.ResultKt;
import o40.C61926c;
import p910lj.C76701a;
import qx0.C22136a;
import rx3.C13598b0;
import te3.C22508lo3;
import te3.C64522lg;
import te3.C64546m72;
import te3.C64635po3;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineAdapter$Companion$getFirstScreenData$1", mo125469f = "BizTimeLineAdapter.kt", mo125470l = {1362}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.v2 */
public final class C18493v2 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f51352d;

    /* renamed from: e */
    public final /* synthetic */ C20583z.C20585c f51353e;

    /* renamed from: f */
    public final /* synthetic */ C64635po3 f51354f;

    /* renamed from: g */
    public final /* synthetic */ WeakReference<BizTimeLineUI> f51355g;

    /* renamed from: h */
    public final /* synthetic */ WeakReference<C18508z2> f51356h;

    /* renamed from: i */
    public final /* synthetic */ boolean f51357i;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.v2$a */
    public static final class C18494a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ WeakReference<BizTimeLineUI> f51358d;

        /* renamed from: e */
        public final /* synthetic */ C20583z.C20585c f51359e;

        /* renamed from: f */
        public final /* synthetic */ WeakReference<C18508z2> f51360f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18494a(WeakReference<BizTimeLineUI> weakReference, C20583z.C20585c cVar, WeakReference<C18508z2> weakReference2) {
            super(0);
            this.f51358d = weakReference;
            this.f51359e = cVar;
            this.f51360f = weakReference2;
        }

        public Object invoke() {
            BizTimeLineUI bizTimeLineUI;
            C18508z2 z2Var;
            BizTimeLineUI bizTimeLineUI2 = this.f51358d.get();
            boolean z = true;
            if (bizTimeLineUI2 == null || !bizTimeLineUI2.isFinishing()) {
                z = false;
            }
            if (!z) {
                if (!(this.f51359e == C20583z.C20585c.GET_RECOMMEND_FEEDS_SCENE_REFRESH_AFTER_CLICK || (z2Var = this.f51360f.get()) == null)) {
                    C18508z2.m19167a(z2Var);
                }
                if (this.f51359e == C20583z.C20585c.GET_RECOMMEND_FEEDS_SCENE_REPLACE && (bizTimeLineUI = this.f51358d.get()) != null) {
                    C76701a.makeText((Context) bizTimeLineUI, (CharSequence) bizTimeLineUI.getString(C0966R.string.ap_), 0).show();
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.v2$b */
    public static final class C18495b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ WeakReference<BizTimeLineUI> f51361d;

        /* renamed from: e */
        public final /* synthetic */ boolean f51362e;

        /* renamed from: f */
        public final /* synthetic */ WeakReference<C18508z2> f51363f;

        /* renamed from: g */
        public final /* synthetic */ List<C22508lo3> f51364g;

        /* renamed from: h */
        public final /* synthetic */ C64546m72 f51365h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18495b(WeakReference<BizTimeLineUI> weakReference, boolean z, WeakReference<C18508z2> weakReference2, List<? extends C22508lo3> list, C64546m72 m722) {
            super(0);
            this.f51361d = weakReference;
            this.f51362e = z;
            this.f51363f = weakReference2;
            this.f51364g = list;
            this.f51365h = m722;
        }

        public Object invoke() {
            C18479j jVar;
            List<C19623o0> list;
            BizTimeLineUI bizTimeLineUI = this.f51361d.get();
            boolean z = false;
            if (bizTimeLineUI != null && bizTimeLineUI.isFinishing()) {
                z = true;
            }
            if (!z) {
                if (this.f51362e) {
                    C22136a.f62619b = true;
                }
                C18508z2 z2Var = this.f51363f.get();
                if (!(z2Var == null || (list = z2Var.f51440h) == null)) {
                    list.clear();
                }
                C18508z2 z2Var2 = this.f51363f.get();
                if (z2Var2 != null) {
                    List<C22508lo3> list2 = this.f51364g;
                    C18508z2.C18509a aVar = C18508z2.f51409I;
                    z2Var2.mo23150i(list2);
                }
                C20583z.f57949a.mo32234h(this.f51365h);
                C18508z2 z2Var3 = this.f51363f.get();
                if (!(z2Var3 == null || (jVar = z2Var3.f51445p) == null)) {
                    jVar.mo23105f();
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18493v2(C20583z.C20585c cVar, C64635po3 po32, WeakReference<BizTimeLineUI> weakReference, WeakReference<C18508z2> weakReference2, boolean z, C15601d<? super C18493v2> dVar) {
        super(2, dVar);
        this.f51353e = cVar;
        this.f51354f = po32;
        this.f51355g = weakReference;
        this.f51356h = weakReference2;
        this.f51357i = z;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C18493v2(this.f51353e, this.f51354f, this.f51355g, this.f51356h, this.f51357i, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C18493v2) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        ArrayList arrayList;
        LinkedList<C22508lo3> linkedList;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f51352d;
        boolean z = true;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (C18508z2.f51427x0) {
                return C13598b0.f38549a;
            }
            C18508z2.f51427x0 = true;
            C115669n.INSTANCE.idkeyStat(1590, this.f51353e == C20583z.C20585c.GET_RECOMMEND_FEEDS_SCENE_ENTER ? 0 : 5, 1, false);
            C20583z.C20584b bVar = C20583z.f57949a;
            C20583z.C20585c cVar = this.f51353e;
            C64635po3 po32 = this.f51354f;
            this.f51352d = 1;
            obj2 = C20583z.C20584b.m22405e(bVar, cVar, po32, (C64522lg) null, this, 4, (Object) null);
            if (obj2 == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
            obj2 = obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C64546m72 m722 = (C64546m72) obj2;
        C18508z2.f51427x0 = false;
        if (m722 == null || (linkedList = m722.f184214d) == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (T next : linkedList) {
                C22508lo3 lo32 = (C22508lo3) next;
                C87412m.m108593f(lo32, LocaleUtil.ITALIAN);
                if (C19613h1.m21044q(lo32)) {
                    arrayList2.add(next);
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            z = false;
        }
        if (z) {
            Log.m105928w("MicroMsg.BizTimeLineAdapter", "initRecommendFeeds list is empty");
            C61926c.m72668M(new C18494a(this.f51355g, this.f51353e, this.f51356h));
        } else {
            C61926c.m72668M(new C18495b(this.f51355g, this.f51357i, this.f51356h, arrayList, m722));
        }
        return C13598b0.f38549a;
    }
}
