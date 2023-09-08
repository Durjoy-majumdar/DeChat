package fl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C62987t2;
import vk1.C65760a;

/* renamed from: fl1.p0 */
public final class C59218p0 extends C87413o implements C32224a<C62987t2> {

    /* renamed from: d */
    public final /* synthetic */ C65760a f169363d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59218p0(C65760a aVar) {
        super(0);
        this.f169363d = aVar;
    }

    public Object invoke() {
        View findViewById = this.f169363d.findViewById(C0966R.C0970id.f358092dd0);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.fin…ive_anchor_music_ui_root)");
        return new C62987t2((ViewGroup) findViewById, this.f169363d);
    }
}
