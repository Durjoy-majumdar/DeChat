package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.z8 */
public final class C74330z8 extends C74023i.C74026c {

    /* renamed from: b */
    public TextView f218346b;

    /* renamed from: c */
    public ImageView f218347c;

    /* renamed from: a */
    public C74330z8 mo103297a(View view, boolean z) {
        super.create(view);
        this.f218346b = (TextView) view.findViewById(C0966R.C0970id.b2z);
        this.f218347c = (ImageView) view.findViewById(C0966R.C0970id.b3j);
        this.checkBox = (CheckBox) view.findViewById(C0966R.C0970id.b46);
        this.maskView = view.findViewById(C0966R.C0970id.b7h);
        return this;
    }

    public View getMainContainerView() {
        return null;
    }
}
