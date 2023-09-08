package fl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C12322e5;
import vk1.C65760a;

/* renamed from: fl1.t */
public final class C8123t extends C87413o implements C32224a<C12322e5> {

    /* renamed from: d */
    public final /* synthetic */ C65760a f26983d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8123t(C65760a aVar) {
        super(0);
        this.f26983d = aVar;
    }

    public Object invoke() {
        View findViewById = this.f26983d.findViewById(C0966R.C0970id.djp);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.finder_live_comment_ui_root)");
        return new C12322e5((ViewGroup) findViewById, this.f26983d, (ViewGroup) null);
    }
}
