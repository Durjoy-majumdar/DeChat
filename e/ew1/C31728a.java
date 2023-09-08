package ew1;

import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.HashMap;

/* renamed from: ew1.a */
public final class C31728a {

    /* renamed from: a */
    public static final C31728a f84717a = new C31728a();

    /* renamed from: b */
    public static final HashMap<String, C31729a> f84718b = new HashMap<>();

    /* renamed from: ew1.a$a */
    public interface C31729a {
        /* renamed from: A3 */
        void mo58325A3(String str, int i, Intent intent);
    }

    /* renamed from: a */
    public final void mo58324a(String str) {
        C87412m.m108594g(str, "sessionId");
        HashMap<String, C31729a> hashMap = f84718b;
        hashMap.remove(str);
        Log.m105924i("MicroMsg.AlbumResultDispatcher", "unregisterCallback: count " + hashMap.size());
    }
}
