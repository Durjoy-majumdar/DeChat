package com.tencent.p014mm.chatroom.p015ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72996z1;
import d62.C75339i;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import f62.C7994b0;
import gy3.C87412m;
import java.io.Serializable;
import kg3.C76577a;
import kotlin.Metadata;
import p196ln.C76705f;
import p629ny.C76979h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/chatroom/ui/ChatRoomBindAppUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "ui-chatroom_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.chatroom.ui.ChatRoomBindAppUI */
public final class ChatRoomBindAppUI extends MMActivity {

    /* renamed from: d */
    public C7994b0.C7996b f10136d;

    public int getLayoutId() {
        return C0966R.C0971layout.f6810p6;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        Intent intent = getIntent();
        String str = null;
        Serializable serializableExtra = intent != null ? intent.getSerializableExtra("key_bind_param") : null;
        C7994b0.C7996b bVar = serializableExtra instanceof C7994b0.C7996b ? (C7994b0.C7996b) serializableExtra : null;
        this.f10136d = bVar;
        if (bVar == null) {
            Log.m105920e("MicroMsg.ChatRoomBindAppUI", "openParam is null");
            finish();
            return;
        }
        String str2 = "";
        setMMTitle(str2);
        setBackBtn(new C1200a(this), C0966R.raw.actionbar_icon_dark_close);
        View findViewById = findViewById(C0966R.C0970id.alb);
        C87412m.m108593f(findViewById, "findViewById(R.id.btn_bind)");
        ((Button) findViewById).setOnClickListener(new C1204b(this));
        View findViewById2 = findViewById(C0966R.C0970id.kvi);
        C87412m.m108593f(findViewById2, "findViewById(R.id.tv_bind_app_title)");
        TextView textView = (TextView) findViewById2;
        Context context = MMApplicationContext.getContext();
        Object[] objArr = new Object[1];
        C7994b0.C7996b bVar2 = this.f10136d;
        String str3 = bVar2 != null ? bVar2.f26682h : null;
        if (str3 == null) {
            str3 = str2;
        }
        objArr[0] = str3;
        textView.setText(context.getString(C0966R.string.b3y, objArr));
        C44668u3 Ni = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni();
        C7994b0.C7996b bVar3 = this.f10136d;
        C72996z1 z1Var = Ni.get(bVar3 != null ? bVar3.f26684j : null);
        if (z1Var == null) {
            Log.m105920e("MicroMsg.ChatRoomBindAppUI", "contact is null");
            finish();
            return;
        }
        View findViewById3 = findViewById(C0966R.C0970id.fcc);
        C87412m.m108593f(findViewById3, "findViewById(R.id.iv_avatar)");
        ImageView imageView = (ImageView) findViewById3;
        C76705f fVar = (C76705f) C86312j.m106911c(C76705f.class);
        C7994b0.C7996b bVar4 = this.f10136d;
        fVar.mo106849z(imageView, bVar4 != null ? bVar4.f26684j : null);
        View findViewById4 = findViewById(C0966R.C0970id.kwq);
        C87412m.m108593f(findViewById4, "findViewById(R.id.tv_group_nickname)");
        ((TextView) findViewById4).setText(((C76979h) C86312j.m106911c(C76979h.class)).op0(getContext(), ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(z1Var.getUsername()), C76577a.m92157h(getContext(), C0966R.dimen.f3927j7)));
        View findViewById5 = findViewById(C0966R.C0970id.kvj);
        C87412m.m108593f(findViewById5, "findViewById(R.id.tv_bind_desc)");
        TextView textView2 = (TextView) findViewById5;
        Context context2 = MMApplicationContext.getContext();
        Object[] objArr2 = new Object[1];
        C7994b0.C7996b bVar5 = this.f10136d;
        if (bVar5 != null) {
            str = bVar5.f26682h;
        }
        if (str != null) {
            str2 = str;
        }
        objArr2[0] = str2;
        textView2.setText(context2.getString(C0966R.string.b3z, objArr2));
    }
}
