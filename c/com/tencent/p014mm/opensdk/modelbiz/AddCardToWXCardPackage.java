package com.tencent.p014mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.p014mm.opensdk.modelbase.BaseReq;
import com.tencent.p014mm.opensdk.modelbase.BaseResp;
import com.tencent.p014mm.opensdk.utils.Log;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONStringer;
import org.json.JSONTokener;

/* renamed from: com.tencent.mm.opensdk.modelbiz.AddCardToWXCardPackage */
public class AddCardToWXCardPackage {
    private static final String TAG = "MicroMsg.AddCardToWXCardPackage";

    /* renamed from: com.tencent.mm.opensdk.modelbiz.AddCardToWXCardPackage$Req */
    public static class Req extends BaseReq {
        public List<WXCardItem> cardArrary;

        public boolean checkArgs() {
            String str;
            String str2;
            List<WXCardItem> list = this.cardArrary;
            if (list == null || list.size() == 0 || this.cardArrary.size() > 40) {
                return false;
            }
            for (WXCardItem next : this.cardArrary) {
                if (next == null || (str = next.cardId) == null || str.length() > 1024 || ((str2 = next.cardExtMsg) != null && str2.length() > 1024)) {
                    return false;
                }
            }
            return true;
        }

        public int getType() {
            return 9;
        }

        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            JSONStringer jSONStringer = new JSONStringer();
            try {
                jSONStringer.object();
                jSONStringer.key("card_list");
                jSONStringer.array();
                for (WXCardItem next : this.cardArrary) {
                    jSONStringer.object();
                    jSONStringer.key("card_id");
                    jSONStringer.value(next.cardId);
                    jSONStringer.key("card_ext");
                    String str = next.cardExtMsg;
                    if (str == null) {
                        str = "";
                    }
                    jSONStringer.value(str);
                    jSONStringer.endObject();
                }
                jSONStringer.endArray();
                jSONStringer.endObject();
            } catch (Exception e) {
                Log.m99044e(AddCardToWXCardPackage.TAG, "Req.toBundle exception:" + e.getMessage());
            }
            bundle.putString("_wxapi_add_card_to_wx_card_list", jSONStringer.toString());
        }
    }

    /* renamed from: com.tencent.mm.opensdk.modelbiz.AddCardToWXCardPackage$Resp */
    public static class Resp extends BaseResp {
        public List<WXCardItem> cardArrary;

        public Resp() {
        }

        public Resp(Bundle bundle) {
            fromBundle(bundle);
        }

        public boolean checkArgs() {
            List<WXCardItem> list = this.cardArrary;
            return (list == null || list.size() == 0) ? false : true;
        }

        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            if (this.cardArrary == null) {
                this.cardArrary = new LinkedList();
            }
            String string = bundle.getString("_wxapi_add_card_to_wx_card_list");
            if (string != null && string.length() > 0) {
                try {
                    JSONArray jSONArray = ((JSONObject) new JSONTokener(string).nextValue()).getJSONArray("card_list");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        WXCardItem wXCardItem = new WXCardItem();
                        wXCardItem.cardId = jSONObject.optString("card_id");
                        wXCardItem.cardExtMsg = jSONObject.optString("card_ext");
                        wXCardItem.cardState = jSONObject.optInt("is_succ");
                        this.cardArrary.add(wXCardItem);
                    }
                } catch (Exception e) {
                    Log.m99044e(AddCardToWXCardPackage.TAG, "fromBundle exception: " + e.getMessage());
                }
            }
        }

        public int getType() {
            return 9;
        }

        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            JSONStringer jSONStringer = new JSONStringer();
            try {
                jSONStringer.object();
                jSONStringer.key("card_list");
                jSONStringer.array();
                for (WXCardItem next : this.cardArrary) {
                    jSONStringer.object();
                    jSONStringer.key("card_id");
                    jSONStringer.value(next.cardId);
                    jSONStringer.key("card_ext");
                    String str = next.cardExtMsg;
                    if (str == null) {
                        str = "";
                    }
                    jSONStringer.value(str);
                    jSONStringer.key("is_succ");
                    jSONStringer.value((long) next.cardState);
                    jSONStringer.endObject();
                }
                jSONStringer.endArray();
                jSONStringer.endObject();
            } catch (Exception e) {
                Log.m99044e(AddCardToWXCardPackage.TAG, "Resp.toBundle exception:" + e.getMessage());
            }
            bundle.putString("_wxapi_add_card_to_wx_card_list", jSONStringer.toString());
        }
    }

    /* renamed from: com.tencent.mm.opensdk.modelbiz.AddCardToWXCardPackage$WXCardItem */
    public static final class WXCardItem {
        public String cardExtMsg;
        public String cardId;
        public int cardState;
    }
}
