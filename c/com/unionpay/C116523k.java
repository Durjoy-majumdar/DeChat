package com.unionpay;

/* renamed from: com.unionpay.k */
public final class C116523k implements C116515a0 {

    /* renamed from: a */
    public final /* synthetic */ UPPayWapActivity f349490a;

    public C116523k(UPPayWapActivity uPPayWapActivity) {
        this.f349490a = uPPayWapActivity;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0086  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo180512a(java.lang.String r13, com.unionpay.C116517b0 r14) {
        /*
            r12 = this;
            java.lang.String r0 = "1"
            r1 = 0
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ Exception -> 0x00a5 }
            r2.<init>(r13)     // Catch:{ Exception -> 0x00a5 }
            int r13 = r2.length()     // Catch:{ Exception -> 0x00a5 }
            if (r13 <= 0) goto L_0x0099
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch:{ Exception -> 0x00a5 }
            r13.<init>()     // Catch:{ Exception -> 0x00a5 }
            r3 = 0
            r4 = 0
        L_0x0015:
            int r5 = r2.length()     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r6 = "0"
            if (r4 >= r5) goto L_0x008d
            org.json.JSONObject r5 = r2.getJSONObject(r4)     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r7 = "packageName"
            java.lang.String r7 = r5.getString(r7)     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r8 = "packageSign"
            java.lang.String r8 = r5.getString(r8)     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r9 = "supportVersion"
            java.lang.String r5 = r5.getString(r9)     // Catch:{ Exception -> 0x00a5 }
            com.unionpay.UPPayWapActivity r9 = r12.f349490a     // Catch:{ Exception -> 0x00a5 }
            int r10 = ix3.C76375b.f223657a     // Catch:{ Exception -> 0x00a5 }
            if (r9 == 0) goto L_0x0083
            boolean r10 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Exception -> 0x0083 }
            if (r10 != 0) goto L_0x0083
            boolean r10 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x0083 }
            if (r10 != 0) goto L_0x0083
            boolean r10 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x0083 }
            if (r10 != 0) goto L_0x0083
            boolean r10 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Exception -> 0x0083 }
            if (r10 != 0) goto L_0x005e
            android.content.pm.PackageManager r10 = r9.getPackageManager()     // Catch:{ Exception -> 0x005e }
            android.content.pm.PackageInfo r10 = r10.getPackageInfo(r7, r3)     // Catch:{ Exception -> 0x005e }
            if (r10 == 0) goto L_0x005e
            int r10 = r10.versionCode     // Catch:{ Exception -> 0x005e }
            goto L_0x005f
        L_0x005e:
            r10 = 0
        L_0x005f:
            r11 = 10
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5, r11)     // Catch:{ Exception -> 0x006a }
            int r5 = r5.intValue()     // Catch:{ Exception -> 0x006a }
            goto L_0x006d
        L_0x006a:
            r5 = 2147483647(0x7fffffff, float:NaN)
        L_0x006d:
            boolean r11 = ix3.C76375b.m91804f(r9, r7)     // Catch:{ Exception -> 0x0083 }
            if (r11 == 0) goto L_0x0083
            if (r10 < r5) goto L_0x0083
            java.lang.String r5 = "SHA256"
            java.lang.String r5 = ix3.C76375b.m91801c(r9, r7, r5)     // Catch:{ Exception -> 0x0083 }
            boolean r5 = r8.equalsIgnoreCase(r5)     // Catch:{ Exception -> 0x0083 }
            if (r5 == 0) goto L_0x0083
            r5 = 1
            goto L_0x0084
        L_0x0083:
            r5 = 0
        L_0x0084:
            if (r5 == 0) goto L_0x0087
            r6 = r0
        L_0x0087:
            r13.put(r7, r6)     // Catch:{ Exception -> 0x00a5 }
            int r4 = r4 + 1
            goto L_0x0015
        L_0x008d:
            if (r14 == 0) goto L_0x0098
            java.lang.String r2 = "success"
            java.lang.String r13 = com.unionpay.UPPayWapActivity.m164325I7(r6, r2, r13)     // Catch:{ Exception -> 0x00a5 }
            r14.mo180515a(r13)     // Catch:{ Exception -> 0x00a5 }
        L_0x0098:
            return
        L_0x0099:
            if (r14 == 0) goto L_0x00a4
            java.lang.String r13 = "Parameter error"
            java.lang.String r13 = com.unionpay.UPPayWapActivity.m164324H7(r0, r13, r1)     // Catch:{ Exception -> 0x00a5 }
            r14.mo180515a(r13)     // Catch:{ Exception -> 0x00a5 }
        L_0x00a4:
            return
        L_0x00a5:
            r13 = move-exception
            if (r14 == 0) goto L_0x00b3
            java.lang.String r13 = r13.getMessage()
            java.lang.String r13 = com.unionpay.UPPayWapActivity.m164324H7(r0, r13, r1)
            r14.mo180515a(r13)
        L_0x00b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unionpay.C116523k.mo180512a(java.lang.String, com.unionpay.b0):void");
    }
}
