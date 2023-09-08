package com.tencent.p014mm.plugin.profile.p088ui.tab.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import fy3.C32226l;
import gy3.C87412m;
import j20.C117292a;
import java.util.HashSet;
import java.util.Set;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import rf2.C48024e;
import rf2.C48025f;
import rf2.C63403g;
import rx3.C13598b0;
import sx3.C110826x0;
import sx3.C48501y0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015B#\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0014\u0010\u0018R0\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR0\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0019"}, mo182094d2 = {"Lcom/tencent/mm/plugin/profile/ui/tab/view/ProfileLiveNotifyTextLayout;", "Landroid/widget/FrameLayout;", "Lkotlin/Function1;", "Landroid/widget/TextView;", "Lrx3/b0;", "j", "Lfy3/l;", "getOnClickExpandBtn", "()Lfy3/l;", "setOnClickExpandBtn", "(Lfy3/l;)V", "onClickExpandBtn", "n", "getOnClickCollapseBtn", "setOnClickCollapseBtn", "onClickCollapseBtn", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.profile.ui.tab.view.ProfileLiveNotifyTextLayout */
public final class ProfileLiveNotifyTextLayout extends FrameLayout {

    /* renamed from: d */
    public View f115810d;

    /* renamed from: e */
    public View f115811e;

    /* renamed from: f */
    public MMNeat7extView f115812f;

    /* renamed from: g */
    public MMNeat7extView f115813g;

    /* renamed from: h */
    public View f115814h;

    /* renamed from: i */
    public View f115815i;

    /* renamed from: j */
    public C32226l<? super TextView, C13598b0> f115816j;

    /* renamed from: n */
    public C32226l<? super TextView, C13598b0> f115817n;

    /* renamed from: o */
    public Set<? extends View> f115818o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileLiveNotifyTextLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.coa, this, true);
        View findViewById = findViewById(C0966R.C0970id.k9_);
        C87412m.m108593f(findViewById, "findViewById<View>(R.id.…fy_single_line_container)");
        this.f115810d = findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.k98);
        C87412m.m108593f(findViewById2, "findViewById<View>(R.id.…ify_multi_line_container)");
        this.f115811e = findViewById2;
        View findViewById3 = findViewById(C0966R.C0970id.k9a);
        C87412m.m108593f(findViewById3, "findViewById<MMNeat7extV…_notify_single_line_text)");
        this.f115812f = (MMNeat7extView) findViewById3;
        View findViewById4 = findViewById(C0966R.C0970id.k99);
        C87412m.m108593f(findViewById4, "findViewById<MMNeat7extV…e_notify_multi_line_text)");
        this.f115813g = (MMNeat7extView) findViewById4;
        View findViewById5 = findViewById(C0966R.C0970id.jyl);
        C87412m.m108593f(findViewById5, "findViewById<TextView>(R…d.live_notify_expand_btn)");
        this.f115814h = findViewById5;
        View findViewById6 = findViewById(C0966R.C0970id.jyk);
        C87412m.m108593f(findViewById6, "findViewById<TextView>(R…live_notify_collapse_btn)");
        this.f115815i = findViewById6;
        this.f115818o = C110826x0.m151017e(this.f115810d, this.f115811e, this.f115812f, this.f115813g, this.f115814h, findViewById6);
        this.f115814h.setOnClickListener(new C48024e(this));
        this.f115815i.setOnClickListener(new C48025f(this));
    }

    /* renamed from: a */
    public static final void m46452a(ProfileLiveNotifyTextLayout profileLiveNotifyTextLayout, View view) {
        profileLiveNotifyTextLayout.getClass();
        ViewParent parent = view.getParent();
        C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.View");
        View view2 = (View) parent;
        view2.post(new C63403g(profileLiveNotifyTextLayout, view, view2));
    }

    /* renamed from: b */
    public final void mo66925b(View... viewArr) {
        HashSet hashSet = new HashSet();
        for (View view : viewArr) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/tab/view/ProfileLiveNotifyTextLayout", "batchSetVisible", "([Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/profile/ui/tab/view/ProfileLiveNotifyTextLayout", "batchSetVisible", "([Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            hashSet.add(view);
        }
        for (T t : C48501y0.m53871f(this.f115818o, hashSet)) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view2 = t;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/profile/ui/tab/view/ProfileLiveNotifyTextLayout", "batchSetVisible", "([Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            t.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/profile/ui/tab/view/ProfileLiveNotifyTextLayout", "batchSetVisible", "([Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final C32226l<TextView, C13598b0> getOnClickCollapseBtn() {
        return this.f115817n;
    }

    public final C32226l<TextView, C13598b0> getOnClickExpandBtn() {
        return this.f115816j;
    }

    public final void setOnClickCollapseBtn(C32226l<? super TextView, C13598b0> lVar) {
        this.f115817n = lVar;
    }

    public final void setOnClickExpandBtn(C32226l<? super TextView, C13598b0> lVar) {
        this.f115816j = lVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileLiveNotifyTextLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.coa, this, true);
        View findViewById = findViewById(C0966R.C0970id.k9_);
        C87412m.m108593f(findViewById, "findViewById<View>(R.id.…fy_single_line_container)");
        this.f115810d = findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.k98);
        C87412m.m108593f(findViewById2, "findViewById<View>(R.id.…ify_multi_line_container)");
        this.f115811e = findViewById2;
        View findViewById3 = findViewById(C0966R.C0970id.k9a);
        C87412m.m108593f(findViewById3, "findViewById<MMNeat7extV…_notify_single_line_text)");
        this.f115812f = (MMNeat7extView) findViewById3;
        View findViewById4 = findViewById(C0966R.C0970id.k99);
        C87412m.m108593f(findViewById4, "findViewById<MMNeat7extV…e_notify_multi_line_text)");
        this.f115813g = (MMNeat7extView) findViewById4;
        View findViewById5 = findViewById(C0966R.C0970id.jyl);
        C87412m.m108593f(findViewById5, "findViewById<TextView>(R…d.live_notify_expand_btn)");
        this.f115814h = findViewById5;
        View findViewById6 = findViewById(C0966R.C0970id.jyk);
        C87412m.m108593f(findViewById6, "findViewById<TextView>(R…live_notify_collapse_btn)");
        this.f115815i = findViewById6;
        this.f115818o = C110826x0.m151017e(this.f115810d, this.f115811e, this.f115812f, this.f115813g, this.f115814h, findViewById6);
        this.f115814h.setOnClickListener(new C48024e(this));
        this.f115815i.setOnClickListener(new C48025f(this));
    }
}
