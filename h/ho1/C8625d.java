package ho1;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.search.FTSEditTextView;
import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.p136ui.widget.MMProcessBar;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderProfileUI;
import com.tencent.p014mm.plugin.finder.profile.FinderProfilePoiDrawer;
import com.tencent.p014mm.plugin.finder.profile.FinderProfilePoiDrawer$Companion$createDrawerToAttachWindow$1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.drawer.RecyclerViewDrawer;
import gy3.C87412m;
import ho1.C8637m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import te3.C51692vg1;

/* renamed from: ho1.d */
public final class C8625d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C8626e f27738d;

    /* renamed from: e */
    public final /* synthetic */ List<C51692vg1> f27739e;

    public C8625d(C8626e eVar, boolean z, List<? extends C51692vg1> list) {
        this.f27738d = eVar;
        this.f27739e = list;
    }

    public final void onClick(View view) {
        String str;
        FTSEditTextView ftsEditText;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/profile/FinderProfilePoiHandler$handlePoiList$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C8626e eVar = this.f27738d;
        if (eVar.f27745f == null) {
            String str2 = eVar.f27749j;
            C8637m mVar = new C8637m(eVar.f27740a);
            mVar.f27781q = str2;
            mVar.f27782r = eVar;
            mVar.f27778n = new C8624c(eVar);
            eVar.f27745f = mVar;
        }
        C8626e eVar2 = this.f27738d;
        if (eVar2.f27746g == null) {
            int i = FinderProfilePoiDrawer.f16116A;
            Activity activity = eVar2.f27740a;
            Window window = activity.getWindow();
            C87412m.m108593f(window, "context.window");
            C8637m mVar2 = eVar2.f27745f;
            Log.m105924i("Finder.FinderProfilePoiDrawer", "createDrawerToAttachWindow ");
            FinderProfilePoiDrawer finderProfilePoiDrawer = new FinderProfilePoiDrawer(activity);
            finderProfilePoiDrawer.setPoiListView(mVar2);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            C8623b bVar = new C8623b();
            Context context = finderProfilePoiDrawer.getContext();
            C87412m.m108593f(context, "drawer.context");
            bVar.f27733d = context;
            bVar.f27734e = finderProfilePoiDrawer;
            finderProfilePoiDrawer.setSquaresBackgroundResource(C0966R.C0969drawable.f5051v9);
            finderProfilePoiDrawer.setEnableClickBackgroundToCloseDrawer(true);
            finderProfilePoiDrawer.mo82527b(bVar);
            int e = C75044y4.m89993e(activity);
            layoutParams.bottomMargin = e;
            Log.m105924i("Finder.FinderProfilePoiDrawer", "[initView] bottomMargin= " + e);
            View decorView = window.getDecorView();
            C87412m.m108592e(decorView, "null cannot be cast to non-null type android.widget.FrameLayout");
            ((FrameLayout) decorView).addView(finderProfilePoiDrawer, layoutParams);
            FrameLayout headerLayout = finderProfilePoiDrawer.getHeaderLayout();
            C87412m.m108594g(headerLayout, "headerLayout");
            View inflate = C85868k2.m106137b(activity).inflate(C0966R.C0971layout.ao7, headerLayout);
            C87412m.m108593f(inflate, "getInflater(context).inf…ist_header, headerLayout)");
            bVar.f27735f = inflate;
            View findViewById = inflate.findViewById(C0966R.C0970id.be_);
            if (findViewById != null) {
                findViewById.setOnClickListener(new C8622a(bVar));
            }
            if (findViewById != null) {
                bVar.mo9496a().mo82528c(findViewById);
            }
            View view2 = bVar.f27735f;
            if (view2 != null) {
                LinearLayout linearLayout = (LinearLayout) view2.findViewById(C0966R.C0970id.ca6);
                FinderProfilePoiDrawer a = bVar.mo9496a();
                C87412m.m108593f(linearLayout, "topSearchLayout");
                a.mo82528c(linearLayout);
                View view3 = bVar.f27735f;
                if (view3 != null) {
                    FTSSearchView fTSSearchView = (FTSSearchView) view3.findViewById(C0966R.C0970id.f357886ca1);
                    FinderProfilePoiDrawer a2 = bVar.mo9496a();
                    C87412m.m108593f(fTSSearchView, "searchView");
                    a2.mo82528c(fTSSearchView);
                    RefreshLoadMoreLayout centerLayout = finderProfilePoiDrawer.getCenterLayout();
                    C87412m.m108594g(centerLayout, "rlLayout");
                    bVar.f27736g = centerLayout;
                    C87412m.m108594g(centerLayout.getRecyclerView(), "<set-?>");
                    if (mVar2 != null) {
                        View view4 = bVar.f27735f;
                        if (view4 != null) {
                            RefreshLoadMoreLayout refreshLoadMoreLayout = bVar.f27736g;
                            if (refreshLoadMoreLayout != null) {
                                mVar2.f27779o = view4;
                                refreshLoadMoreLayout.setEnableRefresh(false);
                                refreshLoadMoreLayout.setEnableLoadMore(false);
                                View inflate2 = C85868k2.m106137b(mVar2.f27771d).inflate(C0966R.C0971layout.azx, (ViewGroup) null);
                                mVar2.f27774g = (MMProcessBar) inflate2.findViewById(C0966R.C0970id.ive);
                                refreshLoadMoreLayout.setLoadMoreFooter(inflate2);
                                refreshLoadMoreLayout.setActionCallback(mVar2.f27782r);
                                mVar2.f27772e = refreshLoadMoreLayout;
                                RecyclerView recyclerView = refreshLoadMoreLayout.getRecyclerView();
                                C87412m.m108594g(recyclerView, "<set-?>");
                                mVar2.f27773f = recyclerView;
                                C8637m.C8639b bVar2 = new C8637m.C8639b();
                                mVar2.f27777j = bVar2;
                                RecyclerView recyclerView2 = mVar2.f27773f;
                                if (recyclerView2 != null) {
                                    recyclerView2.setAdapter(bVar2);
                                    RecyclerView recyclerView3 = mVar2.f27773f;
                                    if (recyclerView3 != null) {
                                        recyclerView3.setLayoutManager(new LinearLayoutManager(mVar2.f27771d));
                                        mVar2.mo9509c(0);
                                    } else {
                                        C87412m.m108603p("recyclerView");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("recyclerView");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("rlLayout");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("header");
                            throw null;
                        }
                    }
                    C87412m.m108594g(finderProfilePoiDrawer.getLoadingLayout(), "loadingLayout");
                    if (activity instanceof FinderProfileUI) {
                        ((FinderProfileUI) activity).getLifecycle().addObserver(new FinderProfilePoiDrawer$Companion$createDrawerToAttachWindow$1(finderProfilePoiDrawer, activity));
                    }
                    eVar2.f27746g = finderProfilePoiDrawer;
                } else {
                    C87412m.m108603p("header");
                    throw null;
                }
            } else {
                C87412m.m108603p("header");
                throw null;
            }
        }
        C8637m mVar3 = this.f27738d.f27745f;
        if (mVar3 != null) {
            List<C51692vg1> list = this.f27739e;
            C87412m.m108594g(list, "list");
            Log.m105924i("Finder.FinderProfilePoiListView", "[initPoiList] list size=" + list.size());
            if (list.size() >= 20) {
                View view5 = mVar3.f27779o;
                LinearLayout linearLayout2 = view5 != null ? (LinearLayout) view5.findViewById(C0966R.C0970id.ca6) : null;
                View view6 = mVar3.f27779o;
                if ((view6 != null ? view6.getLayoutParams() : null) instanceof LinearLayout.LayoutParams) {
                    View view7 = mVar3.f27779o;
                    ViewGroup.LayoutParams layoutParams2 = view7 != null ? view7.getLayoutParams() : null;
                    C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    ((LinearLayout.LayoutParams) layoutParams2).bottomMargin = mVar3.f27771d.getResources().getDimensionPixelSize(C0966R.dimen.f3723cd);
                }
                View view8 = mVar3.f27779o;
                FTSSearchView fTSSearchView2 = view8 != null ? (FTSSearchView) view8.findViewById(C0966R.C0970id.f357886ca1) : null;
                mVar3.f27780p = fTSSearchView2;
                if (fTSSearchView2 != null) {
                    fTSSearchView2.f24721d.setVisibility(8);
                    TextView textView = (TextView) fTSSearchView2.findViewById(C0966R.C0970id.exa);
                    fTSSearchView2.f24723f.setBackgroundResource(C0966R.C0969drawable.a4b);
                    fTSSearchView2.f24723f.getLayoutParams().height = fTSSearchView2.getResources().getDimensionPixelSize(C0966R.dimen.f3750d1);
                    fTSSearchView2.f24725h.mo70338f();
                    LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) fTSSearchView2.f24725h.getLayoutParams();
                    layoutParams3.width = -2;
                    layoutParams3.setMarginEnd((int) fTSSearchView2.getResources().getDimension(C0966R.dimen.f3703bv));
                    fTSSearchView2.f24725h.setLayoutParams(layoutParams3);
                }
                FTSSearchView fTSSearchView3 = mVar3.f27780p;
                if (!(fTSSearchView3 == null || (ftsEditText = fTSSearchView3.getFtsEditText()) == null)) {
                    ftsEditText.setFtsEditTextListener(mVar3);
                }
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(0);
                }
                if (linearLayout2 != null) {
                    linearLayout2.setOnClickListener(new C8641n(linearLayout2, mVar3));
                }
                new C8642o(linearLayout2, mVar3);
            }
            mVar3.f27775h.clear();
            mVar3.f27775h.addAll(list);
            LinkedList<C51692vg1> linkedList = mVar3.f27775h;
            C87412m.m108594g(linkedList, "list");
            mVar3.mo9509c(linkedList.size());
            C8637m.C8639b bVar3 = mVar3.f27777j;
            if (bVar3 != null) {
                bVar3.notifyDataSetChanged();
            } else {
                C87412m.m108603p("adapter");
                throw null;
            }
        }
        FinderProfilePoiDrawer finderProfilePoiDrawer2 = this.f27738d.f27746g;
        if (finderProfilePoiDrawer2 != null) {
            finderProfilePoiDrawer2.setTopPadding(this.f27739e.size());
        }
        FinderProfilePoiDrawer finderProfilePoiDrawer3 = this.f27738d.f27746g;
        if (finderProfilePoiDrawer3 != null) {
            int i2 = RecyclerViewDrawer.f165670y;
            finderProfilePoiDrawer3.mo82542j(true, true, 0);
        }
        C8626e eVar3 = this.f27738d;
        CharSequence text = eVar3.mo9501g().getText();
        if (text == null || (str = text.toString()) == null) {
            str = "";
        }
        eVar3.mo9503j(1, str, this.f27738d.f27749j);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/profile/FinderProfilePoiHandler$handlePoiList$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
