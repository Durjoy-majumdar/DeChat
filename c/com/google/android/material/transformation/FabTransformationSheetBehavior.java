package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.transformation.FabTransformationBehavior;
import com.tencent.p014mm.C0966R;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import p161h8.C108168h;
import p161h8.C108170j;
import p849e3.C107168a0;
import p849e3.C107207u;

public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: j */
    public Map<View, Integer> f309653j;

    public FabTransformationSheetBehavior() {
    }

    /* renamed from: C */
    public FabTransformationBehavior.C104486b mo147070C(Context context, boolean z) {
        int i = z ? C0966R.animator.f2560v : C0966R.animator.f2559u;
        FabTransformationBehavior.C104486b bVar = new FabTransformationBehavior.C104486b();
        bVar.f309651a = C108168h.m146496b(context, i);
        bVar.f309652b = new C108170j(17, 0.0f, 0.0f);
        return bVar;
    }

    /* renamed from: w */
    public boolean mo147065w(View view, View view2, boolean z, boolean z2) {
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                this.f309653j = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                boolean z3 = (childAt.getLayoutParams() instanceof CoordinatorLayout.C103717e) && (((CoordinatorLayout.C103717e) childAt.getLayoutParams()).f306328a instanceof FabTransformationScrimBehavior);
                if (childAt != view2 && !z3) {
                    if (!z) {
                        Map<View, Integer> map = this.f309653j;
                        if (map != null && ((HashMap) map).containsKey(childAt)) {
                            int intValue = ((Integer) ((HashMap) this.f309653j).get(childAt)).intValue();
                            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                            C107207u.C107208b.m145191s(childAt, intValue);
                        }
                    } else {
                        ((HashMap) this.f309653j).put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        WeakHashMap<View, C107168a0> weakHashMap2 = C107207u.f320808a;
                        C107207u.C107208b.m145191s(childAt, 4);
                    }
                }
            }
            if (!z) {
                this.f309653j = null;
            }
        }
        super.mo147065w(view, view2, z, z2);
        return true;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
