package h21;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.collect.p038ui.CollectCreateQRCodeNewUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import e21.C75481j0;
import e21.C75488p0;
import eb0.C75592q0;
import f40.C86709a0;

/* renamed from: h21.l */
public class C76120l extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ CollectCreateQRCodeNewUI f223034g;

    public C76120l(CollectCreateQRCodeNewUI collectCreateQRCodeNewUI) {
        this.f223034g = collectCreateQRCodeNewUI;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        double d = Util.getDouble(this.f223034g.f197797d.getText(), 0.0d);
        C86709a0.m107528h();
        int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
        Log.m105925i("MicroMsg.CollectCreateQRCodeNewUI", "wallet region: %s", Integer.valueOf(intValue));
        if (!this.f223034g.f197797d.mo105094l()) {
            CollectCreateQRCodeNewUI collectCreateQRCodeNewUI = this.f223034g;
            CollectCreateQRCodeNewUI.m81103H7(collectCreateQRCodeNewUI, collectCreateQRCodeNewUI.getString(C0966R.string.kmc));
        } else if (d < 0.01d) {
            CollectCreateQRCodeNewUI collectCreateQRCodeNewUI2 = this.f223034g;
            CollectCreateQRCodeNewUI.m81103H7(collectCreateQRCodeNewUI2, collectCreateQRCodeNewUI2.getString(C0966R.string.hzn));
        } else if (intValue == 8) {
            this.f223034g.doSceneForceProgress(new C75481j0(Math.round(d * 100.0d), 1, this.f223034g.f197800g, C75592q0.m90784n()));
        } else {
            this.f223034g.doSceneProgress(new C75488p0(d, "1", this.f223034g.f197800g));
        }
    }
}
