package to1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import com.tencent.p014mm.plugin.finder.record.plugin.FinderTemplateListPlugin;
import com.tencent.p014mm.sdk.platformtools.Log;
import da0.C58247e;
import di3.C86312j;
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

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.record.plugin.FinderTemplateListPlugin$requestSpecialTemplate$1", mo125469f = "FinderTemplateListPlugin.kt", mo125470l = {224, 226}, mo125471m = "invokeSuspend")
/* renamed from: to1.p */
public final class C64978p extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f187086d;

    /* renamed from: e */
    public final /* synthetic */ String f187087e;

    /* renamed from: f */
    public final /* synthetic */ FinderTemplateListPlugin f187088f;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.record.plugin.FinderTemplateListPlugin$requestSpecialTemplate$1$1", mo125469f = "FinderTemplateListPlugin.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: to1.p$a */
    public static final class C64979a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ FinderTemplateListPlugin f187089d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64979a(FinderTemplateListPlugin finderTemplateListPlugin, C15601d<? super C64979a> dVar) {
            super(2, dVar);
            this.f187089d = finderTemplateListPlugin;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C64979a(this.f187089d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C64979a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            FinderTemplateListPlugin finderTemplateListPlugin = this.f187089d;
            C64990y yVar = finderTemplateListPlugin.f160699h;
            List<pr4> list = finderTemplateListPlugin.f160696e;
            yVar.getClass();
            C87412m.m108594g(list, "list");
            yVar.f187113d.clear();
            yVar.f187113d.addAll(list);
            this.f187089d.f160699h.notifyDataSetChanged();
            this.f187089d.mo78563c(0);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: to1.p$b */
    public static final class C64980b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderTemplateListPlugin f187090d;

        public C64980b(FinderTemplateListPlugin finderTemplateListPlugin) {
            this.f187090d = finderTemplateListPlugin;
        }

        public final void run() {
            FinderTemplateListPlugin finderTemplateListPlugin = this.f187090d;
            finderTemplateListPlugin.f160698g.mo17085h0(new C52361w(finderTemplateListPlugin.f160706r));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64978p(String str, FinderTemplateListPlugin finderTemplateListPlugin, C15601d<? super C64978p> dVar) {
        super(2, dVar);
        this.f187087e = str;
        this.f187088f = finderTemplateListPlugin;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C64978p(this.f187087e, this.f187088f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C64978p) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f187086d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            pr4 fB = ((C58247e) C86312j.m106911c(C58247e.class)).mo82989fB(this.f187087e);
            if (fB != null) {
                this.f187088f.f160696e.clear();
                this.f187088f.f160696e.add(fB);
                Log.m105924i("MicroMsg.FinderTemplateListPlugin", "template from preload,id:" + fB.f139919d + " type:" + fB.f139920e + " name:" + fB.f139922g.f143760d);
            } else {
                FinderTemplateListPlugin finderTemplateListPlugin = this.f187088f;
                String str = this.f187087e;
                this.f187086d = 1;
                if (FinderTemplateListPlugin.m64383a(finderTemplateListPlugin, str, this) == aVar) {
                    return aVar;
                }
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            FinderTemplateListPlugin finderTemplateListPlugin2 = this.f187088f;
            finderTemplateListPlugin2.f160698g.post(new C64980b(finderTemplateListPlugin2));
            return C13598b0.f38549a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C53896h0 h0Var = C53872d1.f151117a;
        C53915k2 k2Var = C58901s.f168555a;
        C64979a aVar2 = new C64979a(this.f187088f, (C15601d<? super C64979a>) null);
        this.f187086d = 2;
        if (C53895h.m60469g(k2Var, aVar2, this) == aVar) {
            return aVar;
        }
        FinderTemplateListPlugin finderTemplateListPlugin22 = this.f187088f;
        finderTemplateListPlugin22.f160698g.post(new C64980b(finderTemplateListPlugin22));
        return C13598b0.f38549a;
    }
}
