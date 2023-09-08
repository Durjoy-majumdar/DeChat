package l40;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Point;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import m40.C99786a;
import n40.C100069b;

/* renamed from: l40.g */
public class C99340g {

    /* renamed from: a */
    public C99339f f291302a;

    /* renamed from: b */
    public C99786a f291303b;

    /* renamed from: c */
    public CharSequence f291304c = null;

    /* renamed from: d */
    public StaticLayout f291305d;

    /* renamed from: e */
    public boolean f291306e = false;

    /* renamed from: f */
    public int f291307f;

    /* renamed from: g */
    public int f291308g;

    /* renamed from: h */
    public boolean f291309h = false;

    /* renamed from: i */
    public boolean f291310i = false;

    /* renamed from: j */
    public boolean f291311j = false;

    /* renamed from: k */
    public boolean f291312k = false;

    /* renamed from: l */
    public View f291313l;

    /* renamed from: m */
    public int f291314m = 0;

    /* renamed from: n */
    public int f291315n = 0;

    public C99340g(View view, C99786a aVar) {
        this.f291313l = view;
        this.f291303b = aVar;
    }

    /* renamed from: a */
    public int mo138737a() {
        TextPaint paint = this.f291302a.f291301k.getPaint();
        if (paint == null) {
            paint = this.f291303b.f292456d;
        }
        C99786a aVar = this.f291303b;
        return Math.round((((float) paint.getFontMetricsInt((Paint.FontMetricsInt) null)) * aVar.f292462j) + aVar.f292461i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0094, code lost:
        if (r4 == 8388613) goto L_0x009c;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo138738b(android.graphics.Canvas r7) {
        /*
            r6 = this;
            android.text.StaticLayout r0 = r6.f291305d
            if (r0 == 0) goto L_0x00f9
            l40.f r0 = r6.f291302a
            if (r0 != 0) goto L_0x000a
            goto L_0x00f9
        L_0x000a:
            r7.save()
            android.view.View r0 = r6.f291313l
            int r0 = r0.getPaddingLeft()
            android.view.View r1 = r6.f291313l
            int r1 = r1.getPaddingTop()
            android.view.View r2 = r6.f291313l
            int r2 = r2.getRight()
            android.view.View r3 = r6.f291313l
            int r3 = r3.getLeft()
            int r2 = r2 - r3
            android.view.View r3 = r6.f291313l
            int r3 = r3.getPaddingRight()
            int r2 = r2 - r3
            android.view.View r3 = r6.f291313l
            int r3 = r3.getBottom()
            android.view.View r4 = r6.f291313l
            int r4 = r4.getTop()
            int r3 = r3 - r4
            android.view.View r4 = r6.f291313l
            int r4 = r4.getPaddingBottom()
            int r3 = r3 - r4
            r7.clipRect(r0, r1, r2, r3)
            int r0 = r6.f291307f
            r1 = 0
            if (r0 == 0) goto L_0x004d
            int r0 = r6.f291308g
            if (r0 != 0) goto L_0x00e6
        L_0x004d:
            android.view.View r0 = r6.f291313l
            int r0 = r0.getPaddingLeft()
            android.view.View r2 = r6.f291313l
            int r2 = r2.getRight()
            android.view.View r3 = r6.f291313l
            int r3 = r3.getLeft()
            int r2 = r2 - r3
            android.view.View r3 = r6.f291313l
            int r3 = r3.getPaddingLeft()
            int r2 = r2 - r3
            android.view.View r3 = r6.f291313l
            int r3 = r3.getPaddingRight()
            int r2 = r2 - r3
            android.text.StaticLayout r3 = r6.f291305d
            int r3 = r3.getWidth()
            if (r3 <= r2) goto L_0x0077
            goto L_0x009e
        L_0x0077:
            l40.f r4 = r6.f291302a
            int r4 = r4.f291299i
            r5 = 8388615(0x800007, float:1.1754953E-38)
            r4 = r4 & r5
            r5 = 1
            if (r4 == r5) goto L_0x0098
            r5 = 3
            if (r4 == r5) goto L_0x0096
            r5 = 5
            if (r4 == r5) goto L_0x009c
            r5 = 17
            if (r4 == r5) goto L_0x0098
            r5 = 8388611(0x800003, float:1.1754948E-38)
            if (r4 == r5) goto L_0x0096
            r5 = 8388613(0x800005, float:1.175495E-38)
            if (r4 == r5) goto L_0x009c
        L_0x0096:
            r2 = 0
            goto L_0x009d
        L_0x0098:
            int r2 = r2 / 2
            int r3 = r3 / 2
        L_0x009c:
            int r2 = r2 - r3
        L_0x009d:
            int r0 = r0 + r2
        L_0x009e:
            r6.f291307f = r0
            android.view.View r0 = r6.f291313l
            int r0 = r0.getPaddingTop()
            android.view.View r2 = r6.f291313l
            int r2 = r2.getBottom()
            android.view.View r3 = r6.f291313l
            int r3 = r3.getTop()
            int r2 = r2 - r3
            android.view.View r3 = r6.f291313l
            int r3 = r3.getPaddingTop()
            int r2 = r2 - r3
            android.view.View r3 = r6.f291313l
            int r3 = r3.getPaddingBottom()
            int r2 = r2 - r3
            android.text.StaticLayout r3 = r6.f291305d
            int r3 = r3.getHeight()
            if (r3 <= r2) goto L_0x00ca
            goto L_0x00e4
        L_0x00ca:
            l40.f r4 = r6.f291302a
            int r4 = r4.f291299i
            r4 = r4 & 112(0x70, float:1.57E-43)
            r5 = 16
            if (r4 == r5) goto L_0x00de
            r5 = 48
            if (r4 == r5) goto L_0x00dc
            r5 = 80
            if (r4 == r5) goto L_0x00e2
        L_0x00dc:
            r2 = 0
            goto L_0x00e3
        L_0x00de:
            int r2 = r2 / 2
            int r3 = r3 / 2
        L_0x00e2:
            int r2 = r2 - r3
        L_0x00e3:
            int r0 = r0 + r2
        L_0x00e4:
            r6.f291308g = r0
        L_0x00e6:
            int r0 = r6.f291307f
            float r0 = (float) r0
            int r2 = r6.f291308g
            float r2 = (float) r2
            r7.translate(r0, r2)
            android.text.StaticLayout r0 = r6.f291305d
            r2 = 0
            r0.draw(r7, r2, r2, r1)
            r7.restore()
            return
        L_0x00f9:
            android.view.View r7 = r6.f291313l
            int r7 = r7.getMeasuredWidth()
            boolean r7 = r6.mo138741e(r7)
            if (r7 == 0) goto L_0x010f
            android.view.View r7 = r6.f291313l
            r7.requestLayout()
            android.view.View r7 = r6.f291313l
            r7.invalidate()
        L_0x010f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l40.C99340g.mo138738b(android.graphics.Canvas):void");
    }

    /* renamed from: c */
    public Point mo138739c(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        mo138741e(size);
        StaticLayout staticLayout = this.f291305d;
        if (staticLayout == null) {
            return null;
        }
        if (mode != 1073741824) {
            int i3 = 0;
            if (this.f291303b.f292458f == null) {
                int i4 = this.f291314m;
                if (i4 != 0) {
                    i3 = i4;
                } else {
                    int lineCount = staticLayout.getLineCount();
                    CharSequence text = staticLayout.getText();
                    float f = 0.0f;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= lineCount - 1) {
                            while (i3 < lineCount) {
                                f = Math.max(f, staticLayout.getLineWidth(i3));
                                i3++;
                            }
                            int ceil = (int) Math.ceil((double) f);
                            this.f291314m = ceil;
                            int paddingLeft = ceil + this.f291313l.getPaddingLeft() + this.f291313l.getPaddingRight();
                            this.f291314m = paddingLeft;
                            i3 = paddingLeft;
                        } else if (text.charAt(staticLayout.getLineEnd(i5) - 1) != 10) {
                            i3 = -1;
                            break;
                        } else {
                            i5++;
                        }
                    }
                }
            }
            int ceil2 = (int) Math.ceil((double) Layout.getDesiredWidth(this.f291305d.getText(), this.f291305d.getPaint()));
            if (ceil2 > i3) {
                i3 = ceil2;
            }
            size = mode == Integer.MIN_VALUE ? Math.min(size, i3) : i3;
        }
        if (mode2 != 1073741824) {
            StaticLayout staticLayout2 = this.f291305d;
            int i6 = this.f291315n;
            if (i6 == 0) {
                int lineCount2 = staticLayout2.getLineCount();
                int i7 = this.f291302a.f291292b;
                if (i7 > 0 && i7 < lineCount2) {
                    lineCount2 = i7;
                }
                int paddingTop = this.f291313l.getPaddingTop() + this.f291313l.getPaddingBottom();
                int lineTop = staticLayout2.getLineTop(lineCount2);
                int i8 = this.f291303b.f292454b;
                if (i8 > 0 && lineCount2 < i8) {
                    lineTop += mo138737a() * (this.f291303b.f292454b - lineCount2);
                }
                i6 = lineTop + paddingTop;
                this.f291315n = i6;
            }
            size2 = mode2 == Integer.MIN_VALUE ? Math.min(i6, size2) : i6;
        }
        return new Point(size, size2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f6  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo138740d(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getAction()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x0012
            int r0 = r12.getAction()
            r3 = 3
            if (r0 != r3) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            r0 = 0
            goto L_0x0013
        L_0x0012:
            r0 = 1
        L_0x0013:
            android.view.View r3 = r11.f291313l
            boolean r3 = r3.isEnabled()
            if (r3 == 0) goto L_0x012a
            boolean r3 = r11.f291309h
            if (r3 == 0) goto L_0x012a
            n40.b r3 = n40.C100069b.f293130a
            if (r3 != 0) goto L_0x002a
            n40.b r3 = new n40.b
            r3.<init>()
            n40.C100069b.f293130a = r3
        L_0x002a:
            n40.b r3 = n40.C100069b.f293130a
            android.view.View r4 = r11.f291313l
            android.text.StaticLayout r5 = r11.f291305d
            java.lang.CharSequence r6 = r11.f291304c
            android.text.Spannable r6 = (android.text.Spannable) r6
            r3.getClass()
            int r3 = r12.getAction()
            boolean r7 = r4 instanceof l40.C99334a
            if (r7 != 0) goto L_0x0041
            goto L_0x00b4
        L_0x0041:
            l40.a r4 = (l40.C99334a) r4
            if (r3 == r2) goto L_0x0047
            if (r3 != 0) goto L_0x00b4
        L_0x0047:
            float r7 = r12.getX()
            int r7 = (int) r7
            float r8 = r12.getY()
            int r8 = (int) r8
            int r9 = r4.getHorizontalDrawOffset()
            if (r7 < r9) goto L_0x00b4
            int r9 = r5.getWidth()
            int r10 = r4.getHorizontalDrawOffset()
            int r9 = r9 + r10
            if (r7 <= r9) goto L_0x0063
            goto L_0x00b4
        L_0x0063:
            int r9 = r4.getVerticalDrawOffset()
            if (r8 < r9) goto L_0x00b4
            int r9 = r5.getHeight()
            int r10 = r4.getVerticalDrawOffset()
            int r9 = r9 + r10
            if (r8 <= r9) goto L_0x0075
            goto L_0x00b4
        L_0x0075:
            int r9 = r4.getHorizontalDrawOffset()
            int r7 = r7 - r9
            int r9 = r4.getVerticalDrawOffset()
            int r8 = r8 - r9
            int r9 = r4.getScrollX()
            int r7 = r7 + r9
            int r4 = r4.getScrollY()
            int r8 = r8 + r4
            int r4 = r5.getLineForVertical(r8)
            float r7 = (float) r7
            int r4 = r5.getOffsetForHorizontal(r4, r7)
            java.lang.Class<android.text.style.ClickableSpan> r5 = android.text.style.ClickableSpan.class
            java.lang.Object[] r4 = r6.getSpans(r4, r4, r5)
            android.text.style.ClickableSpan[] r4 = (android.text.style.ClickableSpan[]) r4
            int r5 = r4.length
            if (r5 == 0) goto L_0x00b1
            if (r3 != r2) goto L_0x00a0
            goto L_0x00af
        L_0x00a0:
            r3 = r4[r1]
            int r3 = r6.getSpanStart(r3)
            r4 = r4[r1]
            int r4 = r6.getSpanEnd(r4)
            android.text.Selection.setSelection(r6, r3, r4)
        L_0x00af:
            r3 = 1
            goto L_0x00b5
        L_0x00b1:
            android.text.Selection.removeSelection(r6)
        L_0x00b4:
            r3 = 0
        L_0x00b5:
            r11.f291312k = r3
            boolean r4 = r11.f291311j
            if (r4 == 0) goto L_0x0129
            if (r0 == 0) goto L_0x0129
            float r0 = r12.getX()
            float r12 = r12.getY()
            int r4 = r11.f291307f
            float r4 = (float) r4
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 < 0) goto L_0x00f3
            android.text.StaticLayout r4 = r11.f291305d
            int r4 = r4.getWidth()
            int r5 = r11.f291307f
            int r4 = r4 + r5
            float r4 = (float) r4
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00db
            goto L_0x00f3
        L_0x00db:
            int r0 = r11.f291308g
            float r0 = (float) r0
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00f3
            android.text.StaticLayout r0 = r11.f291305d
            int r0 = r0.getHeight()
            int r4 = r11.f291308g
            int r0 = r0 + r4
            float r0 = (float) r0
            int r12 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r12 <= 0) goto L_0x00f1
            goto L_0x00f3
        L_0x00f1:
            r12 = 1
            goto L_0x00f4
        L_0x00f3:
            r12 = 0
        L_0x00f4:
            if (r12 == 0) goto L_0x0129
            java.lang.CharSequence r12 = r11.f291304c
            r0 = r12
            android.text.Spannable r0 = (android.text.Spannable) r0
            r4 = -1
            if (r12 != 0) goto L_0x0100
            r12 = -1
            goto L_0x0104
        L_0x0100:
            int r12 = android.text.Selection.getSelectionStart(r12)
        L_0x0104:
            java.lang.CharSequence r5 = r11.f291304c
            if (r5 != 0) goto L_0x0109
            goto L_0x010d
        L_0x0109:
            int r4 = android.text.Selection.getSelectionEnd(r5)
        L_0x010d:
            java.lang.Class<android.text.style.ClickableSpan> r5 = android.text.style.ClickableSpan.class
            java.lang.Object[] r12 = r0.getSpans(r12, r4, r5)
            android.text.style.ClickableSpan[] r12 = (android.text.style.ClickableSpan[]) r12
            int r0 = r12.length
            if (r0 <= 0) goto L_0x0129
            java.lang.String r0 = "MicroMsg.StaticTextViewHolder"
            java.lang.String r3 = "perform clickable span click"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r3)
            r12 = r12[r1]
            android.view.View r0 = r11.f291313l
            r12.onClick(r0)
            r1 = 1
            goto L_0x012a
        L_0x0129:
            r1 = r3
        L_0x012a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l40.C99340g.mo138740d(android.view.MotionEvent):boolean");
    }

