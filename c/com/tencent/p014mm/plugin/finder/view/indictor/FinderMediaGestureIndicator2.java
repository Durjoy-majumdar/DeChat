package com.tencent.p014mm.plugin.finder.view.indictor;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.view.FinderViewPager;
import com.tencent.p014mm.view.MediaBannerIndicator;
import gy3.C87412m;
import kotlin.Metadata;
import zp3.C23571u;
import zp3.C79406f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/indictor/FinderMediaGestureIndicator2;", "Lcom/tencent/mm/view/MediaBannerIndicator;", "Lcom/tencent/mm/plugin/finder/view/FinderViewPager$a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.indictor.FinderMediaGestureIndicator2 */
public final class FinderMediaGestureIndicator2 extends MediaBannerIndicator implements FinderViewPager.C3983a {

    /* renamed from: o */
    public float f198155o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderMediaGestureIndicator2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        setIndicatorWidth((int) getResources().getDimension(C0966R.dimen.f3766df));
        setIndicatorMargin(C79406f.m96347a(getContext(), 3.0f));
        setUnSelectDrawable(getContext().getDrawable(C0966R.C0969drawable.f5127xm));
        setSelectDrawable(getContext().getDrawable(C0966R.C0969drawable.f5128xn));
    }

    /* renamed from: a */
    public boolean mo3291a(int i, ViewGroup viewGroup, float f, float f2) {
        C87412m.m108594g(viewGroup, "parent");
        return true;
    }

    public boolean canScrollHorizontally(int i) {
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "event");
        super.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 0) {
            this.f198155o = motionEvent.getX();
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            float x = motionEvent.getX() - this.f198155o;
            if (Math.abs(x) >= 15.0f) {
                if (x < 0.0f) {
                    C23571u.C23572a onSelectedPageListener = getOnSelectedPageListener();
                    if (onSelectedPageListener != null) {
                        onSelectedPageListener.mo4664a(Math.min(getCurrentIndex() + 1, getCount() - 1));
                    }
                } else {
                    C23571u.C23572a onSelectedPageListener2 = getOnSelectedPageListener();
                    if (onSelectedPageListener2 != null) {
                        onSelectedPageListener2.mo4664a(Math.max(getCurrentIndex() - 1, 0));
                    }
                }
            } else if (this.f198155o < ((float) getWidth()) / 2.0f) {
                C23571u.C23572a onSelectedPageListener3 = getOnSelectedPageListener();
                if (onSelectedPageListener3 != null) {
                    onSelectedPageListener3.mo4664a(Math.max(getCurrentIndex() - 1, 0));
                }
            } else {
                C23571u.C23572a onSelectedPageListener4 = getOnSelectedPageListener();
                if (onSelectedPageListener4 != null) {
                    onSelectedPageListener4.mo4664a(Math.min(getCurrentIndex() + 1, getCount() - 1));
                }
            }
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderMediaGestureIndicator2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        setIndicatorWidth((int) getResources().getDimension(C0966R.dimen.f3766df));
        setIndicatorMargin(C79406f.m96347a(getContext(), 3.0f));
        setUnSelectDrawable(getContext().getDrawable(C0966R.C0969drawable.f5127xm));
        setSelectDrawable(getContext().getDrawable(C0966R.C0969drawable.f5128xn));
    }
}
