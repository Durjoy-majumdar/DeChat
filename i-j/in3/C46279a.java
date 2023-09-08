package in3;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.tencent.p014mm.p136ui.C85864g1;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;

/* renamed from: in3.a */
public final class C46279a {
    /* renamed from: a */
    public static void m51577a(View view, int i, boolean z) {
        if (view != null && C87771d.f254121g) {
            C87763b bVar = null;
            View view2 = view;
            while (true) {
                if (!(view2 instanceof C87763b)) {
                    ViewParent parent = view2.getParent();
                    if (parent == null || !(parent instanceof ViewGroup)) {
                        break;
                    }
                    view2 = (View) parent;
                } else {
                    bVar = (C87763b) view2;
                    break;
                }
            }
            if (bVar != null) {
                bVar.mo109971P(i, z);
                return;
            }
            Activity castActivityOrNull = AndroidContextUtil.castActivityOrNull(view.getContext());
            if (castActivityOrNull != null && castActivityOrNull.getWindow() != null) {
                castActivityOrNull.getWindow().setStatusBarColor(i);
                C85864g1.m106127b(castActivityOrNull.getWindow(), z);
            }
        }
    }
}
