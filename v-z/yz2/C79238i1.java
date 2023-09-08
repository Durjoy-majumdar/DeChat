package yz2;

import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusDoWhatActivityV2;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import org.json.JSONObject;
import p235sm.C64053t0;

/* renamed from: yz2.i1 */
public final class C79238i1 implements C64053t0.C13730a {

    /* renamed from: a */
    public final /* synthetic */ TextStatusDoWhatActivityV2 f232613a;

    public C79238i1(TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2) {
        this.f232613a = textStatusDoWhatActivityV2;
    }

    /* renamed from: a */
    public void mo5696a(String str, String str2) {
        TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2 = this.f232613a;
        TextStatusDoWhatActivityV2.C5642a aVar = TextStatusDoWhatActivityV2.f206792X0;
        textStatusDoWhatActivityV2.getClass();
        Log.m105925i("MicroMsg.TextStatus.TextStatusDoWhatActivityV2", "handleAppBrandEmojiPanelDataCallBack: data:%s", str2);
        try {
            String optString = new JSONObject(str2).optJSONObject("data").optString("iconId");
            C87412m.m108593f(optString, "iconId");
            textStatusDoWhatActivityV2.f206806N = optString;
            textStatusDoWhatActivityV2.runOnUiThread(new C79278w0(textStatusDoWhatActivityV2));
            Log.m105924i("MicroMsg.TextStatus.TextStatusDoWhatActivityV2", "handleAppBrandEmojiPanelDataCallBack() called :" + textStatusDoWhatActivityV2.f206806N);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.TextStatus.TextStatusDoWhatActivityV2", "handleAppBrandEmojiPanelDataCallBack: e:%s data:%s", e, str2);
        }
    }
}
