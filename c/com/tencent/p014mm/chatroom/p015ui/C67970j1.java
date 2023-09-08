package com.tencent.p014mm.chatroom.p015ui;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.roomsdk.model.factory.C72940a;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import f40.C86709a0;
import f62.C75700k0;
import nj3.C76879j;
import p910lj.C76701a;
import pg3.C77084b;
import pg3.C77086f;

/* renamed from: com.tencent.mm.chatroom.ui.j1 */
public class C67970j1 extends C77086f {

    /* renamed from: d */
    public final /* synthetic */ C72996z1 f195095d;

    /* renamed from: e */
    public final /* synthetic */ String f195096e;

    /* renamed from: f */
    public final /* synthetic */ C72940a f195097f;

    /* renamed from: g */
    public final /* synthetic */ ModRemarkRoomNameUI f195098g;

    public C67970j1(ModRemarkRoomNameUI modRemarkRoomNameUI, C72996z1 z1Var, String str, C72940a aVar) {
        this.f195098g = modRemarkRoomNameUI;
        this.f195095d = z1Var;
        this.f195096e = str;
        this.f195097f = aVar;
    }

    /* renamed from: a */
    public void mo10150a(int i, int i2, String str, C77084b bVar) {
        C77086f fVar = (C77086f) bVar;
        if (this.f225171a == 0) {
            ModRemarkRoomNameUI modRemarkRoomNameUI = this.f195098g;
            C76701a.makeText((Context) modRemarkRoomNameUI, (CharSequence) modRemarkRoomNameUI.getString(C0966R.string.a3s), 0).show();
            C72996z1 z1Var = this.f195095d;
            if (z1Var != null && ((int) z1Var.f108320R1) > 0) {
                z1Var.mo62860K2(this.f195096e);
                ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69704i3(this.f195095d);
            }
            this.f195098g.finish();
            return;
        }
        this.f195097f.cancel();
        if (!Util.isNullOrNil(fVar.f225173c) || !Util.isNullOrNil(fVar.f225172b)) {
            C76879j.m92748s(this.f195098g, fVar.f225173c, fVar.f225172b);
        }
    }
}
