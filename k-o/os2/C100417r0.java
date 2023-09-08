package os2;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;

/* renamed from: os2.r0 */
public class C100417r0 {
    /* renamed from: a */
    public static String m131412a(String str) {
        String str2 = "";
        SnsMethodCalculate.markStartTimeMs("getActionBtnTextRet", "com.tencent.mm.plugin.sns.storage.StorageHelper");
        try {
            String i = C86709a0.m107523b().mo121111i();
            if (Util.isNullOrNil(str, i)) {
                Log.m105920e("StorageHelper", "HalfScreenSubscribe, snsId or uin is empty");
                SnsMethodCalculate.markEndTimeMs("getActionBtnTextRet", "com.tencent.mm.plugin.sns.storage.StorageHelper");
                return str2;
            }
            StringBuilder sb = new StringBuilder();
            if (Util.isNullOrNil(str)) {
                str = str2;
            }
            sb.append(str);
            if (Util.isNullOrNil(i)) {
                i = str2;
            }
            sb.append(i);
            if (sb.length() <= 0) {
                Log.m105920e("StorageHelper", "HalfScreenSubscribe, key is empty");
                SnsMethodCalculate.markEndTimeMs("getActionBtnTextRet", "com.tencent.mm.plugin.sns.storage.StorageHelper");
                return str2;
            }
            str2 = MMApplicationContext.getContext().getSharedPreferences("SnsAdVoteSubscribe", 0).getString(sb.toString(), str2);
            SnsMethodCalculate.markEndTimeMs("getActionBtnTextRet", "com.tencent.mm.plugin.sns.storage.StorageHelper");
            return str2;
        } catch (Throwable th) {
            Log.m105920e("StorageHelper", th.toString());
        }
    }

    /* renamed from: b */
    public static int m131413b(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("getSnsAdVoteIndex", "com.tencent.mm.plugin.sns.storage.StorageHelper");
        int c = m131414c(str, str2, C86709a0.m107523b().mo121111i());
        SnsMethodCalculate.markEndTimeMs("getSnsAdVoteIndex", "com.tencent.mm.plugin.sns.storage.StorageHelper");
        return c;
    }

    /* renamed from: c */
    public static int m131414c(String str, String str2, String str3) {
        SnsMethodCalculate.markStartTimeMs("getSnsAdVoteIndex", "com.tencent.mm.plugin.sns.storage.StorageHelper");
        String d = m131415d(str, str2, str3);
        int i = 0;
        if (!Util.isNullOrNil(d)) {
            String[] split = d.split("&");
            int i2 = 0;
            while (true) {
                if (i2 < split.length) {
                    String str4 = split[i2];
                    if (str4 != null && str4.contains("voteResultIndex=")) {
                        i = Util.getInt(split[i2].substring(16), 0);
                        break;
                    }
                    i2++;
                } else {
                    break;
                }
            }
        }
        Log.m105918d("StorageHelper", "getSnsAdVoteIndex, voteIdx=" + i);
        SnsMethodCalculate.markEndTimeMs("getSnsAdVoteIndex", "com.tencent.mm.plugin.sns.storage.StorageHelper");
        return i;
    }

    /* renamed from: d */
    public static String m131415d(String str, String str2, String str3) {
        SnsMethodCalculate.markStartTimeMs("getSnsAdVoteInfo", "com.tencent.mm.plugin.sns.storage.StorageHelper");
        StringBuilder sb = new StringBuilder();
        String str4 = "";
        if (str == null) {
            str = str4;
        }
        sb.append(str);
        if (str2 == null) {
            str2 = str4;
        }
        sb.append(str2);
        if (str3 == null) {
            str3 = str4;
        }
        sb.append(str3);
        if (sb.length() > 0) {
            str4 = MMApplicationContext.getContext().getSharedPreferences("SnsAdVote", 0).getString(sb.toString(), str4);
        }
        Log.m105918d("StorageHelper", "getSnsAdVoteInfo, ret=" + str4);
        SnsMethodCalculate.markEndTimeMs("getSnsAdVoteInfo", "com.tencent.mm.plugin.sns.storage.StorageHelper");
        return str4;
    }

