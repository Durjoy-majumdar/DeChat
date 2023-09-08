package qe0;

import android.util.Pair;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72996z1;
import f40.C86709a0;
import java.util.LinkedList;

/* renamed from: qe0.b */
public class C35838b implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ LinkedList f95661d;

    /* renamed from: e */
    public final /* synthetic */ C47807h f95662e;

    /* renamed from: f */
    public final /* synthetic */ C44668u3 f95663f;

    public C35838b(LinkedList linkedList, C47807h hVar, C44668u3 u3Var) {
        this.f95661d = linkedList;
        this.f95662e = hVar;
        this.f95663f = u3Var;
    }

    public boolean onTimerExpired() {
        int i = 25;
        if (this.f95661d.size() < 25) {
            i = this.f95661d.size();
        }
        Log.m105919d("OpenIMChatRoomContactLogic", "updateMemberDetail update ctg list size:%d, loopCount:%d", Integer.valueOf(this.f95661d.size()), Integer.valueOf(i));
        if (i == 0) {
            C47807h hVar = this.f95662e;
            if (hVar != null) {
                hVar.mo72573a(2);
            }
            Log.m105924i("OpenIMChatRoomContactLogic", "updateMemberDetail update ctg done loopCount is 0");
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long beginTransaction = C86709a0.m107535s().f251811i.beginTransaction(Thread.currentThread().getId());
        for (int i2 = 0; i2 < i; i2++) {
            Pair pair = (Pair) this.f95661d.poll();
            this.f95663f.mo69719p3((String) pair.first, (C72996z1) pair.second);
        }
        C86709a0.m107535s().f251811i.endTransaction(beginTransaction);
        Log.m105919d("OpenIMChatRoomContactLogic", "updateMemberDetail update ctg loopCount:%d, take time:%d(ms)", Integer.valueOf(i), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        if (!this.f95661d.isEmpty()) {
            return true;
        }
        C47807h hVar2 = this.f95662e;
        if (hVar2 != null) {
            hVar2.mo72573a(2);
        }
        Log.m105924i("OpenIMChatRoomContactLogic", "updateMemberDetail update ctg done updateList is empty");
        return false;
    }
}
