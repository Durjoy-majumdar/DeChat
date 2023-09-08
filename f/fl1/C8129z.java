package fl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C12611q7;
import vk1.C65760a;

/* renamed from: fl1.z */
public final class C8129z extends C87413o implements C32224a<C12611q7> {

    /* renamed from: d */
    public final /* synthetic */ C65760a f26990d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8129z(C65760a aVar) {
        super(0);
        this.f26990d = aVar;
    }

    public Object invoke() {
        View findViewById = this.f26990d.findViewById(C0966R.C0970id.dmy);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.fin…r_live_gift_play_ui_root)");
        return new C12611q7((ViewGroup) findViewById, this.f26990d);
    }
}
