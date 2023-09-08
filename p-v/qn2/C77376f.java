package qn2;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import rn2.C77542a;

/* renamed from: qn2.f */
public class C77376f {

    /* renamed from: a */
    public List<WeakReference<C77377a>> f225595a;

    /* renamed from: b */
    public String f225596b;

    /* renamed from: qn2.f$a */
    public interface C77377a {
        /* renamed from: P2 */
        void mo24636P2();
    }

    /* renamed from: qn2.f$b */
    public static class C77378b extends C77379c {

        /* renamed from: a */
        public int f225597a = 0;

        /* renamed from: b */
        public int f225598b = 0;

        /* renamed from: c */
        public String f225599c = "";

        /* renamed from: d */
        public int f225600d = 0;

        /* renamed from: e */
        public int f225601e = 0;

        /* renamed from: f */
        public int f225602f = 7;

        /* renamed from: g */
        public String f225603g = "";
    }

    /* renamed from: qn2.f$c */
    public static class C77379c {
    }

    /* renamed from: qn2.f$d */
    public static class C77380d extends C77379c {

        /* renamed from: a */
        public String f225604a;

        /* renamed from: b */
        public String f225605b;

        /* renamed from: c */
        public String f225606c;
    }

    public C77376f() {
        this.f225595a = new ArrayList();
        this.f225596b = "";
        this.f225596b = C77542a.m93503d();
    }

    /* renamed from: a */
    public boolean mo107496a(String str) {
        return Pattern.compile("[0-9]*").matcher(str).matches();
    }

