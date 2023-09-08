package com.tencent.p014mm.plugin.scanner.util;

import android.os.HandlerThread;
import android.os.Message;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import eu3.C58834h;
import eu3.C97749e;

/* renamed from: com.tencent.mm.plugin.scanner.util.ScanCameraLightDetector */
public class ScanCameraLightDetector {

    /* renamed from: f */
    public static final ScanCameraLightDetector f53829f = new ScanCameraLightDetector();

    /* renamed from: a */
    public String f53830a;

    /* renamed from: b */
    public int f53831b;

    /* renamed from: c */
    public long f53832c = -1;

    /* renamed from: d */
    public HandlerThread f53833d;

    /* renamed from: e */
    public MMHandler f53834e;

    /* renamed from: com.tencent.mm.plugin.scanner.util.ScanCameraLightDetector$a */
    public class C19123a {

        /* renamed from: a */
        public byte[] f53835a;

        /* renamed from: b */
        public int f53836b;

        /* renamed from: c */
        public int f53837c;

        public C19123a(ScanCameraLightDetector scanCameraLightDetector, C19124a aVar) {
        }
    }

    /* renamed from: a */
    public static boolean m20245a(ScanCameraLightDetector scanCameraLightDetector, byte[] bArr, int i, int i2) {
        scanCameraLightDetector.getClass();
        if (Util.isNullOrNil(bArr) || bArr.length <= i * i2) {
            return false;
        }
        int calcLumNative = calcLumNative(bArr, i, i2);
        Log.m105925i("MicroMsg.ScanCameraLightDetector", "lum light: %s", Integer.valueOf(calcLumNative));
        return calcLumNative < 50;
    }

    private static native int calcLumNative(byte[] bArr, int i, int i2);

    /* renamed from: b */
    public void mo24505b(byte[] bArr, int i, int i2) {
        HandlerThread handlerThread;
        long j = this.f53832c;
        if ((j < 0 || Util.ticksToNow(j) >= 1000) && this.f53834e != null && (handlerThread = this.f53833d) != null && handlerThread.isAlive()) {
            C19123a aVar = new C19123a(this, (C19124a) null);
            aVar.f53835a = bArr;
            aVar.f53836b = i;
            aVar.f53837c = i2;
            Message obtain = Message.obtain();
            obtain.what = 233;
            obtain.obj = aVar;
            this.f53834e.sendMessage(obtain);
            this.f53832c = Util.currentTicks();
        }
    }

    /* renamed from: c */
    public void mo24506c(String str) {
        try {
            this.f53830a = str;
            Log.m105924i("MicroMsg.ScanCameraLightDetector", "alvinluo initDetectThread");
            mo24507d();
            int i = C58834h.f168432b;
            HandlerThread a = C97749e.m126093a("ScanCameraLightDetector_detectThread", 5);
            this.f53833d = a;
            a.start();
            this.f53834e = new C19124a(this, this.f53833d.getLooper());
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ScanCameraLightDetector", e, "start error: %s", e.getMessage());
        }
    }

    /* renamed from: d */
    public void mo24507d() {
        try {
            this.f53832c = -1;
            HandlerThread handlerThread = this.f53833d;
            if (handlerThread != null) {
                handlerThread.quit();
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ScanCameraLightDetector", e, "stop error: %s", e.getMessage());
        }
    }
}
