package f63;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;

/* renamed from: f63.n */
public class C45761n extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ C45762o f123615g;

    public C45761n(C45762o oVar) {
        this.f123615g = oVar;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        Log.m105924i("MicroMsg.WcPayCashierFetchFavorDialog", "click back");
        this.f123615g.cancel();
    }
}
