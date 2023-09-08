package gl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C12322e5;
import vk1.C65761b;

/* renamed from: gl1.t */
public final class C8351t extends C87413o implements C32224a<C12322e5> {

    /* renamed from: d */
    public final /* synthetic */ C65761b f27313d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8351t(C65761b bVar) {
        super(0);
        this.f27313d = bVar;
    }

    public Object invoke() {
        View findViewById = this.f27313d.findViewById(C0966R.C0970id.djp);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.finder_live_comment_ui_root)");
        return new C12322e5((ViewGroup) findViewById, this.f27313d, (ViewGroup) null);
    }
}
