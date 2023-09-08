package er1;

import android.app.Activity;
import android.content.DialogInterface;
import android.net.Uri;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import rx3.C13598b0;
import zc1.C66785b;

/* renamed from: er1.z1 */
public final class C7927z1 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Activity f26612d;

    /* renamed from: e */
    public final /* synthetic */ C32224a<C13598b0> f26613e;

    public C7927z1(Activity activity, C32224a<C13598b0> aVar) {
        this.f26612d = activity;
        this.f26613e = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Uri.Builder buildUpon = Uri.parse("pages/index/index.html").buildUpon();
        C87412m.m108593f(buildUpon, "parse(\"pages/index/index.html\").buildUpon()");
        buildUpon.appendQueryParameter("showdetail", "true");
        buildUpon.appendQueryParameter("to_auth_company", "true");
        ((C58684b) C86312j.m106911c(C58684b.class)).xx0(this.f26612d, "gh_4ee148a6ecaa@app", buildUpon.build() + "&username=" + C66785b.f191882e.mo90662O5());
        C32224a<C13598b0> aVar = this.f26613e;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
