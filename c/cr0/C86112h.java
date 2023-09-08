package cr0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

/* renamed from: cr0.h */
public class C86112h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C86113i f250624d;

    public C86112h(C86113i iVar) {
        this.f250624d = iVar;
    }

    public void run() {
        Log.m105924i("MicroMsg.AppBrandDeviceOrientationRetrier", "cancelTikTok reset");
        C86113i iVar = this.f250624d;
        MTimerHandler mTimerHandler = iVar.f250627c;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
        iVar.f250625a = 0;
        iVar.f250626b = null;
    }
}
