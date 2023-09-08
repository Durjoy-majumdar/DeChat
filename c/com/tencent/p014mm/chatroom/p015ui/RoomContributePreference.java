package com.tencent.p014mm.chatroom.p015ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.MaskLayout;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import p196ln.C76705f;

/* renamed from: com.tencent.mm.chatroom.ui.RoomContributePreference */
public class RoomContributePreference extends Preference {

    /* renamed from: J */
    public ImageView f10167J;

    public RoomContributePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        if (this.f10167J != null && !Util.isNullOrNil((String) null)) {
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(this.f10167J, (String) null);
        }
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        View x = super.mo1087x(viewGroup);
        MaskLayout maskLayout = (MaskLayout) x.findViewById(C0966R.C0970id.f4x);
        this.f10167J = (ImageView) x.findViewById(C0966R.C0970id.f39);
        return x;
    }

    public RoomContributePreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f121271G = C0966R.C0971layout.bcy;
        this.f121272H = C0966R.C0971layout.bee;
    }
}
