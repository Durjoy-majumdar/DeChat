package p203mi;

import a11.C39479c;
import android.util.Pair;
import com.tencent.p014mm.hardcoder.C40318k;
import com.tencent.p014mm.modelavatar.C68097n;
import com.tencent.p014mm.modelavatar.C68098o;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p196ln.C10581n;
import p196ln.C76706g;
import pe3.C47465a;
import te3.C49324es;
import te3.C49464fs;
import te3.C50165kq2;
import te3.C51460tx1;
import te3.C51611ux1;
import zt3.C119157j;

/* renamed from: mi.s */
public class C47047s extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f126431d;

    /* renamed from: e */
    public C11385n f126432e = null;

    /* renamed from: f */
    public final String f126433f;

    /* renamed from: g */
    public int f126434g = 0;

    /* renamed from: h */
    public int f126435h;

    /* renamed from: mi.s$a */
    public class C47048a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ LinkedList f126436d;

        /* renamed from: e */
        public final /* synthetic */ C10581n f126437e;

        /* renamed from: f */
        public final /* synthetic */ C51611ux1 f126438f;

        /* renamed from: g */
        public final /* synthetic */ List f126439g;

        /* renamed from: h */
        public final /* synthetic */ C50165kq2 f126440h;

        public C47048a(LinkedList linkedList, C10581n nVar, C51611ux1 ux12, List list, C50165kq2 kq22) {
            this.f126436d = linkedList;
            this.f126437e = nVar;
            this.f126438f = ux12;
            this.f126439g = list;
            this.f126440h = kq22;
        }

        public void run() {
            int i = 25;
            if (this.f126436d.size() < 25) {
                i = this.f126436d.size();
            }
            Log.m105925i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom(%s) update img list size:%d, loopCount:%d", C47047s.this.f126433f, Integer.valueOf(this.f126436d.size()), Integer.valueOf(i));
            if (i == 0) {
                Log.m105925i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom(%s) update img done loopCount is 0", C47047s.this.f126433f);
            } else if (this.f126436d.isEmpty()) {
                Log.m105925i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom(%s) update img done newImgFlagList is empty", C47047s.this.f126433f);
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                long beginTransaction = C86709a0.m107535s().f251811i.beginTransaction(Thread.currentThread().getId());
                for (int i2 = 0; i2 < i; i2++) {
                    C68097n nVar = (C68097n) this.f126436d.poll();
                    if (nVar == null) {
                        break;
                    }
                    ((C68098o) this.f126437e).mo93608Yt(nVar);
                }
                C86709a0.m107535s().f251811i.endTransaction(beginTransaction);
                Log.m105925i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom(%s) update img loopCount:%d, take time:%d(ms), img list size:%d", C47047s.this.f126433f, Integer.valueOf(i), Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Integer.valueOf(this.f126436d.size()));
                if (!this.f126436d.isEmpty()) {
                    ((C119157j) C119157j.f356862d).mo183879j(this, 100, "chatroom_member_detail");
                    return;
                }
            }
            C47047s sVar = C47047s.this;
            C47047s.m52371j1(sVar, 1, sVar.f126433f, this.f126438f.f143175e, this.f126439g, this.f126440h);
            Log.m105925i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom(%s) update img done newImgFlagList is empty", C47047s.this.f126433f);
        }
    }

    /* renamed from: mi.s$b */
    public class C47049b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ LinkedList f126442d;

        /* renamed from: e */
        public final /* synthetic */ C44668u3 f126443e;

        /* renamed from: f */
        public final /* synthetic */ C51611ux1 f126444f;

        /* renamed from: g */
        public final /* synthetic */ List f126445g;

        /* renamed from: h */
        public final /* synthetic */ C50165kq2 f126446h;

        public C47049b(LinkedList linkedList, C44668u3 u3Var, C51611ux1 ux12, List list, C50165kq2 kq22) {
            this.f126442d = linkedList;
            this.f126443e = u3Var;
            this.f126444f = ux12;
            this.f126445g = list;
            this.f126446h = kq22;
        }

        public void run() {
            int i = 25;
            if (this.f126442d.size() < 25) {
                i = this.f126442d.size();
            }
            Log.m105925i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom(%s) update ctg list size:%d, loopCount:%d", C47047s.this.f126433f, Integer.valueOf(this.f126442d.size()), Integer.valueOf(i));
            if (i == 0) {
                Log.m105925i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom(%s) update ctg done loopCount is 0", C47047s.this.f126433f);
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                long beginTransaction = C86709a0.m107535s().f251811i.beginTransaction(Thread.currentThread().getId());
                for (int i2 = 0; i2 < i; i2++) {
                    Pair pair = (Pair) this.f126442d.poll();
                    this.f126443e.mo69719p3((String) pair.first, (C72996z1) pair.second);
                }
                C86709a0.m107535s().f251811i.endTransaction(beginTransaction);
                Log.m105925i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom(%s) update ctg loopCount:%d, take time:%d(ms), img list size:%d", C47047s.this.f126433f, Integer.valueOf(i), Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Integer.valueOf(this.f126442d.size()));
                if (!this.f126442d.isEmpty()) {
                    ((C119157j) C119157j.f356862d).mo183879j(this, 100, "chatroom_member_detail");
                    return;
                }
            }
            C47047s sVar = C47047s.this;
            C47047s.m52371j1(sVar, 2, sVar.f126433f, this.f126444f.f143175e, this.f126445g, this.f126446h);
            Log.m105925i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom(%s) update ctg done updateList is empty", C47047s.this.f126433f);
        }
    }

    public C47047s(String str, int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51460tx1();
        bVar.f127067b = new C51611ux1();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getchatroommemberdetail";
        bVar.f127069d = 551;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f126431d = a;
        this.f126433f = str;
        int s2 = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69801SE(str).mo69791s2();
        C47465a aVar = a.f127055a.f127080a;
        ((C51460tx1) aVar).f142464d = str;
        ((C51460tx1) aVar).f142465e = s2 < i ? i : s2;
        Log.m105925i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom chatroomName:%s, oldVer:%d, localVer:%d, stack[%s]", str, Integer.valueOf(i), Integer.valueOf(s2), Util.getStack());
    }

    /* renamed from: j1 */
    public static void m52371j1(C47047s sVar, int i, String str, int i2, List list, C50165kq2 kq22) {
        Class cls = C39479c.class;
        int i3 = (~i) & sVar.f126434g;
        sVar.f126434g = i3;
        if (i3 == 0) {
            C44661m1 SE = ((C44662n1) ((C39479c) C86709a0.m107533q(cls)).mo62084mr()).mo69801SE(str);
            if (kq22 == null) {
                SE.field_localChatRoomWatchMembers = new C50165kq2();
            } else {
                SE.field_localChatRoomWatchMembers = kq22;
            }
            SE.mo69781D2(i2);
            SE.mo69779A2(C75592q0.m90789s(), list);
            ((C44662n1) ((C39479c) C86709a0.m107533q(cls)).mo62084mr()).replace(SE);
            C40318k.m43492a().stopPerformance(C40318k.m43492a().getHcUpdateChatroomEnable(), sVar.f126435h);
            sVar.f126435h = 0;
            Log.m105925i("MicroMsg.NetSceneGetChatroomMemberDetail", "updateDone(%s)", str);
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f126432e = nVar;
        return dispatch(gVar, this.f126431d, this);
    }

    public int getType() {
        return 551;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        int i4;
        C51611ux1 ux12;
        LinkedList linkedList;
        Class cls;
        LinkedList linkedList2;
        long j;
        C51611ux1 ux13;
        Iterator<C49464fs> it;
        LinkedList linkedList3;
        C68097n nVar;
        int i5 = i2;
        int i6 = i3;
        String str2 = str;
        Class cls2 = C39479c.class;
        if (i5 == 0 && i6 == 0) {
            Log.m105925i("MicroMsg.NetSceneGetChatroomMemberDetail", "onGYNetEnd errType:%d, errCode:%d, errMsg:%s", Integer.valueOf(i2), Integer.valueOf(i3), str2);
            C51611ux1 ux14 = (C51611ux1) this.f126431d.f127056b.f127083a;
            C44661m1 SE = ((C44662n1) ((C39479c) C86709a0.m107533q(cls2)).mo62084mr()).mo69801SE(this.f126433f);
            long s2 = (long) SE.mo69791s2();
            int i7 = ux14.f143175e;
            long j2 = ((long) i7) & Util.MAX_32BIT_VALUE;
            Object[] objArr = new Object[4];
            objArr[0] = this.f126433f;
            objArr[1] = Integer.valueOf(i7);
            C51611ux1 ux15 = ux14;
            C49324es esVar = ux15.f143176f;
            objArr[2] = Integer.valueOf(esVar == null ? 0 : esVar.f133093d);
            objArr[3] = Long.valueOf(s2);
            Log.m105925i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom chatroomName:%s svrVer:%d, modCnt:%d， localVer:%d", objArr);
            if (s2 >= j2) {
                Log.m105921e("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom localVer[%d] serverVer[%d] is new and return", Long.valueOf(s2), Long.valueOf(j2));
                this.f126432e.onSceneEnd(i5, i6, str2, this);
                return;
            }
            C49324es esVar2 = ux15.f143176f;
            LinkedList<C49464fs> linkedList4 = esVar2 == null ? null : esVar2.f133094e;
            int size = linkedList4 == null ? -1 : linkedList4.size();
            Log.m105925i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom memInfoList size[%d]", Integer.valueOf(size));
            C50165kq2 kq22 = new C50165kq2();
            C49324es esVar3 = ux15.f143176f;
            if (esVar3 != null) {
                kq22.f136987d = esVar3.f133097h;
                kq22.f136988e = esVar3.f133098i;
            }
            C44668u3 Ni = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni();
            C10581n eg = ((C76706g) C86312j.m106911c(C76706g.class)).mo106832eg();
            LinkedList linkedList5 = new LinkedList();
            LinkedList linkedList6 = new LinkedList();
            if (((long) size) > C40318k.m43492a().getHcUpdateChatroomMemberCount()) {
                i4 = 0;
            } else {
                i4 = C40318k.m43492a().startPerformance(C40318k.m43492a().getHcUpdateChatroomEnable(), C40318k.m43492a().getHcUpdateChatroomDelay(), C40318k.m43492a().getHcUpdateChatroomCPU(), C40318k.m43492a().getHcUpdateChatroomIO(), C40318k.m43492a().getHcUpdateChatroomThr() ? C86709a0.m107525e().getProcessTid() : 0, C40318k.m43492a().getHcUpdateChatroomTimeout(), 401, C40318k.m43492a().getHcUpdateChatroomAction(), "MicroMsg.NetSceneGetChatroomMemberDetail");
            }
            this.f126435h = i4;
            Iterator<C49464fs> it4 = linkedList4.iterator();
            while (it4.hasNext()) {
                C49464fs next = it4.next();
                if (Util.isNullOrNil(next.f133654h) || Util.isNullOrNil(next.f133650d)) {
                    it = it4;
                    ux13 = ux15;
                    linkedList3 = linkedList6;
                } else {
                    it = it4;
                    C68097n Lo = ((C68098o) eg).mo93607Lo(next.f133650d);
                    if (Lo == null) {
                        nVar = new C68097n();
                        nVar.f195728a = next.f133650d;
                    } else {
                        Lo.mo93597f().equals(next.f133654h);
                        nVar = Lo;
                    }
                    String str3 = next.f133653g;
                    nVar.f195732e = str3;
                    ux13 = ux15;
                    nVar.f195731d = next.f133654h;
                    nVar.f195729b = 3;
                    nVar.f195733f = Util.isNullOrNil(str3) ^ true ? 1 : 0;
                    linkedList3 = linkedList6;
                    linkedList3.add(nVar);
                }
                C72996z1 z1Var = Ni.get(next.f133650d);
                if (z1Var == null) {
                    Log.m105920e("MicroMsg.NetSceneGetChatroomMemberDetail", "NetSceneGetChatroomMemberDetail memberlist username is null");
                } else if (z1Var.mo62924q3()) {
                    z1Var.mo62878U2(next.f133651e);
                    linkedList5.add(new Pair(next.f133650d, z1Var));
                    Ni.mo69719p3(next.f133650d, z1Var);
                    Log.m105925i("MicroMsg.NetSceneGetChatroomMemberDetail", "NetSceneGetChatroomMemberDetail username:%s nickname:%s type:%s", Util.nullAs(next.f133650d, ""), Util.secPrint(next.f133651e), Integer.valueOf(z1Var.getType()));
                } else {
                    Log.m105929w("MicroMsg.NetSceneGetChatroomMemberDetail", "NetSceneGetChatroomMemberDetail isChatRoomContact == false, username %s nickname %s type:%s", Util.nullAs(next.f133650d, ""), Util.nullAs(next.f133651e, ""), Integer.valueOf(z1Var.getType()));
                    int i8 = i2;
                    int i9 = i3;
                    linkedList6 = linkedList3;
                    it4 = it;
                    ux15 = ux13;
                }
                int i84 = i2;
                int i94 = i3;
                linkedList6 = linkedList3;
                it4 = it;
                ux15 = ux13;
            }
            C51611ux1 ux16 = ux15;
            LinkedList linkedList7 = linkedList6;
            Log.m105925i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom update newImgFlagList size:%d, updateList size:%d", Integer.valueOf(linkedList7.size()), Integer.valueOf(linkedList5.size()));
            if (!linkedList7.isEmpty()) {
                this.f126434g |= 1;
                linkedList2 = linkedList7;
                cls = cls2;
                ux12 = ux16;
                j = 100;
                linkedList = linkedList5;
                ((C119157j) C119157j.f356862d).mo183879j(new C47048a(linkedList7, eg, ux12, linkedList4, kq22), 100, "chatroom_member_detail");
            } else {
                linkedList2 = linkedList7;
                linkedList = linkedList5;
                cls = cls2;
                ux12 = ux16;
                j = 100;
            }
            if (!linkedList.isEmpty()) {
                this.f126434g |= 2;
                ((C119157j) C119157j.f356862d).mo183879j(new C47049b(linkedList, Ni, ux12, linkedList4, kq22), j, "chatroom_member_detail");
            }
            if (linkedList2.isEmpty() && linkedList.isEmpty()) {
                int i15 = ux12.f143175e;
                SE.field_localChatRoomWatchMembers = kq22;
                SE.mo69781D2(i15);
                SE.mo69779A2(C75592q0.m90789s(), linkedList4);
                ((C44662n1) ((C39479c) C86709a0.m107533q(cls)).mo62084mr()).replace(SE);
            }
            this.f126432e.onSceneEnd(i2, i3, str, this);
            return;
        }
        String str4 = str2;
        Log.m105921e("MicroMsg.NetSceneGetChatroomMemberDetail", "onGYNetEnd errType:%d, errCode:%d, errMsg:%s", Integer.valueOf(i2), Integer.valueOf(i3), str4);
        this.f126432e.onSceneEnd(i5, i6, str4, this);
    }
}
