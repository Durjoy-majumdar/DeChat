package wy2;

import androidx.lifecycle.C0125s;
import az2.C39674e;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72996z1;
import di3.C7335d;
import di3.C86312j;
import f62.C27049a1;
import g62.C75875l;
import gy3.C87412m;
import o40.C61926c;
import qy2.C47902u;
import rx3.C13604l;
import rz2.C48212k;
import ty0.C52389b;
import uy2.C37612h;
import uy2.C52657a;
import xy2.C53477h;
import z04.C112551y;

/* renamed from: wy2.i */
public final class C53245i extends C52389b<C37612h, C52657a> implements C27049a1 {
    public C53245i() {
        C61926c.m72656A((String) null, new C38398h(this));
    }

    /* renamed from: B */
    public Object mo70736B(String str) {
        C87412m.m108594g(str, "sessionId");
        return C39674e.f106452d.mo62238D().mo74248jo(str);
    }

    /* renamed from: O */
    public Object mo70738O(String str) {
        C87412m.m108594g(str, "sessionId");
        return C39674e.f106452d.mo62251j0().mo61999jo(str);
    }

    /* renamed from: Q */
    public void mo70739Q(String str) {
        C87412m.m108594g(str, "sessionId");
        C39674e eVar = C39674e.f106452d;
        C52657a jo = eVar.mo62238D().mo74248jo(str);
        Log.m105924i("MicroMsg.TextStatus.TextStatusConversationUpdater", "[onConversationMsgEmpty] " + jo.systemRowid);
        if (jo.systemRowid > 0) {
            jo.field_digest = "";
            eVar.mo62238D().update(jo.systemRowid, jo, false);
            eVar.mo62238D().doNotify(jo.field_sessionId, 1, jo);
        }
    }

    /* renamed from: S */
    public void mo70740S(Object obj) {
        C52657a aVar = (C52657a) obj;
        Class cls = C53477h.class;
        C87412m.m108594g(aVar, "conversation");
        boolean z = true;
        if (aVar.systemRowid <= 0) {
            C39674e eVar = C39674e.f106452d;
            boolean insertNotify = eVar.mo62238D().insertNotify(aVar, false);
            Log.m105918d("MicroMsg.TextStatus.TextStatusConversationUpdater", "saveConversationAndNotify() called with: isNew = true res = " + insertNotify);
            eVar.mo62238D().doNotify(aVar.field_sessionId, 2, aVar);
        } else {
            C39674e eVar2 = C39674e.f106452d;
            boolean update = eVar2.mo62238D().update(aVar.systemRowid, aVar, false);
            Log.m105918d("MicroMsg.TextStatus.TextStatusConversationUpdater", "saveConversationAndNotify() called with: isNew = false res = " + update);
            eVar2.mo62238D().doNotify(aVar.field_sessionId, 1, aVar);
        }
        C48212k wx02 = ((C53477h) C86312j.m106911c(cls)).wx0(aVar.field_sessionId);
        if (wx02 != null) {
            String str = wx02.field_nickname;
            if (!(str == null || C112551y.m153811k(str))) {
                String str2 = wx02.field_smallHeadImgUrl;
                if (str2 != null && !C112551y.m153811k(str2)) {
                    z = false;
                }
                if (!z) {
                    return;
                }
            }
        }
        C7335d c = C86312j.m106911c(cls);
        C87412m.m108593f(c, "getService(TextStatusContactService::class.java)");
        C53477h.vx0((C53477h) c, new C13604l(aVar.field_sessionId, aVar.field_talker), (C47902u.C36207b) null, (C0125s) null, false, 14, (Object) null);
    }

    /* renamed from: a2 */
    public void mo54205a2(C72963f4 f4Var, C72976h2 h2Var, boolean z, C75875l.C45886e eVar) {
        Log.m105918d("MicroMsg.TextStatus.TextStatusConversationUpdater", "afterConversationUpdate() called with: latestMsg = " + f4Var + ", conversation = " + h2Var + ", newCon = " + z + ", notifyInfo = " + eVar);
    }

    /* renamed from: d */
    public void mo70741d(Object obj, int i, C72963f4 f4Var) {
        C52657a aVar = (C52657a) obj;
        C87412m.m108594g(aVar, "conversation");
        C87412m.m108594g(f4Var, "latestMsg");
        Log.m105918d("MicroMsg.TextStatus.TextStatusConversationUpdater", "afterConvUpdate() called with: conversation = " + aVar + ", insertCount = " + i + ", latestMsg = " + f4Var);
    }

