package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 $2\u00020\u0001:\u0002%&B\u0011\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 B\u001b\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001f\u0010#J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0012\u0010\u000e\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\"\u0010\u0011\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006'"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderViewPager;", "Landroidx/viewpager/widget/ViewPager;", "", "direction", "Landroid/view/ViewGroup;", "parent", "", "x", "y", "", "checkChildScrollHorizontally", "Landroid/view/MotionEvent;", "ev", "onInterceptTouchEvent", "onTouchEvent", "Lrx3/b0;", "requestFitSystemWindows", "isEnableViewPagerScroll", "Z", "()Z", "setEnableViewPagerScroll", "(Z)V", "isNeedInterceptFitWindow", "setNeedInterceptFitWindow", "Landroid/graphics/Rect;", "viewRect", "Landroid/graphics/Rect;", "historicalX", "F", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "a", "b", "plugin-finder-base_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderViewPager */
public final class FinderViewPager extends ViewPager {
    public static final C56570b Companion = new C56570b((C8480h) null);
    public static final String TAG = "Finder.ViewPager";
    private float historicalX;
    private boolean isEnableViewPagerScroll;
    private boolean isNeedInterceptFitWindow;
    private final Rect viewRect = new Rect();

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderViewPager$a */
    public interface C3983a {
        /* renamed from: a */
        boolean mo3291a(int i, ViewGroup viewGroup, float f, float f2);
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderViewPager$b */
    public static final class C56570b {
        public C56570b(C8480h hVar) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderViewPager(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    private final boolean checkChildScrollHorizontally(int i, ViewGroup viewGroup, float f, float f2) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof C3983a) && ((C3983a) childAt).mo3291a(i, viewGroup, f, f2)) {
                childAt.getGlobalVisibleRect(this.viewRect);
                if (this.viewRect.contains((int) f, (int) f2)) {
                    return true;
                }
            } else if ((childAt instanceof ViewGroup) && checkChildScrollHorizontally(i, (ViewGroup) childAt, f, f2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean isEnableViewPagerScroll() {
        return this.isEnableViewPagerScroll;
    }

    public final boolean isNeedInterceptFitWindow() {
        return this.isNeedInterceptFitWindow;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "ev");
        if (!this.isEnableViewPagerScroll) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            this.historicalX = motionEvent.getX();
        } else if (checkChildScrollHorizontally((int) (this.historicalX - motionEvent.getX(0)), this, motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.isEnableViewPagerScroll) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void requestFitSystemWindows() {
        if (!this.isNeedInterceptFitWindow) {
            Log.m105924i(TAG, "requestFitSystemWindows");
            super.requestFitSystemWindows();
        }
    }

    public final void setEnableViewPagerScroll(boolean z) {
        this.isEnableViewPagerScroll = z;
    }

    public final void setNeedInterceptFitWindow(boolean z) {
        this.isNeedInterceptFitWindow = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }
}
