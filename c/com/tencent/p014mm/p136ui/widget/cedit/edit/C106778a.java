package com.tencent.p014mm.p136ui.widget.cedit.edit;

import android.animation.ValueAnimator;
import android.content.ClipData;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.text.Layout;
import android.text.ParcelableSpan;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.text.method.PasswordTransformationMethod;
import android.text.style.SuggestionSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputMethodManager;
import android.widget.Magnifier;
import android.widget.PopupWindow;
import androidx.core.widget.C103729f;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.widget.cedit.edit.CustomTextView;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import ko3.C109030d;
import lo3.C109405a;
import no3.C109754a;
import oo3.C110057b;

/* renamed from: com.tencent.mm.ui.widget.cedit.edit.a */
public class C106778a {

    /* renamed from: A */
    public boolean f319363A;

    /* renamed from: B */
    public boolean f319364B;

    /* renamed from: C */
    public boolean f319365C;

    /* renamed from: D */
    public C106800c f319366D;

    /* renamed from: E */
    public boolean f319367E;

    /* renamed from: F */
    public Drawable f319368F = null;

    /* renamed from: G */
    public Drawable f319369G;

    /* renamed from: H */
    public Drawable f319370H;

    /* renamed from: I */
    public Drawable f319371I;

    /* renamed from: J */
    public C106794n f319372J;

    /* renamed from: K */
    public ActionMode.Callback f319373K;

    /* renamed from: L */
    public ActionMode.Callback f319374L;

    /* renamed from: M */
    public boolean f319375M;

    /* renamed from: N */
    public int f319376N;

    /* renamed from: O */
    public final C109030d f319377O = new C109030d();

    /* renamed from: P */
    public Runnable f319378P;

    /* renamed from: Q */
    public C110057b f319379Q;

    /* renamed from: R */
    public C110057b f319380R;

    /* renamed from: S */
    public boolean f319381S;

    /* renamed from: T */
    public Rect f319382T;

    /* renamed from: U */
    public final CustomTextView f319383U;

    /* renamed from: V */
    public final Runnable f319384V;

    /* renamed from: W */
    public boolean f319385W;

    /* renamed from: X */
    public int f319386X;

    /* renamed from: Y */
    public int f319387Y;

    /* renamed from: Z */
    public C109405a f319388Z;

    /* renamed from: a */
    public C106791l f319389a;

    /* renamed from: a0 */
    public boolean f319390a0;

    /* renamed from: b */
    public C106796p f319391b;

    /* renamed from: c */
    public ActionMode f319392c;

    /* renamed from: d */
    public boolean f319393d;

    /* renamed from: e */
    public boolean f319394e;

    /* renamed from: f */
    public C106793m f319395f;

    /* renamed from: g */
    public final Runnable f319396g = new C106779a();

    /* renamed from: h */
    public final ViewTreeObserver.OnDrawListener f319397h = new C106780b();

    /* renamed from: i */
    public C106783e f319398i;

    /* renamed from: j */
    public C106787i f319399j;

    /* renamed from: k */
    public C106788j f319400k;

    /* renamed from: l */
    public boolean f319401l;

    /* renamed from: m */
    public boolean f319402m;

    /* renamed from: n */
    public boolean f319403n;

    /* renamed from: o */
    public KeyListener f319404o;

    /* renamed from: p */
    public int f319405p = 0;

    /* renamed from: q */
    public boolean f319406q;

    /* renamed from: r */
    public boolean f319407r;

    /* renamed from: s */
    public long f319408s;

    /* renamed from: t */
    public boolean f319409t;

    /* renamed from: u */
    public C106782d f319410u;

    /* renamed from: v */
    public boolean f319411v = true;

    /* renamed from: w */
    public boolean f319412w;

    /* renamed from: x */
    public boolean f319413x;

    /* renamed from: y */
    public boolean f319414y;

    /* renamed from: z */
    public boolean f319415z = true;

    /* renamed from: com.tencent.mm.ui.widget.cedit.edit.a$a */
    public class C106779a implements Runnable {
        public C106779a() {
        }

