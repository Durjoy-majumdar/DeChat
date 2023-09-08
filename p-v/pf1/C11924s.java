package pf1;

import c30.C104289g;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: pf1.s */
public final class C11924s extends C11906j {

    /* renamed from: l */
    public boolean f34860l;

    /* renamed from: m */
    public int f34861m;

    /* renamed from: n */
    public int f34862n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11924s(C104289g gVar) {
        super(gVar);
        C87412m.m108594g(gVar, "data");
        Log.m105924i("Finder.MutualJumpInfoCache", "aid:" + this.f34786i);
        try {
            JSONArray jSONArray = new JSONArray(gVar.optString("crt_info"));
            if (jSONArray.length() > 0) {
                JSONObject jSONObject = jSONArray.getJSONObject(0);
                this.f34820c = jSONObject.optString("image_url");
                JSONObject optJSONObject = jSONObject.optJSONObject("card_info");
                if (optJSONObject != null) {
                    this.f34818a = optJSONObject.optString("description");
                    this.f34819b = optJSONObject.optString("caption");
                }
            }
        } catch (Exception unused) {
        }
    }
}
