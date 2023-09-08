package com.tencent.p014mm.plugin.scanner.util;

import android.os.Looper;
import android.os.Message;
import com.tencent.p014mm.autogen.events.ScanDarkDetectEvent;
import com.tencent.p014mm.plugin.scanner.util.ScanCameraLightDetector;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.scanner.util.a */
public class C19124a extends MMHandler {

    /* renamed from: a */
    public final /* synthetic */ ScanCameraLightDetector f53838a;

    /* renamed from: com.tencent.mm.plugin.scanner.util.a$a */
    public class C19125a implements Runnable {
        public C19125a(C19124a aVar) {
        }

        public void run() {
            ScanDarkDetectEvent scanDarkDetectEvent = new ScanDarkDetectEvent();
            scanDarkDetectEvent.f48120d.f48121a = true;
            scanDarkDetectEvent.publish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.util.a$b */
    public class C19126b implements Runnable {
        public C19126b(C19124a aVar) {
        }

        public void run() {
            ScanDarkDetectEvent scanDarkDetectEvent = new ScanDarkDetectEvent();
            scanDarkDetectEvent.f48120d.f48121a = false;
            scanDarkDetectEvent.publish();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19124a(ScanCameraLightDetector scanCameraLightDetector, Looper looper) {
        super(looper);
        this.f53838a = scanCameraLightDetector;
    }

    public void handleMessage(Message message) {
        ScanCameraLightDetector.C19123a aVar;
        if (message.what == 233 && (aVar = (ScanCameraLightDetector.C19123a) message.obj) != null) {
            long currentTicks = Util.currentTicks();
            boolean a = ScanCameraLightDetector.m20245a(this.f53838a, aVar.f53835a, aVar.f53836b, aVar.f53837c);
            this.f53838a.getClass();
            Log.m105925i("MicroMsg.ScanCameraLightDetector", "isYuvDark: %s, currentLight: %s, used %sms", Boolean.valueOf(a), Float.valueOf(-1.0f), Long.valueOf(Util.ticksToNow(currentTicks)));
            if (a) {
                Log.m105924i("MicroMsg.ScanCameraLightDetector", "is dark now");
                ScanCameraLightDetector scanCameraLightDetector = this.f53838a;
                scanCameraLightDetector.f53831b++;
                if (!scanCameraLightDetector.f53830a.equals("continuous-video") || this.f53838a.f53831b >= 2) {
                    this.f53838a.f53831b = 0;
                    MMHandlerThread.postToMainThread(new C19125a(this));
                    return;
                }
                return;
            }
            Log.m105924i("MicroMsg.ScanCameraLightDetector", "not dark");
            this.f53838a.f53831b = 0;
            MMHandlerThread.postToMainThread(new C19126b(this));
        }
    }
}
