package p53;

import com.tencent.p014mm.sdk.platformtools.Log;
import m53.C10762h;
import p274xx.C15907f;

/* renamed from: p53.t */
public class C11853t implements C15907f.C15909b {

    /* renamed from: a */
    public final /* synthetic */ C10762h f34671a;

    public C11853t(C11854u uVar, C10762h hVar) {
        this.f34671a = hVar;
    }

    /* renamed from: a */
    public void mo6380a() {
        Log.m105924i("MicroMsg.WeCoinManagerImplement", "changeSwitchWechatForStatus2CommonTips onCancalBtn.");
        C10762h hVar = this.f34671a;
        if (hVar != null) {
            hVar.mo605a(3, -3, "授权微信豆失败");
        }
    }

    public void onSuccess() {
        Log.m105924i("MicroMsg.WeCoinManagerImplement", "changeSwitchWechatForStatus2CommonTips onPositionBtn.");
        C10762h hVar = this.f34671a;
        if (hVar != null) {
            hVar.onSuccess(null);
        }
    }
}
