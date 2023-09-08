package com.tencent.p014mm.plugin.webview.p128ui.tools.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.MailMMWebView */
public class MailMMWebView extends MMWebViewWithJsApi implements C85585g0 {

    /* renamed from: A */
    public float f249483A;

    /* renamed from: B */
    public float f249484B;

    /* renamed from: v */
    public boolean f249485v;

    /* renamed from: w */
    public View f249486w;

    /* renamed from: x */
    public View f249487x;

    /* renamed from: y */
    public boolean f249488y;

    /* renamed from: z */
    public boolean f249489z;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.MailMMWebView$a */
    public class C85584a extends FrameLayout {
        public C85584a(Context context) {
            super(context);
        }

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            MailMMWebView mailMMWebView = MailMMWebView.this;
            if (!mailMMWebView.f249488y && !mailMMWebView.f249489z) {
                return false;
            }
            int action = motionEvent.getAction() & 255;
            if (action == 1 || action == 3) {
                MailMMWebView mailMMWebView2 = MailMMWebView.this;
                mailMMWebView2.f249488y = false;
                mailMMWebView2.f249489z = false;
            }
            super.dispatchTouchEvent(motionEvent);
            return true;
        }

        public void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            MailMMWebView mailMMWebView = MailMMWebView.this;
            if (this != mailMMWebView.f249486w || mailMMWebView.getTitleHeight() <= 0) {
                MailMMWebView mailMMWebView2 = MailMMWebView.this;
                if (this == mailMMWebView2.f249487x && mailMMWebView2.getBottomHeight() > 0) {
                    MailMMWebView.this.mo119050x();
                    return;
                }
                return;
            }
            MailMMWebView.this.mo119049v();
        }
    }

    public MailMMWebView(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    private int getViewHeightWithTitleBar() {
        int height = getHeight();
        return (!isHorizontalScrollBarEnabled() || overlayHorizontalScrollbar()) ? height : height - getHorizontalScrollbarHeight();
    }

    private void setEmbeddedTitleBarSinceJellyBean(View view) {
        if (view != null) {
            View view2 = this.f249486w;
            if (view2 != null) {
                removeView(view2);
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            this.f249486w = new C85584a(getContext());
            ((C85584a) this.f249486w).addView(view, new FrameLayout.LayoutParams(-1, -2));
            this.f249486w.setBackgroundColor(getContext().getResources().getColor(C0966R.color.f2975b6));
            addView(this.f249486w, layoutParams);
        }
    }

    /* renamed from: H */
    public boolean mo119038H() {
        return this.f249485v;
    }

    /* renamed from: P */
    public void mo119039P(boolean z) {
        View view = this.f249487x;
        if (view == null) {
            return;
        }
        if (z) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/widget/MailMMWebView", "showBottomBar", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/webview/ui/tools/widget/MailMMWebView", "showBottomBar", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(4);
        View view3 = view;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/widget/MailMMWebView", "showBottomBar", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/webview/ui/tools/widget/MailMMWebView", "showBottomBar", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public int computeVerticalScrollExtent() {
        return getViewHeightWithTitleBar() - getVisibleTitleBarHeight();
    }

    public int computeVerticalScrollOffset() {
        return Math.max(getWebScrollY() - getTitleHeight(), 0);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int webScrollY = getWebScrollY();
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f249483A = x;
            this.f249484B = y;
            if (this.f249486w == null || ((int) y) >= getVisibleTitleBarHeight()) {
                View view = this.f249487x;
                if (view != null && view.getVisibility() == 0 && this.f249484B + ((float) getBottomHeight()) > ((float) getHeight())) {
                    this.f249489z = true;
                }
            } else {
                this.f249488y = true;
            }
        } else if (action == 2 && Math.abs(y - this.f249484B) > 50.0f && this.f249488y) {
            motionEvent.setAction(3);
            motionEvent.setLocation(this.f249483A, this.f249484B + ((float) webScrollY));
            this.f249486w.dispatchTouchEvent(motionEvent);
            motionEvent.setAction(0);
            motionEvent.setLocation(this.f249483A, this.f249484B);
            super.dispatchTouchEvent(motionEvent);
            motionEvent.setAction(2);
            motionEvent.setLocation(x, y);
        }
        if (this.f249488y && this.f249486w != null) {
            motionEvent.setLocation(x, y + ((float) webScrollY));
            return this.f249486w.dispatchTouchEvent(motionEvent);
        } else if (!this.f249489z || this.f249487x == null) {
            return super.dispatchTouchEvent(motionEvent);
        } else {
            motionEvent.setLocation(x, (y + ((float) getBottomHeight())) - ((float) getHeight()));
            return this.f249487x.dispatchTouchEvent(motionEvent);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        if (view != this.f249486w) {
            return super.drawChild(canvas, view, j);
        }
        int webScrollY = getWebScrollY();
        canvas.save();
        canvas.translate(0.0f, (float) (-webScrollY));
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }

    public int getBottomHeight() {
        View view = this.f249487x;
        if (view != null) {
            return view.getHeight();
        }
        return 0;
    }

    public int getTitleHeight() {
        View view = this.f249486w;
        if (view != null) {
            return view.getHeight();
        }
        return 0;
    }

    public int getVisibleTitleBarHeight() {
        return Math.max(getTitleHeight() - getWebScrollY(), 0);
    }

    /* renamed from: i */
    public void mo119046i() {
        this.f249485v = false;
    }

    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.f249485v = true;
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    public void onWebViewScrollChanged(int i, int i2, int i3, int i4) {
        super.onWebViewScrollChanged(i, i2, i3, i4);
        invalidate();
        int contentHeight = ((int) (((float) getContentHeight()) * getScale())) - (getHeight() + i2);
        if (contentHeight < getBottomHeight()) {
            if (Math.abs(contentHeight) > 20) {
                mo119050x();
                mo119039P(false);
            } else {
                mo119039P(true);
            }
        }
        if (getVisibleTitleHeight() == 0) {
            mo119049v();
        }
    }

    public void setEmbeddedBottomBar(View view) {
        if (view != null) {
            View view2 = this.f249487x;
            if (view2 != null) {
                removeView(view2);
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
            this.f249487x = new C85584a(getContext());
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view.getLayoutParams();
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams3.setMargins(layoutParams2.leftMargin, layoutParams2.topMargin, layoutParams2.rightMargin, layoutParams2.bottomMargin);
            ((C85584a) this.f249487x).addView(view, layoutParams3);
            addView(this.f249487x, layoutParams);
            View view3 = this.f249487x;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            View view4 = view3;
            C117292a.m165358d(view4, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/widget/MailMMWebView", "setEmbeddedBottomBar", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/webview/ui/tools/widget/MailMMWebView", "setEmbeddedBottomBar", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void setEmbeddedTitleBarCompat(View view) {
        setEmbeddedTitleBarSinceJellyBean(view);
    }

    /* renamed from: v */
    public void mo119049v() {
        evaluateJavascript("javascript:_updateTitleBarHeight(" + ((int) (((float) getTitleHeight()) / getScale())) + ");", (ValueCallback<String>) null);
    }

    /* renamed from: x */
    public void mo119050x() {
        evaluateJavascript("javascript:_updateBottomBarHeight(" + ((int) (((float) getBottomHeight()) / getScale())) + ");", (ValueCallback<String>) null);
    }

    public MailMMWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MailMMWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
