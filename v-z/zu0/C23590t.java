package zu0;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: zu0.t */
public class C23590t {

    /* renamed from: a */
    public final C23584k f67685a;

    /* renamed from: b */
    public C23589s f67686b = null;

    /* renamed from: c */
    public long f67687c = 0;

    /* renamed from: d */
    public AtomicInteger f67688d = new AtomicInteger(0);

    public C23590t(C23584k kVar) {
        this.f67685a = kVar;
    }

    /* renamed from: a */
    public boolean mo37066a() {
        Log.m105925i("MicroMsg.BackupPackAndSend.TagQueueSucker", "endCount:%d", Integer.valueOf(this.f67688d.get()));
        return this.f67688d.get() == 0;
    }
}
