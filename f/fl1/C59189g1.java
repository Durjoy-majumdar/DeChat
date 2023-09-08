package fl1;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C12469j1;
import vk1.C65760a;

/* renamed from: fl1.g1 */
public final class C59189g1 extends C87413o implements C32224a<C12469j1> {

    /* renamed from: d */
    public final /* synthetic */ C59161f f169301d;

    /* renamed from: e */
    public final /* synthetic */ C65760a f169302e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59189g1(C59161f fVar, C65760a aVar) {
        super(0);
        this.f169301d = fVar;
        this.f169302e = aVar;
    }

    public Object invoke() {
        AppCompatActivity appCompatActivity = this.f169301d.f166836e;
        C87412m.m108592e(appCompatActivity, "null cannot be cast to non-null type android.app.Activity");
        View findViewById = appCompatActivity.findViewById(C0966R.C0970id.f358130dk2);
        C87412m.m108593f(findViewById, "context as Activity).fin…finder_live_content_root)");
        return new C12469j1((ViewGroup) findViewById, this.f169302e);
    }
}
