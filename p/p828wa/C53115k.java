package p828wa;

import android.app.Activity;

/* renamed from: wa.k */
public class C53115k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C53104i f148224d;

    /* renamed from: e */
    public final /* synthetic */ C53106j f148225e;

    public C53115k(C53106j jVar, C53104i iVar) {
        this.f148225e = jVar;
        this.f148224d = iVar;
    }

    public void run() {
        if (!((Activity) this.f148225e.f148202b).isFinishing()) {
            C53104i pop = this.f148225e.f148204d.size() == 0 ? null : this.f148225e.f148204d.pop();
            if (pop != null) {
                this.f148225e.mo73795j(pop);
            }
            this.f148225e.f148204d.push(this.f148224d);
            this.f148225e.f148203c.addView(this.f148224d.mo73783b());
            this.f148224d.mo73786i();
        }
    }
}
