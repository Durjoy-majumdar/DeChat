package ib1;

import com.tencent.p014mm.plugin.facedetect.p045ui.FaceDetectUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: ib1.g */
public class C117149g implements Runnable {
    public C117149g(FaceDetectUI faceDetectUI) {
    }

    public void run() {
        long currentTicks = Util.currentTicks();
        Runtime.getRuntime().gc();
        Log.m105925i("MicroMsg.FaceDetectUI", "hy: gc uses: %d ms", Long.valueOf(Util.ticksToNow(currentTicks)));
    }
}
