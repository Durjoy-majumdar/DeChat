package sz0;

import com.tencent.p014mm.plugin.card.p031ui.p032v2.CardHomePageNewUI;
import java.util.Iterator;
import nj3.C11182m0;
import nj3.C76874e0;
import te3.C118431fo;

/* renamed from: sz0.c */
public final class C22417c implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ CardHomePageNewUI f63529d;

    public C22417c(CardHomePageNewUI cardHomePageNewUI) {
        this.f63529d = cardHomePageNewUI;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        Iterator<C118431fo> it = this.f63529d.f51970F.iterator();
        int i = 0;
        while (it.hasNext()) {
            e0Var.add(0, i, 1, (CharSequence) it.next().f354006f);
            i++;
        }
    }
}
