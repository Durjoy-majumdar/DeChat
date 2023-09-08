package com.tencent.p014mm.plugin.appbrand.widget.picker;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.jsapi.picker.C17925e;
import com.tencent.p014mm.plugin.appbrand.widget.picker.YANumberPicker;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import kg3.C76577a;
import vt0.C111612e;
import vt0.C22784g;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.picker.AppBrandMultiOptionsPicker */
public final class AppBrandMultiOptionsPicker extends FrameLayout implements C17925e<int[]> {

    /* renamed from: d */
    public final Drawable f311588d;

    /* renamed from: e */
    public LinearLayout f311589e;

    /* renamed from: f */
    public boolean f311590f;

    /* renamed from: g */
    public boolean f311591g;

    /* renamed from: h */
    public C22784g f311592h;

    /* renamed from: i */
    public final YANumberPicker.C104943b f311593i = new C104940a();

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.picker.AppBrandMultiOptionsPicker$a */
    public class C104940a implements YANumberPicker.C104943b {
        public C104940a() {
        }

        /* renamed from: a */
        public void mo148972a(YANumberPicker yANumberPicker, int i, int i2) {
            if (AppBrandMultiOptionsPicker.this.f311592h != null) {
                int intValue = ((Integer) yANumberPicker.getTag(C0966R.C0970id.f5949t4)).intValue();
                int[] iArr = {intValue, i2};
                C22784g.C22788d dVar = AppBrandMultiOptionsPicker.this.f311592h.f65525u;
                if (dVar != null) {
                    dVar.mo22201a(iArr);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.picker.AppBrandMultiOptionsPicker$b */
    public static final class C104941b {

        /* renamed from: a */
        public final String[] f311595a;

        /* renamed from: b */
        public final int f311596b;

        public C104941b(String[] strArr, int i) {
            this.f311595a = strArr;
            this.f311596b = Math.max(0, Math.min(i, strArr.length - 1));
        }
    }

    public AppBrandMultiOptionsPicker(Context context) {
        super(context);
        Drawable drawable = context.getResources().getDrawable(C0966R.C0969drawable.f4448cu);
        this.f311588d = drawable;
        LinearLayout linearLayout = new LinearLayout(context);
        this.f311589e = linearLayout;
        linearLayout.setPadding(C76577a.m92151b(context, 2), 0, C76577a.m92151b(context, 2), 0);
        this.f311589e.setOrientation(0);
        addView(this.f311589e, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f311589e.setDividerDrawable(drawable);
        this.f311589e.setShowDividers(2);
    }

    private int getPickersCount() {
        LinearLayout linearLayout = this.f311589e;
        if (linearLayout == null) {
            return 0;
        }
        return linearLayout.getChildCount();
    }

    /* renamed from: a */
    public void mo148965a(C104941b[] bVarArr) {
        int length;
        if (bVarArr != null && bVarArr.length > 0) {
            int pickersCount = getPickersCount();
            setLayoutFrozen(true);
            if (pickersCount < bVarArr.length) {
                int length2 = bVarArr.length - pickersCount;
                if (length2 > 0) {
                    while (length2 > 0) {
                        C111612e eVar = new C111612e(this, getContext());
                        eVar.setOnValueChangedListener(this.f311593i);
                        eVar.setEllipsizeType("end");
                        eVar.setDividerHeight(C76577a.m92151b(getContext(), 1));
                        eVar.setTag(C0966R.C0970id.f5949t4, Integer.valueOf(this.f311589e.getChildCount()));
                        this.f311589e.addView(eVar, new LinearLayout.LayoutParams(0, -1, 1.0f));
                        length2--;
                    }
                }
            } else if (pickersCount > bVarArr.length && (length = pickersCount - bVarArr.length) > 0) {
                int pickersCount2 = getPickersCount() - 1;
                for (length = pickersCount - bVarArr.length; length > 0; length--) {
                    this.f311589e.removeViewAt(pickersCount2);
                    pickersCount2--;
                }
            }
            for (int i = 0; i < bVarArr.length; i++) {
                AppBrandOptionsPickerV2 b = mo148966b(i);
                C104941b bVar = bVarArr[i];
                b.setOptionsArray(bVar.f311595a);
                b.setValue(bVar.f311596b);
                b.setOnValueChangedListener(this.f311593i);
            }
            this.f311589e.setWeightSum((float) getPickersCount());
            setLayoutFrozen(false);
        }
    }

    /* renamed from: b */
    public final AppBrandOptionsPickerV2 mo148966b(int i) {
        LinearLayout linearLayout;
        if (i >= 0 && (linearLayout = this.f311589e) != null) {
            return (AppBrandOptionsPickerV2) linearLayout.getChildAt(i);
        }
        return null;
    }

    /* renamed from: c */
    public void mo148967c(int i, C104941b bVar) {
        if (i >= 0 && i < getPickersCount() && bVar != null) {
            setLayoutFrozen(true);
            mo148966b(i).setOptionsArray(bVar.f311595a);
            if (!Util.isNullOrNil(bVar.f311595a)) {
                mo148966b(i).setValue(bVar.f311596b);
            }
            setLayoutFrozen(false);
        }
    }

    public Object currentValue() {
        int pickersCount = getPickersCount();
        if (pickersCount <= 0) {
            return new int[0];
        }
        int[] iArr = new int[pickersCount];
        for (int i = 0; i < pickersCount; i++) {
            iArr[i] = mo148966b(i).getValue();
        }
        return iArr;
    }

    public View getView() {
        return this;
    }

    public void onAttach(C22784g gVar) {
        this.f311592h = gVar;
    }

    public void onDetach(C22784g gVar) {
        this.f311592h = null;
    }

    public void onHide(C22784g gVar) {
        int pickersCount = getPickersCount();
        for (int i = 0; i < pickersCount; i++) {
            AppBrandOptionsPickerV2 b = mo148966b(i);
            if (b != null) {
                b.mo149008q();
                MMHandler mMHandler = b.f311628X0;
                if (mMHandler != null) {
                    mMHandler.sendMessageDelayed(b.mo148982g(1, 0, 0, (Object) null), 0);
                }
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f311590f) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onShow(C22784g gVar) {
        this.f311592h = gVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f311590f) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void requestLayout() {
        if (this.f311590f) {
            this.f311591g = true;
        } else {
            super.requestLayout();
        }
    }

    public void setLayoutFrozen(boolean z) {
        if (this.f311590f != z) {
            this.f311590f = z;
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            } else if (this.f311591g) {
                requestLayout();
            }
        }
    }
}
