package b00;

import c00.C0406o;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86301e;
import ei3.C86522b;
import org.json.JSONArray;
import org.json.JSONObject;
import u73.C78137s0;

@C86522b
/* renamed from: b00.k */
public class C28202k extends C86301e implements C0406o {
    /* renamed from: Fb */
    public String mo447Fb(String str) {
        return C78137s0.m94340d("entranceWording").optString(str);
    }

    /* renamed from: p4 */
    public JSONObject mo448p4(String str) {
        return C78137s0.m94340d(str);
    }

    public boolean yv0(int i, int i2) {
        JSONArray optJSONArray = C78137s0.m94340d("hideEnterKeyboard").optJSONArray("items");
        if (optJSONArray == null) {
            return false;
        }
        for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i3);
            if (optJSONObject.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0) == i && optJSONObject.optInt("type", 0) == i2) {
                return true;
            }
        }
        return false;
    }
}