    /* renamed from: b */
    public void mo107497b() {
        C77377a aVar;
        if (this.f225595a != null) {
            for (int i = 0; i < ((ArrayList) this.f225595a).size(); i++) {
                WeakReference weakReference = (WeakReference) ((ArrayList) this.f225595a).get(i);
                if (!(weakReference == null || (aVar = (C77377a) weakReference.get()) == null)) {
                    aVar.mo24636P2();
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: qn2.f$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: qn2.f$b} */
    /* JADX WARNING: type inference failed for: r8v3 */
    /* JADX WARNING: type inference failed for: r8v12 */
    /* JADX WARNING: type inference failed for: r8v13 */
    /* JADX WARNING: type inference failed for: r8v14 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo107498c(java.lang.String r7, long r8, int r10) {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "msg_id is "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            java.lang.String r9 = "MicroMsg.ShakeCardMsgMgr"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r8)
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 == 0) goto L_0x0024
            java.lang.String r7 = "onReceive() msgText is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r7)
            return
        L_0x0024:
            r8 = 0
            java.lang.String r0 = "sysmsg"
            r1 = 1
            if (r10 != 0) goto L_0x0239
            java.lang.String r10 = "onReceive() msgText is MSG_TYPE_ENTRANCE"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)
            java.util.Map r7 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r7, r0, r8)
            if (r7 != 0) goto L_0x0039
            goto L_0x014d
        L_0x0039:
            qn2.f$b r8 = new qn2.f$b
            r8.<init>()
            java.lang.String r10 = ".sysmsg.begintime"
            java.lang.Object r10 = r7.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            r2 = 0
            if (r0 != 0) goto L_0x005a
            boolean r0 = r6.mo107496a(r10)
            if (r0 == 0) goto L_0x005a
            int r10 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r10, (int) r2)
            r8.f225597a = r10
            goto L_0x0071
        L_0x005a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "parseEntrancedMsgFromMsgXml begintime is "
            r0.append(r3)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r10)
            r8.f225597a = r2
        L_0x0071:
            java.lang.String r10 = ".sysmsg.endtime"
            java.lang.Object r10 = r7.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x008c
            boolean r0 = r6.mo107496a(r10)
            if (r0 == 0) goto L_0x008c
            int r10 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r10, (int) r2)
            r8.f225598b = r10
            goto L_0x00a3
        L_0x008c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "parseEntrancedMsgFromMsgXml endtime is "
            r0.append(r3)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r10)
            r8.f225598b = r2
        L_0x00a3:
            java.lang.String r10 = ".sysmsg.entrancename"
            java.lang.Object r10 = r7.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            r8.f225599c = r10
            java.lang.String r10 = ".sysmsg.activitytype"
            java.lang.Object r10 = r7.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x00c8
            boolean r0 = r6.mo107496a(r10)
            if (r0 == 0) goto L_0x00c8
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r10, (int) r2)
            r8.f225600d = r0
            goto L_0x00ca
        L_0x00c8:
            r8.f225600d = r1
        L_0x00ca:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "parseEntrancedMsgFromMsgXml activitytype is "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)
            java.lang.String r10 = ".sysmsg.flowcontrollevelmin"
            java.lang.Object r10 = r7.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x00fa
            boolean r0 = r6.mo107496a(r10)
            if (r0 == 0) goto L_0x00fa
            int r10 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r10, (int) r2)
            r8.f225601e = r10
            goto L_0x0111
        L_0x00fa:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "parseEntrancedMsgFromMsgXml flowcontrollevelmin is "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r10)
            r8.f225601e = r2
        L_0x0111:
            java.lang.String r10 = ".sysmsg.shakecardentrancetip"
            java.lang.Object r10 = r7.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            r8.f225603g = r10
            java.lang.String r10 = ".sysmsg.flowcontrollevelmax"
            java.lang.Object r7 = r7.get(r10)
            java.lang.String r7 = (java.lang.String) r7
            boolean r10 = android.text.TextUtils.isEmpty(r7)
            if (r10 != 0) goto L_0x0136
            boolean r10 = r6.mo107496a(r7)
            if (r10 == 0) goto L_0x0136
            int r7 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r7, (int) r2)
            r8.f225602f = r7
            goto L_0x014d
        L_0x0136:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "parseEntrancedMsgFromMsgXml flowcontrollevelmax is "
            r10.append(r0)
            r10.append(r7)
            java.lang.String r7 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r7)
            r8.f225602f = r2
        L_0x014d:
            if (r8 != 0) goto L_0x0157
            java.lang.String r7 = "saveEntranceMsg msg == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r7)
            goto L_0x022f
        L_0x0157:
            java.lang.String r7 = "saveEntranceMsg msg"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r7)
            boolean r7 = rn2.C77542a.m93506g()
            if (r7 != 0) goto L_0x0169
            java.lang.String r7 = "saveEntranceMsg isShakeCardEntranceOpen is false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r7)
        L_0x0169:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r10 = "saveEntranceMsg begintime:"
            r7.append(r10)
            int r10 = r8.f225597a
            r7.append(r10)
            java.lang.String r10 = "  endtime:"
            r7.append(r10)
            int r10 = r8.f225598b
            r7.append(r10)
            java.lang.String r10 = "  flowlevelmin:"
            r7.append(r10)
            int r10 = r8.f225601e
            r7.append(r10)
            java.lang.String r10 = "  flowlevelmax:"
            r7.append(r10)
            int r10 = r8.f225602f
            r7.append(r10)
            java.lang.String r10 = " entrancename:"
            r7.append(r10)
            java.lang.String r10 = r8.f225599c
            r7.append(r10)
            java.lang.String r10 = " activitytype:"
            r7.append(r10)
            int r10 = r8.f225600d
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r7)
            eb0.c r7 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r7 = r7.mo105906u()
            com.tencent.mm.storage.y1$a r9 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_SHAKE_CARD_ENTRANCE_BEGIN_TIME_INT_SYNC
            int r10 = r8.f225597a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r7.mo119677K(r9, r10)
            eb0.c r7 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r7 = r7.mo105906u()
            com.tencent.mm.storage.y1$a r9 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_SHAKE_CARD_ENTRANCE_END_TIME_INT_SYNC
            int r10 = r8.f225598b
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r7.mo119677K(r9, r10)
            eb0.c r7 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r7 = r7.mo105906u()
            com.tencent.mm.storage.y1$a r9 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_SHAKE_CARD_ENTRANCE_NAME_STRING_SYNC
            java.lang.String r10 = r8.f225599c
            r7.mo119677K(r9, r10)
            eb0.c r7 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r7 = r7.mo105906u()
            com.tencent.mm.storage.y1$a r9 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_SHAKE_CARD_ACTIVITY_TYPE_INT_SYNC
            int r10 = r8.f225600d
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r7.mo119677K(r9, r10)
            eb0.c r7 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r7 = r7.mo105906u()
            com.tencent.mm.storage.y1$a r9 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_SHAKE_CARD_FLOW_CONTROL_LEVEL_MIN_INT_SYNC
            int r10 = r8.f225601e
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r7.mo119677K(r9, r10)
            eb0.c r7 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r7 = r7.mo105906u()
            com.tencent.mm.storage.y1$a r9 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_SHAKE_CARD_FLOW_CONTROL_LEVEL_MAX_INT_SYNC
            int r10 = r8.f225602f
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r7.mo119677K(r9, r10)
            eb0.c r7 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r7 = r7.mo105906u()
            com.tencent.mm.storage.y1$a r9 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_SHAKE_CARD_ENTRANCE_TIP_STRING_SYNC
            java.lang.String r8 = r8.f225603g
            r7.mo119677K(r9, r8)
        L_0x022f:
            com.tencent.mm.autogen.events.ShakeCardMsgNotifyEvent r7 = new com.tencent.mm.autogen.events.ShakeCardMsgNotifyEvent
            r7.<init>()
            r7.publish()
            goto L_0x0368
        L_0x0239:
            if (r10 != r1) goto L_0x0368
            java.lang.String r10 = "onReceive() msgText is MSG_TYPE_RED_DOT"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)
            java.util.Map r7 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r7, r0, r8)
            if (r7 != 0) goto L_0x0248
            goto L_0x026b
        L_0x0248:
            qn2.f$d r8 = new qn2.f$d
            r8.<init>()
            java.lang.String r10 = ".sysmsg.reddotid"
            java.lang.Object r10 = r7.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            r8.f225604a = r10
            java.lang.String r10 = ".sysmsg.reddotdesc"
            java.lang.Object r10 = r7.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            r8.f225605b = r10
            java.lang.String r10 = ".sysmsg.reddottext"
            java.lang.Object r7 = r7.get(r10)
            java.lang.String r7 = (java.lang.String) r7
            r8.f225606c = r7
        L_0x026b:
            com.tencent.mm.storage.y1$a r7 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_SHAKE_CARD_ENTRANCE_RED_DOT_TEXT_STRING_SYNC
            com.tencent.mm.storage.y1$a r10 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_SHAKE_CARD_ENTRANCE_RED_DOT_DESC_STRING_SYNC
            com.tencent.mm.storage.y1$a r0 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_SHAKE_CARD_ENTRANCE_RED_DOT_ID_STRING_SYNC
            java.lang.Class<ct.c> r2 = p327ct.C30914c.class
            if (r8 != 0) goto L_0x027d
            java.lang.String r7 = "saveRedDotMsg msg == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r7)
            goto L_0x0360
        L_0x027d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "saveRedDotMsg msg reddotid is "
            r3.append(r4)
            java.lang.String r4 = r8.f225604a
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "saveRedDotMsg pre reddotid is "
            r3.append(r4)
            java.lang.String r4 = r6.f225596b
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r3)
            java.lang.String r3 = r8.f225604a
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x02bb
            java.lang.String r7 = "msg.reddotid is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r7)
            goto L_0x0360
        L_0x02bb:
            java.lang.String r3 = r6.f225596b
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            r4 = 262154(0x4000a, float:3.67356E-40)
            if (r3 == 0) goto L_0x0306
            java.lang.String r3 = "redDotId is empty, msg.reddotid is not empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r3)
            di3.d r9 = di3.C86312j.m106911c(r2)
            ct.c r9 = (p327ct.C30914c) r9
            ct.d r9 = r9.mo17862sM()
            l20.a r9 = (l20.C21388a) r9
            r9.mo33507p(r4, r1)
            eb0.c r9 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r9 = r9.mo105906u()
            java.lang.String r1 = r8.f225604a
            r9.mo119677K(r0, r1)
            eb0.c r9 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r9 = r9.mo105906u()
            java.lang.String r0 = r8.f225605b
            r9.mo119677K(r10, r0)
            eb0.c r9 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r9 = r9.mo105906u()
            java.lang.String r8 = r8.f225606c
            r9.mo119677K(r7, r8)
            r6.mo107497b()
            goto L_0x0360
        L_0x0306:
            java.lang.String r3 = r6.f225596b
            java.lang.String r5 = r8.f225604a
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0350
            java.lang.String r3 = "redDotId and msg.reddotid is not empty, but no equals"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r3)
            di3.d r9 = di3.C86312j.m106911c(r2)
            ct.c r9 = (p327ct.C30914c) r9
            ct.d r9 = r9.mo17862sM()
            l20.a r9 = (l20.C21388a) r9
            r9.mo33507p(r4, r1)
            eb0.c r9 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r9 = r9.mo105906u()
            java.lang.String r1 = r8.f225604a
            r9.mo119677K(r0, r1)
            eb0.c r9 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r9 = r9.mo105906u()
            java.lang.String r0 = r8.f225605b
            r9.mo119677K(r10, r0)
            eb0.c r9 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r9 = r9.mo105906u()
            java.lang.String r8 = r8.f225606c
            r9.mo119677K(r7, r8)
            r6.mo107497b()
            goto L_0x0360
        L_0x0350:
            java.lang.String r7 = r6.f225596b
            java.lang.String r8 = r8.f225604a
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0360
            java.lang.String r7 = "redDotId equals msg.reddotid"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r7)
        L_0x0360:
            com.tencent.mm.autogen.events.ShakeCardMsgNotifyEvent r7 = new com.tencent.mm.autogen.events.ShakeCardMsgNotifyEvent
            r7.<init>()
            r7.publish()
        L_0x0368:
            rn2.C77542a.m93500a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qn2.C77376f.mo107498c(java.lang.String, long, int):void");
    }
}
