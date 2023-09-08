package com.tencent.p014mm.plugin.multitalk.model;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import as3.C103860b1;
import as3.C103878h1;
import bs3.C104161b;
import bs3.C104166f;
import c92.C104329g;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.RefreshMainUIMultitalkIconEvent;
import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105660m0;
import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105681q1;
import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105724z;
import com.tencent.p014mm.plugin.multitalk.model.C69856h;
import com.tencent.p014mm.plugin.voip.model.v2protocal;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import d62.C75339i;
import dd0.C75349f;
import di3.C86301e;
import di3.C86312j;
import ds3.C107064d;
import eb0.C75592q0;
import ei3.C86522b;
import f40.C86709a0;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import nw3.C109770a;
import nw3.C109779e;
import nw3.C109782f;
import p182kk.C61104a;
import p749xh.C78815k6;
import s82.C36638b;
import te3.ft4;
import te3.gs4;
import v82.C111423c1;
import v82.C111425d1;
import v82.C111452h1;
import z33.C91617n;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.multitalk.model.e0 */
public class C105795e0 extends C86301e implements C69856h {

    /* renamed from: d */
    public MMHandler f314598d = new MMHandler(Looper.getMainLooper());

    /* renamed from: e */
    public List<C69856h.C69857a> f314599e = new ArrayList();

    /* renamed from: f */
    public LinkedList<String> f314600f = null;

    /* renamed from: g */
    public LinkedList<String> f314601g = new LinkedList<>();

    /* renamed from: h */
    public LinkedList<String> f314602h = new LinkedList<>();

    /* renamed from: com.tencent.mm.plugin.multitalk.model.e0$a */
    public class C105796a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f314603d;

        public C105796a(String str) {
            this.f314603d = str;
        }

        public void run() {
            C105795e0.this.mo96147oW(this.f314603d);
            RefreshMainUIMultitalkIconEvent refreshMainUIMultitalkIconEvent = new RefreshMainUIMultitalkIconEvent();
            refreshMainUIMultitalkIconEvent.f310010d.f310011a = 2;
            refreshMainUIMultitalkIconEvent.publish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.model.e0$b */
    public class C105797b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C69856h.C69857a f314605d;

        /* renamed from: e */
        public final /* synthetic */ String f314606e;

        public C105797b(C105795e0 e0Var, C69856h.C69857a aVar, String str) {
            this.f314605d = aVar;
            this.f314606e = str;
        }

        public void run() {
            this.f314605d.mo96154a3(this.f314606e);
        }
    }

    public final boolean Ax0(String str, gs4 gs4) {
        int i = 0;
        if (gs4 == null) {
            return false;
        }
        C75349f fVar = new C75349f();
        fVar.field_wxGroupId = str;
        fVar.field_groupId = gs4.f331982f;
        long j = gs4.f331981e;
        fVar.field_roomId = (int) j;
        fVar.field_roomKey = 0;
        fVar.field_routeId = 0;
        fVar.field_inviteUserName = gs4.f331986j;
        fVar.field_ilinkRoomId = j;
        LinkedList<ft4> linkedList = gs4.f331983g;
        if (linkedList.size() > 0) {
            i = linkedList.size();
        }
        fVar.field_memberCount = i;
        fVar.field_createTime = System.currentTimeMillis();
        return C105851w0.yx0().mo107807jo(str) == null ? C105851w0.yx0().mo107805Lo(fVar) : C105851w0.yx0().mo107808qq(fVar);
    }