        public void run() {
            C106793m.m144327a(C106778a.this.f319395f);
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.cedit.edit.a$b */
    public class C106780b implements ViewTreeObserver.OnDrawListener {
        public C106780b() {
        }

        public void onDraw() {
            C106778a aVar = C106778a.this;
            if (aVar.f319395f != null) {
                aVar.f319383U.post(aVar.f319396g);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.cedit.edit.a$c */
    public class C106781c implements Runnable {
        public C106781c() {
        }

        public void run() {
            C106778a aVar = C106778a.this;
            if (aVar.f319390a0) {
                aVar.mo154293I();
            }
            ActionMode actionMode = C106778a.this.f319392c;
            if (actionMode != null && Build.VERSION.SDK_INT >= 23) {
                actionMode.hide(0);
                Log.m105924i("cmEdit.Editor", "mTextActionMode.hide(0)");
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.cedit.edit.a$d */
    public class C106782d implements Runnable {

        /* renamed from: d */
        public boolean f319419d;

        public C106782d(C106779a aVar) {
        }

        public void run() {
            if (!this.f319419d) {
                C106778a.this.f319383U.removeCallbacks(this);
                if (C106778a.this.mo154292H()) {
                    if (C106778a.this.f319383U.getLayout() != null) {
                        C106778a.this.f319383U.mo153980O();
                    }
                    C106778a.this.f319383U.postDelayed(this, 500);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.cedit.edit.a$e */
    public class C106783e {

        /* renamed from: a */
        public final Path f319421a = new Path();

        /* renamed from: b */
        public final Paint f319422b;

        /* renamed from: c */
        public int f319423c;

        /* renamed from: d */
        public int f319424d;

        /* renamed from: e */
        public long f319425e;

        /* renamed from: f */
        public RectF f319426f;

        public C106783e() {
            Paint paint = new Paint(1);
            this.f319422b = paint;
            paint.setStyle(Paint.Style.FILL);
        }

        /* renamed from: a */
        public final void mo154326a(boolean z) {
            if (C106778a.this.f319383U.getLayout() != null) {
                if (this.f319426f == null) {
                    this.f319426f = new RectF();
                }
                this.f319421a.computeBounds(this.f319426f, false);
                int compoundPaddingLeft = C106778a.this.f319383U.getCompoundPaddingLeft();
                int extendedPaddingTop = C106778a.this.f319383U.getExtendedPaddingTop() + C106778a.this.f319383U.mo153977K(true);
                if (z) {
                    CustomTextView customTextView = C106778a.this.f319383U;
                    RectF rectF = this.f319426f;
                    customTextView.postInvalidateOnAnimation(((int) rectF.left) + compoundPaddingLeft, ((int) rectF.top) + extendedPaddingTop, compoundPaddingLeft + ((int) rectF.right), extendedPaddingTop + ((int) rectF.bottom));
                    return;
                }
                CustomTextView customTextView2 = C106778a.this.f319383U;
                RectF rectF2 = this.f319426f;
                customTextView2.postInvalidate((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.cedit.edit.a$f */
    public interface C106784f extends ViewTreeObserver.OnTouchModeChangeListener {
        /* renamed from: a */
        boolean mo154327a();

        /* renamed from: d */
        boolean mo154328d();

        void show();
    }

    /* renamed from: com.tencent.mm.ui.widget.cedit.edit.a$g */
    public static class C106785g {
    }

    /* renamed from: com.tencent.mm.ui.widget.cedit.edit.a$h */
    public abstract class C106786h extends View implements C106798r {

        /* renamed from: A */
        public boolean f319428A = true;

        /* renamed from: B */
        public int f319429B;

        /* renamed from: C */
        public int f319430C = -1;

        /* renamed from: D */
        public int f319431D = -1;

        /* renamed from: E */
        public float f319432E = -1.0f;

        /* renamed from: F */
        public float f319433F;

        /* renamed from: G */
        public float f319434G;

        /* renamed from: H */
        public final int f319435H;

        /* renamed from: I */
        public final long[] f319436I = new long[5];

        /* renamed from: J */
        public final int[] f319437J = new int[5];

        /* renamed from: K */
        public int f319438K = 0;

        /* renamed from: L */
        public int f319439L = 0;

        /* renamed from: d */
        public Drawable f319441d;

        /* renamed from: e */
        public Drawable f319442e;

        /* renamed from: f */
        public Drawable f319443f;

        /* renamed from: g */
        public final PopupWindow f319444g;

        /* renamed from: h */
        public int f319445h;

        /* renamed from: i */
        public int f319446i;

        /* renamed from: j */
        public int f319447j;

        /* renamed from: n */
        public int f319448n;

        /* renamed from: o */
        public boolean f319449o;

        /* renamed from: p */
        public float f319450p;

        /* renamed from: q */
        public float f319451q;

        /* renamed from: r */
        public int f319452r;

        /* renamed from: s */
        public int f319453s;

        /* renamed from: t */
        public float f319454t;

        /* renamed from: u */
        public final float f319455u;

        /* renamed from: v */
        public int f319456v;

        /* renamed from: w */
        public int f319457w;

        /* renamed from: x */
        public int f319458x;

        /* renamed from: y */
        public int f319459y;

        /* renamed from: z */
        public int f319460z = -1;

        public C106786h(Drawable drawable, Drawable drawable2, int i, C106779a aVar) {
            super(C106778a.this.f319383U.getContext());
            C74942w4.m89784a(getContext(), 18);
            setId(i);
            PopupWindow popupWindow = new PopupWindow(C106778a.this.f319383U.getContext(), (AttributeSet) null, C0966R.style.f8693rd);
            this.f319444g = popupWindow;
            popupWindow.setSplitTouchEnabled(true);
            popupWindow.setClippingEnabled(false);
            C103729f.m138094b(popupWindow, 1002);
            popupWindow.setWidth(-2);
            popupWindow.setHeight(-2);
            popupWindow.setContentView(this);
            this.f319442e = drawable;
            this.f319443f = drawable2;
            mo154357p(true);
            this.f319429B = C106778a.this.f319383U.getContext().getResources().getDimensionPixelSize(C0966R.dimen.aqm);
            float preferredHeight = (float) getPreferredHeight();
            float f = -0.3f * preferredHeight;
            this.f319454t = f;
            float f2 = preferredHeight * 0.7f;
            this.f319455u = f2;
            this.f319435H = (int) (f2 - f);
        }

        private int getDrawHeight() {
            return this.f319441d.getIntrinsicHeight();
        }

        private int getDrawWidth() {
            return this.f319441d.getIntrinsicWidth();
        }

        private int getHorizontalOffset() {
            int preferredWidth = getPreferredWidth();
            int drawWidth = getDrawWidth();
            int i = this.f319453s;
            if (i != 3) {
                return i != 5 ? (preferredWidth - drawWidth) / 2 : preferredWidth - drawWidth;
            }
            return 0;
        }

        private C106786h getOtherSelectionHandle() {
            C106796p q = C106778a.this.mo154312q();
            if (q == null || !q.mo154327a()) {
                return null;
            }
            C106795o oVar = q.f319516d;
            return oVar != this ? oVar : q.f319517e;
        }

        private void setVisible(boolean z) {
            View contentView = this.f319444g.getContentView();
            int i = z ? 0 : 4;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view = contentView;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/widget/cedit/edit/Editor$HandleView", "setVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            contentView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/widget/cedit/edit/Editor$HandleView", "setVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0048, code lost:
            if (r2.f319471c > 0) goto L_0x004f;
         */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0051  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0053  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo154330a(int r4, int r5, boolean r6, boolean r7) {
            /*
                r3 = this;
                int r0 = r3.getCurrentCursorOffset()
                r1 = 0
                r3.mo154351n(r0, r7, r1)
                if (r6 != 0) goto L_0x000e
                boolean r6 = r3.f319428A
                if (r6 == 0) goto L_0x0093
            L_0x000e:
                boolean r6 = r3.f319449o
                if (r6 == 0) goto L_0x0033
                int r6 = r3.f319456v
                if (r4 != r6) goto L_0x001a
                int r7 = r3.f319457w
                if (r5 == r7) goto L_0x0030
            L_0x001a:
                float r7 = r3.f319450p
                int r6 = r4 - r6
                float r6 = (float) r6
                float r7 = r7 + r6
                r3.f319450p = r7
                float r6 = r3.f319451q
                int r7 = r3.f319457w
                int r7 = r5 - r7
                float r7 = (float) r7
                float r6 = r6 + r7
                r3.f319451q = r6
                r3.f319456v = r4
                r3.f319457w = r5
            L_0x0030:
                r3.mo154350m()
            L_0x0033:
                boolean r6 = r3.f319449o
                r7 = 1
                if (r6 == 0) goto L_0x0039
                goto L_0x0065
            L_0x0039:
                com.tencent.mm.ui.widget.cedit.edit.a r6 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.CustomTextView r6 = r6.f319383U
                com.tencent.mm.ui.widget.cedit.edit.a r0 = r6.f319246B1
                if (r0 != 0) goto L_0x0042
                goto L_0x004b
            L_0x0042:
                com.tencent.mm.ui.widget.cedit.edit.a$j r2 = r0.f319400k
                if (r2 == 0) goto L_0x004d
                int r0 = r2.f319471c
                if (r0 <= 0) goto L_0x004b
                goto L_0x004f
            L_0x004b:
                r7 = 0
                goto L_0x004f
            L_0x004d:
                boolean r7 = r0.f319414y
            L_0x004f:
                if (r7 == 0) goto L_0x0053
                r7 = 0
                goto L_0x0065
            L_0x0053:
                int r7 = r3.f319445h
                int r0 = r3.f319452r
                int r7 = r7 + r0
                int r0 = r3.getHorizontalOffset()
                int r7 = r7 + r0
                float r7 = (float) r7
                int r0 = r3.f319446i
                float r0 = (float) r0
                boolean r7 = r6.mo153983S(r7, r0)
            L_0x0065:
                if (r7 == 0) goto L_0x0088
                int r6 = r3.f319445h
                int r4 = r4 + r6
                int r6 = r3.f319446i
                int r5 = r5 + r6
                r3.f319447j = r4
                r3.f319448n = r5
                boolean r6 = r3.mo154348k()
                if (r6 == 0) goto L_0x007e
                android.widget.PopupWindow r6 = r3.f319444g
                r7 = -1
                r6.update(r4, r5, r7, r7)
                goto L_0x0091
            L_0x007e:
                android.widget.PopupWindow r6 = r3.f319444g
                com.tencent.mm.ui.widget.cedit.edit.a r7 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.CustomTextView r7 = r7.f319383U
                r6.showAtLocation(r7, r1, r4, r5)
                goto L_0x0091
            L_0x0088:
                boolean r4 = r3.mo154348k()
                if (r4 == 0) goto L_0x0091
                r3.mo154331b()
            L_0x0091:
                r3.f319428A = r1
            L_0x0093:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.C106786h.mo154330a(int, int, boolean, boolean):void");
        }

        /* renamed from: b */
        public void mo154331b() {
            this.f319449o = false;
            this.f319444g.dismiss();
            mo154349l();
        }

        /* renamed from: c */
        public final void mo154332c() {
            C106793m mVar = C106778a.this.f319395f;
            if (mVar != null) {
                C106793m.m144328b(mVar);
                C106778a aVar = C106778a.this;
                aVar.f319409t = false;
                C106782d dVar = aVar.f319410u;
                if (dVar != null) {
                    dVar.f319419d = false;
                    aVar.mo154321z();
                }
                setVisible(true);
                C106786h otherSelectionHandle = getOtherSelectionHandle();
                if (otherSelectionHandle != null) {
                    otherSelectionHandle.setVisible(true);
                }
            }
        }

        /* renamed from: d */
        public int mo154333d(Layout layout, int i) {
            return (int) (mo154334e(layout, i) - 0.5f);
        }

        /* renamed from: e */
        public float mo154334e(Layout layout, int i) {
            return layout.getPrimaryHorizontal(i);
        }

        /* renamed from: f */
        public abstract int mo154335f(boolean z);

        /* renamed from: g */
        public abstract int mo154336g(Drawable drawable, boolean z);

        public abstract int getCurrentCursorOffset();

        public int getCursorOffset() {
            return 0;
        }

        public final int getIdealFingerToCursorOffset() {
            return this.f319435H;
        }

        public float getIdealVerticalOffset() {
            return this.f319455u;
        }

        public abstract int getMagnifierHandleTrigger();

        public final int getPreferredHeight() {
            return Math.max(getDrawWidth(), this.f319429B);
        }

        public final int getPreferredWidth() {
            return Math.max(getDrawWidth(), this.f319429B);
        }

        /* renamed from: h */
        public final boolean mo154344h(C106786h hVar, Rect rect) {
            PopupWindow popupWindow = hVar.f319444g;
            int i = this.f319447j;
            return Rect.intersects(new Rect(i, this.f319448n, popupWindow.getContentView().getWidth() + i, this.f319448n + popupWindow.getContentView().getHeight()), rect);
        }

        /* renamed from: i */
        public void mo154345i() {
            mo154331b();
            C106778a.this.mo154310o().mo154368b(this);
        }

        public void invalidate() {
            super.invalidate();
            if (mo154348k()) {
                mo154351n(getCurrentCursorOffset(), true, false);
            }
        }

        /* renamed from: j */
        public boolean mo154347j(Layout layout, int i) {
            return layout.isRtlCharAt(i);
        }

        /* renamed from: k */
        public boolean mo154348k() {
            return this.f319444g.isShowing();
        }

        /* renamed from: l */
        public void mo154349l() {
        }

        /* renamed from: m */
        public void mo154350m() {
        }

        /* renamed from: n */
        public void mo154351n(int i, boolean z, boolean z2) {
            if (C106778a.this.f319383U.getLayout() == null) {
                C106778a.this.mo154288C();
                return;
            }
            Layout layout = C106778a.this.f319383U.getLayout();
            boolean z3 = i != this.f319460z;
            if (z3 || z) {
                if (z3) {
                    mo154360s(i);
                    if (z2) {
                        C106778a.this.getClass();
                    }
                    int i2 = (this.f319438K + 1) % 5;
                    this.f319438K = i2;
                    this.f319437J[i2] = i;
                    this.f319436I[i2] = SystemClock.uptimeMillis();
                    this.f319439L++;
                }
                int lineForOffset = layout.getLineForOffset(i);
                this.f319430C = lineForOffset;
                this.f319445h = ((mo154333d(layout, i) - this.f319452r) - getHorizontalOffset()) + getCursorOffset();
                this.f319446i = layout.getLineBottom(lineForOffset);
                int i3 = this.f319445h;
                CustomTextView customTextView = C106778a.this.f319383U;
                this.f319445h = i3 + (customTextView.getCompoundPaddingLeft() - customTextView.getScrollX());
                this.f319446i += C106778a.this.f319383U.mo154268x0();
                this.f319460z = i;
                this.f319428A = true;
            }
        }

        /* renamed from: o */
        public void mo154352o() {
            if (!mo154348k()) {
                C106778a.this.mo154310o().mo154367a(this, true);
                this.f319460z = -1;
                mo154351n(getCurrentCursorOffset(), false, false);
            }
        }

        public void onDraw(Canvas canvas) {
            int drawWidth = getDrawWidth();
            int drawHeight = getDrawHeight();
            int horizontalOffset = getHorizontalOffset();
            this.f319441d.setBounds(horizontalOffset, 0, drawWidth + horizontalOffset, drawHeight);
            this.f319441d.draw(canvas);
        }

        public void onMeasure(int i, int i2) {
            setMeasuredDimension(getPreferredWidth(), getPreferredHeight());
        }

        public void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            if (Build.VERSION.SDK_INT >= 29) {
                setSystemGestureExclusionRects(Collections.singletonList(new Rect(0, 0, i, i2)));
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0042, code lost:
            if (r0 != 3) goto L_0x013e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
            if (r1 != 3) goto L_0x0034;
         */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x003c  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00e3  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r14) {
            /*
                r13 = this;
                com.tencent.mm.ui.widget.cedit.edit.a r0 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                r0.getClass()
                int r1 = r14.getActionMasked()
                r2 = 3
                r3 = -1
                r4 = 2
                r5 = 1
                if (r1 == r5) goto L_0x0018
                if (r1 == r4) goto L_0x0014
                if (r1 == r2) goto L_0x0018
                goto L_0x0034
            L_0x0014:
                r0.mo154314s(r3)
                goto L_0x0034
            L_0x0018:
                int r1 = android.view.ViewConfiguration.getDoubleTapTimeout()
                com.tencent.mm.ui.widget.cedit.edit.CustomTextView r6 = r0.f319383U
                java.lang.Runnable r7 = r0.f319384V
                long r8 = (long) r1
                r6.postDelayed(r7, r8)
                com.tencent.mm.ui.widget.cedit.edit.c r0 = r0.mo154311p()
                r0.getClass()
                com.tencent.mm.ui.widget.cedit.edit.a r0 = r0.f319534a
                android.view.ActionMode r0 = r0.f319392c
                if (r0 == 0) goto L_0x0034
                r0.invalidate()
            L_0x0034:
                int r0 = r14.getActionMasked()
                r1 = 5
                r6 = 0
                if (r0 == 0) goto L_0x00e3
                r3 = 4098(0x1002, float:5.743E-42)
                if (r0 == r5) goto L_0x00a0
                if (r0 == r4) goto L_0x0046
                if (r0 == r2) goto L_0x00dd
                goto L_0x013e
            L_0x0046:
                float r0 = r14.getRawX()
                int r1 = r13.f319458x
                float r1 = (float) r1
                float r0 = r0 - r1
                int r1 = r13.f319456v
                float r1 = (float) r1
                float r0 = r0 + r1
                float r1 = r14.getRawY()
                int r2 = r13.f319459y
                float r2 = (float) r2
                float r1 = r1 - r2
                int r2 = r13.f319457w
                float r2 = (float) r2
                float r1 = r1 + r2
                float r4 = r13.f319451q
                float r4 = r4 - r2
                int r6 = r13.f319446i
                float r6 = (float) r6
                float r6 = r1 - r6
                float r6 = r6 - r2
                float r2 = r13.f319455u
                int r7 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r7 >= 0) goto L_0x0076
                float r2 = java.lang.Math.min(r6, r2)
                float r2 = java.lang.Math.max(r2, r4)
                goto L_0x007e
            L_0x0076:
                float r2 = java.lang.Math.max(r6, r2)
                float r2 = java.lang.Math.min(r2, r4)
            L_0x007e:
                int r4 = r13.f319457w
                float r4 = (float) r4
                float r2 = r2 + r4
                r13.f319451q = r2
                float r2 = r13.f319450p
                float r0 = r0 - r2
                int r2 = r13.f319452r
                float r2 = (float) r2
                float r0 = r0 + r2
                int r2 = r13.getHorizontalOffset()
                float r2 = (float) r2
                float r0 = r0 + r2
                float r2 = r13.f319451q
                float r1 = r1 - r2
                float r2 = r13.f319454t
                float r1 = r1 + r2
                boolean r14 = r14.isFromSource(r3)
                r13.mo154359r(r0, r1, r14)
                goto L_0x013e
            L_0x00a0:
                boolean r14 = r14.isFromSource(r3)
                long r2 = android.os.SystemClock.uptimeMillis()
                int r0 = r13.f319438K
                int r4 = r13.f319439L
                int r4 = java.lang.Math.min(r4, r1)
                r7 = 0
            L_0x00b1:
                if (r7 >= r4) goto L_0x00c7
                long[] r8 = r13.f319436I
                r9 = r8[r0]
                long r8 = r2 - r9
                r10 = 150(0x96, double:7.4E-322)
                int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r12 >= 0) goto L_0x00c7
                int r7 = r7 + 1
                int r0 = r13.f319438K
                int r0 = r0 - r7
                int r0 = r0 + r1
                int r0 = r0 % r1
                goto L_0x00b1
            L_0x00c7:
                if (r7 <= 0) goto L_0x00dd
                if (r7 >= r4) goto L_0x00dd
                long[] r1 = r13.f319436I
                r7 = r1[r0]
                long r2 = r2 - r7
                r7 = 350(0x15e, double:1.73E-321)
                int r1 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r1 <= 0) goto L_0x00dd
                int[] r1 = r13.f319437J
                r0 = r1[r0]
                r13.mo154351n(r0, r6, r14)
            L_0x00dd:
                r13.f319449o = r6
                r13.mo154357p(r6)
                goto L_0x013e
            L_0x00e3:
                int r0 = r13.getCurrentCursorOffset()
                r13.f319439L = r6
                int r2 = r13.f319438K
                int r2 = r2 + r5
                int r2 = r2 % r1
                r13.f319438K = r2
                int[] r1 = r13.f319437J
                r1[r2] = r0
                long[] r0 = r13.f319436I
                long r6 = android.os.SystemClock.uptimeMillis()
                r0[r2] = r6
                int r0 = r13.f319439L
                int r0 = r0 + r5
                r13.f319439L = r0
                com.tencent.mm.ui.widget.cedit.edit.a r0 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.a$n r0 = r0.mo154310o()
                int r1 = r0.f319500g
                r13.f319456v = r1
                int r1 = r0.f319501h
                r13.f319457w = r1
                int r1 = r0.f319502i
                r13.f319458x = r1
                int r0 = r0.f319503j
                r13.f319459y = r0
                float r0 = r14.getRawX()
                int r1 = r13.f319458x
                float r1 = (float) r1
                float r0 = r0 - r1
                int r1 = r13.f319456v
                float r1 = (float) r1
                float r0 = r0 + r1
                float r14 = r14.getRawY()
                int r1 = r13.f319459y
                float r1 = (float) r1
                float r14 = r14 - r1
                int r1 = r13.f319457w
                float r1 = (float) r1
                float r14 = r14 + r1
                int r1 = r13.f319445h
                float r1 = (float) r1
                float r0 = r0 - r1
                r13.f319450p = r0
                int r0 = r13.f319446i
                float r0 = (float) r0
                float r14 = r14 - r0
                r13.f319451q = r14
                r13.f319449o = r5
                r13.f319431D = r3
            L_0x013e:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.C106786h.onTouchEvent(android.view.MotionEvent):boolean");
        }

        /* renamed from: p */
        public void mo154357p(boolean z) {
            Layout layout;
            if ((z || !this.f319449o) && (layout = C106778a.this.f319383U.getLayout()) != null) {
                int currentCursorOffset = getCurrentCursorOffset();
                boolean j = mo154347j(layout, currentCursorOffset);
                Drawable drawable = this.f319441d;
                Drawable drawable2 = j ? this.f319443f : this.f319442e;
                this.f319441d = drawable2;
                this.f319452r = mo154336g(drawable2, j);
                this.f319453s = mo154335f(j);
                if (drawable != this.f319441d && mo154348k()) {
                    int d = ((mo154333d(layout, currentCursorOffset) - this.f319452r) - getHorizontalOffset()) + getCursorOffset();
                    this.f319445h = d;
                    CustomTextView customTextView = C106778a.this.f319383U;
                    this.f319445h = d + (customTextView.getCompoundPaddingLeft() - customTextView.getScrollX());
                    this.f319428A = true;
                    mo154330a(this.f319456v, this.f319457w, false, false);
                    postInvalidate();
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: android.graphics.Point} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: android.graphics.Point} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: android.graphics.Point} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v70, resolved type: android.graphics.Point} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v71, resolved type: android.graphics.Point} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:101:0x028d  */
        /* JADX WARNING: Removed duplicated region for block: B:104:0x0292  */
        /* JADX WARNING: Removed duplicated region for block: B:149:0x0383  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x009e  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x011f  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x01af  */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x01d3  */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x01fd  */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x021b  */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x022e  */
        /* JADX WARNING: Removed duplicated region for block: B:99:0x028a  */
        /* renamed from: q */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo154358q(android.view.MotionEvent r18) {
            /*
                r17 = this;
                r0 = r17
                com.tencent.mm.ui.widget.cedit.edit.a r1 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.a$m r1 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.m144251a(r1)
                if (r1 != 0) goto L_0x000b
                return
            L_0x000b:
                android.graphics.PointF r1 = new android.graphics.PointF
                r1.<init>()
                com.tencent.mm.ui.widget.cedit.edit.a r2 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.a$m r3 = r2.f319395f
                boolean r3 = r3.f319490c
                r4 = 0
                r5 = 1
                r6 = 0
                if (r3 == 0) goto L_0x001d
                goto L_0x0097
            L_0x001d:
                com.tencent.mm.ui.widget.cedit.edit.CustomTextView r2 = r2.f319383U
                float r2 = r2.getRotation()
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 != 0) goto L_0x0099
                com.tencent.mm.ui.widget.cedit.edit.a r2 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.CustomTextView r2 = r2.f319383U
                float r2 = r2.getRotationX()
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 != 0) goto L_0x0099
                com.tencent.mm.ui.widget.cedit.edit.a r2 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.CustomTextView r2 = r2.f319383U
                float r2 = r2.getRotationY()
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 == 0) goto L_0x0040
                goto L_0x0099
            L_0x0040:
                com.tencent.mm.ui.widget.cedit.edit.a r2 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.CustomTextView r2 = r2.f319383U
                float r2 = r2.getScaleX()
                r0.f319433F = r2
                com.tencent.mm.ui.widget.cedit.edit.a r2 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.CustomTextView r2 = r2.f319383U
                float r2 = r2.getScaleY()
                r0.f319434G = r2
                com.tencent.mm.ui.widget.cedit.edit.a r2 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.CustomTextView r2 = r2.f319383U
                android.view.ViewParent r2 = r2.getParent()
            L_0x005c:
                if (r2 == 0) goto L_0x0097
                boolean r3 = r2 instanceof android.view.View
                if (r3 == 0) goto L_0x0092
                r3 = r2
                android.view.View r3 = (android.view.View) r3
                float r7 = r3.getRotation()
                int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
                if (r7 != 0) goto L_0x0099
                float r7 = r3.getRotationX()
                int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
                if (r7 != 0) goto L_0x0099
                float r7 = r3.getRotationY()
                int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
                if (r7 == 0) goto L_0x007e
                goto L_0x0099
            L_0x007e:
                float r7 = r0.f319433F
                float r8 = r3.getScaleX()
                float r7 = r7 * r8
                r0.f319433F = r7
                float r7 = r0.f319434G
                float r3 = r3.getScaleY()
                float r7 = r7 * r3
                r0.f319434G = r7
            L_0x0092:
                android.view.ViewParent r2 = r2.getParent()
                goto L_0x005c
            L_0x0097:
                r2 = 1
                goto L_0x009a
            L_0x0099:
                r2 = 0
            L_0x009a:
                r3 = 28
                if (r2 == 0) goto L_0x028f
                com.tencent.mm.ui.widget.cedit.edit.a r2 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                r2.getClass()
                int r2 = android.os.Build.VERSION.SDK_INT
                if (r2 < r3) goto L_0x00c3
                com.tencent.mm.ui.widget.cedit.edit.a r7 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.a$m r7 = r7.f319395f
                android.widget.Magnifier r7 = r7.f319488a
                int r7 = r7.getHeight()
                float r7 = (float) r7
                com.tencent.mm.ui.widget.cedit.edit.a r8 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.a$m r8 = r8.f319395f
                android.widget.Magnifier r8 = r8.f319488a
                float r8 = r8.getZoom()
                float r7 = r7 / r8
                int r7 = java.lang.Math.round(r7)
                float r7 = (float) r7
                goto L_0x00c4
            L_0x00c3:
                r7 = 0
            L_0x00c4:
                com.tencent.mm.ui.widget.cedit.edit.a r8 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.CustomTextView r8 = r8.f319383U
                android.text.TextPaint r8 = r8.getPaint()
                android.graphics.Paint$FontMetrics r8 = r8.getFontMetrics()
                float r9 = r8.descent
                float r8 = r8.ascent
                float r9 = r9 - r8
                float r8 = r0.f319434G
                float r9 = r9 * r8
                int r7 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                if (r7 <= 0) goto L_0x00df
                r7 = 1
                goto L_0x00e0
            L_0x00df:
                r7 = 0
            L_0x00e0:
                if (r7 != 0) goto L_0x028f
                int r7 = r17.getMagnifierHandleTrigger()
                r8 = 2
                r9 = -1
                if (r7 == 0) goto L_0x0112
                if (r7 == r5) goto L_0x0101
                if (r7 == r8) goto L_0x00f0
                r10 = -1
                goto L_0x011a
            L_0x00f0:
                com.tencent.mm.ui.widget.cedit.edit.a r10 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.CustomTextView r10 = r10.f319383U
                int r10 = r10.getSelectionEnd()
                com.tencent.mm.ui.widget.cedit.edit.a r11 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.CustomTextView r11 = r11.f319383U
                int r11 = r11.getSelectionStart()
                goto L_0x011b
            L_0x0101:
                com.tencent.mm.ui.widget.cedit.edit.a r10 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.CustomTextView r10 = r10.f319383U
                int r10 = r10.getSelectionStart()
                com.tencent.mm.ui.widget.cedit.edit.a r11 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.CustomTextView r11 = r11.f319383U
                int r11 = r11.getSelectionEnd()
                goto L_0x011b
            L_0x0112:
                com.tencent.mm.ui.widget.cedit.edit.a r10 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.CustomTextView r10 = r10.f319383U
                int r10 = r10.getSelectionStart()
            L_0x011a:
                r11 = -1
            L_0x011b:
                if (r10 != r9) goto L_0x011f
                goto L_0x028b
            L_0x011f:
                int r12 = r18.getActionMasked()
                if (r12 != 0) goto L_0x012c
                float r12 = r18.getRawX()
                r0.f319432E = r12
                goto L_0x0136
            L_0x012c:
                int r12 = r18.getActionMasked()
                if (r12 != r5) goto L_0x0136
                r12 = -1082130432(0xffffffffbf800000, float:-1.0)
                r0.f319432E = r12
            L_0x0136:
                com.tencent.mm.ui.widget.cedit.edit.a r12 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.CustomTextView r12 = r12.f319383U
                android.text.Layout r12 = r12.getLayout()
                int r13 = r12.getLineForOffset(r10)
                if (r11 == r9) goto L_0x014c
                int r9 = r12.getLineForOffset(r11)
                if (r13 != r9) goto L_0x014c
                r9 = 1
                goto L_0x014d
            L_0x014c:
                r9 = 0
            L_0x014d:
                if (r9 == 0) goto L_0x0177
                if (r10 >= r11) goto L_0x0153
                r12 = 1
                goto L_0x0154
            L_0x0153:
                r12 = 0
            L_0x0154:
                com.tencent.mm.ui.widget.cedit.edit.a r14 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.CustomTextView r14 = r14.f319383U
                android.text.Layout r14 = r14.getLayout()
                float r10 = r0.mo154334e(r14, r10)
                com.tencent.mm.ui.widget.cedit.edit.a r14 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.CustomTextView r14 = r14.f319383U
                android.text.Layout r14 = r14.getLayout()
                float r14 = r0.mo154334e(r14, r11)
                int r10 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
                if (r10 >= 0) goto L_0x0172
                r10 = 1
                goto L_0x0173
            L_0x0172:
                r10 = 0
            L_0x0173:
                if (r12 == r10) goto L_0x0177
                r10 = 1
                goto L_0x0178
            L_0x0177:
                r10 = 0
            L_0x0178:
                int[] r12 = new int[r8]
                com.tencent.mm.ui.widget.cedit.edit.a r14 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.CustomTextView r14 = r14.f319383U
                r14.getLocationOnScreen(r12)
                float r14 = r18.getRawX()
                r15 = r12[r6]
                float r15 = (float) r15
                float r14 = r14 - r15
                com.tencent.mm.ui.widget.cedit.edit.a r15 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.CustomTextView r15 = r15.f319383U
                int r15 = r15.getTotalPaddingLeft()
                com.tencent.mm.ui.widget.cedit.edit.a r4 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.CustomTextView r4 = r4.f319383U
                int r4 = r4.getScrollX()
                int r15 = r15 - r4
                float r4 = (float) r15
                com.tencent.mm.ui.widget.cedit.edit.a r15 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.CustomTextView r15 = r15.f319383U
                int r15 = r15.getTotalPaddingLeft()
                com.tencent.mm.ui.widget.cedit.edit.a r6 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.CustomTextView r6 = r6.f319383U
                int r6 = r6.getScrollX()
                int r15 = r15 - r6
                float r6 = (float) r15
                if (r9 == 0) goto L_0x01c4
                if (r7 != r8) goto L_0x01b3
                r8 = 1
                goto L_0x01b4
            L_0x01b3:
                r8 = 0
            L_0x01b4:
                r8 = r8 ^ r10
                if (r8 == 0) goto L_0x01c4
                com.tencent.mm.ui.widget.cedit.edit.a r8 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.CustomTextView r8 = r8.f319383U
                android.text.Layout r8 = r8.getLayout()
                float r8 = r0.mo154334e(r8, r11)
                goto L_0x01d0
            L_0x01c4:
                com.tencent.mm.ui.widget.cedit.edit.a r8 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.CustomTextView r8 = r8.f319383U
                android.text.Layout r8 = r8.getLayout()
                float r8 = r8.getLineLeft(r13)
            L_0x01d0:
                float r4 = r4 + r8
                if (r9 == 0) goto L_0x01e8
                if (r7 != r5) goto L_0x01d7
                r7 = 1
                goto L_0x01d8
            L_0x01d7:
                r7 = 0
            L_0x01d8:
                r7 = r7 ^ r10
                if (r7 == 0) goto L_0x01e8
                com.tencent.mm.ui.widget.cedit.edit.a r7 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.CustomTextView r7 = r7.f319383U
                android.text.Layout r7 = r7.getLayout()
                float r7 = r0.mo154334e(r7, r11)
                goto L_0x01f4
            L_0x01e8:
                com.tencent.mm.ui.widget.cedit.edit.a r7 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.CustomTextView r7 = r7.f319383U
                android.text.Layout r7 = r7.getLayout()
                float r7 = r7.getLineRight(r13)
            L_0x01f4:
                float r6 = r6 + r7
                float r7 = r0.f319433F
                float r4 = r4 * r7
                float r6 = r6 * r7
                if (r2 < r3) goto L_0x021b
                com.tencent.mm.ui.widget.cedit.edit.a r2 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.a$m r2 = r2.f319395f
                android.widget.Magnifier r2 = r2.f319488a
                int r2 = r2.getWidth()
                float r2 = (float) r2
                com.tencent.mm.ui.widget.cedit.edit.a r7 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.a$m r7 = r7.f319395f
                android.widget.Magnifier r7 = r7.f319488a
                float r7 = r7.getZoom()
                float r2 = r2 / r7
                int r2 = java.lang.Math.round(r2)
                float r2 = (float) r2
                r16 = r2
                goto L_0x021d
            L_0x021b:
                r16 = 0
            L_0x021d:
                r2 = 1073741824(0x40000000, float:2.0)
                float r16 = r16 / r2
                float r7 = r4 - r16
                int r7 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
                if (r7 < 0) goto L_0x028a
                float r16 = r16 + r6
                int r7 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
                if (r7 <= 0) goto L_0x022e
                goto L_0x028a
            L_0x022e:
                float r7 = r0.f319433F
                r8 = 1065353216(0x3f800000, float:1.0)
                int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
                if (r7 != 0) goto L_0x0237
                goto L_0x0249
            L_0x0237:
                float r7 = r18.getRawX()
                float r8 = r0.f319432E
                float r7 = r7 - r8
                float r9 = r0.f319433F
                float r7 = r7 * r9
                float r7 = r7 + r8
                r8 = 0
                r9 = r12[r8]
                float r8 = (float) r9
                float r14 = r7 - r8
            L_0x0249:
                float r6 = java.lang.Math.min(r6, r14)
                float r4 = java.lang.Math.max(r4, r6)
                r1.x = r4
                com.tencent.mm.ui.widget.cedit.edit.a r4 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.CustomTextView r4 = r4.f319383U
                android.text.Layout r4 = r4.getLayout()
                int r4 = r4.getLineTop(r13)
                com.tencent.mm.ui.widget.cedit.edit.a r6 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.CustomTextView r6 = r6.f319383U
                android.text.Layout r6 = r6.getLayout()
                int r6 = r6.getLineBottom(r13)
                int r4 = r4 + r6
                float r4 = (float) r4
                float r4 = r4 / r2
                com.tencent.mm.ui.widget.cedit.edit.a r2 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.CustomTextView r2 = r2.f319383U
                int r2 = r2.getTotalPaddingTop()
                float r2 = (float) r2
                float r4 = r4 + r2
                com.tencent.mm.ui.widget.cedit.edit.a r2 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.CustomTextView r2 = r2.f319383U
                int r2 = r2.getScrollY()
                float r2 = (float) r2
                float r4 = r4 - r2
                float r2 = r0.f319434G
                float r4 = r4 * r2
                r1.y = r4
                r6 = 1
                goto L_0x028b
            L_0x028a:
                r6 = 0
            L_0x028b:
                if (r6 == 0) goto L_0x028f
                r2 = 1
                goto L_0x0290
            L_0x028f:
                r2 = 0
            L_0x0290:
                if (r2 == 0) goto L_0x0383
                com.tencent.mm.ui.widget.cedit.edit.a r2 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                r2.f319409t = r5
                com.tencent.mm.ui.widget.cedit.edit.CustomTextView r2 = r2.f319383U
                r2.mo153980O()
                com.tencent.mm.ui.widget.cedit.edit.a r2 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.a$d r2 = r2.f319410u
                if (r2 == 0) goto L_0x02ae
                boolean r4 = r2.f319419d
                if (r4 != 0) goto L_0x02ae
                com.tencent.mm.ui.widget.cedit.edit.a r4 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.CustomTextView r4 = r4.f319383U
                r4.removeCallbacks(r2)
                r2.f319419d = r5
            L_0x02ae:
                com.tencent.mm.ui.widget.cedit.edit.a r2 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.a$m r2 = r2.f319395f
                float r4 = r1.x
                float r1 = r1.y
                boolean r6 = r2.f319490c
                if (r6 == 0) goto L_0x02c2
                float r6 = r2.f319496i
                int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
                if (r6 == 0) goto L_0x02c2
                r6 = 1
                goto L_0x02c3
            L_0x02c2:
                r6 = 0
            L_0x02c3:
                if (r6 == 0) goto L_0x02e9
                android.animation.ValueAnimator r6 = r2.f319489b
                boolean r6 = r6.isRunning()
                if (r6 == 0) goto L_0x02db
                android.animation.ValueAnimator r6 = r2.f319489b
                r6.cancel()
                float r6 = r2.f319493f
                r2.f319491d = r6
                float r6 = r2.f319494g
                r2.f319492e = r6
                goto L_0x02e3
            L_0x02db:
                float r6 = r2.f319495h
                r2.f319491d = r6
                float r6 = r2.f319496i
                r2.f319492e = r6
            L_0x02e3:
                android.animation.ValueAnimator r6 = r2.f319489b
                r6.start()
                goto L_0x02fa
            L_0x02e9:
                android.animation.ValueAnimator r6 = r2.f319489b
                boolean r6 = r6.isRunning()
                if (r6 != 0) goto L_0x02fa
                int r6 = android.os.Build.VERSION.SDK_INT
                if (r6 < r3) goto L_0x02fa
                android.widget.Magnifier r6 = r2.f319488a
                r6.show(r4, r1)
            L_0x02fa:
                r2.f319495h = r4
                r2.f319496i = r1
                r2.f319490c = r5
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 0
                r4 = 29
                if (r1 < r4) goto L_0x0312
                com.tencent.mm.ui.widget.cedit.edit.a r2 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.a$m r2 = r2.f319395f
                android.widget.Magnifier r2 = r2.f319488a
                android.graphics.Point r2 = r2.getPosition()
                goto L_0x0346
            L_0x0312:
                if (r1 != r3) goto L_0x0346
                com.tencent.mm.ui.widget.cedit.edit.a r4 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.a$m r4 = r4.f319395f
                android.widget.Magnifier r4 = r4.f319488a
                java.lang.String r6 = "getWindowCoords"
                r7 = 0
                java.lang.Class[] r8 = new java.lang.Class[r7]
                java.lang.Class r7 = r4.getClass()
                r9 = r2
            L_0x0324:
                java.lang.Class<java.lang.Object> r10 = java.lang.Object.class
                if (r7 == r10) goto L_0x0331
                java.lang.reflect.Method r9 = r7.getDeclaredMethod(r6, r8)     // Catch:{ all -> 0x032c }
            L_0x032c:
                java.lang.Class r7 = r7.getSuperclass()
                goto L_0x0324
            L_0x0331:
                if (r9 != 0) goto L_0x033a
                java.lang.Throwable r6 = new java.lang.Throwable
                java.lang.String r7 = "MB getWindowCoords"
                r6.<init>(r7)
            L_0x033a:
                r6 = 0
                java.lang.Object[] r6 = new java.lang.Object[r6]
                r9.setAccessible(r5)     // Catch:{ all -> 0x0344 }
                java.lang.Object r2 = r9.invoke(r4, r6)     // Catch:{ all -> 0x0344 }
            L_0x0344:
                android.graphics.Point r2 = (android.graphics.Point) r2
            L_0x0346:
                if (r2 != 0) goto L_0x0349
                goto L_0x0386
            L_0x0349:
                if (r1 < r3) goto L_0x0386
                android.graphics.Rect r1 = new android.graphics.Rect
                int r3 = r2.x
                int r4 = r2.y
                com.tencent.mm.ui.widget.cedit.edit.a r6 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.a$m r6 = r6.f319395f
                android.widget.Magnifier r6 = r6.f319488a
                int r6 = r6.getWidth()
                int r6 = r6 + r3
                int r2 = r2.y
                com.tencent.mm.ui.widget.cedit.edit.a r7 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.a$m r7 = r7.f319395f
                android.widget.Magnifier r7 = r7.f319488a
                int r7 = r7.getHeight()
                int r2 = r2 + r7
                r1.<init>(r3, r4, r6, r2)
                boolean r2 = r0.mo154344h(r0, r1)
                r2 = r2 ^ r5
                r0.setVisible(r2)
                com.tencent.mm.ui.widget.cedit.edit.a$h r2 = r17.getOtherSelectionHandle()
                if (r2 == 0) goto L_0x0386
                boolean r1 = r0.mo154344h(r2, r1)
                r1 = r1 ^ r5
                r2.setVisible(r1)
                goto L_0x0386
            L_0x0383:
                r17.mo154332c()
            L_0x0386:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.C106786h.mo154358q(android.view.MotionEvent):void");
        }

        /* renamed from: r */
        public abstract void mo154359r(float f, float f2, boolean z);

        /* renamed from: s */
        public abstract void mo154360s(int i);

        public void setTargetWidth(int i) {
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.cedit.edit.a$i */
    public static class C106787i {

        /* renamed from: a */
        public int f319461a = 0;

        /* renamed from: b */
        public String f319462b;

        /* renamed from: c */
        public CharSequence f319463c;

        /* renamed from: d */
        public int f319464d;

        /* renamed from: e */
        public Bundle f319465e;

        /* renamed from: f */
        public CustomTextView.C74978g f319466f;

        /* renamed from: g */
        public boolean f319467g;

        /* renamed from: h */
        public LocaleList f319468h;
    }

    /* renamed from: com.tencent.mm.ui.widget.cedit.edit.a$j */
    public static class C106788j {

        /* renamed from: a */
        public ExtractedTextRequest f319469a;

        /* renamed from: b */
        public final ExtractedText f319470b = new ExtractedText();

        /* renamed from: c */
        public int f319471c;

        /* renamed from: d */
        public boolean f319472d;

        /* renamed from: e */
        public boolean f319473e;

        /* renamed from: f */
        public boolean f319474f;

        /* renamed from: g */
        public int f319475g;

        /* renamed from: h */
        public int f319476h;

        /* renamed from: i */
        public int f319477i;
    }

    /* renamed from: com.tencent.mm.ui.widget.cedit.edit.a$k */
    public class C106789k extends C106786h {

        /* renamed from: N */
        public float f319478N;

        /* renamed from: P */
        public float f319479P;

        /* renamed from: Q */
        public Runnable f319480Q;

        /* renamed from: R */
        public boolean f319481R = false;

        /* renamed from: S */
        public final int f319482S = 255;

        /* renamed from: com.tencent.mm.ui.widget.cedit.edit.a$k$a */
        public class C106790a implements Runnable {
            public C106790a() {
            }

            public void run() {
                C106789k.this.mo154345i();
            }
        }

        public C106789k(Drawable drawable) {
            super(drawable, drawable, C0966R.C0970id.f358459f81, (C106779a) null);
        }

        /* renamed from: b */
        public void mo154331b() {
            super.mo154331b();
            this.f319481R = false;
        }

        /* renamed from: d */
        public int mo154333d(Layout layout, int i) {
            if (C106778a.this.f319368F == null) {
                return super.mo154333d(layout, i);
            }
            float primaryHorizontal = layout.getPrimaryHorizontal(i);
            C106778a aVar = C106778a.this;
            return aVar.mo154299d(aVar.f319368F, primaryHorizontal) + C106778a.this.f319382T.left;
        }

        /* renamed from: f */
        public int mo154335f(boolean z) {
            return 1;
        }

        /* renamed from: g */
        public int mo154336g(Drawable drawable, boolean z) {
            return drawable.getIntrinsicWidth() / 2;
        }

        public int getCurrentCursorOffset() {
            return C106778a.this.f319383U.getSelectionStart();
        }

        public int getCursorOffset() {
            int cursorOffset = super.getCursorOffset();
            C106778a aVar = C106778a.this;
            Drawable drawable = aVar.f319368F;
            if (drawable == null) {
                return cursorOffset;
            }
            drawable.getPadding(aVar.f319382T);
            int intrinsicWidth = C106778a.this.f319368F.getIntrinsicWidth();
            Rect rect = C106778a.this.f319382T;
            return cursorOffset + (((intrinsicWidth - rect.left) - rect.right) / 2);
        }

        public int getMagnifierHandleTrigger() {
            return 0;
        }

        /* renamed from: k */
        public boolean mo154348k() {
            if (this.f319481R) {
                return false;
            }
            return super.mo154348k();
        }

        /* renamed from: l */
        public void mo154349l() {
            Runnable runnable = this.f319480Q;
            if (runnable != null) {
                C106778a.this.f319383U.removeCallbacks(runnable);
            }
        }

        /* renamed from: m */
        public void mo154350m() {
            Runnable runnable = this.f319480Q;
            if (runnable != null) {
                C106778a.this.f319383U.removeCallbacks(runnable);
            }
        }

        /* renamed from: o */
        public void mo154352o() {
            super.mo154352o();
            this.f319481R = false;
            this.f319441d.setAlpha(this.f319482S);
        }

        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
            if (r0 != 3) goto L_0x0082;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r6) {
            /*
                r5 = this;
                com.tencent.mm.ui.widget.cedit.edit.a r0 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.CustomTextView r0 = r0.f319383U
                r1 = 1
                boolean r0 = r0.mo153981P(r6, r1)
                if (r0 != 0) goto L_0x000c
                return r1
            L_0x000c:
                super.onTouchEvent(r6)
                int r0 = r6.getActionMasked()
                if (r0 == 0) goto L_0x0073
                if (r0 == r1) goto L_0x0022
                r2 = 2
                if (r0 == r2) goto L_0x001e
                r6 = 3
                if (r0 == r6) goto L_0x006c
                goto L_0x0082
            L_0x001e:
                r5.mo154358q(r6)
                goto L_0x0082
            L_0x0022:
                int r0 = r5.f319439L
                if (r0 <= r1) goto L_0x0028
                r0 = 1
                goto L_0x0029
            L_0x0028:
                r0 = 0
            L_0x0029:
                if (r0 != 0) goto L_0x005d
                com.tencent.mm.ui.widget.cedit.edit.a r0 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.CustomTextView r0 = r0.f319383U
                android.content.Context r0 = r0.getContext()
                android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
                float r2 = r5.f319478N
                float r3 = r5.f319479P
                float r4 = r6.getRawX()
                float r6 = r6.getRawY()
                int r0 = r0.getScaledTouchSlop()
                boolean r6 = ko3.C109030d.m148003a(r2, r3, r4, r6, r0)
                if (r6 == 0) goto L_0x006c
                com.tencent.mm.ui.widget.cedit.edit.a r6 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                boolean r0 = r6.mo154317v()
                if (r0 != 0) goto L_0x0059
                r6.mo154297M()
                goto L_0x006c
            L_0x0059:
                r6.mo154295K()
                goto L_0x006c
            L_0x005d:
                com.tencent.mm.ui.widget.cedit.edit.a r6 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                android.view.ActionMode r6 = r6.f319392c
                if (r6 == 0) goto L_0x006c
                int r0 = android.os.Build.VERSION.SDK_INT
                r2 = 23
                if (r0 < r2) goto L_0x006c
                r6.invalidateContentRect()
            L_0x006c:
                r5.mo154362t()
                r5.mo154332c()
                goto L_0x0082
            L_0x0073:
                float r0 = r6.getRawX()
                r5.f319478N = r0
                float r0 = r6.getRawY()
                r5.f319479P = r0
                r5.mo154358q(r6)
            L_0x0082:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.C106789k.onTouchEvent(android.view.MotionEvent):boolean");
        }

        /* renamed from: p */
        public void mo154357p(boolean z) {
            super.mo154357p(z);
            this.f319441d.setAlpha(this.f319482S);
        }

        /* renamed from: r */
        public void mo154359r(float f, float f2, boolean z) {
            Layout layout = C106778a.this.f319383U.getLayout();
            int i = -1;
            if (layout != null) {
                if (this.f319431D == -1) {
                    this.f319431D = C106778a.this.f319383U.mo153975I(f2);
                }
                int j = C106778a.this.mo154305j(layout, this.f319431D, f2);
                CustomTextView customTextView = C106778a.this.f319383U;
                i = customTextView.getLayout().getOffsetForHorizontal(j, customTextView.mo153969B(f));
                this.f319431D = j;
            }
            mo154351n(i, false, z);
            ActionMode actionMode = C106778a.this.f319392c;
            if (actionMode != null && actionMode != null) {
                actionMode.invalidate();
            }
        }

        /* renamed from: s */
        public void mo154360s(int i) {
            Selection.setSelection((Spannable) C106778a.this.f319383U.getText(), i);
        }

        /* renamed from: t */
        public final void mo154362t() {
            Runnable runnable = this.f319480Q;
            if (runnable == null) {
                this.f319480Q = new C106790a();
            } else if (runnable != null) {
                C106778a.this.f319383U.removeCallbacks(runnable);
            }
            C106778a.this.f319383U.postDelayed(this.f319480Q, 4000);
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.cedit.edit.a$l */
    public class C106791l implements C106784f {

        /* renamed from: d */
        public C106789k f319485d;

        /* renamed from: com.tencent.mm.ui.widget.cedit.edit.a$l$a */
        public class C106792a implements Runnable {
            public C106792a() {
            }

            public void run() {
                C106778a.this.mo154295K();
            }
        }

        public C106791l() {
        }

        /* renamed from: a */
        public boolean mo154327a() {
            C106789k kVar = this.f319485d;
            return kVar != null && kVar.mo154348k();
        }

        /* renamed from: b */
        public C106789k mo154364b() {
            if (this.f319485d == null) {
                C106778a.this.mo154320y(false);
                C106778a aVar = C106778a.this;
                this.f319485d = new C106789k(aVar.f319371I);
            }
            return this.f319485d;
        }

        /* renamed from: d */
        public boolean mo154328d() {
            C106789k kVar = this.f319485d;
            return kVar != null && kVar.f319449o;
        }

        public void onTouchModeChanged(boolean z) {
            C106789k kVar;
            if (!z && (kVar = this.f319485d) != null) {
                kVar.mo154345i();
            }
        }

        public void show() {
            mo154364b().mo154352o();
            long uptimeMillis = SystemClock.uptimeMillis();
            float[] fArr = CustomTextView.f319236J1;
            long j = uptimeMillis - 0;
            C106778a aVar = C106778a.this;
            boolean z = false;
            if (aVar.f319378P != null) {
                int i = aVar.f319377O.f326538e;
                if ((i == 2 || i == 3) || aVar.mo154318w()) {
                    C106778a aVar2 = C106778a.this;
                    aVar2.f319383U.removeCallbacks(aVar2.f319378P);
                }
            }
            C106778a aVar3 = C106778a.this;
            int i2 = aVar3.f319377O.f326538e;
            if (i2 == 2 || i2 == 3) {
                z = true;
            }
            if (!z && !aVar3.mo154318w() && j < 15000 && C106778a.this.mo154317v()) {
                C106778a aVar4 = C106778a.this;
                if (aVar4.f319378P == null) {
                    aVar4.f319378P = new C106792a();
                }
                aVar4.f319383U.postDelayed(aVar4.f319378P, (long) (ViewConfiguration.getDoubleTapTimeout() + 1));
            }
            mo154364b().mo154362t();
            C106796p pVar = C106778a.this.f319391b;
            if (pVar != null) {
                pVar.mo154375c();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.cedit.edit.a$m */
    public static class C106793m {

        /* renamed from: a */
        public final Magnifier f319488a;

        /* renamed from: b */
        public final ValueAnimator f319489b;

        /* renamed from: c */
        public boolean f319490c;

        /* renamed from: d */
        public float f319491d;

        /* renamed from: e */
        public float f319492e;

        /* renamed from: f */
        public float f319493f;

        /* renamed from: g */
        public float f319494g;

        /* renamed from: h */
        public float f319495h;

        /* renamed from: i */
        public float f319496i;

        public C106793m(Magnifier magnifier, C106779a aVar) {
            this.f319488a = magnifier;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            this.f319489b = ofFloat;
            ofFloat.setDuration(100);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.addUpdateListener(new C106799b(this));
        }

        /* renamed from: a */
        public static void m144327a(C106793m mVar) {
            if (Build.VERSION.SDK_INT >= 28) {
                mVar.f319488a.update();
            } else {
                mVar.getClass();
            }
        }

        /* renamed from: b */
        public static void m144328b(C106793m mVar) {
            if (Build.VERSION.SDK_INT >= 28) {
                mVar.f319488a.dismiss();
            }
            mVar.f319489b.cancel();
            mVar.f319490c = false;
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.cedit.edit.a$n */
    public class C106794n implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: d */
        public C106798r[] f319497d = new C106798r[7];

        /* renamed from: e */
        public boolean[] f319498e = new boolean[7];

        /* renamed from: f */
        public boolean f319499f = true;

        /* renamed from: g */
        public int f319500g;

        /* renamed from: h */
        public int f319501h;

        /* renamed from: i */
        public int f319502i;

        /* renamed from: j */
        public int f319503j;

        /* renamed from: n */
        public int f319504n;

        /* renamed from: o */
        public boolean f319505o;

        /* renamed from: p */
        public final int[] f319506p = new int[2];

        public C106794n(C106779a aVar) {
        }

        /* renamed from: a */
        public void mo154367a(C106798r rVar, boolean z) {
            if (this.f319504n == 0) {
                mo154369c();
                C106778a.this.f319383U.getViewTreeObserver().addOnPreDrawListener(this);
            }
            int i = -1;
            int i2 = 0;
            while (i2 < 7) {
                C106798r rVar2 = this.f319497d[i2];
                if (rVar2 != rVar) {
                    if (i < 0 && rVar2 == null) {
                        i = i2;
                    }
                    i2++;
                } else {
                    return;
                }
            }
            this.f319497d[i] = rVar;
            this.f319498e[i] = z;
            this.f319504n++;
        }

        /* renamed from: b */
        public void mo154368b(C106798r rVar) {
            int i = 0;
            while (true) {
                if (i >= 7) {
                    break;
                }
                C106798r[] rVarArr = this.f319497d;
                if (rVarArr[i] == rVar) {
                    rVarArr[i] = null;
                    this.f319504n--;
                    break;
                }
                i++;
            }
            if (this.f319504n == 0) {
                C106778a.this.f319383U.getViewTreeObserver().removeOnPreDrawListener(this);
            }
        }

        /* renamed from: c */
        public final void mo154369c() {
            C106778a.this.f319383U.getLocationInWindow(this.f319506p);
            int[] iArr = this.f319506p;
            int i = iArr[0];
            this.f319499f = (i == this.f319500g && iArr[1] == this.f319501h) ? false : true;
            this.f319500g = i;
            this.f319501h = iArr[1];
            C106778a.this.f319383U.getLocationOnScreen(iArr);
            int[] iArr2 = this.f319506p;
            this.f319502i = iArr2[0];
            this.f319503j = iArr2[1];
        }

        public boolean onPreDraw() {
            C106798r rVar;
            mo154369c();
            for (int i = 0; i < 7; i++) {
                boolean z = this.f319499f;
                if ((z || this.f319505o || this.f319498e[i]) && (rVar = this.f319497d[i]) != null) {
                    rVar.mo154330a(this.f319500g, this.f319501h, z, this.f319505o);
                }
            }
            this.f319505o = false;
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.cedit.edit.a$o */
    public final class C106795o extends C106786h {

        /* renamed from: N */
        public final int f319508N;

        /* renamed from: P */
        public boolean f319509P = false;

        /* renamed from: Q */
        public float f319510Q;

        /* renamed from: R */
        public float f319511R;

        /* renamed from: S */
        public boolean f319512S = false;

        /* renamed from: T */
        public final float f319513T;

        /* renamed from: U */
        public final int[] f319514U = new int[2];

        public C106795o(Drawable drawable, Drawable drawable2, int i, int i2) {
            super(drawable, drawable2, i, (C106779a) null);
            this.f319508N = i2;
            this.f319513T = (float) (ViewConfiguration.get(C106778a.this.f319383U.getContext()).getScaledTouchSlop() * 4);
        }

        /* renamed from: e */
        public float mo154334e(Layout layout, int i) {
            return mo154371t(layout, i, mo154372u());
        }

        /* renamed from: f */
        public int mo154335f(boolean z) {
            return z == mo154372u() ? 3 : 5;
        }

        /* renamed from: g */
        public int mo154336g(Drawable drawable, boolean z) {
            return z == mo154372u() ? drawable.getIntrinsicWidth() / 4 : (drawable.getIntrinsicWidth() * 3) / 4;
        }

        public int getCurrentCursorOffset() {
            return mo154372u() ? C106778a.this.f319383U.getSelectionStart() : C106778a.this.f319383U.getSelectionEnd();
        }

        public int getMagnifierHandleTrigger() {
            return mo154372u() ? 1 : 2;
        }

        /* renamed from: j */
        public boolean mo154347j(Layout layout, int i) {
            if (!mo154372u()) {
                i = Math.max(i - 1, 0);
            }
            return layout.isRtlCharAt(i);
        }

        /* renamed from: n */
        public void mo154351n(int i, boolean z, boolean z2) {
            boolean z3;
            super.mo154351n(i, z, z2);
            if (i != -1) {
                C110057b r = C106778a.this.mo154313r();
                r.mo161410a(i);
                if (!r.f329347d.isBoundary(i)) {
                    z3 = true;
                    this.f319509P = z3;
                }
            }
            z3 = false;
            this.f319509P = z3;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
            if (r0 != 3) goto L_0x0030;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r4) {
            /*
                r3 = this;
                com.tencent.mm.ui.widget.cedit.edit.a r0 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.CustomTextView r0 = r0.f319383U
                r1 = 1
                boolean r0 = r0.mo153981P(r4, r1)
                if (r0 != 0) goto L_0x000c
                return r1
            L_0x000c:
                super.onTouchEvent(r4)
                int r0 = r4.getActionMasked()
                if (r0 == 0) goto L_0x0026
                if (r0 == r1) goto L_0x0022
                r2 = 2
                if (r0 == r2) goto L_0x001e
                r4 = 3
                if (r0 == r4) goto L_0x0022
                goto L_0x0030
            L_0x001e:
                r3.mo154358q(r4)
                goto L_0x0030
            L_0x0022:
                r3.mo154332c()
                goto L_0x0030
            L_0x0026:
                r0 = 0
                r3.f319510Q = r0
                r0 = -1082130432(0xffffffffbf800000, float:-1.0)
                r3.f319511R = r0
                r3.mo154358q(r4)
            L_0x0030:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.C106795o.onTouchEvent(android.view.MotionEvent):boolean");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:70:0x0157, code lost:
            if (r0.f319515V.f319383U.canScrollHorizontally(r11 ? -1 : 1) != false) goto L_0x0159;
         */
        /* JADX WARNING: Removed duplicated region for block: B:172:0x02a7  */
        /* renamed from: r */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo154359r(float r17, float r18, boolean r19) {
            /*
                r16 = this;
                r0 = r16
                r1 = r17
                r2 = r18
                r3 = r19
                com.tencent.mm.ui.widget.cedit.edit.a r4 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.CustomTextView r4 = r4.f319383U
                android.text.Layout r4 = r4.getLayout()
                if (r4 != 0) goto L_0x001e
                com.tencent.mm.ui.widget.cedit.edit.a r4 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.CustomTextView r4 = r4.f319383U
                int r1 = r4.mo153976J(r1, r2)
                r0.mo154373v(r1, r3)
                return
            L_0x001e:
                int r5 = r0.f319431D
                r6 = -1
                if (r5 != r6) goto L_0x002d
                com.tencent.mm.ui.widget.cedit.edit.a r5 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.CustomTextView r5 = r5.f319383U
                int r5 = r5.mo153975I(r2)
                r0.f319431D = r5
            L_0x002d:
                boolean r5 = r16.mo154372u()
                if (r5 == 0) goto L_0x003c
                com.tencent.mm.ui.widget.cedit.edit.a r5 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.CustomTextView r5 = r5.f319383U
                int r5 = r5.getSelectionEnd()
                goto L_0x0044
            L_0x003c:
                com.tencent.mm.ui.widget.cedit.edit.a r5 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.CustomTextView r5 = r5.f319383U
                int r5 = r5.getSelectionStart()
            L_0x0044:
                com.tencent.mm.ui.widget.cedit.edit.a r7 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                int r8 = r0.f319431D
                int r2 = r7.mo154305j(r4, r8, r2)
                com.tencent.mm.ui.widget.cedit.edit.a r7 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.CustomTextView r7 = r7.f319383U
                float r7 = r7.mo153969B(r1)
                int r7 = r4.getOffsetForHorizontal(r2, r7)
                boolean r8 = r16.mo154372u()
                if (r8 == 0) goto L_0x0060
                if (r7 >= r5) goto L_0x0068
            L_0x0060:
                boolean r8 = r16.mo154372u()
                if (r8 != 0) goto L_0x0078
                if (r7 > r5) goto L_0x0078
            L_0x0068:
                int r2 = r4.getLineForOffset(r5)
                com.tencent.mm.ui.widget.cedit.edit.a r5 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.CustomTextView r5 = r5.f319383U
                float r5 = r5.mo153969B(r1)
                int r7 = r4.getOffsetForHorizontal(r2, r5)
            L_0x0078:
                com.tencent.mm.ui.widget.cedit.edit.a r5 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                int r5 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.m144252b(r5, r7)
                com.tencent.mm.ui.widget.cedit.edit.a r8 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                int r8 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.m144253c(r8, r7)
                float r9 = r0.f319511R
                r10 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
                if (r9 != 0) goto L_0x008e
                r0.f319511R = r1
            L_0x008e:
                int r9 = r16.getCurrentCursorOffset()
                boolean r10 = r0.mo154347j(r4, r9)
                boolean r11 = r0.mo154347j(r4, r7)
                r12 = 0
                r13 = 1
                if (r10 == 0) goto L_0x00a0
                if (r11 == 0) goto L_0x00a4
            L_0x00a0:
                if (r10 != 0) goto L_0x00ac
                if (r11 == 0) goto L_0x00ac
            L_0x00a4:
                r0.f319512S = r13
                r0.f319510Q = r12
                r0.mo154373v(r7, r3)
                return
            L_0x00ac:
                boolean r10 = r0.f319512S
                r14 = 0
                if (r10 == 0) goto L_0x00b9
                r0.mo154373v(r7, r3)
                r0.f319510Q = r12
                r0.f319512S = r14
                return
            L_0x00b9:
                float r10 = r0.f319511R
                float r10 = r1 - r10
                boolean r15 = r16.mo154372u()
                if (r15 == 0) goto L_0x00c8
                int r15 = r0.f319431D
                if (r2 >= r15) goto L_0x00ce
                goto L_0x00cc
            L_0x00c8:
                int r15 = r0.f319431D
                if (r2 <= r15) goto L_0x00ce
            L_0x00cc:
                r15 = 1
                goto L_0x00cf
            L_0x00ce:
                r15 = 0
            L_0x00cf:
                boolean r6 = r16.mo154372u()
                if (r11 != r6) goto L_0x00da
                int r6 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r6 <= 0) goto L_0x00e0
                goto L_0x00de
            L_0x00da:
                int r6 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r6 >= 0) goto L_0x00e0
            L_0x00de:
                r6 = 1
                goto L_0x00e1
            L_0x00e0:
                r6 = 0
            L_0x00e1:
                r6 = r6 | r15
                com.tencent.mm.ui.widget.cedit.edit.a r10 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.CustomTextView r10 = r10.f319383U
                boolean r10 = r10.getHorizontallyScrolling()
                if (r10 == 0) goto L_0x0186
                com.tencent.mm.ui.widget.cedit.edit.a r10 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.CustomTextView r10 = r10.f319383U
                int[] r15 = r0.f319514U
                r10.getLocationOnScreen(r15)
                boolean r10 = r16.mo154372u()
                if (r11 != r10) goto L_0x011a
                int[] r10 = r0.f319514U
                r10 = r10[r14]
                com.tencent.mm.ui.widget.cedit.edit.a r15 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.CustomTextView r15 = r15.f319383U
                int r15 = r15.getWidth()
                int r10 = r10 + r15
                com.tencent.mm.ui.widget.cedit.edit.a r15 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.CustomTextView r15 = r15.f319383U
                int r15 = r15.getPaddingRight()
                int r10 = r10 - r15
                float r10 = (float) r10
                float r15 = r0.f319513T
                float r10 = r10 - r15
                int r10 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
                if (r10 <= 0) goto L_0x0131
                goto L_0x012f
            L_0x011a:
                int[] r10 = r0.f319514U
                r10 = r10[r14]
                com.tencent.mm.ui.widget.cedit.edit.a r15 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.CustomTextView r15 = r15.f319383U
                int r15 = r15.getPaddingLeft()
                int r10 = r10 + r15
                float r10 = (float) r10
                float r15 = r0.f319513T
                float r10 = r10 + r15
                int r10 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
                if (r10 >= 0) goto L_0x0131
            L_0x012f:
                r10 = 1
                goto L_0x0132
            L_0x0131:
                r10 = 0
            L_0x0132:
                if (r10 == 0) goto L_0x0186
                boolean r10 = r16.mo154372u()
                if (r10 == 0) goto L_0x0144
                com.tencent.mm.ui.widget.cedit.edit.a r10 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.CustomTextView r10 = r10.f319383U
                int r10 = r10.getScrollX()
                if (r10 != 0) goto L_0x0159
            L_0x0144:
                boolean r10 = r16.mo154372u()
                if (r10 != 0) goto L_0x0186
                com.tencent.mm.ui.widget.cedit.edit.a r10 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.CustomTextView r10 = r10.f319383U
                if (r11 == 0) goto L_0x0152
                r15 = -1
                goto L_0x0153
            L_0x0152:
                r15 = 1
            L_0x0153:
                boolean r10 = r10.canScrollHorizontally(r15)
                if (r10 == 0) goto L_0x0186
            L_0x0159:
                if (r6 == 0) goto L_0x016b
                boolean r10 = r16.mo154372u()
                if (r10 == 0) goto L_0x0163
                if (r7 < r9) goto L_0x016d
            L_0x0163:
                boolean r10 = r16.mo154372u()
                if (r10 != 0) goto L_0x016b
                if (r7 > r9) goto L_0x016d
            L_0x016b:
                if (r6 != 0) goto L_0x0186
            L_0x016d:
                r0.f319510Q = r12
                boolean r1 = r16.mo154372u()
                if (r11 != r1) goto L_0x017c
                int r1 = r0.f319460z
                int r1 = r4.getOffsetToRightOf(r1)
                goto L_0x0182
            L_0x017c:
                int r1 = r0.f319460z
                int r1 = r4.getOffsetToLeftOf(r1)
            L_0x0182:
                r0.mo154373v(r1, r3)
                return
            L_0x0186:
                if (r6 == 0) goto L_0x0219
                boolean r6 = r16.mo154372u()
                if (r6 == 0) goto L_0x0190
                r6 = r8
                goto L_0x0191
            L_0x0190:
                r6 = r5
            L_0x0191:
                boolean r9 = r0.f319509P
                if (r9 == 0) goto L_0x01a4
                boolean r9 = r16.mo154372u()
                if (r9 == 0) goto L_0x01a0
                int r9 = r0.f319430C
                if (r2 >= r9) goto L_0x01ab
                goto L_0x01a4
            L_0x01a0:
                int r9 = r0.f319430C
                if (r2 <= r9) goto L_0x01ab
            L_0x01a4:
                boolean r9 = r0.mo154347j(r4, r6)
                if (r11 != r9) goto L_0x01ab
                r14 = 1
            L_0x01ab:
                if (r14 == 0) goto L_0x01f1
                int r9 = r4.getLineForOffset(r6)
                if (r9 == r2) goto L_0x01c2
                boolean r6 = r16.mo154372u()
                if (r6 == 0) goto L_0x01be
                int r6 = r4.getLineStart(r2)
                goto L_0x01c2
            L_0x01be:
                int r6 = r4.getLineEnd(r2)
            L_0x01c2:
                boolean r9 = r16.mo154372u()
                if (r9 == 0) goto L_0x01cf
                int r6 = r5 - r6
                int r6 = r6 / 2
                int r6 = r5 - r6
                goto L_0x01d3
            L_0x01cf:
                int r6 = r6 - r8
                int r6 = r6 / 2
                int r6 = r6 + r8
            L_0x01d3:
                boolean r9 = r16.mo154372u()
                if (r9 == 0) goto L_0x01e1
                if (r7 <= r6) goto L_0x01df
                int r9 = r0.f319430C
                if (r2 >= r9) goto L_0x01e1
            L_0x01df:
                r5 = r8
                goto L_0x01f2
            L_0x01e1:
                boolean r8 = r16.mo154372u()
                if (r8 != 0) goto L_0x01ee
                if (r7 >= r6) goto L_0x01f2
                int r6 = r0.f319430C
                if (r2 <= r6) goto L_0x01ee
                goto L_0x01f2
            L_0x01ee:
                int r5 = r0.f319460z
                goto L_0x01f2
            L_0x01f1:
                r5 = r7
            L_0x01f2:
                boolean r6 = r16.mo154372u()
                if (r6 == 0) goto L_0x01fa
                if (r5 < r7) goto L_0x0202
            L_0x01fa:
                boolean r6 = r16.mo154372u()
                if (r6 != 0) goto L_0x0216
                if (r5 <= r7) goto L_0x0216
            L_0x0202:
                boolean r6 = r16.mo154372u()
                float r4 = r0.mo154371t(r4, r5, r6)
                com.tencent.mm.ui.widget.cedit.edit.a r6 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.CustomTextView r6 = r6.f319383U
                float r6 = r6.mo153969B(r1)
                float r6 = r6 - r4
                r0.f319510Q = r6
                goto L_0x0277
            L_0x0216:
                r0.f319510Q = r12
                goto L_0x0277
            L_0x0219:
                float r6 = r0.f319510Q
                float r6 = r1 - r6
                com.tencent.mm.ui.widget.cedit.edit.a r9 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.CustomTextView r9 = r9.f319383U
                float r6 = r9.mo153969B(r6)
                int r6 = r4.getOffsetForHorizontal(r2, r6)
                boolean r9 = r16.mo154372u()
                if (r9 == 0) goto L_0x0238
                int r9 = r0.f319460z
                if (r6 > r9) goto L_0x0243
                int r9 = r0.f319430C
                if (r2 <= r9) goto L_0x0241
                goto L_0x0243
            L_0x0238:
                int r9 = r0.f319460z
                if (r6 < r9) goto L_0x0243
                int r9 = r0.f319430C
                if (r2 >= r9) goto L_0x0241
                goto L_0x0243
            L_0x0241:
                r9 = 0
                goto L_0x0244
            L_0x0243:
                r9 = 1
            L_0x0244:
                if (r9 == 0) goto L_0x027b
                int r9 = r0.f319430C
                if (r2 == r9) goto L_0x0279
                boolean r6 = r16.mo154372u()
                if (r6 == 0) goto L_0x0251
                r5 = r8
            L_0x0251:
                boolean r6 = r16.mo154372u()
                if (r6 == 0) goto L_0x0259
                if (r5 < r7) goto L_0x0261
            L_0x0259:
                boolean r6 = r16.mo154372u()
                if (r6 != 0) goto L_0x0275
                if (r5 <= r7) goto L_0x0275
            L_0x0261:
                boolean r6 = r16.mo154372u()
                float r4 = r0.mo154371t(r4, r5, r6)
                com.tencent.mm.ui.widget.cedit.edit.a r6 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.CustomTextView r6 = r6.f319383U
                float r6 = r6.mo153969B(r1)
                float r6 = r6 - r4
                r0.f319510Q = r6
                goto L_0x0277
            L_0x0275:
                r0.f319510Q = r12
            L_0x0277:
                r7 = r5
                goto L_0x02a5
            L_0x0279:
                r7 = r6
                goto L_0x02a5
            L_0x027b:
                boolean r5 = r16.mo154372u()
                if (r5 == 0) goto L_0x0285
                int r5 = r0.f319460z
                if (r6 < r5) goto L_0x028f
            L_0x0285:
                boolean r5 = r16.mo154372u()
                if (r5 != 0) goto L_0x02a4
                int r5 = r0.f319460z
                if (r6 <= r5) goto L_0x02a4
            L_0x028f:
                com.tencent.mm.ui.widget.cedit.edit.a r5 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.CustomTextView r5 = r5.f319383U
                float r5 = r5.mo153969B(r1)
                int r6 = r0.f319460z
                boolean r8 = r16.mo154372u()
                float r4 = r0.mo154371t(r4, r6, r8)
                float r5 = r5 - r4
                r0.f319510Q = r5
            L_0x02a4:
                r13 = 0
            L_0x02a5:
                if (r13 == 0) goto L_0x02ac
                r0.f319431D = r2
                r0.mo154373v(r7, r3)
            L_0x02ac:
                r0.f319511R = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.C106795o.mo154359r(float, float, boolean):void");
        }

        /* renamed from: s */
        public void mo154360s(int i) {
            if (mo154372u()) {
                Selection.setSelection((Spannable) C106778a.this.f319383U.getText(), i, C106778a.this.f319383U.getSelectionEnd());
            } else {
                Selection.setSelection((Spannable) C106778a.this.f319383U.getText(), C106778a.this.f319383U.getSelectionStart(), i);
            }
            mo154357p(false);
            ActionMode actionMode = C106778a.this.f319392c;
            if (actionMode != null && actionMode != null) {
                actionMode.invalidate();
            }
        }

        /* renamed from: t */
        public final float mo154371t(Layout layout, int i, boolean z) {
            int lineForOffset = layout.getLineForOffset(i);
            boolean z2 = false;
            boolean isRtlCharAt = layout.isRtlCharAt(z ? i : Math.max(i - 1, 0));
            if (layout.getParagraphDirection(lineForOffset) == -1) {
                z2 = true;
            }
            return isRtlCharAt == z2 ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
        }

        /* renamed from: u */
        public final boolean mo154372u() {
            return this.f319508N == 0;
        }

        /* renamed from: v */
        public final void mo154373v(int i, boolean z) {
            int selectionEnd = mo154372u() ? C106778a.this.f319383U.getSelectionEnd() : C106778a.this.f319383U.getSelectionStart();
            if ((mo154372u() && i >= selectionEnd) || (!mo154372u() && i <= selectionEnd)) {
                this.f319510Q = 0.0f;
                Layout layout = C106778a.this.f319383U.getLayout();
                if (!(layout == null || i == selectionEnd)) {
                    float t = mo154371t(layout, i, mo154372u());
                    float t2 = mo154371t(layout, selectionEnd, !mo154372u());
                    float t3 = mo154371t(layout, this.f319460z, mo154372u());
                    if ((t3 < t2 && t < t2) || (t3 > t2 && t > t2)) {
                        int currentCursorOffset = getCurrentCursorOffset();
                        if (!mo154372u()) {
                            Math.max(currentCursorOffset - 1, 0);
                        }
                        mo154351n(mo154372u() ? (int) 0 : C109754a.m149077c(0), false, z);
                        return;
                    }
                }
                i = C106778a.this.mo154308m(selectionEnd, !mo154372u());
            }
            mo154351n(i, false, z);
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.cedit.edit.a$p */
    public class C106796p implements C106784f {

        /* renamed from: d */
        public C106795o f319516d;

        /* renamed from: e */
        public C106795o f319517e;

        /* renamed from: f */
        public int f319518f;

        /* renamed from: g */
        public int f319519g;

        /* renamed from: h */
        public boolean f319520h;

        /* renamed from: i */
        public int f319521i = -1;

        /* renamed from: j */
        public boolean f319522j;

        /* renamed from: n */
        public int f319523n = -1;

        /* renamed from: o */
        public boolean f319524o = false;

        /* renamed from: p */
        public int f319525p = 0;

        public C106796p() {
            mo154378g();
        }

        /* renamed from: a */
        public boolean mo154327a() {
            C106795o oVar = this.f319516d;
            return oVar != null && oVar.mo154348k();
        }

        /* renamed from: b */
        public void mo154374b(int i) {
            show();
            this.f319525p = i;
            C106778a aVar = C106778a.this;
            CustomTextView customTextView = aVar.f319383U;
            C109030d dVar = aVar.f319377O;
            this.f319521i = customTextView.mo153976J(dVar.f326534a, dVar.f326535b);
            C106778a aVar2 = C106778a.this;
            this.f319523n = aVar2.f319383U.mo153975I(aVar2.f319377O.f326535b);
            mo154375c();
            C106778a.this.f319383U.getParent().requestDisallowInterceptTouchEvent(true);
            C106778a.this.f319383U.cancelLongPress();
        }

        /* renamed from: c */
        public void mo154375c() {
            C106795o oVar = this.f319516d;
            if (oVar != null) {
                oVar.mo154345i();
            }
            C106795o oVar2 = this.f319517e;
            if (oVar2 != null) {
                oVar2.mo154345i();
            }
        }

        /* renamed from: d */
        public boolean mo154328d() {
            if (this.f319525p != 0) {
                return true;
            }
            C106795o oVar = this.f319516d;
            if (oVar != null && oVar.f319449o) {
                return true;
            }
            C106795o oVar2 = this.f319517e;
            return oVar2 != null && oVar2.f319449o;
        }

        /* renamed from: e */
        public final void mo154376e() {
            if (this.f319516d == null) {
                C106778a aVar = C106778a.this;
                this.f319516d = new C106795o(aVar.f319369G, aVar.f319370H, C0966R.C0970id.jaa, 0);
            }
            if (this.f319517e == null) {
                C106778a aVar2 = C106778a.this;
                this.f319517e = new C106795o(aVar2.f319370H, aVar2.f319369G, C0966R.C0970id.ja_, 1);
            }
            this.f319516d.mo154352o();
            this.f319517e.mo154352o();
            C106778a.this.mo154315t();
        }

        /* renamed from: f */
        public final void mo154377f() {
            this.f319521i = -1;
            this.f319525p = 0;
            this.f319524o = false;
            int selectionStart = C106778a.this.f319383U.getSelectionStart();
            int selectionEnd = C106778a.this.f319383U.getSelectionEnd();
            if (selectionStart < 0 || selectionEnd < 0) {
                Selection.removeSelection((Spannable) C106778a.this.f319383U.getText());
            } else if (selectionStart > selectionEnd) {
                Selection.setSelection((Spannable) C106778a.this.f319383U.getText(), selectionEnd, selectionStart);
            }
        }

        /* renamed from: g */
        public void mo154378g() {
            this.f319519g = -1;
            this.f319518f = -1;
            mo154377f();
        }

        /* renamed from: h */
        public final void mo154379h(MotionEvent motionEvent) {
            int i;
            int i2;
            int i3;
            if (C106778a.this.f319383U.getLayout() != null) {
                int i4 = this.f319525p;
                if (i4 == 1) {
                    mo154380i(this.f319521i, C106778a.this.f319383U.mo153976J(motionEvent.getX(), motionEvent.getY()), motionEvent.isFromSource(4098));
                } else if (i4 != 2) {
                    if (i4 == 3) {
                        int J = C106778a.this.f319383U.mo153976J(motionEvent.getX(), motionEvent.getY());
                        long n = C106778a.this.mo154309n(Math.min(J, this.f319521i), Math.max(J, this.f319521i));
                        mo154380i((int) (n >>> 32), C109754a.m149077c(n), motionEvent.isFromSource(4098));
                    }
                } else if (!this.f319522j) {
                    boolean isFromSource = motionEvent.isFromSource(8194);
                    ViewConfiguration viewConfiguration = ViewConfiguration.get(C106778a.this.f319383U.getContext());
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    if (isFromSource) {
                        i = C106778a.this.f319383U.mo153975I(y);
                    } else {
                        if (this.f319524o) {
                            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
                            C106795o oVar = this.f319516d;
                            y -= oVar != null ? oVar.getIdealVerticalOffset() : (float) scaledTouchSlop;
                        }
                        C106778a aVar = C106778a.this;
                        i = aVar.mo154305j(aVar.f319383U.getLayout(), this.f319523n, y);
                        if (!this.f319524o && i != this.f319523n) {
                            this.f319524o = true;
                            return;
                        }
                    }
                    CustomTextView customTextView = C106778a.this.f319383U;
                    int offsetForHorizontal = customTextView.getLayout().getOffsetForHorizontal(i, customTextView.mo153969B(x));
                    if (this.f319521i < offsetForHorizontal) {
                        i3 = C106778a.m144252b(C106778a.this, offsetForHorizontal);
                        i2 = C106778a.m144253c(C106778a.this, this.f319521i);
                    } else {
                        i3 = C106778a.m144253c(C106778a.this, offsetForHorizontal);
                        i2 = C106778a.m144252b(C106778a.this, this.f319521i);
                        if (i2 == i3) {
                            i3 = C106778a.this.mo154308m(i3, false);
                        }
                    }
                    this.f319523n = i;
                    mo154380i(i2, i3, motionEvent.isFromSource(4098));
                }
            }
        }

        /* renamed from: i */
        public final void mo154380i(int i, int i2, boolean z) {
            if (z) {
                C106778a.this.getClass();
            }
            Selection.setSelection((Spannable) C106778a.this.f319383U.getText(), i, i2);
        }

        public void onTouchModeChanged(boolean z) {
            if (!z) {
                mo154375c();
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x001a A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x001b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void show() {
            /*
                r4 = this;
                com.tencent.mm.ui.widget.cedit.edit.a r0 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
                com.tencent.mm.ui.widget.cedit.edit.CustomTextView r1 = r0.f319383U
                com.tencent.mm.ui.widget.cedit.edit.a r1 = r1.f319246B1
                r2 = 0
                if (r1 != 0) goto L_0x000a
                goto L_0x0014
            L_0x000a:
                com.tencent.mm.ui.widget.cedit.edit.a$j r3 = r1.f319400k
                if (r3 == 0) goto L_0x0016
                int r1 = r3.f319471c
                if (r1 <= 0) goto L_0x0014
                r1 = 1
                goto L_0x0018
            L_0x0014:
                r1 = 0
                goto L_0x0018
            L_0x0016:
                boolean r1 = r1.f319414y
            L_0x0018:
                if (r1 == 0) goto L_0x001b
                return
            L_0x001b:
                r0.mo154320y(r2)
                r4.mo154376e()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.C106796p.show():void");
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.cedit.edit.a$q */
    public class C106797q extends ActionMode.Callback2 {

        /* renamed from: a */
        public final Path f319527a = new Path();

        /* renamed from: b */
        public final RectF f319528b = new RectF();

        /* renamed from: c */
        public final boolean f319529c;

        /* renamed from: d */
        public final int f319530d;

        /* renamed from: e */
        public final Map<MenuItem, View.OnClickListener> f319531e = new HashMap();

        public C106797q(int i) {
            boolean z = i == 0 || (C106778a.this.f319413x && i == 2);
            this.f319529c = z;
            if (z) {
                C106796p q = C106778a.this.mo154312q();
                if (q.f319516d == null) {
                    C106778a.this.mo154320y(false);
                    q.mo154376e();
                    q.mo154375c();
                }
                this.f319530d = Math.max(C106778a.this.f319369G.getMinimumHeight(), C106778a.this.f319370H.getMinimumHeight());
                return;
            }
            C106791l l = C106778a.this.mo154307l();
            if (l != null) {
                l.mo154364b();
                this.f319530d = C106778a.this.f319371I.getMinimumHeight();
                return;
            }
            this.f319530d = 0;
        }

        /* renamed from: a */
        public final ActionMode.Callback mo154382a() {
            return this.f319529c ? C106778a.this.f319373K : C106778a.this.f319374L;
        }

        /* renamed from: b */
        public final void mo154383b(Menu menu) {
            CustomTextView customTextView = C106778a.this.f319383U;
            boolean z = customTextView.mo154269y() && !(customTextView.f319257H instanceof PasswordTransformationMethod) && !(customTextView.getSelectionStart() == 0 && customTextView.getSelectionEnd() == customTextView.f319243A.length());
            boolean z2 = menu.findItem(16908319) != null;
            if (z && !z2) {
                menu.add(0, 16908319, 8, 17039373).setShowAsAction(1);
            } else if (!z && z2) {
                menu.removeItem(16908319);
            }
        }

        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            C106800c p = C106778a.this.mo154311p();
            menuItem.getItemId();
            menuItem.getTitle().toString();
            p.getClass();
            ActionMode.Callback a = mo154382a();
            if (a != null && a.onActionItemClicked(actionMode, menuItem)) {
                return true;
            }
            if (menuItem.getGroupId() != 16908353) {
                return C106778a.this.f319383U.mo97951b0(menuItem.getItemId());
            }
            if (menuItem.getGroupId() == 16908353) {
                C106778a.this.mo154311p().getClass();
                return true;
            }
            throw new IllegalArgumentException();
        }

        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            ((HashMap) this.f319531e).clear();
            actionMode.setTitle((CharSequence) null);
            actionMode.setSubtitle((CharSequence) null);
            actionMode.setTitleOptionalHint(true);
            if (C106778a.this.f319383U.mo154265w()) {
                menu.add(0, 16908320, 4, 17039363).setAlphabeticShortcut('x').setShowAsAction(2);
            }
            if (C106778a.this.f319383U.mo154262v()) {
                menu.add(0, 16908321, 5, 17039361).setAlphabeticShortcut('c').setShowAsAction(2);
            }
            if (C106778a.this.f319383U.mo154267x()) {
                menu.add(0, 16908322, 6, 17039371).setAlphabeticShortcut('v').setShowAsAction(2);
            }
            mo154383b(menu);
            ActionMode.Callback a = mo154382a();
            if (a == null || a.onCreateActionMode(actionMode, menu)) {
                if (this.f319529c && !C106778a.this.f319383U.hasTransientState()) {
                    C106778a.this.f319383U.setHasTransientState(true);
                }
                return true;
            }
            Selection.setSelection((Spannable) C106778a.this.f319383U.getText(), C106778a.this.f319383U.getSelectionEnd());
            return false;
        }

        public void onDestroyActionMode(ActionMode actionMode) {
            C106778a.this.mo154311p().getClass();
            C106778a.this.f319392c = null;
            ActionMode.Callback a = mo154382a();
            if (a != null) {
                a.onDestroyActionMode(actionMode);
            }
            C106778a aVar = C106778a.this;
            if (!aVar.f319363A) {
                Selection.setSelection((Spannable) aVar.f319383U.getText(), C106778a.this.f319383U.getSelectionEnd());
            }
            C106796p pVar = C106778a.this.f319391b;
            if (pVar != null) {
                pVar.mo154375c();
            }
            ((HashMap) this.f319531e).clear();
            C106778a.this.f319365C = false;
        }

        public void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
            Log.m105924i("cmEdit.Editor", "onGetContentRect mode:" + actionMode + ",view:" + view + ",outRect:" + rect);
            if (!view.equals(C106778a.this.f319383U) || C106778a.this.f319383U.getLayout() == null) {
                super.onGetContentRect(actionMode, view, rect);
                return;
            }
            if (C106778a.this.f319383U.getSelectionStart() != C106778a.this.f319383U.getSelectionEnd()) {
                this.f319527a.reset();
                C106778a.this.f319383U.getLayout().getSelectionPath(C106778a.this.f319383U.getSelectionStart(), C106778a.this.f319383U.getSelectionEnd(), this.f319527a);
                this.f319527a.computeBounds(this.f319528b, true);
                this.f319528b.bottom += (float) this.f319530d;
            } else {
                Layout layout = C106778a.this.f319383U.getLayout();
                int lineForOffset = layout.getLineForOffset(C106778a.this.f319383U.getSelectionStart());
                C106778a aVar = C106778a.this;
                float d = (float) aVar.mo154299d((Drawable) null, layout.getPrimaryHorizontal(aVar.f319383U.getSelectionStart()));
                this.f319528b.set(d, (float) layout.getLineTop(lineForOffset), d, (float) (layout.getLineBottom(lineForOffset) + this.f319530d));
            }
            CustomTextView customTextView = C106778a.this.f319383U;
            float compoundPaddingLeft = (float) (customTextView.getCompoundPaddingLeft() - customTextView.getScrollX());
            float x0 = (float) C106778a.this.f319383U.mo154268x0();
            rect.set((int) Math.floor((double) (this.f319528b.left + compoundPaddingLeft)), (int) Math.floor((double) (this.f319528b.top + x0)), (int) Math.ceil((double) (this.f319528b.right + compoundPaddingLeft)), (int) Math.ceil((double) (this.f319528b.bottom + x0)));
        }

        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            mo154383b(menu);
            ActionMode.Callback a = mo154382a();
            if (a != null) {
                return a.onPrepareActionMode(actionMode, menu);
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.cedit.edit.a$r */
    public interface C106798r {
        /* renamed from: a */
        void mo154330a(int i, int i2, boolean z, boolean z2);
    }

    public C106778a(CustomTextView customTextView) {
        new CursorAnchorInfo.Builder();
        new Matrix();
        this.f319384V = new C106781c();
        this.f319385W = false;
        this.f319390a0 = false;
        this.f319383U = customTextView;
        customTextView.setFilters(customTextView.getFilters());
        this.f319386X = (int) TypedValue.applyDimension(1, 45.0f, customTextView.getContext().getResources().getDisplayMetrics());
        this.f319387Y = (int) TypedValue.applyDimension(1, 12.0f, customTextView.getContext().getResources().getDisplayMetrics());
    }

    /* renamed from: F */
    public static Drawable m144250F(Context context, Drawable drawable, int i) {
        if (!(drawable instanceof BitmapDrawable)) {
            return drawable;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == 0 || intrinsicHeight == 0) {
            return drawable;
        }
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        float f = (float) intrinsicWidth;
        float width = f / ((float) bitmap.getWidth());
        float a = (float) C74942w4.m89784a(context, i);
        return new BitmapDrawable(context.getResources(), Bitmap.createScaledBitmap(bitmap, (int) (((f / ((float) intrinsicHeight)) * a) / width), (int) (a / width), true));
    }

    /* renamed from: a */
    public static C106793m m144251a(C106778a aVar) {
        if (aVar.f319395f == null && Build.VERSION.SDK_INT >= 28) {
            aVar.f319395f = new C106793m(new Magnifier(aVar.f319383U), (C106779a) null);
        }
        return aVar.f319395f;
    }

    /* renamed from: b */
    public static int m144252b(C106778a aVar, int i) {
        int i2;
        C110057b r = aVar.mo154313r();
        r.mo161410a(i);
        if (aVar.mo154313r().mo161414e(r.f329347d.following(i))) {
            C110057b r2 = aVar.mo154313r();
            r2.mo161410a(i);
            i2 = i;
            while (i2 != -1) {
                if (!r2.mo161416g(i2) && r2.mo161414e(i2)) {
                    break;
                }
                r2.mo161410a(i2);
                i2 = r2.f329347d.following(i2);
            }
        } else {
            i2 = aVar.mo154313r().mo161412c(i, true);
        }
        return i2 == -1 ? i : i2;
    }

    /* renamed from: c */
    public static int m144253c(C106778a aVar, int i) {
        int i2;
        C110057b r = aVar.mo154313r();
        r.mo161410a(i);
        if (aVar.mo154313r().mo161416g(r.f329347d.preceding(i))) {
            C110057b r2 = aVar.mo154313r();
            r2.mo161410a(i);
            i2 = i;
            while (i2 != -1) {
                if (r2.mo161416g(i2) && !r2.mo161414e(i2)) {
                    break;
                }
                r2.mo161410a(i2);
                i2 = r2.f329347d.preceding(i2);
            }
        } else {
            i2 = aVar.mo154313r().mo161411b(i, true);
        }
        return i2 == -1 ? i : i2;
    }

    /* renamed from: A */
    public final boolean mo154286A() {
        CustomTextView customTextView = this.f319383U;
        if (customTextView.f319257H instanceof PasswordTransformationMethod) {
            return true;
        }
        int inputType = customTextView.getInputType();
        int i = inputType & 15;
        int i2 = inputType & 4080;
        return i == 2 || i == 3 || i == 4 || i2 == 16 || i2 == 32 || i2 == 208 || i2 == 176;
    }

    /* renamed from: B */
    public void mo154287B() {
        C106794n nVar = this.f319372J;
        if (nVar != null) {
            nVar.f319505o = true;
        }
        ActionMode actionMode = this.f319392c;
        if (actionMode != null && Build.VERSION.SDK_INT >= 23) {
            actionMode.invalidateContentRect();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
        r0 = ((android.view.WindowManager.LayoutParams) r0).type;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo154288C() {
        /*
            r4 = this;
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r0 = r4.f319383U
            android.view.View r0 = r0.getRootView()
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r1 = r0 instanceof android.view.WindowManager.LayoutParams
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x001e
            android.view.WindowManager$LayoutParams r0 = (android.view.WindowManager.LayoutParams) r0
            int r0 = r0.type
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r0 < r1) goto L_0x001c
            r1 = 1999(0x7cf, float:2.801E-42)
            if (r0 <= r1) goto L_0x001e
        L_0x001c:
            r0 = 1
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            if (r0 == 0) goto L_0x002b
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r0 = r4.f319383U
            android.text.Layout r0 = r0.getLayout()
            if (r0 == 0) goto L_0x002b
            r0 = 1
            goto L_0x002c
        L_0x002b:
            r0 = 0
        L_0x002c:
            if (r0 == 0) goto L_0x0041
            boolean r1 = r4.f319411v
            if (r1 == 0) goto L_0x003c
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r1 = r4.f319383U
            boolean r1 = r1.mo153985U()
            if (r1 == 0) goto L_0x003c
            r1 = 1
            goto L_0x003d
        L_0x003c:
            r1 = 0
        L_0x003d:
            if (r1 == 0) goto L_0x0041
            r1 = 1
            goto L_0x0042
        L_0x0041:
            r1 = 0
        L_0x0042:
            r4.f319393d = r1
            if (r0 == 0) goto L_0x004f
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r0 = r4.f319383U
            boolean r0 = r0.mo154261u0()
            if (r0 == 0) goto L_0x004f
            r2 = 1
        L_0x004f:
            r4.f319394e = r2
            boolean r0 = r4.f319393d
            r1 = 0
            if (r0 != 0) goto L_0x0079
            r4.mo154315t()
            com.tencent.mm.ui.widget.cedit.edit.a$l r0 = r4.f319389a
            if (r0 == 0) goto L_0x0079
            com.tencent.mm.ui.widget.cedit.edit.a r2 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r2 = r2.f319383U
            android.view.ViewTreeObserver r2 = r2.getViewTreeObserver()
            r2.removeOnTouchModeChangeListener(r0)
            com.tencent.mm.ui.widget.cedit.edit.a$k r0 = r0.f319485d
            if (r0 == 0) goto L_0x0077
            java.lang.Runnable r2 = r0.f319480Q
            if (r2 == 0) goto L_0x0077
            com.tencent.mm.ui.widget.cedit.edit.a r0 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r0 = r0.f319383U
            r0.removeCallbacks(r2)
        L_0x0077:
            r4.f319389a = r1
        L_0x0079:
            boolean r0 = r4.f319394e
            if (r0 != 0) goto L_0x0091
            r4.mo154297M()
            com.tencent.mm.ui.widget.cedit.edit.a$p r0 = r4.f319391b
            if (r0 == 0) goto L_0x0091
            com.tencent.mm.ui.widget.cedit.edit.a r2 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r2 = r2.f319383U
            android.view.ViewTreeObserver r2 = r2.getViewTreeObserver()
            r2.removeOnTouchModeChangeListener(r0)
            r4.f319391b = r1
        L_0x0091:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.mo154288C():void");
    }

    /* renamed from: D */
    public void mo154289D() {
        ActionMode actionMode;
        if (mo154303h()) {
            this.f319364B = false;
            return;
        }
        boolean L = this.f319383U.mo153978L();
        C106796p q = mo154312q();
        C106791l l = mo154307l();
        if ((q == null || !q.mo154328d()) && (l == null || !l.mo154328d())) {
            if (L) {
                mo154315t();
                if (mo154317v()) {
                    if (this.f319364B) {
                        mo154296L(false);
                    }
                } else if (q == null || !q.mo154327a()) {
                    mo154298N();
                    mo154296L(false);
                } else {
                    if (Build.VERSION.SDK_INT >= 23 && (actionMode = this.f319392c) != null) {
                        actionMode.invalidateContentRect();
                    }
                    this.f319383U.postDelayed(this.f319384V, (long) ViewConfiguration.getDoubleTapTimeout());
                    C106800c p = mo154311p();
                    p.getClass();
                    ActionMode actionMode2 = p.f319534a.f319392c;
                    if (actionMode2 != null) {
                        actionMode2.invalidate();
                    }
                }
            } else if (l == null || !l.mo154327a()) {
                mo154297M();
            } else {
                ActionMode actionMode3 = this.f319392c;
                if (actionMode3 != null && Build.VERSION.SDK_INT >= 23) {
                    actionMode3.invalidateContentRect();
                }
            }
            this.f319364B = false;
            return;
        }
        this.f319364B = false;
    }

    /* renamed from: E */
    public boolean mo154290E() {
        InputMethodManager k;
        C106788j jVar = this.f319400k;
        if (jVar == null) {
            return false;
        }
        boolean z = jVar.f319474f;
        if (!z && !jVar.f319473e) {
            return false;
        }
        jVar.f319474f = false;
        jVar.f319473e = false;
        ExtractedTextRequest extractedTextRequest = jVar.f319469a;
        if (extractedTextRequest == null || (k = mo154306k()) == null) {
            return false;
        }
        if (jVar.f319475g < 0 && !z) {
            jVar.f319475g = -2;
        }
        if (!mo154302g(extractedTextRequest, jVar.f319475g, jVar.f319476h, jVar.f319477i, jVar.f319470b)) {
            return false;
        }
        k.updateExtractedText(this.f319383U, extractedTextRequest.token, jVar.f319470b);
        jVar.f319475g = -1;
        jVar.f319476h = -1;
        jVar.f319477i = 0;
        jVar.f319474f = false;
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x012d A[RETURN] */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo154291G() {
        /*
            r8 = this;
            java.lang.Runnable r0 = r8.f319378P
            if (r0 == 0) goto L_0x0009
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r1 = r8.f319383U
            r1.removeCallbacks(r0)
        L_0x0009:
            boolean r0 = r8.mo154303h()
            r1 = 0
            if (r0 == 0) goto L_0x0011
            return r1
        L_0x0011:
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r0 = r8.f319383U
            boolean r0 = r0.mo154269y()
            r2 = 1
            if (r0 == 0) goto L_0x0025
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r0 = r8.f319383U
            boolean r0 = r0.requestFocus()
            if (r0 != 0) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r0 = 1
            goto L_0x002d
        L_0x0025:
            java.lang.String r0 = "cmEdit.CMTextView"
            java.lang.String r3 = "TextView does not support text selection. Selection cancelled."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r3)
            r0 = 0
        L_0x002d:
            if (r0 != 0) goto L_0x0030
            return r1
        L_0x0030:
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r0 = r8.f319383U
            boolean r0 = r0.mo153978L()
            if (r0 != 0) goto L_0x012e
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r0 = r8.f319383U
            boolean r0 = r0.mo154269y()
            if (r0 != 0) goto L_0x0042
            goto L_0x012a
        L_0x0042:
            boolean r0 = r8.mo154286A()
            if (r0 == 0) goto L_0x0050
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r0 = r8.f319383U
            boolean r0 = r0.mo154007g0()
            goto L_0x012b
        L_0x0050:
            com.tencent.mm.ui.widget.cedit.edit.a$p r0 = r8.mo154312q()
            int r3 = r0.f319518f
            int r0 = r0.f319519g
            long r3 = no3.C109754a.m149075a(r3, r0)
            r0 = 32
            long r5 = r3 >>> r0
            int r6 = (int) r5
            int r3 = no3.C109754a.m149077c(r3)
            if (r6 < 0) goto L_0x012a
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r4 = r8.f319383U
            java.lang.CharSequence r4 = r4.getText()
            int r4 = r4.length()
            if (r6 <= r4) goto L_0x0075
            goto L_0x012a
        L_0x0075:
            if (r3 < 0) goto L_0x012a
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r4 = r8.f319383U
            java.lang.CharSequence r4 = r4.getText()
            int r4 = r4.length()
            if (r3 <= r4) goto L_0x0085
            goto L_0x012a
        L_0x0085:
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r4 = r8.f319383U
            java.lang.CharSequence r4 = r4.getText()
            android.text.Spanned r4 = (android.text.Spanned) r4
            java.lang.Class<android.text.style.URLSpan> r5 = android.text.style.URLSpan.class
            java.lang.Object[] r4 = r4.getSpans(r6, r3, r5)
            android.text.style.URLSpan[] r4 = (android.text.style.URLSpan[]) r4
            int r5 = r4.length
            if (r5 < r2) goto L_0x00b4
            r0 = r4[r1]
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r3 = r8.f319383U
            java.lang.CharSequence r3 = r3.getText()
            android.text.Spanned r3 = (android.text.Spanned) r3
            int r3 = r3.getSpanStart(r0)
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r4 = r8.f319383U
            java.lang.CharSequence r4 = r4.getText()
            android.text.Spanned r4 = (android.text.Spanned) r4
            int r0 = r4.getSpanEnd(r0)
            goto L_0x011b
        L_0x00b4:
            oo3.b r4 = r8.f319379Q
            if (r4 != 0) goto L_0x00c5
            oo3.b r4 = new oo3.b
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r5 = r8.f319383U
            java.util.Locale r5 = r5.getTextServicesLocale()
            r4.<init>(r5)
            r8.f319379Q = r4
        L_0x00c5:
            oo3.b r4 = r8.f319379Q
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r5 = r8.f319383U
            java.lang.CharSequence r5 = r5.getText()
            r4.mo161417i(r5, r6, r3)
            int r5 = r4.mo161411b(r6, r1)
            int r3 = r4.mo161412c(r3, r1)
            r4 = -1
            if (r5 == r4) goto L_0x00e3
            if (r3 == r4) goto L_0x00e3
            if (r5 != r3) goto L_0x00e0
            goto L_0x00e3
        L_0x00e0:
            r0 = r3
            r3 = r5
            goto L_0x011b
        L_0x00e3:
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r3 = r8.f319383U
            java.lang.CharSequence r3 = r3.getText()
            int r3 = r3.length()
            if (r6 >= r3) goto L_0x00fc
            int r3 = r8.mo154308m(r6, r2)
            int r4 = r8.mo154308m(r3, r1)
            long r3 = no3.C109754a.m149075a(r4, r3)
            goto L_0x0111
        L_0x00fc:
            int r3 = r6 + -1
            if (r3 < 0) goto L_0x010d
            int r3 = r8.mo154308m(r6, r1)
            int r4 = r8.mo154308m(r3, r2)
            long r3 = no3.C109754a.m149075a(r3, r4)
            goto L_0x0111
        L_0x010d:
            long r3 = no3.C109754a.m149075a(r6, r6)
        L_0x0111:
            long r5 = r3 >>> r0
            int r0 = (int) r5
            int r3 = no3.C109754a.m149077c(r3)
            r7 = r3
            r3 = r0
            r0 = r7
        L_0x011b:
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r4 = r8.f319383U
            java.lang.CharSequence r4 = r4.getText()
            android.text.Spannable r4 = (android.text.Spannable) r4
            android.text.Selection.setSelection(r4, r3, r0)
            if (r0 <= r3) goto L_0x012a
            r0 = 1
            goto L_0x012b
        L_0x012a:
            r0 = 0
        L_0x012b:
            if (r0 != 0) goto L_0x012e
            return r1
        L_0x012e:
            r8.mo154298N()
            com.tencent.mm.ui.widget.cedit.edit.a$p r0 = r8.mo154312q()
            r1 = 2
            r0.mo154374b(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.mo154291G():boolean");
    }

    /* renamed from: H */
    public final boolean mo154292H() {
        int selectionStart;
        int selectionEnd;
        return (this.f319411v && this.f319383U.mo153985U()) && this.f319383U.isFocused() && (selectionStart = this.f319383U.getSelectionStart()) >= 0 && (selectionEnd = this.f319383U.getSelectionEnd()) >= 0 && selectionStart == selectionEnd;
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01c5 A[EDGE_INSN: B:74:0x01c5->B:58:0x01c5 ?: BREAK  , SYNTHETIC] */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo154293I() {
        /*
            r17 = this;
            r1 = r17
            lo3.a r0 = r1.f319388Z
            if (r0 != 0) goto L_0x000f
            lo3.a r0 = new lo3.a
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r2 = r1.f319383U
            r0.<init>(r2)
            r1.f319388Z = r0
        L_0x000f:
            lo3.a r2 = r1.f319388Z
            boolean r0 = r2.f327512k
            java.lang.String r3 = "cmEdit.OperateWindow"
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L_0x0033
            java.lang.Object[] r0 = new java.lang.Object[r5]
            int r6 = r2.hashCode()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r0[r4] = r6
            java.lang.String r6 = "show after destroy @"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r6, r0)
            android.widget.PopupWindow r0 = r2.f327502a
            android.view.View r6 = r2.f327511j
            r0.setContentView(r6)
            r2.f327512k = r4
        L_0x0033:
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r0 = r2.f327510i
            java.lang.CharSequence r0 = r0.getText()
            int r0 = r0.length()
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r6 = r2.f327510i
            int r6 = r6.getSelectionStart()
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r7 = r2.f327510i
            int r7 = r7.getSelectionEnd()
            r9 = 2
            if (r0 <= 0) goto L_0x0052
            if (r6 != 0) goto L_0x0052
            if (r7 != r0) goto L_0x0052
            r6 = 1
            goto L_0x005e
        L_0x0052:
            if (r6 != r7) goto L_0x005a
            if (r0 <= 0) goto L_0x0058
            r6 = 4
            goto L_0x005e
        L_0x0058:
            r6 = 2
            goto L_0x005e
        L_0x005a:
            r0 = 8
            r6 = 8
        L_0x005e:
            java.util.LinkedList r7 = new java.util.LinkedList
            r7.<init>()
            java.util.List<ro3.j$b> r0 = r2.f327507f
            java.util.Iterator r0 = r0.iterator()
        L_0x0069:
            boolean r10 = r0.hasNext()
            if (r10 == 0) goto L_0x0080
            java.lang.Object r10 = r0.next()
            ro3.j$b r10 = (ro3.C110588j.C110589b) r10
            int r11 = r10.f330853b
            int r11 = r10.f330854c
            r11 = r11 & r6
            if (r11 == 0) goto L_0x0069
            r7.add(r10)
            goto L_0x0069
        L_0x0080:
            java.util.Map<java.lang.Integer, java.lang.CharSequence> r0 = r2.f327514m
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.clear()
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r0 = r2.f327510i
            boolean r0 = r0.mo153982Q()
            if (r0 == 0) goto L_0x01f0
            java.lang.String r0 = "tryGetMenus"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            long r10 = java.lang.System.currentTimeMillis()
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r0 = r2.f327510i
            android.view.Menu r12 = r2.f327513l
            if (r12 != 0) goto L_0x00a7
            nj3.e0 r12 = new nj3.e0
            android.content.Context r13 = r2.f327509h
            r12.<init>(r13)
            r2.f327513l = r12
        L_0x00a7:
            android.view.Menu r12 = r2.f327513l
            nj3.e0 r12 = (nj3.C76874e0) r12
            r12.clear()
            android.widget.TextView r0 = r0.getAdaptText()
            android.view.Menu r12 = r2.f327513l
            if (r0 != 0) goto L_0x00bd
            java.lang.String r0 = "populateMenuItems fail null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            goto L_0x015d
        L_0x00bd:
            java.lang.Class<android.widget.TextView> r13 = android.widget.TextView.class
            java.lang.String r14 = "mEditor"
            java.lang.reflect.Field r13 = r13.getDeclaredField(r14)     // Catch:{ all -> 0x014b }
            r13.setAccessible(r5)     // Catch:{ all -> 0x014b }
            java.lang.Object r13 = r13.get(r0)     // Catch:{ all -> 0x014b }
            java.lang.String r14 = "android.widget.Editor"
            java.lang.Class r14 = java.lang.Class.forName(r14)     // Catch:{ all -> 0x014b }
            java.lang.String r15 = "android.widget.Editor$TextActionModeCallback"
            java.lang.Class r15 = java.lang.Class.forName(r15)     // Catch:{ all -> 0x014b }
            r8 = 2131315150(0x7f0949ce, float:1.8248745E38)
            java.lang.Object r16 = r0.getTag(r8)     // Catch:{ all -> 0x014b }
            if (r16 != 0) goto L_0x0122
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x014b }
            r5 = 28
            if (r8 < r5) goto L_0x0106
            java.lang.Class[] r5 = new java.lang.Class[r9]     // Catch:{ all -> 0x0148 }
            r5[r4] = r14     // Catch:{ all -> 0x0148 }
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0148 }
            r14 = 1
            r5[r14] = r8     // Catch:{ all -> 0x0148 }
            java.lang.reflect.Constructor r5 = r15.getDeclaredConstructor(r5)     // Catch:{ all -> 0x0148 }
            r5.setAccessible(r14)     // Catch:{ all -> 0x0148 }
            java.lang.Object[] r8 = new java.lang.Object[r9]     // Catch:{ all -> 0x0148 }
            r8[r4] = r13     // Catch:{ all -> 0x0148 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x0148 }
            r8[r14] = r13     // Catch:{ all -> 0x0148 }
            java.lang.Object r16 = r5.newInstance(r8)     // Catch:{ all -> 0x0148 }
            goto L_0x0122
        L_0x0106:
            java.lang.Class[] r5 = new java.lang.Class[r9]     // Catch:{ all -> 0x0148 }
            r5[r4] = r14     // Catch:{ all -> 0x0148 }
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0148 }
            r14 = 1
            r5[r14] = r8     // Catch:{ all -> 0x0148 }
            java.lang.reflect.Constructor r5 = r15.getDeclaredConstructor(r5)     // Catch:{ all -> 0x0148 }
            r5.setAccessible(r14)     // Catch:{ all -> 0x0148 }
            java.lang.Object[] r8 = new java.lang.Object[r9]     // Catch:{ all -> 0x0148 }
            r8[r4] = r13     // Catch:{ all -> 0x0148 }
            java.lang.Boolean r13 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0148 }
            r8[r14] = r13     // Catch:{ all -> 0x0148 }
            java.lang.Object r16 = r5.newInstance(r8)     // Catch:{ all -> 0x0148 }
        L_0x0122:
            r5 = r16
            java.lang.String r8 = "populateMenuWithItems"
            r13 = 1
            java.lang.Class[] r14 = new java.lang.Class[r13]     // Catch:{ all -> 0x0148 }
            java.lang.Class<android.view.Menu> r16 = android.view.Menu.class
            r14[r4] = r16     // Catch:{ all -> 0x0148 }
            java.lang.reflect.Method r8 = r15.getDeclaredMethod(r8, r14)     // Catch:{ all -> 0x0148 }
            r8.setAccessible(r13)     // Catch:{ all -> 0x0148 }
            java.lang.Object[] r14 = new java.lang.Object[r13]     // Catch:{ all -> 0x0148 }
            r14[r4] = r12     // Catch:{ all -> 0x0148 }
            r8.invoke(r5, r14)     // Catch:{ all -> 0x0148 }
            r8 = 2131315150(0x7f0949ce, float:1.8248745E38)
            r0.setTag(r8, r5)     // Catch:{ all -> 0x0148 }
            java.lang.String r0 = "populateMenuItems succ"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)     // Catch:{ all -> 0x0148 }
            r14 = 1
            goto L_0x015e
        L_0x0148:
            r0 = move-exception
            r5 = 1
            goto L_0x014c
        L_0x014b:
            r0 = move-exception
        L_0x014c:
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r8[r4] = r0
            java.lang.String r0 = "populateMenuItems err:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r0, r8)
            r0 = 5
            jo3.C76430b.m91852a(r0)
        L_0x015d:
            r14 = 0
        L_0x015e:
            android.view.Menu r0 = r2.f327513l
            if (r0 == 0) goto L_0x01c5
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r5 = r2.f327510i
            java.util.Set r5 = r5.getReuseItems()
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x01c5
            r5 = 0
        L_0x016f:
            r8 = r0
            nj3.e0 r8 = (nj3.C76874e0) r8
            int r12 = r8.size()
            if (r5 >= r12) goto L_0x01c5
            android.view.MenuItem r8 = r8.getItem(r5)
            r12 = 1
            java.lang.Object[] r13 = new java.lang.Object[r12]
            java.lang.CharSequence r15 = r8.getTitle()
            r13[r4] = r15
            java.lang.String r15 = "filterReuseMenus:%s"
            java.lang.String r13 = java.lang.String.format(r15, r13)
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r13)
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r13 = r2.f327510i
            java.util.Set r13 = r13.getReuseItems()
            java.lang.CharSequence r15 = r8.getTitle()
            boolean r13 = r13.contains(r15)
            if (r13 == 0) goto L_0x01c2
            java.lang.Object[] r13 = new java.lang.Object[r12]
            java.lang.CharSequence r12 = r8.getTitle()
            r13[r4] = r12
            java.lang.String r12 = "reuse bingo:%s"
            java.lang.String r12 = java.lang.String.format(r12, r13)
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r12)
            java.util.Map<java.lang.Integer, java.lang.CharSequence> r12 = r2.f327514m
            int r13 = r8.getItemId()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.CharSequence r8 = r8.getTitle()
            java.util.HashMap r12 = (java.util.HashMap) r12
            r12.put(r13, r8)
        L_0x01c2:
            int r5 = r5 + 1
            goto L_0x016f
        L_0x01c5:
            long r12 = java.lang.System.currentTimeMillis()
            long r12 = r12 - r10
            r5 = 4
            java.lang.Object[] r0 = new java.lang.Object[r5]
            int r5 = android.os.Build.VERSION.SDK_INT
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0[r4] = r5
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r8 = 1
            r0[r8] = r5
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r14)
            r0[r9] = r5
            r5 = 3
            java.lang.Long r8 = java.lang.Long.valueOf(r12)
            r0[r5] = r8
            java.lang.String r5 = "startInsertionActionMode SDK_INT:%s, exemptRes:%s ,res:%s, duration:%s"
            java.lang.String r0 = java.lang.String.format(r5, r0)
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
        L_0x01f0:
            java.util.Map<java.lang.Integer, java.lang.CharSequence> r0 = r2.f327514m
            java.util.HashMap r0 = (java.util.HashMap) r0
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x022f
            java.util.Map<java.lang.Integer, java.lang.CharSequence> r0 = r2.f327514m
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0206:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x022f
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            ro3.j$b r5 = new ro3.j$b
            java.lang.Object r8 = r3.getValue()
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            java.lang.String r8 = r8.toString()
            java.lang.Object r3 = r3.getKey()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r5.<init>(r8, r3)
            r7.add(r5)
            goto L_0x0206
        L_0x022f:
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r0 = r2.f327510i
            ro3.j$c r0 = r0.getMenuCallback()
            if (r0 == 0) goto L_0x0240
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r0 = r2.f327510i
            ro3.j$c r0 = r0.getMenuCallback()
            r0.mo14785a(r7, r6)
        L_0x0240:
            lo3.a$d r0 = r2.f327506e
            r0.f327521d = r7
            r0.notifyDataSetChanged()
            r3 = 1
            r2.mo160608a(r3)
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r0 = r2.f327510i
            com.tencent.mm.ui.widget.cedit.edit.a r0 = r0.getEditor()
            com.tencent.mm.ui.widget.cedit.edit.a$r r2 = r2.f327516o
            com.tencent.mm.ui.widget.cedit.edit.a$n r0 = r0.mo154310o()
            r0.mo154367a(r2, r4)
            r1.f319390a0 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.mo154293I():void");
    }

    /* renamed from: J */
    public final void mo154294J() {
        mo154311p().getClass();
        this.f319383U.getClass();
        int selectionStart = this.f319383U.getSelectionStart();
        int selectionEnd = this.f319383U.getSelectionEnd();
        CustomTextView customTextView = this.f319383U;
        ClipData.newPlainText((CharSequence) null, customTextView.mo154003e0(customTextView.f319247C.subSequence(selectionStart, selectionEnd)));
        mo154297M();
        if (this.f319394e) {
            mo154312q().mo154378g();
        }
    }

    /* renamed from: K */
    public void mo154295K() {
        Runnable runnable = this.f319378P;
        if (runnable != null) {
            this.f319383U.removeCallbacks(runnable);
        }
        if (!mo154303h()) {
            mo154297M();
            if (Build.VERSION.SDK_INT >= 23) {
                new C106797q(1);
            }
            mo154293I();
            if (!mo154317v() && mo154307l() != null) {
                mo154307l().show();
            }
        }
    }

    /* renamed from: L */
    public void mo154296L(boolean z) {
        C106796p q;
        boolean z2;
        InputMethodManager k;
        C106800c p = mo154311p();
        p.f319535b.getText();
        C106778a aVar = p.f319534a;
        boolean z3 = true;
        if (!aVar.mo154303h()) {
            ActionMode actionMode = aVar.f319392c;
            if (actionMode == null) {
                if (!aVar.f319383U.mo154269y() || !aVar.f319383U.requestFocus()) {
                    Log.m105928w("cmEdit.CMTextView", "TextView does not support text selection. Selection cancelled.");
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2 && aVar.f319383U.mo153978L()) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        new C106797q(0);
                    }
                    aVar.mo154293I();
                    if (!aVar.f319383U.mo153985U()) {
                        aVar.f319383U.mo153986V();
                    }
                    if ((!aVar.mo154317v()) && aVar.f319383U.mo153985U() && !aVar.f319383U.mo153986V() && aVar.f319415z && (k = aVar.mo154306k()) != null) {
                        k.showSoftInput(aVar.f319383U, 0, (ResultReceiver) null);
                    }
                    if (z3 && (q = p.f319534a.mo154312q()) != null && (p.f319535b.mo153986V() || p.f319535b.mo153985U())) {
                        q.show();
                    }
                    p.f319534a.f319364B = false;
                }
            } else if (actionMode != null) {
                actionMode.invalidate();
            }
        }
        z3 = false;
        q.show();
        p.f319534a.f319364B = false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:7|8|9|10|11|12|13) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0049 */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo154297M() {
        /*
            r8 = this;
            android.view.ActionMode r0 = r8.f319392c
            if (r0 == 0) goto L_0x0007
            r0.finish()
        L_0x0007:
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r0 = r8.f319383U
            java.lang.Runnable r1 = r8.f319384V
            r0.removeCallbacks(r1)
            boolean r0 = r8.f319390a0
            if (r0 == 0) goto L_0x0072
            com.tencent.mm.ui.widget.cedit.edit.c r0 = r8.mo154311p()
            r0.getClass()
            r0 = 0
            r8.f319392c = r0
            lo3.a r1 = r8.f319388Z
            r2 = 0
            if (r1 == 0) goto L_0x0052
            java.lang.String r3 = "cmEdit.OperateWindow"
            java.lang.String r4 = "destroy OpWindow@%s"
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x0051 }
            int r7 = r1.hashCode()     // Catch:{ all -> 0x0051 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0051 }
            r6[r2] = r7     // Catch:{ all -> 0x0051 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r6)     // Catch:{ all -> 0x0051 }
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r3 = r1.f327510i     // Catch:{ all -> 0x0049 }
            com.tencent.mm.ui.widget.cedit.edit.a r3 = r3.getEditor()     // Catch:{ all -> 0x0049 }
            com.tencent.mm.ui.widget.cedit.edit.a$r r4 = r1.f327516o     // Catch:{ all -> 0x0049 }
            com.tencent.mm.ui.widget.cedit.edit.a$n r3 = r3.mo154310o()     // Catch:{ all -> 0x0049 }
            r3.mo154368b(r4)     // Catch:{ all -> 0x0049 }
            android.widget.PopupWindow r3 = r1.f327502a     // Catch:{ all -> 0x0049 }
            r3.dismiss()     // Catch:{ all -> 0x0049 }
        L_0x0049:
            android.widget.PopupWindow r3 = r1.f327502a     // Catch:{ all -> 0x0051 }
            r3.setContentView(r0)     // Catch:{ all -> 0x0051 }
            r1.f327512k = r5     // Catch:{ all -> 0x0051 }
            goto L_0x0052
        L_0x0051:
        L_0x0052:
            r8.f319390a0 = r2
            boolean r0 = r8.f319363A
            if (r0 != 0) goto L_0x0069
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r0 = r8.f319383U
            java.lang.CharSequence r0 = r0.getText()
            android.text.Spannable r0 = (android.text.Spannable) r0
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r1 = r8.f319383U
            int r1 = r1.getSelectionEnd()
            android.text.Selection.setSelection(r0, r1)
        L_0x0069:
            com.tencent.mm.ui.widget.cedit.edit.a$p r0 = r8.f319391b
            if (r0 == 0) goto L_0x0070
            r0.mo154375c()
        L_0x0070:
            r8.f319365C = r2
        L_0x0072:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.mo154297M():void");
    }

    /* renamed from: N */
    public final void mo154298N() {
        if (!mo154317v()) {
            this.f319364B = true;
        }
        this.f319363A = true;
        mo154297M();
        this.f319363A = false;
    }

    /* renamed from: d */
    public final int mo154299d(Drawable drawable, float f) {
        int i;
        float max = Math.max(0.5f, f - 0.5f);
        if (this.f319382T == null) {
            this.f319382T = new Rect();
        }
        int i2 = 0;
        if (drawable != null) {
            drawable.getPadding(this.f319382T);
            i2 = drawable.getIntrinsicWidth();
        } else {
            this.f319382T.setEmpty();
        }
        int scrollX = this.f319383U.getScrollX();
        float f2 = max - ((float) scrollX);
        int width = (this.f319383U.getWidth() - this.f319383U.getCompoundPaddingLeft()) - this.f319383U.getCompoundPaddingRight();
        float f3 = (float) width;
        if (f2 >= f3 - 1.0f) {
            return (width + scrollX) - (i2 - this.f319382T.right);
        }
        if (Math.abs(f2) <= 1.0f || (TextUtils.isEmpty(this.f319383U.getText()) && ((float) (1048576 - scrollX)) <= f3 + 1.0f && max <= 1.0f)) {
            i = this.f319382T.left;
        } else {
            scrollX = (int) max;
            i = this.f319382T.left;
        }
        return scrollX - i;
    }

    /* renamed from: e */
    public void mo154300e() {
        if (this.f319399j == null) {
            this.f319399j = new C106787i();
        }
    }

    /* renamed from: f */
    public final void mo154301f() {
        if (!this.f319383U.mo154261u0() && this.f319383U.mo153978L()) {
            Selection.setSelection((Spannable) this.f319383U.getText(), this.f319383U.length(), this.f319383U.length());
        }
    }

    /* renamed from: g */
    public final boolean mo154302g(ExtractedTextRequest extractedTextRequest, int i, int i2, int i3, ExtractedText extractedText) {
        CharSequence text;
        if (extractedTextRequest == null || extractedText == null || (text = this.f319383U.getText()) == null) {
            return false;
        }
        if (i != -2) {
            int length = text.length();
            if (i < 0) {
                extractedText.partialEndOffset = -1;
                extractedText.partialStartOffset = -1;
                i = 0;
            } else {
                int i4 = i2 + i3;
                if (text instanceof Spanned) {
                    Spanned spanned = (Spanned) text;
                    Object[] spans = spanned.getSpans(i, i4, ParcelableSpan.class);
                    int length2 = spans.length;
                    while (length2 > 0) {
                        length2--;
                        int spanStart = spanned.getSpanStart(spans[length2]);
                        if (spanStart < i) {
                            i = spanStart;
                        }
                        int spanEnd = spanned.getSpanEnd(spans[length2]);
                        if (spanEnd > i4) {
                            i4 = spanEnd;
                        }
                    }
                }
                extractedText.partialStartOffset = i;
                extractedText.partialEndOffset = i4 - i3;
                if (i > length) {
                    i = length;
                } else if (i < 0) {
                    i = 0;
                }
                if (i4 <= length) {
                    length = i4 < 0 ? 0 : i4;
                }
            }
            if ((extractedTextRequest.flags & 1) != 0) {
                extractedText.text = text.subSequence(i, length);
            } else {
                extractedText.text = TextUtils.substring(text, i, length);
            }
        } else {
            extractedText.partialStartOffset = 0;
            extractedText.partialEndOffset = 0;
            extractedText.text = "";
        }
        extractedText.flags = 0;
        if (MetaKeyKeyListener.getMetaState(text, 2048) != 0) {
            extractedText.flags |= 2;
        }
        CustomTextView customTextView = this.f319383U;
        if (customTextView.f319283Z0) {
            extractedText.flags |= 1;
        }
        extractedText.startOffset = 0;
        extractedText.selectionStart = customTextView.getSelectionStart();
        extractedText.selectionEnd = this.f319383U.getSelectionEnd();
        if (Build.VERSION.SDK_INT >= 28) {
            extractedText.hint = this.f319383U.getHint();
        }
        return true;
    }

    /* renamed from: h */
    public final boolean mo154303h() {
        this.f319383U.getClass();
        InputMethodManager k = mo154306k();
        return k != null && k.isFullscreenMode();
    }

    /* renamed from: i */
    public void mo154304i(C106788j jVar) {
        InputMethodManager k;
        int i;
        int i2;
        this.f319383U.getClass();
        if (jVar.f319474f || jVar.f319473e) {
            this.f319383U.mo154263v0();
            mo154290E();
        } else if (jVar.f319472d) {
            CustomTextView customTextView = this.f319383U;
            int selectionEnd = customTextView.getSelectionEnd();
            customTextView.mo153979N(selectionEnd, selectionEnd, selectionEnd);
        }
        C106788j jVar2 = this.f319400k;
        if (!(jVar2 == null || jVar2.f319471c > 0 || (k = mo154306k()) == null)) {
            int selectionStart = this.f319383U.getSelectionStart();
            int selectionEnd2 = this.f319383U.getSelectionEnd();
            if (this.f319383U.getText() instanceof Spannable) {
                Spannable spannable = (Spannable) this.f319383U.getText();
                int composingSpanStart = BaseInputConnection.getComposingSpanStart(spannable);
                i = BaseInputConnection.getComposingSpanEnd(spannable);
                i2 = composingSpanStart;
            } else {
                i2 = -1;
                i = -1;
            }
            k.updateSelection(this.f319383U, selectionStart, selectionEnd2, i2, i);
        }
        if (!mo154317v()) {
            C106784f q = this.f319383U.mo153978L() ? mo154312q() : mo154307l();
            if (q != null && !q.mo154327a() && !q.mo154328d()) {
                q.show();
            }
        }
    }

    /* renamed from: j */
    public int mo154305j(Layout layout, int i, float f) {
        int I = this.f319383U.mo153975I(f);
        if (layout == null || i > layout.getLineCount() || layout.getLineCount() <= 0 || i < 0 || Math.abs(I - i) >= 2) {
            return I;
        }
        int lineBottom = layout.getLineBottom(i) - layout.getLineTop(i);
        int max = Math.max(0, Math.max(this.f319387Y, Math.min(this.f319386X, ((int) (((float) (layout.getLineBottom(I) - layout.getLineTop(I))) * 0.5f)) + lineBottom)) - lineBottom);
        float x0 = (float) this.f319383U.mo154268x0();
        return (I <= i || f < ((float) (layout.getLineBottom(i) + max)) + x0) ? (I >= i || f > ((float) (layout.getLineTop(i) - max)) + x0) ? i : I : I;
    }

    /* renamed from: k */
    public final InputMethodManager mo154306k() {
        return Build.VERSION.SDK_INT >= 23 ? (InputMethodManager) this.f319383U.getContext().getSystemService(InputMethodManager.class) : (InputMethodManager) this.f319383U.getContext().getSystemService("input_method");
    }

    /* renamed from: l */
    public C106791l mo154307l() {
        if (!this.f319393d) {
            return null;
        }
        if (this.f319389a == null) {
            this.f319389a = new C106791l();
            this.f319383U.getViewTreeObserver().addOnTouchModeChangeListener(this.f319389a);
        }
        return this.f319389a;
    }

    /* renamed from: m */
    public final int mo154308m(int i, boolean z) {
        Layout layout = this.f319383U.getLayout();
        return layout == null ? i : z == layout.isRtlCharAt(i) ? layout.getOffsetToLeftOf(i) : layout.getOffsetToRightOf(i);
    }

    /* renamed from: n */
    public final long mo154309n(int i, int i2) {
        Layout layout = this.f319383U.getLayout();
        if (layout == null) {
            return C109754a.m149075a(-1, -1);
        }
        CharSequence text = this.f319383U.getText();
        int lineForOffset = layout.getLineForOffset(i);
        while (lineForOffset > 0 && text.charAt(layout.getLineEnd(lineForOffset - 1) - 1) != 10) {
            lineForOffset--;
        }
        int lineForOffset2 = layout.getLineForOffset(i2);
        while (lineForOffset2 < layout.getLineCount() - 1 && text.charAt(layout.getLineEnd(lineForOffset2) - 1) != 10) {
            lineForOffset2++;
        }
        return C109754a.m149075a(layout.getLineStart(lineForOffset), layout.getLineEnd(lineForOffset2));
    }

    /* renamed from: o */
    public final C106794n mo154310o() {
        if (this.f319372J == null) {
            this.f319372J = new C106794n((C106779a) null);
        }
        return this.f319372J;
    }

    /* renamed from: p */
    public final C106800c mo154311p() {
        if (this.f319366D == null) {
            this.f319366D = new C106800c(this);
        }
        return this.f319366D;
    }

    /* renamed from: q */
    public C106796p mo154312q() {
        if (!this.f319394e) {
            return null;
        }
        if (this.f319391b == null) {
            this.f319391b = new C106796p();
            this.f319383U.getViewTreeObserver().addOnTouchModeChangeListener(this.f319391b);
        }
        return this.f319391b;
    }

    /* renamed from: r */
    public final C110057b mo154313r() {
        if (this.f319380R == null) {
            this.f319380R = new C110057b(this.f319383U.getTextServicesLocale());
            this.f319381S = true;
        }
        if (this.f319381S) {
            CharSequence text = this.f319383U.getText();
            this.f319380R.mo161417i(text, 0, text.length());
            this.f319381S = false;
        }
        return this.f319380R;
    }

    /* renamed from: s */
    public void mo154314s(int i) {
        this.f319383U.removeCallbacks(this.f319384V);
        C109405a aVar = this.f319388Z;
        if (aVar != null) {
            try {
                C106778a editor = aVar.f327510i.getEditor();
                editor.mo154310o().mo154368b(aVar.f327516o);
                aVar.f327502a.dismiss();
            } catch (Throwable unused) {
            }
        }
        ActionMode actionMode = this.f319392c;
        if (actionMode != null && Build.VERSION.SDK_INT >= 23) {
            actionMode.hide((long) i);
        }
    }

    /* renamed from: t */
    public void mo154315t() {
        C106789k kVar;
        C106791l lVar = this.f319389a;
        if (lVar != null && (kVar = lVar.f319485d) != null) {
            kVar.mo154345i();
        }
    }

    /* renamed from: u */
    public void mo154316u() {
        ActionMode actionMode;
        C106789k kVar;
        C106796p pVar = this.f319391b;
        if (pVar != null) {
            C106795o oVar = pVar.f319516d;
            if (oVar != null) {
                oVar.invalidate();
            }
            C106795o oVar2 = pVar.f319517e;
            if (oVar2 != null) {
                oVar2.invalidate();
            }
        }
        C106791l lVar = this.f319389a;
        if (!(lVar == null || (kVar = lVar.f319485d) == null)) {
            kVar.invalidate();
        }
        if (!mo154317v() && (actionMode = this.f319392c) != null) {
            actionMode.invalidate();
        }
    }

    /* renamed from: v */
    public boolean mo154317v() {
        return this.f319392c == null && !this.f319390a0;
    }

    /* renamed from: w */
    public final boolean mo154318w() {
        SuggestionSpan[] suggestionSpanArr = (SuggestionSpan[]) ((Spannable) this.f319383U.getText()).getSpans(this.f319383U.getSelectionStart(), this.f319383U.getSelectionEnd(), SuggestionSpan.class);
        for (SuggestionSpan flags : suggestionSpanArr) {
            if ((flags.getFlags() & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: x */
    public final boolean mo154319x(float f, float f2) {
        Layout layout = this.f319383U.getLayout();
        if (layout == null) {
            return false;
        }
        int I = this.f319383U.mo153975I(f2);
        float B = this.f319383U.mo153969B(f);
        return B >= layout.getLineLeft(I) && B <= layout.getLineRight(I);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008a, code lost:
        r5 = mo154312q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        r0 = mo154307l();
     */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo154320y(boolean r5) {
        /*
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.f319371I
            r1 = 1
            if (r0 == 0) goto L_0x0007
            if (r5 == 0) goto L_0x0040
        L_0x0007:
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r0 = r4.f319383U
            android.graphics.drawable.Drawable r0 = r0.getTextSelectHandle()
            r4.f319371I = r0
            if (r0 == 0) goto L_0x0028
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r0 = r4.f319383U
            android.content.Context r0 = r0.getContext()
            android.graphics.drawable.Drawable r2 = r4.f319371I
            r3 = 23
            android.graphics.drawable.Drawable r0 = m144250F(r0, r2, r3)
            r4.f319371I = r0
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r2 = r4.f319383U
            int r2 = r2.f319252E1
            r0.setTint(r2)
        L_0x0028:
            boolean r0 = r4.f319393d
            if (r0 == 0) goto L_0x0040
            com.tencent.mm.ui.widget.cedit.edit.a$l r0 = r4.mo154307l()
            com.tencent.mm.ui.widget.cedit.edit.a$k r2 = r0.f319485d
            if (r2 != 0) goto L_0x0035
            goto L_0x0040
        L_0x0035:
            com.tencent.mm.ui.widget.cedit.edit.a r0 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
            android.graphics.drawable.Drawable r0 = r0.f319371I
            r2.f319442e = r0
            r2.f319443f = r0
            r2.mo154357p(r1)
        L_0x0040:
            android.graphics.drawable.Drawable r0 = r4.f319369G
            if (r0 == 0) goto L_0x004a
            android.graphics.drawable.Drawable r0 = r4.f319370H
            if (r0 == 0) goto L_0x004a
            if (r5 == 0) goto L_0x00af
        L_0x004a:
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r5 = r4.f319383U
            android.graphics.drawable.Drawable r5 = r5.getTextSelectHandleLeft()
            r4.f319369G = r5
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r5 = r4.f319383U
            android.content.Context r5 = r5.getContext()
            android.graphics.drawable.Drawable r0 = r4.f319369G
            r2 = 21
            android.graphics.drawable.Drawable r5 = m144250F(r5, r0, r2)
            r4.f319369G = r5
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r0 = r4.f319383U
            int r0 = r0.f319252E1
            r5.setTint(r0)
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r5 = r4.f319383U
            android.graphics.drawable.Drawable r5 = r5.getTextSelectHandleRight()
            r4.f319370H = r5
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r5 = r4.f319383U
            android.content.Context r5 = r5.getContext()
            android.graphics.drawable.Drawable r0 = r4.f319370H
            android.graphics.drawable.Drawable r5 = m144250F(r5, r0, r2)
            r4.f319370H = r5
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r0 = r4.f319383U
            int r0 = r0.f319252E1
            r5.setTint(r0)
            boolean r5 = r4.f319394e
            if (r5 == 0) goto L_0x00af
            com.tencent.mm.ui.widget.cedit.edit.a$p r5 = r4.mo154312q()
            com.tencent.mm.ui.widget.cedit.edit.a$o r0 = r5.f319516d
            if (r0 != 0) goto L_0x0093
            goto L_0x00af
        L_0x0093:
            com.tencent.mm.ui.widget.cedit.edit.a r2 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
            android.graphics.drawable.Drawable r3 = r2.f319369G
            android.graphics.drawable.Drawable r2 = r2.f319370H
            r0.f319442e = r3
            r0.f319443f = r2
            r0.mo154357p(r1)
            com.tencent.mm.ui.widget.cedit.edit.a$o r0 = r5.f319517e
            com.tencent.mm.ui.widget.cedit.edit.a r5 = com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.this
            android.graphics.drawable.Drawable r2 = r5.f319370H
            android.graphics.drawable.Drawable r5 = r5.f319369G
            r0.f319442e = r2
            r0.f319443f = r5
            r0.mo154357p(r1)
        L_0x00af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a.mo154320y(boolean):void");
    }

    /* renamed from: z */
    public void mo154321z() {
        if (mo154292H()) {
            this.f319408s = SystemClock.uptimeMillis();
            if (this.f319410u == null) {
                this.f319410u = new C106782d((C106779a) null);
            }
            this.f319383U.removeCallbacks(this.f319410u);
            this.f319383U.postDelayed(this.f319410u, 500);
            return;
        }
        C106782d dVar = this.f319410u;
        if (dVar != null) {
            this.f319383U.removeCallbacks(dVar);
        }
    }
}
