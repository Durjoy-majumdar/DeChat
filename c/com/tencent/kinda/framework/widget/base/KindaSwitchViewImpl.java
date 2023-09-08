package com.tencent.kinda.framework.widget.base;

import android.content.Context;
import com.tencent.kinda.gen.DynamicColor;
import com.tencent.kinda.gen.KImage;
import com.tencent.kinda.gen.KSwitchView;
import com.tencent.kinda.gen.KSwitchViewOnChangeSwitchCallback;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;

public class KindaSwitchViewImpl extends MMKView<MMSwitchBtn> implements KSwitchView {
    private MMSwitchBtn mmSwitchBtn;
    public KSwitchViewOnChangeSwitchCallback onChangeSwitchCallback;

    public boolean getEnabled() {
        return this.mmSwitchBtn.isEnabled();
    }

    public KImage getOffImage() {
        return null;
    }

    public boolean getOn() {
        return this.mmSwitchBtn.f220433y;
    }

    public KImage getOnImage() {
        return null;
    }

    public DynamicColor getOnTintColor() {
        return null;
    }

    public DynamicColor getThumbTintColor() {
        return null;
    }

    public DynamicColor getTintColor() {
        return null;
    }

    public void setEnabled(boolean z) {
        this.mmSwitchBtn.setEnabled(z);
    }

    public void setOffImage(KImage kImage) {
    }

    public void setOn(boolean z) {
        this.mmSwitchBtn.setCheck(z);
    }

    public void setOnChangeSwitchCallback(KSwitchViewOnChangeSwitchCallback kSwitchViewOnChangeSwitchCallback) {
        this.onChangeSwitchCallback = kSwitchViewOnChangeSwitchCallback;
        this.mmSwitchBtn.setSwitchListener(new MMSwitchBtn.C7041b() {
            public void onStatusChange(boolean z) {
                KindaSwitchViewImpl.this.onChangeSwitchCallback.onChangeSwitch();
            }
        });
    }

    public void setOnImage(KImage kImage) {
    }

    public void setOnTintColor(DynamicColor dynamicColor) {
    }

    public void setThumbTintColor(DynamicColor dynamicColor) {
    }

    public void setTintColor(DynamicColor dynamicColor) {
    }

    public MMSwitchBtn createView(Context context) {
        MMSwitchBtn mMSwitchBtn = new MMSwitchBtn(context);
        this.mmSwitchBtn = mMSwitchBtn;
        return mMSwitchBtn;
    }
}
