package com.tencent.p014mm.p136ui.mogic;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import androidx.core.widget.C103726d;
import androidx.viewpager.widget.C103853a;
import androidx.viewpager.widget.ViewPager;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.WeakHashMap;
import junit.framework.Assert;
import p1108f3.C107453d;
import p834a3.C103300f;
import p834a3.C103301g;
import p849e3.C107166a;
import p849e3.C107168a0;
import p849e3.C107207u;
import p849e3.C107222v;

/* renamed from: com.tencent.mm.ui.mogic.WxViewPager */
public class WxViewPager extends ViewGroup {
    private static final int CLOSE_ENOUGH = 2;
    private static final Comparator<C106719d> COMPARATOR = new C106716a();
    private static final boolean DEBUG = false;
    private static final int DEFAULT_GUTTER_SIZE = 16;
    private static final int DEFAULT_OFFSCREEN_PAGES = 1;
    private static final int DRAW_ORDER_DEFAULT = 0;
    private static final int DRAW_ORDER_FORWARD = 1;
    private static final int DRAW_ORDER_REVERSE = 2;
    private static final int INVALID_POINTER = -1;
    /* access modifiers changed from: private */
    public static final int[] LAYOUT_ATTRS = {16842931};
    private static final int MAX_SETTLE_DURATION = 600;
    private static final int MIN_DISTANCE_FOR_FLING = 25;
    private static final int MIN_FLING_VELOCITY = 400;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    private static final String TAG = "WxViewPager";
    private static final boolean USE_CACHE = false;
    private static final Interpolator sInterpolator = new C106717b();
    private static final C106723h sPositionComparator = new C106723h();
    private List<ViewPager.OnPageChangeListener> listeners = new ArrayList();
    private int mActivePointerId = -1;
    /* access modifiers changed from: private */
    public C103853a mAdapter;
    private C106721f mAdapterChangeListener;
    private int mBottomPageBounds;
    private boolean mCalledSuper;
    private int mChildHeightMeasureSpec;
    private int mChildWidthMeasureSpec;
    private int mCloseEnough;
    /* access modifiers changed from: private */
    public int mCurItem;
    private int mDecorChildCount;
    private int mDefaultGutterSize;
    private int mDrawingOrder;
    private ArrayList<View> mDrawingOrderedChildren;
    private final Runnable mEndScrollRunnable = new C106718c();
    private int mExpectedAdapterCount;
    private long mFakeDragBeginTime;
    private boolean mFakeDragging;
    private boolean mFirstLayout = true;
    private float mFirstOffset = -3.4028235E38f;
    private int mFlingDistance;
    private int mGutterSize;
    private boolean mIgnoreGutter;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private ViewPager.OnPageChangeListener mInternalPageChangeListener;
    private boolean mIsBeingDragged;
    private boolean mIsUnableToDrag;
    private final ArrayList<C106719d> mItems = new ArrayList<>();
    private float mLastMotionX;
    private float mLastMotionY;
    private float mLastOffset = Float.MAX_VALUE;
    private C103726d mLeftEdge;
    private Drawable mMarginDrawable;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private boolean mNeedCalculatePageOffsets = false;
    private C106722g mObserver;
    private int mOffscreenPageLimit = 1;
    private ViewPager.OnPageChangeListener mOnPageChangeListener;
    private int mPageMargin;
    private ViewPager.C0133h mPageTransformer;
    private boolean mPopulatePending;
    private Parcelable mRestoredAdapterState = null;
    private ClassLoader mRestoredClassLoader = null;
    private int mRestoredCurItem = -1;
    private C103726d mRightEdge;
    private int mScrollState = 0;
    private Scroller mScroller;
    private boolean mScrollingCacheEnabled;
    private Method mSetChildrenDrawingOrderEnabled;
    private final C106719d mTempItem = new C106719d();
    private final Rect mTempRect = new Rect();
    private int mTopPageBounds;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;

    /* renamed from: com.tencent.mm.ui.mogic.WxViewPager$SavedState */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C103300f(new C106715a());

        /* renamed from: d */
        public int f319058d;

        /* renamed from: e */
        public Parcelable f319059e;

        /* renamed from: f */
        public ClassLoader f319060f;

