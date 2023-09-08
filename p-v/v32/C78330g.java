package v32;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.luckymoney.p886hk.p887ui.LuckyMoneyHKReceiveUI;
import qo3.C89779i0;

/* renamed from: v32.g */
public class C78330g implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyHKReceiveUI f229535d;

    public C78330g(LuckyMoneyHKReceiveUI luckyMoneyHKReceiveUI) {
        this.f229535d = luckyMoneyHKReceiveUI;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C89779i0 i0Var = this.f229535d.f198922u;
        if (i0Var != null && i0Var.isShowing()) {
            this.f229535d.f198922u.dismiss();
        }
        this.f229535d.f198910A.mo85581g();
        this.f229535d.finish();
    }
}
