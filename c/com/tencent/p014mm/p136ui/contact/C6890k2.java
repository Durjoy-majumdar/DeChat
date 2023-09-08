package com.tencent.p014mm.p136ui.contact;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.BatchSocialBlackLogStruct;
import com.tencent.p014mm.plugin.label.p067ui.ContactLabelManagerUI;
import com.tencent.p014mm.pluginsdk.platformtools.ContactBlackListHelper;
import java.util.ArrayList;
import java.util.List;
import jr2.C99019x;
import ke3.C88144b;
import nj3.C11184p0;
import os2.C11766m0;

/* renamed from: com.tencent.mm.ui.contact.k2 */
public class C6890k2 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ OnlyChatContactMgrUI f24526d;

    public C6890k2(OnlyChatContactMgrUI onlyChatContactMgrUI) {
        this.f24526d = onlyChatContactMgrUI;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        this.f24526d.f24435t = new BatchSocialBlackLogStruct();
        if (i == 0) {
            List<String> Ow = ((C11766m0) C99019x.m128974f()).mo11651Ow(5);
            Intent intent = new Intent(this.f24526d, SelectContactsFromRangeUI.class);
            intent.putExtra("list_type", 1);
            intent.putExtra("filter_type", "@all.contact.without.chatroom.without.openim");
            intent.putExtra("already_select_contact", (String[]) Ow.toArray(new String[0]));
            intent.putExtra("max_limit_num", this.f24526d.f24432q);
            this.f24526d.startActivityForResult(intent, 1);
            BatchSocialBlackLogStruct batchSocialBlackLogStruct = this.f24526d.f24435t;
            batchSocialBlackLogStruct.f9633d = 1;
            batchSocialBlackLogStruct.f9642m = System.currentTimeMillis();
        } else if (i == 1) {
            Intent intent2 = new Intent(this.f24526d, SelectContactsFromRangeUI.class);
            intent2.putExtra("list_type", 1);
            intent2.putExtra("filter_type", "@all.contact.android");
            intent2.putExtra("already_select_contact", (String[]) ((ArrayList) ContactBlackListHelper.m6943b()).toArray(new String[0]));
            intent2.putExtra("max_limit_num", this.f24526d.f24432q);
            this.f24526d.startActivityForResult(intent2, 1);
            BatchSocialBlackLogStruct batchSocialBlackLogStruct2 = this.f24526d.f24435t;
            batchSocialBlackLogStruct2.f9633d = 2;
            batchSocialBlackLogStruct2.f9642m = System.currentTimeMillis();
        } else if (i != 2) {
            Intent intent3 = new Intent();
            intent3.putExtra("titile", this.f24526d.getString(C0966R.string.f7496hv));
            intent3.putExtra("list_type", 1);
            intent3.putExtra("KBlockOpenImFav", true);
            intent3.putExtra("without_openim", true);
            intent3.putExtra("show_too_many_member", false);
            C74560s1.m89276e();
            int g = C74560s1.m89278g(C74560s1.m89278g(C74560s1.f219161b, 536870912), 131072);
            intent3.putExtra("max_limit_num", this.f24526d.f24432q);
            intent3.putExtra("list_attr", g);
            intent3.putExtra("always_select_contact", "");
            C88144b.m109802t(this.f24526d, ".ui.contact.SelectContactUI", intent3, 1);
            BatchSocialBlackLogStruct batchSocialBlackLogStruct3 = this.f24526d.f24435t;
            batchSocialBlackLogStruct3.f9633d = 4;
            batchSocialBlackLogStruct3.f9642m = System.currentTimeMillis();
        } else {
            Intent intent4 = new Intent(this.f24526d, ContactLabelManagerUI.class);
            intent4.putExtra("select_label", true);
            this.f24526d.startActivityForResult(intent4, 3);
            BatchSocialBlackLogStruct batchSocialBlackLogStruct4 = this.f24526d.f24435t;
            batchSocialBlackLogStruct4.f9633d = 3;
            batchSocialBlackLogStruct4.f9642m = System.currentTimeMillis();
        }
    }
}
