package z03;

import a13.C53849g;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.C16680w;
import androidx.recyclerview.widget.C16681x;
import androidx.recyclerview.widget.C16682y;
import androidx.recyclerview.widget.C54256s;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import t03.C64200a;
import x03.C22947b;

/* renamed from: z03.c */
public class C66711c extends C53849g {

    /* renamed from: c */
    public C22947b f191745c;

    /* renamed from: d */
    public C16682y f191746d;

    /* renamed from: e */
    public C16682y f191747e;

    /* renamed from: z03.c$a */
    public class C66712a extends C54256s {
        public C66712a(Context context) {
            super(context);
        }

        /* renamed from: f */
        public void mo17385f(View view, RecyclerView.C16628w wVar, RecyclerView.C16634v.C16635a aVar) {
            C66711c cVar = C66711c.this;
            int[] c = cVar.mo74460c(cVar.f151090a.getLayoutManager(), view);
            int i = c[0];
            int i2 = c[1];
            int l = mo10339l(Math.max(Math.abs(i), Math.abs(i2)));
            if (l > 0) {
                aVar.mo17388b(i, i2, l, this.f152290i);
            }
        }

        /* renamed from: k */
        public float mo3227k(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }

        /* renamed from: m */
        public int mo10340m(int i) {
            return Math.min(100, super.mo10340m(i));
        }
    }

    public C66711c(C22947b bVar) {
        this.f191745c = bVar;
    }

    /* renamed from: c */
    public int[] mo74460c(RecyclerView.LayoutManager layoutManager, View view) {
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
            C16682y yVar = this.f191747e;
            if (yVar == null || yVar.f45081a != layoutManager) {
                this.f191747e = new C16680w(layoutManager);
            }
            iArr[0] = this.f191747e.mo17564e(view) - this.f191745c.mo24964S2();
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.canScrollVertically()) {
            C16682y yVar2 = this.f191746d;
            if (yVar2 == null || yVar2.f45081a != layoutManager) {
                this.f191746d = new C16681x(layoutManager);
            }
            iArr[1] = this.f191746d.mo17564e(view) - this.f191745c.mo24964S2();
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* renamed from: d */
    public C54256s mo74461d(RecyclerView.LayoutManager layoutManager) {
        if (!(layoutManager instanceof RecyclerView.C16634v.C16636b)) {
            return null;
        }
        return new C66712a(this.f151090a.getContext());
    }

    /* renamed from: e */
    public View mo74462e(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.canScrollVertically()) {
            C16682y yVar = this.f191746d;
            if (yVar == null || yVar.f45081a != layoutManager) {
                this.f191746d = new C16681x(layoutManager);
            }
            return mo90749h(layoutManager, this.f191746d);
        } else if (!layoutManager.canScrollHorizontally()) {
            return null;
        } else {
            C16682y yVar2 = this.f191747e;
            if (yVar2 == null || yVar2.f45081a != layoutManager) {
                this.f191747e = new C16680w(layoutManager);
            }
            return mo90749h(layoutManager, this.f191747e);
        }
    }

    /* renamed from: f */
    public int mo74463f(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        int itemCount;
        int e2;
        PointF f;
        if (Math.abs(i2) <= 500 || Math.abs(i) >= Math.abs(i2) || (itemCount = layoutManager.getItemCount()) == 0 || (e2 = this.f191745c.mo24981e2() + 1) == -1) {
            return -1;
        }
        boolean z = !layoutManager.canScrollHorizontally() ? i2 > 0 : i > 0;
        int i3 = (!((layoutManager instanceof RecyclerView.C16634v.C16636b) && (f = ((RecyclerView.C16634v.C16636b) layoutManager).mo16988f(itemCount - 1)) != null && ((f.x > 0.0f ? 1 : (f.x == 0.0f ? 0 : -1)) < 0 || (f.y > 0.0f ? 1 : (f.y == 0.0f ? 0 : -1)) < 0)) ? !z : z) ? e2 - 1 : e2 + 1;
        Log.m105925i("MicroMsg.TopStory.TopStoryVideoPagerSnapHelper", "findTargetSnapPosition velocityY: %d centerPosition: %d forwardDirection: %b result: %d currentPlayPos: %d", Integer.valueOf(i2), Integer.valueOf(e2), Boolean.valueOf(z), Integer.valueOf(i3), Integer.valueOf(this.f191745c.mo24981e2() + 1));
        return i3;
    }

    /* renamed from: h */
    public final View mo90749h(RecyclerView.LayoutManager layoutManager, C16682y yVar) {
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int k = layoutManager.getClipToPadding() ? yVar.mo17570k() + ((yVar.mo17571l() - C64200a.f181921a) / 2) : yVar.mo17565f() / 2;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = layoutManager.getChildAt(i2);
            int abs = Math.abs((yVar.mo17564e(childAt) + (yVar.mo17562c(childAt) / 2)) - k);
            if (abs < i) {
                view = childAt;
                i = abs;
            }
        }
        return view;
    }
}
