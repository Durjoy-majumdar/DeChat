package com.tencent.p014mm.plugin.webview.p128ui.tools.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import kg3.C76577a;
import wq3.C111847h;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.MovingImageButton */
public class MovingImageButton extends ImageView implements C111847h {

    /* renamed from: d */
    public Context f119818d;

    /* renamed from: e */
    public int f119819e;

    /* renamed from: f */
    public int f119820f;

    /* renamed from: g */
    public int f119821g;

    /* renamed from: h */
    public int f119822h;

    /* renamed from: i */
    public int f119823i;

    /* renamed from: j */
    public int f119824j;

    /* renamed from: n */
    public int f119825n = 0;

    /* renamed from: o */
    public int f119826o = 0;

    /* renamed from: p */
    public ViewGroup.MarginLayoutParams f119827p;

    /* renamed from: q */
    public int f119828q;

    /* renamed from: r */
    public int f119829r;

    /* renamed from: s */
    public boolean f119830s = true;

    public MovingImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f119818d = context;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f119828q = C76577a.m92151b(this.f119818d, 100);
        C76577a.m92145A(this.f119818d);
        C76577a.m92159j(this.f119818d);
        this.f119829r = ViewConfiguration.get(this.f119818d).getScaledTouchSlop();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f119830s) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.f119825n == 0 || this.f119826o == 0) {
            Rect rect = new Rect();
            getWindowVisibleDisplayFrame(rect);
            int i = rect.right;
            this.f119825n = i - rect.left;
            this.f119826o = rect.bottom - rect.top;
            Log.m105919d("MicroMsg.MovingImageButton", "right = %d, top = %d, left = %d, bottom = %d, screenX = %d, screenY = %d", Integer.valueOf(i), Integer.valueOf(rect.top), Integer.valueOf(rect.left), Integer.valueOf(rect.bottom), Integer.valueOf(this.f119825n), Integer.valueOf(this.f119826o));
        }
        this.f119819e = (int) motionEvent.getRawX();
        this.f119820f = (int) motionEvent.getRawY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f119823i = this.f119819e;
            this.f119824j = this.f119820f;
        } else if (action != 1) {
            if (action == 2) {
                int i2 = this.f119819e - this.f119821g;
                int i3 = this.f119820f - this.f119822h;
                if (!(i2 == 0 && i3 == 0)) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
                    this.f119827p = marginLayoutParams;
                    int i4 = marginLayoutParams.rightMargin + (-i2);
                    marginLayoutParams.rightMargin = i4;
                    marginLayoutParams.topMargin += i3;
                    if (i4 < 0) {
                        marginLayoutParams.rightMargin = 0;
                    } else if (i4 > this.f119825n - getWidth()) {
                        this.f119827p.rightMargin = this.f119825n - getWidth();
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = this.f119827p;
                    int i5 = marginLayoutParams2.topMargin;
                    if (i5 < 0) {
                        marginLayoutParams2.topMargin = 0;
                    } else if (i5 > this.f119826o - getHeight()) {
                        this.f119827p.topMargin = this.f119826o - getHeight();
                    }
                    requestLayout();
                }
            }
        } else if (Math.abs(this.f119823i - this.f119819e) + Math.abs(this.f119824j - this.f119820f) > this.f119829r) {
            int i6 = this.f119820f;
            int i7 = this.f119828q;
            if (i6 < i7) {
                this.f119827p.topMargin = 0;
            } else {
                int i8 = this.f119826o;
                if (i6 > i8 - i7) {
                    this.f119827p.topMargin = i8 - getHeight();
                } else {
                    int i9 = this.f119819e;
                    int i15 = this.f119825n;
                    if (i9 > i15 / 2) {
                        this.f119827p.rightMargin = 0;
                    } else {
                        this.f119827p.rightMargin = i15 - getWidth();
                    }
                }
            }
            requestLayout();
        } else {
            performClick();
        }
        this.f119821g = this.f119819e;
        this.f119822h = this.f119820f;
        return true;
    }

    public void setCanMove(boolean z) {
        this.f119830s = z;
    }

    public MovingImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f119818d = context;
    }
}
