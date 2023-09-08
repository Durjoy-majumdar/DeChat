package vn1;

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

/* renamed from: vn1.a */
public final class C52962a implements C52972d {

    /* renamed from: a */
    public ListView f147838a;

    /* renamed from: b */
    public C52966d f147839b;

    /* renamed from: c */
    public View f147840c;

    /* renamed from: vn1.a$a */
    public static final class C52963a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C52962a f147841d;

        /* renamed from: e */
        public final /* synthetic */ C52971c f147842e;

        public C52963a(C52962a aVar, C52971c cVar) {
            this.f147841d = aVar;
            this.f147842e = cVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/order/search/FinderOrderSearchHistoryLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            View view2 = this.f147841d.f147840c;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/order/search/FinderOrderSearchHistoryLogic$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/order/search/FinderOrderSearchHistoryLogic$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C52968e eVar = C52968e.f147848a;
            C52968e.f147849b.f145324d.clear();
            eVar.mo73718a();
            ((C119157j) C119157j.f356862d).mo183875f(C52970b.f147854d);
            C52971c cVar = this.f147842e;
            if (cVar != null) {
                cVar.mo73642a();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/order/search/FinderOrderSearchHistoryLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: vn1.a$b */
    public static final class C52964b implements AdapterView.OnItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ C32226l<String, C13598b0> f147843d;

        public C52964b(C32226l<? super String, C13598b0> lVar) {
            this.f147843d = lVar;
        }

        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/order/search/FinderOrderSearchHistoryLogic$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            C32226l<String, C13598b0> lVar = this.f147843d;
            C52968e eVar = C52968e.f147848a;
            String str = C52968e.f147849b.f145324d.get(i).f146026e;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            lVar.invoke(str);
            String str3 = C52968e.f147849b.f145324d.get(i).f146026e;
            if (str3 != null) {
                str2 = str3;
            }
            eVar.mo73719b(str2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/order/search/FinderOrderSearchHistoryLogic$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: vn1.a$c */
    public static final class C52965c implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ MMActivity f147844d;

        public C52965c(MMActivity mMActivity) {
            this.f147844d = mMActivity;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/order/search/FinderOrderSearchHistoryLogic$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            this.f147844d.hideVKB();
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/finder/order/search/FinderOrderSearchHistoryLogic$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: vn1.a$d */
    public final class C52966d extends BaseAdapter {

        /* renamed from: vn1.a$d$a */
        public static final class C52967a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ int f147846d;

            /* renamed from: e */
            public final /* synthetic */ C52962a f147847e;

            public C52967a(int i, C52962a aVar) {
                this.f147846d = i;
                this.f147847e = aVar;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/finder/order/search/FinderOrderSearchHistoryLogic$HistoryAdapter$getView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C52968e eVar = C52968e.f147848a;
                C52968e.f147849b.f145324d.remove(this.f147846d);
                eVar.mo73718a();
                ((C119157j) C119157j.f356862d).mo183875f(C52970b.f147854d);
                this.f147847e.mo73708a();
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/order/search/FinderOrderSearchHistoryLogic$HistoryAdapter$getView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C52966d() {
        }

        public int getCount() {
            C52968e eVar = C52968e.f147848a;
            return C52968e.f147849b.f145324d.size();
        }

        public Object getItem(int i) {
            C52968e eVar = C52968e.f147848a;
            C52272zj1 zj12 = C52968e.f147849b.f145324d.get(i);
            C87412m.m108593f(zj12, "HistoryDataManager.searchHistory.List[position]");
            return zj12;
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C52969f fVar;
            if (view == null) {
                C87412m.m108591d(viewGroup);
                view = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.amu, viewGroup, false);
                fVar = new C52969f(C52962a.this);
                View findViewById = view.findViewById(C0966R.C0970id.bsk);
                C87412m.m108593f(findViewById, "contentView.findViewById(R.id.content_tv)");
                fVar.f147851a = (TextView) findViewById;
                View findViewById2 = view.findViewById(C0966R.C0970id.ber);
                C87412m.m108593f(findViewById2, "contentView.findViewById(R.id.close_iv)");
                fVar.f147852b = (ImageView) findViewById2;
                fVar.f147853c = view.findViewById(C0966R.C0970id.e6s);
                view.setTag(fVar);
            } else {
                Object tag = view.getTag();
                C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.order.search.FinderOrderSearchHistoryLogic.HistoryItemHolder");
                fVar = (C52969f) tag;
            }
            C52968e eVar = C52968e.f147848a;
            String str = C52968e.f147849b.f145324d.get(i).f146026e;
            TextView textView = fVar.f147851a;
            if (textView != null) {
                textView.setText(str);
                ImageView imageView = fVar.f147852b;
                if (imageView != null) {
                    imageView.setOnClickListener(new C52967a(i, C52962a.this));
                    View view2 = fVar.f147853c;
                    if (view2 != null) {
                        view2.setTag(C0966R.C0970id.d5_, str);
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

    /* renamed from: vn1.a$e */
    public static final class C52968e {

        /* renamed from: a */
        public static final C52968e f147848a = new C52968e();

        /* renamed from: b */
        public static C52124yj1 f147849b = new C52124yj1();

        /* renamed from: c */
        public static HashMap<Integer, C52972d> f147850c = new HashMap<>();

        static {
            try {
                f147849b.parseFrom(C86013q1.m106433O(C58741j5.f168194k + "order-search-history.info", 0, -1));
            } catch (Exception e) {
                Log.printErrStackTrace("Finder.FinderSearchHistoryLogic", e, "", new Object[0]);
            }
        }

        /* renamed from: a */
        public final void mo73718a() {
            for (C52972d k : f147850c.values()) {
                k.mo73709k();
            }
        }

        /* renamed from: b */
        public final void mo73719b(String str) {
            C87412m.m108594g(str, SearchIntents.EXTRA_QUERY);
            C52272zj1 zj12 = new C52272zj1();
            zj12.f146025d = System.currentTimeMillis();
            zj12.f146026e = str;
            int size = f147849b.f145324d.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                } else if (C87412m.m108589b(f147849b.f145324d.get(i).f146026e, str)) {
                    f147849b.f145324d.remove(i);
                    break;
                } else {
                    i++;
                }
            }
            f147849b.f145324d.addFirst(zj12);
            if (f147849b.f145324d.size() > 20) {
                f147849b.f145324d.removeLast();
            }
            mo73718a();
            ((C119157j) C119157j.f356862d).mo183875f(C52970b.f147854d);
        }
    }

    /* renamed from: vn1.a$f */
    public final class C52969f {

        /* renamed from: a */
        public TextView f147851a;

        /* renamed from: b */
        public ImageView f147852b;

        /* renamed from: c */
        public View f147853c;

        public C52969f(C52962a aVar) {
        }
    }

    public C52962a(MMActivity mMActivity, C32226l<? super String, C13598b0> lVar, C52971c cVar) {
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(lVar, "onHistoryClickListener");
        View findViewById = mMActivity.findViewById(C0966R.C0970id.ewk);
        C87412m.m108593f(findViewById, "activity.findViewById(R.id.history_lv)");
        this.f147838a = (ListView) findViewById;
        View inflate = LayoutInflater.from(mMActivity).inflate(C0966R.C0971layout.amt, this.f147838a, false);
        C87412m.m108593f(inflate, "from(activity).inflate(R…footer, historyLV, false)");
        this.f147840c = inflate;
        mo73708a();
        this.f147838a.addFooterView(this.f147840c);
        C52966d dVar = new C52966d();
        this.f147839b = dVar;
        this.f147838a.setAdapter(dVar);
        this.f147840c.setOnClickListener(new C52963a(this, cVar));
        this.f147838a.setOnItemClickListener(new C52964b(lVar));
        this.f147838a.setOnTouchListener(new C52965c(mMActivity));
        C52968e eVar = C52968e.f147848a;
        C52968e.f147850c.put(Integer.valueOf(hashCode()), this);
    }

    /* renamed from: a */
    public final void mo73708a() {
        C52968e eVar = C52968e.f147848a;
        if (C52968e.f147849b.f145324d.isEmpty()) {
            View view = this.f147840c;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/order/search/FinderOrderSearchHistoryLogic", "updateHistoryFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/order/search/FinderOrderSearchHistoryLogic", "updateHistoryFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        View view3 = this.f147840c;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(0);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/order/search/FinderOrderSearchHistoryLogic", "updateHistoryFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/order/search/FinderOrderSearchHistoryLogic", "updateHistoryFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: k */
    public void mo73709k() {
        this.f147839b.notifyDataSetChanged();
    }
}
