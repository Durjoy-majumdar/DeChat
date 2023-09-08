package lo2;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import ht1.C60200t1;
import ht1.C60214y3;
import java.net.URLEncoder;
import org.json.JSONObject;
import vr2.C102236a0;

/* renamed from: lo2.h0 */
public final class C99542h0 {
    /* renamed from: a */
    public static boolean m129903a(Context context, ADXml aDXml, ADInfo aDInfo, long j, int i) {
        ADInfo aDInfo2 = aDInfo;
        SnsMethodCalculate.markStartTimeMs("checkJumpFinderFeedsDetailUI", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
        try {
            if (m129910h(aDXml, aDInfo)) {
                ADXml.C57361a aVar = aDXml.adFinderInfo;
                Context context2 = context;
                boolean e = m129907e(context2, aDInfo2.uxInfo, aVar.f164345b, aVar.f164344a, aVar.f164346c, j, aDInfo2.preloadFinderFeed, i);
                SnsMethodCalculate.markEndTimeMs("checkJumpFinderFeedsDetailUI", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
                return e;
            }
        } catch (Throwable th) {
            Log.m105920e("FinderAdJumpHelper", "checkJumpFinderFeedsDetailUI exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("checkJumpFinderFeedsDetailUI", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
        return false;
    }

    /* renamed from: b */
    public static boolean m129904b(Context context, ADXml aDXml, ADInfo aDInfo, long j, int i) {
        SnsMethodCalculate.markStartTimeMs("checkJumpFinderProfileUI", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
        try {
            if (m129910h(aDXml, aDInfo)) {
                ADXml.C57361a aVar = aDXml.adFinderInfo;
                boolean g = m129909g(context, aVar.f164345b, aDInfo.uxInfo, C102236a0.m134765q0(j), i);
                SnsMethodCalculate.markEndTimeMs("checkJumpFinderProfileUI", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
                return g;
            }
        } catch (Throwable th) {
            Log.m105920e("FinderAdJumpHelper", "checkJumpFinderProfileUI exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("checkJumpFinderProfileUI", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
        return false;
    }

    /* renamed from: c */
    public static int m129905c(int i) {
        SnsMethodCalculate.markStartTimeMs("convertActionBtnScene", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
        if (i == 1) {
            SnsMethodCalculate.markEndTimeMs("convertActionBtnScene", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
            return 4;
        } else if (i == 2) {
            SnsMethodCalculate.markEndTimeMs("convertActionBtnScene", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
            return 6;
        } else if (i == 3) {
            SnsMethodCalculate.markEndTimeMs("convertActionBtnScene", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
            return 3;
        } else if (i == 4) {
            SnsMethodCalculate.markEndTimeMs("convertActionBtnScene", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
            return 4;
        } else if (i != 10) {
            SnsMethodCalculate.markEndTimeMs("convertActionBtnScene", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
            return 0;
        } else {
            SnsMethodCalculate.markEndTimeMs("convertActionBtnScene", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
            return 2;
        }
    }

    /* renamed from: d */
    public static boolean m129906d(Context context, String str, String str2, String str3, String str4, long j, Long l, int i) {
        Long l2 = l;
        SnsMethodCalculate.markStartTimeMs("doJumpFinderFeedsDetailUI", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
        try {
            String str5 = str;
            String j2 = m129912j(str, C102236a0.m134765q0(j), i);
            SnsMethodCalculate.markStartTimeMs("doJumpFinderFeedsDetailUI", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
            Intent intent = new Intent();
            if (l2 != null) {
                intent.putExtra("feed_object_id", l2);
            }
            m129908f(intent, context, str2, str3, str4, j2);
            SnsMethodCalculate.markEndTimeMs("doJumpFinderFeedsDetailUI", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
            SnsMethodCalculate.markEndTimeMs("doJumpFinderFeedsDetailUI", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
            return true;
        } catch (Throwable th) {
            Log.m105920e("FinderAdJumpHelper", "doJumpFinderFeedsDetailUI exp=" + th.toString());
            SnsMethodCalculate.markEndTimeMs("doJumpFinderFeedsDetailUI", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
            return false;
        }
    }

    /* renamed from: e */
    public static boolean m129907e(Context context, String str, String str2, String str3, String str4, long j, boolean z, int i) {
        String str5 = str4;
        SnsMethodCalculate.markStartTimeMs("doJumpFinderFeedsDetailUI", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
        Long l = null;
        if (z) {
            try {
                l = C99544i0.f291800b.get(str5);
                if (l == null) {
                    l = Long.valueOf(MMApplicationContext.getContext().getSharedPreferences("ad_finder_feeds_preload_id_app_related", 0).getLong(str5, 0));
                    C99544i0.f291800b.put(str5, l);
                    Log.m105924i("FinderAdJumpHelper", "doJumpFinderFeedsDetailUI, no memory objectId, should read sp and put objectId to map, and objectId is " + l);
                } else {
                    Log.m105924i("FinderAdJumpHelper", "doJumpFinderFeedsDetailUI, objectId is " + l);
                }
                SnsMethodCalculate.markStartTimeMs("getFinderPreloadVideoService", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
                C60214y3 y3Var = C99544i0.f291801c;
                SnsMethodCalculate.markEndTimeMs("getFinderPreloadVideoService", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
                if (y3Var != null) {
                    y3Var.mo78735b(l.longValue());
                }
            } catch (Throwable th) {
                Log.m105920e("FinderAdJumpHelper", "doJumpFinderFeedsDetailUI exp=" + th.toString());
                SnsMethodCalculate.markEndTimeMs("doJumpFinderFeedsDetailUI", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
                return false;
            }
        }
        boolean d = m129906d(context, str, str2, str3, str4, j, l, i);
        SnsMethodCalculate.markEndTimeMs("doJumpFinderFeedsDetailUI", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
        return d;
    }

    /* renamed from: f */
    public static boolean m129908f(Intent intent, Context context, String str, String str2, String str3, String str4) {
        Class cls = C60200t1.class;
        SnsMethodCalculate.markStartTimeMs("doJumpFinderFeedsDetailUI", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
        if (intent == null) {
            try {
                intent = new Intent();
            } catch (Throwable th) {
                Log.m105920e("FinderAdJumpHelper", "doJumpFinderFeedsDetailUI exp=" + th.toString());
                SnsMethodCalculate.markEndTimeMs("doJumpFinderFeedsDetailUI", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
                return false;
            }
        }
        intent.putExtra("report_scene", 3);
        intent.putExtra("from_user", str);
        intent.putExtra("feed_encrypted_object_id", str3);
        intent.putExtra("feed_object_nonceId", str2);
        intent.putExtra("key_from_user_name", str);
        intent.putExtra("tab_type", 5);
        intent.putExtra("key_detail_comment_scene", 42);
        intent.putExtra("is_from_ad", true);
        intent.putExtra("key_extra_info", str4);
        intent.putExtra("key_from_comment_scene", 37);
        if (!intent.hasExtra("key_context_id")) {
            ((C60200t1) C86312j.m106911c(cls)).mo76842e7(4, 4, 42, intent);
        }
        ((C60200t1) C86312j.m106911c(cls)).mo76864nr(context, intent);
        Log.m105924i("FinderAdJumpHelper", "doJumpFinderFeedsDetailUI, adInfoExtra=" + str4 + ", objectNonceId=" + str2 + ", finderUsername=" + str + ", exportId=" + str3);
        SnsMethodCalculate.markEndTimeMs("doJumpFinderFeedsDetailUI", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
        return true;
    }

    /* renamed from: g */
    public static boolean m129909g(Context context, String str, String str2, String str3, int i) {
        Class cls = C60200t1.class;
        SnsMethodCalculate.markStartTimeMs("doJumpToFinderProfileUI", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
        try {
            String j = m129912j(str2, str3, i);
            Log.m105924i("FinderAdJumpHelper", "doJumpToFinderProfileUI, finderUsername=" + str + ", adInfoExtra=" + j + ", scene=" + i);
            Intent intent = new Intent();
            intent.putExtra("report_scene", 3);
            intent.putExtra("key_enter_profile_type", 1);
            intent.putExtra("finder_username", str);
            intent.putExtra("key_from_comment_scene", 37);
            intent.putExtra("is_from_ad", true);
            intent.putExtra("key_extra_info", j);
            ((C60200t1) C86312j.m106911c(cls)).mo76842e7(4, 4, 32, intent);
            ((C60200t1) C86312j.m106911c(cls)).mo76819V1(context, intent);
            SnsMethodCalculate.markEndTimeMs("doJumpToFinderProfileUI", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
            return true;
        } catch (Throwable th) {
            Log.m105920e("FinderAdJumpHelper", "doJumpToFinderProfileUI exp=" + th.toString());
            SnsMethodCalculate.markEndTimeMs("doJumpToFinderProfileUI", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
            return false;
        }
    }

    /* renamed from: h */
    public static boolean m129910h(ADXml aDXml, ADInfo aDInfo) {
        SnsMethodCalculate.markStartTimeMs("isFinderAd", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
        boolean z = (aDXml == null || aDXml.adFinderInfo == null || aDInfo == null || aDInfo.adActionType != 9) ? false : true;
        SnsMethodCalculate.markEndTimeMs("isFinderAd", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r6.f273644c0, r6.finderUsername) == false) goto L_0x0025;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m129911i(com.tencent.p014mm.plugin.sns.p104ad.adxml.AdClickActionInfo r6) {
        /*
            java.lang.String r0 = "isFinderAdFeeds"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            r2 = 1
            r3 = 0
            if (r6 == 0) goto L_0x0024
            int r4 = r6.f273641b
            r5 = 12
            if (r4 != r5) goto L_0x0024
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]
            java.lang.String r5 = r6.f273644c0
            r4[r3] = r5
            java.lang.String r6 = r6.finderUsername
            r4[r2] = r6
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String[]) r4)
            if (r6 != 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r2 = 0
        L_0x0025:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: lo2.C99542h0.m129911i(com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo):boolean");
    }

    /* renamed from: j */
    public static String m129912j(String str, String str2, int i) {
        SnsMethodCalculate.markStartTimeMs("makeAdInfoExtra", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
        try {
            String k = m129913k(str);
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("uxinfo", Util.nullAsNil(k));
            jSONObject2.put("snsid", str2);
            jSONObject2.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i);
            jSONObject.put("sns_ad", jSONObject2);
            String jSONObject3 = jSONObject.toString();
            Log.m105918d("FinderAdJumpHelper", "makeAdInfoExtra, ret=" + jSONObject3);
            SnsMethodCalculate.markEndTimeMs("makeAdInfoExtra", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
            return jSONObject3;
        } catch (Exception e) {
            Log.m105920e("FinderAdJumpHelper", "makeAdInfoExtra, exp=" + e.toString());
            SnsMethodCalculate.markEndTimeMs("makeAdInfoExtra", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
            return "";
        }
    }

    /* renamed from: k */
    public static String m129913k(String str) {
        SnsMethodCalculate.markStartTimeMs("urlEncode", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
        if (!TextUtils.isEmpty(str)) {
            try {
                str = URLEncoder.encode(str, "UTF-8");
            } catch (Exception e) {
                Log.m105920e("FinderAdJumpHelper", "urlEncode exp=" + e.toString());
            }
        }
        SnsMethodCalculate.markEndTimeMs("urlEncode", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
        return str;
    }
}
