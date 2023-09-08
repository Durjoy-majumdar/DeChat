package hq3;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import com.tencent.p014mm.view.popview.AbstractPopView;
import di3.C86312j;
import gy3.C87412m;
import p008bq.C67306k1;
import p813fl.C97939w0;

/* renamed from: hq3.h */
public final class C76239h extends C98498a {

    /* renamed from: d */
    public final Context f223334d;

    /* renamed from: e */
    public final WindowManager f223335e;

    /* renamed from: f */
    public View f223336f;

    /* renamed from: g */
    public AbstractPopView f223337g;

    public C76239h(Context context) {
        C87412m.m108594g(context, "context");
        this.f223334d = context;
        Object systemService = context.getSystemService("window");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f223335e = (WindowManager) systemService;
    }

    /* renamed from: a */
    public boolean mo106488a(View view, Object obj) {
        C87412m.m108594g(view, "anchor");
        if (!(obj instanceof C97939w0) || !view.isEnabled()) {
            return false;
        }
        this.f223336f = view;
        mo106491f(view, obj);
        return true;
    }

    /* renamed from: b */
    public void mo106489b(View view, Object obj) {
        C87412m.m108594g(view, "anchor");
        if (!C87412m.m108589b(this.f223336f, view)) {
            this.f223336f = view;
            mo106491f(view, obj);
        }
    }

    /* renamed from: c */
    public void mo106490c() {
        this.f223336f = null;
        AbstractPopView abstractPopView = this.f223337g;
        if (abstractPopView != null) {
            this.f223335e.removeView(abstractPopView);
        }
        this.f223337g = null;
    }

    /* renamed from: f */
    public final void mo106491f(View view, Object obj) {
        Class cls = C67306k1.class;
        if (!(obj instanceof C97939w0) || !view.isEnabled()) {
            AbstractPopView abstractPopView = this.f223337g;
            if (abstractPopView != null) {
                abstractPopView.setVisibility(8);
                return;
            }
            return;
        }
        WindowManager.LayoutParams layoutParams = null;
        if (this.f223337g == null) {
            AbstractPopView JH = ((C67306k1) C86312j.m106911c(cls)).mo91184JH(this.f223334d, obj);
            this.f223337g = JH;
            this.f223335e.addView(JH, JH != null ? JH.getWindowLayoutParams() : null);
        }
        AbstractPopView abstractPopView2 = this.f223337g;
        if (abstractPopView2 != null) {
            abstractPopView2.setVisibility(0);
        }
        ((C67306k1) C86312j.m106911c(cls)).Sq0(this.f223337g, obj);
        AbstractPopView abstractPopView3 = this.f223337g;
        if (abstractPopView3 != null) {
            abstractPopView3.mo104703d(view);
        }
        WindowManager windowManager = this.f223335e;
        AbstractPopView abstractPopView4 = this.f223337g;
        if (abstractPopView4 != null) {
            layoutParams = abstractPopView4.getWindowLayoutParams();
        }
        windowManager.updateViewLayout(abstractPopView4, layoutParams);
    }
}