        /* renamed from: com.tencent.mm.ui.mogic.WxViewPager$SavedState$a */
        public class C106715a implements C103301g<SavedState> {
            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f319058d + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f319058d);
            parcel.writeParcelable(this.f319059e, i);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f319058d = parcel.readInt();
            this.f319059e = parcel.readParcelable(classLoader);
            this.f319060f = classLoader;
        }
    }

    /* renamed from: com.tencent.mm.ui.mogic.WxViewPager$a */
    public class C106716a implements Comparator<C106719d> {
        public int compare(Object obj, Object obj2) {
            return ((C106719d) obj).f319063b - ((C106719d) obj2).f319063b;
        }
    }

    /* renamed from: com.tencent.mm.ui.mogic.WxViewPager$b */
    public class C106717b implements Interpolator {
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: com.tencent.mm.ui.mogic.WxViewPager$c */
    public class C106718c implements Runnable {
        public C106718c() {
        }

        public void run() {
            WxViewPager.this.setScrollState(0);
            WxViewPager.this.populate();
        }
    }

    /* renamed from: com.tencent.mm.ui.mogic.WxViewPager$d */
    public static class C106719d {

        /* renamed from: a */
        public Object f319062a;

        /* renamed from: b */
        public int f319063b;

        /* renamed from: c */
        public boolean f319064c;

        /* renamed from: d */
        public float f319065d;

        /* renamed from: e */
        public float f319066e;
    }

    /* renamed from: com.tencent.mm.ui.mogic.WxViewPager$e */
    public class C106720e extends C107166a {
        public C106720e() {
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(WxViewPager.class.getName());
            AccessibilityRecord obtain = AccessibilityRecord.obtain();
            boolean z = true;
            if (WxViewPager.this.mAdapter == null || WxViewPager.this.mAdapter.getCount() <= 1) {
                z = false;
            }
            obtain.setScrollable(z);
            if (accessibilityEvent.getEventType() == 4096 && WxViewPager.this.mAdapter != null) {
                obtain.setItemCount(WxViewPager.this.mAdapter.getCount());
                obtain.setFromIndex(WxViewPager.this.mCurItem);
                obtain.setToIndex(WxViewPager.this.mCurItem);
            }
        }

        public void onInitializeAccessibilityNodeInfo(View view, C107453d dVar) {
            super.onInitializeAccessibilityNodeInfo(view, dVar);
            dVar.mo157852l(WxViewPager.class.getName());
            dVar.mo157863v(WxViewPager.this.mAdapter != null && WxViewPager.this.mAdapter.getCount() > 1);
            if (WxViewPager.this.canScrollHorizontally(1)) {
                dVar.mo157839a(4096);
            }
            if (WxViewPager.this.canScrollHorizontally(-1)) {
                dVar.mo157839a(8192);
            }
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || !WxViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                WxViewPager wxViewPager = WxViewPager.this;
                wxViewPager.setCurrentItem(wxViewPager.mCurItem - 1);
                return true;
            } else if (!WxViewPager.this.canScrollHorizontally(1)) {
                return false;
            } else {
                WxViewPager wxViewPager2 = WxViewPager.this;
                wxViewPager2.setCurrentItem(wxViewPager2.mCurItem + 1);
                return true;
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.mogic.WxViewPager$f */
    public interface C106721f {
        /* renamed from: a */
        void mo153785a(C103853a aVar, C103853a aVar2);
    }

    /* renamed from: com.tencent.mm.ui.mogic.WxViewPager$g */
    public class C106722g extends DataSetObserver {
        public C106722g(C106716a aVar) {
        }

        public void onChanged() {
            WxViewPager.this.dataSetChanged();
        }

        public void onInvalidated() {
            WxViewPager.this.dataSetChanged();
        }
    }

    /* renamed from: com.tencent.mm.ui.mogic.WxViewPager$h */
    public static class C106723h implements Comparator<View> {
        public int compare(Object obj, Object obj2) {
            LayoutParams layoutParams = (LayoutParams) ((View) obj).getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) ((View) obj2).getLayoutParams();
            boolean z = layoutParams.f319052a;
            return z != layoutParams2.f319052a ? z ? 1 : -1 : layoutParams.f319056e - layoutParams2.f319056e;
        }
    }

    public WxViewPager(Context context) {
        super(context);
        initViewPager();
    }

    private void calculatePageOffsets(C106719d dVar, int i, C106719d dVar2) {
        int i2;
        int i3;
        C106719d dVar3;
        C106719d dVar4;
        int count = this.mAdapter.getCount();
        int clientWidth = getClientWidth();
        float f = clientWidth > 0 ? ((float) this.mPageMargin) / ((float) clientWidth) : 0.0f;
        if (dVar2 != null) {
            int i4 = dVar2.f319063b;
            int i5 = dVar.f319063b;
            if (i4 < i5) {
                float f2 = dVar2.f319066e + dVar2.f319065d + f;
                int i6 = i4 + 1;
                int i7 = 0;
                while (i6 <= dVar.f319063b && i7 < this.mItems.size()) {
                    Object obj = this.mItems.get(i7);
                    while (true) {
                        dVar4 = (C106719d) obj;
                        if (i6 > dVar4.f319063b && i7 < this.mItems.size() - 1) {
                            i7++;
                            obj = this.mItems.get(i7);
                        }
                    }
                    while (i6 < dVar4.f319063b) {
                        f2 += this.mAdapter.getPageWidth(i6) + f;
                        i6++;
                    }
                    dVar4.f319066e = f2;
                    f2 += dVar4.f319065d + f;
                    i6++;
                }
            } else if (i4 > i5) {
                int size = this.mItems.size() - 1;
                float f3 = dVar2.f319066e;
                while (true) {
                    i4--;
                    if (i4 < dVar.f319063b || size < 0) {
                        break;
                    }
                    Object obj2 = this.mItems.get(size);
                    while (true) {
                        dVar3 = (C106719d) obj2;
                        if (i4 < dVar3.f319063b && size > 0) {
                            size--;
                            obj2 = this.mItems.get(size);
                        }
                    }
                    while (i4 > dVar3.f319063b) {
                        f3 -= this.mAdapter.getPageWidth(i4) + f;
                        i4--;
                    }
                    f3 -= dVar3.f319065d + f;
                    dVar3.f319066e = f3;
                }
            }
        }
        int size2 = this.mItems.size();
        float f4 = dVar.f319066e;
        int i8 = dVar.f319063b;
        int i9 = i8 - 1;
        this.mFirstOffset = i8 == 0 ? f4 : -3.4028235E38f;
        int i15 = count - 1;
        this.mLastOffset = i8 == i15 ? (dVar.f319065d + f4) - 1.0f : Float.MAX_VALUE;
        int i16 = i - 1;
        while (i16 >= 0) {
            C106719d dVar5 = this.mItems.get(i16);
            while (true) {
                i3 = dVar5.f319063b;
                if (i9 <= i3) {
                    break;
                }
                f4 -= this.mAdapter.getPageWidth(i9) + f;
                i9--;
            }
            f4 -= dVar5.f319065d + f;
            dVar5.f319066e = f4;
            if (i3 == 0) {
                this.mFirstOffset = f4;
            }
            i16--;
            i9--;
        }
        float f5 = dVar.f319066e + dVar.f319065d + f;
        int i17 = dVar.f319063b + 1;
        int i18 = i + 1;
        while (i18 < size2) {
            C106719d dVar6 = this.mItems.get(i18);
            while (true) {
                i2 = dVar6.f319063b;
                if (i17 >= i2) {
                    break;
                }
                f5 += this.mAdapter.getPageWidth(i17) + f;
                i17++;
            }
            if (i2 == i15) {
                this.mLastOffset = (dVar6.f319065d + f5) - 1.0f;
            }
            dVar6.f319066e = f5;
            f5 += dVar6.f319065d + f;
            i18++;
            i17++;
        }
        this.mNeedCalculatePageOffsets = false;
    }

    private void completeScroll(boolean z) {
        boolean z2 = this.mScrollState == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            this.mScroller.abortAnimation();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.mScroller.getCurrX();
            int currY = this.mScroller.getCurrY();
            if (!(scrollX == currX && scrollY == currY)) {
                scrollTo(currX, currY);
            }
        }
        this.mPopulatePending = false;
        for (int i = 0; i < this.mItems.size(); i++) {
            C106719d dVar = this.mItems.get(i);
            if (dVar.f319064c) {
                dVar.f319064c = false;
                z2 = true;
            }
        }
        if (!z2) {
            return;
        }
        if (z) {
            Runnable runnable = this.mEndScrollRunnable;
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            C107207u.C107208b.m145185m(this, runnable);
            return;
        }
        this.mEndScrollRunnable.run();
    }

    private int determineTargetPage(int i, float f, int i2, int i3) {
        if (Math.abs(i3) <= this.mFlingDistance || Math.abs(i2) <= this.mMinimumVelocity) {
            i = (int) (((float) i) + f + (i >= this.mCurItem ? 0.6f : 0.4f));
        } else if (i2 <= 0) {
            i++;
        }
        return this.mItems.size() > 0 ? Math.max(firstItemPosForDetermine(), Math.min(i, lastItemPosForDetermine())) : i;
    }

    private void enableLayers(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            int i2 = z ? 2 : 0;
            View childAt = getChildAt(i);
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            childAt.setLayerType(i2, (Paint) null);
        }
    }

    private void endDrag() {
        this.mIsBeingDragged = false;
        this.mIsUnableToDrag = false;
        this.mIgnoreGutter = false;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    private Rect getChildRectInPagerCoordinates(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private C106719d infoForCurrentScrollPosition() {
        int i;
        int clientWidth = getClientWidth();
        float f = 0.0f;
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        float f2 = clientWidth > 0 ? ((float) this.mPageMargin) / ((float) clientWidth) : 0.0f;
        C106719d dVar = null;
        float f3 = 0.0f;
        int i2 = -1;
        int i3 = 0;
        boolean z = true;
        while (i3 < this.mItems.size()) {
            C106719d dVar2 = this.mItems.get(i3);
            if (!z && dVar2.f319063b != (i = i2 + 1)) {
                dVar2 = this.mTempItem;
                dVar2.f319066e = f + f3 + f2;
                dVar2.f319063b = i;
                dVar2.f319065d = this.mAdapter.getPageWidth(i);
                i3--;
            }
            f = dVar2.f319066e;
            float f4 = dVar2.f319065d + f + f2;
            if (!z && scrollX < f) {
                return dVar;
            }
            if (scrollX < f4 || i3 == this.mItems.size() - 1) {
                return dVar2;
            }
            i2 = dVar2.f319063b;
            f3 = dVar2.f319065d;
            i3++;
            dVar = dVar2;
            z = false;
        }
        return dVar;
    }

    private void notifyOnPageScrollStateChanged(int i) {
        for (ViewPager.OnPageChangeListener onPageScrollStateChanged : this.listeners) {
            onPageScrollStateChanged.onPageScrollStateChanged(i);
        }
    }

    private void notifyOnPageScrolled(int i, float f, int i2) {
        for (ViewPager.OnPageChangeListener onPageScrolled : this.listeners) {
            onPageScrolled.onPageScrolled(i, f, i2);
        }
    }

    private void notifyOnPageSelected(int i) {
        for (ViewPager.OnPageChangeListener onPageSelected : this.listeners) {
            onPageSelected.onPageSelected(i);
        }
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
            int i = actionIndex == 0 ? 1 : 0;
            this.mLastMotionX = motionEvent.getX(i);
            this.mActivePointerId = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private boolean pageScrolled(int i) {
        if (this.mItems.size() == 0) {
            this.mCalledSuper = false;
            onPageScrolled(0, 0.0f, 0);
            if (this.mCalledSuper) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        C106719d infoForCurrentScrollPosition = infoForCurrentScrollPosition();
        if (infoForCurrentScrollPosition == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int i2 = this.mPageMargin;
        int i3 = clientWidth + i2;
        float f = (float) clientWidth;
        int i4 = infoForCurrentScrollPosition.f319063b;
        float f2 = ((((float) i) / f) - infoForCurrentScrollPosition.f319066e) / (infoForCurrentScrollPosition.f319065d + (((float) i2) / f));
        this.mCalledSuper = false;
        onPageScrolled(i4, f2, (int) (((float) i3) * f2));
        if (this.mCalledSuper) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private boolean performDrag(float f) {
        boolean z;
        boolean z2;
        float f2 = this.mLastMotionX - f;
        this.mLastMotionX = f;
        float scrollX = ((float) getScrollX()) + f2;
        float clientWidth = (float) getClientWidth();
        float f3 = this.mFirstOffset * clientWidth;
        float f4 = this.mLastOffset * clientWidth;
        boolean z3 = false;
        C106719d dVar = this.mItems.get(0);
        ArrayList<C106719d> arrayList = this.mItems;
        C106719d dVar2 = arrayList.get(arrayList.size() - 1);
        if (dVar.f319063b != 0) {
            f3 = dVar.f319066e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (dVar2.f319063b != this.mAdapter.getCount() - 1) {
            f4 = dVar2.f319066e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.mLeftEdge.mo145033c(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.mRightEdge.mo145033c(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.mLastMotionX += scrollX - ((float) i);
        scrollTo(i, getScrollY());
        pageScrolled(i);
        return z3;
    }

    private void recomputeScrollPosition(int i, int i2, int i3, int i4) {
        if (i2 <= 0 || this.mItems.isEmpty()) {
            C106719d infoForPosition = infoForPosition(this.mCurItem);
            int min = (int) ((infoForPosition != null ? Math.min(infoForPosition.f319066e, this.mLastOffset) : 0.0f) * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                completeScroll(false);
                scrollTo(min, getScrollY());
                return;
            }
            return;
        }
        int scrollX = (int) ((((float) getScrollX()) / ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))) * ((float) (((i - getPaddingLeft()) - getPaddingRight()) + i3)));
        scrollTo(scrollX, getScrollY());
        if (!this.mScroller.isFinished()) {
            int duration = this.mScroller.getDuration() - this.mScroller.timePassed();
            C106719d infoForPosition2 = infoForPosition(this.mCurItem);
            if (infoForPosition2 != null) {
                this.mScroller.startScroll(scrollX, 0, (int) (infoForPosition2.f319066e * ((float) i)), 0, duration);
            }
        }
    }

    private void removeNonDecorViews() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((LayoutParams) getChildAt(i).getLayoutParams()).f319052a) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    private void scrollToItem(int i, boolean z, int i2, boolean z2) {
        ViewPager.OnPageChangeListener onPageChangeListener;
        ViewPager.OnPageChangeListener onPageChangeListener2;
        ViewPager.OnPageChangeListener onPageChangeListener3;
        ViewPager.OnPageChangeListener onPageChangeListener4;
        C106719d infoForPosition = infoForPosition(i);
        int clientWidth = infoForPosition != null ? (int) (((float) getClientWidth()) * Math.max(this.mFirstOffset, Math.min(infoForPosition.f319066e, this.mLastOffset))) : 0;
        if (z) {
            smoothScrollTo(clientWidth, 0, i2);
            if (z2 && (onPageChangeListener4 = this.mOnPageChangeListener) != null) {
                onPageChangeListener4.onPageSelected(i);
            }
            if (z2 && (onPageChangeListener3 = this.mInternalPageChangeListener) != null) {
                onPageChangeListener3.onPageSelected(i);
            }
            if (z2) {
                notifyOnPageSelected(i);
                return;
            }
            return;
        }
        if (z2 && (onPageChangeListener2 = this.mOnPageChangeListener) != null) {
            onPageChangeListener2.onPageSelected(i);
        }
        if (z2 && (onPageChangeListener = this.mInternalPageChangeListener) != null) {
            onPageChangeListener.onPageSelected(i);
        }
        if (z2) {
            notifyOnPageSelected(i);
        }
        completeScroll(false);
        scrollTo(clientWidth, 0);
        pageScrolled(clientWidth);
    }

    /* access modifiers changed from: private */
    public void setScrollState(int i) {
        if (this.mScrollState != i) {
            this.mScrollState = i;
            if (this.mPageTransformer != null) {
                enableLayers(i != 0);
            }
            ViewPager.OnPageChangeListener onPageChangeListener = this.mOnPageChangeListener;
            if (onPageChangeListener != null) {
                onPageChangeListener.onPageScrollStateChanged(i);
            }
            notifyOnPageScrollStateChanged(i);
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.mScrollingCacheEnabled != z) {
            this.mScrollingCacheEnabled = z;
        }
    }

    private void sortChildDrawingOrder() {
        if (this.mDrawingOrder != 0) {
            ArrayList<View> arrayList = this.mDrawingOrderedChildren;
            if (arrayList == null) {
                this.mDrawingOrderedChildren = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.mDrawingOrderedChildren.add(getChildAt(i));
            }
            Collections.sort(this.mDrawingOrderedChildren, sPositionComparator);
        }
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C106719d infoForChild;
        Assert.assertNotNull(arrayList);
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.f319063b == this.mCurItem) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if ((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) {
            arrayList.add(this);
        }
    }

    public C106719d addNewItem(int i, int i2) {
        C106719d dVar = new C106719d();
        dVar.f319063b = i;
        dVar.f319062a = this.mAdapter.instantiateItem((ViewGroup) this, i);
        dVar.f319065d = this.mAdapter.getPageWidth(i);
        if (i2 < 0 || i2 >= this.mItems.size()) {
            this.mItems.add(dVar);
        } else {
            this.mItems.add(i2, dVar);
        }
        return dVar;
    }

    public void addOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        if (!this.listeners.contains(onPageChangeListener)) {
            this.listeners.add(onPageChangeListener);
        }
    }

    public void addTouchables(ArrayList<View> arrayList) {
        C106719d infoForChild;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.f319063b == this.mCurItem) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        Assert.assertNotNull(layoutParams);
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        boolean z = layoutParams2.f319052a | false;
        layoutParams2.f319052a = z;
        if (!this.mInLayout) {
            super.addView(view, i, layoutParams);
        } else if (!z) {
            layoutParams2.f319055d = true;
            addViewInLayout(view, i, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean arrowScroll(int r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.findFocus()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != r6) goto L_0x000b
        L_0x0009:
            r0 = r3
            goto L_0x0031
        L_0x000b:
            if (r0 == 0) goto L_0x0031
            android.view.ViewParent r4 = r0.getParent()
        L_0x0011:
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x001e
            if (r4 != r6) goto L_0x0019
            r4 = 1
            goto L_0x001f
        L_0x0019:
            android.view.ViewParent r4 = r4.getParent()
            goto L_0x0011
        L_0x001e:
            r4 = 0
        L_0x001f:
            if (r4 != 0) goto L_0x0031
            android.view.ViewParent r0 = r0.getParent()
        L_0x0025:
            boolean r4 = r0 instanceof android.view.ViewGroup
            if (r4 == 0) goto L_0x0009
            r0.getClass()
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x0025
        L_0x0031:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r6, r0, r7)
            r4 = 66
            r5 = 17
            if (r3 == 0) goto L_0x0082
            if (r3 == r0) goto L_0x0082
            if (r7 != r5) goto L_0x0062
            android.graphics.Rect r1 = r6.mTempRect
            android.graphics.Rect r1 = r6.getChildRectInPagerCoordinates(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.mTempRect
            android.graphics.Rect r2 = r6.getChildRectInPagerCoordinates(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L_0x005c
            if (r1 < r2) goto L_0x005c
            boolean r0 = r6.pageLeft()
            goto L_0x0060
        L_0x005c:
            boolean r0 = r3.requestFocus()
        L_0x0060:
            r2 = r0
            goto L_0x0095
        L_0x0062:
            if (r7 != r4) goto L_0x0095
            android.graphics.Rect r1 = r6.mTempRect
            android.graphics.Rect r1 = r6.getChildRectInPagerCoordinates(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.mTempRect
            android.graphics.Rect r2 = r6.getChildRectInPagerCoordinates(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L_0x007d
            if (r1 > r2) goto L_0x007d
            boolean r0 = r6.pageRight()
            goto L_0x0060
        L_0x007d:
            boolean r0 = r3.requestFocus()
            goto L_0x0060
        L_0x0082:
            if (r7 == r5) goto L_0x0091
            if (r7 != r1) goto L_0x0087
            goto L_0x0091
        L_0x0087:
            if (r7 == r4) goto L_0x008c
            r0 = 2
            if (r7 != r0) goto L_0x0095
        L_0x008c:
            boolean r2 = r6.pageRight()
            goto L_0x0095
        L_0x0091:
            boolean r2 = r6.pageLeft()
        L_0x0095:
            if (r2 == 0) goto L_0x009e
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        L_0x009e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.mogic.WxViewPager.arrowScroll(int):boolean");
    }

    public boolean beginFakeDrag() {
        if (this.mIsBeingDragged) {
            return false;
        }
        this.mFakeDragging = true;
        setScrollState(1);
        this.mLastMotionX = 0.0f;
        this.mInitialMotionX = 0.0f;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.mVelocityTracker.addMovement(obtain);
        obtain.recycle();
        this.mFakeDragBeginTime = uptimeMillis;
        return true;
    }

    public boolean canScroll(View view, boolean z, int i, int i2, int i3) {
        int i4;
        View view2 = view;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom()) {
                    if (canScroll(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop()) && childAt.isEnabled()) {
                        return true;
                    }
                }
            }
        }
        if (z) {
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            if (view.canScrollHorizontally(-i)) {
                return true;
            }
        }
        return false;
    }

    public boolean canScrollHorizontally(int i) {
        if (this.mAdapter == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) clientWidth) * this.mFirstOffset)) : i > 0 && scrollX < ((int) (((float) clientWidth) * this.mLastOffset));
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        if (this.mScroller.isFinished() || !this.mScroller.computeScrollOffset()) {
            completeScroll(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.mScroller.getCurrX();
        int currY = this.mScroller.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!pageScrolled(currX)) {
                this.mScroller.abortAnimation();
                scrollTo(0, currY);
            }
        }
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        C107207u.C107208b.m145183k(this);
    }

    public void dataSetChanged() {
        int count = this.mAdapter.getCount();
        this.mExpectedAdapterCount = count;
        boolean z = this.mItems.size() < (this.mOffscreenPageLimit * 2) + 1 && this.mItems.size() < count;
        int i = this.mCurItem;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.mItems.size()) {
            C106719d dVar = this.mItems.get(i2);
            int itemPosition = this.mAdapter.getItemPosition(dVar.f319062a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.mItems.remove(i2);
                    i2--;
                    if (!z2) {
                        this.mAdapter.startUpdate((ViewGroup) this);
                        z2 = true;
                    }
                    this.mAdapter.destroyItem((ViewGroup) this, dVar.f319063b, dVar.f319062a);
                    int i3 = this.mCurItem;
                    if (i3 == dVar.f319063b) {
                        i = Math.max(0, Math.min(i3, count - 1));
                    }
                } else {
                    int i4 = dVar.f319063b;
                    if (i4 != itemPosition) {
                        if (i4 == this.mCurItem) {
                            i = itemPosition;
                        }
                        dVar.f319063b = itemPosition;
                    }
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.mAdapter.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.mItems, COMPARATOR);
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i5).getLayoutParams();
                if (!layoutParams.f319052a) {
                    layoutParams.f319054c = 0.0f;
                }
            }
            setCurrentItemInternal(i, false, true);
            requestLayout();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || executeKeyEvent(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C106719d infoForChild;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.f319063b == this.mCurItem && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public float distanceInfluenceForSnapDuration(float f) {
        return (float) Math.sin((double) ((float) (((double) (f - 0.5f)) * 0.4712389167638204d)));
    }

    public void draw(Canvas canvas) {
        C103853a aVar;
        super.draw(canvas);
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.mAdapter) != null && aVar.getCount() > 1)) {
            if (!this.mLeftEdge.mo145032b()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-height) + getPaddingTop()), this.mFirstOffset * ((float) width));
                this.mLeftEdge.f306420a.setSize(height, width);
                z = false | this.mLeftEdge.f306420a.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.mRightEdge.mo145032b()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.mLastOffset + 1.0f)) * ((float) width2));
                this.mRightEdge.f306420a.setSize(height2, width2);
                z |= this.mRightEdge.f306420a.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.mLeftEdge.f306420a.finish();
            this.mRightEdge.f306420a.finish();
        }
        if (z) {
            C107207u.C107208b.m145183k(this);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.mMarginDrawable;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public void endFakeDrag() {
        if (this.mFakeDragging) {
            VelocityTracker velocityTracker = this.mVelocityTracker;
            velocityTracker.computeCurrentVelocity(1000, (float) this.mMaximumVelocity);
            int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
            this.mPopulatePending = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            C106719d infoForCurrentScrollPosition = infoForCurrentScrollPosition();
            if (infoForCurrentScrollPosition != null) {
                setCurrentItemInternal(determineTargetPage(infoForCurrentScrollPosition.f319063b, ((((float) scrollX) / ((float) clientWidth)) - infoForCurrentScrollPosition.f319066e) / infoForCurrentScrollPosition.f319065d, xVelocity, (int) (this.mLastMotionX - this.mInitialMotionX)), true, true, xVelocity);
            }
            endDrag();
            this.mFakeDragging = false;
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    public boolean executeKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 21) {
                return arrowScroll(17);
            }
            if (keyCode == 22) {
                return arrowScroll(66);
            }
            if (keyCode == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return arrowScroll(2);
                }
                if (keyEvent.hasModifiers(1)) {
                    return arrowScroll(1);
                }
            }
        }
        return false;
    }

    public void fakeDragBy(float f) {
        if (this.mFakeDragging) {
            this.mLastMotionX += f;
            float scrollX = ((float) getScrollX()) - f;
            float clientWidth = (float) getClientWidth();
            float f2 = this.mFirstOffset * clientWidth;
            float f3 = this.mLastOffset * clientWidth;
            C106719d dVar = this.mItems.get(0);
            ArrayList<C106719d> arrayList = this.mItems;
            C106719d dVar2 = arrayList.get(arrayList.size() - 1);
            if (dVar.f319063b != 0) {
                f2 = dVar.f319066e * clientWidth;
            }
            if (dVar2.f319063b != this.mAdapter.getCount() - 1) {
                f3 = dVar2.f319066e * clientWidth;
            }
            if (scrollX < f2) {
                scrollX = f2;
            } else if (scrollX > f3) {
                scrollX = f3;
            }
            int i = (int) scrollX;
            this.mLastMotionX += scrollX - ((float) i);
            scrollTo(i, getScrollY());
            pageScrolled(i);
            MotionEvent obtain = MotionEvent.obtain(this.mFakeDragBeginTime, SystemClock.uptimeMillis(), 2, this.mLastMotionX, 0.0f, 0);
            this.mVelocityTracker.addMovement(obtain);
            obtain.recycle();
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    public int firstItemPosForDetermine() {
        return this.mItems.get(0).f319063b;
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public C103853a getAdapter() {
        return this.mAdapter;
    }

    public int getChildDrawingOrder(int i, int i2) {
        if (this.mDrawingOrder == 2) {
            i2 = (i - 1) - i2;
        }
        return ((LayoutParams) this.mDrawingOrderedChildren.get(i2).getLayoutParams()).f319057f;
    }

    public int getCurrentItem() {
        return this.mCurItem;
    }

    public int getOffscreenPageLimit() {
        return this.mOffscreenPageLimit;
    }

    public int getPageMargin() {
        return this.mPageMargin;
    }

    public C106719d infoForAnyChild(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return infoForChild(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    public C106719d infoForChild(View view) {
        for (int i = 0; i < this.mItems.size(); i++) {
            C106719d dVar = this.mItems.get(i);
            if (this.mAdapter.isViewFromObject(view, dVar.f319062a)) {
                return dVar;
            }
        }
        return null;
    }

    public C106719d infoForPosition(int i) {
        for (int i2 = 0; i2 < this.mItems.size(); i2++) {
            C106719d dVar = this.mItems.get(i2);
            if (dVar.f319063b == i) {
                return dVar;
            }
        }
        return null;
    }

    public void initViewPager() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.mScroller = new Scroller(context, sInterpolator);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        Method method = C107222v.f320820a;
        this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        this.mMinimumVelocity = (int) (400.0f * f);
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mLeftEdge = new C103726d(context);
        this.mRightEdge = new C103726d(context);
        this.mFlingDistance = (int) (25.0f * f);
        this.mCloseEnough = (int) (2.0f * f);
        this.mDefaultGutterSize = (int) (f * 16.0f);
        C107207u.m145168i(this, new C106720e());
        if (C107207u.C107208b.m145175c(this) == 0) {
            C107207u.C107208b.m145191s(this, 1);
        }
    }

    public boolean isFakeDragging() {
        return this.mFakeDragging;
    }

    public boolean isGutterDrag(float f, float f2) {
        return (f < ((float) this.mGutterSize) && f2 > 0.0f) || (f > ((float) (getWidth() - this.mGutterSize)) && f2 < 0.0f);
    }

    public int lastItemPosForDetermine() {
        ArrayList<C106719d> arrayList = this.mItems;
        return arrayList.get(arrayList.size() - 1).f319063b;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    public void onDetachedFromWindow() {
        removeCallbacks(this.mEndScrollRunnable);
        super.onDetachedFromWindow();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r18) {
        /*
            r17 = this;
            r0 = r17
            super.onDraw(r18)
            int r1 = r0.mPageMargin
            if (r1 <= 0) goto L_0x00aa
            android.graphics.drawable.Drawable r1 = r0.mMarginDrawable
            if (r1 == 0) goto L_0x00aa
            java.util.ArrayList<com.tencent.mm.ui.mogic.WxViewPager$d> r1 = r0.mItems
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x00aa
            androidx.viewpager.widget.a r1 = r0.mAdapter
            if (r1 == 0) goto L_0x00aa
            int r1 = r17.getScrollX()
            int r2 = r17.getWidth()
            int r3 = r0.mPageMargin
            float r3 = (float) r3
            float r4 = (float) r2
            float r3 = r3 / r4
            java.util.ArrayList<com.tencent.mm.ui.mogic.WxViewPager$d> r5 = r0.mItems
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            com.tencent.mm.ui.mogic.WxViewPager$d r5 = (com.tencent.p014mm.p136ui.mogic.WxViewPager.C106719d) r5
            float r7 = r5.f319066e
            java.util.ArrayList<com.tencent.mm.ui.mogic.WxViewPager$d> r8 = r0.mItems
            int r8 = r8.size()
            int r9 = r5.f319063b
            java.util.ArrayList<com.tencent.mm.ui.mogic.WxViewPager$d> r10 = r0.mItems
            int r11 = r8 + -1
            java.lang.Object r10 = r10.get(r11)
            com.tencent.mm.ui.mogic.WxViewPager$d r10 = (com.tencent.p014mm.p136ui.mogic.WxViewPager.C106719d) r10
            int r10 = r10.f319063b
        L_0x0045:
            if (r9 >= r10) goto L_0x00aa
        L_0x0047:
            int r11 = r5.f319063b
            if (r9 <= r11) goto L_0x0058
            if (r6 >= r8) goto L_0x0058
            java.util.ArrayList<com.tencent.mm.ui.mogic.WxViewPager$d> r5 = r0.mItems
            int r6 = r6 + 1
            java.lang.Object r5 = r5.get(r6)
            com.tencent.mm.ui.mogic.WxViewPager$d r5 = (com.tencent.p014mm.p136ui.mogic.WxViewPager.C106719d) r5
            goto L_0x0047
        L_0x0058:
            if (r9 != r11) goto L_0x0065
            float r7 = r5.f319066e
            float r11 = r5.f319065d
            float r12 = r7 + r11
            float r12 = r12 * r4
            float r7 = r7 + r11
            float r7 = r7 + r3
            goto L_0x0071
        L_0x0065:
            androidx.viewpager.widget.a r11 = r0.mAdapter
            float r11 = r11.getPageWidth(r9)
            float r12 = r7 + r11
            float r12 = r12 * r4
            float r11 = r11 + r3
            float r7 = r7 + r11
        L_0x0071:
            int r11 = r0.mPageMargin
            float r13 = (float) r11
            float r13 = r13 + r12
            float r14 = (float) r1
            int r13 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r13 <= 0) goto L_0x0099
            android.graphics.drawable.Drawable r13 = r0.mMarginDrawable
            int r14 = (int) r12
            int r14 = r14 + -1
            int r15 = r0.mTopPageBounds
            float r11 = (float) r11
            float r11 = r11 + r12
            r16 = 1056964608(0x3f000000, float:0.5)
            float r11 = r11 + r16
            int r11 = (int) r11
            int r11 = r11 + -1
            r16 = r3
            int r3 = r0.mBottomPageBounds
            r13.setBounds(r14, r15, r11, r3)
            android.graphics.drawable.Drawable r3 = r0.mMarginDrawable
            r11 = r18
            r3.draw(r11)
            goto L_0x009d
        L_0x0099:
            r11 = r18
            r16 = r3
        L_0x009d:
            int r3 = r1 + r2
            float r3 = (float) r3
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x00a5
            goto L_0x00aa
        L_0x00a5:
            int r9 = r9 + 1
            r3 = r16
            goto L_0x0045
        L_0x00aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.mogic.WxViewPager.onDraw(android.graphics.Canvas):void");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            this.mIsBeingDragged = false;
            this.mIsUnableToDrag = false;
            this.mIgnoreGutter = false;
            this.mActivePointerId = -1;
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.mVelocityTracker = null;
            }
            return false;
        }
        if (action != 0) {
            if (this.mIsBeingDragged) {
                return true;
            }
            if (this.mIsUnableToDrag) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.mInitialMotionX = x;
            this.mLastMotionX = x;
            float y = motionEvent.getY();
            this.mInitialMotionY = y;
            this.mLastMotionY = y;
            this.mActivePointerId = motionEvent2.getPointerId(0);
            this.mIsUnableToDrag = false;
            this.mScroller.computeScrollOffset();
            if (this.mScrollState != 2 || Math.abs(this.mScroller.getFinalX() - this.mScroller.getCurrX()) <= this.mCloseEnough) {
                completeScroll(false);
                this.mIsBeingDragged = false;
            } else {
                this.mScroller.abortAnimation();
                this.mPopulatePending = false;
                populate();
                this.mIsBeingDragged = true;
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.mActivePointerId;
            if (i != -1) {
                int findPointerIndex = motionEvent2.findPointerIndex(i);
                float x2 = motionEvent2.getX(findPointerIndex);
                float f = x2 - this.mLastMotionX;
                float abs = Math.abs(f);
                float y2 = motionEvent2.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.mInitialMotionY);
                int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (i2 != 0 && !isGutterDrag(this.mLastMotionX, f) && !this.mIgnoreGutter) {
                    if (canScroll(this, false, (int) f, (int) x2, (int) y2)) {
                        this.mLastMotionX = x2;
                        this.mLastMotionY = y2;
                        this.mIsUnableToDrag = true;
                        return false;
                    }
                }
                int i3 = this.mTouchSlop;
                if (abs > ((float) i3) && abs * 0.5f > abs2) {
                    this.mIsBeingDragged = true;
                    setScrollState(1);
                    this.mLastMotionX = i2 > 0 ? this.mInitialMotionX + ((float) this.mTouchSlop) : this.mInitialMotionX - ((float) this.mTouchSlop);
                    this.mLastMotionY = y2;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > ((float) i3)) {
                    this.mIsUnableToDrag = true;
                }
                if (this.mIsBeingDragged && performDrag(x2)) {
                    WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                    C107207u.C107208b.m145183k(this);
                }
            }
        } else if (action == 6) {
            onSecondaryPointerUp(motionEvent);
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent2);
        return this.mIsBeingDragged;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r18.getChildCount()
            int r2 = r22 - r20
            int r3 = r23 - r21
            int r4 = r18.getPaddingLeft()
            int r5 = r18.getPaddingTop()
            int r6 = r18.getPaddingRight()
            int r7 = r18.getPaddingBottom()
            int r8 = r18.getScrollX()
            r10 = 0
            r11 = 0
        L_0x0020:
            r12 = 8
            if (r10 >= r1) goto L_0x00b6
            android.view.View r13 = r0.getChildAt(r10)
            int r14 = r13.getVisibility()
            if (r14 == r12) goto L_0x00b2
            android.view.ViewGroup$LayoutParams r12 = r13.getLayoutParams()
            com.tencent.mm.ui.mogic.WxViewPager$LayoutParams r12 = (com.tencent.p014mm.p136ui.mogic.WxViewPager.LayoutParams) r12
            boolean r14 = r12.f319052a
            if (r14 == 0) goto L_0x00b2
            int r12 = r12.f319053b
            r14 = r12 & 7
            r12 = r12 & 112(0x70, float:1.57E-43)
            r15 = 1
            if (r14 == r15) goto L_0x005c
            r15 = 3
            if (r14 == r15) goto L_0x0056
            r15 = 5
            if (r14 == r15) goto L_0x0049
            r14 = r4
            goto L_0x006d
        L_0x0049:
            int r14 = r2 - r6
            int r15 = r13.getMeasuredWidth()
            int r14 = r14 - r15
            int r15 = r13.getMeasuredWidth()
            int r6 = r6 + r15
            goto L_0x0068
        L_0x0056:
            int r14 = r13.getMeasuredWidth()
            int r14 = r14 + r4
            goto L_0x006d
        L_0x005c:
            int r14 = r13.getMeasuredWidth()
            int r14 = r2 - r14
            int r14 = r14 / 2
            int r14 = java.lang.Math.max(r14, r4)
        L_0x0068:
            r17 = r14
            r14 = r4
            r4 = r17
        L_0x006d:
            r15 = 16
            if (r12 == r15) goto L_0x008e
            r15 = 48
            if (r12 == r15) goto L_0x0088
            r15 = 80
            if (r12 == r15) goto L_0x007b
            r12 = r5
            goto L_0x009f
        L_0x007b:
            int r12 = r3 - r7
            int r15 = r13.getMeasuredHeight()
            int r12 = r12 - r15
            int r15 = r13.getMeasuredHeight()
            int r7 = r7 + r15
            goto L_0x009a
        L_0x0088:
            int r12 = r13.getMeasuredHeight()
            int r12 = r12 + r5
            goto L_0x009f
        L_0x008e:
            int r12 = r13.getMeasuredHeight()
            int r12 = r3 - r12
            int r12 = r12 / 2
            int r12 = java.lang.Math.max(r12, r5)
        L_0x009a:
            r17 = r12
            r12 = r5
            r5 = r17
        L_0x009f:
            int r4 = r4 + r8
            int r15 = r13.getMeasuredWidth()
            int r15 = r15 + r4
            int r16 = r13.getMeasuredHeight()
            int r9 = r5 + r16
            r13.layout(r4, r5, r15, r9)
            int r11 = r11 + 1
            r5 = r12
            r4 = r14
        L_0x00b2:
            int r10 = r10 + 1
            goto L_0x0020
        L_0x00b6:
            int r2 = r2 - r4
            int r2 = r2 - r6
            r6 = 0
        L_0x00b9:
            if (r6 >= r1) goto L_0x0108
            android.view.View r8 = r0.getChildAt(r6)
            int r9 = r8.getVisibility()
            if (r9 == r12) goto L_0x0105
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            com.tencent.mm.ui.mogic.WxViewPager$LayoutParams r9 = (com.tencent.p014mm.p136ui.mogic.WxViewPager.LayoutParams) r9
            boolean r10 = r9.f319052a
            if (r10 != 0) goto L_0x0105
            com.tencent.mm.ui.mogic.WxViewPager$d r10 = r0.infoForChild(r8)
            if (r10 == 0) goto L_0x0105
            float r13 = (float) r2
            float r10 = r10.f319066e
            float r10 = r10 * r13
            int r10 = (int) r10
            int r10 = r10 + r4
            boolean r14 = r9.f319055d
            if (r14 == 0) goto L_0x00f8
            r14 = 0
            r9.f319055d = r14
            float r9 = r9.f319054c
            float r13 = r13 * r9
            int r9 = (int) r13
            r13 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r13)
            int r14 = r3 - r5
            int r14 = r14 - r7
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r13)
            r8.measure(r9, r13)
        L_0x00f8:
            int r9 = r8.getMeasuredWidth()
            int r9 = r9 + r10
            int r13 = r8.getMeasuredHeight()
            int r13 = r13 + r5
            r8.layout(r10, r5, r9, r13)
        L_0x0105:
            int r6 = r6 + 1
            goto L_0x00b9
        L_0x0108:
            r0.mTopPageBounds = r5
            int r3 = r3 - r7
            r0.mBottomPageBounds = r3
            r0.mDecorChildCount = r11
            boolean r1 = r0.mFirstLayout
            if (r1 == 0) goto L_0x011a
            int r1 = r0.mCurItem
            r2 = 0
            r0.scrollToItem(r1, r2, r2, r2)
            goto L_0x011b
        L_0x011a:
            r2 = 0
        L_0x011b:
            r0.mFirstLayout = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.mogic.WxViewPager.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r14, int r15) {
        /*
            r13 = this;
            r0 = 0
            int r14 = android.view.View.getDefaultSize(r0, r14)
            int r15 = android.view.View.getDefaultSize(r0, r15)
            r13.setMeasuredDimension(r14, r15)
            int r14 = r13.getMeasuredWidth()
            int r15 = r14 / 10
            int r1 = r13.mDefaultGutterSize
            int r15 = java.lang.Math.min(r15, r1)
            r13.mGutterSize = r15
            int r15 = r13.getPaddingLeft()
            int r14 = r14 - r15
            int r15 = r13.getPaddingRight()
            int r14 = r14 - r15
            int r15 = r13.getMeasuredHeight()
            int r1 = r13.getPaddingTop()
            int r15 = r15 - r1
            int r1 = r13.getPaddingBottom()
            int r15 = r15 - r1
            int r1 = r13.getChildCount()
            r2 = 0
        L_0x0037:
            r3 = 8
            r4 = 1
            r5 = 1073741824(0x40000000, float:2.0)
            if (r2 >= r1) goto L_0x00b2
            android.view.View r6 = r13.getChildAt(r2)
            int r7 = r6.getVisibility()
            if (r7 == r3) goto L_0x00af
            android.view.ViewGroup$LayoutParams r3 = r6.getLayoutParams()
            com.tencent.mm.ui.mogic.WxViewPager$LayoutParams r3 = (com.tencent.p014mm.p136ui.mogic.WxViewPager.LayoutParams) r3
            if (r3 == 0) goto L_0x00af
            boolean r7 = r3.f319052a
            if (r7 == 0) goto L_0x00af
            int r7 = r3.f319053b
            r8 = r7 & 7
            r7 = r7 & 112(0x70, float:1.57E-43)
            r9 = 48
            if (r7 == r9) goto L_0x0065
            r9 = 80
            if (r7 != r9) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            r7 = 0
            goto L_0x0066
        L_0x0065:
            r7 = 1
        L_0x0066:
            r9 = 3
            if (r8 == r9) goto L_0x006e
            r9 = 5
            if (r8 != r9) goto L_0x006d
            goto L_0x006e
        L_0x006d:
            r4 = 0
        L_0x006e:
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 == 0) goto L_0x0075
            r8 = 1073741824(0x40000000, float:2.0)
            goto L_0x007a
        L_0x0075:
            if (r4 == 0) goto L_0x007a
            r9 = 1073741824(0x40000000, float:2.0)
            goto L_0x007c
        L_0x007a:
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x007c:
            int r10 = r3.width
            r11 = -1
            r12 = -2
            if (r10 == r12) goto L_0x0089
            if (r10 == r11) goto L_0x0085
            goto L_0x0086
        L_0x0085:
            r10 = r14
        L_0x0086:
            r8 = 1073741824(0x40000000, float:2.0)
            goto L_0x008a
        L_0x0089:
            r10 = r14
        L_0x008a:
            int r3 = r3.height
            if (r3 == r12) goto L_0x0093
            if (r3 == r11) goto L_0x0091
            goto L_0x0095
        L_0x0091:
            r3 = r15
            goto L_0x0095
        L_0x0093:
            r3 = r15
            r5 = r9
        L_0x0095:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r8)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r5)
            r6.measure(r8, r3)
            if (r7 == 0) goto L_0x00a8
            int r3 = r6.getMeasuredHeight()
            int r15 = r15 - r3
            goto L_0x00af
        L_0x00a8:
            if (r4 == 0) goto L_0x00af
            int r3 = r6.getMeasuredWidth()
            int r14 = r14 - r3
        L_0x00af:
            int r2 = r2 + 1
            goto L_0x0037
        L_0x00b2:
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r5)
            r13.mChildWidthMeasureSpec = r1
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r5)
            r13.mChildHeightMeasureSpec = r15
            r13.mInLayout = r4
            r13.populate()
            r13.mInLayout = r0
            int r15 = r13.getChildCount()
        L_0x00c9:
            if (r0 >= r15) goto L_0x00f5
            android.view.View r1 = r13.getChildAt(r0)
            int r2 = r1.getVisibility()
            if (r2 == r3) goto L_0x00f2
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            com.tencent.mm.ui.mogic.WxViewPager$LayoutParams r2 = (com.tencent.p014mm.p136ui.mogic.WxViewPager.LayoutParams) r2
            if (r2 == 0) goto L_0x00e1
            boolean r4 = r2.f319052a
            if (r4 != 0) goto L_0x00f2
        L_0x00e1:
            if (r2 == 0) goto L_0x00f2
            float r4 = (float) r14
            float r2 = r2.f319054c
            float r4 = r4 * r2
            int r2 = (int) r4
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r5)
            int r4 = r13.mChildHeightMeasureSpec
            r1.measure(r2, r4)
        L_0x00f2:
            int r0 = r0 + 1
            goto L_0x00c9
        L_0x00f5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.mogic.WxViewPager.onMeasure(int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPageScrolled(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.mDecorChildCount
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L_0x006b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = 0
        L_0x001b:
            if (r7 >= r6) goto L_0x006b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            com.tencent.mm.ui.mogic.WxViewPager$LayoutParams r9 = (com.tencent.p014mm.p136ui.mogic.WxViewPager.LayoutParams) r9
            boolean r10 = r9.f319052a
            if (r10 != 0) goto L_0x002c
            goto L_0x0068
        L_0x002c:
            int r9 = r9.f319053b
            r9 = r9 & 7
            if (r9 == r2) goto L_0x004d
            r10 = 3
            if (r9 == r10) goto L_0x0047
            r10 = 5
            if (r9 == r10) goto L_0x003a
            r9 = r3
            goto L_0x005c
        L_0x003a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L_0x0059
        L_0x0047:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L_0x005c
        L_0x004d:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L_0x0059:
            r11 = r9
            r9 = r3
            r3 = r11
        L_0x005c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L_0x0067
            r8.offsetLeftAndRight(r3)
        L_0x0067:
            r3 = r9
        L_0x0068:
            int r7 = r7 + 1
            goto L_0x001b
        L_0x006b:
            androidx.viewpager.widget.ViewPager$OnPageChangeListener r0 = r12.mOnPageChangeListener
            if (r0 == 0) goto L_0x0072
            r0.onPageScrolled(r13, r14, r15)
        L_0x0072:
            androidx.viewpager.widget.ViewPager$OnPageChangeListener r0 = r12.mInternalPageChangeListener
            if (r0 == 0) goto L_0x0079
            r0.onPageScrolled(r13, r14, r15)
        L_0x0079:
            r12.notifyOnPageScrolled(r13, r14, r15)
            androidx.viewpager.widget.ViewPager$h r13 = r12.mPageTransformer
            if (r13 == 0) goto L_0x00af
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L_0x0088:
            if (r1 >= r14) goto L_0x00af
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            com.tencent.mm.ui.mogic.WxViewPager$LayoutParams r0 = (com.tencent.p014mm.p136ui.mogic.WxViewPager.LayoutParams) r0
            boolean r0 = r0.f319052a
            if (r0 == 0) goto L_0x0099
            goto L_0x00ac
        L_0x0099:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            androidx.viewpager.widget.ViewPager$h r3 = r12.mPageTransformer
            xs2.a r3 = (xs2.C15894a) r3
            r3.mo14546a(r15, r0)
        L_0x00ac:
            int r1 = r1 + 1
            goto L_0x0088
        L_0x00af:
            r12.mCalledSuper = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.mogic.WxViewPager.onPageScrolled(int, float, int):void");
    }

    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        C106719d infoForChild;
        int childCount = getChildCount();
        int i4 = -1;
        if ((i & 2) != 0) {
            i4 = childCount;
            i3 = 0;
            i2 = 1;
        } else {
            i3 = childCount - 1;
            i2 = -1;
        }
        while (i3 != i4) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.f319063b == this.mCurItem && childAt.requestFocus(i, rect)) {
                return true;
            }
            i3 += i2;
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        C103853a aVar = this.mAdapter;
        if (aVar != null) {
            aVar.restoreState(savedState.f319059e, savedState.f319060f);
            setCurrentItemInternal(savedState.f319058d, false, true);
            return;
        }
        this.mRestoredCurItem = savedState.f319058d;
        this.mRestoredAdapterState = savedState.f319059e;
        this.mRestoredClassLoader = savedState.f319060f;
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f319058d = this.mCurItem;
        C103853a aVar = this.mAdapter;
        if (aVar != null) {
            savedState.f319059e = aVar.saveState();
        }
        return savedState;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.mPageMargin;
            recomputeScrollPosition(i, i3, i5, i5);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C103853a aVar;
        boolean e;
        boolean e2;
        if (this.mFakeDragging) {
            return true;
        }
        boolean z = 0;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.mAdapter) == null || aVar.getCount() == 0) {
            return false;
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    if (!this.mIsBeingDragged) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
                        float x = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x - this.mLastMotionX);
                        float y = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y - this.mLastMotionY);
                        int i = this.mTouchSlop;
                        if (abs > ((float) i) && abs > abs2) {
                            this.mIsBeingDragged = true;
                            float f = this.mInitialMotionX;
                            this.mLastMotionX = x - f > 0.0f ? f + ((float) i) : f - ((float) i);
                            this.mLastMotionY = y;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                        }
                    }
                    if (this.mIsBeingDragged) {
                        z = false | performDrag(motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)));
                    }
                } else if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.mLastMotionX = motionEvent.getX(actionIndex);
                        this.mActivePointerId = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        onSecondaryPointerUp(motionEvent);
                        this.mLastMotionX = motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId));
                    }
                } else if (this.mIsBeingDragged) {
                    scrollToItem(this.mCurItem, true, 0, false);
                    this.mActivePointerId = -1;
                    endDrag();
                    e = this.mLeftEdge.mo145034e();
                    e2 = this.mRightEdge.mo145034e();
                }
            } else if (this.mIsBeingDragged) {
                VelocityTracker velocityTracker = this.mVelocityTracker;
                velocityTracker.computeCurrentVelocity(1000, (float) this.mMaximumVelocity);
                int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
                this.mPopulatePending = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                C106719d infoForCurrentScrollPosition = infoForCurrentScrollPosition();
                if (infoForCurrentScrollPosition != null) {
                    int i2 = infoForCurrentScrollPosition.f319063b;
                    float f2 = ((((float) scrollX) / ((float) clientWidth)) - infoForCurrentScrollPosition.f319066e) / infoForCurrentScrollPosition.f319065d;
                    int findPointerIndex2 = motionEvent.findPointerIndex(this.mActivePointerId);
                    if (findPointerIndex2 >= 0) {
                        z = findPointerIndex2;
                    }
                    setCurrentItemInternal(determineTargetPage(i2, f2, xVelocity, (int) (motionEvent.getX((int) z) - this.mInitialMotionX)), true, true, xVelocity);
                }
                this.mActivePointerId = -1;
                endDrag();
                e = this.mLeftEdge.mo145034e();
                e2 = this.mRightEdge.mo145034e();
            }
            z = e | e2;
        } else {
            this.mScroller.abortAnimation();
            this.mPopulatePending = false;
            populate();
            this.mIsBeingDragged = true;
            setScrollState(1);
            float x2 = motionEvent.getX();
            this.mInitialMotionX = x2;
            this.mLastMotionX = x2;
            float y2 = motionEvent.getY();
            this.mInitialMotionY = y2;
            this.mLastMotionY = y2;
            this.mActivePointerId = motionEvent.getPointerId(0);
        }
        if (z) {
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            C107207u.C107208b.m145183k(this);
        }
        return true;
    }

    public boolean pageLeft() {
        int i = this.mCurItem;
        if (i <= 0) {
            return false;
        }
        setCurrentItem(i - 1, true);
        return true;
    }

    public boolean pageRight() {
        C103853a aVar = this.mAdapter;
        if (aVar == null || this.mCurItem >= aVar.getCount() - 1) {
            return false;
        }
        setCurrentItem(this.mCurItem + 1, true);
        return true;
    }

    public void populate() {
        populate(this.mCurItem);
    }

    public void removeOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.listeners.remove(onPageChangeListener);
    }

    public void removeView(View view) {
        if (this.mInLayout) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(C103853a aVar) {
        C103853a aVar2 = this.mAdapter;
        if (aVar2 != null) {
            aVar2.unregisterDataSetObserver(this.mObserver);
            this.mAdapter.startUpdate((ViewGroup) this);
            for (int i = 0; i < this.mItems.size(); i++) {
                C106719d dVar = this.mItems.get(i);
                this.mAdapter.destroyItem((ViewGroup) this, dVar.f319063b, dVar.f319062a);
            }
            this.mAdapter.finishUpdate((ViewGroup) this);
            this.mItems.clear();
            removeNonDecorViews();
            scrollTo(0, 0);
        }
        C103853a aVar3 = this.mAdapter;
        this.mAdapter = aVar;
        this.mExpectedAdapterCount = 0;
        if (aVar != null) {
            if (this.mObserver == null) {
                this.mObserver = new C106722g((C106716a) null);
            }
            this.mAdapter.registerDataSetObserver(this.mObserver);
            this.mPopulatePending = false;
            boolean z = this.mFirstLayout;
            this.mFirstLayout = true;
            this.mExpectedAdapterCount = this.mAdapter.getCount();
            if (this.mRestoredCurItem >= 0) {
                this.mAdapter.restoreState(this.mRestoredAdapterState, this.mRestoredClassLoader);
                setCurrentItemInternal(this.mRestoredCurItem, false, true);
                this.mRestoredCurItem = -1;
                this.mRestoredAdapterState = null;
                this.mRestoredClassLoader = null;
            } else if (!z) {
                populate();
            } else {
                requestLayout();
            }
        }
        C106721f fVar = this.mAdapterChangeListener;
        if (fVar != null && aVar3 != aVar) {
            fVar.mo153785a(aVar3, aVar);
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0016 */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001a A[Catch:{ Exception -> 0x0025 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setChildrenDrawingOrderEnabledCompat(boolean r7) {
        /*
            r6 = this;
            java.lang.reflect.Method r0 = r6.mSetChildrenDrawingOrderEnabled
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0016
            java.lang.Class<android.view.ViewGroup> r0 = android.view.ViewGroup.class
            java.lang.String r3 = "setChildrenDrawingOrderEnabled"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0016 }
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch:{ NoSuchMethodException -> 0x0016 }
            r4[r1] = r5     // Catch:{ NoSuchMethodException -> 0x0016 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r3, r4)     // Catch:{ NoSuchMethodException -> 0x0016 }
            r6.mSetChildrenDrawingOrderEnabled = r0     // Catch:{ NoSuchMethodException -> 0x0016 }
        L_0x0016:
            java.lang.reflect.Method r0 = r6.mSetChildrenDrawingOrderEnabled     // Catch:{ Exception -> 0x0025 }
            if (r0 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0025 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ Exception -> 0x0025 }
            r2[r1] = r7     // Catch:{ Exception -> 0x0025 }
            r0.invoke(r6, r2)     // Catch:{ Exception -> 0x0025 }
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.mogic.WxViewPager.setChildrenDrawingOrderEnabledCompat(boolean):void");
    }

    public void setCurrentItem(int i) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i, !this.mFirstLayout, false);
    }

    public void setCurrentItemInternal(int i, boolean z, boolean z2) {
        setCurrentItemInternal(i, z, z2, 0);
    }

    public void setCurrentItemNotify(int i, boolean z) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i, z, false, 0, true);
    }

    public ViewPager.OnPageChangeListener setInternalPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        ViewPager.OnPageChangeListener onPageChangeListener2 = this.mInternalPageChangeListener;
        this.mInternalPageChangeListener = onPageChangeListener;
        return onPageChangeListener2;
    }

    public void setLastMotion(float f, float f2) {
        this.mLastMotionX = f;
        this.mLastMotionY = f2;
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            i = 1;
        }
        if (i != this.mOffscreenPageLimit) {
            this.mOffscreenPageLimit = i;
            populate();
        }
    }

    public void setOnAdapterChangeListener(C106721f fVar) {
        this.mAdapterChangeListener = fVar;
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.mOnPageChangeListener = onPageChangeListener;
    }

    public void setPageMargin(int i) {
        int i2 = this.mPageMargin;
        this.mPageMargin = i;
        int width = getWidth();
        recomputeScrollPosition(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.mMarginDrawable = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageTransformer(boolean z, ViewPager.C0133h hVar) {
        int i = 1;
        boolean z2 = hVar != null;
        boolean z3 = z2 != (this.mPageTransformer != null);
        this.mPageTransformer = hVar;
        setChildrenDrawingOrderEnabledCompat(z2);
        if (z2) {
            if (z) {
                i = 2;
            }
            this.mDrawingOrder = i;
        } else {
            this.mDrawingOrder = 0;
        }
        if (z3) {
            populate();
        }
    }

    public void setScroller(Scroller scroller) {
        this.mScroller = scroller;
    }

    public void setUnableDrag(boolean z, boolean z2) {
        this.mIsUnableToDrag = z;
        this.mIgnoreGutter = z2;
    }

    public void smoothScrollTo(int i, int i2) {
        smoothScrollTo(i, i2, 0);
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mMarginDrawable;
    }

    /* renamed from: com.tencent.mm.ui.mogic.WxViewPager$LayoutParams */
    public static class LayoutParams extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public boolean f319052a;

        /* renamed from: b */
        public int f319053b;

        /* renamed from: c */
        public float f319054c = 0.0f;

        /* renamed from: d */
        public boolean f319055d;

        /* renamed from: e */
        public int f319056e;

        /* renamed from: f */
        public int f319057f;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, WxViewPager.LAYOUT_ATTRS);
            this.f319053b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0068, code lost:
        if (r10 == r11) goto L_0x006f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void populate(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.mCurItem
            if (r2 == r1) goto L_0x0016
            if (r2 >= r1) goto L_0x000d
            r4 = 66
            goto L_0x000f
        L_0x000d:
            r4 = 17
        L_0x000f:
            com.tencent.mm.ui.mogic.WxViewPager$d r2 = r0.infoForPosition(r2)
            r0.mCurItem = r1
            goto L_0x0018
        L_0x0016:
            r4 = 2
            r2 = 0
        L_0x0018:
            androidx.viewpager.widget.a r1 = r0.mAdapter
            if (r1 != 0) goto L_0x0020
            r17.sortChildDrawingOrder()
            return
        L_0x0020:
            boolean r1 = r0.mPopulatePending
            if (r1 == 0) goto L_0x0028
            r17.sortChildDrawingOrder()
            return
        L_0x0028:
            android.os.IBinder r1 = r17.getWindowToken()
            if (r1 != 0) goto L_0x002f
            return
        L_0x002f:
            androidx.viewpager.widget.a r1 = r0.mAdapter
            r1.startUpdate((android.view.ViewGroup) r0)
            int r1 = r0.mOffscreenPageLimit
            int r5 = r0.mCurItem
            int r5 = r5 - r1
            r6 = 0
            int r5 = java.lang.Math.max(r6, r5)
            androidx.viewpager.widget.a r7 = r0.mAdapter
            int r7 = r7.getCount()
            int r8 = r7 + -1
            int r9 = r0.mCurItem
            int r9 = r9 + r1
            int r1 = java.lang.Math.min(r8, r9)
            int r8 = r0.mExpectedAdapterCount
            if (r7 != r8) goto L_0x021a
            r8 = 0
        L_0x0052:
            java.util.ArrayList<com.tencent.mm.ui.mogic.WxViewPager$d> r9 = r0.mItems
            int r9 = r9.size()
            if (r8 >= r9) goto L_0x006e
            java.util.ArrayList<com.tencent.mm.ui.mogic.WxViewPager$d> r9 = r0.mItems
            java.lang.Object r9 = r9.get(r8)
            com.tencent.mm.ui.mogic.WxViewPager$d r9 = (com.tencent.p014mm.p136ui.mogic.WxViewPager.C106719d) r9
            int r10 = r9.f319063b
            int r11 = r0.mCurItem
            if (r10 < r11) goto L_0x006b
            if (r10 != r11) goto L_0x006e
            goto L_0x006f
        L_0x006b:
            int r8 = r8 + 1
            goto L_0x0052
        L_0x006e:
            r9 = 0
        L_0x006f:
            if (r9 != 0) goto L_0x0079
            if (r7 <= 0) goto L_0x0079
            int r9 = r0.mCurItem
            com.tencent.mm.ui.mogic.WxViewPager$d r9 = r0.addNewItem(r9, r8)
        L_0x0079:
            if (r9 == 0) goto L_0x0198
            int r11 = r8 + -1
            if (r11 < 0) goto L_0x0088
            java.util.ArrayList<com.tencent.mm.ui.mogic.WxViewPager$d> r12 = r0.mItems
            java.lang.Object r12 = r12.get(r11)
            com.tencent.mm.ui.mogic.WxViewPager$d r12 = (com.tencent.p014mm.p136ui.mogic.WxViewPager.C106719d) r12
            goto L_0x0089
        L_0x0088:
            r12 = 0
        L_0x0089:
            int r13 = r17.getClientWidth()
            r14 = 1073741824(0x40000000, float:2.0)
            if (r13 > 0) goto L_0x0093
            r15 = 0
            goto L_0x009f
        L_0x0093:
            float r15 = r9.f319065d
            float r15 = r14 - r15
            int r3 = r17.getPaddingLeft()
            float r3 = (float) r3
            float r6 = (float) r13
            float r3 = r3 / r6
            float r15 = r15 + r3
        L_0x009f:
            int r3 = r0.mCurItem
            int r3 = r3 + -1
            r6 = 0
        L_0x00a4:
            if (r3 < 0) goto L_0x0103
            int r16 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r16 < 0) goto L_0x00d2
            if (r3 >= r5) goto L_0x00d2
            if (r12 != 0) goto L_0x00af
            goto L_0x0103
        L_0x00af:
            int r10 = r12.f319063b
            if (r3 != r10) goto L_0x0100
            boolean r10 = r12.f319064c
            if (r10 != 0) goto L_0x0100
            java.util.ArrayList<com.tencent.mm.ui.mogic.WxViewPager$d> r10 = r0.mItems
            r10.remove(r11)
            androidx.viewpager.widget.a r10 = r0.mAdapter
            java.lang.Object r12 = r12.f319062a
            r10.destroyItem((android.view.ViewGroup) r0, (int) r3, (java.lang.Object) r12)
            int r11 = r11 + -1
            int r8 = r8 + -1
            if (r11 < 0) goto L_0x00fe
            java.util.ArrayList<com.tencent.mm.ui.mogic.WxViewPager$d> r10 = r0.mItems
            java.lang.Object r10 = r10.get(r11)
            com.tencent.mm.ui.mogic.WxViewPager$d r10 = (com.tencent.p014mm.p136ui.mogic.WxViewPager.C106719d) r10
            goto L_0x00ff
        L_0x00d2:
            if (r12 == 0) goto L_0x00e8
            int r10 = r12.f319063b
            if (r3 != r10) goto L_0x00e8
            float r10 = r12.f319065d
            float r6 = r6 + r10
            int r11 = r11 + -1
            if (r11 < 0) goto L_0x00fe
            java.util.ArrayList<com.tencent.mm.ui.mogic.WxViewPager$d> r10 = r0.mItems
            java.lang.Object r10 = r10.get(r11)
            com.tencent.mm.ui.mogic.WxViewPager$d r10 = (com.tencent.p014mm.p136ui.mogic.WxViewPager.C106719d) r10
            goto L_0x00ff
        L_0x00e8:
            int r10 = r11 + 1
            com.tencent.mm.ui.mogic.WxViewPager$d r10 = r0.addNewItem(r3, r10)
            float r10 = r10.f319065d
            float r6 = r6 + r10
            int r8 = r8 + 1
            if (r11 < 0) goto L_0x00fe
            java.util.ArrayList<com.tencent.mm.ui.mogic.WxViewPager$d> r10 = r0.mItems
            java.lang.Object r10 = r10.get(r11)
            com.tencent.mm.ui.mogic.WxViewPager$d r10 = (com.tencent.p014mm.p136ui.mogic.WxViewPager.C106719d) r10
            goto L_0x00ff
        L_0x00fe:
            r10 = 0
        L_0x00ff:
            r12 = r10
        L_0x0100:
            int r3 = r3 + -1
            goto L_0x00a4
        L_0x0103:
            float r3 = r9.f319065d
            int r5 = r8 + 1
            int r6 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r6 >= 0) goto L_0x0195
            java.util.ArrayList<com.tencent.mm.ui.mogic.WxViewPager$d> r6 = r0.mItems
            int r6 = r6.size()
            if (r5 >= r6) goto L_0x011c
            java.util.ArrayList<com.tencent.mm.ui.mogic.WxViewPager$d> r6 = r0.mItems
            java.lang.Object r6 = r6.get(r5)
            com.tencent.mm.ui.mogic.WxViewPager$d r6 = (com.tencent.p014mm.p136ui.mogic.WxViewPager.C106719d) r6
            goto L_0x011d
        L_0x011c:
            r6 = 0
        L_0x011d:
            if (r13 > 0) goto L_0x0121
            r10 = 0
            goto L_0x0129
        L_0x0121:
            int r10 = r17.getPaddingRight()
            float r10 = (float) r10
            float r11 = (float) r13
            float r10 = r10 / r11
            float r10 = r10 + r14
        L_0x0129:
            int r11 = r0.mCurItem
        L_0x012b:
            int r11 = r11 + 1
            if (r11 >= r7) goto L_0x0195
            int r12 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r12 < 0) goto L_0x015f
            if (r11 <= r1) goto L_0x015f
            if (r6 != 0) goto L_0x0138
            goto L_0x0195
        L_0x0138:
            int r12 = r6.f319063b
            if (r11 != r12) goto L_0x0194
            boolean r12 = r6.f319064c
            if (r12 != 0) goto L_0x0194
            java.util.ArrayList<com.tencent.mm.ui.mogic.WxViewPager$d> r12 = r0.mItems
            r12.remove(r5)
            androidx.viewpager.widget.a r12 = r0.mAdapter
            java.lang.Object r6 = r6.f319062a
            r12.destroyItem((android.view.ViewGroup) r0, (int) r11, (java.lang.Object) r6)
            java.util.ArrayList<com.tencent.mm.ui.mogic.WxViewPager$d> r6 = r0.mItems
            int r6 = r6.size()
            if (r5 >= r6) goto L_0x015d
            java.util.ArrayList<com.tencent.mm.ui.mogic.WxViewPager$d> r6 = r0.mItems
            java.lang.Object r6 = r6.get(r5)
            com.tencent.mm.ui.mogic.WxViewPager$d r6 = (com.tencent.p014mm.p136ui.mogic.WxViewPager.C106719d) r6
            goto L_0x0194
        L_0x015d:
            r6 = 0
            goto L_0x0194
        L_0x015f:
            if (r6 == 0) goto L_0x017b
            int r12 = r6.f319063b
            if (r11 != r12) goto L_0x017b
            float r6 = r6.f319065d
            float r3 = r3 + r6
            int r5 = r5 + 1
            java.util.ArrayList<com.tencent.mm.ui.mogic.WxViewPager$d> r6 = r0.mItems
            int r6 = r6.size()
            if (r5 >= r6) goto L_0x015d
            java.util.ArrayList<com.tencent.mm.ui.mogic.WxViewPager$d> r6 = r0.mItems
            java.lang.Object r6 = r6.get(r5)
            com.tencent.mm.ui.mogic.WxViewPager$d r6 = (com.tencent.p014mm.p136ui.mogic.WxViewPager.C106719d) r6
            goto L_0x0194
        L_0x017b:
            com.tencent.mm.ui.mogic.WxViewPager$d r6 = r0.addNewItem(r11, r5)
            int r5 = r5 + 1
            float r6 = r6.f319065d
            float r3 = r3 + r6
            java.util.ArrayList<com.tencent.mm.ui.mogic.WxViewPager$d> r6 = r0.mItems
            int r6 = r6.size()
            if (r5 >= r6) goto L_0x015d
            java.util.ArrayList<com.tencent.mm.ui.mogic.WxViewPager$d> r6 = r0.mItems
            java.lang.Object r6 = r6.get(r5)
            com.tencent.mm.ui.mogic.WxViewPager$d r6 = (com.tencent.p014mm.p136ui.mogic.WxViewPager.C106719d) r6
        L_0x0194:
            goto L_0x012b
        L_0x0195:
            r0.calculatePageOffsets(r9, r8, r2)
        L_0x0198:
            androidx.viewpager.widget.a r1 = r0.mAdapter
            int r2 = r0.mCurItem
            if (r9 == 0) goto L_0x01a1
            java.lang.Object r3 = r9.f319062a
            goto L_0x01a2
        L_0x01a1:
            r3 = 0
        L_0x01a2:
            r1.setPrimaryItem((android.view.ViewGroup) r0, (int) r2, (java.lang.Object) r3)
            androidx.viewpager.widget.a r1 = r0.mAdapter
            r1.finishUpdate((android.view.ViewGroup) r0)
            int r1 = r17.getChildCount()
            r2 = 0
        L_0x01af:
            if (r2 >= r1) goto L_0x01db
            android.view.View r3 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            com.tencent.mm.ui.mogic.WxViewPager$LayoutParams r5 = (com.tencent.p014mm.p136ui.mogic.WxViewPager.LayoutParams) r5
            r5.f319057f = r2
            boolean r6 = r5.f319052a
            if (r6 != 0) goto L_0x01d7
            float r6 = r5.f319054c
            r7 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x01d8
            com.tencent.mm.ui.mogic.WxViewPager$d r3 = r0.infoForChild(r3)
            if (r3 == 0) goto L_0x01d8
            float r6 = r3.f319065d
            r5.f319054c = r6
            int r3 = r3.f319063b
            r5.f319056e = r3
            goto L_0x01d8
        L_0x01d7:
            r7 = 0
        L_0x01d8:
            int r2 = r2 + 1
            goto L_0x01af
        L_0x01db:
            r17.sortChildDrawingOrder()
            boolean r1 = r17.hasFocus()
            if (r1 == 0) goto L_0x0219
            android.view.View r1 = r17.findFocus()
            if (r1 == 0) goto L_0x01ef
            com.tencent.mm.ui.mogic.WxViewPager$d r3 = r0.infoForAnyChild(r1)
            goto L_0x01f0
        L_0x01ef:
            r3 = 0
        L_0x01f0:
            if (r3 == 0) goto L_0x01f8
            int r1 = r3.f319063b
            int r2 = r0.mCurItem
            if (r1 == r2) goto L_0x0219
        L_0x01f8:
            r6 = 0
        L_0x01f9:
            int r1 = r17.getChildCount()
            if (r6 >= r1) goto L_0x0219
            android.view.View r1 = r0.getChildAt(r6)
            com.tencent.mm.ui.mogic.WxViewPager$d r2 = r0.infoForChild(r1)
            if (r2 == 0) goto L_0x0216
            int r2 = r2.f319063b
            int r3 = r0.mCurItem
            if (r2 != r3) goto L_0x0216
            boolean r1 = r1.requestFocus(r4)
            if (r1 == 0) goto L_0x0216
            goto L_0x0219
        L_0x0216:
            int r6 = r6 + 1
            goto L_0x01f9
        L_0x0219:
            return
        L_0x021a:
            android.content.res.Resources r1 = r17.getResources()     // Catch:{ NotFoundException -> 0x0227 }
            int r2 = r17.getId()     // Catch:{ NotFoundException -> 0x0227 }
            java.lang.String r1 = r1.getResourceName(r2)     // Catch:{ NotFoundException -> 0x0227 }
            goto L_0x022f
        L_0x0227:
            int r1 = r17.getId()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
        L_0x022f:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            r3.append(r4)
            int r4 = r0.mExpectedAdapterCount
            r3.append(r4)
            java.lang.String r4 = ", found: "
            r3.append(r4)
            r3.append(r7)
            java.lang.String r4 = " Pager id: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " Pager class: "
            r3.append(r1)
            java.lang.Class r1 = r17.getClass()
            r3.append(r1)
            java.lang.String r1 = " Problematic adapter: "
            r3.append(r1)
            androidx.viewpager.widget.a r1 = r0.mAdapter
            java.lang.Class r1 = r1.getClass()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.mogic.WxViewPager.populate(int):void");
    }

    public void setCurrentItemInternal(int i, boolean z, boolean z2, int i2) {
        setCurrentItemInternal(i, z, z2, i2, false);
    }

    public void smoothScrollTo(int i, int i2, int i3) {
        int i4;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int i5 = i - scrollX;
        int i6 = i2 - scrollY;
        if (i5 == 0 && i6 == 0) {
            completeScroll(false);
            populate();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i7 = clientWidth / 2;
        float f = (float) clientWidth;
        float f2 = (float) i7;
        float distanceInfluenceForSnapDuration = f2 + (distanceInfluenceForSnapDuration(Math.min(1.0f, (((float) Math.abs(i5)) * 1.0f) / f)) * f2);
        int abs = Math.abs(i3);
        if (abs > 0) {
            i4 = Math.round(Math.abs(distanceInfluenceForSnapDuration / ((float) abs)) * 1000.0f) * 4;
        } else {
            i4 = (int) (((((float) Math.abs(i5)) / ((f * this.mAdapter.getPageWidth(this.mCurItem)) + ((float) this.mPageMargin))) + 3.0f) * 100.0f);
        }
        this.mScroller.startScroll(scrollX, scrollY, i5, i6, Math.min(i4, 600));
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        C107207u.C107208b.m145183k(this);
    }

    public void setCurrentItem(int i, boolean z) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i, z, false);
    }

    public void setCurrentItemInternal(int i, boolean z, boolean z2, int i2, boolean z3) {
        ViewPager.OnPageChangeListener onPageChangeListener;
        ViewPager.OnPageChangeListener onPageChangeListener2;
        C103853a aVar = this.mAdapter;
        boolean z4 = false;
        if (aVar == null || aVar.getCount() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.mCurItem != i || this.mItems.size() == 0) {
            if (i < 0) {
                i = 0;
            } else if (i >= this.mAdapter.getCount()) {
                i = this.mAdapter.getCount() - 1;
            }
            int i3 = this.mOffscreenPageLimit;
            int i4 = this.mCurItem;
            if (i > i4 + i3 || i < i4 - i3) {
                for (int i5 = 0; i5 < this.mItems.size(); i5++) {
                    this.mItems.get(i5).f319064c = true;
                }
            }
            if (this.mCurItem != i) {
                z4 = true;
            }
            if (this.mFirstLayout) {
                this.mCurItem = i;
                if ((z3 || z4) && (onPageChangeListener2 = this.mOnPageChangeListener) != null) {
                    onPageChangeListener2.onPageSelected(i);
                }
                if ((z3 || z4) && (onPageChangeListener = this.mInternalPageChangeListener) != null) {
                    onPageChangeListener.onPageSelected(i);
                }
                if (z3 || z4) {
                    notifyOnPageSelected(i);
                }
                requestLayout();
                return;
            }
            populate(i);
            scrollToItem(i, z, i2, z4);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    public void setCurrentItem(int i, boolean z, boolean z2) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i, z, z2);
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i));
    }

    public WxViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initViewPager();
    }
}
