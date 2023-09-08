package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.b7 */
public class C73936b7 extends C74023i.C74026c {

    /* renamed from: b */
    public TextView f217022b;

    /* renamed from: c */
    public View f217023c;

    /* renamed from: a */
    public C74023i.C74026c mo103015a(View view, boolean z) {
        super.create(view);
        this.timeTV = (TextView) view.findViewById(C0966R.C0970id.b8z);
        this.userTV = (TextView) view.findViewById(C0966R.C0970id.b9_);
        this.f217022b = (TextView) view.findViewById(C0966R.C0970id.b4b);
        TextView textView = (TextView) view.findViewById(C0966R.C0970id.b8c);
        this.checkBox = (CheckBox) view.findViewById(C0966R.C0970id.b46);
        this.maskView = view.findViewById(C0966R.C0970id.b7h);
        this.f217023c = view.findViewById(C0966R.C0970id.b6s);
        if (!z) {
            this.stateIV = (ImageView) view.findViewById(C0966R.C0970id.b8v);
            this.uploadingPB = (ProgressBar) view.findViewById(C0966R.C0970id.f359466l14);
        }
        return this;
    }

    public View getMainContainerView() {
        return this.f217023c;
    }
}
