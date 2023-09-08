package n61;

import android.os.MessageQueue;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import s00.C90110f;

/* renamed from: n61.p */
public final class C34742p implements MessageQueue.IdleHandler {

    /* renamed from: d */
    public static final C34742p f93401d = new C34742p();

    public final boolean queueIdle() {
        Log.m105924i("MicroMsg.EmojiStoreV3HomeUI", "now try to activity the tools process");
        ((C90110f) C86312j.m106911c(C90110f.class)).mo124152cj();
        return false;
    }
}
