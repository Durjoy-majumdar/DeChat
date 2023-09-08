package id2;

import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.plugin.offline.C69963m;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import ob0.C11385n;
import ob0.C47350c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import te3.C50780p42;

/* renamed from: id2.c */
public class C46216c extends C75123k0 {

    /* renamed from: d */
    public C11385n f124575d;

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f124575d = nVar;
        return dispatch(gVar, (C114799u) null, this);
    }

    public int getType() {
        return 606;
    }

    /* renamed from: j1 */
    public final void mo71630j1(JSONObject jSONObject) {
        if (jSONObject != null) {
            int optInt = jSONObject.optInt("InitValue");
            int optInt2 = jSONObject.optInt("FastChangedLimit");
            jSONObject.optString("guide_tips");
            C69963m wx02 = C69963m.wx0();
            wx02.Cx0(196640, "" + optInt);
            C69963m wx03 = C69963m.wx0();
            wx03.Cx0(196642, "" + optInt2);
            Log.m105926v("MicroMsg.NetSceneGetOffLineInfo", "initValue:" + optInt + " fastChangeValue:" + optInt2);
        }
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        if (i2 != 0) {
            Log.m105920e("MicroMsg.NetSceneGetOffLineInfo", "Cmd : " + 606 + ", errType = " + i2 + ", errCode = " + i3 + ", errMsg = " + str);
        }
        C50780p42 p422 = (C50780p42) ((C47350c) uVar).f127056b.f127083a;
        if (i2 == 0 && i3 == 0) {
            try {
                if (!TextUtils.isEmpty(p422.f139577f)) {
                    mo71630j1(new JSONObject(p422.f139577f));
                }
                if (!TextUtils.isEmpty(p422.f139578g)) {
                    JSONObject jSONObject = new JSONObject(p422.f139578g);
                    jSONObject.optString("micropay_tips");
                    try {
                        JSONArray jSONArray = jSONObject.getJSONArray("head_url_list");
                        if (jSONArray != null) {
                            if (jSONArray.length() != 0) {
                                if (jSONArray.length() > 0) {
                                    String str2 = (String) jSONArray.get(0);
                                    throw null;
                                }
                            }
                        }
                    } catch (JSONException e) {
                        Log.printErrStackTrace("MicroMsg.NetSceneGetOffLineInfo", e, "", new Object[0]);
                    }
                }
            } catch (Exception e2) {
                Log.printErrStackTrace("MicroMsg.NetSceneGetOffLineInfo", e2, "", new Object[0]);
                i2 = 1000;
                i3 = 2;
                str = MMApplicationContext.getContext().getString(C0966R.string.krp);
            }
        }
        C11385n nVar = this.f124575d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