    public boolean Bu0(String str, String str2) {
        return C105851w0.Ax0().mo60775Lo(str, str2) != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0099, code lost:
        if (r0 != null) goto L_0x009b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bx0() {
        /*
            r15 = this;
            s82.a r0 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.yx0()
            java.lang.String r1 = "MicroMsg.MultiTalk.storage.MultiTalkInfoStorage"
            r2 = 0
            java.lang.String[] r3 = new java.lang.String[r2]
            java.lang.String r4 = "select wxGroupId, groupId, roomId, roomKey, routeId, createTime, ilinkRoomId from MultiTalkInfo"
            android.database.Cursor r0 = r0.rawQuery(r4, r3)
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
        L_0x0014:
            r4 = 1
            if (r0 == 0) goto L_0x0099
            boolean r5 = r0.moveToNext()     // Catch:{ Exception -> 0x008f }
            if (r5 == 0) goto L_0x0099
            dd0.f r5 = new dd0.f     // Catch:{ Exception -> 0x008f }
            r5.<init>()     // Catch:{ Exception -> 0x008f }
            java.lang.String r6 = r0.getString(r2)     // Catch:{ Exception -> 0x008f }
            r5.field_wxGroupId = r6     // Catch:{ Exception -> 0x008f }
            java.lang.String r6 = r0.getString(r4)     // Catch:{ Exception -> 0x008f }
            r5.field_groupId = r6     // Catch:{ Exception -> 0x008f }
            r6 = 2
            int r7 = r0.getInt(r6)     // Catch:{ Exception -> 0x008f }
            r5.field_roomId = r7     // Catch:{ Exception -> 0x008f }
            r7 = 3
            long r8 = r0.getLong(r7)     // Catch:{ Exception -> 0x008f }
            r5.field_roomKey = r8     // Catch:{ Exception -> 0x008f }
            r8 = 4
            int r9 = r0.getInt(r8)     // Catch:{ Exception -> 0x008f }
            r5.field_routeId = r9     // Catch:{ Exception -> 0x008f }
            r9 = 5
            long r10 = r0.getLong(r9)     // Catch:{ Exception -> 0x008f }
            r5.field_createTime = r10     // Catch:{ Exception -> 0x008f }
            r10 = 6
            long r11 = r0.getLong(r10)     // Catch:{ Exception -> 0x008f }
            r5.field_ilinkRoomId = r11     // Catch:{ Exception -> 0x008f }
            java.lang.String r11 = "getMultiTalkInfoList got value for wxGroupId = %s, groupId=%s, roomId = %d, roomKey = %d, routeId = %d, createTime=%d, ilinkroomid = %d"
            r12 = 7
            java.lang.Object[] r12 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x008f }
            java.lang.String r13 = r5.field_wxGroupId     // Catch:{ Exception -> 0x008f }
            r12[r2] = r13     // Catch:{ Exception -> 0x008f }
            java.lang.String r13 = r5.field_groupId     // Catch:{ Exception -> 0x008f }
            r12[r4] = r13     // Catch:{ Exception -> 0x008f }
            int r13 = r5.field_roomId     // Catch:{ Exception -> 0x008f }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x008f }
            r12[r6] = r13     // Catch:{ Exception -> 0x008f }
            long r13 = r5.field_roomKey     // Catch:{ Exception -> 0x008f }
            java.lang.Long r6 = java.lang.Long.valueOf(r13)     // Catch:{ Exception -> 0x008f }
            r12[r7] = r6     // Catch:{ Exception -> 0x008f }
            int r6 = r5.field_routeId     // Catch:{ Exception -> 0x008f }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x008f }
            r12[r8] = r6     // Catch:{ Exception -> 0x008f }
            long r6 = r5.field_createTime     // Catch:{ Exception -> 0x008f }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x008f }
            r12[r9] = r6     // Catch:{ Exception -> 0x008f }
            long r6 = r5.field_ilinkRoomId     // Catch:{ Exception -> 0x008f }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x008f }
            r12[r10] = r6     // Catch:{ Exception -> 0x008f }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r11, r12)     // Catch:{ Exception -> 0x008f }
            r3.add(r5)     // Catch:{ Exception -> 0x008f }
            goto L_0x0014
        L_0x008d:
            r1 = move-exception
            goto L_0x0095
        L_0x008f:
            java.lang.String r2 = "getMultiTalkInfoList error!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)     // Catch:{ all -> 0x008d }
            goto L_0x009b
        L_0x0095:
            r0.close()
            throw r1
        L_0x0099:
            if (r0 == 0) goto L_0x009e
        L_0x009b:
            r0.close()
        L_0x009e:
            java.lang.String r0 = "MicroMsg.MultiTalkRoomListMsg"
            java.lang.String r1 = "setMultitalkingwxGroupIdMap reset!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r15.f314600f = r0
            java.util.Iterator r0 = r3.iterator()
        L_0x00b0:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00c4
            java.lang.Object r1 = r0.next()
            dd0.f r1 = (dd0.C75349f) r1
            java.util.LinkedList<java.lang.String> r2 = r15.f314600f
            java.lang.String r1 = r1.field_wxGroupId
            r2.add(r1)
            goto L_0x00b0
        L_0x00c4:
            com.tencent.mm.autogen.events.RefreshMainUIMultitalkIconEvent r0 = new com.tencent.mm.autogen.events.RefreshMainUIMultitalkIconEvent
            r0.<init>()
            com.tencent.mm.autogen.events.RefreshMainUIMultitalkIconEvent$a r1 = r0.f310010d
            r1.f310011a = r4
            r0.publish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.multitalk.model.C105795e0.Bx0():void");
    }

    public void Cx0(String str, C103878h1 h1Var) {
        C103860b1[] b1VarArr;
        String str2 = str;
        C103878h1 h1Var2 = h1Var;
        Log.m105925i("MicroMsg.MultiTalkRoomListMsg", "showBanner  wxGroupId = %s", str2);
        if (!(h1Var2 == null || (b1VarArr = h1Var2.f307019h) == null || b1VarArr.length <= 0)) {
            C105851w0.Ax0().mo60778c(str2);
            for (C103860b1 b1Var : b1VarArr) {
                C36638b bVar = new C36638b();
                bVar.field_wxGroupId = str2;
                bVar.field_inviteUserName = b1Var.f306907t;
                bVar.field_memberUuid = (long) b1Var.f306889b;
                bVar.field_userName = b1Var.f306906s;
                bVar.field_status = b1Var.f306891d;
                if (!C105851w0.Ax0().mo60777Yt(bVar)) {
                    Log.m105921e("MicroMsg.MultiTalkRoomListMsg", "save multiTalkMember failure! wxGroupId = %s,userName = %s,field_memberUuid = %d,multiTalkMember.field_inviteUserName = %s", str2, b1Var.f306906s, Long.valueOf(bVar.field_memberUuid), bVar.field_inviteUserName);
                }
                Log.m105925i("MicroMsg.MultiTalkRoomListMsg", "save multiTalkMember success! wxGroupId = %s,userName = %s,field_memberUuid = %d,multiTalkMember.field_inviteUserName = %s", str2, b1Var.f306906s, Long.valueOf(bVar.field_memberUuid), bVar.field_inviteUserName);
            }
        }
        if (zx0(str, h1Var)) {
            vx0(str);
        }
        wx0(str);
    }

    /* renamed from: Df */
    public boolean mo96132Df() {
        return C105851w0.zx0().mo150682x() && (C105851w0.zx0().f314505s == C111452h1.Starting || C105851w0.zx0().f314505s == C111452h1.Creating);
    }

    public void Dx0(String str, gs4 gs4) {
        LinkedList<ft4> linkedList;
        Log.m105925i("MicroMsg.MultiTalkRoomListMsg", "showBanner  wxGroupId = %s", str);
        if (!(gs4 == null || (linkedList = gs4.f331983g) == null || linkedList.size() <= 0)) {
            C105851w0.Ax0().mo60778c(str);
            Iterator<ft4> it = linkedList.iterator();
            while (it.hasNext()) {
                ft4 next = it.next();
                C36638b bVar = new C36638b();
                bVar.field_wxGroupId = str;
                bVar.field_inviteUserName = gs4.f331986j;
                bVar.field_memberUuid = 0;
                bVar.field_userName = next.f133679d.f133116d;
                int i = next.f133680e;
                bVar.field_status = 20;
                if (i == 1) {
                    bVar.field_status = 10;
                }
                if (i == 2 || i == 3) {
                    bVar.field_status = 1;
                }
                if (!C105851w0.Ax0().mo60776Ow(bVar)) {
                    Log.m105921e("MicroMsg.MultiTalkRoomListMsg", "save multiTalkMember failure! wxGroupId = %s,userName = %s,field_memberUuid = %d,multiTalkMember.field_inviteUserName = %s", str, next.f133679d.f133116d, Long.valueOf(bVar.field_memberUuid), bVar.field_inviteUserName);
                }
                Log.m105925i("MicroMsg.MultiTalkRoomListMsg", "save multiTalkMember success! wxGroupId = %s,userName = %s,field_memberUuid = %d,multiTalkMember.field_inviteUserName = %s, status=%d", str, next.f133679d.f133116d, Long.valueOf(bVar.field_memberUuid), bVar.field_inviteUserName, Integer.valueOf(bVar.field_status));
            }
        }
        if (Ax0(str, gs4)) {
            vx0(str);
        }
        wx0(str);
    }

    /* renamed from: ED */
    public boolean mo96133ED() {
        return C91617n.m114970h() || C105851w0.zx0().mo150684z() || C105851w0.zx0().mo150682x() || C105851w0.zx0().mo150683y();
    }

    public void Ex0(String str, C103878h1 h1Var) {
        String str2;
        boolean z;
        C103860b1[] b1VarArr;
        C103860b1[] b1VarArr2;
        C103860b1[] b1VarArr3;
        String str3;
        String str4 = str;
        C103878h1 h1Var2 = h1Var;
        boolean z2 = true;
        char c = 0;
        String str5 = "MicroMsg.MultiTalkRoomListMsg";
        Log.m105925i(str5, "updateBanner  wxGroupId = %s", str4);
        C75349f jo = C105851w0.yx0().mo107807jo(str4);
        if (jo == null) {
            Log.m105924i(str5, "change,still show banner.");
            Cx0(str, h1Var);
        } else if (jo.field_roomId != h1Var2.f307014c) {
            Log.m105924i(str5, "roomid has changed! now return!multiTalkInfo.field_roomId:" + jo.field_roomId + ", bannerinfo.roomid:" + h1Var2.f307014c);
        } else {
            C103860b1[] b1VarArr4 = h1Var2.f307019h;
            LinkedList linkedList = new LinkedList();
            for (C103860b1 b1Var : b1VarArr4) {
                linkedList.add(b1Var.f306906s);
            }
            C36638b bVar = null;
            String str6 = (String) C86709a0.m107535s().mo121142i().mo119684e(2, (Object) null);
            if (str6 == null) {
                Log.m105924i(str5, "myUserName is null , go save delete all logic.");
                zx0(str, h1Var);
                str2 = str5;
            } else {
                LinkedList<C36638b> qq = C105851w0.Ax0().mo60780qq(str4);
                LinkedList linkedList2 = new LinkedList();
                for (C36638b next : qq) {
                    linkedList2.add(next.field_userName);
                    if (next.field_userName.equals(str6)) {
                        bVar = next;
                    }
                }
                int i = 4;
                if (bVar == null || !linkedList.contains(str6)) {
                    C103860b1[] b1VarArr5 = b1VarArr4;
                    str2 = str5;
                    b1VarArr = b1VarArr5;
                    z = true;
                } else {
                    int length = b1VarArr4.length;
                    int i2 = 0;
                    z = true;
                    while (i2 < length) {
                        C103860b1 b1Var2 = b1VarArr4[i2];
                        String str7 = b1Var2.f306906s;
                        if (str7 == null || !str7.equals(str6) || b1Var2.f306891d == bVar.field_status) {
                            b1VarArr3 = b1VarArr4;
                            str3 = str5;
                        } else {
                            C36638b bVar2 = new C36638b();
                            bVar2.field_wxGroupId = str4;
                            bVar2.field_inviteUserName = b1Var2.f306907t;
                            b1VarArr3 = b1VarArr4;
                            bVar2.field_memberUuid = (long) b1Var2.f306889b;
                            bVar2.field_userName = b1Var2.f306906s;
                            bVar2.field_status = b1Var2.f306891d;
                            if (!C105851w0.Ax0().mo60777Yt(bVar2)) {
                                Object[] objArr = new Object[4];
                                objArr[c] = str4;
                                objArr[1] = b1Var2.f306906s;
                                str3 = str5;
                                objArr[2] = Long.valueOf(bVar2.field_memberUuid);
                                objArr[3] = bVar2.field_inviteUserName;
                                Log.m105921e(str3, "updateMultiTalkMembers update myself failure! wxGroupId = %s,userName = %s,field_memberUuid = %d,multiTalkMember.field_inviteUserName = %s", objArr);
                                z = false;
                            } else {
                                str3 = str5;
                            }
                            Log.m105925i(str3, "updateMultiTalkMembers update myself success! wxGroupId = %s,userName = %s,field_memberUuid = %d,multiTalkMember.field_inviteUserName = %s", str4, b1Var2.f306906s, Long.valueOf(bVar2.field_memberUuid), bVar2.field_inviteUserName);
                        }
                        i2++;
                        str5 = str3;
                        b1VarArr4 = b1VarArr3;
                        c = 0;
                    }
                    C103860b1[] b1VarArr6 = b1VarArr4;
                    str2 = str5;
                    b1VarArr = b1VarArr6;
                }
                int length2 = b1VarArr.length;
                int i3 = 0;
                while (i3 < length2) {
                    C103860b1 b1Var3 = b1VarArr[i3];
                    if (!linkedList2.contains(b1Var3.f306906s)) {
                        C36638b bVar3 = new C36638b();
                        bVar3.field_wxGroupId = str4;
                        bVar3.field_inviteUserName = b1Var3.f306907t;
                        bVar3.field_memberUuid = (long) b1Var3.f306889b;
                        bVar3.field_userName = b1Var3.f306906s;
                        bVar3.field_status = b1Var3.f306891d;
                        if (!C105851w0.Ax0().mo60777Yt(bVar3)) {
                            Object[] objArr2 = new Object[i];
                            objArr2[0] = str4;
                            objArr2[1] = b1Var3.f306906s;
                            objArr2[2] = Long.valueOf(bVar3.field_memberUuid);
                            objArr2[3] = bVar3.field_inviteUserName;
                            Log.m105921e(str2, "updateMultiTalkMembers save multiTalkMember failure! wxGroupId = %s,userName = %s,field_memberUuid = %d,multiTalkMember.field_inviteUserName = %s", objArr2);
                            z = false;
                        }
                        Object[] objArr3 = new Object[i];
                        objArr3[0] = str4;
                        objArr3[1] = b1Var3.f306906s;
                        b1VarArr2 = b1VarArr;
                        objArr3[2] = Long.valueOf(bVar3.field_memberUuid);
                        objArr3[3] = bVar3.field_inviteUserName;
                        Log.m105925i(str2, "updateMultiTalkMembers save multiTalkMember success! wxGroupId = %s,userName = %s,field_memberUuid = %d,multiTalkMember.field_inviteUserName = %s", objArr3);
                    } else {
                        b1VarArr2 = b1VarArr;
                    }
                    i3++;
                    b1VarArr = b1VarArr2;
                    i = 4;
                }
                Iterator it = linkedList2.iterator();
                z2 = z;
                while (it.hasNext()) {
                    String str8 = (String) it.next();
                    if (!linkedList.contains(str8)) {
                        if (C105851w0.Ax0().mo60779jo(str4, str8)) {
                            Log.m105924i(str2, "updateMultiTalkMembers delete success for wxGroupId = " + str4 + ", username = " + str8);
                        } else {
                            Log.m105920e(str2, "updateMultiTalkMembers delete fail for wxGroupId = " + str4 + ", username = " + str8);
                            z2 = false;
                        }
                    }
                }
            }
            if (!z2) {
                Log.m105920e(str2, "update multiTalkMember failure!");
            } else {
                wx0(str);
            }
        }
    }

    /* renamed from: FA */
    public synchronized void mo96134FA(C69856h.C69857a aVar) {
        ((ArrayList) this.f314599e).add(aVar);
    }

    public void Fx0(String str, gs4 gs4) {
        int i;
        Iterator<ft4> it;
        int i2;
        int i3;
        String str2 = str;
        gs4 gs42 = gs4;
        int i4 = 1;
        Log.m105925i("MicroMsg.MultiTalkRoomListMsg", "updateBanner  wxGroupId = %s", str2);
        C75349f jo = C105851w0.yx0().mo107807jo(str2);
        if (jo == null) {
            Log.m105924i("MicroMsg.MultiTalkRoomListMsg", "change,still show banner.");
            Dx0(str, gs4);
        } else if (jo.field_ilinkRoomId != gs42.f331981e) {
            Log.m105924i("MicroMsg.MultiTalkRoomListMsg", "roomid has changed! now return!multiTalkInfo.field_roomId:" + jo.field_roomId + "bannerinfo.roomid:" + gs42.f331981e);
        } else {
            LinkedList<ft4> linkedList = gs42.f331983g;
            LinkedList linkedList2 = new LinkedList();
            Iterator<ft4> it4 = linkedList.iterator();
            while (it4.hasNext()) {
                linkedList2.add(it4.next().f133679d.f133116d);
            }
            C36638b bVar = null;
            int i5 = 2;
            String str3 = (String) C86709a0.m107535s().mo121142i().mo119684e(2, (Object) null);
            if (str3 == null) {
                Log.m105924i("MicroMsg.MultiTalkRoomListMsg", "myUserName is null , go save delete all logic.");
                Ax0(str, gs4);
            } else {
                LinkedList<C36638b> qq = C105851w0.Ax0().mo60780qq(str2);
                LinkedList linkedList3 = new LinkedList();
                for (C36638b next : qq) {
                    linkedList3.add(next.field_userName);
                    if (next.field_userName.equals(str3)) {
                        bVar = next;
                    }
                }
                long j = 0;
                int i6 = 3;
                if (bVar == null || !linkedList2.contains(str3)) {
                    i = 1;
                } else {
                    Iterator<ft4> it5 = linkedList.iterator();
                    i = 1;
                    while (it5.hasNext()) {
                        ft4 next2 = it5.next();
                        int i7 = next2.f133680e;
                        int i8 = (i7 == i5 || i7 == i6) ? 1 : i7 == 1 ? 10 : 20;
                        String str4 = next2.f133679d.f133116d;
                        if (!(str4 == null || !str4.equals(str3) || next2.f133680e == bVar.field_status)) {
                            C36638b bVar2 = new C36638b();
                            bVar2.field_wxGroupId = str2;
                            bVar2.field_inviteUserName = gs42.f331986j;
                            bVar2.field_memberUuid = j;
                            bVar2.field_userName = next2.f133679d.f133116d;
                            bVar2.field_status = i8;
                            if (!C105851w0.Ax0().mo60776Ow(bVar2)) {
                                Log.m105921e("MicroMsg.MultiTalkRoomListMsg", "updateMultiTalkMembers update myself failure! wxGroupId = %s,userName = %s,field_memberUuid = %d,multiTalkMember.field_inviteUserName = %s", str2, next2.f133679d.f133116d, Long.valueOf(bVar2.field_memberUuid), bVar2.field_inviteUserName);
                                i3 = 5;
                                i = 0;
                            } else {
                                i3 = 5;
                            }
                            Object[] objArr = new Object[i3];
                            objArr[0] = str2;
                            objArr[1] = next2.f133679d.f133116d;
                            objArr[2] = Long.valueOf(bVar2.field_memberUuid);
                            objArr[3] = bVar2.field_inviteUserName;
                            objArr[4] = Integer.valueOf(bVar2.field_status);
                            Log.m105925i("MicroMsg.MultiTalkRoomListMsg", "updateMultiTalkMembers update myself success! wxGroupId = %s,userName = %s,field_memberUuid = %d,multiTalkMember.field_inviteUserName = %s, status=%d", objArr);
                        }
                        i5 = 2;
                        j = 0;
                        i6 = 3;
                    }
                }
                Iterator<ft4> it6 = linkedList.iterator();
                int i9 = i;
                while (it6.hasNext()) {
                    ft4 next3 = it6.next();
                    if (!linkedList3.contains(next3.f133679d.f133116d)) {
                        C36638b bVar3 = new C36638b();
                        bVar3.field_wxGroupId = str2;
                        bVar3.field_inviteUserName = gs42.f331986j;
                        bVar3.field_memberUuid = 0;
                        bVar3.field_userName = next3.f133679d.f133116d;
                        bVar3.field_status = 20;
                        int i15 = next3.f133680e;
                        if (i15 == i4) {
                            bVar3.field_status = 10;
                        }
                        if (i15 == 2 || i15 == 3) {
                            bVar3.field_status = i4;
                        }
                        if (!C105851w0.Ax0().mo60776Ow(bVar3)) {
                            Object[] objArr2 = new Object[4];
                            objArr2[0] = str2;
                            objArr2[i4] = next3.f133679d.f133116d;
                            objArr2[2] = Long.valueOf(bVar3.field_memberUuid);
                            objArr2[3] = bVar3.field_inviteUserName;
                            Log.m105921e("MicroMsg.MultiTalkRoomListMsg", "updateMultiTalkMembers save multiTalkMember failure! wxGroupId = %s,userName = %s,field_memberUuid = %d,multiTalkMember.field_inviteUserName = %s", objArr2);
                            i2 = 5;
                            i9 = 0;
                        } else {
                            i2 = 5;
                        }
                        Object[] objArr3 = new Object[i2];
                        objArr3[0] = str2;
                        objArr3[i4] = next3.f133679d.f133116d;
                        it = it6;
                        objArr3[2] = Long.valueOf(bVar3.field_memberUuid);
                        objArr3[3] = bVar3.field_inviteUserName;
                        objArr3[4] = Integer.valueOf(bVar3.field_status);
                        Log.m105925i("MicroMsg.MultiTalkRoomListMsg", "updateMultiTalkMembers save multiTalkMember success! wxGroupId = %s,userName = %s,field_memberUuid = %d,multiTalkMember.field_inviteUserName = %s, status=%d", objArr3);
                    } else {
                        it = it6;
                    }
                    it6 = it;
                    i4 = 1;
                }
                Iterator it7 = linkedList3.iterator();
                i4 = i9;
                while (it7.hasNext()) {
                    String str5 = (String) it7.next();
                    if (!linkedList2.contains(str5)) {
                        if (C105851w0.Ax0().mo60779jo(str2, str5)) {
                            Log.m105924i("MicroMsg.MultiTalkRoomListMsg", "updateMultiTalkMembers delete success for wxGroupId = " + str2 + ", username = " + str5);
                        } else {
                            Log.m105920e("MicroMsg.MultiTalkRoomListMsg", "updateMultiTalkMembers delete fail for wxGroupId = " + str2 + ", username = " + str5);
                            i4 = 0;
                        }
                    }
                }
            }
            if (i4 == 0) {
                Log.m105920e("MicroMsg.MultiTalkRoomListMsg", "update multiTalkMember failure!");
            } else {
                wx0(str);
            }
        }
    }

    public List<String> G10(String str) {
        LinkedList<C36638b> qq = C105851w0.Ax0().mo60780qq(str);
        LinkedList linkedList = new LinkedList();
        for (C36638b bVar : qq) {
            linkedList.add(bVar.field_userName);
        }
        return linkedList;
    }

    /* renamed from: HE */
    public boolean mo96136HE(String str) {
        C75349f fVar = (C75349f) W30(str);
        if (fVar == null) {
            return false;
        }
        return ((C109779e) C105851w0.xx0().f314798d).mo161031b(fVar.field_groupId);
    }

    /* renamed from: T5 */
    public void mo96137T5(String str) {
        if (C72996z1.m85820U5(str) && mg0(str)) {
            Log.m105924i("MicroMsg.MultiTalkRoomListMsg", "isKicked! now clean banner and check if i am in multitalk.");
            String str2 = (String) C86709a0.m107535s().mo121142i().mo119684e(2, (Object) null);
            if (C105851w0.zx0().f314506t != null && C105851w0.zx0().f314506t.f320044f.equals(str)) {
                Log.m105924i("MicroMsg.MultiTalkRoomListMsg", "yes i am now in multitalk so i exit now!");
                C105851w0.zx0().mo150660f(false, false);
            }
            this.f314598d.postDelayed(new C105796a(str), 2000);
        }
    }

    /* renamed from: TS */
    public boolean mo96138TS(String str) {
        C75349f fVar = (C75349f) W30(str);
        if (fVar == null) {
            return false;
        }
        if (!C105851w0.zx0().mo150681w(str)) {
            return C109770a.m149092a().mo161081M(fVar.field_groupId, fVar.field_roomId, fVar.field_roomKey, 1);
        }
        Log.m105924i("MicroMsg.MultiTalkRoomListMsg", "ilink reject call, roomid:" + fVar.field_roomId + " wxgroupid:" + str + " ilinkroomid:" + fVar.field_ilinkRoomId);
        C105724z zVar = C105724z.INSTANCE;
        zVar.getClass();
        zVar.mo150614x(new C105660m0(zVar, 1));
        C105851w0.zx0().mo150660f(true, false);
        return true;
    }

    public int Vq0(String str, String str2) {
        C36638b Lo = C105851w0.Ax0().mo60775Lo(str, str2);
        if (Lo != null) {
            return Lo.field_status;
        }
        return 30;
    }

    public C78815k6 W30(String str) {
        return C105851w0.yx0().mo107807jo(str);
    }

    /* renamed from: X8 */
    public void mo96141X8(String str) {
        LinkedList<String> linkedList = this.f314601g;
        if (linkedList == null) {
            LinkedList<String> linkedList2 = new LinkedList<>();
            this.f314601g = linkedList2;
            if (!linkedList2.contains(str)) {
                this.f314601g.add(str);
            }
        } else if (!linkedList.contains(str)) {
            this.f314601g.add(str);
        }
    }

    /* renamed from: c */
    public boolean mo96142c(String str) {
        if (this.f314600f != null) {
            Log.m105924i("MicroMsg.MultiTalkRoomListMsg", "removewxGroupIdInMap:" + str);
            this.f314600f.remove(str);
        } else {
            Bx0();
        }
        return C105851w0.yx0().mo107806c(str);
    }

    public String getDisplayName(String str) {
        return ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(str);
    }

    /* renamed from: kJ */
    public boolean mo96144kJ(String str) {
        String str2 = str;
        C75349f fVar = (C75349f) W30(str);
        if (fVar == null) {
            return false;
        }
        Log.m105924i("MicroMsg.MultiTalkRoomListMsg", "enterMultiTalk, roomid:" + fVar.field_roomId + " ilinkroomid:" + fVar.field_ilinkRoomId + " wxgroupid:" + str2 + " wifigateway:" + v2protocal.m143438u());
        boolean w = C105851w0.zx0().mo150681w(str2);
        boolean z = fVar.field_ilinkRoomId != 0;
        boolean z2 = w || z;
        Log.m105925i("MicroMsg.MultiTalkRoomListMsg", "enterMultiTalk:isILink:%b, isILinkCallFromBanner:%b,  groupid:%s", Boolean.valueOf(z2), Boolean.valueOf(z), fVar.field_groupId);
        if (z2) {
            C105724z zVar = C105724z.INSTANCE;
            zVar.mo150615y((long) Util.nullAsNil((Integer) C86709a0.m107535s().f251803a.mo119660a(1)), C75592q0.m90789s());
            C105851w0.zx0().mo150639P(str2, 2);
            String str3 = fVar.field_groupId;
            zVar.getClass();
            Log.m105925i("MicroMsg.Multitalk.ILinkService", "steve:  enter newMultiTalkJoinRoom. %s, %s", str3, str2);
            zVar.mo150614x(new C105681q1(zVar, str2, str3));
            return true;
        }
        C104329g.f308829a.mo146030d();
        C107064d dVar = C105851w0.xx0().f314798d;
        String str4 = fVar.field_groupId;
        int i = fVar.field_roomId;
        long j = fVar.field_roomKey;
        int i2 = fVar.field_routeId;
        String u = v2protocal.m143438u();
        ((C109779e) dVar).getClass();
        C109782f.C109793i m = C109770a.m149092a().mo161102m((Activity) null, str4, i, j, i2, 100, false, str, u);
        C104161b.m138997f("TalkRoomSdkApi", "enterMultiTalk multiTalkGroupid:", str4, " roomId: ", Integer.valueOf(i), " roomKey: ", Long.valueOf(j), " routId: ", Integer.valueOf(i2), " wxGroupId: ", str2, " ret: ", m);
        return m == C109782f.C109793i.OK;
    }

    public boolean mg0(String str) {
        if (this.f314600f == null) {
            Bx0();
        }
        LinkedList<String> linkedList = this.f314600f;
        return linkedList != null && linkedList.contains(str);
    }

    /* renamed from: nN */
    public boolean mo96146nN() {
        return C105851w0.zx0().mo150684z();
    }

    /* renamed from: oW */
    public void mo96147oW(String str) {
        if (str == null || "".equals(str.trim())) {
            Log.m105920e("MicroMsg.MultiTalkRoomListMsg", "cleanBanner failure ! wxGroupId is null or empty!");
            return;
        }
        Log.m105925i("MicroMsg.MultiTalkRoomListMsg", "cleanBanner  wxGroupId = %s", str);
        mo96142c(str);
        C105851w0.Ax0().mo60778c(str);
        wx0(str);
    }

    /* renamed from: qQ */
    public synchronized void mo96148qQ(C69856h.C69857a aVar) {
        ((ArrayList) this.f314599e).remove(aVar);
    }

    /* renamed from: qn */
    public boolean mo96149qn() {
        return C105851w0.zx0().mo150682x();
    }

    /* renamed from: sV */
    public boolean mo96150sV(String str) {
        String str2;
        C75349f jo = C105851w0.yx0().mo107807jo(str);
        if (jo == null || (str2 = jo.field_wxGroupId) == null || !str2.equals(str)) {
            return false;
        }
        if (System.currentTimeMillis() - jo.field_createTime <= 21600000) {
            return true;
        }
        Log.m105924i("MicroMsg.MultiTalkRoomListMsg", "wxGroupId:" + str + ",is out of time 6 hours..");
        mo96147oW(str);
        return false;
    }

    public void vx0(String str) {
        Log.m105924i("MicroMsg.MultiTalkRoomListMsg", "addwxGroupIdInMap:" + str);
        LinkedList<String> linkedList = this.f314600f;
        if (linkedList == null) {
            Bx0();
            LinkedList<String> linkedList2 = this.f314600f;
            if (linkedList2 != null) {
                linkedList2.add(str);
            }
        } else if (!linkedList.contains(str)) {
            this.f314600f.add(str);
        }
    }

    public boolean wd0(String str) {
        C111425d1 Cx0 = C105851w0.Cx0();
        if (str != null) {
            Intent intent = Cx0.f333588f;
            if (intent == null) {
                return false;
            }
            String stringExtra = intent.getStringExtra("enterMainUiWxGroupId");
            C111423c1 c1Var = Cx0.f333586d;
            if (C104166f.m139002b(stringExtra) || !C87412m.m108589b(str, stringExtra) || c1Var == null || c1Var.getVisibility() != 0) {
                return false;
            }
        } else {
            C111423c1 c1Var2 = Cx0.f333586d;
            if (c1Var2 == null) {
                return false;
            }
            if (!(c1Var2.getVisibility() == 0)) {
                return false;
            }
            C111423c1 c1Var3 = Cx0.f333586d;
            return c1Var3 != null && c1Var3.isShown();
        }
    }

    public final void wx0(String str) {
        Iterator it = ((ArrayList) this.f314599e).iterator();
        while (it.hasNext()) {
            this.f314598d.post(new C105797b(this, (C69856h.C69857a) it.next(), str));
        }
    }

    /* renamed from: xC */
    public String mo96152xC(String str, String str2) {
        C36638b Lo = C105851w0.Ax0().mo60775Lo(str, str2);
        if (Lo != null) {
            return Lo.field_inviteUserName;
        }
        return null;
    }

    public LinkedList<String> xx0() {
        if (this.f314602h == null) {
            this.f314602h = new LinkedList<>();
        }
        return this.f314602h;
    }

    public void yx0(String str) {
        LinkedList<String> linkedList = this.f314601g;
        if (linkedList == null) {
            this.f314601g = new LinkedList<>();
        } else {
            linkedList.remove(str);
        }
    }

    /* renamed from: zV */
    public boolean mo96153zV(Context context) {
        return C61104a.m71669y(context);
    }

    public final boolean zx0(String str, C103878h1 h1Var) {
        int i = 0;
        if (h1Var == null) {
            return false;
        }
        C75349f fVar = new C75349f();
        fVar.field_wxGroupId = str;
        fVar.field_groupId = h1Var.f307013b;
        fVar.field_roomId = h1Var.f307014c;
        fVar.field_roomKey = h1Var.f307015d;
        fVar.field_routeId = h1Var.f307016e;
        fVar.field_inviteUserName = h1Var.f307020i;
        C103860b1[] b1VarArr = h1Var.f307019h;
        if (b1VarArr.length > 0) {
            i = b1VarArr.length;
        }
        fVar.field_memberCount = i;
        fVar.field_createTime = System.currentTimeMillis();
        fVar.field_ilinkRoomId = 0;
        return C105851w0.yx0().mo107807jo(str) == null ? C105851w0.yx0().mo107805Lo(fVar) : C105851w0.yx0().mo107808qq(fVar);
    }
}
