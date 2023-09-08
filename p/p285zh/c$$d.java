package p285zh;

import com.tencent.p014mm.sdk.platformtools.Log;
import sf0.C48374j0;
import te3.C50886px;
import te3.C77949j3;

/* renamed from: zh.c$$d */
public final /* synthetic */ class c$$d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C50886px f356704d;

    public /* synthetic */ c$$d(C50886px pxVar) {
        this.f356704d = pxVar;
    }

    public final void run() {
        try {
            C77949j3 j3Var = (C77949j3) new C77949j3().parseFrom(C48374j0.m53715d(this.f356704d.f140038e));
            int i = j3Var.f227630g;
            C119114c.m167920e("MicroMsg.NotifyPowerInspector", "noteAddMsgType: type=" + i);
            c$$e c__e = C119114c.f356693j;
            if (c__e.mo183788b() || !C119114c.f356685b) {
                c__e.mo183789c(String.valueOf(i));
            }
            if (j3Var.f227630g == 49) {
                String hexString = Integer.toHexString(((Integer) ((c$$b) C119114c.f356703t).apply(j3Var)).intValue() & -50);
                C119114c.m167920e("MicroMsg.NotifyPowerInspector", "noteAddAppMsgType: type=" + hexString);
                c$$e c__e2 = C119114c.f356694k;
                if (c__e2.mo183788b() || !C119114c.f356685b) {
                    c__e2.mo183789c(hexString);
                }
            }
        } catch (Throwable th) {
            Log.m105928w("MicroMsg.NotifyPowerInspector", "parse cmd fail: " + th.getMessage());
        }
    }
}
