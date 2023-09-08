package com.tencent.p014mm.plugin.sns.p104ad.widget.interactionlabel;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import ar2.C0200b;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import kg3.C76577a;
import vr2.C102260r;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView */
public class SnsAdInteractionLabelView extends LinearLayout {

    /* renamed from: d */
    public Context f274406d;

    /* renamed from: e */
    public TextView f274407e;

    /* renamed from: f */
    public ViewGroup f274408f;

    /* renamed from: g */
    public TextView f274409g;

    /* renamed from: h */
    public TextView f274410h;

    /* renamed from: i */
    public ArrayList<String> f274411i;

    /* renamed from: j */
    public int f274412j;

    /* renamed from: n */
    public boolean f274413n;

    /* renamed from: o */
    public long f274414o;

    /* renamed from: p */
    public AnimatorSet f274415p;

    /* renamed from: q */
    public AnimatorSet f274416q;

    /* renamed from: r */
    public int f274417r;

    /* renamed from: s */
    public Handler f274418s;

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView$a */
    public class C94761a extends Handler {
        public C94761a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            SnsMethodCalculate.markStartTimeMs("handleMessage", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView$1");
            SnsAdInteractionLabelView snsAdInteractionLabelView = SnsAdInteractionLabelView.this;
            snsAdInteractionLabelView.f274412j++;
            if (snsAdInteractionLabelView.f274409g.getVisibility() == 0) {
                SnsAdInteractionLabelView snsAdInteractionLabelView2 = SnsAdInteractionLabelView.this;
                SnsAdInteractionLabelView.m120024a(snsAdInteractionLabelView2, snsAdInteractionLabelView2.f274409g);
                SnsAdInteractionLabelView snsAdInteractionLabelView3 = SnsAdInteractionLabelView.this;
                SnsAdInteractionLabelView.m120025b(snsAdInteractionLabelView3, snsAdInteractionLabelView3.f274410h);
            } else {
                SnsAdInteractionLabelView snsAdInteractionLabelView4 = SnsAdInteractionLabelView.this;
                SnsAdInteractionLabelView.m120025b(snsAdInteractionLabelView4, snsAdInteractionLabelView4.f274409g);
                SnsAdInteractionLabelView snsAdInteractionLabelView5 = SnsAdInteractionLabelView.this;
                SnsAdInteractionLabelView.m120024a(snsAdInteractionLabelView5, snsAdInteractionLabelView5.f274410h);
            }
            SnsAdInteractionLabelView snsAdInteractionLabelView6 = SnsAdInteractionLabelView.this;
            if (!snsAdInteractionLabelView6.f274413n) {
                SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
                Handler handler = snsAdInteractionLabelView6.f274418s;
                SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
                handler.sendEmptyMessageDelayed(1, 2300);
            }
            SnsMethodCalculate.markEndTimeMs("handleMessage", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView$1");
        }
    }

