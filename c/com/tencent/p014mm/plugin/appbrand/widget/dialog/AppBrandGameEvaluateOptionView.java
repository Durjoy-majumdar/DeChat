package com.tencent.p014mm.plugin.appbrand.widget.dialog;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import gc0.C20828a;
import gt0.C45955t;
import gt0.C45956u;
import gt0.C45957v;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import te3.C64280c93;
import te3.c85;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000fB'\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\u0010"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/widget/dialog/AppBrandGameEvaluateOptionView;", "Landroid/widget/FrameLayout;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", "v", "Lrx3/b0;", "onClick", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.widget.dialog.AppBrandGameEvaluateOptionView */
public final class AppBrandGameEvaluateOptionView extends FrameLayout implements View.OnClickListener {

    /* renamed from: d */
    public C64280c93 f158197d;

    /* renamed from: e */
    public C55565a f158198e;

    /* renamed from: f */
    public final MMHandler f158199f;

    /* renamed from: g */
    public final FrameLayout f158200g;

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.dialog.AppBrandGameEvaluateOptionView$a */
    public interface C55565a {
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.dialog.AppBrandGameEvaluateOptionView$b */
    public static final class C55566b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ AppBrandGameEvaluateOptionView f158201d;

        public C55566b(AppBrandGameEvaluateOptionView appBrandGameEvaluateOptionView) {
            this.f158201d = appBrandGameEvaluateOptionView;
        }

        public final void run() {
            AppBrandGameEvaluateOptionView appBrandGameEvaluateOptionView = this.f158201d;
            C55565a aVar = appBrandGameEvaluateOptionView.f158198e;
            if (aVar != null) {
                C64280c93 c932 = appBrandGameEvaluateOptionView.f158197d;
                if (c932 != null) {
                    C55568b bVar = (C55568b) aVar;
                    bVar.f158202a.setVisibility(4);
                    bVar.f158203b.setVisibility(8);
                    bVar.f158204c.setVisibility(4);
                    View findViewById = bVar.f158205d.findViewById(C0966R.C0970id.hnj);
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar2.mo10233c(8);
                    View view = findViewById;
                    C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandEvaluateDialogHelper$9", "onOptionChoose", "(Lcom/tencent/mm/protocal/protobuf/OptionItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandEvaluateDialogHelper$9", "onOptionChoose", "(Lcom/tencent/mm/protocal/protobuf/OptionItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    C84926a aVar3 = bVar.f158209h;
                    AppBrandRuntimeWC appBrandRuntimeWC = bVar.f158206e;
                    LinearLayout linearLayout = bVar.f158205d;
                    Runnable runnable = bVar.f158207f;
                    c85 c85 = bVar.f158208g;
                    if (!aVar3.f247545p) {
                        View findViewById2 = linearLayout.findViewById(C0966R.C0970id.jyu);
                        C9556a aVar4 = new C9556a();
                        aVar4.mo10233c(0);
                        View view2 = findViewById2;
                        C117292a.m165358d(view2, aVar4.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandEvaluateDialogHelper", "animateShowThanksViewAndSubmit", "(Lcom/tencent/mm/plugin/appbrand/AppBrandRuntimeWC;Landroid/widget/LinearLayout;Lcom/tencent/mm/protocal/protobuf/OptionItem;Ljava/lang/Runnable;Lcom/tencent/mm/protocal/protobuf/WxagGameOriginalReviewConfig;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById2.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandEvaluateDialogHelper", "animateShowThanksViewAndSubmit", "(Lcom/tencent/mm/plugin/appbrand/AppBrandRuntimeWC;Landroid/widget/LinearLayout;Lcom/tencent/mm/protocal/protobuf/OptionItem;Ljava/lang/Runnable;Lcom/tencent/mm/protocal/protobuf/WxagGameOriginalReviewConfig;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        ImageView imageView = (ImageView) linearLayout.findViewById(C0966R.C0970id.kjf);
                        imageView.setAlpha(0.0f);
                        imageView.setScaleX(0.48076922f);
                        imageView.setScaleY(0.48076922f);
                        imageView.setRotation(24.0f);
                        imageView.setVisibility(0);
                        TextView textView = (TextView) linearLayout.findViewById(C0966R.C0970id.kjg);
                        textView.setText(c85.f182434g);
                        textView.setAlpha(0.0f);
                        textView.setVisibility(0);
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                        ofFloat.setDuration(300);
                        ofFloat.addUpdateListener(new C45955t(aVar3, imageView, textView));
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.48076922f, 1.0f});
                        ofFloat2.setDuration(300);
                        ofFloat2.addUpdateListener(new C45956u(aVar3, imageView));
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(imageView, "rotation", new float[]{24.0f, 0.0f});
                        ofFloat3.setDuration(1300);
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3});
                        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
                        animatorSet.addListener(new C45957v(aVar3, runnable));
                        animatorSet.start();
                        aVar3.mo117760g(appBrandRuntimeWC, false, c932, c85);
                        return;
                    }
                    return;
                }
                C87412m.m108603p("optionConfig");
                throw null;
            }
            C87412m.m108603p("optionChooseCallback");
            throw null;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AppBrandGameEvaluateOptionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: a */
    public final void mo77089a(int i, c85 c85, C55565a aVar) {
        C87412m.m108594g(c85, "config");
        C87412m.m108594g(aVar, "callback");
        this.f158198e = aVar;
        C64280c93 c932 = c85.f182433f.get(i);
        C87412m.m108593f(c932, "config.OptionList[index]");
        this.f158197d = c932;
        TextView textView = (TextView) this.f158200g.findViewById(C0966R.C0970id.khj);
        C64280c93 c933 = this.f158197d;
        if (c933 != null) {
            textView.setText(c933.f182454f);
            C20828a b = C20828a.m22825b();
            C64280c93 c934 = this.f158197d;
            if (c934 != null) {
                b.mo32518g(c934.f182453e, (ImageView) this.f158200g.findViewById(C0966R.C0970id.f39));
            } else {
                C87412m.m108603p("optionConfig");
                throw null;
            }
        } else {
            C87412m.m108603p("optionConfig");
            throw null;
        }
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandGameEvaluateOptionView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f158200g.setBackgroundResource(C0966R.color.Brand_Alpha_0_1);
        ((TextView) this.f158200g.findViewById(C0966R.C0970id.khj)).setTextColor(C76577a.m92153d(getContext(), C0966R.color.f2939n));
        this.f158199f.postDelayed(new C55566b(this), 100);
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandGameEvaluateOptionView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBrandGameEvaluateOptionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f158199f = new MMHandler(Looper.getMainLooper());
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.f6407e0, this, false);
        C87412m.m108592e(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
        FrameLayout frameLayout = (FrameLayout) inflate;
        this.f158200g = frameLayout;
        addView(frameLayout);
        frameLayout.setOnClickListener(this);
    }
}
