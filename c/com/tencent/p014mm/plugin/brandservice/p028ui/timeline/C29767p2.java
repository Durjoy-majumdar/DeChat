package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44361u;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.HalfScreenWebView;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.p2 */
public final class C29767p2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ BizTestUI f80777d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29767p2(BizTestUI bizTestUI) {
        super(0);
        this.f80777d = bizTestUI;
    }

    public Object invoke() {
        BizTestUI bizTestUI = this.f80777d;
        AppCompatActivity context = this.f80777d.getContext();
        C87412m.m108593f(context, "context");
        bizTestUI.f80721f = new HalfScreenWebView(context, this.f80777d.f80722g, (MMWebView) null, new C44361u(0.0f, (String) null, false, false, -1, false, 0, false, false, 0, false, false, false, (String) null, false, 32623, (C8480h) null), 4, (C8480h) null);
        HalfScreenWebView halfScreenWebView = this.f80777d.f80721f;
        if (halfScreenWebView != null) {
            halfScreenWebView.show();
        }
        BizTestUI.m38864I7(this.f80777d);
        C61926c.m72666K(2000, new C29761o2(this.f80777d));
        return C13598b0.f38549a;
    }
}
