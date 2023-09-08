package fy1;

import android.content.Context;
import android.view.MenuItem;
import com.tencent.p014mm.plugin.game.luggage.page.GameWebPage;
import java.util.HashMap;
import java.util.Iterator;
import te3.C50187kw2;
import x93.C53302d;

/* renamed from: fy1.e */
public class C45849e implements C53302d {

    /* renamed from: a */
    public final /* synthetic */ C45850f f123793a;

    public C45849e(C45850f fVar) {
        this.f123793a = fVar;
    }

    /* renamed from: a */
    public void mo68612a(MenuItem menuItem) {
        C50187kw2 kw22;
        C45850f fVar = this.f123793a;
        C45847c cVar = fVar.f123795b;
        GameWebPage gameWebPage = fVar.f123794a;
        Context context = gameWebPage.f148196d;
        C45845a aVar = (C45845a) ((HashMap) cVar.f123791c).get(Integer.valueOf(menuItem.getItemId()));
        Iterator<C50187kw2> it = cVar.f123790b.iterator();
        while (true) {
            if (!it.hasNext()) {
                kw22 = null;
                break;
            }
            kw22 = it.next();
            if (kw22 != null && kw22.f137072g == menuItem.getItemId()) {
                break;
            }
        }
        if (!(aVar == null || kw22 == null)) {
            aVar.mo71307b(context, gameWebPage, kw22);
        }
        this.f123793a.f123796c.mo73932b();
    }
}
