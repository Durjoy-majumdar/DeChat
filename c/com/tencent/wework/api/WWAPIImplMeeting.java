package com.tencent.wework.api;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.tencent.wework.api.IWWAPI;
import java.util.HashMap;
import java.util.List;

public final class WWAPIImplMeeting extends WWAPIImpl {

    /* renamed from: e */
    public static final HashMap<String, String> f285799e = new HashMap<>();

    public WWAPIImplMeeting(Context context) {
        super(context);
    }

    /* renamed from: e */
    public boolean mo136607e(IWWAPI.WWAppType wWAppType) {
        if (wWAppType == IWWAPI.WWAppType.WwAppTypeDefault) {
            return mo136608g("com.tencent.wework");
        }
        if (wWAppType == IWWAPI.WWAppType.WwAppTypeWxwork) {
            return mo136608g("com.tencent.wework") || mo136608g("com.tencent.wwgovernment") || mo136614h(new Intent("com.tencent.wework.api.sharemsg", Uri.parse("wxwork://jump")));
        } else if (wWAppType == IWWAPI.WWAppType.WwAppTypeLocal) {
            return mo136608g("com.tencent.wwgovernment") || mo136614h(new Intent("com.tencent.wework.api.sharemsg", Uri.parse("wxworkgovuniform://jump")));
        } else if (wWAppType != IWWAPI.WWAppType.WwAppTypeWxworkWithoutSaas) {
            return false;
        } else {
            return mo136608g("com.tencent.wwgovernment") || mo136614h(new Intent("com.tencent.wework.api.sharemsg", Uri.parse("wxwork://jump")));
        }
    }

    /* renamed from: h */
    public final boolean mo136614h(Intent intent) {
        HashMap<String, String> hashMap = f285799e;
        if (!TextUtils.isEmpty(hashMap.get(intent.getDataString()))) {
            return true;
        }
        List<ResolveInfo> queryIntentActivities = this.f285789a.getPackageManager().queryIntentActivities(intent, 65536);
        String str = queryIntentActivities.size() > 0 ? queryIntentActivities.get(0).activityInfo.applicationInfo.packageName : "";
        hashMap.put(intent.getDataString(), str);
        return !TextUtils.isEmpty(str);
    }
}
