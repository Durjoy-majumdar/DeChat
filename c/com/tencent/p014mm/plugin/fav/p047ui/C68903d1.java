package com.tencent.p014mm.plugin.fav.p047ui;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.fav.p047ui.FavSearchUI;
import com.tencent.p014mm.plugin.fav.p047ui.adapter.C68901b;
import com.tencent.p014mm.plugin.fav.p047ui.widget.FavSearchActionView;
import com.tencent.p014mm.plugin.fav.p047ui.widget.FavTagPanel;
import com.tencent.p014mm.plugin.report.service.C115669n;
import java.util.LinkedList;

/* renamed from: com.tencent.mm.plugin.fav.ui.d1 */
public class C68903d1 extends C68901b {

    /* renamed from: h */
    public final /* synthetic */ FavSearchUI f198005h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68903d1(FavSearchUI favSearchUI, Context context) {
        super(context);
        this.f198005h = favSearchUI;
    }

    /* renamed from: l */
    public void mo94803l(String str) {
        FavSearchActionView favSearchActionView = this.f198005h.f269811p;
        ((LinkedList) favSearchActionView.f198057g).add(str);
        FavTagPanel favTagPanel = favSearchActionView.f198055e;
        if (favTagPanel != null) {
            favTagPanel.setEditHint("");
            favSearchActionView.f198055e.mo95185d(str, true);
            if (favSearchActionView.f198059i != null) {
                favSearchActionView.mo94833c(favSearchActionView.f198055e.getEditText());
                ((FavSearchUI.C93448i) favSearchActionView.f198059i).mo128307a(favSearchActionView.f198056f, favSearchActionView.f198058h, favSearchActionView.f198057g, false);
                C115669n.INSTANCE.mo160131h(11126, 2);
            }
        }
    }

    /* renamed from: n */
    public void mo94804n(String str) {
        FavSearchActionView favSearchActionView = this.f198005h.f269811p;
        ((LinkedList) favSearchActionView.f198057g).remove(str);
        if (favSearchActionView.f198055e != null) {
            if (favSearchActionView.f198057g.isEmpty()) {
                favSearchActionView.f198055e.setEditHint(favSearchActionView.getResources().getString(C0966R.string.a2p));
            }
            favSearchActionView.f198055e.mo101812o(str);
            if (favSearchActionView.f198059i != null) {
                favSearchActionView.mo94833c(favSearchActionView.f198055e.getEditText());
                ((FavSearchUI.C93448i) favSearchActionView.f198059i).mo128307a(favSearchActionView.f198056f, favSearchActionView.f198058h, favSearchActionView.f198057g, true);
            }
        }
    }
}
