package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.widget.PopupWindow;
import ck3.C67391b;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74059i7;
import uo3.C78253a;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.i7$a$$c */
public class i7$a$$c implements PopupWindow.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ C67391b f217342d;

    /* renamed from: e */
    public final /* synthetic */ C74059i7.C74068g f217343e;

    /* renamed from: f */
    public final /* synthetic */ C74059i7.C74060a f217344f;

    public i7$a$$c(C74059i7.C74060a aVar, C67391b bVar, C74059i7.C74068g gVar) {
        this.f217344f = aVar;
        this.f217342d = bVar;
        this.f217343e = gVar;
    }

    public void onDismiss() {
        this.f217342d.mo91545F(true);
        C78253a aVar = this.f217343e.f217329i;
        C67391b bVar = this.f217342d;
        C74059i7.C74060a aVar2 = this.f217344f;
        C74023i.m87879U(aVar, bVar, aVar2.f217306z, aVar2.f217305y, 1);
        C74059i7.C74060a aVar3 = this.f217344f;
        aVar3.f217306z = -1;
        aVar3.f217305y = -1;
    }
}
