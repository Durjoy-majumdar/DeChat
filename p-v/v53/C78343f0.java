package v53;

import com.tencent.p014mm.opensdk.constants.ConstantsAPI;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fr3.C75790l;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: v53.f0 */
public class C78343f0 extends C75790l {

    /* renamed from: d */
    public Orders f229577d;

    public C78343f0(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("trans_id", str);
        setRequestData(hashMap);
    }

    public int getTenpayCgicmd() {
        return 3;
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        int i2;
        if (jSONObject != null) {
            try {
                this.f229577d = new Orders();
                Orders.Commodity commodity = new Orders.Commodity();
                commodity.f209595d = jSONObject.getString("buy_uin");
                commodity.f209596e = jSONObject.getString("buy_name");
                commodity.f209597f = jSONObject.optString("sale_uin");
                commodity.f209598g = jSONObject.optString("sale_name");
                commodity.f209606r = jSONObject.getString("trans_id");
                commodity.f209599h = jSONObject.optString("goods_name");
                commodity.f209601j = jSONObject.optDouble("pay_num") / 100.0d;
                commodity.f209603o = jSONObject.getString("trade_state");
                commodity.f209604p = jSONObject.getString("trade_state_name");
                commodity.f209607s = jSONObject.getString("buy_bank_name");
                commodity.f209613y = jSONObject.optString("discount", "");
                commodity.f209605q = jSONObject.optInt("modify_timestamp");
                commodity.f209608t = jSONObject.optString("fee_type");
                commodity.f209609u = jSONObject.optString("appusername");
                commodity.f209611w = jSONObject.optString("app_telephone");
                commodity.f209602n = jSONObject.optDouble("original_total_fee", -1.0d) / 100.0d;
                commodity.f209608t = jSONObject.optString("fee_type", "");
                JSONObject optJSONObject = jSONObject.optJSONObject("subscribe_biz_info");
                if (optJSONObject != null) {
                    Orders.Promotions promotions = new Orders.Promotions();
                    promotions.f209664d = 0;
                    promotions.f209666f = optJSONObject.optString("nickname");
                    String optString = optJSONObject.optString("username");
                    promotions.f209669i = optString;
                    commodity.f209610v = optString;
                    promotions.f209665e = optJSONObject.optString("logo_round_url");
                    promotions.f209668h = optJSONObject.optString("subscribe_biz_url");
                    i2 = optJSONObject.optInt("recommend_level");
                    commodity.f209614z = i2;
                    if (!Util.isNullOrNil(promotions.f209666f)) {
                        commodity.f209592H.add(promotions);
                    }
                } else {
                    i2 = 1;
                }
                JSONArray jSONArray = jSONObject.getJSONArray("activity_info");
                int length = jSONArray.length();
                for (int i3 = 0; i3 < length; i3++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                    Orders.Promotions promotions2 = new Orders.Promotions();
                    promotions2.f209664d = 1;
                    promotions2.f209665e = jSONObject2.optString("icon");
                    promotions2.f209666f = jSONObject2.optString("wording");
                    promotions2.f209668h = jSONObject2.optString("url");
                    promotions2.f209667g = jSONObject2.optString("btn_text");
                    promotions2.f209671n = jSONObject2.optInt("type");
                    promotions2.f209670j = jSONObject2.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                    promotions2.f209672o = jSONObject2.optLong(ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID);
                    promotions2.f209673p = jSONObject2.optInt("activity_type", 0);
                    promotions2.f209674q = jSONObject2.optInt("award_id");
                    promotions2.f209675r = jSONObject2.optInt("send_record_id");
                    promotions2.f209676s = jSONObject2.optInt("user_record_id");
                    promotions2.f209678u = jSONObject2.optString("activity_tinyapp_username");
                    promotions2.f209679v = jSONObject2.optString("activity_tinyapp_path");
                    promotions2.f209680w = jSONObject2.optLong("activity_mch_id");
                    promotions2.f209681x = jSONObject2.optInt("activity_tinyapp_version");
                    promotions2.f209682y = jSONObject2.optString("get_award_params");
                    promotions2.f209683z = jSONObject2.optString("query_award_status_params");
                    Orders.m84562d(promotions2, jSONObject2.optJSONObject("exposure_info"));
                    commodity.f209592H.add(promotions2);
                }
                JSONArray optJSONArray = jSONObject.optJSONArray("discount_array");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    int length2 = optJSONArray.length();
                    commodity.f209585A = new ArrayList();
                    for (int i4 = 0; i4 < length2; i4++) {
                        JSONObject optJSONObject2 = optJSONArray.optJSONObject(i4);
                        Orders.DiscountInfo discountInfo = new Orders.DiscountInfo();
                        discountInfo.f209632d = optJSONObject2.optDouble("payment_amount");
                        discountInfo.f209633e = optJSONObject2.optString("favor_desc");
                        commodity.f209585A.add(discountInfo);
                    }
                }
                commodity.f209586B = jSONObject.optString("rateinfo");
                jSONObject.optString("discount_rateinfo");
                commodity.f209587C = jSONObject.optString("original_feeinfo");
                this.f229577d.f209542M = new ArrayList();
                this.f229577d.f209542M.add(commodity);
                this.f229577d.f209532C = jSONObject.optString("trade_state_name");
                this.f229577d.f209530A = i2;
            } catch (JSONException e) {
                Log.printErrStackTrace("MicroMsg.NetSceneTenpayQueryOrderInfo", e, "", new Object[0]);
            } catch (Exception e2) {
                Log.printErrStackTrace("MicroMsg.NetSceneTenpayQueryOrderInfo", e2, "", new Object[0]);
            }
        }
    }

    public C78343f0(String str, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("trans_id", str);
        hashMap.put("pay_type", "" + i);
        setRequestData(hashMap);
    }
}
