package com.tencent.p014mm.plugin.sns.p106ui.widget.p804ad;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.Scroller;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C43047e;
import com.tencent.p014mm.sdk.platformtools.Log;
import p1208q3.C118144a;

/* renamed from: com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout */
public class ScrollableLayout extends LinearLayout {

    /* renamed from: d */
    public int f116750d;

    /* renamed from: e */
    public int f116751e;

    /* renamed from: f */
    public Scroller f116752f;

    /* renamed from: g */
    public boolean f116753g;

    /* renamed from: h */
    public View f116754h;

    /* renamed from: i */
    public int f116755i;

    /* renamed from: j */
    public int f116756j;

    /* renamed from: n */
    public int f116757n;

    /* renamed from: o */
    public int f116758o;

    /* renamed from: p */
    public int f116759p;

    /* renamed from: q */
    public int f116760q;

    /* renamed from: r */
    public int f116761r;

    /* renamed from: s */
    public int f116762s;

    /* renamed from: t */
    public C43160c f116763t;

    /* renamed from: u */
    public C43158a f116764u;

    /* renamed from: com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout$a */
    public interface C43158a {
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout$b */
    public interface C43159b {
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout$c */
    public interface C43160c {
    }

    public ScrollableLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final boolean mo67376a(View view, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("inChild", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        boolean z = false;
        if (view == null) {
            SnsMethodCalculate.markEndTimeMs("inChild", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
            return false;
        }
        int scrollY = getScrollY();
        if (i2 >= view.getTop() - scrollY && i2 < view.getBottom() - scrollY && i >= view.getLeft() && i < view.getRight()) {
            z = true;
        }
        SnsMethodCalculate.markEndTimeMs("inChild", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        return z;
    }

    /* renamed from: b */
    public final boolean mo67377b(MotionEvent motionEvent) {
        int findPointerIndex;
        SnsMethodCalculate.markStartTimeMs("onInterceptTouchEventInner", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        int action = motionEvent.getAction();
        if (action != 2 || !this.f116753g) {
            int i = action & 255;
            boolean z = false;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        SnsMethodCalculate.markStartTimeMs("onInterceptTouchActionMove", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
                        int i2 = this.f116760q;
                        if (i2 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i2)) >= 0) {
                            motionEvent.getX(findPointerIndex);
                            int y = (int) motionEvent.getY(findPointerIndex);
                            int i3 = y - this.f116755i;
                            int scrollY = getScrollY();
                            if (Math.abs(i3) >= this.f116750d) {
                                C43158a aVar = this.f116764u;
                                if (aVar != null) {
                                    SnsMethodCalculate.markStartTimeMs("isChildCanScrollDown", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$3");
                                    C43047e eVar = C43047e.this;
                                    SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
                                    boolean z2 = eVar.f116522B;
                                    SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
                                    SnsMethodCalculate.markEndTimeMs("isChildCanScrollDown", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$3");
                                    z = z2;
                                }
                                this.f116755i = y;
                                if ((i3 < 0 && scrollY <= 0) || (i3 > 0 && scrollY >= this.f116757n && !z)) {
                                    this.f116753g = true;
                                }
                            }
                        }
                        Log.m105924i("ScrollLinearLayout", "the onInterceptTouchActionMove is called " + this.f116753g);
                        boolean z3 = this.f116753g;
                        SnsMethodCalculate.markEndTimeMs("onInterceptTouchActionMove", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
                        SnsMethodCalculate.markEndTimeMs("onInterceptTouchEventInner", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
                        return z3;
                    } else if (i != 3) {
                        SnsMethodCalculate.markEndTimeMs("onInterceptTouchEventInner", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
                        return false;
                    }
                }
                SnsMethodCalculate.markStartTimeMs("onInterceptTouchActionUpOrCancel", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
                this.f116753g = false;
                this.f116760q = -1;
                Log.m105924i("ScrollLinearLayout", "the onInterceptTouchActionUpOrCancel is called " + this.f116753g);
                boolean z4 = this.f116753g;
                SnsMethodCalculate.markEndTimeMs("onInterceptTouchActionUpOrCancel", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
                SnsMethodCalculate.markEndTimeMs("onInterceptTouchEventInner", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
                return z4;
            }
            SnsMethodCalculate.markStartTimeMs("onInterceptTouchActionDown", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
            int y2 = (int) motionEvent.getY();
            this.f116761r = getScrollY();
            if (!mo67376a(this.f116754h, (int) motionEvent.getX(), y2)) {
                this.f116753g = false;
            } else {
                this.f116760q = motionEvent.getPointerId(0);
                this.f116755i = y2;
                this.f116753g = !this.f116752f.isFinished();
                SnsMethodCalculate.markStartTimeMs("computeRealScrollY", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
                int i4 = this.f116756j;
                if (i4 <= 0) {
                    i4 = this.f116757n / 3;
                }
                this.f116758o = this.f116757n + i4;
                this.f116759p = -i4;
                SnsMethodCalculate.markEndTimeMs("computeRealScrollY", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
            }
            Log.m105924i("ScrollLinearLayout", "the onInterceptTouchActionDown is called " + this.f116753g + ", mScrollYWhenTouchDown = " + this.f116761r);
            boolean z5 = this.f116753g;
            SnsMethodCalculate.markEndTimeMs("onInterceptTouchActionDown", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
            SnsMethodCalculate.markEndTimeMs("onInterceptTouchEventInner", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
            return z5;
        }
        SnsMethodCalculate.markEndTimeMs("onInterceptTouchEventInner", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ec  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo67378c(android.view.MotionEvent r14) {
        /*
            r13 = this;
            java.lang.String r0 = "onTouchEventInner"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            int r2 = r14.getActionMasked()
            java.lang.String r3 = "ScrollLinearLayout"
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x00fe
            r6 = 2
            if (r2 == r5) goto L_0x008b
            if (r2 == r6) goto L_0x001e
            r14 = 3
            if (r2 == r14) goto L_0x008b
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r4
        L_0x001e:
            java.lang.String r2 = "onTouchActionMove"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r1)
            int r6 = r13.f116760q
            int r6 = r14.findPointerIndex(r6)
            if (r6 >= 0) goto L_0x004b
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r4 = "Invalid pointerId="
            r14.append(r4)
            int r4 = r13.f116760q
            r14.append(r4)
            java.lang.String r4 = " in onTouchEvent"
            r14.append(r4)
            java.lang.String r14 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r14)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            goto L_0x0087
        L_0x004b:
            r14.getX(r6)
            float r14 = r14.getY(r6)
            int r14 = (int) r14
            int r3 = r13.f116755i
            int r3 = r14 - r3
            boolean r6 = r13.f116753g
            if (r6 != 0) goto L_0x006a
            int r6 = java.lang.Math.abs(r3)
            int r7 = r13.f116750d
            if (r6 < r7) goto L_0x006a
            r13.f116753g = r5
            if (r3 <= 0) goto L_0x0069
            int r3 = r3 - r7
            goto L_0x006a
        L_0x0069:
            int r3 = r3 + r7
        L_0x006a:
            int r6 = r13.getScrollY()
            int r6 = r6 - r3
            boolean r7 = r13.f116753g
            if (r7 == 0) goto L_0x0084
            int r7 = r13.f116759p
            if (r7 >= r6) goto L_0x0084
            int r7 = r13.f116758o
            if (r7 <= r6) goto L_0x0084
            r13.mo67380d(r5)
            int r3 = -r3
            r13.scrollBy(r4, r3)
            r13.f116755i = r14
        L_0x0084:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
        L_0x0087:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r5
        L_0x008b:
            java.lang.String r14 = "onTouchActionUpOrCancel"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r1)
            int r2 = r13.f116761r
            int r9 = r13.getScrollY()
            int r7 = r9 - r2
            if (r7 <= 0) goto L_0x00a4
            int r8 = r13.f116757n
            int r8 = r8 - r9
            int r10 = r13.f116751e
            if (r7 >= r10) goto L_0x00af
            int r7 = -r9
            goto L_0x00ad
        L_0x00a4:
            int r8 = -r9
            int r10 = r13.f116751e
            int r10 = -r10
            if (r7 <= r10) goto L_0x00af
            int r7 = r13.f116757n
            int r7 = r7 - r9
        L_0x00ad:
            r11 = r7
            goto L_0x00b0
        L_0x00af:
            r11 = r8
        L_0x00b0:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "the onTouchActionUpOrCancel is called, mScrollYWhenTouchDown = "
            r7.append(r8)
            r7.append(r2)
            java.lang.String r2 = ", currentScrollY = "
            r7.append(r2)
            r7.append(r9)
            java.lang.String r2 = ", yDistance = "
            r7.append(r2)
            r7.append(r11)
            java.lang.String r2 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            boolean r2 = r13.f116753g
            if (r2 == 0) goto L_0x00ec
            android.widget.Scroller r7 = r13.f116752f
            int r8 = r13.getScrollX()
            r10 = 0
            r12 = 350(0x15e, float:4.9E-43)
            r7.startScroll(r8, r9, r10, r11, r12)
            r13.invalidate()
            r13.mo67380d(r6)
            goto L_0x00f0
        L_0x00ec:
            r13.mo67380d(r4)
            r5 = 0
        L_0x00f0:
            r13.f116753g = r4
            r2 = -1
            r13.f116760q = r2
            r13.f116755i = r4
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r5
        L_0x00fe:
            java.lang.String r2 = "onTouchActionDown"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r1)
            float r6 = r14.getX()
            int r6 = (int) r6
            float r7 = r14.getY()
            int r7 = (int) r7
            android.view.View r8 = r13.f116754h
            boolean r6 = r13.mo67376a(r8, r6, r7)
            if (r6 != 0) goto L_0x011a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            goto L_0x0154
        L_0x011a:
            android.widget.Scroller r6 = r13.f116752f
            boolean r6 = r6.isFinished()
            r5 = r5 ^ r6
            r13.f116753g = r5
            android.widget.Scroller r5 = r13.f116752f
            boolean r5 = r5.isFinished()
            if (r5 != 0) goto L_0x0130
            android.widget.Scroller r5 = r13.f116752f
            r5.abortAnimation()
        L_0x0130:
            r13.f116755i = r7
            int r14 = r14.getPointerId(r4)
            r13.f116760q = r14
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r4 = "the onTouchActionDown is called "
            r14.append(r4)
            boolean r4 = r13.f116753g
            r14.append(r4)
            java.lang.String r14 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r14)
            boolean r4 = r13.f116753g
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
        L_0x0154:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.widget.p804ad.ScrollableLayout.mo67378c(android.view.MotionEvent):boolean");
    }

    public void computeScroll() {
        SnsMethodCalculate.markStartTimeMs("computeScroll", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        super.computeScroll();
        try {
            if (this.f116752f.computeScrollOffset()) {
                scrollTo(this.f116752f.getCurrX(), this.f116752f.getCurrY());
                invalidate();
            } else if (this.f116762s == 2) {
                Log.m105924i("ScrollLinearLayout", "compute scroll offset is false the currY is " + this.f116752f.getCurrY() + ", the final Y is " + this.f116752f.getFinalY());
                mo67380d(0);
            }
        } catch (Throwable unused) {
            Log.m105928w("ScrollLinearLayout", "the compute scroll has something wrong!");
        }
        SnsMethodCalculate.markEndTimeMs("computeScroll", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
    }

    /* renamed from: d */
    public final void mo67380d(int i) {
        SnsMethodCalculate.markStartTimeMs("reportScrollStateChanged", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        if (i != this.f116762s) {
            C43160c cVar = this.f116763t;
            if (cVar != null) {
                int i2 = 1;
                boolean z = getScrollY() >= this.f116757n;
                C43047e eVar = (C43047e) cVar;
                SnsMethodCalculate.markStartTimeMs("onScrollChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
                if (i == 0) {
                    try {
                        C118144a a = C118144a.m166672a(eVar.f276579d);
                        Intent intent = new Intent("com.tencent.mm.adlanding.video.action.PAUSE_OR_RESUME");
                        if (!z) {
                            i2 = 2;
                        }
                        intent.putExtra("TRY_PAUSE_OR_RESUME", i2);
                        intent.putExtra("identity", eVar.f276579d.hashCode());
                        a.mo182944c(intent);
                    } catch (Throwable unused) {
                        Log.m105928w("AdLandingFloatWebView", "onScrollChanged method has something wrong");
                    }
                }
                SnsMethodCalculate.markEndTimeMs("onScrollChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
            }
            Log.m105924i("ScrollLinearLayout", "the new state is " + i);
            this.f116762s = i;
        }
        SnsMethodCalculate.markEndTimeMs("reportScrollStateChanged", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        SnsMethodCalculate.markStartTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        try {
            if (mo67377b(motionEvent)) {
                SnsMethodCalculate.markEndTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
                return true;
            }
        } catch (Throwable unused) {
            Log.m105920e("ScrollLinearLayout", "the onInterceptTouchEventInner has something wrong");
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        SnsMethodCalculate.markEndTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        return onInterceptTouchEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        SnsMethodCalculate.markStartTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        try {
            if (mo67378c(motionEvent)) {
                SnsMethodCalculate.markEndTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
                return true;
            }
        } catch (Throwable unused) {
            Log.m105920e("ScrollLinearLayout", "the onTouchEventInner is called " + this.f116753g);
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        SnsMethodCalculate.markEndTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        return onTouchEvent;
    }

    public void setChildScrollableListener(C43158a aVar) {
        SnsMethodCalculate.markStartTimeMs("setChildScrollableListener", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        this.f116764u = aVar;
        SnsMethodCalculate.markEndTimeMs("setChildScrollableListener", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
    }

    public void setDescendantScrollStatusHunter(C43159b bVar) {
        SnsMethodCalculate.markStartTimeMs("setDescendantScrollStatusHunter", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        SnsMethodCalculate.markEndTimeMs("setDescendantScrollStatusHunter", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
    }

    public void setMaxOverScrollOffset(int i) {
        SnsMethodCalculate.markStartTimeMs("setMaxOverScrollOffset", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        this.f116756j = i;
        SnsMethodCalculate.markEndTimeMs("setMaxOverScrollOffset", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
    }

    public void setMaxYScrollOffset(int i) {
        SnsMethodCalculate.markStartTimeMs("setMaxYScrollOffset", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        this.f116757n = i;
        SnsMethodCalculate.markEndTimeMs("setMaxYScrollOffset", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
    }

    public void setOnScrollStatusListener(C43160c cVar) {
        SnsMethodCalculate.markStartTimeMs("setOnScrollStatusListener", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        this.f116763t = cVar;
        SnsMethodCalculate.markEndTimeMs("setOnScrollStatusListener", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
    }

    public ScrollableLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.f116753g = false;
        this.f116756j = 0;
        this.f116757n = 0;
        this.f116758o = 0;
        this.f116759p = 0;
        this.f116760q = -1;
        this.f116761r = 0;
        this.f116762s = 0;
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        try {
            this.f116752f = new Scroller(context, new DecelerateInterpolator());
            this.f116750d = ViewConfiguration.get(getContext()).getScaledTouchSlop();
            setOrientation(1);
            this.f116751e = context.getResources().getDimensionPixelOffset(C0966R.dimen.anl);
        } catch (Throwable unused) {
            Log.m105928w("ScrollLinearLayout", "the init method has something wrong!");
        }
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
    }
}
