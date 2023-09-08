package bt0;

import aj0.C79582a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.widget.AppBrandActionBarCustomImageView;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import gy3.C87412m;
import p192l4.C10462b;

/* renamed from: bt0.g */
public final class C79813g extends RelativeLayout implements C79815i {

    /* renamed from: d */
    public int f233927d;

    /* renamed from: e */
    public double f233928e = 1.0d;

    /* renamed from: f */
    public C79582a f233929f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C79813g(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.f6379d9, this, false);
        int i = C0966R.C0970id.f5453fj;
        LinearLayout linearLayout = (LinearLayout) C10462b.m10395a(inflate, C0966R.C0970id.f5453fj);
        if (linearLayout != null) {
            i = C0966R.C0970id.jm4;
            ImageView imageView = (ImageView) C10462b.m10395a(inflate, C0966R.C0970id.jm4);
            if (imageView != null) {
                i = C0966R.C0970id.jm5;
                LinearLayout linearLayout2 = (LinearLayout) C10462b.m10395a(inflate, C0966R.C0970id.jm5);
                if (linearLayout2 != null) {
                    i = C0966R.C0970id.jm6;
                    LinearLayout linearLayout3 = (LinearLayout) C10462b.m10395a(inflate, C0966R.C0970id.jm6);
                    if (linearLayout3 != null) {
                        i = C0966R.C0970id.jm7;
                        TextView textView = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.jm7);
                        if (textView != null) {
                            i = C0966R.C0970id.jm8;
                            AppBrandActionBarCustomImageView appBrandActionBarCustomImageView = (AppBrandActionBarCustomImageView) C10462b.m10395a(inflate, C0966R.C0970id.jm8);
                            if (appBrandActionBarCustomImageView != null) {
                                i = C0966R.C0970id.jm9;
                                LinearLayout linearLayout4 = (LinearLayout) C10462b.m10395a(inflate, C0966R.C0970id.jm9);
                                if (linearLayout4 != null) {
                                    LinearLayout linearLayout5 = (LinearLayout) inflate;
                                    LinearLayout linearLayout6 = (LinearLayout) C10462b.m10395a(inflate, C0966R.C0970id.jma);
                                    if (linearLayout6 != null) {
                                        TextView textView2 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.jmb);
                                        if (textView2 != null) {
                                            TextView textView3 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.jmc);
                                            if (textView3 != null) {
                                                this.f233929f = new C79582a(linearLayout5, linearLayout, imageView, linearLayout2, linearLayout3, textView, appBrandActionBarCustomImageView, linearLayout4, linearLayout5, linearLayout6, textView2, textView3);
                                                addView(linearLayout5);
                                                return;
                                            }
                                            i = C0966R.C0970id.jmc;
                                        } else {
                                            i = C0966R.C0970id.jmb;
                                        }
                                    } else {
                                        i = C0966R.C0970id.jma;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public void mo109614d(boolean z) {
    }

    public View getActionView() {
        return this;
    }

    public double getBackgroundAlpha() {
        return this.f233928e;
    }

    public int getBackgroundColor() {
        return this.f233927d;
    }

    public View getCapsuleView() {
        return null;
    }

    public int getForegroundColor() {
        return this.f233929f.f233368i.getCurrentTextColor();
    }

    public CharSequence getMainTitle() {
        CharSequence text = this.f233929f.f233368i.getText();
        C87412m.m108593f(text, "uiBinding.singlePageModeActionBarTitleTv.text");
        return text;
    }

    public final TextView getSecurityTipsTextView() {
        TextView textView = this.f233929f.f233367h;
        C87412m.m108593f(textView, "uiBinding.singlePageModeActionBarSecurityTipsTv");
        return textView;
    }

    public void setBackButtonClickListener(View.OnClickListener onClickListener) {
    }

    public void setBackgroundAlpha(double d) {
        this.f233928e = d;
        Drawable background = getBackground();
        if (background == null) {
            super.setBackgroundColor(this.f233927d);
            background = getBackground();
        }
        C87412m.m108591d(background);
        background.setAlpha((int) (((double) 255) * d));
    }

    public void setBackgroundColor(int i) {
        this.f233927d = i;
        super.setBackgroundColor(i);
        setBackgroundAlpha(this.f233928e);
    }

    public void setCloseButtonClickListener(View.OnClickListener onClickListener) {
        this.f233929f.f233360a.setOnClickListener(onClickListener);
    }

    public void setForegroundColor(int i) {
        this.f233929f.f233368i.setTextColor(i);
    }

    public void setForegroundStyle(String str) {
    }

    public final void setForwardOnClickListener(View.OnClickListener onClickListener) {
        this.f233929f.f233362c.setOnClickListener(onClickListener);
    }

    public final void setForwardText(String str) {
        C87412m.m108594g(str, "forwardText");
        this.f233929f.f233363d.setText(str);
    }

    public void setLoadingIconVisibility(boolean z) {
    }

    public void setMainTitle(CharSequence charSequence) {
        this.f233929f.f233368i.setText(charSequence);
    }

    public void setNavHidden(boolean z) {
    }

    public void setOptionButtonClickListener(View.OnClickListener onClickListener) {
        this.f233929f.f233364e.setOnClickListener(onClickListener);
    }

    public final void setSecurityTipsTitle(String str) {
        C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        this.f233929f.f233367h.setText(str);
    }

    public final void setSecurityTipsTitleColor(int i) {
        this.f233929f.f233367h.setTextColor(i);
    }
}
