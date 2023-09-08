package com.tencent.p014mm.p136ui.contact.privacy;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.p014mm.plugin.label.p067ui.ContactLabelManagerUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import nj3.C11184p0;

/* renamed from: com.tencent.mm.ui.contact.privacy.a */
public class C6931a implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ ContactMgrUIBase f24618d;

    public C6931a(ContactMgrUIBase contactMgrUIBase) {
        this.f24618d = contactMgrUIBase;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (i == 0) {
            Log.m105924i("MicroMsg.ContactMgrUIBase", "setOnMenuSelectedListener , MENU_ID_LABEL.");
            Intent intent = new Intent(this.f24618d, ContactLabelManagerUI.class);
            intent.putExtra("select_label", true);
            intent.putExtra("intent_status_from_privacy_setting", true);
            intent.putExtra("privacy_source_type", this.f24618d.f24547g.mo7911v());
            intent.putExtra("group_multi_select", true);
            this.f24618d.startActivityForResult(intent, 4);
        } else if (i == 1) {
            Log.m105924i("MicroMsg.ContactMgrUIBase", "setOnMenuSelectedListener , MENU_ID_CHATROOM.");
            Intent intent2 = new Intent(this.f24618d, CommonSelectChatRoomUI.class);
            intent2.putExtra("group_multi_select", true);
            intent2.putExtra("group_select_need_result", true);
            intent2.putExtra("group_multi_select", true);
            intent2.putExtra("privacy_source_type", this.f24618d.f24547g.mo7911v());
            intent2.putExtra("max_limit_num", this.f24618d.getIntent().getIntExtra("max_limit_num", 50));
            this.f24618d.startActivityForResult(intent2, 3);
        } else if (i != 2) {
            this.f24618d.mo7902J7();
        } else {
            this.f24618d.mo7902J7();
        }
    }
}
