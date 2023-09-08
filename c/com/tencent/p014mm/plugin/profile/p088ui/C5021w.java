package com.tencent.p014mm.plugin.profile.p088ui;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.profile.ui.w */
public final class C5021w extends C87413o implements C32226l<View, Boolean> {

    /* renamed from: d */
    public static final C5021w f20335d = new C5021w();

    public C5021w() {
        super(1);
    }

    public Object invoke(Object obj) {
        MMSwitchBtn mMSwitchBtn;
        View view = (View) obj;
        C87412m.m108594g(view, LocaleUtil.ITALIAN);
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        return Boolean.valueOf((viewGroup == null || (mMSwitchBtn = (MMSwitchBtn) viewGroup.findViewById(C0966R.C0970id.bab)) == null) ? false : mMSwitchBtn.f220433y);
    }
}
