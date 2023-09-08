package p001ak;

import android.graphics.Point;
import android.view.View;
import p006bk.C54479b;
import p464ck.C54869f;
import p848dk.C58297b;
import p848dk.C58306h;
import p852fk.C59110b;

/* renamed from: ak.e */
public class C54057e extends C54056d {

    /* renamed from: E */
    public C54869f.C54870a f151373E;

    /* renamed from: F */
    public boolean f151374F = false;

    /* renamed from: ak.e$a */
    public class C54058a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f151375d;

        public C54058a(C54057e eVar, View view) {
            this.f151375d = view;
        }

        public void run() {
            this.f151375d.performClick();
        }
    }

    public C54057e(C54479b bVar) {
        super(bVar);
    }

    /* renamed from: j */
    public int mo74720j() {
        return -2147483647;
    }

    /* renamed from: n */
    public C58297b mo74724n(C58306h hVar) {
        C54869f.C54870a aVar = this.f151373E;
        if (aVar != null) {
            View view = aVar.f153799a;
            Point point = hVar.f166949b;
            View c = aVar.mo75816c(view, ((float) point.x) - hVar.f166951d, ((float) point.y) - hVar.f166952e);
            if (c != null) {
                C59110b.f169073a.post(new C54058a(this, c));
            }
        }
        return super.mo74724n(hVar);
    }

    /* renamed from: r */
    public void mo74728r() {
        super.mo74728r();
        this.f151374F = false;
    }
}
