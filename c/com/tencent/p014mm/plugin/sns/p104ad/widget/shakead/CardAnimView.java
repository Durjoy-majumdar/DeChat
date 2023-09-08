package com.tencent.p014mm.plugin.sns.p104ad.widget.shakead;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.p136ui.widget.MMRoundCornerImageView;
import com.tencent.p014mm.plugin.sns.p104ad.widget.shakead.ShakeCardAnimView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import sq2.C13774c;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView */
public class CardAnimView extends FrameLayout {

    /* renamed from: p */
    public static final /* synthetic */ int f274438p = 0;

    /* renamed from: d */
    public Context f274439d;

    /* renamed from: e */
    public int f274440e;

    /* renamed from: f */
    public int f274441f;

    /* renamed from: g */
    public int f274442g;

    /* renamed from: h */
    public View f274443h;

    /* renamed from: i */
    public View f274444i;

    /* renamed from: j */
    public ArrayList<View> f274445j = new ArrayList<>();

    /* renamed from: n */
    public boolean f274446n = false;

    /* renamed from: o */
    public ShakeCardAnimView.C94768c f274447o;

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView$a */
    public class C5427a extends C13774c {

        /* renamed from: d */
        public final /* synthetic */ View f21124d;

        public C5427a(CardAnimView cardAnimView, View view) {
            this.f21124d = view;
        }

        public void onAnimationStart(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView$1");
            View view = this.f21124d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ad/widget/shakead/CardAnimView$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ad/widget/shakead/CardAnimView$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView$1");
        }
    }

    public CardAnimView(Context context) {
        super(context);
        mo130563c(context);
    }

    /* renamed from: a */
    public static /* synthetic */ ShakeCardAnimView.C94768c m120052a(CardAnimView cardAnimView) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
        ShakeCardAnimView.C94768c cVar = cardAnimView.f274447o;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
        return cVar;
    }

    /* renamed from: b */
    public static /* synthetic */ void m120053b(CardAnimView cardAnimView, int i) {
        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
        cardAnimView.setCardVisibility(i);
        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
    }

    private void setCardVisibility(int i) {
        SnsMethodCalculate.markStartTimeMs("setCardVisibility", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
        for (int i2 = 0; i2 < this.f274445j.size(); i2++) {
            View view = this.f274445j.get(i2);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ad/widget/shakead/CardAnimView", "setCardVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ad/widget/shakead/CardAnimView", "setCardVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        SnsMethodCalculate.markEndTimeMs("setCardVisibility", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
    }

    /* renamed from: c */
    public final void mo130563c(Context context) {
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
        this.f274439d = context;
        this.f274440e = C76577a.m92151b(context, 96);
        this.f274441f = C76577a.m92151b(this.f274439d, 162);
        this.f274442g = C76577a.m92151b(this.f274439d, 72);
        Context context2 = this.f274439d;
        SnsMethodCalculate.markStartTimeMs("initCardView", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
        int a = C76577a.m92150a(this.f274439d, 3.6f);
        for (int i = 0; i < 5; i++) {
            MMRoundCornerImageView mMRoundCornerImageView = new MMRoundCornerImageView(context2);
            mMRoundCornerImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            mMRoundCornerImageView.setLayoutParams(new FrameLayout.LayoutParams(this.f274440e, this.f274441f));
            mMRoundCornerImageView.setRadius(a);
            addView(mMRoundCornerImageView);
            this.f274445j.add(mMRoundCornerImageView);
        }
        setCardVisibility(4);
        SnsMethodCalculate.markEndTimeMs("initCardView", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
    }

    /* renamed from: d */
    public final void mo130564d(View view, int i, int i2, int i3) {
        SnsMethodCalculate.markStartTimeMs("playOtherCardAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", new float[]{(float) (-((getHeight() / 2) + (this.f274441f / 2) + this.f274442g)), 0.0f});
        long j = (long) i2;
        ofFloat.setDuration(j);
        ofFloat.addListener(new C5427a(this, view));
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleX", new float[]{0.33333334f, 1.0f});
        ofFloat2.setDuration(j);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "scaleY", new float[]{0.33333334f, 1.0f});
        ofFloat3.setDuration(j);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, "translationX", new float[]{0.0f, (float) i3});
        ofFloat4.setDuration(j);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3});
        animatorSet.play(ofFloat4).after(ofFloat);
        animatorSet.setStartDelay((long) i);
        animatorSet.start();
        SnsMethodCalculate.markEndTimeMs("playOtherCardAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        SnsMethodCalculate.markStartTimeMs("onLayout", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
        super.onLayout(z, i, i2, i3, i4);
        int width = getWidth();
        int height = getHeight();
        if (width <= 0 || height <= 0) {
            SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
            return;
        }
        int b = C76577a.m92151b(this.f274439d, 16);
        int i5 = (width / 2) - (this.f274440e / 2);
        int height2 = getHeight() / 2;
        int i6 = this.f274441f;
        int i7 = height2 - (i6 / 2);
        int i8 = height2 + (i6 / 2);
        getChildAt(2).layout(i5, i7, this.f274440e + i5, i8);
        int i9 = i5 - (this.f274440e + b);
        getChildAt(1).layout(i9, i7, this.f274440e + i9, i8);
        int i15 = i5 - ((this.f274440e + b) * 2);
        getChildAt(0).layout(i15, i7, this.f274440e + i15, i8);
        int i16 = this.f274440e + b + i5;
        getChildAt(3).layout(i16, i7, this.f274440e + i16, i8);
        int i17 = i5 + ((b + this.f274440e) * 2);
        getChildAt(4).layout(i17, i7, this.f274440e + i17, i8);
        SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
    }

    public void setAnimCardView(View view) {
        SnsMethodCalculate.markStartTimeMs("setAnimCardView", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
        StringBuilder sb = new StringBuilder();
        sb.append("setAnimCardView, target=null?");
        sb.append(view == null);
        Log.m105924i("ShakeCardAnimView", sb.toString());
        this.f274443h = view;
        SnsMethodCalculate.markEndTimeMs("setAnimCardView", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
    }

    public void setOnCardAnimListener(ShakeCardAnimView.C94768c cVar) {
        SnsMethodCalculate.markStartTimeMs("setOnCardAnimListener", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
        this.f274447o = cVar;
        SnsMethodCalculate.markEndTimeMs("setOnCardAnimListener", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
    }

    public CardAnimView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo130563c(context);
    }
}
