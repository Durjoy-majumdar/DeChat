package com.tencent.p014mm.plugin.lite.jsapi.comms;

import com.tencent.p014mm.plugin.lite.api.C4770c;

/* renamed from: com.tencent.mm.plugin.lite.jsapi.comms.f */
public class C4785f extends C4770c {
    /* JADX WARNING: Removed duplicated region for block: B:45:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0242 A[Catch:{ Exception -> 0x0117 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0258 A[Catch:{ Exception -> 0x0117 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0267 A[Catch:{ Exception -> 0x0273 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5693a(java.lang.String r19, org.json.JSONObject r20, boolean r21) {
        /*
            r18 = this;
            r1 = r18
            r0 = r20
            java.lang.String r2 = "k_webview_html"
            java.lang.String r3 = "k_webview_img"
            java.lang.String r4 = "doExposePreparation fail"
            java.lang.String r5 = "username"
            java.lang.String r6 = "LiteAppJsApiDoExposePreparation"
            java.lang.String r7 = "invoke doExposePreparation"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r7)
            if (r0 != 0) goto L_0x001e
            com.tencent.mm.plugin.lite.api.c$a r0 = r1.f19815f
            java.lang.String r2 = "param is null"
            r0.mo5689a(r2)
            return
        L_0x001e:
            java.lang.String r7 = "scene"
            r8 = -1
            int r0 = r0.optInt(r7, r8)
            if (r0 != r8) goto L_0x0030
            com.tencent.mm.plugin.lite.api.c$a r0 = r1.f19815f
            java.lang.String r2 = "doExposePreparation fail:unknown scene"
            r0.mo5689a(r2)
            return
        L_0x0030:
            java.util.Map<java.lang.Integer, com.tencent.mm.plugin.lite.LiteAppCenter$ILiteAppUICallback> r7 = com.tencent.p014mm.plugin.lite.LiteAppCenter.mUICallback
            la.b r8 = r1.f19814e
            int r8 = r8.f31713a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object r7 = r7.get(r8)
            com.tencent.mm.plugin.lite.LiteAppCenter$ILiteAppUICallback r7 = (com.tencent.p014mm.plugin.lite.LiteAppCenter.ILiteAppUICallback) r7
            android.os.Bundle r7 = r7.getExtraData()
            android.os.Bundle r8 = new android.os.Bundle     // Catch:{ Exception -> 0x0276 }
            r8.<init>()     // Catch:{ Exception -> 0x0276 }
            java.lang.String r9 = "k_outside_expose_proof_item_list"
            java.lang.String r13 = "url"
            java.lang.String r14 = "msgType"
            java.lang.String r15 = "webviewImg"
            java.lang.String r10 = "webviewHtml"
            java.lang.String r11 = "proof"
            java.lang.String r12 = "realChatUser"
            r16 = r4
            java.lang.String r4 = "newMsgId"
            r1 = 45
            if (r0 == r1) goto L_0x015d
            r1 = r11
            r17 = r12
            java.lang.String r11 = "k_expose_msg_id"
            r12 = 51
            if (r0 == r12) goto L_0x013a
            r12 = 990(0x3de, float:1.387E-42)
            if (r0 == r12) goto L_0x012c
            switch(r0) {
                case 1: goto L_0x0160;
                case 2: goto L_0x0160;
                case 3: goto L_0x0160;
                case 4: goto L_0x0160;
                case 5: goto L_0x0160;
                case 6: goto L_0x0160;
                case 7: goto L_0x0160;
                default: goto L_0x0072;
            }
        L_0x0072:
            switch(r0) {
                case 33: goto L_0x011e;
                case 34: goto L_0x0087;
                case 35: goto L_0x0167;
                case 36: goto L_0x0167;
                case 37: goto L_0x0160;
                case 38: goto L_0x0167;
                case 39: goto L_0x0167;
                default: goto L_0x0075;
            }
        L_0x0075:
            java.lang.String r2 = "unknown expose scene: %d"
            r3 = 1
            java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0117 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0117 }
            r11 = 0
            r9[r11] = r3     // Catch:{ Exception -> 0x0117 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r2, r9)     // Catch:{ Exception -> 0x0117 }
            goto L_0x0167
        L_0x0087:
            java.lang.String r9 = r7.getString(r3)     // Catch:{ Exception -> 0x0117 }
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)     // Catch:{ Exception -> 0x0117 }
            if (r9 != 0) goto L_0x00a9
            java.lang.String r3 = r7.getString(r3)     // Catch:{ Exception -> 0x0117 }
            long r11 = com.tencent.p014mm.vfs.C86013q1.m106451l(r3)     // Catch:{ Exception -> 0x0117 }
            int r9 = (int) r11     // Catch:{ Exception -> 0x0117 }
            r11 = 0
            byte[] r9 = com.tencent.p014mm.vfs.C86013q1.m106433O(r3, r11, r9)     // Catch:{ Exception -> 0x0117 }
            com.tencent.p014mm.vfs.C86013q1.m106447h(r3)     // Catch:{ Exception -> 0x0117 }
            java.lang.String r3 = android.util.Base64.encodeToString(r9, r11)     // Catch:{ Exception -> 0x0117 }
            r8.putString(r15, r3)     // Catch:{ Exception -> 0x0117 }
        L_0x00a9:
            java.lang.String r3 = r7.getString(r2)     // Catch:{ Exception -> 0x0117 }
            if (r3 == 0) goto L_0x00b6
            java.lang.String r2 = r7.getString(r2)     // Catch:{ Exception -> 0x0117 }
            r8.putString(r10, r2)     // Catch:{ Exception -> 0x0117 }
        L_0x00b6:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0117 }
            r2.<init>()     // Catch:{ Exception -> 0x0117 }
            java.lang.String r3 = "<exposecontent>"
            r2.append(r3)     // Catch:{ Exception -> 0x0117 }
            java.lang.String r3 = "<weburl>"
            r2.append(r3)     // Catch:{ Exception -> 0x0117 }
            java.lang.String r3 = "k_expose_url"
            java.lang.String r3 = r7.getString(r3)     // Catch:{ Exception -> 0x0117 }
            if (r3 == 0) goto L_0x00d6
            java.lang.String r3 = "k_expose_url"
            java.lang.String r3 = r7.getString(r3)     // Catch:{ Exception -> 0x0117 }
            r2.append(r3)     // Catch:{ Exception -> 0x0117 }
        L_0x00d6:
            java.lang.String r3 = "</weburl>"
            r2.append(r3)     // Catch:{ Exception -> 0x0117 }
            java.lang.String r3 = "<firstJumpUrl>"
            r2.append(r3)     // Catch:{ Exception -> 0x0117 }
            java.lang.String r3 = "k_expose_raw_url"
            java.lang.String r3 = r7.getString(r3)     // Catch:{ Exception -> 0x0117 }
            if (r3 == 0) goto L_0x00f1
            java.lang.String r3 = "k_expose_raw_url"
            java.lang.String r3 = r7.getString(r3)     // Catch:{ Exception -> 0x0117 }
            r2.append(r3)     // Catch:{ Exception -> 0x0117 }
        L_0x00f1:
            java.lang.String r3 = "</firstJumpUrl>"
            r2.append(r3)     // Catch:{ Exception -> 0x0117 }
            java.lang.String r3 = "<webscence>"
            r2.append(r3)     // Catch:{ Exception -> 0x0117 }
            java.lang.String r3 = "k_expose_web_scene"
            r9 = 0
            int r3 = r7.getInt(r3, r9)     // Catch:{ Exception -> 0x0117 }
            r2.append(r3)     // Catch:{ Exception -> 0x0117 }
            java.lang.String r3 = "</webscence>"
            r2.append(r3)     // Catch:{ Exception -> 0x0117 }
            java.lang.String r3 = "</exposecontent>"
            r2.append(r3)     // Catch:{ Exception -> 0x0117 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0117 }
            r8.putString(r13, r2)     // Catch:{ Exception -> 0x0117 }
            goto L_0x0167
        L_0x0117:
            r0 = move-exception
            r1 = r18
        L_0x011a:
            r2 = r16
            goto L_0x0278
        L_0x011e:
            r2 = 0
            long r2 = r7.getLong(r11, r2)     // Catch:{ Exception -> 0x0117 }
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.ConvertUtils.longToString(r2)     // Catch:{ Exception -> 0x0117 }
            r8.putString(r4, r2)     // Catch:{ Exception -> 0x0117 }
            goto L_0x0167
        L_0x012c:
            java.lang.String r2 = "k_realchatuser"
            java.lang.String r2 = r7.getString(r2)     // Catch:{ Exception -> 0x0117 }
            r3 = r17
            r8.putString(r3, r2)     // Catch:{ Exception -> 0x0117 }
            r17 = r3
            goto L_0x0167
        L_0x013a:
            r3 = r17
            r17 = r3
            r2 = 0
            long r2 = r7.getLong(r11, r2)     // Catch:{ Exception -> 0x0117 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x0117 }
            r8.putString(r4, r2)     // Catch:{ Exception -> 0x0117 }
            java.util.ArrayList r2 = r7.getStringArrayList(r9)     // Catch:{ Exception -> 0x0117 }
            r8.putStringArrayList(r1, r2)     // Catch:{ Exception -> 0x0117 }
            java.lang.String r2 = "k_expose_msg_type"
            r3 = 0
            int r2 = r7.getInt(r2, r3)     // Catch:{ Exception -> 0x0117 }
            r8.putInt(r14, r2)     // Catch:{ Exception -> 0x0117 }
            goto L_0x0167
        L_0x015d:
            r1 = r11
            r17 = r12
        L_0x0160:
            java.util.ArrayList r2 = r7.getStringArrayList(r9)     // Catch:{ Exception -> 0x0117 }
            r8.putStringArrayList(r1, r2)     // Catch:{ Exception -> 0x0117 }
        L_0x0167:
            java.lang.String r2 = "k_username"
            java.lang.String r2 = r7.getString(r2)     // Catch:{ Exception -> 0x0117 }
            r8.putString(r5, r2)     // Catch:{ Exception -> 0x0117 }
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ Exception -> 0x0117 }
            r2.<init>()     // Catch:{ Exception -> 0x0117 }
            boolean r3 = r8.isEmpty()     // Catch:{ Exception -> 0x0117 }
            if (r3 != 0) goto L_0x0267
            java.lang.String r3 = "content"
            r7 = 45
            if (r0 == r7) goto L_0x01a9
            r7 = 51
            if (r0 == r7) goto L_0x021d
            r7 = 61
            if (r0 == r7) goto L_0x0206
            r7 = 76
            if (r0 == r7) goto L_0x01ef
            r7 = 990(0x3de, float:1.387E-42)
            if (r0 == r7) goto L_0x01e4
            switch(r0) {
                case 1: goto L_0x01a9;
                case 2: goto L_0x01a9;
                case 3: goto L_0x01a9;
                case 4: goto L_0x01a9;
                case 5: goto L_0x01a9;
                case 6: goto L_0x01a9;
                case 7: goto L_0x01a9;
                default: goto L_0x0194;
            }
        L_0x0194:
            switch(r0) {
                case 33: goto L_0x01db;
                case 34: goto L_0x01ac;
                case 35: goto L_0x01a9;
                case 36: goto L_0x01a9;
                case 37: goto L_0x01a9;
                case 38: goto L_0x01a9;
                case 39: goto L_0x01a9;
                default: goto L_0x0197;
            }
        L_0x0197:
            java.lang.String r4 = "unknown scene %d"
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0117 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0117 }
            r9 = 0
            r7[r9] = r0     // Catch:{ Exception -> 0x0117 }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r6, r4, r7)     // Catch:{ Exception -> 0x0117 }
            goto L_0x0230
        L_0x01a9:
            r9 = 0
            goto L_0x0230
        L_0x01ac:
            r9 = 0
            java.lang.String r0 = r8.getString(r15)     // Catch:{ Exception -> 0x0117 }
            r2.put(r15, r0)     // Catch:{ Exception -> 0x0117 }
            java.lang.String r0 = r8.getString(r10)     // Catch:{ Exception -> 0x0117 }
            r2.put(r10, r0)     // Catch:{ Exception -> 0x0117 }
            java.lang.String r0 = r8.getString(r13)     // Catch:{ Exception -> 0x0117 }
            r2.put(r3, r0)     // Catch:{ Exception -> 0x0117 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0117 }
            r0.<init>()     // Catch:{ Exception -> 0x0117 }
            java.lang.String r4 = "content = "
            r0.append(r4)     // Catch:{ Exception -> 0x0117 }
            java.lang.String r4 = r8.getString(r13)     // Catch:{ Exception -> 0x0117 }
            r0.append(r4)     // Catch:{ Exception -> 0x0117 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0117 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)     // Catch:{ Exception -> 0x0117 }
            goto L_0x0230
        L_0x01db:
            r9 = 0
            java.lang.String r0 = r8.getString(r4)     // Catch:{ Exception -> 0x0117 }
            r2.put(r4, r0)     // Catch:{ Exception -> 0x0117 }
            goto L_0x0230
        L_0x01e4:
            r9 = 0
            r0 = r17
            java.lang.String r4 = r8.getString(r0)     // Catch:{ Exception -> 0x0117 }
            r2.put(r0, r4)     // Catch:{ Exception -> 0x0117 }
            goto L_0x0230
        L_0x01ef:
            r0 = r17
            r9 = 0
            java.lang.String r4 = r8.getString(r5)     // Catch:{ Exception -> 0x0117 }
            java.lang.Class<qy2.w> r7 = qy2.C12935w.class
            di3.d r7 = di3.C86312j.m106911c(r7)     // Catch:{ Exception -> 0x0117 }
            qy2.w r7 = (qy2.C12935w) r7     // Catch:{ Exception -> 0x0117 }
            java.lang.String r4 = r7.mo12485n(r4)     // Catch:{ Exception -> 0x0117 }
            r2.put(r0, r4)     // Catch:{ Exception -> 0x0117 }
            goto L_0x0230
        L_0x0206:
            r0 = r17
            r9 = 0
            java.lang.String r4 = r8.getString(r5)     // Catch:{ Exception -> 0x0117 }
            java.lang.Class<ht1.k4> r7 = ht1.C60179k4.class
            di3.d r7 = di3.C86312j.m106911c(r7)     // Catch:{ Exception -> 0x0117 }
            ht1.k4 r7 = (ht1.C60179k4) r7     // Catch:{ Exception -> 0x0117 }
            java.lang.String r4 = r7.mo78770n(r4)     // Catch:{ Exception -> 0x0117 }
            r2.put(r0, r4)     // Catch:{ Exception -> 0x0117 }
            goto L_0x0230
        L_0x021d:
            r9 = 0
            java.lang.String r0 = r8.getString(r4)     // Catch:{ Exception -> 0x0117 }
            r2.put(r4, r0)     // Catch:{ Exception -> 0x0117 }
            int r0 = r8.getInt(r14)     // Catch:{ Exception -> 0x0117 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0117 }
            r2.put(r14, r0)     // Catch:{ Exception -> 0x0117 }
        L_0x0230:
            java.lang.String r0 = r8.getString(r5)     // Catch:{ Exception -> 0x0117 }
            r2.put(r5, r0)     // Catch:{ Exception -> 0x0117 }
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ Exception -> 0x0117 }
            r0.<init>()     // Catch:{ Exception -> 0x0117 }
            java.util.ArrayList r1 = r8.getStringArrayList(r1)     // Catch:{ Exception -> 0x0117 }
            if (r1 == 0) goto L_0x0252
            int r4 = r1.size()     // Catch:{ Exception -> 0x0117 }
        L_0x0246:
            if (r9 >= r4) goto L_0x0252
            java.lang.Object r5 = r1.get(r9)     // Catch:{ Exception -> 0x0117 }
            r0.put(r5)     // Catch:{ Exception -> 0x0117 }
            int r9 = r9 + 1
            goto L_0x0246
        L_0x0252:
            boolean r1 = r2.containsKey(r3)     // Catch:{ Exception -> 0x0117 }
            if (r1 != 0) goto L_0x025f
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0117 }
            r2.put(r3, r0)     // Catch:{ Exception -> 0x0117 }
        L_0x025f:
            r1 = r18
            com.tencent.mm.plugin.lite.api.c$a r0 = r1.f19815f     // Catch:{ Exception -> 0x0273 }
            r0.mo5691c(r2)     // Catch:{ Exception -> 0x0273 }
            goto L_0x0295
        L_0x0267:
            r1 = r18
            com.tencent.mm.plugin.lite.api.c$a r0 = r1.f19815f     // Catch:{ Exception -> 0x0273 }
            r2 = r16
            r0.mo5689a(r2)     // Catch:{ Exception -> 0x0271 }
            goto L_0x0295
        L_0x0271:
            r0 = move-exception
            goto L_0x0278
        L_0x0273:
            r0 = move-exception
            goto L_0x011a
        L_0x0276:
            r0 = move-exception
            r2 = r4
        L_0x0278:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "doExposePreparation exception"
            r3.append(r4)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
            com.tencent.mm.plugin.lite.api.c$a r0 = r1.f19815f
            r0.mo5689a(r2)
        L_0x0295:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.lite.jsapi.comms.C4785f.mo5693a(java.lang.String, org.json.JSONObject, boolean):void");
    }
}
