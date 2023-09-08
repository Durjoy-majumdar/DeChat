package cn3;

import android.view.MenuItem;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.messenger.foundation.PluginMessengerFoundation;
import di3.C86312j;
import nj3.C11184p0;
import p278yh.C79114k;
import uo3.C78253a;
import yh3.C66649b;

/* renamed from: cn3.p */
public final class C67438p implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ String f193386d;

    /* renamed from: e */
    public final /* synthetic */ C67435n f193387e;

    /* renamed from: f */
    public final /* synthetic */ RecyclerView f193388f;

    public C67438p(String str, C67435n nVar, RecyclerView recyclerView) {
        this.f193386d = str;
        this.f193387e = nVar;
        this.f193388f = recyclerView;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        LinearLayout linearLayout;
        C66649b P7;
        PluginMessengerFoundation pluginMessengerFoundation = (PluginMessengerFoundation) C86312j.m106911c(PluginMessengerFoundation.class);
        if (!(pluginMessengerFoundation == null || (P7 = pluginMessengerFoundation.mo96076P7()) == null)) {
            P7.mo90698a(this.f193386d);
        }
        this.f193387e.mo91618g3();
        RecyclerView.C16613e adapter = this.f193388f.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        this.f193387e.getClass();
        C78253a aVar = this.f193387e.f193379e;
        if (aVar != null) {
            aVar.mo108266a();
        }
        if (this.f193387e.f193378d.size() == 0) {
            C79114k kVar = this.f193387e.f193381g;
            if (kVar != null) {
                if (kVar.f232298b == null) {
                    kVar.f232298b = (LinearLayout) kVar.f232297a.findViewById(C0966R.C0970id.iwl);
                }
                linearLayout = kVar.f232298b;
            } else {
                linearLayout = null;
            }
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
        }
    }
}
