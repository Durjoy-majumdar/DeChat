package ne2;

import android.text.format.DateFormat;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.systemservicecache.NetworkCache;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.C85801v1;
import eb0.C45628s0;
import f40.C86709a0;
import lc3.C10485b;
import xb0.C38471b;

/* renamed from: ne2.a */
public class C34823a {
    /* renamed from: a */
    public static final boolean m40471a() {
        return (C38471b.m41887c() ^ true) && m40472b();
    }

    /* renamed from: b */
    public static final boolean m40472b() {
        Class cls = C10485b.class;
        int i = Util.getInt(((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("ChatImgAutoDownload"), 1);
        if (i == 3) {
            Log.m105924i("MicroMsg.Priority.C2CMsgImgAutoDownloadControlLogic", "settings is not auto download C2C image. ChatImgAutoDownload : " + i);
            return false;
        } else if ((i == 2 && !NetStatusUtil.isWifi(MMApplicationContext.getContext())) || i != 1) {
            return false;
        } else {
            if (NetworkCache.INSTANCE.isWifiFromCache(MMApplicationContext.getContext())) {
                return true;
            }
            long j = (long) Util.getInt(((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("ChatImgAutoDownloadMax"), 0);
            C85801v1 i2 = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_AUTOGETBIG_IMG_CURRENT_LONG;
            long nullAs = Util.nullAs((Long) i2.mo119685f(aVar, (Object) null), 0);
            long safeParseLong = Util.safeParseLong((String) DateFormat.format("M", System.currentTimeMillis()));
            C85801v1 i3 = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_AUTOGETBIG_IMG_CURRENT_DATE_LONG;
            long nullAs2 = Util.nullAs((Long) i3.mo119685f(aVar2, (Object) null), 0);
            Log.m105918d("MicroMsg.Priority.C2CMsgImgAutoDownloadControlLogic", "currentmonth " + safeParseLong + " month " + nullAs2 + " maxcount " + j + " current " + nullAs);
            if (safeParseLong != nullAs2) {
                Log.m105925i("MicroMsg.Priority.C2CMsgImgAutoDownloadControlLogic", "update month %d ", Long.valueOf(safeParseLong));
                C86709a0.m107535s().mo121142i().mo119677K(aVar, 0L);
                C86709a0.m107535s().mo121142i().mo119677K(aVar2, Long.valueOf(safeParseLong));
                nullAs = 0;
            }
            if (nullAs <= j || j <= 0) {
                return true;
            }
            Log.m105924i("MicroMsg.Priority.C2CMsgImgAutoDownloadControlLogic", "this month had auto download " + nullAs + " C2C image, can not auto download.");
            return false;
        }
    }

    /* renamed from: c */
    public static final boolean m40473c(String str) {
        return (C45628s0.m50740E(str) && C45628s0.m50747L(str)) || (C72996z1.m85820U5(str) && !C45628s0.m50739D(str));
    }
}
