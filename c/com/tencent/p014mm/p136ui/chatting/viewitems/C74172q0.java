package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.q0 */
public class C74172q0 extends C74023i.C74026c {

    /* renamed from: b */
    public RelativeLayout f217721b;

    /* renamed from: c */
    public TextView f217722c;

    /* renamed from: d */
    public ImageView f217723d;

    /* renamed from: e */
    public ImageView f217724e;

    /* renamed from: a */
    public C74172q0 mo103214a(View view, boolean z) {
        super.create(view);
        this.timeTV = (TextView) this.convertView.findViewById(C0966R.C0970id.b8z);
        this.checkBox = (CheckBox) this.convertView.findViewById(C0966R.C0970id.b46);
        this.maskView = this.convertView.findViewById(C0966R.C0970id.b7h);
        this.userTV = (TextView) this.convertView.findViewById(C0966R.C0970id.b9_);
        this.clickArea = this.convertView.findViewById(C0966R.C0970id.f6124xz);
        this.f217721b = (RelativeLayout) this.convertView.findViewById(C0966R.C0970id.f6123xy);
        this.f217722c = (TextView) this.convertView.findViewById(C0966R.C0970id.f6120xv);
        this.f217723d = (ImageView) this.convertView.findViewById(C0966R.C0970id.f6121xw);
        this.f217724e = (ImageView) this.convertView.findViewById(C0966R.C0970id.f6122xx);
        return this;
    }

    public View getMainContainerView() {
        return this.f217721b;
    }
}
