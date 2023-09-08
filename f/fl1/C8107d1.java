package fl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C12377f1;
import vk1.C65760a;

/* renamed from: fl1.d1 */
public final class C8107d1 extends C87413o implements C32224a<C12377f1> {

    /* renamed from: d */
    public final /* synthetic */ C65760a f26967d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8107d1(C65760a aVar) {
        super(0);
        this.f26967d = aVar;
    }

    public Object invoke() {
        View findViewById = this.f26967d.findViewById(C0966R.C0970id.dk7);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.finder_live_desc_edit_root)");
        return new C12377f1((ViewGroup) findViewById, this.f26967d);
    }
}
