package fl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C62921p3;
import vk1.C65760a;

/* renamed from: fl1.r0 */
public final class C59222r0 extends C87413o implements C32224a<C62921p3> {

    /* renamed from: d */
    public final /* synthetic */ C65760a f169368d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59222r0(C65760a aVar) {
        super(0);
        this.f169368d = aVar;
    }

    public Object invoke() {
        View findViewById = this.f169368d.findViewById(C0966R.C0970id.ddc);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.fin…hor_search_music_ui_root)");
        return new C62921p3((ViewGroup) findViewById, this.f169368d);
    }
}
