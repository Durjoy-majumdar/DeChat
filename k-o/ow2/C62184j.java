package ow2;

import android.view.View;
import androidx.recyclerview.widget.C16680w;
import androidx.recyclerview.widget.C16681x;
import androidx.recyclerview.widget.C16682y;
import androidx.recyclerview.widget.C54259z;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: ow2.j */
public final class C62184j extends C54259z {

    /* renamed from: f */
    public C16682y f176798f;

    /* renamed from: g */
    public C16682y f176799g;

    /* renamed from: i */
    private final int m73055i(RecyclerView.LayoutManager layoutManager, View view, C16682y yVar) {
        int i;
        int i2;
        if (layoutManager.canScrollHorizontally()) {
            i2 = layoutManager.getLeftDecorationWidth(view);
            i = layoutManager.getRightDecorationWidth(view);
        } else {
            i2 = layoutManager.getTopDecorationHeight(view);
            i = layoutManager.getBottomDecorationHeight(view);
        }
        return (yVar.mo17564e(view) + ((yVar.mo17562c(view) - (i2 + i)) / 2)) - (layoutManager.getClipToPadding() ? yVar.mo17570k() + (yVar.mo17571l() / 2) : yVar.mo17565f() / 2);
    }

    /* renamed from: c */
    public int[] mo75026c(RecyclerView.LayoutManager layoutManager, View view) {
        C87412m.m108594g(layoutManager, "layoutManager");
        C87412m.m108594g(view, "targetView");
        Log.m105924i("MicroMsg.PageScrollHelper", "LogStory: calculateDistanceToFinalSnap " + layoutManager.getPosition(view));
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
            C16682y yVar = this.f176799g;
            if (yVar == null || yVar.f45081a != layoutManager) {
                this.f176799g = new C16680w(layoutManager);
            }
            C16682y yVar2 = this.f176799g;
            C87412m.m108591d(yVar2);
            iArr[0] = m73055i(layoutManager, view, yVar2);
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.canScrollVertically()) {
            C16682y yVar3 = this.f176798f;
            if (yVar3 == null || yVar3.f45081a != layoutManager) {
                this.f176798f = new C16681x(layoutManager);
            }
            C16682y yVar4 = this.f176798f;
            C87412m.m108591d(yVar4);
            iArr[1] = m73055i(layoutManager, view, yVar4);
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }
}
