package gy2;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import ay2.C67113b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.taskbar.p110ui.section.weapp.TaskBarSectionMyWeAppRecyclerView;
import com.tencent.p014mm.plugin.taskbar.p110ui.section.weapp.TaskBarSectionWeAppRecyclerView;
import gy3.C87412m;

/* renamed from: gy2.b */
public final class C76076b extends C76090k {

    /* renamed from: p */
    public final FrameLayout f222937p = ((FrameLayout) getRoot().findViewById(C0966R.C0970id.k08));

    /* renamed from: q */
    public final RelativeLayout f222938q;

    /* renamed from: r */
    public final TextView f222939r;

    /* renamed from: s */
    public final LinearLayout f222940s;

    /* renamed from: t */
    public boolean f222941t;

    /* renamed from: u */
    public boolean f222942u;

    /* renamed from: v */
    public final Vibrator f222943v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76076b(Context context, C67113b.C67114a aVar, int i) {
        super(context, aVar, i, (AttributeSet) null, 0);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(aVar, "callback");
        RelativeLayout relativeLayout = (RelativeLayout) getRoot().findViewById(C0966R.C0970id.k09);
        this.f222938q = relativeLayout;
        this.f222939r = (TextView) getRoot().findViewById(C0966R.C0970id.k0a);
        this.f222940s = (LinearLayout) getRoot().findViewById(C0966R.C0970id.k0_);
        this.f222943v = (Vibrator) context.getSystemService("vibrator");
        relativeLayout.setBackgroundResource(C85875k4.m106211z() ? C0966R.color.f3091f1 : C0966R.color.f3090f0);
        getRecyclerView().setId(C0966R.C0970id.f359352kg1);
        if (Build.VERSION.SDK_INT >= 22) {
            getMoreView().setAccessibilityTraversalBefore(getRecyclerView().getId());
        }
    }

    /* renamed from: c */
    public String mo91216c() {
        String string = getContext().getString(C0966R.string.f7892v9);
        C87412m.m108593f(string, "context.getString(R.stri…p_brand_taskbar_my_weapp)");
        return string;
    }

    /* renamed from: e */
    public TaskBarSectionWeAppRecyclerView mo106280e() {
        return new TaskBarSectionMyWeAppRecyclerView(getContext());
    }

    /* renamed from: g */
    public void mo106281g() {
        TaskBarSectionWeAppRecyclerView.C71348e weAppCallback = getWeAppCallback();
        if (weAppCallback != null) {
            weAppCallback.mo98223f();
        }
    }

    /* renamed from: h */
    public void mo106282h(float f) {
        ViewGroup.LayoutParams layoutParams = this.f222937p.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        int i = (int) f;
        ((FrameLayout.LayoutParams) layoutParams).leftMargin = i;
        ViewGroup.LayoutParams layoutParams2 = this.f222937p.getLayoutParams();
        C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((FrameLayout.LayoutParams) layoutParams2).rightMargin = i;
    }

    /* renamed from: j */
    public final boolean mo106283j(float f, float f2) {
        Rect rect = new Rect();
        this.f222937p.getGlobalVisibleRect(rect);
        boolean contains = rect.contains((int) f, (int) f2);
        if (!this.f222941t && contains) {
            announceForAccessibility(getContext().getString(C0966R.string.f7656mu));
            Vibrator vibrator = this.f222943v;
            if (vibrator != null) {
                vibrator.vibrate(10);
            }
        }
        this.f222941t = contains;
        this.f222939r.setText(contains ? C0966R.string.f7888v4 : C0966R.string.f7887v3);
        this.f222938q.setBackgroundResource(contains ? C85875k4.m106211z() ? C0966R.color.f3089ez : C0966R.color.f3088ey : C85875k4.m106211z() ? C0966R.color.f3091f1 : C0966R.color.f3090f0);
        return contains;
    }
}
