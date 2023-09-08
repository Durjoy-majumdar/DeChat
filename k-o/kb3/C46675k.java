package kb3;

import com.tencent.p014mm.plugin.wepkg.version.WepkgVersionUpdater;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashSet;

/* renamed from: kb3.k */
public class C46675k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f125643d;

    public C46675k(String str) {
        this.f125643d = str;
    }

    public void run() {
        String str = this.f125643d;
        HashSet hashSet = new HashSet();
        if (!Util.isNullOrNil(str)) {
            hashSet.add(str);
        }
        if (!Util.isNullOrNil(C46665a.m51974c())) {
            hashSet.add(C46665a.m51974c());
        }
        WepkgVersionUpdater.m48922b(hashSet, 0, -1, false);
    }
}
