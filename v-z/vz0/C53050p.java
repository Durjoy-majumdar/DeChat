package vz0;

import com.tencent.p014mm.sdk.platformtools.Log;
import dz0.C20483c;
import te3.C22498fy;

/* renamed from: vz0.p */
public class C53050p extends C22819h {
    /* renamed from: g */
    public C22818f0 mo35961g() {
        return new C53045g(this, this.f65605b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:?, code lost:
        return "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
        return "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e8, code lost:
        if (r13 == null) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0103, code lost:
        if (r15 != null) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0105, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.CardDynamicQrcodeOfflineMgr", "get code is failure! db is  empty! doNetSceneGetDynamicQrcode! cardId= %s", r4.getCardId());
        r2.mo71390g(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0118, code lost:
        r0 = hz0.C46153l0.Ex0().mo58993qq(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0120, code lost:
        if (r0 == null) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x012c, code lost:
        if (hz0.C46153l0.Ex0().mo58992jo(r8, r0.field_code_id) == false) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x012e, code lost:
        r2.mo71387d(r8, r0.field_code_id, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0133, code lost:
        r2.f124014f = 0;
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.CardDynamicQrcodeOfflineMgr", "update current code showing! newQrCodeData cardId= %s,codeId=%s，refreshReason=%d", r8, r15.field_code_id, java.lang.Integer.valueOf(r1.f148589d));
        r1 = r4.getCardId();
        r0 = r15.field_code;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0156, code lost:
        if (r0 == null) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x015c, code lost:
        if (r0.length() > 0) goto L_0x015f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x015f, code lost:
        r9 = f40.C86709a0.m107523b().mo121110g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r0 = wz0.C118792g.m167486b("CbW9HMPiil38ldOjZp5WkwlIfzvLwiX6_" + r9 + "_" + r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0185, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0186, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace("MicroMsg.CardDymanicQrcodeOfflineHelper", r0, "", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x018c, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x018d, code lost:
        r1 = hz0.C46153l0.Dx0().mo58987jo(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0195, code lost:
        if (r1 == null) goto L_0x0205;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01a9, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.CardDynamicQrcodeOfflineMgr", "getCodeData is need insert show timestamp! code signTimestamp!");
        r1 = r1.field_show_timestamp_encrypt_key;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01b0, code lost:
        if (r0 == null) goto L_0x0200;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01b9, code lost:
        r9 = java.lang.System.currentTimeMillis() / 1000;
        r12 = new java.lang.StringBuilder();
        r13 = new java.lang.StringBuilder();
        r12.append(r0);
        r12.append("&");
        r12.append(r9);
        r12.append("&");
        r12.append(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        r1 = wz0.C118792g.m167485a(r12.toString(), r1);
        r13.append(r0);
        r13.append("&");
        r13.append(r9);
        r13.append("&");
        r13.append(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01f3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01f4, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace("MicroMsg.CardDymanicQrcodeOfflineHelper", r0, "", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01f9, code lost:
        r16 = r13.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0200, code lost:
        r16 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0202, code lost:
        r0 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0205, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.CardDynamicQrcodeOfflineMgr", "getCodeData only decrypt qrcode!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x020e, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r0) != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0210, code lost:
        r2.mo71393j(1, "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0216, code lost:
        r15.field_status = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0229, code lost:
        if (hz0.C46153l0.Ex0().update(r15, "card_id", "code_id") == false) goto L_0x022b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x022b, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105921e("MicroMsg.CardQrCodeDataInfoStorage", "update qrCodeData  failure! card_id = %s, code_id = %s ,status = %d", r15.field_card_id, r15.field_code_id, java.lang.Integer.valueOf(r15.field_status));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0246, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.CardQrCodeDataInfoStorage", "update qrCodeData  success! card_id = %s, code_id = %s ,status = %d", r15.field_card_id, r15.field_code_id, java.lang.Integer.valueOf(r15.field_status));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0260, code lost:
        r1 = hz0.C46153l0.zx0();
        r2 = r4.getCardId();
        r1.getClass();
        r2 = hz0.C46153l0.Dx0().mo58987jo(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0273, code lost:
        if (r2 == null) goto L_0x0275;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0275, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.CardDynamicQrcodeOfflineMgr", "startRequestCodeTimer failure! CardQrCodeConfi is null!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x027c, code lost:
        r4 = (long) (r2.field_show_expire_interval * 1000);
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.CardDynamicQrcodeOfflineMgr", "startRefreshCodeTimer refreshTime: " + r4);
        r1.f124015g.startTimer(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:?, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a1  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo35962h(wz0.C53247c r19) {
        /*
            r18 = this;
            r1 = r19
            java.lang.String r0 = "MicroMsg.CarDynamicCodeView"
            java.lang.String r2 = "code from dynamic offline"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            gz0.h r2 = hz0.C46153l0.zx0()
            r3 = r18
            dz0.c r4 = r3.f65607d
            wz0.r r5 = wz0.C53267r.EN_DYNAMIC_CODE_SCENE_ENTER_CARD_DETAIL
            java.lang.String r6 = ""
            java.lang.String r7 = "MicroMsg.CardDynamicQrcodeOfflineMgr"
            if (r4 != 0) goto L_0x0023
            r2.getClass()
            java.lang.String r0 = "get code is failure! cardInfo is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)
            goto L_0x029c
        L_0x0023:
            r2.mo71395l()
            r2.f124013e = r1
            java.lang.String r8 = r4.getCardId()
            hz0.k r0 = hz0.C46153l0.Ex0()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r0.f90009d
            r9 = 1
            java.lang.String[] r10 = new java.lang.String[r9]
            r11 = 0
            r10[r11] = r8
            java.lang.String r12 = "select count(1) from CardQrCodeDataInfo where card_id =? AND status=0"
            android.database.Cursor r0 = r0.rawQuery(r12, r10)
            if (r0 == 0) goto L_0x004c
            r0.moveToFirst()
            int r10 = r0.getInt(r11)
            r0.close()
            goto L_0x004d
        L_0x004c:
            r10 = 0
        L_0x004d:
            r12 = 2
            if (r10 != 0) goto L_0x0056
            java.lang.String r0 = "can not getFrom db！db is empty!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)
            goto L_0x0092
        L_0x0056:
            hz0.i r0 = hz0.C46153l0.Dx0()
            hz0.h r0 = r0.mo58987jo(r8)
            if (r0 == 0) goto L_0x0094
            boolean r13 = r2.mo71392i(r0)
            if (r13 == 0) goto L_0x006b
            wz0.c r0 = wz0.C53247c.CARDCODEREFRESHACTION_UNSHOWN_TIMEOUT
            r2.f124013e = r0
            goto L_0x0092
        L_0x006b:
            int r13 = r0.field_lower_bound
            if (r10 >= r13) goto L_0x0094
            android.content.Context r13 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r13 = wz0.C22945n.m27024x(r13)
            if (r13 == 0) goto L_0x0094
            java.lang.Object[] r13 = new java.lang.Object[r12]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r13[r11] = r10
            int r0 = r0.field_lower_bound
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r13[r9] = r0
            java.lang.String r0 = "can not getFrom db！ currentCodeSize < lower_bound,currentCodeSize =%d,lower_bound=%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r0, r13)
            wz0.c r0 = wz0.C53247c.CARDCODEREFRESHACTION_UPDATECHANGE
            r2.f124013e = r0
        L_0x0092:
            r0 = 0
            goto L_0x0095
        L_0x0094:
            r0 = 1
        L_0x0095:
            if (r0 != 0) goto L_0x00a1
            java.lang.String r0 = "can not getFrom db！ request doNetSceneGetDynamicQrcode!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            r2.mo71390g(r4, r5)
            goto L_0x029c
        L_0x00a1:
            hz0.k r0 = hz0.C46153l0.Ex0()
            java.lang.String r10 = r4.getCardId()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r0.f90009d
            java.lang.String[] r13 = new java.lang.String[r9]
            r13[r11] = r10
            java.lang.String r14 = "select * from CardQrCodeDataInfo where card_id =? AND status=0  limit 1"
            android.database.Cursor r13 = r0.rawQuery(r14, r13)
            java.lang.String r14 = "MicroMsg.CardQrCodeDataInfoStorage"
            if (r13 == 0) goto L_0x00dd
            int r0 = r13.getCount()     // Catch:{ Exception -> 0x00ee }
            if (r0 <= 0) goto L_0x00dd
            r13.moveToPosition(r11)     // Catch:{ Exception -> 0x00ee }
            hz0.j r15 = new hz0.j     // Catch:{ Exception -> 0x00ee }
            r15.<init>()     // Catch:{ Exception -> 0x00ee }
            r15.convertFrom(r13)     // Catch:{ Exception -> 0x00db }
            java.lang.String r0 = "getOneCardQrcodeByCardId  success! card_id = %s, code_id = %s "
            java.lang.Object[] r9 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x00db }
            r9[r11] = r10     // Catch:{ Exception -> 0x00db }
            java.lang.String r10 = r15.field_code_id     // Catch:{ Exception -> 0x00db }
            r17 = 1
            r9[r17] = r10     // Catch:{ Exception -> 0x00db }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r0, r9)     // Catch:{ Exception -> 0x00db }
            goto L_0x00e8
        L_0x00db:
            r0 = move-exception
            goto L_0x00f0
        L_0x00dd:
            java.lang.String r0 = "getOneCardQrcodeByCardId  is empty! card_id = %s"
            r9 = 1
            java.lang.Object[] r15 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x00ee }
            r15[r11] = r10     // Catch:{ Exception -> 0x00ee }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r14, r0, r15)     // Catch:{ Exception -> 0x00ee }
            r15 = 0
        L_0x00e8:
            if (r13 == 0) goto L_0x0103
            goto L_0x0100
        L_0x00eb:
            r0 = move-exception
            goto L_0x029d
        L_0x00ee:
            r0 = move-exception
            r15 = 0
        L_0x00f0:
            java.lang.String r9 = "getOneCardQrcodeByCardId error!"
            r10 = 1
            java.lang.Object[] r12 = new java.lang.Object[r10]     // Catch:{ all -> 0x00eb }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x00eb }
            r12[r11] = r0     // Catch:{ all -> 0x00eb }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r14, r9, r12)     // Catch:{ all -> 0x00eb }
            if (r13 == 0) goto L_0x0103
        L_0x0100:
            r13.close()
        L_0x0103:
            if (r15 != 0) goto L_0x0118
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.String r1 = r4.getCardId()
            r0[r11] = r1
            java.lang.String r1 = "get code is failure! db is  empty! doNetSceneGetDynamicQrcode! cardId= %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r1, r0)
            r2.mo71390g(r4, r5)
            goto L_0x029c
        L_0x0118:
            hz0.k r0 = hz0.C46153l0.Ex0()
            hz0.j r0 = r0.mo58993qq(r8)
            if (r0 == 0) goto L_0x0133
            hz0.k r5 = hz0.C46153l0.Ex0()
            java.lang.String r9 = r0.field_code_id
            boolean r5 = r5.mo58992jo(r8, r9)
            if (r5 == 0) goto L_0x0133
            java.lang.String r0 = r0.field_code_id
            r2.mo71387d(r8, r0, r1)
        L_0x0133:
            r2.f124014f = r11
            r5 = 3
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r11] = r8
            java.lang.String r8 = r15.field_code_id
            r9 = 1
            r0[r9] = r8
            int r1 = r1.f148589d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r8 = 2
            r0[r8] = r1
            java.lang.String r1 = "update current code showing! newQrCodeData cardId= %s,codeId=%s，refreshReason=%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r1, r0)
            java.lang.String r1 = r4.getCardId()
            java.lang.String r0 = r15.field_code
            java.lang.String r8 = "MicroMsg.CardDymanicQrcodeOfflineHelper"
            if (r0 == 0) goto L_0x018c
            int r9 = r0.length()
            if (r9 > 0) goto L_0x015f
            goto L_0x018c
        L_0x015f:
            f40.e r9 = f40.C86709a0.m107523b()
            int r9 = r9.mo121110g()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "CbW9HMPiil38ldOjZp5WkwlIfzvLwiX6_"
            r10.append(r12)
            r10.append(r9)
            java.lang.String r9 = "_"
            r10.append(r9)
            r10.append(r1)
            java.lang.String r9 = r10.toString()
            java.lang.String r0 = wz0.C118792g.m167486b(r9, r0)     // Catch:{ Exception -> 0x0185 }
            goto L_0x018d
        L_0x0185:
            r0 = move-exception
            r9 = r0
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r9, r6, r0)
        L_0x018c:
            r0 = 0
        L_0x018d:
            hz0.i r9 = hz0.C46153l0.Dx0()
            hz0.h r1 = r9.mo58987jo(r1)
            if (r1 == 0) goto L_0x0205
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r9 != 0) goto L_0x0205
            boolean r9 = r1.field_need_insert_show_timestamp
            if (r9 == 0) goto L_0x0205
            java.lang.String r9 = r1.field_show_timestamp_encrypt_key
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 != 0) goto L_0x0205
            java.lang.String r9 = "getCodeData is need insert show timestamp! code signTimestamp!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r9)
            java.lang.String r1 = r1.field_show_timestamp_encrypt_key
            if (r0 == 0) goto L_0x0200
            int r9 = r0.length()
            if (r9 > 0) goto L_0x01b9
            goto L_0x0200
        L_0x01b9:
            long r9 = java.lang.System.currentTimeMillis()
            r12 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 / r12
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r12.append(r0)
            java.lang.String r5 = "&"
            r12.append(r5)
            r12.append(r9)
            r12.append(r5)
            r12.append(r1)
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x01f3 }
            java.lang.String r1 = wz0.C118792g.m167485a(r12, r1)     // Catch:{ Exception -> 0x01f3 }
            r13.append(r0)     // Catch:{ Exception -> 0x01f3 }
            r13.append(r5)     // Catch:{ Exception -> 0x01f3 }
            r13.append(r9)     // Catch:{ Exception -> 0x01f3 }
            r13.append(r5)     // Catch:{ Exception -> 0x01f3 }
            r13.append(r1)     // Catch:{ Exception -> 0x01f3 }
            goto L_0x01f9
        L_0x01f3:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r11]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r6, r1)
        L_0x01f9:
            java.lang.String r0 = r13.toString()
            r16 = r0
            goto L_0x0202
        L_0x0200:
            r16 = 0
        L_0x0202:
            r0 = r16
            goto L_0x020a
        L_0x0205:
            java.lang.String r1 = "getCodeData only decrypt qrcode!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
        L_0x020a:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 == 0) goto L_0x0216
            r1 = 1
            r2.mo71393j(r1, r6)
            goto L_0x029c
        L_0x0216:
            r1 = 1
            r15.field_status = r1
            hz0.k r2 = hz0.C46153l0.Ex0()
            java.lang.String r5 = "card_id"
            java.lang.String r6 = "code_id"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6}
            boolean r2 = r2.update(r15, (java.lang.String[]) r5)
            if (r2 != 0) goto L_0x0246
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r5 = r15.field_card_id
            r2[r11] = r5
            java.lang.String r5 = r15.field_code_id
            r2[r1] = r5
            int r1 = r15.field_status
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5 = 2
            r2[r5] = r1
            java.lang.String r1 = "update qrCodeData  failure! card_id = %s, code_id = %s ,status = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r14, r1, r2)
            goto L_0x0260
        L_0x0246:
            r2 = 3
            r5 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r6 = r15.field_card_id
            r2[r11] = r6
            java.lang.String r6 = r15.field_code_id
            r2[r1] = r6
            int r1 = r15.field_status
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2[r5] = r1
            java.lang.String r1 = "update qrCodeData  success! card_id = %s, code_id = %s ,status = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r1, r2)
        L_0x0260:
            gz0.h r1 = hz0.C46153l0.zx0()
            java.lang.String r2 = r4.getCardId()
            r1.getClass()
            hz0.i r4 = hz0.C46153l0.Dx0()
            hz0.h r2 = r4.mo58987jo(r2)
            if (r2 != 0) goto L_0x027c
            java.lang.String r1 = "startRequestCodeTimer failure! CardQrCodeConfi is null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r1)
            goto L_0x029b
        L_0x027c:
            int r2 = r2.field_show_expire_interval
            int r2 = r2 * 1000
            long r4 = (long) r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "startRefreshCodeTimer refreshTime: "
            r2.append(r6)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
            com.tencent.mm.sdk.platformtools.MTimerHandler r1 = r1.f124015g
            r1.startTimer(r4)
        L_0x029b:
            r6 = r0
        L_0x029c:
            return r6
        L_0x029d:
            if (r13 == 0) goto L_0x02a2
            r13.close()
        L_0x02a2:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vz0.C53050p.mo35962h(wz0.c):java.lang.String");
    }

    /* renamed from: i */
    public C22818f0 mo35963i() {
        return new C53059x(this, this.f65605b);
    }

    /* renamed from: j */
    public C22818f0 mo35964j() {
        return new C53051q(this, this.f65605b);
    }

    /* renamed from: k */
    public boolean mo35965k(C20483c cVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        C20483c cVar2 = this.f65607d;
        if (cVar2 == null) {
            Log.m105924i("MicroMsg.CarDynamicCodeView", "isNeedUpdateViewAgain mCardInfo is null！");
            return true;
        } else if (cVar == null) {
            Log.m105924i("MicroMsg.CarDynamicCodeView", "isNeedUpdateViewAgain false  newCardInfo null！");
            return false;
        } else if (cVar2.mo23263J0().f63938E != cVar.mo23263J0().f63938E) {
            Log.m105924i("MicroMsg.CarDynamicCodeView", "isNeedUpdateViewAgain is_commom_card is different！");
            return true;
        } else {
            C22498fy fyVar = this.f65607d.mo23263J0().f63937D;
            C22498fy fyVar2 = cVar.mo23263J0().f63937D;
            if ((fyVar == null && fyVar2 != null) || (fyVar != null && fyVar2 == null)) {
                Log.m105924i("MicroMsg.CarDynamicCodeView", "isNeedUpdateViewAgain unavailable_qrcode_field is different！");
                return true;
            } else if (fyVar == null || fyVar2 == null || (str5 = fyVar.f63884d) == null || (str6 = fyVar2.f63884d) == null || !str5.equals(str6)) {
                C22498fy fyVar3 = this.f65607d.mo23264L0().f64135Z;
                C22498fy fyVar4 = cVar.mo23264L0().f64135Z;
                if ((fyVar3 == null && fyVar4 != null) || (fyVar3 != null && fyVar4 == null)) {
                    Log.m105924i("MicroMsg.CarDynamicCodeView", "isNeedUpdateViewAgain pay_and_qrcode_field  is diffrent！");
                    return true;
                } else if (fyVar3 != null && fyVar4 != null && (str3 = fyVar3.f63884d) != null && (str4 = fyVar4.f63884d) != null && !str3.equals(str4)) {
                    Log.m105924i("MicroMsg.CarDynamicCodeView", "isNeedUpdateViewAgain pay_and_qrcode_field title is diffrent！");
                    return true;
                } else if (fyVar3 == null || fyVar4 == null || (str = fyVar3.f63886f) == null || (str2 = fyVar4.f63886f) == null || str.equals(str2)) {
                    return false;
                } else {
                    Log.m105924i("MicroMsg.CarDynamicCodeView", "isNeedUpdateViewAgain pay_and_qrcode_field aux_title  is diffrent！");
                    return true;
                }
            } else {
                Log.m105924i("MicroMsg.CarDynamicCodeView", "isNeedUpdateViewAgain unavailable_qrcode_field title is different！");
                return true;
            }
        }
    }
}
