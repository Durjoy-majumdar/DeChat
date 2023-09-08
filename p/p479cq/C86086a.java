package p479cq;

import android.widget.Toast;
import com.tencent.p014mm.emoji.debug.EmojiDebugUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import f62.C31922b1;
import gy3.C87412m;
import java.util.Map;
import ob0.C35136m;
import p595ll.C99500l;
import zt3.C119157j;

/* renamed from: cq.a */
public final class C86086a implements C31922b1 {

    /* renamed from: cq.a$a */
    public static final class C86087a implements Runnable {

        /* renamed from: d */
        public static final C86087a f250573d = new C86087a();

        public final void run() {
            Toast.makeText(MMApplicationContext.getContext(), "Syncing meaning", 1).show();
        }
    }

    /* renamed from: X5 */
    public C35136m.C35139b mo10269X5(String str, Map<String, String> map, C35136m.C35137a aVar) {
        C87412m.m108591d(map);
        String str2 = map.get(".sysmsg.emojisync.syncparam");
        Log.m105924i("MicroMsg.EmojiSyncMsgConsumer", "emoji sync message: syncParam = " + str2);
        boolean z = EmojiDebugUI.f266600g;
        if (EmojiDebugUI.f266602i) {
            ((C119157j) C119157j.f356862d).mo183895z(C86087a.f250573d);
        }
        new C99500l(0, str2).mo138911a();
        return null;
    }
}
