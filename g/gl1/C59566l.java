package gl1;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import d60.C58124b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import nj3.C76912y0;
import rx3.C13598b0;
import vk1.C65761b;

/* renamed from: gl1.l */
public final class C59566l extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C59559k f170267d;

    /* renamed from: e */
    public final /* synthetic */ String f170268e;

    /* renamed from: f */
    public final /* synthetic */ int f170269f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59566l(C59559k kVar, String str, int i) {
        super(0);
        this.f170267d = kVar;
        this.f170268e = str;
        this.f170269f = i;
    }

    public Object invoke() {
        AppCompatActivity appCompatActivity = this.f170267d.f166841e;
        String str = this.f170268e;
        if (str == null) {
            str = appCompatActivity.getResources().getString(C0966R.string.d0q);
            C87412m.m108593f(str, "context.resources.getStr…er_anchor_join_live_fail)");
        }
        C76912y0.makeText((Context) appCompatActivity, (CharSequence) str, 0).show();
        C65761b bVar = this.f170267d.f166842f;
        if (bVar != null) {
            C58124b.C7172a.m7372a(bVar, C58124b.C58125b.BEFORE_LIVE, (Bundle) null, 2, (Object) null);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("live_user_exit_reason", this.f170269f);
        C65761b bVar2 = this.f170267d.f166842f;
        if (bVar2 != null) {
            bVar2.statusChange(C58124b.C58125b.LIVE_START_LIVE_FAILED, bundle);
        }
        return C13598b0.f38549a;
    }
}
