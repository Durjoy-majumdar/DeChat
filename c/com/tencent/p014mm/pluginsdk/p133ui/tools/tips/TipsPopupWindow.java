package com.tencent.p014mm.pluginsdk.p133ui.tools.tips;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.tips.TipsPopupWindow */
public class TipsPopupWindow extends PopupWindow {

    /* renamed from: f */
    public static final /* synthetic */ int f212546f = 0;

    /* renamed from: a */
    public FrameLayout f212547a;

    /* renamed from: b */
    public int f212548b;

    /* renamed from: c */
    public int f212549c;

    /* renamed from: d */
    public int f212550d;

    /* renamed from: e */
    public int f212551e;

    public TipsPopupWindow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public View getContentView() {
        return this.f212547a.getChildAt(0);
    }

    public void setContentView(View view) {
        this.f212547a.removeAllViews();
        this.f212547a.addView(view);
    }

    public TipsPopupWindow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f212547a = frameLayout;
        super.setContentView(frameLayout);
    }
}
