package to1;

import com.tencent.p014mm.plugin.finder.record.plugin.FinderTemplateListPlugin;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.record.plugin.FinderTemplateListPlugin", mo125469f = "FinderTemplateListPlugin.kt", mo125470l = {261}, mo125471m = "requestSpecialTemplateCGI")
/* renamed from: to1.q */
public final class C64981q extends C66704d {

    /* renamed from: d */
    public Object f187091d;

    /* renamed from: e */
    public /* synthetic */ Object f187092e;

    /* renamed from: f */
    public final /* synthetic */ FinderTemplateListPlugin f187093f;

    /* renamed from: g */
    public int f187094g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64981q(FinderTemplateListPlugin finderTemplateListPlugin, C15601d<? super C64981q> dVar) {
        super(dVar);
        this.f187093f = finderTemplateListPlugin;
    }

    public final Object invokeSuspend(Object obj) {
        this.f187092e = obj;
        this.f187094g |= Integer.MIN_VALUE;
        return FinderTemplateListPlugin.m64383a(this.f187093f, (String) null, this);
    }
}
