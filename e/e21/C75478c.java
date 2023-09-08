package e21;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.plugin.p019aa.p020ui.C68275c1;
import com.tencent.p014mm.wallet_core.p137ui.C7092q;
import di3.C86312j;
import e21.C75473a;
import ke3.C88144b;
import p768ys.C79152e;
import xz1.C79013a;

/* renamed from: e21.c */
public final class C75478c implements C7092q.C7093a {

    /* renamed from: a */
    public final /* synthetic */ C75473a f221798a;

    /* renamed from: b */
    public final /* synthetic */ C79013a f221799b;

    public C75478c(C75473a aVar, C79013a aVar2) {
        this.f221798a = aVar;
        this.f221799b = aVar2;
    }

    public final void onClick(View view) {
        C75473a.C75474a aVar = this.f221798a.f221789f;
        if (aVar != null) {
            C79013a aVar2 = this.f221799b;
            C68275c1.C68279d dVar = (C68275c1.C68279d) aVar;
            Intent intent = new Intent();
            intent.putExtra("key_group_solitatire_create", false);
            intent.putExtra("key_group_solitatire_key", aVar2.field_key);
            intent.putExtra("key_group_solitatire_chatroom_username", aVar2.field_username);
            intent.putExtra("KEY_GROUP_SOLITATIRE_READ_ONLY", true);
            ((C79152e) C86312j.m106911c(C79152e.class)).mo109135kP(C68275c1.this.f196287d.f196141j, aVar2);
            C88144b.m109791i(C68275c1.this.f196287d.getContext(), "groupsolitaire", ".ui.GroupSolitatireEditUI", intent, (Bundle) null);
        }
    }
}
