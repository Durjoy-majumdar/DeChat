package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import gy3.C87412m;
import ht1.C60162e2;
import iy3.C60641c;
import java.util.HashMap;
import java.util.LinkedList;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bB#\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001c\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u001dJ\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016R\"\u0010\u000f\u001a\u00020\b8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderFeedAlbumView;", "Lcom/tencent/mm/ui/widget/RoundedCornerFrameLayout;", "Lht1/e2;", "Lht1/e2$a;", "Lht1/e2$b;", "adapter", "Lrx3/b0;", "setAdapter", "", "j", "I", "getItemViewWidth", "()I", "setItemViewWidth", "(I)V", "itemViewWidth", "", "n", "F", "getPadding", "()F", "padding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderFeedAlbumView */
public final class FinderFeedAlbumView extends RoundedCornerFrameLayout implements C60162e2 {

    /* renamed from: g */
    public final HashMap<Integer, LinkedList<C60162e2.C60164b>> f162106g = new HashMap<>();

    /* renamed from: h */
    public C60162e2.C60163a<? extends C60162e2.C60164b> f162107h;

    /* renamed from: i */
    public boolean f162108i;

    /* renamed from: j */
    public int f162109j = -1;

    /* renamed from: n */
    public final float f162110n = (getContext().getResources().getDimension(C0966R.dimen.f3703bv) / ((float) 2));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderFeedAlbumView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: c */
    public final C60162e2.C60164b mo79838c(int i, int i2, int i3, int i4, int i5) {
        C60162e2.C60163a aVar = this.f162107h;
        C87412m.m108591d(aVar);
        int b = aVar.mo85137b(i5);
        LinkedList linkedList = this.f162106g.get(Integer.valueOf(b));
        C60162e2.C60164b bVar = linkedList != null ? (C60162e2.C60164b) linkedList.poll() : null;
        if (bVar == null) {
            LayoutInflater from = LayoutInflater.from(getContext());
            C87412m.m108593f(from, "from(this.context)");
            bVar = aVar.mo85140e(from, this, i5);
        }
        bVar.f171709a.setLayoutParams(new FrameLayout.LayoutParams(i, i2));
        bVar.f171709a.setTag(C0966R.C0970id.f358048d70, bVar);
        bVar.f171709a.setTag(C0966R.C0970id.f358049d71, Integer.valueOf(b));
        bVar.f171709a.setTranslationX((float) i3);
        bVar.f171709a.setTranslationY((float) i4);
        return bVar;
    }

    public int getItemViewWidth() {
        return this.f162109j;
    }

    public final float getPadding() {
        return this.f162110n;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C60162e2.C60164b bVar;
        super.onLayout(z, i, i2, i3, i4);
        int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        int paddingStart = ((i3 - i) - getPaddingStart()) - getPaddingEnd();
        C60162e2.C60163a<? extends C60162e2.C60164b> aVar = this.f162107h;
        int c = aVar != null ? aVar.mo85138c() : 0;
        if (4 <= c) {
            c = 4;
        }
        if (c > 0) {
            boolean z2 = this.f162108i;
            if (z || z2) {
                removeAllViews();
                float f = ((float) paddingTop) / 3.0f;
                float f2 = ((float) paddingStart) / 3.0f;
                for (int i5 = 0; i5 < c; i5++) {
                    if (i5 == 0) {
                        float f3 = (float) 2;
                        bVar = mo79838c(C60641c.m70921b(f2 * f3), C60641c.m70921b(f3 * f), 0, 0, i5);
                    } else if (i5 == 1) {
                        bVar = mo79838c(C60641c.m70921b(f2), C60641c.m70921b(1.5f * f), C60641c.m70921b((((float) 2) * f2) + this.f162110n), 0, i5);
                    } else if (i5 != 2) {
                        float f4 = 1.5f * f;
                        bVar = mo79838c(C60641c.m70921b(f2), C60641c.m70921b(f4), C60641c.m70921b((((float) 2) * f2) + this.f162110n), C60641c.m70921b(f4 + this.f162110n), i5);
                    } else {
                        float f5 = (float) 2;
                        bVar = mo79838c(C60641c.m70921b(f2 * f5), C60641c.m70921b(f), 0, C60641c.m70921b((f5 * f) + this.f162110n), i5);
                    }
                    View view = bVar.f171709a;
                    addViewInLayout(view, i5, view.getLayoutParams());
                    C60162e2.C60163a<? extends C60162e2.C60164b> aVar2 = this.f162107h;
                    if (aVar2 != null) {
                        aVar2.mo85139d(bVar.f171709a, i5, bVar);
                    }
                }
                this.f162108i = false;
            }
        }
    }

    public void onViewRemoved(View view) {
        LinkedList linkedList;
        super.onViewRemoved(view);
        Integer num = null;
        Object tag = view != null ? view.getTag(C0966R.C0970id.f358048d70) : null;
        C60162e2.C60164b bVar = tag instanceof C60162e2.C60164b ? (C60162e2.C60164b) tag : null;
        Object tag2 = view != null ? view.getTag(C0966R.C0970id.f358049d71) : null;
        if (tag2 instanceof Integer) {
            num = (Integer) tag2;
        }
        int intValue = num != null ? num.intValue() : 0;
        if (bVar != null) {
            if (!this.f162106g.containsKey(Integer.valueOf(intValue))) {
                linkedList = new LinkedList();
                this.f162106g.put(Integer.valueOf(intValue), linkedList);
            } else {
                LinkedList linkedList2 = this.f162106g.get(Integer.valueOf(intValue));
                C87412m.m108591d(linkedList2);
                linkedList = linkedList2;
            }
            if (!linkedList.contains(bVar)) {
                linkedList.add(bVar);
            }
        }
    }

    public void setAdapter(C60162e2.C60163a<? extends C60162e2.C60164b> aVar) {
        C87412m.m108594g(aVar, "adapter");
        this.f162107h = aVar;
        this.f162108i = true;
        isInLayout();
        post(new C56586b2(this));
    }

    public void setItemViewWidth(int i) {
        this.f162109j = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderFeedAlbumView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
