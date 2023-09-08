package com.tencent.p014mm.plugin.fts.p059ui;

import android.content.Context;
import android.database.Cursor;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72976h2;
import eb0.C45629t0;
import ex0.C20643e;
import f40.C86709a0;
import f62.C75700k0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import pv1.C22019b;
import xv1.C102755j;
import xv1.C102758m;
import xv1.C78997u;
import xv1.C79000v;

/* renamed from: com.tencent.mm.plugin.fts.ui.m */
public abstract class C18852m extends BaseAdapter implements AbsListView.OnScrollListener, AdapterView.OnItemClickListener {

    /* renamed from: d */
    public C18854q f52854d;

    /* renamed from: e */
    public HashMap<String, Boolean> f52855e = new HashMap<>();

    /* renamed from: f */
    public SparseArray<C22019b> f52856f;

    /* renamed from: g */
    public int f52857g;

    /* renamed from: h */
    public String f52858h;

    /* renamed from: i */
    public long f52859i;

    /* renamed from: j */
    public C18853a f52860j;

    /* renamed from: com.tencent.mm.plugin.fts.ui.m$a */
    public interface C18853a {
        /* renamed from: E2 */
        void mo23760E2(int i, boolean z);
    }

    public C18852m(C18854q qVar) {
        Log.m105924i("MicroMsg.FTS.FTSBaseAdapter", "Create FTSBaseAdapter");
        this.f52854d = qVar;
        this.f52856f = new SparseArray<>();
    }

    /* renamed from: b */
    public void mo23822b() {
        this.f52856f.clear();
    }

    /* renamed from: d */
    public abstract C22019b mo23812d(int i);

    /* renamed from: f */
    public abstract void mo23813f();

    /* renamed from: g */
    public void mo23815g() {
        mo23834o();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f52855e.keySet());
        Cursor Q = ((C44660i2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku()).mo69746Q(arrayList, 1, (List<String>) null, "hidden_conv_parent");
        if (Q != null) {
            while (Q.moveToNext()) {
                C72976h2 h2Var = new C72976h2();
                h2Var.convertFrom(Q);
                C115669n.INSTANCE.mo160131h(21170, 1, h2Var.getUsername(), Integer.valueOf(C45629t0.m50816c(h2Var.getUsername())));
            }
            Q.close();
        }
    }

    public int getCount() {
        return this.f52857g;
    }

    public long getItemId(int i) {
        return 0;
    }

    public int getItemViewType(int i) {
        if (getItem(i) != null) {
            return getItem(i).f62323a;
        }
        Log.m105921e("MicroMsg.FTS.FTSBaseAdapter", "getItemViewType: get data item fail, return unknown Type, count=%d | position = %s", Integer.valueOf(this.f52857g), Integer.valueOf(i));
        return -1;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C22019b i2 = getItem(i);
        if (view == null) {
            view = i2.mo35136h().mo35143c(mo23829h(), viewGroup, view);
        }
        C22019b.C22020a aVar = (C22019b.C22020a) view.getTag();
        if (!i2.f62325c) {
            i2.mo35129a(mo23829h(), aVar, new Object[0]);
            mo23832l(mo23829h(), i2);
            i2.f62325c = true;
        }
        i2.mo35136h().mo35142b(mo23829h(), aVar, i2, new Object[0]);
        return view;
    }

    public int getViewTypeCount() {
        return 19;
    }

    /* renamed from: h */
    public Context mo23829h() {
        return this.f52854d.getContext();
    }

    /* renamed from: i */
    public C22019b getItem(int i) {
        if (this.f52856f.indexOfKey(i) >= 0) {
            return this.f52856f.get(i);
        }
        C22019b d = (i < 0 || i >= this.f52857g) ? null : mo23812d(i);
        if (d == null) {
            return this.f52856f.get(0);
        }
        this.f52856f.put(i, d);
        return d;
    }

    /* renamed from: j */
    public abstract boolean mo23814j(View view, C22019b bVar, boolean z);

    /* renamed from: k */
    public void mo23831k(int i, boolean z) {
        C18853a aVar = this.f52860j;
        if (aVar != null) {
            aVar.mo23760E2(i, z);
        }
    }

    /* renamed from: l */
    public void mo23832l(Context context, C22019b bVar) {
        if (bVar instanceof C79000v) {
            this.f52855e.put(((C79000v) bVar).f231945r, Boolean.TRUE);
        } else if (bVar instanceof C78997u) {
            this.f52855e.put(((C78997u) bVar).f231977r, Boolean.TRUE);
        } else if (bVar instanceof C102758m) {
            this.f52855e.put(((C102758m) bVar).f303428r, Boolean.TRUE);
        } else if (bVar instanceof C102755j) {
            int i = ((C102755j) bVar).f303418t.field_featureId;
            if (i == 23) {
                this.f52855e.put("qqmail", Boolean.TRUE);
            } else if (i == 27) {
                this.f52855e.put("masssendapp", Boolean.TRUE);
            } else if (i == 28) {
                this.f52855e.put("newsapp", Boolean.TRUE);
            } else if (i == 39) {
                this.f52855e.put("filehelper", Boolean.TRUE);
            } else if (i == 43) {
                this.f52855e.put("gh_43f2581f6fd6", Boolean.TRUE);
            } else if (i == 71) {
                this.f52855e.put("appbrand_notify_message", Boolean.TRUE);
            } else if (i == 69) {
                this.f52855e.put("appbrandcustomerservicemsg", Boolean.TRUE);
            } else if (i == 50 || i == 63 || i == 67) {
                this.f52855e.put("officialaccounts", Boolean.TRUE);
            } else if (i == 74) {
                this.f52855e.put("opencustomerservicemsg", Boolean.TRUE);
            }
        } else if (bVar instanceof C20643e) {
            this.f52855e.put(((C20643e) bVar).getUserName(), Boolean.TRUE);
        }
    }

    /* renamed from: n */
    public void mo23833n(int i) {
        Log.m105925i("MicroMsg.FTS.FTSBaseAdapter", "setCount %d", Integer.valueOf(i));
        this.f52857g = i;
    }

    /* renamed from: o */
    public void mo23834o() {
        this.f52857g = 0;
        this.f52858h = "";
        mo23822b();
        notifyDataSetChanged();
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/fts/ui/FTSBaseAdapter", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        this.f52854d.hideVKB();
        C22019b i2 = getItem(i - this.f52854d.getListView().getHeaderViewsCount());
        if (i2 != null) {
            this.f52854d.mo23749o6(view, i2, mo23814j(view, i2, i2.mo35136h().mo35144d(mo23829h(), view, i2, new Object[0])));
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/fts/ui/FTSBaseAdapter", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(absListView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        arrayList.add(Integer.valueOf(i3));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/fts/ui/FTSBaseAdapter", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        C117292a.m165361g(this, "com/tencent/mm/plugin/fts/ui/FTSBaseAdapter", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(absListView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/fts/ui/FTSBaseAdapter", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        C117292a.m165361g(this, "com/tencent/mm/plugin/fts/ui/FTSBaseAdapter", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
