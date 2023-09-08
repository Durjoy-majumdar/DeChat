package to1;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C16680w;
import androidx.recyclerview.widget.C16682y;
import androidx.recyclerview.widget.C54256s;
import androidx.recyclerview.widget.C54257t;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import rx3.C13598b0;

/* renamed from: to1.u */
public final class C64987u extends C54257t {

    /* renamed from: f */
    public final Context f187103f;

    /* renamed from: g */
    public int f187104g;

    /* renamed from: h */
    public C16682y f187105h;

    /* renamed from: i */
    public C32226l<? super Integer, C13598b0> f187106i;

    /* renamed from: to1.u$a */
    public static final class C64988a extends C54256s {

        /* renamed from: n */
        public final /* synthetic */ C64987u f187107n;

        /* renamed from: o */
        public final /* synthetic */ RecyclerView.LayoutManager f187108o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64988a(C64987u uVar, RecyclerView.LayoutManager layoutManager, Context context) {
            super(context);
            this.f187107n = uVar;
            this.f187108o = layoutManager;
        }

        /* renamed from: f */
        public void mo17385f(View view, RecyclerView.C16628w wVar, RecyclerView.C16634v.C16635a aVar) {
            C87412m.m108594g(view, "targetView");
            C87412m.m108594g(wVar, "state");
            C87412m.m108594g(aVar, "action");
            int[] c = this.f187107n.mo75026c(this.f187108o, view);
            int i = c[0];
            int i2 = c[1];
            int l = mo10339l(Math.max(Math.abs(i), Math.abs(i2)));
            if (l > 0) {
                aVar.mo17388b(i, i2, l, this.f152290i);
            }
        }

        /* renamed from: k */
        public float mo3227k(DisplayMetrics displayMetrics) {
            C87412m.m108594g(displayMetrics, "displayMetrics");
            return 100.0f / ((float) displayMetrics.densityDpi);
        }

        /* renamed from: m */
        public int mo10340m(int i) {
            int m = super.mo10340m(i);
            if (100 > m) {
                return m;
            }
            return 100;
        }
    }

    public C64987u(Context context, int i) {
        C87412m.m108594g(context, "context");
        this.f187103f = context;
        this.f187104g = i;
    }

    /* renamed from: c */
    public int[] mo75026c(RecyclerView.LayoutManager layoutManager, View view) {
        C32226l<? super Integer, C13598b0> lVar;
        C87412m.m108594g(layoutManager, "layoutManager");
        C87412m.m108594g(view, "targetView");
        int[] iArr = new int[2];
        if (this.f187105h == null) {
            this.f187105h = new C16680w(layoutManager);
        }
        C87412m.m108591d(this.f187105h);
        iArr[0] = mo89143n(view) - this.f187104g;
        iArr[1] = 0;
        Log.m105918d("MicroMsg.FinderTemplateListPlugin", "calculateDistanceToFinalSnap :" + iArr[0]);
        if (iArr[0] == 0 && (lVar = this.f187106i) != null) {
            lVar.invoke(Integer.valueOf(layoutManager.getPosition(view)));
        }
        return iArr;
    }

    /* renamed from: e */
    public C54256s mo75028e(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager == null) {
            return null;
        }
        return new C64988a(this, layoutManager, this.f187103f);
    }

    /* renamed from: f */
    public View mo75029f(RecyclerView.LayoutManager layoutManager) {
        C87412m.m108594g(layoutManager, "layoutManager");
        if (this.f187105h == null) {
            this.f187105h = new C16680w(layoutManager);
        }
        C87412m.m108591d(this.f187105h);
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount != 0) {
            int i = Integer.MAX_VALUE;
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = layoutManager.getChildAt(i3);
                C87412m.m108591d(childAt);
                int abs = Math.abs(mo89143n(childAt) - this.f187104g);
                if (abs < i) {
                    i2 = i3;
                    view = childAt;
                    i = abs;
                }
            }
            Log.m105918d("MicroMsg.FinderTemplateListPlugin", "findSelectView:" + i2 + " absClosest:" + i);
        }
        return view;
    }

    /* renamed from: n */
    public final int mo89143n(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
        return ((view.getRight() + layoutParams2.rightMargin) + (view.getLeft() - layoutParams2.leftMargin)) / 2;
    }
}
