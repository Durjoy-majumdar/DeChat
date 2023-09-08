package com.tencent.p014mm.plugin.fav.p047ui;

import android.content.Context;
import com.tencent.p014mm.plugin.fav.p047ui.adapter.C68901b;
import com.tencent.p014mm.plugin.fav.p047ui.widget.FavTagPanel;

/* renamed from: com.tencent.mm.plugin.fav.ui.l1 */
public class C93673l1 extends C68901b {

    /* renamed from: h */
    public final /* synthetic */ FavTagEditUI f270455h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C93673l1(FavTagEditUI favTagEditUI, Context context) {
        super(context);
        this.f270455h = favTagEditUI;
    }

    /* renamed from: l */
    public void mo94803l(String str) {
        this.f270455h.f269847g.mo95185d(str, true);
        FavTagPanel favTagPanel = this.f270455h.f269846f;
        if (favTagPanel != null) {
            favTagPanel.mo101814r(str, true);
        }
        this.f270455h.mo128315H7();
    }

    /* renamed from: n */
    public void mo94804n(String str) {
        this.f270455h.f269847g.mo101812o(str);
        FavTagPanel favTagPanel = this.f270455h.f269846f;
        if (favTagPanel != null) {
            favTagPanel.mo101814r(str, false);
        }
        this.f270455h.mo128315H7();
    }
}
