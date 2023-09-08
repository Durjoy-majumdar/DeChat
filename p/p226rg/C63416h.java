package p226rg;

import android.content.Intent;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import gy3.C87412m;
import ke3.C88144b;
import nj3.C11184p0;
import p434ig.C98674g;
import p548hg.C98450d;
import pb1.C100714h1;
import rx3.C36570n;
import th0.C64930h;

/* renamed from: rg.h */
public final class C63416h implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C63417i f179902d;

    /* renamed from: e */
    public final /* synthetic */ C63434t f179903e;

    public C63416h(C63417i iVar, C63434t tVar) {
        this.f179902d = iVar;
        this.f179903e = tVar;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            AppCompatActivity activity = this.f179902d.getActivity();
            C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            MMActivity mMActivity = (MMActivity) activity;
            C98674g gVar = this.f179903e.f179919c;
            ((Number) ((C36570n) this.f179902d.f179904d).getValue()).intValue();
            C72963f4 f4Var = this.f179903e.f179918b;
            C87412m.m108594g(gVar, "albumInfoAlbum");
            Intent intent = new Intent();
            intent.putExtra("Select_Conv_Type", 3);
            intent.putExtra("mutil_select_is_ret", true);
            intent.putExtra("Retr_Msg_Type", 34);
            intent.putExtra("scene_from", 18);
            intent.putExtra("desc_title", ((C98450d) C86312j.m106911c(C98450d.class)).mo137793FC(mMActivity, gVar));
            C88144b.m109803u(mMActivity, ".ui.transmit.SelectConversationUI", intent, 1, new C64930h(gVar, mMActivity, f4Var));
        } else if (itemId == 2) {
            DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
            String stringExtra = this.f179902d.getIntent().getStringExtra("record_data_id");
            C63434t tVar = this.f179903e;
            ((C100714h1) C86312j.m106911c(C100714h1.class)).to0(doFavoriteEvent, tVar.f179918b, tVar.f179919c, stringExtra);
            doFavoriteEvent.f264674d.f264684i = this.f179902d.getActivity();
            doFavoriteEvent.f264674d.f264688m = 33;
            doFavoriteEvent.publish();
        }
    }
}
