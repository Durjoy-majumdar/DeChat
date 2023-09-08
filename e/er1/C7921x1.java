package er1;

import android.app.Activity;
import di3.C7335d;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import qo3.C47883u;
import rx3.C13598b0;

/* renamed from: er1.x1 */
public final class C7921x1 implements C47883u {

    /* renamed from: a */
    public final /* synthetic */ Activity f26602a;

    /* renamed from: b */
    public final /* synthetic */ C32224a<C13598b0> f26603b;

    public C7921x1(Activity activity, C32224a<C13598b0> aVar) {
        this.f26602a = activity;
        this.f26603b = aVar;
    }

    /* renamed from: a */
    public final void mo353a(boolean z, String str) {
        C7335d c = C86312j.m106911c(C58684b.class);
        C87412m.m108593f(c, "getService(ActivityRouter::class.java)");
        ((C58684b) c).qy0(this.f26602a, (String) null);
        C32224a<C13598b0> aVar = this.f26603b;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
