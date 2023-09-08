package qe0;

import com.tencent.p014mm.modelavatar.C68097n;
import com.tencent.p014mm.modelavatar.C68098o;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import f40.C86709a0;
import java.util.LinkedList;

/* renamed from: qe0.a */
public class C35837a implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ LinkedList f95658d;

    /* renamed from: e */
    public final /* synthetic */ C47807h f95659e;

    /* renamed from: f */
    public final /* synthetic */ C68098o f95660f;

    public C35837a(LinkedList linkedList, C47807h hVar, C68098o oVar) {
        this.f95658d = linkedList;
        this.f95659e = hVar;
        this.f95660f = oVar;
    }

    public boolean onTimerExpired() {
        int i = 25;
        if (this.f95658d.size() < 25) {
            i = this.f95658d.size();
        }
        Log.m105919d("OpenIMChatRoomContactLogic", "updateMemberDetail update img list size:%d, loopCount:%d", Integer.valueOf(this.f95658d.size()), Integer.valueOf(i));
        if (i == 0) {
            C47807h hVar = this.f95659e;
            if (hVar != null) {
                hVar.mo72573a(1);
            }
            Log.m105924i("OpenIMChatRoomContactLogic", "updateMemberDetail update img done loopCount is 0");
            return false;
        } else if (this.f95658d.isEmpty()) {
            C47807h hVar2 = this.f95659e;
            if (hVar2 != null) {
                hVar2.mo72573a(1);
            }
            Log.m105924i("OpenIMChatRoomContactLogic", "updateMemberDetail update img done newImgFlagList is empty");
            return false;
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            long beginTransaction = C86709a0.m107535s().f251811i.beginTransaction(Thread.currentThread().getId());
            for (int i2 = 0; i2 < i; i2++) {
                C68097n nVar = (C68097n) this.f95658d.poll();
                if (nVar == null) {
                    break;
                }
                this.f95660f.mo93608Yt(nVar);
            }
            C86709a0.m107535s().f251811i.endTransaction(beginTransaction);
            Log.m105919d("OpenIMChatRoomContactLogic", "updateMemberDetail update img loopCount:%d, take time:%d(ms)", Integer.valueOf(i), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            if (!this.f95658d.isEmpty()) {
                return true;
            }
            C47807h hVar3 = this.f95659e;
            if (hVar3 != null) {
                hVar3.mo72573a(1);
            }
            Log.m105924i("OpenIMChatRoomContactLogic", "updateMemberDetail update img done newImgFlagList is empty");
            return false;
        }
    }
}