    /* renamed from: e */
    public final boolean mo138741e(int i) {
        if ((!this.f291306e && this.f291302a != null && this.f291305d != null) || this.f291303b == null || i <= 0) {
            return false;
        }
        mo138742f();
        C99339f a = C99337d.m129495d(this.f291304c, i, this.f291303b).mo138734a();
        this.f291302a = a;
        this.f291305d = a.f291301k;
        this.f291306e = false;
        return true;
    }

    /* renamed from: f */
    public final void mo138742f() {
        this.f291315n = 0;
        this.f291314m = 0;
        this.f291307f = 0;
        this.f291308g = 0;
    }

    /* renamed from: g */
    public void mo138743g(int i) {
        C99786a aVar = this.f291303b;
        if (aVar.f292453a != i || aVar.f292454b != i) {
            this.f291306e = true;
            mo138742f();
            C99786a aVar2 = this.f291303b;
            aVar2.f292453a = i;
            aVar2.f292454b = i;
            this.f291313l.requestLayout();
            this.f291313l.invalidate();
        }
    }

    /* renamed from: h */
    public void mo138744h(boolean z) {
        int i = z ? 1 : Integer.MAX_VALUE;
        C99786a aVar = this.f291303b;
        if (aVar.f292453a != i) {
            aVar.f292453a = i;
            this.f291306e = true;
            mo138742f();
            this.f291313l.requestLayout();
            this.f291313l.invalidate();
        }
    }

