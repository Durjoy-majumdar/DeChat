package com.tencent.p014mm.plugin.appbrand.jsapi.contact;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.contact.r */
public final class C1667r extends C82268c {
    public static final int CTRL_INDEX = 414;
    public static final String NAME = "searchContacts";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        mo1688w(fVar, jSONObject, i, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:77:0x01f4 A[SYNTHETIC, Splitter:B:77:0x01f4] */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1688w(com.tencent.p014mm.plugin.appbrand.jsapi.C82381f r22, org.json.JSONObject r23, int r24, boolean r25) {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            r0 = r23
            r3 = r24
            java.lang.String r4 = "MicroMsg.JsApiSearchContacts"
            if (r0 != 0) goto L_0x001b
            java.lang.String r0 = "data is null, err"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            java.lang.String r0 = "fail:invalid data"
            java.lang.String r0 = r1.mo115109j(r0)
            r2.mo109647a(r3, r0)
            return
        L_0x001b:
            java.lang.String r5 = "JsApiSearchContacts invoke"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r7 = 0
            r6[r7] = r0
            java.lang.String r8 = "data:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r8, r6)
            if (r25 != 0) goto L_0x004c
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r8 = "android.permission.READ_CONTACTS"
            int r6 = p385u2.C111105a.m151499a(r6, r8)
            if (r6 != 0) goto L_0x003b
            r6 = 1
            goto L_0x0044
        L_0x003b:
            com.tencent.mm.plugin.appbrand.jsapi.contact.q r6 = new com.tencent.mm.plugin.appbrand.jsapi.contact.q
            r6.<init>(r1, r2, r0, r3)
            r2.mo109673t(r6)
            r6 = 0
        L_0x0044:
            if (r6 != 0) goto L_0x004c
            java.lang.String r0 = "check permission"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            return
        L_0x004c:
            java.lang.String r6 = "phoneNumber"
            java.lang.String r8 = r0.optString(r6)
            int r0 = r8.length()
            java.lang.String r9 = "ok"
            java.lang.String r10 = "result"
            r11 = 8
            java.lang.String r12 = ""
            if (r0 >= r11) goto L_0x0075
            java.lang.String r0 = "phoneNumber is short"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r0.put(r10, r12)
            java.lang.String r0 = r1.mo115112m(r9, r0)
            r2.mo109647a(r3, r0)
            return
        L_0x0075:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.util.LinkedList r13 = new java.util.LinkedList
            r13.<init>()
            android.content.ContentResolver r20 = r0.getContentResolver()
            android.net.Uri r15 = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI     // Catch:{ Exception -> 0x0094 }
            r16 = 0
            r17 = 0
            r18 = 0
            java.lang.String r19 = "sort_key_alt"
            r14 = r20
            android.database.Cursor r0 = r14.query(r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x0094 }
            goto L_0x00b7
        L_0x0094:
            r0 = move-exception
            java.lang.Object[] r14 = new java.lang.Object[r7]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r12, r14)
            java.lang.Object[] r14 = new java.lang.Object[r5]
            java.lang.String r0 = r0.getMessage()
            r14[r7] = r0
            java.lang.String r0 = "exception in getMoblieOrderInfo(), [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r0, r14)
            android.net.Uri r15 = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r14 = r20
            android.database.Cursor r0 = r14.query(r15, r16, r17, r18, r19)
        L_0x00b7:
            r14 = r0
            if (r14 != 0) goto L_0x00c0
            java.lang.String r0 = "getMobileInfo: mobile is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            goto L_0x012c
        L_0x00c0:
            int r0 = r14.getCount()     // Catch:{ Exception -> 0x0114 }
            if (r0 <= 0) goto L_0x0129
            boolean r0 = r14.moveToFirst()     // Catch:{ Exception -> 0x0114 }
            if (r0 == 0) goto L_0x0129
        L_0x00cc:
            java.lang.String r0 = "display_name"
            int r0 = r14.getColumnIndex(r0)     // Catch:{ Exception -> 0x0114 }
            java.lang.String r0 = r14.getString(r0)     // Catch:{ Exception -> 0x0114 }
            java.lang.String r15 = "contact_id"
            int r15 = r14.getColumnIndex(r15)     // Catch:{ Exception -> 0x0114 }
            java.lang.String r15 = r14.getString(r15)     // Catch:{ Exception -> 0x0114 }
            java.lang.String r11 = "data1"
            int r11 = r14.getColumnIndex(r11)     // Catch:{ Exception -> 0x0114 }
            java.lang.String r11 = r14.getString(r11)     // Catch:{ Exception -> 0x0114 }
            java.lang.String r5 = "raw_contact_id"
            int r5 = r14.getColumnIndex(r5)     // Catch:{ Exception -> 0x0114 }
            java.lang.String r5 = r14.getString(r5)     // Catch:{ Exception -> 0x0114 }
            r7 = 4
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch:{ Exception -> 0x0114 }
            r18 = 0
            r7[r18] = r15     // Catch:{ Exception -> 0x0114 }
            r15 = 1
            r7[r15] = r0     // Catch:{ Exception -> 0x0114 }
            r15 = 2
            r7[r15] = r11     // Catch:{ Exception -> 0x0114 }
            r11 = 3
            r7[r11] = r5     // Catch:{ Exception -> 0x0114 }
            r13.add(r7)     // Catch:{ Exception -> 0x0114 }
            boolean r0 = r14.moveToNext()     // Catch:{ Exception -> 0x0114 }
            if (r0 != 0) goto L_0x010e
            goto L_0x0129
        L_0x010e:
            r5 = 1
            r7 = 0
            goto L_0x00cc
        L_0x0111:
            r0 = move-exception
            goto L_0x023a
        L_0x0114:
            r0 = move-exception
            r5 = 0
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ all -> 0x0111 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r12, r7)     // Catch:{ all -> 0x0111 }
            java.lang.String r7 = "exception in getMoblieOrderInfo()2, [%s]"
            r11 = 1
            java.lang.Object[] r15 = new java.lang.Object[r11]     // Catch:{ all -> 0x0111 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0111 }
            r15[r5] = r0     // Catch:{ all -> 0x0111 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r7, r15)     // Catch:{ all -> 0x0111 }
        L_0x0129:
            r14.close()
        L_0x012c:
            org.json.JSONArray r5 = new org.json.JSONArray
            r5.<init>()
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x021b
            java.util.Iterator r7 = r13.iterator()
        L_0x013b:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x021b
            java.lang.Object r0 = r7.next()
            java.lang.String[] r0 = (java.lang.String[]) r0
            r11 = 2
            r13 = r0[r11]
            if (r13 != 0) goto L_0x014e
            r13 = 0
            goto L_0x0160
        L_0x014e:
            java.lang.String r14 = "\\D"
            java.lang.String r13 = r13.replaceAll(r14, r12)
            java.lang.String r14 = "86"
            boolean r14 = r13.startsWith(r14)
            if (r14 == 0) goto L_0x0160
            java.lang.String r13 = r13.substring(r11)
        L_0x0160:
            r11 = 1
            r0 = r0[r11]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r12)
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r11 != 0) goto L_0x020f
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r11 != 0) goto L_0x01e7
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r11 == 0) goto L_0x017b
            goto L_0x01e7
        L_0x017b:
            int r11 = r8.length()
            int r14 = r13.length()
            r15 = 8
            if (r11 >= r15) goto L_0x01a2
            r15 = 1
            java.lang.Object[] r11 = new java.lang.Object[r15]
            int r14 = r8.length()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r18 = 0
            r11[r18] = r14
            java.lang.String r14 = "phoneNumberSize:%d, return false"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r14, r11)
            r16 = r7
        L_0x019d:
            r20 = r8
            r7 = 0
            r8 = 3
            goto L_0x01f2
        L_0x01a2:
            r18 = 0
            if (r11 <= r14) goto L_0x01be
            r16 = r7
            r15 = 2
            java.lang.Object[] r7 = new java.lang.Object[r15]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r7[r18] = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r14)
            r14 = 1
            r7[r14] = r11
            java.lang.String r11 = "phoneNumberSize:%d, targetPhoneNumberSize:%d return false"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r11, r7)
            goto L_0x019d
        L_0x01be:
            r16 = r7
            r15 = 2
            r7 = 0
            r14 = 0
        L_0x01c3:
            if (r7 >= r11) goto L_0x01de
            char r15 = r8.charAt(r7)
            r20 = r8
            char r8 = r13.charAt(r7)
            if (r15 == r8) goto L_0x01d7
            int r14 = r14 + 1
            r8 = 3
            if (r14 <= r8) goto L_0x01d8
            goto L_0x01e1
        L_0x01d7:
            r8 = 3
        L_0x01d8:
            int r7 = r7 + 1
            r8 = r20
            r15 = 2
            goto L_0x01c3
        L_0x01de:
            r20 = r8
            r8 = 3
        L_0x01e1:
            if (r14 > r8) goto L_0x01e5
            r7 = 1
            goto L_0x01f2
        L_0x01e5:
            r7 = 0
            goto L_0x01f2
        L_0x01e7:
            r16 = r7
            r20 = r8
            r8 = 3
            java.lang.String r7 = "phoneNumber or targetPhoneNumber is null, return false"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r7)
            goto L_0x01e5
        L_0x01f2:
            if (r7 == 0) goto L_0x020d
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0205 }
            r7.<init>()     // Catch:{ JSONException -> 0x0205 }
            r7.put(r6, r13)     // Catch:{ JSONException -> 0x0205 }
            java.lang.String r11 = "name"
            r7.put(r11, r0)     // Catch:{ JSONException -> 0x0205 }
            r5.put(r7)     // Catch:{ JSONException -> 0x0205 }
            goto L_0x020d
        L_0x0205:
            r0 = move-exception
            r7 = 0
            java.lang.Object[] r11 = new java.lang.Object[r7]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r12, r11)
            goto L_0x0215
        L_0x020d:
            r7 = 0
            goto L_0x0215
        L_0x020f:
            r16 = r7
            r20 = r8
            r7 = 0
            r8 = 3
        L_0x0215:
            r7 = r16
            r8 = r20
            goto L_0x013b
        L_0x021b:
            r7 = 0
            r6 = 1
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.String r6 = r5.toString()
            r0[r7] = r6
            java.lang.String r6 = "resultArray:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r6, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r0.put(r10, r5)
            java.lang.String r0 = r1.mo115112m(r9, r0)
            r2.mo109647a(r3, r0)
            return
        L_0x023a:
            r14.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.contact.C1667r.mo1688w(com.tencent.mm.plugin.appbrand.jsapi.f, org.json.JSONObject, int, boolean):void");
    }
}
