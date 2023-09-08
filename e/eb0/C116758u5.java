package eb0;

import com.tencent.p014mm.autogen.events.SyncPauseEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import junit.framework.Assert;

/* renamed from: eb0.u5 */
public class C116758u5 {

    /* renamed from: a */
    public C116759a f350059a = null;

    /* renamed from: b */
    public long f350060b = 0;

    /* renamed from: c */
    public long f350061c = 0;

    /* renamed from: d */
    public String f350062d = "";

    /* renamed from: e */
    public int f350063e = 1;

    /* renamed from: eb0.u5$a */
    public interface C116759a {
    }

    public C116758u5(C116759a aVar) {
        Assert.assertTrue(aVar != null);
        this.f350059a = aVar;
        this.f350063e = 1;
        this.f350060b = 0;
        this.f350061c = 0;
        this.f350062d = "";
    }

    /* renamed from: a */
    public synchronized void mo180730a() {
        Log.m105919d("MicroMsg.SyncPauser", "restartSync currState:%d %s", Integer.valueOf(this.f350063e), Util.getStack());
        if (this.f350063e == 1) {
            Log.m105919d("MicroMsg.SyncPauser", "warning: restartSync but currState has been STATE_RUNNING %s", Util.getStack());
            return;
        }
        this.f350063e = 1;
        this.f350060b = 0;
        this.f350061c = 0;
        this.f350062d = "";
        SyncPauseEvent syncPauseEvent = new SyncPauseEvent();
        syncPauseEvent.f343624d.f343625a = 1;
        syncPauseEvent.publish();
    }

    /* renamed from: b */
    public synchronized void mo180731b() {
        int i = this.f350063e;
        if (i != 2) {
            Log.m105921e("MicroMsg.SyncPauser", "ERR: setFullPause but currState is %d  %s", Integer.valueOf(i), Util.getStack());
            return;
        }
        Log.m105919d("MicroMsg.SyncPauser", "setFullPause waitTime:%d %s", Long.valueOf(Util.milliSecondsToNow(this.f350061c)), Util.getStack());
        this.f350063e = 3;
        SyncPauseEvent syncPauseEvent = new SyncPauseEvent();
        syncPauseEvent.f343624d.f343625a = 3;
        syncPauseEvent.publish();
    }
}
