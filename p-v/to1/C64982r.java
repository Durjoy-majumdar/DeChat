package to1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import com.tencent.p014mm.plugin.finder.record.plugin.FinderTemplateListPlugin;
import f14.C58901s;
import fy3.C32227p;
import gy3.C87412m;
import java.util.List;
import kotlin.ResultKt;
import rx3.C13598b0;
import te3.pr4;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.record.plugin.FinderTemplateListPlugin$requestTemplateList$1", mo125469f = "FinderTemplateListPlugin.kt", mo125470l = {204, 205}, mo125471m = "invokeSuspend")
/* renamed from: to1.r */
public final class C64982r extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f187095d;

    /* renamed from: e */
    public final /* synthetic */ FinderTemplateListPlugin f187096e;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.record.plugin.FinderTemplateListPlugin$requestTemplateList$1$1", mo125469f = "FinderTemplateListPlugin.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: to1.r$a */
    public static final class C64983a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ FinderTemplateListPlugin f187097d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64983a(FinderTemplateListPlugin finderTemplateListPlugin, C15601d<? super C64983a> dVar) {
            super(2, dVar);
            this.f187097d = finderTemplateListPlugin;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C64983a(this.f187097d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C64983a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            FinderTemplateListPlugin finderTemplateListPlugin = this.f187097d;
            C64990y yVar = finderTemplateListPlugin.f160699h;
            List<pr4> list = finderTemplateListPlugin.f160696e;
            yVar.getClass();
            C87412m.m108594g(list, "list");
            yVar.f187113d.clear();
            yVar.f187113d.addAll(list);
            this.f187097d.f160699h.notifyDataSetChanged();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: to1.r$b */
    public static final class C64984b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderTemplateListPlugin f187098d;

        public C64984b(FinderTemplateListPlugin finderTemplateListPlugin) {
            this.f187098d = finderTemplateListPlugin;
        }

        public final void run() {
            FinderTemplateListPlugin finderTemplateListPlugin = this.f187098d;
            finderTemplateListPlugin.f160698g.mo17085h0(new C52361w(finderTemplateListPlugin.f160706r));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64982r(FinderTemplateListPlugin finderTemplateListPlugin, C15601d<? super C64982r> dVar) {
        super(2, dVar);
        this.f187096e = finderTemplateListPlugin;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C64982r(this.f187096e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C64982r) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f187095d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FinderTemplateListPlugin finderTemplateListPlugin = this.f187096e;
            this.f187095d = 1;
            if (FinderTemplateListPlugin.m64384b(finderTemplateListPlugin, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            FinderTemplateListPlugin finderTemplateListPlugin2 = this.f187096e;
            finderTemplateListPlugin2.f160698g.post(new C64984b(finderTemplateListPlugin2));
            FinderTemplateListPlugin finderTemplateListPlugin3 = this.f187096e;
            finderTemplateListPlugin3.f160700i.f187106i = new C64986t(finderTemplateListPlugin3);
            return C13598b0.f38549a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C53896h0 h0Var = C53872d1.f151117a;
        C53915k2 k2Var = C58901s.f168555a;
        C64983a aVar2 = new C64983a(this.f187096e, (C15601d<? super C64983a>) null);
        this.f187095d = 2;
        if (C53895h.m60469g(k2Var, aVar2, this) == aVar) {
            return aVar;
        }
        FinderTemplateListPlugin finderTemplateListPlugin22 = this.f187096e;
        finderTemplateListPlugin22.f160698g.post(new C64984b(finderTemplateListPlugin22));
        FinderTemplateListPlugin finderTemplateListPlugin32 = this.f187096e;
        finderTemplateListPlugin32.f160700i.f187106i = new C64986t(finderTemplateListPlugin32);
        return C13598b0.f38549a;
    }
}
