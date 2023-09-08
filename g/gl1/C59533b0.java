package gl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C62905o2;
import vk1.C65761b;

/* renamed from: gl1.b0 */
public final class C59533b0 extends C87413o implements C32224a<C62905o2> {

    /* renamed from: d */
    public final /* synthetic */ C65761b f170161d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59533b0(C65761b bVar) {
        super(0);
        this.f170161d = bVar;
    }

    public Object invoke() {
        View findViewById = this.f170161d.findViewById(C0966R.C0970id.jza);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.fin…p_second_content_info_ui)");
        return new C62905o2((ViewGroup) findViewById, this.f170161d);
    }
}
