package com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim;

import android.text.TextUtils;
import com.tencent.p014mm.network.C81035d;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.ConnectivityCompat;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import java.io.ByteArrayOutputStream;
import java.net.URL;
import java.util.ArrayList;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98123f;
import p1081gi.C98124g;
import p663qo.C101213l;
import ps2.C100891r;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.k */
public class C94724k {

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.k$a */
    public class C94725a implements C98124g.C98125a {
        /* renamed from: g0 */
        public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
            SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper$1");
            StringBuilder sb = new StringBuilder();
            sb.append("callback, mediaId=");
            sb.append(str);
            sb.append(", startRet=");
            sb.append(i);
            sb.append(", retCode=");
            sb.append(dVar == null ? -1 : dVar.field_retCode);
            sb.append(", onlyCheckExist=");
            sb.append(z);
            Log.m105924i("AdLandingPagePagFileHelper", sb.toString());
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper$1");
            return 0;
        }

        /* renamed from: h */
        public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
            SnsMethodCalculate.markStartTimeMs("getCdnAuthInfo", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper$1");
            SnsMethodCalculate.markEndTimeMs("getCdnAuthInfo", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper$1");
        }

        /* renamed from: j */
        public byte[] mo1775j(String str, byte[] bArr) {
            SnsMethodCalculate.markStartTimeMs("decodePrepareResponse", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper$1");
            byte[] bArr2 = new byte[0];
            SnsMethodCalculate.markEndTimeMs("decodePrepareResponse", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper$1");
            return bArr2;
        }
    }

    /* renamed from: a */
    public static void m119921a(String str) {
        SnsMethodCalculate.markStartTimeMs("downloadPagFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
        Log.m105924i("AdLandingPagePagFileHelper", "downloadPagFile, url=" + str);
        if (TextUtils.isEmpty(str)) {
            SnsMethodCalculate.markEndTimeMs("downloadPagFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
            return;
        }
        C98123f fVar = new C98123f();
        fVar.f287660d = "task_SnsAdFileDownloader";
        SnsMethodCalculate.markStartTimeMs("getPagFilePath", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
        String m = C100891r.m132218m("adId", str);
        SnsMethodCalculate.markEndTimeMs("getPagFilePath", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
        C86013q1.m106447h(m);
        SnsMethodCalculate.markStartTimeMs("attachTaskInfo", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
        boolean z = false;
        try {
            String mD5String = MD5Util.getMD5String(str);
            Log.m105924i("AdLandingPagePagFileHelper", "attachTaskInfo, mediaId=" + mD5String + ", fileUrl=" + str);
            String host = new URL(str).getHost();
            int f = C81035d.m98965f(host, false, new ArrayList());
            int f2 = C81035d.m98965f(host, true, new ArrayList());
            fVar.field_mediaId = mD5String;
            fVar.f287631R = str;
            fVar.f287633S = host;
            fVar.f287635U = m;
            fVar.f287638X = f;
            fVar.f287639Y = f2;
            fVar.f287640Z = false;
            fVar.f287641p0 = "" + ConnectivityCompat.Companion.getCompatMixStrength();
            fVar.f287642x0 = "";
            fVar.f287630Q0 = 150;
            fVar.f287632R0 = 20201;
            SnsMethodCalculate.markEndTimeMs("attachTaskInfo", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
            z = true;
        } catch (Exception e) {
            Log.m105920e("AdLandingPagePagFileHelper", "attachTaskInfo, exp=" + e.toString());
            SnsMethodCalculate.markEndTimeMs("attachTaskInfo", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
        }
        if (z) {
            fVar.f287662f = new C94725a();
            if (((C101213l) C86312j.m106911c(C101213l.class)).xf0(fVar)) {
                Log.m105924i("AdLandingPagePagFileHelper", "downloadPagFile, addRecvTask suc");
            } else {
                Log.m105928w("AdLandingPagePagFileHelper", "downloadPagFile, addRecvTask failed");
            }
        } else {
            Log.m105928w("AdLandingPagePagFileHelper", "downloadPagFile, attachTaskInfo failed");
        }
        SnsMethodCalculate.markEndTimeMs("downloadPagFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
    }

    /* renamed from: b */
    public static String m119922b(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("findLocalPagFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
        try {
            if (TextUtils.isEmpty(str)) {
                Log.m105928w("AdLandingPagePagFileHelper", "findLocalPagFile, url empty");
                SnsMethodCalculate.markEndTimeMs("findLocalPagFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
                return "";
            }
            String m = C100891r.m132218m("adId", str);
            if (C86013q1.m106450k(m)) {
                SnsMethodCalculate.markStartTimeMs("isValidPagFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
                boolean z = false;
                if (!C86013q1.m106450k(m)) {
                    SnsMethodCalculate.markEndTimeMs("isValidPagFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
                } else {
                    if (TextUtils.isEmpty(str2)) {
                        SnsMethodCalculate.markEndTimeMs("isValidPagFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
                    } else if (str2.equals(C86013q1.m106456q(m))) {
                        SnsMethodCalculate.markEndTimeMs("isValidPagFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
                    } else {
                        SnsMethodCalculate.markEndTimeMs("isValidPagFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
                    }
                    z = true;
                }
                if (z) {
                    Log.m105924i("AdLandingPagePagFileHelper", "findLocalPagFile, succ, url=" + str + ", path=" + m + ", md5=" + str2);
                    SnsMethodCalculate.markEndTimeMs("findLocalPagFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
                    return m;
                }
                C86013q1.m106447h(m);
                Log.m105928w("AdLandingPagePagFileHelper", "findLocalPagFile, check md5 failed, url=" + str + ", path=" + m);
            } else {
                Log.m105928w("AdLandingPagePagFileHelper", "findLocalPagFile, not exists, url=" + str);
            }
            SnsMethodCalculate.markEndTimeMs("findLocalPagFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
            return "";
        } catch (Throwable th) {
            Log.m105920e("AdLandingPagePagFileHelper", "findLocalPagFile, exp=" + th.toString());
            SnsMethodCalculate.markEndTimeMs("findLocalPagFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
            return "";
        }
    }

    /* renamed from: c */
    public static byte[] m119923c(String str) {
        SnsMethodCalculate.markStartTimeMs("loadPagFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
        byte[] O = C86013q1.m106433O(str, 0, -1);
        SnsMethodCalculate.markEndTimeMs("loadPagFile", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper");
        return O;
    }
}
