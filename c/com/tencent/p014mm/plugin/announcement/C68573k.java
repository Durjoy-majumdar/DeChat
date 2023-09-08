package com.tencent.p014mm.plugin.announcement;

import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import di3.C86312j;
import f62.C75708t0;
import nj3.C76879j;
import qo3.C47883u;

/* renamed from: com.tencent.mm.plugin.announcement.k */
public class C68573k implements C47883u {

    /* renamed from: a */
    public final /* synthetic */ int f197000a;

    /* renamed from: b */
    public final /* synthetic */ RoomCardUI f197001b;

    public C68573k(RoomCardUI roomCardUI, int i) {
        this.f197001b = roomCardUI;
        this.f197000a = i;
    }

    /* renamed from: a */
    public void mo353a(boolean z, String str) {
        RoomCardUI roomCardUI = this.f197001b;
        roomCardUI.f196971o = C76879j.m92723Q(roomCardUI.getContext(), this.f197001b.getString(C0966R.string.a3h), this.f197001b.getString(C0966R.string.i8y), true, false, (DialogInterface.OnCancelListener) null);
        if (this.f197001b.mo94206L7()) {
            RoomCardUI roomCardUI2 = this.f197001b;
            roomCardUI2.f196979w = false;
            roomCardUI2.mo94208N7(roomCardUI2.f196972p.getText().toString());
            ((C75708t0) C86312j.m106911c(C75708t0.class)).di0(this.f197001b.f196963d, 1, this.f197000a, 2);
            RoomCardUI roomCardUI3 = this.f197001b;
            int i = 6;
            if (this.f197000a != 6) {
                i = 8;
            }
            RoomCardUI.m80818H7(roomCardUI3, i);
        }
    }
}
