package com.tencent.p014mm.chatroom.p015ui;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.chatroom.p015ui.RoomAccessVerifyApplicationUI;
import com.tencent.p014mm.storage.C72996z1;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import p909ki.C76579b;

/* renamed from: com.tencent.mm.chatroom.ui.l1 */
public final class C67974l1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C76579b f195103d;

    /* renamed from: e */
    public final /* synthetic */ RoomAccessVerifyApplicationUI.C67890b f195104e;

    /* renamed from: f */
    public final /* synthetic */ Context f195105f;

    /* renamed from: g */
    public final /* synthetic */ String f195106g;

    public C67974l1(C76579b bVar, RoomAccessVerifyApplicationUI.C67890b bVar2, Context context, String str) {
        this.f195103d = bVar;
        this.f195104e = bVar2;
        this.f195105f = context;
        this.f195106g = str;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationUI$ApplicationItemHolder$onBindViewHolder$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(this.f195103d.f224135d.f224138d);
        String nickname = z1Var.getNickname();
        String f = z1Var.mo62898f();
        RoomAccessVerifyApplicationUI.C67890b bVar = this.f195104e;
        Context context = this.f195105f;
        C87412m.m108593f(context, "context");
        String str = this.f195106g;
        String str2 = this.f195103d.f224135d.f224138d;
        C87412m.m108593f(str2, "item.inviter.userName");
        String str3 = this.f195103d.f224137f.get(0).f224132e;
        C87412m.m108593f(str3, "item.application3[0].ticket");
        RoomAccessVerifyApplicationUI.C67890b.m80268y(bVar, context, str, str2, nickname, f, false, str3);
        C117292a.m165361g(this, "com/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationUI$ApplicationItemHolder$onBindViewHolder$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
