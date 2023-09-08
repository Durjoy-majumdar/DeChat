package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import gy3.C87412m;
import kotlin.Metadata;
import wq3.C111847h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB#\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\u000eJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003¨\u0006\u000f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderLiveFansView;", "Landroid/widget/FrameLayout;", "", "", "fansLevel", "Lrx3/b0;", "setFansLevel", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderLiveFansView */
public final class FinderLiveFansView extends FrameLayout implements C111847h {

    /* renamed from: d */
    public ImageView f17841d;

    /* renamed from: e */
    public TextView f17842e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveFansView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.d44, this, true);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(C0966R.C0970id.ntp);
        C87412m.m108593f(findViewById, "findViewById(R.id.finder_fans_logo_iv)");
        this.f17841d = (ImageView) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.ntq);
        C87412m.m108593f(findViewById2, "findViewById(R.id.finder_fans_logo_level_tv)");
        this.f17842e = (TextView) findViewById2;
    }

    public final void setFansLevel(int i) {
        ImageView imageView = this.f17841d;
        if (imageView != null) {
            imageView.setImageResource(0);
            TextView textView = this.f17842e;
            if (textView != null) {
                textView.setText(String.valueOf(i));
            } else {
                C87412m.m108603p("fansLevelTv");
                throw null;
            }
        } else {
            C87412m.m108603p("fansLevelIcons");
            throw null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveFansView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.d44, this, true);
    }
}
