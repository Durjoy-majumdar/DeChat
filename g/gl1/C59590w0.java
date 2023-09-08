package gl1;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C12469j1;
import vk1.C65761b;

/* renamed from: gl1.w0 */
public final class C59590w0 extends C87413o implements C32224a<C12469j1> {

    /* renamed from: d */
    public final /* synthetic */ C59559k f170300d;

    /* renamed from: e */
    public final /* synthetic */ C65761b f170301e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59590w0(C59559k kVar, C65761b bVar) {
        super(0);
        this.f170300d = kVar;
        this.f170301e = bVar;
    }

    public Object invoke() {
        AppCompatActivity appCompatActivity = this.f170300d.f166841e;
        C87412m.m108592e(appCompatActivity, "null cannot be cast to non-null type android.app.Activity");
        View findViewById = appCompatActivity.findViewById(C0966R.C0970id.f358130dk2);
        C87412m.m108593f(findViewById, "context as Activity).fin…finder_live_content_root)");
        return new C12469j1((ViewGroup) findViewById, this.f170301e);
    }
}
