package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.p136ui.widget.MMTextView;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.j3 */
public class C57771j3 extends C74023i.C74026c {

    /* renamed from: b */
    public MMNeat7extView f165335b;

    /* renamed from: c */
    public MMTextView f165336c;

    /* renamed from: d */
    public View f165337d;

    /* renamed from: e */
    public View f165338e;

    public C57771j3(View view, Boolean bool) {
        super.create(view);
        this.userTV = (TextView) view.findViewById(C0966R.C0970id.b9_);
        this.f165335b = (MMNeat7extView) view.findViewById(C0966R.C0970id.jic);
        this.f165336c = (MMTextView) view.findViewById(C0966R.C0970id.jid);
        this.f165337d = view.findViewById(C0966R.C0970id.jie);
        this.f165338e = view.findViewById(C0966R.C0970id.jif);
        bool.booleanValue();
    }
}
