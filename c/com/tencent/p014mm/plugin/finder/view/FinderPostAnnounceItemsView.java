package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import gy3.C87412m;
import java.util.List;
import kotlin.Metadata;
import rx3.C13604l;
import sx3.C64197v;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderPostAnnounceItemsView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderPostAnnounceItemsView */
public final class FinderPostAnnounceItemsView extends LinearLayout {

    /* renamed from: d */
    public final int f17903d = ((int) getResources().getDimension(C0966R.dimen.f3736cp));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderPostAnnounceItemsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        setOrientation(1);
    }

    /* renamed from: a */
    public final void mo4667a(List<C13604l<String, String>> list) {
        C87412m.m108594g(list, "announceItems");
        int i = 0;
        for (T next : list) {
            int i2 = i + 1;
            if (i >= 0) {
                C13604l lVar = (C13604l) next;
                View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.cvd, (ViewGroup) null, true);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                if (i != 0) {
                    layoutParams.topMargin = this.f17903d;
                }
                addView(inflate, layoutParams);
                C87412m.m108593f(inflate, "itemView");
                ((TextView) inflate.findViewById(C0966R.C0970id.n36)).setText((CharSequence) lVar.f38555d);
                ((TextView) inflate.findViewById(C0966R.C0970id.f358947n34)).setText((CharSequence) lVar.f38556e);
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderPostAnnounceItemsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        setOrientation(1);
    }
}
