package nf1;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: nf1.e */
public class C21627e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ RecyclerView f61228d;

    /* renamed from: e */
    public final /* synthetic */ C21629f f61229e;

    /* renamed from: nf1.e$a */
    public class C21628a implements RecyclerView.C16616j.C16618a {
        public C21628a() {
        }

        /* renamed from: a */
        public void mo17330a() {
            C21629f fVar = C21627e.this.f61229e;
            fVar.f61232b = false;
            fVar.f61231a.requestLayout();
        }
    }

    public C21627e(C21629f fVar, RecyclerView recyclerView) {
        this.f61229e = fVar;
        this.f61228d = recyclerView;
    }

    public void run() {
        if (this.f61228d.getItemAnimator() != null) {
            this.f61228d.getItemAnimator().mo17326o(new C21628a());
            return;
        }
        C21629f fVar = this.f61229e;
        fVar.f61232b = false;
        fVar.f61231a.requestLayout();
    }
}
