package com.tencent.p014mm.plugin.webview.luggage;

import android.app.Activity;
import android.content.Intent;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import d92.C107028a;
import d92.C45293c;
import gy3.C87412m;
import k92.C108974b;
import p361me.imid.swipebacklayout.lib.SwipeBackLayout;
import p828wa.C53106j;

/* renamed from: com.tencent.mm.plugin.webview.luggage.k1 */
public final class C43627k1 extends C45293c {

    /* renamed from: g */
    public final C43658n f117880g;

    /* renamed from: h */
    public final Intent f117881h;

    /* renamed from: i */
    public Activity f117882i;

    /* renamed from: com.tencent.mm.plugin.webview.luggage.k1$a */
    public static final class C43628a implements SwipeBackLayout.C21490b {

        /* renamed from: a */
        public final /* synthetic */ C107028a.C45290a f117883a;

        public C43628a(C107028a.C45290a aVar) {
            this.f117883a = aVar;
        }

        /* renamed from: a */
        public void mo33673a(MotionEvent motionEvent) {
            C87412m.m108594g(motionEvent, "ev");
            C107028a.C45290a aVar = this.f117883a;
            if (aVar != null) {
                aVar.mo70814a(motionEvent);
            }
        }

        /* renamed from: b */
        public int mo33674b(boolean z) {
            Log.m105924i("MicroMsg.LuggageWebViewMultiTaskPageAdapter", "onViewReleased, " + z);
            C107028a.C45290a aVar = this.f117883a;
            if (aVar != null) {
                return aVar.mo70817d(z);
            }
            return 1;
        }

        /* renamed from: c */
        public void mo33675c() {
        }

        /* renamed from: d */
        public void mo33676d(int i, float f) {
            C107028a.C45290a aVar = this.f117883a;
            if (aVar != null) {
                aVar.mo70815b(f);
            }
        }

