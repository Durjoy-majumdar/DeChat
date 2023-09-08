package bd0;

import android.os.Looper;
import android.os.MessageQueue;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: bd0.c */
public class C92247c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C92249d f264033d;

    /* renamed from: bd0.c$a */
    public class C92248a implements MessageQueue.IdleHandler {
        public C92248a() {
        }

        public boolean queueIdle() {
            Log.m105918d("MicroMsg.SpeexEncoderWorker", "queueIdle  ");
            C92250f b = C92250f.m115988b();
            C92249d dVar = C92247c.this.f264033d;
            b.getClass();
            Log.m105918d("MicroMsg.SpeexUploadCore", "pushWork");
            b.f264039b.add(dVar);
            return false;
        }
    }

    public C92247c(C92249d dVar) {
        this.f264033d = dVar;
    }

    public void run() {
        Looper.myQueue().addIdleHandler(new C92248a());
    }
}
