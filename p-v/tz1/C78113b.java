package tz1;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86301e;
import di3.C86312j;
import eb0.C31543z5;
import ei3.C86522b;
import f62.C75698i0;
import sz1.C77815b;
import wz1.C78747b;
import xz1.C79013a;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: tz1.b */
public class C78113b extends C86301e implements C75698i0 {
    public boolean Mq0(String str) {
        return C72996z1.m85807K5(str);
    }

    /* renamed from: Nc */
    public void mo106019Nc(String str, String str2, String str3, String str4, long j, long j2) {
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        Log.m105925i("MicroMsg.groupsolitaire.GroupSolitaireService", "processGroupSolitatireMessage()1 fromUserName:%s toUserName:%s msgId:%s", str5, str6, Long.valueOf(j));
        if (BuildInfo.DEBUG) {
            Log.m105919d("MicroMsg.groupsolitaire.GroupSolitaireService", "processGroupSolitatireMessage() fromUserName:%s toUserName:%s title:%s xml:%s", str5, str6, str7, str8);
        }
        try {
            C79013a m = C78747b.m95113m(str5, str7, str8);
            C78747b.m95107g(str, str2, m, j, true);
            C78747b.m95096H(m, C78747b.m95089A(m, ((C77815b) C86312j.m106911c(C77815b.class)).xx0().mo108980Ow(str5, m.field_key, true), str6, 3), j, false, str2, true, false, j2);
            C78747b.m95100L(j, str6, m);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.groupsolitaire.GroupSolitaireService", "processGroupSolitatireMessage1() Exception:%s %s", e.getClass().getSimpleName(), e.getMessage());
        }
    }

    /* renamed from: Nm */
    public void mo106020Nm(String str, String str2, String str3, String str4, long j, long j2) {
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        Log.m105925i("MicroMsg.groupsolitaire.GroupSolitaireService", "processGroupSolitatireMessageByGetMsg()2 fromUserName:%s toUserName:%s msgId:%s", str5, str6, Long.valueOf(j));
        if (BuildInfo.DEBUG) {
            Log.m105919d("MicroMsg.groupsolitaire.GroupSolitaireService", "processGroupSolitatireMessageByGetMsg() fromUserName:%s toUserName:%s title:%s xml:%s", str5, str6, str7, str8);
        }
        try {
            C79013a m = C78747b.m95113m(str5, str7, str8);
            C78747b.m95107g(str, str2, m, j, true);
            C79013a Ow = ((C77815b) C86312j.m106911c(C77815b.class)).xx0().mo108980Ow(str5, m.field_key, true);
            if (Ow == null || Ow.field_lastActiveTime <= j2) {
                C78747b.m95096H(m, C78747b.m95089A(m, Ow, str6, 3), j, false, str2, true, true, j2);
                C78747b.m95100L(j, str6, m);
                return;
            }
            Log.m105925i("MicroMsg.groupsolitaire.GroupSolitaireService", "from getRoom % < %s", Long.valueOf(j2), Long.valueOf(Ow.field_lastActiveTime));
        } catch (Exception e) {
            Log.m105921e("MicroMsg.groupsolitaire.GroupSolitaireService", "processGroupSolitatireMessageByGetMsg() Exception:%s %s", e.getClass().getSimpleName(), e.getMessage());
        }
    }

