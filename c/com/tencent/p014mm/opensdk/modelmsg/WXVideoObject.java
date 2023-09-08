package com.tencent.p014mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.opensdk.utils.Log;

/* renamed from: com.tencent.mm.opensdk.modelmsg.WXVideoObject */
public class WXVideoObject implements WXMediaMessage.IMediaObject {
    private static final int LENGTH_LIMIT = 10240;
    private static final String TAG = "MicroMsg.SDK.WXVideoObject";
    public String videoLowBandUrl;
    public String videoUrl;

    public boolean checkArgs() {
        String str;
        String str2;
        String str3 = this.videoUrl;
        if ((str3 == null || str3.length() == 0) && ((str2 = this.videoLowBandUrl) == null || str2.length() == 0)) {
            str = "both arguments are null";
        } else {
            String str4 = this.videoUrl;
            if (str4 == null || str4.length() <= 10240) {
                String str5 = this.videoLowBandUrl;
                if (str5 == null || str5.length() <= 10240) {
                    return true;
                }
                str = "checkArgs fail, videoLowBandUrl is too long";
            } else {
                str = "checkArgs fail, videoUrl is too long";
            }
        }
        Log.m99044e(TAG, str);
        return false;
    }

    public void serialize(Bundle bundle) {
        bundle.putString("_wxvideoobject_videoUrl", this.videoUrl);
        bundle.putString("_wxvideoobject_videoLowBandUrl", this.videoLowBandUrl);
    }

    public int type() {
        return 4;
    }

    public void unserialize(Bundle bundle) {
        this.videoUrl = bundle.getString("_wxvideoobject_videoUrl");
        this.videoLowBandUrl = bundle.getString("_wxvideoobject_videoLowBandUrl");
    }
}
