package ko1;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0757o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.profile.filter.FinderCollectionFilterView;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileTabUIC;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import sx3.C36907w;
import te3.C51108rh0;
import te3.C51243sh0;

/* renamed from: ko1.a */
public final class C10368a implements C10374g {

    /* renamed from: a */
    public final Activity f31565a;

    /* renamed from: b */
    public final C51243sh0 f31566b;

    /* renamed from: c */
    public final String f31567c;

    /* renamed from: d */
    public final ArrayList<C0757o> f31568d = new ArrayList<>();

    /* renamed from: e */
    public FinderCollectionFilterView f31569e;

    public C10368a(Activity activity, C51243sh0 sh02, String str) {
        C87412m.m108594g(activity, "context");
        C87412m.m108594g(sh02, "collectionInfoList");
        C87412m.m108594g(str, "username");
        this.f31565a = activity;
        this.f31566b = sh02;
        this.f31567c = str;
    }

    /* renamed from: a */
    public void mo10672a() {
        FinderCollectionFilterView finderCollectionFilterView = this.f31569e;
        if (finderCollectionFilterView != null) {
            Log.m105924i("Finder.FinderCollectionFilterView", "refresh");
            WxRecyclerView wxRecyclerView = finderCollectionFilterView.f16123e;
            if (wxRecyclerView != null) {
                RecyclerView.C16613e adapter = wxRecyclerView.getAdapter();
                if (adapter != null) {
                    adapter.notifyDataSetChanged();
                }
                WxRecyclerView wxRecyclerView2 = finderCollectionFilterView.f16123e;
                if (wxRecyclerView2 != null) {
                    wxRecyclerView2.post(new C10369b(finderCollectionFilterView));
                } else {
                    C87412m.m108603p("recyclerView");
                    throw null;
                }
            } else {
                C87412m.m108603p("recyclerView");
                throw null;
            }
        }
        Log.m105924i("Finder.FinderCollectionFilterContract", "refresh, dataList size:" + this.f31568d.size());
    }

    /* renamed from: b */
    public View mo10673b(int i) {
        this.f31568d.clear();
        ArrayList<C0757o> arrayList = this.f31568d;
        LinkedList<C51108rh0> linkedList = this.f31566b.f141509d;
        C87412m.m108593f(linkedList, "collectionInfoList.collection_info");
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(linkedList, 10));
        for (C51108rh0 rh02 : linkedList) {
            C87412m.m108593f(rh02, LocaleUtil.ITALIAN);
            arrayList2.add(new C0757o(rh02));
        }
        arrayList.addAll(arrayList2);
        FinderCollectionFilterView finderCollectionFilterView = new FinderCollectionFilterView(this.f31565a);
        finderCollectionFilterView.mo3773a(this);
        if (this.f31568d.isEmpty()) {
            FinderCollectionFilterView finderCollectionFilterView2 = this.f31569e;
            if (finderCollectionFilterView2 != null) {
                finderCollectionFilterView2.setVisibility(8);
            }
        } else {
            FinderProfileTabUIC finderProfileTabUIC = (FinderProfileTabUIC) C39818r.f106831a.mo62443b(this.f31565a).mo62449e(FinderProfileTabUIC.class);
            if (finderProfileTabUIC != null) {
                finderProfileTabUIC.f160647D = true;
                finderProfileTabUIC.mo78525l3();
                FinderCollectionFilterView finderCollectionFilterView3 = this.f31569e;
                if (finderCollectionFilterView3 != null) {
                    finderCollectionFilterView3.setVisibility(0);
                }
            }
        }
        this.f31569e = finderCollectionFilterView;
        return finderCollectionFilterView;
    }

    /* renamed from: e */
    public void mo10674e(boolean z) {
        FinderCollectionFilterView finderCollectionFilterView = this.f31569e;
        if (finderCollectionFilterView != null) {
            Log.m105924i("Finder.FinderCollectionFilterView", "notifyCoverChange: " + z);
            C10368a aVar = finderCollectionFilterView.f16122d;
            if (aVar != null) {
                Iterator<C0757o> it = aVar.f31568d.iterator();
                while (it.hasNext()) {
                    it.next().getClass();
                }
                WxRecyclerView wxRecyclerView = finderCollectionFilterView.f16123e;
                if (wxRecyclerView != null) {
                    RecyclerView.C16613e adapter = wxRecyclerView.getAdapter();
                    if (adapter != null) {
                        adapter.notifyDataSetChanged();
                    }
                    int color = z ? finderCollectionFilterView.getContext().getResources().getColor(C0966R.color.f3460zr) : finderCollectionFilterView.getContext().getResources().getColor(C0966R.color.FG_1);
                    TextView textView = (TextView) finderCollectionFilterView.findViewById(C0966R.C0970id.d2r);
                    if (textView != null) {
                        textView.setTextColor(color);
                        return;
                    }
                    return;
                }
                C87412m.m108603p("recyclerView");
                throw null;
            }
            C87412m.m108603p("presenter");
            throw null;
        }
    }

    public View getView() {
        return this.f31569e;
    }

    public boolean hasData() {
        LinkedList<C51108rh0> linkedList = this.f31566b.f141509d;
        C87412m.m108593f(linkedList, "collectionInfoList.collection_info");
        return !linkedList.isEmpty();
    }
}
