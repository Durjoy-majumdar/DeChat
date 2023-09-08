package com.tencent.p014mm.plugin.appbrand;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.widget.C84927e;

/* renamed from: com.tencent.mm.plugin.appbrand.i4 */
public enum C81932i4 {
    AppBrandPageContainer,
    PipContainer,
    InspectorView,
    LegacyDialogContainer,
    GlobalNativeWidgetContainerView,
    RemoteDebugFloatView,
    AuthorizeDialogContainer,
    LoadingSplash;

    /* renamed from: a */
    public void mo114355a(AppBrandRuntime appBrandRuntime, View view) {
        Integer num = (Integer) view.getTag(C0966R.C0970id.f6009ur);
        if (num == null || ordinal() == num.intValue()) {
            view.setTag(C0966R.C0970id.f6009ur, Integer.valueOf(ordinal()));
            C84927e eVar = appBrandRuntime.f238153r;
            int i = 0;
            if (eVar.getChildCount() != 0) {
                int childCount = eVar.getChildCount() - 1;
                while (true) {
                    if (i <= childCount) {
                        int i2 = (i + childCount) >>> 1;
                        int intValue = ((Integer) eVar.getChildAt(i2).getTag(C0966R.C0970id.f6009ur)).intValue();
                        if (intValue >= ordinal()) {
                            if (intValue <= ordinal()) {
                                i = i2;
                                break;
                            }
                            childCount = i2 - 1;
                        } else {
                            i = i2 + 1;
                        }
                    } else {
                        i = ~i;
                        if (i < 0) {
                            i = ~i;
                        }
                    }
                }
            }
            if (view.getParent() != eVar || i < eVar.getChildCount() - 1) {
                if (view.getParent() != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                eVar.addView(view, i);
                return;
            }
            eVar.bringChildToFront(view);
            return;
        }
        throw new IllegalStateException("Child has already been added with index " + num);
    }
}
