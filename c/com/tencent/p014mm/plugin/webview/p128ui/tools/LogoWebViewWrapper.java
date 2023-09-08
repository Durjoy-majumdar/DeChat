package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.WebView;
import java.util.WeakHashMap;
import p849e3.C107168a0;
import p849e3.C107207u;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.LogoWebViewWrapper */
public class LogoWebViewWrapper extends LinearLayout {

    /* renamed from: d */
    public WebView f118315d;

    /* renamed from: e */
    public FrameLayout f118316e;

    /* renamed from: f */
    public int f118317f;

    /* renamed from: g */
    public boolean f118318g = false;

    /* renamed from: h */
    public int f118319h;

    /* renamed from: i */
    public int f118320i;

    /* renamed from: j */
    public int f118321j;

    /* renamed from: n */
    public C43797d f118322n;

    /* renamed from: o */
    public int f118323o = 0;

    /* renamed from: p */
    public boolean f118324p = false;

    /* renamed from: q */
    public boolean f118325q = false;

    /* renamed from: r */
    public int f118326r = 0;

    /* renamed from: s */
    public C43796c f118327s;

    /* renamed from: t */
    public boolean f118328t = false;

    /* renamed from: u */
    public boolean f118329u = false;

    /* renamed from: v */
    public boolean f118330v = false;

    /* renamed from: w */
    public boolean f118331w = false;

    /* renamed from: x */
    public int f118332x = -1;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.LogoWebViewWrapper$a */
    public class C43794a implements Runnable {
        public C43794a() {
        }

