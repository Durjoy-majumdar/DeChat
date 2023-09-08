package fl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import vi1.C52931n;
import vk1.C65760a;

/* renamed from: fl1.r */
public final class C45803r extends C87413o implements C32224a<C52931n> {

    /* renamed from: d */
    public final /* synthetic */ C65760a f123709d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45803r(C65760a aVar) {
        super(0);
        this.f123709d = aVar;
    }

    public Object invoke() {
        View findViewById = this.f123709d.findViewById(C0966R.C0970id.iz_);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.fin…ive_mic_intercom_ui_root)");
        return new C52931n((ViewGroup) findViewById, this.f123709d);
    }
}
