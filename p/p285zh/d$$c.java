package p285zh;

import com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;

/* renamed from: zh.d$$c */
public final /* synthetic */ class d$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f356721d;

    public /* synthetic */ d$$c(long j) {
        this.f356721d = j;
    }

    public final void run() {
        long j = this.f356721d;
        synchronized ("MicroMsg.NotifyPowerInspector") {
            if (!AppExplicitBackgroundOwner.INSTANCE.isBackground()) {
                if (j > 0) {
                    long max = Math.max(1, j / 60000);
                    if (WeChatEnvironment.hasDebugger() || max > 10) {
                        C119114c.m167926k(max, false);
                    }
                }
                C119114c.m167916a();
            }
        }
    }
}
