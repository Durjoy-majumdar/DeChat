package lb2;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.p014mm.plugin.p081mv.p082ui.MusicMvPostUI;
import com.tencent.p014mm.plugin.p081mv.p082ui.MusicMvRouterUI;
import di3.C86312j;
import nj3.C11184p0;
import p140cw.C7138g;
import qo3.C77407n;

/* renamed from: lb2.b */
public final class C61270b implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ MusicMvPostUI f174372d;

    /* renamed from: e */
    public final /* synthetic */ C77407n f174373e;

    public C61270b(MusicMvPostUI musicMvPostUI, C77407n nVar) {
        this.f174372d = musicMvPostUI;
        this.f174373e = nVar;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            Intent intent = new Intent(this.f174372d, MusicMvRouterUI.class);
            intent.putExtra("KEY_MUSIC_ROUTER", 2);
            MusicMvPostUI musicMvPostUI = this.f174372d;
            musicMvPostUI.f163093i = true;
            musicMvPostUI.startActivityForResult(intent, 1000);
        } else if (itemId != 2) {
            this.f174373e.mo107572p();
        } else {
            this.f174372d.f163093i = true;
            ((C7138g) C86312j.m106911c(C7138g.class)).mo8324nq(this.f174372d, 1001, 1, 27, 1, false, (Intent) null);
        }
    }
}
