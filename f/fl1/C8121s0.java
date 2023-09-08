package fl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C12657s2;
import vk1.C65760a;

/* renamed from: fl1.s0 */
public final class C8121s0 extends C87413o implements C32224a<C12657s2> {

    /* renamed from: d */
    public final /* synthetic */ C65760a f26981d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8121s0(C65760a aVar) {
        super(0);
        this.f26981d = aVar;
    }

    public Object invoke() {
        View findViewById = this.f26981d.findViewById(C0966R.C0970id.dcx);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.fin…_anchor_music_guide_root)");
        return new C12657s2((ViewGroup) findViewById, this.f26981d);
    }
}
