package com.tencent.p014mm.plugin.appbrand.appstorage;

import android.system.ErrnoException;
import android.system.Os;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;

/* renamed from: com.tencent.mm.plugin.appbrand.appstorage.a0 */
public final class C81409a0 {
    /* renamed from: a */
    public static boolean m99866a(String str, String str2) {
        try {
            long nowMilliSecond = Util.nowMilliSecond();
            Os.rename(C86013q1.m106448i(str, true), C86013q1.m106448i(str2, true));
            Log.m105919d("MicroMsg.AppBrand.FileMove", "move, os rename works, cost = %d", Long.valueOf(Util.nowMilliSecond() - nowMilliSecond));
            return true;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.AppBrand.FileMove", "move, os rename exp = %s", Util.stackTraceToString(e));
            if (!(e instanceof ErrnoException)) {
                boolean x = C86013q1.m106463x(str, str2);
                return !x ? C40431e0.m43625a(C86013q1.m106448i(str, true), C86013q1.m106448i(str2, true), true) : x;
            }
            throw ((ErrnoException) e);
        }
    }
}
