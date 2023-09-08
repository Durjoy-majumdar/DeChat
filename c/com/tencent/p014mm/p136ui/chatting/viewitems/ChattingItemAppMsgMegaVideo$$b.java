package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Context;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.plugin.sns.p106ui.view.ImageIndicatorView;
import com.tencent.p014mm.view.NinePatchCropImageView;
import di3.C86312j;
import ht1.C60200t1;
import kg3.C76577a;
import p151er.C75651n;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemAppMsgMegaVideo$$b */
public class ChattingItemAppMsgMegaVideo$$b extends C74023i.C74026c {

    /* renamed from: b */
    public ImageView f165246b;

    /* renamed from: c */
    public TextView f165247c;

    /* renamed from: d */
    public ImageView f165248d;

    /* renamed from: e */
    public TextView f165249e;

    /* renamed from: f */
    public TextView f165250f;

    /* renamed from: g */
    public ImageView f165251g;

    /* renamed from: h */
    public ImageView f165252h;

    /* renamed from: i */
    public ImageView f165253i;

    /* renamed from: j */
    public ImageIndicatorView f165254j;

    /* renamed from: k */
    public int f165255k;

    /* renamed from: l */
    public View f165256l;

    /* renamed from: m */
    public View f165257m;

    /* renamed from: a */
    public ChattingItemAppMsgMegaVideo$$b mo82203a(View view, boolean z) {
        super.create(view);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(C0966R.C0970id.b47);
        Context context = view.getContext();
        this.f165255k = (int) ((((float) context.getResources().getDisplayMetrics().widthPixels) - context.getResources().getDimension(C0966R.dimen.f3723cd)) / 2.0f);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
        layoutParams.width = this.f165255k;
        linearLayout.setLayoutParams(layoutParams);
        this.f165246b = (ImageView) view.findViewById(C0966R.C0970id.b6_);
        this.f165247c = (TextView) view.findViewById(C0966R.C0970id.b6g);
        this.f165248d = (ImageView) view.findViewById(C0966R.C0970id.b6k);
        this.f165249e = (TextView) view.findViewById(C0966R.C0970id.ln4);
        this.f165250f = (TextView) view.findViewById(C0966R.C0970id.b6j);
        this.f165251g = (ImageView) view.findViewById(C0966R.C0970id.b6c);
        this.f165252h = (ImageView) view.findViewById(C0966R.C0970id.b6f);
        this.f165254j = (ImageIndicatorView) view.findViewById(C0966R.C0970id.b6e);
        this.userTV = (TextView) view.findViewById(C0966R.C0970id.b9_);
        this.f165256l = view.findViewById(C0966R.C0970id.b3p);
        this.f165257m = view.findViewById(C0966R.C0970id.jhz);
        if (!(!((C60200t1) C86312j.m106911c(C60200t1.class)).mo76873sF())) {
            this.checkBox = (CheckBox) view.findViewById(C0966R.C0970id.b46);
            this.maskView = view.findViewById(C0966R.C0970id.b7h);
        }
        if (z) {
            this.uploadingPB = (ProgressBar) view.findViewById(C0966R.C0970id.f359466l14);
            this.f165253i = (ImageView) view.findViewById(C0966R.C0970id.b8x);
            ImageView imageView = this.f165248d;
            if (imageView instanceof NinePatchCropImageView) {
                ((NinePatchCropImageView) imageView).setNinePatchId(C0966R.C0969drawable.byy);
            }
        } else {
            ImageView imageView2 = this.f165248d;
            if (imageView2 instanceof NinePatchCropImageView) {
                ((NinePatchCropImageView) imageView2).setNinePatchId(C0966R.C0969drawable.bym);
            }
        }
        ImageView imageView3 = this.f165251g;
        imageView3.setImageDrawable(C74933u4.m89768e(imageView3.getContext(), ((C75651n) C86312j.m106911c(C75651n.class)).ld0() == 1 ? C0966R.raw.icons_filled_channel : C0966R.raw.icons_outlined_finder_icon, C76577a.m92153d(this.f165251g.getContext(), C0966R.color.f2960ag)));
        return this;
    }

    public View getMainContainerView() {
        return this.f165256l;
    }
}
