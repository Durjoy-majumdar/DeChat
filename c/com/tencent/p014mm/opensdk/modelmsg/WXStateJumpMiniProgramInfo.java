package com.tencent.p014mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.p014mm.opensdk.modelmsg.WXStateSceneDataObject;
import com.tencent.p014mm.opensdk.utils.Log;

/* renamed from: com.tencent.mm.opensdk.modelmsg.WXStateJumpMiniProgramInfo */
public class WXStateJumpMiniProgramInfo implements WXStateSceneDataObject.IWXStateJumpInfo {
    private static final String TAG = "MicroMsg.SDK.WXStateJumpUrlInfo";
    public int miniProgramType;
    public String path;
    public String username;

    public boolean checkArgs() {
        String str = this.username;
        if (str != null && str.length() > 0) {
            return true;
        }
        Log.m99044e(TAG, "checkArgs fail, username is null");
        return false;
    }

    public void serialize(Bundle bundle) {
        bundle.putString("wx_state_jump_mini_program_username", this.username);
        bundle.putString("wx_state_jump_mini_program_path", this.path);
        bundle.putInt("wx_state_jump_mini_program_type", this.miniProgramType);
    }

    public int type() {
        return 2;
    }

    public void unserialize(Bundle bundle) {
        this.username = bundle.getString("wx_state_jump_mini_program_username", "");
        this.path = bundle.getString("wx_state_jump_mini_program_path", "");
        this.miniProgramType = bundle.getInt("wx_state_jump_mini_program_type", 0);
    }
}
