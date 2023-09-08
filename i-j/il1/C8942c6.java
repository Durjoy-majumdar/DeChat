package il1;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewParent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;

/* renamed from: il1.c6 */
public final class C8942c6 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f28250d;

    public C8942c6(View view) {
        this.f28250d = view;
    }

    public final void run() {
        Rect rect = new Rect();
        this.f28250d.getHitRect(rect);
        int i = -MMApplicationContext.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3766df);
        rect.inset(i, i);
        ViewParent parent = this.f28250d.getParent();
        C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.View");
        ((View) parent).setTouchDelegate(new TouchDelegate(rect, this.f28250d));
    }
}
