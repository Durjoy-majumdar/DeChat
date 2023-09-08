package ul1;

import ak1.C54067f0;
import ak1.C54108o;
import ak1.C54116w;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C54219z;
import cl1.C54991o;
import di3.C86312j;
import fj1.C45795b;
import fy3.C32224a;
import gy3.C87413o;
import java.util.LinkedList;
import o40.C61926c;
import ob0.C89132b;
import qo3.C89779i0;
import rl1.C13022d0;
import rl1.C13036f0;
import rx3.C13598b0;
import te3.C50189kx0;
import te3.C52204z21;

/* renamed from: ul1.h */
public final class C14216h extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C89779i0 f39704d;

    /* renamed from: e */
    public final /* synthetic */ C89132b.C89134c<C50189kx0> f39705e;

    /* renamed from: f */
    public final /* synthetic */ C14212g f39706f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14216h(C89779i0 i0Var, C89132b.C89134c<C50189kx0> cVar, C14212g gVar) {
        super(0);
        this.f39704d = i0Var;
        this.f39705e = cVar;
        this.f39706f = gVar;
    }

    public Object invoke() {
        C54219z<Boolean> zVar;
        Class cls = C13022d0.class;
        this.f39704d.dismiss();
        C89132b.C89134c<C50189kx0> cVar = this.f39705e;
        int i = cVar.f256793a;
        if (i == 0 && cVar.f256794b == 0) {
            C45795b bVar = C45795b.f123698n;
            boolean z = true;
            if (bVar == null || !((C54991o) bVar.mo71262a(C54991o.class)).f154190D) {
                z = false;
            }
            if (z) {
                ((C54116w) C86312j.m106911c(C54116w.class)).Gx0(3);
            } else {
                C54067f0.C0051c cVar2 = C54067f0.C0051c.START_LOTTERY_SUCCESS;
                ((C54108o) C86312j.m106911c(C54108o.class)).Mx0(cVar2, this.f39706f.f39684h + '@' + this.f39706f.f39686j + ';' + this.f39706f.f39687n + ';' + this.f39706f.f39688o + ';' + this.f39706f.f39689p);
            }
            C45795b bVar2 = C45795b.f123698n;
            if (bVar2 != null) {
                C61926c.m72668M(new C13036f0((C13022d0) bVar2.mo71262a(cls)));
            }
            C52204z21 z212 = ((C50189kx0) this.f39705e.f256796d).f137077d;
            if (z212 != null) {
                LinkedList linkedList = new LinkedList();
                linkedList.add(z212);
                C45795b bVar3 = C45795b.f123698n;
                if (bVar3 != null) {
                    ((C13022d0) bVar3.mo71262a(cls)).mo12532F3(linkedList, false);
                }
                C45795b bVar4 = C45795b.f123698n;
                if (!(bVar4 == null || (zVar = ((C13022d0) bVar4.mo71262a(cls)).f37101q) == null)) {
                    zVar.postValue(Boolean.TRUE);
                }
            }
            C14210f fVar = this.f39706f.f39683g;
            if (fVar != null) {
                fVar.destroy();
            }
            AppCompatActivity appCompatActivity = this.f39706f.f39680d;
            appCompatActivity.setResult(-1, appCompatActivity.getIntent());
            this.f39706f.f39680d.finish();
        } else {
            C14210f fVar2 = this.f39706f.f39683g;
            if (fVar2 != null) {
                fVar2.mo13604t0(i, cVar.f256794b, cVar.f256795c, (C50189kx0) cVar.f256796d);
            }
        }
        return C13598b0.f38549a;
    }
}
