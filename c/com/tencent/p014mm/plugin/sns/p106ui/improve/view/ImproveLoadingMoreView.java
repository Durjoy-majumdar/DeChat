package com.tencent.p014mm.plugin.sns.p106ui.improve.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import rx3.C13601g;
import rx3.C36568h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B%\b\u0016\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0013R\u001b\u0010\u0007\u001a\u00020\u00028BX\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\n\u001a\u00020\u00028BX\u0002¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006¨\u0006\u0014"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/ui/improve/view/ImproveLoadingMoreView;", "Landroid/widget/LinearLayout;", "Landroid/view/View;", "d", "Lrx3/g;", "getLoadLayout", "()Landroid/view/View;", "loadLayout", "e", "getEndLineLayout", "endLineLayout", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.improve.view.ImproveLoadingMoreView */
public final class ImproveLoadingMoreView extends LinearLayout {

    /* renamed from: d */
    public final C13601g f206188d = C36568h.m40985a(new C71246b(this));

    /* renamed from: e */
    public final C13601g f206189e = C36568h.m40985a(new C71245a(this));

    /* renamed from: f */
    public ImageView f206190f;

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.view.ImproveLoadingMoreView$a */
    public static final class C71245a extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ ImproveLoadingMoreView f206191d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71245a(ImproveLoadingMoreView improveLoadingMoreView) {
            super(0);
            this.f206191d = improveLoadingMoreView;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveLoadingMoreView$endLineLayout$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveLoadingMoreView$endLineLayout$2");
            View findViewById = this.f206191d.findViewById(C0966R.C0970id.f358451of0);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveLoadingMoreView$endLineLayout$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveLoadingMoreView$endLineLayout$2");
            return findViewById;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.view.ImproveLoadingMoreView$b */
    public static final class C71246b extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ ImproveLoadingMoreView f206192d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71246b(ImproveLoadingMoreView improveLoadingMoreView) {
            super(0);
            this.f206192d = improveLoadingMoreView;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveLoadingMoreView$loadLayout$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveLoadingMoreView$loadLayout$2");
            View findViewById = this.f206192d.findViewById(C0966R.C0970id.g3g);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveLoadingMoreView$loadLayout$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveLoadingMoreView$loadLayout$2");
            return findViewById;
        }
    }

    public ImproveLoadingMoreView(Context context) {
        super(context);
        C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.d_u, this, true);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f206190f = (ImageView) findViewById(C0966R.C0970id.f5740nb);
    }

    private final View getEndLineLayout() {
        SnsMethodCalculate.markStartTimeMs("getEndLineLayout", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveLoadingMoreView");
        Object value = this.f206189e.getValue();
        C87412m.m108593f(value, "<get-endLineLayout>(...)");
        View view = (View) value;
        SnsMethodCalculate.markEndTimeMs("getEndLineLayout", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveLoadingMoreView");
        return view;
    }

    private final View getLoadLayout() {
        SnsMethodCalculate.markStartTimeMs("getLoadLayout", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveLoadingMoreView");
        Object value = this.f206188d.getValue();
        C87412m.m108593f(value, "<get-loadLayout>(...)");
        View view = (View) value;
        SnsMethodCalculate.markEndTimeMs("getLoadLayout", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveLoadingMoreView");
        return view;
    }

    /* renamed from: a */
    public final void mo97999a() {
        SnsMethodCalculate.markStartTimeMs("showEndLine", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveLoadingMoreView");
        View loadLayout = getLoadLayout();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(4);
        C117292a.m165358d(loadLayout, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/improve/view/ImproveLoadingMoreView", "showEndLine", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        loadLayout.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(loadLayout, "com/tencent/mm/plugin/sns/ui/improve/view/ImproveLoadingMoreView", "showEndLine", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View endLineLayout = getEndLineLayout();
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(0);
        View view = endLineLayout;
        C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/improve/view/ImproveLoadingMoreView", "showEndLine", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        endLineLayout.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/improve/view/ImproveLoadingMoreView", "showEndLine", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        SnsMethodCalculate.markEndTimeMs("showEndLine", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveLoadingMoreView");
    }

    /* renamed from: b */
    public final void mo98000b() {
        SnsMethodCalculate.markStartTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveLoadingMoreView");
        View loadLayout = getLoadLayout();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(loadLayout, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/improve/view/ImproveLoadingMoreView", "startAnimation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        loadLayout.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(loadLayout, "com/tencent/mm/plugin/sns/ui/improve/view/ImproveLoadingMoreView", "startAnimation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View endLineLayout = getEndLineLayout();
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(4);
        View view = endLineLayout;
        C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/improve/view/ImproveLoadingMoreView", "startAnimation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        endLineLayout.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/improve/view/ImproveLoadingMoreView", "startAnimation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 359.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(1000);
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        ImageView imageView = this.f206190f;
        if (imageView != null) {
            imageView.startAnimation(rotateAnimation);
        }
        SnsMethodCalculate.markEndTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveLoadingMoreView");
    }

    public ImproveLoadingMoreView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.d_u, this, true);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f206190f = (ImageView) findViewById(C0966R.C0970id.f5740nb);
    }

    public ImproveLoadingMoreView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.d_u, this, true);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f206190f = (ImageView) findViewById(C0966R.C0970id.f5740nb);
    }
}
