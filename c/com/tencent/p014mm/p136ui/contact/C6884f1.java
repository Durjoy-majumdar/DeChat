package com.tencent.p014mm.p136ui.contact;

import android.content.Intent;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f62.C7994b0;

/* renamed from: com.tencent.mm.ui.contact.f1 */
public class C6884f1 implements MMFragmentActivity$$f {

    /* renamed from: a */
    public final /* synthetic */ GroupCardSelectUI f24521a;

    /* renamed from: com.tencent.mm.ui.contact.f1$a */
    public class C6885a implements C7994b0.C7997c {
        public C6885a() {
        }

        /* renamed from: a */
        public void mo1114a(boolean z, String str, String str2) {
            if (z) {
                Intent intent = new Intent();
                intent.putExtra("Select_Conv_User", str2);
                intent.putExtra("key_has_create_new_group", 1);
                C6884f1.this.f24521a.setResult(-1, intent);
                C6884f1.this.f24521a.finish();
            }
        }
    }

    public C6884f1(GroupCardSelectUI groupCardSelectUI) {
        this.f24521a = groupCardSelectUI;
    }

    public void mmOnActivityResult(int i, int i2, Intent intent) {
        if (i == 10001 && i2 == -1) {
            String stringExtra = intent.getStringExtra("Select_Contact");
            Log.m105924i("MicroMsg.GroupCardSelectUI", "CreateNewGroup select contact return");
            if (Util.isNullOrNil(stringExtra)) {
                Log.m105924i("MicroMsg.GroupCardSelectUI", "CreateNewGroup select contact return");
            }
            ((C7994b0) C86312j.m106911c(C7994b0.class)).mo9097iq(this.f24521a.getContext(), (C7994b0.C7996b) this.f24521a.getIntent().getSerializableExtra("key_bind_param"), stringExtra, new C6885a());
        }
    }
}
