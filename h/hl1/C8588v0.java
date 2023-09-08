package hl1;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C12382f6;
import vk1.C65762c;

/* renamed from: hl1.v0 */
public final class C8588v0 extends C87413o implements C32224a<C12382f6> {

    /* renamed from: d */
    public final /* synthetic */ C59988k f27677d;

    /* renamed from: e */
    public final /* synthetic */ C65762c f27678e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8588v0(C59988k kVar, C65762c cVar) {
        super(0);
        this.f27677d = kVar;
        this.f27678e = cVar;
    }

    public Object invoke() {
        AppCompatActivity appCompatActivity = this.f27677d.f166847e;
        C87412m.m108592e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        View findViewById = this.f27678e.findViewById(C0966R.C0970id.iyv);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.finder_live_concert_ticket)");
        return new C12382f6((MMActivity) appCompatActivity, (ViewGroup) findViewById, this.f27678e);
    }
}
