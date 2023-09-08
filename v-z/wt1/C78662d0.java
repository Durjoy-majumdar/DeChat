package wt1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import gy3.C87412m;
import nj3.C76879j;
import wt1.C78709x;

/* renamed from: wt1.d0 */
public final class C78662d0<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C78709x f230361d;

    public C78662d0(C78709x xVar) {
        this.f230361d = xVar;
    }

    public void onChanged(Object obj) {
        C78709x.C78719b bVar = (C78709x.C78719b) obj;
        Log.m105924i("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "on receive state: " + bVar);
        if (bVar instanceof C78709x.C78719b.C78723d) {
            AppCompatActivity activity = this.f230361d.getActivity();
            C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.wallet_core.ui.WalletBaseUI");
            ((WalletBaseUI) activity).showLoading(false);
        } else if (bVar instanceof C78709x.C78719b.C78720a) {
            AppCompatActivity activity2 = this.f230361d.getActivity();
            C87412m.m108592e(activity2, "null cannot be cast to non-null type com.tencent.mm.wallet_core.ui.WalletBaseUI");
            ((WalletBaseUI) activity2).hideLoading();
        } else if (bVar instanceof C78709x.C78719b.C78721b) {
            String str = ((C78709x.C78719b.C78721b) bVar).f230430a;
            if (Util.isNullOrNil(str)) {
                str = this.f230361d.getString(C0966R.string.eud);
            }
            C76879j.m92711E(this.f230361d.getActivity(), str, "", this.f230361d.getString(C0966R.string.ktq), false, new C78656a0(this.f230361d));
        } else if (bVar instanceof C78709x.C78719b.C78722c) {
            C78709x.C78719b.C78722c cVar = (C78709x.C78719b.C78722c) bVar;
            String str2 = cVar.f230432b;
            if (Util.isNullOrNil(str2)) {
                str2 = this.f230361d.getString(C0966R.string.eud);
            }
            AppCompatActivity activity3 = this.f230361d.getActivity();
            String str3 = cVar.f230431a;
            String string = this.f230361d.getString(C0966R.string.l_w);
            String string2 = this.f230361d.getString(C0966R.string.ktq);
            C78709x xVar = this.f230361d;
            C76879j.m92709C(activity3, str2, str3, string, string2, false, new C78658b0(xVar), new C78660c0(xVar));
        }
    }
}
