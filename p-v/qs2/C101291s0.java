package qs2;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Map;
import ps2.C100894u;

/* renamed from: qs2.s0 */
public class C101291s0 {

    /* renamed from: a */
    public String f296729a;

    /* renamed from: b */
    public float f296730b;

    /* renamed from: c */
    public float f296731c;

    /* renamed from: d */
    public String f296732d;

    /* renamed from: e */
    public float f296733e;

    /* renamed from: a */
    public static void m132869a(View view, C101291s0 s0Var, float f) {
        String str;
        float f2;
        GradientDrawable gradientDrawable;
        int i;
        int i2;
        SnsMethodCalculate.markStartTimeMs("handleBgColorAndCornerWithAlpha", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.BorderCornerBgInfo");
        try {
            String str2 = s0Var.f296729a;
            str = s0Var.f296732d;
            float f3 = s0Var.f296730b;
            f2 = s0Var.f296731c;
            gradientDrawable = null;
            if (!Util.isNullOrNil(str2) && f3 > 0.0f) {
                i2 = Color.parseColor(str2);
                gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setStroke((int) f3, i2);
            }
        } catch (Exception e) {
            Log.m105920e("BorderCornerBgInfo", Util.stackTraceToString(e));
            i2 = 0;
        } catch (Throwable unused) {
            Log.m105920e("BorderCornerBgInfo", "");
        }
        if (!Util.isNullOrNil(str)) {
            try {
                i = Color.parseColor(str);
            } catch (Exception e2) {
                Log.m105920e("BorderCornerBgInfo", Util.stackTraceToString(e2));
                i = 0;
            }
            if (gradientDrawable == null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable = gradientDrawable2;
            }
            gradientDrawable.setColor(i);
        }
        if (gradientDrawable != null) {
            gradientDrawable.setAlpha((int) (f * 255.0f));
        }
        if (gradientDrawable != null && f2 > 0.0f) {
            gradientDrawable.setCornerRadius(f2);
        }
        if (gradientDrawable != null) {
            view.setClipToOutline(true);
            view.setBackgroundDrawable(gradientDrawable);
        }
        SnsMethodCalculate.markEndTimeMs("handleBgColorAndCornerWithAlpha", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.BorderCornerBgInfo");
    }

    /* renamed from: b */
    public static C101291s0 m132870b(Map<String, String> map, String str, int i, int i2, int i3) {
        SnsMethodCalculate.markStartTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.BorderCornerBgInfo");
        C101291s0 s0Var = new C101291s0();
        s0Var.f296729a = Util.nullAsNil(map.get(str + ".borderColor"));
        s0Var.f296730b = C100894u.m132234n(Util.safeParseDouble(map.get(str + ".borderSize")), i, i2, i3);
        s0Var.f296731c = C100894u.m132234n(Util.safeParseDouble(map.get(str + ".cornerRadius")), i, i2, i3);
        s0Var.f296732d = Util.nullAsNil(map.get(str + ".bgColor"));
        if (map.containsKey(str + ".bgColorAlpha")) {
            s0Var.f296733e = Util.safeParseFloat(Util.nullAsNil(map.get(str + ".bgColorAlpha")));
        }
        SnsMethodCalculate.markEndTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.BorderCornerBgInfo");
        return s0Var;
    }
}
