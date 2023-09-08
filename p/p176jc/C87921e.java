package p176jc;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.content.res.Resources;
import gy3.C87412m;

/* renamed from: jc.e */
public final class C87921e extends MutableContextWrapper {

    /* renamed from: a */
    public Resources f254466a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87921e(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    public Resources getResources() {
        if (this.f254466a == null) {
            this.f254466a = new C87944y(super.getResources());
        }
        Resources resources = this.f254466a;
        if (resources != null) {
            return resources;
        }
        C87412m.m108603p("mResources");
        throw null;
    }

    public void setBaseContext(Context context) {
        boolean z = !C87412m.m108589b(context, getBaseContext());
        super.setBaseContext(context);
        if (z && this.f254466a != null) {
            this.f254466a = new C87944y(super.getResources());
        }
    }
}
