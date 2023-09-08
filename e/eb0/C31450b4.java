package eb0;

import android.database.Cursor;
import com.tencent.p014mm.autogen.events.DeleteMsgEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72986n2;
import f40.C86709a0;
import f62.C75700k0;
import java.util.List;

/* renamed from: eb0.b4 */
public class C31450b4 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ List f84162d;

    public C31450b4(List list) {
        this.f84162d = list;
    }

    public void run() {
        Class cls = C75700k0.class;
        Log.m105925i("MicroMsg.MsgInfoStorageLogic", "summerdel deleteMsgByTalker run currentThread[%s, %d] talkers size:%s", Thread.currentThread().getName(), Long.valueOf(Thread.currentThread().getId()), Integer.valueOf(this.f84162d.size()));
        for (String str : this.f84162d) {
            DeleteMsgEvent deleteMsgEvent = new DeleteMsgEvent();
            DeleteMsgEvent.C28727a aVar = deleteMsgEvent.f78765d;
            aVar.f78766a = Long.MIN_VALUE;
            aVar.f78767b = str;
            aVar.f78768c = 0;
            deleteMsgEvent.publish();
            C72963f4 Ex0 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).Ex0(str);
            long createTime = Ex0 == null ? 0 : Ex0.getCreateTime();
            long a = C31543z5.m39451a();
            if (createTime > a) {
                Log.m105929w("MicroMsg.MsgInfoStorageLogic", "last message time[%s] is over serverTime[%s]!", Long.valueOf(createTime), Long.valueOf(a));
                createTime = a;
            }
            if (Ex0 != null && Ex0.getCreateTime() > 0) {
                ((C72986n2) ((C75700k0) C86709a0.m107533q(cls)).mo96093DX()).mo101181Ow(str, createTime);
            }
            Log.m105925i("MicroMsg.MsgInfoStorageLogic", "summerdel deleteMsgByTalker talker[%s] lastMsg[%s] lastMsgCreateTime[%s]", str, Ex0, Long.valueOf(createTime));
            Cursor ko02 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).ko0(str);
            if (ko02 != null) {
                if (ko02.moveToFirst()) {
                    while (!ko02.isAfterLast()) {
                        C72963f4 f4Var = new C72963f4();
                        f4Var.convertFrom(ko02);
                        C75604z3.m90833e(f4Var, true);
                        ko02.moveToNext();
                    }
                }
                ko02.close();
                Log.m105925i("MicroMsg.MsgInfoStorageLogic", "delete msgs %s, %d", str, Integer.valueOf(((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).mo101089TE(str)));
                ((C72986n2) ((C75700k0) C86709a0.m107533q(cls)).mo96093DX()).mo101181Ow(str, 0);
            }
        }
    }
}