    /* renamed from: e */
    public static boolean m131416e(String str) {
        SnsMethodCalculate.markStartTimeMs("isAd", "com.tencent.mm.plugin.sns.storage.StorageHelper");
        boolean z = str != null && str.startsWith("ad_table_");
        SnsMethodCalculate.markEndTimeMs("isAd", "com.tencent.mm.plugin.sns.storage.StorageHelper");
        return z;
    }

    /* renamed from: f */
    public static boolean m131417f(String str) {
        SnsMethodCalculate.markStartTimeMs("isInValid", "com.tencent.mm.plugin.sns.storage.StorageHelper");
        boolean z = !m131419h(str);
        SnsMethodCalculate.markEndTimeMs("isInValid", "com.tencent.mm.plugin.sns.storage.StorageHelper");
        return z;
    }

    /* renamed from: g */
    public static boolean m131418g(String str) {
        SnsMethodCalculate.markStartTimeMs("isSns", "com.tencent.mm.plugin.sns.storage.StorageHelper");
        boolean z = str != null && str.startsWith("sns_table_");
        SnsMethodCalculate.markEndTimeMs("isSns", "com.tencent.mm.plugin.sns.storage.StorageHelper");
        return z;
    }

    /* renamed from: h */
    public static boolean m131419h(String str) {
        SnsMethodCalculate.markStartTimeMs("isValid", "com.tencent.mm.plugin.sns.storage.StorageHelper");
        boolean z = true;
        if (str.startsWith("ad_table_")) {
            if (Util.safeParseLong(str.substring(9)) == 0) {
                z = false;
            }
            SnsMethodCalculate.markEndTimeMs("isValid", "com.tencent.mm.plugin.sns.storage.StorageHelper");
            return z;
        }
        if (Util.safeParseLong(str.substring(10)) == 0) {
            z = false;
        }
        SnsMethodCalculate.markEndTimeMs("isValid", "com.tencent.mm.plugin.sns.storage.StorageHelper");
        return z;
    }

    /* renamed from: i */
    public static String m131420i(String str, long j) {
        SnsMethodCalculate.markStartTimeMs("packLocalId", "com.tencent.mm.plugin.sns.storage.StorageHelper");
        String str2 = str + j;
        SnsMethodCalculate.markEndTimeMs("packLocalId", "com.tencent.mm.plugin.sns.storage.StorageHelper");
        return str2;
    }

    /* renamed from: j */
    public static String m131421j(String str, long j) {
        SnsMethodCalculate.markStartTimeMs("packSnsId", "com.tencent.mm.plugin.sns.storage.StorageHelper");
        String str2 = str + j;
        SnsMethodCalculate.markEndTimeMs("packSnsId", "com.tencent.mm.plugin.sns.storage.StorageHelper");
        return str2;
    }

    /* renamed from: k */
    public static void m131422k(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("saveActionBtnTextRet", "com.tencent.mm.plugin.sns.storage.StorageHelper");
        try {
            String i = C86709a0.m107523b().mo121111i();
            if (Util.isNullOrNil(str, i)) {
                Log.m105920e("StorageHelper", "HalfScreenSubscribe, snsId or uin is empty");
                SnsMethodCalculate.markEndTimeMs("saveActionBtnTextRet", "com.tencent.mm.plugin.sns.storage.StorageHelper");
                return;
            }
            StringBuilder sb = new StringBuilder();
            if (Util.isNullOrNil(str)) {
                str = "";
            }
            sb.append(str);
            if (Util.isNullOrNil(i)) {
                i = "";
            }
            sb.append(i);
            if (sb.length() <= 0) {
                Log.m105920e("StorageHelper", "HalfScreenSubscribe, key is empty");
                SnsMethodCalculate.markEndTimeMs("saveActionBtnTextRet", "com.tencent.mm.plugin.sns.storage.StorageHelper");
                return;
            }
            String sb4 = sb.toString();
            SharedPreferences.Editor edit = MMApplicationContext.getContext().getSharedPreferences("SnsAdVoteSubscribe", 0).edit();
            edit.putString(sb4, str2);
            edit.commit();
            Log.m105924i("StorageHelper", "HalfScreenSubscribe, key = " + sb4 + ", isSubscribe=" + str2);
            SnsMethodCalculate.markEndTimeMs("saveActionBtnTextRet", "com.tencent.mm.plugin.sns.storage.StorageHelper");
        } catch (Throwable th) {
            Log.m105920e("StorageHelper", th.toString());
        }
    }

