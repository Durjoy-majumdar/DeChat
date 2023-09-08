package com.tencent.p014mm.plugin.webview.p128ui.tools.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI$$l0;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.FontChooserView */
public class FontChooserView extends View {

    /* renamed from: v */
    public static SoftReference<Bitmap> f211271v = null;

    /* renamed from: w */
    public static int f211272w = 8;

    /* renamed from: d */
    public List<C72628b> f211273d = new ArrayList(8);

    /* renamed from: e */
    public int f211274e = 0;

    /* renamed from: f */
    public int f211275f = 0;

    /* renamed from: g */
    public int f211276g = 0;

    /* renamed from: h */
    public int f211277h = 0;

    /* renamed from: i */
    public float f211278i = 0.0f;

    /* renamed from: j */
    public float f211279j = 0.0f;

    /* renamed from: n */
    public int f211280n = 0;

    /* renamed from: o */
    public int f211281o = 0;

    /* renamed from: p */
    public int f211282p = 0;

    /* renamed from: q */
    public int f211283q = 0;

    /* renamed from: r */
    public int f211284r = 0;

    /* renamed from: s */
    public C44211a f211285s = null;

    /* renamed from: t */
    public boolean f211286t = false;

    /* renamed from: u */
    public boolean f211287u = false;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.FontChooserView$a */
    public interface C44211a {
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.FontChooserView$b */
    public static class C72628b {

        /* renamed from: a */
        public int f211288a = 0;

        /* renamed from: b */
        public int f211289b = 0;

        /* renamed from: c */
        public int f211290c = 0;

        /* renamed from: d */
        public int f211291d = 0;
    }

    public FontChooserView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo100061a() {
        SoftReference<Bitmap> softReference = f211271v;
        if (softReference == null || softReference.get() == null) {
            f211271v = new SoftReference<>(BitmapFactory.decodeResource(getResources(), C0966R.C0969drawable.c37));
        }
    }

