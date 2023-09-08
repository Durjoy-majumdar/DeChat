package ny1;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.plugin.game.media.preview.GameVideoPreviewUI;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import nj3.C11184p0;
import sw1.C101703s;
import vw1.C102299l;
import w10.C15032a;

/* renamed from: ny1.c */
public class C100241c implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C102299l f293690d;

    /* renamed from: e */
    public final /* synthetic */ GameVideoPreviewUI f293691e;

    public C100241c(GameVideoPreviewUI gameVideoPreviewUI, C102299l lVar) {
        this.f293691e = gameVideoPreviewUI;
        this.f293690d = lVar;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        Class cls = C101703s.class;
        if (menuItem.getItemId() == 0) {
            GameVideoPreviewUI gameVideoPreviewUI = this.f293691e;
            Context context = gameVideoPreviewUI.f271820d;
            int i2 = gameVideoPreviewUI.f271830q + 1;
            C40314g.m43484c(context, 87, 8768, i2 > 100 ? 100 : i2, 15, gameVideoPreviewUI.f271835v, C15032a.m14200a(gameVideoPreviewUI.f271831r, gameVideoPreviewUI.mo129182L7(this.f293690d)));
            C100247i iVar = this.f293691e.f271832s;
            C102299l lVar = this.f293690d;
            iVar.getClass();
            iVar.mo139531a(lVar, new C100245g(iVar, 19081));
        } else if (menuItem.getItemId() == 1) {
            GameVideoPreviewUI gameVideoPreviewUI2 = this.f293691e;
            Context context2 = gameVideoPreviewUI2.f271820d;
            int i3 = gameVideoPreviewUI2.f271830q + 1;
            C40314g.m43484c(context2, 87, 8768, i3 > 100 ? 100 : i3, 14, gameVideoPreviewUI2.f271835v, C15032a.m14200a(gameVideoPreviewUI2.f271831r, gameVideoPreviewUI2.mo129182L7(this.f293690d)));
            C100247i iVar2 = this.f293691e.f271832s;
            C102299l lVar2 = this.f293690d;
            iVar2.getClass();
            iVar2.mo139531a(lVar2, new C100246h(iVar2, 19081));
        } else if (menuItem.getItemId() == 2) {
            GameVideoPreviewUI gameVideoPreviewUI3 = this.f293691e;
            Context context3 = gameVideoPreviewUI3.f271820d;
            int i4 = gameVideoPreviewUI3.f271830q + 1;
            C40314g.m43484c(context3, 87, 8768, i4 > 100 ? 100 : i4, 88, gameVideoPreviewUI3.f271835v, C15032a.m14200a(gameVideoPreviewUI3.f271831r, gameVideoPreviewUI3.mo129182L7(this.f293690d)));
            GameVideoPreviewUI gameVideoPreviewUI4 = this.f293691e;
            Bundle J7 = GameVideoPreviewUI.m118958J7(gameVideoPreviewUI4, gameVideoPreviewUI4.f271830q);
            J7.putBoolean("game_straight_to_publish", this.f293691e.f271834u);
            if (C86013q1.m106450k(this.f293690d.f301310v)) {
                GameVideoPreviewUI gameVideoPreviewUI5 = this.f293691e;
                Context context4 = gameVideoPreviewUI5.f271820d;
                int i5 = gameVideoPreviewUI5.f271831r;
                C102299l lVar3 = this.f293690d;
                ((C101703s) C86312j.m106911c(cls)).mo10937Qd(context4, i5, lVar3.f301307s, lVar3.f301310v, (String) null, (String) null, 19722, J7, gameVideoPreviewUI5.f271835v);
                return;
            }
            GameVideoPreviewUI gameVideoPreviewUI6 = this.f293691e;
            Context context5 = gameVideoPreviewUI6.f271820d;
            int i6 = gameVideoPreviewUI6.f271831r;
            C102299l lVar4 = this.f293690d;
            ((C101703s) C86312j.m106911c(cls)).mo10937Qd(context5, i6, lVar4.f301307s, (String) null, lVar4.f301300i, lVar4.f301299h, 19722, J7, gameVideoPreviewUI6.f271835v);
        }
    }
}
