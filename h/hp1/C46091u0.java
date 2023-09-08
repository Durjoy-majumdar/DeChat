package hp1;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import er1.C58741j5;
import fy3.C32226l;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;
import te3.C52124yj1;
import te3.C52272zj1;
import zt3.C119157j;

/* renamed from: hp1.u0 */
public final class C46091u0 implements C46087c1 {

    /* renamed from: a */
    public ListView f124249a;

    /* renamed from: b */
    public C46094d f124250b;

    /* renamed from: c */
    public View f124251c;

    /* renamed from: d */
    public boolean f124252d;

    /* renamed from: e */
    public boolean f124253e;

    /* renamed from: hp1.u0$c */
    public static final class C8700c implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ MMActivity f27924d;

        public C8700c(MMActivity mMActivity) {
            this.f27924d = mMActivity;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/search/FinderSearchHistoryLogic$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            this.f27924d.hideVKB();
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/finder/search/FinderSearchHistoryLogic$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: hp1.u0$a */
    public static final class C46092a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C46091u0 f124254d;

        /* renamed from: e */
        public final /* synthetic */ C46086b1 f124255e;

        public C46092a(C46091u0 u0Var, C46086b1 b1Var) {
            this.f124254d = u0Var;
            this.f124255e = b1Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/search/FinderSearchHistoryLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            View view2 = this.f124254d.f124251c;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderSearchHistoryLogic$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/search/FinderSearchHistoryLogic$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C46096e eVar = C46096e.f124260a;
            C46096e.f124261b.f145324d.clear();
            eVar.mo71538a();
            ((C119157j) C119157j.f356862d).mo183875f(C46098v0.f124266d);
            C46086b1 b1Var = this.f124255e;
            if (b1Var != null) {
                b1Var.mo9521a();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/search/FinderSearchHistoryLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: hp1.u0$b */
    public static final class C46093b implements AdapterView.OnItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ C32226l<String, C13598b0> f124256d;

        public C46093b(C32226l<? super String, C13598b0> lVar) {
            this.f124256d = lVar;
        }

        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/search/FinderSearchHistoryLogic$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            C32226l<String, C13598b0> lVar = this.f124256d;
            C46096e eVar = C46096e.f124260a;
            String str = C46096e.f124261b.f145324d.get(i).f146026e;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            lVar.invoke(str);
            String str3 = C46096e.f124261b.f145324d.get(i).f146026e;
            if (str3 != null) {
                str2 = str3;
            }
            eVar.mo71539b(str2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/search/FinderSearchHistoryLogic$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: hp1.u0$d */
    public final class C46094d extends BaseAdapter {

        /* renamed from: hp1.u0$d$a */
        public static final class C46095a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ int f124258d;

            /* renamed from: e */
            public final /* synthetic */ C46091u0 f124259e;

            public C46095a(int i, C46091u0 u0Var) {
                this.f124258d = i;
                this.f124259e = u0Var;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/finder/search/FinderSearchHistoryLogic$HistoryAdapter$getView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C46096e eVar = C46096e.f124260a;
                C46096e.f124261b.f145324d.remove(this.f124258d);
                eVar.mo71538a();
                ((C119157j) C119157j.f356862d).mo183875f(C46098v0.f124266d);
                this.f124259e.mo71530d();
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/search/FinderSearchHistoryLogic$HistoryAdapter$getView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C46094d() {
        }

        public int getCount() {
            C46096e eVar = C46096e.f124260a;
            return C46096e.f124261b.f145324d.size();
        }

        public Object getItem(int i) {
            C46096e eVar = C46096e.f124260a;
            C52272zj1 zj12 = C46096e.f124261b.f145324d.get(i);
            C87412m.m108593f(zj12, "HistoryDataManager.searchHistory.List[position]");
            return zj12;
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C46097f fVar;
            if (view == null) {
                C87412m.m108591d(viewGroup);
                LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
                C46091u0 u0Var = C46091u0.this;
                view = from.inflate(u0Var.f124252d ? u0Var.f124253e ? C0966R.C0971layout.ac_ : C0966R.C0971layout.ac9 : u0Var.f124253e ? C0966R.C0971layout.aoz : C0966R.C0971layout.aoy, viewGroup, false);
                fVar = new C46097f(C46091u0.this);
                View findViewById = view.findViewById(C0966R.C0970id.bsk);
                C87412m.m108593f(findViewById, "contentView.findViewById(R.id.content_tv)");
                fVar.f124263a = (TextView) findViewById;
                View findViewById2 = view.findViewById(C0966R.C0970id.ber);
                C87412m.m108593f(findViewById2, "contentView.findViewById(R.id.close_iv)");
                fVar.f124264b = (ImageView) findViewById2;
                fVar.f124265c = view.findViewById(C0966R.C0970id.e6s);
                view.setTag(fVar);
            } else {
                Object tag = view.getTag();
                C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.search.FinderSearchHistoryLogic.HistoryItemHolder");
                fVar = (C46097f) tag;
            }
            C46096e eVar = C46096e.f124260a;
            String str = C46096e.f124261b.f145324d.get(i).f146026e;
            TextView textView = fVar.f124263a;
            if (textView != null) {
                textView.setText(str);
                ImageView imageView = fVar.f124264b;
                if (imageView != null) {
                    imageView.setOnClickListener(new C46095a(i, C46091u0.this));
                    View view2 = fVar.f124265c;
                    if (view2 != null) {
                        view2.setTag(C0966R.C0970id.d3o, str);
                    }
                    return view;
                }
                C87412m.m108603p("closeIV");
                throw null;
            }
            C87412m.m108603p("contentTV");
            throw null;
        }
    }

    /* renamed from: hp1.u0$e */
    public static final class C46096e {

        /* renamed from: a */
        public static final C46096e f124260a = new C46096e();

        /* renamed from: b */
        public static C52124yj1 f124261b = new C52124yj1();

        /* renamed from: c */
        public static HashMap<Integer, C46087c1> f124262c = new HashMap<>();

        static {
            try {
                f124261b.parseFrom(C86013q1.m106433O(C58741j5.f168194k + "search-history.info", 0, -1));
            } catch (Exception e) {
                Log.printErrStackTrace("Finder.FinderSearchHistoryLogic", e, "", new Object[0]);
            }
        }

        /* renamed from: a */
        public final void mo71538a() {
            for (C46087c1 k : f124262c.values()) {
                k.mo71525k();
            }
        }

        /* renamed from: b */
        public final void mo71539b(String str) {
            C87412m.m108594g(str, SearchIntents.EXTRA_QUERY);
            C52272zj1 zj12 = new C52272zj1();
            zj12.f146025d = System.currentTimeMillis();
            zj12.f146026e = str;
            int size = f124261b.f145324d.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                } else if (C87412m.m108589b(f124261b.f145324d.get(i).f146026e, str)) {
                    f124261b.f145324d.remove(i);
                    break;
                } else {
                    i++;
                }
            }
            f124261b.f145324d.addFirst(zj12);
            if (f124261b.f145324d.size() > 20) {
                f124261b.f145324d.removeLast();
            }
            mo71538a();
            ((C119157j) C119157j.f356862d).mo183875f(C46098v0.f124266d);
        }
    }

    /* renamed from: hp1.u0$f */
    public final class C46097f {

        /* renamed from: a */
        public TextView f124263a;

        /* renamed from: b */
        public ImageView f124264b;

        /* renamed from: c */
        public View f124265c;

        public C46097f(C46091u0 u0Var) {
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C46091u0(MMActivity mMActivity, C32226l<? super String, C13598b0> lVar) {
        this(mMActivity, false, false, lVar, (C46086b1) null);
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(lVar, "onHistoryClickListener");
    }

    /* renamed from: a */
    public final void mo71527a() {
        C46096e eVar = C46096e.f124260a;
        C46096e.f124262c.remove(Integer.valueOf(hashCode()));
    }

    /* renamed from: b */
    public final void mo71528b(String str) {
        if (!Util.isNullOrNil(str)) {
            this.f124249a.setVisibility(8);
        } else {
            this.f124249a.setVisibility(0);
        }
    }

    /* renamed from: c */
    public final void mo71529c(String str) {
        if (str != null) {
            C46096e.f124260a.mo71539b(str);
            View view = this.f124251c;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderSearchHistoryLogic", "onTextSearch", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/search/FinderSearchHistoryLogic", "onTextSearch", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: d */
    public final void mo71530d() {
        C46096e eVar = C46096e.f124260a;
        if (C46096e.f124261b.f145324d.isEmpty()) {
            View view = this.f124251c;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderSearchHistoryLogic", "updateHistoryFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/search/FinderSearchHistoryLogic", "updateHistoryFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        View view3 = this.f124251c;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(0);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderSearchHistoryLogic", "updateHistoryFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/search/FinderSearchHistoryLogic", "updateHistoryFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: k */
    public void mo71525k() {
        this.f124250b.notifyDataSetChanged();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C46091u0(MMActivity mMActivity, boolean z, C32226l<? super String, C13598b0> lVar) {
        this(mMActivity, z, false, lVar, (C46086b1) null);
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(lVar, "onHistoryClickListener");
    }

    public C46091u0(MMActivity mMActivity, boolean z, boolean z2, C32226l<? super String, C13598b0> lVar, C46086b1 b1Var) {
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(lVar, "onHistoryClickListener");
        View findViewById = mMActivity.findViewById(C0966R.C0970id.ewk);
        C87412m.m108593f(findViewById, "activity.findViewById(R.id.history_lv)");
        this.f124249a = (ListView) findViewById;
        this.f124252d = z;
        this.f124253e = z2;
        View inflate = LayoutInflater.from(mMActivity).inflate(z ? z2 ? C0966R.C0971layout.ac8 : C0966R.C0971layout.ac7 : z2 ? C0966R.C0971layout.aox : C0966R.C0971layout.aow, this.f124249a, false);
        C87412m.m108593f(inflate, "from(activity).inflate(\n…     }, historyLV, false)");
        this.f124251c = inflate;
        mo71530d();
        this.f124249a.addFooterView(this.f124251c);
        C46094d dVar = new C46094d();
        this.f124250b = dVar;
        this.f124249a.setAdapter(dVar);
        this.f124251c.setOnClickListener(new C46092a(this, b1Var));
        this.f124249a.setOnItemClickListener(new C46093b(lVar));
        this.f124249a.setOnTouchListener(new C8700c(mMActivity));
        C46096e eVar = C46096e.f124260a;
        C46096e.f124262c.put(Integer.valueOf(hashCode()), this);
    }
}
