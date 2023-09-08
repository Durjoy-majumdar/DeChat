package com.tencent.p014mm.chatroom.p015ui;

import android.view.View;
import android.widget.CheckBox;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.chatroom.ui.p */
public class C67983p implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ChatroomInfoUI f195121d;

    public C67983p(ChatroomInfoUI chatroomInfoUI) {
        this.f195121d = chatroomInfoUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/chatroom/ui/ChatroomInfoUI$24", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view instanceof CheckBox) {
            this.f195121d.f194794g = ((CheckBox) view).isChecked();
        }
        Preference a = this.f195121d.f194795h.mo72519a("room_clear_chatting_history");
        if (a instanceof RoomClearHistoryPreference) {
            ((RoomClearHistoryPreference) a).f194914J = !this.f195121d.f194794g;
        }
        Preference a2 = this.f195121d.f194795h.mo72519a("room_del_quit");
        if (a2 instanceof RoomButtonPreference) {
            ((RoomButtonPreference) a2).f194910U = !this.f195121d.f194794g;
        }
        C117292a.m165361g(this, "com/tencent/mm/chatroom/ui/ChatroomInfoUI$24", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
