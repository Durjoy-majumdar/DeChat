package com.tencent.p014mm.p136ui.halfscreen.custom;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.halfscreen.HalfScreenTransparentActivity;
import com.tencent.p014mm.p136ui.halfscreen.MMHalfScreenDialogFragment;
import com.tencent.p014mm.view.drawer.RecyclerViewDrawerSquares;
import fj3.C20713c;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import p849e3.C58525r;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import zl3.C79402d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, mo182094d2 = {"Lcom/tencent/mm/ui/halfscreen/custom/WebSearchHomeHalfScreen;", "Lcom/tencent/mm/ui/halfscreen/MMHalfScreenDialogFragment;", "Landroid/content/Context;", "activityContext", "Landroid/content/Intent;", "intent", "", "activityClassName", "Lcom/tencent/mm/view/drawer/RecyclerViewDrawerSquares$c;", "drawerListener", "<init>", "(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;Lcom/tencent/mm/view/drawer/RecyclerViewDrawerSquares$c;)V", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.halfscreen.custom.WebSearchHomeHalfScreen */
public final class WebSearchHomeHalfScreen extends MMHalfScreenDialogFragment {

    /* renamed from: y */
    public final C13601g f219893y;

    /* renamed from: com.tencent.mm.ui.halfscreen.custom.WebSearchHomeHalfScreen$a */
    public static final class C45028a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WebSearchHomeHalfScreen f122124d;

        public C45028a(WebSearchHomeHalfScreen webSearchHomeHalfScreen) {
            this.f122124d = webSearchHomeHalfScreen;
        }

        public final void run() {
            ViewPropertyAnimator animate;
            ViewPropertyAnimator alpha;
            View view = (View) ((C36570n) this.f122124d.f219893y).getValue();
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(0.0f));
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/halfscreen/custom/WebSearchHomeHalfScreen$onViewCreated$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view, "com/tencent/mm/ui/halfscreen/custom/WebSearchHomeHalfScreen$onViewCreated$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            View view2 = (View) ((C36570n) this.f122124d.f219893y).getValue();
            if (view2 != null && (animate = view2.animate()) != null && (alpha = animate.alpha(0.3f)) != null) {
                alpha.setInterpolator(C20713c.f58572a.mo32435a());
                alpha.setDuration(300);
                alpha.start();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.halfscreen.custom.WebSearchHomeHalfScreen$b */
    public static final class C74778b extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ Context f219894d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C74778b(Context context) {
            super(0);
            this.f219894d = context;
        }

        public Object invoke() {
            Context context = this.f219894d;
            HalfScreenTransparentActivity halfScreenTransparentActivity = context instanceof HalfScreenTransparentActivity ? (HalfScreenTransparentActivity) context : null;
            FrameLayout frameLayout = halfScreenTransparentActivity != null ? (FrameLayout) halfScreenTransparentActivity.findViewById(C0966R.C0970id.f358753gv2) : null;
            View view = new View(this.f219894d);
            view.setBackgroundColor(-16777216);
            if (frameLayout != null) {
                frameLayout.addView(view, 0);
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -1;
                layoutParams.height = -1;
                view.setLayoutParams(layoutParams);
            }
            if (frameLayout != null) {
                return view;
            }
            return null;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WebSearchHomeHalfScreen(Context context, Intent intent, String str, RecyclerViewDrawerSquares.C45117c cVar, int i, C8480h hVar) {
        this(context, intent, str, (i & 8) != 0 ? null : cVar);
    }

    /* renamed from: K */
    public C79402d mo98534K(Context context) {
        C87412m.m108594g(context, "context");
        C79402d dVar = new C79402d(context, C0966R.style.a8k);
        Window window = dVar.getWindow();
        if (window != null) {
            window.setSoftInputMode(48);
        }
        return dVar;
    }

    /* renamed from: N */
    public float mo98535N() {
        return 0.0f;
    }

    public void dismiss() {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        super.dismiss();
        View view = (View) ((C36570n) this.f219893y).getValue();
        if (view != null && (animate = view.animate()) != null && (alpha = animate.alpha(0.0f)) != null) {
            alpha.setInterpolator(C20713c.f58572a.mo32435a());
            alpha.setDuration(300);
            alpha.start();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C87412m.m108594g(view, "view");
        super.onViewCreated(view, bundle);
        C58525r.m67941a(view, new C45028a(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WebSearchHomeHalfScreen(Context context, Intent intent, String str, RecyclerViewDrawerSquares.C45117c cVar) {
        super(context, intent, str, cVar);
        C87412m.m108594g(context, "activityContext");
        C87412m.m108594g(intent, "intent");
        C87412m.m108594g(str, "activityClassName");
        this.f219893y = C36568h.m40985a(new C74778b(context));
    }
}
