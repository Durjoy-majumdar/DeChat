package fy1;

import com.tencent.p014mm.plugin.game.luggage.page.GameWebPage;
import com.tencent.p014mm.plugin.webview.p128ui.tools.game.menu.GameMenuView;
import x93.C53306f;

/* renamed from: fy1.f */
public class C45850f {

    /* renamed from: a */
    public GameWebPage f123794a;

    /* renamed from: b */
    public C45847c f123795b;

    /* renamed from: c */
    public C53306f f123796c;

    public C45850f(GameWebPage gameWebPage, C45847c cVar) {
        this.f123794a = gameWebPage;
        this.f123795b = cVar;
        C53306f fVar = new C53306f(gameWebPage.f148196d);
        this.f123796c = fVar;
        fVar.f148894f = new C45848d(this);
        C45849e eVar = new C45849e(this);
        GameMenuView gameMenuView = fVar.f148896h;
        if (gameMenuView != null) {
            gameMenuView.setGameMenuItemSelectedListener(eVar);
        }
        this.f123796c.mo73933c();
    }
}
