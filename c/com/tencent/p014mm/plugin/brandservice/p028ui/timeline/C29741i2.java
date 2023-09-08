package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import android.content.DialogInterface;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44361u;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.HalfScreenWebView;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import qo3.C77398g;
import rx3.C13598b0;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.i2 */
public final class C29741i2 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BizTestUI f80747d;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.i2$a */
    public static final class C29742a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ BizTestUI f80748d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29742a(BizTestUI bizTestUI) {
            super(0);
            this.f80748d = bizTestUI;
        }

        public Object invoke() {
            BizTestUI bizTestUI = this.f80748d;
            int i = BizTestUI.f80718h;
            bizTestUI.mo56911L7();
            return C13598b0.f38549a;
        }
    }

    public C29741i2(BizTestUI bizTestUI) {
        this.f80747d = bizTestUI;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DialogInterface dialogInterface2 = dialogInterface;
        String str = null;
        C77398g gVar = dialogInterface2 instanceof C77398g ? (C77398g) dialogInterface2 : null;
        if (gVar != null) {
            str = gVar.mo107527g();
        }
        if (str == null) {
            str = "";
        }
        if (!C112551y.m153811k(str)) {
            BizTestUI bizTestUI = this.f80747d;
            bizTestUI.getClass();
            bizTestUI.f80722g = str;
            BizTestUI bizTestUI2 = this.f80747d;
            bizTestUI2.f80720e.encode("HalfscreenWebViewTestUrl", bizTestUI2.f80722g);
        }
        BizTestUI bizTestUI3 = this.f80747d;
        AppCompatActivity context = this.f80747d.getContext();
        C87412m.m108593f(context, "context");
        if (!C112550d0.m153801u(str, "http", false) && !C112550d0.m153801u(str, "www", false)) {
            str = this.f80747d.f80722g;
        }
        bizTestUI3.f80721f = new HalfScreenWebView(context, str, (MMWebView) null, new C44361u(0.0f, (String) null, false, false, 0, false, 0, false, false, 0, false, true, true, (String) null, false, 26623, (C8480h) null), 4, (C8480h) null);
        BizTestUI.m38864I7(this.f80747d);
        HalfScreenWebView halfScreenWebView = this.f80747d.f80721f;
        if (halfScreenWebView != null) {
            halfScreenWebView.show();
        }
        C61926c.m72666K(2000, new C29742a(this.f80747d));
    }
}
