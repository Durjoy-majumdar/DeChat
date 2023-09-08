package jp2;

import ad0.C0033t;
import android.util.Base64;
import com.tencent.p014mm.modelstat.C92859v;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdSnsInfo;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.IOException;
import te3.bb4;
import te3.cb4;

/* renamed from: jp2.n */
public class C98962n {
    /* renamed from: a */
    public static String m128836a(long j, Object... objArr) {
        SnsMethodCalculate.markStartTimeMs("appendSourceAndSnsStat", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
        if (objArr == null) {
            SnsMethodCalculate.markEndTimeMs("appendSourceAndSnsStat", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
            return "";
        }
        StringBuilder sb = new StringBuilder(C94866e1.Zx0().mo59223B(objArr));
        m128837b(j, sb);
        String sb4 = sb.toString();
        SnsMethodCalculate.markEndTimeMs("appendSourceAndSnsStat", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
        return sb4;
    }

    /* renamed from: b */
    public static void m128837b(long j, StringBuilder sb) {
        SnsMethodCalculate.markStartTimeMs("appendSourceAndSnsStat", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
        AdSnsInfo jo = C94866e1.zx0().mo139864jo(j);
        if (jo != null) {
            TimeLineObject timeLine = jo.getTimeLine();
            if (timeLine != null) {
                String str = timeLine.statExtStr;
                SnsMethodCalculate.markStartTimeMs("appendSourceAndSnsStat", "com.tencent.mm.modelstat.SnsStatExtUtil");
                if (sb == null) {
                    SnsMethodCalculate.markEndTimeMs("appendSourceAndSnsStat", "com.tencent.mm.modelstat.SnsStatExtUtil");
                } else {
                    cb4 g = C92859v.m117129g(str);
                    sb.append(",");
                    sb.append(g == null ? -1 : g.f298025g);
                    sb.append(",");
                    sb.append(C92859v.m117128f(g));
                    SnsMethodCalculate.markEndTimeMs("appendSourceAndSnsStat", "com.tencent.mm.modelstat.SnsStatExtUtil");
                }
            } else {
                Log.m105927v("SnsAdExtUtil", "l timeLineObject null, snsId %d", Long.valueOf(j));
                sb.append(",,");
            }
        } else {
            Log.m105927v("SnsAdExtUtil", "l snsInfo null, snsId %d", Long.valueOf(j));
            sb.append(",,");
        }
        SnsMethodCalculate.markEndTimeMs("appendSourceAndSnsStat", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
    }

    /* renamed from: c */
    public static void m128838c(String str, C0033t tVar) {
        SnsMethodCalculate.markStartTimeMs("appendSourceAndSnsStat", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
        SnsInfo TE = C94866e1.Yx0().mo139807TE(str);
        if (TE != null) {
            TimeLineObject timeLine = TE.getTimeLine();
            if (timeLine != null) {
                C92859v.m117123a(timeLine.statExtStr, tVar);
            } else {
                Log.m105927v("SnsAdExtUtil", "timeLineObject null, snsId %s", str);
            }
        } else {
            Log.m105927v("SnsAdExtUtil", "snsInfo null, snsId %s", str);
        }
        SnsMethodCalculate.markEndTimeMs("appendSourceAndSnsStat", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
    }

    /* renamed from: d */
    public static String m128839d(TimeLineObject timeLineObject) {
        SnsMethodCalculate.markStartTimeMs("getSnsStatExt", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
        if (timeLineObject != null) {
            String str = timeLineObject.statExtStr;
            SnsMethodCalculate.markStartTimeMs("getSnsStatExt", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
            String str2 = "";
            if (Util.isNullOrNil(str)) {
                SnsMethodCalculate.markEndTimeMs("getSnsStatExt", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
            } else {
                byte[] decode = Base64.decode(str, 0);
                bb4 bb4 = new bb4();
                try {
                    bb4.parseFrom(decode);
                    str2 = C92859v.m117128f(bb4.f226992d);
                    SnsMethodCalculate.markEndTimeMs("getSnsStatExt", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
                } catch (IOException e) {
                    Log.m105921e("SnsAdExtUtil", str2, e);
                    SnsMethodCalculate.markEndTimeMs("getSnsStatExt", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
                }
            }
            SnsMethodCalculate.markEndTimeMs("getSnsStatExt", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
            return str2;
        }
        Log.m105926v("SnsAdExtUtil", "getSnsStatExt timeLineObject null");
        SnsMethodCalculate.markEndTimeMs("getSnsStatExt", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
        return null;
    }
}
