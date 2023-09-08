package ao2;

import a70.C112760b;
import android.content.Context;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import fp2.C87070f;
import lo2.C99522b;
import p910lj.C76701a;

/* renamed from: ao2.h */
public class C79618h {

    /* renamed from: a */
    public static int f233469a;

    /* renamed from: b */
    public static int f233470b;

    /* renamed from: c */
    public static int f233471c;

    /* renamed from: d */
    public static int f233472d;

    /* renamed from: a */
    public static void m96687a(Context context, String str) {
        String str2;
        SnsMethodCalculate.markStartTimeMs("handleCmd", "com.tencent.mm.plugin.sns.ad.SnsAdTestConfig");
        Log.m105924i("SnsAdTestConfig", "handleCmd, msg=" + str);
        try {
            String[] split = str.split(" ");
            String str3 = "";
            if (split != null) {
                String trim = split.length >= 2 ? split[1].trim() : str3;
                if (split.length >= 3) {
                    str3 = split[2];
                }
                str2 = str3;
                str3 = trim;
            } else {
                str2 = str3;
            }
            if (TextUtils.isEmpty(str3)) {
                SnsMethodCalculate.markEndTimeMs("handleCmd", "com.tencent.mm.plugin.sns.ad.SnsAdTestConfig");
                return;
            }
            m96688b(context, str3, str2);
            SnsMethodCalculate.markEndTimeMs("handleCmd", "com.tencent.mm.plugin.sns.ad.SnsAdTestConfig");
        } catch (Throwable th) {
            Log.m105920e("SnsAdTestConfig", "handleCmd, exp=" + th.toString());
        }
    }

    /* renamed from: b */
    public static void m96688b(Context context, String str, String str2) {
        String[] split;
        SnsMethodCalculate.markStartTimeMs("handleSubCmd", "com.tencent.mm.plugin.sns.ad.SnsAdTestConfig");
        Log.m105924i("SnsAdTestConfig", "handleSubCmd, subCmd=" + str + ", value=" + str2);
        if ("fullcard_online".equals(str)) {
            int safeParseInt = Util.safeParseInt(str2);
            if (safeParseInt == 0 || safeParseInt == 1 || safeParseInt == 2) {
                f233469a = safeParseInt;
            }
            int i = f233469a;
            if (i == 0) {
                C76701a.makeText(context, (CharSequence) "default cfg", 1).show();
            } else if (i == 1) {
                C76701a.makeText(context, (CharSequence) "force offline", 1).show();
            } else if (i == 2) {
                C76701a.makeText(context, (CharSequence) "force online", 1).show();
            }
        } else if ("fullcard_new_item".equals(str)) {
            int safeParseInt2 = Util.safeParseInt(str2);
            if (safeParseInt2 == 0 || safeParseInt2 == 1 || safeParseInt2 == 2) {
                f233470b = safeParseInt2;
            }
            int i2 = f233470b;
            if (i2 == 0) {
                C76701a.makeText(context, (CharSequence) "default cfg", 1).show();
            } else if (i2 == 1) {
                C76701a.makeText(context, (CharSequence) "force old item", 1).show();
            } else if (i2 == 2) {
                C76701a.makeText(context, (CharSequence) "force new item", 1).show();
            }
        } else if ("useTp".equals(str)) {
            int safeParseInt3 = Util.safeParseInt(str2);
            if (safeParseInt3 == 0 || safeParseInt3 == 1 || safeParseInt3 == 2) {
                f233471c = safeParseInt3;
            }
            int i3 = f233471c;
            if (i3 == 0) {
                C76701a.makeText(context, (CharSequence) "default cfg", 1).show();
            } else if (i3 == 1) {
                C76701a.makeText(context, (CharSequence) "force not thumbPlayer", 1).show();
            } else if (i3 == 2) {
                C76701a.makeText(context, (CharSequence) "force thumbPlayer", 1).show();
            }
        } else if ("notCheckAtBtn".equals(str)) {
            int safeParseInt4 = Util.safeParseInt(str2);
            if (safeParseInt4 == 0 || safeParseInt4 == 1) {
                f233472d = safeParseInt4;
            }
            int i4 = f233472d;
            if (i4 == 0) {
                C76701a.makeText(context, (CharSequence) "should check at btn", 1).show();
            } else if (i4 == 1) {
                C76701a.makeText(context, (CharSequence) "not check at btn", 1).show();
            }
        } else if ("cleanad".equals(str)) {
            C99522b.m129875a();
        } else if ("addtestad".equals(str)) {
            C99522b bVar = C99522b.f291759a;
            SnsMethodCalculate.markStartTimeMs("setShouldTestAddAd", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager");
            SnsMethodCalculate.markEndTimeMs("setShouldTestAddAd", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager");
            if (!Util.isNullOrNil(str2) && (split = str2.split(",")) != null && split.length > 2) {
                int safeParseInt5 = Util.safeParseInt(split[0]);
                SnsMethodCalculate.markStartTimeMs("setLIMIT_DAYS", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager");
                C99522b.f291760b = safeParseInt5;
                SnsMethodCalculate.markEndTimeMs("setLIMIT_DAYS", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager");
                int safeParseInt6 = Util.safeParseInt(split[1]);
                SnsMethodCalculate.markStartTimeMs("setLIMIT_AD_IN", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager");
                C99522b.f291761c = safeParseInt6;
                SnsMethodCalculate.markEndTimeMs("setLIMIT_AD_IN", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager");
                Util.safeParseInt(split[2]);
                SnsMethodCalculate.markStartTimeMs("setTEST_AD_ADD_COUNT", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager");
                SnsMethodCalculate.markEndTimeMs("setTEST_AD_ADD_COUNT", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager");
                SnsMethodCalculate.markStartTimeMs("getLIMIT_DAYS", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager");
                int i5 = C99522b.f291760b;
                SnsMethodCalculate.markEndTimeMs("getLIMIT_DAYS", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager");
                SnsMethodCalculate.markStartTimeMs("setCHECK_TIME_BEFORE_SECONDS", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager");
                C99522b.f291762d = ((long) (i5 * 24 * 60)) * 60;
                SnsMethodCalculate.markEndTimeMs("setCHECK_TIME_BEFORE_SECONDS", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager");
            }
        } else if ("localwspkg".equalsIgnoreCase(str)) {
            boolean equalsIgnoreCase = "c".equalsIgnoreCase(str2);
            C87070f fVar = C87070f.f252656a;
            SnsMethodCalculate.markStartTimeMs("debugFlagFile", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSnsAdBizManager");
            try {
                if (C87070f.f252656a.mo121543a()) {
                    if (equalsIgnoreCase) {
                        C86013q1.m106444e(C112760b.m154200H() + ".localwspkg");
                    } else {
                        C86013q1.m106447h(C112760b.m154200H() + ".localwspkg");
                    }
                }
            } catch (Exception unused) {
            }
            SnsMethodCalculate.markEndTimeMs("debugFlagFile", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSnsAdBizManager");
            if ("c".equalsIgnoreCase(str2)) {
                C76701a.makeText(context, (CharSequence) "用本地的wspkg", 1).show();
            } else {
                C76701a.makeText(context, (CharSequence) "用boots的wspkg", 1).show();
            }
        }
        SnsMethodCalculate.markEndTimeMs("handleSubCmd", "com.tencent.mm.plugin.sns.ad.SnsAdTestConfig");
    }
}
