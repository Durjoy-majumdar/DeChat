package fh1;

import a14.C0000n0;
import android.view.MenuItem;
import android.view.View;
import cj1.C0581o5;
import com.tencent.p014mm.plugin.finder.view.C4061g7;
import com.tencent.p014mm.plugin.finder.view.C41573e3;
import fj1.C45795b;
import fy3.C32226l;
import nj3.C11184p0;
import qj1.C12322e5;
import rx3.C13598b0;

/* renamed from: fh1.w0 */
public final class C8091w0 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C32226l<Integer, C13598b0> f26932d;

    /* renamed from: e */
    public final /* synthetic */ C45795b f26933e;

    /* renamed from: f */
    public final /* synthetic */ C0000n0 f26934f;

    /* renamed from: g */
    public final /* synthetic */ View f26935g;

    /* renamed from: h */
    public final /* synthetic */ C12322e5 f26936h;

    /* renamed from: i */
    public final /* synthetic */ View f26937i;

    /* renamed from: j */
    public final /* synthetic */ C0581o5 f26938j;

    public C8091w0(C32226l<? super Integer, C13598b0> lVar, C45795b bVar, C0000n0 n0Var, View view, C12322e5 e5Var, View view2, C0581o5 o5Var) {
        this.f26932d = lVar;
        this.f26933e = bVar;
        this.f26934f = n0Var;
        this.f26935g = view;
        this.f26936h = e5Var;
        this.f26937i = view2;
        this.f26938j = o5Var;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (menuItem.getItemId() == 165 || menuItem.getItemId() == 166) {
            this.f26932d.invoke(Integer.valueOf(menuItem.getItemId()));
        } else {
            C4061g7.f18189a.mo4955c(2, this.f26933e, this.f26934f, this.f26935g, this.f26936h, this.f26937i, menuItem, i, this.f26938j);
        }
        C41573e3.f111902a.mo64658a();
    }
}
