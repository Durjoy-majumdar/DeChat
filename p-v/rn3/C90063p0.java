package rn3;

import com.tencent.p014mm.opensdk.modelmsg.WXStateSceneDataObject;
import com.tencent.p014mm.p136ui.transmit.SendAppMessageWrapperUI;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import kr0.C76629w0;

/* renamed from: rn3.p0 */
public class C90063p0 implements C76629w0.C61144a {

    /* renamed from: a */
    public final /* synthetic */ WXStateSceneDataObject f258729a;

    /* renamed from: b */
    public final /* synthetic */ SendAppMessageWrapperUI f258730b;

    public C90063p0(SendAppMessageWrapperUI sendAppMessageWrapperUI, WXStateSceneDataObject wXStateSceneDataObject) {
        this.f258730b = sendAppMessageWrapperUI;
        this.f258729a = wXStateSceneDataObject;
    }

    /* renamed from: a */
    public void mo21208a(WxaAttributes wxaAttributes) {
        SendAppMessageWrapperUI sendAppMessageWrapperUI = this.f258730b;
        int i = SendAppMessageWrapperUI.f250361A;
        sendAppMessageWrapperUI.mo119869M7();
        SendAppMessageWrapperUI sendAppMessageWrapperUI2 = this.f258730b;
        if (sendAppMessageWrapperUI2.f250379x) {
            Log.m105928w("MicroMsg.SendAppMessageWrapperUI", "handleSendStatus cancelled");
        } else if (wxaAttributes != null) {
            Log.m105925i("MicroMsg.SendAppMessageWrapperUI", "onGetWeAppInfo: nickName:%s userName:%s", wxaAttributes.field_nickname, wxaAttributes.field_username);
            this.f258730b.mo119871O7(this.f258729a, (String) null, Util.nullAs(wxaAttributes.field_smallHeadURL, wxaAttributes.field_bigHeadURL), false, wxaAttributes.field_nickname);
        } else {
            sendAppMessageWrapperUI2.mo119871O7(this.f258729a, (String) null, (String) null, true, "");
        }
    }
}
