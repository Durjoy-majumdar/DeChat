package ps2;

import a70.C112760b;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import ps2.C100880k;

/* renamed from: ps2.r */
public class C100891r {
    /* renamed from: a */
    public static void m132206a(String str, boolean z, int i, int i2, C100880k.C100881a aVar) {
        SnsMethodCalculate.markStartTimeMs("downloadImgByHttp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
        SnsMethodCalculate.markStartTimeMs("downloadImgByHttp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
        Log.m105924i("MicroMsg.AdLandingPagesDownloadResourceHelper", "start download img for " + str + " for adid:" + "adId");
        C100871j.m132171b(str, m132217l("adId", str), z, i, i2, aVar);
        SnsMethodCalculate.markEndTimeMs("downloadImgByHttp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
        SnsMethodCalculate.markEndTimeMs("downloadImgByHttp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
    }

    /* renamed from: b */
    public static void m132207b(String str, String str2, boolean z, int i, int i2, C100880k.C100881a aVar) {
        SnsMethodCalculate.markStartTimeMs("downloadImgForAdLandingPages", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
        if (Util.isNullOrNil(str2) || Util.isNullOrNil(str)) {
            aVar.mo76113a();
            SnsMethodCalculate.markEndTimeMs("downloadImgForAdLandingPages", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
            return;
        }
        m132209d(str, str2, aVar);
        SnsMethodCalculate.markEndTimeMs("downloadImgForAdLandingPages", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
    }

    /* renamed from: c */
    public static void m132208c(String str, boolean z, int i, int i2, C100880k.C100881a aVar) {
        SnsMethodCalculate.markStartTimeMs("downloadImgForAdLandingPages", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
        m132207b("adId", str, z, i, i2, aVar);
        SnsMethodCalculate.markEndTimeMs("downloadImgForAdLandingPages", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
    }

    /* renamed from: d */
    public static void m132209d(String str, String str2, C100880k.C100881a aVar) {
        SnsMethodCalculate.markStartTimeMs("downloadNewImgForAdLandingPages", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
        if (Util.isNullOrNil(str2) || Util.isNullOrNil(str)) {
            aVar.mo76113a();
            SnsMethodCalculate.markEndTimeMs("downloadNewImgForAdLandingPages", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
            return;
        }
        Log.m105924i("MicroMsg.AdLandingPagesDownloadResourceHelper", "start download new img for " + str2 + " for adid:" + str);
        C100871j.m132170a(str2, m132212g(), m132215j(str, str2), 0, aVar);
        SnsMethodCalculate.markEndTimeMs("downloadNewImgForAdLandingPages", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
    }

    /* renamed from: e */
    public static void m132210e(String str, String str2, boolean z, int i, int i2, C100880k.C100881a aVar) {
        SnsMethodCalculate.markStartTimeMs("downloadSightForAdLandingPages", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
        Log.m105924i("MicroMsg.AdLandingPagesDownloadResourceHelper", "downloadSightForAdLandingPages, url=" + str2 + ", adId=" + str);
        C100871j.m132171b(str2, m132219n(str, str2), z, i, i2, aVar);
        SnsMethodCalculate.markEndTimeMs("downloadSightForAdLandingPages", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
    }

    /* renamed from: f */
    public static void m132211f(String str, String str2, C100880k.C100881a aVar) {
        SnsMethodCalculate.markStartTimeMs("downloadSightForAdLandingPagesByCdn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
        if (Util.isNullOrNil(str2) || Util.isNullOrNil(str)) {
            aVar.mo76113a();
            SnsMethodCalculate.markEndTimeMs("downloadSightForAdLandingPagesByCdn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
            return;
        }
        Log.m105924i("MicroMsg.AdLandingPagesDownloadResourceHelper", "downloadSightForAdLandingPagesByCdn, url=" + str2 + ", adId=" + str);
        String g = m132212g();
        SnsMethodCalculate.markStartTimeMs("getFileNameForSight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
        SnsMethodCalculate.markEndTimeMs("getFileNameForSight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
        C100871j.m132170a(str2, g, str + "_sight_" + MD5Util.getMD5String(str2), 1, aVar);
        SnsMethodCalculate.markEndTimeMs("downloadSightForAdLandingPagesByCdn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
    }

    /* renamed from: g */
    public static String m132212g() {
        SnsMethodCalculate.markStartTimeMs("getAdlandingResDir", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
        String str = C112760b.m154195C() + "sns_ad_landingpages/";
        SnsMethodCalculate.markEndTimeMs("getAdlandingResDir", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
        return str;
    }

    /* renamed from: h */
    public static Bitmap m132213h(String str) {
        SnsMethodCalculate.markStartTimeMs("getCachedImg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
        Bitmap i = m132214i("adId", str);
        SnsMethodCalculate.markEndTimeMs("getCachedImg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
        return i;
    }

    /* renamed from: i */
    public static Bitmap m132214i(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("getCachedImg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
        if (Util.isNullOrNil(str2) || Util.isNullOrNil(str)) {
            SnsMethodCalculate.markEndTimeMs("getCachedImg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
            return null;
        }
        try {
            String l = m132217l(str, str2);
            if (!TextUtils.isEmpty(l) && C86013q1.m106450k(l)) {
                Bitmap decodeFile = BitmapUtil.decodeFile(l);
                SnsMethodCalculate.markEndTimeMs("getCachedImg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
                return decodeFile;
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.AdLandingPagesDownloadResourceHelper", "%s", Util.stackTraceToString(e));
        }
        SnsMethodCalculate.markEndTimeMs("getCachedImg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
        return null;
    }

    /* renamed from: j */
    public static String m132215j(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("getFileNameForImg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
        String str3 = str + "_img_" + MD5Util.getMD5String(str2);
        SnsMethodCalculate.markEndTimeMs("getFileNameForImg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
        return str3;
    }

    /* renamed from: k */
    public static String m132216k(String str) {
        SnsMethodCalculate.markStartTimeMs("getPathForImg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
        String str2 = m132212g() + m132215j("adId", str);
        SnsMethodCalculate.markEndTimeMs("getPathForImg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
        return str2;
    }

    /* renamed from: l */
    public static String m132217l(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("getPathForImg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
        String str3 = m132212g() + m132215j(str, str2);
        SnsMethodCalculate.markEndTimeMs("getPathForImg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
        return str3;
    }

    /* renamed from: m */
    public static String m132218m(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("getPathForPagFile", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
        String g = m132212g();
        C86013q1.m106461v(g);
        String str3 = g + str + "_pag_" + MD5Util.getMD5String(str2);
        SnsMethodCalculate.markEndTimeMs("getPathForPagFile", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
        return str3;
    }

    /* renamed from: n */
    public static String m132219n(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("getPathForSight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
        C86013q1.m106461v(m132212g());
        String str3 = m132212g() + str + "_sight_" + MD5Util.getMD5String(str2);
        SnsMethodCalculate.markEndTimeMs("getPathForSight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper");
        return str3;
    }
}
