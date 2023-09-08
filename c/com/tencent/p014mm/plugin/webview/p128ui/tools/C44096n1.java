package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.webview.model.C43704h2;
import nj3.C11184p0;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.n1 */
public class C44096n1 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C43977g1 f119457d;

    public C44096n1(C43977g1 g1Var) {
        this.f119457d = g1Var;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        int i2 = 0;
        if (itemId == 1) {
            String stringExtra = this.f119457d.mo68387a().getStringExtra("KPublisherId");
            String stringExtra2 = this.f119457d.mo68387a().getStringExtra("KAppId");
            String stringExtra3 = this.f119457d.mo68387a().getStringExtra("srcUsername");
            C43704h2.C43708d c = this.f119457d.mo68388b().f118459E1.mo68007c();
            c.mo68018b(this.f119457d.mo68388b().mo6901n0(), 1, 1, stringExtra, stringExtra2, stringExtra3);
            c.mo68017a();
            this.f119457d.mo68388b().mo68280f9(1);
        } else if (itemId == 2) {
            String stringExtra4 = this.f119457d.mo68387a().getStringExtra("KPublisherId");
            String stringExtra5 = this.f119457d.mo68387a().getStringExtra("KAppId");
            String stringExtra6 = this.f119457d.mo68387a().getStringExtra("srcUsername");
            C43704h2.C43708d c2 = this.f119457d.mo68388b().f118459E1.mo68007c();
            c2.mo68018b(this.f119457d.mo68388b().mo6901n0(), 2, 1, stringExtra4, stringExtra5, stringExtra6);
            c2.mo68017a();
            C43977g1 g1Var = this.f119457d;
            if (g1Var.f119138k.containsKey(g1Var.mo68388b().f118523f.getUrl())) {
                C43977g1 g1Var2 = this.f119457d;
                i2 = g1Var2.f119138k.get(g1Var2.mo68388b().f118523f.getUrl()).intValue();
            }
            C43977g1.m48215d(this.f119457d, i2, 1);
        }
    }
}
