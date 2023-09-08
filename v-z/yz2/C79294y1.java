package yz2;

import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusEditHalfScreenActivity;
import com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt;
import com.tencent.p014mm.sdk.platformtools.Log;
import di0.C86295k;
import gy3.C87412m;
import org.json.JSONObject;

/* renamed from: yz2.y1 */
public final class C79294y1 implements C86295k {

    /* renamed from: d */
    public final /* synthetic */ TextStatusEditHalfScreenActivity f232787d;

    public C79294y1(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
        this.f232787d = textStatusEditHalfScreenActivity;
    }

    /* renamed from: a */
    public final String mo3693a() {
        JSONObject jSONObject = new JSONObject();
        JSONObject json = IStatusIconHelperKt.m39109a().mo62292d().toJSON();
        jSONObject.put(this.f232787d.f207173w1, json);
        Log.m105925i("MicroMsg.TextStatus.TextStatusEditHalfScreenActivity", "initEmojiPanel: configJson：%s", json.toString());
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "jsonObj.toString()");
        return jSONObject2;
    }
}
