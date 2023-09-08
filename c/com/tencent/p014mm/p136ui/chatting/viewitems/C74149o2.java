package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.o2 */
public class C74149o2 extends C74023i.C74026c {

    /* renamed from: b */
    public TextView f217663b;

    /* renamed from: c */
    public ImageView f217664c;

    /* renamed from: a */
    public C74149o2 mo103203a(View view, boolean z) {
        super.create(view);
        this.f217663b = (TextView) view.findViewById(C0966R.C0970id.g4p);
        this.userTV = (TextView) view.findViewById(C0966R.C0970id.b9_);
        this.f217664c = (ImageView) view.findViewById(C0966R.C0970id.g4q);
        this.checkBox = (CheckBox) view.findViewById(C0966R.C0970id.b46);
        this.maskView = view.findViewById(C0966R.C0970id.b7h);
        return this;
    }
}
