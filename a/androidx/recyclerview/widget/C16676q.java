package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C16665p;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: androidx.recyclerview.widget.q */
public class C16676q implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C16665p.C16670f f45068d;

    /* renamed from: e */
    public final /* synthetic */ int f45069e;

    /* renamed from: f */
    public final /* synthetic */ C16665p f45070f;

    public C16676q(C16665p pVar, C16665p.C16670f fVar, int i) {
        this.f45070f = pVar;
        this.f45068d = fVar;
        this.f45069e = i;
    }

    public void run() {
        RecyclerView recyclerView = this.f45070f.f45041x;
        if (recyclerView != null && recyclerView.isAttachedToWindow()) {
            C16665p.C16670f fVar = this.f45068d;
            if (!fVar.f45061q && fVar.f45055h.mo17363j() != -1) {
                RecyclerView.C16616j itemAnimator = this.f45070f.f45041x.getItemAnimator();
                if (itemAnimator == null || !itemAnimator.mo17326o((RecyclerView.C16616j.C16618a) null)) {
                    C16665p pVar = this.f45070f;
                    int size = ((ArrayList) pVar.f45039v).size();
                    boolean z = false;
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (!((C16665p.C16670f) ((ArrayList) pVar.f45039v).get(i)).f45062r) {
                            z = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (!z) {
                        this.f45070f.f45036s.mo17556k(this.f45068d.f45055h, this.f45069e);
                        return;
                    }
                }
                this.f45070f.f45041x.post(this);
            }
        }
    }
}
