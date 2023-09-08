package gl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C63081w3;
import vk1.C65761b;

/* renamed from: gl1.o0 */
public final class C59575o0 extends C87413o implements C32224a<C63081w3> {

    /* renamed from: d */
    public final /* synthetic */ C65761b f170281d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59575o0(C65761b bVar) {
        super(0);
        this.f170281d = bVar;
    }

    public Object invoke() {
        View findViewById = this.f170281d.findViewById(C0966R.C0970id.dea);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.fin…_live_audio_mode_ui_root)");
        return new C63081w3((ViewGroup) findViewById, this.f170281d);
    }
}
