package com.tencent.p014mm.chatroom.p015ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;

/* renamed from: com.tencent.mm.chatroom.ui.RoomGrantPreference */
public class RoomGrantPreference extends Preference {

    /* renamed from: J */
    public TextView f10168J = null;

    /* renamed from: K */
    public String f10169K = "";

    public RoomGrantPreference(Context context) {
        super(context);
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        if (this.f10168J == null) {
            this.f10168J = (TextView) view.findViewById(C0966R.C0970id.bsk);
        }
        TextView textView = this.f10168J;
        textView.setText(this.f10169K + "");
        super.mo1086w(view);
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        View x = super.mo1087x(viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) x.findViewById(C0966R.C0970id.br8);
        viewGroup2.removeAllViews();
        View.inflate(this.f121274d, C0966R.C0971layout.f359887be0, viewGroup2);
        return x;
    }

    public RoomGrantPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RoomGrantPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f121271G = C0966R.C0971layout.bcy;
        this.f121272H = C0966R.C0971layout.f359893bf2;
    }
}
