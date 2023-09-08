package p977hj;

import android.os.Process;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.SyncTask;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: hj.d */
public class C87529d extends SyncTask<String> {
    public C87529d(C87530e eVar, long j, String str) {
        super(j, str);
    }

    public Object run() {
        while (true) {
            String processNameByPid = Util.getProcessNameByPid(MMApplicationContext.getContext(), Process.myPid());
            if (processNameByPid != null) {
                return processNameByPid;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Log.printErrStackTrace("MicroMsg.ProfileFactoryImpl", e, "", new Object[0]);
            }
        }
    }
}
