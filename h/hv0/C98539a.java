package hv0;

import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C31519v2;
import hv0.C98540b;
import java.util.Iterator;
import ld2.C46848g;

/* renamed from: hv0.a */
public class C98539a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C98540b f288961d;

    public C98539a(C98540b bVar) {
        this.f288961d = bVar;
    }

    public void run() {
        Object obj;
        Object obj2;
        Iterator<C98540b.C98541a> it = this.f288961d.f288962a.iterator();
        while (it.hasNext()) {
            C98540b.C98541a next = it.next();
            int i = next.f288964a;
            if (i == 2 && (obj2 = next.f288965b) != null && (obj2 instanceof String)) {
                String str = (String) obj2;
                Log.m105918d("MicroMsg.BackupRecoverDelayData", "getContact:" + str);
                C31519v2.m39436a().mo55987c(str, "");
            } else if (i == 1 && (obj = next.f288965b) != null && (obj instanceof String)) {
                C46848g.Ax0().mo69369e((String) next.f288965b);
            }
        }
        this.f288961d.f288962a.clear();
    }
}
