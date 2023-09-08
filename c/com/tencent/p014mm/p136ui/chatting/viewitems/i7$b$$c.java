package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.widget.PopupWindow;
import ck3.C67391b;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74059i7;
import uo3.C78253a;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.i7$b$$c */
public class i7$b$$c implements PopupWindow.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ C67391b f217363d;

    /* renamed from: e */
    public final /* synthetic */ C74059i7.C74068g f217364e;

    /* renamed from: f */
    public final /* synthetic */ C74059i7.C74061b f217365f;

    public i7$b$$c(C74059i7.C74061b bVar, C67391b bVar2, C74059i7.C74068g gVar) {
        this.f217365f = bVar;
        this.f217363d = bVar2;
        this.f217364e = gVar;
    }

    public void onDismiss() {
        this.f217363d.mo91545F(true);
        C78253a aVar = this.f217364e.f217329i;
        C67391b bVar = this.f217363d;
        C74059i7.C74061b bVar2 = this.f217365f;
        C74023i.m87879U(aVar, bVar, bVar2.f217311z, bVar2.f217310y, 1);
        C74059i7.C74061b bVar3 = this.f217365f;
        bVar3.f217311z = -1;
        bVar3.f217310y = -1;
    }
}
