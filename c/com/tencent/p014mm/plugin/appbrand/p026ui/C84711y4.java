package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.p014mm.sdk.platformtools.Log;
import lb0.C88394b;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.y4 */
public class C84711y4 {
    /* renamed from: a */
    public static void m104367a(ImageView imageView) {
        Log.m105924i("MicroMsg.WxaRelievedBuyIconApply", "applyBigIcon");
        m104368b(imageView, C0966R.C0969drawable.f5227gw, AppBrandGlobalSystemConfig.m100099b().f239299W.f239347j, AppBrandGlobalSystemConfig.m100099b().f239299W.f239348n, AppBrandGlobalSystemConfig.m100099b().f239299W.f239349o);
    }

    /* renamed from: b */
    public static void m104368b(ImageView imageView, int i, String str, int i2, int i3) {
        if (TextUtils.isEmpty(str) || i2 <= 0 || i3 <= 0) {
            imageView.setImageResource(i);
            return;
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.width = (int) (((float) (layoutParams.height * i2)) / ((float) i3));
        imageView.setLayoutParams(layoutParams);
        String str2 = C88394b.f255384g;
        C88394b.C88418q.f255427a.mo122785a(imageView, str, i, (C88394b.C88408j) null);
    }
}
