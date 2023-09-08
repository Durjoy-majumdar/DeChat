package com.tencent.p014mm.chatroom.p015ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.p136ui.base.preference.ButtonPreference;
import di3.C86312j;
import java.util.HashMap;
import java.util.Map;
import l31.C61212e;
import q31.C118148a;
import u24.C90599h;

/* renamed from: com.tencent.mm.chatroom.ui.RoomButtonPreference */
public class RoomButtonPreference extends ButtonPreference {

    /* renamed from: U */
    public boolean f194910U;

    /* renamed from: V */
    public String f194911V;

    /* renamed from: W */
    public View f194912W;

    /* renamed from: com.tencent.mm.chatroom.ui.RoomButtonPreference$a */
    public class C67906a implements C118148a {
        public C67906a() {
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public Map<String, Object> mo37b(String str) {
            HashMap hashMap = new HashMap();
            if (C90599h.m113509b(str, "view_clk")) {
                hashMap.put("exit_group_or_del_contact_with_clear_history_or_not", Integer.valueOf(RoomButtonPreference.this.f194910U ? 2 : 1));
            }
            return hashMap;
        }
    }

    public RoomButtonPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        ((C61212e) C86312j.m106911c(C61212e.class)).se0(view).o30(view, this.f194911V).E60(view, new C67906a()).mo86175pO(view, 8, 26501);
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        View x = super.mo1087x(viewGroup);
        this.f194912W = x;
        return x;
    }

    public RoomButtonPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
