package hz0;

import android.text.TextUtils;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import te3.C49029co;
import te3.C49171do;
import te3.C49309eo;
import wz0.C53269t;

/* renamed from: hz0.v */
public class C46159v extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f124433d;

    /* renamed from: e */
    public C11385n f124434e;

    /* renamed from: f */
    public String f124435f;

    /* renamed from: g */
    public ArrayList<C49029co> f124436g;

    public C46159v(String str, float f, float f2, String str2) {
        this.f124435f = str;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49171do();
        bVar.f127067b = new C49309eo();
        bVar.f127068c = "/cgi-bin/micromsg-bin/cardshoplbs";
        bVar.f127069d = 1058;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f124433d = a;
        C49171do doVar = (C49171do) a.f127055a.f127080a;
        doVar.f132437d = str;
        doVar.f132438e = f;
        doVar.f132439f = f2;
        doVar.f132440g = str2;
        Log.m105919d("MicroMsg.NetSceneCardShopLBS", "<init>, cardId = %s, longtitude = %f, latitude = %f, card_id = %s", str, Float.valueOf(f), Float.valueOf(f2), str2);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        if (Util.isNullOrNil(((C49171do) this.f124433d.f127055a.f127080a).f132437d)) {
            Log.m105920e("MicroMsg.NetSceneCardShopLBS", "doScene fail, cardId is null");
            return -1;
        }
        this.f124434e = nVar;
        return dispatch(gVar, this.f124433d, this);
    }

    public int getType() {
        return 1058;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneCardShopLBS", "onGYNetEnd, errType = %d, errCode = %d", Integer.valueOf(i2), Integer.valueOf(i3));
        if (i2 == 0 && i3 == 0) {
            String str2 = ((C49309eo) this.f124433d.f127056b.f127083a).f133025d;
            if (TextUtils.isEmpty(str2)) {
                Log.m105920e("MicroMsg.NetSceneCardShopLBS", "onGYNetEnd fail, json_ret is empty");
            }
            ArrayList<C49029co> arrayList = null;
            if (!TextUtils.isEmpty(str2)) {
                try {
                    JSONArray jSONArray = new JSONObject(str2).getJSONArray("used_store_list");
                    if (jSONArray != null) {
                        if (jSONArray.length() != 0) {
                            ArrayList<C49029co> arrayList2 = new ArrayList<>();
                            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                                C49029co a = C53269t.m59711a(jSONArray.getJSONObject(i4));
                                if (a != null) {
                                    arrayList2.add(a);
                                }
                            }
                            arrayList = arrayList2;
                        }
                    }
                } catch (JSONException e) {
                    Log.printErrStackTrace("MicroMsg.ShopInfoItemParser", e, "", new Object[0]);
                }
            }
            this.f124436g = arrayList;
            if (arrayList != null) {
                Log.m105919d("MicroMsg.NetSceneCardShopLBS", "onGYNetEnd, respList size = %d", Integer.valueOf(arrayList.size()));
            }
        }
        this.f124434e.onSceneEnd(i2, i3, str, this);
    }
}
