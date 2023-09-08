package com.tencent.p014mm.plugin.appbrand.jsapi.contact;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import org.json.JSONObject;
import p225rc.C89916g;
import p225rc.g$$e;
import p225rc.g$$i;
import p385u2.C111105a;
import sx3.C110823p;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.contact.f */
public final class C1662f extends C82268c<C82381f> {
    @Deprecated
    public static final int CTRL_INDEX = 72;
    @Deprecated
    public static final String NAME = "chooseContact";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.contact.f$a */
    public static final class C1663a implements g$$i {

        /* renamed from: a */
        public final /* synthetic */ C1662f f11328a;

        /* renamed from: b */
        public final /* synthetic */ C82381f f11329b;

        /* renamed from: c */
        public final /* synthetic */ Activity f11330c;

        /* renamed from: d */
        public final /* synthetic */ JSONObject f11331d;

        /* renamed from: e */
        public final /* synthetic */ int f11332e;

        public C1663a(C1662f fVar, C82381f fVar2, Activity activity, JSONObject jSONObject, int i) {
            this.f11328a = fVar;
            this.f11329b = fVar2;
            this.f11330c = activity;
            this.f11331d = jSONObject;
            this.f11332e = i;
        }

        /* renamed from: c */
        public final void mo1686c(String[] strArr, int[] iArr) {
            Integer C;
            boolean z = false;
            if (!(iArr == null || (C = C110823p.m150977C(iArr)) == null || C.intValue() != 0)) {
                z = true;
            }
            if (z) {
                this.f11328a.mo1685w(this.f11329b, this.f11330c, this.f11331d, this.f11332e);
            } else {
                this.f11329b.mo109647a(this.f11332e, this.f11328a.mo115109j("fail:system permission denied"));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.contact.f$b */
    public static final class C1664b implements g$$e {

        /* renamed from: a */
        public final /* synthetic */ C82381f f11333a;

        /* renamed from: b */
        public final /* synthetic */ int f11334b;

        /* renamed from: c */
        public final /* synthetic */ C1662f f11335c;

        public C1664b(C82381f fVar, int i, C1662f fVar2) {
            this.f11333a = fVar;
            this.f11334b = i;
            this.f11335c = fVar2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:49:0x0129, code lost:
            r14 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x012a, code lost:
            cy3.C58003b.m67160a(r4, r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x012d, code lost:
            throw r14;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x0153, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x0154, code lost:
            cy3.C58003b.m67160a(r14, r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x0157, code lost:
            throw r0;
         */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00f8 A[Catch:{ all -> 0x0129 }] */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00f9 A[Catch:{ all -> 0x0129 }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo1626a(int r13, android.content.Intent r14) {
            /*
                r12 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "onActivityResult appId["
                r0.append(r1)
                com.tencent.mm.plugin.appbrand.jsapi.f r2 = r12.f11333a
                java.lang.String r2 = r2.getAppId()
                r0.append(r2)
                java.lang.String r2 = "], resultCode["
                r0.append(r2)
                r0.append(r13)
                r2 = 93
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                java.lang.String r2 = "Luggage.Common.JsApiChooseContactNew"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
                r0 = -1
                r3 = 1
                if (r13 == r0) goto L_0x0053
                if (r13 == 0) goto L_0x0042
                if (r13 == r3) goto L_0x0042
                com.tencent.mm.plugin.appbrand.jsapi.f r13 = r12.f11333a
                int r14 = r12.f11334b
                com.tencent.mm.plugin.appbrand.jsapi.contact.f r0 = r12.f11335c
                java.lang.String r1 = "fail:system error"
                java.lang.String r0 = r0.mo115109j(r1)
                r13.mo109647a(r14, r0)
                goto L_0x0198
            L_0x0042:
                com.tencent.mm.plugin.appbrand.jsapi.f r13 = r12.f11333a
                int r14 = r12.f11334b
                com.tencent.mm.plugin.appbrand.jsapi.contact.f r0 = r12.f11335c
                java.lang.String r1 = "fail cancel"
                java.lang.String r0 = r0.mo115109j(r1)
                r13.mo109647a(r14, r0)
                goto L_0x0198
            L_0x0053:
                r13 = 0
                if (r14 == 0) goto L_0x005b
                android.net.Uri r14 = r14.getData()
                goto L_0x005c
            L_0x005b:
                r14 = r13
            L_0x005c:
                if (r14 != 0) goto L_0x007c
                com.tencent.mm.plugin.appbrand.jsapi.f r13 = r12.f11333a
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                r14.append(r1)
                java.lang.String r13 = r13.getAppId()
                r14.append(r13)
                java.lang.String r13 = "] NULL contactUri"
                r14.append(r13)
                java.lang.String r13 = r14.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r13)
                return
            L_0x007c:
                com.tencent.mm.plugin.appbrand.jsapi.f r0 = r12.f11333a
                android.content.Context r0 = r0.getContext()
                android.content.ContentResolver r0 = r0.getContentResolver()
                if (r0 != 0) goto L_0x00b3
                com.tencent.mm.plugin.appbrand.jsapi.f r13 = r12.f11333a
                int r14 = r12.f11334b
                com.tencent.mm.plugin.appbrand.jsapi.contact.f r0 = r12.f11335c
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r1)
                java.lang.String r1 = r13.getAppId()
                r3.append(r1)
                java.lang.String r1 = "] NULL ContentResolver"
                r3.append(r1)
                java.lang.String r1 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r1)
                java.lang.String r1 = "fail:internal error invalid android context"
                java.lang.String r0 = r0.mo115109j(r1)
                r13.mo109647a(r14, r0)
                return
            L_0x00b3:
                java.lang.String r4 = "data1"
                java.lang.String[] r6 = new java.lang.String[]{r4}
                r7 = 0
                r8 = 0
                r9 = 0
                r4 = r0
                r5 = r14
                android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9)
                java.lang.String r10 = ""
                r11 = 0
                if (r4 == 0) goto L_0x012e
                com.tencent.mm.plugin.appbrand.jsapi.f r5 = r12.f11333a
                boolean r6 = r4.moveToFirst()     // Catch:{ all -> 0x0127 }
                if (r6 == 0) goto L_0x0107
            L_0x00cf:
                java.lang.String r1 = r4.getString(r11)     // Catch:{ all -> 0x0127 }
                if (r1 != 0) goto L_0x00d7
                r1 = r13
                goto L_0x00ea
            L_0x00d7:
                java.lang.String r2 = "\\D"
                java.lang.String r1 = r1.replaceAll(r2, r10)     // Catch:{ all -> 0x0127 }
                java.lang.String r2 = "86"
                boolean r2 = r1.startsWith(r2)     // Catch:{ all -> 0x0127 }
                if (r2 == 0) goto L_0x00ea
                r2 = 2
                java.lang.String r1 = r1.substring(r2)     // Catch:{ all -> 0x0127 }
            L_0x00ea:
                if (r1 == 0) goto L_0x00f5
                int r2 = r1.length()     // Catch:{ all -> 0x0127 }
                if (r2 != 0) goto L_0x00f3
                goto L_0x00f5
            L_0x00f3:
                r2 = 0
                goto L_0x00f6
            L_0x00f5:
                r2 = 1
            L_0x00f6:
                if (r2 == 0) goto L_0x00f9
                goto L_0x0100
            L_0x00f9:
                boolean r2 = android.telephony.PhoneNumberUtils.isGlobalPhoneNumber(r1)     // Catch:{ all -> 0x0127 }
                if (r2 == 0) goto L_0x0100
                goto L_0x0123
            L_0x0100:
                boolean r1 = r4.moveToNext()     // Catch:{ all -> 0x0127 }
                if (r1 != 0) goto L_0x00cf
                goto L_0x0122
            L_0x0107:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0127 }
                r6.<init>()     // Catch:{ all -> 0x0127 }
                r6.append(r1)     // Catch:{ all -> 0x0127 }
                java.lang.String r1 = r5.getAppId()     // Catch:{ all -> 0x0127 }
                r6.append(r1)     // Catch:{ all -> 0x0127 }
                java.lang.String r1 = "] cursor empty"
                r6.append(r1)     // Catch:{ all -> 0x0127 }
                java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x0127 }
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r1)     // Catch:{ all -> 0x0127 }
            L_0x0122:
                r1 = r13
            L_0x0123:
                cy3.C58003b.m67160a(r4, r13)
                goto L_0x012f
            L_0x0127:
                r13 = move-exception
                throw r13     // Catch:{ all -> 0x0129 }
            L_0x0129:
                r14 = move-exception
                cy3.C58003b.m67160a(r4, r13)
                throw r14
            L_0x012e:
                r1 = r13
            L_0x012f:
                java.lang.String r2 = "display_name"
                java.lang.String[] r6 = new java.lang.String[]{r2}
                r7 = 0
                r8 = 0
                r9 = 0
                r4 = r0
                r5 = r14
                android.database.Cursor r14 = r4.query(r5, r6, r7, r8, r9)
                if (r14 == 0) goto L_0x0158
                boolean r0 = r14.moveToFirst()     // Catch:{ all -> 0x0151 }
                if (r0 == 0) goto L_0x014b
                java.lang.String r0 = r14.getString(r11)     // Catch:{ all -> 0x0151 }
                goto L_0x014c
            L_0x014b:
                r0 = r10
            L_0x014c:
                cy3.C58003b.m67160a(r14, r13)
                r13 = r0
                goto L_0x0158
            L_0x0151:
                r13 = move-exception
                throw r13     // Catch:{ all -> 0x0153 }
            L_0x0153:
                r0 = move-exception
                cy3.C58003b.m67160a(r14, r13)
                throw r0
            L_0x0158:
                if (r13 != 0) goto L_0x015b
                goto L_0x015c
            L_0x015b:
                r10 = r13
            L_0x015c:
                if (r1 == 0) goto L_0x0166
                int r13 = r1.length()
                if (r13 != 0) goto L_0x0165
                goto L_0x0166
            L_0x0165:
                r3 = 0
            L_0x0166:
                if (r3 != 0) goto L_0x0189
                com.tencent.mm.plugin.appbrand.jsapi.f r13 = r12.f11333a
                int r14 = r12.f11334b
                com.tencent.mm.plugin.appbrand.jsapi.contact.f r0 = r12.f11335c
                java.util.HashMap r2 = new java.util.HashMap
                r2.<init>()
                java.lang.String r3 = "phoneNumber"
                r2.put(r3, r1)
                java.lang.String r1 = "displayName"
                r2.put(r1, r10)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                java.lang.String r1 = "ok"
                java.lang.String r0 = r0.mo115112m(r1, r2)
                r13.mo109647a(r14, r0)
                goto L_0x0198
            L_0x0189:
                com.tencent.mm.plugin.appbrand.jsapi.f r13 = r12.f11333a
                int r14 = r12.f11334b
                com.tencent.mm.plugin.appbrand.jsapi.contact.f r0 = r12.f11335c
                java.lang.String r1 = "fail"
                java.lang.String r0 = r0.mo115109j(r1)
                r13.mo109647a(r14, r0)
            L_0x0198:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.contact.C1662f.C1664b.mo1626a(int, android.content.Intent):void");
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        if (fVar != null && jSONObject != null) {
            Activity castActivityOrNull = AndroidContextUtil.castActivityOrNull(fVar.getContext());
            if (castActivityOrNull == null) {
                fVar.mo109647a(i, "fail:internal error invalid android context");
            } else if (Build.VERSION.SDK_INT < 30) {
                mo1685w(fVar, castActivityOrNull, jSONObject, i);
            } else if (C111105a.m151499a(castActivityOrNull, "android.permission.READ_CONTACTS") == 0) {
                mo1685w(fVar, castActivityOrNull, jSONObject, i);
            } else {
                C89916g.m112446a(castActivityOrNull).mo124229c(fVar, "android.permission.READ_CONTACTS", new C1663a(this, fVar, castActivityOrNull, jSONObject, i));
            }
        }
    }

    /* renamed from: w */
    public final void mo1685w(C82381f fVar, Activity activity, JSONObject jSONObject, int i) {
        C89916g a = C89916g.m112446a(activity);
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("vnd.android.cursor.dir/phone_v2");
        a.mo124236j(intent, new C1664b(fVar, i, this));
    }
}
