package xo3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.Spannable;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.tencent.neattextview.textview.view.NeatTextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C85975v4;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import nj3.C76871c;
import uo3.C78253a;

/* renamed from: xo3.d */
public class C78950d {

    /* renamed from: A */
    public boolean f231826A = true;

    /* renamed from: B */
    public boolean f231827B = false;

    /* renamed from: C */
    public boolean f231828C = true;

    /* renamed from: D */
    public boolean f231829D = true;

    /* renamed from: E */
    public boolean f231830E = true;

    /* renamed from: F */
    public boolean f231831F = false;

    /* renamed from: G */
    public boolean f231832G = false;

    /* renamed from: H */
    public int[] f231833H = new int[2];

    /* renamed from: I */
    public final Runnable f231834I = new C78951a();

    /* renamed from: J */
    public final Runnable f231835J = new C78952b();

    /* renamed from: K */
    public int[] f231836K = new int[2];

    /* renamed from: L */
    public C78962l f231837L;

    /* renamed from: M */
    public ArrayList<C78960j> f231838M;

    /* renamed from: a */
    public C78959i f231839a;

    /* renamed from: b */
    public C78959i f231840b;

    /* renamed from: c */
    public C78964n f231841c = new C78964n(this);

    /* renamed from: d */
    public C78961k f231842d;

    /* renamed from: e */
    public Context f231843e;

    /* renamed from: f */
    public View f231844f;

    /* renamed from: g */
    public C78963m f231845g;

    /* renamed from: h */
    public View.OnClickListener f231846h;

    /* renamed from: i */
    public View.OnTouchListener f231847i;

    /* renamed from: j */
    public Spannable f231848j;

    /* renamed from: k */
    public C78253a f231849k;

    /* renamed from: l */
    public int f231850l = 0;

    /* renamed from: m */
    public int f231851m;

    /* renamed from: n */
    public int f231852n;

    /* renamed from: o */
    public int f231853o;

    /* renamed from: p */
    public int f231854p;

    /* renamed from: q */
    public int f231855q;

    /* renamed from: r */
    public C76871c f231856r;

    /* renamed from: s */
    public int f231857s;

    /* renamed from: t */
    public int f231858t;

    /* renamed from: u */
    public View.OnAttachStateChangeListener f231859u;

    /* renamed from: v */
    public ViewTreeObserver.OnScrollChangedListener f231860v;

    /* renamed from: w */
    public ViewTreeObserver.OnPreDrawListener f231861w;

    /* renamed from: x */
    public ViewTreeObserver.OnGlobalLayoutListener f231862x;

    /* renamed from: y */
    public View.OnTouchListener f231863y;

    /* renamed from: z */
    public boolean f231864z = false;

    /* renamed from: xo3.d$a */
    public class C78951a implements Runnable {
        public C78951a() {
        }

        public void run() {
            C78950d dVar = C78950d.this;
            if (dVar.f231864z) {
                C85975v4.m106304a("SelectableTextHelper", "isReInit, return.", new Object[0]);
                return;
            }
            C85975v4.m106304a("SelectableTextHelper", "in mShowSelectViewRunnable. opener: %s, inScrolling: %s.", Boolean.valueOf(dVar.f231830E), Boolean.valueOf(C78950d.this.f231831F));
            C78950d dVar2 = C78950d.this;
            if (dVar2.f231845g == null) {
                if (!dVar2.f231828C) {
                    dVar2.mo108926j();
                }
                C78950d dVar3 = C78950d.this;
                if (!dVar3.f231829D) {
                    dVar3.mo108924h();
                }
            } else if (!dVar2.f231830E) {
                dVar2.f231830E = true;
                if (dVar2.f231831F) {
                    C85975v4.m106304a("SelectableTextHelper", "menu is hide: %s, cursor is hide: %s.", Boolean.valueOf(dVar2.f231828C), Boolean.valueOf(C78950d.this.f231829D));
                    C78950d dVar4 = C78950d.this;
                    if (!dVar4.f231828C) {
                        dVar4.mo108926j();
                    }
                    C78950d dVar5 = C78950d.this;
                    if (!dVar5.f231829D) {
                        dVar5.mo108924h();
                        C78950d dVar6 = C78950d.this;
                        C78964n nVar = dVar6.f231841c;
                        dVar6.mo108923g(nVar.f231899a, nVar.f231900b);
                    }
                    C78950d dVar7 = C78950d.this;
                    C78963m mVar = dVar7.f231845g;
                    if (mVar != null && dVar7.f231828C && !dVar7.f231829D) {
                        mVar.mo103121f(dVar7.f231844f);
                    }
                }
                C78950d.this.f231831F = false;
            } else if (dVar2.f231832G) {
                dVar2.f231832G = false;
                C85975v4.m106304a("SelectableTextHelper", "judge result(delay), click outside.", new Object[0]);
                C78962l lVar = C78950d.this.f231837L;
                if (lVar != null) {
                    lVar.mo103130a();
                }
            } else {
                C85975v4.m106304a("SelectableTextHelper", "Oh, bypass the judge logic! Don't worry, that's reasonable.", new Object[0]);
            }
        }
    }

