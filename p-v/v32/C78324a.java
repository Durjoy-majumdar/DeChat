package v32;

import android.app.Dialog;
import android.content.DialogInterface;
import com.tencent.p014mm.plugin.luckymoney.p886hk.p887ui.LuckyMoneyHKBeforeDetailUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import u32.C65209a;

/* renamed from: v32.a */
public class C78324a implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyHKBeforeDetailUI f229526d;

    public C78324a(LuckyMoneyHKBeforeDetailUI luckyMoneyHKBeforeDetailUI) {
        this.f229526d = luckyMoneyHKBeforeDetailUI;
    }

    public void onCancel(DialogInterface dialogInterface) {
        Dialog dialog = this.f229526d.f198904g;
        if (dialog != null && dialog.isShowing()) {
            this.f229526d.f198904g.dismiss();
        }
        C65209a aVar = this.f229526d.f198906i;
        if (aVar != null) {
            aVar.mo85581g();
        }
        if (this.f229526d.getContentView().getVisibility() == 8 || this.f229526d.getContentView().getVisibility() == 4) {
            Log.m105924i("MicroMsg.LuckyMoneyHKBeforeDetailUI", "user cancel & finish");
            this.f229526d.finish();
        }
    }
}
