package x51;

import com.tencent.p014mm.plugin.emoji.model.C41053r;

/* renamed from: x51.a */
public class C102553a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C41053r f301963d;

    /* renamed from: e */
    public final /* synthetic */ C102554b f301964e;

    public C102553a(C102554b bVar, C41053r rVar) {
        this.f301964e = bVar;
        this.f301963d = rVar;
    }

    public void run() {
        C41053r rVar = this.f301963d;
        if (rVar != null) {
            C102554b bVar = this.f301964e;
            bVar.getClass();
            bVar.f301966e = new C102556d(rVar == null ? null : rVar.f110540b);
            this.f301964e.notifyDataSetChanged();
        }
    }
}
