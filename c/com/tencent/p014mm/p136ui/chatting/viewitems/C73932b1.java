package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.b1 */
public class C73932b1 extends C74023i.C74026c {

    /* renamed from: b */
    public View f217004b;

    /* renamed from: c */
    public View f217005c;

    /* renamed from: d */
    public ImageView f217006d;

    /* renamed from: e */
    public TextView f217007e;

    /* renamed from: f */
    public TextView f217008f;

    /* renamed from: g */
    public View f217009g;

    /* renamed from: h */
    public TextView f217010h;

    /* renamed from: i */
    public ImageView f217011i;

    /* renamed from: j */
    public TextView f217012j;

    /* renamed from: k */
    public TextView f217013k;

    /* renamed from: a */
    public C73932b1 mo103013a(View view) {
        super.create(view);
        this.f217004b = view.findViewById(C0966R.C0970id.hr6);
        this.f217005c = view.findViewById(C0966R.C0970id.brz);
        this.f217006d = (ImageView) view.findViewById(C0966R.C0970id.f6037vj);
        this.f217007e = (TextView) view.findViewById(C0966R.C0970id.f6056w3);
        this.f217008f = (TextView) view.findViewById(C0966R.C0970id.f6064wa);
        this.f217009g = view.findViewById(C0966R.C0970id.f359587lp2);
        this.f217010h = (TextView) view.findViewById(C0966R.C0970id.hy4);
        this.f217011i = (ImageView) view.findViewById(C0966R.C0970id.hxt);
        this.f217012j = (TextView) view.findViewById(C0966R.C0970id.loz);
        this.f217013k = (TextView) view.findViewById(C0966R.C0970id.f357555ag3);
        this.checkBox = (CheckBox) this.convertView.findViewById(C0966R.C0970id.b46);
        this.maskView = this.convertView.findViewById(C0966R.C0970id.b7h);
        return this;
    }

    public View getMainContainerView() {
        return this.f217005c;
    }
}
