package rs1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import dp1.C58417y0;
import f14.C58901s;
import fy3.C32227p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListSet;
import je1.C46518f;
import kotlin.ResultKt;
import o40.C61926c;
import rx3.C13598b0;
import sx3.C36907w;
import te3.C49173do1;
import te3.C49712hj1;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.viewmodel.component.FinderEnhanceFeedUIC$reportUnreadFeed$2", mo125469f = "FinderEnhanceFeedUIC.kt", mo125470l = {431}, mo125471m = "invokeSuspend")
/* renamed from: rs1.z1 */
public final class C13561z1 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f38468d;

    /* renamed from: e */
    public int f38469e;

    /* renamed from: f */
    public final /* synthetic */ C13426s1 f38470f;

    /* renamed from: g */
    public final /* synthetic */ int f38471g;

    /* renamed from: h */
    public final /* synthetic */ List<FinderObject> f38472h;

    /* renamed from: i */
    public final /* synthetic */ C49712hj1 f38473i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13561z1(C13426s1 s1Var, int i, List<? extends FinderObject> list, C49712hj1 hj12, C15601d<? super C13561z1> dVar) {
        super(2, dVar);
        this.f38470f = s1Var;
        this.f38471g = i;
        this.f38472h = list;
        this.f38473i = hj12;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C13561z1(this.f38470f, this.f38471g, this.f38472h, this.f38473i, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C13561z1) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        LinkedList<C49173do1> linkedList;
        List list;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f38469e;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            LinkedList linkedList2 = new LinkedList();
            C13426s1 s1Var = this.f38470f;
            int i2 = this.f38471g;
            this.f38468d = linkedList2;
            this.f38469e = 1;
            ConcurrentSkipListSet<Long> concurrentSkipListSet = C13426s1.f38005t;
            s1Var.getClass();
            LinkedList linkedList3 = new LinkedList();
            C53896h0 h0Var = C53872d1.f151117a;
            obj2 = C53895h.m60469g(C58901s.f168555a, new C13483v1(s1Var, linkedList3, i2, (C15601d<? super C13483v1>) null), this);
            if (obj2 == aVar) {
                return aVar;
            }
            linkedList = linkedList2;
        } else if (i == 1) {
            linkedList = (LinkedList) this.f38468d;
            ResultKt.throwOnFailure(obj);
            obj2 = obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        List list2 = (List) obj2;
        List<FinderObject> list3 = this.f38472h;
        C13426s1 s1Var2 = this.f38470f;
        int i3 = this.f38471g;
        ArrayList arrayList = new ArrayList();
        for (T next : list3) {
            FinderObject finderObject = (FinderObject) next;
            Iterator it = list2.iterator();
            boolean z = false;
            int i4 = 0;
            while (true) {
                if (!it.hasNext()) {
                    list = list2;
                    i4 = -1;
                    break;
                }
                list = list2;
                if (((C49173do1) it.next()).f132446d == finderObject.f164794id) {
                    break;
                }
                i4++;
                list2 = list;
            }
            if (i4 < 0) {
                ConcurrentSkipListSet<Long> concurrentSkipListSet2 = C13426s1.f38005t;
                if (!s1Var2.mo12821g3().mo11614e3(i3, finderObject.f164794id)) {
                    z = true;
                }
            }
            if (z) {
                arrayList.add(next);
            }
            list2 = list;
        }
        C49712hj1 hj12 = this.f38473i;
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            FinderObject finderObject2 = (FinderObject) it4.next();
            C49173do1 do12 = new C49173do1();
            do12.f132446d = finderObject2.f164794id;
            do12.f132447e = finderObject2.objectNonceId;
            do12.f132449g = ((C58417y0) C86312j.m106911c(C58417y0.class)).mo83281Cu(do12.f132446d, hj12.f134675i);
            do12.f132448f = 4;
            linkedList.add(do12);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[reportUnreadFeed] (");
        sb.append(this.f38472h.size());
        sb.append(" => ");
        sb.append(linkedList.size());
        sb.append(") list=");
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(linkedList, 10));
        for (C49173do1 do13 : linkedList) {
            arrayList2.add(C61926c.m72691p(do13.f132446d));
        }
        sb.append(arrayList2);
        Log.m105924i("Finder.EnhanceFeedUIC", sb.toString());
        if (!linkedList.isEmpty()) {
            new C46518f(linkedList, this.f38473i).mo9225i();
        }
        return C13598b0.f38549a;
    }
}
