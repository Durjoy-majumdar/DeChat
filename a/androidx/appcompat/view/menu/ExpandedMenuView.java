package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.C103448e;
import p1115h.C107922a;

public final class ExpandedMenuView extends ListView implements C103448e.C103450b, C103458j, AdapterView.OnItemClickListener {

    /* renamed from: e */
    public static final int[] f305152e = {16842964, 16843049};

    /* renamed from: d */
    public C103448e f305153d;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    /* renamed from: c */
    public boolean mo143519c(C103452g gVar) {
        return this.f305153d.mo143614q(gVar, (C103456i) null, 0);
    }

    /* renamed from: f */
    public void mo143520f(C103448e eVar) {
        this.f305153d = eVar;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo143519c((C103452g) getAdapter().getItem(i));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        Drawable drawable;
        int resourceId;
        Drawable drawable2;
        int resourceId2;
        setOnItemClickListener(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f305152e, i, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId2 = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
                drawable2 = obtainStyledAttributes.getDrawable(0);
            } else {
                drawable2 = C107922a.m146228b(context, resourceId2);
            }
            setBackgroundDrawable(drawable2);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            if (!obtainStyledAttributes.hasValue(1) || (resourceId = obtainStyledAttributes.getResourceId(1, 0)) == 0) {
                drawable = obtainStyledAttributes.getDrawable(1);
            } else {
                drawable = C107922a.m146228b(context, resourceId);
            }
            setDivider(drawable);
        }
        obtainStyledAttributes.recycle();
    }
}
