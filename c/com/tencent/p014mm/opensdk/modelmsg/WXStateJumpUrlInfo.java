package com.tencent.p014mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.p014mm.opensdk.modelmsg.WXStateSceneDataObject;
import com.tencent.p014mm.opensdk.utils.Log;

/* renamed from: com.tencent.mm.opensdk.modelmsg.WXStateJumpUrlInfo */
public class WXStateJumpUrlInfo implements WXStateSceneDataObject.IWXStateJumpInfo {
    private static final int LENGTH_LIMIT = 10240;
    private static final String TAG = "MicroMsg.SDK.WXStateJumpUrlInfo";
    public String jumpUrl;

    public boolean checkArgs() {
        String str;
        String str2 = this.jumpUrl;
        if (str2 == null || str2.length() <= 0) {
            str = "checkArgs fail, jumpUrl is null";
        } else if (this.jumpUrl.length() < 10240) {
            return true;
        } else {
            str = "checkArgs fail, jumpUrl is invalid";
        }
        Log.m99044e(TAG, str);
        return false;
    }

    public void serialize(Bundle bundle) {
        bundle.putString("wx_state_jump_url", this.jumpUrl);
    }

    public int type() {
        return 1;
    }

    public void unserialize(Bundle bundle) {
        this.jumpUrl = bundle.getString("wx_state_jump_url", "");
    }
}
