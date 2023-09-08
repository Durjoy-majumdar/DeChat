package com.tencent.p014mm.plugin.appbrand.luggage.customize;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.smiley.C96973t0;
import di3.C86312j;
import gy3.C87412m;
import mt0.C88846b;
import p008bq.C54532p1;
import p008bq.C92292x0;

/* renamed from: com.tencent.mm.plugin.appbrand.luggage.customize.d */
public final class C92907d implements C88846b {

    /* renamed from: d */
    public static final C92907d f267597d = new C92907d();

    /* renamed from: B */
    public C88846b.C88847a mo123235B(int i) {
        Class cls = C92292x0.class;
        C96973t0 B = ((C92292x0) C86312j.m106911c(cls)).mo126024k0().mo126275B(i);
        if (B == null) {
            return null;
        }
        C88846b.C88847a aVar = new C88846b.C88847a();
        int[] iArr = B.f284096b;
        if (iArr.length > 0) {
            aVar.f256276a = iArr[0];
        }
        if (iArr.length > 1) {
            aVar.f256277b = iArr[1];
        }
        ((C92292x0) C86312j.m106911c(cls)).mo126024k0().mo126278E(B);
        return aVar;
    }

    public Spannable qu0(Context context, Spannable spannable, int i, PInt pInt, Spannable.Factory factory) {
        Class cls = C92292x0.class;
        C87412m.m108594g(factory, "factory");
        Spannable C = ((C92292x0) C86312j.m106911c(cls)).mo126024k0().mo126276C(context, spannable, pInt, factory);
        ((C92292x0) C86312j.m106911c(cls)).mo126021Ii().mo126269a(C);
        return C;
    }

    public SpannableString r90(Context context, CharSequence charSequence, float f) {
        SpannableString M = ((C54532p1) C86312j.m106911c(C54532p1.class)).mo55776j().mo75395M(context, charSequence);
        C87412m.m108593f(M, "getService(ISmileyManage…ileySpan(context, source)");
        return M;
    }
}
