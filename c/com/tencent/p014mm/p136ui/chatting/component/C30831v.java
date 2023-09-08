package com.tencent.p014mm.p136ui.chatting.component;

import a11.C39479c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p530fx.C45819c;

/* renamed from: com.tencent.mm.ui.chatting.component.v */
public class C30831v implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f82845d;

    public C30831v(ChatroomComponent chatroomComponent, String str) {
        this.f82845d = str;
    }

    public void run() {
        C44661m1 Lo;
        ArrayList arrayList = (ArrayList) ((C44660i2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku()).mo69735F((List<String>) null);
        Log.m105925i("MicroMsg.ChattingUI.ChatroomComponent", "checkConversationsForGetRoomInfo conversation size:%s", Integer.valueOf(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!C72996z1.m85847r5(str) && !Util.isEqual(this.f82845d, str) && (Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(str)) != null) {
                if ((((long) Lo.field_chatroomStatus) & 2097152) == 2097152 && Util.isNullOrNil(Lo.field_associateOpenIMRoomName)) {
                    ((C45819c) C86312j.m106911c(C45819c.class)).mo71192mK(str).mo71504o(str).mo100865c();
                    Log.m105925i("MicroMsg.ChattingUI.ChatroomComponent", "checkConversationsForGetRoomInfo %s", str);
                }
            }
        }
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_OPEN_IM_MIGRATE_CHECK_ALL_CONVERSATION_BOOLEAN_SYNC, Boolean.FALSE);
    }
}
