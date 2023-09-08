package hl3;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.contact.privacy.CommonSelectChatRoomUI;
import com.tencent.p014mm.p136ui.contact.privacy.SelectPrivacyContactsFromRangeUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C75592q0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p740wo.C53193b;

/* renamed from: hl3.b */
public class C76237b implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ CommonSelectChatRoomUI f223333d;

    public C76237b(CommonSelectChatRoomUI commonSelectChatRoomUI) {
        this.f223333d = commonSelectChatRoomUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        List<String> k5;
        CommonSelectChatRoomUI commonSelectChatRoomUI = this.f223333d;
        int i = CommonSelectChatRoomUI.f219115E;
        ArrayList<String> i8 = commonSelectChatRoomUI.mo103593i8(false);
        commonSelectChatRoomUI.getClass();
        Log.m105925i("MicroMsg.CommonSelectChatRoomUI", "sns post who can see scene,users=%s", i8.toString());
        ArrayList<String> i84 = commonSelectChatRoomUI.mo103593i8(false);
        HashSet hashSet = new HashSet();
        if (!Util.isNullOrNil((List) i84)) {
            for (int i2 = 0; i2 < i84.size(); i2++) {
                if (!Util.isNullOrNil(i84.get(i2)) && (k5 = ((C53193b) C86312j.m106911c(C53193b.class)).mo73727k5(i84.get(i2))) != null) {
                    hashSet.addAll(k5);
                }
            }
        }
        Log.m105925i("MicroMsg.CommonSelectChatRoomUI", "handleSelect, tagList=%s.", hashSet.toString());
        String s = C75592q0.m90789s();
        if (hashSet.contains(s)) {
            hashSet.remove(s);
        }
        Intent intent = new Intent(commonSelectChatRoomUI, SelectPrivacyContactsFromRangeUI.class);
        intent.putExtra("list_type", 1);
        intent.putExtra("privacy_source_type", commonSelectChatRoomUI.f219117D);
        intent.putExtra("privacy_menu_enter_type", 2);
        intent.putExtra("privacy_select_chatroom_or_lebal_count", i84.size());
        intent.putExtra("without_openim", true);
        intent.putExtra("need_show_all_selected", true);
        intent.putExtra("filter_type", "@all.contact.without.chatroom.without.openim");
        intent.putExtra("titile", commonSelectChatRoomUI.getResources().getString(C0966R.string.hm6));
        intent.putExtra("list_type", 1);
        intent.putExtra("already_select_contact", (String[]) hashSet.toArray(new String[0]));
        commonSelectChatRoomUI.startActivityForResult(intent, 0);
        return true;
    }
}