    /* renamed from: f0 */
    public boolean mo70742f0(String str) {
        C87412m.m108594g(str, "sessionId");
        return C72996z1.m85799F5(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ba  */
    /* renamed from: g0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo70743g0(java.lang.Object r18, java.lang.Object r19, com.tencent.p014mm.storage.C72963f4 r20, ty0.C52389b.C52390a r21, int r22, g62.C75875l.C45886e r23) {
        /*
            r17 = this;
            r0 = r21
            r1 = r22
            r2 = r18
            uy2.a r2 = (uy2.C52657a) r2
            r3 = r19
            uy2.h r3 = (uy2.C37612h) r3
            java.lang.String r4 = "conv"
            gy3.C87412m.m108594g(r2, r4)
            java.lang.String r4 = "sessionInfo"
            gy3.C87412m.m108594g(r3, r4)
            java.lang.String r4 = "lastMsgInfo"
            r5 = r20
            gy3.C87412m.m108594g(r5, r4)
            java.lang.String r4 = "digestData"
            gy3.C87412m.m108594g(r0, r4)
            java.lang.String r4 = "notifyInfo"
            r6 = r23
            gy3.C87412m.m108594g(r6, r4)
            java.lang.String r4 = r3.field_talker
            int r6 = r3.field_type
            int r7 = r3.field_actionPermission
            java.lang.String r8 = r3.field_senderUserName
            int r3 = r3.field_senderRoleType
            long r9 = r2.systemRowid
            r11 = 0
            r13 = 0
            r14 = 1
            int r15 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r15 > 0) goto L_0x003f
            r9 = 1
            goto L_0x0040
        L_0x003f:
            r9 = 0
        L_0x0040:
            int r10 = r2.field_unReadCount
            int r11 = r20.getType()
            r12 = 47
            if (r11 == r12) goto L_0x0059
            int r11 = r20.getType()
            r12 = 1048625(0x100031, float:1.469437E-39)
            if (r11 != r12) goto L_0x0054
            goto L_0x0059
        L_0x0054:
            com.tencent.mm.pointers.PString r11 = r0.f146445a
            java.lang.String r11 = r11.value
            goto L_0x0064
        L_0x0059:
            android.content.Context r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r12 = 2131821467(0x7f11039b, float:1.9275678E38)
            java.lang.String r11 = r11.getString(r12)
        L_0x0064:
            r2.field_digest = r11
            com.tencent.mm.pointers.PString r0 = r0.f146446b
            java.lang.String r0 = r0.value
            r2.field_digestUser = r0
            long r11 = r20.getCreateTime()
            r2.field_updateTime = r11
            int r0 = r20.getType()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.field_digestType = r0
            int r0 = r2.field_unReadCount
            int r0 = r0 + r1
            r2.field_unReadCount = r0
            long r11 = r2.field_lastMsgID
            long r15 = r20.getMsgId()
            int r0 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x00bc
            int r0 = r20.getType()
            r11 = 570425393(0x22000031, float:1.7347336E-18)
            if (r0 != r11) goto L_0x00b7
            java.lang.String r0 = r20.getContent()     // Catch:{ all -> 0x00b6 }
            java.lang.String r11 = "reddot"
            r12 = 0
            java.util.Map r0 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r0, r11, r12)     // Catch:{ all -> 0x00b6 }
            java.lang.String r11 = ".reddot"
            java.lang.Object r0 = r0.get(r11)     // Catch:{ all -> 0x00b6 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x00b6 }
            if (r0 == 0) goto L_0x00b1
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x00b6 }
            if (r0 != r14) goto L_0x00b1
            r0 = 1
            goto L_0x00b2
        L_0x00b1:
            r0 = 0
        L_0x00b2:
            if (r0 == 0) goto L_0x00b7
            r0 = 1
            goto L_0x00b8
        L_0x00b6:
        L_0x00b7:
            r0 = 0
        L_0x00b8:
            if (r0 == 0) goto L_0x00bc
            r0 = 1
            goto L_0x00bd
        L_0x00bc:
            r0 = 0
        L_0x00bd:
            r2.field_isRedDot = r0
            if (r1 > 0) goto L_0x00c3
            if (r0 != r14) goto L_0x00c8
        L_0x00c3:
            az2.e r0 = az2.C39674e.f106452d
            r0.mo62250h1()
        L_0x00c8:
            long r11 = r20.getMsgId()
            r2.field_lastMsgID = r11
            int r0 = r20.mo108769t2()
            r2.field_isSend = r0
            int r0 = r20.getStatus()
            r2.field_status = r0
            r2.field_talker = r4
            r2.field_type = r6
            r2.field_actionPermission = r7
            r2.field_senderUserName = r8
            r2.field_senderRoleType = r3
            r2.field_readStatus = r13
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "[updateConversation] isNew="
            r0.append(r3)
            r0.append(r9)
            java.lang.String r3 = " beforeUnreadCount="
            r0.append(r3)
            r0.append(r10)
            java.lang.String r3 = " insertCount="
            r0.append(r3)
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "sessionId="
            r1.append(r3)
            java.lang.String r3 = r2.field_sessionId
            r1.append(r3)
            java.lang.String r3 = " unReadCount="
            r1.append(r3)
            int r4 = r2.field_unReadCount
            r1.append(r4)
            java.lang.String r4 = " updateTime="
            r1.append(r4)
            long r4 = r2.field_updateTime
            r1.append(r4)
            java.lang.String r4 = " digest="
            r1.append(r4)
            java.lang.String r4 = r2.field_digest
            r1.append(r4)
            java.lang.String r4 = " lastMsgID="
            r1.append(r4)
            long r4 = r2.field_lastMsgID
            r1.append(r4)
            r1.append(r3)
            int r3 = r2.field_unReadCount
            r1.append(r3)
            java.lang.String r3 = " systemRowid="
            r1.append(r3)
            long r3 = r2.systemRowid
            r1.append(r3)
            java.lang.String r3 = " digestType="
            r1.append(r3)
            java.lang.String r3 = r2.field_digestType
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.TextStatus.TextStatusConversationUpdater"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: wy2.C53245i.mo70743g0(java.lang.Object, java.lang.Object, com.tencent.mm.storage.f4, ty0.b$a, int, g62.l$e):java.lang.Object");
    }

    /* renamed from: k3 */
    public void mo54206k3(C72963f4 f4Var, C72976h2 h2Var, boolean z, C75875l.C45886e eVar) {
        Log.m105918d("MicroMsg.TextStatus.TextStatusConversationUpdater", "assemble() called with: latestMsg = " + f4Var + ", conversation = " + h2Var + ", newCon = " + z + ", notifyInfo = " + eVar);
    }

    /* renamed from: q */
    public void mo70745q(Object obj, C72963f4 f4Var, C75875l.C45886e eVar) {
        C87412m.m108594g((C52657a) obj, "conversation");
        C87412m.m108594g(eVar, "notifyInfo");
    }
}
