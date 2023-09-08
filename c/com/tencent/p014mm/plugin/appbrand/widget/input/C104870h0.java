package com.tencent.p014mm.plugin.appbrand.widget.input;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.h0 */
public final class C104870h0 extends C104862f0 {
    public C104870h0(Context context) {
        super(context);
    }

    public View getInputPanel() {
        return C84983t0.m104783y(this);
    }

    public void setPasswordMode(boolean z) {
        mo148943w();
        int inputType = getInputType() | 1;
        setInputType(z ? inputType | 128 : inputType & -129);
        super.setPasswordMode(z);
        mo148918A();
    }

    /* renamed from: v */
    public void mo148790v() {
        try {
            C84975p1.m104767b(this).restartInput(this);
        } catch (RuntimeException e) {
            Log.m105921e("Luggage.Wxa.AppBrandInputWidgetSingleLineWithSoftKeyboard", "ensureInputConnection restartInput re=%s", e);
            try {
                C84975p1.m104767b(this).showSoftInput(this, 0);
            } catch (RuntimeException e2) {
                Log.m105921e("Luggage.Wxa.AppBrandInputWidgetSingleLineWithSoftKeyboard", "ensureInputConnection showSoftInput re=%s", e2);
            }
        }
    }
}
