package x03;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: x03.d */
public class C22949d {
    /* renamed from: a */
    public static final C22953h m27076a(C22947b bVar) {
        RecyclerView.C16631z zVar;
        int childCount = bVar.mo24972X3().getChildCount();
        if (childCount == 0) {
            zVar = null;
        } else {
            int k = bVar.mo24972X3().getClipToPadding() ? bVar.mo24944C1().mo17570k() + (bVar.mo24944C1().mo17571l() / 2) : bVar.mo24944C1().mo17565f() / 2;
            int i = Integer.MAX_VALUE;
            View view = null;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = bVar.mo24972X3().getChildAt(i2);
                int abs = Math.abs((bVar.mo24944C1().mo17564e(childAt) + (bVar.mo24944C1().mo17562c(childAt) / 2)) - k);
                if (abs < i) {
                    view = childAt;
                    i = abs;
                }
            }
            zVar = bVar.getRecyclerView().mo17031P0(view);
        }
        if (!(zVar instanceof C22953h)) {
            return null;
        }
        return (C22953h) zVar;
    }

    /* renamed from: b */
    public void mo36128b(C22947b bVar) {
        throw null;
    }

    /* renamed from: c */
    public void mo36129c(C22947b bVar) {
        throw null;
    }

    /* renamed from: d */
    public void mo36130d(C22947b bVar, int i) {
    }
}
