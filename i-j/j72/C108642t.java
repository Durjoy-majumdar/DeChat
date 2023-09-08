package j72;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;

/* renamed from: j72.t */
public class C108642t implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f325337d;

    public C108642t(C108633r rVar, String str) {
        this.f325337d = str;
    }

    public void run() {
        try {
            C86013q1.m106447h(this.f325337d);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "stop, delete old file error: %s", e.getMessage());
        }
    }
}
