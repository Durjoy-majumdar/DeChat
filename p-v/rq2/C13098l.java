package rq2;

import android.graphics.Color;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: rq2.l */
public class C13098l {
    /* renamed from: a */
    public static int m12543a(String str, int i) {
        SnsMethodCalculate.markStartTimeMs("parseColor", "com.tencent.mm.plugin.sns.ad.utils.ColorUtil");
        try {
            if (!TextUtils.isEmpty(str)) {
                i = Color.parseColor(str);
            }
        } catch (Throwable unused) {
            Log.m105928w("SnsAd.ColorUtil", "parse color from string failed, return default value!");
        }
        SnsMethodCalculate.markEndTimeMs("parseColor", "com.tencent.mm.plugin.sns.ad.utils.ColorUtil");
        return i;
    }

    /* renamed from: b */
    public static String m12544b(float f, String str) {
        SnsMethodCalculate.markStartTimeMs("parseColor", "com.tencent.mm.plugin.sns.ad.utils.ColorUtil");
        try {
            StringBuilder sb = new StringBuilder();
            sb.append('#');
            sb.append(Integer.toHexString((int) (f * 255.0f)));
            if (str.startsWith("#")) {
                sb.append(str.substring(1));
            } else {
                sb.append(str);
            }
            String sb4 = sb.toString();
            SnsMethodCalculate.markEndTimeMs("parseColor", "com.tencent.mm.plugin.sns.ad.utils.ColorUtil");
            return sb4;
        } catch (Throwable unused) {
            SnsMethodCalculate.markEndTimeMs("parseColor", "com.tencent.mm.plugin.sns.ad.utils.ColorUtil");
            return "";
        }
    }

    /* renamed from: c */
    public static String m12545c(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("parseColor", "com.tencent.mm.plugin.sns.ad.utils.ColorUtil");
        try {
            String b = m12544b(Float.parseFloat(str), str2);
            SnsMethodCalculate.markEndTimeMs("parseColor", "com.tencent.mm.plugin.sns.ad.utils.ColorUtil");
            return b;
        } catch (Throwable unused) {
            Log.m105928w("SnsAd.ColorUtil", "parse color from string failed");
            SnsMethodCalculate.markEndTimeMs("parseColor", "com.tencent.mm.plugin.sns.ad.utils.ColorUtil");
            return str2;
        }
    }
}
