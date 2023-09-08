package ku2;

import com.tencent.p014mm.plugin.sns.p106ui.improve.view.ImproveContentView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

@C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView", mo125469f = "ImproveContentView.kt", mo125470l = {255}, mo125471m = "showNormal")
/* renamed from: ku2.a */
public final class C99242a extends C66704d {

    /* renamed from: d */
    public Object f290979d;

    /* renamed from: e */
    public /* synthetic */ Object f290980e;

    /* renamed from: f */
    public final /* synthetic */ ImproveContentView f290981f;

    /* renamed from: g */
    public int f290982g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99242a(ImproveContentView improveContentView, C15601d<? super C99242a> dVar) {
        super(dVar);
        this.f290981f = improveContentView;
    }

    public final Object invokeSuspend(Object obj) {
        SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$showNormal$1");
        this.f290980e = obj;
        this.f290982g |= Integer.MIN_VALUE;
        Object l = ImproveContentView.m122755l(this.f290981f, false, this);
        SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$showNormal$1");
        return l;
    }
}
