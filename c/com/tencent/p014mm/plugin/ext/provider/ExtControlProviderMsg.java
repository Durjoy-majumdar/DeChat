package com.tencent.p014mm.plugin.ext.provider;

import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.MatrixCursor;
import android.net.Uri;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiStartPlayVoice;
import com.tencent.p014mm.sdk.platformtools.WeChatAuthorities;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;

/* renamed from: com.tencent.mm.plugin.ext.provider.ExtControlProviderMsg */
public class ExtControlProviderMsg extends ExtContentProviderBase {

    /* renamed from: t */
    public static final String[] f269505t = {"msgId", "fromUserId", "fromUserNickName", "msgType", DownloadInfo.CONTENTTYPE, "content", "status", "createTime"};

    /* renamed from: u */
    public static final String[] f269506u = {"userId", "unReadCount"};

    /* renamed from: v */
    public static final String[] f269507v = {"userId", "unReadCount"};

    /* renamed from: w */
    public static final String[] f269508w = {"userId", "retCode", "msgId"};

    /* renamed from: x */
    public static final String[] f269509x = {"msgId", "retCode"};

    /* renamed from: y */
    public static final String[] f269510y = {"msgId", "retCode"};

    /* renamed from: z */
    public static final UriMatcher f269511z;

    /* renamed from: o */
    public MatrixCursor f269512o;

    /* renamed from: p */
    public boolean f269513p;

    /* renamed from: q */
    public String[] f269514q;

    /* renamed from: r */
    public int f269515r;

