package to1;

import com.tencent.p014mm.plugin.finder.record.plugin.FinderTemplateListPlugin;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.record.plugin.FinderTemplateListPlugin", mo125469f = "FinderTemplateListPlugin.kt", mo125470l = {240}, mo125471m = "requestTemplateListCGI")
/* renamed from: to1.s */
public final class C64985s extends C66704d {

    /* renamed from: d */
    public Object f187099d;

    /* renamed from: e */
    public /* synthetic */ Object f187100e;

    /* renamed from: f */
    public final /* synthetic */ FinderTemplateListPlugin f187101f;

    /* renamed from: g */
    public int f187102g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64985s(FinderTemplateListPlugin finderTemplateListPlugin, C15601d<? super C64985s> dVar) {
        super(dVar);
        this.f187101f = finderTemplateListPlugin;
    }

    public final Object invokeSuspend(Object obj) {
        this.f187100e = obj;
        this.f187102g |= Integer.MIN_VALUE;
        return FinderTemplateListPlugin.m64384b(this.f187101f, this);
    }
}
