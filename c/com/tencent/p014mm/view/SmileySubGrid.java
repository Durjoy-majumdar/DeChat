package com.tencent.p014mm.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.widget.GridView;
import android.widget.ListAdapter;
import bq3.C92295a;
import com.tencent.p014mm.p136ui.base.CustomViewPager;
import com.tencent.p014mm.p136ui.base.MMFlipper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.view.popview.AbstractPopView;
import hq3.C98505f;

/* renamed from: com.tencent.mm.view.SmileySubGrid */
public class SmileySubGrid extends GridView {

    /* renamed from: d */
    public int f285633d = 6;

    /* renamed from: e */
    public int f285634e;

    /* renamed from: f */
    public int f285635f;

    /* renamed from: g */
    public int f285636g = -1;

    /* renamed from: h */
    public float f285637h;

    /* renamed from: i */
    public Rect f285638i = new Rect();

    /* renamed from: j */
    public boolean f285639j;

    /* renamed from: n */
    public WindowManager f285640n;

    /* renamed from: o */
    public AbstractPopView f285641o;

    /* renamed from: p */
    public int f285642p;

    /* renamed from: q */
    public C97324c f285643q;

    /* renamed from: r */
    public MMHandler f285644r = new MMHandler();

    /* renamed from: s */
    public C97325d f285645s;

    /* renamed from: t */
    public View f285646t;

    /* renamed from: u */
    public int f285647u = ViewConfiguration.get(getContext()).getScaledTouchSlop();

    /* renamed from: v */
    public MTimerHandler f285648v = null;

    /* renamed from: w */
    public volatile int f285649w = -1;

    /* renamed from: x */
    public boolean f285650x = true;

    /* renamed from: y */
    public final Object f285651y = new Object();

    /* renamed from: com.tencent.mm.view.SmileySubGrid$a */
    public class C97322a implements MTimerHandler.CallBack {
        public C97322a() {
        }

        public boolean onTimerExpired() {
            SmileySubGrid smileySubGrid = SmileySubGrid.this;
            View childAt = smileySubGrid.getChildAt(smileySubGrid.f285635f - smileySubGrid.getFirstVisiblePosition());
            if (childAt == null || !((C92295a) SmileySubGrid.this.getAdapter()).mo126281b(SmileySubGrid.this.f285635f)) {
                return false;
            }
            SmileySubGrid smileySubGrid2 = SmileySubGrid.this;
            if (smileySubGrid2.f285645s == null) {
                smileySubGrid2.f285645s = new C97325d((C97322a) null);
            }
            C97325d dVar = smileySubGrid2.f285645s;
            dVar.f285656f = childAt;
            dVar.f285657g = smileySubGrid2.f285635f;
            dVar.f285659d = SmileySubGrid.this.getWindowAttachCount();
            SmileySubGrid.this.f285644r.post(dVar);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.view.SmileySubGrid$b */
    public class C97323b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f285653d;

        public C97323b(View view) {
            this.f285653d = view;
        }

        public void run() {
            AbstractPopView abstractPopView = SmileySubGrid.this.f285641o;
            if (abstractPopView != null) {
                abstractPopView.setVisibility(0);
                SmileySubGrid.this.f285641o.mo104703d(this.f285653d);
                SmileySubGrid smileySubGrid = SmileySubGrid.this;
                WindowManager windowManager = smileySubGrid.f285640n;
                AbstractPopView abstractPopView2 = smileySubGrid.f285641o;
                windowManager.updateViewLayout(abstractPopView2, abstractPopView2.getWindowLayoutParams());
            }
        }
    }

    /* renamed from: com.tencent.mm.view.SmileySubGrid$c */
    public class C97324c extends C97326e implements Runnable {
        public C97324c(C97322a aVar) {
            super((C97322a) null);
        }

