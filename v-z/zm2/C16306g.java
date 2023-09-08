package zm2;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C75592q0;
import ke3.C88144b;
import p274xx.C15907f;

/* renamed from: zm2.g */
public class C16306g implements C15907f.C15909b {

    /* renamed from: a */
    public final /* synthetic */ Context f43607a;

    public C16306g(Context context) {
        this.f43607a = context;
    }

    /* renamed from: a */
    public void mo6380a() {
        Log.m105924i("MicroMsg.SettingWeCoinHelper", "changeSwitchWechatForStatus2CommonTips onCancalBtn.");
    }

    public void onSuccess() {
        Log.m105924i("MicroMsg.SettingWeCoinHelper", "changeSwitchWechatForStatus2CommonTips onPositionBtn. ConfigStorageLogic.getExtStatus2FromUserInfo() = " + C75592q0.m90780j());
        C115669n.INSTANCE.mo160131h(21650, 0);
        Intent intent = new Intent();
        intent.putExtra("launch_from_webview", false);
        intent.putExtra("isWecoinAuth", true);
        C88144b.m109792j(this.f43607a, "wallet", ".wecoin.ui.WeCoinRechargeView", intent, true);
    }
}
