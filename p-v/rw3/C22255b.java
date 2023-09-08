package rw3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.worddetect.C20118a;

/* renamed from: rw3.b */
public class C22255b implements Runnable {
    public void run() {
        synchronized (C20118a.class) {
            if (C20118a.f57008a && C20118a.f57009b != null) {
                Log.m105924i("MicroMsg.WordDetectModHelper", "releaseWordDetect");
                C20118a.f57009b.release();
                C20118a.f57009b = null;
                C20118a.f57008a = false;
            }
        }
    }
}
