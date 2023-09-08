package com.tencent.p014mm.plugin.sns.p104ad.widget.countdown;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import rq2.C101426m;
import rq2.C101432s;
import wq3.C111847h;
import xq2.C102715a;
import xq2.C102718c;
import xq2.C102719d;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout */
public class PromotionBarLayout extends RelativeLayout implements C102718c, C111847h {

    /* renamed from: d */
    public View f274364d;

    /* renamed from: e */
    public TextView f274365e;

    /* renamed from: f */
    public TextView f274366f;

    /* renamed from: g */
    public C102719d f274367g;

    /* renamed from: h */
    public C102715a f274368h;

    public PromotionBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo130506a(long j, C101426m.C101427a aVar) {
        SnsMethodCalculate.markStartTimeMs("onCountDownTimeChanged", "com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout");
        if (j <= 0) {
            try {
                setVisibility(8);
            } catch (Throwable unused) {
            }
        }
        View view = this.f274364d;
        if (view instanceof C102718c) {
            ((C102718c) view).mo130506a(j, aVar);
        }
        SnsMethodCalculate.markEndTimeMs("onCountDownTimeChanged", "com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout");
    }

    public C102719d getCountDownVM() {
        SnsMethodCalculate.markStartTimeMs("getCountDownVM", "com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout");
        C102719d dVar = this.f274367g;
        SnsMethodCalculate.markEndTimeMs("getCountDownVM", "com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout");
        return dVar;
    }

    public void onDetachedFromWindow() {
        SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout");
        super.onDetachedFromWindow();
        try {
            C102715a aVar = this.f274368h;
            if (aVar != null) {
                aVar.mo142514b(this.f274367g);
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout");
    }

    public void onFinishInflate() {
        SnsMethodCalculate.markStartTimeMs("onFinishInflate", "com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout");
        super.onFinishInflate();
        try {
            this.f274368h = new C102715a(this);
            this.f274364d = findViewById(C0966R.C0970id.f5560id);
            this.f274365e = (TextView) findViewById(C0966R.C0970id.f5561ie);
            this.f274366f = (TextView) findViewById(C0966R.C0970id.joq);
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("onFinishInflate", "com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout");
    }

    public void setPromotionalPrice(String str) {
        Typeface typeface;
        SnsMethodCalculate.markStartTimeMs("setPromotionalPrice", "com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout");
        if (this.f274365e != null && !TextUtils.isEmpty(str)) {
            this.f274365e.setText(str);
            TextView textView = this.f274365e;
            SnsMethodCalculate.markStartTimeMs("setViewWeChatSansTypeface", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
            if (textView != null) {
                try {
                    if (C101432s.f297082a == null) {
                        C101432s.f297082a = Typeface.createFromAsset(MMApplicationContext.getContext().getAssets(), "fonts/WeChatSansStd-Medium.ttf");
                    }
                    if (!(C101432s.f297082a == null || textView.getTypeface() == (typeface = C101432s.f297082a))) {
                        textView.setTypeface(typeface);
                    }
                } catch (Throwable unused) {
                }
            }
            SnsMethodCalculate.markEndTimeMs("setViewWeChatSansTypeface", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
        }
        SnsMethodCalculate.markEndTimeMs("setPromotionalPrice", "com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout");
    }

    public void setRightTitle(String str) {
        SnsMethodCalculate.markStartTimeMs("setRightTitle", "com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout");
        TextView textView = this.f274366f;
        if (textView != null) {
            textView.setText(str);
        }
        SnsMethodCalculate.markEndTimeMs("setRightTitle", "com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout");
    }

    public PromotionBarLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
