package p207nl;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C30790w2;
import gy3.C87412m;
import java.io.IOException;
import p490dl.C97489o;
import te3.C51794w70;
import wh3.C38145t;
import wh3.C38146u;

/* renamed from: nl.m */
public final class C47275m {
    /* renamed from: a */
    public static final void m52572a(String str) {
        C87412m.m108594g(str, "groupId");
        C51794w70 h = C97489o.m125592g().mo136766h();
        if (!h.f143906d.contains(str)) {
            h.f143906d.add(str);
            C97489o g = C97489o.m125592g();
            g.getClass();
            try {
                byte[] byteArray = g.mo136766h().toByteArray();
                C38146u g2 = C30790w2.m39221h().mo57720g();
                g2.getClass();
                g2.replace(new C38145t("cache_type_user_data", byteArray));
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.EmojiStorageCache", e, "save user data error", new Object[0]);
            }
        }
    }
}