    /* renamed from: l */
    public static void m131423l(String str, String str2, String str3, int i, int i2, String str4) {
        SnsMethodCalculate.markStartTimeMs("saveSnsAdVoteInfo", "com.tencent.mm.plugin.sns.storage.StorageHelper");
        if (TextUtils.isEmpty(str)) {
            Log.m105920e("StorageHelper", "saveSnsAdVoteInfo, url is empty");
            SnsMethodCalculate.markEndTimeMs("saveSnsAdVoteInfo", "com.tencent.mm.plugin.sns.storage.StorageHelper");
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        sb.append(str);
        if (str2 == null) {
            str2 = "";
        }
        sb.append(str2);
        if (str3 == null) {
            str3 = "";
        }
        sb.append(str3);
        if (sb.length() <= 0) {
            Log.m105920e("StorageHelper", "saveSnsAdVoteInfo, key is empty");
            SnsMethodCalculate.markEndTimeMs("saveSnsAdVoteInfo", "com.tencent.mm.plugin.sns.storage.StorageHelper");
            return;
        }
        String sb4 = sb.toString();
        SharedPreferences.Editor edit = MMApplicationContext.getContext().getSharedPreferences("SnsAdVote", 0).edit();
        edit.putString(sb4, "voteResultIndex=" + i + "&isUpdate=" + i2);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(sb4);
        sb5.append("_voteRet");
        edit.putString(sb5.toString(), str4);
        edit.commit();
        Log.m105924i("StorageHelper", "saveSnsAdVoteInfo, voteIdx=" + i + ", isUpdate=" + i2 + ", content=" + str4);
        SnsMethodCalculate.markEndTimeMs("saveSnsAdVoteInfo", "com.tencent.mm.plugin.sns.storage.StorageHelper");
    }

    /* renamed from: m */
    public static int m131424m(String str) {
        SnsMethodCalculate.markStartTimeMs("unPackLocalId", "com.tencent.mm.plugin.sns.storage.StorageHelper");
        if (Util.isNullOrNil(str)) {
            SnsMethodCalculate.markEndTimeMs("unPackLocalId", "com.tencent.mm.plugin.sns.storage.StorageHelper");
            return 0;
        } else if (str.startsWith("ad_table_")) {
            int safeParseInt = Util.safeParseInt(str.substring(9));
            SnsMethodCalculate.markEndTimeMs("unPackLocalId", "com.tencent.mm.plugin.sns.storage.StorageHelper");
            return safeParseInt;
        } else {
            int safeParseInt2 = Util.safeParseInt(str.substring(10));
            SnsMethodCalculate.markEndTimeMs("unPackLocalId", "com.tencent.mm.plugin.sns.storage.StorageHelper");
            return safeParseInt2;
        }
    }

    /* renamed from: n */
    public static long m131425n(String str) {
        SnsMethodCalculate.markStartTimeMs("unPackSnsId", "com.tencent.mm.plugin.sns.storage.StorageHelper");
        if (Util.isNullOrNil(str)) {
            SnsMethodCalculate.markEndTimeMs("unPackSnsId", "com.tencent.mm.plugin.sns.storage.StorageHelper");
            return 0;
        } else if (str.startsWith("ad_table_")) {
            long safeParseLong = Util.safeParseLong(str.substring(9));
            SnsMethodCalculate.markEndTimeMs("unPackSnsId", "com.tencent.mm.plugin.sns.storage.StorageHelper");
            return safeParseLong;
        } else if (str.startsWith("sns_table_")) {
            long safeParseLong2 = Util.safeParseLong(str.substring(10));
            SnsMethodCalculate.markEndTimeMs("unPackSnsId", "com.tencent.mm.plugin.sns.storage.StorageHelper");
            return safeParseLong2;
        } else {
            long safeParseLong3 = Util.safeParseLong(str);
            SnsMethodCalculate.markEndTimeMs("unPackSnsId", "com.tencent.mm.plugin.sns.storage.StorageHelper");
            return safeParseLong3;
        }
    }
}
