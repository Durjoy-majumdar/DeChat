package o61;

import android.view.View;
import androidx.recyclerview.widget.C16680w;
import androidx.recyclerview.widget.C16681x;
import androidx.recyclerview.widget.C16682y;
import androidx.recyclerview.widget.C54259z;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: o61.d */
public final class C61947d extends C54259z {

    /* renamed from: f */
    public boolean f176079f;

    /* renamed from: g */
    public int f176080g = -1;

    /* renamed from: h */
    public final String f176081h = "MicroMsg.EmojiStoreV3BannerPageSnapHelper";

    /* renamed from: i */
    public C16682y f176082i;

    /* renamed from: j */
    public C16682y f176083j;

    /* renamed from: c */
    public int[] mo75026c(RecyclerView.LayoutManager layoutManager, View view) {
        C87412m.m108594g(layoutManager, "layoutManager");
        C87412m.m108594g(view, "targetView");
        int[] iArr = new int[2];
        int i = 0;
        if (layoutManager.canScrollHorizontally()) {
            if (this.f176082i == null) {
                this.f176082i = new C16680w(layoutManager);
            }
            C16682y yVar = this.f176082i;
            iArr[0] = yVar == null ? 0 : yVar.mo17564e(view) - this.f176080g;
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.canScrollVertically()) {
            if (this.f176083j == null) {
                this.f176083j = new C16681x(layoutManager);
            }
            C16682y yVar2 = this.f176083j;
            if (yVar2 != null) {
                i = yVar2.mo17564e(view) - this.f176080g;
            }
            iArr[1] = i;
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* renamed from: g */
    public int mo75030g(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        int position;
        C87412m.m108594g(layoutManager, "layoutManager");
        int i3 = -1;
        if (layoutManager.getItemCount() == 0) {
            return -1;
        }
        if (this.f176082i == null) {
            this.f176082i = new C16680w(layoutManager);
        }
        C16682y yVar = this.f176082i;
        if (yVar == null) {
            return -1;
        }
        int childCount = layoutManager.getChildCount();
        View view = null;
        int i4 = 0;
        if (childCount != 0) {
            int i5 = Integer.MAX_VALUE;
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = layoutManager.getChildAt(i6);
                int e = yVar.mo17564e(childAt);
                if (e < i5) {
                    view = childAt;
                    i5 = e;
                }
            }
        }
        if (view == null || (position = layoutManager.getPosition(view)) == -1) {
            return -1;
        }
        if (!(!layoutManager.canScrollHorizontally() ? i2 > 0 : i > 0)) {
            i4 = position;
        } else if (position != layoutManager.getItemCount() - 1) {
            i4 = position + 1;
        } else if (!this.f176079f) {
            i4 = layoutManager.getItemCount() - 1;
        }
        View f = mo75029f(layoutManager);
        if (f != null) {
            i3 = layoutManager.getPosition(f);
        }
        Log.m105918d(this.f176081h, "findTargetSnapPosition result:" + i4 + ", centerPosition:" + position + ", velocityX:" + i + " , snapPos:" + i3);
        return i4;
    }
}
