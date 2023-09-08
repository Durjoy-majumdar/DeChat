package gl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C62712dd;
import vk1.C65761b;

/* renamed from: gl1.l1 */
public final class C59567l1 extends C87413o implements C32224a<C62712dd> {

    /* renamed from: d */
    public final /* synthetic */ C65761b f170270d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59567l1(C65761b bVar) {
        super(0);
        this.f170270d = bVar;
    }

    public Object invoke() {
        C65761b bVar = this.f170270d;
        View findViewById = bVar.findViewById(C0966R.C0970id.dxg);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.fin…promote_bubble_container)");
        return new C62712dd(bVar, (ViewGroup) findViewById, this.f170270d);
    }
}
