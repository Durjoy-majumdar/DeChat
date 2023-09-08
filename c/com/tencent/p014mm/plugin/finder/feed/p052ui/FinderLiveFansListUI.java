package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import er1.C58739j4;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C46115s5;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import k60.C60979d;
import kotlin.Metadata;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import p629ny.C76979h;
import pe3.C89349b;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import rx3.C13598b0;
import te3.C50275lk0;
import tf0.C64916p1;
import up1.C27696y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveFansListUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lob0/n;", "<init>", "()V", "a", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveFansListUI */
public final class FinderLiveFansListUI extends MMFinderUI implements C11385n {

    /* renamed from: o */
    public final String f111510o = "Finder.LiveFansListUI";

    /* renamed from: p */
    public ListView f111511p;

    /* renamed from: q */
    public TextView f111512q;

    /* renamed from: r */
    public final C41416a f111513r = new C41416a();

    /* renamed from: s */
    public final ArrayList<C50275lk0> f111514s = new ArrayList<>();

    /* renamed from: t */
    public boolean f111515t;

    /* renamed from: u */
    public C89349b f111516u;

    /* renamed from: v */
    public long f111517v;

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveFansListUI$a */
    public static final class C41416a extends BaseAdapter {

        /* renamed from: d */
        public ArrayList<C50275lk0> f111518d = new ArrayList<>();

        /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveFansListUI$a$a */
        public final class C41417a extends RecyclerView.C16631z {

            /* renamed from: A */
            public TextView f111519A;

            /* renamed from: z */
            public ImageView f111520z;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C41417a(C41416a aVar, View view) {
                super(view);
                C87412m.m108594g(view, "itemView");
                View findViewById = view.findViewById(C0966R.C0970id.a27);
                C87412m.m108593f(findViewById, "itemView.findViewById<ImageView>(R.id.avatar_iv)");
                this.f111520z = (ImageView) findViewById;
                View findViewById2 = view.findViewById(C0966R.C0970id.hg4);
                C87412m.m108593f(findViewById2, "itemView.findViewById<TextView>(R.id.nickname_tv)");
                this.f111519A = (TextView) findViewById2;
            }
        }

        /* renamed from: a */
        public C50275lk0 getItem(int i) {
            boolean z = false;
            if (i >= 0 && i < this.f111518d.size()) {
                z = true;
            }
            if (!z) {
                return new C50275lk0();
            }
            C50275lk0 lk02 = this.f111518d.get(i);
            C87412m.m108593f(lk02, "{\n                dataList[position]\n            }");
            return lk02;
        }

        public int getCount() {
            return this.f111518d.size();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            String str;
            Class cls = C11990s0.class;
            Class<C60200t1> cls2 = C60200t1.class;
            C87412m.m108594g(viewGroup, "parent");
            String str2 = null;
            if (view == null) {
                view = View.inflate(viewGroup.getContext(), C0966R.C0971layout.ag6, (ViewGroup) null);
                view.setTag(new C41417a(this, view));
            }
            Object tag = view.getTag();
            C41417a aVar = tag instanceof C41417a ? (C41417a) tag : null;
            if (aVar != null) {
                C50275lk0 a = getItem(i);
                C60979d<C100810g0> K1 = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11865K1();
                FinderContact finderContact = a.f137476d;
                if (finderContact == null || (str = finderContact.headUrl) == null) {
                    str = "";
                }
                K1.mo85957c(new C62345f(str, (C27696y) null, 2, (C8480h) null), aVar.f111520z, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.WX_AVATAR));
                TextView textView = aVar.f111519A;
                C76979h hVar = (C76979h) C86312j.m106911c(C76979h.class);
                Context context = aVar.f111519A.getContext();
                C58739j4 j4Var = C58739j4.f168176a;
                FinderContact finderContact2 = a.f137476d;
                String str3 = finderContact2 != null ? finderContact2.username : null;
                if (finderContact2 != null) {
                    str2 = finderContact2.nickname;
                }
                textView.setText(hVar.mo107057T1(context, C58739j4.m68253s(j4Var, str3, str2, false, 4, (Object) null)));
            }
            return view;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveFansListUI$b */
    public static final class C41418b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveFansListUI f111521d;

