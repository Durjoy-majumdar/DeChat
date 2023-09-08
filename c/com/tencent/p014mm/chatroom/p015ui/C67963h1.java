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

/* renamed from: com.tencent.mm.chatroom.ui.h1 */
public class C67963h1 extends C77086f {

    /* renamed from: d */
    public final /* synthetic */ String f195086d;

    /* renamed from: e */
    public final /* synthetic */ C72940a f195087e;

    /* renamed from: f */
    public final /* synthetic */ ModRemarkRoomNameUI f195088f;

    public C67963h1(ModRemarkRoomNameUI modRemarkRoomNameUI, String str, C72940a aVar) {
        this.f195088f = modRemarkRoomNameUI;
        this.f195086d = str;
        this.f195087e = aVar;
    }

    /* renamed from: a */
    public void mo10150a(int i, int i2, String str, C77084b bVar) {
        C77086f fVar = (C77086f) bVar;
        Class cls = C75700k0.class;
        if (this.f225171a == 0) {
            ModRemarkRoomNameUI modRemarkRoomNameUI = this.f195088f;
            C76701a.makeText((Context) modRemarkRoomNameUI, (CharSequence) modRemarkRoomNameUI.getString(C0966R.string.a3s), 0).show();
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(this.f195088f.f10155o);
            if (z1Var != null && ((int) z1Var.f108320R1) > 0) {
                z1Var.mo62878U2(this.f195086d);
                ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69704i3(z1Var);
            }
            this.f195088f.finish();
            return;
        }
        this.f195087e.cancel();
        if (!Util.isNullOrNil(fVar.f225173c) || !Util.isNullOrNil(fVar.f225172b)) {
            C76879j.m92748s(this.f195088f, fVar.f225173c, fVar.f225172b);
        }
    }
}
