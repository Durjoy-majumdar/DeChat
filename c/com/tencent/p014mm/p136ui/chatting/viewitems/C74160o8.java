package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.view.FoldableCellLayout;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.o8 */
public final class C74160o8 extends C74191q8 {

    /* renamed from: i */
    public TextView f217687i;

    /* renamed from: j */
    public C74199r8 f217688j = new C74199r8();

    /* renamed from: k */
    public C74170p8 f217689k = new C74170p8();

    /* renamed from: a */
    public C74023i.C74026c mo103209a(View view) {
        super.mo103209a(view);
        this.f217687i = (TextView) view.findViewById(C0966R.C0970id.b8u);
        this.f217688j.f217820a = (ViewGroup) view.findViewById(C0966R.C0970id.b4d);
        this.f217689k.f217718a = (FoldableCellLayout) view.findViewById(C0966R.C0970id.f357677b62);
        return this;
    }
}
