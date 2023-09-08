package jq2;

import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import java.util.Iterator;
import jq2.C98995n;
import org.json.JSONArray;
import org.json.JSONObject;
import vr2.C102235a;

/* renamed from: jq2.p */
public class C98999p implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f290260d;

    /* renamed from: e */
    public final /* synthetic */ String f290261e;

    /* renamed from: f */
    public final /* synthetic */ C98995n.C98997b f290262f;

    public C98999p(C98995n.C98997b bVar, String str, String str2) {
        this.f290262f = bVar;
        this.f290260d = str;
        this.f290261e = str2;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback$2");
        try {
            C98995n.C98997b.m128910b(this.f290262f, this.f290260d);
            if (C98995n.C98997b.m128909a(this.f290262f) == null) {
                Log.m105920e("DynamicDataReqHelper", "adInfo is null, can not update AdInfo, snsId = " + this.f290260d);
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback$2");
                return;
            }
            C102235a aVar = new C102235a();
            JSONObject jSONObject = new JSONObject(this.f290261e);
            if (jSONObject.has("WordingComplexString")) {
                aVar.f301035g = jSONObject.optString("WordingComplexString");
            }
            if (jSONObject.has("WordingComplexExchangeValue")) {
                aVar.f301036h = jSONObject.optInt("WordingComplexExchangeValue");
            }
            if (jSONObject.has("WordingLink")) {
                aVar.f301031c = jSONObject.optString("WordingLink");
            } else {
                aVar.f301031c = null;
            }
            if (jSONObject.has("WordingType")) {
                int optInt = jSONObject.optInt("WordingType");
                aVar.f301029a = optInt;
                if (optInt == ADInfo.ADChainStrengthenUserInfoFormatWording) {
                    if (jSONObject.has("UserNameList")) {
                        JSONArray optJSONArray = jSONObject.optJSONArray("UserNameList");
                        aVar.f301032d.clear();
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            aVar.f301032d.add(optJSONArray.optString(i));
                        }
                    } else {
                        aVar.f301032d.clear();
                    }
                    if (jSONObject.has("WordingRepAndroid")) {
                        String optString = jSONObject.optString("WordingRepAndroid");
                        boolean z = optString.indexOf("%s") >= 0;
                        int indexOf = optString.indexOf("%");
                        int lastIndexOf = optString.lastIndexOf("%");
                        if (!Util.isNullOrNil(optString) && z && indexOf == lastIndexOf) {
                            aVar.f301030b = optString;
                        }
                        if (!Util.isNullOrNil(aVar.f301030b)) {
                            String str = "";
                            Iterator<String> it = aVar.f301032d.iterator();
                            while (it.hasNext()) {
                                String next = it.next();
                                C72996z1 H3 = C94866e1.Jx0().mo69656H3(next);
                                if (H3 != null) {
                                    String f = H3.mo62898f();
                                    if (!Util.isNullOrNil(f)) {
                                        str = str + f;
                                    } else {
                                        str = str + next;
                                    }
                                } else {
                                    str = str + next;
                                }
                                if (aVar.f301032d.getLast() != next) {
                                    str = str + ",";
                                }
                            }
                            aVar.f301033e = str;
                            aVar.f301034f = String.format(aVar.f301030b, new Object[]{str});
                        }
                    } else {
                        C98995n.C98997b.m128911c(this.f290262f, aVar);
                    }
                } else if (optInt != ADInfo.ADChainStrengthenDefaultWording || !jSONObject.has("Wording")) {
                    C98995n.C98997b.m128911c(this.f290262f, aVar);
                } else {
                    aVar.f301030b = jSONObject.optString("Wording");
                }
            } else {
                C98995n.C98997b.m128911c(this.f290262f, aVar);
            }
            C98995n.C98997b.m128912d(this.f290262f, aVar);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback$2");
        } catch (Throwable th) {
            Log.m105920e("DynamicDataReqHelper", th.toString());
        }
    }
}
