package p619ni;

import a11.C39479c;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import f62.C31922b1;
import f62.C75700k0;
import java.util.regex.Pattern;
import p629ny.C76979h;

/* renamed from: ni.h */
public class C76859h implements C31922b1 {

    /* renamed from: d */
    public static final Pattern f224684d = Pattern.compile("\\$\\{(.+)\\}");

    /* renamed from: d */
    public static CharSequence m92653d(String str, String str2, boolean z) {
        String str3;
        C86709a0.m107528h();
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str2);
        if (!z || Util.isNullOrNil(z1Var.mo73969n2())) {
            String username = z1Var.getUsername();
            C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(str);
            str3 = Lo == null ? null : Lo.mo69789q2(username);
        } else {
            str3 = z1Var.mo73969n2();
        }
        if (Util.isNullOrNil(str3)) {
            str3 = z1Var.mo73969n2();
        }
        if (Util.isNullOrNil(str3)) {
            str3 = z1Var.mo62909j3();
        }
        if (Util.isNullOrNil(str3)) {
            str3 = z1Var.getUsername();
        }
        return ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(MMApplicationContext.getContext(), str3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x04ce A[Catch:{ Exception -> 0x0622 }] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0500 A[Catch:{ Exception -> 0x0622 }] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0509 A[Catch:{ Exception -> 0x0622 }] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0549 A[Catch:{ Exception -> 0x0622 }] */
    /* JADX WARNING: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x01c4 A[ADDED_TO_REGION, Catch:{ Exception -> 0x0622 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0248 A[SYNTHETIC, Splitter:B:48:0x0248] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x026d A[Catch:{ Exception -> 0x0622 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x02d3 A[Catch:{ Exception -> 0x0622 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0315 A[Catch:{ Exception -> 0x0622 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0333 A[SYNTHETIC, Splitter:B:71:0x0333] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x044f A[Catch:{ Exception -> 0x0622 }] */
    /* renamed from: X5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ob0.C35136m.C35139b mo10269X5(java.lang.String r39, java.util.Map<java.lang.String, java.lang.String> r40, ob0.C35136m.C35137a r41) {
        /*
            r38 = this;
            r0 = r40
            java.lang.String r1 = ".sysmsg.todo.username"
            java.lang.String r2 = ".sysmsg.todo.todoid"
            java.lang.String r3 = "altertodo_set"
            java.lang.String r4 = ".sysmsg.todo.time"
            java.lang.Class<pi.d> r5 = p644pi.C77089d.class
            java.lang.Class<f62.k0> r6 = f62.C75700k0.class
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.String r9 = ""
            r10 = r39
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r10, (java.lang.String) r9)
            r12 = 0
            r8[r12] = r11
            java.lang.String r11 = "MicroMsg.roomTodo.RoomToolsTipsNewXmlConsumer"
            java.lang.String r13 = "consumeNewXml subType:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r11, r13, r8)
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r39)
            java.lang.String r10 = "roomtoolstips"
            boolean r8 = r8.equals(r10)
            if (r8 == 0) goto L_0x0640
            if (r0 == 0) goto L_0x0640
            boolean r13 = r0.containsKey(r2)     // Catch:{ Exception -> 0x0624 }
            if (r13 == 0) goto L_0x061b
            r13 = r41
            te3.j3 r13 = r13.f94242a     // Catch:{ Exception -> 0x0624 }
            java.lang.String r14 = ".sysmsg.todo.template"
            java.lang.Object r14 = r0.get(r14)     // Catch:{ Exception -> 0x0624 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ Exception -> 0x0624 }
            java.lang.String r14 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r14)     // Catch:{ Exception -> 0x0624 }
            java.lang.String r14 = r14.trim()     // Catch:{ Exception -> 0x0624 }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ Exception -> 0x0624 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0624 }
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)     // Catch:{ Exception -> 0x0624 }
            java.lang.String r2 = r2.trim()     // Catch:{ Exception -> 0x0624 }
            java.lang.String r15 = ".sysmsg.todo.op"
            java.lang.Object r15 = r0.get(r15)     // Catch:{ Exception -> 0x0624 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ Exception -> 0x0624 }
            int r15 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r15, (int) r12)     // Catch:{ Exception -> 0x0624 }
            te3.rv3 r13 = r13.f227628e     // Catch:{ Exception -> 0x0624 }
            java.lang.String r13 = sf0.C48374j0.m53718g(r13)     // Catch:{ Exception -> 0x0624 }
            java.lang.String r10 = ".sysmsg.todo.scene"
            java.lang.Object r10 = r0.get(r10)     // Catch:{ Exception -> 0x0624 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x0624 }
            java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r10)     // Catch:{ Exception -> 0x0624 }
            java.lang.String r8 = ".sysmsg.todo.creator"
            java.lang.Object r8 = r0.get(r8)     // Catch:{ Exception -> 0x0624 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x0624 }
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r8)     // Catch:{ Exception -> 0x0624 }
            java.lang.String r7 = ".sysmsg.todo.oper"
            java.lang.Object r7 = r0.get(r7)     // Catch:{ Exception -> 0x0624 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x0624 }
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r7)     // Catch:{ Exception -> 0x0624 }
            java.lang.Object r18 = r0.get(r1)     // Catch:{ Exception -> 0x0624 }
            java.lang.String r18 = (java.lang.String) r18     // Catch:{ Exception -> 0x0624 }
            java.lang.String r18 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r18)     // Catch:{ Exception -> 0x0624 }
            java.lang.Object r19 = r0.get(r4)     // Catch:{ Exception -> 0x0624 }
            r12 = r19
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x0624 }
            r19 = r3
            r21 = r4
            r3 = 0
            long r22 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r12, r3)     // Catch:{ Exception -> 0x0624 }
            r24 = 1000(0x3e8, double:4.94E-321)
            long r3 = r22 * r24
            java.lang.String r12 = ".sysmsg.todo.related_msgid"
            java.lang.Object r12 = r0.get(r12)     // Catch:{ Exception -> 0x0624 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x0624 }
            r22 = r3
            r28 = r11
            r3 = 0
            long r11 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r12, r3)     // Catch:{ Exception -> 0x0617 }
            java.lang.String r3 = ".sysmsg.todo.sharekey"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ Exception -> 0x0617 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0617 }
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r3)     // Catch:{ Exception -> 0x0617 }
            java.lang.String r4 = ".sysmsg.todo.sharename"
            java.lang.Object r4 = r0.get(r4)     // Catch:{ Exception -> 0x0617 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x0617 }
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r4)     // Catch:{ Exception -> 0x0617 }
            di3.d r29 = di3.C86312j.m106911c(r5)     // Catch:{ Exception -> 0x0617 }
            pi.d r29 = (p644pi.C77089d) r29     // Catch:{ Exception -> 0x0617 }
            r30 = r1
            si.d r1 = r29.wx0()     // Catch:{ Exception -> 0x0617 }
            si.c r1 = r1.mo107864Lo(r13, r2)     // Catch:{ Exception -> 0x0617 }
            if (r1 == 0) goto L_0x00ee
            r29 = 1
            goto L_0x00f0
        L_0x00ee:
            r29 = 0
        L_0x00f0:
            boolean r31 = p203mi.C76758b0.m92500e(r1)     // Catch:{ Exception -> 0x0617 }
            java.lang.String r0 = "scene:%s fromUser:%s todoId:%s appUsername:%s creator:%s operator:%s op:%s related_msgid:%s template:%s exist:%s state:%s shareKey:%s shareName:%s"
            r32 = r5
            r5 = 13
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0617 }
            r20 = 0
            r5[r20] = r10     // Catch:{ Exception -> 0x0617 }
            r17 = 1
            r5[r17] = r13     // Catch:{ Exception -> 0x0617 }
            r16 = 2
            r5[r16] = r2     // Catch:{ Exception -> 0x0617 }
            r41 = r2
            r2 = 3
            r5[r2] = r18     // Catch:{ Exception -> 0x0617 }
            r2 = 4
            r5[r2] = r8     // Catch:{ Exception -> 0x0617 }
            r33 = 5
            r5[r33] = r7     // Catch:{ Exception -> 0x0617 }
            r33 = 6
            java.lang.Integer r34 = java.lang.Integer.valueOf(r15)     // Catch:{ Exception -> 0x0617 }
            r5[r33] = r34     // Catch:{ Exception -> 0x0617 }
            r33 = 7
            java.lang.Long r34 = java.lang.Long.valueOf(r11)     // Catch:{ Exception -> 0x0617 }
            r5[r33] = r34     // Catch:{ Exception -> 0x0617 }
            java.lang.String r33 = com.tencent.p014mm.sdk.platformtools.Util.secPrint(r14)     // Catch:{ Exception -> 0x0617 }
            r34 = 8
            r5[r34] = r33     // Catch:{ Exception -> 0x0617 }
            r33 = 9
            java.lang.Boolean r35 = java.lang.Boolean.valueOf(r29)     // Catch:{ Exception -> 0x0617 }
            r5[r33] = r35     // Catch:{ Exception -> 0x0617 }
            r33 = 10
            if (r1 == 0) goto L_0x013b
            int r2 = r1.field_state     // Catch:{ Exception -> 0x0617 }
            goto L_0x013c
        L_0x013b:
            r2 = 0
        L_0x013c:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x0617 }
            r5[r33] = r2     // Catch:{ Exception -> 0x0617 }
            r2 = 11
            r5[r2] = r3     // Catch:{ Exception -> 0x0617 }
            r2 = 12
            r5[r2] = r4     // Catch:{ Exception -> 0x0617 }
            r2 = r28
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r0, r5)     // Catch:{ Exception -> 0x0622 }
            if (r1 == 0) goto L_0x01b7
            boolean r0 = r1.mo107863n2()     // Catch:{ Exception -> 0x0622 }
            if (r0 == 0) goto L_0x01b7
            f40.C86709a0.m107528h()     // Catch:{ Exception -> 0x0622 }
            k40.a r0 = f40.C86709a0.m107533q(r6)     // Catch:{ Exception -> 0x0622 }
            f62.k0 r0 = (f62.C75700k0) r0     // Catch:{ Exception -> 0x0622 }
            com.tencent.mm.storage.u3 r0 = r0.mo96097Ni()     // Catch:{ Exception -> 0x0622 }
            com.tencent.mm.storage.z1 r0 = r0.get(r13)     // Catch:{ Exception -> 0x0622 }
            if (r0 == 0) goto L_0x01b7
            r36 = r11
            long r11 = r0.f149538g1     // Catch:{ Exception -> 0x0622 }
            r26 = 0
            int r0 = (r11 > r26 ? 1 : (r11 == r26 ? 0 : -1))
            if (r0 != 0) goto L_0x01b9
            k40.a r0 = f40.C86709a0.m107533q(r6)     // Catch:{ Exception -> 0x0622 }
            f62.k0 r0 = (f62.C75700k0) r0     // Catch:{ Exception -> 0x0622 }
            g62.l r0 = r0.mo96095LE()     // Catch:{ Exception -> 0x0622 }
            java.lang.String r5 = r1.field_related_msgids     // Catch:{ Exception -> 0x0622 }
            long r11 = java.lang.Long.parseLong(r5)     // Catch:{ Exception -> 0x0622 }
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0     // Catch:{ Exception -> 0x0622 }
            com.tencent.mm.storage.f4 r0 = r0.h30(r13, r11)     // Catch:{ Exception -> 0x0622 }
            java.lang.String r5 = r1.field_related_msgids     // Catch:{ Exception -> 0x0622 }
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)     // Catch:{ Exception -> 0x0622 }
            if (r5 != 0) goto L_0x01b9
            java.lang.String r5 = r1.field_related_msgids     // Catch:{ Exception -> 0x0622 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0622 }
            r11.<init>()     // Catch:{ Exception -> 0x0622 }
            r12 = r14
            r28 = r15
            long r14 = r0.mo108774y2()     // Catch:{ Exception -> 0x0622 }
            r11.append(r14)     // Catch:{ Exception -> 0x0622 }
            r11.append(r9)     // Catch:{ Exception -> 0x0622 }
            java.lang.String r0 = r11.toString()     // Catch:{ Exception -> 0x0622 }
            boolean r0 = r5.contains(r0)     // Catch:{ Exception -> 0x0622 }
            if (r0 == 0) goto L_0x01bc
            java.lang.String r0 = "no handle clear roomCard"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)     // Catch:{ Exception -> 0x0622 }
            r1 = 0
            return r1
        L_0x01b7:
            r36 = r11
        L_0x01b9:
            r12 = r14
            r28 = r15
        L_0x01bc:
            r0 = r19
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r10, (java.lang.String) r0)     // Catch:{ Exception -> 0x0622 }
            if (r5 == 0) goto L_0x0239
            if (r1 == 0) goto L_0x0239
            boolean r5 = r1.mo107863n2()     // Catch:{ Exception -> 0x0622 }
            if (r5 == 0) goto L_0x0239
            long r14 = r1.field_createtime     // Catch:{ Exception -> 0x0622 }
            int r5 = (r22 > r14 ? 1 : (r22 == r14 ? 0 : -1))
            if (r5 <= 0) goto L_0x0239
            di3.d r5 = di3.C86312j.m106911c(r32)     // Catch:{ Exception -> 0x0622 }
            pi.d r5 = (p644pi.C77089d) r5     // Catch:{ Exception -> 0x0622 }
            si.d r5 = r5.wx0()     // Catch:{ Exception -> 0x0622 }
            boolean r5 = r5.mo107865jo(r1)     // Catch:{ Exception -> 0x0622 }
            k40.a r11 = f40.C86709a0.m107533q(r6)     // Catch:{ Exception -> 0x0622 }
            f62.k0 r11 = (f62.C75700k0) r11     // Catch:{ Exception -> 0x0622 }
            g62.l r11 = r11.mo96095LE()     // Catch:{ Exception -> 0x0622 }
            long r14 = r1.mo107862m2()     // Catch:{ Exception -> 0x0622 }
            com.tencent.mm.storage.g4 r11 = (com.tencent.p014mm.storage.C72972g4) r11     // Catch:{ Exception -> 0x0622 }
            com.tencent.mm.storage.f4 r11 = r11.h30(r13, r14)     // Catch:{ Exception -> 0x0622 }
            r11.mo108737Q2(r9)     // Catch:{ Exception -> 0x0622 }
            k40.a r14 = f40.C86709a0.m107533q(r6)     // Catch:{ Exception -> 0x0622 }
            f62.k0 r14 = (f62.C75700k0) r14     // Catch:{ Exception -> 0x0622 }
            g62.l r14 = r14.mo96095LE()     // Catch:{ Exception -> 0x0622 }
            r15 = r6
            r19 = r7
            long r6 = r11.getMsgId()     // Catch:{ Exception -> 0x0622 }
            com.tencent.mm.storage.g4 r14 = (com.tencent.p014mm.storage.C72972g4) r14     // Catch:{ Exception -> 0x0622 }
            r14.xy0(r6, r11)     // Catch:{ Exception -> 0x0622 }
            java.lang.String r6 = "ORIGIN_USERNAME_CHAT_INFO delete result:%s"
            r7 = 1
            java.lang.Object[] r11 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0622 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ Exception -> 0x0622 }
            r7 = 0
            r11[r7] = r5     // Catch:{ Exception -> 0x0622 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r6, r11)     // Catch:{ Exception -> 0x0622 }
            com.tencent.mm.autogen.events.NotifyGroupTodoEvent r5 = new com.tencent.mm.autogen.events.NotifyGroupTodoEvent     // Catch:{ Exception -> 0x0622 }
            r5.<init>()     // Catch:{ Exception -> 0x0622 }
            com.tencent.mm.autogen.events.NotifyGroupTodoEvent$a r6 = r5.f193762d     // Catch:{ Exception -> 0x0622 }
            java.lang.String r1 = r1.field_todoid     // Catch:{ Exception -> 0x0622 }
            r6.f193765c = r1     // Catch:{ Exception -> 0x0622 }
            r6.f193764b = r13     // Catch:{ Exception -> 0x0622 }
            r1 = 1
            r6.f193763a = r1     // Catch:{ Exception -> 0x0622 }
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch:{ Exception -> 0x0622 }
            r5.asyncPublish((android.os.Looper) r1)     // Catch:{ Exception -> 0x0622 }
            r1 = 0
            r29 = 0
            r31 = 0
            goto L_0x023c
        L_0x0239:
            r15 = r6
            r19 = r7
        L_0x023c:
            java.lang.String r5 = "sendtodo"
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r10, (java.lang.String) r5)     // Catch:{ Exception -> 0x0622 }
            java.lang.String r6 = "altertodo_revert"
            java.lang.String r7 = "replytodo"
            if (r5 != 0) goto L_0x026b
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r10, (java.lang.String) r0)     // Catch:{ Exception -> 0x0622 }
            if (r5 != 0) goto L_0x026b
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r10, (java.lang.String) r6)     // Catch:{ Exception -> 0x0622 }
            if (r5 != 0) goto L_0x026b
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r10, (java.lang.String) r7)     // Catch:{ Exception -> 0x0622 }
            if (r5 == 0) goto L_0x025d
            if (r31 == 0) goto L_0x025d
            goto L_0x026b
        L_0x025d:
            r23 = r6
            r26 = r7
            r22 = r8
            r41 = r12
            r21 = r15
            r11 = r36
            goto L_0x04c8
        L_0x026b:
            if (r1 != 0) goto L_0x02d3
            si.c r1 = new si.c     // Catch:{ Exception -> 0x0622 }
            r1.<init>()     // Catch:{ Exception -> 0x0622 }
            r5 = r41
            r1.field_todoid = r5     // Catch:{ Exception -> 0x0622 }
            r1.field_roomname = r13     // Catch:{ Exception -> 0x0622 }
            r41 = r12
            r11 = r22
            r1.field_createtime = r11     // Catch:{ Exception -> 0x0622 }
            r11 = r40
            r12 = r21
            java.lang.Object r12 = r11.get(r12)     // Catch:{ Exception -> 0x0622 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x0622 }
            r21 = r15
            r14 = 0
            long r14 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r12, r14)     // Catch:{ Exception -> 0x0622 }
            long r14 = r14 * r24
            r1.field_updatetime = r14     // Catch:{ Exception -> 0x0622 }
            r12 = r30
            java.lang.Object r12 = r11.get(r12)     // Catch:{ Exception -> 0x0622 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x0622 }
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r12)     // Catch:{ Exception -> 0x0622 }
            r1.field_username = r12     // Catch:{ Exception -> 0x0622 }
            java.lang.String r12 = ".sysmsg.todo.path"
            java.lang.Object r12 = r11.get(r12)     // Catch:{ Exception -> 0x0622 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x0622 }
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r12)     // Catch:{ Exception -> 0x0622 }
            r1.field_path = r12     // Catch:{ Exception -> 0x0622 }
            java.lang.String r12 = ".sysmsg.todo.custominfo"
            java.lang.Object r12 = r11.get(r12)     // Catch:{ Exception -> 0x0622 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x0622 }
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r12)     // Catch:{ Exception -> 0x0622 }
            r1.field_custominfo = r12     // Catch:{ Exception -> 0x0622 }
            java.lang.String r12 = ".sysmsg.todo.title"
            java.lang.Object r12 = r11.get(r12)     // Catch:{ Exception -> 0x0622 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x0622 }
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r12)     // Catch:{ Exception -> 0x0622 }
            r1.field_title = r12     // Catch:{ Exception -> 0x0622 }
            r1.field_creator = r8     // Catch:{ Exception -> 0x0622 }
            r1.field_shareKey = r3     // Catch:{ Exception -> 0x0622 }
            r1.field_shareName = r4     // Catch:{ Exception -> 0x0622 }
            goto L_0x02ed
        L_0x02d3:
            r11 = r40
            r5 = r41
            r41 = r12
            r12 = r21
            r21 = r15
            java.lang.Object r3 = r11.get(r12)     // Catch:{ Exception -> 0x0622 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0622 }
            r14 = 0
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r3, r14)     // Catch:{ Exception -> 0x0622 }
            long r3 = r3 * r24
            r1.field_updatetime = r3     // Catch:{ Exception -> 0x0622 }
        L_0x02ed:
            java.lang.String r3 = ".sysmsg.todo.manager"
            java.lang.Object r3 = r11.get(r3)     // Catch:{ Exception -> 0x0622 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0622 }
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r3)     // Catch:{ Exception -> 0x0622 }
            r1.field_manager = r3     // Catch:{ Exception -> 0x0622 }
            java.lang.String r3 = ".sysmsg.todo.nreply"
            java.lang.Object r3 = r11.get(r3)     // Catch:{ Exception -> 0x0622 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0622 }
            r4 = 0
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r3, (int) r4)     // Catch:{ Exception -> 0x0622 }
            r1.field_nreply = r3     // Catch:{ Exception -> 0x0622 }
            com.tencent.mm.autogen.events.NotifyGroupTodoEvent r3 = new com.tencent.mm.autogen.events.NotifyGroupTodoEvent     // Catch:{ Exception -> 0x0622 }
            r3.<init>()     // Catch:{ Exception -> 0x0622 }
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r10, (java.lang.String) r7)     // Catch:{ Exception -> 0x0622 }
            if (r4 != 0) goto L_0x0321
            if (r28 != 0) goto L_0x031a
            if (r31 == 0) goto L_0x031a
            goto L_0x0321
        L_0x031a:
            com.tencent.mm.autogen.events.NotifyGroupTodoEvent$a r4 = r3.f193762d     // Catch:{ Exception -> 0x0622 }
            r11 = r28
            r4.f193763a = r11     // Catch:{ Exception -> 0x0622 }
            goto L_0x0328
        L_0x0321:
            r11 = r28
            com.tencent.mm.autogen.events.NotifyGroupTodoEvent$a r4 = r3.f193762d     // Catch:{ Exception -> 0x0622 }
            r12 = 2
            r4.f193763a = r12     // Catch:{ Exception -> 0x0622 }
        L_0x0328:
            com.tencent.mm.autogen.events.NotifyGroupTodoEvent$a r4 = r3.f193762d     // Catch:{ Exception -> 0x0622 }
            r4.f193764b = r13     // Catch:{ Exception -> 0x0622 }
            r4.f193765c = r5     // Catch:{ Exception -> 0x0622 }
            java.lang.String r4 = "update msgSvrid:%s msgId:%s"
            if (r11 != 0) goto L_0x044f
            int r11 = r1.field_state     // Catch:{ Exception -> 0x0622 }
            r12 = 2
            if (r11 != r12) goto L_0x033b
            r11 = 0
            r1.field_state = r11     // Catch:{ Exception -> 0x0622 }
        L_0x033b:
            if (r29 == 0) goto L_0x03d0
            r11 = r36
            r1.mo107861l2(r11)     // Catch:{ Exception -> 0x0622 }
            di3.d r9 = di3.C86312j.m106911c(r32)     // Catch:{ Exception -> 0x0622 }
            pi.d r9 = (p644pi.C77089d) r9     // Catch:{ Exception -> 0x0622 }
            si.d r9 = r9.wx0()     // Catch:{ Exception -> 0x0622 }
            r9.getClass()     // Catch:{ Exception -> 0x0622 }
            long r14 = r1.systemRowid     // Catch:{ Exception -> 0x0622 }
            boolean r9 = r9.update((long) r14, r1)     // Catch:{ Exception -> 0x0622 }
            java.util.List<java.lang.Long> r14 = r1.f226492S     // Catch:{ Exception -> 0x0622 }
            java.util.ArrayList r14 = (java.util.ArrayList) r14     // Catch:{ Exception -> 0x0622 }
            java.util.Iterator r14 = r14.iterator()     // Catch:{ Exception -> 0x0622 }
        L_0x035d:
            boolean r15 = r14.hasNext()     // Catch:{ Exception -> 0x0622 }
            if (r15 == 0) goto L_0x03c7
            java.lang.Object r15 = r14.next()     // Catch:{ Exception -> 0x0622 }
            java.lang.Long r15 = (java.lang.Long) r15     // Catch:{ Exception -> 0x0622 }
            k40.a r22 = f40.C86709a0.m107533q(r21)     // Catch:{ Exception -> 0x0622 }
            f62.k0 r22 = (f62.C75700k0) r22     // Catch:{ Exception -> 0x0622 }
            g62.l r22 = r22.mo96095LE()     // Catch:{ Exception -> 0x0622 }
            r23 = r6
            r26 = r7
            long r6 = r15.longValue()     // Catch:{ Exception -> 0x0622 }
            r40 = r9
            r9 = r22
            com.tencent.mm.storage.g4 r9 = (com.tencent.p014mm.storage.C72972g4) r9     // Catch:{ Exception -> 0x0622 }
            com.tencent.mm.storage.f4 r6 = r9.h30(r13, r6)     // Catch:{ Exception -> 0x0622 }
            java.lang.String r7 = r6.f230738V     // Catch:{ Exception -> 0x0622 }
            java.lang.String r9 = r1.field_todoid     // Catch:{ Exception -> 0x0622 }
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r7, (java.lang.String) r9)     // Catch:{ Exception -> 0x0622 }
            if (r7 == 0) goto L_0x0392
            r22 = r8
            goto L_0x03be
        L_0x0392:
            r6.mo108737Q2(r5)     // Catch:{ Exception -> 0x0622 }
            k40.a r7 = f40.C86709a0.m107533q(r21)     // Catch:{ Exception -> 0x0622 }
            f62.k0 r7 = (f62.C75700k0) r7     // Catch:{ Exception -> 0x0622 }
            g62.l r7 = r7.mo96095LE()     // Catch:{ Exception -> 0x0622 }
            r22 = r8
            long r8 = r6.getMsgId()     // Catch:{ Exception -> 0x0622 }
            com.tencent.mm.storage.g4 r7 = (com.tencent.p014mm.storage.C72972g4) r7     // Catch:{ Exception -> 0x0622 }
            r7.xy0(r8, r6)     // Catch:{ Exception -> 0x0622 }
            r7 = 2
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0622 }
            r7 = 0
            r8[r7] = r15     // Catch:{ Exception -> 0x0622 }
            long r6 = r6.getMsgId()     // Catch:{ Exception -> 0x0622 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x0622 }
            r7 = 1
            r8[r7] = r6     // Catch:{ Exception -> 0x0622 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r4, r8)     // Catch:{ Exception -> 0x0622 }
        L_0x03be:
            r9 = r40
            r8 = r22
            r6 = r23
            r7 = r26
            goto L_0x035d
        L_0x03c7:
            r23 = r6
            r26 = r7
            r22 = r8
            r40 = r9
            goto L_0x0435
        L_0x03d0:
            r23 = r6
            r26 = r7
            r22 = r8
            r11 = r36
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0622 }
            r6.<init>()     // Catch:{ Exception -> 0x0622 }
            r6.append(r11)     // Catch:{ Exception -> 0x0622 }
            r6.append(r9)     // Catch:{ Exception -> 0x0622 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0622 }
            r1.field_related_msgids = r6     // Catch:{ Exception -> 0x0622 }
            di3.d r6 = di3.C86312j.m106911c(r32)     // Catch:{ Exception -> 0x0622 }
            pi.d r6 = (p644pi.C77089d) r6     // Catch:{ Exception -> 0x0622 }
            si.d r6 = r6.wx0()     // Catch:{ Exception -> 0x0622 }
            boolean r9 = r6.insert(r1)     // Catch:{ Exception -> 0x0622 }
            k40.a r1 = f40.C86709a0.m107533q(r21)     // Catch:{ Exception -> 0x0622 }
            f62.k0 r1 = (f62.C75700k0) r1     // Catch:{ Exception -> 0x0622 }
            g62.l r1 = r1.mo96095LE()     // Catch:{ Exception -> 0x0622 }
            com.tencent.mm.storage.g4 r1 = (com.tencent.p014mm.storage.C72972g4) r1     // Catch:{ Exception -> 0x0622 }
            com.tencent.mm.storage.f4 r1 = r1.h30(r13, r11)     // Catch:{ Exception -> 0x0622 }
            r1.mo108737Q2(r5)     // Catch:{ Exception -> 0x0622 }
            k40.a r5 = f40.C86709a0.m107533q(r21)     // Catch:{ Exception -> 0x0622 }
            f62.k0 r5 = (f62.C75700k0) r5     // Catch:{ Exception -> 0x0622 }
            g62.l r5 = r5.mo96095LE()     // Catch:{ Exception -> 0x0622 }
            long r6 = r1.getMsgId()     // Catch:{ Exception -> 0x0622 }
            com.tencent.mm.storage.g4 r5 = (com.tencent.p014mm.storage.C72972g4) r5     // Catch:{ Exception -> 0x0622 }
            r5.xy0(r6, r1)     // Catch:{ Exception -> 0x0622 }
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0622 }
            java.lang.Long r5 = java.lang.Long.valueOf(r11)     // Catch:{ Exception -> 0x0622 }
            r7 = 0
            r6[r7] = r5     // Catch:{ Exception -> 0x0622 }
            long r7 = r1.getMsgId()     // Catch:{ Exception -> 0x0622 }
            java.lang.Long r1 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x0622 }
            r5 = 1
            r6[r5] = r1     // Catch:{ Exception -> 0x0622 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r4, r6)     // Catch:{ Exception -> 0x0622 }
        L_0x0435:
            if (r9 == 0) goto L_0x043e
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch:{ Exception -> 0x0622 }
            r3.asyncPublish((android.os.Looper) r1)     // Catch:{ Exception -> 0x0622 }
        L_0x043e:
            java.lang.String r1 = "insertOrUpdateTodo result:%s"
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0622 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r9)     // Catch:{ Exception -> 0x0622 }
            r5 = 0
            r4[r5] = r3     // Catch:{ Exception -> 0x0622 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r1, r4)     // Catch:{ Exception -> 0x0622 }
            goto L_0x04c8
        L_0x044f:
            r23 = r6
            r26 = r7
            r22 = r8
            r11 = r36
            if (r29 == 0) goto L_0x04c8
            boolean r5 = p203mi.C76758b0.m92504i(r1)     // Catch:{ Exception -> 0x0622 }
            java.lang.String r6 = "delete result:%s"
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0622 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)     // Catch:{ Exception -> 0x0622 }
            r14 = 0
            r8[r14] = r7     // Catch:{ Exception -> 0x0622 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r6, r8)     // Catch:{ Exception -> 0x0622 }
            if (r5 == 0) goto L_0x0475
            android.os.Looper r5 = android.os.Looper.getMainLooper()     // Catch:{ Exception -> 0x0622 }
            r3.asyncPublish((android.os.Looper) r5)     // Catch:{ Exception -> 0x0622 }
        L_0x0475:
            java.util.List<java.lang.Long> r1 = r1.f226492S     // Catch:{ Exception -> 0x0622 }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ Exception -> 0x0622 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x0622 }
        L_0x047d:
            boolean r3 = r1.hasNext()     // Catch:{ Exception -> 0x0622 }
            if (r3 == 0) goto L_0x04c8
            java.lang.Object r3 = r1.next()     // Catch:{ Exception -> 0x0622 }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ Exception -> 0x0622 }
            k40.a r5 = f40.C86709a0.m107533q(r21)     // Catch:{ Exception -> 0x0622 }
            f62.k0 r5 = (f62.C75700k0) r5     // Catch:{ Exception -> 0x0622 }
            g62.l r5 = r5.mo96095LE()     // Catch:{ Exception -> 0x0622 }
            long r6 = r3.longValue()     // Catch:{ Exception -> 0x0622 }
            com.tencent.mm.storage.g4 r5 = (com.tencent.p014mm.storage.C72972g4) r5     // Catch:{ Exception -> 0x0622 }
            com.tencent.mm.storage.f4 r5 = r5.h30(r13, r6)     // Catch:{ Exception -> 0x0622 }
            r5.mo108737Q2(r9)     // Catch:{ Exception -> 0x0622 }
            k40.a r6 = f40.C86709a0.m107533q(r21)     // Catch:{ Exception -> 0x0622 }
            f62.k0 r6 = (f62.C75700k0) r6     // Catch:{ Exception -> 0x0622 }
            g62.l r6 = r6.mo96095LE()     // Catch:{ Exception -> 0x0622 }
            long r7 = r5.getMsgId()     // Catch:{ Exception -> 0x0622 }
            com.tencent.mm.storage.g4 r6 = (com.tencent.p014mm.storage.C72972g4) r6     // Catch:{ Exception -> 0x0622 }
            r6.xy0(r7, r5)     // Catch:{ Exception -> 0x0622 }
            r6 = 2
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0622 }
            r6 = 0
            r7[r6] = r3     // Catch:{ Exception -> 0x0622 }
            long r5 = r5.getMsgId()     // Catch:{ Exception -> 0x0622 }
            java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x0622 }
            r5 = 1
            r7[r5] = r3     // Catch:{ Exception -> 0x0622 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r4, r7)     // Catch:{ Exception -> 0x0622 }
            goto L_0x047d
        L_0x04c8:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r41)     // Catch:{ Exception -> 0x0622 }
            if (r1 != 0) goto L_0x0640
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r10, (java.lang.String) r0)     // Catch:{ Exception -> 0x0622 }
            if (r0 == 0) goto L_0x04f3
            java.lang.String r0 = eb0.C75592q0.m90789s()     // Catch:{ Exception -> 0x0622 }
            r1 = r22
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r1, (java.lang.String) r0)     // Catch:{ Exception -> 0x0622 }
            if (r0 == 0) goto L_0x04f0
            java.lang.String r0 = eb0.C75592q0.m90789s()     // Catch:{ Exception -> 0x0622 }
            r3 = r19
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r3, (java.lang.String) r0)     // Catch:{ Exception -> 0x0622 }
            if (r0 == 0) goto L_0x04f7
            r4 = r26
            r0 = 1
            goto L_0x04fa
        L_0x04f0:
            r3 = r19
            goto L_0x04f7
        L_0x04f3:
            r3 = r19
            r1 = r22
        L_0x04f7:
            r4 = r26
            r0 = 0
        L_0x04fa:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r10, (java.lang.String) r4)     // Catch:{ Exception -> 0x0622 }
            if (r5 != 0) goto L_0x0509
            r5 = r23
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r10, (java.lang.String) r5)     // Catch:{ Exception -> 0x0622 }
            if (r6 == 0) goto L_0x0528
            goto L_0x050b
        L_0x0509:
            r5 = r23
        L_0x050b:
            java.lang.String r6 = eb0.C75592q0.m90789s()     // Catch:{ Exception -> 0x0622 }
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r1, (java.lang.String) r6)     // Catch:{ Exception -> 0x0622 }
            boolean r7 = eb0.C45628s0.m50752Q(r13)     // Catch:{ Exception -> 0x0622 }
            java.lang.String r8 = eb0.C75592q0.m90789s()     // Catch:{ Exception -> 0x0622 }
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r3, (java.lang.String) r8)     // Catch:{ Exception -> 0x0622 }
            if (r8 != 0) goto L_0x0528
            if (r6 != 0) goto L_0x0528
            if (r7 != 0) goto L_0x0528
            if (r31 != 0) goto L_0x0528
            r0 = 1
        L_0x0528:
            k40.a r6 = f40.C86709a0.m107533q(r21)     // Catch:{ Exception -> 0x0622 }
            f62.k0 r6 = (f62.C75700k0) r6     // Catch:{ Exception -> 0x0622 }
            g62.l r6 = r6.mo96095LE()     // Catch:{ Exception -> 0x0622 }
            com.tencent.mm.storage.g4 r6 = (com.tencent.p014mm.storage.C72972g4) r6     // Catch:{ Exception -> 0x0622 }
            com.tencent.mm.storage.f4 r6 = r6.h30(r13, r11)     // Catch:{ Exception -> 0x0622 }
            int r7 = r6.f230723F     // Catch:{ Exception -> 0x0622 }
            r8 = 4
            r7 = r7 & r8
            r9 = 10000(0x2710, float:1.4013E-41)
            if (r7 == r8) goto L_0x0546
            int r6 = r6.getType()     // Catch:{ Exception -> 0x0622 }
            if (r6 != r9) goto L_0x0547
        L_0x0546:
            r0 = 1
        L_0x0547:
            if (r0 != 0) goto L_0x0640
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r10, (java.lang.String) r5)     // Catch:{ Exception -> 0x0622 }
            if (r0 == 0) goto L_0x0566
            java.lang.String r0 = eb0.C75592q0.m90789s()     // Catch:{ Exception -> 0x0622 }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r3, (java.lang.String) r0)     // Catch:{ Exception -> 0x0622 }
            if (r0 == 0) goto L_0x0566
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0622 }
            r1 = 2131823334(0x7f110ae6, float:1.9279465E38)
            java.lang.String r14 = r0.getString(r1)     // Catch:{ Exception -> 0x0622 }
            goto L_0x05d7
        L_0x0566:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r10, (java.lang.String) r4)     // Catch:{ Exception -> 0x0622 }
            if (r0 == 0) goto L_0x05a2
            java.lang.String r0 = eb0.C75592q0.m90789s()     // Catch:{ Exception -> 0x0622 }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r3, (java.lang.String) r0)     // Catch:{ Exception -> 0x0622 }
            if (r0 == 0) goto L_0x05a2
            java.lang.String r0 = eb0.C75592q0.m90789s()     // Catch:{ Exception -> 0x0622 }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r1, (java.lang.String) r0)     // Catch:{ Exception -> 0x0622 }
            if (r0 == 0) goto L_0x058c
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0622 }
            r1 = 2131823336(0x7f110ae8, float:1.9279469E38)
            java.lang.String r14 = r0.getString(r1)     // Catch:{ Exception -> 0x0622 }
            goto L_0x05d7
        L_0x058c:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0622 }
            r3 = 2131823335(0x7f110ae7, float:1.9279467E38)
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0622 }
            java.lang.CharSequence r1 = m92653d(r13, r1, r4)     // Catch:{ Exception -> 0x0622 }
            r4 = 0
            r5[r4] = r1     // Catch:{ Exception -> 0x0622 }
            java.lang.String r14 = r0.getString(r3, r5)     // Catch:{ Exception -> 0x0622 }
            goto L_0x05d7
        L_0x05a2:
            java.util.regex.Pattern r0 = f224684d     // Catch:{ Exception -> 0x0622 }
            r1 = r41
            java.util.regex.Matcher r0 = r0.matcher(r1)     // Catch:{ Exception -> 0x0622 }
            boolean r3 = r0.find()     // Catch:{ Exception -> 0x0622 }
            if (r3 == 0) goto L_0x05d6
            r3 = 0
            java.lang.String r0 = r0.group(r3)     // Catch:{ Exception -> 0x0622 }
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0622 }
            if (r3 != 0) goto L_0x05d6
            int r3 = r0.length()     // Catch:{ Exception -> 0x0622 }
            r4 = 3
            if (r3 <= r4) goto L_0x05d6
            int r3 = r0.length()     // Catch:{ Exception -> 0x0622 }
            r4 = 1
            int r3 = r3 - r4
            r5 = 2
            java.lang.String r3 = r0.substring(r5, r3)     // Catch:{ Exception -> 0x0622 }
            java.lang.CharSequence r3 = m92653d(r13, r3, r4)     // Catch:{ Exception -> 0x0622 }
            java.lang.String r14 = r1.replace(r0, r3)     // Catch:{ Exception -> 0x0622 }
            goto L_0x05d7
        L_0x05d6:
            r14 = r1
        L_0x05d7:
            com.tencent.mm.storage.f4 r0 = new com.tencent.mm.storage.f4     // Catch:{ Exception -> 0x0622 }
            r0.<init>()     // Catch:{ Exception -> 0x0622 }
            r1 = 0
            r0.mo108740T2(r1)     // Catch:{ Exception -> 0x0622 }
            r0.mo108749c3(r13)     // Catch:{ Exception -> 0x0622 }
            r1 = 3
            r0.mo100991d(r1)     // Catch:{ Exception -> 0x0622 }
            r0.mo108732L2(r14)     // Catch:{ Exception -> 0x0622 }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0622 }
            long r3 = r3 / r24
            long r3 = eb0.C75604z3.m90841m(r13, r3)     // Catch:{ Exception -> 0x0622 }
            r0.mo108733M2(r3)     // Catch:{ Exception -> 0x0622 }
            r0.setType(r9)     // Catch:{ Exception -> 0x0622 }
            int r1 = r0.mo108762o2()     // Catch:{ Exception -> 0x0622 }
            r1 = r1 | 8
            r0.mo108735O2(r1)     // Catch:{ Exception -> 0x0622 }
            long r0 = eb0.C75604z3.m90852x(r0)     // Catch:{ Exception -> 0x0622 }
            java.lang.String r3 = "insert template msgId:%s"
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0622 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0622 }
            r1 = 0
            r5[r1] = r0     // Catch:{ Exception -> 0x0622 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r5)     // Catch:{ Exception -> 0x0622 }
            goto L_0x0640
        L_0x0617:
            r0 = move-exception
            r2 = r28
            goto L_0x0626
        L_0x061b:
            r2 = r11
            java.lang.String r0 = "no contains todoid"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)     // Catch:{ Exception -> 0x0622 }
            goto L_0x0640
        L_0x0622:
            r0 = move-exception
            goto L_0x0626
        L_0x0624:
            r0 = move-exception
            r2 = r11
        L_0x0626:
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r4 = 0
            r1[r4] = r3
            java.lang.String r0 = r0.getMessage()
            r3 = 1
            r1[r3] = r0
            java.lang.String r0 = "consumeNewXml Exception:%s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r0, r1)
        L_0x0640:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p619ni.C76859h.mo10269X5(java.lang.String, java.util.Map, ob0.m$a):ob0.m$b");
    }
}
