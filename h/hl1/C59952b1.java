package hl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C62898o;
import vk1.C65762c;

/* renamed from: hl1.b1 */
public final class C59952b1 extends C87413o implements C32224a<C62898o> {

    /* renamed from: d */
    public final /* synthetic */ C65762c f171080d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59952b1(C65762c cVar) {
        super(0);
        this.f171080d = cVar;
    }

    public Object invoke() {
        View findViewById = this.f171080d.findViewById(C0966R.C0970id.n_p);
        C87412m.m108593f(findViewById, "it.findViewById(com.tenc…id.live_ad_video_ui_root)");
        return new C62898o((ViewGroup) findViewById, this.f171080d);
    }
}
