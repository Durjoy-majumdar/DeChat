package com.tencent.p014mm.plugin.setting.p102ui.widget;

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
import com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsFontUI;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.setting.ui.widget.FontSelectorView */
public class FontSelectorView extends View {

    /* renamed from: v */
    public static SoftReference<Bitmap> f205975v = null;

    /* renamed from: w */
    public static int f205976w = 8;

    /* renamed from: d */
    public List<C71171b> f205977d = new ArrayList(8);

    /* renamed from: e */
    public int f205978e = 0;

    /* renamed from: f */
    public int f205979f = 0;

    /* renamed from: g */
    public int f205980g = 0;

    /* renamed from: h */
    public int f205981h = 0;

    /* renamed from: i */
    public float f205982i = 0.0f;

    /* renamed from: j */
    public float f205983j = 0.0f;

    /* renamed from: n */
    public int f205984n = 0;

    /* renamed from: o */
    public int f205985o = 0;

    /* renamed from: p */
    public int f205986p = 0;

    /* renamed from: q */
    public int f205987q = 0;

    /* renamed from: r */
    public int f205988r = 0;

    /* renamed from: s */
    public C57323a f205989s = null;

    /* renamed from: t */
    public boolean f205990t = false;

    /* renamed from: u */
    public boolean f205991u = false;

    /* renamed from: com.tencent.mm.plugin.setting.ui.widget.FontSelectorView$a */
    public interface C57323a {
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.widget.FontSelectorView$b */
    public static class C71171b {

        /* renamed from: a */
        public int f205992a = 0;

        /* renamed from: b */
        public int f205993b = 0;

        /* renamed from: c */
        public int f205994c = 0;

        /* renamed from: d */
        public int f205995d = 0;
    }

    public FontSelectorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo97846a() {
        SoftReference<Bitmap> softReference = f205975v;
        if (softReference == null || softReference.get() == null) {
            f205975v = new SoftReference<>(BitmapFactory.decodeResource(getResources(), C0966R.C0969drawable.c37));
        }
    }

    /* renamed from: b */
    public final int mo97847b(float f) {
        Paint paint = new Paint();
        paint.setTextSize(f);
        paint.setAntiAlias(true);
        return (int) Math.ceil((double) paint.getFontMetrics().bottom);
    }

