package a61;

import com.tencent.p014mm.autogen.events.EmojiFileCleanTaskEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import i61.C33211d;
import i61.C33212e;
import u61.C101964h;

/* renamed from: a61.k */
public class C27770k extends IStaticListener<EmojiFileCleanTaskEvent> {
    public boolean callback(IEvent iEvent) {
        int i = ((EmojiFileCleanTaskEvent) iEvent).f78774d.f78775a;
        if (i == 0) {
            C33212e b = C33212e.m39992b();
            String f = C101964h.m134224f();
            b.f90109a = true;
            if (Util.isNullOrNil(f)) {
                Log.m105924i("MicroMsg.emoji.EmojiFileCleanTaskManager", "filepath is empty.");
            } else {
                boolean z = System.currentTimeMillis() - ((Long) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_EMOJI_CLEAN_TEMP_FILE_TASK_LONG, 0L)).longValue() >= 86400000;
                Log.m105925i("MicroMsg.emoji.EmojiFileCleanTaskManager", "need clean emoji file:%B", Boolean.valueOf(z));
                if (z) {
                    Log.m105924i("MicroMsg.emoji.EmojiFileCleanTaskManager", "startClean");
                    C86709a0.m107525e().postToWorker(new C33211d(b, f));
                }
            }
        } else if (i == 1) {
            C33212e.m39992b().f90109a = false;
        }
        return false;
    }
}
