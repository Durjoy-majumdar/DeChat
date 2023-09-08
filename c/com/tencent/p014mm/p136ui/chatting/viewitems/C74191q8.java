package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.view.ChattingAvatarImageView;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.q8 */
public class C74191q8 extends C74023i.C74026c {

    /* renamed from: b */
    public LinearLayout f217779b;

    /* renamed from: c */
    public C74217s8 f217780c = new C74217s8();

    /* renamed from: d */
    public C74307x8 f217781d;

    /* renamed from: e */
    public C74307x8 f217782e;

    /* renamed from: f */
    public C74307x8 f217783f;

    /* renamed from: g */
    public ImageView f217784g;

    /* renamed from: h */
    public C73957e f217785h;

    public C74191q8() {
        C74307x8 x8Var = new C74307x8(false);
        this.f217781d = x8Var;
        this.f217782e = new C74307x8(true);
        this.f217783f = x8Var;
        this.f217785h = new C73957e();
    }

    /* renamed from: a */
    public C74023i.C74026c mo103209a(View view) {
        this.checkBox = (CheckBox) view.findViewById(C0966R.C0970id.b46);
        this.maskView = view.findViewById(C0966R.C0970id.b7h);
        this.userTV = (TextView) view.findViewById(C0966R.C0970id.b9_);
        this.avatarIV = (ChattingAvatarImageView) view.findViewById(C0966R.C0970id.b3s);
        this.timeTV = (TextView) view.findViewById(C0966R.C0970id.b8z);
        this.f217779b = (LinearLayout) view.findViewById(C0966R.C0970id.b4d);
        this.f217780c.f217878a = view.findViewById(C0966R.C0970id.b65);
        this.f217780c.f217879b = view.findViewById(C0966R.C0970id.eub);
        C74217s8 s8Var = this.f217780c;
        s8Var.f217882e = (TextView) s8Var.f217878a.findViewById(C0966R.C0970id.knx);
        C74217s8 s8Var2 = this.f217780c;
        s8Var2.f217884g = (LinearLayout) s8Var2.f217878a.findViewById(C0966R.C0970id.c74);
        this.f217780c.f217883f = this.f217779b.findViewById(C0966R.C0970id.b64);
        this.f217780c.f217885h = this.f217779b.findViewById(C0966R.C0970id.jca);
        this.f217780c.f217880c = view.findViewById(C0966R.C0970id.h09);
        this.f217780c.f217881d = view.findViewById(C0966R.C0970id.h0_);
        this.f217781d.f218261a = view.findViewById(C0966R.C0970id.f357678b63);
        this.f217782e.f218261a = view.findViewById(C0966R.C0970id.b66);
        this.f217781d.mo103289a(this.f217785h);
        this.f217782e.mo103289a(this.f217785h);
        this.f217784g = (ImageView) view.findViewById(C0966R.C0970id.f357676b61);
        return this;
    }

    public View getMainContainerView() {
        return this.f217779b;
    }
}
