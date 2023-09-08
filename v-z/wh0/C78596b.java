package wh0;

import g62.C75875l;

/* renamed from: wh0.b */
public class C78596b implements C75875l.C32329c {
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
        r0 = pb1.C100734q.m131886z(r0.get(".msg.appmsg.announcement").replace("<group_notice_item", "<favitem").replace("group_notice_item>", "favitem>"), 18);
     */
    /* renamed from: w5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo55728w5(g62.C75875l r14, g62.C75875l.C45886e r15) {
        /*
            r13 = this;
            java.lang.String r14 = r15.f123845b
            java.lang.String r0 = "insert"
            if (r14 != r0) goto L_0x00d8
            java.util.ArrayList<com.tencent.mm.storage.f4> r14 = r15.f123846c
            java.util.Iterator r14 = r14.iterator()
        L_0x000c:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L_0x00d8
            java.lang.Object r15 = r14.next()
            com.tencent.mm.storage.f4 r15 = (com.tencent.p014mm.storage.C72963f4) r15
            int r0 = r15.getType()
            r1 = 1107296305(0x42000031, float:32.000187)
            if (r0 != r1) goto L_0x000c
            java.lang.String r0 = r15.mo108775z2()
            r1 = 0
            java.lang.String r2 = "msg"
            java.util.Map r0 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r0, r2, r1)
            if (r0 == 0) goto L_0x000c
            java.lang.String r1 = ".msg.appmsg.announcement"
            java.lang.Object r2 = r0.get(r1)
            if (r2 == 0) goto L_0x000c
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "<group_notice_item"
            java.lang.String r2 = "<favitem"
            java.lang.String r0 = r0.replace(r1, r2)
            java.lang.String r1 = "group_notice_item>"
            java.lang.String r2 = "favitem>"
            java.lang.String r0 = r0.replace(r1, r2)
            r1 = 18
            pb1.z r0 = pb1.C100734q.m131886z(r0, r1)
            te3.kd0 r1 = r0.field_favProto
            if (r1 == 0) goto L_0x000c
            java.util.LinkedList<te3.rc0> r1 = r1.f298618f
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x000c
            te3.kd0 r0 = r0.field_favProto
            java.util.LinkedList<te3.rc0> r0 = r0.f298618f
            java.util.Iterator r0 = r0.iterator()
        L_0x0066:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x000c
            java.lang.Object r1 = r0.next()
            te3.rc0 r1 = (te3.C101834rc0) r1
            int r2 = r1.f299258I
            r3 = 4
            r4 = 2
            if (r2 == r4) goto L_0x007e
            if (r2 == r3) goto L_0x007e
            r5 = 8
            if (r2 != r5) goto L_0x0066
        L_0x007e:
            xh.g1 r2 = new xh.g1
            r2.<init>()
            long r5 = r15.getMsgId()
            r2.field_msgId = r5
            java.lang.String r5 = r1.f299280T
            r2.field_dataId = r5
            java.lang.String r5 = o21.C100273b.m131075c(r1)
            r2.field_dataPath = r5
            java.lang.String r5 = o21.C100273b.m131077e(r1)
            r2.field_thumbPath = r5
            long r5 = r1.f299276R
            long r7 = r1.f299336x0
            long r5 = r5 + r7
            r2.field_size = r5
            com.tencent.mm.plugin.announcement.f r5 = com.tencent.p014mm.plugin.announcement.C29091f.f79662e
            com.tencent.mm.sdk.storage.ISQLiteDatabase r5 = r5.getDB()
            com.tencent.mm.sdk.storage.executor.InsertExecutor r12 = new com.tencent.mm.sdk.storage.executor.InsertExecutor
            r8 = 1
            r9 = 0
            r10 = 0
            java.lang.String r11 = "MicroMsg.SDK.BaseChatroomNoticeAttachIndex"
            r6 = r12
            r7 = r2
            r6.<init>(r7, r8, r9, r10, r11)
            r12.execute(r5)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r5 = 0
            long r6 = r15.getMsgId()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r3[r5] = r6
            r5 = 1
            java.lang.String r1 = r1.f299280T
            r3[r5] = r1
            java.lang.String r1 = r2.field_dataPath
            r3[r4] = r1
            r1 = 3
            java.lang.String r2 = r2.field_thumbPath
            r3[r1] = r2
            java.lang.String r1 = "MicroMsg.MsgListener"
            java.lang.String r2 = "insert item. msgId:%d, dataId:%s, dataPath:%s, thumbPath:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r3)
            goto L_0x0066
        L_0x00d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wh0.C78596b.mo55728w5(g62.l, g62.l$e):void");
    }
}
