package di2;

import android.content.Context;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import fy3.C32226l;
import gy3.C87412m;
import kg3.C76577a;
import p915ol.C100363a;
import p915ol.C100365b;
import rx3.C13598b0;

/* renamed from: di2.a */
public final class C97480a extends C100363a {

    /* renamed from: d */
    public final boolean f286121d;

    /* renamed from: e */
    public C32226l<? super Boolean, C13598b0> f286122e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97480a(Context context, ViewGroup viewGroup, boolean z) {
        super(context, viewGroup, z);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(viewGroup, "parent");
        this.f286121d = z;
        this.f293962c.setBackgroundColor(C76577a.m92153d(context, C0966R.color.f3327o3));
    }

    /* renamed from: a */
    public void mo136743a() {
        this.f293962c.animate().translationY((float) this.f293962c.getLayoutParams().height).withEndAction(new C100365b(this));
        C32226l<? super Boolean, C13598b0> lVar = this.f286122e;
        if (lVar != null) {
            lVar.invoke(Boolean.FALSE);
        }
    }

    /* renamed from: b */
    public void mo136744b(boolean z) {
        if (z) {
            this.f293962c.setPadding(0, 0, 0, C75044y4.m89991c(this.f293960a));
            this.f293961b.setVisibility(0);
            this.f293962c.setVisibility(0);
            this.f293962c.animate().translationY(0.0f).start();
            C32226l<? super Boolean, C13598b0> lVar = this.f286122e;
            if (lVar != null) {
                lVar.invoke(Boolean.TRUE);
                return;
            }
            return;
        }
        mo136743a();
    }
}
