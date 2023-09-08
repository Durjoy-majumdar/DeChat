package y03;

import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import x03.C22947b;
import x03.C22951f;
import x03.C22953h;

/* renamed from: y03.k */
public class C23207k extends C22953h implements C23180a {

    /* renamed from: D */
    public C23184e f66637D;

    /* renamed from: E */
    public FrameLayout f66638E;

    public C23207k(View view, C22947b bVar) {
        super(view, bVar);
    }

    /* renamed from: D */
    public void mo36166D(View view) {
        this.f66638E = (FrameLayout) view.findViewById(C0966R.C0970id.l7y);
    }

    /* renamed from: F */
    public void mo36168F() {
        if (this.f66637D == null) {
            if (this.f65952z.mo24970W3()) {
                this.f66637D = new C23220x(this.f65952z.mo24990t(), this.f65952z, this);
            } else {
                this.f66637D = new C23184e(this.f65952z.mo24990t(), this.f65952z, this);
            }
            this.f66638E.removeAllViews();
            this.f66638E.addView(this.f66637D, this.f65952z.mo24970W3() ? new FrameLayout.LayoutParams(this.f65952z.mo24947G6().x, this.f65952z.mo24947G6().y) : new FrameLayout.LayoutParams(this.f65952z.mo24947G6().y, this.f65952z.mo24947G6().x));
        }
        this.f66637D.mo36163s(this.f65949A, mo17363j());
    }

    /* renamed from: I */
    public void mo36171I(boolean z) {
        super.mo36171I(z);
        this.f65952z.mo24992x1(mo17363j());
        if (this.f66637D.mo36160p(z, false)) {
            mo36116A();
            mo36117Y();
        }
    }

    /* renamed from: Z */
    public int mo36118Z() {
        return mo17363j();
    }

    /* renamed from: c */
    public void mo36628c(View view, int i) {
        C22947b bVar = this.f65952z;
        mo36170H(bVar, bVar.mo24990t(), this.f66637D, i);
    }

    /* renamed from: y */
    public C22951f mo36172y() {
        return this.f66637D;
    }

    /* renamed from: z */
    public View mo36173z() {
        return this.f66637D.getControlBar().getWowView();
    }
}