        public void run() {
            Log.m105924i("MicroMsg.emoji.SmileyPanel.SmileySubGrid", "LongPress run");
            SmileySubGrid smileySubGrid = SmileySubGrid.this;
            int i = smileySubGrid.f285635f;
            View childAt = smileySubGrid.getChildAt(i - smileySubGrid.getFirstVisiblePosition());
            if (childAt != null) {
                SmileySubGrid smileySubGrid2 = SmileySubGrid.this;
                int i2 = smileySubGrid2.f285635f;
                long itemId = smileySubGrid2.getAdapter().getItemId(SmileySubGrid.this.f285635f);
                if (SmileySubGrid.this.hasWindowFocus() && SmileySubGrid.this.getWindowAttachCount() == this.f285659d) {
                    Log.m105925i("MicroMsg.emoji.SmileyPanel.SmileySubGrid", "CheckForLongPress performLongPress position:[%d] id:[%d]", Integer.valueOf(i2), Long.valueOf(itemId));
                    SmileySubGrid.this.mo136421g(childAt, i);
                    SmileySubGrid smileySubGrid3 = SmileySubGrid.this;
                    smileySubGrid3.f285634e = -1;
                    smileySubGrid3.f285633d = 5;
                    smileySubGrid3.setScrollEnable(false);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.view.SmileySubGrid$d */
    public class C97325d extends C97326e implements Runnable {

        /* renamed from: f */
        public View f285656f;

        /* renamed from: g */
        public int f285657g;

        public C97325d(C97322a aVar) {
            super((C97322a) null);
        }

        public void run() {
            Log.m105924i("MicroMsg.emoji.SmileyPanel.SmileySubGrid", "Click run");
            ListAdapter adapter = SmileySubGrid.this.getAdapter();
            int i = this.f285657g;
            if (adapter != null && SmileySubGrid.this.getCount() > 0 && i != -1 && i < adapter.getCount()) {
                if (SmileySubGrid.this.hasWindowFocus() && SmileySubGrid.this.getWindowAttachCount() == this.f285659d) {
                    Log.m105919d("MicroMsg.emoji.SmileyPanel.SmileySubGrid", "PerformClick performItemClick position:[%d] id:[%d] ", Integer.valueOf(i), Long.valueOf(adapter.getItemId(i)));
                    SmileySubGrid.this.performItemClick(this.f285656f, i, adapter.getItemId(i));
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.view.SmileySubGrid$e */
    public class C97326e {

        /* renamed from: d */
        public int f285659d;

        public C97326e(C97322a aVar) {
        }
    }

    public SmileySubGrid(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f285640n = (WindowManager) context.getSystemService("window");
        this.f285642p = getLongTouchTime();
        ViewConfiguration.getPressedStateDuration();
    }

    /* renamed from: e */
    public void mo136419e(View view) {
        Rect rect = this.f285638i;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        this.f285638i.set(rect.left - getPaddingLeft(), rect.top - getPaddingTop(), rect.right + getPaddingRight(), rect.bottom + getPaddingBottom());
        boolean z = this.f285639j;
        if (view.isEnabled() != z) {
            this.f285639j = !z;
            refreshDrawableState();
        }
    }

    /* renamed from: f */
    public void mo136420f() {
        AbstractPopView abstractPopView = this.f285641o;
        if (abstractPopView != null) {
            this.f285640n.removeView(abstractPopView);
            this.f285641o = null;
        }
        this.f285649w = -1;
    }

    /* renamed from: g */
    public final void mo136421g(View view, int i) {
        if (i != this.f285649w) {
            Log.m105925i("MicroMsg.emoji.SmileyPanel.SmileySubGrid", "jacks begin show:%d", Integer.valueOf(i));
            Object item = getAdapter().getItem(i);
            if (this.f285641o == null) {
                AbstractPopView a = C98505f.m127959a(getContext(), item);
                this.f285641o = a;
                this.f285640n.addView(a, a.getWindowLayoutParams());
                this.f285641o.setVisibility(4);
            }
            synchronized (this.f285651y) {
                AbstractPopView abstractPopView = this.f285641o;
                if (abstractPopView != null) {
                    C98505f.m127960b(abstractPopView, item);
                } else {
                    Log.m105924i("MicroMsg.emoji.SmileyPanel.SmileySubGrid", "mPopImageView is null.");
                }
            }
            WindowManager windowManager = this.f285640n;
            AbstractPopView abstractPopView2 = this.f285641o;
            windowManager.updateViewLayout(abstractPopView2, abstractPopView2.getWindowLayoutParams());
            this.f285641o.post(new C97323b(view));
        } else {
            Log.m105925i("MicroMsg.emoji.SmileyPanel.SmileySubGrid", "jacks already show:%d", Integer.valueOf(i));
        }
        this.f285649w = i;
    }

    public int getLongTouchTime() {
        return ViewConfiguration.getLongPressTimeout();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo136420f();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r0 != 3) goto L_0x01b9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            boolean r0 = r6.f285650x
            if (r0 != 0) goto L_0x000c
            r6.mo136420f()
            boolean r7 = super.onTouchEvent(r7)
            return r7
        L_0x000c:
            int r0 = r7.getAction()
            r1 = 0
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0112
            r4 = -1
            if (r0 == r3) goto L_0x00af
            r5 = 2
            if (r0 == r5) goto L_0x0020
            r7 = 3
            if (r0 == r7) goto L_0x00af
            goto L_0x01b9
        L_0x0020:
            float r0 = r7.getX()
            int r0 = (int) r0
            float r7 = r7.getY()
            int r7 = (int) r7
            int r1 = r6.f285633d
            r5 = 5
            if (r1 != r5) goto L_0x0092
            int r7 = r6.pointToPosition(r0, r7)
            r6.f285635f = r7
            if (r7 < 0) goto L_0x006e
            android.widget.ListAdapter r0 = r6.getAdapter()
            boolean r0 = r0 instanceof bq3.C92295a
            if (r0 == 0) goto L_0x006e
            android.widget.ListAdapter r0 = r6.getAdapter()
            bq3.a r0 = (bq3.C92295a) r0
            boolean r0 = r0.mo126280a(r7)
            if (r0 == 0) goto L_0x006e
            int r0 = r6.f285636g
            if (r0 == r7) goto L_0x0089
            r6.f285636g = r7
            int r0 = r6.getFirstVisiblePosition()
            int r7 = r7 - r0
            android.view.View r7 = r6.getChildAt(r7)
            r6.layoutChildren()
            if (r7 == 0) goto L_0x0089
            r7.setPressed(r3)
            r7.setSelected(r3)
            r6.mo136419e(r7)
            int r0 = r6.f285636g
            r6.mo136421g(r7, r0)
            goto L_0x0089
        L_0x006e:
            r6.mo136420f()
            int r7 = r6.f285636g
            if (r7 < 0) goto L_0x0089
            int r0 = r6.getFirstVisiblePosition()
            int r7 = r7 - r0
            android.view.View r7 = r6.getChildAt(r7)
            if (r7 == 0) goto L_0x0089
            r7.setPressed(r2)
            r7.setSelected(r2)
            r6.mo136419e(r7)
        L_0x0089:
            com.tencent.mm.sdk.platformtools.MMHandler r7 = r6.f285644r
            com.tencent.mm.view.SmileySubGrid$c r0 = r6.f285643q
            r7.removeCallbacks(r0)
            goto L_0x01b9
        L_0x0092:
            float r7 = r6.f285637h
            float r0 = (float) r0
            float r7 = r7 - r0
            float r7 = java.lang.Math.abs(r7)
            int r0 = r6.f285647u
            float r0 = (float) r0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 <= 0) goto L_0x00aa
            r6.f285634e = r4
            com.tencent.mm.sdk.platformtools.MMHandler r7 = r6.f285644r
            com.tencent.mm.view.SmileySubGrid$c r0 = r6.f285643q
            r7.removeCallbacks(r0)
        L_0x00aa:
            r6.mo136420f()
            goto L_0x01b9
        L_0x00af:
            int r7 = r6.f285635f
            int r5 = r6.getFirstVisiblePosition()
            int r5 = r7 - r5
            android.view.View r5 = r6.getChildAt(r5)
            if (r0 != r3) goto L_0x00df
            int r0 = r6.f285634e
            if (r0 == r4) goto L_0x00df
            com.tencent.mm.view.SmileySubGrid$d r0 = r6.f285645s
            if (r0 != 0) goto L_0x00cc
            com.tencent.mm.view.SmileySubGrid$d r0 = new com.tencent.mm.view.SmileySubGrid$d
            r0.<init>(r1)
            r6.f285645s = r0
        L_0x00cc:
            com.tencent.mm.view.SmileySubGrid$d r0 = r6.f285645s
            r0.f285656f = r5
            r0.f285657g = r7
            com.tencent.mm.view.SmileySubGrid r7 = com.tencent.p014mm.view.SmileySubGrid.this
            int r7 = r7.getWindowAttachCount()
            r0.f285659d = r7
            com.tencent.mm.sdk.platformtools.MMHandler r7 = r6.f285644r
            r7.post(r0)
        L_0x00df:
            com.tencent.mm.sdk.platformtools.MTimerHandler r7 = r6.f285648v
            if (r7 == 0) goto L_0x00e8
            r7.stopTimer()
            r6.f285648v = r1
        L_0x00e8:
            com.tencent.mm.sdk.platformtools.MMHandler r7 = r6.f285644r
            com.tencent.mm.view.SmileySubGrid$c r0 = r6.f285643q
            r7.removeCallbacks(r0)
            r6.setScrollEnable(r3)
            r6.mo136420f()
            int r7 = r6.f285636g
            if (r7 < 0) goto L_0x010d
            int r0 = r6.getFirstVisiblePosition()
            int r7 = r7 - r0
            android.view.View r7 = r6.getChildAt(r7)
            if (r7 == 0) goto L_0x010d
            r7.setPressed(r2)
            r7.setSelected(r2)
            r6.mo136419e(r7)
        L_0x010d:
            r7 = 6
            r6.f285633d = r7
            goto L_0x01b9
        L_0x0112:
            float r0 = r7.getX()
            int r0 = (int) r0
            float r7 = r7.getY()
            int r7 = (int) r7
            float r4 = (float) r0
            r6.f285637h = r4
            int r7 = r6.pointToPosition(r0, r7)
            if (r7 < 0) goto L_0x0131
            android.widget.ListAdapter r0 = r6.getAdapter()
            boolean r0 = r0.isEnabled(r7)
            if (r0 == 0) goto L_0x0131
            r6.f285634e = r2
        L_0x0131:
            if (r7 < 0) goto L_0x0140
            r6.f285636g = r7
            int r0 = r6.getFirstVisiblePosition()
            int r0 = r7 - r0
            android.view.View r0 = r6.getChildAt(r0)
            goto L_0x0141
        L_0x0140:
            r0 = r1
        L_0x0141:
            if (r0 == 0) goto L_0x014c
            r0.setPressed(r3)
            r0.setSelected(r3)
            r6.mo136419e(r0)
        L_0x014c:
            com.tencent.mm.view.SmileySubGrid$c r0 = r6.f285643q
            if (r0 != 0) goto L_0x0157
            com.tencent.mm.view.SmileySubGrid$c r0 = new com.tencent.mm.view.SmileySubGrid$c
            r0.<init>(r1)
            r6.f285643q = r0
        L_0x0157:
            com.tencent.mm.view.SmileySubGrid$c r0 = r6.f285643q
            com.tencent.mm.view.SmileySubGrid r1 = com.tencent.p014mm.view.SmileySubGrid.this
            int r1 = r1.getWindowAttachCount()
            r0.f285659d = r1
            r6.f285635f = r7
            if (r7 < 0) goto L_0x0183
            android.widget.ListAdapter r0 = r6.getAdapter()
            boolean r0 = r0 instanceof bq3.C92295a
            if (r0 == 0) goto L_0x0183
            android.widget.ListAdapter r0 = r6.getAdapter()
            bq3.a r0 = (bq3.C92295a) r0
            boolean r0 = r0.mo126280a(r7)
            if (r0 == 0) goto L_0x0183
            com.tencent.mm.sdk.platformtools.MMHandler r0 = r6.f285644r
            com.tencent.mm.view.SmileySubGrid$c r1 = r6.f285643q
            int r2 = r6.f285642p
            long r4 = (long) r2
            r0.postDelayed(r1, r4)
        L_0x0183:
            if (r7 < 0) goto L_0x01b9
            android.widget.ListAdapter r0 = r6.getAdapter()
            boolean r0 = r0 instanceof bq3.C92295a
            if (r0 == 0) goto L_0x01b9
            android.widget.ListAdapter r0 = r6.getAdapter()
            bq3.a r0 = (bq3.C92295a) r0
            boolean r7 = r0.mo126281b(r7)
            if (r7 == 0) goto L_0x01b9
            com.tencent.mm.sdk.platformtools.MTimerHandler r7 = r6.f285648v
            if (r7 == 0) goto L_0x01a0
            r7.stopTimer()
        L_0x01a0:
            com.tencent.mm.sdk.platformtools.MTimerHandler r7 = new com.tencent.mm.sdk.platformtools.MTimerHandler
            com.tencent.mm.view.SmileySubGrid$a r0 = new com.tencent.mm.view.SmileySubGrid$a
            r0.<init>()
            r7.<init>(r0, r3)
            r6.f285648v = r7
            int r0 = android.view.ViewConfiguration.getKeyRepeatTimeout()
            long r0 = (long) r0
            int r2 = android.view.ViewConfiguration.getKeyRepeatDelay()
            long r4 = (long) r2
            r7.startTimer(r0, r4)
        L_0x01b9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.view.SmileySubGrid.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setFromDetail(boolean z) {
    }

    public void setIsShowPopWin(boolean z) {
        this.f285650x = z;
    }

    public void setScrollEnable(boolean z) {
        Log.m105919d("MicroMsg.emoji.SmileyPanel.SmileySubGrid", "cpan t setScrollEnable:%b", Boolean.valueOf(z));
        View view = this.f285646t;
        if (view == null) {
            return;
        }
        if (view instanceof MMFlipper) {
            ((MMFlipper) view).setScrollEnable(z);
        } else if (view instanceof CustomViewPager) {
            ((CustomViewPager) view).setCanSlide(z);
        }
    }

    public void setViewParent(View view) {
        this.f285646t = view;
    }
}
