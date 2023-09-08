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

/* renamed from: qj1.w5 */
public final class C12727w5 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C12322e5 f36460d;

    /* renamed from: e */
    public final /* synthetic */ C9507n f36461e;

    /* renamed from: f */
    public final /* synthetic */ View f36462f;

    /* renamed from: g */
    public final /* synthetic */ C0581o5 f36463g;

    /* renamed from: h */
    public final /* synthetic */ View f36464h;

    /* renamed from: i */
    public final /* synthetic */ C8479f0<Drawable> f36465i;

    public C12727w5(C12322e5 e5Var, C9507n nVar, View view, C0581o5 o5Var, View view2, C8479f0<Drawable> f0Var) {
        this.f36460d = e5Var;
        this.f36461e = nVar;
        this.f36462f = view;
        this.f36463g = o5Var;
        this.f36464h = view2;
        this.f36465i = f0Var;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        C4061g7 g7Var = C4061g7.f18189a;
        C45795b A0 = this.f36460d.mo87684A0();
        C0000n0 n0Var = this.f36461e.f29679z;
        View view = this.f36462f;
        C12322e5 e5Var = this.f36460d;
        ViewGroup viewGroup = e5Var.f166287d;
        C87412m.m108593f(menuItem, "menuItem");
        g7Var.mo4956d(1, A0, n0Var, view, e5Var, viewGroup, menuItem, i, this.f36463g);
        this.f36464h.setBackground((Drawable) this.f36465i.f27484d);
        C41573e3.f111902a.mo64658a();
    }
}
