package com.tencent.midas.api.request;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

public class APInventory {
    public ArrayList<APPurchase> mPurchaseList = new ArrayList<>();
    public Map<String, APPurchase> mPurchaseMap = new HashMap();

    public APInventory(String str) {
        parsePurchse(str);
    }

    private void parsePurchse(String str) {
        new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                APPurchase aPPurchase = new APPurchase((String) jSONArray.getJSONObject(i).get("data"), (String) jSONArray.getJSONObject(i).get("sign"));
                this.mPurchaseMap.put(aPPurchase.getSku(), aPPurchase);
                this.mPurchaseList.add(aPPurchase);
            }
        } catch (JSONException unused) {
        }
    }

    public void erasePurchase(String str) {
        if (this.mPurchaseMap.containsKey(str)) {
            this.mPurchaseMap.remove(str);
        }
    }

    public List<String> getAllOwnedSkus() {
        return new ArrayList(this.mPurchaseMap.keySet());
    }

    public List<APPurchase> getAllPurchases() {
        return new ArrayList(this.mPurchaseMap.values());
    }

    public APPurchase getPurchase(String str) {
        return this.mPurchaseMap.get(str);
    }

    public List<APPurchase> getPurchaseList() {
        return this.mPurchaseList;
    }

    public boolean hasPurchase(String str) {
        return this.mPurchaseMap.containsKey(str);
    }
}
