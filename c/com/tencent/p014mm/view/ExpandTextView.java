package com.tencent.p014mm.view;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.neattextview.textview.layout.NeatLayout;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import wq3.C111847h;
import yr3.C79150a;

/* renamed from: com.tencent.mm.view.ExpandTextView */
public class ExpandTextView extends FrameLayout implements View.OnClickListener, C111847h {

    /* renamed from: d */
    public TextView f24917d;

    /* renamed from: e */
    public MMNeat7extView f24918e;

    /* renamed from: f */
    public boolean f24919f = false;

    /* renamed from: com.tencent.mm.view.ExpandTextView$a */
    public class C7072a implements Animator.AnimatorListener {
        public C7072a() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            ExpandTextView.this.f24917d.setAlpha(1.0f);
            ExpandTextView.this.f24917d.setVisibility(8);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.tencent.mm.view.ExpandTextView$b */
    public interface C7073b {
        /* renamed from: a */
        void mo8142a(boolean z);
    }

    public ExpandTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TextView getExpandTextView() {
        return this.f24917d;
    }

    public MMNeat7extView getTextView() {
        return this.f24918e;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/view/ExpandTextView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!this.f24919f) {
            this.f24919f = true;
            this.f24918e.setMaxLines(Integer.MAX_VALUE);
            this.f24917d.animate().alpha(0.0f).setDuration(300).setListener(new C7072a()).start();
        }
        C117292a.m165361g(this, "com/tencent/mm/view/ExpandTextView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f24918e = new MMNeat7extView(getContext());
        addView(this.f24918e, new FrameLayout.LayoutParams(-1, -1));
        this.f24917d = new TextView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 85;
        addView(this.f24917d, layoutParams);
        this.f24917d.setOnClickListener(this);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.f24919f) {
            C79150a i3 = this.f24918e.mo154990i(getMeasuredWidth(), getMeasuredHeight());
            if (i3 == null) {
                Log.m105920e("MicroMsg.ExpandTextView", "layout is null!");
                this.f24917d.setVisibility(8);
            } else if (((NeatLayout) i3).f319992L > 0) {
                this.f24917d.setVisibility(0);
            } else {
                this.f24917d.setVisibility(8);
            }
        }
    }

    public void setExpandIconText(String str) {
    }

    public void setExpandTextColor(int i) {
        this.f24917d.setTextColor(i);
    }

    public void setExpandTextSize(float f) {
        this.f24917d.setTextSize(0, f);
    }

    public void setLineSpacingExtra(int i) {
        this.f24918e.setSpacingAdd(i);
    }

    public void setMaxLines(int i) {
        this.f24918e.setMaxLines(i);
    }

    public void setOnExpandListener(C7073b bVar) {
    }

    public void setTextColor(int i) {
        this.f24918e.setTextColor(i);
    }

    public void setTextSize(float f) {
        this.f24918e.mo154994l(0, f);
    }

    public ExpandTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
