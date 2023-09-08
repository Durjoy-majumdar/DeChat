package bd0;

import android.os.MessageQueue;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;

/* renamed from: bd0.g */
public class C92256g implements MessageQueue.IdleHandler {

    /* renamed from: d */
    public final /* synthetic */ C92250f f264048d;

    public C92256g(C92250f fVar) {
        this.f264048d = fVar;
    }

    public boolean queueIdle() {
        if (C86709a0.m107524d().f256815j) {
            Log.m105928w("MicroMsg.SpeexUploadCore", "skiped resume speex uploader, not foreground");
            return false;
        }
        Log.m105918d("MicroMsg.SpeexUploadCore", "now resume speex uploader");
        this.f264048d.f264039b.pause(false);
        return false;
    }
}
