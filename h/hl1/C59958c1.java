package hl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C62833je;
import vk1.C65762c;

/* renamed from: hl1.c1 */
public final class C59958c1 extends C87413o implements C32224a<C62833je> {

    /* renamed from: d */
    public final /* synthetic */ C65762c f171091d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59958c1(C65762c cVar) {
        super(0);
        this.f171091d = cVar;
    }

    public Object invoke() {
        View findViewById = this.f171091d.findViewById(C0966R.C0970id.fyi);
        C87412m.m108593f(findViewById, "it.findViewById(com.tenc…R.id.live_shadow_ui_root)");
        return new C62833je((ViewGroup) findViewById, this.f171091d);
    }
}
