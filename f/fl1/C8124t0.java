package fl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C12765z2;
import vk1.C65760a;

/* renamed from: fl1.t0 */
public final class C8124t0 extends C87413o implements C32224a<C12765z2> {

    /* renamed from: d */
    public final /* synthetic */ C65760a f26984d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8124t0(C65760a aVar) {
        super(0);
        this.f26984d = aVar;
    }

    public Object invoke() {
        View findViewById = this.f26984d.findViewById(C0966R.C0970id.dcw);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.fin…r_music_guide_click_root)");
        return new C12765z2((ViewGroup) findViewById, this.f26984d);
    }
}
