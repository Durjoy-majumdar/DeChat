package wt1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import gy3.C87412m;
import nj3.C76879j;
import wt1.C78670h0;

/* renamed from: wt1.m0 */
public final class C78695m0<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C78670h0 f230399d;

    public C78695m0(C78670h0 h0Var) {
        this.f230399d = h0Var;
    }

    public void onChanged(Object obj) {
        C78670h0.C78680b bVar = (C78670h0.C78680b) obj;
        Log.m105924i("MicroMsg.WalletOpenTouchPayUIC", "on receive state: " + bVar);
        if (bVar instanceof C78670h0.C78680b.C78684d) {
            AppCompatActivity activity = this.f230399d.getActivity();
            C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.wallet_core.ui.WalletBaseUI");
            ((WalletBaseUI) activity).showLoading(false);
        } else if (bVar instanceof C78670h0.C78680b.C78681a) {
            AppCompatActivity activity2 = this.f230399d.getActivity();
            C87412m.m108592e(activity2, "null cannot be cast to non-null type com.tencent.mm.wallet_core.ui.WalletBaseUI");
            ((WalletBaseUI) activity2).hideLoading();
        } else if (bVar instanceof C78670h0.C78680b.C78682b) {
            String str = ((C78670h0.C78680b.C78682b) bVar).f230384a;
            if (Util.isNullOrNil(str)) {
                str = this.f230399d.getString(C0966R.string.eud);
            }
            C76879j.m92711E(this.f230399d.getActivity(), str, "", this.f230399d.getString(C0966R.string.ktq), false, new C78689j0(this.f230399d));
        } else if (bVar instanceof C78670h0.C78680b.C78683c) {
            C78670h0.C78680b.C78683c cVar = (C78670h0.C78680b.C78683c) bVar;
            String str2 = cVar.f230386b;
            if (Util.isNullOrNil(str2)) {
                str2 = this.f230399d.getString(C0966R.string.eud);
            }
            AppCompatActivity activity3 = this.f230399d.getActivity();
            String str3 = cVar.f230385a;
            String string = this.f230399d.getString(C0966R.string.l_w);
            String string2 = this.f230399d.getString(C0966R.string.ktq);
            C78670h0 h0Var = this.f230399d;
            C76879j.m92709C(activity3, str2, str3, string, string2, false, new C78691k0(h0Var), new C78693l0(h0Var));
        }
    }
}
