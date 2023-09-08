package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import bt0.C79815i;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.widget.CircleProgressDrawable;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.u4 */
public final class C84682u4 extends LinearLayout implements C79815i {

    /* renamed from: d */
    public View.OnClickListener f247042d;

    /* renamed from: e */
    public int f247043e = -16777216;

    /* renamed from: f */
    public final int f247044f;

    /* renamed from: g */
    public final ImageView f247045g;

    /* renamed from: h */
    public final TextView f247046h;

    /* renamed from: i */
    public final ProgressBar f247047i;

    /* renamed from: j */
    public final CircleProgressDrawable f247048j;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.u4$a */
    public static final class C84683a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C84682u4 f247049d;

        public C84683a(C84682u4 u4Var) {
            this.f247049d = u4Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/SimplifiedActionBarForPluginSplash$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            View.OnClickListener onClickListener = this.f247049d.f247042d;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/SimplifiedActionBarForPluginSplash$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84682u4(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0966R.dimen.f3679b9);
        this.f247044f = dimensionPixelSize;
        setOrientation(0);
        setGravity(16);
        setLayoutParams(new ViewGroup.LayoutParams(-1, dimensionPixelSize));
        ImageView imageView = new ImageView(context);
        imageView.setPadding(context.getResources().getDimensionPixelSize(C0966R.dimen.f3956le), 0, context.getResources().getDimensionPixelSize(C0966R.dimen.f3956le), 0);
        imageView.setBackgroundResource(C0966R.C0969drawable.f4391b9);
        imageView.setImageResource(C0966R.C0969drawable.bsw);
        imageView.setId(C0966R.C0970id.f5455fl);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        imageView.setOnClickListener(new C84683a(this));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        frameLayout.setMinimumWidth(context.getResources().getDimensionPixelSize(C0966R.dimen.f4063q_));
        frameLayout.addView(imageView);
        addView(frameLayout);
        this.f247045g = imageView;
        TextView textView = new TextView(context);
        textView.setTextSize(0, (float) context.getResources().getDimensionPixelSize(C0966R.dimen.f3619c));
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        textView.setGravity(16);
        textView.setId(C0966R.C0970id.f5468fy);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        addView(textView);
        this.f247046h = textView;
        CircleProgressDrawable circleProgressDrawable = new CircleProgressDrawable(context);
        this.f247048j = circleProgressDrawable;
        ProgressBar progressBar = new ProgressBar(new ContextThemeWrapper(context, C0966R.style.f361689a61));
        int b = C76577a.m92151b(context, 3);
        progressBar.setPadding(b, b, b, b);
        progressBar.setId(C0966R.C0970id.f5452fi);
        int b2 = C76577a.m92151b(context, 24);
        progressBar.setLayoutParams(new ViewGroup.LayoutParams(b2, b2));
        progressBar.setIndeterminateDrawable(circleProgressDrawable);
        addView(progressBar);
        this.f247047i = progressBar;
    }

    /* renamed from: d */
    public void mo109614d(boolean z) {
    }

    public View getActionView() {
        return this;
    }

    public double getBackgroundAlpha() {
        return 1.0d;
    }

    public int getBackgroundColor() {
        Drawable background = getBackground();
        ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
        if (colorDrawable != null) {
            return colorDrawable.getColor();
        }
        return 0;
    }

    public View getCapsuleView() {
        return null;
    }

    public int getForegroundColor() {
        return this.f247043e;
    }

    public CharSequence getMainTitle() {
        return this.f247046h.getText();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f247047i.getVisibility() == 0) {
            this.f247048j.mo148693c();
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f247048j.mo148694d();
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.f247044f, 1073741824));
    }

    public void setBackButtonClickListener(View.OnClickListener onClickListener) {
        this.f247042d = onClickListener;
    }

    public void setBackgroundAlpha(double d) {
    }

    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        if (i != 0) {
            setWillNotDraw(false);
        } else {
            setWillNotDraw(true);
        }
    }

    public void setCloseButtonClickListener(View.OnClickListener onClickListener) {
        this.f247042d = onClickListener;
    }

    public void setForegroundColor(int i) {
        this.f247043e = i;
        this.f247045g.setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
        this.f247046h.setTextColor(this.f247043e);
        CircleProgressDrawable circleProgressDrawable = this.f247048j;
        circleProgressDrawable.f311310e = this.f247043e;
        circleProgressDrawable.invalidateSelf();
        this.f247047i.setIndeterminateDrawable(this.f247048j);
    }

    public void setForegroundStyle(String str) {
        C87412m.m108594g(str, "style");
        setForegroundColor(C79815i.C79816a.m96974a(str).f233934d);
    }

    public void setLoadingIconVisibility(boolean z) {
        if (z) {
            this.f247047i.setVisibility(0);
            this.f247048j.mo148692a();
            if (isAttachedToWindow()) {
                this.f247048j.mo148693c();
                return;
            }
            return;
        }
        this.f247047i.setVisibility(8);
        this.f247048j.mo148694d();
    }

    public void setMainTitle(CharSequence charSequence) {
        this.f247046h.setText(charSequence);
    }

    public void setNavHidden(boolean z) {
        this.f247045g.setVisibility(!z ? 0 : 8);
    }

    public void setOptionButtonClickListener(View.OnClickListener onClickListener) {
        C87412m.m108594g(onClickListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
    }
}
