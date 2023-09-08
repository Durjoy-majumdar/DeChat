package com.tencent.p014mm.pluginsdk.model;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.List;
import p262wm.C15521d;
import p262wm.C22921c;

/* renamed from: com.tencent.mm.pluginsdk.model.w */
public class C19466w extends C19446g1 {

    /* renamed from: a */
    public final C15521d f54998a;

    /* renamed from: b */
    public final Intent f54999b;

    /* renamed from: c */
    public final C19454k1 f55000c = new C19454k1();

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C19466w(android.os.Bundle r6) {
        /*
            r5 = this;
            wm.d r0 = p262wm.C15521d.TencentMap
            r5.<init>()
            com.tencent.mm.pluginsdk.model.k1 r1 = new com.tencent.mm.pluginsdk.model.k1
            r1.<init>()
            r5.f55000c = r1
            r1 = 0
            java.lang.String r2 = "key_target_intent"
            if (r6 == 0) goto L_0x004b
            android.os.Parcelable r3 = r6.getParcelable(r2)
            if (r3 != 0) goto L_0x0018
            goto L_0x004b
        L_0x0018:
            r3 = 0
            java.lang.String r4 = "key_map_app"
            int r3 = r6.getInt(r4, r3)
            if (r3 == 0) goto L_0x003a
            r4 = 1
            if (r3 == r4) goto L_0x0037
            r4 = 2
            if (r3 == r4) goto L_0x0034
            r4 = 3
            if (r3 == r4) goto L_0x0031
            r4 = 4
            if (r3 == r4) goto L_0x002e
            goto L_0x003a
        L_0x002e:
            wm.d r3 = p262wm.C15521d.AutonaviMap
            goto L_0x003b
        L_0x0031:
            wm.d r3 = p262wm.C15521d.BaiduMap
            goto L_0x003b
        L_0x0034:
            wm.d r3 = p262wm.C15521d.SogouMap
            goto L_0x003b
        L_0x0037:
            wm.d r3 = p262wm.C15521d.GoogleMap
            goto L_0x003b
        L_0x003a:
            r3 = r0
        L_0x003b:
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.pm.ResolveInfo r4 = m20823k(r4, r3, r1)
            if (r4 != 0) goto L_0x0048
            r5.f54998a = r0
            goto L_0x004d
        L_0x0048:
            r5.f54998a = r3
            goto L_0x004d
        L_0x004b:
            r5.f54998a = r0
        L_0x004d:
            wm.d r3 = r5.f54998a
            if (r3 != r0) goto L_0x0054
            r5.f54999b = r1
            goto L_0x005c
        L_0x0054:
            android.os.Parcelable r6 = r6.getParcelable(r2)
            android.content.Intent r6 = (android.content.Intent) r6
            r5.f54999b = r6
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.model.C19466w.<init>(android.os.Bundle):void");
    }

    /* renamed from: k */
    public static ResolveInfo m20823k(Context context, C15521d dVar, Intent intent) {
        if (intent == null) {
            intent = new Intent("android.intent.action.VIEW", Uri.parse(String.format("geo:%f,%f", new Object[]{Float.valueOf(0.0f), Float.valueOf(0.0f)})));
        }
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        if (Util.isNullOrNil((List) queryIntentActivities)) {
            return null;
        }
        for (ResolveInfo next : queryIntentActivities) {
            if (next != null && next.activityInfo != null && dVar.mo14299a().equals(next.activityInfo.packageName)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: b */
    public String mo25196b(Context context, ResolveInfo resolveInfo) {
        return this.f55000c.mo25196b(context, resolveInfo);
    }

    /* renamed from: c */
    public C22921c.C22922a mo25197c() {
        if (this.f54998a == C15521d.TencentMap) {
            return this.f55000c.mo25197c();
        }
        C22921c.C22922a aVar = new C22921c.C22922a();
        aVar.f65899d = -1;
        aVar.f65896a = -1;
        ResolveInfo k = m20823k(MMApplicationContext.getContext(), this.f54998a, this.f54999b);
        if (k != null) {
            aVar.f65900e = mo25196b(MMApplicationContext.getContext(), k);
        }
        return aVar;
    }

    /* renamed from: d */
    public String mo25198d() {
        if (this.f54998a != C15521d.TencentMap) {
            return null;
        }
        this.f55000c.getClass();
        return "TencentMap.apk";
    }

    /* renamed from: e */
    public String mo25199e() {
        if (this.f54998a != C15521d.TencentMap) {
            return null;
        }
        this.f55000c.getClass();
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
        C15521d dVar = this.f54998a;
        return dVar == C15521d.TencentMap ? this.f55000c.mo25202h(context) : m20823k(context, dVar, this.f54999b) != null;
    }

    /* renamed from: i */
    public boolean mo25203i(String str) {
        return this.f54998a.mo14299a().equals(str);
    }
}
