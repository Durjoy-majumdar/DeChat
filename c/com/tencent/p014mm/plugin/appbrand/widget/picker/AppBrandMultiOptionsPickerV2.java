package com.tencent.p014mm.plugin.appbrand.widget.picker;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.jsapi.picker.C17925e;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import qf0.C22082c;
import rf0.C22228b;
import vt0.C22784g;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.picker.AppBrandMultiOptionsPickerV2 */
public final class AppBrandMultiOptionsPickerV2 extends LinearLayout implements C17925e<int[]> {

    /* renamed from: d */
    public List<AppBrandOptionsPickerV3> f49948d = new ArrayList();

    /* renamed from: e */
    public boolean f49949e;

    /* renamed from: f */
    public boolean f49950f;

    /* renamed from: g */
    public C22784g f49951g;

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.picker.AppBrandMultiOptionsPickerV2$a */
    public class C18066a implements C22082c {

        /* renamed from: a */
        public final /* synthetic */ int f49952a;

        public C18066a(int i) {
            this.f49952a = i;
        }

        /* renamed from: a */
        public void mo8111a(int i) {
            C22784g gVar = AppBrandMultiOptionsPickerV2.this.f49951g;
            if (gVar != null) {
                int[] iArr = {this.f49952a, i};
                C22784g.C22788d dVar = gVar.f65525u;
                if (dVar != null) {
                    dVar.mo22201a(iArr);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.picker.AppBrandMultiOptionsPickerV2$b */
    public static final class C18067b {

        /* renamed from: a */
        public final String[] f49954a;

        /* renamed from: b */
        public final int f49955b;

        public C18067b(String[] strArr, int i) {
            this.f49954a = strArr;
            this.f49955b = Math.max(0, Math.min(i, strArr.length - 1));
        }
    }

    public AppBrandMultiOptionsPickerV2(Context context) {
        super(context);
        setOrientation(0);
    }

    private int getPickersCount() {
        return getChildCount();
    }

    /* renamed from: a */
    public void mo22614a(C18067b[] bVarArr) {
        int length;
        if (bVarArr != null && bVarArr.length > 0) {
            int pickersCount = getPickersCount();
            setLayoutFrozen(true);
            if (pickersCount < bVarArr.length) {
                int length2 = bVarArr.length - pickersCount;
                if (length2 > 0) {
                    for (int i = 0; i < length2; i++) {
                        int i2 = bVarArr[i].f49955b;
                        AppBrandOptionsPickerV3 appBrandOptionsPickerV3 = new AppBrandOptionsPickerV3(getContext());
                        appBrandOptionsPickerV3.f49964h = i2;
                        appBrandOptionsPickerV3.mo22630b();
                        appBrandOptionsPickerV3.f49961e.f62978p.f62987b.setDividerHeight((float) getContext().getResources().getDimensionPixelSize(C0966R.dimen.f4175v5));
                        getContext().getResources().getDimensionPixelSize(C0966R.dimen.aja);
                        appBrandOptionsPickerV3.f49961e.f62978p.getClass();
                        ((ArrayList) this.f49948d).add(appBrandOptionsPickerV3);
                        addView(appBrandOptionsPickerV3.getView(), new LinearLayout.LayoutParams(-1, -2, 1.0f));
                    }
                    mo22615b();
                }
            } else if (pickersCount > bVarArr.length && (length = pickersCount - bVarArr.length) > 0) {
                int pickersCount2 = getPickersCount() - 1;
                for (length = pickersCount - bVarArr.length; length > 0; length--) {
                    removeViewAt(pickersCount2);
                    pickersCount2--;
                }
                mo22615b();
            }
            for (int i3 = 0; i3 < bVarArr.length; i3++) {
                AppBrandOptionsPickerV3 c = mo22616c(i3);
                C18067b bVar = bVarArr[i3];
                String[] strArr = bVar.f49954a;
                c.f49960d = strArr;
                c.f49961e.mo35386g(Arrays.asList(strArr));
                c.f49964h = bVar.f49955b;
                C18066a aVar = new C18066a(i3);
                C22228b<String> bVar2 = c.f49961e;
                bVar2.f226020g.f62187d = aVar;
                bVar2.f62978p.f62989d = aVar;
            }
            setWeightSum((float) getPickersCount());
            setLayoutFrozen(false);
        }
    }

    /* renamed from: b */
    public final void mo22615b() {
        if (((ArrayList) this.f49948d).size() == 1) {
            ((AppBrandOptionsPickerV3) ((ArrayList) this.f49948d).get(0)).getView().setPadding(0, getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3736cp), 0, getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3736cp));
        } else if (((ArrayList) this.f49948d).size() == 2) {
            ((AppBrandOptionsPickerV3) ((ArrayList) this.f49948d).get(0)).getView().setPadding(0, getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3736cp), getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3736cp), getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3736cp));
            ((AppBrandOptionsPickerV3) ((ArrayList) this.f49948d).get(1)).getView().setPadding(getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3736cp), getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3736cp), 0, getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3736cp));
        } else if (((ArrayList) this.f49948d).size() == 3) {
            ((AppBrandOptionsPickerV3) ((ArrayList) this.f49948d).get(0)).getView().setPadding(0, getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3736cp), getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3703bv), getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3736cp));
            ((AppBrandOptionsPickerV3) ((ArrayList) this.f49948d).get(1)).getView().setPadding(getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3703bv), getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3736cp), getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3703bv), getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3736cp));
            ((AppBrandOptionsPickerV3) ((ArrayList) this.f49948d).get(2)).getView().setPadding(getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3703bv), getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3736cp), 0, getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3736cp));
        }
    }

    /* renamed from: c */
    public final AppBrandOptionsPickerV3 mo22616c(int i) {
        if (i < 0) {
            return null;
        }
        return (AppBrandOptionsPickerV3) ((ArrayList) this.f49948d).get(i);
    }

    public Object currentValue() {
        int pickersCount = getPickersCount();
        if (pickersCount <= 0) {
            return new int[0];
        }
        int[] iArr = new int[pickersCount];
        for (int i = 0; i < pickersCount; i++) {
            AppBrandOptionsPickerV3 c = mo22616c(i);
            c.f49961e.mo35385f();
            iArr[i] = c.f49963g;
        }
        return iArr;
    }

    /* renamed from: d */
    public void mo22617d(int i, C18067b bVar) {
        if (i >= 0 && i < getPickersCount() && bVar != null) {
            setLayoutFrozen(true);
            AppBrandOptionsPickerV3 c = mo22616c(i);
            String[] strArr = bVar.f49954a;
            c.f49960d = strArr;
            c.f49961e.mo35386g(Arrays.asList(strArr));
            if (!Util.isNullOrNil(bVar.f49954a)) {
                AppBrandOptionsPickerV3 c2 = mo22616c(i);
                c2.f49961e.mo35384e().setCurrentItem(bVar.f49955b);
            }
            setLayoutFrozen(false);
        }
    }

    public View getView() {
        return this;
    }

    public void onAttach(C22784g gVar) {
        this.f49951g = gVar;
    }

    public void onDetach(C22784g gVar) {
        this.f49951g = null;
    }

    public void onHide(C22784g gVar) {
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f49949e) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onShow(C22784g gVar) {
        this.f49951g = gVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f49949e) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void requestLayout() {
        if (this.f49949e) {
            this.f49950f = true;
        } else {
            super.requestLayout();
        }
    }

    public void setLayoutFrozen(boolean z) {
        if (this.f49949e != z) {
            this.f49949e = z;
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            } else if (this.f49950f) {
                requestLayout();
            }
        }
    }
}