    /* renamed from: s */
    public Context f269516s;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f269511z = uriMatcher;
        uriMatcher.addURI(WeChatAuthorities.AUTHORITIES_PLUGIN_EXT_MESSAGE(), "oneMsg", 7);
        uriMatcher.addURI(WeChatAuthorities.AUTHORITIES_PLUGIN_EXT_MESSAGE(), "unReadCount", 8);
        uriMatcher.addURI(WeChatAuthorities.AUTHORITIES_PLUGIN_EXT_MESSAGE(), "unReadMsgs", 9);
        uriMatcher.addURI(WeChatAuthorities.AUTHORITIES_PLUGIN_EXT_MESSAGE(), "unReadUserList", 10);
        uriMatcher.addURI(WeChatAuthorities.AUTHORITIES_PLUGIN_EXT_MESSAGE(), "recordMsg", 11);
        uriMatcher.addURI(WeChatAuthorities.AUTHORITIES_PLUGIN_EXT_MESSAGE(), JsApiStartPlayVoice.NAME, 12);
        uriMatcher.addURI(WeChatAuthorities.AUTHORITIES_PLUGIN_EXT_MESSAGE(), "setReaded", 13);
        uriMatcher.addURI(WeChatAuthorities.AUTHORITIES_PLUGIN_EXT_MESSAGE(), "sendTextMsg", 14);
    }

    public ExtControlProviderMsg() {
        this.f269512o = null;
        this.f269513p = false;
        this.f269514q = null;
        this.f269515r = -1;
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0103 A[Catch:{ Exception -> 0x0152 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x010a A[Catch:{ Exception -> 0x0152 }] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo128180l(android.database.MatrixCursor r15, com.tencent.p014mm.storage.C72963f4 r16, com.tencent.p014mm.storage.C72996z1 r17, boolean r18, java.lang.String r19, boolean r20, java.lang.String r21) {
        /*
            r14 = this;
            r0 = r15
            if (r0 == 0) goto L_0x0162
            if (r16 != 0) goto L_0x0007
            goto L_0x0162
        L_0x0007:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r21)
            java.lang.String r2 = "MicroMsg.ExtControlProviderMsg"
            if (r1 == 0) goto L_0x0016
            java.lang.String r0 = "userOpenId is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)
            return
        L_0x0016:
            int r1 = r16.getType()
            r3 = 9999(0x270f, float:1.4012E-41)
            if (r1 == r3) goto L_0x0160
            int r1 = r16.getType()
            r3 = 10000(0x2710, float:1.4013E-41)
            if (r1 != r3) goto L_0x0028
            goto L_0x0160
        L_0x0028:
            r1 = 0
            java.lang.String r3 = ""
            r4 = 2
            if (r18 == 0) goto L_0x0077
            java.lang.String r5 = r16.getContent()
            int r5 = eb0.C75604z3.m90848t(r5)
            r6 = -1
            if (r5 == r6) goto L_0x0077
            java.lang.String r6 = r16.getContent()
            int r6 = r6.length()
            if (r6 <= r5) goto L_0x0077
            java.lang.String r6 = r16.getContent()
            java.lang.String r6 = r6.substring(r1, r5)
            java.lang.String r6 = r6.trim()
            if (r6 == 0) goto L_0x0077
            int r7 = r6.length()
            if (r7 <= 0) goto L_0x0077
            java.lang.String r7 = r16.getContent()
            int r7 = r7.length()
            int r5 = r5 + r4
            if (r7 < r5) goto L_0x0077
            java.lang.Class<d62.i> r7 = d62.C75339i.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            d62.i r7 = (d62.C75339i) r7
            java.lang.String r6 = r7.getDisplayName(r6)
            java.lang.String r7 = r16.getContent()
            java.lang.String r5 = r7.substring(r5)
            goto L_0x0079
        L_0x0077:
            r5 = r3
            r6 = r5
        L_0x0079:
            int r7 = r16.getType()
            r8 = 34
            r9 = 3
            r10 = 1
            if (r7 != r8) goto L_0x0085
            r7 = 2
            goto L_0x008e
        L_0x0085:
            int r7 = r16.getType()
            if (r7 != r10) goto L_0x008d
            r7 = 1
            goto L_0x008e
        L_0x008d:
            r7 = 3
        L_0x008e:
            if (r7 != r10) goto L_0x00ac
            if (r18 == 0) goto L_0x00a7
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r6)
            java.lang.String r6 = "!]"
            r8.append(r6)
            r8.append(r5)
            java.lang.String r6 = r8.toString()
            goto L_0x00de
        L_0x00a7:
            java.lang.String r6 = r16.getContent()
            goto L_0x00de
        L_0x00ac:
            if (r7 != r4) goto L_0x00dc
            kd0.g0 r5 = kd0.C76546u.yx0()
            long r11 = r16.getMsgId()
            int r6 = (int) r11
            kd0.y r5 = r5.mo106786qq(r6)
            if (r5 == 0) goto L_0x00da
            java.lang.String r6 = r5.f224051b
            if (r6 == 0) goto L_0x00da
            java.lang.Class<dn.t> r6 = p492dn.C75415t.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            dn.t r6 = (p492dn.C75415t) r6
            java.lang.String r5 = r5.f224051b
            java.lang.String r6 = r6.mo91610mf(r5)
            java.lang.Object[] r5 = new java.lang.Object[r10]
            r5[r1] = r6
            java.lang.String r8 = "voice file = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r8, r5)
            goto L_0x00de
        L_0x00da:
            r6 = r3
            goto L_0x00de
        L_0x00dc:
            if (r18 == 0) goto L_0x00e0
        L_0x00de:
            r5 = r14
            goto L_0x00ee
        L_0x00e0:
            r5 = r14
            android.content.Context r6 = r5.f269516s
            if (r6 == 0) goto L_0x00ed
            r8 = 2131825399(0x7f1112f7, float:1.9283653E38)
            java.lang.String r6 = r6.getString(r8)
            goto L_0x00ee
        L_0x00ed:
            r6 = r3
        L_0x00ee:
            if (r20 == 0) goto L_0x00f3
            r8 = r21
            goto L_0x00fd
        L_0x00f3:
            r8 = r17
            long r11 = r8.f108320R1     // Catch:{ Exception -> 0x0152 }
            int r8 = (int) r11     // Catch:{ Exception -> 0x0152 }
            long r11 = (long) r8     // Catch:{ Exception -> 0x0152 }
            java.lang.String r8 = com.tencent.p014mm.plugin.ext.key.AESUtil.m105053b(r11)     // Catch:{ Exception -> 0x0152 }
        L_0x00fd:
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)     // Catch:{ Exception -> 0x0152 }
            if (r11 == 0) goto L_0x010a
            java.lang.String r0 = "userId is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)     // Catch:{ Exception -> 0x0152 }
            return
        L_0x010a:
            r11 = 8
            java.lang.Object[] r11 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x0152 }
            long r12 = r16.getMsgId()     // Catch:{ Exception -> 0x0152 }
            java.lang.String r12 = com.tencent.p014mm.plugin.ext.key.AESUtil.m105053b(r12)     // Catch:{ Exception -> 0x0152 }
            r11[r1] = r12     // Catch:{ Exception -> 0x0152 }
            r11[r10] = r8     // Catch:{ Exception -> 0x0152 }
            r11[r4] = r19     // Catch:{ Exception -> 0x0152 }
            int r8 = r16.mo108769t2()     // Catch:{ Exception -> 0x0152 }
            if (r8 != 0) goto L_0x0124
            r8 = 1
            goto L_0x0125
        L_0x0124:
            r8 = 2
        L_0x0125:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0152 }
            r11[r9] = r8     // Catch:{ Exception -> 0x0152 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x0152 }
            r8 = 4
            r11[r8] = r7     // Catch:{ Exception -> 0x0152 }
            r7 = 5
            r11[r7] = r6     // Catch:{ Exception -> 0x0152 }
            r6 = 6
            int r7 = r16.getStatus()     // Catch:{ Exception -> 0x0152 }
            if (r7 != r8) goto L_0x013d
            r4 = 1
        L_0x013d:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0152 }
            r11[r6] = r4     // Catch:{ Exception -> 0x0152 }
            r4 = 7
            long r6 = r16.getCreateTime()     // Catch:{ Exception -> 0x0152 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x0152 }
            r11[r4] = r6     // Catch:{ Exception -> 0x0152 }
            r15.addRow(r11)     // Catch:{ Exception -> 0x0152 }
            goto L_0x015f
        L_0x0152:
            r0 = move-exception
            java.lang.String r4 = r0.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r4)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r3, r1)
        L_0x015f:
            return
        L_0x0160:
            r5 = r14
            return
        L_0x0162:
            r5 = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.ext.provider.ExtControlProviderMsg.mo128180l(android.database.MatrixCursor, com.tencent.mm.storage.f4, com.tencent.mm.storage.z1, boolean, java.lang.String, boolean, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x02cb  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x03d0 A[Catch:{ Exception -> 0x0400 }] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x03d1 A[Catch:{ Exception -> 0x0400 }] */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x05d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.database.Cursor query(android.net.Uri r24, java.lang.String[] r25, java.lang.String r26, java.lang.String[] r27, java.lang.String r28) {
        /*
            r23 = this;
            r9 = r23
            r0 = r24
            r10 = r27
            java.lang.Class<d62.i> r1 = d62.C75339i.class
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "ExtControlProviderMsg query() mIsLocalUsed :"
            r2.append(r3)
            boolean r3 = r9.f269513p
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r11 = "MicroMsg.ExtControlProviderMsg"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r2)
            boolean r2 = r9.f269513p
            r12 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            r13 = 0
            r14 = 1
            r15 = 3
            if (r2 == 0) goto L_0x0085
            android.content.Context r2 = r9.f269516s
            int r4 = r9.f269515r
            java.lang.String[] r5 = r9.f269514q
            r9.mo128170c(r0, r2, r4, r5)
            java.lang.String r2 = r9.f269494g
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x004b
            java.lang.String r0 = "AppID == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
            r0 = 7
            r9.mo128177j(r15, r0)
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r0)
            return r0
        L_0x004b:
            java.lang.String r2 = r23.mo128169b()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x0063
            java.lang.String r0 = "PkgName == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
            r0 = 6
            r9.mo128177j(r15, r0)
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r0)
            return r0
        L_0x0063:
            int r2 = r23.mo128173f()
            if (r2 == r14) goto L_0x00c7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "invalid appid ! return code = "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
            r9.mo128177j(r12, r2)
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r2)
            return r0
        L_0x0085:
            android.content.Context r2 = r23.getContext()
            r9.f269516s = r2
            android.content.UriMatcher r4 = f269511z
            r9.mo128171d(r0, r2, r4)
            if (r0 != 0) goto L_0x0096
            r9.mo128176i(r15)
            return r13
        L_0x0096:
            java.lang.String r2 = r9.f269494g
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x0745
            java.lang.String r2 = r23.mo128169b()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x00aa
            goto L_0x0745
        L_0x00aa:
            boolean r2 = r23.mo128168a()
            if (r2 != 0) goto L_0x00b6
            r9.mo128176i(r14)
            android.database.MatrixCursor r0 = r9.f269491d
            return r0
        L_0x00b6:
            android.content.Context r2 = r9.f269516s
            boolean r2 = r9.mo128174g(r2)
            if (r2 != 0) goto L_0x00c7
            java.lang.String r0 = "invalid appid ! return null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r0)
            r9.mo128176i(r12)
            return r13
        L_0x00c7:
            java.lang.String r2 = "source"
            java.lang.String r2 = r0.getQueryParameter(r2)
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
            java.lang.String r4 = "count"
            java.lang.String r4 = r0.getQueryParameter(r4)
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r4)
            boolean r5 = r9.f269513p
            if (r5 != 0) goto L_0x00e8
            android.content.UriMatcher r5 = f269511z
            int r0 = r5.match(r0)
            r9.f269515r = r0
        L_0x00e8:
            int r0 = r9.f269515r
            java.lang.String r6 = "0"
            java.lang.String r7 = "openapi"
            r16 = 0
            java.lang.String r8 = "wrong args"
            java.lang.String r13 = ""
            r12 = 4
            r5 = 0
            switch(r0) {
                case 7: goto L_0x06a6;
                case 8: goto L_0x05ed;
                case 9: goto L_0x0416;
                case 10: goto L_0x033c;
                case 11: goto L_0x02da;
                case 12: goto L_0x01f4;
                case 13: goto L_0x0187;
                case 14: goto L_0x0102;
                default: goto L_0x00fb;
            }
        L_0x00fb:
            r0 = 15
            r9.mo128177j(r15, r0)
            r1 = 0
            return r1
        L_0x0102:
            java.lang.String r0 = "sendTextMsg()"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r0)
            if (r10 == 0) goto L_0x017f
            int r0 = r10.length
            if (r0 > 0) goto L_0x010f
            goto L_0x017f
        L_0x010f:
            r0 = r10[r5]     // Catch:{ Exception -> 0x0167 }
            long r0 = com.tencent.p014mm.plugin.ext.key.AESUtil.m105052a(r0)     // Catch:{ Exception -> 0x0167 }
            int r2 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r2 > 0) goto L_0x011d
            r9.mo128176i(r15)     // Catch:{ Exception -> 0x0167 }
            goto L_0x0185
        L_0x011d:
            ra1.b r3 = ra1.C47958b.xx0()     // Catch:{ Exception -> 0x0167 }
            r3.getClass()     // Catch:{ Exception -> 0x0167 }
            boolean r3 = eb0.C97625j3.m125811a()     // Catch:{ Exception -> 0x0167 }
            if (r3 == 0) goto L_0x0139
            if (r2 <= 0) goto L_0x0139
            eb0.c r2 = eb0.C97625j3.m125812b()     // Catch:{ Exception -> 0x0167 }
            com.tencent.mm.storage.u3 r2 = r2.mo105907v()     // Catch:{ Exception -> 0x0167 }
            com.tencent.mm.storage.z1 r0 = r2.mo69694e4(r0)     // Catch:{ Exception -> 0x0167 }
            goto L_0x013a
        L_0x0139:
            r0 = 0
        L_0x013a:
            if (r0 == 0) goto L_0x015d
            long r1 = r0.f108320R1     // Catch:{ Exception -> 0x0167 }
            int r2 = (int) r1     // Catch:{ Exception -> 0x0167 }
            if (r2 > 0) goto L_0x0142
            goto L_0x015d
        L_0x0142:
            android.database.MatrixCursor r1 = new android.database.MatrixCursor     // Catch:{ Exception -> 0x0167 }
            java.lang.String[] r2 = f269510y     // Catch:{ Exception -> 0x0167 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0167 }
            r9.f269512o = r1     // Catch:{ Exception -> 0x0167 }
            cd3.b r1 = new cd3.b     // Catch:{ Exception -> 0x0167 }
            r1.<init>()     // Catch:{ Exception -> 0x0167 }
            r2 = 15000(0x3a98, double:7.411E-320)
            ya1.b r4 = new ya1.b     // Catch:{ Exception -> 0x0167 }
            r4.<init>(r9, r0, r10, r1)     // Catch:{ Exception -> 0x0167 }
            r1.mo62560b(r2, r4)     // Catch:{ Exception -> 0x0167 }
            android.database.MatrixCursor r13 = r9.f269512o
            goto L_0x0186
        L_0x015d:
            java.lang.String r0 = "toContact is null "
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)     // Catch:{ Exception -> 0x0167 }
            r9.mo128176i(r15)     // Catch:{ Exception -> 0x0167 }
            goto L_0x0185
        L_0x0167:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r1)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r0, r13, r1)
            android.database.MatrixCursor r0 = r9.f269512o
            if (r0 == 0) goto L_0x017b
            r0.close()
        L_0x017b:
            r9.mo128176i(r12)
            goto L_0x0185
        L_0x017f:
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r8)
            r9.mo128176i(r15)
        L_0x0185:
            r13 = 0
        L_0x0186:
            return r13
        L_0x0187:
            java.lang.String r0 = "setMsgReaded()"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            if (r10 == 0) goto L_0x01e7
            int r0 = r10.length
            if (r0 > 0) goto L_0x0193
            goto L_0x01e7
        L_0x0193:
            r0 = 0
        L_0x0194:
            int r1 = r10.length     // Catch:{ Exception -> 0x01d0 }
            if (r0 >= r1) goto L_0x01c8
            r1 = r10[r0]     // Catch:{ Exception -> 0x01d0 }
            if (r1 == 0) goto L_0x01b0
            int r1 = r1.length()     // Catch:{ Exception -> 0x01d0 }
            if (r1 > 0) goto L_0x01a2
            goto L_0x01b0
        L_0x01a2:
            r1 = r10[r0]     // Catch:{ Exception -> 0x01d0 }
            long r1 = com.tencent.p014mm.plugin.ext.key.AESUtil.m105052a(r1)     // Catch:{ Exception -> 0x01d0 }
            ra1.b r3 = ra1.C47958b.xx0()     // Catch:{ Exception -> 0x01d0 }
            r3.Cx0(r1)     // Catch:{ Exception -> 0x01d0 }
            goto L_0x01c5
        L_0x01b0:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01d0 }
            r1.<init>()     // Catch:{ Exception -> 0x01d0 }
            java.lang.String r2 = "setMsgReaded() wrongArgs i = "
            r1.append(r2)     // Catch:{ Exception -> 0x01d0 }
            r1.append(r0)     // Catch:{ Exception -> 0x01d0 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x01d0 }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r1)     // Catch:{ Exception -> 0x01d0 }
        L_0x01c5:
            int r0 = r0 + 1
            goto L_0x0194
        L_0x01c8:
            r9.mo128177j(r5, r14)
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r14)
            goto L_0x01f3
        L_0x01d0:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r1)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r0, r13, r1)
            r5 = 12
            r9.mo128177j(r12, r5)
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r5)
            goto L_0x01f3
        L_0x01e7:
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r8)
            r0 = 3801(0xed9, float:5.326E-42)
            r9.mo128177j(r15, r0)
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r0)
        L_0x01f3:
            return r0
        L_0x01f4:
            java.lang.String r0 = "handlePlayVoice()"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r0)
            if (r10 == 0) goto L_0x02d2
            int r0 = r10.length
            r1 = 2
            if (r0 >= r1) goto L_0x0201
            goto L_0x02d2
        L_0x0201:
            r0 = r10[r5]     // Catch:{ Exception -> 0x02bb }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x02bb }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x02bb }
            r1 = r10[r14]     // Catch:{ Exception -> 0x02bb }
            long r1 = com.tencent.p014mm.plugin.ext.key.AESUtil.m105052a(r1)     // Catch:{ Exception -> 0x02bb }
            int r4 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r4 > 0) goto L_0x021a
            r9.mo128176i(r15)     // Catch:{ Exception -> 0x02bb }
            goto L_0x02d8
        L_0x021a:
            if (r0 != r15) goto L_0x0295
            android.database.MatrixCursor r4 = new android.database.MatrixCursor     // Catch:{ Exception -> 0x02bb }
            java.lang.String[] r0 = f269509x     // Catch:{ Exception -> 0x02bb }
            r4.<init>(r0)     // Catch:{ Exception -> 0x02bb }
            com.tencent.mm.autogen.events.ExtVoiceMsgIdToFileNameEvent r0 = new com.tencent.mm.autogen.events.ExtVoiceMsgIdToFileNameEvent     // Catch:{ Exception -> 0x0293 }
            r0.<init>()     // Catch:{ Exception -> 0x0293 }
            com.tencent.mm.autogen.events.ExtVoiceMsgIdToFileNameEvent$a r6 = r0.f264801d     // Catch:{ Exception -> 0x0293 }
            r6.f264803a = r1     // Catch:{ Exception -> 0x0293 }
            r0.publish()     // Catch:{ Exception -> 0x0293 }
            com.tencent.mm.autogen.events.ExtVoiceMsgIdToFileNameEvent$b r6 = r0.f264802e     // Catch:{ Exception -> 0x0293 }
            java.lang.String r6 = r6.f264804a     // Catch:{ Exception -> 0x0293 }
            if (r6 == 0) goto L_0x0282
            int r6 = r6.length()     // Catch:{ Exception -> 0x0293 }
            if (r6 > 0) goto L_0x023c
            goto L_0x0282
        L_0x023c:
            com.tencent.mm.autogen.events.ExtPlayerEvent r6 = new com.tencent.mm.autogen.events.ExtPlayerEvent     // Catch:{ Exception -> 0x0293 }
            r6.<init>()     // Catch:{ Exception -> 0x0293 }
            com.tencent.mm.autogen.events.ExtPlayerEvent$a r7 = r6.f264779d     // Catch:{ Exception -> 0x0293 }
            r7.f264781a = r14     // Catch:{ Exception -> 0x0293 }
            com.tencent.mm.autogen.events.ExtVoiceMsgIdToFileNameEvent$b r0 = r0.f264802e     // Catch:{ Exception -> 0x0293 }
            java.lang.String r0 = r0.f264804a     // Catch:{ Exception -> 0x0293 }
            r7.f264782b = r0     // Catch:{ Exception -> 0x0293 }
            boolean r0 = r6.publish()     // Catch:{ Exception -> 0x0293 }
            if (r0 == 0) goto L_0x0265
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0293 }
            r3 = r10[r14]     // Catch:{ Exception -> 0x0293 }
            r0[r5] = r3     // Catch:{ Exception -> 0x0293 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r14)     // Catch:{ Exception -> 0x0293 }
            r0[r14] = r3     // Catch:{ Exception -> 0x0293 }
            r4.addRow(r0)     // Catch:{ Exception -> 0x0293 }
            r9.mo128176i(r5)     // Catch:{ Exception -> 0x0293 }
            goto L_0x027a
        L_0x0265:
            java.lang.String r0 = "play failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)     // Catch:{ Exception -> 0x0293 }
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0293 }
            r6 = r10[r14]     // Catch:{ Exception -> 0x0293 }
            r0[r5] = r6     // Catch:{ Exception -> 0x0293 }
            r0[r14] = r3     // Catch:{ Exception -> 0x0293 }
            r4.addRow(r0)     // Catch:{ Exception -> 0x0293 }
            r9.mo128176i(r12)     // Catch:{ Exception -> 0x0293 }
        L_0x027a:
            ra1.b r0 = ra1.C47958b.xx0()     // Catch:{ Exception -> 0x0293 }
            r0.Cx0(r1)     // Catch:{ Exception -> 0x0293 }
            goto L_0x0291
        L_0x0282:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0293 }
            r1 = r10[r14]     // Catch:{ Exception -> 0x0293 }
            r0[r5] = r1     // Catch:{ Exception -> 0x0293 }
            r0[r14] = r3     // Catch:{ Exception -> 0x0293 }
            r4.addRow(r0)     // Catch:{ Exception -> 0x0293 }
            r9.mo128176i(r12)     // Catch:{ Exception -> 0x0293 }
        L_0x0291:
            r13 = r4
            goto L_0x02d9
        L_0x0293:
            r0 = move-exception
            goto L_0x02bd
        L_0x0295:
            if (r0 != r12) goto L_0x02d8
            com.tencent.mm.autogen.events.ExtPlayerEvent r0 = new com.tencent.mm.autogen.events.ExtPlayerEvent     // Catch:{ Exception -> 0x02bb }
            r0.<init>()     // Catch:{ Exception -> 0x02bb }
            com.tencent.mm.autogen.events.ExtPlayerEvent$a r1 = r0.f264779d     // Catch:{ Exception -> 0x02bb }
            r2 = 2
            r1.f264781a = r2     // Catch:{ Exception -> 0x02bb }
            boolean r0 = r0.publish()     // Catch:{ Exception -> 0x02bb }
            if (r0 == 0) goto L_0x02b1
            java.lang.String r0 = "stop last playing"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)     // Catch:{ Exception -> 0x02bb }
            r9.mo128176i(r5)     // Catch:{ Exception -> 0x02bb }
            goto L_0x02d8
        L_0x02b1:
            java.lang.String r0 = "stop last playing fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)     // Catch:{ Exception -> 0x02bb }
            r9.mo128176i(r12)     // Catch:{ Exception -> 0x02bb }
            goto L_0x02d8
        L_0x02bb:
            r0 = move-exception
            r4 = 0
        L_0x02bd:
            java.lang.String r1 = r0.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r1)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r0, r13, r1)
            if (r4 == 0) goto L_0x02ce
            r4.close()
        L_0x02ce:
            r9.mo128176i(r12)
            goto L_0x02d8
        L_0x02d2:
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r8)
            r9.mo128176i(r15)
        L_0x02d8:
            r13 = 0
        L_0x02d9:
            return r13
        L_0x02da:
            java.lang.String r0 = "handleRecordMsg()"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r0)
            if (r10 == 0) goto L_0x0334
            int r0 = r10.length
            r1 = 2
            if (r0 >= r1) goto L_0x02e6
            goto L_0x0334
        L_0x02e6:
            r0 = r10[r5]     // Catch:{ Exception -> 0x031a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x031a }
            int r3 = r0.intValue()     // Catch:{ Exception -> 0x031a }
            r0 = r10[r14]     // Catch:{ Exception -> 0x031a }
            long r6 = com.tencent.p014mm.plugin.ext.key.AESUtil.m105052a(r0)     // Catch:{ Exception -> 0x031a }
            int r0 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r0 > 0) goto L_0x02fe
            r9.mo128176i(r15)     // Catch:{ Exception -> 0x031a }
            goto L_0x033a
        L_0x02fe:
            cd3.b r0 = new cd3.b     // Catch:{ Exception -> 0x031a }
            r0.<init>()     // Catch:{ Exception -> 0x031a }
            r14 = 4000(0xfa0, double:1.9763E-320)
            ya1.a r8 = new ya1.a     // Catch:{ Exception -> 0x031a }
            r1 = r8
            r2 = r23
            r12 = 0
            r4 = r6
            r6 = r0
            r7 = r27
            r1.<init>(r2, r3, r4, r6, r7)     // Catch:{ Exception -> 0x0318 }
            r0.mo62560b(r14, r8)     // Catch:{ Exception -> 0x0318 }
            android.database.MatrixCursor r13 = r9.f269512o     // Catch:{ Exception -> 0x0318 }
            goto L_0x033b
        L_0x0318:
            r0 = move-exception
            goto L_0x031c
        L_0x031a:
            r0 = move-exception
            r12 = 0
        L_0x031c:
            java.lang.String r1 = r0.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r1)
            java.lang.Object[] r1 = new java.lang.Object[r12]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r0, r13, r1)
            android.database.MatrixCursor r0 = r9.f269512o
            if (r0 == 0) goto L_0x032f
            r0.close()
        L_0x032f:
            r1 = 4
            r9.mo128176i(r1)
            goto L_0x033a
        L_0x0334:
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r8)
            r9.mo128176i(r15)
        L_0x033a:
            r13 = 0
        L_0x033b:
            return r13
        L_0x033c:
            r12 = 0
            java.lang.String r0 = "talker"
            java.lang.String r1 = "getUnReadUserList()"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r1)
            android.database.MatrixCursor r1 = new android.database.MatrixCursor
            java.lang.String[] r2 = f269507v
            r1.<init>(r2)
            eb0.c r2 = eb0.C97625j3.m125812b()     // Catch:{ Exception -> 0x0400 }
            g62.l r2 = r2.mo105911z()     // Catch:{ Exception -> 0x0400 }
            com.tencent.mm.storage.g4 r2 = (com.tencent.p014mm.storage.C72972g4) r2     // Catch:{ Exception -> 0x0400 }
            zh3.f r15 = r2.f212775p     // Catch:{ Exception -> 0x0400 }
            java.lang.String r2 = "count(*) as unReadCount"
            java.lang.String[] r17 = new java.lang.String[]{r0, r2}     // Catch:{ Exception -> 0x0400 }
            java.lang.String r2 = "4"
            java.lang.String[] r19 = new java.lang.String[]{r6, r2}     // Catch:{ Exception -> 0x0400 }
            java.lang.String r16 = "message"
            java.lang.String r18 = "isSend=? AND status!=?"
            java.lang.String r20 = "talker"
            r21 = 0
            r22 = 0
            android.database.Cursor r2 = r15.query(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x0400 }
            if (r2 == 0) goto L_0x03fb
            boolean r3 = r2.moveToFirst()     // Catch:{ Exception -> 0x0400 }
            if (r3 == 0) goto L_0x03f8
        L_0x037d:
            int r3 = r2.getColumnIndex(r0)     // Catch:{ Exception -> 0x0400 }
            java.lang.String r3 = r2.getString(r3)     // Catch:{ Exception -> 0x0400 }
            eb0.c r4 = eb0.C97625j3.m125812b()     // Catch:{ Exception -> 0x0400 }
            com.tencent.mm.storage.u3 r4 = r4.mo105907v()     // Catch:{ Exception -> 0x0400 }
            com.tencent.mm.storage.z1 r4 = r4.get(r3)     // Catch:{ Exception -> 0x0400 }
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85820U5(r3)     // Catch:{ Exception -> 0x0400 }
            if (r3 == 0) goto L_0x0398
            goto L_0x03f2
        L_0x0398:
            java.lang.String r3 = r4.getUsername()     // Catch:{ Exception -> 0x0400 }
            boolean r3 = eb0.C45628s0.m50812z(r3)     // Catch:{ Exception -> 0x0400 }
            if (r3 != 0) goto L_0x03cd
            java.lang.String r3 = r4.getUsername()     // Catch:{ Exception -> 0x0400 }
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85842m5(r3)     // Catch:{ Exception -> 0x0400 }
            if (r3 != 0) goto L_0x03cd
            int r3 = r4.mo73953E2()     // Catch:{ Exception -> 0x0400 }
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85810M4(r3)     // Catch:{ Exception -> 0x0400 }
            if (r3 != 0) goto L_0x03cd
            java.lang.String r3 = r4.getUsername()     // Catch:{ Exception -> 0x0400 }
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85841l5(r3)     // Catch:{ Exception -> 0x0400 }
            if (r3 != 0) goto L_0x03cd
            java.lang.String r3 = r4.getUsername()     // Catch:{ Exception -> 0x0400 }
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85833d5(r3)     // Catch:{ Exception -> 0x0400 }
            if (r3 == 0) goto L_0x03cb
            goto L_0x03cd
        L_0x03cb:
            r5 = 1
            goto L_0x03ce
        L_0x03cd:
            r5 = 0
        L_0x03ce:
            if (r5 == 0) goto L_0x03d1
            goto L_0x03f2
        L_0x03d1:
            long r3 = r4.f108320R1     // Catch:{ Exception -> 0x0400 }
            int r4 = (int) r3     // Catch:{ Exception -> 0x0400 }
            long r3 = (long) r4     // Catch:{ Exception -> 0x0400 }
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0400 }
            java.lang.String r3 = com.tencent.p014mm.plugin.ext.key.AESUtil.m105053b(r3)     // Catch:{ Exception -> 0x0400 }
            r6[r12] = r3     // Catch:{ Exception -> 0x0400 }
            java.lang.String r3 = "unReadCount"
            int r3 = r2.getColumnIndex(r3)     // Catch:{ Exception -> 0x0400 }
            int r3 = r2.getInt(r3)     // Catch:{ Exception -> 0x0400 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0400 }
            r6[r14] = r3     // Catch:{ Exception -> 0x0400 }
            r1.addRow(r6)     // Catch:{ Exception -> 0x0400 }
        L_0x03f2:
            boolean r3 = r2.moveToNext()     // Catch:{ Exception -> 0x0400 }
            if (r3 != 0) goto L_0x037d
        L_0x03f8:
            r2.close()     // Catch:{ Exception -> 0x0400 }
        L_0x03fb:
            r9.mo128176i(r12)     // Catch:{ Exception -> 0x0400 }
            r13 = r1
            goto L_0x0415
        L_0x0400:
            r0 = move-exception
            java.lang.String r2 = r0.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r2)
            java.lang.Object[] r2 = new java.lang.Object[r12]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r0, r13, r2)
            r1.close()
            r1 = 4
            r9.mo128176i(r1)
            r13 = 0
        L_0x0415:
            return r13
        L_0x0416:
            r5 = 12
            r12 = 0
            java.lang.String r0 = "getUnReadMsgs() "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            r0 = 2
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r3[r12] = r2
            r3[r14] = r4
            java.lang.String r0 = "getUnReadMsgs(), %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r11, r0, r3)
            if (r10 == 0) goto L_0x05e0
            int r0 = r10.length
            if (r0 > 0) goto L_0x0431
            goto L_0x05e0
        L_0x0431:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r0 == 0) goto L_0x0447
            java.lang.String r0 = "callSource == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
            r0 = 3702(0xe76, float:5.188E-42)
            r9.mo128177j(r15, r0)
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r0)
            goto L_0x05ec
        L_0x0447:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r0 == 0) goto L_0x045d
            java.lang.String r0 = "countStr == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
            r0 = 3703(0xe77, float:5.189E-42)
            r9.mo128177j(r15, r0)
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r0)
            goto L_0x05ec
        L_0x045d:
            if (r2 == 0) goto L_0x0467
            boolean r0 = r2.equalsIgnoreCase(r7)
            if (r0 == 0) goto L_0x0467
            r0 = 1
            goto L_0x0468
        L_0x0467:
            r0 = 0
        L_0x0468:
            if (r0 == 0) goto L_0x04a7
            com.tencent.mm.storage.f5 r2 = ra1.C47958b.Ax0()     // Catch:{ Exception -> 0x05c1 }
            r3 = r10[r12]     // Catch:{ Exception -> 0x05c1 }
            com.tencent.mm.storage.e5 r2 = r2.mo57647Lo(r3)     // Catch:{ Exception -> 0x05c1 }
            if (r2 == 0) goto L_0x0496
            java.lang.String r3 = r2.field_openId     // Catch:{ Exception -> 0x05c1 }
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)     // Catch:{ Exception -> 0x05c1 }
            if (r3 != 0) goto L_0x0496
            java.lang.String r3 = r2.field_username     // Catch:{ Exception -> 0x05c1 }
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)     // Catch:{ Exception -> 0x05c1 }
            if (r3 == 0) goto L_0x0487
            goto L_0x0496
        L_0x0487:
            eb0.c r3 = eb0.C97625j3.m125812b()     // Catch:{ Exception -> 0x05c1 }
            com.tencent.mm.storage.u3 r3 = r3.mo105907v()     // Catch:{ Exception -> 0x05c1 }
            java.lang.String r2 = r2.field_username     // Catch:{ Exception -> 0x05c1 }
            com.tencent.mm.storage.z1 r2 = r3.get(r2)     // Catch:{ Exception -> 0x05c1 }
            goto L_0x04b9
        L_0x0496:
            java.lang.String r0 = "openidInApp is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)     // Catch:{ Exception -> 0x05c1 }
            r0 = 3704(0xe78, float:5.19E-42)
            r9.mo128177j(r15, r0)     // Catch:{ Exception -> 0x05c1 }
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r0)     // Catch:{ Exception -> 0x05c1 }
            goto L_0x05ec
        L_0x04a7:
            r2 = r10[r12]     // Catch:{ Exception -> 0x05c1 }
            long r2 = com.tencent.p014mm.plugin.ext.key.AESUtil.m105052a(r2)     // Catch:{ Exception -> 0x05c1 }
            eb0.c r6 = eb0.C97625j3.m125812b()     // Catch:{ Exception -> 0x05c1 }
            com.tencent.mm.storage.u3 r6 = r6.mo105907v()     // Catch:{ Exception -> 0x05c1 }
            com.tencent.mm.storage.z1 r2 = r6.mo69694e4(r2)     // Catch:{ Exception -> 0x05c1 }
        L_0x04b9:
            r16 = r2
            if (r16 == 0) goto L_0x05b2
            java.lang.String r2 = r16.getUsername()     // Catch:{ Exception -> 0x05c1 }
            if (r2 == 0) goto L_0x05b2
            java.lang.String r2 = r16.getUsername()     // Catch:{ Exception -> 0x05c1 }
            int r2 = r2.length()     // Catch:{ Exception -> 0x05c1 }
            if (r2 > 0) goto L_0x04cf
            goto L_0x05b2
        L_0x04cf:
            java.lang.String r2 = r16.mo62898f()     // Catch:{ Exception -> 0x05c1 }
            java.lang.String r3 = r16.getUsername()     // Catch:{ Exception -> 0x05c1 }
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85820U5(r3)     // Catch:{ Exception -> 0x05c1 }
            if (r3 == 0) goto L_0x04f0
            di3.d r1 = di3.C86312j.m106911c(r1)     // Catch:{ Exception -> 0x05c1 }
            d62.i r1 = (d62.C75339i) r1     // Catch:{ Exception -> 0x05c1 }
            java.lang.String r2 = r16.getUsername()     // Catch:{ Exception -> 0x05c1 }
            java.lang.String r2 = r1.getDisplayName(r2)     // Catch:{ Exception -> 0x05c1 }
            r17 = r2
            r18 = 1
            goto L_0x04f4
        L_0x04f0:
            r17 = r2
            r18 = 0
        L_0x04f4:
            if (r0 == 0) goto L_0x0534
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r12)     // Catch:{ Exception -> 0x04fb }
            goto L_0x0505
        L_0x04fb:
            java.lang.String r1 = "exception in parseInt(%s)"
            java.lang.Object[] r2 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x05c1 }
            r2[r12] = r4     // Catch:{ Exception -> 0x05c1 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r1, r2)     // Catch:{ Exception -> 0x05c1 }
            r1 = 0
        L_0x0505:
            if (r1 <= 0) goto L_0x051f
            r2 = 15
            if (r1 < r2) goto L_0x050c
            goto L_0x051f
        L_0x050c:
            eb0.c r2 = eb0.C97625j3.m125812b()     // Catch:{ Exception -> 0x05c1 }
            g62.l r2 = r2.mo105911z()     // Catch:{ Exception -> 0x05c1 }
            java.lang.String r3 = r16.getUsername()     // Catch:{ Exception -> 0x05c1 }
            com.tencent.mm.storage.g4 r2 = (com.tencent.p014mm.storage.C72972g4) r2     // Catch:{ Exception -> 0x05c1 }
            android.database.Cursor r1 = r2.wt0(r3, r1)     // Catch:{ Exception -> 0x05c1 }
            goto L_0x0546
        L_0x051f:
            eb0.c r1 = eb0.C97625j3.m125812b()     // Catch:{ Exception -> 0x05c1 }
            g62.l r1 = r1.mo105911z()     // Catch:{ Exception -> 0x05c1 }
            java.lang.String r2 = r16.getUsername()     // Catch:{ Exception -> 0x05c1 }
            com.tencent.mm.storage.g4 r1 = (com.tencent.p014mm.storage.C72972g4) r1     // Catch:{ Exception -> 0x05c1 }
            r3 = 15
            android.database.Cursor r1 = r1.wt0(r2, r3)     // Catch:{ Exception -> 0x05c1 }
            goto L_0x0546
        L_0x0534:
            eb0.c r1 = eb0.C97625j3.m125812b()     // Catch:{ Exception -> 0x05c1 }
            g62.l r1 = r1.mo105911z()     // Catch:{ Exception -> 0x05c1 }
            java.lang.String r2 = r16.getUsername()     // Catch:{ Exception -> 0x05c1 }
            com.tencent.mm.storage.g4 r1 = (com.tencent.p014mm.storage.C72972g4) r1     // Catch:{ Exception -> 0x05c1 }
            android.database.Cursor r1 = r1.wt0(r2, r15)     // Catch:{ Exception -> 0x05c1 }
        L_0x0546:
            r8 = r1
            if (r8 != 0) goto L_0x055b
            java.lang.String r0 = "msgCursor == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)     // Catch:{ Exception -> 0x05c1 }
            r0 = 3706(0xe7a, float:5.193E-42)
            r1 = 4
            r9.mo128175h(r15, r1, r0)     // Catch:{ Exception -> 0x05c1 }
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r0)     // Catch:{ Exception -> 0x05c1 }
            goto L_0x05ec
        L_0x055b:
            android.database.MatrixCursor r7 = new android.database.MatrixCursor     // Catch:{ Exception -> 0x05c1 }
            java.lang.String[] r1 = f269505t     // Catch:{ Exception -> 0x05c1 }
            r7.<init>(r1)     // Catch:{ Exception -> 0x05c1 }
            int r1 = r8.getCount()     // Catch:{ Exception -> 0x05ae }
            if (r1 <= 0) goto L_0x059e
            boolean r1 = r8.moveToFirst()     // Catch:{ Exception -> 0x05ae }
            if (r1 == 0) goto L_0x059e
            com.tencent.mm.storage.f4 r6 = new com.tencent.mm.storage.f4     // Catch:{ Exception -> 0x05ae }
            r6.<init>()     // Catch:{ Exception -> 0x05ae }
        L_0x0573:
            r6.convertFrom(r8)     // Catch:{ Exception -> 0x05ae }
            r19 = r10[r12]     // Catch:{ Exception -> 0x05ae }
            r1 = r23
            r2 = r7
            r3 = r6
            r4 = r16
            r5 = r18
            r20 = r6
            r6 = r17
            r21 = r7
            r7 = r0
            r22 = r8
            r8 = r19
            r1.mo128180l(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x05ac }
            boolean r1 = r22.moveToNext()     // Catch:{ Exception -> 0x05ac }
            if (r1 != 0) goto L_0x0595
            goto L_0x05a2
        L_0x0595:
            r6 = r20
            r7 = r21
            r8 = r22
            r5 = 12
            goto L_0x0573
        L_0x059e:
            r21 = r7
            r22 = r8
        L_0x05a2:
            r22.close()     // Catch:{ Exception -> 0x05ac }
            r0 = 2
            r9.mo128175h(r0, r12, r14)     // Catch:{ Exception -> 0x05ac }
            r0 = r21
            goto L_0x05ec
        L_0x05ac:
            r0 = move-exception
            goto L_0x05c4
        L_0x05ae:
            r0 = move-exception
            r21 = r7
            goto L_0x05c4
        L_0x05b2:
            java.lang.String r0 = "contact is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)     // Catch:{ Exception -> 0x05c1 }
            r0 = 3705(0xe79, float:5.192E-42)
            r9.mo128177j(r15, r0)     // Catch:{ Exception -> 0x05c1 }
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r0)     // Catch:{ Exception -> 0x05c1 }
            goto L_0x05ec
        L_0x05c1:
            r0 = move-exception
            r21 = 0
        L_0x05c4:
            java.lang.String r1 = r0.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r1)
            java.lang.Object[] r1 = new java.lang.Object[r12]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r0, r13, r1)
            if (r21 == 0) goto L_0x05d5
            r21.close()
        L_0x05d5:
            r1 = 12
            r2 = 4
            r9.mo128175h(r15, r2, r1)
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r1)
            goto L_0x05ec
        L_0x05e0:
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r8)
            r0 = 3701(0xe75, float:5.186E-42)
            r9.mo128177j(r15, r0)
            android.database.MatrixCursor r0 = cd3.C39944a.m42754a(r0)
        L_0x05ec:
            return r0
        L_0x05ed:
            r12 = 0
            java.lang.String r0 = "getUnReadCount()"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r0)
            if (r10 == 0) goto L_0x069e
            int r0 = r10.length
            if (r0 > 0) goto L_0x05fa
            goto L_0x069e
        L_0x05fa:
            android.database.MatrixCursor r1 = new android.database.MatrixCursor
            java.lang.String[] r0 = f269506u
            r1.<init>(r0)
            java.lang.String r0 = "*"
            r2 = r10[r12]     // Catch:{ Exception -> 0x0689 }
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x0689 }
            if (r0 == 0) goto L_0x0628
            eb0.c r0 = eb0.C97625j3.m125812b()     // Catch:{ Exception -> 0x0689 }
            com.tencent.mm.storage.v3 r0 = r0.mo105908w()     // Catch:{ Exception -> 0x0689 }
            com.tencent.mm.storage.i2 r0 = (com.tencent.p014mm.storage.C44660i2) r0     // Catch:{ Exception -> 0x0689 }
            int r0 = r0.mo69749U(r13)     // Catch:{ Exception -> 0x0689 }
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0689 }
            r2[r12] = r6     // Catch:{ Exception -> 0x0689 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0689 }
            r2[r14] = r0     // Catch:{ Exception -> 0x0689 }
            r1.addRow(r2)     // Catch:{ Exception -> 0x0689 }
            goto L_0x0684
        L_0x0628:
            r5 = 0
        L_0x0629:
            int r0 = r10.length     // Catch:{ Exception -> 0x0689 }
            if (r5 >= r0) goto L_0x0684
            r0 = r10[r5]     // Catch:{ Exception -> 0x0689 }
            long r2 = com.tencent.p014mm.plugin.ext.key.AESUtil.m105052a(r0)     // Catch:{ Exception -> 0x0689 }
            eb0.c r0 = eb0.C97625j3.m125812b()     // Catch:{ Exception -> 0x0689 }
            com.tencent.mm.storage.u3 r0 = r0.mo105907v()     // Catch:{ Exception -> 0x0689 }
            com.tencent.mm.storage.z1 r0 = r0.mo69694e4(r2)     // Catch:{ Exception -> 0x0689 }
            if (r0 == 0) goto L_0x0680
            long r6 = r0.f108320R1     // Catch:{ Exception -> 0x0689 }
            int r4 = (int) r6     // Catch:{ Exception -> 0x0689 }
            if (r4 <= 0) goto L_0x0680
            eb0.c r4 = eb0.C97625j3.m125812b()     // Catch:{ Exception -> 0x0689 }
            com.tencent.mm.storage.v3 r4 = r4.mo105908w()     // Catch:{ Exception -> 0x0689 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0689 }
            r6.<init>()     // Catch:{ Exception -> 0x0689 }
            java.lang.String r7 = " and ( rconversation.username='"
            r6.append(r7)     // Catch:{ Exception -> 0x0689 }
            java.lang.String r0 = r0.getUsername()     // Catch:{ Exception -> 0x0689 }
            r6.append(r0)     // Catch:{ Exception -> 0x0689 }
            java.lang.String r0 = "' );"
            r6.append(r0)     // Catch:{ Exception -> 0x0689 }
            java.lang.String r0 = r6.toString()     // Catch:{ Exception -> 0x0689 }
            com.tencent.mm.storage.i2 r4 = (com.tencent.p014mm.storage.C44660i2) r4     // Catch:{ Exception -> 0x0689 }
            int r0 = r4.mo69749U(r0)     // Catch:{ Exception -> 0x0689 }
            r4 = 2
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0689 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ Exception -> 0x0689 }
            r6[r12] = r2     // Catch:{ Exception -> 0x0689 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0689 }
            r6[r14] = r0     // Catch:{ Exception -> 0x0689 }
            r1.addRow(r6)     // Catch:{ Exception -> 0x0689 }
            goto L_0x0681
        L_0x0680:
            r4 = 2
        L_0x0681:
            int r5 = r5 + 1
            goto L_0x0629
        L_0x0684:
            r9.mo128176i(r12)     // Catch:{ Exception -> 0x0689 }
            r13 = r1
            goto L_0x06a5
        L_0x0689:
            r0 = move-exception
            java.lang.String r2 = r0.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r2)
            java.lang.Object[] r2 = new java.lang.Object[r12]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r0, r13, r2)
            r1.close()
            r1 = 4
            r9.mo128176i(r1)
            goto L_0x06a4
        L_0x069e:
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r8)
            r9.mo128176i(r15)
        L_0x06a4:
            r13 = 0
        L_0x06a5:
            return r13
        L_0x06a6:
            r12 = 0
            java.lang.String r0 = "getOneMsg()"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r0)
            if (r10 == 0) goto L_0x073d
            int r0 = r10.length
            if (r0 > 0) goto L_0x06b3
            goto L_0x073d
        L_0x06b3:
            r0 = r10[r12]     // Catch:{ Exception -> 0x0725 }
            long r3 = com.tencent.p014mm.plugin.ext.key.AESUtil.m105052a(r0)     // Catch:{ Exception -> 0x0725 }
            eb0.c r0 = eb0.C97625j3.m125812b()     // Catch:{ Exception -> 0x0725 }
            g62.l r0 = r0.mo105911z()     // Catch:{ Exception -> 0x0725 }
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0     // Catch:{ Exception -> 0x0725 }
            com.tencent.mm.storage.f4 r3 = r0.b00(r3)     // Catch:{ Exception -> 0x0725 }
            eb0.c r0 = eb0.C97625j3.m125812b()     // Catch:{ Exception -> 0x0725 }
            com.tencent.mm.storage.u3 r0 = r0.mo105907v()     // Catch:{ Exception -> 0x0725 }
            java.lang.String r4 = r3.mo108768t()     // Catch:{ Exception -> 0x0725 }
            com.tencent.mm.storage.z1 r4 = r0.get(r4)     // Catch:{ Exception -> 0x0725 }
            if (r4 == 0) goto L_0x0721
            long r5 = r4.f108320R1     // Catch:{ Exception -> 0x0725 }
            int r0 = (int) r5     // Catch:{ Exception -> 0x0725 }
            if (r0 > 0) goto L_0x06df
            goto L_0x0721
        L_0x06df:
            java.lang.String r0 = r4.mo62898f()     // Catch:{ Exception -> 0x0725 }
            java.lang.String r5 = r4.getUsername()     // Catch:{ Exception -> 0x0725 }
            boolean r5 = com.tencent.p014mm.storage.C72996z1.m85820U5(r5)     // Catch:{ Exception -> 0x0725 }
            if (r5 == 0) goto L_0x06fe
            di3.d r0 = di3.C86312j.m106911c(r1)     // Catch:{ Exception -> 0x0725 }
            d62.i r0 = (d62.C75339i) r0     // Catch:{ Exception -> 0x0725 }
            java.lang.String r1 = r4.getUsername()     // Catch:{ Exception -> 0x0725 }
            java.lang.String r0 = r0.getDisplayName(r1)     // Catch:{ Exception -> 0x0725 }
            r6 = r0
            r5 = 1
            goto L_0x0700
        L_0x06fe:
            r6 = r0
            r5 = 0
        L_0x0700:
            if (r2 == 0) goto L_0x070a
            boolean r0 = r2.equalsIgnoreCase(r7)     // Catch:{ Exception -> 0x0725 }
            if (r0 == 0) goto L_0x070a
            r7 = 1
            goto L_0x070b
        L_0x070a:
            r7 = 0
        L_0x070b:
            android.database.MatrixCursor r14 = new android.database.MatrixCursor     // Catch:{ Exception -> 0x0725 }
            java.lang.String[] r0 = f269505t     // Catch:{ Exception -> 0x0725 }
            r14.<init>(r0)     // Catch:{ Exception -> 0x0725 }
            r8 = r10[r12]     // Catch:{ Exception -> 0x071f }
            r1 = r23
            r2 = r14
            r1.mo128180l(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x071f }
            r9.mo128176i(r12)     // Catch:{ Exception -> 0x071f }
            r13 = r14
            goto L_0x0744
        L_0x071f:
            r0 = move-exception
            goto L_0x0727
        L_0x0721:
            r9.mo128176i(r15)     // Catch:{ Exception -> 0x0725 }
            goto L_0x0743
        L_0x0725:
            r0 = move-exception
            r14 = 0
        L_0x0727:
            java.lang.String r1 = r0.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r1)
            java.lang.Object[] r1 = new java.lang.Object[r12]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r0, r13, r1)
            if (r14 == 0) goto L_0x0738
            r14.close()
        L_0x0738:
            r1 = 4
            r9.mo128176i(r1)
            goto L_0x0743
        L_0x073d:
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r8)
            r9.mo128176i(r15)
        L_0x0743:
            r13 = 0
        L_0x0744:
            return r13
        L_0x0745:
            r1 = r13
            r9.mo128176i(r15)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.ext.provider.ExtControlProviderMsg.query(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String):android.database.Cursor");
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public ExtControlProviderMsg(String[] strArr, int i, Context context) {
        this.f269512o = null;
        this.f269513p = true;
        this.f269514q = strArr;
        this.f269515r = i;
        this.f269516s = context;
    }
}
