package ko1;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0734g2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.profile.filter.FinderTopicFilterView;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileTabUIC;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import rx3.C13598b0;
import sx3.C36907w;
import te3.C51270sn1;

/* renamed from: ko1.c */
public final class C10370c implements C10374g {

    /* renamed from: a */
    public final Activity f31571a;

    /* renamed from: b */
    public final ArrayList<C51270sn1> f31572b;

    /* renamed from: c */
    public final String f31573c;

    /* renamed from: d */
    public final int f31574d;

    /* renamed from: e */
    public final ArrayList<C0734g2> f31575e;

    /* renamed from: f */
    public C32227p<? super C51270sn1, ? super Boolean, C13598b0> f31576f;

    /* renamed from: g */
    public boolean f31577g;

    /* renamed from: h */
    public FinderTopicFilterView f31578h;

    public C10370c(Activity activity, ArrayList arrayList, String str, int i, int i2, C8480h hVar) {
        i = (i2 & 8) != 0 ? 1 : i;
        C87412m.m108594g(activity, "context");
        C87412m.m108594g(arrayList, "outerDataList");
        C87412m.m108594g(str, "username");
        this.f31571a = activity;
        this.f31572b = arrayList;
        this.f31573c = str;
        this.f31574d = i;
        this.f31575e = new ArrayList<>();
    }

    /* renamed from: a */
    public void mo10672a() {
        boolean isEmpty = this.f31575e.isEmpty();
        this.f31575e.clear();
        ArrayList<C0734g2> arrayList = this.f31575e;
        ArrayList<C51270sn1> arrayList2 = this.f31572b;
        ArrayList arrayList3 = new ArrayList(C36907w.m41090l(arrayList2, 10));
        for (C51270sn1 g2Var : arrayList2) {
            C0734g2 g2Var2 = new C0734g2(g2Var, this.f31574d);
            g2Var2.f1752g = this.f31577g;
            arrayList3.add(g2Var2);
        }
        arrayList.addAll(arrayList3);
        if (this.f31575e.isEmpty()) {
            FinderTopicFilterView finderTopicFilterView = this.f31578h;
            if (finderTopicFilterView != null) {
                finderTopicFilterView.setVisibility(8);
            }
        } else {
            FinderTopicFilterView finderTopicFilterView2 = this.f31578h;
            if (finderTopicFilterView2 != null) {
                finderTopicFilterView2.setVisibility(0);
            }
        }
        FinderTopicFilterView finderTopicFilterView3 = this.f31578h;
        if (finderTopicFilterView3 != null) {
            finderTopicFilterView3.mo3777d();
        }
        Log.m105924i("Finder.FinderTopicFilterContract", "refresh, dataList size:" + this.f31575e.size());
        if (isEmpty && (!this.f31575e.isEmpty())) {
            C115669n nVar = C115669n.INSTANCE;
            nVar.kvStat(21570, this.f31573c + ",1,");
        }
    }

    /* renamed from: b */
    public View mo10673b(int i) {
        this.f31575e.clear();
        ArrayList<C0734g2> arrayList = this.f31575e;
        ArrayList<C51270sn1> arrayList2 = this.f31572b;
        ArrayList arrayList3 = new ArrayList(C36907w.m41090l(arrayList2, 10));
        for (C51270sn1 g2Var : arrayList2) {
            C0734g2 g2Var2 = new C0734g2(g2Var, i);
            g2Var2.f1752g = this.f31577g;
            arrayList3.add(g2Var2);
        }
        arrayList.addAll(arrayList3);
        FinderTopicFilterView finderTopicFilterView = new FinderTopicFilterView(this.f31571a);
        finderTopicFilterView.mo3776c(this);
        finderTopicFilterView.mo3777d();
        if (this.f31575e.isEmpty()) {
            FinderTopicFilterView finderTopicFilterView2 = this.f31578h;
            if (finderTopicFilterView2 != null) {
                finderTopicFilterView2.setVisibility(8);
            }
        } else {
            FinderProfileTabUIC finderProfileTabUIC = (FinderProfileTabUIC) C39818r.f106831a.mo62443b(this.f31571a).mo62449e(FinderProfileTabUIC.class);
            if (finderProfileTabUIC != null) {
                finderProfileTabUIC.f160647D = true;
                finderProfileTabUIC.mo78525l3();
                FinderTopicFilterView finderTopicFilterView3 = this.f31578h;
                if (finderTopicFilterView3 != null) {
                    finderTopicFilterView3.setVisibility(0);
                }
            }
        }
        this.f31578h = finderTopicFilterView;
        return finderTopicFilterView;
    }

    /* renamed from: e */
    public void mo10674e(boolean z) {
        RecyclerView.C16613e adapter;
        ArrayList<C0734g2> arrayList;
        FinderTopicFilterView finderTopicFilterView = this.f31578h;
        if (finderTopicFilterView != null) {
            C10370c cVar = finderTopicFilterView.f16129d;
            if (cVar != null) {
                cVar.f31577g = z;
            }
            if (!(cVar == null || (arrayList = cVar.f31575e) == null)) {
                Iterator<C0734g2> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().f1752g = z;
                }
            }
            WxRecyclerView wxRecyclerView = finderTopicFilterView.f16130e;
            if (!(wxRecyclerView == null || (adapter = wxRecyclerView.getAdapter()) == null)) {
                adapter.notifyDataSetChanged();
            }
            int color = z ? finderTopicFilterView.getContext().getResources().getColor(C0966R.color.f3460zr) : finderTopicFilterView.getContext().getResources().getColor(C0966R.color.FG_1);
            TextView textView = (TextView) finderTopicFilterView.findViewById(C0966R.C0970id.d2r);
            if (textView != null) {
                textView.setTextColor(color);
            }
        }
    }

    public View getView() {
        return this.f31578h;
    }

    public boolean hasData() {
        return !this.f31572b.isEmpty();
    }
}
