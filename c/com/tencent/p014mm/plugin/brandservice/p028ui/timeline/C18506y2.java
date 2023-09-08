package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import a14.C0000n0;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C19613h1;
import com.tencent.p014mm.storage.C19623o0;
import com.tencent.p014mm.storage.C19627t;
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
import ky3.C88334c;
import o40.C61926c;
import qx0.C22136a;
import rx3.C13598b0;
import sx3.C64197v;
import te3.C22508lo3;
import te3.C64522lg;
import te3.C64546m72;
import te3.C64635po3;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineAdapter$Companion$getRecFeedsOnClickBack$1", mo125469f = "BizTimeLineAdapter.kt", mo125470l = {1478}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.y2 */
public final class C18506y2 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f51403d;

    /* renamed from: e */
    public final /* synthetic */ WeakReference<C18508z2> f51404e;

    /* renamed from: f */
    public final /* synthetic */ WeakReference<BizTimeLineUI> f51405f;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.y2$a */
    public static final class C18507a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ WeakReference<BizTimeLineUI> f51406d;

        /* renamed from: e */
        public final /* synthetic */ WeakReference<C18508z2> f51407e;

        /* renamed from: f */
        public final /* synthetic */ List<C22508lo3> f51408f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18507a(WeakReference<BizTimeLineUI> weakReference, WeakReference<C18508z2> weakReference2, List<? extends C22508lo3> list) {
            super(0);
            this.f51406d = weakReference;
            this.f51407e = weakReference2;
            this.f51408f = list;
        }

        public Object invoke() {
            C18508z2 z2Var;
            List<C19623o0> list;
            if (C22136a.f62623f != C22136a.f62622e) {
                C115669n.INSTANCE.idkeyStat(1590, 35, 1, false);
                Log.m105928w("MicroMsg.BizTimeLineAdapter", "getRecFeedsOnClickBack scroll after cgi back");
            } else {
                BizTimeLineUI bizTimeLineUI = this.f51406d.get();
                if (!((bizTimeLineUI != null && bizTimeLineUI.isFinishing()) || C22136a.f62624g == null || (z2Var = this.f51407e.get()) == null || (list = z2Var.f51440h) == null)) {
                    C19623o0 o0Var = C22136a.f62624g;
                    C87412m.m108591d(o0Var);
                    int indexOf = list.indexOf(o0Var);
                    int i = 0;
                    for (T next : this.f51408f) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            C19623o0 o0Var2 = new C19623o0();
                            o0Var2.f55529n1 = 2;
                            o0Var2.f55539x1 = (C22508lo3) next;
                            o0Var2.field_orderFlag = C20583z.f57954f.incrementAndGet();
                            o0Var2.f55528m1 = true;
                            list.add(i + indexOf + 1, o0Var2);
                            C22508lo3 lo32 = o0Var2.f55539x1;
                            C87412m.m108593f(lo32, "recFeed");
                            C88334c cVar = C19613h1.f55490a;
                            if (lo32.f64173f == 2003) {
                                C19627t.f55586a.mo25852z(o0Var2);
                            }
                            i = i2;
                        } else {
                            C64197v.m75542k();
                            throw null;
                        }
                    }
                    C22136a.f62624g = null;
                    C22136a.f62623f = C22136a.f62622e;
                    C18508z2 z2Var2 = this.f51407e.get();
                    if (z2Var2 != null) {
                        z2Var2.notifyDataSetChanged();
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18506y2(WeakReference<C18508z2> weakReference, WeakReference<BizTimeLineUI> weakReference2, C15601d<? super C18506y2> dVar) {
        super(2, dVar);
        this.f51404e = weakReference;
        this.f51405f = weakReference2;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C18506y2(this.f51404e, this.f51405f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C18506y2) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        LinkedList<C22508lo3> linkedList;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f51403d;
        ArrayList arrayList = null;
        boolean z = false;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C115669n nVar = C115669n.INSTANCE;
            nVar.idkeyStat(1590, 31, 1, false);
            if (C22136a.f62623f != C22136a.f62622e) {
                nVar.idkeyStat(1590, 34, 1, false);
                C22136a.f62624g = null;
                C22136a.f62623f = C22136a.f62622e;
                Log.m105928w("MicroMsg.BizTimeLineAdapter", "getRecFeedsOnClickBack scroll before cgi");
                return C13598b0.f38549a;
            }
            C20583z.C20584b bVar = C20583z.f57949a;
            C20583z.C20585c cVar = C20583z.C20585c.GET_RECOMMEND_FEEDS_SCENE_SUPPLEMENT;
            int d = bVar.mo32231d(cVar);
            if (Math.abs(System.currentTimeMillis() - C18508z2.f51411K) < ((long) d)) {
                Log.m105924i("MicroMsg.BizTimeLineAdapter", "getRecFeedsOnClickBack should not do refresh in " + d);
                C22136a.f62624g = null;
                C22136a.f62623f = C22136a.f62622e;
                return C13598b0.f38549a;
            }
            C18508z2.f51411K = System.currentTimeMillis();
            C18508z2.C18509a aVar2 = C18508z2.f51409I;
            C64635po3 po32 = new C64635po3();
            po32.f184868d = C22136a.f62625h;
            C22136a.f62625h = null;
            po32.f184869e = C20583z.f57956h;
            C20583z.f57956h = null;
            this.f51403d = 1;
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
        if (!(m722 == null || (linkedList = m722.f184214d) == null)) {
            WeakReference<C18508z2> weakReference = this.f51404e;
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
        if (arrayList == null || arrayList.isEmpty()) {
            z = true;
        }
        if (z) {
            C115669n.INSTANCE.idkeyStat(1590, 33, 1, false);
            Log.m105928w("MicroMsg.BizTimeLineAdapter", "getRecFeedsOnClickBack list is empty");
            return C13598b0.f38549a;
        }
        C115669n.INSTANCE.idkeyStat(1590, 32, 1, false);
        C61926c.m72668M(new C18507a(this.f51405f, this.f51404e, arrayList));
        return C13598b0.f38549a;
    }
}
