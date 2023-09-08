package p203mi;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.util.WXWebReporter;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C50606nx1;
import te3.C50748ox1;

/* renamed from: mi.q */
public class C47046q extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f126423d;

    /* renamed from: e */
    public C11385n f126424e;

    /* renamed from: f */
    public String f126425f;

    /* renamed from: g */
    public String f126426g;

    /* renamed from: h */
    public int f126427h;

    /* renamed from: i */
    public String f126428i;

    /* renamed from: j */
    public int f126429j;

    /* renamed from: n */
    public String f126430n;

    public C47046q(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        this.f126430n = str;
        C50606nx1 nx12 = new C50606nx1();
        nx12.f138813d = str;
        bVar.f127066a = nx12;
        bVar.f127067b = new C50748ox1();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getchatroominfodetail";
        bVar.f127069d = WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_FROM_WEB;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f126423d = bVar.mo72403a();
        Log.m105925i("MicroMsg.NetSceneGetChatRoomInfoDetail", "chatRoomName:%s stack:%s", Util.nullAs(str, ""), Util.getStack().toString());
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f126424e = nVar;
        return dispatch(gVar, this.f126423d, this);
    }

    public int getType() {
        return WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_FROM_WEB;
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x03e0  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0350  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGYNetEnd(int r25, int r26, int r27, java.lang.String r28, com.tencent.p014mm.network.C114799u r29, byte[] r30) {
        /*
            r24 = this;
            r1 = r24
            r2 = r26
            r3 = r27
            r4 = r28
            java.lang.Class<f62.k0> r0 = f62.C75700k0.class
            java.lang.Class<pi.d> r5 = p644pi.C77089d.class
            java.lang.Class<a11.c> r6 = a11.C39479c.class
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "errType = "
            r7.append(r8)
            r7.append(r2)
            java.lang.String r8 = " errCode "
            r7.append(r8)
            r7.append(r3)
            java.lang.String r8 = " errMsg "
            r7.append(r8)
            r7.append(r4)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "MicroMsg.NetSceneGetChatRoomInfoDetail"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r7)
            if (r2 != 0) goto L_0x0408
            if (r3 != 0) goto L_0x0408
            java.lang.String r7 = "OK"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r7)
            ob0.c r7 = r1.f126423d
            ob0.c$d r7 = r7.f127056b
            pe3.a r7 = r7.f127083a
            te3.ox1 r7 = (te3.C50748ox1) r7
            boolean r9 = r7.isIncludeUnKnownField()
            java.lang.String r10 = "null"
            r11 = 2
            r12 = 1
            r13 = 0
            if (r9 == 0) goto L_0x008d
            k40.a r9 = f40.C86709a0.m107533q(r6)
            a11.c r9 = (a11.C39479c) r9
            eb0.m2 r9 = r9.mo62084mr()
            java.lang.String r14 = r1.f126430n
            com.tencent.mm.storage.n1 r9 = (com.tencent.p014mm.storage.C44662n1) r9
            com.tencent.mm.storage.m1 r14 = r9.mo69799Lo(r14)
            if (r14 == 0) goto L_0x0075
            java.lang.String r15 = com.tencent.p014mm.sdk.platformtools.BuildInfo.CLIENT_VERSION
            r14.field_saveByteVersion = r15
            r14.field_handleByteVersion = r15
            byte[] r15 = r7.getData()
            r14.field_roomInfoDetailResByte = r15
            boolean r9 = r9.replace(r14)
            goto L_0x0076
        L_0x0075:
            r9 = 0
        L_0x0076:
            java.lang.Object[] r15 = new java.lang.Object[r11]
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r15[r13] = r9
            if (r14 != 0) goto L_0x0082
            r9 = r10
            goto L_0x0086
        L_0x0082:
            java.lang.String r9 = r14.toString()
        L_0x0086:
            r15[r12] = r9
            java.lang.String r9 = "save response byte result:%s, member:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r9, r15)
        L_0x008d:
            java.lang.String r9 = r7.f139421d
            r1.f126425f = r9
            java.lang.String r9 = r7.f139431q
            r1.f126426g = r9
            int r9 = r7.f139422e
            r1.f126427h = r9
            java.lang.String r9 = r7.f139423f
            r1.f126428i = r9
            int r9 = r7.f139424g
            r1.f126429j = r9
            java.lang.String r9 = r7.f139428n
            int r14 = r7.f139425h
            java.lang.Class<kr0.u0> r15 = kr0.C27608u0.class
            di3.d r15 = di3.C86312j.m106911c(r15)
            kr0.u0 r15 = (kr0.C27608u0) r15
            java.lang.String r11 = r1.f126430n
            te3.qv3 r12 = r7.f139433s
            r15.mo55361sf(r11, r12)
            int r11 = r1.f126427h
            r12 = 7
            java.lang.Object[] r12 = new java.lang.Object[r12]
            java.lang.String r15 = r1.f126430n
            r12[r13] = r15
            java.lang.Integer r15 = java.lang.Integer.valueOf(r11)
            r16 = 1
            r12[r16] = r15
            int r15 = r1.f126429j
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r16 = 2
            r12[r16] = r15
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)
            r13 = 3
            r12[r13] = r15
            java.lang.String r15 = ""
            java.lang.String r16 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r9, (java.lang.String) r15)
            r13 = 4
            r12[r13] = r16
            r16 = 5
            boolean r17 = r7.isIncludeUnKnownField()
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r17)
            r12[r16] = r17
            r16 = 6
            int r13 = r7.f139430p
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12[r16] = r13
            java.lang.String r13 = "dz[onSceneEnd : get announcement successfully!] roomId:%s newVersion:%s AnnouncementPublishTime:%s chatRoomStatus:%s associateOpenIMRoomName:%s isIncludeUnKnownField:%s SpamStatus:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r13, r12)
            java.lang.String r12 = r1.f126430n
            java.lang.String r13 = r1.f126425f
            java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r13)
            r16 = r10
            java.lang.String r10 = r1.f126426g
            java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r10)
            java.lang.String r2 = r1.f126428i
            int r3 = r1.f126429j
            long r3 = (long) r3
            te3.wq2 r18 = eb0.C45612m0.f123381a
            r18 = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r19 = r9
            java.lang.String r9 = "setChatRoomNotice() called with: roomId = ["
            r8.append(r9)
            r8.append(r12)
            java.lang.String r9 = "],version = ["
            r8.append(r9)
            r8.append(r11)
            java.lang.String r9 = "], chatRoomStatus = ["
            r8.append(r9)
            r8.append(r14)
            java.lang.String r9 = "]"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "MicroMsg.ChatroomMembersLogic"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r9, r8)
            k40.a r8 = f40.C86709a0.m107533q(r6)
            a11.c r8 = (a11.C39479c) r8
            eb0.m2 r8 = r8.mo62084mr()
            com.tencent.mm.storage.n1 r8 = (com.tencent.p014mm.storage.C44662n1) r8
            r20 = r6
            com.tencent.mm.storage.m1 r6 = r8.mo69799Lo(r12)
            if (r6 != 0) goto L_0x0157
            r21 = r15
            goto L_0x01c9
        L_0x0157:
            r21 = r15
            java.lang.String r15 = r6.field_chatroomnotice
            r6.field_oldChatroomVersion = r11
            r6.field_chatroomnoticePublishTime = r3
            r6.field_chatroomnoticeEditor = r2
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r2 == 0) goto L_0x016a
            r2 = 0
            r6.field_chatroomNoticeNew = r2
        L_0x016a:
            r6.field_chatroomnotice = r13
            r6.field_xmlChatroomnotice = r10
            r6.field_chatroomStatus = r14
            r2 = 1
            r6.field_compactFlag = r2
            r8.replace(r6)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r2 == 0) goto L_0x01c9
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
            if (r2 != 0) goto L_0x01c9
            f40.C86709a0.m107528h()
            k40.a r2 = f40.C86709a0.m107533q(r0)
            f62.k0 r2 = (f62.C75700k0) r2
            com.tencent.mm.storage.u3 r2 = r2.mo96097Ni()
            com.tencent.mm.storage.z1 r2 = r2.get(r12)
            long r3 = r2.f149538g1
            r10 = 0
            r2.mo62859J3(r10)
            f40.C86709a0.m107528h()
            k40.a r6 = f40.C86709a0.m107533q(r0)
            f62.k0 r6 = (f62.C75700k0) r6
            com.tencent.mm.storage.u3 r6 = r6.mo96097Ni()
            r6.mo69668Q3(r2)
            r2 = 1
            java.lang.Object[] r6 = new java.lang.Object[r2]
            java.lang.Long r2 = java.lang.Long.valueOf(r3)
            r8 = 0
            r6[r8] = r2
            java.lang.String r2 = "clear room card, oldInfoId %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r2, r6)
            int r2 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r2 == 0) goto L_0x01c9
            java.lang.Class<f62.t0> r2 = f62.C75708t0.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            f62.t0 r2 = (f62.C75708t0) r2
            r2.Td0(r12, r3)
        L_0x01c9:
            java.lang.String r2 = r1.f126430n
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85820U5(r2)
            if (r2 == 0) goto L_0x0324
            k40.a r0 = f40.C86709a0.m107533q(r0)
            f62.k0 r0 = (f62.C75700k0) r0
            com.tencent.mm.storage.u3 r0 = r0.mo96097Ni()
            java.lang.String r2 = r1.f126430n
            long r3 = r7.f139426i
            r0.mo69698g3(r2, r3)
            java.lang.String r0 = r1.f126430n
            di3.d r2 = di3.C86312j.m106911c(r5)
            pi.d r2 = (p644pi.C77089d) r2
            si.f r2 = r2.xx0()
            si.e r2 = r2.mo60800jo(r0)
            if (r2 != 0) goto L_0x0201
            si.e r2 = new si.e
            r2.<init>()
            r2.field_chatroomname = r0
            r3 = 0
            r2.field_queryState = r3
            r3 = r2
            r2 = 0
            goto L_0x0203
        L_0x0201:
            r3 = r2
            r2 = 1
        L_0x0203:
            te3.cv3 r4 = r7.f139427j
            if (r4 == 0) goto L_0x024f
            java.util.LinkedList<te3.kv3> r6 = r4.f131989e
            int r6 = r6.size()
            if (r6 != 0) goto L_0x0210
            goto L_0x024f
        L_0x0210:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r8 = 0
        L_0x0216:
            java.util.LinkedList<te3.kv3> r9 = r4.f131989e
            int r9 = r9.size()
            if (r8 >= r9) goto L_0x0246
            java.util.LinkedList<te3.kv3> r9 = r4.f131989e
            java.lang.Object r9 = r9.get(r8)
            te3.kv3 r9 = (te3.C27676kv3) r9
            if (r9 == 0) goto L_0x023f
            com.tencent.mm.chatroom.storage.GroupToolItem r10 = new com.tencent.mm.chatroom.storage.GroupToolItem
            java.lang.String r11 = r9.f76618d
            r12 = r21
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r11, (java.lang.String) r12)
            java.lang.String r9 = r9.f76619e
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r9, (java.lang.String) r12)
            r10.<init>(r11, r9)
            r6.add(r10)
            goto L_0x0241
        L_0x023f:
            r12 = r21
        L_0x0241:
            int r8 = r8 + 1
            r21 = r12
            goto L_0x0216
        L_0x0246:
            r12 = r21
            java.lang.String r4 = p684si.C36674e.m41039m2(r6)
            r3.field_stickToollist = r4
            goto L_0x0253
        L_0x024f:
            r12 = r21
            r3.field_stickToollist = r12
        L_0x0253:
            if (r2 == 0) goto L_0x0267
            di3.d r2 = di3.C86312j.m106911c(r5)
            pi.d r2 = (p644pi.C77089d) r2
            si.f r2 = r2.xx0()
            r4 = 0
            java.lang.String[] r6 = new java.lang.String[r4]
            boolean r2 = r2.update(r3, r6)
            goto L_0x0276
        L_0x0267:
            r4 = 0
            di3.d r2 = di3.C86312j.m106911c(r5)
            pi.d r2 = (p644pi.C77089d) r2
            si.f r2 = r2.xx0()
            boolean r2 = r2.insert(r3)
        L_0x0276:
            r3 = 2
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r4] = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r2 = 1
            r6[r2] = r0
            java.lang.String r0 = "MicroMsg.roomtools.RoomToolsHelp"
            java.lang.String r2 = "updateStickToolsByGetChatRoomInfoDetail roomName:%s result:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r2, r6)
            java.lang.String r0 = r1.f126430n
            boolean r0 = eb0.C45628s0.m50750O(r0)
            if (r0 == 0) goto L_0x0321
            di3.d r0 = di3.C86312j.m106911c(r5)
            pi.d r0 = (p644pi.C77089d) r0
            si.b r0 = r0.vx0()
            java.lang.String r2 = r1.f126430n
            te3.av3 r3 = r7.f139429o
            java.lang.String r4 = "GroupBindApp"
            com.tencent.mm.sdk.storage.ISQLiteDatabase r6 = r0.f97467d
            boolean r8 = r6 instanceof zh3.C91753f
            if (r8 == 0) goto L_0x02aa
            zh3.f r6 = (zh3.C91753f) r6
            goto L_0x02ab
        L_0x02aa:
            r6 = 0
        L_0x02ab:
            java.lang.String r10 = "MicroMsg.GroupBindAppStorage"
            if (r6 == 0) goto L_0x02c0
            java.lang.Thread r11 = java.lang.Thread.currentThread()     // Catch:{ Exception -> 0x02bc }
            long r13 = r11.getId()     // Catch:{ Exception -> 0x02bc }
            long r13 = r6.beginTransaction(r13)     // Catch:{ Exception -> 0x02bc }
            goto L_0x02c2
        L_0x02bc:
            r0 = move-exception
            r23 = r12
            goto L_0x0319
        L_0x02c0:
            r13 = -1
        L_0x02c2:
            com.tencent.mm.sdk.storage.ISQLiteDatabase r11 = r0.f97467d     // Catch:{ Exception -> 0x02bc }
            java.lang.String r15 = "chatRoomName=?"
            r8 = 1
            java.lang.String[] r9 = new java.lang.String[r8]     // Catch:{ Exception -> 0x02bc }
            r22 = 0
            r9[r22] = r2     // Catch:{ Exception -> 0x02bc }
            int r9 = r11.delete(r4, r15, r9)     // Catch:{ Exception -> 0x02bc }
            long r8 = (long) r9     // Catch:{ Exception -> 0x02bc }
            java.lang.String r11 = "updateChatRoomBindApp, delete: %d"
            r23 = r12
            r15 = 1
            java.lang.Object[] r12 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x0318 }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ Exception -> 0x0318 }
            r12[r22] = r8     // Catch:{ Exception -> 0x0318 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r11, r12)     // Catch:{ Exception -> 0x0318 }
            if (r3 == 0) goto L_0x030c
            si.a r8 = new si.a     // Catch:{ Exception -> 0x0318 }
            r8.<init>()     // Catch:{ Exception -> 0x0318 }
            r8.field_chatRoomName = r2     // Catch:{ Exception -> 0x0318 }
            byte[] r2 = r3.toByteArray()     // Catch:{ Exception -> 0x0318 }
            r8.field_BindAppData = r2     // Catch:{ Exception -> 0x0318 }
            android.content.ContentValues r2 = r8.convertTo()     // Catch:{ Exception -> 0x0318 }
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r0.f97467d     // Catch:{ Exception -> 0x0318 }
            java.lang.String r3 = "chatRoomName"
            long r2 = r0.insert(r4, r3, r2)     // Catch:{ Exception -> 0x0318 }
            java.lang.String r0 = "updateChatRoomBindApp, insert: %d"
            r4 = 1
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0318 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ Exception -> 0x0318 }
            r3 = 0
            r8[r3] = r2     // Catch:{ Exception -> 0x0318 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r0, r8)     // Catch:{ Exception -> 0x0318 }
        L_0x030c:
            if (r6 == 0) goto L_0x0326
            r2 = -1
            int r0 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0326
            r6.endTransaction(r13)     // Catch:{ Exception -> 0x0318 }
            goto L_0x0326
        L_0x0318:
            r0 = move-exception
        L_0x0319:
            java.lang.String r0 = r0.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            goto L_0x0326
        L_0x0321:
            r23 = r12
            goto L_0x0326
        L_0x0324:
            r23 = r21
        L_0x0326:
            java.lang.String r0 = r1.f126430n
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85807K5(r0)
            if (r0 == 0) goto L_0x03fa
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r19)
            if (r0 != 0) goto L_0x03fa
            k40.a r0 = f40.C86709a0.m107533q(r20)
            a11.c r0 = (a11.C39479c) r0
            eb0.m2 r0 = r0.mo62084mr()
            java.lang.String r2 = r1.f126430n
            com.tencent.mm.storage.n1 r0 = (com.tencent.p014mm.storage.C44662n1) r0
            com.tencent.mm.storage.m1 r0 = r0.mo69799Lo(r2)
            if (r0 == 0) goto L_0x03e0
            java.lang.String r2 = r0.field_associateOpenIMRoomName
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x03e0
            k40.a r2 = f40.C86709a0.m107533q(r20)
            a11.c r2 = (a11.C39479c) r2
            eb0.m2 r2 = r2.mo62084mr()
            com.tencent.mm.storage.n1 r2 = (com.tencent.p014mm.storage.C44662n1) r2
            r3 = r19
            com.tencent.mm.storage.m1 r2 = r2.mo69799Lo(r3)
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r6 = r1.f126430n
            r8 = 0
            r4[r8] = r6
            boolean r6 = r0.mo69795w2()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r8 = 1
            r4[r8] = r6
            r6 = 2
            r4[r6] = r3
            if (r2 != 0) goto L_0x037d
            r10 = r16
            goto L_0x0385
        L_0x037d:
            boolean r6 = r2.mo69795w2()
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r6)
        L_0x0385:
            r6 = 3
            r4[r6] = r10
            java.lang.String r6 = "roomId %s finish %s, associateOpenIMRoomName %s finish %s"
            r8 = r18
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r6, r4)
            if (r2 == 0) goto L_0x03af
            boolean r4 = r2.mo69795w2()
            if (r4 != 0) goto L_0x03af
            r4 = 2
            r2.field_openIMRoomMigrateStatus = r4
            java.lang.String r4 = r1.f126430n
            r2.field_associateOpenIMRoomName = r4
            k40.a r4 = f40.C86709a0.m107533q(r20)
            a11.c r4 = (a11.C39479c) r4
            eb0.m2 r4 = r4.mo62084mr()
            com.tencent.mm.storage.n1 r4 = (com.tencent.p014mm.storage.C44662n1) r4
            r4.replace(r2)
            r13 = 1
            goto L_0x03b0
        L_0x03af:
            r13 = 0
        L_0x03b0:
            if (r13 == 0) goto L_0x03b6
            r2 = 1
            r0.field_openIMRoomMigrateStatus = r2
            goto L_0x03b9
        L_0x03b6:
            r2 = 3
            r0.field_openIMRoomMigrateStatus = r2
        L_0x03b9:
            r0.field_associateOpenIMRoomName = r3
            int r2 = r7.f139430p
            r0.field_spamStatus = r2
            k40.a r2 = f40.C86709a0.m107533q(r20)
            a11.c r2 = (a11.C39479c) r2
            eb0.m2 r2 = r2.mo62084mr()
            com.tencent.mm.storage.n1 r2 = (com.tencent.p014mm.storage.C44662n1) r2
            r2.replace(r0)
            if (r13 == 0) goto L_0x03fa
            di3.d r0 = di3.C86312j.m106911c(r5)
            pi.d r0 = (p644pi.C77089d) r0
            li.d r0 = r0.yx0()
            java.lang.String r2 = r1.f126430n
            r0.mo72068c(r2, r3)
            goto L_0x03fa
        L_0x03e0:
            r8 = r18
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            if (r0 != 0) goto L_0x03ea
            r10 = r16
            goto L_0x03f2
        L_0x03ea:
            java.lang.String r0 = r0.field_associateOpenIMRoomName
            r3 = r23
            java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r3)
        L_0x03f2:
            r3 = 0
            r2[r3] = r10
            java.lang.String r0 = "handleInfo member:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r8, r0, r2)
        L_0x03fa:
            int r0 = r7.f139430p
            zt3.t r2 = zt3.C119157j.f356862d
            mi.q$$a r3 = new mi.q$$a
            r3.<init>(r1, r0)
            zt3.j r2 = (zt3.C119157j) r2
            r2.mo183875f(r3)
        L_0x0408:
            ob0.n r0 = r1.f126424e
            r2 = r26
            r3 = r27
            r4 = r28
            r0.onSceneEnd(r2, r3, r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p203mi.C47046q.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.u, byte[]):void");
    }
}
