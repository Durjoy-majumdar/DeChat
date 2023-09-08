package y03;

import android.view.View;
import android.widget.FrameLayout;
import x03.C22947b;

/* renamed from: y03.w */
public class C23219w extends C23207k {
    public C23219w(View view, C22947b bVar) {
        super(view, bVar);
    }

    /* renamed from: F */
    public void mo36168F() {
        if (this.f66637D == null) {
            this.f66637D = new C23220x(this.f65952z.mo24990t(), this.f65952z, this);
            this.f66638E.removeAllViews();
            this.f66638E.addView(this.f66637D, new FrameLayout.LayoutParams(this.f65952z.mo24947G6().x, this.f65952z.mo24947G6().y));
        }
        this.f66637D.mo36163s(this.f65949A, mo17363j());
    }
}
