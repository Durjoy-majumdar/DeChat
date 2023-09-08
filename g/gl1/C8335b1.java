package gl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C12625qe;
import vk1.C65761b;

/* renamed from: gl1.b1 */
public final class C8335b1 extends C87413o implements C32224a<C12625qe> {

    /* renamed from: d */
    public final /* synthetic */ C65761b f27296d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8335b1(C65761b bVar) {
        super(0);
        this.f27296d = bVar;
    }

    public Object invoke() {
        View findViewById = this.f27296d.findViewById(C0966R.C0970id.mrr);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.fin…e_sing_song_banner_group)");
        return new C12625qe((ViewGroup) findViewById, this.f27296d);
    }
}
