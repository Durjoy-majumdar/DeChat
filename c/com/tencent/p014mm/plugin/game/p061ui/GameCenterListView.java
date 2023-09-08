package com.tencent.p014mm.plugin.game.p061ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Scroller;
import com.tencent.p014mm.C0966R;
import ry1.C48140o;
import wq3.C111847h;

/* renamed from: com.tencent.mm.plugin.game.ui.GameCenterListView */
public class GameCenterListView extends ListView implements C111847h {

    /* renamed from: q */
    public static boolean f113692q;

    /* renamed from: r */
    public static int f113693r;

    /* renamed from: d */
    public Context f113694d;

    /* renamed from: e */
    public boolean f113695e;

    /* renamed from: f */
    public float f113696f;

    /* renamed from: g */
    public int f113697g;

    /* renamed from: h */
    public boolean f113698h;

    /* renamed from: i */
    public boolean f113699i;

    /* renamed from: j */
    public Scroller f113700j;

    /* renamed from: n */
    public ImageView f113701n;

    /* renamed from: o */
    public ImageView f113702o;

    /* renamed from: p */
    public View f113703p;

    public GameCenterListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f113694d = context;
    }

    public static void setCanPulldown(boolean z) {
        f113692q = z;
    }

    public static void setDefaultPadding(int i) {
        f113693r = i;
    }

    public void computeScroll() {
        if (this.f113703p != null && this.f113700j.computeScrollOffset()) {
            int currY = this.f113700j.getCurrY();
            this.f113703p.setPadding(0, currY, 0, 0);
            int i = f113693r;
            int i2 = (int) ((((float) (i - currY)) / ((float) i)) * 255.0f);
            this.f113702o.setAlpha(255 - i2);
            this.f113701n.setAlpha(i2);
            invalidate();
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!f113692q || this.f113703p == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f113699i = false;
            this.f113696f = motionEvent.getRawY();
        } else if (action == 2 && this.f113698h) {
            if (this.f113699i) {
                return true;
            }
            int rawY = (int) (motionEvent.getRawY() - this.f113696f);
            if (this.f113703p.getPaddingTop() <= f113693r + this.f113697g) {
                if (rawY > 0 && Math.abs(rawY) >= this.f113697g) {
                    this.f113699i = true;
                    this.f113700j.startScroll(0, this.f113703p.getPaddingTop(), 0, -this.f113703p.getPaddingTop(), 500);
                    this.f113701n.setClickable(true);
                    invalidate();
                    motionEvent.setAction(3);
                    super.dispatchTouchEvent(motionEvent);
                    return true;
                }
            } else if (this.f113703p.getPaddingTop() >= (-this.f113697g) && rawY < 0 && Math.abs(rawY) >= this.f113697g) {
                this.f113699i = true;
                this.f113700j.startScroll(0, 0, 0, f113693r, 500);
                invalidate();
                motionEvent.setAction(3);
                super.dispatchTouchEvent(motionEvent);
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f113697g = ViewConfiguration.get(this.f113694d).getScaledTouchSlop();
        this.f113700j = new Scroller(this.f113694d);
        super.setOnScrollListener(new C48140o(this));
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z && !this.f113695e) {
            View childAt = getChildAt(0);
            this.f113703p = childAt;
            this.f113702o = (ImageView) childAt.findViewById(C0966R.C0970id.jna);
            this.f113701n = (ImageView) this.f113703p.findViewById(C0966R.C0970id.a8y);
            this.f113695e = true;
        }
    }
}
