package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.a9 */
public final class C73929a9 extends C74023i.C74026c {

    /* renamed from: b */
    public TextView f216992b;

    /* renamed from: a */
    public C74023i.C74026c mo103012a(View view, boolean z) {
        super.create(view);
        this.timeTV = (TextView) view.findViewById(C0966R.C0970id.b8z);
        this.userTV = (TextView) view.findViewById(C0966R.C0970id.b9_);
        this.f216992b = (TextView) view.findViewById(C0966R.C0970id.b4b);
        this.checkBox = (CheckBox) view.findViewById(C0966R.C0970id.b46);
        this.maskView = view.findViewById(C0966R.C0970id.b7h);
        return this;
    }

    public View getMainContainerView() {
        return null;
    }
}
