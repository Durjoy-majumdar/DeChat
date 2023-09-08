package com.tencent.p014mm.chatroom.p015ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.chatroom.p015ui.SelectMemberUI;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1915z5;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44651a5;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44673z4;
import com.tencent.p014mm.storage.C72996z1;
import f40.C86709a0;
import f62.C75700k0;
import j20.C117292a;
import k20.C9556a;
import nj3.C76879j;
import nj3.C76912y0;
import ob0.C11385n;
import ob0.C117747y;
import p203mi.C47053y;
import p239sv.C48465k;
import qe0.C47806g;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.chatroom.ui.TransferRoomOwnerUI */
public class TransferRoomOwnerUI extends SelectMemberUI implements C11385n {

    /* renamed from: u */
    public C89779i0 f108265u;

    /* renamed from: v */
    public boolean f108266v;

    /* renamed from: K7 */
    public void mo62774K7() {
        super.mo62774K7();
        this.f108266v = getIntent().getBooleanExtra("quit_room", false);
    }

    /* renamed from: N7 */
    public void mo62762N7(View view, int i, long j) {
        C72996z1 z1Var;
        String str;
        C44673z4 Lo;
        SelectMemberUI.C40249f b = this.f108221j.getItem(i);
        if (b == null || (z1Var = b.f108239b) == null) {
            Log.m105920e("MicroMsg.TransferRoomOwnerUI", "null == item || null == item.contact");
            return;
        }
        String username = z1Var.getUsername();
        if (!Util.isNullOrNil(z1Var.mo73969n2())) {
            str = z1Var.mo73969n2();
        } else {
            C44661m1 m1Var = this.f108222n;
            str = m1Var == null ? null : m1Var.mo69789q2(z1Var.getUsername());
        }
        if (Util.isNullOrNil(str)) {
            str = z1Var.mo62909j3();
        }
        if (!z1Var.mo62927s3() && (Lo = ((C44651a5) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mm0()).mo69630Lo(z1Var.getUsername())) != null && !Util.isNullOrNil(Lo.field_conRemark)) {
            str = Lo.field_conRemark;
        }
        String a = C47806g.m53116a(z1Var);
        if (!TextUtils.isEmpty(a)) {
            str = str + a;
        }
        C76879j.m92750u(this, !this.f108266v ? getString(C0966R.string.i9q, new Object[]{str}) : getString(C0966R.string.i8e, new Object[]{str}), "", new C40262k2(this, username), new C40263l2(this));
    }

    /* renamed from: P7 */
    public boolean mo62779P7() {
        return false;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (C72996z1.m85847r5(this.f108223o)) {
            C86709a0.m107529k().f251779b.mo123455a(811, this);
        } else {
            C86709a0.m107529k().f251779b.mo123455a(C1915z5.CTRL_INDEX, this);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C89779i0 i0Var = this.f108265u;
        if (i0Var != null && i0Var.isShowing()) {
            this.f108265u.dismiss();
        }
        if (C72996z1.m85847r5(this.f108223o)) {
            C86709a0.m107529k().f251779b.mo123470p(811, this);
        } else {
            C86709a0.m107529k().f251779b.mo123470p(C1915z5.CTRL_INDEX, this);
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C89779i0 i0Var = this.f108265u;
        if (i0Var != null && i0Var.isShowing()) {
            this.f108265u.dismiss();
        }
        if (yVar.getType() != 990 && yVar.getType() != 811) {
            return;
        }
        if (i == 0 && i2 == 0) {
            if (C72996z1.m85847r5(this.f108223o)) {
                Log.m105925i("MicroMsg.TransferRoomOwnerUI", "dz[onSceneEnd transfer successfully],owner_username:%s", ((C48465k) yVar).getUsername());
            } else {
                Log.m105925i("MicroMsg.TransferRoomOwnerUI", "dz[onSceneEnd transfer successfully],owner_username:%s", ((C47053y) yVar).f126458f);
            }
            C76912y0.makeText((Context) this, (int) C0966R.string.i9o, 1).show();
            Intent intent = new Intent(getContext(), ChatroomInfoUI.class);
            intent.putExtra("RoomInfo_Id", this.f108223o);
            intent.putExtra("Chat_User", this.f108223o);
            intent.putExtra("Is_Chatroom", true);
            intent.setFlags(67108864);
            AppCompatActivity context = getContext();
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            AppCompatActivity appCompatActivity = context;
            C117292a.m165358d(appCompatActivity, aVar.mo10232b(), "com/tencent/mm/chatroom/ui/TransferRoomOwnerUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(appCompatActivity, "com/tencent/mm/chatroom/ui/TransferRoomOwnerUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            finish();
            return;
        }
        C76912y0.makeText((Context) this, (int) C0966R.string.i9n, 1).show();
        Log.m105929w("MicroMsg.TransferRoomOwnerUI", "dz[onSceneEnd transfer failed: %d %d %s", Integer.valueOf(i), Integer.valueOf(i2), str);
    }
}
