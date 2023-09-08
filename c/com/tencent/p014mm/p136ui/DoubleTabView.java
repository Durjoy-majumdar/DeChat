package com.tencent.p014mm.p136ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;

/* renamed from: com.tencent.mm.ui.DoubleTabView */
public class DoubleTabView extends RelativeLayout {

    /* renamed from: d */
    public int f121133d;

    /* renamed from: e */
    public int f121134e = 0;

    /* renamed from: f */
    public Bitmap f121135f;

    /* renamed from: g */
    public LinearLayout f121136g;

    /* renamed from: h */
    public ImageView f121137h;

    /* renamed from: i */
    public Matrix f121138i = new Matrix();

    /* renamed from: j */
    public MMTabView f121139j;

    /* renamed from: n */
    public MMTabView f121140n;

    /* renamed from: o */
    public String f121141o;

    /* renamed from: p */
    public String f121142p;

    /* renamed from: q */
    public C44681b f121143q;

    /* renamed from: r */
    public View.OnClickListener f121144r = new C44680a();

    /* renamed from: s */
    public boolean f121145s = false;

    /* renamed from: com.tencent.mm.ui.DoubleTabView$a */
    public class C44680a implements View.OnClickListener {
        public C44680a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/DoubleTabView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            int intValue = ((Integer) view.getTag()).intValue();
            C44681b bVar = DoubleTabView.this.f121143q;
            if (bVar != null) {
                ((C45026g) bVar).f122122a.mViewPager.setCurrentItem(intValue, true);
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/DoubleTabView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.DoubleTabView$b */
    public interface C44681b {
    }

    public DoubleTabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo69837a();
    }

    /* renamed from: a */
    public final void mo69837a() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f121136g = linearLayout;
        linearLayout.setBackgroundResource(C0966R.color.al6);
        this.f121136g.setId(C0966R.C0970id.c9_);
        this.f121136g.setOrientation(0);
        addView(this.f121136g, new RelativeLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(getContext());
        this.f121137h = imageView;
        imageView.setImageMatrix(this.f121138i);
        this.f121137h.setScaleType(ImageView.ScaleType.MATRIX);
        this.f121137h.setId(C0966R.C0970id.c9a);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, C76577a.m92151b(getContext(), 3));
        layoutParams.addRule(8, C0966R.C0970id.c9_);
        addView(this.f121137h, layoutParams);
        MMTabView mMTabView = new MMTabView(getContext(), 0);
        mMTabView.setTag(0);
        mMTabView.setOnClickListener(this.f121144r);
        this.f121139j = mMTabView;
        mMTabView.setText(this.f121141o);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, getResources().getDimensionPixelSize(C0966R.dimen.arb));
        layoutParams2.weight = 1.0f;
        this.f121136g.addView(this.f121139j, layoutParams2);
        MMTabView mMTabView2 = new MMTabView(getContext(), 1);
        mMTabView2.setTag(1);
        mMTabView2.setOnClickListener(this.f121144r);
        this.f121140n = mMTabView2;
        mMTabView2.setText(this.f121142p);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, getResources().getDimensionPixelSize(C0966R.dimen.arb));
        layoutParams3.weight = 1.0f;
        this.f121136g.addView(this.f121140n, layoutParams3);
    }

    public int getCurentIndex() {
        return this.f121134e;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = (i3 - i) / 2;
        this.f121133d = i5;
        Bitmap bitmap = this.f121135f;
        if (bitmap == null || bitmap.getWidth() != i5) {
            Object[] objArr = new Object[2];
            Bitmap bitmap2 = this.f121135f;
            objArr[0] = Integer.valueOf(bitmap2 == null ? -1 : bitmap2.getWidth());
            objArr[1] = Integer.valueOf(i5);
            Log.m105929w("MicroMsg.DoubleTabView", "sharp width changed, from %d to %d", objArr);
            this.f121135f = Bitmap.createBitmap(i5, C76577a.m92151b(getContext(), 3), Bitmap.Config.ARGB_8888);
            new Canvas(this.f121135f).drawColor(getResources().getColor(C0966R.color.akw));
            this.f121138i.setTranslate(((float) this.f121133d) * (((float) this.f121134e) + 0.0f), 0.0f);
            this.f121137h.setImageMatrix(this.f121138i);
            this.f121137h.setImageBitmap(this.f121135f);
        }
        setTo(this.f121134e);
    }

    public void setFirstTabString(String str) {
        this.f121141o = str;
        this.f121139j.setText(str);
        MMTabView mMTabView = this.f121139j;
        mMTabView.setContentDescription(str + "，" + getResources().getString(C0966R.string.ik7));
        requestLayout();
    }

    public void setFirstTabUnReadCount(String str) {
        MMTabView mMTabView = this.f121139j;
        if (mMTabView != null) {
            mMTabView.setUnread(str);
        }
    }

    public void setOnTabClickListener(C44681b bVar) {
        this.f121143q = bVar;
    }

    public void setSecondTabString(String str) {
        this.f121142p = str;
        this.f121140n.setText(str);
        MMTabView mMTabView = this.f121140n;
        mMTabView.setContentDescription(str + "，" + getResources().getString(C0966R.string.ik7));
        requestLayout();
    }

    public void setSecondTabUnReadCount(String str) {
        MMTabView mMTabView = this.f121140n;
        if (mMTabView != null) {
            mMTabView.setUnread(str);
        }
    }

    public void setThirdTabString(String str) {
        throw null;
    }

    public void setTo(int i) {
        this.f121134e = i;
        this.f121139j.setTextColor(i == 0 ? getResources().getColor(C0966R.color.akw) : getContext().getResources().getColor(C0966R.color.FG_0));
        this.f121140n.setTextColor(this.f121134e == 1 ? getResources().getColor(C0966R.color.akw) : getContext().getResources().getColor(C0966R.color.FG_0));
    }

    public DoubleTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo69837a();
    }
}
