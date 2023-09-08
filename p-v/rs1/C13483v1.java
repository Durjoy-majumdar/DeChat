package rs1;

import a14.C0000n0;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import er1.C58784w3;
import fy3.C32227p;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kotlin.ResultKt;
import rx3.C13598b0;
import sx3.C36907w;
import te3.C49173do1;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.viewmodel.component.FinderEnhanceFeedUIC$getLoaderCurrentUnreadFeeds$2", mo125469f = "FinderEnhanceFeedUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: rs1.v1 */
public final class C13483v1 extends C91594j implements C32227p<C0000n0, C15601d<? super List<? extends C49173do1>>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C13426s1 f38203d;

    /* renamed from: e */
    public final /* synthetic */ LinkedList<C49173do1> f38204e;

    /* renamed from: f */
    public final /* synthetic */ int f38205f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13483v1(C13426s1 s1Var, LinkedList<C49173do1> linkedList, int i, C15601d<? super C13483v1> dVar) {
        super(2, dVar);
        this.f38203d = s1Var;
        this.f38204e = linkedList;
        this.f38205f = i;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C13483v1(this.f38203d, this.f38204e, this.f38205f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C13483v1) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        Class<BaseFinderFeed> cls = BaseFinderFeed.class;
        ResultKt.throwOnFailure(obj);
        BaseFeedLoader<C0740i2> baseFeedLoader = this.f38203d.f38010h;
        if (baseFeedLoader == null) {
            return this.f38204e;
        }
        List<E> listOfType = baseFeedLoader.getListOfType(cls);
        C58784w3 w3Var = C58784w3.f168295a;
        listOfType.addAll(w3Var.mo83922d0(baseFeedLoader.getDataList().getBuffer(), cls));
        LinkedList<C49173do1> linkedList = this.f38204e;
        List<BaseFinderFeed> u0 = w3Var.mo83968u0(listOfType, this.f38205f);
        int i = this.f38205f;
        ArrayList arrayList = new ArrayList(C36907w.m41090l(u0, 10));
        for (BaseFinderFeed o : u0) {
            FinderObject finderObject = o.mo3513o().getFinderObject();
            C49173do1 do12 = new C49173do1();
            do12.f132446d = finderObject.f164794id;
            do12.f132447e = finderObject.objectNonceId;
            do12.f132448f = i;
            arrayList.add(do12);
        }
        linkedList.addAll(arrayList);
        LinkedList<C49173do1> linkedList2 = this.f38204e;
        C13426s1 s1Var = this.f38203d;
        int i2 = this.f38205f;
        ArrayList arrayList2 = new ArrayList();
        for (T next : linkedList2) {
            if (!s1Var.mo12821g3().mo11614e3(i2, ((C49173do1) next).f132446d)) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }
}
