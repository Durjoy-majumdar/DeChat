package fl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C62905o2;
import vk1.C65760a;

/* renamed from: fl1.b1 */
public final class C59154b1 extends C87413o implements C32224a<C62905o2> {

    /* renamed from: d */
    public final /* synthetic */ C65760a f169176d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59154b1(C65760a aVar) {
        super(0);
        this.f169176d = aVar;
    }

    public Object invoke() {
        View findViewById = this.f169176d.findViewById(C0966R.C0970id.jza);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.fin…p_second_content_info_ui)");
        return new C62905o2((ViewGroup) findViewById, this.f169176d);
    }
}
