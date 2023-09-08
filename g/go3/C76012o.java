package go3;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import com.tencent.p014mm.p136ui.widget.MMCollapsibleTextView;

/* renamed from: go3.o */
public final class C76012o implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f222868d;

    /* renamed from: e */
    public final /* synthetic */ MMCollapsibleTextView f222869e;

    /* renamed from: f */
    public final /* synthetic */ View f222870f;

    public C76012o(int i, MMCollapsibleTextView mMCollapsibleTextView, View view) {
        this.f222868d = i;
        this.f222869e = mMCollapsibleTextView;
        this.f222870f = view;
    }

    public final void run() {
        Rect rect = new Rect();
        int i = (int) (((float) this.f222868d) * 1.5f);
        this.f222869e.get_collapseImage().getHitRect(rect);
        rect.top -= i;
        rect.left -= i;
        rect.bottom += i;
        rect.right += i;
        this.f222870f.setTouchDelegate(new TouchDelegate(rect, this.f222869e.get_collapseImage()));
    }
}