        public void run() {
            LogoWebViewWrapper.this.f118328t = false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.LogoWebViewWrapper$b */
    public interface C43795b {
        /* renamed from: a */
        void mo68178a();
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.LogoWebViewWrapper$c */
    public interface C43796c {
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.LogoWebViewWrapper$d */
    public final class C43797d implements Runnable {

        /* renamed from: d */
        public final Interpolator f118334d;

        /* renamed from: e */
        public final int f118335e;

        /* renamed from: f */
        public final int f118336f;

        /* renamed from: g */
        public final long f118337g;

        /* renamed from: h */
        public boolean f118338h = true;

        /* renamed from: i */
        public long f118339i = -1;

        /* renamed from: j */
        public int f118340j = -1;

        public C43797d(int i, int i2, long j) {
            this.f118336f = i;
            this.f118335e = i2;
            this.f118334d = LogoWebViewWrapper.this.f118325q ? new AccelerateInterpolator() : new DecelerateInterpolator();
            this.f118337g = j;
        }

        public void run() {
            if (this.f118339i == -1) {
                this.f118339i = System.currentTimeMillis();
            } else {
                long j = 500;
                if (this.f118337g > 0) {
                    j = Math.max(Math.min(((System.currentTimeMillis() - this.f118339i) * 1000) / this.f118337g, 1000), 0);
                }
                int round = this.f118336f - Math.round(((float) (this.f118336f - this.f118335e)) * this.f118334d.getInterpolation(((float) j) / 1000.0f));
                this.f118340j = round;
                LogoWebViewWrapper.this.mo68166a(round);
                C43796c cVar = LogoWebViewWrapper.this.f118327s;
                if (cVar != null) {
                    ((C44125o1) cVar).mo68758c(this.f118340j, false);
                }
            }
            if (this.f118338h && this.f118335e != this.f118340j) {
                LogoWebViewWrapper logoWebViewWrapper = LogoWebViewWrapper.this;
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                C107207u.C107208b.m145185m(logoWebViewWrapper, this);
            }
        }
    }

    public LogoWebViewWrapper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
        this.f118317f = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    private int getLogoHeight() {
        if (this.f118332x < 0) {
            if (this.f118331w) {
                this.f118332x = getHeight();
            } else {
                this.f118332x = (int) TypedValue.applyDimension(1, (float) 60, getContext().getResources().getDisplayMetrics());
            }
        }
        return this.f118332x;
    }

    private int getOverScrollDistance() {
        return getHeight();
    }

    private long getScrollBackDuration() {
        long abs = (long) Math.abs(getScrollY());
        long abs2 = Math.abs(abs - ((long) Math.abs(this.f118326r)));
        if (abs2 >= abs) {
            return 300;
        }
        return (long) ((((float) abs2) / ((float) abs)) * 300.0f);
    }

    /* renamed from: a */
    public final void mo68166a(int i) {
        int overScrollDistance = getOverScrollDistance();
        scrollTo(0, Math.min(overScrollDistance, Math.max(-overScrollDistance, i)));
    }

    /* renamed from: b */
    public void mo68167b(int i, long j) {
        C43797d dVar = this.f118322n;
        if (dVar != null) {
            dVar.f118338h = false;
            LogoWebViewWrapper.this.removeCallbacks(dVar);
        }
        int scrollY = getScrollY();
        Log.m105925i("MicroMsg.LogoWebViewWrapper", "smoothScrollTo oldScrollValue = %s, newScrollValue = %s", Integer.valueOf(scrollY), Integer.valueOf(i));
        if (scrollY != i) {
            C43797d dVar2 = new C43797d(scrollY, i, j);
            this.f118322n = dVar2;
            post(dVar2);
        }
    }

    public WebView getWebView() {
        return this.f118315d;
    }

    public FrameLayout getWebViewContainer() {
        if (this.f118316e == null) {
            int childCount = getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = getChildAt(i);
                if ((childAt instanceof FrameLayout) && childAt.getId() == C0966R.C0970id.g6p) {
                    this.f118316e = (FrameLayout) childAt;
                    break;
                }
                i++;
            }
        }
        return this.f118316e;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f118324p && !this.f118328t) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.f118318g = false;
            this.f118323o = 0;
            this.f118329u = false;
            return false;
        } else if (action == 2 && this.f118318g) {
            return true;
        } else {
            if (action != 0) {
                if (action == 2 && this.f118315d.isOverScrollStart()) {
                    if (!this.f118329u) {
                        this.f118319h = (int) motionEvent.getY();
                        this.f118320i = (int) motionEvent.getY();
                        this.f118321j = (int) motionEvent.getX();
                        this.f118318g = false;
                        this.f118323o = 0;
                        this.f118328t = true;
                        this.f118329u = true;
                        return false;
                    }
                    int y = (int) motionEvent.getY();
                    int x = (int) motionEvent.getX();
                    int i = y - this.f118319h;
                    int i2 = x - this.f118321j;
                    if (Math.abs(i) > this.f118317f && Math.abs(i) > Math.abs(i2) && i > 0) {
                        this.f118319h = y;
                        this.f118321j = x;
                        int i3 = this.f118323o;
                        if (i3 == 1) {
                            this.f118318g = true;
                            this.f118329u = false;
                            Log.m105924i("MicroMsg.LogoWebViewWrapper", "Competitor wins in onTouchEvent");
                        } else {
                            this.f118323o = i3 + 1;
                        }
                    }
                }
            } else if (this.f118315d.isOverScrollStart()) {
                this.f118319h = (int) motionEvent.getY();
                this.f118320i = (int) motionEvent.getY();
                this.f118321j = (int) motionEvent.getX();
                this.f118318g = false;
                this.f118323o = 0;
                this.f118328t = true;
                this.f118329u = true;
            }
            return this.f118318g;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0024, code lost:
        if (r0 != 3) goto L_0x00d3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            boolean r0 = r5.f118324p
            r1 = 0
            if (r0 == 0) goto L_0x000a
            boolean r0 = r5.f118328t
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            int r0 = r6.getAction()
            if (r0 != 0) goto L_0x0017
            int r0 = r6.getEdgeFlags()
            if (r0 == 0) goto L_0x0017
            return r1
        L_0x0017:
            int r0 = r6.getAction()
            r2 = 1
            if (r0 == 0) goto L_0x00b1
            if (r0 == r2) goto L_0x0092
            r3 = 2
            if (r0 == r3) goto L_0x0028
            r6 = 3
            if (r0 == r6) goto L_0x0092
            goto L_0x00d3
        L_0x0028:
            boolean r0 = r5.f118318g
            if (r0 == 0) goto L_0x00d3
            boolean r0 = r5.f118330v
            if (r0 != 0) goto L_0x0048
            float r0 = r6.getY()
            int r0 = (int) r0
            r5.f118319h = r0
            float r0 = r6.getY()
            int r0 = (int) r0
            r5.f118320i = r0
            float r6 = r6.getX()
            int r6 = (int) r6
            r5.f118321j = r6
            r5.f118330v = r2
            return r2
        L_0x0048:
            float r0 = r6.getY()
            int r0 = (int) r0
            r5.f118319h = r0
            float r6 = r6.getX()
            int r6 = (int) r6
            r5.f118321j = r6
            int r6 = r5.f118320i
            int r0 = r5.f118319h
            int r6 = r6 - r0
            int r6 = java.lang.Math.min(r6, r1)
            int r6 = r6 >> r2
            int r0 = r5.getOverScrollDistance()
            int r1 = r5.getLogoHeight()
            int r1 = r1 >> r2
            int r3 = java.lang.Math.abs(r6)
            int r3 = r3 * r1
            double r3 = (double) r3
            double r3 = java.lang.Math.sqrt(r3)
            int r1 = (int) r3
            int r1 = r1 << r2
            int r3 = java.lang.Math.abs(r6)
            if (r1 <= r3) goto L_0x0084
            int r1 = java.lang.Math.abs(r6)
            if (r1 <= r0) goto L_0x0085
            int r6 = -r0
            goto L_0x0085
        L_0x0084:
            int r6 = -r1
        L_0x0085:
            r5.mo68166a(r6)
            com.tencent.mm.plugin.webview.ui.tools.LogoWebViewWrapper$c r0 = r5.f118327s
            if (r0 == 0) goto L_0x0091
            com.tencent.mm.plugin.webview.ui.tools.o1 r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.C44125o1) r0
            r0.mo68758c(r6, r2)
        L_0x0091:
            return r2
        L_0x0092:
            r5.f118330v = r1
            boolean r6 = r5.f118318g
            if (r6 != 0) goto L_0x009c
            boolean r6 = r5.f118328t
            if (r6 == 0) goto L_0x00d3
        L_0x009c:
            r5.f118318g = r1
            com.tencent.mm.plugin.webview.ui.tools.LogoWebViewWrapper$a r6 = new com.tencent.mm.plugin.webview.ui.tools.LogoWebViewWrapper$a
            r6.<init>()
            r5.post(r6)
            int r6 = r5.f118326r
            int r6 = -r6
            long r0 = r5.getScrollBackDuration()
            r5.mo68167b(r6, r0)
            return r2
        L_0x00b1:
            r5.f118328t = r2
            com.tencent.xweb.WebView r0 = r5.f118315d
            boolean r0 = r0.isOverScrollStart()
            if (r0 == 0) goto L_0x00d3
            float r0 = r6.getY()
            int r0 = (int) r0
            r5.f118319h = r0
            float r0 = r6.getY()
            int r0 = (int) r0
            r5.f118320i = r0
            float r6 = r6.getX()
            int r6 = (int) r6
            r5.f118321j = r6
            r5.f118330v = r2
            return r2
        L_0x00d3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.LogoWebViewWrapper.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setEasyMod(boolean z) {
        this.f118331w = z;
    }

    public void setFastScrollBack(boolean z) {
        this.f118325q = z;
    }

    public void setMMOverScrollListener(C43795b bVar) {
    }

    public void setMMOverScrollOffsetListener(C43796c cVar) {
        this.f118327s = cVar;
    }

    public void setReleaseTargetHeight(int i) {
        this.f118326r = i;
    }

    public LogoWebViewWrapper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        this.f118317f = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }
}
