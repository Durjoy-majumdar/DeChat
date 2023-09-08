package je0;

import a11.C39479c;
import android.util.Pair;
import com.tencent.p014mm.hardcoder.C40318k;
import com.tencent.p014mm.modelavatar.C68097n;
import com.tencent.p014mm.modelavatar.C68098o;
import com.tencent.p014mm.modelavatar.C68102u;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import he0.C76158j;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import qe0.C35837a;
import qe0.C35838b;
import qe0.C47805f;
import qe0.C47807h;
import te3.C51792w63;
import te3.C52067y42;
import te3.C52216z42;
import te3.C52224z63;

/* renamed from: je0.l */
public class C46484l extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f125232d;

    /* renamed from: e */
    public final C47350c f125233e;

    /* renamed from: f */
    public final String f125234f;

    /* renamed from: g */
    public final int f125235g;

    public C46484l(String str, int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C52067y42();
        bVar.f127067b = new C52216z42();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getopenimchatroommemberdetail";
        bVar.f127069d = 942;
        C47350c a = bVar.mo72403a();
        this.f125233e = a;
        this.f125234f = str;
        this.f125235g = i;
        C52067y42 y422 = (C52067y42) a.f127055a.f127080a;
        y422.f145111d = str;
        y422.f145112e = i;
        Log.m105925i("MicroMsg.Openim.NetSceneGetOpenIMChatroomMemberDetail", "get roomname:%s, version=%d", str, Integer.valueOf(i));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125232d = nVar;
        return dispatch(gVar, this.f125233e, this);
    }

    public int getType() {
        return 942;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        int i4;
        int i5 = i3;
        String str2 = str;
        Class cls = C39479c.class;
        Log.m105925i("MicroMsg.Openim.NetSceneGetOpenIMChatroomMemberDetail", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, roomname:%s, %d", Integer.valueOf(i2), Integer.valueOf(i3), str2, this.f125234f, Integer.valueOf(this.f125235g));
        if (i5 == 0) {
            C52216z42 z422 = (C52216z42) ((C47350c) uVar).f127056b.f127083a;
            C44661m1 SE = ((C44662n1) ((C39479c) C86709a0.m107533q(cls)).mo62084mr()).mo69801SE(this.f125234f);
            int i6 = z422.f145690d;
            long j = Util.MAX_32BIT_VALUE & ((long) i6);
            Log.m105925i("MicroMsg.Openim.NetSceneGetOpenIMChatroomMemberDetail", "updateMemberDetail svrVer:%d, localVer:%d", Integer.valueOf(i6), Integer.valueOf(this.f125235g));
            if (((long) this.f125235g) < j) {
                SE.mo69781D2(z422.f145690d);
                C51792w63 w632 = z422.f145691e;
                LinkedList<C52224z63> linkedList = w632 == null ? null : w632.f143893d;
                Object[] objArr = new Object[1];
                int i7 = -1;
                objArr[0] = Integer.valueOf(linkedList == null ? -1 : linkedList.size());
                Log.m105925i("MicroMsg.Openim.NetSceneGetOpenIMChatroomMemberDetail", "updateMemberDetail memInfoList size[%d]", objArr);
                SE.mo69779A2(C75592q0.m90789s(), C47805f.m53115a(linkedList));
                ((C44662n1) ((C39479c) C86709a0.m107533q(cls)).mo62084mr()).replace(SE);
                C51792w63 w633 = z422.f145691e;
                C47807h hVar = new C47807h();
                if (w633 != null) {
                    LinkedList<C52224z63> linkedList2 = w633.f143893d;
                    C44668u3 Ni = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni();
                    C68098o zx02 = C68102u.zx0();
                    LinkedList linkedList3 = new LinkedList();
                    LinkedList linkedList4 = new LinkedList();
                    if (linkedList2 != null) {
                        i7 = linkedList2.size();
                    }
                    Log.m105925i("OpenIMChatRoomContactLogic", "updateMemberDetail memInfoList size[%d]", Integer.valueOf(i7));
                    if (i7 >= 0) {
                        if (((long) i7) > C40318k.m43492a().getHcUpdateChatroomMemberCount()) {
                            i4 = 0;
                        } else {
                            i4 = C40318k.m43492a().startPerformance(C40318k.m43492a().getHcUpdateChatroomEnable(), C40318k.m43492a().getHcUpdateChatroomDelay(), C40318k.m43492a().getHcUpdateChatroomCPU(), C40318k.m43492a().getHcUpdateChatroomIO(), C40318k.m43492a().getHcUpdateChatroomThr() ? C86709a0.m107525e().getProcessTid() : 0, C40318k.m43492a().getHcUpdateChatroomTimeout(), 401, C40318k.m43492a().getHcUpdateChatroomAction(), "PerfTrace");
                        }
                        hVar.f128365b = i4;
                        for (C52224z63 next : linkedList2) {
                            if (w633.f143894e == 0 && !Util.isNullOrNil(next.f145718d) && !Util.isNullOrNil(next.f145722h)) {
                                C68097n Lo = zx02.mo93607Lo(next.f145718d);
                                if (Lo == null) {
                                    Lo = new C68097n();
                                    Lo.f195728a = next.f145718d;
                                }
                                String str3 = next.f145721g;
                                Lo.f195732e = str3;
                                Lo.f195731d = next.f145722h;
                                Lo.f195729b = 3;
                                Lo.f195733f = Util.isNullOrNil(str3) ^ true ? 1 : 0;
                                linkedList4.add(Lo);
                            }
                            C72996z1 z1Var = Ni.get(next.f145718d);
                            if (z1Var == null) {
                                Log.m105920e("OpenIMChatRoomContactLogic", "updateMemberDetail memberlist username is null");
                            } else {
                                if (z1Var.mo62924q3()) {
                                    z1Var.mo62878U2(next.f145719e);
                                    linkedList3.add(new Pair(next.f145718d, z1Var));
                                }
                                if (!Util.isNullOrNil(next.f145724j)) {
                                    z1Var.mo62880V2(next.f145724j);
                                }
                                if (!Util.isNullOrNil(next.f145725n)) {
                                    z1Var.mo73960Q2(next.f145725n);
                                }
                                Ni.mo69668Q3(z1Var);
                                if (!Util.isNullOrNil(next.f145724j)) {
                                    ((C76158j) C86312j.m106911c(C76158j.class)).mo106371tU(next.f145724j, LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext()), next.f145725n);
                                }
                            }
                        }
                        Log.m105919d("OpenIMChatRoomContactLogic", "updateMemberDetail update newImgFlagList size:%d, updateList size:%d", Integer.valueOf(linkedList4.size()), Integer.valueOf(linkedList3.size()));
                        if (!linkedList4.isEmpty()) {
                            hVar.f128364a |= 1;
                            new MTimerHandler(C86709a0.m107525e().getLooper(), (MTimerHandler.CallBack) new C35837a(linkedList4, hVar, zx02), true).startTimer(100);
                        }
                        if (!linkedList3.isEmpty()) {
                            hVar.f128364a |= 2;
                            new MTimerHandler(C86709a0.m107525e().getLooper(), (MTimerHandler.CallBack) new C35838b(linkedList3, hVar, Ni), true).startTimer(100);
                        }
                    }
                }
            }
        }
        C11385n nVar = this.f125232d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i5, str2, this);
        }
    }
}