    /* renamed from: b */
    public final int mo100062b(float f) {
        Paint paint = new Paint();
        paint.setTextSize(f);
        paint.setAntiAlias(true);
        return (int) Math.ceil((double) paint.getFontMetrics().bottom);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (canvas != null) {
            mo100061a();
            Paint paint = new Paint();
            paint.setARGB(255, 152, 152, 152);
            paint.setStrokeWidth(2.0f);
            int width = getWidth();
            int b = C76577a.m92151b(getContext(), 5);
            int i = this.f211274e;
            int i2 = this.f211276g;
            canvas.drawLine((float) i, (float) i2, (float) (width - i), (float) i2, paint);
            for (int i3 = 0; i3 < f211272w; i3++) {
                int i4 = this.f211274e;
                int i5 = this.f211277h;
                int i6 = this.f211276g;
                canvas.drawLine((float) ((i5 * i3) + i4), (float) (i6 - b), (float) (i4 + (i5 * i3)), (float) (i6 + b), paint);
            }
            Bitmap bitmap = f211271v.get();
            if (bitmap == null) {
                mo100061a();
            }
            canvas.drawBitmap(bitmap, (float) this.f211281o, (float) this.f211282p, (Paint) null);
            String string = getResources().getString(C0966R.string.lhe);
            getResources().getString(C0966R.string.lhd);
            getResources().getString(C0966R.string.lhf);
            float c = ((float) C74942w4.m89786c(getContext(), C0966R.dimen.f3927j7)) * C76577a.m92173x(getContext());
            Paint paint2 = new Paint();
            paint2.setTextSize(c);
            int b2 = mo100062b(c);
            paint2.setColor(getResources().getColor(C0966R.color.a7f));
            paint2.setAntiAlias(true);
            canvas.drawText(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, (float) (this.f211274e - (((int) paint2.measureText(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS)) / 2)), (float) ((this.f211276g - b2) - (bitmap.getHeight() / 3)), paint2);
            C76577a.m92172w(getContext());
            float c2 = ((float) C74942w4.m89786c(getContext(), C0966R.dimen.f3927j7)) * 1.0f;
            paint2.setTextSize(c2);
            canvas.drawText(string, (float) ((this.f211274e + (this.f211277h * 1)) - (((int) paint2.measureText(string)) / 2)), (float) ((this.f211276g - mo100062b(c2)) - (bitmap.getHeight() / 3)), paint2);
            float c3 = ((float) C74942w4.m89786c(getContext(), C0966R.dimen.f3927j7)) * C76577a.m92170u(getContext());
            paint2.setTextSize(c3);
            canvas.drawText(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, (float) ((this.f211274e + (this.f211277h * (f211272w - 1))) - (((int) paint2.measureText(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS)) / 2)), (float) ((this.f211276g - mo100062b(c3)) - (bitmap.getHeight() / 3)), paint2);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        mo100061a();
        ((ArrayList) this.f211273d).clear();
        setClickable(true);
        this.f211274e = C76577a.m92151b(getContext(), 30);
        this.f211275f = C76577a.m92151b(getContext(), 10);
        int width = getWidth();
        this.f211276g = this.f211275f + (getHeight() / 2);
        f211272w = 8;
        this.f211277h = (width - (this.f211274e * 2)) / (8 - 1);
        Bitmap bitmap = f211271v.get();
        if (bitmap == null) {
            mo100061a();
            bitmap = f211271v.get();
        }
        for (int i5 = 0; i5 < f211272w; i5++) {
            C72628b bVar = new C72628b();
            bVar.f211288a = (this.f211274e + (this.f211277h * i5)) - (bitmap.getWidth() / 2);
            bVar.f211289b = this.f211276g - (bitmap.getHeight() / 2);
            bVar.f211290c = this.f211274e + (this.f211277h * i5) + (bitmap.getWidth() / 2);
            bVar.f211291d = this.f211276g + (bitmap.getHeight() / 2);
            ((ArrayList) this.f211273d).add(bVar);
        }
        int i6 = this.f211284r;
        this.f211280n = i6;
        if (this.f211283q >= 0) {
            this.f211281o = ((C72628b) ((ArrayList) this.f211273d).get(i6)).f211288a;
        } else if (this.f211281o <= ((C72628b) ((ArrayList) this.f211273d).get(i6)).f211290c - (this.f211277h / 2)) {
            this.f211281o = ((C72628b) ((ArrayList) this.f211273d).get(this.f211280n)).f211288a;
        } else {
            this.f211281o = ((C72628b) ((ArrayList) this.f211273d).get(this.f211280n)).f211290c;
        }
        this.f211282p = ((C72628b) ((ArrayList) this.f211273d).get(this.f211280n)).f211289b;
        invalidate();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int i = 0;
        if (action == 0) {
            this.f211278i = motionEvent.getX();
            this.f211279j = motionEvent.getY();
            C72628b bVar = (C72628b) ((ArrayList) this.f211273d).get(this.f211280n);
            float f = this.f211278i;
            if (f >= ((float) bVar.f211288a) && f <= ((float) bVar.f211290c)) {
                float f2 = this.f211279j;
                if (f2 >= ((float) bVar.f211289b) && f2 <= ((float) bVar.f211291d)) {
                    i = 1;
                }
            }
            if (i != 0) {
                this.f211286t = true;
                return true;
            }
            this.f211287u = true;
            return super.onTouchEvent(motionEvent);
        } else if (action != 1) {
            if (action != 2) {
                return true;
            }
            if (!this.f211286t) {
                return super.onTouchEvent(motionEvent);
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f211283q = (int) (x - this.f211278i);
            this.f211281o = (int) (x - ((float) this.f211274e));
            this.f211278i = x;
            this.f211279j = y;
            C72628b bVar2 = (C72628b) ((ArrayList) this.f211273d).get(f211272w - 1);
            int i2 = this.f211281o;
            int i3 = ((C72628b) ((ArrayList) this.f211273d).get(0)).f211288a;
            if (i2 > i3) {
                int i4 = bVar2.f211288a;
                if (i2 < i4) {
                    while (true) {
                        if (i >= f211272w) {
                            break;
                        }
                        C72628b bVar3 = (C72628b) ((ArrayList) this.f211273d).get(i);
                        int i5 = this.f211281o;
                        if (i5 < bVar3.f211288a - 5 || i5 > bVar3.f211290c + 5) {
                            i++;
                        } else {
                            this.f211280n = i;
                            this.f211284r = i;
                            C44211a aVar = this.f211285s;
                            if (aVar != null) {
                                ((WebViewUI$$l0) aVar).mo68356a(i);
                            }
                        }
                    }
                } else {
                    this.f211281o = i4;
                }
            } else {
                this.f211281o = i3;
            }
            invalidate();
            return true;
        } else if (this.f211286t) {
            int i6 = 0;
            while (true) {
                if (i6 >= f211272w - 1) {
                    break;
                }
                int i7 = i6 + 1;
                C72628b bVar4 = (C72628b) ((ArrayList) this.f211273d).get(i7);
                int i8 = this.f211281o;
                int i9 = ((C72628b) ((ArrayList) this.f211273d).get(i6)).f211288a;
                int i15 = this.f211277h / 2;
                if (i8 <= i15 + i9 && i8 >= i9) {
                    this.f211280n = i6;
                    this.f211281o = i9;
                    break;
                }
                int i16 = bVar4.f211288a;
                if (i8 >= i16 - i15 && i8 <= i16) {
                    this.f211280n = i7;
                    this.f211281o = i16;
                    break;
                }
                i6 = i7;
            }
            int i17 = this.f211280n;
            this.f211284r = i17;
            C44211a aVar2 = this.f211285s;
            if (aVar2 != null) {
                ((WebViewUI$$l0) aVar2).mo68356a(i17);
            }
            invalidate();
            this.f211286t = false;
            return true;
        } else if (!this.f211287u) {
            return super.onTouchEvent(motionEvent);
        } else {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (Math.abs(x2 - this.f211278i) <= 10.0f && Math.abs(y2 - this.f211279j) <= 10.0f) {
                int i18 = 0;
                while (true) {
                    if (i18 >= f211272w) {
                        break;
                    }
                    C72628b bVar5 = (C72628b) ((ArrayList) this.f211273d).get(i18);
                    int i19 = bVar5.f211288a;
                    if (x2 < ((float) (i19 - 5)) || x2 > ((float) (bVar5.f211290c + 5))) {
                        i18++;
                    } else {
                        this.f211280n = i18;
                        this.f211284r = i18;
                        this.f211281o = i19;
                        C44211a aVar3 = this.f211285s;
                        if (aVar3 != null) {
                            ((WebViewUI$$l0) aVar3).mo68356a(i18);
                        }
                    }
                }
            }
            this.f211287u = false;
            invalidate();
            return true;
        }
    }

    public void setOnChangeListener(C44211a aVar) {
        this.f211285s = aVar;
    }

    public void setSliderIndex(int i) {
        this.f211284r = i;
    }

    public FontChooserView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
