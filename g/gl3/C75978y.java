package gl3;

import android.view.MenuItem;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.p136ui.contact.C74481e2;
import com.tencent.p014mm.p136ui.contact.C74499h2;
import com.tencent.p014mm.p136ui.contact.C74503i2;
import com.tencent.p014mm.p136ui.contact.item.RecentForwardListDataItem;
import com.tencent.p014mm.plugin.messenger.foundation.PluginMessengerFoundation;
import di3.C86312j;
import nj3.C11184p0;
import uo3.C78253a;
import yh3.C66649b;

/* renamed from: gl3.y */
public final class C75978y implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ String f222776d;

    /* renamed from: e */
    public final /* synthetic */ RecentForwardListDataItem f222777e;

    /* renamed from: f */
    public final /* synthetic */ RecyclerView f222778f;

    public C75978y(String str, RecentForwardListDataItem recentForwardListDataItem, RecyclerView recyclerView) {
        this.f222776d = str;
        this.f222777e = recentForwardListDataItem;
        this.f222778f = recyclerView;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        C66649b P7;
        PluginMessengerFoundation pluginMessengerFoundation = (PluginMessengerFoundation) C86312j.m106911c(PluginMessengerFoundation.class);
        if (!(pluginMessengerFoundation == null || (P7 = pluginMessengerFoundation.mo96076P7()) == null)) {
            P7.mo90698a(this.f222776d);
        }
        RecentForwardListDataItem.C74506b bVar = this.f222777e.f219068E;
        if (bVar != null) {
            C74503i2 i2Var = (C74503i2) bVar;
            i2Var.f219060a.mo7853r();
            i2Var.f219060a.notifyDataSetChanged();
        }
        RecyclerView.C16613e adapter = this.f222778f.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        RecentForwardListDataItem.C74507c cVar = this.f222777e.f219067D;
        if (cVar != null) {
            String str = this.f222776d;
            C74499h2 h2Var = (C74499h2) cVar;
            C74481e2 e2Var = h2Var.f219052a;
            e2Var.f219027y++;
            if (e2Var.f219028z.isEmpty()) {
                h2Var.f219052a.f219028z = str;
            } else {
                h2Var.f219052a.f219028z = h2Var.f219052a.f219028z + "｜" + str;
            }
        }
        C78253a aVar = this.f222777e.f219069F;
        if (aVar != null) {
            aVar.mo108266a();
        }
    }
}
