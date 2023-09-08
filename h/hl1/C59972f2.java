package hl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C62712dd;
import vk1.C65762c;

/* renamed from: hl1.f2 */
public final class C59972f2 extends C87413o implements C32224a<C62712dd> {

    /* renamed from: d */
    public final /* synthetic */ C65762c f171118d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59972f2(C65762c cVar) {
        super(0);
        this.f171118d = cVar;
    }

    public Object invoke() {
        C65762c cVar = this.f171118d;
        View findViewById = cVar.findViewById(C0966R.C0970id.dxg);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.fin…promote_bubble_container)");
        return new C62712dd(cVar, (ViewGroup) findViewById, this.f171118d);
    }
}
