package yz2;

import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusDoWhatActivityV2;
import com.tencent.p014mm.sdk.platformtools.Log;
import di0.C86295k;
import gy3.C87412m;
import org.json.JSONObject;
import uz2.C52679e1;

/* renamed from: yz2.h1 */
public final class C79237h1 implements C86295k {

    /* renamed from: d */
    public final /* synthetic */ C52679e1 f232611d;

    /* renamed from: e */
    public final /* synthetic */ TextStatusDoWhatActivityV2 f232612e;

    public C79237h1(C52679e1 e1Var, TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2) {
        this.f232611d = e1Var;
        this.f232612e = textStatusDoWhatActivityV2;
    }

    /* renamed from: a */
    public final String mo3693a() {
        JSONObject jSONObject = new JSONObject();
        JSONObject json = this.f232611d.toJSON();
        jSONObject.put(this.f232612e.f206843x, json);
        TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2 = this.f232612e;
        jSONObject.put(textStatusDoWhatActivityV2.f206845y, textStatusDoWhatActivityV2.f206847z);
        Log.m105925i("MicroMsg.TextStatus.TextStatusDoWhatActivityV2", "initEmojiPanel: configJson：%s", json.toString());
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "jsonObj.toString()");
        return jSONObject2;
    }
}
