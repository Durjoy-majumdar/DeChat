package gl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C63100x2;
import vk1.C65761b;

/* renamed from: gl1.j1 */
public final class C8342j1 extends C87413o implements C32224a<C63100x2> {

    /* renamed from: d */
    public final /* synthetic */ C65761b f27303d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8342j1(C65761b bVar) {
        super(0);
        this.f27303d = bVar;
    }

    public Object invoke() {
        View findViewById = this.f27303d.findViewById(C0966R.C0970id.mqj);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.fin…r_sing_song_list_ui_root)");
        return new C63100x2((ViewGroup) findViewById, this.f27303d);
    }
}
