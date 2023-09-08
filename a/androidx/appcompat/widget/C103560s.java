package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import p1130l.C109068h;

/* renamed from: androidx.appcompat.widget.s */
public abstract class C103560s implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: d */
    public final float f305838d;

    /* renamed from: e */
    public final int f305839e;

    /* renamed from: f */
    public final int f305840f;

    /* renamed from: g */
    public final View f305841g;

    /* renamed from: h */
    public Runnable f305842h;

    /* renamed from: i */
    public Runnable f305843i;

    /* renamed from: j */
    public boolean f305844j;

    /* renamed from: n */
    public int f305845n;

    /* renamed from: o */
    public final int[] f305846o = new int[2];

    /* renamed from: androidx.appcompat.widget.s$a */
    public class C103561a implements Runnable {
        public C103561a() {
        }

        public void run() {
            ViewParent parent = C103560s.this.f305841g.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.s$b */
    public class C103562b implements Runnable {
        public C103562b() {
        }

        public void run() {
            C103560s sVar = C103560s.this;
            sVar.mo144434a();
            View view = sVar.f305841g;
            if (view.isEnabled() && !view.isLongClickable() && sVar.mo143518c()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                view.onTouchEvent(obtain);
                obtain.recycle();
                sVar.f305844j = true;
            }
        }
    }

    public C103560s(View view) {
        this.f305841g = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f305838d = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f305839e = tapTimeout;
        this.f305840f = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* renamed from: a */
    public final void mo144434a() {
        Runnable runnable = this.f305843i;
        if (runnable != null) {
            this.f305841g.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f305842h;
        if (runnable2 != null) {
            this.f305841g.removeCallbacks(runnable2);
        }
    }

    /* renamed from: b */
    public abstract C109068h mo143517b();

    /* renamed from: c */
    public abstract boolean mo143518c();

    /* renamed from: d */
    public boolean mo143817d() {
        C109068h b = mo143517b();
        if (b == null || !b.isShowing()) {
            return true;
        }
        b.dismiss();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0087, code lost:
        if (r4 != 3) goto L_0x0079;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0113  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
            r11 = this;
            boolean r12 = r11.f305844j
            r0 = 3
            r1 = 0
            r2 = 1
            if (r12 == 0) goto L_0x0071
            android.view.View r3 = r11.f305841g
            l.h r4 = r11.mo143517b()
            if (r4 == 0) goto L_0x0061
            boolean r5 = r4.isShowing()
            if (r5 != 0) goto L_0x0016
            goto L_0x0061
        L_0x0016:
            android.widget.ListView r4 = r4.getListView()
            androidx.appcompat.widget.q r4 = (androidx.appcompat.widget.C103557q) r4
            if (r4 == 0) goto L_0x0061
            boolean r5 = r4.isShown()
            if (r5 != 0) goto L_0x0025
            goto L_0x0061
        L_0x0025:
            android.view.MotionEvent r5 = android.view.MotionEvent.obtainNoHistory(r13)
            int[] r6 = r11.f305846o
            r3.getLocationOnScreen(r6)
            r3 = r6[r1]
            float r3 = (float) r3
            r6 = r6[r2]
            float r6 = (float) r6
            r5.offsetLocation(r3, r6)
            int[] r3 = r11.f305846o
            r4.getLocationOnScreen(r3)
            r6 = r3[r1]
            int r6 = -r6
            float r6 = (float) r6
            r3 = r3[r2]
            int r3 = -r3
            float r3 = (float) r3
            r5.offsetLocation(r6, r3)
            int r3 = r11.f305845n
            boolean r3 = r4.mo144416c(r5, r3)
            r5.recycle()
            int r13 = r13.getActionMasked()
            if (r13 == r2) goto L_0x005a
            if (r13 == r0) goto L_0x005a
            r13 = 1
            goto L_0x005b
        L_0x005a:
            r13 = 0
        L_0x005b:
            if (r3 == 0) goto L_0x0061
            if (r13 == 0) goto L_0x0061
            r13 = 1
            goto L_0x0062
        L_0x0061:
            r13 = 0
        L_0x0062:
            if (r13 != 0) goto L_0x006e
            boolean r13 = r11.mo143817d()
            if (r13 != 0) goto L_0x006b
            goto L_0x006e
        L_0x006b:
            r13 = 0
            goto L_0x0128
        L_0x006e:
            r13 = 1
            goto L_0x0128
        L_0x0071:
            android.view.View r3 = r11.f305841g
            boolean r4 = r3.isEnabled()
            if (r4 != 0) goto L_0x007c
        L_0x0079:
            r13 = 0
            goto L_0x0106
        L_0x007c:
            int r4 = r13.getActionMasked()
            if (r4 == 0) goto L_0x00d8
            if (r4 == r2) goto L_0x00d4
            r5 = 2
            if (r4 == r5) goto L_0x008a
            if (r4 == r0) goto L_0x00d4
            goto L_0x0079
        L_0x008a:
            int r0 = r11.f305845n
            int r0 = r13.findPointerIndex(r0)
            if (r0 < 0) goto L_0x0079
            float r4 = r13.getX(r0)
            float r13 = r13.getY(r0)
            float r0 = r11.f305838d
            float r5 = -r0
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 < 0) goto L_0x00c5
            int r5 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x00c5
            int r5 = r3.getRight()
            int r6 = r3.getLeft()
            int r5 = r5 - r6
            float r5 = (float) r5
            float r5 = r5 + r0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x00c5
            int r4 = r3.getBottom()
            int r5 = r3.getTop()
            int r4 = r4 - r5
            float r4 = (float) r4
            float r4 = r4 + r0
            int r13 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r13 >= 0) goto L_0x00c5
            r13 = 1
            goto L_0x00c6
        L_0x00c5:
            r13 = 0
        L_0x00c6:
            if (r13 != 0) goto L_0x0079
            r11.mo144434a()
            android.view.ViewParent r13 = r3.getParent()
            r13.requestDisallowInterceptTouchEvent(r2)
            r13 = 1
            goto L_0x0106
        L_0x00d4:
            r11.mo144434a()
            goto L_0x0079
        L_0x00d8:
            int r13 = r13.getPointerId(r1)
            r11.f305845n = r13
            java.lang.Runnable r13 = r11.f305842h
            if (r13 != 0) goto L_0x00e9
            androidx.appcompat.widget.s$a r13 = new androidx.appcompat.widget.s$a
            r13.<init>()
            r11.f305842h = r13
        L_0x00e9:
            java.lang.Runnable r13 = r11.f305842h
            int r0 = r11.f305839e
            long r4 = (long) r0
            r3.postDelayed(r13, r4)
            java.lang.Runnable r13 = r11.f305843i
            if (r13 != 0) goto L_0x00fc
            androidx.appcompat.widget.s$b r13 = new androidx.appcompat.widget.s$b
            r13.<init>()
            r11.f305843i = r13
        L_0x00fc:
            java.lang.Runnable r13 = r11.f305843i
            int r0 = r11.f305840f
            long r4 = (long) r0
            r3.postDelayed(r13, r4)
            goto L_0x0079
        L_0x0106:
            if (r13 == 0) goto L_0x0110
            boolean r13 = r11.mo143518c()
            if (r13 == 0) goto L_0x0110
            r13 = 1
            goto L_0x0111
        L_0x0110:
            r13 = 0
        L_0x0111:
            if (r13 == 0) goto L_0x0128
            long r5 = android.os.SystemClock.uptimeMillis()
            r7 = 3
            r8 = 0
            r9 = 0
            r10 = 0
            r3 = r5
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r3, r5, r7, r8, r9, r10)
            android.view.View r3 = r11.f305841g
            r3.onTouchEvent(r0)
            r0.recycle()
        L_0x0128:
            r11.f305844j = r13
            if (r13 != 0) goto L_0x012e
            if (r12 == 0) goto L_0x012f
        L_0x012e:
            r1 = 1
        L_0x012f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C103560s.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.f305844j = false;
        this.f305845n = -1;
        Runnable runnable = this.f305842h;
        if (runnable != null) {
            this.f305841g.removeCallbacks(runnable);
        }
    }
}
