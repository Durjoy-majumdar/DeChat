package xd1;

import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import bl3.C39818r;
import com.google.android.material.appbar.AppBarLayout;
import gy3.C87412m;

/* renamed from: xd1.h */
public final class C15656h implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d */
    public final /* synthetic */ C15644c f42328d;

    /* renamed from: e */
    public final /* synthetic */ FrameLayout f42329e;

    public C15656h(C15644c cVar, FrameLayout frameLayout) {
        this.f42328d = cVar;
        this.f42329e = frameLayout;
    }

    public void onGlobalLayout() {
        ViewTreeObserver viewTreeObserver;
        AppBarLayout appBarLayout = this.f42328d.f42281B;
        ViewParent parent = appBarLayout != null ? appBarLayout.getParent() : null;
        C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.View");
        float y = ((View) parent).getY();
        AppBarLayout appBarLayout2 = this.f42328d.f42281B;
        float height = (y + ((float) (appBarLayout2 != null ? appBarLayout2.getHeight() : 0))) - ((float) this.f42329e.getHeight());
        FrameLayout frameLayout = ((C15671r) C39818r.f106831a.mo62443b(this.f42328d.getContext()).mo75002a(C15671r.class)).f33560g;
        if (frameLayout != null && !C87412m.m108588a((Float) null, height)) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(-1, -1);
            }
            layoutParams.topMargin = (int) height;
            frameLayout.setLayoutParams(layoutParams);
        }
        AppBarLayout appBarLayout3 = this.f42328d.f42281B;
        if (appBarLayout3 != null && (viewTreeObserver = appBarLayout3.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
    }
}
