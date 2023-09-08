package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.p136ui.widget.MMTextView;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.t0 */
public final class C74219t0 extends C74023i.C74026c {

    /* renamed from: b */
    public MMTextView f217887b;

    /* renamed from: c */
    public View f217888c;

    /* renamed from: d */
    public ImageView f217889d;

    /* renamed from: a */
    public C74023i.C74026c mo103240a(View view, boolean z) {
        super.create(view);
        this.timeTV = (TextView) view.findViewById(C0966R.C0970id.b8z);
        this.userTV = (TextView) view.findViewById(C0966R.C0970id.b9_);
        this.f217887b = (MMTextView) view.findViewById(C0966R.C0970id.b4b);
        this.checkBox = (CheckBox) view.findViewById(C0966R.C0970id.b46);
        this.maskView = view.findViewById(C0966R.C0970id.b7h);
        this.f217888c = view.findViewById(C0966R.C0970id.b4_);
        if (!z) {
            this.f217889d = (ImageView) view.findViewById(C0966R.C0970id.b8x);
            this.stateIV = (ImageView) view.findViewById(C0966R.C0970id.b8v);
            this.uploadingPB = (ProgressBar) view.findViewById(C0966R.C0970id.f359466l14);
        }
        return this;
    }

    public View getMainContainerView() {
        return this.f217888c;
    }
}
