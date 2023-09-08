package wi0;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import js0.C46574u;
import p224ra.C89909e;
import z04.C112550d0;

/* renamed from: wi0.t */
public final class C53172t {
    /* renamed from: a */
    public static final String m59584a(Context context, String str) {
        if (context == null) {
            context = MMApplicationContext.getContext();
        }
        if (str == null) {
            str = "";
        }
        String a = C46574u.m51897a(context, str, (C46574u.C46575a) C89909e.m112436a(C46574u.C46575a.class));
        C87412m.m108593f(a, "ua");
        if (!C112550d0.m153801u(a, "MiniProgramEnv/android", false)) {
            a = a + " MiniProgramEnv/android";
        }
        C87412m.m108593f(a, "ua");
        return a;
    }
}
