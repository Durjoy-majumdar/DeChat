package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p368o2.C21732b;

public class Barrier extends ConstraintHelper {

    /* renamed from: i */
    public int f44386i;

    /* renamed from: j */
    public int f44387j;

    /* renamed from: n */
    public C21732b f44388n;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* renamed from: b */
    public void mo16666b(AttributeSet attributeSet) {
        super.mo16666b(attributeSet);
        this.f44388n = new C21732b();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R$styleable.ConstraintLayout_Layout_barrierDirection) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == R$styleable.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.f44388n.f61512m0 = obtainStyledAttributes.getBoolean(index, true);
                }
            }
        }
        this.f44392g = this.f44388n;
        mo16673e();
    }

    public int getType() {
        return this.f44386i;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f44388n.f61512m0 = z;
    }

    public void setType(int i) {
        this.f44386i = i;
        this.f44387j = i;
        if (1 == getResources().getConfiguration().getLayoutDirection()) {
            int i2 = this.f44386i;
            if (i2 == 5) {
                this.f44387j = 1;
            } else if (i2 == 6) {
                this.f44387j = 0;
            }
        } else {
            int i3 = this.f44386i;
            if (i3 == 5) {
                this.f44387j = 0;
            } else if (i3 == 6) {
                this.f44387j = 1;
            }
        }
        this.f44388n.f61510k0 = this.f44387j;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }
}
