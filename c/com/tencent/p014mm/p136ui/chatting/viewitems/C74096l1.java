package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.l1 */
public class C74096l1 extends C74023i.C74026c {

    /* renamed from: b */
    public ImageView f217475b;

    /* renamed from: c */
    public TextView f217476c;

    /* renamed from: d */
    public TextView f217477d;

    /* renamed from: e */
    public TextView f217478e;

    /* renamed from: f */
    public ImageView f217479f;

    /* renamed from: a */
    public C74096l1 mo103162a(View view, boolean z) {
        super.create(view);
        this.f217475b = (ImageView) this.convertView.findViewById(C0966R.C0970id.b3t);
        this.timeTV = (TextView) this.convertView.findViewById(C0966R.C0970id.b8z);
        this.f217476c = (TextView) this.convertView.findViewById(C0966R.C0970id.b96);
        this.f217477d = (TextView) this.convertView.findViewById(C0966R.C0970id.b9a);
        this.f217478e = (TextView) this.convertView.findViewById(C0966R.C0970id.f357686b82);
        this.userTV = (TextView) this.convertView.findViewById(C0966R.C0970id.b9_);
        this.clickArea = this.convertView.findViewById(C0966R.C0970id.b47);
        this.maskView = this.convertView.findViewById(C0966R.C0970id.b7h);
        if (z) {
            this.uploadingPB = (ProgressBar) view.findViewById(C0966R.C0970id.f359466l14);
            this.f217479f = (ImageView) view.findViewById(C0966R.C0970id.b8x);
        }
        C74023i.m87886m(MMApplicationContext.getContext());
        return this;
    }
}
