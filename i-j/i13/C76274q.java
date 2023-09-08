package i13;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: i13.q */
public final class C76274q implements TextView.OnEditorActionListener {

    /* renamed from: d */
    public final /* synthetic */ C76259g f223462d;

    public C76274q(C76259g gVar) {
        this.f223462d = gVar;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (4 != i && 66 != keyEvent.getAction()) {
            return false;
        }
        C76259g.m91668F(this.f223462d);
        return true;
    }
}
