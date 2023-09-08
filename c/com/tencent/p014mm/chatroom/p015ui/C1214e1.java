package com.tencent.p014mm.chatroom.p015ui;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C45612m0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import nj3.C76912y0;

/* renamed from: com.tencent.mm.chatroom.ui.e1 */
public class C1214e1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ManagerRoomByWeworkUI f10245d;

    public C1214e1(ManagerRoomByWeworkUI managerRoomByWeworkUI) {
        this.f10245d = managerRoomByWeworkUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.ManagerRoomByWeworkUI", "select_group_ll click");
        ManagerRoomByWeworkUI managerRoomByWeworkUI = this.f10245d;
        managerRoomByWeworkUI.f108093H = 1;
        if (managerRoomByWeworkUI.f108091F.f108121h == 5) {
            C76912y0.makeText((Context) managerRoomByWeworkUI, (int) C0966R.string.k8k, 0).show();
            C117292a.m165361g(this, "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(this.f10245d, "com.tencent.mm.ui.contact.GroupCardSelectUI");
        intent.putExtra("group_select_type", true);
        intent.putExtra("group_select_need_result", true);
        intent.putExtra("group_select_only_need_self_owner", true);
        intent.putExtra("group_select_filter_associate_chat_room", true);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((ArrayList) this.f10245d.f108098h).iterator();
        while (it.hasNext()) {
            arrayList2.add(((C72996z1) it.next()).getUsername());
        }
        intent.putStringArrayListExtra("group_select_block_chatroom", arrayList2);
        intent.putExtra("group_select_chatroom_max_num", C45612m0.m50699p());
        this.f10245d.startActivityForResult(intent, 0);
        C117292a.m165361g(this, "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
