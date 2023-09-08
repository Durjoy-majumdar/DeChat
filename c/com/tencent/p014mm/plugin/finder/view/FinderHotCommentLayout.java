package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.graphics.Point;
import android.text.SpannableString;
import android.text.style.LeadingMarginSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C7878t0;
import gy3.C87412m;
import kotlin.Metadata;
import rx3.C13601g;
import rx3.C36568h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fB#\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\u001e\u0010\"J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R#\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR#\u0010\u0011\u001a\n \u0007*\u0004\u0018\u00010\r0\r8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u0010R#\u0010\u0016\u001a\n \u0007*\u0004\u0018\u00010\u00120\u00128BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0014\u0010\u0015R#\u0010\u0019\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\t\u001a\u0004\b\u0018\u0010\u000b¨\u0006#"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderHotCommentLayout;", "Landroid/widget/FrameLayout;", "", "content", "Lrx3/b0;", "setMargin", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "d", "Lrx3/g;", "getHotCommentTagTv", "()Landroid/widget/TextView;", "hotCommentTagTv", "Lcom/tencent/mm/plugin/finder/view/HotCommentSpacingTextView;", "e", "getHotCommentContentTv", "()Lcom/tencent/mm/plugin/finder/view/HotCommentSpacingTextView;", "hotCommentContentTv", "Landroid/view/View;", "f", "getHotCommentLikeFrame", "()Landroid/view/View;", "hotCommentLikeFrame", "g", "getHotCommentLikeCountTv", "hotCommentLikeCountTv", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderHotCommentLayout */
public final class FinderHotCommentLayout extends FrameLayout {

    /* renamed from: d */
    public final C13601g f17801d = C36568h.m40985a(new C4035d3(this));

    /* renamed from: e */
    public final C13601g f17802e = C36568h.m40985a(new C4013a3(this));

    /* renamed from: f */
    public final C13601g f17803f = C36568h.m40985a(new C4030c3(this));

    /* renamed from: g */
    public final C13601g f17804g = C36568h.m40985a(new C4018b3(this));

    /* renamed from: h */
    public int f17805h;

    /* renamed from: i */
    public int f17806i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderHotCommentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    private final HotCommentSpacingTextView getHotCommentContentTv() {
        return (HotCommentSpacingTextView) this.f17802e.getValue();
    }

    private final TextView getHotCommentLikeCountTv() {
        return (TextView) this.f17804g.getValue();
    }

    private final View getHotCommentLikeFrame() {
        return (View) this.f17803f.getValue();
    }

    private final TextView getHotCommentTagTv() {
        return (TextView) this.f17801d.getValue();
    }

    private final void setMargin(CharSequence charSequence) {
        LeadingMarginSpan.Standard standard = new LeadingMarginSpan.Standard(this.f17805h + getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3703bv), 0);
        SpannableString spannableString = new SpannableString(charSequence);
        if (charSequence.length() > 0) {
            spannableString.setSpan(standard, 0, 1, 17);
        }
        getHotCommentContentTv().setText(spannableString);
    }

    /* renamed from: a */
    public final void mo4578a(CharSequence charSequence, int i) {
        C87412m.m108594g(charSequence, "content");
        TextView hotCommentTagTv = getHotCommentTagTv();
        C87412m.m108593f(hotCommentTagTv, "hotCommentTagTv");
        this.f17805h = mo4579b(hotCommentTagTv);
        setMargin(charSequence);
        getHotCommentLikeCountTv().setText(C7878t0.m8039h(Math.abs(i)));
        View hotCommentLikeFrame = getHotCommentLikeFrame();
        C87412m.m108593f(hotCommentLikeFrame, "hotCommentLikeFrame");
        this.f17806i = mo4579b(hotCommentLikeFrame);
        Log.m105924i("Finder.HotCommentLayout", "bindData likeFrameWidth = " + this.f17806i + " tagWidth = " + this.f17805h);
        getHotCommentContentTv().setExtraEllipsizeWidth(this.f17806i);
    }

    /* renamed from: b */
    public final int mo4579b(View view) {
        int measuredWidth = view.getMeasuredWidth();
        ViewParent parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (measuredWidth > 0 || view2 == null) {
            return measuredWidth;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(view2.getWidth(), 0), View.MeasureSpec.makeMeasureSpec(view2.getHeight(), 1073741824));
        return new Point(view.getMeasuredWidth(), view.getMeasuredHeight()).x;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderHotCommentLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
