package q53;

import com.tencent.p014mm.plugin.wallet.wecoin.p124ui.WeCoinRechargeView;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import p274xx.C15907f;
import p53.C11831b0;

/* renamed from: q53.o2 */
public final class C12104o2 implements C15907f.C15909b {

    /* renamed from: a */
    public final /* synthetic */ WeCoinRechargeView f35194a;

    public C12104o2(WeCoinRechargeView weCoinRechargeView) {
        this.f35194a = weCoinRechargeView;
    }

    /* renamed from: a */
    public void mo6380a() {
        Log.m105924i("MicroMsg.WeCoinRechargeView", "changeSwitchWechatForStatus2CommonTips onCancalBtn.");
    }

    public void onSuccess() {
        ((C15907f) C86312j.m106911c(C15907f.class)).mo14559vq(false, 8);
        C11831b0 b0Var = this.f35194a.f21864d;
        if (b0Var != null) {
            b0Var.mo11722e3();
            Log.m105924i("MicroMsg.WeCoinRechargeView", "changeSwitchWechatForStatus2CommonTips onPositionBtn.");
            return;
        }
        C87412m.m108603p("mViewModel");
        throw null;
    }
}
