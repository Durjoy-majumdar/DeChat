package com.tencent.p014mm.chatroom.p015ui.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;

/* renamed from: com.tencent.mm.chatroom.ui.preference.RoomCardPreference */
public class RoomCardPreference extends Preference {

    /* renamed from: J */
    public TextView f10250J;

    /* renamed from: K */
    public CharSequence f10251K;

    /* renamed from: L */
    public CharSequence f10252L;

    /* renamed from: M */
    public LinearLayout f10253M;

    /* renamed from: N */
    public View f10254N;

    /* renamed from: P */
    public boolean f10255P = false;

    public RoomCardPreference(Context context) {
        super(context);
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(C0966R.C0970id.br8).findViewById(C0966R.C0970id.f359398kp3);
        if (this.f10253M == null) {
            this.f10253M = (LinearLayout) viewGroup.getChildAt(1);
        }
        if (this.f10250J == null) {
            this.f10250J = (TextView) viewGroup.findViewById(C0966R.C0970id.ivt);
        }
        if (this.f10255P) {
            this.f10253M.setVisibility(0);
            this.f10250J.setVisibility(0);
        } else {
            this.f10253M.setVisibility(8);
            this.f10250J.setVisibility(8);
        }
        CharSequence charSequence = this.f10252L;
        if (charSequence != null) {
            this.f10250J.setText(charSequence);
        }
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        if (this.f10254N == null) {
            View x = super.mo1087x(viewGroup);
            ViewGroup viewGroup2 = (ViewGroup) x.findViewById(C0966R.C0970id.br8);
            viewGroup2.removeAllViews();
            View.inflate(this.f121274d, C0966R.C0971layout.bew, viewGroup2);
            this.f10254N = x;
        }
        return this.f10254N;
    }

    public RoomCardPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RoomCardPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f121271G = C0966R.C0971layout.bcy;
    }
}
