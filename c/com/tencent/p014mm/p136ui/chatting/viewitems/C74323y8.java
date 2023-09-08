package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.y8 */
public final class C74323y8 extends C74023i.C74026c {

    /* renamed from: b */
    public TextView f218321b;

    /* renamed from: c */
    public RelativeLayout f218322c;

    /* renamed from: d */
    public ImageView f218323d;

    /* renamed from: e */
    public TextView f218324e;

    /* renamed from: f */
    public TextView f218325f;

    /* renamed from: g */
    public WeImageView f218326g;

    /* renamed from: h */
    public TextView f218327h;

    /* renamed from: a */
    public C74023i.C74026c mo103296a(View view) {
        super.create(view);
        this.f218321b = (TextView) view.findViewById(C0966R.C0970id.b2a);
        this.f218322c = (RelativeLayout) view.findViewById(C0966R.C0970id.b1z);
        this.f218323d = (ImageView) view.findViewById(C0966R.C0970id.b1t);
        this.f218324e = (TextView) view.findViewById(C0966R.C0970id.b28);
        this.f218325f = (TextView) view.findViewById(C0966R.C0970id.b29);
        this.f218326g = (WeImageView) view.findViewById(C0966R.C0970id.b1u);
        this.f218327h = (TextView) view.findViewById(C0966R.C0970id.b2_);
        this.maskView = view.findViewById(C0966R.C0970id.b7h);
        return this;
    }

    public View getMainContainerView() {
        return this.f218322c;
    }
}
