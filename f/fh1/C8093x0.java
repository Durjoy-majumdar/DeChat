package fh1;

import a14.C0000n0;
import ak1.C54116w;
import android.view.MenuItem;
import android.view.View;
import cj1.C0581o5;
import com.tencent.p014mm.plugin.finder.view.C4061g7;
import com.tencent.p014mm.plugin.finder.view.C41573e3;
import di3.C86312j;
import fj1.C45795b;
import fy3.C32226l;
import nj3.C11184p0;
import qj1.C12322e5;
import rx3.C13598b0;

/* renamed from: fh1.x0 */
public final class C8093x0 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C32226l<Integer, C13598b0> f26940d;

    /* renamed from: e */
    public final /* synthetic */ C0581o5 f26941e;

    /* renamed from: f */
    public final /* synthetic */ C45795b f26942f;

    /* renamed from: g */
    public final /* synthetic */ C0000n0 f26943g;

    /* renamed from: h */
    public final /* synthetic */ View f26944h;

    /* renamed from: i */
    public final /* synthetic */ C12322e5 f26945i;

    /* renamed from: j */
    public final /* synthetic */ View f26946j;

    public C8093x0(C32226l<? super Integer, C13598b0> lVar, C0581o5 o5Var, C45795b bVar, C0000n0 n0Var, View view, C12322e5 e5Var, View view2) {
        this.f26940d = lVar;
        this.f26941e = o5Var;
        this.f26942f = bVar;
        this.f26943g = n0Var;
        this.f26944h = view;
        this.f26945i = e5Var;
        this.f26946j = view2;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        Class cls = C54116w.class;
        int itemId = menuItem.getItemId();
        int i2 = 1;
        if (itemId == 165) {
            this.f26940d.invoke(Integer.valueOf(menuItem.getItemId()));
            int n = this.f26941e.mo584n();
            if (n == 2) {
                i2 = 2;
            } else if (n != 3) {
                i2 = 0;
            }
            ((C54116w) C86312j.m106911c(cls)).Wx0(0, 3, i2);
        } else if (itemId != 166) {
            C4061g7.f18189a.mo4956d(2, this.f26942f, this.f26943g, this.f26944h, this.f26945i, this.f26946j, menuItem, i, this.f26941e);
        } else {
            this.f26940d.invoke(Integer.valueOf(menuItem.getItemId()));
            int n2 = this.f26941e.mo584n();
            if (n2 == 2) {
                i2 = 2;
            } else if (n2 != 3) {
                i2 = 0;
            }
            ((C54116w) C86312j.m106911c(cls)).Wx0(0, 7, i2);
        }
        C41573e3.f111902a.mo64658a();
    }
}
