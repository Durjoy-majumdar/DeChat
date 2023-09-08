package com.tencent.p014mm.chatroom.p015ui;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.chatroom.p015ui.RoomAccessVerifyApplicationUI;
import d62.C7240a;
import di3.C86312j;
import gy3.C87412m;
import l31.C61212e;
import p909ki.C76579b;
import p909ki.C76580c;
import rx3.C13604l;
import sx3.C90363p0;
import wd3.C53155r0;

/* renamed from: com.tencent.mm.chatroom.ui.m1 */
public final class C67978m1 extends C7240a {

    /* renamed from: e */
    public final /* synthetic */ RoomAccessVerifyApplicationUI.C67890b f195111e;

    /* renamed from: f */
    public final /* synthetic */ Context f195112f;

    /* renamed from: g */
    public final /* synthetic */ String f195113g;

    /* renamed from: h */
    public final /* synthetic */ C76580c f195114h;

    /* renamed from: i */
    public final /* synthetic */ C76579b f195115i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67978m1(RoomAccessVerifyApplicationUI.C67890b bVar, Context context, String str, C76580c cVar, C76579b bVar2) {
        super(1, (C53155r0) null);
        this.f195111e = bVar;
        this.f195112f = context;
        this.f195113g = str;
        this.f195114h = cVar;
        this.f195115i = bVar2;
    }

    /* renamed from: a */
    public void mo1118a(View view) {
        RoomAccessVerifyApplicationUI.C67890b bVar = this.f195111e;
        Context context = this.f195112f;
        C87412m.m108593f(context, "context");
        String str = this.f195113g;
        String str2 = this.f195114h.f224138d;
        C87412m.m108593f(str2, "it.userName");
        String str3 = this.f195114h.f224139e;
        String str4 = this.f195115i.f224137f.get(0).f224132e;
        C87412m.m108593f(str4, "item.application3[0].ticket");
        RoomAccessVerifyApplicationUI.C67890b.m80268y(bVar, context, str, str2, str3, (String) null, true, str4);
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86153W7("base_chatroom_invite_manage_viewinvitee", view, C90363p0.m113143b(new C13604l("Invitee_username", this.f195114h.f224138d)), 25772);
    }
}
