package qj1;

import a14.C0000n0;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import cj1.C0581o5;
import com.tencent.p014mm.plugin.finder.view.C4061g7;
import com.tencent.p014mm.plugin.finder.view.C41573e3;
import fj1.C45795b;
import gy3.C8479f0;
import gy3.C87412m;
import jq3.C9507n;
import nj3.C11184p0;

/* renamed from: qj1.u5 */
public final class C12698u5 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C12322e5 f36381d;

    /* renamed from: e */
    public final /* synthetic */ C9507n f36382e;

    /* renamed from: f */
    public final /* synthetic */ View f36383f;

    /* renamed from: g */
    public final /* synthetic */ C0581o5 f36384g;

    /* renamed from: h */
    public final /* synthetic */ View f36385h;

    /* renamed from: i */
    public final /* synthetic */ C8479f0<Drawable> f36386i;

    public C12698u5(C12322e5 e5Var, C9507n nVar, View view, C0581o5 o5Var, View view2, C8479f0<Drawable> f0Var) {
        this.f36381d = e5Var;
        this.f36382e = nVar;
        this.f36383f = view;
        this.f36384g = o5Var;
        this.f36385h = view2;
        this.f36386i = f0Var;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        C4061g7 g7Var = C4061g7.f18189a;
        C45795b A0 = this.f36381d.mo87684A0();
        C0000n0 n0Var = this.f36382e.f29679z;
        View view = this.f36383f;
        C12322e5 e5Var = this.f36381d;
        ViewGroup viewGroup = e5Var.f166287d;
        C87412m.m108593f(menuItem, "menuItem");
        g7Var.mo4955c(1, A0, n0Var, view, e5Var, viewGroup, menuItem, i, this.f36384g);
        this.f36385h.setBackground((Drawable) this.f36386i.f27484d);
        C41573e3.f111902a.mo64658a();
    }
}
