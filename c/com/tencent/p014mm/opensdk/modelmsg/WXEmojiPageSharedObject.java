package com.tencent.p014mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.opensdk.utils.C81058b;
import com.tencent.p014mm.opensdk.utils.Log;

/* renamed from: com.tencent.mm.opensdk.modelmsg.WXEmojiPageSharedObject */
public class WXEmojiPageSharedObject implements WXMediaMessage.IMediaObject {
    private static final String TAG = "MicroMsg.SDK.WXEmojiSharedObject";
    public String desc;
    public String iconUrl;
    public int pageType;
    public String secondUrl;
    public int tid;
    public String title;
    public int type;
    public String url;

    public WXEmojiPageSharedObject() {
    }

    public WXEmojiPageSharedObject(int i, int i2, String str, String str2, String str3, String str4, int i3, String str5) {
        this.tid = i2;
        this.title = str;
        this.desc = str2;
        this.iconUrl = str3;
        this.secondUrl = str4;
        this.pageType = i3;
        this.url = str5;
        this.type = i;
    }

    public boolean checkArgs() {
        if (!C81058b.m99052b(this.title) && !C81058b.m99052b(this.iconUrl)) {
            return true;
        }
        Log.m99044e(TAG, "checkArgs fail, title or iconUrl is invalid");
        return false;
    }

    public void serialize(Bundle bundle) {
        bundle.putInt("_wxemojisharedobject_tid", this.tid);
        bundle.putString("_wxemojisharedobject_title", this.title);
        bundle.putString("_wxemojisharedobject_desc", this.desc);
        bundle.putString("_wxemojisharedobject_iconurl", this.iconUrl);
        bundle.putString("_wxemojisharedobject_secondurl", this.secondUrl);
        bundle.putInt("_wxemojisharedobject_pagetype", this.pageType);
        bundle.putString("_wxwebpageobject_url", this.url);
    }

    public int type() {
        return this.type;
    }

    public void unserialize(Bundle bundle) {
        this.tid = bundle.getInt("_wxemojisharedobject_tid");
        this.title = bundle.getString("_wxemojisharedobject_title");
        this.desc = bundle.getString("_wxemojisharedobject_desc");
        this.iconUrl = bundle.getString("_wxemojisharedobject_iconurl");
        this.secondUrl = bundle.getString("_wxemojisharedobject_secondurl");
        this.pageType = bundle.getInt("_wxemojisharedobject_pagetype");
        this.url = bundle.getString("_wxwebpageobject_url");
    }
}
