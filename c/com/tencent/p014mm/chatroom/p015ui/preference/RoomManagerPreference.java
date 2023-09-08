package com.tencent.p014mm.chatroom.p015ui.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import java.util.LinkedList;
import java.util.List;
import p196ln.C76705f;

/* renamed from: com.tencent.mm.chatroom.ui.preference.RoomManagerPreference */
public class RoomManagerPreference extends Preference {

    /* renamed from: J */
    public List<C72996z1> f10256J = new LinkedList();

    public RoomManagerPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        Class cls = C76705f.class;
        super.mo1086w(view);
        ((TextView) view.findViewById(C0966R.C0970id.knx)).setText(this.f121279i);
        ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.f16);
        ImageView imageView2 = (ImageView) view.findViewById(C0966R.C0970id.f17);
        ImageView imageView3 = (ImageView) view.findViewById(C0966R.C0970id.f18);
        imageView.setVisibility(4);
        imageView2.setVisibility(4);
        imageView3.setVisibility(4);
        for (int i = 0; i < ((LinkedList) this.f10256J).size(); i++) {
            if (i == 0) {
                ((C76705f) C86312j.m106911c(cls)).D20(imageView, ((C72996z1) ((LinkedList) this.f10256J).get(0)).getUsername(), 0.15f);
                imageView.setVisibility(0);
            } else if (1 == i) {
                ((C76705f) C86312j.m106911c(cls)).D20(imageView2, ((C72996z1) ((LinkedList) this.f10256J).get(1)).getUsername(), 0.15f);
                imageView2.setVisibility(0);
            } else if (2 == i) {
                imageView3.setVisibility(0);
                ((C76705f) C86312j.m106911c(cls)).D20(imageView3, ((C72996z1) ((LinkedList) this.f10256J).get(2)).getUsername(), 0.15f);
            }
        }
    }

    public RoomManagerPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
