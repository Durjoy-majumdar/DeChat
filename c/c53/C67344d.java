package c53;

import org.json.JSONObject;

/* renamed from: c53.d */
public class C67344d {

    /* renamed from: a */
    public int f193193a;

    /* renamed from: b */
    public String f193194b;

    /* renamed from: c */
    public String f193195c;

    /* renamed from: d */
    public String f193196d;

    /* renamed from: e */
    public String f193197e;

    /* renamed from: a */
    public static C67344d m79686a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int optInt = jSONObject.optInt("notify_flag", 0);
        String optString = jSONObject.optString("notify_wording", "");
        String optString2 = jSONObject.optString("left_button_wording", "");
        String optString3 = jSONObject.optString("right_button_wording", "");
        String optString4 = jSONObject.optString("confirm_button_wording", "");
        if (optInt == 0) {
            return null;
        }
        C67344d dVar = new C67344d();
        dVar.f193193a = optInt;
        dVar.f193194b = optString;
        dVar.f193195c = optString2;
        dVar.f193196d = optString3;
        dVar.f193197e = optString4;
        return dVar;
    }
}
