package js0;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Iterator;
import java.util.LinkedList;
import js0.C76445d;

/* renamed from: js0.c */
public class C76443c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f223770d;

    /* renamed from: js0.c$a */
    public class C76444a implements Runnable {
        public C76444a(C76443c cVar) {
        }

        public void run() {
            LinkedList<C76447f> linkedList = C76445d.f223771a;
            synchronized (C76445d.class) {
                Log.m105924i("MicroMsg.AppBrandHistoryListLogic", "done");
                C76445d.f223774d = true;
                C76445d.f223773c = false;
                Iterator<C76445d.C76446a> it = C76445d.f223772b.iterator();
                while (it.hasNext()) {
                    C76445d.C76446a next = it.next();
                    if (next != null) {
                        next.mo102831a(C76445d.f223771a);
                    }
                }
                C76445d.f223772b.clear();
            }
        }
    }

    public C76443c(String str) {
        this.f223770d = str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0109 A[Catch:{ all -> 0x00ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01ef A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r28 = this;
            r1 = r28
            java.lang.Class<f62.k0> r0 = f62.C75700k0.class
            java.util.LinkedList<js0.f> r2 = js0.C76445d.f223771a
            r2.clear()
            java.lang.String r2 = r1.f223770d
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85820U5(r2)
            r3 = 0
            if (r2 == 0) goto L_0x0027
            java.lang.Class<a11.c> r2 = a11.C39479c.class
            k40.a r2 = f40.C86709a0.m107533q(r2)
            a11.c r2 = (a11.C39479c) r2
            eb0.m2 r2 = r2.mo62084mr()
            java.lang.String r4 = r1.f223770d
            com.tencent.mm.storage.n1 r2 = (com.tencent.p014mm.storage.C44662n1) r2
            com.tencent.mm.storage.m1 r2 = r2.mo69799Lo(r4)
            goto L_0x0028
        L_0x0027:
            r2 = r3
        L_0x0028:
            r4 = 100
            r5 = 0
            r6 = 100
            r7 = 0
        L_0x002e:
            r8 = 1
            if (r6 < r4) goto L_0x0206
            k40.a r6 = f40.C86709a0.m107533q(r0)
            f62.k0 r6 = (f62.C75700k0) r6
            g62.l r6 = r6.mo96095LE()
            java.lang.String r9 = r1.f223770d
            com.tencent.mm.storage.g4 r6 = (com.tencent.p014mm.storage.C72972g4) r6
            r6.getClass()
            if (r9 == 0) goto L_0x009f
            int r10 = r9.length()
            if (r10 != 0) goto L_0x004b
            goto L_0x009f
        L_0x004b:
            java.lang.String r10 = r6.hy0(r9)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "select msgId,msgSvrId,createTime,content,isSend,imgPath from "
            r11.append(r12)
            r11.append(r10)
            java.lang.String r10 = " where"
            r11.append(r10)
            java.lang.String r10 = r6.mo101130mL(r9)
            r11.append(r10)
            java.lang.String r9 = r6.iy0(r9)
            r11.append(r9)
            java.lang.String r9 = " AND "
            r11.append(r9)
            java.lang.String r9 = " (type = 49 or type = 587202609 or type = 553648177) "
            r11.append(r9)
            java.lang.String r9 = " order by "
            r11.append(r9)
            java.lang.String r9 = "createTime"
            r11.append(r9)
            java.lang.String r9 = " DESC limit "
            r11.append(r9)
            r11.append(r4)
            java.lang.String r9 = " OFFSET "
            r11.append(r9)
            r11.append(r7)
            java.lang.String r9 = r11.toString()
            zh3.f r6 = r6.f212775p
            android.database.Cursor r6 = r6.rawQuery(r9, r3)
            goto L_0x00a7
        L_0x009f:
            java.lang.String r6 = "MicroMsg.MsgInfoStorage"
            java.lang.String r9 = "getImgMessage fail, argument is invalid"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r9)
            r6 = r3
        L_0x00a7:
            if (r6 == 0) goto L_0x00b1
            int r9 = r6.getCount()     // Catch:{ all -> 0x00ae }
            goto L_0x00b2
        L_0x00ae:
            r0 = move-exception
            goto L_0x01f4
        L_0x00b1:
            r9 = 0
        L_0x00b2:
            if (r6 == 0) goto L_0x01fa
            boolean r10 = r6.moveToNext()     // Catch:{ all -> 0x00ae }
            if (r10 == 0) goto L_0x01fa
            com.tencent.mm.storage.f4 r10 = new com.tencent.mm.storage.f4     // Catch:{ all -> 0x00ae }
            r10.<init>()     // Catch:{ all -> 0x00ae }
            long r11 = r6.getLong(r5)     // Catch:{ all -> 0x00ae }
            r10.setMsgId(r11)     // Catch:{ all -> 0x00ae }
            long r11 = r6.getLong(r8)     // Catch:{ all -> 0x00ae }
            r10.mo108745Y2(r11)     // Catch:{ all -> 0x00ae }
            r11 = 2
            long r11 = r6.getLong(r11)     // Catch:{ all -> 0x00ae }
            r10.mo108733M2(r11)     // Catch:{ all -> 0x00ae }
            r11 = 3
            java.lang.String r11 = r6.getString(r11)     // Catch:{ all -> 0x00ae }
            r10.mo108732L2(r11)     // Catch:{ all -> 0x00ae }
            r11 = 4
            int r11 = r6.getInt(r11)     // Catch:{ all -> 0x00ae }
            r10.mo108740T2(r11)     // Catch:{ all -> 0x00ae }
            r11 = 5
            java.lang.String r11 = r6.getString(r11)     // Catch:{ all -> 0x00ae }
            r10.mo108739S2(r11)     // Catch:{ all -> 0x00ae }
            java.lang.String r11 = r10.getContent()     // Catch:{ all -> 0x00ae }
            if (r11 == 0) goto L_0x01ef
            com.tencent.mm.message.l$b r11 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r11, r3)     // Catch:{ all -> 0x00ae }
            if (r11 == 0) goto L_0x01ef
            int r12 = r11.f195582i     // Catch:{ all -> 0x00ae }
            r13 = 33
            if (r13 == r12) goto L_0x0106
            r13 = 36
            if (r13 != r12) goto L_0x0104
            goto L_0x0106
        L_0x0104:
            r12 = 0
            goto L_0x0107
        L_0x0106:
            r12 = 1
        L_0x0107:
            if (r12 == 0) goto L_0x01ef
            java.lang.String r12 = r1.f223770d     // Catch:{ all -> 0x00ae }
            boolean r12 = com.tencent.p014mm.storage.C72996z1.m85820U5(r12)     // Catch:{ all -> 0x00ae }
            java.lang.String r13 = r1.f223770d     // Catch:{ all -> 0x00ae }
            int r14 = r10.mo108769t2()     // Catch:{ all -> 0x00ae }
            if (r14 != r8) goto L_0x011c
            java.lang.String r12 = eb0.C75592q0.m90789s()     // Catch:{ all -> 0x00ae }
            goto L_0x0131
        L_0x011c:
            if (r12 == 0) goto L_0x0127
            java.lang.String r12 = r10.getContent()     // Catch:{ all -> 0x00ae }
            java.lang.String r12 = eb0.C75604z3.m90847s(r12)     // Catch:{ all -> 0x00ae }
            goto L_0x0128
        L_0x0127:
            r12 = r3
        L_0x0128:
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)     // Catch:{ all -> 0x00ae }
            if (r14 == 0) goto L_0x012f
            goto L_0x0130
        L_0x012f:
            r13 = r12
        L_0x0130:
            r12 = r13
        L_0x0131:
            k40.a r13 = f40.C86709a0.m107533q(r0)     // Catch:{ all -> 0x00ae }
            f62.k0 r13 = (f62.C75700k0) r13     // Catch:{ all -> 0x00ae }
            com.tencent.mm.storage.u3 r13 = r13.mo96097Ni()     // Catch:{ all -> 0x00ae }
            com.tencent.mm.storage.z1 r13 = r13.get(r12)     // Catch:{ all -> 0x00ae }
            java.lang.String r14 = ""
            if (r2 == 0) goto L_0x014a
            java.lang.String r12 = r2.mo69789q2(r12)     // Catch:{ all -> 0x00ae }
            r22 = r12
            goto L_0x014c
        L_0x014a:
            r22 = r14
        L_0x014c:
            js0.f r15 = new js0.f     // Catch:{ all -> 0x00ae }
            long r16 = r10.getCreateTime()     // Catch:{ all -> 0x00ae }
            int r14 = r11.f195582i     // Catch:{ all -> 0x00ae }
            java.lang.String r12 = r11.f195570f     // Catch:{ all -> 0x00ae }
            long r18 = r10.getMsgId()     // Catch:{ all -> 0x00ae }
            java.lang.String r20 = r13.getUsername()     // Catch:{ all -> 0x00ae }
            java.lang.String r21 = r13.mo62909j3()     // Catch:{ all -> 0x00ae }
            java.lang.String r23 = r13.mo73969n2()     // Catch:{ all -> 0x00ae }
            java.lang.String r13 = r11.f195577g2     // Catch:{ all -> 0x00ae }
            java.lang.String r3 = r11.f195562d     // Catch:{ all -> 0x00ae }
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r13, (java.lang.String) r3)     // Catch:{ all -> 0x00ae }
            long r25 = r10.mo108774y2()     // Catch:{ all -> 0x00ae }
            r24 = r12
            r12 = r15
            r27 = r14
            r13 = r16
            r4 = r15
            r15 = r27
            r16 = r24
            r17 = r18
            r19 = r20
            r20 = r21
            r21 = r23
            r23 = r3
            r24 = r11
            r12.<init>(r13, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ all -> 0x00ae }
            java.lang.String r3 = r11.f195570f     // Catch:{ all -> 0x00ae }
            r4.f223786l = r3     // Catch:{ all -> 0x00ae }
            java.lang.Class<kr0.w0> r3 = kr0.C76629w0.class
            di3.d r3 = di3.C86312j.m106911c(r3)     // Catch:{ all -> 0x00ae }
            kr0.w0 r3 = (kr0.C76629w0) r3     // Catch:{ all -> 0x00ae }
            com.tencent.mm.message.l$b r12 = r4.f223784j     // Catch:{ all -> 0x00ae }
            java.lang.String r12 = r12.f195573f2     // Catch:{ all -> 0x00ae }
            com.tencent.mm.plugin.appbrand.config.WxaAttributes r3 = r3.mo106879N2(r12)     // Catch:{ all -> 0x00ae }
            if (r3 == 0) goto L_0x01a6
            java.lang.String r12 = r3.field_nickname     // Catch:{ all -> 0x00ae }
            goto L_0x01aa
        L_0x01a6:
            com.tencent.mm.message.l$b r12 = r4.f223784j     // Catch:{ all -> 0x00ae }
            java.lang.String r12 = r12.f195638w     // Catch:{ all -> 0x00ae }
        L_0x01aa:
            r4.f223777c = r12     // Catch:{ all -> 0x00ae }
            if (r3 == 0) goto L_0x01b1
            java.lang.String r3 = r3.field_brandIconURL     // Catch:{ all -> 0x00ae }
            goto L_0x01b5
        L_0x01b1:
            com.tencent.mm.message.l$b r3 = r4.f223784j     // Catch:{ all -> 0x00ae }
            java.lang.String r3 = r3.f195471B2     // Catch:{ all -> 0x00ae }
        L_0x01b5:
            r4.f223787m = r3     // Catch:{ all -> 0x00ae }
            int r3 = r11.f195581h2     // Catch:{ all -> 0x00ae }
            if (r3 == r8) goto L_0x01ea
            java.lang.Class<gt.k> r3 = p158gt.C98201k.class
            di3.d r3 = di3.C86312j.m106911c(r3)     // Catch:{ all -> 0x00ae }
            gt.k r3 = (p158gt.C98201k) r3     // Catch:{ all -> 0x00ae }
            gt.m r3 = r3.mo137277xi()     // Catch:{ all -> 0x00ae }
            java.lang.String r10 = r10.mo108765s2()     // Catch:{ all -> 0x00ae }
            com.tencent.mm.modelimage.m r3 = (com.tencent.p014mm.modelimage.C92839m) r3     // Catch:{ all -> 0x00ae }
            java.lang.String r3 = r3.h30(r10)     // Catch:{ all -> 0x00ae }
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)     // Catch:{ all -> 0x00ae }
            if (r10 != 0) goto L_0x01ea
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ae }
            r10.<init>()     // Catch:{ all -> 0x00ae }
            java.lang.String r11 = "file://"
            r10.append(r11)     // Catch:{ all -> 0x00ae }
            r10.append(r3)     // Catch:{ all -> 0x00ae }
            java.lang.String r3 = r10.toString()     // Catch:{ all -> 0x00ae }
            r4.f223788n = r3     // Catch:{ all -> 0x00ae }
        L_0x01ea:
            java.util.LinkedList<js0.f> r3 = js0.C76445d.f223771a     // Catch:{ all -> 0x00ae }
            r3.add(r4)     // Catch:{ all -> 0x00ae }
        L_0x01ef:
            r3 = 0
            r4 = 100
            goto L_0x00b2
        L_0x01f4:
            if (r6 == 0) goto L_0x01f9
            r6.close()
        L_0x01f9:
            throw r0
        L_0x01fa:
            if (r6 == 0) goto L_0x01ff
            r6.close()
        L_0x01ff:
            int r7 = r7 + r9
            r6 = r9
            r3 = 0
            r4 = 100
            goto L_0x002e
        L_0x0206:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.util.LinkedList<js0.f> r2 = js0.C76445d.f223771a
            int r2 = r2.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r5] = r2
            java.lang.String r2 = "MicroMsg.AppBrandHistoryListLogic"
            java.lang.String r3 = "[loadData] data:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r0)
            js0.c$a r0 = new js0.c$a
            r0.<init>(r1)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: js0.C76443c.run():void");
    }
}
