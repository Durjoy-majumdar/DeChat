package com.tencent.wework.api;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashSet;

public class WWAPIFactory {
    static {
        new HashSet<String>() {
            {
                add("com.tencent.mm");
                add("com.tencent.wemeet.app");
            }
        };
    }

    /* renamed from: a */
    public static IWWAPI m125312a(Context context) {
        return TextUtils.equals(context.getPackageName(), "com.tencent.mm") ? new WWAPIImplLocal(context) : TextUtils.equals(context.getPackageName(), "com.tencent.wemeet.app") ? new WWAPIImplMeeting(context) : new WWAPIImpl(context);
    }
}
