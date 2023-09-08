package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread;

import a14.C0000n0;
import com.tencent.p014mm.pluginsdk.model.C19428d;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import kotlin.ResultKt;
import o40.C61926c;
import rx3.C13598b0;
import te3.C118459qf;
import te3.C118474vf;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizFinderLiveBar$Companion$doGetBizFinderLives$1", mo125469f = "BizFinderLiveBar.kt", mo125470l = {319}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.offenread.a */
public final class C18438a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f51190d;

    /* renamed from: e */
    public final /* synthetic */ WeakReference<C18441b> f51191e;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.offenread.a$a */
    public static final class C18439a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ WeakReference<C18441b> f51192d;

        /* renamed from: e */
        public final /* synthetic */ LinkedList<C118459qf> f51193e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18439a(WeakReference<C18441b> weakReference, LinkedList<C118459qf> linkedList) {
            super(0);
            this.f51192d = weakReference;
            this.f51193e = linkedList;
        }

        public Object invoke() {
            C18441b bVar = this.f51192d.get();
            if (bVar != null) {
                bVar.mo23058g(this.f51193e, 1);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18438a(WeakReference<C18441b> weakReference, C15601d<? super C18438a> dVar) {
        super(2, dVar);
        this.f51191e = weakReference;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C18438a(this.f51191e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C18438a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f51190d;
        LinkedList<C118459qf> linkedList = null;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (C18441b.f51194t) {
                return C13598b0.f38549a;
            }
            C18441b.f51194t = true;
            C19428d dVar = C19428d.f54856a;
            dVar.mo25176k().encode("live_bar_list_last_refresh_time", System.currentTimeMillis());
            this.f51190d = 1;
            obj = dVar.mo25171e(2, (LinkedList<String>) null, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C118474vf vfVar = (C118474vf) obj;
        if (vfVar != null) {
            C19428d dVar2 = C19428d.f54856a;
            boolean z = C18441b.f51194t;
            dVar2.mo25163P(2, vfVar.f354497g);
            dVar2.mo25162O(2, vfVar.f354498h);
            dVar2.mo25164Q(vfVar);
        } else {
            vfVar = null;
        }
        Log.m105918d("MicroMsg.BizFinderLiveBar", "doGetBizFinderLives");
        C18441b.f51194t = false;
        if (vfVar != null) {
            linkedList = vfVar.f354494d;
        }
        if (linkedList == null) {
            return C13598b0.f38549a;
        }
        C61926c.m72668M(new C18439a(this.f51191e, linkedList));
        return C13598b0.f38549a;
    }
}
