package hr1;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;
import java.util.Set;

/* renamed from: hr1.d */
public final class C60139d implements RecyclerView.C16621m {

    /* renamed from: d */
    public boolean f171671d = true;

    /* renamed from: e */
    public final /* synthetic */ RecyclerView f171672e;

    /* renamed from: f */
    public final /* synthetic */ C60134a f171673f;

    /* renamed from: hr1.d$a */
    public static final class C60140a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C60134a f171674d;

        public C60140a(C60134a aVar) {
            this.f171674d = aVar;
        }

        public final void run() {
            C60134a.m70028a(this.f171674d, (Set) null, false, "onChildViewAttachedToWindow", 3, (Object) null);
        }
    }

    public C60139d(RecyclerView recyclerView, C60134a aVar) {
        this.f171672e = recyclerView;
        this.f171673f = aVar;
    }

    /* renamed from: E0 */
    public void mo17332E0(View view) {
        C87412m.m108594g(view, "view");
    }

    /* renamed from: z2 */
    public void mo17333z2(View view) {
        C87412m.m108594g(view, "view");
        if (this.f171671d) {
            this.f171671d = false;
            this.f171672e.post(new C60140a(this.f171673f));
        }
    }
}