    /* renamed from: Qq */
    public void mo106021Qq(String str, String str2, String str3, long j) {
        mo106022ax(str, str2, str3, j, (long) C31543z5.m39455e());
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007d A[Catch:{ Exception -> 0x00b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* renamed from: ax */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo106022ax(java.lang.String r17, java.lang.String r18, java.lang.String r19, long r20, long r22) {
        /*
            r16 = this;
            r7 = r17
            r11 = r18
            java.lang.Class<sz1.b> r8 = sz1.C77815b.class
            r1 = 3
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r12 = 0
            r0[r12] = r7
            r13 = 1
            r0[r13] = r11
            java.lang.Long r2 = java.lang.Long.valueOf(r20)
            r14 = 2
            r0[r14] = r2
            java.lang.String r15 = "MicroMsg.groupsolitaire.GroupSolitaireService"
            java.lang.String r2 = "processGroupSolitatireMessage()3 fromUserName:%s toUserName:%s msgId:%s "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r2, r0)
            java.lang.Class<z51.f> r0 = z51.C79305f.class
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ Exception -> 0x002e }
            z51.f r0 = (z51.C79305f) r0     // Catch:{ Exception -> 0x002e }
            r2 = r19
            java.lang.String r0 = r0.mo109308IF(r2)     // Catch:{ Exception -> 0x002c }
            goto L_0x0049
        L_0x002c:
            r0 = move-exception
            goto L_0x0031
        L_0x002e:
            r0 = move-exception
            r2 = r19
        L_0x0031:
            java.lang.Object[] r3 = new java.lang.Object[r14]
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r3[r12] = r4
            java.lang.String r0 = r0.getMessage()
            r3[r13] = r0
            java.lang.String r0 = "processGroupSolitatireMessage() emojiSoftBank2Unicode %s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r0, r3)
            r0 = r2
        L_0x0049:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r2 == 0) goto L_0x0061
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r12] = r7
            r2[r13] = r11
            java.lang.Long r3 = java.lang.Long.valueOf(r20)
            r2[r14] = r3
            r2[r1] = r0
            java.lang.String r1 = "processGroupSolitatireMessage() fromUserName:%s toUserName:%s msgId:%s content:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r15, r1, r2)
        L_0x0061:
            di3.d r1 = di3.C86312j.m106911c(r8)     // Catch:{ Exception -> 0x00b1 }
            sz1.b r1 = (sz1.C77815b) r1     // Catch:{ Exception -> 0x00b1 }
            wz1.c r1 = r1.vx0()     // Catch:{ Exception -> 0x00b1 }
            android.util.Pair r0 = r1.mo108672j(r0, r14, r7)     // Catch:{ Exception -> 0x00b1 }
            java.lang.Object r1 = r0.first     // Catch:{ Exception -> 0x00b1 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Exception -> 0x00b1 }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x00b1 }
            if (r1 <= 0) goto L_0x00c9
            java.lang.Object r0 = r0.second     // Catch:{ Exception -> 0x00b1 }
            if (r0 == 0) goto L_0x00c9
            xz1.a r0 = (xz1.C79013a) r0     // Catch:{ Exception -> 0x00b1 }
            r6 = 0
            r1 = r17
            r2 = r18
            r3 = r0
            r4 = r20
            wz1.C78747b.m95107g(r1, r2, r3, r4, r6)     // Catch:{ Exception -> 0x00b1 }
            di3.d r1 = di3.C86312j.m106911c(r8)     // Catch:{ Exception -> 0x00b1 }
            sz1.b r1 = (sz1.C77815b) r1     // Catch:{ Exception -> 0x00b1 }
            xz1.c r1 = r1.xx0()     // Catch:{ Exception -> 0x00b1 }
            java.lang.String r2 = r0.field_key     // Catch:{ Exception -> 0x00b1 }
            xz1.a r1 = r1.mo108980Ow(r7, r2, r13)     // Catch:{ Exception -> 0x00b1 }
            xz1.a r2 = wz1.C78747b.m95089A(r0, r1, r11, r13)     // Catch:{ Exception -> 0x00b1 }
            r5 = 1
            r7 = 0
            r8 = 0
            r1 = r0
            r3 = r20
            r6 = r18
            r9 = r22
            wz1.C78747b.m95096H(r1, r2, r3, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x00b1 }
            r1 = r20
            wz1.C78747b.m95100L(r1, r11, r0)     // Catch:{ Exception -> 0x00b1 }
            goto L_0x00c9
        L_0x00b1:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r14]
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r1[r12] = r2
            java.lang.String r0 = r0.getMessage()
            r1[r13] = r0
            java.lang.String r0 = "processGroupSolitatireMessage2() Exception:%s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r0, r1)
        L_0x00c9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tz1.C78113b.mo106022ax(java.lang.String, java.lang.String, java.lang.String, long, long):void");
    }

    public boolean bc0(String str) {
        return C72996z1.m85807K5(str);
    }
}
