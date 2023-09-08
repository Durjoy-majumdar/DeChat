package hl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C62943qh;
import vk1.C65762c;

/* renamed from: hl1.m0 */
public final class C8568m0 extends C87413o implements C32224a<C62943qh> {

    /* renamed from: d */
    public final /* synthetic */ C65762c f27651d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8568m0(C65762c cVar) {
        super(0);
        this.f27651d = cVar;
    }

    public Object invoke() {
        View findViewById = this.f27651d.findViewById(C0966R.C0970id.mrv);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.fin…c_sing_song_list_ui_root)");
        return new C62943qh((ViewGroup) findViewById, this.f27651d);
    }
}
