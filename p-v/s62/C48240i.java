package s62;

import android.os.Process;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import p910lj.C76701a;

/* renamed from: s62.i */
public class C48240i implements Runnable {
    public C48240i(C110766j jVar) {
    }

    public void run() {
        C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) String.format("MediaCodecProxy dequeueInputBuffer, thread:[%s]", new Object[]{Integer.valueOf(Process.myTid())}), 1).show();
    }
}
