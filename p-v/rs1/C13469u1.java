package rs1;

import a14.C0000n0;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import fy3.C32227p;
import java.util.LinkedList;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.viewmodel.component.FinderEnhanceFeedUIC$getLoaderCurrentFeeds$2", mo125469f = "FinderEnhanceFeedUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: rs1.u1 */
public final class C13469u1 extends C91594j implements C32227p<C0000n0, C15601d<? super LinkedList<C0740i2>>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C13426s1 f38174d;

    /* renamed from: e */
    public final /* synthetic */ LinkedList<C0740i2> f38175e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13469u1(C13426s1 s1Var, LinkedList<C0740i2> linkedList, C15601d<? super C13469u1> dVar) {
        super(2, dVar);
        this.f38174d = s1Var;
        this.f38175e = linkedList;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C13469u1(this.f38174d, this.f38175e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C13469u1) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        BaseFeedLoader<C0740i2> baseFeedLoader = this.f38174d.f38010h;
        if (baseFeedLoader == null) {
            return this.f38175e;
        }
        this.f38175e.addAll(baseFeedLoader.getListOfType(C0740i2.class));
        return this.f38175e;
    }
}
