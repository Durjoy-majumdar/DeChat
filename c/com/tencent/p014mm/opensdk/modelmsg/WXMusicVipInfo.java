package com.tencent.p014mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.p014mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.p014mm.opensdk.utils.Log;

/* renamed from: com.tencent.mm.opensdk.modelmsg.WXMusicVipInfo */
public class WXMusicVipInfo implements SendMessageToWX.IWXMusicVipObject {
    private static final int LENGTH_LIMIT = 10240;
    private static final String TAG = "MicroMsg.SDK.WXMusicVipInfo";
    public String musicId;

    public boolean checkArgs() {
        String str;
        String str2 = this.musicId;
        if (str2 == null || str2.length() <= 0) {
            str = "checkArgs fail, musicId is null";
        } else if (this.musicId.length() <= 10240) {
            return true;
        } else {
            str = "checkArgs fail, musicId length is larger than 1024";
        }
        Log.m99044e(TAG, str);
        return false;
    }

    public void serialize(Bundle bundle) {
        bundle.putString("wx_music_vip_id", this.musicId);
    }

    public void unserialize(Bundle bundle) {
        this.musicId = bundle.getString("wx_music_vip_id", "");
    }
}
