package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB#\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002¨\u0006\u0010"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderBubbleLayout;", "Landroid/widget/FrameLayout;", "", "resId", "Lrx3/b0;", "setContent", "color", "setBubbleColor", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderBubbleLayout */
public final class FinderBubbleLayout extends FrameLayout {

    /* renamed from: d */
    public final ImageView f17633d;

    /* renamed from: e */
    public final FrameLayout f17634e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderBubbleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.a9i, this, true);
        View findViewById = inflate.findViewById(C0966R.C0970id.amm);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.bubble_top_view)");
        ImageView imageView = (ImageView) findViewById;
        this.f17633d = imageView;
        imageView.setEnabled(false);
        View findViewById2 = inflate.findViewById(C0966R.C0970id.aml);
        C87412m.m108593f(findViewById2, "root.findViewById(R.id.bubble_container)");
        this.f17634e = (FrameLayout) findViewById2;
    }

    public final void setBubbleColor(int i) {
        this.f17633d.setImageDrawable(C74933u4.m89768e(getContext(), C0966R.raw.finder_bubble_arrow, i));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(getContext().getResources().getDimension(C0966R.dimen.f3703bv));
        this.f17634e.setBackground(gradientDrawable);
    }

    public final void setContent(int i) {
        LayoutInflater.from(getContext()).inflate(i, this.f17634e, true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderBubbleLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.a9i, this, true);
        View findViewById = inflate.findViewById(C0966R.C0970id.amm);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.bubble_top_view)");
        ImageView imageView = (ImageView) findViewById;
        this.f17633d = imageView;
        imageView.setEnabled(false);
        View findViewById2 = inflate.findViewById(C0966R.C0970id.aml);
        C87412m.m108593f(findViewById2, "root.findViewById(R.id.bubble_container)");
        this.f17634e = (FrameLayout) findViewById2;
    }
}
