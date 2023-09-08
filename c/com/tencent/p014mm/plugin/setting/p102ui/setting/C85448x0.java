package com.tencent.p014mm.plugin.setting.p102ui.setting;

import com.tencent.matrix.util.MemInfo;
import com.tencent.matrix.util.ProcessInfo;
import com.tencent.matrix.util.PssInfo;
import gy3.C87412m;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import p723vf.C118672d;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.x0 */
public final class C85448x0 {

    /* renamed from: a */
    public static final C85448x0 f249036a = new C85448x0();

    /* renamed from: a */
    public final JSONObject mo118799a(MemInfo[] memInfoArr) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            jSONObject.put("count", memInfoArr.length);
            jSONObject.put("detail", jSONArray);
            ArrayList<JSONObject> arrayList = new ArrayList<>(memInfoArr.length);
            for (MemInfo memInfo : memInfoArr) {
                JSONObject jSONObject2 = new JSONObject();
                ProcessInfo processInfo = memInfo.f235671e;
                C87412m.m108591d(processInfo);
                jSONObject2.put("process", processInfo.f235683e);
                ProcessInfo processInfo2 = memInfo.f235671e;
                C87412m.m108591d(processInfo2);
                jSONObject2.put("pid", processInfo2.f235682d);
                PssInfo pssInfo = memInfo.f235676j;
                C87412m.m108591d(pssInfo);
                jSONObject2.put("amsPss", pssInfo.mo112172a());
                arrayList.add(jSONObject2);
            }
            for (JSONObject put : arrayList) {
                jSONArray.put(put);
            }
        } catch (Throwable th) {
            C118672d.m167354d("MicroMsg.SettingsAboutMMHeaderReporter", th, "", new Object[0]);
        }
        return jSONObject;
    }
}
