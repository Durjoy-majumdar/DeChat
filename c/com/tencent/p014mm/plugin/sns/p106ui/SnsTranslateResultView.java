package com.tencent.p014mm.plugin.sns.p106ui;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.tools.C74863w0;
import com.tencent.p014mm.plugin.sns.model.C94965w1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.x2c.X2CLinearLayout;
import di3.C86312j;
import kg3.C76577a;
import p206nj.C11171e;
import p629ny.C76979h;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsTranslateResultView */
public class SnsTranslateResultView extends X2CLinearLayout {

    /* renamed from: n */
    public static final int f278815n = Color.parseColor("#19000000");

    /* renamed from: d */
    public TextView f278816d;

    /* renamed from: e */
    public TextView f278817e;

    /* renamed from: f */
    public View f278818f;

    /* renamed from: g */
    public Drawable f278819g;

    /* renamed from: h */
    public int f278820h = -1;

    /* renamed from: i */
    public float f278821i = -1.0f;

    /* renamed from: j */
    public int f278822j = -1;

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsTranslateResultView$a */
    public class C95658a implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ C94965w1.C94967b f278823d;

        public C95658a(SnsTranslateResultView snsTranslateResultView, C94965w1.C94967b bVar) {
            this.f278823d = bVar;
        }

        public void onAnimationCancel(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView$1");
            SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView$1");
        }

        public void onAnimationEnd(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView$1");
            C94965w1.C94967b bVar = this.f278823d;
            if (bVar != null) {
                C94965w1.m120634o(bVar);
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView$1");
        }

        public void onAnimationRepeat(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView$1");
            SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView$1");
        }

        public void onAnimationStart(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView$1");
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView$1");
        }
    }

    public SnsTranslateResultView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo133014b();
    }

    /* renamed from: a */
    public void mo133013a(C94965w1.C94967b bVar, int i, String str, String str2, boolean z) {
        SnsMethodCalculate.markStartTimeMs("finishTranslate", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
        this.f278820h = i;
        SnsMethodCalculate.markStartTimeMs("updateTranslateReusltSizeAndColor", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
        float f = this.f278821i;
        if (f == -1.0f && this.f278822j == -1) {
            int i2 = this.f278820h;
            if (i2 == 2) {
                this.f278817e.setTextSize(1, C76577a.m92165p(getContext()) * 14.0f);
            } else if (i2 == 1) {
                this.f278817e.setTextSize(1, C76577a.m92165p(getContext()) * 15.0f);
            }
        } else {
            this.f278817e.setTextSize(this.f278822j, f);
        }
        int i3 = this.f278820h;
        if (i3 == 2) {
            this.f278817e.setTextColor(getContext().getResources().getColor(C0966R.color.adr));
        } else if (i3 == 1) {
            this.f278817e.setTextColor(getContext().getResources().getColor(C0966R.color.adt));
        }
        SnsMethodCalculate.markEndTimeMs("updateTranslateReusltSizeAndColor", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
        if (!Util.isNullOrNil(str)) {
            this.f278817e.setText(str);
            ((C76979h) C86312j.m106911c(C76979h.class)).mo107079pD(this.f278817e, 2);
        } else {
            this.f278817e.setText(C0966R.string.jji);
        }
        this.f278817e.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        if (z && C11171e.m11046c(11)) {
            C74863w0.m89621b(this.f278817e, new C95658a(this, bVar));
        }
        if (!Util.isNullOrNil(str2)) {
            this.f278816d.setText(str2);
        } else {
            this.f278816d.setText(C0966R.string.bc8);
        }
        this.f278816d.setVisibility(0);
        SnsMethodCalculate.markEndTimeMs("finishTranslate", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
    }

    /* renamed from: b */
    public final void mo133014b() {
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
        LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.cas, this);
        this.f278816d = (TextView) findViewById(C0966R.C0970id.jws);
        this.f278817e = (TextView) findViewById(C0966R.C0970id.jwt);
        this.f278818f = findViewById(C0966R.C0970id.f359420ku2);
        Drawable drawable = getResources().getDrawable(C0966R.C0969drawable.blz);
        this.f278819g = drawable;
        drawable.setBounds(0, 0, (int) (this.f278817e.getTextSize() * 0.8f), (int) (this.f278817e.getTextSize() * 0.8f));
        this.f278819g.setColorFilter(f278815n, PorterDuff.Mode.SRC_IN);
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
    }

    /* renamed from: e */
    public void mo133015e() {
        SnsMethodCalculate.markStartTimeMs("initWhenUse", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
        SnsMethodCalculate.markStartTimeMs("hasInit", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
        boolean z = this.f278816d != null;
        SnsMethodCalculate.markEndTimeMs("hasInit", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
        if (z) {
            SnsMethodCalculate.markEndTimeMs("initWhenUse", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
            return;
        }
        mo133014b();
        SnsMethodCalculate.markEndTimeMs("initWhenUse", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
    }

    public TextView getResultTextView() {
        SnsMethodCalculate.markStartTimeMs("getResultTextView", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
        TextView textView = this.f278817e;
        SnsMethodCalculate.markEndTimeMs("getResultTextView", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
        return textView;
    }

    public View getSplitlineView() {
        SnsMethodCalculate.markStartTimeMs("getSplitlineView", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
        View view = this.f278818f;
        SnsMethodCalculate.markEndTimeMs("getSplitlineView", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
        return view;
    }

    /* renamed from: i */
    public void mo133018i(int i, float f) {
        SnsMethodCalculate.markStartTimeMs("setResultTextSize", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
        this.f278817e.setTextSize(i, f);
        this.f278821i = f;
        this.f278822j = i;
        SnsMethodCalculate.markEndTimeMs("setResultTextSize", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
    }

    /* renamed from: j */
    public void mo133019j(int i) {
        SnsMethodCalculate.markStartTimeMs("startTranslate", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
        this.f278817e.setCompoundDrawables(this.f278819g, (Drawable) null, (Drawable) null, (Drawable) null);
        this.f278817e.setCompoundDrawablePadding(C76577a.m92151b(getContext(), 3));
        this.f278817e.setText(C0966R.string.jjk);
        C74863w0.m89621b(this.f278817e, (Animator.AnimatorListener) null);
        this.f278816d.setVisibility(4);
        this.f278820h = i;
        this.f278817e.setTextSize(0, this.f278816d.getTextSize());
        this.f278817e.setTextColor(getContext().getResources().getColor(C0966R.color.ads));
        SnsMethodCalculate.markEndTimeMs("startTranslate", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
    }

    public void setResultTextSize(float f) {
        SnsMethodCalculate.markStartTimeMs("setResultTextSize", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
        this.f278817e.setTextSize(0, f);
        this.f278821i = f;
        this.f278822j = 0;
        SnsMethodCalculate.markEndTimeMs("setResultTextSize", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
    }

    public SnsTranslateResultView(Context context) {
        super(context);
        mo133014b();
    }

    public SnsTranslateResultView(Context context, boolean z) {
        super(context);
        if (!z) {
            mo133014b();
        }
    }
}
