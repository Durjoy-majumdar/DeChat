package com.tencent.p014mm.p136ui.transmit;

import com.tencent.p014mm.p136ui.transmit.SendAppMessageWrapperUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C86493v0;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import rn3.i0$$a;
import wd3.C65953v0;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.transmit.i */
public class C85967i implements C65953v0 {

    /* renamed from: a */
    public final /* synthetic */ List f250394a;

    /* renamed from: b */
    public final /* synthetic */ SendAppMessageWrapperUI f250395b;

    public C85967i(SendAppMessageWrapperUI sendAppMessageWrapperUI, List list) {
        this.f250395b = sendAppMessageWrapperUI;
        this.f250394a = list;
    }

    /* renamed from: a */
    public void mo23a(boolean z, String str, int i) {
        JSONArray optJSONArray;
        if (!z) {
            SendAppMessageWrapperUI.m106274H7(this.f250395b);
        } else if (!Util.isNullOrNil(this.f250394a)) {
            SendAppMessageWrapperUI sendAppMessageWrapperUI = this.f250395b;
            i0$$a i0__a = new i0$$a(this, this.f250394a, str);
            int i2 = SendAppMessageWrapperUI.f250361A;
            sendAppMessageWrapperUI.getClass();
            C86493v0.C86495c c = C86493v0.m107224d().mo120947c("kWXEntryActivity_data_center_session_id", true);
            if (c == null) {
                Log.m105920e("MicroMsg.SendAppMessageWrapperUI", "dealFileInfo fail values is null");
                return;
            }
            String str2 = (String) c.mo120955b("kWXEntryActivity_data_center_wework_msg_file_file_info");
            if (Util.isNullOrNil(str2)) {
                Log.m105924i("MicroMsg.SendAppMessageWrapperUI", "dealFileInfo: fileInfoString isNullOrNil");
                i0__a.mo124353a((Map) null);
                return;
            }
            LinkedList linkedList = new LinkedList();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                if (jSONObject.has("file_info") && (optJSONArray = jSONObject.optJSONArray("file_info")) != null) {
                    for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i3);
                        if (optJSONObject != null) {
                            linkedList.add(new SendAppMessageWrapperUI.C85964f(sendAppMessageWrapperUI, optJSONObject.optString("msgId"), optJSONObject.optString("uri")));
                        }
                    }
                }
            } catch (Exception e) {
                Log.m105928w("dealFileInfo", "Error  json: " + e.getMessage());
            }
            ((C119157j) C119157j.f356862d).mo183875f(new C85968j(sendAppMessageWrapperUI, linkedList, i0__a));
        }
    }
}
