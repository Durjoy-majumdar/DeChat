package com.tencent.p014mm.plugin.emoji.p040ui;

import android.content.Context;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import java.util.ArrayList;
import p629ny.C76979h;
import qo3.C101218e0;
import rx3.C13598b0;
import sx3.C64197v;

/* renamed from: com.tencent.mm.plugin.emoji.ui.c1 */
public final class C2212c1 {
    /* renamed from: a */
    public static final void m2042a(Context context, C32224a<C13598b0> aVar, C32224a<C13598b0> aVar2) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(aVar, "onAccepted");
        C87412m.m108594g(aVar2, "onRejected");
        C85801v1 i = C86709a0.m107535s().mo121142i();
        C101218e0 e0Var = new C101218e0(context, 0, 0, false);
        e0Var.mo140662i(C0966R.C0971layout.cod);
        e0Var.f296384g.findViewById(C0966R.C0970id.mgu).setOnClickListener(new C2210a1(i, e0Var, aVar2));
        e0Var.f296384g.findViewById(C0966R.C0970id.f357444hl3).setOnClickListener(new C2211b1(i, e0Var, aVar));
        TextView textView = (TextView) e0Var.f296384g.findViewById(C0966R.C0970id.mgr);
        ArrayList arrayList = new ArrayList();
        if (C87412m.m108589b("zh_CN", LocaleUtil.getCurrentLanguage(context))) {
            String string = context.getResources().getString(C0966R.string.ip4);
            C87412m.m108593f(string, "context.resources.getStr…at_privary_guide_link_zh)");
            arrayList.add(string);
        } else {
            String string2 = context.getResources().getString(C0966R.string.f361288ip3);
            C87412m.m108593f(string2, "context.resources.getStr…echat_privary_guide_link)");
            arrayList.add(string2);
        }
        Context context2 = context;
        ((C76979h) C86312j.m106911c(C76979h.class)).mo107047GG(context2, arrayList, textView.getText().toString(), C64197v.m75539h(textView.getText().toString()), textView);
        e0Var.mo140655A();
    }
}
