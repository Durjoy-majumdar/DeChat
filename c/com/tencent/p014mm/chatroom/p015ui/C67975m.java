package com.tencent.p014mm.chatroom.p015ui;

import android.view.MenuItem;
import android.view.View;
import di3.C86312j;
import java.util.HashMap;
import java.util.Map;
import l31.C61212e;
import nj3.C11183n0;
import q31.C118148a;

/* renamed from: com.tencent.mm.chatroom.ui.m */
public class C67975m implements C11183n0 {

    /* renamed from: a */
    public final /* synthetic */ ChatroomInfoUI f195107a;

    /* renamed from: com.tencent.mm.chatroom.ui.m$a */
    public class C67976a implements C118148a {
        public C67976a() {
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public Map<String, Object> mo37b(String str) {
            HashMap hashMap = new HashMap();
            hashMap.put("exit_group_or_del_contact_with_clear_history_or_not", Integer.valueOf(C67975m.this.f195107a.f194794g ? 1 : 2));
            return hashMap;
        }
    }

    public C67975m(ChatroomInfoUI chatroomInfoUI) {
        this.f195107a = chatroomInfoUI;
    }

    /* renamed from: a */
    public void mo2585a(View view, int i, MenuItem menuItem) {
        if (menuItem.getItemId() == 0) {
            ((C61212e) C86312j.m106911c(C61212e.class)).se0(view).o30(view, "delete_group_after_quit_confirm_button").E60(view, new C67976a()).mo86175pO(view, 8, 26501);
        }
    }
}
