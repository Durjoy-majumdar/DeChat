package com.tencent.p014mm.plugin.textstatus.p112ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u00106\u001a\u000205\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u000107\u0012\b\b\u0002\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0015\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R$\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010$\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010,\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u00100\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b-\u0010\f\u001a\u0004\b.\u0010\u000e\"\u0004\b/\u0010\u0010R$\u00104\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b1\u0010'\u001a\u0004\b2\u0010)\"\u0004\b3\u0010+¨\u0006="}, mo182094d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/TextStatusCircleIconLayout;", "Landroid/widget/LinearLayout;", "Landroid/widget/ImageView;", "d", "Landroid/widget/ImageView;", "getFirstIconView", "()Landroid/widget/ImageView;", "setFirstIconView", "(Landroid/widget/ImageView;)V", "firstIconView", "Landroidx/cardview/widget/CardView;", "e", "Landroidx/cardview/widget/CardView;", "getFirstCardView", "()Landroidx/cardview/widget/CardView;", "setFirstCardView", "(Landroidx/cardview/widget/CardView;)V", "firstCardView", "f", "getSecondCardView", "setSecondCardView", "secondCardView", "Landroid/view/ViewGroup;", "g", "Landroid/view/ViewGroup;", "getFirstLayout", "()Landroid/view/ViewGroup;", "setFirstLayout", "(Landroid/view/ViewGroup;)V", "firstLayout", "h", "Landroid/widget/LinearLayout;", "getSecondLL", "()Landroid/widget/LinearLayout;", "setSecondLL", "(Landroid/widget/LinearLayout;)V", "secondLL", "Landroid/view/View;", "i", "Landroid/view/View;", "getFirstBlackMask", "()Landroid/view/View;", "setFirstBlackMask", "(Landroid/view/View;)V", "firstBlackMask", "j", "getOutlineCircle", "setOutlineCircle", "outlineCircle", "n", "getRoot", "setRoot", "root", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-textstatus_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusCircleIconLayout */
public final class TextStatusCircleIconLayout extends LinearLayout {

    /* renamed from: d */
    public ImageView f116913d;

    /* renamed from: e */
    public CardView f116914e;

    /* renamed from: f */
    public CardView f116915f;

    /* renamed from: g */
    public ViewGroup f116916g;

    /* renamed from: h */
    public LinearLayout f116917h;

    /* renamed from: i */
    public View f116918i;

    /* renamed from: j */
    public CardView f116919j;

    /* renamed from: n */
    public View f116920n;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TextStatusCircleIconLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    public final View getFirstBlackMask() {
        return this.f116918i;
    }

    public final CardView getFirstCardView() {
        return this.f116914e;
    }

    public final ImageView getFirstIconView() {
        return this.f116913d;
    }

    public final ViewGroup getFirstLayout() {
        return this.f116916g;
    }

    public final CardView getOutlineCircle() {
        return this.f116919j;
    }

    public final View getRoot() {
        return this.f116920n;
    }

    public final CardView getSecondCardView() {
        return this.f116915f;
    }

    public final LinearLayout getSecondLL() {
        return this.f116917h;
    }

    public final void setFirstBlackMask(View view) {
        this.f116918i = view;
    }

    public final void setFirstCardView(CardView cardView) {
        this.f116914e = cardView;
    }

    public final void setFirstIconView(ImageView imageView) {
        this.f116913d = imageView;
    }

    public final void setFirstLayout(ViewGroup viewGroup) {
        this.f116916g = viewGroup;
    }

    public final void setOutlineCircle(CardView cardView) {
        this.f116919j = cardView;
    }

    public final void setRoot(View view) {
        this.f116920n = view;
    }

    public final void setSecondCardView(CardView cardView) {
        this.f116915f = cardView;
    }

    public final void setSecondLL(LinearLayout linearLayout) {
        this.f116917h = linearLayout;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextStatusCircleIconLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.cql, this);
        this.f116920n = inflate;
        if (inflate != null) {
            this.f116913d = (ImageView) inflate.findViewById(C0966R.C0970id.mef);
            this.f116914e = (CardView) inflate.findViewById(C0966R.C0970id.mbi);
            this.f116915f = (CardView) inflate.findViewById(C0966R.C0970id.mbk);
            this.f116916g = (ViewGroup) inflate.findViewById(C0966R.C0970id.mfn);
            this.f116917h = (LinearLayout) inflate.findViewById(C0966R.C0970id.mfo);
            this.f116918i = inflate.findViewById(C0966R.C0970id.mah);
            this.f116919j = (CardView) inflate.findViewById(C0966R.C0970id.mbj);
        }
    }
}
