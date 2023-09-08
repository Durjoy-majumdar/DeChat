package gl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C12377f1;
import vk1.C65761b;

/* renamed from: gl1.v0 */
public final class C8353v0 extends C87413o implements C32224a<C12377f1> {

    /* renamed from: d */
    public final /* synthetic */ C65761b f27315d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8353v0(C65761b bVar) {
        super(0);
        this.f27315d = bVar;
    }

    public Object invoke() {
        View findViewById = this.f27315d.findViewById(C0966R.C0970id.dk7);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.finder_live_desc_edit_root)");
        return new C12377f1((ViewGroup) findViewById, this.f27315d);
    }
}
