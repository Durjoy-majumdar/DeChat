package com.tencent.p014mm.plugin.ball.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013B#\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0015J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u0010\u0010\r\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n¨\u0006\u0016"}, mo182094d2 = {"Lcom/tencent/mm/plugin/ball/view/FloatBallButtonView;", "Landroid/widget/RelativeLayout;", "", "isLargeMode", "Lrx3/b0;", "setLargeMode", "", "color", "setPlayButtonColor", "setDeleteButtonColor", "Landroid/view/View$OnClickListener;", "clickListener", "setOnPlayButtonClickListener", "setOnDeleteButtonClickListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ball_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.ball.view.FloatBallButtonView */
public final class FloatBallButtonView extends RelativeLayout {

    /* renamed from: d */
    public WeImageView f311908d;

    /* renamed from: e */
    public WeImageView f311909e;

    /* renamed from: f */
    public boolean f311910f;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FloatBallButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    public final void setDeleteButtonColor(int i) {
        WeImageView weImageView = this.f311909e;
        if (weImageView != null) {
            weImageView.setIconColor(i);
        } else {
            C87412m.m108603p("mDeleteButton");
            throw null;
        }
    }

    public final void setLargeMode(boolean z) {
        if (this.f311910f != z) {
            this.f311910f = z;
            if (z) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = getResources().getDimensionPixelSize(C0966R.dimen.axb);
                setLayoutParams(layoutParams);
                WeImageView weImageView = this.f311908d;
                if (weImageView != null) {
                    int dimensionPixelSize = getResources().getDimensionPixelSize(C0966R.dimen.axd);
                    ViewGroup.LayoutParams layoutParams2 = weImageView.getLayoutParams();
                    layoutParams2.width = dimensionPixelSize;
                    layoutParams2.height = dimensionPixelSize;
                    weImageView.setLayoutParams(layoutParams2);
                    WeImageView weImageView2 = this.f311909e;
                    if (weImageView2 != null) {
                        int dimensionPixelSize2 = getResources().getDimensionPixelSize(C0966R.dimen.axd);
                        ViewGroup.LayoutParams layoutParams3 = weImageView2.getLayoutParams();
                        layoutParams3.width = dimensionPixelSize2;
                        layoutParams3.height = dimensionPixelSize2;
                        weImageView2.setLayoutParams(layoutParams3);
                        setBackgroundResource(C0966R.C0969drawable.f4500z8);
                        return;
                    }
                    C87412m.m108603p("mDeleteButton");
                    throw null;
                }
                C87412m.m108603p("mPlayButton");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams4 = getLayoutParams();
            getLayoutParams().height = getResources().getDimensionPixelSize(C0966R.dimen.axc);
            setLayoutParams(layoutParams4);
            WeImageView weImageView3 = this.f311908d;
            if (weImageView3 != null) {
                int dimensionPixelSize3 = getResources().getDimensionPixelSize(C0966R.dimen.axe);
                ViewGroup.LayoutParams layoutParams5 = weImageView3.getLayoutParams();
                layoutParams5.width = dimensionPixelSize3;
                layoutParams5.height = dimensionPixelSize3;
                weImageView3.setLayoutParams(layoutParams5);
                WeImageView weImageView4 = this.f311909e;
                if (weImageView4 != null) {
                    int dimensionPixelSize4 = getResources().getDimensionPixelSize(C0966R.dimen.axe);
                    ViewGroup.LayoutParams layoutParams6 = weImageView4.getLayoutParams();
                    layoutParams6.width = dimensionPixelSize4;
                    layoutParams6.height = dimensionPixelSize4;
                    weImageView4.setLayoutParams(layoutParams6);
                    setBackground((Drawable) null);
                    return;
                }
                C87412m.m108603p("mDeleteButton");
                throw null;
            }
            C87412m.m108603p("mPlayButton");
            throw null;
        }
    }

    public final void setOnDeleteButtonClickListener(View.OnClickListener onClickListener) {
        WeImageView weImageView = this.f311909e;
        if (weImageView != null) {
            weImageView.setOnClickListener(onClickListener);
        } else {
            C87412m.m108603p("mDeleteButton");
            throw null;
        }
    }

    public final void setOnPlayButtonClickListener(View.OnClickListener onClickListener) {
        WeImageView weImageView = this.f311908d;
        if (weImageView != null) {
            weImageView.setOnClickListener(onClickListener);
        } else {
            C87412m.m108603p("mPlayButton");
            throw null;
        }
    }

    public final void setPlayButtonColor(int i) {
        WeImageView weImageView = this.f311908d;
        if (weImageView != null) {
            weImageView.setIconColor(i);
        } else {
            C87412m.m108603p("mPlayButton");
            throw null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FloatBallButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        LayoutInflater.from(context).inflate(C0966R.C0971layout.d55, this, true);
        View findViewById = findViewById(C0966R.C0970id.hwy);
        C87412m.m108593f(findViewById, "findViewById(R.id.play_btn)");
        this.f311908d = (WeImageView) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.c0a);
        C87412m.m108593f(findViewById2, "findViewById(R.id.del_btn)");
        this.f311909e = (WeImageView) findViewById2;
    }
}
