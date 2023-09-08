package com.tencent.p014mm.p136ui.base;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import kg3.C76577a;

/* renamed from: com.tencent.mm.ui.base.AlphabetScrollBar */
public class AlphabetScrollBar extends VerticalScrollBar {

    /* renamed from: C */
    public int f348176C = -1;

    /* renamed from: D */
    public Drawable f348177D;

    /* renamed from: E */
    public Drawable f348178E;

    /* renamed from: F */
    public int f348179F = 0;

    /* renamed from: G */
    public Drawable f348180G;

    /* renamed from: H */
    public Drawable f348181H;

    /* renamed from: I */
    public int f348182I = 0;

    /* renamed from: J */
    public WeImageView f348183J;

    /* renamed from: K */
    public WeImageView f348184K;

    public AlphabetScrollBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo177238a(Canvas canvas, float f, float f2, float f3, Paint paint, int i) {
        String[] strArr = this.f348303f;
        if (i < strArr.length && strArr[i].equals("🔍")) {
            f2 -= 10.0f;
        }
        canvas.drawCircle(f, f2, f3, paint);
    }

    /* renamed from: b */
    public void mo177239b(Canvas canvas, float f, float f2, Paint paint, int i, boolean z) {
        String[] strArr = this.f348303f;
        if (i >= strArr.length || !"🔍".equals(strArr[i])) {
            String[] strArr2 = this.f348303f;
            if (i >= strArr2.length || !"openIm".equals(strArr2[i])) {
                super.mo177239b(canvas, f, f2, paint, i, z);
                return;
            }
            if (this.f348180G == null) {
                if (C85875k4.m106211z()) {
                    Drawable drawable = getResources().getDrawable(C0966R.raw.open_im_gray_logo);
                    C74933u4.m89769f(drawable, getResources().getColor(C0966R.color.FG_2));
                    this.f348180G = drawable;
                } else {
                    Drawable drawable2 = getResources().getDrawable(C0966R.raw.open_im_gray_logo);
                    C74933u4.m89769f(drawable2, getResources().getColor(C0966R.color.FG_0));
                    this.f348180G = drawable2;
                }
                Drawable drawable3 = getResources().getDrawable(C0966R.raw.open_im_gray_logo);
                C74933u4.m89769f(drawable3, getResources().getColor(C0966R.color.f2975b6));
                this.f348181H = drawable3;
                this.f348182I = C76577a.m92151b(getContext(), 13);
            }
            if (z) {
                paint.setStyle(Paint.Style.FILL);
                paint.setColor(this.f348315u);
                canvas.drawCircle(f, f2 - 10.0f, (float) this.f348316v, paint);
                Drawable drawable4 = this.f348181H;
                int i2 = this.f348182I;
                drawable4.setBounds((int) (f - ((float) (i2 / 2))), (int) ((f2 - ((float) (i2 / 2))) - 10.0f), (int) (f + ((float) (i2 / 2))), (int) ((f2 + ((float) (i2 / 2))) - 10.0f));
                this.f348181H.draw(canvas);
                return;
            }
            Drawable drawable5 = this.f348180G;
            int i3 = this.f348182I;
            drawable5.setBounds((int) (f - ((float) (i3 / 2))), (int) ((f2 - ((float) (i3 / 2))) - 10.0f), (int) (f + ((float) (i3 / 2))), (int) ((f2 + ((float) (i3 / 2))) - 10.0f));
            this.f348180G.draw(canvas);
            return;
        }
        if (this.f348177D == null || this.f348178E == null) {
            if (this.f348176C != -1) {
                Drawable drawable6 = getResources().getDrawable(C0966R.raw.icons_filled_search);
                C74933u4.m89769f(drawable6, this.f348176C);
                this.f348177D = drawable6;
            } else if (C85875k4.m106211z()) {
                Drawable drawable7 = getResources().getDrawable(C0966R.raw.icons_filled_search);
                C74933u4.m89769f(drawable7, getResources().getColor(C0966R.color.FG_2));
                this.f348177D = drawable7;
            } else {
                Drawable drawable8 = getResources().getDrawable(C0966R.raw.icons_filled_search);
                C74933u4.m89769f(drawable8, getResources().getColor(C0966R.color.FG_0));
                this.f348177D = drawable8;
            }
            this.f348179F = C76577a.m92151b(getContext(), 13);
            Drawable drawable9 = getResources().getDrawable(C0966R.raw.icons_filled_search);
            C74933u4.m89769f(drawable9, getResources().getColor(C0966R.color.f2975b6));
            this.f348178E = drawable9;
        }
        if (z) {
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(this.f348315u);
            canvas.drawCircle(f, f2 - 10.0f, (float) this.f348316v, paint);
            Drawable drawable10 = this.f348178E;
            int i4 = this.f348179F;
            drawable10.setBounds((int) (f - ((float) (i4 / 2))), (int) ((f2 - ((float) (i4 / 2))) - 10.0f), (int) (f + ((float) (i4 / 2))), (int) ((f2 + ((float) (i4 / 2))) - 10.0f));
            this.f348178E.draw(canvas);
            return;
        }
        Drawable drawable11 = this.f348177D;
        int i5 = this.f348179F;
        drawable11.setBounds((int) (f - ((float) (i5 / 2))), (int) ((f2 - ((float) (i5 / 2))) - 10.0f), (int) (f + ((float) (i5 / 2))), (int) ((f2 + ((float) (i5 / 2))) - 10.0f));
        this.f348177D.draw(canvas);
    }

    /* renamed from: c */
    public void mo174288c() {
        this.f348303f = new String[]{"↑", "☆", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C", "D", ExifInterface.LONGITUDE_EAST, "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", ExifInterface.LATITUDE_SOUTH, ExifInterface.GPS_DIRECTION_TRUE, "U", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, ExifInterface.LONGITUDE_WEST, "X", "Y", "Z", "#"};
        this.f348301d = 1.6f;
        this.f348302e = 79;
    }

    /* renamed from: d */
    public void mo177240d(String str) {
        if (this.f348183J == null) {
            this.f348183J = (WeImageView) this.f348320z.findViewById(C0966R.C0970id.jjz);
        }
        if (this.f348184K == null) {
            this.f348184K = (WeImageView) this.f348320z.findViewById(C0966R.C0970id.oom);
        }
        if (str.equals("🔍")) {
            this.f348183J.setVisibility(0);
            this.f348310p.setVisibility(8);
            WeImageView weImageView = this.f348184K;
            if (weImageView != null) {
                weImageView.setVisibility(8);
            }
        } else if (str.equals("openIm")) {
            this.f348183J.setVisibility(8);
            this.f348310p.setVisibility(8);
            WeImageView weImageView2 = this.f348184K;
            if (weImageView2 != null) {
                weImageView2.setVisibility(0);
            }
        } else {
            this.f348310p.setVisibility(0);
            this.f348183J.setVisibility(8);
            WeImageView weImageView3 = this.f348184K;
            if (weImageView3 != null) {
                weImageView3.setVisibility(8);
            }
            super.mo177240d(str);
        }
    }

    public int getToastLayoutId() {
        return C0966R.C0971layout.bz8;
    }

    public void setAlphabet(String[] strArr) {
        this.f348303f = strArr;
        this.f348306i = 0.0f;
        invalidate();
    }

    public void setBackgroundColor(int i) {
        this.f348315u = i;
    }

    public void setSearchIconColor(int i) {
        this.f348176C = i;
    }

    public void setTextColor(int i) {
        this.f348313s = i;
    }

    public void setWhiteTextColor(int i) {
        this.f348314t = i;
    }
}
