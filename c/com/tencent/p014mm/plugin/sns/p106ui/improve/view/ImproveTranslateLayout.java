package com.tencent.p014mm.plugin.sns.p106ui.improve.view;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.tools.C74863w0;
import com.tencent.p014mm.plugin.sns.model.C94965w1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.x2c.X2CLinearLayout;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import p206nj.C11171e;
import p629ny.C76979h;
import rx3.C13601g;
import rx3.C36568h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bB\u001d\b\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001a\u0010\u001eB%\b\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b\u001a\u0010!J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&R\u001b\u0010\t\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\f\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001b\u0010\u0011\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\u0010R(\u0010\u0017\u001a\u0004\u0018\u00010\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@BX\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/ui/improve/view/ImproveTranslateLayout;", "Lcom/tencent/mm/view/x2c/X2CLinearLayout;", "Landroid/view/View;", "getContentView", "Landroid/widget/TextView;", "d", "Lrx3/g;", "getBrandWordingTv", "()Landroid/widget/TextView;", "brandWordingTv", "e", "getResultTv", "resultTv", "Landroid/graphics/drawable/Drawable;", "f", "getLoadingDrawable", "()Landroid/graphics/drawable/Drawable;", "loadingDrawable", "<set-?>", "g", "Landroid/view/View;", "getTranslateLayout", "()Landroid/view/View;", "translateLayout", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout */
public abstract class ImproveTranslateLayout extends X2CLinearLayout {

    /* renamed from: i */
    public static final int f116675i = Color.parseColor("#19000000");

    /* renamed from: d */
    public final C13601g f116676d = C36568h.m40985a(new C43116b(this));

    /* renamed from: e */
    public final C13601g f116677e = C36568h.m40985a(new C43119e(this));

    /* renamed from: f */
    public final C13601g f116678f = C36568h.m40985a(new C43118d(this));

    /* renamed from: g */
    public View f116679g;

    /* renamed from: h */
    public boolean f116680h;

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout$a */
    public static final class C43115a implements View.OnTouchListener {

        /* renamed from: d */
        public static final C43115a f116681d = new C43115a();

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/improve/view/ImproveTranslateLayout$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout$2");
            if (motionEvent.getAction() == 0) {
                view.setTag(C0966R.C0970id.f359414kt0, new int[]{(int) motionEvent.getRawX(), (int) motionEvent.getRawY()});
            }
            SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout$2");
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/sns/ui/improve/view/ImproveTranslateLayout$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout$b */
    public static final class C43116b extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ ImproveTranslateLayout f116682d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43116b(ImproveTranslateLayout improveTranslateLayout) {
            super(0);
            this.f116682d = improveTranslateLayout;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout$brandWordingTv$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout$brandWordingTv$2");
            TextView textView = (TextView) this.f116682d.findViewById(C0966R.C0970id.jws);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout$brandWordingTv$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout$brandWordingTv$2");
            return textView;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout$c */
    public static final class C43117c implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ C94965w1.C94967b f116683d;

        public C43117c(C94965w1.C94967b bVar) {
            this.f116683d = bVar;
        }

        public void onAnimationCancel(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout$finishTranslate$1");
            C87412m.m108594g(animator, "animation");
            SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout$finishTranslate$1");
        }

        public void onAnimationEnd(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout$finishTranslate$1");
            C87412m.m108594g(animator, "animation");
            C94965w1.C94967b bVar = this.f116683d;
            if (bVar != null) {
                C94965w1.m120634o(bVar);
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout$finishTranslate$1");
        }

        public void onAnimationRepeat(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout$finishTranslate$1");
            C87412m.m108594g(animator, "animation");
            SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout$finishTranslate$1");
        }

        public void onAnimationStart(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout$finishTranslate$1");
            C87412m.m108594g(animator, "animation");
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout$finishTranslate$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout$d */
    public static final class C43118d extends C87413o implements C32224a<Drawable> {

        /* renamed from: d */
        public final /* synthetic */ ImproveTranslateLayout f116684d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43118d(ImproveTranslateLayout improveTranslateLayout) {
            super(0);
            this.f116684d = improveTranslateLayout;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout$loadingDrawable$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout$loadingDrawable$2");
            Drawable drawable = this.f116684d.getResources().getDrawable(C0966R.C0969drawable.blz);
            drawable.setBounds(0, 0, (int) (ImproveTranslateLayout.m46722a(this.f116684d).getTextSize() * 0.8f), (int) (ImproveTranslateLayout.m46722a(this.f116684d).getTextSize() * 0.8f));
            SnsMethodCalculate.markStartTimeMs("access$getLOADING_DRAWABLE_FILTER_COLOR$cp", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
            int i = ImproveTranslateLayout.f116675i;
            SnsMethodCalculate.markEndTimeMs("access$getLOADING_DRAWABLE_FILTER_COLOR$cp", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
            drawable.setColorFilter(i, PorterDuff.Mode.SRC_IN);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout$loadingDrawable$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout$loadingDrawable$2");
            return drawable;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout$e */
    public static final class C43119e extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ ImproveTranslateLayout f116685d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43119e(ImproveTranslateLayout improveTranslateLayout) {
            super(0);
            this.f116685d = improveTranslateLayout;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout$resultTv$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout$resultTv$2");
            TextView textView = (TextView) this.f116685d.findViewById(C0966R.C0970id.jwt);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout$resultTv$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout$resultTv$2");
            return textView;
        }
    }

    public ImproveTranslateLayout(Context context) {
        super(context);
        setOrientation(1);
        View contentView = getContentView();
        if (contentView != null) {
            addView(contentView, new LinearLayout.LayoutParams(-1, -2));
        }
        setOnTouchListener(C43115a.f116681d);
    }

    /* renamed from: a */
    public static final /* synthetic */ TextView m46722a(ImproveTranslateLayout improveTranslateLayout) {
        SnsMethodCalculate.markStartTimeMs("access$getResultTv", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        TextView resultTv = improveTranslateLayout.getResultTv();
        SnsMethodCalculate.markEndTimeMs("access$getResultTv", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        return resultTv;
    }

    private final TextView getBrandWordingTv() {
        SnsMethodCalculate.markStartTimeMs("getBrandWordingTv", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        Object value = this.f116676d.getValue();
        C87412m.m108593f(value, "<get-brandWordingTv>(...)");
        TextView textView = (TextView) value;
        SnsMethodCalculate.markEndTimeMs("getBrandWordingTv", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        return textView;
    }

    private final Drawable getLoadingDrawable() {
        SnsMethodCalculate.markStartTimeMs("getLoadingDrawable", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        Object value = this.f116678f.getValue();
        C87412m.m108593f(value, "<get-loadingDrawable>(...)");
        Drawable drawable = (Drawable) value;
        SnsMethodCalculate.markEndTimeMs("getLoadingDrawable", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        return drawable;
    }

    private final TextView getResultTv() {
        SnsMethodCalculate.markStartTimeMs("getResultTv", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        Object value = this.f116677e.getValue();
        C87412m.m108593f(value, "<get-resultTv>(...)");
        TextView textView = (TextView) value;
        SnsMethodCalculate.markEndTimeMs("getResultTv", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        return textView;
    }

    /* renamed from: b */
    public void mo67331b(C94965w1.C94967b bVar, int i, String str, String str2, boolean z) {
        SnsMethodCalculate.markStartTimeMs("finishTranslate", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        mo67335i();
        SnsMethodCalculate.markStartTimeMs("updateTranslateResultSizeAndColor", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        getResultTv().setTextSize(1, ((float) 15) * C76577a.m92165p(getContext()));
        if (i == 1) {
            getResultTv().setTextColor(C76577a.m92153d(getContext(), C0966R.color.adt));
            getResultTv().setBackground(C76577a.m92158i(getContext(), C0966R.C0969drawable.atx));
        } else if (i == 2) {
            getResultTv().setTextColor(C76577a.m92153d(getContext(), C0966R.color.adr));
        }
        SnsMethodCalculate.markEndTimeMs("updateTranslateResultSizeAndColor", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        if (!Util.isNullOrNil(str)) {
            getResultTv().setText(str);
            ((C76979h) C86312j.m106911c(C76979h.class)).mo107079pD(getResultTv(), 2);
        } else {
            getResultTv().setText(C0966R.string.jji);
        }
        getResultTv().setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        if (z && C11171e.m11046c(11)) {
            C74863w0.m89621b(getResultTv(), new C43117c(bVar));
        }
        if (!Util.isNullOrNil(str2)) {
            getBrandWordingTv().setText(str2);
        } else {
            getBrandWordingTv().setText(C0966R.string.bc8);
        }
        getBrandWordingTv().setVisibility(0);
        SnsMethodCalculate.markEndTimeMs("finishTranslate", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
    }

    /* renamed from: e */
    public final void mo67332e() {
        SnsMethodCalculate.markStartTimeMs("hideTranslate", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        View view = this.f116679g;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/improve/view/ImproveTranslateLayout", "hideTranslate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/improve/view/ImproveTranslateLayout", "hideTranslate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        SnsMethodCalculate.markEndTimeMs("hideTranslate", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
    }

    public abstract View getContentView();

    public final View getTranslateLayout() {
        SnsMethodCalculate.markStartTimeMs("getTranslateLayout", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        View view = this.f116679g;
        SnsMethodCalculate.markEndTimeMs("getTranslateLayout", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        return view;
    }

    /* renamed from: i */
    public final void mo67335i() {
        SnsMethodCalculate.markStartTimeMs("setupTranslateView", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        View view = this.f116679g;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/improve/view/ImproveTranslateLayout", "setupTranslateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/improve/view/ImproveTranslateLayout", "setupTranslateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (this.f116680h) {
            SnsMethodCalculate.markEndTimeMs("setupTranslateView", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
            return;
        }
        this.f116680h = true;
        View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.d_a, this, false);
        this.f116679g = inflate;
        addView(inflate);
        SnsMethodCalculate.markEndTimeMs("setupTranslateView", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
    }

    /* renamed from: j */
    public final void mo67336j() {
        SnsMethodCalculate.markStartTimeMs("startTranslate", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        mo67335i();
        getResultTv().setCompoundDrawables(getLoadingDrawable(), (Drawable) null, (Drawable) null, (Drawable) null);
        getResultTv().setCompoundDrawablePadding(C76577a.m92151b(getContext(), 3));
        getResultTv().setText(C0966R.string.jjk);
        C74863w0.m89621b(getResultTv(), (Animator.AnimatorListener) null);
        getBrandWordingTv().setVisibility(4);
        getResultTv().setTextSize(0, getBrandWordingTv().getTextSize());
        getResultTv().setTextColor(getContext().getResources().getColor(C0966R.color.ads));
        SnsMethodCalculate.markEndTimeMs("startTranslate", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
    }

    public ImproveTranslateLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
        View contentView = getContentView();
        if (contentView != null) {
            addView(contentView, new LinearLayout.LayoutParams(-1, -2));
        }
        setOnTouchListener(C43115a.f116681d);
    }

    public ImproveTranslateLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        View contentView = getContentView();
        if (contentView != null) {
            addView(contentView, new LinearLayout.LayoutParams(-1, -2));
        }
        setOnTouchListener(C43115a.f116681d);
    }
}
