package com.tencent.p014mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.p014mm.opensdk.modelmsg.WXStateSceneDataObject;
import com.tencent.p014mm.opensdk.utils.Log;

/* renamed from: com.tencent.mm.opensdk.modelmsg.WXStateJumpChannelProfileInfo */
public class WXStateJumpChannelProfileInfo implements WXStateSceneDataObject.IWXStateJumpInfo {
    private static final String TAG = "MicroMsg.SDK.WXStateJumpUrlInfo";
    private static final int USERNAME_LENGTH_LIMIT = 1024;
    public String username;

    public boolean checkArgs() {
        String str;
        String str2 = this.username;
        if (str2 == null || str2.length() <= 0) {
            str = "checkArgs fail, username is null";
        } else if (this.username.length() < 1024) {
            return true;
        } else {
            str = "checkArgs fail, username length exceed limit";
        }
        Log.m99044e(TAG, str);
        return false;
    }

    public void serialize(Bundle bundle) {
        bundle.putString("wx_state_jump_channel_profile_username", this.username);
    }

    public int type() {
        return 3;
    }

    public void unserialize(Bundle bundle) {
        this.username = bundle.getString("wx_state_jump_channel_profile_username", "");
    }
}
