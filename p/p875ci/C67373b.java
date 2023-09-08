package p875ci;

/* renamed from: ci.b */
public class C67373b {

    /* renamed from: a */
    public int f193233a = 0;

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0160  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo91511a(android.content.Context r18, boolean r19, boolean r20, android.app.Notification r21, java.lang.String r22) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r21
            r3 = 26
            boolean r3 = p206nj.C11171e.m11046c(r3)
            java.lang.String r4 = "begin initDefaults, isNeedSound: %B, isNeedShake: %B, n.defaults: %d, n.vibrate: %s, n.sound: %s"
            java.lang.String r5 = "MicroMsg.NotificationDefaults"
            r6 = 3
            java.lang.String r7 = "audio"
            r8 = 5
            r9 = 4
            r10 = 2
            r11 = 1
            r12 = 0
            if (r3 == 0) goto L_0x00ae
            if (r2 != 0) goto L_0x0021
            android.app.Notification r2 = new android.app.Notification
            r2.<init>()
        L_0x0021:
            java.lang.Object[] r3 = new java.lang.Object[r8]
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r19)
            r3[r12] = r8
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r20)
            r3[r11] = r8
            int r8 = r2.defaults
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r3[r10] = r8
            long[] r8 = r2.vibrate
            java.lang.String r8 = p875ci.C67378t.m79736a(r8)
            r3[r6] = r8
            android.net.Uri r8 = r2.sound
            r3[r9] = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r4, r3)
            if (r20 == 0) goto L_0x004c
            long[] r3 = com.tencent.p014mm.sdk.platformtools.Util.VIRBRATOR_PATTERN
            r2.vibrate = r3
        L_0x004c:
            if (r19 == 0) goto L_0x0091
            android.util.Pair r3 = p645pj.C77091b.m93038t()
            java.lang.Object r4 = r3.second
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r7 = r1.getSystemService(r7)
            android.media.AudioManager r7 = (android.media.AudioManager) r7
            if (r7 != 0) goto L_0x0060
            r7 = 0
            goto L_0x0064
        L_0x0060:
            boolean r7 = r7.isWiredHeadsetOn()
        L_0x0064:
            if (r7 == 0) goto L_0x006a
            r1 = 0
            r2.sound = r1
            goto L_0x0091
        L_0x006a:
            if (r4 == 0) goto L_0x008f
            java.lang.Object r7 = r3.first
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x0088
            java.io.File r4 = new java.io.File
            java.lang.Object r3 = r3.second
            java.lang.String r3 = (java.lang.String) r3
            r4.<init>(r3)
            com.tencent.mm.vfs.m1 r3 = com.tencent.p014mm.vfs.C86009m1.m106378c(r4)
            android.net.Uri r1 = com.tencent.p014mm.sdk.platformtools.FileProviderHelper.getUriForFile(r1, r3)
            goto L_0x008c
        L_0x0088:
            android.net.Uri r1 = android.net.Uri.parse(r4)
        L_0x008c:
            r2.sound = r1
            goto L_0x0091
        L_0x008f:
            r1 = 1
            goto L_0x0092
        L_0x0091:
            r1 = 0
        L_0x0092:
            java.lang.Object[] r3 = new java.lang.Object[r6]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r3[r12] = r4
            long[] r4 = r2.vibrate
            java.lang.String r4 = p875ci.C67378t.m79736a(r4)
            r3[r11] = r4
            android.net.Uri r2 = r2.sound
            r3[r10] = r2
            java.lang.String r2 = "end initDefaults, defaults: %d, n.vibrate: %s, n.sound: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r2, r3)
            r0.f193233a = r1
            return r1
        L_0x00ae:
            java.lang.Object[] r3 = new java.lang.Object[r8]
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r19)
            r3[r12] = r13
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r20)
            r3[r11] = r13
            int r13 = r2.defaults
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r3[r10] = r13
            long[] r13 = r2.vibrate
            r3[r6] = r13
            android.net.Uri r13 = r2.sound
            r3[r9] = r13
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r4, r3)
            if (r19 == 0) goto L_0x00e6
            java.lang.Object r3 = r1.getSystemService(r7)
            android.media.AudioManager r3 = (android.media.AudioManager) r3
            if (r3 != 0) goto L_0x00db
            r3 = 0
            goto L_0x00df
        L_0x00db:
            boolean r3 = r3.isWiredHeadsetOn()
        L_0x00df:
            if (r3 == 0) goto L_0x00e4
            r3 = 0
            r4 = 1
            goto L_0x00e8
        L_0x00e4:
            r3 = 1
            goto L_0x00e7
        L_0x00e6:
            r3 = 0
        L_0x00e7:
            r4 = 0
        L_0x00e8:
            if (r20 == 0) goto L_0x00ec
            r3 = r3 | 2
        L_0x00ec:
            android.util.Pair r7 = p645pj.C77091b.m93038t()
            java.lang.Object r13 = r7.second
            java.lang.String r13 = (java.lang.String) r13
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r22)
            if (r14 == 0) goto L_0x00ff
            java.lang.String r14 = "msgContent is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r14)
        L_0x00ff:
            gj.m r14 = p156gj.C107835h0.f322856m
            int r14 = r14.f322912s
            if (r14 == r10) goto L_0x0107
            r14 = 1
            goto L_0x0108
        L_0x0107:
            r14 = 0
        L_0x0108:
            if (r14 == 0) goto L_0x0144
            r15 = r3 & 2
            if (r15 <= 0) goto L_0x0110
            r15 = 1
            goto L_0x0111
        L_0x0110:
            r15 = 0
        L_0x0111:
            if (r15 == 0) goto L_0x011a
            r3 = r3 & -3
            com.tencent.p014mm.sdk.platformtools.Util.shake(r1, r11)
            r15 = 1
            goto L_0x011b
        L_0x011a:
            r15 = 0
        L_0x011b:
            r16 = r3 & 1
            if (r16 <= 0) goto L_0x0122
            r16 = 1
            goto L_0x0124
        L_0x0122:
            r16 = 0
        L_0x0124:
            if (r16 == 0) goto L_0x0142
            if (r4 != 0) goto L_0x0142
            r3 = r3 & -2
            boolean r16 = p875ci.C113348f.C67377c.f193241c
            if (r16 == 0) goto L_0x0131
            ci.f r16 = p875ci.C113348f.C67377c.f193240b
            goto L_0x0133
        L_0x0131:
            ci.f r16 = p875ci.C113348f.C67377c.f193239a
        L_0x0133:
            r8 = r16
            java.lang.Object r9 = r7.first
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            r8.mo165898a(r13, r12, r9)
            r8 = 1
            goto L_0x0146
        L_0x0142:
            r8 = 0
            goto L_0x0146
        L_0x0144:
            r8 = 0
            r15 = 0
        L_0x0146:
            if (r4 == 0) goto L_0x0160
            r3 = r3 & -2
            boolean r1 = p875ci.C113348f.C67377c.f193241c
            if (r1 == 0) goto L_0x0151
            ci.f r1 = p875ci.C113348f.C67377c.f193240b
            goto L_0x0153
        L_0x0151:
            ci.f r1 = p875ci.C113348f.C67377c.f193239a
        L_0x0153:
            java.lang.Object r7 = r7.first
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r1.mo165898a(r13, r12, r7)
            r8 = 1
            goto L_0x018f
        L_0x0160:
            r9 = r3 & 1
            if (r9 <= 0) goto L_0x0166
            r9 = 1
            goto L_0x0167
        L_0x0166:
            r9 = 0
        L_0x0167:
            if (r9 == 0) goto L_0x018f
            if (r13 == 0) goto L_0x018f
            r3 = r3 & -2
            java.lang.Object r9 = r7.first
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x0189
            java.io.File r9 = new java.io.File
            java.lang.Object r7 = r7.second
            java.lang.String r7 = (java.lang.String) r7
            r9.<init>(r7)
            com.tencent.mm.vfs.m1 r7 = com.tencent.p014mm.vfs.C86009m1.m106378c(r9)
            android.net.Uri r1 = com.tencent.p014mm.sdk.platformtools.FileProviderHelper.getUriForFile(r1, r7)
            goto L_0x018d
        L_0x0189:
            android.net.Uri r1 = android.net.Uri.parse(r13)
        L_0x018d:
            r2.sound = r1
        L_0x018f:
            r0.f193233a = r3
            r1 = 8
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r3 = r2.defaults
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r12] = r3
            long[] r3 = r2.vibrate
            java.lang.String r3 = p875ci.C67378t.m79736a(r3)
            r1[r11] = r3
            android.net.Uri r2 = r2.sound
            r1[r10] = r2
            r1[r6] = r13
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            r3 = 4
            r1[r3] = r2
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r14)
            r3 = 5
            r1[r3] = r2
            r2 = 6
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r15)
            r1[r2] = r3
            r2 = 7
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r8)
            r1[r2] = r3
            java.lang.String r2 = "end initDefaults, n.defaults: %d, n.vibrate: %s, n.sound: %s, soundUri: %s, headset&Play: %B, SrvDeviceInfo.mCommonInfo.mmnotify is Enable: %B, isMMShake: %B, isMMPlaySound: %B"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r2, r1)
            int r1 = r0.f193233a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p875ci.C67373b.mo91511a(android.content.Context, boolean, boolean, android.app.Notification, java.lang.String):int");
    }
}
