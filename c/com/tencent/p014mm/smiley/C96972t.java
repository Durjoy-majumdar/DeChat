package com.tencent.p014mm.smiley;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.smiley.C96940i;
import gy3.C8478d0;
import gy3.C87412m;

/* renamed from: com.tencent.mm.smiley.t */
public final class C96972t implements C96975y {

    /* renamed from: a */
    public final /* synthetic */ StringBuilder f284091a;

    /* renamed from: b */
    public final /* synthetic */ String f284092b;

    /* renamed from: c */
    public final /* synthetic */ C8478d0 f284093c;

    /* renamed from: d */
    public final /* synthetic */ C96965r f284094d;

    public C96972t(StringBuilder sb, String str, C8478d0 d0Var, C96965r rVar) {
        this.f284091a = sb;
        this.f284092b = str;
        this.f284093c = d0Var;
        this.f284094d = rVar;
    }

    /* renamed from: a */
    public boolean mo135526a(C96974x xVar, int i, int i2) {
        C87412m.m108594g(xVar, "item");
        if (xVar instanceof C96973t0) {
            this.f284091a.append(this.f284092b, this.f284093c.f27483d, i);
            C96965r rVar = this.f284094d;
            int i3 = ((C96973t0) xVar).f284095a.f283953d;
            rVar.getClass();
            C96971s0 s0Var = C96940i.C96942b.f283995a.f283991b.get(i3, (Object) null);
            String str = C96940i.C96942b.f283995a.f283993d.get(s0Var != null ? s0Var.f284088d : 0, (Object) null);
            if (str != null) {
                this.f284091a.append(str);
            } else {
                this.f284091a.append(MMApplicationContext.getContext().getString(C0966R.string.f7958xg));
            }
            this.f284093c.f27483d = i2;
        }
        return false;
    }
}
