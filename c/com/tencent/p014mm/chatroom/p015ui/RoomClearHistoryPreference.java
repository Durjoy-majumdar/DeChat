package com.tencent.p014mm.chatroom.p015ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import di3.C86312j;
import java.util.HashMap;
import java.util.Map;
import l31.C61212e;
import q31.C118148a;
import u24.C90599h;

/* renamed from: com.tencent.mm.chatroom.ui.RoomClearHistoryPreference */
public class RoomClearHistoryPreference extends Preference {

    /* renamed from: J */
    public boolean f194914J;

    /* renamed from: K */
    public View f194915K;

    /* renamed from: com.tencent.mm.chatroom.ui.RoomClearHistoryPreference$a */
    public class C67907a implements C118148a {
        public C67907a() {
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public Map<String, Object> mo37b(String str) {
            HashMap hashMap = new HashMap();
            if (C90599h.m113509b(str, "view_clk")) {
                hashMap.put("exit_group_or_del_contact_with_clear_history_or_not", Integer.valueOf(RoomClearHistoryPreference.this.f194914J ? 2 : 1));
            }
            return hashMap;
        }
    }

    public RoomClearHistoryPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        ((C61212e) C86312j.m106911c(C61212e.class)).se0(view).o30(view, "clear_history_room_button").E60(view, new C67907a()).mo86175pO(view, 8, 26501);
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        View x = super.mo1087x(viewGroup);
        this.f194915K = x;
        return x;
    }

    public RoomClearHistoryPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RoomClearHistoryPreference(Context context) {
        super(context);
    }
}
