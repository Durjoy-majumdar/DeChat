package fl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C62799h2;
import vk1.C65760a;

/* renamed from: fl1.h0 */
public final class C59190h0 extends C87413o implements C32224a<C62799h2> {

    /* renamed from: d */
    public final /* synthetic */ C65760a f169303d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59190h0(C65760a aVar) {
        super(0);
        this.f169303d = aVar;
    }

    public Object invoke() {
        View findViewById = this.f169303d.findViewById(C0966R.C0970id.dq5);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.fin…_live_link_state_ui_root)");
        return new C62799h2((ViewGroup) findViewById, this.f169303d);
    }
}
