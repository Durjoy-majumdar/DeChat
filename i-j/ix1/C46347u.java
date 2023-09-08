package ix1;

import android.view.MenuItem;
import bx1.C39866s;
import f40.C86709a0;
import nj3.C11184p0;

/* renamed from: ix1.u */
public class C46347u implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ long f124909d;

    /* renamed from: e */
    public final /* synthetic */ boolean f124910e;

    /* renamed from: f */
    public final /* synthetic */ int f124911f;

    /* renamed from: g */
    public final /* synthetic */ C46337n f124912g;

    public C46347u(C46337n nVar, long j, boolean z, int i) {
        this.f124912g = nVar;
        this.f124909d = j;
        this.f124910e = z;
        this.f124911f = i;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (menuItem.getItemId() == 11) {
            C86709a0.m107524d().mo123460f(new C39866s(this.f124912g.f124869Z0, this.f124909d, this.f124910e));
            this.f124912g.mo71735M(this.f124911f, 2);
        }
    }
}
