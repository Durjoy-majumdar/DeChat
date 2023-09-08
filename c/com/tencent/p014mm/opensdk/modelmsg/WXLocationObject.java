package com.tencent.p014mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;

/* renamed from: com.tencent.mm.opensdk.modelmsg.WXLocationObject */
public class WXLocationObject implements WXMediaMessage.IMediaObject {
    private static final String TAG = "MicroMsg.SDK.WXLocationObject";
    public double lat;
    public double lng;

    public WXLocationObject() {
        this(0.0d, 0.0d);
    }

    public WXLocationObject(double d, double d2) {
        this.lat = d;
        this.lng = d2;
    }

    public boolean checkArgs() {
        return true;
    }

    public void serialize(Bundle bundle) {
        bundle.putDouble("_wxlocationobject_lat", this.lat);
        bundle.putDouble("_wxlocationobject_lng", this.lng);
    }

    public int type() {
        return 30;
    }

    public void unserialize(Bundle bundle) {
        this.lat = bundle.getDouble("_wxlocationobject_lat");
        this.lng = bundle.getDouble("_wxlocationobject_lng");
    }
}
