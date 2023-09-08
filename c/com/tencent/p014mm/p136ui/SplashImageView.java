package com.tencent.p014mm.p136ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.C73312a5;

/* renamed from: com.tencent.mm.ui.SplashImageView */
public class SplashImageView extends ImageView {

    /* renamed from: d */
    public boolean f214659d;

    /* renamed from: e */
    public C73312a5 f214660e;

    public SplashImageView(Context context) {
        super(context);
        setBackgroundDrawable(getContext().getDrawable(C0966R.C0969drawable.cdl));
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        setBackgroundDrawable(getContext().getDrawable(C0966R.C0969drawable.cdl));
        if (!this.f214659d) {
            this.f214659d = true;
            C73312a5 a5Var = this.f214660e;
            if (a5Var != null) {
                ((SplashWelcomeView) a5Var).mo101556c();
            }
        }
    }

    public void setOnDrawListener(C73312a5 a5Var) {
        this.f214660e = a5Var;
    }

    public SplashImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackgroundDrawable(getContext().getDrawable(C0966R.C0969drawable.cdl));
    }

    public SplashImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setBackgroundDrawable(getContext().getDrawable(C0966R.C0969drawable.cdl));
    }
}
