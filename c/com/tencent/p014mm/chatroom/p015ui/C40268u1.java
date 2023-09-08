package com.tencent.p014mm.chatroom.p015ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import ke3.C88144b;
import nj3.C76879j;
import p275xz.C79012e;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.chatroom.ui.u1 */
public class C40268u1 implements C76879j.C11180n {

    /* renamed from: a */
    public final /* synthetic */ RoomInfoDetailUI f108283a;

    /* renamed from: com.tencent.mm.chatroom.ui.u1$a */
    public class C40269a implements DialogInterface.OnCancelListener {
        public C40269a() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            C40268u1.this.f108283a.f108148q = true;
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.u1$b */
    public class C40270b implements DialogInterface.OnClickListener {
        public C40270b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C40268u1.this.f108283a.f108148q = true;
            Intent intent = new Intent();
            intent.putExtra("Chat_User", C40268u1.this.f108283a.f108142h.getUsername());
            intent.addFlags(67108864);
            C88144b.m109801s(C40268u1.this.f108283a, ".ui.chatting.ChattingUI", intent, (Bundle) null);
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.u1$c */
    public class C40271c implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ ProgressDialog f108286d;

        public C40271c(ProgressDialog progressDialog) {
            this.f108286d = progressDialog;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f108286d.show();
            RoomInfoDetailUI roomInfoDetailUI = C40268u1.this.f108283a;
            roomInfoDetailUI.f108148q = false;
            RoomInfoDetailUI.m43250H7(roomInfoDetailUI, this.f108286d);
        }
    }

    public C40268u1(RoomInfoDetailUI roomInfoDetailUI) {
        this.f108283a = roomInfoDetailUI;
    }

    /* renamed from: j */
    public void mo782j(int i) {
        if (i == 0) {
            RoomInfoDetailUI roomInfoDetailUI = this.f108283a;
            roomInfoDetailUI.f108148q = false;
            C89779i0 Q = C76879j.m92723Q(roomInfoDetailUI, roomInfoDetailUI.getString(C0966R.string.a3h), this.f108283a.getString(C0966R.string.a4d), true, true, new C40269a());
            String str = null;
            if (!this.f108283a.f108148q) {
                str = ((C79012e) C86312j.m106911c(C79012e.class)).rk0(this.f108283a.f108142h.getUsername());
            }
            if (!Util.isNullOrNil(str)) {
                Q.dismiss();
                RoomInfoDetailUI roomInfoDetailUI2 = this.f108283a;
                C76879j.m92718L(roomInfoDetailUI2, false, roomInfoDetailUI2.getString(C0966R.string.krb, new Object[]{str}), (String) null, this.f108283a.getString(C0966R.string.fey), this.f108283a.getString(C0966R.string.bfd), new C40270b(), new C40271c(Q), -1, C0966R.color.f3041d1);
                return;
            }
            RoomInfoDetailUI.m43250H7(this.f108283a, Q);
        }
    }
}
