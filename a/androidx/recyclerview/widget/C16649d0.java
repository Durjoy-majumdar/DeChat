package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.d0 */
public class C16649d0 {
    /* renamed from: a */
    public static int m16066a(RecyclerView.C16628w wVar, C16682y yVar, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z) {
        if (layoutManager.getChildCount() == 0 || wVar.mo17354b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(layoutManager.getPosition(view) - layoutManager.getPosition(view2)) + 1;
        }
        return Math.min(yVar.mo17571l(), yVar.mo17561b(view2) - yVar.mo17564e(view));
    }

    /* renamed from: b */
    public static int m16067b(RecyclerView.C16628w wVar, C16682y yVar, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z, boolean z2) {
        if (layoutManager.getChildCount() == 0 || wVar.mo17354b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (wVar.mo17354b() - Math.max(layoutManager.getPosition(view), layoutManager.getPosition(view2))) - 1) : Math.max(0, Math.min(layoutManager.getPosition(view), layoutManager.getPosition(view2)));
        if (!z) {
            return max;
        }
        return Math.round((((float) max) * (((float) Math.abs(yVar.mo17561b(view2) - yVar.mo17564e(view))) / ((float) (Math.abs(layoutManager.getPosition(view) - layoutManager.getPosition(view2)) + 1)))) + ((float) (yVar.mo17570k() - yVar.mo17564e(view))));
    }

    /* renamed from: c */
    public static int m16068c(RecyclerView.C16628w wVar, C16682y yVar, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z) {
        if (layoutManager.getChildCount() == 0 || wVar.mo17354b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return wVar.mo17354b();
        }
        return (int) ((((float) (yVar.mo17561b(view2) - yVar.mo17564e(view))) / ((float) (Math.abs(layoutManager.getPosition(view) - layoutManager.getPosition(view2)) + 1))) * ((float) wVar.mo17354b()));
    }
}
