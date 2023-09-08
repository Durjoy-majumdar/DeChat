package com.tencent.p014mm.plugin.sns.p104ad.widget.living;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.IXWebBroadcastListener;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import wq3.C111847h;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout */
public class LivingDescBarLayout extends RelativeLayout implements C111847h {

    /* renamed from: d */
    public ImageView f164310d;

    /* renamed from: e */
    public C57345a f164311e;

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$a */
    public static class C57345a implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener, Handler.Callback {

        /* renamed from: d */
        public TextView f164312d;

        /* renamed from: e */
        public TextView f164313e;

        /* renamed from: f */
        public Handler f164314f = new Handler(Looper.getMainLooper(), this);

        /* renamed from: g */
        public ValueAnimator f164315g;

        /* renamed from: h */
        public C57346b f164316h;

        /* renamed from: i */
        public int f164317i = 0;

        /* renamed from: j */
        public float f164318j = 0.0f;

        /* renamed from: n */
        public int f164319n = 1;

        public C57345a(TextView textView, TextView textView2) {
            this.f164312d = textView;
            this.f164313e = textView2;
        }

        /* renamed from: a */
        public boolean mo80937a() {
            SnsMethodCalculate.markStartTimeMs("checkTextViewValid", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
            boolean z = (this.f164313e == null || this.f164312d == null) ? false : true;
            SnsMethodCalculate.markEndTimeMs("checkTextViewValid", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
            return z;
        }

        /* renamed from: b */
        public void mo80938b(View view) {
            SnsMethodCalculate.markStartTimeMs("resetViewState", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(4);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ad/widget/living/LivingDescBarLayout$AlternatelySlideController", "resetViewState", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ad/widget/living/LivingDescBarLayout$AlternatelySlideController", "resetViewState", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setTranslationY(0.0f);
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(Float.valueOf(1.0f));
                C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ad/widget/living/LivingDescBarLayout$AlternatelySlideController", "resetViewState", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ad/widget/living/LivingDescBarLayout$AlternatelySlideController", "resetViewState", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            SnsMethodCalculate.markEndTimeMs("resetViewState", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
        }

        /* renamed from: c */
        public void mo80939c(C57346b bVar) {
            SnsMethodCalculate.markStartTimeMs("setAdapter", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
            try {
                mo80941e();
                if (bVar != null && bVar.getCount() > 0 && mo80937a()) {
                    this.f164317i = 0;
                    String a = bVar.mo80948a(0);
                    this.f164312d.setVisibility(0);
                    this.f164312d.setText(a);
                    if (bVar.getCount() > 1) {
                        this.f164314f.sendEmptyMessageDelayed(1, 2000);
                    }
                }
                this.f164316h = bVar;
            } catch (Throwable unused) {
            }
            SnsMethodCalculate.markEndTimeMs("setAdapter", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
        }

        /* renamed from: d */
        public void mo80940d() {
            SnsMethodCalculate.markStartTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
            try {
                SnsMethodCalculate.markStartTimeMs("ensureAnimator", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
                if (this.f164315g == null) {
                    ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(1000);
                    this.f164315g = duration;
                    duration.addUpdateListener(this);
                    this.f164315g.addListener(this);
                }
                SnsMethodCalculate.markEndTimeMs("ensureAnimator", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
                if (mo80937a()) {
                    this.f164318j = (float) this.f164312d.getHeight();
                    this.f164315g.start();
                    this.f164319n = 0;
                }
            } catch (Throwable unused) {
            }
            SnsMethodCalculate.markEndTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
        }

        /* renamed from: e */
        public void mo80941e() {
            SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
            try {
                this.f164319n = 1;
                this.f164314f.removeMessages(1);
                ValueAnimator valueAnimator = this.f164315g;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f164315g.cancel();
                }
            } catch (Throwable unused) {
            }
            SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
        }

        public boolean handleMessage(Message message) {
            SnsMethodCalculate.markStartTimeMs("handleMessage", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
            try {
                if (message.what == 1) {
                    mo80940d();
                    SnsMethodCalculate.markEndTimeMs("handleMessage", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
                    return true;
                }
            } catch (Throwable unused) {
            }
            SnsMethodCalculate.markEndTimeMs("handleMessage", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
            return false;
        }

        public void onAnimationCancel(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
            try {
                Log.m105918d("SlideController", "onAnimationCancel is called ");
                mo80938b(this.f164313e);
                mo80938b(this.f164312d);
            } catch (Throwable unused) {
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
        }

        public void onAnimationEnd(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
            Log.m105918d("SlideController", "onAnimationEnd is called ");
            try {
                C57346b bVar = this.f164316h;
                if (bVar != null && bVar.getCount() > 0) {
                    if (mo80937a()) {
                        TextView textView = this.f164313e;
                        TextView textView2 = this.f164312d;
                        this.f164313e = textView2;
                        this.f164312d = textView;
                        mo80938b(textView2);
                        this.f164317i = (this.f164317i + 1) % bVar.getCount();
                        this.f164318j = 0.0f;
                        if (this.f164319n == 0) {
                            this.f164314f.sendEmptyMessageDelayed(1, 2000);
                        }
                        this.f164315g = null;
                        SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
                        return;
                    }
                }
                Log.m105918d("SlideController", "onAnimationEnd return because of count is 0");
                SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
            } catch (Throwable unused) {
            }
        }

        public void onAnimationRepeat(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
            SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
        }

        public void onAnimationStart(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
            Log.m105918d("SlideController", "onAnimationStart is called ");
            try {
                C57346b bVar = this.f164316h;
                if (bVar != null && bVar.getCount() > 0) {
                    if (mo80937a()) {
                        this.f164313e.setTranslationY(this.f164318j);
                        this.f164313e.setAlpha(0.0f);
                        this.f164313e.setVisibility(0);
                        this.f164313e.setText(bVar.mo80948a((this.f164317i + 1) % bVar.getCount()));
                        SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
                        return;
                    }
                }
                Log.m105918d("SlideController", "onAnimationStart return because of count is 0 ");
                SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
            } catch (Throwable unused) {
            }
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
            try {
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue instanceof Float) {
                    float floatValue = ((Float) animatedValue).floatValue();
                    SnsMethodCalculate.markStartTimeMs("onValueUpdate", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
                    if (mo80937a()) {
                        float f = this.f164318j;
                        float f2 = f * floatValue;
                        this.f164313e.setTranslationY(f - f2);
                        this.f164313e.setAlpha(floatValue);
                        this.f164312d.setTranslationY(-f2);
                        this.f164312d.setAlpha(1.0f - floatValue);
                    }
                    SnsMethodCalculate.markEndTimeMs("onValueUpdate", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
                }
            } catch (Throwable unused) {
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$b */
    public interface C57346b {
        /* renamed from: a */
        String mo80948a(int i);

        int getCount();
    }

    public LivingDescBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public boolean mo80930a() {
        SnsMethodCalculate.markStartTimeMs("isAdapterEmpty", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
        C57345a aVar = this.f164311e;
        boolean z = false;
        if (aVar != null) {
            SnsMethodCalculate.markStartTimeMs("isAdapterEmpty", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
            C57346b bVar = aVar.f164316h;
            if (bVar == null || bVar.getCount() <= 0) {
                z = true;
            }
            SnsMethodCalculate.markEndTimeMs("isAdapterEmpty", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
            SnsMethodCalculate.markEndTimeMs("isAdapterEmpty", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
            return z;
        }
        SnsMethodCalculate.markEndTimeMs("isAdapterEmpty", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
        return false;
    }

    /* renamed from: b */
    public void mo80931b() {
        SnsMethodCalculate.markStartTimeMs("notifyCurrentDataChange", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
        C57345a aVar = this.f164311e;
        if (aVar != null) {
            SnsMethodCalculate.markStartTimeMs("notifyCurrentDataChange", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
            try {
                C57346b bVar = aVar.f164316h;
                if (bVar != null && bVar.getCount() > 0 && aVar.mo80937a()) {
                    Log.m105924i("SlideController", "notifyCurrentDataChange, mCurrentVisibleView pre text is " + aVar.f164312d.getText() + ", mToVisibleView pre text is " + aVar.f164313e.getText());
                    String a = aVar.f164316h.mo80948a(aVar.f164317i);
                    aVar.f164312d.setText(a);
                    String a2 = aVar.f164316h.mo80948a((aVar.f164317i + 1) % aVar.f164316h.getCount());
                    aVar.f164313e.setText(a2);
                    Log.m105924i("SlideController", "notifyCurrentDataChange, mCurrentVisibleView: " + a + ", mToVisibleView: " + a2);
                }
            } catch (Throwable th) {
                Log.m105920e("SlideController", th.toString());
            }
            SnsMethodCalculate.markEndTimeMs("notifyCurrentDataChange", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
        }
        SnsMethodCalculate.markEndTimeMs("notifyCurrentDataChange", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
    }

    /* renamed from: c */
    public void mo80932c() {
        SnsMethodCalculate.markStartTimeMs("stopSlide", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
        C57345a aVar = this.f164311e;
        if (aVar != null) {
            aVar.mo80941e();
        }
        SnsMethodCalculate.markEndTimeMs("stopSlide", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
    }

    public void onAttachedToWindow() {
        SnsMethodCalculate.markStartTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
        super.onAttachedToWindow();
        Log.m105928w("SnsAd.LivingDescBarLayout", "onAttachedToWindow is called!!");
        SnsMethodCalculate.markEndTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
    }

    public void onDetachedFromWindow() {
        SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
        super.onDetachedFromWindow();
        C57345a aVar = this.f164311e;
        if (aVar != null) {
            aVar.mo80939c((C57346b) null);
        }
        SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
    }

    public void onFinishInflate() {
        SnsMethodCalculate.markStartTimeMs("onFinishInflate", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
        super.onFinishInflate();
        try {
            ImageView imageView = (ImageView) findViewById(C0966R.C0970id.f5551i5);
            this.f164310d = imageView;
            imageView.setImageResource(C0966R.raw.ad_living_description_icon);
            this.f164311e = new C57345a((TextView) findViewById(C0966R.C0970id.f5548i2), (TextView) findViewById(C0966R.C0970id.f5549i3));
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("onFinishInflate", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
    }

    public void setIconImage(Drawable drawable) {
        SnsMethodCalculate.markStartTimeMs("setIconImage", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
        ImageView imageView = this.f164310d;
        if (!(imageView == null || drawable == null)) {
            imageView.setImageDrawable(drawable);
        }
        SnsMethodCalculate.markEndTimeMs("setIconImage", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
    }

    public void setSlideAdapter(C57346b bVar) {
        SnsMethodCalculate.markStartTimeMs("setSlideAdapter", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
        C57345a aVar = this.f164311e;
        if (aVar != null) {
            aVar.mo80939c(bVar);
        }
        SnsMethodCalculate.markEndTimeMs("setSlideAdapter", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
    }

    public LivingDescBarLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
