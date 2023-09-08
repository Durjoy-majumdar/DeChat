package com.tencent.p014mm.chatroom.p015ui;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Map;
import ob0.C117747y;
import p203mi.C47054z;

/* renamed from: com.tencent.mm.chatroom.ui.d1 */
public class C40258d1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ManagerRoomByWeworkUI f108269d;

    public C40258d1(ManagerRoomByWeworkUI managerRoomByWeworkUI) {
        this.f108269d = managerRoomByWeworkUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.ManagerRoomByWeworkUI", "click use");
        ManagerRoomByWeworkUI managerRoomByWeworkUI = this.f108269d;
        if (managerRoomByWeworkUI.f108095e == 3) {
            StringBuilder sb = new StringBuilder();
            managerRoomByWeworkUI.mo62745M7((C117747y) null, false);
            managerRoomByWeworkUI.f108102o = 0;
            managerRoomByWeworkUI.f108103p = 0;
            for (Map.Entry next : managerRoomByWeworkUI.f108100j.entrySet()) {
                if (((Boolean) next.getValue()).booleanValue()) {
                    managerRoomByWeworkUI.f108103p++;
                    sb.append((String) next.getKey());
                    sb.append(",");
                    C47054z zVar = ((ArrayList) managerRoomByWeworkUI.f108097g).contains(next.getKey()) ? new C47054z((String) next.getKey(), Util.nullAs(managerRoomByWeworkUI.f108096f, ""), 1) : new C47054z((String) next.getKey(), Util.nullAs(managerRoomByWeworkUI.f108096f, ""), 2);
                    managerRoomByWeworkUI.f108101n.put((String) next.getKey(), Boolean.FALSE);
                    C86709a0.m107524d().mo123460f(zVar);
                }
            }
            managerRoomByWeworkUI.mo62743J7(1);
            Log.m105925i("MicroMsg.ManagerRoomByWeworkUI", "doUpgradeAssociateChatRooms() :%s", sb);
        } else {
            Log.m105925i("MicroMsg.ManagerRoomByWeworkUI", "doUpgradeAssociateChatRoom() roomId:%s", managerRoomByWeworkUI.f108094d);
            C47054z zVar2 = new C47054z(managerRoomByWeworkUI.f108094d, Util.nullAs(managerRoomByWeworkUI.f108096f, ""), 0);
            C86709a0.m107524d().mo123460f(zVar2);
            managerRoomByWeworkUI.mo62745M7(zVar2, true);
        }
        C117292a.m165361g(this, "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
