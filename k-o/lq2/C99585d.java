package lq2;

import android.content.Context;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C86013q1;
import jq2.C99009x;
import kg3.C76577a;
import ps2.C100891r;
import rq2.C101432s;

/* renamed from: lq2.d */
public final class C99585d {

    /* renamed from: a */
    public static final C99585d f291923a = new C99585d();

    /* renamed from: a */
    public static final void m129997a(View view, ViewGroup viewGroup, ViewGroup viewGroup2, ViewGroup viewGroup3, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
        if (view == null) {
            SnsMethodCalculate.markEndTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
        } else if (viewGroup == null) {
            SnsMethodCalculate.markEndTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
        } else if (viewGroup2 == null) {
            SnsMethodCalculate.markEndTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
        } else if (i <= 0) {
            Log.m105920e("SlideFullCardLogicHelper", "adjustContentContainerLayout, adDisplayWidth <= 0");
            SnsMethodCalculate.markEndTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
        } else {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                SnsMethodCalculate.markEndTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
                return;
            }
            if (i2 == 0) {
                C101432s.m133129k(viewGroup3, false);
            }
            C101432s.m133129k(viewGroup, false);
            C101432s.m133129k(viewGroup2, false);
            layoutParams.width = i;
            view.setLayoutParams(layoutParams);
            SnsMethodCalculate.markStartTimeMs("dp", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
            SnsMethodCalculate.markEndTimeMs("dp", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
            view.setTranslationX(-((float) C76577a.m92151b(MMApplicationContext.getContext(), 8)));
            view.requestLayout();
            SnsMethodCalculate.markEndTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r2 = r3.f291933A;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m129998b(lq2.C99587g r3, int r4, int r5) {
        /*
            java.lang.String r0 = "adjustInnerItemLayout"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            if (r4 <= 0) goto L_0x002b
            if (r5 > 0) goto L_0x000c
            goto L_0x002b
        L_0x000c:
            if (r3 == 0) goto L_0x0017
            android.widget.FrameLayout r2 = r3.f291933A
            if (r2 == 0) goto L_0x0017
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            goto L_0x0018
        L_0x0017:
            r2 = 0
        L_0x0018:
            if (r2 != 0) goto L_0x001e
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        L_0x001e:
            r2.width = r4
            r2.height = r5
            android.widget.FrameLayout r3 = r3.f291933A
            r3.setLayoutParams(r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        L_0x002b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "adjustInnerItemLayout, materialWidth is "
            r3.append(r2)
            r3.append(r4)
            java.lang.String r4 = ", materialHeight is "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "SlideFullCardLogicHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lq2.C99585d.m129998b(lq2.g, int, int):void");
    }

    /* renamed from: c */
    public static final int m129999c(Context context, int i) {
        int i2;
        int i3;
        Display defaultDisplay;
        Display defaultDisplay2;
        SnsMethodCalculate.markStartTimeMs("getAdDisplayWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
        if (context == null) {
            SnsMethodCalculate.markEndTimeMs("getAdDisplayWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
            return 0;
        }
        Object systemService = context.getSystemService("window");
        WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
        int min = Math.min((windowManager == null || (defaultDisplay2 = windowManager.getDefaultDisplay()) == null) ? 0 : defaultDisplay2.getWidth(), (windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) ? 0 : defaultDisplay.getHeight());
        if (min <= 0) {
            Log.m105920e("SlideFullCardLogicHelper", "getAdDisplayWidth, screenWidth <= 0");
            SnsMethodCalculate.markEndTimeMs("getAdDisplayWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
            return 0;
        }
        C99585d dVar = f291923a;
        int d = dVar.mo138954d(56);
        if (i == 0) {
            i2 = dVar.mo138954d(14);
            i3 = context.getResources().getDimensionPixelSize(C0966R.dimen.f3926j6);
        } else {
            i2 = dVar.mo138954d(12);
            i3 = i2;
        }
        int d2 = (((min - d) - i2) - i3) + dVar.mo138954d(16);
        SnsMethodCalculate.markEndTimeMs("getAdDisplayWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
        return d2;
    }

    /* renamed from: e */
    public static final boolean m130000e(SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("isSlideFullCardAd", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
        boolean z = false;
        if (snsInfo == null) {
            SnsMethodCalculate.markEndTimeMs("isSlideFullCardAd", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
            return false;
        }
        if (snsInfo.isAd() && snsInfo.isSlideFullCardAd()) {
            z = true;
        }
        SnsMethodCalculate.markEndTimeMs("isSlideFullCardAd", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
        return z;
    }

    /* renamed from: f */
    public static final void m130001f(ImageView imageView, String str) {
        SnsMethodCalculate.markStartTimeMs("setBorderImage", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
        if (imageView == null) {
            SnsMethodCalculate.markEndTimeMs("setBorderImage", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
            return;
        }
        Log.m105924i("SlideFullCardLogicHelper", "setBorderImage, the resInfo is img, thumbUrl is " + str);
        if (!(str == null || str.length() == 0)) {
            C101432s.m133132n(imageView, true);
            String l = C100891r.m132217l("adId", str);
            imageView.setTag(C0966R.C0970id.jve, str);
            if (C86013q1.m106450k(l)) {
                C99009x.m128942c(imageView, l, 0);
            } else {
                C99009x.m128940a(imageView, str, 0);
            }
        }
        SnsMethodCalculate.markEndTimeMs("setBorderImage", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
    }

    /* renamed from: d */
    public final int mo138954d(int i) {
        SnsMethodCalculate.markStartTimeMs("getDp", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
        int b = C76577a.m92151b(MMApplicationContext.getContext(), i);
        SnsMethodCalculate.markEndTimeMs("getDp", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
        return b;
    }
}
