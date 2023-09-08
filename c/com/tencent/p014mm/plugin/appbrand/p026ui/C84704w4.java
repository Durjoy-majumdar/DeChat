package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import gy3.C87412m;
import iy3.C60641c;
import lb0.C88394b;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.w4 */
public final class C84704w4 {
    /* renamed from: a */
    public static final void m104354a(ImageView imageView) {
        C87412m.m108594g(imageView, "iv");
        AppBrandGlobalSystemConfig.FlagshipSetting flagshipSetting = AppBrandGlobalSystemConfig.m100099b().f239300X;
        String str = C85875k4.m106211z() ? flagshipSetting.f239323d : flagshipSetting.f239326g;
        int i = C85875k4.m106211z() ? flagshipSetting.f239324e : flagshipSetting.f239327h;
        int i2 = C85875k4.m106211z() ? flagshipSetting.f239325f : flagshipSetting.f239328i;
        boolean z = false;
        if (!(str == null || str.length() == 0) && i > 0 && i2 > 0) {
            z = true;
        }
        String str2 = null;
        if ((z ? str : null) != null) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = C60641c.m70921b(((float) (layoutParams.height * i)) / ((float) i2));
            imageView.setLayoutParams(layoutParams);
            String str3 = C88394b.f255384g;
            str2 = C88394b.C88418q.f255427a.mo122785a(imageView, str, C0966R.C0969drawable.f4436hk, (C88394b.C88408j) null);
        }
        if (str2 == null) {
            imageView.setImageResource(C0966R.C0969drawable.f4436hk);
        }
    }
}
