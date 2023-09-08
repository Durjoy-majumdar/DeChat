package com.tencent.p014mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.opensdk.utils.Log;

/* renamed from: com.tencent.mm.opensdk.modelmsg.WXEnterpriseCardObject */
public class WXEnterpriseCardObject implements WXMediaMessage.IMediaObject {
    private static final int LENGTH_LIMIT = 10240;
    private static final String TAG = "MicroMsg.SDK.WXEnterpriseCardObject";
    public String cardInfo;
    public int msgType;

    public boolean checkArgs() {
        String str = this.cardInfo;
        if (str != null && str.length() != 0) {
            return true;
        }
        Log.m99044e(TAG, "checkArgs fail, cardInfo is invalid");
        return false;
    }

    public void serialize(Bundle bundle) {
        bundle.putInt("_wxenterprisecard_msgtype", this.msgType);
        bundle.putString("_wxenterprisecard_cardinfo", this.cardInfo);
    }

    public int type() {
        return 45;
    }

    public void unserialize(Bundle bundle) {
        this.msgType = bundle.getInt("_wxenterprisecard_msgtype");
        this.cardInfo = bundle.getString("_wxenterprisecard_cardinfo");
    }
}
