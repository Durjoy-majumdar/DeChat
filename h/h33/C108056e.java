package h33;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.tencent.p014mm.plugin.vlog.p117ui.widget.VLogThumbView;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import sx3.C110818d0;
import u23.C111127k;
import u23.C65003a;

/* renamed from: h33.e */
public final class C108056e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ VLogThumbView f323570d;

    /* renamed from: e */
    public final /* synthetic */ long f323571e;

    /* renamed from: f */
    public final /* synthetic */ long f323572f;

    /* renamed from: g */
    public final /* synthetic */ boolean f323573g;

    public C108056e(VLogThumbView vLogThumbView, long j, long j2, boolean z) {
        this.f323570d = vLogThumbView;
        this.f323571e = j;
        this.f323572f = j2;
        this.f323573g = z;
    }

    public final void run() {
        int width = this.f323570d.getWidth();
        int height = (this.f323570d.getRecyclerView().getHeight() - this.f323570d.getRecyclerView().getPaddingTop()) - this.f323570d.getRecyclerView().getPaddingBottom();
        if (width <= 0 || height <= 0) {
            this.f323570d.getRecyclerView().post(this.f323570d.f317032s);
            return;
        }
        VLogThumbView vLogThumbView = this.f323570d;
        float f = (((float) height) * 1.0f) / ((float) vLogThumbView.f317016R);
        float f2 = ((float) width) / (((float) vLogThumbView.f317017S) * f);
        float f3 = 1000.0f;
        long j = this.f323571e;
        if (((float) j) / 1000.0f < f2) {
            f3 = ((float) j) / f2;
        }
        vLogThumbView.f317025i = 0;
        for (C65003a aVar : vLogThumbView.f317009J) {
            if (aVar.f187127g.isEmpty() && (aVar instanceof C111127k)) {
                aVar.f187126f = (((float) (aVar.f187125e - aVar.f187124d)) / f3) / ((C111127k) aVar).f332732n.f316501l.f331468f;
                aVar.mo89218f();
            }
            vLogThumbView.f317025i += (int) (aVar.f187126f * ((float) aVar.f187121a) * f);
        }
        VLogThumbView vLogThumbView2 = this.f323570d;
        vLogThumbView2.f317031r = (((float) vLogThumbView2.f317025i) * 1.0f) / ((float) (vLogThumbView2.f317027n - vLogThumbView2.f317026j));
        C111127k kVar = vLogThumbView2.f317033t;
        int i = width / 2;
        ViewGroup.LayoutParams layoutParams = vLogThumbView2.getRecyclerView().getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        kVar.f187123c = i - ((FrameLayout.LayoutParams) layoutParams).getMarginStart();
        VLogThumbView vLogThumbView3 = this.f323570d;
        vLogThumbView3.f317034u.f187123c = i;
        if (!C87412m.m108589b(C110818d0.m150917O(vLogThumbView3.f317009J, 0), this.f323570d.f317033t)) {
            VLogThumbView vLogThumbView4 = this.f323570d;
            vLogThumbView4.f317009J.add(0, vLogThumbView4.f317033t);
            VLogThumbView vLogThumbView5 = this.f323570d;
            vLogThumbView5.f317009J.add(vLogThumbView5.f317034u);
        }
        VLogThumbView vLogThumbView6 = this.f323570d;
        vLogThumbView6.f317023g.mo162859O4(vLogThumbView6.f317009J);
        this.f323570d.f317023g.notifyDataSetChanged();
        this.f323570d.getRecyclerView().measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        VLogThumbView vLogThumbView7 = this.f323570d;
        vLogThumbView7.f317008I = true;
        long j2 = this.f323572f;
        if (j2 != -1) {
            int i2 = (int) (((float) (j2 - vLogThumbView7.f317026j)) * vLogThumbView7.f317031r);
            vLogThumbView7.f317030q = i2;
            LinearLayoutManager linearLayoutManager = vLogThumbView7.f317022f;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(Integer.valueOf(-i2));
            aVar2.mo10233c(0);
            LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
            C117292a.m165358d(linearLayoutManager2, aVar2.mo10232b(), "com/tencent/mm/plugin/vlog/ui/widget/VLogThumbView$updateTracks$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            linearLayoutManager.mo16973V(((Integer) aVar2.mo10231a(0)).intValue(), ((Integer) aVar2.mo10231a(1)).intValue());
            C117292a.m165359e(linearLayoutManager2, "com/tencent/mm/plugin/vlog/ui/widget/VLogThumbView$updateTracks$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        } else if (this.f323573g) {
            int i3 = vLogThumbView7.f317029p;
            vLogThumbView7.f317030q = i3;
            LinearLayoutManager linearLayoutManager3 = vLogThumbView7.f317022f;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(Integer.valueOf(-i3));
            aVar3.mo10233c(0);
            LinearLayoutManager linearLayoutManager4 = linearLayoutManager3;
            C117292a.m165358d(linearLayoutManager4, aVar3.mo10232b(), "com/tencent/mm/plugin/vlog/ui/widget/VLogThumbView$updateTracks$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            linearLayoutManager3.mo16973V(((Integer) aVar3.mo10231a(0)).intValue(), ((Integer) aVar3.mo10231a(1)).intValue());
            C117292a.m165359e(linearLayoutManager4, "com/tencent/mm/plugin/vlog/ui/widget/VLogThumbView$updateTracks$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
    }
}
