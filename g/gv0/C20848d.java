package gv0;

import com.tencent.p014mm.pointers.PByteArray;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ev0.C20633g;
import gv0.C20842c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: gv0.d */
public class C20848d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C20842c.C20844c f58893d;

    public C20848d(C20842c.C20844c cVar) {
        this.f58893d = cVar;
    }

    public void run() {
        ConcurrentHashMap<Integer, C20842c> concurrentHashMap = C20842c.f58876g;
        synchronized (concurrentHashMap) {
            long nowMilliSecond = Util.nowMilliSecond();
            int i = 0;
            for (Map.Entry next : concurrentHashMap.entrySet()) {
                if (next != null) {
                    try {
                        PByteArray pByteArray = ((C20842c) next.getValue()).f58888e;
                        if (pByteArray != null) {
                            C20842c.C20843b bVar = C20842c.f58879j;
                            if (bVar != null) {
                                bVar.mo32549b(((Integer) next.getKey()).intValue(), pByteArray.value, ((C20842c) next.getValue()).getType());
                                Log.m105925i("MicroMsg.BackupBaseScene", "resendSceneMap sceneSeq[%d], type[%d], sceneBuf[%d]", next.getKey(), Integer.valueOf(((C20842c) next.getValue()).getType()), Integer.valueOf(pByteArray.value.length));
                            } else {
                                Log.m105921e("MicroMsg.BackupBaseScene", "resendSceneMap engineSender null, sceneSeq[%d], type[%d], sceneBuf[%d]", next.getKey(), Integer.valueOf(((C20842c) next.getValue()).getType()), Integer.valueOf(pByteArray.value.length));
                            }
                        } else {
                            Log.m105921e("MicroMsg.BackupBaseScene", "resendSceneMap sceneBuf null, sceneSeq[%d]", next.getKey());
                        }
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.BackupBaseScene", e, "req to buf fail: " + e.toString(), new Object[0]);
                    }
                    i++;
                }
                if (i > 0 && i % 5 == 0) {
                    ((C20633g.C20636c.C20637a) this.f58893d).mo32310a(false);
                }
            }
            ((C20633g.C20636c.C20637a) this.f58893d).mo32310a(true);
            Log.m105925i("MicroMsg.BackupBaseScene", "resendSceneMap finish, sceneMap[%d], time[%d]", Integer.valueOf(C20842c.f58876g.size()), Long.valueOf(Util.milliSecondsToNow(nowMilliSecond)));
        }
    }
}
