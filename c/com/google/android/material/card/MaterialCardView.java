package com.google.android.material.card;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.cardview.widget.CardView;
import com.tencent.p014mm.C0966R;
import p1114g8.C107764a;
import p1127j8.C108652a;
import p1139o8.C109991k;

public class MaterialCardView extends CardView {

    /* renamed from: n */
    public final C108652a f309264n;

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0966R.attr.f2892wa);
    }

    public int getStrokeColor() {
        return this.f309264n.f325389b;
    }

    public int getStrokeWidth() {
        return this.f309264n.f325390c;
    }

    public void setRadius(float f) {
        super.setRadius(f);
        this.f309264n.mo159678b();
    }

    public void setStrokeColor(int i) {
        C108652a aVar = this.f309264n;
        aVar.f325389b = i;
        aVar.mo159678b();
    }

    public void setStrokeWidth(int i) {
        C108652a aVar = this.f309264n;
        aVar.f325390c = i;
        aVar.mo159678b();
        aVar.mo159677a();
    }

    public MaterialCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray d = C109991k.m149511d(context, attributeSet, C107764a.f322515o, i, C0966R.style.a45, new int[0]);
        C108652a aVar = new C108652a(this);
        this.f309264n = aVar;
        aVar.f325389b = d.getColor(0, -1);
        aVar.f325390c = d.getDimensionPixelSize(1, 0);
        aVar.mo159678b();
        aVar.mo159677a();
        d.recycle();
    }
}
