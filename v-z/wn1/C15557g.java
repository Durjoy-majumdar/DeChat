package wn1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* renamed from: wn1.g */
public final class C15557g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f42157d;

    /* renamed from: e */
    public final /* synthetic */ TextView f42158e;

    public C15557g(View view, TextView textView) {
        this.f42157d = view;
        this.f42158e = textView;
    }

    public final void run() {
        ViewGroup.LayoutParams layoutParams;
        View view = this.f42157d;
        if (view != null && (layoutParams = view.getLayoutParams()) != null) {
            TextView textView = this.f42158e;
            View view2 = this.f42157d;
            layoutParams.width = textView.getWidth();
            view2.setLayoutParams(layoutParams);
        }
    }
}
