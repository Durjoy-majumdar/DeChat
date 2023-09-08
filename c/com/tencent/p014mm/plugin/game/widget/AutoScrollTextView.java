package com.tencent.p014mm.plugin.game.widget;

import android.content.Context;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import di3.C86312j;
import java.util.ArrayList;
import java.util.List;
import p629ny.C76979h;

/* renamed from: com.tencent.mm.plugin.game.widget.AutoScrollTextView */
public class AutoScrollTextView extends LinearLayout {

    /* renamed from: d */
    public ArrayList<String> f19319d = new ArrayList<>();

    /* renamed from: e */
    public int f19320e = 0;

    /* renamed from: f */
    public TextView f19321f;

    /* renamed from: g */
    public TextView f19322g;

    /* renamed from: h */
    public Animation f19323h;

    /* renamed from: i */
    public Animation f19324i;

    /* renamed from: j */
    public MTimerHandler f19325j = new MTimerHandler(new C4572a(), true);

    /* renamed from: com.tencent.mm.plugin.game.widget.AutoScrollTextView$a */
    public class C4572a implements MTimerHandler.CallBack {
        public C4572a() {
        }

        public boolean onTimerExpired() {
            String str;
            AutoScrollTextView autoScrollTextView = AutoScrollTextView.this;
            if (autoScrollTextView.f19319d.size() >= 2) {
                if (autoScrollTextView.f19320e < autoScrollTextView.f19319d.size() - 1) {
                    int i = autoScrollTextView.f19320e + 1;
                    autoScrollTextView.f19320e = i;
                    str = autoScrollTextView.f19319d.get(i);
                } else {
                    autoScrollTextView.f19320e = 0;
                    str = autoScrollTextView.f19319d.get(0);
                }
                autoScrollTextView.mo5429a(autoScrollTextView.f19322g, str);
                autoScrollTextView.f19321f.startAnimation(autoScrollTextView.f19324i);
                autoScrollTextView.f19321f.setVisibility(8);
                autoScrollTextView.f19322g.startAnimation(autoScrollTextView.f19323h);
                autoScrollTextView.f19322g.setVisibility(0);
                TextView textView = autoScrollTextView.f19321f;
                autoScrollTextView.f19321f = autoScrollTextView.f19322g;
                autoScrollTextView.f19322g = textView;
            }
            return true;
        }
    }

    public AutoScrollTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TextView textView = new TextView(context, attributeSet);
        this.f19321f = textView;
        textView.setVisibility(8);
        TextView textView2 = new TextView(context, attributeSet);
        this.f19322g = textView2;
        textView2.setVisibility(8);
        addView(this.f19321f);
        addView(this.f19322g);
        setOrientation(1);
        setGravity(17);
        setPadding(0, 0, 0, 0);
        this.f19323h = AnimationUtils.loadAnimation(context, C0966R.C0968anim.f2495ej);
        this.f19324i = AnimationUtils.loadAnimation(context, C0966R.C0968anim.f2509ex);
    }

    /* renamed from: a */
    public final void mo5429a(TextView textView, String str) {
        textView.setText(new SpannableString(((C76979h) C86312j.m106911c(C76979h.class)).yp0(getContext(), str, textView.getTextSize())));
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f19325j.stopTimer();
    }

    public void setText(List<String> list) {
        this.f19319d.clear();
        this.f19325j.stopTimer();
        if (list == null || list.size() == 0) {
            this.f19321f.setVisibility(8);
            this.f19322g.setVisibility(8);
            return;
        }
        this.f19319d.addAll(list);
        mo5429a(this.f19321f, this.f19319d.get(0));
        this.f19321f.setVisibility(0);
        this.f19320e = 0;
        if (this.f19319d.size() != 1) {
            this.f19325j.startTimer(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
        }
    }
}
