package xb0;

import android.content.Context;
import android.text.format.DateFormat;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.systemservicecache.NetworkCache;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86301e;
import di3.C86312j;
import eb0.C75604z3;
import eb0.z3$$h;
import ei3.C86522b;
import f40.C86709a0;
import lc3.C10485b;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: xb0.f */
public class C38474f extends C86301e {
    public static synchronized C38474f wx0() {
        C38474f fVar;
        Class cls = C38474f.class;
        synchronized (cls) {
            fVar = (C38474f) C86312j.m106911c(cls);
        }
        return fVar;
    }

    public final boolean vx0(C72963f4 f4Var) {
        if (f4Var == null) {
            Log.m105928w("MicroMsg.SubCoreAutoDownload", "this message is null.");
            return false;
        }
        z3$$h w = C75604z3.m90851w(f4Var.f230724G);
        if (w == null) {
            Log.m105924i("MicroMsg.SubCoreAutoDownload", "this message had no msg source.");
            return true;
        }
        String str = w.f222112s;
        if (Util.isNullOrNil(str)) {
            Log.m105924i("MicroMsg.SubCoreAutoDownload", "this message had no not auto download time range config.");
            return true;
        } else if (C38471b.m41885a(str)) {
            Log.m105924i("MicroMsg.SubCoreAutoDownload", "this message need control, can not auto download. timeRange : " + str);
            return false;
        } else {
            Log.m105924i("MicroMsg.SubCoreAutoDownload", "this message need control, but it is not the time. timeRange: " + str);
            return true;
        }
    }

    public boolean xx0() {
        Class cls = C10485b.class;
        if (C38471b.m41887c()) {
            Log.m105924i("MicroMsg.SubCoreAutoDownload", "it is busy time now , do not auto download C2C image.");
            return false;
        }
        int i = Util.getInt(((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("ChatImgAutoDownload"), 1);
        if (i == 3) {
            Log.m105924i("MicroMsg.SubCoreAutoDownload", "settings is not auto download C2C image. ChatImgAutoDownload : " + i);
            return false;
        }
        Context context = MMApplicationContext.getContext();
        if (i == 2 && NetworkCache.INSTANCE.isWifiFromCache(context)) {
            Log.m105924i("MicroMsg.SubCoreAutoDownload", "it is wifi now, auto download C2C image.");
            return true;
        } else if (i != 1 || !NetworkCache.INSTANCE.isWifiFromCache(context)) {
            long j = (long) Util.getInt(((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("ChatImgAutoDownloadMax"), 0);
            C85801v1 i2 = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_AUTOGETBIG_IMG_CURRENT_LONG;
            long nullAs = Util.nullAs((Long) i2.mo119685f(aVar, (Object) null), 0);
            long safeParseLong = Util.safeParseLong((String) DateFormat.format("M", System.currentTimeMillis()));
            C85801v1 i3 = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_AUTOGETBIG_IMG_CURRENT_DATE_LONG;
            Context context2 = context;
            long nullAs2 = Util.nullAs((Long) i3.mo119685f(aVar2, (Object) null), 0);
            Log.m105918d("MicroMsg.SubCoreAutoDownload", "currentmonth " + safeParseLong + " month " + nullAs2 + " maxcount " + j + " current " + nullAs + " downloadMode: " + i);
            if (safeParseLong != nullAs2) {
                Log.m105925i("MicroMsg.SubCoreAutoDownload", "update month %d ", Long.valueOf(safeParseLong));
                C86709a0.m107535s().mo121142i().mo119677K(aVar, 0L);
                C86709a0.m107535s().mo121142i().mo119677K(aVar2, Long.valueOf(safeParseLong));
                nullAs = 0;
            }
            if (nullAs > j && j > 0) {
                Log.m105924i("MicroMsg.SubCoreAutoDownload", "this month had auto download " + nullAs + " C2C image, can not auto download.");
                return false;
            } else if (i != 1 || (!NetStatusUtil.isWifi(context2) && !NetStatusUtil.is3G(context2) && !NetStatusUtil.is4G(context2))) {
                Log.m105924i("MicroMsg.SubCoreAutoDownload", "default can not auto download C2C image.");
                return false;
            } else {
                Log.m105924i("MicroMsg.SubCoreAutoDownload", "it is wifi or 3,4G now, auto download C2C image.");
                return true;
            }
        } else {
            Log.m105924i("MicroMsg.SubCoreAutoDownload", "it is wifi now, auto download C2C image.");
            return true;
        }
    }
}
