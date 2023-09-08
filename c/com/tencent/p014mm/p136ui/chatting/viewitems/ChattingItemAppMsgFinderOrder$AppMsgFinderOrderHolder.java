package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b-\u0010.J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\n\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR$\u0010!\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010'\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R$\u0010*\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b*\u0010\u000b\u001a\u0004\b+\u0010\r\"\u0004\b,\u0010\u000f¨\u0006/"}, mo182094d2 = {"com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderOrder$AppMsgFinderOrderHolder", "Lcom/tencent/mm/ui/chatting/viewitems/i$c;", "Landroid/view/View;", "view", "", "isSend", "Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderOrder$AppMsgFinderOrderHolder;", "build", "getMainContainerView", "Landroid/widget/ImageView;", "coverIv", "Landroid/widget/ImageView;", "getCoverIv", "()Landroid/widget/ImageView;", "setCoverIv", "(Landroid/widget/ImageView;)V", "Lcom/tencent/mm/ui/widget/MMNeat7extView;", "titleTv", "Lcom/tencent/mm/ui/widget/MMNeat7extView;", "getTitleTv", "()Lcom/tencent/mm/ui/widget/MMNeat7extView;", "setTitleTv", "(Lcom/tencent/mm/ui/widget/MMNeat7extView;)V", "Landroid/widget/TextView;", "stateTv", "Landroid/widget/TextView;", "getStateTv", "()Landroid/widget/TextView;", "setStateTv", "(Landroid/widget/TextView;)V", "descTv", "getDescTv", "setDescTv", "detailLayout", "Landroid/view/View;", "getDetailLayout", "()Landroid/view/View;", "setDetailLayout", "(Landroid/view/View;)V", "divider", "getDivider", "setDivider", "tickIV", "getTickIV", "setTickIV", "<init>", "()V", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemAppMsgFinderOrder$AppMsgFinderOrderHolder */
public final class ChattingItemAppMsgFinderOrder$AppMsgFinderOrderHolder extends C74023i.C74026c {
    public static final int $stable = 8;
    private ImageView coverIv;
    private TextView descTv;
    private View detailLayout;
    private View divider;
    private TextView stateTv;
    private ImageView tickIV;
    private MMNeat7extView titleTv;

    public final ChattingItemAppMsgFinderOrder$AppMsgFinderOrderHolder build(View view, boolean z) {
        C87412m.m108594g(view, "view");
        super.create(view);
        this.detailLayout = view.findViewById(C0966R.C0970id.b3p);
        View findViewById = view.findViewById(C0966R.C0970id.b9_);
        TextView textView = findViewById instanceof TextView ? (TextView) findViewById : null;
        if (textView != null) {
            this.userTV = textView;
        }
        this.checkBox = (CheckBox) view.findViewById(C0966R.C0970id.b46);
        this.maskView = view.findViewById(C0966R.C0970id.b7h);
        ProgressBar progressBar = (ProgressBar) view.findViewById(C0966R.C0970id.f359466l14);
        this.uploadingPB = progressBar;
        if (z) {
            this.tickIV = (ImageView) view.findViewById(C0966R.C0970id.b8x);
        } else if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        this.titleTv = (MMNeat7extView) view.findViewById(C0966R.C0970id.nso);
        this.descTv = (TextView) view.findViewById(C0966R.C0970id.nsm);
        this.stateTv = (TextView) view.findViewById(C0966R.C0970id.nsn);
        this.coverIv = (ImageView) view.findViewById(C0966R.C0970id.nsk);
        this.divider = view.findViewById(C0966R.C0970id.nsj);
        return this;
    }

    public final ImageView getCoverIv() {
        return this.coverIv;
    }

    public final TextView getDescTv() {
        return this.descTv;
    }

    public final View getDetailLayout() {
        return this.detailLayout;
    }

    public final View getDivider() {
        return this.divider;
    }

    public View getMainContainerView() {
        return this.detailLayout;
    }

    public final TextView getStateTv() {
        return this.stateTv;
    }

    public final ImageView getTickIV() {
        return this.tickIV;
    }

    public final MMNeat7extView getTitleTv() {
        return this.titleTv;
    }

    public final void setCoverIv(ImageView imageView) {
        this.coverIv = imageView;
    }

    public final void setDescTv(TextView textView) {
        this.descTv = textView;
    }

    public final void setDetailLayout(View view) {
        this.detailLayout = view;
    }

    public final void setDivider(View view) {
        this.divider = view;
    }

    public final void setStateTv(TextView textView) {
        this.stateTv = textView;
    }

    public final void setTickIV(ImageView imageView) {
        this.tickIV = imageView;
    }

    public final void setTitleTv(MMNeat7extView mMNeat7extView) {
        this.titleTv = mMNeat7extView;
    }
}
