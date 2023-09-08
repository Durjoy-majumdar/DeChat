package hl1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.p136ui.MMActivity;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import lg1.C46854h;
import vk1.C65762c;

/* renamed from: hl1.r0 */
public final class C46080r0 extends C87413o implements C32224a<C46854h> {

    /* renamed from: d */
    public final /* synthetic */ C59988k f124231d;

    /* renamed from: e */
    public final /* synthetic */ ViewStub f124232e;

    /* renamed from: f */
    public final /* synthetic */ C65762c f124233f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46080r0(C59988k kVar, ViewStub viewStub, C65762c cVar) {
        super(0);
        this.f124231d = kVar;
        this.f124232e = viewStub;
        this.f124233f = cVar;
    }

    public Object invoke() {
        AppCompatActivity appCompatActivity = this.f124231d.f166847e;
        C87412m.m108592e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        View inflate = this.f124232e.inflate();
        C87412m.m108592e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        C65762c cVar = this.f124233f;
        return new C46854h((MMActivity) appCompatActivity, (ViewGroup) inflate, cVar, cVar);
    }
}
