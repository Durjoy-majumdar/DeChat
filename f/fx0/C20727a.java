package fx0;

import a14.C0000n0;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.C18440a0;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.C18468r;
import com.tencent.p014mm.pluginsdk.model.C19428d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8477a0;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.ResultKt;
import o40.C61926c;
import rx3.C13598b0;
import te3.C118459qf;
import te3.C118474vf;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112551y;

@C91590f(mo125468c = "com.tencent.mm.plugin.brandservice.model.BizFinderLiveUILogic$checkOftenRead$1", mo125469f = "BizFinderLiveUILogic.kt", mo125470l = {151}, mo125471m = "invokeSuspend")
/* renamed from: fx0.a */
public final class C20727a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f58593d;

    /* renamed from: e */
    public int f58594e;

    /* renamed from: f */
    public final /* synthetic */ CopyOnWriteArrayList<C18468r> f58595f;

    /* renamed from: g */
    public final /* synthetic */ WeakReference<C18440a0> f58596g;

    /* renamed from: fx0.a$a */
    public static final class C20728a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ WeakReference<C18440a0> f58597d;

        /* renamed from: e */
        public final /* synthetic */ LinkedList<String> f58598e;

        /* renamed from: f */
        public final /* synthetic */ HashMap<String, String> f58599f;

        /* renamed from: g */
        public final /* synthetic */ CopyOnWriteArrayList<C18468r> f58600g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20728a(WeakReference<C18440a0> weakReference, LinkedList<String> linkedList, HashMap<String, String> hashMap, CopyOnWriteArrayList<C18468r> copyOnWriteArrayList) {
            super(0);
            this.f58597d = weakReference;
            this.f58598e = linkedList;
            this.f58599f = hashMap;
            this.f58600g = copyOnWriteArrayList;
        }

        public Object invoke() {
            T t;
            C18440a0 a0Var = this.f58597d.get();
            if (a0Var != null) {
                HashMap<String, String> hashMap = this.f58599f;
                CopyOnWriteArrayList<C18468r> copyOnWriteArrayList = this.f58600g;
                for (Map.Entry next : hashMap.entrySet()) {
                    Iterator<T> it = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it.next();
                        if (C87412m.m108589b(((C18468r) t).f354229d, next.getKey())) {
                            break;
                        }
                    }
                    C18468r rVar = (C18468r) t;
                    if (rVar != null) {
                        rVar.f354232g = (String) next.getValue();
                        CharSequence charSequence = (CharSequence) next.getValue();
                        if (!(charSequence == null || C112551y.m153811k(charSequence))) {
                            rVar.f51254r = -1;
                        }
                    }
                }
                a0Var.mo23045w0();
            }
            Log.m105924i("MicroMsg.BizFinderLiveUILogic", "checkOftenRead data change list size = " + this.f58598e.size());
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20727a(CopyOnWriteArrayList<C18468r> copyOnWriteArrayList, WeakReference<C18440a0> weakReference, C15601d<? super C20727a> dVar) {
        super(2, dVar);
        this.f58595f = copyOnWriteArrayList;
        this.f58596g = weakReference;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C20727a(this.f58595f, this.f58596g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C20727a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        LinkedList linkedList;
        LinkedList<C118459qf> linkedList2;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f58594e;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            LinkedList linkedList3 = new LinkedList();
            for (C18468r rVar : this.f58595f) {
                if (C19428d.f54856a.mo25165R(rVar.f354229d)) {
                    linkedList3.add(rVar.f354229d);
                }
            }
            Log.m105918d("MicroMsg.BizFinderLiveUILogic", "checkOftenRead size = " + linkedList3.size());
            if (!Util.isNullOrNil((List) linkedList3)) {
                if (C20729b.f58603c) {
                    return C13598b0.f38549a;
                }
                C20729b.f58603c = true;
                C19428d dVar = C19428d.f54856a;
                this.f58593d = linkedList3;
                this.f58594e = 1;
                Object e = dVar.mo25171e(1, linkedList3, this);
                if (e == aVar) {
                    return aVar;
                }
                linkedList = linkedList3;
                obj = e;
            }
            return C13598b0.f38549a;
        } else if (i == 1) {
            linkedList = (LinkedList) this.f58593d;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C118474vf vfVar = (C118474vf) obj;
        C20729b.f58603c = false;
        C8477a0 a0Var = new C8477a0();
        HashMap hashMap = new HashMap();
        if (!(vfVar == null || (linkedList2 = vfVar.f354494d) == null)) {
            for (C118459qf qfVar : linkedList2) {
                C19428d dVar2 = C19428d.f54856a;
                if (dVar2.mo25182q(qfVar.f354270d, qfVar.f354271e)) {
                    a0Var.f27482d = true;
                    StringBuilder sb = new StringBuilder();
                    sb.append("checkOftenRead data change userName=");
                    sb.append(qfVar.f354270d);
                    sb.append(" isLive=");
                    String str = qfVar.f354271e;
                    sb.append(!(str == null || C112551y.m153811k(str)));
                    Log.m105924i("MicroMsg.BizFinderLiveUILogic", sb.toString());
                    String str2 = qfVar.f354270d;
                    C87412m.m108593f(str2, "info.bizusername");
                    hashMap.put(str2, qfVar.f354271e);
                    dVar2.mo25153F(qfVar.f354270d, qfVar.f354271e, 1);
                }
                dVar2.mo25159L(qfVar);
            }
        }
        if (a0Var.f27482d) {
            C61926c.m72668M(new C20728a(this.f58596g, linkedList, hashMap, this.f58595f));
        }
        return C13598b0.f38549a;
    }
}
