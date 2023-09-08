package com.tencent.p014mm.plugin.finder.view;

import android.view.MenuItem;
import android.view.View;
import cj1.C54795n5;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import nj3.C11184p0;
import nj3.C76912y0;
import qj1.C12322e5;
import rx3.C13598b0;
import te3.C50542nh0;
import te3.C64707sc1;

/* renamed from: com.tencent.mm.plugin.finder.view.q7 */
public final class C4158q7 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C12322e5 f18385d;

    /* renamed from: e */
    public final /* synthetic */ String f18386e;

    /* renamed from: f */
    public final /* synthetic */ View f18387f;

    /* renamed from: com.tencent.mm.plugin.finder.view.q7$a */
    public static final class C4159a extends C87413o implements C32227p<C64707sc1, C50542nh0, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ View f18388d;

        /* renamed from: e */
        public final /* synthetic */ String f18389e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4159a(View view, String str) {
            super(2);
            this.f18388d = view;
            this.f18389e = str;
        }

        public Object invoke(Object obj, Object obj2) {
            C50542nh0 nh02 = (C50542nh0) obj2;
            C87412m.m108594g((C64707sc1) obj, "req");
            C87412m.m108594g(nh02, "ret");
            if (nh02.f138603e == 0) {
                String string = this.f18388d.getContext().getResources().getString(C0966R.string.e3x);
                C87412m.m108593f(string, "root.context.resources.g…ile_join_black_list_done)");
                C76912y0.m92766e(this.f18388d.getContext(), string, C4141o7.f18363a);
                Log.m105924i("LiveCommentPopupWindowItemClick", "kicked member succ" + this.f18389e);
            } else {
                String string2 = this.f18388d.getContext().getResources().getString(C0966R.string.e3y);
                C87412m.m108593f(string2, "root.context.resources.g…ile_join_black_list_fail)");
                C76912y0.m92766e(this.f18388d.getContext(), string2, C4150p7.f18374a);
                Log.m105924i("LiveCommentPopupWindowItemClick", "kicked member failed:" + nh02.f138603e);
            }
            return C13598b0.f38549a;
        }
    }

    public C4158q7(C12322e5 e5Var, String str, View view) {
        this.f18385d = e5Var;
        this.f18386e = str;
        this.f18387f = view;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        C54795n5 D0;
        if (menuItem.getItemId() == 162 && (D0 = this.f18385d.mo14476D0()) != null) {
            String str = this.f18386e;
            D0.mo75742j0(str, new C4159a(this.f18387f, str));
        }
    }
}
