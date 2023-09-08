package com.tencent.p014mm.plugin.setting.p102ui.setting;

import com.tencent.p014mm.autogen.events.PostSnsTagMemberOptionEvent;
import com.tencent.p014mm.autogen.events.SnsPermissionNotifyEvent;
import com.tencent.p014mm.plugin.setting.p102ui.setting.UnfamiliarContactDetailUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C45628s0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.b4 */
public class C71138b4 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ HashSet f205927d;

    /* renamed from: e */
    public final /* synthetic */ int f205928e;

    /* renamed from: f */
    public final /* synthetic */ UnfamiliarContactDetailUI f205929f;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.b4$a */
    public class C71139a implements Runnable {
        public C71139a() {
        }

        public void run() {
            C71138b4.this.f205929f.f205871q.notifyDataSetChanged();
            C71138b4.this.f205929f.mo97808J7(false);
        }
    }

    public C71138b4(UnfamiliarContactDetailUI unfamiliarContactDetailUI, HashSet hashSet, int i) {
        this.f205929f = unfamiliarContactDetailUI;
        this.f205927d = hashSet;
        this.f205928e = i;
    }

    public void run() {
        LinkedList linkedList = new LinkedList();
        Iterator it = this.f205927d.iterator();
        while (it.hasNext()) {
            UnfamiliarContactDetailUI.C71125i F4 = this.f205929f.f205871q.mo97816F4(((Integer) it.next()).intValue());
            Log.m105925i("MicroMsg.UnfamiliarContactUI", "username:%s index:%s", F4.f205895c.getUsername(), Integer.valueOf(this.f205928e));
            int i = this.f205928e;
            if (i == 0) {
                SnsPermissionNotifyEvent snsPermissionNotifyEvent = new SnsPermissionNotifyEvent();
                SnsPermissionNotifyEvent.C40168a aVar = snsPermissionNotifyEvent.f107766d;
                aVar.f107768b = false;
                aVar.f107767a = true;
                aVar.f107769c = F4.f205895c.getUsername();
                snsPermissionNotifyEvent.publish();
                linkedList.add(F4.f205895c.getUsername());
            } else if (i == 1) {
                F4.f205895c.mo62906h4();
                SnsPermissionNotifyEvent snsPermissionNotifyEvent2 = new SnsPermissionNotifyEvent();
                SnsPermissionNotifyEvent.C40168a aVar2 = snsPermissionNotifyEvent2.f107766d;
                aVar2.f107768b = true;
                aVar2.f107767a = false;
                aVar2.f107769c = F4.f205895c.getUsername();
                snsPermissionNotifyEvent2.publish();
                C45628s0.m50783k0(F4.f205895c);
            }
        }
        if (linkedList.size() > 0) {
            PostSnsTagMemberOptionEvent postSnsTagMemberOptionEvent = new PostSnsTagMemberOptionEvent();
            PostSnsTagMemberOptionEvent.C40153a aVar3 = postSnsTagMemberOptionEvent.f107691d;
            aVar3.f107696e = linkedList;
            aVar3.f107692a = 1;
            aVar3.f107693b = 5;
            postSnsTagMemberOptionEvent.publish();
            return;
        }
        this.f205929f.runOnUiThread(new C71139a());
    }
}
