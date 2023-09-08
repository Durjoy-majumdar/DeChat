package tl1;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewParent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;

/* renamed from: tl1.d0 */
public final class C13972d0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C13985j0 f39254d;

    public C13972d0(C13985j0 j0Var) {
        this.f39254d = j0Var;
    }

    public final void run() {
        Rect rect = new Rect();
        WeImageView weImageView = this.f39254d.f39278f;
        if (weImageView != null) {
            weImageView.getHitRect(rect);
        }
        int i = -MMApplicationContext.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3736cp);
        rect.inset(i, i);
        WeImageView weImageView2 = this.f39254d.f39278f;
        ViewParent parent = weImageView2 != null ? weImageView2.getParent() : null;
        C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.View");
        ((View) parent).setTouchDelegate(new TouchDelegate(rect, this.f39254d.f39278f));
    }
}
