package cj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import di0.C86295k;
import gy3.C87412m;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: cj1.l6 */
public final class C54789l6 implements C86295k {

    /* renamed from: d */
    public String f153583d = "";

    /* renamed from: e */
    public long f153584e;

    /* renamed from: f */
    public int f153585f;

    /* renamed from: g */
    public String f153586g = "";

    /* renamed from: h */
    public String f153587h = "";

    /* renamed from: i */
    public String f153588i = "";

    /* renamed from: j */
    public String f153589j = "";

    /* renamed from: n */
    public boolean f153590n;

    /* renamed from: o */
    public int f153591o;

    /* renamed from: p */
    public byte[] f153592p;

    /* renamed from: q */
    public int f153593q;

    /* renamed from: r */
    public boolean f153594r = true;

    /* renamed from: s */
    public boolean f153595s;

    /* renamed from: a */
    public String mo3693a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("extraData", this.f153583d);
            jSONObject.put("productId", this.f153584e);
            jSONObject.put("isPreRender", this.f153585f);
            jSONObject.put("openMode", this.f153586g);
            String str = this.f153587h;
            if (str == null) {
                str = "";
            }
            jSONObject.put("shopExtraData", str);
            jSONObject.put("finderUsername", this.f153589j);
            jSONObject.put("finderLiveToken", this.f153588i);
            jSONObject.put("hasClientDragBar", this.f153590n);
            Log.m105924i("WxLiveShoppingExtranData", "finderUsername:" + this.f153589j + ", finderLiveToken:" + this.f153588i);
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "{\n            val obj = … obj.toString()\n        }");
            return jSONObject2;
        } catch (JSONException e) {
            Log.printErrStackTrace("WxLiveShoppingExtranData", e, "", new Object[0]);
            return "{}";
        }
    }

    public String toString() {
        return mo3693a();
    }
}
