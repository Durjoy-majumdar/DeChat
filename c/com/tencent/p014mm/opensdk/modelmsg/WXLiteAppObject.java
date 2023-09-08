package com.tencent.p014mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.opensdk.utils.C81058b;
import com.tencent.p014mm.opensdk.utils.Log;

/* renamed from: com.tencent.mm.opensdk.modelmsg.WXLiteAppObject */
public class WXLiteAppObject implements WXMediaMessage.IMediaObject {
    private static final String TAG = "MicroMsg.SDK.WXLiteAppObject";
    public String path;
    public String query;
    public int source;
    public String userName;
    public String webpageUrl;

    public boolean checkArgs() {
        if (!C81058b.m99052b(this.userName)) {
            return true;
        }
        Log.m99044e(TAG, "userName is null");
        return false;
    }

    public void serialize(Bundle bundle) {
        bundle.putString("_wxliteapp_webpageurl", this.webpageUrl);
        bundle.putString("_wxliteapp_username", this.userName);
        bundle.putString("_wxliteapp_path", this.path);
        bundle.putString("_wxliteapp_query", this.query);
        bundle.putInt("_wxliteapp_source", this.source);
    }

    public int type() {
        return 68;
    }

    public void unserialize(Bundle bundle) {
        this.webpageUrl = bundle.getString("_wxliteapp_webpageurl");
        this.userName = bundle.getString("_wxliteapp_username");
        this.path = bundle.getString("_wxliteapp_path");
        this.query = bundle.getString("_wxliteapp_query");
        this.source = bundle.getInt("_wxliteapp_source");
    }
}
