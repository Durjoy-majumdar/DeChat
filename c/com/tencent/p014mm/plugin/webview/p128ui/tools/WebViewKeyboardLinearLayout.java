package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import com.tencent.p014mm.p136ui.KeyboardLinearLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import h81.C32735h;
import p206nj.C11171e;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewKeyboardLinearLayout */
public class WebViewKeyboardLinearLayout extends KeyboardLinearLayout {

    /* renamed from: j */
    public boolean f118381j = false;

    /* renamed from: n */
    public boolean f118382n;

    /* renamed from: o */
    public int f118383o;

    /* renamed from: p */
    public int f118384p;

    /* renamed from: q */
    public int f118385q;

    /* renamed from: r */
    public int f118386r;

    /* renamed from: s */
    public int f118387s = -1;

    public WebViewKeyboardLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (C11171e.m11046c(30)) {
            Log.m105924i("MicroMsg.WebViewKeyboardLinearLayout", "keyboard api30");
            getRootView().setOnApplyWindowInsetsListener(new C72627w0(this));
        }
    }

    private int getHideKeyHeightRate() {
        if (this.f118387s < 0) {
            int i = 10;
            int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_webview_keyboard_screen_height_hide_rate, 10);
            if (Qe > 0) {
                i = Qe;
            }
            this.f118387s = i;
            Log.m105925i("MicroMsg.WebViewKeyboardLinearLayout", "hide rate:%d", Integer.valueOf(i));
        }
        return this.f118387s;
    }

    /* renamed from: a */
    public void mo68188a(int i) {
        if (C11171e.m11046c(30)) {
            Log.m105924i("MicroMsg.WebViewKeyboardLinearLayout", "api30, ban onLayout method");
            return;
        }
        Log.m105918d("MicroMsg.WebViewKeyboardLinearLayout", "onLayout : b: " + i + " mHasInit: " + this.f118381j + " mHasKeyboard: " + this.f118382n);
        Rect rect = new Rect();
        getWindowVisibleDisplayFrame(rect);
        int height = getRootView().getHeight();
        if (!this.f118381j) {
            this.f118381j = true;
            this.f118385q = i;
            Log.m105925i("MicroMsg.WebViewKeyboardLinearLayout", "init height:%d", Integer.valueOf(i));
            super.mo68189b(-1);
            this.f118386r = height - rect.bottom;
        }
        Log.m105919d("MicroMsg.WebViewKeyboardLinearLayout", "onLayout, current rect = %s", rect.toString());
        int height2 = rect.height();
        this.f118385q = height2;
        Log.m105919d("MicroMsg.WebViewKeyboardLinearLayout", "onLayout, usableHeightNow = %d, previousUsableHeight = %d", Integer.valueOf(height2), Integer.valueOf(this.f118383o));
        if (this.f118383o != height2) {
            int height3 = (getRootView().getHeight() - this.f118386r) - rect.top;
            int i2 = height3 - height2;
            if (i2 > height3 / getHideKeyHeightRate()) {
                this.f118382n = true;
                this.f118384p = i2;
                super.mo68189b(-3);
                Log.m105928w("MicroMsg.WebViewKeyboardLinearLayout", "onLayout, show keyboard!! mHeight: " + this.f118385q + " b: " + i + " mKBHeight: " + this.f118384p);
            } else {
                this.f118382n = false;
                super.mo68189b(-2);
                Log.m105928w("MicroMsg.WebViewKeyboardLinearLayout", "onLayout, hide keyboard!! mHeight: " + this.f118385q + " b: " + i);
            }
            this.f118383o = height2;
        }
    }

    /* renamed from: b */
    public void mo68189b(int i) {
        super.mo68189b(i);
    }

    public final int getKeyBoardHeight() {
        return this.f118384p;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public WebViewKeyboardLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (C11171e.m11046c(30)) {
            Log.m105924i("MicroMsg.WebViewKeyboardLinearLayout", "keyboard api30");
            getRootView().setOnApplyWindowInsetsListener(new C72627w0(this));
        }
    }
}
