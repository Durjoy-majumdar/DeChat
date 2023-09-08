package fy1;

import android.content.Context;
import com.tencent.p014mm.plugin.game.luggage.page.GameWebPage;
import java.util.HashMap;
import nj3.C76874e0;
import te3.C50187kw2;
import x93.C53301c;

/* renamed from: fy1.d */
public class C45848d implements C53301c {

    /* renamed from: a */
    public final /* synthetic */ C45850f f123792a;

    public C45848d(C45850f fVar) {
        this.f123792a = fVar;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        C45850f fVar = this.f123792a;
        C45847c cVar = fVar.f123795b;
        GameWebPage gameWebPage = fVar.f123794a;
        Context context = gameWebPage.f148196d;
        for (C50187kw2 next : cVar.f123790b) {
            if (next == null) {
                e0Var.mo107142f(-1, "");
            } else {
                C45845a aVar = (C45845a) ((HashMap) cVar.f123791c).get(Integer.valueOf(next.f137072g));
                if (aVar != null) {
                    aVar.mo71306a(context, gameWebPage, e0Var, next);
                }
            }
        }
    }
}
