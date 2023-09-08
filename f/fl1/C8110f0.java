package fl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C62949r8;
import vk1.C65760a;

/* renamed from: fl1.f0 */
public final class C8110f0 extends C87413o implements C32224a<C62949r8> {

    /* renamed from: d */
    public final /* synthetic */ C65760a f26970d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8110f0(C65760a aVar) {
        super(0);
        this.f26970d = aVar;
    }

    public Object invoke() {
        View findViewById = this.f26970d.findViewById(C0966R.C0970id.fuq);
        C87412m.m108592e(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
        return new C62949r8((ViewGroup) findViewById, this.f26970d);
    }
}
