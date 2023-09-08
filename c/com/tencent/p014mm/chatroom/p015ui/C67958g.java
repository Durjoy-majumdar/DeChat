package com.tencent.p014mm.chatroom.p015ui;

import java.util.HashMap;
import java.util.Map;
import q31.C118148a;

/* renamed from: com.tencent.mm.chatroom.ui.g */
public class C67958g implements C118148a {

    /* renamed from: a */
    public final /* synthetic */ ChatroomInfoUI f195078a;

    public C67958g(ChatroomInfoUI chatroomInfoUI) {
        this.f195078a = chatroomInfoUI;
    }

    /* renamed from: a */
    public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
        return false;
    }

    /* renamed from: b */
    public Map<String, Object> mo37b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("exit_group_or_del_contact_with_clear_history_or_not", Integer.valueOf(this.f195078a.f194794g ? 1 : 2));
        return hashMap;
    }
}
