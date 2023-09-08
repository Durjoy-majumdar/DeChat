package r10;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.entry.ApplicationLike;

/* renamed from: r10.b */
public abstract class C36244b {
    /* renamed from: a */
    public final int mo60582a(ApplicationLike applicationLike) {
        int b = mo60583b(applicationLike);
        if (b == 0) {
            Log.m105925i("MicroMsg.AbstractFuse", "Fuse '%s' was checked, result: normal.", mo60584c());
        } else if (b == 1) {
            Log.m105929w("MicroMsg.AbstractFuse", "Fuse '%s' was checked, result: skip startup.", mo60584c());
        } else if (b == 2) {
            Log.m105929w("MicroMsg.AbstractFuse", "Fuse '%s' was checked, result: suicide.", mo60584c());
        } else {
            throw new IllegalStateException("Fuse '" + mo60584c() + "' return unknown action: " + b);
        }
        return b;
    }

    /* renamed from: b */
    public abstract int mo60583b(ApplicationLike applicationLike);

    /* renamed from: c */
    public abstract String mo60584c();
}
