package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import p206nj.C11171e;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.a */
public final class C71133a extends UIComponent {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71133a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onCreate(Bundle bundle) {
        MMActivityController controller;
        int c = C74942w4.m89786c(getActivity(), C0966R.dimen.f3743cv);
        if (C11171e.m11046c(23)) {
            AppCompatActivity activity = getActivity();
            MMActivity mMActivity = activity instanceof MMActivity ? (MMActivity) activity : null;
            if (mMActivity != null && (controller = mMActivity.getController()) != null) {
                controller.mo177052J0(C74933u4.m89767d(getActivity(), C0966R.raw.icons_outlined_arrow_down, getResources().getColor(C0966R.color.FG_0), getResources().getColor(C0966R.color.BW_0_Alpha_0_0_3), c, 0.5f * ((float) c)));
            }
        }
    }
}