        public C41418b(FinderLiveFansListUI finderLiveFansListUI) {
            this.f111521d = finderLiveFansListUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f111521d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveFansListUI$c */
    public static final class C41419c implements AbsListView.OnScrollListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveFansListUI f111522d;

        public C41419c(FinderLiveFansListUI finderLiveFansListUI) {
            this.f111522d = finderLiveFansListUI;
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            arrayList.add(Integer.valueOf(i3));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderLiveFansListUI$initView$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveFansListUI$initView$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderLiveFansListUI$initView$2", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
            if (i == 0 && absListView != null) {
                FinderLiveFansListUI finderLiveFansListUI = this.f111522d;
                if (!absListView.canScrollVertically(1)) {
                    if (finderLiveFansListUI.f111515t) {
                        C86709a0.m107524d().mo123460f(((C64916p1) C86312j.m106911c(C64916p1.class)).mo76678VK(finderLiveFansListUI.f111516u, finderLiveFansListUI.f111517v, 1));
                    } else {
                        ListView listView = finderLiveFansListUI.f111511p;
                        if (listView == null) {
                            C87412m.m108603p("listView");
                            throw null;
                        } else if (listView.getFooterViewsCount() == 0) {
                            ListView listView2 = finderLiveFansListUI.f111511p;
                            if (listView2 != null) {
                                listView2.addFooterView(View.inflate(finderLiveFansListUI, C0966R.C0971layout.al_, (ViewGroup) null));
                            } else {
                                C87412m.m108603p("listView");
                                throw null;
                            }
                        }
                    }
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveFansListUI$initView$2", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveFansListUI$d */
    public static final class C41420d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveFansListUI f111523d;

        /* renamed from: e */
        public final /* synthetic */ C117747y f111524e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41420d(FinderLiveFansListUI finderLiveFansListUI, C117747y yVar) {
            super(0);
            this.f111523d = finderLiveFansListUI;
            this.f111524e = yVar;
        }

        public Object invoke() {
            FinderLiveFansListUI finderLiveFansListUI = this.f111523d;
            LinkedList<C50275lk0> H = ((C46115s5) this.f111524e).mo71560H();
            String str = finderLiveFansListUI.f111510o;
            StringBuilder sb = new StringBuilder();
            sb.append("fans contact ");
            sb.append(H != null ? Integer.valueOf(H.size()) : null);
            Log.m105924i(str, sb.toString());
            if (H != null) {
                finderLiveFansListUI.f111514s.addAll(H);
                C41416a aVar = finderLiveFansListUI.f111513r;
                ArrayList<C50275lk0> arrayList = finderLiveFansListUI.f111514s;
                aVar.getClass();
                C87412m.m108594g(arrayList, "dataList");
                aVar.f111518d = arrayList;
                finderLiveFansListUI.f111513r.notifyDataSetChanged();
                finderLiveFansListUI.mo64502N7();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: N7 */
    public final void mo64502N7() {
        int size = this.f111514s.size();
        Log.m105925i(this.f111510o, "update title fans count %s", Integer.valueOf(size));
        setMMTitle(getString(C0966R.string.dee, new Object[]{Integer.valueOf(this.f111514s.size())}));
        if (size == 0) {
            TextView textView = this.f111512q;
            if (textView != null) {
                textView.setVisibility(0);
                TextView textView2 = this.f111512q;
                if (textView2 != null) {
                    textView2.setText(getString(C0966R.string.def));
                } else {
                    C87412m.m108603p("emptyTip");
                    throw null;
                }
            } else {
                C87412m.m108603p("emptyTip");
                throw null;
            }
        } else {
            TextView textView3 = this.f111512q;
            if (textView3 != null) {
                textView3.setVisibility(8);
            } else {
                C87412m.m108603p("emptyTip");
                throw null;
            }
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a_0;
    }

    public void initView() {
        View findViewById = findViewById(C0966R.C0970id.bpb);
        C87412m.m108593f(findViewById, "findViewById<ListView>(c…se.api.R.id.contact_list)");
        this.f111511p = (ListView) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.cj7);
        C87412m.m108593f(findViewById2, "findViewById<TextView>(c….base.api.R.id.empty_tip)");
        this.f111512q = (TextView) findViewById2;
        mo64502N7();
        setBackBtn(new C41418b(this));
        ListView listView = this.f111511p;
        if (listView != null) {
            listView.setAdapter(this.f111513r);
            ListView listView2 = this.f111511p;
            if (listView2 != null) {
                listView2.setOnScrollListener(new C41419c(this));
            } else {
                C87412m.m108603p("listView");
                throw null;
            }
        } else {
            C87412m.m108603p("listView");
            throw null;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C86709a0.m107524d().mo123455a(3531, this);
        this.f111517v = getIntent().getLongExtra("PARAM_FINDER_LIVE_ID", 0);
        String str = this.f111510o;
        Log.m105924i(str, "init intent liveId:" + this.f111517v);
        initView();
        C86709a0.m107524d().mo123460f(((C64916p1) C86312j.m106911c(C64916p1.class)).mo76678VK(this.f111516u, this.f111517v, 1));
    }

    public void onDestroy() {
        super.onDestroy();
        C86709a0.m107524d().mo123470p(3531, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        String str2 = this.f111510o;
        Log.m105924i(str2, "errType " + i + ", errCode " + i2 + ", errMsg " + str);
        if (i == 0 && i2 == 0) {
            C87412m.m108592e(yVar, "null cannot be cast to non-null type com.tencent.mm.plugin.findersdk.api.INetSceneFinderGetFansList");
            C46115s5 s5Var = (C46115s5) yVar;
            if (!C87412m.m108589b(this.f111516u, s5Var.mo71562W0())) {
                Log.m105924i(this.f111510o, "not my buf, ignore!");
                return;
            }
            this.f111515t = s5Var.mo71561I0();
            this.f111516u = s5Var.mo71563n();
            C61926c.m72668M(new C41420d(this, yVar));
        }
    }
}