        /* renamed from: f */
        public void mo33677f(int i) {
            C107028a.C45290a aVar = this.f117883a;
            if (aVar != null) {
                aVar.mo70821j(1, 0);
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C43627k1(com.tencent.p014mm.plugin.webview.luggage.C43658n r4) {
        /*
            r3 = this;
            java.lang.String r0 = "page"
            gy3.C87412m.m108594g(r4, r0)
            android.content.Context r0 = r4.f148196d
            java.lang.String r1 = "null cannot be cast to non-null type android.app.Activity"
            gy3.C87412m.m108592e(r0, r1)
            android.app.Activity r0 = (android.app.Activity) r0
            r3.<init>(r0)
            r3.f117880g = r4
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            r3.f117881h = r0
            android.os.Bundle r2 = r4.f148261n
            r0.putExtras(r2)
            android.content.Context r4 = r4.f148196d
            gy3.C87412m.m108592e(r4, r1)
            android.app.Activity r4 = (android.app.Activity) r4
            r3.f117882i = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.luggage.C43627k1.<init>(com.tencent.mm.plugin.webview.luggage.n):void");
    }

    /* renamed from: a */
    public int mo67904a() {
        return mo67914p() ? -1 : 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = r0.getWindow();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.ViewGroup mo67905b() {
        /*
            r2 = this;
            boolean r0 = r2.mo67914p()
            java.lang.String r1 = "null cannot be cast to non-null type android.view.ViewGroup"
            if (r0 == 0) goto L_0x001e
            android.app.Activity r0 = r2.f117882i
            if (r0 == 0) goto L_0x0017
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L_0x0017
            android.view.View r0 = r0.getDecorView()
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            gy3.C87412m.m108592e(r0, r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L_0x002b
        L_0x001e:
            com.tencent.mm.plugin.webview.luggage.n r0 = r2.f117880g
            android.view.View r0 = r0.f148258h
            android.view.ViewParent r0 = r0.getParent()
            gy3.C87412m.m108592e(r0, r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
        L_0x002b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.luggage.C43627k1.mo67905b():android.view.ViewGroup");
    }

    /* renamed from: e */
    public void mo67906e(boolean z, C108974b bVar) {
        Intent intent;
        Intent intent2;
        Intent intent3;
        Intent intent4;
        C87412m.m108594g(bVar, "helper");
        if (!C53106j.this.mo73791f(false)) {
            if (z) {
                Activity activity = this.f117882i;
                if (!(activity == null || (intent4 = activity.getIntent()) == null)) {
                    intent4.putExtra("MMActivity.OverrideExitAnimation", C0966R.C0968anim.f2461dn);
                }
                Activity activity2 = this.f117882i;
                if (!(activity2 == null || (intent3 = activity2.getIntent()) == null)) {
                    intent3.putExtra("MMActivity.OverrideEnterAnimation", C0966R.C0968anim.f2333y);
                }
            } else {
                Activity activity3 = this.f117882i;
                if (!(activity3 == null || (intent2 = activity3.getIntent()) == null)) {
                    intent2.putExtra("MMActivity.OverrideExitAnimation", 0);
                }
                Activity activity4 = this.f117882i;
                if (!(activity4 == null || (intent = activity4.getIntent()) == null)) {
                    intent.putExtra("MMActivity.OverrideEnterAnimation", 0);
                }
            }
            Activity activity5 = this.f117882i;
            if (activity5 != null) {
                activity5.finish();
            }
        }
    }

    /* renamed from: g */
    public boolean mo67907g() {
        return getContentView() != null;
    }

    public Activity getActivity() {
        return this.f117882i;
    }

    public View getContentView() {
        if (mo67914p()) {
            Activity activity = this.f117882i;
            C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            return ((MMActivity) activity).getSwipeBackLayout();
        }
        View view = this.f117880g.f148258h;
        C87412m.m108592e(view, "null cannot be cast to non-null type me.imid.swipebacklayout.lib.SwipeBackLayout");
        return (SwipeBackLayout) view;
    }

    public Intent getIntent() {
        return this.f117881h;
    }

    public View getMaskView() {
        if (mo67914p()) {
            Activity activity = this.f117882i;
            C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            return ((MMActivity) activity).getSwipeBackLayout().getTargetContentView();
        }
        View view = this.f117880g.f148258h;
        C87412m.m108592e(view, "null cannot be cast to non-null type me.imid.swipebacklayout.lib.SwipeBackLayout");
        return ((SwipeBackLayout) view).getTargetView();
    }

    /* renamed from: m */
    public void mo67911m(C107028a.C45290a aVar) {
        this.f122673e = aVar;
        if (mo67914p()) {
            Activity activity = this.f117882i;
            if (activity instanceof MMActivity) {
                C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                if (((MMActivity) activity).getSwipeBackLayout() != null) {
                    Activity activity2 = this.f117882i;
                    C87412m.m108592e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                    ((MMActivity) activity2).getSwipeBackLayout().setSwipeBackListener(this.f122672d);
                    return;
                }
                return;
            }
            return;
        }
        View view = this.f117880g.f148258h;
        C87412m.m108592e(view, "null cannot be cast to non-null type me.imid.swipebacklayout.lib.SwipeBackLayout");
        ((SwipeBackLayout) view).mo33654a(new C43628a(aVar));
    }

    /* renamed from: n */
    public void mo67912n(C107028a.C45291b bVar) {
        if (mo67914p()) {
            super.mo67912n(bVar);
        } else if (bVar != null) {
            bVar.onComplete(true);
        }
    }

    /* renamed from: o */
    public void mo67913o(Activity activity) {
        this.f117882i = activity;
    }

    /* renamed from: p */
    public final boolean mo67914p() {
        Log.m105924i("MicroMsg.LuggageWebViewMultiTaskPageAdapter", "useActivityEnv: " + C53106j.this.f148204d.size());
        return C53106j.this.f148204d.size() <= 1;
    }
}
