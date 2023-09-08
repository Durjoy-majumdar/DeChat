package com.tencent.p014mm.plugin.scanner.p101ui.component;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;
import vl2.C111557w;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B#\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¨\u0006\u0014"}, mo182094d2 = {"Lcom/tencent/mm/plugin/scanner/ui/component/ScanUITopOpButtonComponent;", "Landroid/widget/RelativeLayout;", "Landroid/view/View$OnClickListener;", "onClickListener", "Lrx3/b0;", "setOnCloseClickListener", "setOnCancelClickListener", "setOnMoreClickListener", "", "show", "setShowMoreButton", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-scan_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.scanner.ui.component.ScanUITopOpButtonComponent */
public final class ScanUITopOpButtonComponent extends RelativeLayout {

    /* renamed from: d */
    public View f315883d;

    /* renamed from: e */
    public ImageView f315884e;

    /* renamed from: f */
    public TextView f315885f;

    /* renamed from: g */
    public ImageView f315886g;

    /* renamed from: com.tencent.mm.plugin.scanner.ui.component.ScanUITopOpButtonComponent$a */
    public static final class C106095a extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ ScanUITopOpButtonComponent f315887d;

        /* renamed from: e */
        public final /* synthetic */ Animator.AnimatorListener f315888e;

        public C106095a(ScanUITopOpButtonComponent scanUITopOpButtonComponent, Animator.AnimatorListener animatorListener) {
            this.f315887d = scanUITopOpButtonComponent;
            this.f315888e = animatorListener;
        }

        public void onAnimationEnd(Animator animator) {
            C87412m.m108594g(animator, "animation");
            TextView textView = this.f315887d.f315885f;
            if (textView != null) {
                textView.setAlpha(0.0f);
                TextView textView2 = this.f315887d.f315885f;
                if (textView2 != null) {
                    C111557w.m152066b(textView2, true, (Animator.AnimatorListener) null);
                    Animator.AnimatorListener animatorListener = this.f315888e;
                    if (animatorListener != null) {
                        animatorListener.onAnimationEnd(animator);
                        return;
                    }
                    return;
                }
                C87412m.m108603p("cancelButton");
                throw null;
            }
            C87412m.m108603p("cancelButton");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.component.ScanUITopOpButtonComponent$b */
    public static final class C106096b extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ ScanUITopOpButtonComponent f315889d;

        /* renamed from: e */
        public final /* synthetic */ Animator.AnimatorListener f315890e;

        public C106096b(ScanUITopOpButtonComponent scanUITopOpButtonComponent, Animator.AnimatorListener animatorListener) {
            this.f315889d = scanUITopOpButtonComponent;
            this.f315890e = animatorListener;
        }

        public void onAnimationEnd(Animator animator) {
            C87412m.m108594g(animator, "animation");
            ImageView imageView = this.f315889d.f315884e;
            if (imageView != null) {
                C111557w.m152066b(imageView, true, (Animator.AnimatorListener) null);
                Animator.AnimatorListener animatorListener = this.f315890e;
                if (animatorListener != null) {
                    animatorListener.onAnimationEnd(animator);
                    return;
                }
                return;
            }
            C87412m.m108603p("closeButton");
            throw null;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ScanUITopOpButtonComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: a */
    public final void mo151659a(boolean z) {
        ImageView imageView = this.f315886g;
        if (imageView != null) {
            C111557w.m152066b(imageView, z, (Animator.AnimatorListener) null);
        } else {
            C87412m.m108603p("moreButton");
            throw null;
        }
    }

    /* renamed from: b */
    public final void mo151660b(boolean z, Animator.AnimatorListener animatorListener) {
        Log.m105927v("MicroMsg.ScanUITopButtonComponent", "alvinluo switchCloseView showCancelButton: %b", Boolean.valueOf(z));
        if (z) {
            ImageView imageView = this.f315884e;
            if (imageView != null) {
                C111557w.m152066b(imageView, false, new C106095a(this, animatorListener));
            } else {
                C87412m.m108603p("closeButton");
                throw null;
            }
        } else {
            TextView textView = this.f315885f;
            if (textView != null) {
                C111557w.m152066b(textView, false, new C106096b(this, animatorListener));
            } else {
                C87412m.m108603p("cancelButton");
                throw null;
            }
        }
    }

    public final void setOnCancelClickListener(View.OnClickListener onClickListener) {
        C87412m.m108594g(onClickListener, "onClickListener");
        TextView textView = this.f315885f;
        if (textView != null) {
            textView.setOnClickListener(onClickListener);
        } else {
            C87412m.m108603p("cancelButton");
            throw null;
        }
    }

    public final void setOnCloseClickListener(View.OnClickListener onClickListener) {
        C87412m.m108594g(onClickListener, "onClickListener");
        ImageView imageView = this.f315884e;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        } else {
            C87412m.m108603p("closeButton");
            throw null;
        }
    }

    public final void setOnMoreClickListener(View.OnClickListener onClickListener) {
        C87412m.m108594g(onClickListener, "onClickListener");
        ImageView imageView = this.f315886g;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        } else {
            C87412m.m108603p("moreButton");
            throw null;
        }
    }

    public final void setShowMoreButton(boolean z) {
        ImageView imageView = this.f315886g;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        } else {
            C87412m.m108603p("moreButton");
            throw null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScanUITopOpButtonComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.f359848b50, this);
        View findViewById = inflate.findViewById(C0966R.C0970id.kr8);
        C87412m.m108593f(findViewById, "view.findViewById(R.id.top_button_container)");
        this.f315883d = findViewById;
        View findViewById2 = inflate.findViewById(C0966R.C0970id.bee);
        C87412m.m108593f(findViewById2, "view.findViewById(R.id.close_button)");
        this.f315884e = (ImageView) findViewById2;
        View findViewById3 = inflate.findViewById(C0966R.C0970id.apz);
        C87412m.m108593f(findViewById3, "view.findViewById(R.id.cancel_button)");
        this.f315885f = (TextView) findViewById3;
        View findViewById4 = inflate.findViewById(C0966R.C0970id.gz9);
        C87412m.m108593f(findViewById4, "view.findViewById(R.id.more_button)");
        this.f315886g = (ImageView) findViewById4;
    }
}
