package m22;

import android.content.Intent;
import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import di3.C86312j;
import ht1.C60200t1;
import ht1.C60216z4;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: m22.d */
public class C10707d extends C4770c {

    /* renamed from: m22.d$a */
    public class C10708a implements C60216z4.C8821a<Integer> {
        public C10708a() {
        }

        /* renamed from: a */
        public void mo6382a(Object obj) {
            HashMap hashMap = new HashMap();
            int intValue = ((Integer) obj).intValue();
            if (intValue == 1) {
                hashMap.put(StateEvent.Name.MESSAGE, "创建成功");
                hashMap.put("code", 100);
                hashMap.put("err_msg", "openFinderCreateAcctView:ok");
            } else if (intValue == 2) {
                hashMap.put(StateEvent.Name.MESSAGE, "用户取消");
                hashMap.put("code", 200);
                hashMap.put("err_msg", "openFinderCreateAcctView:cancel");
            } else if (intValue == 3) {
                hashMap.put(StateEvent.Name.MESSAGE, "参数为空");
                hashMap.put("code", 300);
                hashMap.put("err_msg", "openFinderCreateAcctView:fail");
            } else if (intValue == 4) {
                hashMap.put(StateEvent.Name.MESSAGE, "账号已存在");
                hashMap.put("code", 301);
                hashMap.put("err_msg", "openFinderCreateAcctView:fail");
            }
            C10707d.this.f19815f.mo5691c(hashMap);
        }
    }

    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        Log.m105918d("LiteAppJsApiOpenFinderCreateAcctView", "Invoke openFinderCreateAcctView");
        if (jSONObject == null) {
            this.f19815f.mo5689a("data is null");
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, jSONObject.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE));
            jSONObject2.put("tipsWording", jSONObject.optJSONObject("tipsWording"));
            try {
                ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76761Ha(MMApplicationContext.getContext(), (Intent) null, jSONObject2.toString(), new C10708a());
            } catch (Exception e) {
                this.f19815f.mo5689a("fail");
                Log.printErrStackTrace("LiteAppJsApiOpenFinderCreateAcctView", e, "", new Object[0]);
            }
        } catch (JSONException e2) {
            this.f19815f.mo5689a("fail");
            Log.printErrStackTrace("LiteAppJsApiOpenFinderCreateAcctView", e2, "", new Object[0]);
        }
    }
}
