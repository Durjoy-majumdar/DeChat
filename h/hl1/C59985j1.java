package hl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C62758ea;
import vk1.C65762c;

/* renamed from: hl1.j1 */
public final class C59985j1 extends C87413o implements C32224a<C62758ea> {

    /* renamed from: d */
    public final /* synthetic */ C65762c f171141d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59985j1(C65762c cVar) {
        super(0);
        this.f171141d = cVar;
    }

    public Object invoke() {
        View findViewById = this.f171141d.findViewById(C0966R.C0970id.dr8);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.fin…live_lucky_money_ui_root)");
        return new C62758ea((ViewGroup) findViewById, this.f171141d);
    }
}
