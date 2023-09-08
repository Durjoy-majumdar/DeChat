package ov0;

import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C31519v2;
import java.util.Iterator;
import ld2.C46848g;
import ov0.C100544c;

/* renamed from: ov0.b */
public class C100543b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C100544c f294586d;

    public C100543b(C100544c cVar) {
        this.f294586d = cVar;
    }

    public void run() {
        Object obj;
        Object obj2;
        Iterator<C100544c.C100545a> it = this.f294586d.f294587a.iterator();
        while (it.hasNext()) {
            C100544c.C100545a next = it.next();
            int i = next.f294589a;
            if (i == 2 && (obj2 = next.f294590b) != null && (obj2 instanceof String)) {
                String str = (String) obj2;
                Log.m105918d("MicroMsg.BakOldRecoverDelayData", "getContact:" + str);
                C31519v2.m39436a().mo55987c(str, "");
            } else if (i == 1 && (obj = next.f294590b) != null && (obj instanceof String)) {
                C46848g.Ax0().mo69369e((String) next.f294590b);
            }
        }
        this.f294586d.f294587a.clear();
    }
}
