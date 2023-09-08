package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.k2 */
public final class C68651k2 {
    /* renamed from: a */
    public static void m80887a(View view, AppBrandCircleProgressView appBrandCircleProgressView, TextView textView) {
        ViewGroup.LayoutParams layoutParams = appBrandCircleProgressView.getLayoutParams();
        layoutParams.width = C76577a.m92157h(MMApplicationContext.getContext(), C0966R.dimen.f3761db);
        layoutParams.height = C76577a.m92157h(MMApplicationContext.getContext(), C0966R.dimen.f3761db);
        appBrandCircleProgressView.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        layoutParams2.width = C76577a.m92157h(MMApplicationContext.getContext(), C0966R.dimen.f3755d6);
        layoutParams2.height = C76577a.m92157h(MMApplicationContext.getContext(), C0966R.dimen.f3755d6);
        view.requestLayout();
        textView.setTextSize(0, (float) C76577a.m92157h(MMApplicationContext.getContext(), C0966R.dimen.f3619c));
    }
}
