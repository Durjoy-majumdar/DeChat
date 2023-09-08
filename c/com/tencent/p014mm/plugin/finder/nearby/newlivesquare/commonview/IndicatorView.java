package com.tencent.p014mm.plugin.finder.nearby.newlivesquare.commonview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import kg3.C76577a;
import kotlin.Metadata;
import sx3.C64197v;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002¨\u0006\u000e"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/commonview/IndicatorView;", "Landroid/widget/LinearLayout;", "", "count", "Lrx3/b0;", "setPointCount", "selectIndex", "setSelectPoint", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-nearby_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.nearby.newlivesquare.commonview.IndicatorView */
public final class IndicatorView extends LinearLayout {

    /* renamed from: e */
    public static final int f15753e = C76577a.m92151b(MMApplicationContext.getContext(), 6);

    /* renamed from: d */
    public final List<View> f15754d = new ArrayList();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        View.inflate(context, C0966R.C0971layout.cpr, this);
    }

    public final void setPointCount(int i) {
        LinearLayout linearLayout = (LinearLayout) findViewById(C0966R.C0970id.me5);
        linearLayout.removeAllViews();
        ((ArrayList) this.f15754d).clear();
        int i2 = 1;
        if (1 <= i) {
            while (true) {
                View view = new View(getContext());
                view.setBackgroundResource(C0966R.C0969drawable.b7a);
                int i3 = f15753e;
                view.setLayoutParams(new LinearLayout.LayoutParams(i3, i3));
                ((ArrayList) this.f15754d).add(view);
                linearLayout.addView(view);
                if (i2 != i) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public final void setSelectPoint(int i) {
        int i2 = 0;
        for (T next : this.f15754d) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                ((View) next).setBackgroundResource(i2 == i ? C0966R.C0969drawable.b7b : C0966R.C0969drawable.b7a);
                i2 = i3;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
    }
}
