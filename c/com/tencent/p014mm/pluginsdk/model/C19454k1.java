package com.tencent.p014mm.pluginsdk.model;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lc3.C10485b;
import p262wm.C22921c;

/* renamed from: com.tencent.mm.pluginsdk.model.k1 */
public class C19454k1 extends C19446g1 {
    /* renamed from: b */
    public String mo25196b(Context context, ResolveInfo resolveInfo) {
        ActivityInfo activityInfo;
        CharSequence loadLabel;
        if (context == null || resolveInfo == null || (activityInfo = resolveInfo.activityInfo) == null || (loadLabel = activityInfo.loadLabel(context.getPackageManager())) == null) {
            return null;
        }
        Matcher matcher = Pattern.compile("\\(.*推荐.*\\)", 2).matcher(loadLabel.toString());
        return matcher.find() ? matcher.replaceAll("") : loadLabel.toString();
    }

    /* renamed from: c */
    public C22921c.C22922a mo25197c() {
        C22921c.C22922a aVar = new C22921c.C22922a();
        aVar.f65897b = C0966R.string.jyt;
        String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("QQMapDownloadTips");
        if (!Util.isNullOrNil(c)) {
            aVar.f65898c = c;
        }
        aVar.f65899d = C0966R.string.jyy;
        aVar.f65896a = C0966R.C0969drawable.icon_tencent_map;
        return aVar;
    }

    /* renamed from: d */
    public String mo25198d() {
        return "TencentMap.apk";
    }

    /* renamed from: e */
    public String mo25199e() {
        return "http://softroute.map.qq.com/downloadfile?cid=00008&referer=wx_client";
    }

    /* renamed from: f */
    public String mo25200f() {
        return "com.tencent.map";
    }

    /* renamed from: g */
    public String mo25201g() {
        return null;
    }

    /* renamed from: h */
    public boolean mo25202h(Context context) {
        ActivityInfo activityInfo;
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("sosomap://type=nav")), 0);
        if (queryIntentActivities != null && queryIntentActivities.size() > 0) {
            int size = queryIntentActivities.size();
            for (int i = 0; i < size; i++) {
                ResolveInfo resolveInfo = queryIntentActivities.get(i);
                if (resolveInfo != null && (activityInfo = resolveInfo.activityInfo) != null && "com.tencent.map".equals(activityInfo.packageName)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: i */
    public boolean mo25203i(String str) {
        return str != null && "com.tencent.map".equals(str);
    }
}
