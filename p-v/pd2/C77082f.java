package pd2;

import com.tencent.p014mm.plugin.order.model.MallOrderDetailObject;
import com.tencent.p014mm.plugin.order.model.MallTransactionObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fr3.C75790l;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: pd2.f */
public class C77082f extends C75790l {

    /* renamed from: d */
    public MallOrderDetailObject f225146d = null;

    /* renamed from: e */
    public int f225147e = -1;

    public C77082f(String str, String str2, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("trans_id", str);
        if (!Util.isNullOrNil(str2)) {
            hashMap.put("bill_id", str2);
        }
        if (this.f225147e >= 0) {
            this.f225147e = i;
        }
        setRequestData(hashMap);
    }

    public int getTenpayCgicmd() {
        return 108;
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            MallOrderDetailObject mallOrderDetailObject = new MallOrderDetailObject();
            this.f225146d = mallOrderDetailObject;
            try {
                mallOrderDetailObject.f202072a = MallTransactionObject.m82531a(jSONObject);
            } catch (JSONException e) {
                Log.printErrStackTrace("MicroMsg.MallOrderDetailObject", e, "", new Object[0]);
            } catch (Exception e2) {
                Log.printErrStackTrace("MicroMsg.MallOrderDetailObject", e2, "", new Object[0]);
            }
            try {
                mallOrderDetailObject.f202073b = mallOrderDetailObject.mo96374e(jSONObject);
            } catch (JSONException e3) {
                Log.printErrStackTrace("MicroMsg.MallOrderDetailObject", e3, "", new Object[0]);
            } catch (Exception e4) {
                Log.printErrStackTrace("MicroMsg.MallOrderDetailObject", e4, "", new Object[0]);
            }
            try {
                mallOrderDetailObject.f202074c = mallOrderDetailObject.mo96372c(jSONObject);
            } catch (JSONException e5) {
                Log.printErrStackTrace("MicroMsg.MallOrderDetailObject", e5, "", new Object[0]);
            } catch (Exception e6) {
                Log.printErrStackTrace("MicroMsg.MallOrderDetailObject", e6, "", new Object[0]);
            }
            try {
                List<MallOrderDetailObject.C70045a> b = mallOrderDetailObject.mo96371b(jSONObject);
                mallOrderDetailObject.f202075d = b;
                mallOrderDetailObject.mo96370a(b, jSONObject);
            } catch (JSONException e7) {
                Log.printErrStackTrace("MicroMsg.MallOrderDetailObject", e7, "", new Object[0]);
            } catch (Exception e8) {
                Log.printErrStackTrace("MicroMsg.MallOrderDetailObject", e8, "", new Object[0]);
            }
            mallOrderDetailObject.f202077f = jSONObject.optString("safeguard_url");
            jSONObject.optString("share_url");
            int optInt = jSONObject.optInt("modifyTimeStamp");
            mallOrderDetailObject.f202080i = optInt;
            MallOrderDetailObject.C70046b bVar = mallOrderDetailObject.f202073b;
            if (bVar != null && optInt <= 0) {
                mallOrderDetailObject.f202080i = bVar.f202090b;
            }
            MallTransactionObject mallTransactionObject = mallOrderDetailObject.f202072a;
            if (mallTransactionObject != null) {
                mallOrderDetailObject.f202078g = mallTransactionObject.f202097D;
                mallOrderDetailObject.f202079h = mallTransactionObject.f202096C;
                mallOrderDetailObject.f202076e = mallTransactionObject.f202118U0;
            }
        }
    }
}
