package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.animation.ValueAnimator;
import com.tencent.p014mm.plugin.setting.p102ui.widget.SwitchAccountGridView;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.j3 */
public class C85447j3 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ SettingsSwitchAccountUI f249035d;

    public C85447j3(SettingsSwitchAccountUI settingsSwitchAccountUI) {
        this.f249035d = settingsSwitchAccountUI;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        SwitchAccountGridView switchAccountGridView = this.f249035d.f248987e;
        switchAccountGridView.setTranslationY((-floatValue) * ((float) switchAccountGridView.getHeight()));
    }
}
