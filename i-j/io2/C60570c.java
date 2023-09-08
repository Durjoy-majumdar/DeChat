package io2;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import ht1.C60200t1;
import ht1.C60216z4;
import lo2.C99542h0;
import vr2.C102236a0;

/* renamed from: io2.c */
public class C60570c {
    /* renamed from: a */
    public static boolean m70755a(Context context, String str, String str2, SnsInfo snsInfo, int i) {
        C60216z4 z4Var;
        String str3;
        SnsMethodCalculate.markStartTimeMs("enterTopicProfileUI", "com.tencent.mm.plugin.sns.ad.finder.FinderTopicRequest");
        SnsMethodCalculate.markStartTimeMs("enterTopicProfileUI", "com.tencent.mm.plugin.sns.ad.finder.FinderTopicRequest");
        boolean z = false;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(" encryptedTopicId is ");
            String str4 = str;
            sb.append(str);
            sb.append(", topicName is ");
            String str5 = str2;
            sb.append(str2);
            Log.m105918d("SnsAd.FinderTopicRequest", sb.toString());
            if (context != null) {
                if (!TextUtils.isEmpty(str)) {
                    SnsMethodCalculate.markStartTimeMs("getFinderUtilApi", "com.tencent.mm.plugin.sns.ad.finder.FinderTopicRequest");
                    C60200t1 t1Var = (C60200t1) C86312j.m106911c(C60200t1.class);
                    if (t1Var != null) {
                        z4Var = t1Var.mo76861l7();
                        SnsMethodCalculate.markEndTimeMs("getFinderUtilApi", "com.tencent.mm.plugin.sns.ad.finder.FinderTopicRequest");
                    } else {
                        z4Var = null;
                        SnsMethodCalculate.markEndTimeMs("getFinderUtilApi", "com.tencent.mm.plugin.sns.ad.finder.FinderTopicRequest");
                    }
                    C60216z4 z4Var2 = z4Var;
                    if (z4Var2 != null) {
                        SnsMethodCalculate.markStartTimeMs("makeSnsAdExtraString", "com.tencent.mm.plugin.sns.ad.finder.FinderTopicRequest");
                        if (snsInfo != null) {
                            str3 = C99542h0.m129912j(snsInfo.getUxinfo(), C102236a0.m134728W(snsInfo), 3);
                            SnsMethodCalculate.markEndTimeMs("makeSnsAdExtraString", "com.tencent.mm.plugin.sns.ad.finder.FinderTopicRequest");
                        } else {
                            SnsMethodCalculate.markEndTimeMs("makeSnsAdExtraString", "com.tencent.mm.plugin.sns.ad.finder.FinderTopicRequest");
                            str3 = "";
                        }
                        z4Var2.mo83791i6(context, str, str2, str3, i, "", "", "");
                        z = true;
                        SnsMethodCalculate.markEndTimeMs("enterTopicProfileUI", "com.tencent.mm.plugin.sns.ad.finder.FinderTopicRequest");
                        SnsMethodCalculate.markEndTimeMs("enterTopicProfileUI", "com.tencent.mm.plugin.sns.ad.finder.FinderTopicRequest");
                        return z;
                    }
                    Log.m105928w("SnsAd.FinderTopicRequest", "the IFinderUtilApi object is null!!");
                    SnsMethodCalculate.markEndTimeMs("enterTopicProfileUI", "com.tencent.mm.plugin.sns.ad.finder.FinderTopicRequest");
                    SnsMethodCalculate.markEndTimeMs("enterTopicProfileUI", "com.tencent.mm.plugin.sns.ad.finder.FinderTopicRequest");
                    return z;
                }
            }
            Log.m105928w("SnsAd.FinderTopicRequest", "the encryptedTopicId or topicName is empty or context is null");
            SnsMethodCalculate.markEndTimeMs("enterTopicProfileUI", "com.tencent.mm.plugin.sns.ad.finder.FinderTopicRequest");
        } catch (Throwable unused) {
            Log.m105920e("SnsAd.FinderTopicRequest", "the enterTopicProfileUI has something wrong!!!");
        }
        SnsMethodCalculate.markEndTimeMs("enterTopicProfileUI", "com.tencent.mm.plugin.sns.ad.finder.FinderTopicRequest");
        return z;
    }
}
