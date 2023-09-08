package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import al3.C0086a;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87413o;
import qo3.C77389a;
import qo3.C77398g;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.j2 */
public final class C40690j2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ BizTestUI f109309d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40690j2(BizTestUI bizTestUI) {
        super(0);
        this.f109309d = bizTestUI;
    }

    public Object invoke() {
        AppCompatActivity context = this.f109309d.getContext();
        C77389a aVar = new C77389a();
        aVar.f225649f = true;
        aVar.f225647d = this.f109309d.f80722g;
        aVar.f225644a = "请输入链接";
        aVar.f225663t = C0086a.m38a(context).getString(C0966R.string.a18);
        aVar.f225664u = C0086a.m38a(context).getString(C0966R.string.f7926wf);
        aVar.f225620C = new C29741i2(this.f109309d);
        C77398g gVar = new C77398g(context, C0966R.style.a66);
        gVar.mo107525e(aVar);
        gVar.show();
        return C13598b0.f38549a;
    }
}
