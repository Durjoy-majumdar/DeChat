package p177ji;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.mmdata.rpt.RoomTodoShareStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86301e;
import eb0.C45628s0;
import ei3.C86522b;
import f40.C86709a0;
import f62.C75700k0;
import f62.C75708t0;
import p203mi.C24982c0;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: ji.h */
public class C76416h extends C86301e implements C75708t0 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: si.c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Td0(java.lang.String r22, long r23) {
        /*
            r21 = this;
            r0 = r22
            r1 = r23
            java.lang.Class<pi.d> r3 = p644pi.C77089d.class
            java.lang.Class<f62.k0> r4 = f62.C75700k0.class
            k40.a r5 = f40.C86709a0.m107533q(r4)
            f62.k0 r5 = (f62.C75700k0) r5
            g62.l r5 = r5.mo96095LE()
            com.tencent.mm.storage.g4 r5 = (com.tencent.p014mm.storage.C72972g4) r5
            com.tencent.mm.storage.f4 r5 = r5.b00(r1)
            long r6 = r5.getMsgId()
            java.lang.String r8 = "null"
            java.lang.String r9 = "MicroMsg.roomTodo.RoomTodoService"
            r10 = 2
            r11 = 1
            r12 = 0
            int r13 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r13 != 0) goto L_0x00b2
            java.lang.String r1 = r5.f230738V
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x014a
            java.lang.String r1 = r5.f230738V
            di3.d r2 = di3.C86312j.m106911c(r3)
            pi.d r2 = (p644pi.C77089d) r2
            si.d r2 = r2.wx0()
            si.c r2 = r2.mo107864Lo(r0, r1)
            if (r2 == 0) goto L_0x009b
            boolean r3 = p203mi.C76758b0.m92504i(r2)
            java.util.List<java.lang.Long> r5 = r2.f226492S
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x004d:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0086
            java.lang.Object r6 = r5.next()
            java.lang.Long r6 = (java.lang.Long) r6
            k40.a r7 = f40.C86709a0.m107533q(r4)
            f62.k0 r7 = (f62.C75700k0) r7
            g62.l r7 = r7.mo96095LE()
            long r13 = r6.longValue()
            com.tencent.mm.storage.g4 r7 = (com.tencent.p014mm.storage.C72972g4) r7
            com.tencent.mm.storage.f4 r6 = r7.h30(r0, r13)
            java.lang.String r7 = ""
            r6.mo108737Q2(r7)
            k40.a r7 = f40.C86709a0.m107533q(r4)
            f62.k0 r7 = (f62.C75700k0) r7
            g62.l r7 = r7.mo96095LE()
            long r13 = r6.getMsgId()
            com.tencent.mm.storage.g4 r7 = (com.tencent.p014mm.storage.C72972g4) r7
            r7.xy0(r13, r6)
            goto L_0x004d
        L_0x0086:
            com.tencent.mm.autogen.events.NotifyGroupTodoEvent r4 = new com.tencent.mm.autogen.events.NotifyGroupTodoEvent
            r4.<init>()
            com.tencent.mm.autogen.events.NotifyGroupTodoEvent$a r5 = r4.f193762d
            r5.f193763a = r11
            r5.f193765c = r1
            r5.f193764b = r0
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r4.asyncPublish((android.os.Looper) r0)
            goto L_0x009c
        L_0x009b:
            r3 = 0
        L_0x009c:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            if (r2 != 0) goto L_0x00a1
            goto L_0x00a3
        L_0x00a1:
            java.lang.String r8 = r2.field_todoid
        L_0x00a3:
            r0[r12] = r8
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            r0[r11] = r1
            java.lang.String r1 = "deleteChatroomInfoTodo delete(%s) result:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r1, r0)
            goto L_0x014a
        L_0x00b2:
            di3.d r1 = di3.C86312j.m106911c(r3)
            pi.d r1 = (p644pi.C77089d) r1
            si.d r1 = r1.wx0()
            r1.getClass()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r22)
            r3 = 0
            r4 = 3
            if (r2 == 0) goto L_0x00c8
            goto L_0x0116
        L_0x00c8:
            com.tencent.mm.sdk.storage.ISQLiteDatabase r13 = r1.f226496d
            com.tencent.mm.sdk.storage.IAutoDBItem$MAutoDBInfo r1 = p684si.C77711c.f226491T
            java.lang.String[] r15 = r1.columns
            java.lang.String[] r1 = new java.lang.String[r4]
            r1[r12] = r0
            java.lang.String r2 = "roomannouncement@app.origin"
            r1[r11] = r2
            java.lang.String r2 = "2"
            r1[r10] = r2
            r18 = 0
            r19 = 0
            r20 = 0
            java.lang.String r14 = "GroupTodo"
            java.lang.String r16 = "roomname=? and username=? and state!=?"
            r17 = r1
            android.database.Cursor r1 = r13.query(r14, r15, r16, r17, r18, r19, r20)
            if (r1 != 0) goto L_0x00ed
            goto L_0x0116
        L_0x00ed:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x014b }
            r2.<init>()     // Catch:{ all -> 0x014b }
        L_0x00f2:
            boolean r5 = r1.moveToNext()     // Catch:{ all -> 0x014b }
            if (r5 == 0) goto L_0x0104
            si.c r5 = new si.c     // Catch:{ all -> 0x014b }
            r5.<init>()     // Catch:{ all -> 0x014b }
            r5.convertFrom(r1)     // Catch:{ all -> 0x014b }
            r2.add(r5)     // Catch:{ all -> 0x014b }
            goto L_0x00f2
        L_0x0104:
            int r5 = r2.size()     // Catch:{ all -> 0x014b }
            if (r5 != 0) goto L_0x010e
        L_0x010a:
            r1.close()
            goto L_0x0116
        L_0x010e:
            java.lang.Object r2 = r2.get(r12)     // Catch:{ all -> 0x014b }
            r3 = r2
            si.c r3 = (p684si.C77711c) r3     // Catch:{ all -> 0x014b }
            goto L_0x010a
        L_0x0116:
            if (r3 == 0) goto L_0x0133
            boolean r1 = p203mi.C76758b0.m92504i(r3)
            com.tencent.mm.autogen.events.NotifyGroupTodoEvent r2 = new com.tencent.mm.autogen.events.NotifyGroupTodoEvent
            r2.<init>()
            com.tencent.mm.autogen.events.NotifyGroupTodoEvent$a r5 = r2.f193762d
            r5.f193763a = r11
            java.lang.String r6 = r3.field_todoid
            r5.f193765c = r6
            r5.f193764b = r0
            android.os.Looper r5 = android.os.Looper.getMainLooper()
            r2.asyncPublish((android.os.Looper) r5)
            goto L_0x0134
        L_0x0133:
            r1 = 0
        L_0x0134:
            java.lang.Object[] r2 = new java.lang.Object[r4]
            if (r3 != 0) goto L_0x0139
            goto L_0x013b
        L_0x0139:
            java.lang.String r8 = r3.field_todoid
        L_0x013b:
            r2[r12] = r8
            r2[r11] = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r2[r10] = r0
            java.lang.String r0 = "deleteChatroomAtAllTodo delete(%s) roomname:%s result:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r0, r2)
        L_0x014a:
            return
        L_0x014b:
            r0 = move-exception
            r1.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p177ji.C76416h.Td0(java.lang.String, long):void");
    }

    public void Xf0(String str, String str2, String str3, int i, int i2, int i3) {
        int i4 = 2;
        Log.m105919d("MicroMsg.roomTodo.RoomTodoService", "shareDialogOperateReport %s %s %s %s %s %s", str, str2, str3, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        if (C72996z1.m85807K5(str) && C45628s0.m50752Q(str)) {
            if (!C45628s0.m50750O(str)) {
                i4 = 1;
            }
            RoomTodoShareStruct roomTodoShareStruct = new RoomTodoShareStruct();
            roomTodoShareStruct.f194354d = roomTodoShareStruct.mo86045b("roomid", str, true);
            roomTodoShareStruct.f194355e = (long) i4;
            roomTodoShareStruct.f194356f = roomTodoShareStruct.mo86045b("appid", str2, true);
            roomTodoShareStruct.f194357g = roomTodoShareStruct.mo86045b("appname", str3, true);
            roomTodoShareStruct.f194358h = (long) i;
            roomTodoShareStruct.f194359i = (long) i2;
            roomTodoShareStruct.f194360j = (long) i3;
            roomTodoShareStruct.mo86054n();
        }
    }

    public void di0(String str, int i, int i2, int i3) {
        Class cls = C75700k0.class;
        C86709a0.m107528h();
        long j = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(str).f149538g1;
        if (j != 0) {
            C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(j);
            if (!Util.isNullOrNil(b002.f230738V)) {
                C24982c0.m31598b(str, i, i2, i3, b002.f230738V, "roomannouncement@app.origin");
            }
        }
    }

    /* renamed from: s7 */
    public boolean mo106028s7() {
        return true;
    }
}
