package com.tencent.p014mm.p136ui.chatting.component;

import a11.C39479c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p644pi.C77089d;

/* renamed from: com.tencent.mm.ui.chatting.component.w */
public class C30832w implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f82846d;

    public C30832w(ChatroomComponent chatroomComponent, String str) {
        this.f82846d = str;
    }

    public void run() {
        C44661m1 Lo;
        ArrayList arrayList = (ArrayList) ((C44660i2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku()).mo69735F((List<String>) null);
        Log.m105925i("MicroMsg.ChattingUI.ChatroomComponent", "checkConversationsForMigration conversation size:%s", Integer.valueOf(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!C72996z1.m85847r5(str) && !Util.isEqual(this.f82846d, str) && (Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(str)) != null) {
                if (Lo.field_openIMRoomMigrateStatus == 1) {
                    Log.m105925i("MicroMsg.ChattingUI.ChatroomComponent", "checkConversationsForMigration %s", str);
                    ((C77089d) C86312j.m106911c(C77089d.class)).yx0().mo72068c(str, Lo.field_associateOpenIMRoomName);
                }
            }
        }
    }
}
