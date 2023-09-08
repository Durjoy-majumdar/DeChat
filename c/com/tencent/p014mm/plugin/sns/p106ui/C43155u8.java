package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.widget.AbsoluteLayout;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.u8 */
public class C43155u8 {

    /* renamed from: a */
    public Context f116737a;

    /* renamed from: b */
    public TimelineClickListener f116738b;

    /* renamed from: c */
    public FrameLayout f116739c;

    /* renamed from: d */
    public AbsoluteLayout f116740d = null;

    /* renamed from: e */
    public Animation f116741e;

    /* renamed from: f */
    public Animation f116742f;

    /* renamed from: g */
    public boolean f116743g = false;

    /* renamed from: h */
    public boolean f116744h = false;

    /* renamed from: i */
    public int f116745i = -1;

    /* renamed from: com.tencent.mm.plugin.sns.ui.u8$a */
    public class C43156a {

        /* renamed from: a */
        public View f116746a;

        public C43156a(C43155u8 u8Var, View view) {
            this.f116746a = view;
        }
    }

    public C43155u8(Context context, TimelineClickListener timelineClickListener, FrameLayout frameLayout, View view) {
        this.f116737a = context;
        this.f116738b = timelineClickListener;
        this.f116739c = frameLayout;
        this.f116741e = new ScaleAnimation(1.0f, 1.0f, 0.0f, 1.0f, 1, 1.0f, 1, 0.0f);
        this.f116741e = AnimationUtils.loadAnimation(context, C0966R.C0968anim.f2368b5);
        this.f116742f = new ScaleAnimation(1.0f, 1.0f, 1.0f, 0.0f, 1, 1.0f, 1, 0.0f);
        this.f116742f = AnimationUtils.loadAnimation(context, C0966R.C0968anim.f2369b6);
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m46728a(C43155u8 u8Var, boolean z) {
        SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.TimelineEmojiInfoHelper");
        u8Var.f116743g = z;
        SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.TimelineEmojiInfoHelper");
        return z;
    }

    /* renamed from: b */
    public boolean mo67375b() {
        SnsMethodCalculate.markStartTimeMs("removeEmojiInfoView", "com.tencent.mm.plugin.sns.ui.TimelineEmojiInfoHelper");
        AbsoluteLayout absoluteLayout = this.f116740d;
        if (absoluteLayout != null) {
            this.f116739c.removeView(absoluteLayout);
            this.f116740d = null;
            SnsMethodCalculate.markEndTimeMs("removeEmojiInfoView", "com.tencent.mm.plugin.sns.ui.TimelineEmojiInfoHelper");
            return true;
        }
        this.f116743g = false;
        SnsMethodCalculate.markEndTimeMs("removeEmojiInfoView", "com.tencent.mm.plugin.sns.ui.TimelineEmojiInfoHelper");
        return false;
    }
}