    /* renamed from: i */
    public void mo138745i(CharSequence charSequence, boolean z) {
        if (charSequence != null) {
            CharSequence charSequence2 = this.f291304c;
            if (charSequence2 == null || !charSequence.equals(charSequence2) || z) {
                this.f291304c = charSequence;
                this.f291306e = true;
                this.f291313l.requestLayout();
                this.f291313l.invalidate();
            }
        }
    }

    /* renamed from: j */
    public void mo138746j(C99339f fVar) {
        if (fVar == null || fVar.f291301k == null) {
            this.f291302a = null;
            return;
        }
        if (this.f291303b == null) {
            C99786a aVar = new C99786a();
            aVar.f292453a = fVar.f291292b;
            aVar.f292455c = fVar.f291293c;
            TextPaint textPaint = fVar.f291296f;
            aVar.f292456d = textPaint;
            aVar.f292457e = fVar.f291297g;
            aVar.f292458f = fVar.f291298h;
            aVar.f292459g = fVar.f291299i;
            aVar.f292464l = textPaint.getTextSize();
            aVar.f292465m = fVar.f291296f.getColor();
            aVar.f292467o = fVar.f291300j;
            this.f291303b = aVar;
        }
        mo138742f();
        boolean z = false;
        this.f291313l.setWillNotDraw(false);
        this.f291302a = fVar;
        this.f291305d = fVar.f291301k;
        CharSequence charSequence = fVar.f291295e;
        this.f291304c = charSequence;
        boolean z2 = charSequence instanceof Spannable;
        this.f291309h = z2;
        if (z2) {
            this.f291304c = charSequence;
            if (C100069b.f293130a == null) {
                C100069b.f293130a = new C100069b();
            }
            C100069b bVar = C100069b.f293130a;
            Spannable spannable = (Spannable) this.f291304c;
            bVar.getClass();
            Selection.removeSelection(spannable);
            spannable.removeSpan(C100069b.f293131b);
        }
        if (this.f291304c == null) {
            Object[] objArr = new Object[3];
            objArr[0] = Boolean.valueOf(fVar.f291295e == null);
            if (this.f291302a.f291295e == null) {
                z = true;
            }
            objArr[1] = Boolean.valueOf(z);
            objArr[2] = Util.getStack();
            Log.m105921e("MicroMsg.StaticTextViewHolder", "text is null, [%b, %b, %s]", objArr);
        }
        this.f291313l.requestLayout();
        this.f291313l.invalidate();
    }

    /* renamed from: k */
    public void mo138747k(int i, float f) {
        C99786a aVar;
        Context context = MMApplicationContext.getContext();
        float applyDimension = TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        if (applyDimension != 0.0f && (aVar = this.f291303b) != null && applyDimension != aVar.f292464l) {
            aVar.f292464l = applyDimension;
            this.f291306e = true;
        }
    }
}