    public SnsAdInteractionLabelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public static void m120024a(SnsAdInteractionLabelView snsAdInteractionLabelView, View view) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
        snsAdInteractionLabelView.getClass();
        SnsMethodCalculate.markStartTimeMs("doDisappearAnim", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
        float b = (float) C76577a.m92151b(snsAdInteractionLabelView.f274406d, 4);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", new float[]{0.0f, b});
        ofFloat.setDuration(200);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "translationY", new float[]{b, (float) (-C76577a.m92151b(snsAdInteractionLabelView.f274406d, 12))});
        ofFloat2.setDuration(200);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.0f});
        ofFloat3.setDuration(200);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat2).with(ofFloat3).after(ofFloat);
        animatorSet.addListener(new C0200b(snsAdInteractionLabelView, view));
        snsAdInteractionLabelView.f274416q = animatorSet;
        animatorSet.start();
        SnsMethodCalculate.markEndTimeMs("doDisappearAnim", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
    }

    /* renamed from: b */
    public static void m120025b(SnsAdInteractionLabelView snsAdInteractionLabelView, TextView textView) {
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
        snsAdInteractionLabelView.getClass();
        SnsMethodCalculate.markStartTimeMs("doAppearAnim", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
        textView.setVisibility(0);
        SnsMethodCalculate.markStartTimeMs("updateText", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
        if (snsAdInteractionLabelView.f274411i.size() == 0) {
            textView.setText("");
            SnsMethodCalculate.markEndTimeMs("updateText", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
        } else {
            textView.setText(snsAdInteractionLabelView.f274411i.get(snsAdInteractionLabelView.f274412j % snsAdInteractionLabelView.f274411i.size()));
            SnsMethodCalculate.markEndTimeMs("updateText", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, "alpha", new float[]{0.0f, 0.0f});
        ofFloat.setDuration(300);
        int b = C76577a.m92151b(snsAdInteractionLabelView.f274406d, 16);
        float f = (float) (-C76577a.m92151b(snsAdInteractionLabelView.f274406d, 2));
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, "translationY", new float[]{(float) b, f});
        ofFloat2.setDuration(200);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView, "alpha", new float[]{0.0f, 1.0f});
        ofFloat3.setDuration(200);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textView, "translationY", new float[]{f, 0.0f});
        ofFloat4.setDuration(200);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat2).with(ofFloat3).after(ofFloat);
        animatorSet.play(ofFloat4).after(ofFloat3);
        snsAdInteractionLabelView.f274415p = animatorSet;
        animatorSet.start();
        SnsMethodCalculate.markEndTimeMs("doAppearAnim", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
    }

    /* renamed from: c */
    public final void mo130540c() {
        SnsMethodCalculate.markStartTimeMs("resetAnim", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
        try {
            AnimatorSet animatorSet = this.f274416q;
            if (animatorSet != null) {
                animatorSet.end();
            }
            AnimatorSet animatorSet2 = this.f274415p;
            if (animatorSet2 != null) {
                animatorSet2.end();
            }
        } catch (Exception unused) {
        }
        this.f274409g.setVisibility(0);
        this.f274410h.setVisibility(4);
        this.f274409g.setAlpha(1.0f);
        this.f274410h.setAlpha(1.0f);
        this.f274409g.setTranslationY(0.0f);
        this.f274410h.setTranslationY(0.0f);
        SnsMethodCalculate.markEndTimeMs("resetAnim", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
    }

    /* renamed from: d */
    public void mo130541d() {
        SnsMethodCalculate.markStartTimeMs("startAnim", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
        if (C102260r.m134843L(getContext())) {
            SnsMethodCalculate.markEndTimeMs("startAnim", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
            return;
        }
        Log.m105924i("SnsAdInteractionLabelView", "--startAnim--");
        this.f274418s.removeCallbacksAndMessages((Object) null);
        if (this.f274411i.size() == 0) {
            this.f274409g.setText("");
            this.f274410h.setText("");
            this.f274413n = true;
            SnsMethodCalculate.markEndTimeMs("startAnim", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
        } else if (this.f274411i.size() == 1) {
            mo130540c();
            this.f274409g.setText(this.f274411i.get(0));
            this.f274410h.setText("");
            this.f274413n = true;
            SnsMethodCalculate.markEndTimeMs("startAnim", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
        } else {
            this.f274413n = false;
            this.f274412j = 0;
            mo130540c();
            this.f274409g.setText(this.f274411i.get(0));
            this.f274410h.setText("");
            this.f274418s.sendEmptyMessageDelayed(1, 1800);
            SnsMethodCalculate.markEndTimeMs("startAnim", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
        }
    }

    /* renamed from: e */
    public void mo130542e() {
        SnsMethodCalculate.markStartTimeMs("stopAnim", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
        if (C102260r.m134843L(getContext())) {
            SnsMethodCalculate.markEndTimeMs("stopAnim", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
            return;
        }
        Log.m105924i("SnsAdInteractionLabelView", "stopAnim");
        this.f274413n = true;
        this.f274418s.removeCallbacksAndMessages((Object) null);
        SnsMethodCalculate.markEndTimeMs("stopAnim", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
    }

    public void onAttachedToWindow() {
        SnsMethodCalculate.markStartTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
        super.onAttachedToWindow();
        Log.m105924i("SnsAdInteractionLabelView", "onAttachedToWindow");
        if (this.f274417r != 0) {
            mo130541d();
        }
        SnsMethodCalculate.markEndTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
    }

    public void onDetachedFromWindow() {
        SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
        super.onDetachedFromWindow();
        Log.m105924i("SnsAdInteractionLabelView", "onDetachedFromWindow");
        this.f274414o = 0;
        mo130542e();
        SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
    }

    public void onStartTemporaryDetach() {
        SnsMethodCalculate.markStartTimeMs("onStartTemporaryDetach", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
        if (Build.VERSION.SDK_INT < 24) {
            Log.m105924i("SnsAdInteractionLabelView", "onStartTemporaryDetach");
            this.f274414o = 0;
            mo130542e();
        }
        SnsMethodCalculate.markEndTimeMs("onStartTemporaryDetach", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
    }

    public SnsAdInteractionLabelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.f274411i = new ArrayList<>();
        this.f274412j = 0;
        this.f274413n = false;
        this.f274418s = new C94761a(Looper.getMainLooper());
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
        setOrientation(0);
        setGravity(16);
        this.f274406d = context;
        View.inflate(context, C0966R.C0971layout.c0v, this);
        this.f274407e = (TextView) findViewById(C0966R.C0970id.knx);
        this.f274408f = (ViewGroup) findViewById(C0966R.C0970id.aa4);
        this.f274409g = (TextView) findViewById(C0966R.C0970id.f5849q9);
        TextView textView = (TextView) findViewById(C0966R.C0970id.f5850q_);
        this.f274410h = textView;
        textView.setVisibility(4);
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
    }
}
