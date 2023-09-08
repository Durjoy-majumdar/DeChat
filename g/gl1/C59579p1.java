package gl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C62705da;
import vk1.C65761b;

/* renamed from: gl1.p1 */
public final class C59579p1 extends C87413o implements C32224a<C62705da> {

    /* renamed from: d */
    public final /* synthetic */ C65761b f170285d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59579p1(C65761b bVar) {
        super(0);
        this.f170285d = bVar;
    }

    public Object invoke() {
        View findViewById = this.f170285d.findViewById(C0966R.C0970id.mr5);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.fin…ogo_receive_empty_layout)");
        return new C62705da((ViewGroup) findViewById, this.f170285d);
    }
}
