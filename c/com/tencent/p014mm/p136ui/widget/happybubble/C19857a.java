package com.tencent.p014mm.p136ui.widget.happybubble;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.widget.happybubble.BubbleLayout;
import j20.C117292a;
import java.util.ArrayList;
import so3.C77751a;

/* renamed from: com.tencent.mm.ui.widget.happybubble.a */
public class C19857a extends Dialog {

    /* renamed from: d */
    public BubbleLayout f56541d;

    /* renamed from: e */
    public View f56542e;

    /* renamed from: f */
    public Rect f56543f;

    /* renamed from: g */
    public int f56544g;

    /* renamed from: h */
    public C19860d f56545h = C19860d.TOP;

    /* renamed from: i */
    public C19860d[] f56546i = new C19860d[4];

    /* renamed from: j */
    public boolean f56547j;

    /* renamed from: n */
    public int[] f56548n = new int[2];

    /* renamed from: o */
    public Activity f56549o;

    /* renamed from: p */
    public ViewTreeObserver.OnGlobalLayoutListener f56550p;

    /* renamed from: com.tencent.mm.ui.widget.happybubble.a$b */
    public class C19858b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: d */
        public int f56551d;

        /* renamed from: e */
        public int f56552e;

        public C19858b() {
        }

        public void onGlobalLayout() {
            if (this.f56551d != C19857a.this.f56541d.getMeasuredWidth() || this.f56552e != C19857a.this.f56541d.getMeasuredHeight()) {
                C19857a.this.mo26450a();
                this.f56551d = C19857a.this.f56541d.getMeasuredWidth();
                this.f56552e = C19857a.this.f56541d.getMeasuredHeight();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.happybubble.a$c */
    public class C19859c implements BubbleLayout.C19856b {
        public C19859c() {
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.happybubble.a$d */
    public enum C19860d {
        LEFT,
        TOP,
        RIGHT,
        BOTTOM
    }

    /* renamed from: com.tencent.mm.ui.widget.happybubble.a$a */
    public class C19861a implements View.OnTouchListener {
        public C19861a(WindowManager.LayoutParams layoutParams, int i) {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/happybubble/BubbleDialog$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            C19857a.this.getClass();
            C117292a.m165362h(false, this, "com/tencent/mm/ui/widget/happybubble/BubbleDialog$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    public C19857a(Context context) {
        super(context, C0966R.style.a66);
        setCancelable(true);
        this.f56549o = (Activity) context;
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            int i = C77751a.m93806a(getContext())[0];
            this.f56544g = C75044y4.m89994f(getContext());
            getWindow().getDecorView().setOnTouchListener(new C19861a(attributes, i));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        if (r2 != 3) goto L_0x019d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x01a3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo26450a() {
        /*
            r9 = this;
            android.graphics.Rect r0 = r9.f56543f
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            android.view.Window r0 = r9.getWindow()
            if (r0 != 0) goto L_0x000c
            return
        L_0x000c:
            r1 = 51
            r0.setGravity(r1)
            android.view.WindowManager$LayoutParams r1 = r0.getAttributes()
            com.tencent.mm.ui.widget.happybubble.a$d r2 = r9.f56545h
            int r2 = r2.ordinal()
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x00e3
            if (r2 == r4) goto L_0x0029
            if (r2 == r3) goto L_0x00e3
            r6 = 3
            if (r2 == r6) goto L_0x0029
            goto L_0x019d
        L_0x0029:
            int[] r2 = r9.f56548n
            r2 = r2[r5]
            android.graphics.Rect r6 = r9.f56543f
            int r6 = r6.width()
            int r6 = r6 / r3
            int r2 = r2 + r6
            com.tencent.mm.ui.widget.happybubble.BubbleLayout r6 = r9.f56541d
            int r6 = r6.getMeasuredWidth()
            int r6 = r6 / r3
            int r2 = r2 - r6
            int r2 = r2 + r5
            r1.x = r2
            if (r2 > 0) goto L_0x005c
            com.tencent.mm.ui.widget.happybubble.BubbleLayout r2 = r9.f56541d
            int[] r6 = r9.f56548n
            r6 = r6[r5]
            android.graphics.Rect r7 = r9.f56543f
            int r7 = r7.width()
            int r7 = r7 / r3
            int r6 = r6 + r7
            com.tencent.mm.ui.widget.happybubble.BubbleLayout r7 = r9.f56541d
            int r7 = r7.getLookWidth()
            int r7 = r7 / r3
            int r6 = r6 - r7
            r2.setLookPosition(r6)
            goto L_0x00b7
        L_0x005c:
            com.tencent.mm.ui.widget.happybubble.BubbleLayout r6 = r9.f56541d
            int r6 = r6.getMeasuredWidth()
            int r2 = r2 + r6
            android.content.Context r6 = r9.getContext()
            int[] r6 = so3.C77751a.m93806a(r6)
            r6 = r6[r5]
            if (r2 <= r6) goto L_0x009b
            com.tencent.mm.ui.widget.happybubble.BubbleLayout r2 = r9.f56541d
            int[] r6 = r9.f56548n
            r6 = r6[r5]
            android.content.Context r7 = r9.getContext()
            int[] r7 = so3.C77751a.m93806a(r7)
            r7 = r7[r5]
            com.tencent.mm.ui.widget.happybubble.BubbleLayout r8 = r9.f56541d
            int r8 = r8.getMeasuredWidth()
            int r7 = r7 - r8
            int r6 = r6 - r7
            android.graphics.Rect r7 = r9.f56543f
            int r7 = r7.width()
            int r7 = r7 / r3
            int r6 = r6 + r7
            com.tencent.mm.ui.widget.happybubble.BubbleLayout r7 = r9.f56541d
            int r7 = r7.getLookWidth()
            int r7 = r7 / r3
            int r6 = r6 - r7
            r2.setLookPosition(r6)
            goto L_0x00b7
        L_0x009b:
            com.tencent.mm.ui.widget.happybubble.BubbleLayout r2 = r9.f56541d
            int[] r6 = r9.f56548n
            r6 = r6[r5]
            int r7 = r1.x
            int r6 = r6 - r7
            android.graphics.Rect r7 = r9.f56543f
            int r7 = r7.width()
            int r7 = r7 / r3
            int r6 = r6 + r7
            com.tencent.mm.ui.widget.happybubble.BubbleLayout r7 = r9.f56541d
            int r7 = r7.getLookWidth()
            int r7 = r7 / r3
            int r6 = r6 - r7
            r2.setLookPosition(r6)
        L_0x00b7:
            com.tencent.mm.ui.widget.happybubble.a$d r2 = r9.f56545h
            com.tencent.mm.ui.widget.happybubble.a$d r3 = com.tencent.p014mm.p136ui.widget.happybubble.C19857a.C19860d.BOTTOM
            if (r2 != r3) goto L_0x00d0
            int[] r2 = r9.f56548n
            r2 = r2[r4]
            android.graphics.Rect r3 = r9.f56543f
            int r3 = r3.height()
            int r2 = r2 + r3
            int r2 = r2 + r5
            int r3 = r9.f56544g
            int r2 = r2 - r3
            r1.y = r2
            goto L_0x019d
        L_0x00d0:
            int[] r2 = r9.f56548n
            r2 = r2[r4]
            com.tencent.mm.ui.widget.happybubble.BubbleLayout r3 = r9.f56541d
            int r3 = r3.getMeasuredHeight()
            int r2 = r2 - r3
            int r2 = r2 + r5
            int r3 = r9.f56544g
            int r2 = r2 - r3
            r1.y = r2
            goto L_0x019d
        L_0x00e3:
            int[] r2 = r9.f56548n
            r2 = r2[r4]
            int r2 = r2 + r5
            android.graphics.Rect r6 = r9.f56543f
            int r6 = r6.height()
            int r6 = r6 / r3
            int r2 = r2 + r6
            com.tencent.mm.ui.widget.happybubble.BubbleLayout r6 = r9.f56541d
            int r6 = r6.getMeasuredHeight()
            int r6 = r6 / r3
            int r2 = r2 - r6
            int r6 = r9.f56544g
            int r2 = r2 - r6
            r1.y = r2
            if (r2 > 0) goto L_0x011c
            com.tencent.mm.ui.widget.happybubble.BubbleLayout r2 = r9.f56541d
            int[] r6 = r9.f56548n
            r6 = r6[r4]
            android.graphics.Rect r7 = r9.f56543f
            int r7 = r7.height()
            int r7 = r7 / r3
            int r6 = r6 + r7
            com.tencent.mm.ui.widget.happybubble.BubbleLayout r7 = r9.f56541d
            int r7 = r7.getLookWidth()
            int r7 = r7 / r3
            int r6 = r6 - r7
            int r3 = r9.f56544g
            int r6 = r6 - r3
            r2.setLookPosition(r6)
            goto L_0x017a
        L_0x011c:
            com.tencent.mm.ui.widget.happybubble.BubbleLayout r6 = r9.f56541d
            int r6 = r6.getMeasuredHeight()
            int r2 = r2 + r6
            android.content.Context r6 = r9.getContext()
            int[] r6 = so3.C77751a.m93806a(r6)
            r6 = r6[r4]
            if (r2 <= r6) goto L_0x015b
            com.tencent.mm.ui.widget.happybubble.BubbleLayout r2 = r9.f56541d
            int[] r6 = r9.f56548n
            r6 = r6[r4]
            android.content.Context r7 = r9.getContext()
            int[] r7 = so3.C77751a.m93806a(r7)
            r7 = r7[r4]
            com.tencent.mm.ui.widget.happybubble.BubbleLayout r8 = r9.f56541d
            int r8 = r8.getMeasuredHeight()
            int r7 = r7 - r8
            int r6 = r6 - r7
            android.graphics.Rect r7 = r9.f56543f
            int r7 = r7.height()
            int r7 = r7 / r3
            int r6 = r6 + r7
            com.tencent.mm.ui.widget.happybubble.BubbleLayout r7 = r9.f56541d
            int r7 = r7.getLookWidth()
            int r7 = r7 / r3
            int r6 = r6 - r7
            r2.setLookPosition(r6)
            goto L_0x017a
        L_0x015b:
            com.tencent.mm.ui.widget.happybubble.BubbleLayout r2 = r9.f56541d
            int[] r6 = r9.f56548n
            r6 = r6[r4]
            int r7 = r1.y
            int r6 = r6 - r7
            android.graphics.Rect r7 = r9.f56543f
            int r7 = r7.height()
            int r7 = r7 / r3
            int r6 = r6 + r7
            com.tencent.mm.ui.widget.happybubble.BubbleLayout r7 = r9.f56541d
            int r7 = r7.getLookWidth()
            int r7 = r7 / r3
            int r6 = r6 - r7
            int r3 = r9.f56544g
            int r6 = r6 - r3
            r2.setLookPosition(r6)
        L_0x017a:
            com.tencent.mm.ui.widget.happybubble.a$d r2 = r9.f56545h
            com.tencent.mm.ui.widget.happybubble.a$d r3 = com.tencent.p014mm.p136ui.widget.happybubble.C19857a.C19860d.RIGHT
            if (r2 != r3) goto L_0x018f
            int[] r2 = r9.f56548n
            r2 = r2[r5]
            android.graphics.Rect r3 = r9.f56543f
            int r3 = r3.width()
            int r2 = r2 + r3
            int r2 = r2 + r5
            r1.x = r2
            goto L_0x019d
        L_0x018f:
            int[] r2 = r9.f56548n
            r2 = r2[r5]
            com.tencent.mm.ui.widget.happybubble.BubbleLayout r3 = r9.f56541d
            int r3 = r3.getMeasuredWidth()
            int r2 = r2 - r3
            int r2 = r2 + r5
            r1.x = r2
        L_0x019d:
            boolean r2 = p206nj.C76866m.m92673b()
            if (r2 == 0) goto L_0x01c8
            android.app.Activity r2 = r9.f56549o
            if (r2 == 0) goto L_0x01b8
            r2 = 24
            boolean r2 = p206nj.C11171e.m11046c(r2)
            if (r2 == 0) goto L_0x01b8
            android.app.Activity r2 = r9.f56549o
            boolean r2 = r2.isInMultiWindowMode()
            if (r2 == 0) goto L_0x01b8
            goto L_0x01b9
        L_0x01b8:
            r4 = 0
        L_0x01b9:
            boolean r2 = com.tencent.p014mm.p136ui.C85875k4.m106208w()
            if (r2 != 0) goto L_0x01c1
            if (r4 == 0) goto L_0x01c8
        L_0x01c1:
            int r2 = r1.y
            int r3 = r9.f56544g
            int r2 = r2 + r3
            r1.y = r2
        L_0x01c8:
            com.tencent.mm.ui.widget.happybubble.BubbleLayout r2 = r9.f56541d
            r2.invalidate()
            r0.setAttributes(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.widget.happybubble.C19857a.mo26450a():void");
    }

    /* renamed from: c */
    public final void mo26451c() {
        C19860d dVar = C19860d.BOTTOM;
        C19860d dVar2 = C19860d.RIGHT;
        C19860d dVar3 = C19860d.TOP;
        C19860d dVar4 = C19860d.LEFT;
        if (this.f56543f != null) {
            int i = 0;
            for (C19860d dVar5 : this.f56546i) {
                if (dVar5 != null) {
                    i++;
                }
            }
            if (i > 0) {
                int[] iArr = this.f56548n;
                int[] iArr2 = {iArr[0], iArr[1], (C77751a.m93806a(getContext())[0] - this.f56548n[0]) - this.f56543f.width(), (C77751a.m93806a(getContext())[1] - this.f56548n[1]) - this.f56543f.height()};
                int i2 = 0;
                for (C19860d dVar6 : this.f56546i) {
                    if (dVar6 != null) {
                        i2++;
                    }
                }
                if (i2 > 0) {
                    this.f56542e.measure(0, 0);
                    C19860d[] dVarArr = this.f56546i;
                    int length = dVarArr.length;
                    int i3 = 0;
                    while (i3 < length) {
                        C19860d dVar7 = dVarArr[i3];
                        if (dVar7 != null) {
                            int ordinal = dVar7.ordinal();
                            if (ordinal != 0) {
                                if (ordinal != 1) {
                                    if (ordinal != 2) {
                                        if (ordinal == 3 && iArr2[3] > this.f56542e.getMeasuredHeight()) {
                                            this.f56545h = dVar;
                                            return;
                                        }
                                    } else if (iArr2[2] > this.f56542e.getMeasuredWidth()) {
                                        this.f56545h = dVar2;
                                        return;
                                    }
                                } else if (iArr2[1] > this.f56542e.getMeasuredHeight()) {
                                    this.f56545h = dVar3;
                                    return;
                                }
                            } else if (iArr2[0] > this.f56542e.getMeasuredWidth()) {
                                this.f56545h = dVar4;
                                return;
                            }
                            i3++;
                        } else {
                            return;
                        }
                    }
                    this.f56545h = this.f56546i[0];
                    return;
                }
                int i4 = 0;
                for (int i5 = 0; i5 < 4; i5++) {
                    int i6 = iArr2[i5];
                    if (i6 > i4) {
                        i4 = i6;
                    }
                }
                if (i4 == iArr2[0]) {
                    this.f56545h = dVar4;
                } else if (i4 == iArr2[1]) {
                    this.f56545h = dVar3;
                } else if (i4 == iArr2[2]) {
                    this.f56545h = dVar2;
                } else if (i4 == iArr2[3]) {
                    this.f56545h = dVar;
                }
            }
        }
    }

    /* renamed from: d */
    public <T extends C19857a> T mo26452d(View view) {
        this.f56543f = new Rect(0, 0, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f56548n);
        mo26451c();
        if (this.f56550p != null) {
            mo26453e();
            mo26450a();
        }
        return this;
    }

    public void dismiss() {
        BubbleLayout bubbleLayout = this.f56541d;
        if (bubbleLayout != null) {
            bubbleLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this.f56550p);
        }
        super.dismiss();
    }

    /* renamed from: e */
    public final void mo26453e() {
        int ordinal = this.f56545h.ordinal();
        if (ordinal == 0) {
            this.f56541d.setLook(BubbleLayout.C19855a.RIGHT);
        } else if (ordinal == 1) {
            this.f56541d.setLook(BubbleLayout.C19855a.BOTTOM);
        } else if (ordinal == 2) {
            this.f56541d.setLook(BubbleLayout.C19855a.LEFT);
        } else if (ordinal == 3) {
            this.f56541d.setLook(BubbleLayout.C19855a.TOP);
        }
        this.f56541d.mo26418b();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f56541d == null) {
            this.f56541d = new BubbleLayout(getContext(), (AttributeSet) null);
        }
        View view = this.f56542e;
        if (view != null) {
            this.f56541d.addView(view);
        }
        setContentView(this.f56541d);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-2, -2);
            mo26451c();
            mo26453e();
            this.f56541d.measure(0, 0);
            mo26450a();
            this.f56550p = new C19858b();
            this.f56541d.getViewTreeObserver().addOnGlobalLayoutListener(this.f56550p);
            this.f56541d.setOnClickEdgeListener(new C19859c());
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        Window window = getWindow();
        if (window == null) {
            return false;
        }
        View decorView = window.getDecorView();
        if (this.f56547j && isShowing()) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x <= 0 || y <= 0 || x > decorView.getWidth() || y > decorView.getHeight()) {
                cancel();
                return true;
            }
        }
        return false;
    }

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        this.f56547j = z;
    }
}
