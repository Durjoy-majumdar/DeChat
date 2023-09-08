package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import p368o2.C21738f;
import p368o2.C21743j;

public abstract class ConstraintHelper extends View {

    /* renamed from: d */
    public int[] f44389d = new int[32];

    /* renamed from: e */
    public int f44390e;

    /* renamed from: f */
    public Context f44391f;

    /* renamed from: g */
    public C21743j f44392g;

    /* renamed from: h */
    public String f44393h;

    public ConstraintHelper(Context context) {
        super(context);
        this.f44391f = context;
        mo16666b((AttributeSet) null);
    }

    private void setIds(String str) {
        if (str != null) {
            int i = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    mo16670a(str.substring(i));
                    return;
                } else {
                    mo16670a(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004a, code lost:
        r3 = r2.f44406s;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16670a(java.lang.String r5) {
        /*
            r4 = this;
            if (r5 != 0) goto L_0x0003
            return
        L_0x0003:
            android.content.Context r0 = r4.f44391f
            if (r0 != 0) goto L_0x0008
            return
        L_0x0008:
            java.lang.String r5 = r5.trim()
            r0 = 0
            java.lang.Class<androidx.constraintlayout.widget.R$id> r1 = androidx.constraintlayout.widget.R$id.class
            java.lang.reflect.Field r1 = r1.getField(r5)     // Catch:{ Exception -> 0x0018 }
            int r1 = r1.getInt(r0)     // Catch:{ Exception -> 0x0018 }
            goto L_0x0019
        L_0x0018:
            r1 = 0
        L_0x0019:
            if (r1 != 0) goto L_0x002d
            android.content.Context r1 = r4.f44391f
            android.content.res.Resources r1 = r1.getResources()
            android.content.Context r2 = r4.f44391f
            java.lang.String r2 = r2.getPackageName()
            java.lang.String r3 = "id"
            int r1 = r1.getIdentifier(r5, r3, r2)
        L_0x002d:
            if (r1 != 0) goto L_0x0068
            boolean r2 = r4.isInEditMode()
            if (r2 == 0) goto L_0x0068
            android.view.ViewParent r2 = r4.getParent()
            boolean r2 = r2 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r2 == 0) goto L_0x0068
            android.view.ViewParent r2 = r4.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r2 = (androidx.constraintlayout.widget.ConstraintLayout) r2
            r2.getClass()
            boolean r3 = r5 instanceof java.lang.String
            if (r3 == 0) goto L_0x005b
            java.util.HashMap<java.lang.String, java.lang.Integer> r3 = r2.f44406s
            if (r3 == 0) goto L_0x005b
            boolean r3 = r3.containsKey(r5)
            if (r3 == 0) goto L_0x005b
            java.util.HashMap<java.lang.String, java.lang.Integer> r2 = r2.f44406s
            java.lang.Object r5 = r2.get(r5)
            goto L_0x005c
        L_0x005b:
            r5 = r0
        L_0x005c:
            if (r5 == 0) goto L_0x0068
            boolean r2 = r5 instanceof java.lang.Integer
            if (r2 == 0) goto L_0x0068
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r1 = r5.intValue()
        L_0x0068:
            if (r1 == 0) goto L_0x006d
            r4.setTag(r1, r0)
        L_0x006d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintHelper.mo16670a(java.lang.String):void");
    }

    /* renamed from: b */
    public void mo16666b(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R$styleable.ConstraintLayout_Layout_constraint_referenced_ids) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f44393h = string;
                    setIds(string);
                }
            }
        }
    }

    /* renamed from: c */
    public void mo16671c(ConstraintLayout constraintLayout) {
    }

    /* renamed from: d */
    public void mo16672d(ConstraintLayout constraintLayout) {
        if (isInEditMode()) {
            setIds(this.f44393h);
        }
        C21743j jVar = this.f44392g;
        if (jVar != null) {
            jVar.f61648j0 = 0;
            for (int i = 0; i < this.f44390e; i++) {
                View view = constraintLayout.f44394d.get(this.f44389d[i]);
                if (view != null) {
                    C21743j jVar2 = this.f44392g;
                    C21738f n = constraintLayout.mo16690n(view);
                    int i2 = jVar2.f61648j0 + 1;
                    C21738f[] fVarArr = jVar2.f61647i0;
                    if (i2 > fVarArr.length) {
                        jVar2.f61647i0 = (C21738f[]) Arrays.copyOf(fVarArr, fVarArr.length * 2);
                    }
                    C21738f[] fVarArr2 = jVar2.f61647i0;
                    int i3 = jVar2.f61648j0;
                    fVarArr2[i3] = n;
                    jVar2.f61648j0 = i3 + 1;
                }
            }
        }
    }

    /* renamed from: e */
    public void mo16673e() {
        if (this.f44392g != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                ((ConstraintLayout.LayoutParams) layoutParams).f44456k0 = this.f44392g;
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f44389d, this.f44390e);
    }

    public void onDraw(Canvas canvas) {
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setReferencedIds(int[] iArr) {
        this.f44390e = 0;
        for (int tag : iArr) {
            setTag(tag, (Object) null);
        }
    }

    public void setTag(int i, Object obj) {
        int i2 = this.f44390e + 1;
        int[] iArr = this.f44389d;
        if (i2 > iArr.length) {
            this.f44389d = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f44389d;
        int i3 = this.f44390e;
        iArr2[i3] = i;
        this.f44390e = i3 + 1;
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44391f = context;
        mo16666b(attributeSet);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f44391f = context;
        mo16666b(attributeSet);
    }
}