    public int getSliderIndex() {
        return this.f205988r;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (canvas != null) {
            mo97846a();
            Paint paint = new Paint();
            paint.setARGB(255, 152, 152, 152);
            paint.setStrokeWidth(2.0f);
            int width = getWidth();
            int b = C76577a.m92151b(getContext(), 5);
            int i = this.f205978e;
            int i2 = this.f205980g;
            canvas.drawLine((float) i, (float) i2, (float) (width - i), (float) i2, paint);
            for (int i3 = 0; i3 < f205976w; i3++) {
                int i4 = this.f205978e;
                int i5 = this.f205981h;
                int i6 = this.f205980g;
                canvas.drawLine((float) ((i5 * i3) + i4), (float) (i6 - b), (float) (i4 + (i5 * i3)), (float) (i6 + b), paint);
            }
            Bitmap bitmap = f205975v.get();
            if (bitmap == null) {
                mo97846a();
            }
            canvas.drawBitmap(bitmap, (float) this.f205985o, (float) this.f205986p, (Paint) null);
            String string = getResources().getString(C0966R.string.ioa);
            getResources().getString(C0966R.string.io_);
            getResources().getString(C0966R.string.ioc);
            float c = ((float) C74942w4.m89786c(getContext(), C0966R.dimen.f3927j7)) * C76577a.m92173x(getContext());
            Paint paint2 = new Paint();
            paint2.setTextSize(c);
            int b2 = mo97847b(c);
            paint2.setColor(getResources().getColor(C0966R.color.a7f));
            paint2.setAntiAlias(true);
            canvas.drawText(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, (float) (this.f205978e - (((int) paint2.measureText(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS)) / 2)), (float) ((this.f205980g - b2) - (bitmap.getHeight() / 3)), paint2);
            C76577a.m92172w(getContext());
            float c2 = ((float) C74942w4.m89786c(getContext(), C0966R.dimen.f3927j7)) * 1.0f;
            paint2.setTextSize(c2);
            canvas.drawText(string, (float) ((this.f205978e + (this.f205981h * 1)) - (((int) paint2.measureText(string)) / 2)), (float) ((this.f205980g - mo97847b(c2)) - (bitmap.getHeight() / 3)), paint2);
            float c3 = ((float) C74942w4.m89786c(getContext(), C0966R.dimen.f3927j7)) * C76577a.m92170u(getContext());
            paint2.setTextSize(c3);
            canvas.drawText(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, (float) ((this.f205978e + (this.f205981h * (f205976w - 1))) - (((int) paint2.measureText(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS)) / 2)), (float) ((this.f205980g - mo97847b(c3)) - (bitmap.getHeight() / 3)), paint2);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        mo97846a();
        ((ArrayList) this.f205977d).clear();
        setClickable(true);
        this.f205978e = C76577a.m92151b(getContext(), 30);
        this.f205979f = C76577a.m92151b(getContext(), 10);
        int width = getWidth();
        this.f205980g = this.f205979f + (getHeight() / 2);
        f205976w = 8;
        this.f205981h = (width - (this.f205978e * 2)) / (8 - 1);
        Bitmap bitmap = f205975v.get();
        if (bitmap == null) {
            mo97846a();
            bitmap = f205975v.get();
        }
        for (int i5 = 0; i5 < f205976w; i5++) {
            C71171b bVar = new C71171b();
            bVar.f205992a = (this.f205978e + (this.f205981h * i5)) - (bitmap.getWidth() / 2);
            bVar.f205993b = this.f205980g - (bitmap.getHeight() / 2);
            bVar.f205994c = this.f205978e + (this.f205981h * i5) + (bitmap.getWidth() / 2);
            bVar.f205995d = this.f205980g + (bitmap.getHeight() / 2);
            ((ArrayList) this.f205977d).add(bVar);
        }
        int i6 = this.f205988r;
        this.f205984n = i6;
        if (this.f205987q >= 0) {
            this.f205985o = ((C71171b) ((ArrayList) this.f205977d).get(i6)).f205992a;
        } else if (this.f205985o <= ((C71171b) ((ArrayList) this.f205977d).get(i6)).f205994c - (this.f205981h / 2)) {
            this.f205985o = ((C71171b) ((ArrayList) this.f205977d).get(this.f205984n)).f205992a;
        } else {
            this.f205985o = ((C71171b) ((ArrayList) this.f205977d).get(this.f205984n)).f205994c;
        }
        this.f205986p = ((C71171b) ((ArrayList) this.f205977d).get(this.f205984n)).f205993b;
        invalidate();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int i = 0;
        if (action == 0) {
            this.f205982i = motionEvent.getX();
            this.f205983j = motionEvent.getY();
            C71171b bVar = (C71171b) ((ArrayList) this.f205977d).get(this.f205984n);
            float f = this.f205982i;
            if (f >= ((float) bVar.f205992a) && f <= ((float) bVar.f205994c)) {
                float f2 = this.f205983j;
                if (f2 >= ((float) bVar.f205993b) && f2 <= ((float) bVar.f205995d)) {
                    i = 1;
                }
            }
            if (i != 0) {
                this.f205990t = true;
                return true;
            }
            this.f205991u = true;
            return super.onTouchEvent(motionEvent);
        } else if (action != 1) {
            if (action != 2) {
                return true;
            }
            if (!this.f205990t) {
                return super.onTouchEvent(motionEvent);
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f205987q = (int) (x - this.f205982i);
            this.f205985o = (int) (x - ((float) this.f205978e));
            this.f205982i = x;
            this.f205983j = y;
            C71171b bVar2 = (C71171b) ((ArrayList) this.f205977d).get(f205976w - 1);
            int i2 = this.f205985o;
            int i3 = ((C71171b) ((ArrayList) this.f205977d).get(0)).f205992a;
            if (i2 > i3) {
                int i4 = bVar2.f205992a;
                if (i2 < i4) {
                    while (true) {
                        if (i >= f205976w) {
                            break;
                        }
                        C71171b bVar3 = (C71171b) ((ArrayList) this.f205977d).get(i);
                        int i5 = this.f205985o;
                        if (i5 < bVar3.f205992a - 5 || i5 > bVar3.f205994c + 5) {
                            i++;
                        } else {
                            this.f205984n = i;
                            this.f205988r = i;
                            C57323a aVar = this.f205989s;
                            if (aVar != null) {
                                ((SettingsFontUI.C71069a) aVar).mo97740a(i);
                            }
                        }
                    }
                } else {
                    this.f205985o = i4;
                }
            } else {
                this.f205985o = i3;
            }
            invalidate();
            return true;
        } else if (this.f205990t) {
            int i6 = 0;
            while (true) {
                if (i6 >= f205976w - 1) {
                    break;
                }
                int i7 = i6 + 1;
                C71171b bVar4 = (C71171b) ((ArrayList) this.f205977d).get(i7);
                int i8 = this.f205985o;
                int i9 = ((C71171b) ((ArrayList) this.f205977d).get(i6)).f205992a;
                int i15 = this.f205981h / 2;
                if (i8 <= i15 + i9 && i8 >= i9) {
                    this.f205984n = i6;
                    this.f205985o = i9;
                    break;
                }
                int i16 = bVar4.f205992a;
                if (i8 >= i16 - i15 && i8 <= i16) {
                    this.f205984n = i7;
                    this.f205985o = i16;
                    break;
                }
                i6 = i7;
            }
            int i17 = this.f205984n;
            this.f205988r = i17;
            C57323a aVar2 = this.f205989s;
            if (aVar2 != null) {
                ((SettingsFontUI.C71069a) aVar2).mo97740a(i17);
            }
            invalidate();
            this.f205990t = false;
            return true;
        } else if (!this.f205991u) {
            return super.onTouchEvent(motionEvent);
        } else {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (Math.abs(x2 - this.f205982i) <= 10.0f && Math.abs(y2 - this.f205983j) <= 10.0f) {
                int i18 = 0;
                while (true) {
                    if (i18 >= f205976w) {
                        break;
                    }
                    C71171b bVar5 = (C71171b) ((ArrayList) this.f205977d).get(i18);
                    int i19 = bVar5.f205992a;
                    if (x2 < ((float) (i19 - 5)) || x2 > ((float) (bVar5.f205994c + 5))) {
                        i18++;
                    } else {
                        this.f205984n = i18;
                        this.f205988r = i18;
                        this.f205985o = i19;
                        C57323a aVar3 = this.f205989s;
                        if (aVar3 != null) {
                            ((SettingsFontUI.C71069a) aVar3).mo97740a(i18);
                        }
                    }
                }
            }
            this.f205991u = false;
            invalidate();
            return true;
        }
    }

    public void setOnChangeListener(C57323a aVar) {
        this.f205989s = aVar;
    }

    public void setSliderIndex(int i) {
        int min = Math.min(7, Math.max(0, i));
        this.f205988r = min;
        C57323a aVar = this.f205989s;
        if (aVar != null) {
            ((SettingsFontUI.C71069a) aVar).mo97740a(min);
        }
    }

    public FontSelectorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
