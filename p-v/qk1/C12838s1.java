package qk1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.C103853a;
import androidx.viewpager.widget.ViewPager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import gy3.C87412m;
import ig1.C8916d;
import java.util.ArrayList;
import o40.C61926c;
import sx3.C110818d0;

/* renamed from: qk1.s1 */
public final class C12838s1 extends C103853a {

    /* renamed from: d */
    public final String f36745d = "FinderLiveGiftViewPagerAdapter";

    /* renamed from: e */
    public ArrayList<WxRecyclerView> f36746e = new ArrayList<>();

    /* renamed from: f */
    public final ArrayList<ViewGroup> f36747f = new ArrayList<>();

    /* renamed from: a */
    public final void mo12366a(View view, WxRecyclerView wxRecyclerView) {
        TextView textView = (TextView) view.findViewById(C0966R.C0970id.o_0);
        RecyclerView.C16613e adapter = wxRecyclerView.getAdapter();
        C8916d dVar = null;
        C12814m1 m1Var = adapter instanceof C12814m1 ? (C12814m1) adapter : null;
        C8916d dVar2 = m1Var != null ? (C8916d) C110818d0.m150917O(m1Var.f36679g, 0) : null;
        if (dVar2 instanceof C8916d) {
            dVar = dVar2;
        }
        boolean z = true;
        if (dVar == null || !C61926c.m72696u(dVar.field_flag, 256)) {
            z = false;
        }
        if (!z || m1Var.getItemCount() > 4) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        textView.setText(wxRecyclerView.getContext().getString(C0966R.string.nan));
    }

    /* renamed from: b */
    public final void mo12367b() {
        for (WxRecyclerView adapter : this.f36746e) {
            RecyclerView.C16613e adapter2 = adapter.getAdapter();
            C12814m1 m1Var = adapter2 instanceof C12814m1 ? (C12814m1) adapter2 : null;
            if (m1Var != null) {
                m1Var.mo12350F4("", 0);
            }
        }
    }

    /* renamed from: c */
    public final void mo12368c(String str, int i) {
        C87412m.m108594g(str, "curGiftId");
        for (WxRecyclerView adapter : this.f36746e) {
            RecyclerView.C16613e adapter2 = adapter.getAdapter();
            C87412m.m108592e(adapter2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.adapter.FinderLiveGiftGridAdapter");
            ((C12814m1) adapter2).mo12350F4(str, i);
        }
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        C87412m.m108594g(viewGroup, "container");
        C87412m.m108594g(obj, "object");
        String str = this.f36745d;
        Log.m105924i(str, "destroyItem pos:" + i);
        viewGroup.removeView((View) obj);
    }

    public int getCount() {
        return this.f36746e.size();
    }

    public int getItemPosition(Object obj) {
        C87412m.m108594g(obj, "object");
        return -2;
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "container");
        String str = this.f36745d;
        Log.m105924i(str, "instantiateItem pos:" + i);
        ViewGroup viewGroup2 = this.f36747f.get(i);
        C87412m.m108593f(viewGroup2, "gridContainerList[position]");
        ViewGroup viewGroup3 = viewGroup2;
        viewGroup.addView(viewGroup3, new ViewPager.LayoutParams());
        return viewGroup3;
    }

    public boolean isViewFromObject(View view, Object obj) {
        C87412m.m108594g(view, "p0");
        C87412m.m108594g(obj, "p1");
        return C87412m.m108589b(view, obj);
    }
}
