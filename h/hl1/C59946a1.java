package hl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C62983sh;
import vk1.C65762c;

/* renamed from: hl1.a1 */
public final class C59946a1 extends C87413o implements C32224a<C62983sh> {

    /* renamed from: d */
    public final /* synthetic */ C65762c f171069d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59946a1(C65762c cVar) {
        super(0);
        this.f171069d = cVar;
    }

    public Object invoke() {
        View findViewById = this.f171069d.findViewById(C0966R.C0970id.fwz);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.live_preview_ui_root)");
        return new C62983sh((ViewGroup) findViewById, this.f171069d);
    }
}
