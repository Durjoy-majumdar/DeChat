package com.tencent.p014mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.opensdk.utils.Log;

/* renamed from: com.tencent.mm.opensdk.modelmsg.WXNativeGamePageObject */
public class WXNativeGamePageObject implements WXMediaMessage.IMediaObject {
    private static final int LENGTH_LIMIT = 102400;
    private static final String TAG = "MicroMsg.SDK.WXNativeGamePageObject";
    public boolean isVideo = false;
    public String shareData;
    public int videoDuration;

    public boolean checkArgs() {
        String str;
        String str2 = this.shareData;
        if (str2 == null || str2.length() == 0) {
            str = "checkArgs fail, shareData is empty!";
        } else if (this.shareData.length() <= LENGTH_LIMIT) {
            return true;
        } else {
            str = "checkArgs fail, shareData is too large";
        }
        Log.m99044e(TAG, str);
        return false;
    }

    public void serialize(Bundle bundle) {
        bundle.putBoolean("_wxnativegamepageobject_isvideo", this.isVideo);
        bundle.putInt("_wxnativegamepageobject_videoduraion", this.videoDuration);
        bundle.putString("_wxnativegamepageobject_sharedata", this.shareData);
    }

    public int type() {
        return 101;
    }

    public void unserialize(Bundle bundle) {
        this.isVideo = bundle.getBoolean("_wxnativegamepageobject_isvideo");
        this.videoDuration = bundle.getInt("_wxnativegamepageobject_videoduraion");
        this.shareData = bundle.getString("_wxnativegamepageobject_sharedata");
    }
}
