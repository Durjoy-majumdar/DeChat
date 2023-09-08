package com.tencent.kinda.framework.app;

import com.tencent.kinda.gen.KPayMenuRedDotHelper;
import com.tencent.kinda.gen.KPayMenuRedDotItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import org.json.JSONException;
import org.json.JSONObject;

public class KindaPayMenuRedDotHelper implements KPayMenuRedDotHelper {
    private static final String TAG = "KindaPayMenuRedDotHelper";

    private void clearReddotConfigWithId(String str) {
        Log.m105925i(TAG, "clear reddot: %s", str);
        JSONObject redDotConfig = getRedDotConfig();
        if (redDotConfig != null) {
            redDotConfig.remove(str);
            redDotConfig.remove(String.format("%s_expiretime", new Object[]{str}));
            redDotConfig.remove(String.format("%s_wording", new Object[]{str}));
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_New_MALL_UI_ITEM_REDDOT_CONFIG_STRING_SYNC, redDotConfig.toString());
        }
    }

    private JSONObject getRedDotConfig() {
        C86709a0.m107528h();
        String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_New_MALL_UI_ITEM_REDDOT_CONFIG_STRING_SYNC, "");
        if (!Util.isNullOrNil(str)) {
            try {
                return new JSONObject(str);
            } catch (JSONException e) {
                Log.printErrStackTrace(TAG, e, "", new Object[0]);
            }
        }
        return null;
    }

    public void clearPayMenuRedDot(String str) {
        clearReddotConfigWithId(str);
    }

    public KPayMenuRedDotItem getRedDotItemWithRedDotId(String str) {
        if (Util.isNullOrNil(str)) {
            return new KPayMenuRedDotItem();
        }
        JSONObject redDotConfig = getRedDotConfig();
        if (redDotConfig == null) {
            return new KPayMenuRedDotItem();
        }
        if (!(redDotConfig.optInt(str, 0) == 1)) {
            return new KPayMenuRedDotItem();
        }
        KPayMenuRedDotItem kPayMenuRedDotItem = new KPayMenuRedDotItem();
        kPayMenuRedDotItem.mExpireTime = redDotConfig.optLong(String.format("%s_expiretime", new Object[]{str}), 0);
        kPayMenuRedDotItem.mWording = redDotConfig.optString(String.format("%s_wording", new Object[]{str}), "");
        kPayMenuRedDotItem.mItemName = str;
        return kPayMenuRedDotItem;
    }
}
