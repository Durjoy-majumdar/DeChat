package rs1;

import android.content.Context;
import android.view.MenuItem;
import gy3.C87412m;
import jq3.C60905o;
import nj3.C11184p0;

/* renamed from: rs1.j */
public final class C13279j implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C13248h f37691d;

    /* renamed from: e */
    public final /* synthetic */ Context f37692e;

    /* renamed from: f */
    public final /* synthetic */ String f37693f;

    /* renamed from: g */
    public final /* synthetic */ C60905o f37694g;

    /* renamed from: h */
    public final /* synthetic */ C13310l f37695h;

    public C13279j(C13248h hVar, Context context, String str, C60905o oVar, C13310l lVar) {
        this.f37691d = hVar;
        this.f37692e = context;
        this.f37693f = str;
        this.f37694g = oVar;
        this.f37695h = lVar;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        C13248h hVar = this.f37691d;
        if (itemId == hVar.f37609e) {
            Context context = this.f37692e;
            C87412m.m108593f(context, "context");
            C13248h.m12617j(hVar, context, this.f37693f, false);
            this.f37691d.mo12721k(this.f37694g, this.f37695h);
            this.f37691d.f37610f = null;
        }
    }
}
