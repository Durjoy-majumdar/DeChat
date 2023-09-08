package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Context;
import android.view.ContextMenu;
import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74059i7;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C75569c4;
import nj3.C76874e0;
import nj3.C76891l0;
import uo3.C78253a;
import ww0.C78732i;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.i7$b$$d */
public class i7$b$$d implements C76891l0 {

    /* renamed from: a */
    public final /* synthetic */ Context f217366a;

    /* renamed from: b */
    public final /* synthetic */ C74059i7.C74068g f217367b;

    /* renamed from: c */
    public final /* synthetic */ boolean f217368c;

    /* renamed from: d */
    public final /* synthetic */ C67391b f217369d;

    /* renamed from: e */
    public final /* synthetic */ C72963f4 f217370e;

    /* renamed from: f */
    public final /* synthetic */ C74059i7.C74061b f217371f;

    public i7$b$$d(C74059i7.C74061b bVar, Context context, C74059i7.C74068g gVar, boolean z, C67391b bVar2, C72963f4 f4Var) {
        this.f217371f = bVar;
        this.f217366a = context;
        this.f217367b = gVar;
        this.f217368c = z;
        this.f217369d = bVar2;
        this.f217370e = f4Var;
    }

    /* renamed from: a */
    public void mo71744a(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        e0Var.clear();
        e0Var.mo107136c(0, 0, 0, this.f217366a.getResources().getString(C0966R.string.f7936wt), C0966R.raw.icons_filled_copy);
        CharSequence a = this.f217367b.f217322b.mo154968a();
        C74243t8 t8Var = (C74243t8) this.f217367b.f217322b.getTag();
        int h = t8Var != null ? C75569c4.m90675h(t8Var.f212238a) : 0;
        if (h <= 0 || h >= a.length()) {
            e0Var.mo107136c(0, 1, 0, this.f217366a.getResources().getString(C0966R.string.gs4), C0966R.raw.icons_filled_allselect);
        }
        e0Var.mo107136c(0, 2, 0, this.f217366a.getResources().getString(C0966R.string.f361028gs2), C0966R.raw.icons_filled_share);
        e0Var.mo107136c(0, 3, 0, this.f217366a.getResources().getString(C0966R.string.cmx), C0966R.raw.icons_filled_favorites);
        if (!this.f217368c) {
            e0Var.mo107136c(0, 4, 0, this.f217366a.getResources().getString(C0966R.string.b_i), C0966R.raw.icons_filled_search_logo);
        }
        String Lp0 = ((C78732i) C86312j.m106911c(C78732i.class)).Lp0(this.f217371f.f217309x.toString());
        if (!Util.isNullOrNil(Lp0)) {
            C74059i7.C74061b bVar = this.f217371f;
            C78253a aVar = this.f217367b.f217329i;
            C67391b bVar2 = this.f217369d;
            bVar.getClass();
            aVar.f229235K = new C74070j(bVar, bVar2, Lp0);
        }
        if (Util.isNullOrNil(Lp0)) {
            this.f217367b.f217329i.f229235K = null;
        }
        this.f217371f.mo103071D(this.f217369d, this.f217370e, 1, !Util.isNullOrNil(Lp0), this.f217371f.f217309x.toString(), true, "65_" + C31543z5.m39453c(), 3);
    }
}
