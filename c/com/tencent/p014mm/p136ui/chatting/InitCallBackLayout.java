package com.tencent.p014mm.p136ui.chatting;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.tencent.p014mm.p136ui.SplashWelcomeView;

/* renamed from: com.tencent.mm.ui.chatting.InitCallBackLayout */
public class InitCallBackLayout extends FrameLayout {

    /* renamed from: d */
    public boolean f215341d;

    /* renamed from: e */
    public C73312a5 f215342e;

    public InitCallBackLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f215341d) {
            this.f215341d = true;
            C73312a5 a5Var = this.f215342e;
            if (a5Var != null) {
                ((SplashWelcomeView) a5Var).mo101556c();
            }
        }
    }

    public void setListener(C73312a5 a5Var) {
        this.f215342e = a5Var;
    }
}
