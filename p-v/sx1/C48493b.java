package sx1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: sx1.b */
public class C48493b {

    /* renamed from: b */
    public static C48493b f129699b;

    /* renamed from: a */
    public Map<String, MTimerHandler> f129700a = new ConcurrentHashMap();

    /* renamed from: sx1.b$a */
    public interface C48494a {
        /* renamed from: a */
        void mo65649a();
    }

    /* renamed from: b */
    public static C48493b m53856b() {
        if (f129699b == null) {
            f129699b = new C48493b();
        }
        return f129699b;
    }

    /* renamed from: a */
    public void mo73124a(String str, C48494a aVar) {
        synchronized (this) {
            if (Util.isNullOrNil(str)) {
                return;
            }
            if (((ConcurrentHashMap) this.f129700a).containsKey(str)) {
                Log.m105925i("MicroMsg.GameAutoRunController", "taskId:%s exists in the queue", str);
                return;
            }
            Log.m105925i("MicroMsg.GameAutoRunController", "add taskId:%s to the queue", str);
            MTimerHandler mTimerHandler = new MTimerHandler(str, (MTimerHandler.CallBack) new C48492a(this, str, aVar), false);
            mTimerHandler.startTimer(60000);
            ((ConcurrentHashMap) this.f129700a).put(str, mTimerHandler);
        }
    }
}
