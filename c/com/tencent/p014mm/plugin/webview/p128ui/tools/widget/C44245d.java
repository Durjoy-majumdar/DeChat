package com.tencent.p014mm.plugin.webview.p128ui.tools.widget;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.plugin.webview.core.BaseWebViewController;
import ea3.C58536w;
import ex0.C45696d;
import f40.C86709a0;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import kg3.C76577a;
import nj3.C11182m0;
import nj3.C76874e0;
import qo3.C77407n;
import rx3.C13598b0;
import wc3.C15133e0;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.d */
public final class C44245d implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C15133e0 f119897d;

    /* renamed from: e */
    public final /* synthetic */ Context f119898e;

    /* renamed from: f */
    public final /* synthetic */ C77407n f119899f;

    /* renamed from: g */
    public final /* synthetic */ BaseWebViewController f119900g;

    /* renamed from: h */
    public final /* synthetic */ C58536w f119901h;

    /* renamed from: i */
    public final /* synthetic */ View f119902i;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.d$a */
    public static final class C44246a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ View f119903d;

        /* renamed from: e */
        public final /* synthetic */ C77407n f119904e;

        /* renamed from: f */
        public final /* synthetic */ Context f119905f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44246a(View view, C77407n nVar, Context context) {
            super(1);
            this.f119903d = view;
            this.f119904e = nVar;
            this.f119905f = context;
        }

        public Object invoke(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                View view = this.f119903d;
                if (view != null) {
                    C87412m.m108591d(view);
                    int paddingLeft = view.getPaddingLeft();
                    View view2 = this.f119903d;
                    C87412m.m108591d(view2);
                    int paddingTop = view2.getPaddingTop();
                    View view3 = this.f119903d;
                    C87412m.m108591d(view3);
                    view.setPadding(paddingLeft, paddingTop, view3.getPaddingRight(), 0);
                    C77407n nVar = this.f119904e;
                    C87412m.m108591d(nVar);
                    if (nVar.f225732J.size() > 0 && nVar.f225745T0 == null) {
                        nVar.mo107561f();
                        nVar.mo107557b(0);
                    }
                } else {
                    C77407n nVar2 = this.f119904e;
                    C87412m.m108591d(nVar2);
                    int b = C76577a.m92151b(this.f119905f, 4);
                    TextView textView = nVar2.f225768g1;
                    if (textView != null) {
                        textView.setPadding(textView.getPaddingLeft(), nVar2.f225768g1.getPaddingTop(), nVar2.f225768g1.getPaddingRight(), b);
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    public C44245d(C15133e0 e0Var, Context context, C77407n nVar, BaseWebViewController baseWebViewController, C58536w wVar, View view) {
        this.f119897d = e0Var;
        this.f119898e = context;
        this.f119899f = nVar;
        this.f119900g = baseWebViewController;
        this.f119901h = wVar;
        this.f119902i = view;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        C15133e0 e0Var2 = this.f119897d;
        Context context = this.f119898e;
        C87412m.m108593f(e0Var, "menu");
        C77407n nVar = this.f119899f;
        C87412m.m108591d(nVar);
        e0Var2.mo14095wW(context, e0Var, nVar, 3, new C44246a(this.f119902i, this.f119899f, this.f119898e));
        String n0 = this.f119900g.mo63683n0();
        this.f119901h.f167571c = ((C45696d) C86709a0.m107533q(C45696d.class)).B60(n0);
    }
}
