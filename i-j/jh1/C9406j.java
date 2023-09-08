package jh1;

import ak1.C54067f0;
import ak1.C54116w;
import android.graphics.Color;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.Log;
import de3.C75375u;
import di3.C7335d;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import j20.C117292a;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import org.json.JSONObject;
import te3.C64224a61;
import te3.C64594nx2;
import te3.C64622p31;
import te3.C64695s31;
import z04.C112550d0;

/* renamed from: jh1.j */
public final class C9406j {

    /* renamed from: a */
    public static final C9406j f29357a = new C9406j();

    /* renamed from: b */
    public static void m9110b(C9406j jVar, String str, View view, View view2, boolean z, C32224a aVar, C32224a aVar2, int i, Object obj) {
        String str2 = str;
        View view3 = view;
        View view4 = view2;
        boolean z2 = z;
        C32224a aVar3 = (i & 16) != 0 ? null : aVar;
        C32224a aVar4 = (i & 32) != 0 ? null : aVar2;
        jVar.getClass();
        C87412m.m108594g(str2, "tag");
        C87412m.m108594g(view3, "beforePage");
        C87412m.m108594g(view4, "afterPage");
        Log.m105924i(str2, "pageAnimate beforePage:" + view3 + ", beforePage:" + view3 + ", forward:" + z2);
        C9556a aVar5 = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar5.mo10233c(0);
        C117292a.m165358d(view, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryUtil", "pageAnimate", "(Ljava/lang/String;Landroid/view/View;Landroid/view/View;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryUtil", "pageAnimate", "(Ljava/lang/String;Landroid/view/View;Landroid/view/View;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C9556a aVar6 = new C9556a();
        aVar6.mo10233c(0);
        C117292a.m165358d(view2, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryUtil", "pageAnimate", "(Ljava/lang/String;Landroid/view/View;Landroid/view/View;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryUtil", "pageAnimate", "(Ljava/lang/String;Landroid/view/View;Landroid/view/View;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        float b = (float) C76577a.m92151b(view2.getContext(), 334);
        view.animate().cancel();
        view2.animate().cancel();
        view.animate().setListener(new C9404h(aVar3));
        view2.animate().setListener(new C9405i(aVar4));
        if (z2) {
            view3.setTranslationX(0.0f);
            view.animate().translationX(0.0f - b).setDuration(300).start();
            view4.setTranslationX(b);
            view2.animate().translationX(0.0f).setDuration(300).start();
            return;
        }
        view3.setTranslationX(0.0f);
        view.animate().translationX(b).setDuration(300).start();
        view4.setTranslationX(0.0f - b);
        view2.animate().translationX(0.0f).setDuration(300).start();
    }

    /* renamed from: d */
    public static final C75375u m9111d(String str, String str2, String str3, String str4) {
        C75375u uVar = new C75375u(str + str3 + str4);
        if (!(str3 == null || str3.length() == 0)) {
            int E = C112550d0.m153769E(uVar, str3, 0, false, 6, (Object) null);
            uVar.mo105705b(new ForegroundColorSpan(Color.parseColor(str2)), E, str3.length() + E, 33);
        }
        return uVar;
    }

    /* renamed from: f */
    public static /* synthetic */ void m9112f(C9406j jVar, String str, int i, String str2, String str3, Integer num, int i2, Object obj) {
        jVar.mo10128e(str, i, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : num);
    }

    /* renamed from: a */
    public final Integer mo10126a(C64622p31 p312, C64695s31 s312, C64224a61 a612) {
        C87412m.m108594g(p312, "lotteryInfo");
        C64594nx2 nx22 = p312.f184748f;
        int i = 1;
        boolean z = false;
        if (nx22 != null && nx22.f184578g == 1) {
            if (s312 != null && s312.f185323d == 2) {
                z = true;
            }
            if (z) {
                i = 2;
            }
            return Integer.valueOf(i);
        }
        if (!(nx22 != null && nx22.f184578g == 0)) {
            return null;
        }
        if (a612 != null && a612.f182035d) {
            z = true;
        }
        if (z) {
            i = 2;
        }
        return Integer.valueOf(i);
    }

    /* renamed from: c */
    public final C75375u mo10127c(String str) {
        String str2 = str;
        C87412m.m108594g(str2, FirebaseAnalytics.C113379b.SOURCE);
        try {
            Matcher matcher = Pattern.compile("(.*?)<_wc_custom_link_.+?color\\s*=\\s*[\"|']\\s*(.+?)\\s*[\"|']\\s*.*?>(.*?)</_wc_custom_link_>(.*?)").matcher(str2);
            if (matcher.matches()) {
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                String group3 = matcher.group(3);
                String group4 = matcher.group(4);
                Log.m105924i("parseSponsorStr", "matcher2 prefix:" + group + ",color:" + group2 + ",highLightContent:" + group3 + ",postfix:" + group4 + '!');
                C87412m.m108593f(group, "prefix");
                C87412m.m108593f(group2, "color");
                C87412m.m108593f(group3, "highLightContent");
                C87412m.m108593f(group4, "postfix");
                return m9111d(group, group2, group3, group4);
            }
            Matcher matcher2 = Pattern.compile("(.*?)<_wc_custom_link_.+?color\\s*=\\s*[\"|']\\s*(.+?)\\s*[\"|']\\s*backgroundenabled\\s*=\\s*[\"|']\\s*(.*?)\\s*[\"|']\\s*.*?>(.*?)</_wc_custom_link_>(.*?)").matcher(str2);
            if (!matcher2.matches()) {
                return new C75375u(str2);
            }
            String group5 = matcher2.group(1);
            String group6 = matcher2.group(2);
            String group7 = matcher2.group(3);
            String group8 = matcher2.group(4);
            String group9 = matcher2.group(5);
            Log.m105924i("parseSponsorStr", "matcher1 prefix:" + group5 + ",color:" + group6 + ",bgEnabled:" + group7 + ",highLightContent:" + group8 + ",postfix:" + group9 + '!');
            C87412m.m108593f(group5, "prefix");
            C87412m.m108593f(group6, "color");
            C87412m.m108593f(group8, "highLightContent");
            C87412m.m108593f(group9, "postfix");
            return m9111d(group5, group6, group8, group9);
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            Log.m105920e("parseSponsorStr", message);
            return new C75375u(str2);
        }
    }

    /* renamed from: e */
    public final void mo10128e(String str, int i, String str2, String str3, Integer num) {
        String str4 = str;
        String str5 = str3;
        C87412m.m108594g(str4, "lotteryId");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", i);
        jSONObject.put("lottery_id", str4);
        if (str2 != null) {
            jSONObject.put("coupon_id", str4);
        }
        if (str5 != null) {
            jSONObject.put("notice_id", str5);
        }
        if (num != null) {
            jSONObject.put("position_type", num.intValue());
        }
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "JSONObject().also { j ->…   }\n        }.toString()");
        C7335d c = C86312j.m106911c(C54116w.class);
        C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
        C54116w.Ex0((C54116w) c, C54067f0.C54076o0.MILESTONE_LOTTERY, jSONObject2, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
    }

    /* renamed from: g */
    public final void mo10129g(int i, String str, String str2) {
        String str3 = str;
        String str4 = str2;
        C87412m.m108594g(str3, "productid");
        C87412m.m108594g(str4, "couponid");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("commerceAction", i);
        jSONObject.put("productid", str3);
        jSONObject.put("couponid", str4);
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "JSONObject().also { j ->…id)\n\n        }.toString()");
        C7335d c = C86312j.m106911c(C54116w.class);
        C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
        C54116w.Ex0((C54116w) c, C54067f0.C54076o0.Commerce, jSONObject2, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
    }
}
