package com.tencent.p014mm.chatroom.p015ui;

import java.util.HashMap;
import java.util.Map;
import q31.C118148a;

/* renamed from: com.tencent.mm.chatroom.ui.q */
public class C67985q implements C118148a {

    /* renamed from: a */
    public final /* synthetic */ ChatroomInfoUI f195123a;

    public C67985q(ChatroomInfoUI chatroomInfoUI) {
        this.f195123a = chatroomInfoUI;
    }

    /* renamed from: a */
    public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
        return false;
    }

    /* renamed from: b */
    public Map<String, Object> mo37b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("exit_group_or_del_contact_with_clear_history_or_not", Integer.valueOf(this.f195123a.f194794g ? 1 : 2));
        return hashMap;
    }
}
