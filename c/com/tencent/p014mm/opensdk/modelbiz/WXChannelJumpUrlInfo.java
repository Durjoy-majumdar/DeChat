package com.tencent.p014mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.p014mm.opensdk.utils.Log;

/* renamed from: com.tencent.mm.opensdk.modelbiz.WXChannelJumpUrlInfo */
public class WXChannelJumpUrlInfo extends WXChannelBaseJumpInfo {
    private static final int LENGTH_LIMIT = 10240;
    private static final String TAG = "MicroMsg.SDK.WXChannelJumpUrlInfo";
    public String url;

    public boolean checkArgs() {
        String str;
        String str2 = this.url;
        if (str2 == null || str2.length() <= 0) {
            str = "checkArgs fail, url is null";
        } else if (this.url.length() < 10240) {
            return true;
        } else {
            str = "checkArgs fail, url is invalid";
        }
        Log.m99044e(TAG, str);
        return false;
    }

    public void serialize(Bundle bundle) {
        super.serialize(bundle);
        bundle.putString("wx_channel_jump_url", this.url);
    }

    public int type() {
        return 2;
    }

    public void unserialize(Bundle bundle) {
        super.unserialize(bundle);
        this.url = bundle.getString("wx_channel_jump_url");
    }
}
