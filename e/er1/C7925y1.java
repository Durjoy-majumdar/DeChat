package er1;

import android.app.Activity;
import android.content.DialogInterface;
import di3.C7335d;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import rx3.C13598b0;

/* renamed from: er1.y1 */
public final class C7925y1 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Activity f26609d;

    /* renamed from: e */
    public final /* synthetic */ C32224a<C13598b0> f26610e;

    public C7925y1(Activity activity, C32224a<C13598b0> aVar) {
        this.f26609d = activity;
        this.f26610e = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C7335d c = C86312j.m106911c(C58684b.class);
        C87412m.m108593f(c, "getService(ActivityRouter::class.java)");
        ((C58684b) c).qy0(this.f26609d, (String) null);
        C32224a<C13598b0> aVar = this.f26610e;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