    /* renamed from: xo3.d$b */
    public class C78952b implements Runnable {
        public C78952b() {
        }

        public void run() {
            C85975v4.m106304a("SelectableTextHelper", "dismiss all runnable.", new Object[0]);
            C78962l lVar = C78950d.this.f231837L;
            if (lVar != null) {
                lVar.mo103130a();
            }
        }
    }

    /* renamed from: xo3.d$c */
    public class C78953c implements View.OnAttachStateChangeListener {
        public C78953c() {
        }

        public void onViewAttachedToWindow(View view) {
            C85975v4.m106304a("SelectableTextHelper", "onViewAttachedToWindow", new Object[0]);
        }

        public void onViewDetachedFromWindow(View view) {
            C85975v4.m106304a("SelectableTextHelper", "onViewDetachedFromWindow", new Object[0]);
            C78950d.this.mo108918b();
        }
    }

    /* renamed from: xo3.d$d */
    public class C78954d implements ViewTreeObserver.OnPreDrawListener {
        public C78954d() {
        }

        public boolean onPreDraw() {
            C78950d dVar = C78950d.this;
            if (!dVar.f231827B) {
                return true;
            }
            dVar.f231827B = false;
            dVar.f231844f.removeCallbacks(dVar.f231834I);
            dVar.f231844f.postDelayed(dVar.f231834I, (long) 100);
            return true;
        }
    }

    /* renamed from: xo3.d$e */
    public class C78955e implements ViewTreeObserver.OnScrollChangedListener {
        public C78955e() {
        }

        public void onScrollChanged() {
            C78950d dVar = C78950d.this;
            if (dVar.f231845g != null) {
                dVar.f231844f.removeCallbacks(dVar.f231835J);
                C78950d dVar2 = C78950d.this;
                dVar2.f231844f.getLocationInWindow(dVar2.f231836K);
                C85975v4.m106304a("SelectableTextHelper", "onScrollChanged, old-y: %d, y: %d.", Integer.valueOf(C78950d.this.f231833H[1]), Integer.valueOf(C78950d.this.f231836K[1]));
                C78950d dVar3 = C78950d.this;
                if (dVar3.f231830E) {
                    if (dVar3.f231831F || dVar3.f231832G) {
                        if (dVar3.f231832G) {
                            dVar3.f231832G = false;
                            dVar3.f231830E = false;
                            if (dVar3.f231833H[1] != dVar3.f231836K[1]) {
                                dVar3.f231831F = true;
                                C85975v4.m106304a("SelectableTextHelper", "judge result(delay), inScrolling.", new Object[0]);
                            } else {
                                dVar3.f231831F = false;
                                C85975v4.m106304a("SelectableTextHelper", "judge result, click outside.", new Object[0]);
                            }
                        }
                    } else if (dVar3.f231833H[1] != dVar3.f231836K[1]) {
                        dVar3.f231831F = true;
                        dVar3.f231830E = false;
                        C85975v4.m106304a("SelectableTextHelper", "judge result, inScrolling.", new Object[0]);
                    } else {
                        dVar3.f231832G = true;
                        C85975v4.m106304a("SelectableTextHelper", "need delay judge.", new Object[0]);
                    }
                }
                C78950d dVar4 = C78950d.this;
                dVar4.f231833H[1] = dVar4.f231836K[1];
            }
            C78950d dVar5 = C78950d.this;
            if (dVar5.f231827B) {
                return;
            }
            if (!dVar5.f231828C || !dVar5.f231829D) {
                dVar5.f231827B = true;
                dVar5.mo108921e();
            }
        }
    }

    /* renamed from: xo3.d$f */
    public class C78956f implements ViewTreeObserver.OnGlobalLayoutListener {
        public C78956f() {
        }

        public void onGlobalLayout() {
            C78963m mVar = C78950d.this.f231845g;
        }
    }

