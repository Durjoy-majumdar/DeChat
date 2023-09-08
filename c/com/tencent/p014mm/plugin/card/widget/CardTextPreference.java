package com.tencent.p014mm.plugin.card.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;

/* renamed from: com.tencent.mm.plugin.card.widget.CardTextPreference */
public class CardTextPreference extends Preference {

    /* renamed from: J */
    public TextView f12157J;

    /* renamed from: K */
    public int f12158K = 0;

    /* renamed from: L */
    public TextView f12159L;

    /* renamed from: M */
    public boolean f12160M = true;

    /* renamed from: N */
    public Context f12161N;

    public CardTextPreference(Context context) {
        super(context, (AttributeSet) null);
        this.f12161N = context;
    }

    /* renamed from: I */
    public final void mo2063I(boolean z) {
        TextView textView = this.f12159L;
        if (textView != null) {
            Rect rect = new Rect();
            rect.left = textView.getPaddingLeft();
            rect.right = textView.getPaddingRight();
            rect.top = textView.getPaddingTop();
            rect.bottom = textView.getPaddingBottom();
            this.f12159L.setSingleLine(z);
            if (!z) {
                rect.top = this.f12161N.getResources().getDimensionPixelOffset(C0966R.dimen.f3895i6);
                int dimensionPixelOffset = this.f12161N.getResources().getDimensionPixelOffset(C0966R.dimen.f3895i6);
                rect.bottom = dimensionPixelOffset;
                TextView textView2 = this.f12159L;
                if (textView2 != null) {
                    textView2.setPadding(rect.left, rect.top, rect.right, dimensionPixelOffset);
                }
            }
        }
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        int i;
        super.mo1086w(view);
        this.f12157J = (TextView) view.findViewById(16908304);
        this.f12159L = (TextView) view.findViewById(16908310);
        TextView textView = this.f12157J;
        if (!(textView == null || (i = this.f12158K) == 0)) {
            textView.setTextColor(i);
        }
        mo2063I(this.f12160M);
    }

    public CardTextPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12161N = context;
    }

    public CardTextPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f121271G = C0966R.C0971layout.bcy;
        this.f12161N = context;
    }
}
