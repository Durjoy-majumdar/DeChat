package m90;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;

/* renamed from: m90.j */
public class C10772j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f32245d;

    public C10772j(C109557d dVar, String str) {
        this.f32245d = str;
    }

    public void run() {
        try {
            C86013q1.m106447h(this.f32245d);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] stop, delete old file error: %s", e.getMessage());
        }
    }
}