    /* renamed from: xo3.d$g */
    public class C78957g implements View.OnTouchListener {
        public C78957g() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/textview/SelectableTextHelper$7", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            C85975v4.m106304a("SelectableTextHelper", "event pointer count: %d.", Integer.valueOf(motionEvent.getPointerCount()));
            View.OnTouchListener onTouchListener = C78950d.this.f231847i;
            if (onTouchListener != null) {
                onTouchListener.onTouch(view, motionEvent);
            }
            C78950d.this.f231851m = (int) motionEvent.getX();
            C78950d.this.f231852n = (int) motionEvent.getY();
            C117292a.m165362h(false, this, "com/tencent/mm/ui/widget/textview/SelectableTextHelper$7", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: xo3.d$h */
    public static class C78958h {

        /* renamed from: a */
        public View f231872a;

        /* renamed from: b */
        public C78963m f231873b;

        /* renamed from: c */
        public View.OnClickListener f231874c;

        /* renamed from: d */
        public View.OnTouchListener f231875d;

        /* renamed from: e */
        public C78253a f231876e;

        /* renamed from: f */
        public int f231877f = C0966R.color.f3274lt;

        /* renamed from: g */
        public int f231878g = C0966R.color.aak;

        /* renamed from: h */
        public int f231879h = 0;

        /* renamed from: i */
        public int f231880i = 0;

        public C78958h(View view, C78253a aVar, C78963m mVar, View.OnClickListener onClickListener, View.OnTouchListener onTouchListener) {
            this.f231872a = view;
            this.f231876e = aVar;
            this.f231873b = mVar;
            this.f231874c = onClickListener;
            this.f231875d = onTouchListener;
        }
    }

    /* renamed from: xo3.d$i */
    public class C78959i extends View {

        /* renamed from: d */
        public PopupWindow f231881d;

        /* renamed from: e */
        public Paint f231882e;

        /* renamed from: f */
        public int f231883f;

        /* renamed from: g */
        public int f231884g;

        /* renamed from: h */
        public int f231885h;

        /* renamed from: i */
        public int f231886i = 20;

        /* renamed from: j */
        public boolean f231887j;

        /* renamed from: n */
        public int f231888n;

        /* renamed from: o */
        public int f231889o;

        /* renamed from: p */
        public int f231890p;

        /* renamed from: q */
        public int[] f231891q = new int[2];

        /* renamed from: r */
        public Rect f231892r = new Rect();

        /* renamed from: s */
        public Point f231893s = new Point();

        /* renamed from: t */
        public boolean f231894t = false;

        /* renamed from: u */
        public int[] f231895u = new int[2];

        public C78959i(boolean z) {
            super(C78950d.this.f231843e);
            int i = C78950d.this.f231855q / 2;
            this.f231883f = i;
            this.f231884g = i * 2;
            this.f231885h = i * 2;
            this.f231887j = z;
            Paint paint = new Paint(1);
            this.f231882e = paint;
            paint.setColor(C78950d.this.f231843e.getResources().getColor(C78950d.this.f231854p));
            PopupWindow popupWindow = new PopupWindow(this);
            this.f231881d = popupWindow;
            popupWindow.setClippingEnabled(false);
            this.f231881d.setWidth(this.f231884g + (this.f231886i * 3));
            this.f231881d.setHeight(this.f231885h + (this.f231886i * 2));
        }

        /* renamed from: a */
        public int mo108937a() {
            return (this.f231891q[0] - (this.f231886i * 2)) + C78950d.this.f231844f.getPaddingLeft();
        }

        /* renamed from: b */
        public int mo108938b() {
            return this.f231891q[1] + C78950d.this.f231844f.getPaddingTop();
        }

        /* renamed from: c */
        public void mo108939c(int i, int i2) {
            C78950d.this.f231844f.getLocationInWindow(this.f231891q);
            int i3 = this.f231887j ? C78950d.this.f231841c.f231899a : C78950d.this.f231841c.f231900b;
            int a = C78967g.m95468a(C78950d.this.f231844f, i, i2 - this.f231891q[1], i3);
            if (a != i3) {
                C78950d.this.mo108922f();
                boolean z = this.f231887j;
                if (z) {
                    if (a > this.f231890p) {
                        C78950d dVar = C78950d.this;
                        C78959i iVar = dVar.f231839a;
                        if (iVar.f231887j) {
                            iVar = dVar.f231840b;
                        }
                        this.f231887j = !z;
                        invalidate();
                        iVar.f231887j = !iVar.f231887j;
                        iVar.invalidate();
                        int i4 = this.f231890p;
                        this.f231889o = i4;
                        C78950d.this.mo108923g(i4, a);
                        iVar.mo108940d();
                    } else {
                        C78950d.this.mo108923g(a, -1);
                    }
                    mo108940d();
                    return;
                }
                int i5 = this.f231889o;
                if (a < i5) {
                    C78950d dVar2 = C78950d.this;
                    C78959i iVar2 = dVar2.f231839a;
                    if (!iVar2.f231887j) {
                        iVar2 = dVar2.f231840b;
                    }
                    iVar2.f231887j = !iVar2.f231887j;
                    iVar2.invalidate();
                    this.f231887j = !this.f231887j;
                    invalidate();
                    int i6 = this.f231889o;
                    this.f231890p = i6;
                    C78950d.this.mo108923g(a, i6);
                    iVar2.mo108940d();
                } else {
                    C78950d.this.mo108923g(i5, a);
                }
                mo108940d();
            }
        }

        /* renamed from: d */
        public final void mo108940d() {
            C78950d.this.f231844f.getLocationInWindow(this.f231891q);
            TextPaint g = C78967g.m95474g(C78950d.this.f231844f);
            if (g != null) {
                int i = (int) g.getFontMetrics().descent;
                if (this.f231887j) {
                    PopupWindow popupWindow = this.f231881d;
                    C78950d dVar = C78950d.this;
                    int h = (((int) C78967g.m95475h(dVar.f231844f, dVar.f231841c.f231899a)) - this.f231884g) + mo108937a();
                    C78950d dVar2 = C78950d.this;
                    View view = dVar2.f231844f;
                    popupWindow.update(h, C78967g.m95469b(view, C78967g.m95470c(view, dVar2.f231841c.f231899a)) + i + mo108938b(), -1, -1);
                    return;
                }
                C78950d dVar3 = C78950d.this;
                C78950d dVar4 = C78950d.this;
                View view2 = dVar4.f231844f;
                int[] e = mo108941e((int) C78967g.m95475h(dVar3.f231844f, dVar3.f231841c.f231900b), C78967g.m95469b(view2, C78967g.m95470c(view2, dVar4.f231841c.f231900b)) + i);
                this.f231881d.update(e[0] + this.f231886i + mo108937a(), e[1] + mo108938b(), -1, -1);
            }
        }

        /* renamed from: e */
        public final int[] mo108941e(int i, int i2) {
            int[] iArr = new int[2];
            if (i == 0) {
                C78950d dVar = C78950d.this;
                if (dVar.f231841c.f231900b > 1) {
                    dVar.f231844f.getLocationInWindow(this.f231891q);
                    TextPaint g = C78967g.m95474g(C78950d.this.f231844f);
                    if (g != null) {
                        C78950d dVar2 = C78950d.this;
                        int c = C78967g.m95470c(dVar2.f231844f, dVar2.f231841c.f231900b - 1);
                        C78950d dVar3 = C78950d.this;
                        View view = dVar3.f231844f;
                        int f = (int) C78967g.m95473f(C78950d.this.f231844f, c);
                        i2 = ((int) g.getFontMetrics().descent) + C78967g.m95469b(view, C78967g.m95470c(view, dVar3.f231841c.f231900b - 1));
                        i = f;
                    }
                }
            }
            iArr[0] = i;
            iArr[1] = i2;
            return iArr;
        }

        public void onDraw(Canvas canvas) {
            int i;
            int i2;
            C78950d dVar = C78950d.this;
            if (dVar.f231845g != null) {
                int i3 = this.f231887j ? dVar.f231841c.f231899a : dVar.f231841c.f231900b;
                TextPaint g = C78967g.m95474g(dVar.f231844f);
                if (g != null) {
                    View view = C78950d.this.f231844f;
                    i = C78967g.m95469b(view, C78967g.m95470c(view, i3)) + ((int) g.getFontMetrics().descent);
                    i2 = (int) C78967g.m95475h(C78950d.this.f231844f, i3);
                } else {
                    i2 = 0;
                    i = 0;
                }
                C78950d.this.f231844f.getLocationInWindow(this.f231891q);
                if (!this.f231887j) {
                    i = mo108941e(i2, i)[1];
                }
                int b = i + mo108938b();
                if (C78950d.this.f231844f.getGlobalVisibleRect(this.f231892r, this.f231893s)) {
                    Rect rect = this.f231892r;
                    if (b >= rect.bottom) {
                        if (this.f231887j) {
                            C85975v4.m106304a("SelectableTextHelper", "start below bottom, dismiss all.", new Object[0]);
                            C78950d.this.mo108922f();
                            C78950d dVar2 = C78950d.this;
                            dVar2.f231828C = true;
                            dVar2.f231829D = true;
                            dVar2.mo108921e();
                            C78950d.this.f231845g.mo103116a();
                        }
                        C85975v4.m106304a("SelectableTextHelper", "cursor invisible.", new Object[0]);
                        return;
                    } else if (b <= rect.top) {
                        if (!this.f231887j) {
                            C85975v4.m106304a("SelectableTextHelper", "end above top, dismiss all.", new Object[0]);
                            C78950d.this.mo108922f();
                            C78950d dVar3 = C78950d.this;
                            dVar3.f231828C = true;
                            dVar3.f231829D = true;
                            dVar3.mo108921e();
                            C78950d.this.f231845g.mo103116a();
                        }
                        C85975v4.m106304a("SelectableTextHelper", "cursor invisible.", new Object[0]);
                        return;
                    }
                } else {
                    C85975v4.m106304a("SelectableTextHelper", "view invisible.", new Object[0]);
                    return;
                }
            }
            if (this.f231887j) {
                int i4 = this.f231883f;
                canvas.drawCircle((float) ((this.f231886i * 2) + i4), (float) i4, (float) i4, this.f231882e);
                int i5 = this.f231883f;
                int i6 = this.f231886i;
                canvas.drawRect((float) ((i6 * 2) + i5), 0.0f, (float) ((i5 * 2) + (i6 * 2)), (float) i5, this.f231882e);
                return;
            }
            int i7 = this.f231883f;
            canvas.drawCircle((float) (this.f231886i + i7), (float) i7, (float) i7, this.f231882e);
            int i8 = this.f231886i;
            int i9 = this.f231883f;
            canvas.drawRect((float) i8, 0.0f, (float) (i8 + i9), (float) i9, this.f231882e);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
            if (r0 != 3) goto L_0x00dc;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r6) {
            /*
                r5 = this;
                int r0 = r6.getAction()
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L_0x00bb
                if (r0 == r2) goto L_0x0068
                r3 = 2
                if (r0 == r3) goto L_0x0012
                r6 = 3
                if (r0 == r6) goto L_0x0068
                goto L_0x00dc
            L_0x0012:
                xo3.d r0 = xo3.C78950d.this
                xo3.d$m r0 = r0.f231845g
                if (r0 == 0) goto L_0x0022
                r0.mo103119d()
                xo3.d r0 = xo3.C78950d.this
                xo3.d$m r0 = r0.f231845g
                r0.mo103116a()
            L_0x0022:
                xo3.d r0 = xo3.C78950d.this
                r0.mo108920d()
                float r0 = r6.getRawX()
                int r0 = (int) r0
                float r6 = r6.getRawY()
                int r6 = (int) r6
                xo3.d r3 = xo3.C78950d.this
                xo3.d$m r4 = r3.f231845g
                if (r4 != 0) goto L_0x0049
                int[] r4 = r5.f231895u
                r1 = r4[r1]
                int r0 = r0 - r1
                int r1 = r5.f231888n
                int r6 = r6 + r1
                int r1 = r5.f231885h
                int r6 = r6 - r1
                int r1 = r3.f231857s
                int r6 = r6 - r1
                r5.mo108939c(r0, r6)
                goto L_0x005d
            L_0x0049:
                int[] r4 = r5.f231895u
                r1 = r4[r1]
                int r0 = r0 - r1
                int r1 = r5.f231883f
                int r0 = r0 + r1
                int r1 = r5.f231888n
                int r6 = r6 + r1
                int r1 = r5.f231885h
                int r6 = r6 - r1
                int r1 = r3.f231857s
                int r6 = r6 - r1
                r5.mo108939c(r0, r6)
            L_0x005d:
                xo3.d r6 = xo3.C78950d.this
                xo3.d$m r6 = r6.f231845g
                if (r6 == 0) goto L_0x00dc
                r6.mo103120e()
                goto L_0x00dc
            L_0x0068:
                xo3.d r6 = xo3.C78950d.this
                xo3.d$m r0 = r6.f231845g
                if (r0 == 0) goto L_0x00b3
                boolean r3 = r5.f231894t
                if (r3 != 0) goto L_0x00b3
                r5.f231894t = r2
                r0.mo103119d()
                xo3.d r6 = xo3.C78950d.this
                xo3.d$n r0 = r6.f231841c
                int r3 = r0.f231900b
                int r0 = r0.f231899a
                int r3 = r3 - r0
                android.view.View r6 = r6.f231844f
                java.lang.CharSequence r6 = xo3.C78967g.m95477j(r6)
                int r6 = r6.length()
                if (r3 != r6) goto L_0x009d
                xo3.d r6 = xo3.C78950d.this
                xo3.d$m r0 = r6.f231845g
                android.view.View r6 = r6.f231844f
                r0.mo103121f(r6)
                xo3.d r6 = xo3.C78950d.this
                r6.f231828C = r2
                r6.mo108920d()
                goto L_0x00ab
            L_0x009d:
                xo3.d r6 = xo3.C78950d.this
                xo3.d$m r6 = r6.f231845g
                r6.mo103116a()
                xo3.d r6 = xo3.C78950d.this
                r6.f231828C = r1
                r6.mo108926j()
            L_0x00ab:
                xo3.d r6 = xo3.C78950d.this
                xo3.d$m r6 = r6.f231845g
                r6.mo103120e()
                goto L_0x00dc
            L_0x00b3:
                boolean r0 = r6.f231828C
                if (r0 != 0) goto L_0x00dc
                r6.mo108926j()
                goto L_0x00dc
            L_0x00bb:
                xo3.d r0 = xo3.C78950d.this
                xo3.d$n r0 = r0.f231841c
                int r3 = r0.f231899a
                r5.f231889o = r3
                int r0 = r0.f231900b
                r5.f231890p = r0
                r6.getX()
                float r6 = r6.getY()
                int r6 = (int) r6
                r5.f231888n = r6
                r5.f231894t = r1
                xo3.d r6 = xo3.C78950d.this
                android.view.View r6 = r6.f231844f
                int[] r0 = r5.f231895u
                r6.getLocationOnScreen(r0)
            L_0x00dc:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: xo3.C78950d.C78959i.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    /* renamed from: xo3.d$j */
    public class C78960j {

        /* renamed from: a */
        public int f231897a;

        /* renamed from: b */
        public int f231898b;

        public C78960j(C78950d dVar) {
        }

        public String toString() {
            return "start: " + this.f231897a + " end: " + this.f231898b;
        }
    }

    /* renamed from: xo3.d$k */
    public interface C78961k {
        /* renamed from: a */
        void mo102127a(CharSequence charSequence);
    }

    /* renamed from: xo3.d$l */
    public interface C78962l {
        /* renamed from: a */
        void mo103130a();
    }

    /* renamed from: xo3.d$m */
    public static abstract class C78963m {
        /* renamed from: a */
        public abstract void mo103116a();

        /* renamed from: b */
        public void mo103117b() {
        }

        /* renamed from: c */
        public void mo103118c(View view) {
        }

        /* renamed from: d */
        public void mo103119d() {
        }

        /* renamed from: e */
        public void mo103120e() {
        }

        /* renamed from: f */
        public void mo103121f(View view) {
        }
    }

    /* renamed from: xo3.d$n */
    public class C78964n {

        /* renamed from: a */
        public int f231899a;

        /* renamed from: b */
        public int f231900b;

        /* renamed from: c */
        public String f231901c;

        public C78964n(C78950d dVar) {
        }
    }

    public C78950d(C78958h hVar) {
        View view = hVar.f231872a;
        this.f231844f = view;
        this.f231845g = hVar.f231873b;
        this.f231846h = hVar.f231874c;
        this.f231847i = hVar.f231875d;
        this.f231849k = hVar.f231876e;
        this.f231850l = hVar.f231880i;
        this.f231843e = view.getContext();
        this.f231853o = hVar.f231878g;
        this.f231854p = hVar.f231877f;
        View view2 = this.f231844f;
        this.f231857s = view2 instanceof NeatTextView ? ((NeatTextView) view2).getLineHeight() : view2 instanceof TextView ? ((TextView) view2).getLineHeight() : 0;
        if (this.f231855q == 0) {
            View view3 = this.f231844f;
            this.f231855q = (int) (view3 instanceof NeatTextView ? ((NeatTextView) view3).getTextSize() : view3 instanceof TextView ? ((TextView) view3).getTextSize() : 0.0f);
        } else {
            this.f231855q = C74942w4.m89784a(this.f231843e, hVar.f231879h);
        }
        this.f231859u = new C78953c();
        this.f231861w = new C78954d();
        this.f231860v = new C78955e();
        this.f231862x = new C78956f();
        this.f231863y = new C78957g();
        if (!this.f231826A) {
            C85975v4.m106304a("SelectableTextHelper", "not destroy, isReInit: %s.", Boolean.valueOf(this.f231864z));
            this.f231864z = true;
            return;
        }
        C85975v4.m106304a("SelectableTextHelper", "not init yet, need to init.", new Object[0]);
        this.f231864z = false;
        this.f231826A = false;
        this.f231827B = false;
        if (this.f231845g == null) {
            View view4 = this.f231844f;
            CharSequence j = C78967g.m95477j(view4);
            TextView.BufferType bufferType = TextView.BufferType.SPANNABLE;
            if (view4 instanceof NeatTextView) {
                ((NeatTextView) view4).mo104280c(j, bufferType, (Boolean) null);
            } else if (view4 instanceof TextView) {
                ((TextView) view4).setText(j, bufferType);
            }
        }
        C78959i iVar = new C78959i(true);
        this.f231839a = iVar;
        if (this.f231845g != null) {
            iVar.f231881d.setOutsideTouchable(true);
            this.f231839a.f231881d.setTouchInterceptor(new C78965e(this));
            this.f231839a.f231881d.setOnDismissListener(new C78966f(this));
        }
        this.f231840b = new C78959i(false);
        this.f231844f.setOnLongClickListener(new C78947a(this));
        this.f231844f.setOnTouchListener(this.f231863y);
        this.f231844f.setOnClickListener(new C78948b(this));
        this.f231844f.addOnAttachStateChangeListener(this.f231859u);
        this.f231844f.getViewTreeObserver().addOnPreDrawListener(this.f231861w);
        this.f231844f.getViewTreeObserver().addOnScrollChangedListener(this.f231860v);
        this.f231844f.getViewTreeObserver().addOnGlobalLayoutListener(this.f231862x);
        this.f231844f.getViewTreeObserver().addOnGlobalLayoutListener(new C78949c(this));
    }

    /* renamed from: a */
    public final int mo108917a(int i, boolean z) {
        boolean z2;
        ArrayList<C78960j> arrayList = this.f231838M;
        if (arrayList == null) {
            return i;
        }
        Iterator<C78960j> it = arrayList.iterator();
        while (it.hasNext()) {
            C78960j next = it.next();
            int i2 = next.f231897a;
            if (i < i2 || i >= next.f231898b) {
                z2 = false;
                continue;
            } else {
                z2 = true;
                continue;
            }
            if (z2) {
                return z ? i2 : next.f231898b;
            }
        }
        return i;
    }

    /* renamed from: b */
    public void mo108918b() {
        this.f231864z = false;
        this.f231826A = true;
        this.f231827B = false;
        this.f231844f.removeCallbacks(this.f231834I);
        this.f231844f.getViewTreeObserver().removeOnScrollChangedListener(this.f231860v);
        this.f231844f.getViewTreeObserver().removeOnPreDrawListener(this.f231861w);
        this.f231844f.getViewTreeObserver().removeOnGlobalLayoutListener(this.f231862x);
        this.f231844f.removeOnAttachStateChangeListener(this.f231859u);
        this.f231828C = true;
        this.f231829D = true;
        mo108921e();
        mo108922f();
        this.f231839a = null;
        this.f231840b = null;
        C78963m mVar = this.f231845g;
        if (mVar != null) {
            mVar.mo103116a();
        }
    }

    /* renamed from: c */
    public void mo108919c() {
        C78959i iVar = this.f231839a;
        if (iVar != null) {
            iVar.f231881d.dismiss();
        }
        C78959i iVar2 = this.f231840b;
        if (iVar2 != null) {
            iVar2.f231881d.dismiss();
        }
    }

    /* renamed from: d */
    public void mo108920d() {
        C78253a aVar = this.f231849k;
        if (aVar != null) {
            aVar.mo108266a();
        }
    }

    /* renamed from: e */
    public void mo108921e() {
        mo108919c();
        mo108920d();
        C78963m mVar = this.f231845g;
        if (mVar != null) {
            mVar.mo103116a();
        }
    }

    /* renamed from: f */
    public void mo108922f() {
        C76871c cVar;
        this.f231841c.f231901c = null;
        Spannable spannable = this.f231848j;
        if (spannable != null && (cVar = this.f231856r) != null) {
            spannable.removeSpan(cVar);
            this.f231856r = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo108923g(int r5, int r6) {
        /*
            r4 = this;
            r0 = -1
            if (r5 == r0) goto L_0x000c
            xo3.d$n r1 = r4.f231841c
            r2 = 1
            int r5 = r4.mo108917a(r5, r2)
            r1.f231899a = r5
        L_0x000c:
            r5 = 0
            if (r6 == r0) goto L_0x0017
            xo3.d$n r0 = r4.f231841c
            int r6 = r4.mo108917a(r6, r5)
            r0.f231900b = r6
        L_0x0017:
            xo3.d$n r6 = r4.f231841c
            int r6 = r6.f231899a
            if (r6 < 0) goto L_0x00d1
            android.view.View r0 = r4.f231844f
            java.lang.CharSequence r0 = xo3.C78967g.m95477j(r0)
            int r0 = r0.length()
            if (r6 <= r0) goto L_0x002b
            goto L_0x00d1
        L_0x002b:
            xo3.d$n r6 = r4.f231841c
            int r6 = r6.f231900b
            if (r6 < 0) goto L_0x00d1
            android.view.View r0 = r4.f231844f
            java.lang.CharSequence r0 = xo3.C78967g.m95477j(r0)
            int r0 = r0.length()
            if (r6 <= r0) goto L_0x003f
            goto L_0x00d1
        L_0x003f:
            xo3.d$n r6 = r4.f231841c
            int r0 = r6.f231899a
            int r1 = r6.f231900b
            if (r0 <= r1) goto L_0x004b
            r6.f231899a = r1
            r6.f231900b = r0
        L_0x004b:
            android.text.Spannable r0 = r4.f231848j
            if (r0 == 0) goto L_0x00d1
            int r1 = r6.f231899a
            int r2 = r6.f231900b
            java.lang.CharSequence r0 = r0.subSequence(r1, r2)
            java.lang.String r0 = r0.toString()
            r6.f231901c = r0
            nj3.c r6 = r4.f231856r
            if (r6 == 0) goto L_0x006c
            xo3.d$n r0 = r4.f231841c
            int r1 = r0.f231899a
            int r0 = r0.f231900b
            r6.f224701f = r1
            r6.f224702g = r0
            goto L_0x0087
        L_0x006c:
            nj3.c r6 = new nj3.c
            android.view.View r0 = r4.f231844f
            android.content.Context r1 = r4.f231843e
            android.content.res.Resources r1 = r1.getResources()
            int r2 = r4.f231853o
            int r1 = r1.getColor(r2)
            xo3.d$n r2 = r4.f231841c
            int r3 = r2.f231899a
            int r2 = r2.f231900b
            r6.<init>(r0, r1, r3, r2)
            r4.f231856r = r6
        L_0x0087:
            android.view.View r6 = r4.f231844f
            xo3.d$n r0 = r4.f231841c
            int r0 = r0.f231899a
            int r6 = xo3.C78967g.m95470c(r6, r0)
            android.view.View r0 = r4.f231844f
            boolean r1 = r0 instanceof com.tencent.neattextview.textview.view.NeatTextView
            if (r1 == 0) goto L_0x00a4
            com.tencent.neattextview.textview.view.NeatTextView r0 = (com.tencent.neattextview.textview.view.NeatTextView) r0
            yr3.a r0 = r0.getLayout()
            if (r0 == 0) goto L_0x00b5
            int r6 = r0.mo109122b(r6)
            goto L_0x00b6
        L_0x00a4:
            boolean r1 = r0 instanceof android.widget.TextView
            if (r1 == 0) goto L_0x00b5
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.text.Layout r0 = r0.getLayout()
            if (r0 == 0) goto L_0x00b5
            int r6 = r0.getLineStart(r6)
            goto L_0x00b6
        L_0x00b5:
            r6 = 0
        L_0x00b6:
            if (r6 < 0) goto L_0x00b9
            r5 = r6
        L_0x00b9:
            android.text.Spannable r6 = r4.f231848j
            nj3.c r0 = r4.f231856r
            xo3.d$n r1 = r4.f231841c
            int r1 = r1.f231900b
            r2 = 17
            r6.setSpan(r0, r5, r1, r2)
            xo3.d$k r5 = r4.f231842d
            if (r5 == 0) goto L_0x00d1
            xo3.d$n r6 = r4.f231841c
            java.lang.String r6 = r6.f231901c
            r5.mo102127a(r6)
        L_0x00d1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xo3.C78950d.mo108923g(int, int):void");
    }

    /* renamed from: h */
    public void mo108924h() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f231843e.getSystemService("accessibility");
        if (!(accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled())) {
            mo108925i(this.f231839a);
            mo108925i(this.f231840b);
        }
    }

    /* renamed from: i */
    public final void mo108925i(C78959i iVar) {
        int i;
        int i2;
        if (iVar != null) {
            int i3 = iVar.f231887j ? this.f231841c.f231899a : this.f231841c.f231900b;
            if (i3 >= 0 && i3 <= C78967g.m95477j(this.f231844f).length()) {
                TextPaint g = C78967g.m95474g(this.f231844f);
                if (g != null) {
                    View view = this.f231844f;
                    i = C78967g.m95469b(view, C78967g.m95470c(view, i3)) + ((int) g.getFontMetrics().descent);
                    i2 = (int) C78967g.m95475h(this.f231844f, i3);
                } else {
                    i2 = 0;
                    i = 0;
                }
                C78950d.this.f231844f.getLocationInWindow(iVar.f231891q);
                boolean z = iVar.f231887j;
                int i4 = z ? iVar.f231884g : 0;
                if (!z) {
                    int[] e = iVar.mo108941e(i2, i);
                    int i5 = e[0] + iVar.f231886i;
                    i = e[1];
                    i2 = i5;
                }
                try {
                    iVar.f231881d.showAtLocation(C78950d.this.f231844f, 0, (i2 - i4) + iVar.mo108937a(), i + iVar.mo108938b());
                } catch (Exception e2) {
                    C85975v4.m106305b("SelectableTextHelper", "error! message: %s.", e2.getMessage());
                }
            }
        }
    }

    /* renamed from: j */
    public void mo108926j() {
        if (this.f231849k != null) {
            int[] iArr = new int[2];
            this.f231844f.getLocationInWindow(iArr);
            float h = C78967g.m95475h(this.f231844f, this.f231841c.f231899a);
            float h2 = C78967g.m95475h(this.f231844f, this.f231841c.f231900b);
            if (C78967g.m95470c(this.f231844f, this.f231841c.f231900b) > C78967g.m95470c(this.f231844f, this.f231841c.f231899a) || h2 <= h) {
                View view = this.f231844f;
                h2 = C78967g.m95473f(view, C78967g.m95470c(view, this.f231841c.f231899a));
            }
            int i = ((int) ((h + h2) / 2.0f)) + this.f231850l;
            View view2 = this.f231844f;
            int e = C78967g.m95472e(view2, C78967g.m95470c(view2, this.f231841c.f231899a)) + iArr[1] + this.f231843e.getResources().getDimensionPixelSize(C0966R.dimen.a28);
            C85975v4.m106304a("SelectableTextHelper", "dancy test posX:%s, startline:%s, endline:%s, leftpadding:%s", Integer.valueOf(i), Integer.valueOf(C78967g.m95470c(this.f231844f, this.f231841c.f231899a)), Integer.valueOf(C78967g.m95470c(this.f231844f, this.f231841c.f231900b)), Integer.valueOf(this.f231850l));
            if (i <= 0) {
                i = 16;
            }
            if (e < 0) {
                e = 16;
            }
            if (i > C78967g.m95476i(this.f231843e)) {
                i = C78967g.m95476i(this.f231843e) - 16;
            }
            this.f231849k.mo71743n(i, e);
        }
        C78963m mVar = this.f231845g;
        if (mVar != null) {
            mVar.mo103117b();
        }
    }

    /* renamed from: k */
    public void mo108927k() {
        C78963m mVar = this.f231845g;
        if (mVar != null) {
            mVar.mo103121f(this.f231844f);
        }
    }

    /* renamed from: l */
    public final void mo108928l(int i, int i2) {
        mo108922f();
        if (C78967g.m95477j(this.f231844f) instanceof Spannable) {
            this.f231848j = (Spannable) C78967g.m95477j(this.f231844f);
        }
        if (this.f231848j == null || i >= C78967g.m95477j(this.f231844f).length()) {
            C78964n nVar = this.f231841c;
            nVar.f231899a = 0;
            nVar.f231900b = 0;
            return;
        }
        mo108923g(i, i2);
    }
}
