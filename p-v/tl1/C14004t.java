package tl1;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewParent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;

/* renamed from: tl1.t */
public final class C14004t implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C14012y f39332d;

    public C14004t(C14012y yVar) {
        this.f39332d = yVar;
    }

    public final void run() {
        Rect rect = new Rect();
        View view = this.f39332d.f39363n;
        if (view != null) {
            view.getHitRect(rect);
        }
        int i = -MMApplicationContext.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3766df);
        rect.inset(i, i);
        View view2 = this.f39332d.f39363n;
        ViewParent parent = view2 != null ? view2.getParent() : null;
        C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.View");
        ((View) parent).setTouchDelegate(new TouchDelegate(rect, this.f39332d.f39363n));
    }
}
