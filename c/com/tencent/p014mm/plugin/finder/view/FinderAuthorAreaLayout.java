package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import gy3.C87412m;
import kotlin.Metadata;
import rs1.C13345o3;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cB!\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001eR\u001b\u0010\u0007\u001a\u00020\u00028FX\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\"\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderAuthorAreaLayout;", "Landroid/widget/FrameLayout;", "", "d", "Lrx3/g;", "getFollowBtnMargin", "()I", "followBtnMargin", "", "e", "Z", "isShrinkText", "()Z", "setShrinkText", "(Z)V", "Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;", "f", "Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;", "getFeed", "()Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;", "setFeed", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "feed", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleInt", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderAuthorAreaLayout */
public final class FinderAuthorAreaLayout extends FrameLayout {

    /* renamed from: d */
    public final C13601g f17620d = C36568h.m40985a(C4065h0.f18193d);

    /* renamed from: e */
    public boolean f17621e;

    /* renamed from: f */
    public BaseFinderFeed f17622f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderAuthorAreaLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
    }

    public final BaseFinderFeed getFeed() {
        return this.f17622f;
    }

    public final int getFollowBtnMargin() {
        return ((Number) this.f17620d.getValue()).intValue();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View findViewById = findViewById(C0966R.C0970id.ec5);
        if (findViewById.getVisibility() == 0) {
            View findViewById2 = findViewById(C0966R.C0970id.cym);
            EllipsizedTextView ellipsizedTextView = (EllipsizedTextView) findViewById(C0966R.C0970id.bh6);
            FadeOutLinearLayout fadeOutLinearLayout = (FadeOutLinearLayout) findViewById(C0966R.C0970id.brz);
            int right = findViewById2.getRight() + getFollowBtnMargin() + findViewById.getMeasuredWidth();
            if (right > getMeasuredWidth()) {
                if (!this.f17621e) {
                    this.f17621e = true;
                    ellipsizedTextView.setTextSize(0, getContext().getResources().getDimension(C0966R.dimen.f3817fa));
                    measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    layout(i, i2, i3, i4);
                    return;
                }
                int measuredWidth = right - getMeasuredWidth();
                int width = findViewById.getWidth();
                C13601g<Integer> gVar = C13345o3.f37843d;
                fadeOutLinearLayout.mo4368b(width + ((Number) ((C36570n) C13345o3.f37843d).getValue()).intValue() + measuredWidth, 0);
                right = getMeasuredWidth();
            }
            findViewById.layout(right - findViewById.getMeasuredWidth(), findViewById.getTop(), right, findViewById.getBottom());
        }
    }

    public final void setFeed(BaseFinderFeed baseFinderFeed) {
        this.f17622f = baseFinderFeed;
    }

    public final void setShrinkText(boolean z) {
        this.f17621e = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderAuthorAreaLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
    }
}
