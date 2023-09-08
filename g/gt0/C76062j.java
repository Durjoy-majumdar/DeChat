package gt0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import sx3.C64186f0;

/* renamed from: gt0.j */
public final class C76062j {

    /* renamed from: a */
    public final String f222908a = ("MicroMsg.AppBrandDialogAccessibilityFixer#" + hashCode());

    /* renamed from: b */
    public final HashMap<C87362k, C76061i> f222909b = new HashMap<>();

    /* renamed from: a */
    public final List<View> mo106272a(View view) {
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup)) {
            String str = this.f222908a;
            Log.m105928w(str, "findSiblingsBelow[" + view + "], parent is not ViewGroup");
            return C64186f0.f181907d;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        int indexOfChild = viewGroup.indexOfChild(view);
        String str2 = this.f222908a;
        Log.m105924i(str2, "findSiblingsBelow[" + view + "], myIndex: " + indexOfChild);
        if (indexOfChild == 0) {
            return C64186f0.f181907d;
        }
        ArrayList arrayList = new ArrayList(indexOfChild);
        for (int i = 0; i < indexOfChild; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void mo106273b(View view, boolean z, C87370k0 k0Var, List<? extends View> list) {
        View contentView;
        if (z) {
            String str = this.f222908a;
            Log.m105924i(str, "onDialogDismissed[" + view + "], isLastDialog, recover siblings's importantForAccessibility");
            List<View> list2 = list;
            if (list == null) {
                list2 = mo106272a(view);
            }
            for (View importantForAccessibility : list2) {
                importantForAccessibility.setImportantForAccessibility(0);
            }
        }
        if (k0Var != null && (contentView = k0Var.getContentView()) != null) {
            contentView.setImportantForAccessibility(0);
        }
    }
}
