package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import p1150s.C110672a;
import p1156t.C110829a;
import p1156t.C110830b;
import p1156t.C110831c;
import p1156t.C110832d;

public class CardView extends FrameLayout {

    /* renamed from: i */
    public static final int[] f305885i = {16842801};

    /* renamed from: j */
    public static final C110831c f305886j = new C110829a();

    /* renamed from: d */
    public boolean f305887d;

    /* renamed from: e */
    public boolean f305888e;

    /* renamed from: f */
    public final Rect f305889f;

    /* renamed from: g */
    public final Rect f305890g;

    /* renamed from: h */
    public final C110830b f305891h;

    /* renamed from: androidx.cardview.widget.CardView$a */
    public class C103575a implements C110830b {

        /* renamed from: a */
        public Drawable f305892a;

        public C103575a() {
        }

        /* renamed from: a */
        public void mo144565a(int i, int i2, int i3, int i4) {
            CardView.this.f305890g.set(i, i2, i3, i4);
            CardView cardView = CardView.this;
            Rect rect = cardView.f305889f;
            CardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0966R.attr.f2695e4);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((C110829a) f305886j).mo162408a(this.f305891h).f331576h;
    }

    public float getCardElevation() {
        return CardView.this.getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f305889f.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f305889f.left;
    }

    public int getContentPaddingRight() {
        return this.f305889f.right;
    }

    public int getContentPaddingTop() {
        return this.f305889f.top;
    }

    public float getMaxCardElevation() {
        return ((C110829a) f305886j).mo162408a(this.f305891h).f331573e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f305888e;
    }

    public float getRadius() {
        return ((C110829a) f305886j).mo162408a(this.f305891h).f331569a;
    }

    public boolean getUseCompatPadding() {
        return this.f305887d;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        C110831c cVar = f305886j;
        C110830b bVar = this.f305891h;
        ColorStateList valueOf = ColorStateList.valueOf(i);
        C110832d a = ((C110829a) cVar).mo162408a(bVar);
        a.mo162412b(valueOf);
        a.invalidateSelf();
    }

    public void setCardElevation(float f) {
        CardView.this.setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        ((C110829a) f305886j).mo162409b(this.f305891h, f);
    }

    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f305888e) {
            this.f305888e = z;
            C110831c cVar = f305886j;
            C110830b bVar = this.f305891h;
            C110829a aVar = (C110829a) cVar;
            aVar.mo162409b(bVar, aVar.mo162408a(bVar).f331573e);
        }
    }

    public void setRadius(float f) {
        C110832d a = ((C110829a) f305886j).mo162408a(this.f305891h);
        if (f != a.f331569a) {
            a.f331569a = f;
            a.mo162413c((Rect) null);
            a.invalidateSelf();
        }
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f305887d != z) {
            this.f305887d = z;
            C110831c cVar = f305886j;
            C110830b bVar = this.f305891h;
            C110829a aVar = (C110829a) cVar;
            aVar.mo162409b(bVar, aVar.mo162408a(bVar).f331573e);
        }
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ColorStateList colorStateList;
        int i2;
        Rect rect = new Rect();
        this.f305889f = rect;
        this.f305890g = new Rect();
        C103575a aVar = new C103575a();
        this.f305891h = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C110672a.f331081a, i, C0966R.style.f8380gd);
        if (obtainStyledAttributes.hasValue(2)) {
            colorStateList = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f305885i);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                i2 = getResources().getColor(C0966R.color.f3220jn);
            } else {
                i2 = getResources().getColor(C0966R.color.f3219jm);
            }
            colorStateList = ColorStateList.valueOf(i2);
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.f305887d = obtainStyledAttributes.getBoolean(7, false);
        this.f305888e = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        C110832d dVar = new C110832d(colorStateList, dimension);
        aVar.f305892a = dVar;
        setBackgroundDrawable(dVar);
        setClipToOutline(true);
        setElevation(dimension2);
        ((C110829a) f305886j).mo162409b(aVar, dimension3);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        C110832d a = ((C110829a) f305886j).mo162408a(this.f305891h);
        a.mo162412b(colorStateList);
        a.invalidateSelf();
    }
}
