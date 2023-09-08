package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.k8 */
public class C74088k8 extends C74023i.C74026c {
    /* renamed from: a */
    public C74023i.C74026c mo103158a(View view, boolean z) {
        super.create(view);
        this.timeTV = (TextView) view.findViewById(C0966R.C0970id.b8z);
        TextView textView = (TextView) view.findViewById(C0966R.C0970id.b_0);
        this.clickArea = view.findViewById(C0966R.C0970id.b47);
        this.stateIV = (ImageView) view.findViewById(C0966R.C0970id.b8v);
        this.checkBox = (CheckBox) view.findViewById(C0966R.C0970id.b46);
        this.maskView = view.findViewById(C0966R.C0970id.b7h);
        return this;
    }
}
