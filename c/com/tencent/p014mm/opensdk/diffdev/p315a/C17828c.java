package com.tencent.p014mm.opensdk.diffdev.p315a;

import android.os.AsyncTask;
import com.tencent.p014mm.opensdk.diffdev.OAuthErrCode;
import com.tencent.p014mm.opensdk.diffdev.OAuthListener;

/* renamed from: com.tencent.mm.opensdk.diffdev.a.c */
class C17828c extends AsyncTask<Void, Void, C17829a> {

    /* renamed from: a */
    private String f49111a;

    /* renamed from: b */
    private String f49112b;

    /* renamed from: c */
    private OAuthListener f49113c;

    /* renamed from: d */
    private int f49114d;

    /* renamed from: com.tencent.mm.opensdk.diffdev.a.c$a */
    public static class C17829a {

        /* renamed from: a */
        public OAuthErrCode f49115a;

        /* renamed from: b */
        public String f49116b;

        /* renamed from: c */
        public int f49117c;
    }

    public C17828c(String str, OAuthListener oAuthListener) {
        this.f49111a = str;
        this.f49113c = oAuthListener;
        this.f49112b = String.format("https://long.open.weixin.qq.com/connect/l/qrconnect?f=json&uuid=%s", new Object[]{str});
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x016c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object doInBackground(java.lang.Object[] r14) {
        /*
            r13 = this;
            java.lang.Void[] r14 = (java.lang.Void[]) r14
            java.lang.Thread r14 = java.lang.Thread.currentThread()
            java.lang.String r0 = "OpenSdkNoopingTask"
            r14.setName(r0)
            java.lang.String r14 = r13.f49111a
            java.lang.String r0 = "MicroMsg.SDK.NoopingTask"
            if (r14 == 0) goto L_0x0193
            int r14 = r14.length()
            if (r14 != 0) goto L_0x0019
            goto L_0x0193
        L_0x0019:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r1 = "doInBackground start "
            r14.append(r1)
            boolean r1 = r13.isCancelled()
            r14.append(r1)
            java.lang.String r14 = r14.toString()
            com.tencent.p014mm.opensdk.utils.Log.m99045i(r0, r14)
        L_0x0031:
            boolean r14 = r13.isCancelled()
            if (r14 != 0) goto L_0x0186
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r1 = r13.f49112b
            r14.append(r1)
            int r1 = r13.f49114d
            if (r1 != 0) goto L_0x0048
            java.lang.String r1 = ""
            goto L_0x005b
        L_0x0048:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "&last="
            r1.append(r2)
            int r2 = r13.f49114d
            r1.append(r2)
            java.lang.String r1 = r1.toString()
        L_0x005b:
            r14.append(r1)
            java.lang.String r14 = r14.toString()
            long r1 = java.lang.System.currentTimeMillis()
            r3 = 60000(0xea60, float:8.4078E-41)
            byte[] r3 = com.tencent.p014mm.opensdk.channel.p943a.C81053a.m99036a((java.lang.String) r14, (int) r3)
            long r4 = java.lang.System.currentTimeMillis()
            com.tencent.mm.opensdk.diffdev.a.c$a r6 = new com.tencent.mm.opensdk.diffdev.a.c$a
            r6.<init>()
            java.lang.String r7 = "MicroMsg.SDK.NoopingResult"
            java.lang.String r8 = "star parse NoopingResult"
            com.tencent.p014mm.opensdk.utils.Log.m99043d(r7, r8)
            r8 = 1
            r9 = 0
            if (r3 == 0) goto L_0x00fd
            int r10 = r3.length
            if (r10 != 0) goto L_0x0087
            goto L_0x00fd
        L_0x0087:
            java.lang.String r10 = new java.lang.String     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r11 = "utf-8"
            r10.<init>(r3, r11)     // Catch:{ Exception -> 0x00e8 }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x00d8 }
            r3.<init>(r10)     // Catch:{ Exception -> 0x00d8 }
            java.lang.String r10 = "wx_errcode"
            int r10 = r3.getInt(r10)     // Catch:{ Exception -> 0x00d8 }
            r6.f49117c = r10     // Catch:{ Exception -> 0x00d8 }
            java.lang.String r11 = "nooping uuidStatusCode = %d"
            java.lang.Object[] r12 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x00d8 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x00d8 }
            r12[r9] = r10     // Catch:{ Exception -> 0x00d8 }
            java.lang.String r10 = java.lang.String.format(r11, r12)     // Catch:{ Exception -> 0x00d8 }
            com.tencent.p014mm.opensdk.utils.Log.m99043d(r7, r10)     // Catch:{ Exception -> 0x00d8 }
            int r10 = r6.f49117c     // Catch:{ Exception -> 0x00d8 }
            r11 = 408(0x198, float:5.72E-43)
            if (r10 == r11) goto L_0x00d3
            r11 = 500(0x1f4, float:7.0E-43)
            if (r10 == r11) goto L_0x00d0
            switch(r10) {
                case 402: goto L_0x00cd;
                case 403: goto L_0x00ca;
                case 404: goto L_0x00d3;
                case 405: goto L_0x00bc;
                default: goto L_0x00bb;
            }     // Catch:{ Exception -> 0x00d8 }
        L_0x00bb:
            goto L_0x00d0
        L_0x00bc:
            com.tencent.mm.opensdk.diffdev.OAuthErrCode r10 = com.tencent.p014mm.opensdk.diffdev.OAuthErrCode.WechatAuth_Err_OK     // Catch:{ Exception -> 0x00d8 }
            r6.f49115a = r10     // Catch:{ Exception -> 0x00d8 }
            java.lang.String r10 = "wx_code"
            java.lang.String r3 = r3.getString(r10)     // Catch:{ Exception -> 0x00d8 }
            r6.f49116b = r3     // Catch:{ Exception -> 0x00d8 }
            goto L_0x0106
        L_0x00ca:
            com.tencent.mm.opensdk.diffdev.OAuthErrCode r3 = com.tencent.p014mm.opensdk.diffdev.OAuthErrCode.WechatAuth_Err_Cancel     // Catch:{ Exception -> 0x00d8 }
            goto L_0x00d5
        L_0x00cd:
            com.tencent.mm.opensdk.diffdev.OAuthErrCode r3 = com.tencent.p014mm.opensdk.diffdev.OAuthErrCode.WechatAuth_Err_Timeout     // Catch:{ Exception -> 0x00d8 }
            goto L_0x00d5
        L_0x00d0:
            com.tencent.mm.opensdk.diffdev.OAuthErrCode r3 = com.tencent.p014mm.opensdk.diffdev.OAuthErrCode.WechatAuth_Err_NormalErr     // Catch:{ Exception -> 0x00d8 }
            goto L_0x00d5
        L_0x00d3:
            com.tencent.mm.opensdk.diffdev.OAuthErrCode r3 = com.tencent.p014mm.opensdk.diffdev.OAuthErrCode.WechatAuth_Err_OK     // Catch:{ Exception -> 0x00d8 }
        L_0x00d5:
            r6.f49115a = r3     // Catch:{ Exception -> 0x00d8 }
            goto L_0x0106
        L_0x00d8:
            r3 = move-exception
            java.lang.Object[] r10 = new java.lang.Object[r8]
            java.lang.String r3 = r3.getMessage()
            r10[r9] = r3
            java.lang.String r3 = "parse json fail, ex = %s"
            java.lang.String r3 = java.lang.String.format(r3, r10)
            goto L_0x00f7
        L_0x00e8:
            r3 = move-exception
            java.lang.Object[] r10 = new java.lang.Object[r8]
            java.lang.String r3 = r3.getMessage()
            r10[r9] = r3
            java.lang.String r3 = "parse fail, build String fail, ex = %s"
            java.lang.String r3 = java.lang.String.format(r3, r10)
        L_0x00f7:
            com.tencent.p014mm.opensdk.utils.Log.m99044e(r7, r3)
            com.tencent.mm.opensdk.diffdev.OAuthErrCode r3 = com.tencent.p014mm.opensdk.diffdev.OAuthErrCode.WechatAuth_Err_NormalErr
            goto L_0x0104
        L_0x00fd:
            java.lang.String r3 = "parse fail, buf is null"
            com.tencent.p014mm.opensdk.utils.Log.m99044e(r7, r3)
            com.tencent.mm.opensdk.diffdev.OAuthErrCode r3 = com.tencent.p014mm.opensdk.diffdev.OAuthErrCode.WechatAuth_Err_NetworkErr
        L_0x0104:
            r6.f49115a = r3
        L_0x0106:
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r9] = r14
            com.tencent.mm.opensdk.diffdev.OAuthErrCode r14 = r6.f49115a
            java.lang.String r14 = r14.toString()
            r3[r8] = r14
            int r14 = r6.f49117c
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r7 = 2
            r3[r7] = r14
            long r4 = r4 - r1
            java.lang.Long r14 = java.lang.Long.valueOf(r4)
            r1 = 3
            r3[r1] = r14
            java.lang.String r14 = "nooping, url = %s, errCode = %s, uuidStatusCode = %d, time consumed = %d(ms)"
            java.lang.String r14 = java.lang.String.format(r14, r3)
            com.tencent.p014mm.opensdk.utils.Log.m99043d(r0, r14)
            com.tencent.mm.opensdk.diffdev.OAuthErrCode r14 = r6.f49115a
            com.tencent.mm.opensdk.diffdev.OAuthErrCode r1 = com.tencent.p014mm.opensdk.diffdev.OAuthErrCode.WechatAuth_Err_OK
            if (r14 != r1) goto L_0x016c
            int r14 = r6.f49117c
            r13.f49114d = r14
            com.tencent.mm.opensdk.diffdev.a.d r1 = com.tencent.p014mm.opensdk.diffdev.p315a.C29065d.UUID_SCANED
            int r1 = r1.mo56429a()
            if (r14 != r1) goto L_0x0146
            com.tencent.mm.opensdk.diffdev.OAuthListener r14 = r13.f49113c
            r14.onQrcodeScanned()
            goto L_0x0031
        L_0x0146:
            int r14 = r6.f49117c
            com.tencent.mm.opensdk.diffdev.a.d r1 = com.tencent.p014mm.opensdk.diffdev.p315a.C29065d.UUID_KEEP_CONNECT
            int r1 = r1.mo56429a()
            if (r14 != r1) goto L_0x0152
            goto L_0x0031
        L_0x0152:
            int r14 = r6.f49117c
            com.tencent.mm.opensdk.diffdev.a.d r1 = com.tencent.p014mm.opensdk.diffdev.p315a.C29065d.UUID_CONFIRM
            int r1 = r1.mo56429a()
            if (r14 != r1) goto L_0x0031
            java.lang.String r14 = r6.f49116b
            if (r14 == 0) goto L_0x0166
            int r14 = r14.length()
            if (r14 != 0) goto L_0x01a1
        L_0x0166:
            java.lang.String r14 = "nooping fail, confirm with an empty code!!!"
            com.tencent.p014mm.opensdk.utils.Log.m99044e(r0, r14)
            goto L_0x019d
        L_0x016c:
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r14 = r14.toString()
            r1[r9] = r14
            int r14 = r6.f49117c
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r1[r8] = r14
            java.lang.String r14 = "nooping fail, errCode = %s, uuidStatusCode = %d"
            java.lang.String r14 = java.lang.String.format(r14, r1)
            com.tencent.p014mm.opensdk.utils.Log.m99044e(r0, r14)
            goto L_0x01a1
        L_0x0186:
            java.lang.String r14 = "IDiffDevOAuth.stopAuth / detach invoked"
            com.tencent.p014mm.opensdk.utils.Log.m99045i(r0, r14)
            com.tencent.mm.opensdk.diffdev.a.c$a r6 = new com.tencent.mm.opensdk.diffdev.a.c$a
            r6.<init>()
            com.tencent.mm.opensdk.diffdev.OAuthErrCode r14 = com.tencent.p014mm.opensdk.diffdev.OAuthErrCode.WechatAuth_Err_Auth_Stopped
            goto L_0x019f
        L_0x0193:
            java.lang.String r14 = "run fail, uuid is null"
            com.tencent.p014mm.opensdk.utils.Log.m99044e(r0, r14)
            com.tencent.mm.opensdk.diffdev.a.c$a r6 = new com.tencent.mm.opensdk.diffdev.a.c$a
            r6.<init>()
        L_0x019d:
            com.tencent.mm.opensdk.diffdev.OAuthErrCode r14 = com.tencent.p014mm.opensdk.diffdev.OAuthErrCode.WechatAuth_Err_NormalErr
        L_0x019f:
            r6.f49115a = r14
        L_0x01a1:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.opensdk.diffdev.p315a.C17828c.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    public void onPostExecute(Object obj) {
        C17829a aVar = (C17829a) obj;
        this.f49113c.onAuthFinish(aVar.f49115a, aVar.f49116b);
    }
}
