package com.tencent.p014mm.plugin.webview.p128ui.tools.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.RelativeLayout;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import gy3.C87412m;
import kotlin.Metadata;
import nl3.C47282e;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/widget/PullDownWebViewLayout;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "webview-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.PullDownWebViewLayout */
public final class PullDownWebViewLayout extends RelativeLayout {

    /* renamed from: d */
    public float f119831d;

    /* renamed from: e */
    public float f119832e;

    /* renamed from: f */
    public float f119833f;

    /* renamed from: g */
    public float f119834g;

    /* renamed from: h */
    public VelocityTracker f119835h;

    /* renamed from: i */
    public View f119836i;

    /* renamed from: j */
    public MMWebView f119837j;

    /* renamed from: n */
    public C47282e f119838n;

    /* renamed from: o */
    public int f119839o;

    /* renamed from: p */
    public boolean f119840p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PullDownWebViewLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (onInterceptTouchEvent) {
            return onInterceptTouchEvent;
        }
        if (!this.f119840p || motionEvent == null) {
            return false;
        }
        if (this.f119835h == null) {
            this.f119835h = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker = this.f119835h;
        C87412m.m108591d(velocityTracker);
        velocityTracker.addMovement(motionEvent);
        VelocityTracker velocityTracker2 = this.f119835h;
        C87412m.m108591d(velocityTracker2);
        velocityTracker2.computeCurrentVelocity(1000);
        VelocityTracker velocityTracker3 = this.f119835h;
        C87412m.m108591d(velocityTracker3);
        int xVelocity = (int) velocityTracker3.getXVelocity();
        VelocityTracker velocityTracker4 = this.f119835h;
        C87412m.m108591d(velocityTracker4);
        int yVelocity = (int) velocityTracker4.getYVelocity();
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f119833f = motionEvent.getRawX();
            this.f119834g = motionEvent.getRawY();
            this.f119831d = motionEvent.getRawY();
            return false;
        } else if (action == 1 || action != 2) {
            return false;
        } else {
            float rawX = motionEvent.getRawX() - this.f119833f;
            float rawY = motionEvent.getRawY() - this.f119834g;
            if (Math.abs(rawY) < 5.0f || Math.abs(rawX) > 250.0f || Math.abs(yVelocity) <= Math.abs(xVelocity) || Math.abs(yVelocity) <= 0 || Math.abs(rawY) <= Math.abs(rawX)) {
                return false;
            }
            MMWebView mMWebView = this.f119837j;
            if (mMWebView != null) {
                return mMWebView.isOverScrollStart() && rawY >= 0.0f;
            }
            C87412m.m108603p("webView");
            throw null;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return super.onTouchEvent(motionEvent);
        }
        boolean z = false;
        if (!this.f119840p) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            float f = 0.0f;
            if (action == 1) {
                C47282e eVar = this.f119838n;
                if (eVar != null) {
                    View view = this.f119836i;
                    if (view != null) {
                        eVar.mo72316b(view, this.f119839o);
                        this.f119831d = 0.0f;
                    } else {
                        C87412m.m108603p("toDragView");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("dragHelper");
                    throw null;
                }
            } else if (action == 2) {
                float rawY = motionEvent.getRawY();
                this.f119832e = rawY;
                float f2 = rawY - this.f119831d;
                C47282e eVar2 = this.f119838n;
                if (eVar2 != null) {
                    float f3 = eVar2.f126923d;
                    float f4 = f2 + f3;
                    if (f4 >= 0.0f) {
                        f = f4;
                    }
                    if (eVar2 != null) {
                        if (f == f3) {
                            z = true;
                        }
                        if (!z) {
                            if (eVar2 != null) {
                                eVar2.f126923d = f;
                                View view2 = this.f119836i;
                                if (view2 != null) {
                                    view2.setTranslationY(f);
                                } else {
                                    C87412m.m108603p("toDragView");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("dragHelper");
                                throw null;
                            }
                        }
                        this.f119831d = this.f119832e;
                    } else {
                        C87412m.m108603p("dragHelper");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("dragHelper");
                    throw null;
                }
            }
        } else {
            this.f119831d = motionEvent.getRawY();
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PullDownWebViewLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
