package com.tencent.p014mm.plugin.finder.presenter.contract;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cl1.C54991o;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fj1.C45795b;
import fo1.C59264a;
import fo1.C8178c;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import kotlin.Metadata;
import te3.C64848y91;
import ve1.C65666s4;

@Metadata(mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveSubTagConstract;", "", "()V", "Presenter", "ViewCallback", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveSubTagConstract */
public final class FinderLiveSubTagConstract {

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveSubTagConstract$Presenter;", "Lfo1/a;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveSubTagConstract$ViewCallback;", "Companion", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveSubTagConstract$Presenter */
    public static final class Presenter implements C59264a<ViewCallback> {

        /* renamed from: d */
        public final C64848y91 f160339d;

        /* renamed from: e */
        public final ArrayList<C0740i2> f160340e;

        /* renamed from: f */
        public boolean f160341f;

        /* renamed from: g */
        public WxRecyclerAdapter<C0740i2> f160342g;

        /* renamed from: h */
        public C45795b f160343h;

        /* renamed from: i */
        public C64848y91 f160344i;

        /* renamed from: j */
        public C65666s4 f160345j;

        /* renamed from: n */
        public ViewCallback f160346n;

        @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveSubTagConstract$Presenter$Companion;", "", "()V", "TAG", "", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
        /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveSubTagConstract$Presenter$Companion */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(C8480h hVar) {
                this();
            }
        }

        static {
            new Companion((C8480h) null);
        }

        public Presenter(C64848y91 y912, ArrayList<C0740i2> arrayList, boolean z) {
            C87412m.m108594g(arrayList, "tagData");
            this.f160339d = y912;
            this.f160340e = arrayList;
            this.f160341f = z;
        }

        /* renamed from: e */
        public void mo78463e(ViewCallback viewCallback) {
            C87412m.m108594g(viewCallback, "callback");
            StringBuilder sb = new StringBuilder();
            sb.append("onAttach parentTag:");
            C64848y91 y912 = this.f160339d;
            sb.append(y912 != null ? y912.f186454e : null);
            sb.append(" tagData:");
            sb.append(this.f160340e);
            sb.append(" hasNextAction:");
            sb.append(this.f160341f);
            Log.m105924i("FinderLiveSubTagConstract.Presenter", sb.toString());
            FinderLiveService.f159376d.getClass();
            C45795b bVar = FinderLiveService.f159348A;
            if (bVar == null) {
                bVar = new C45795b("FinderLiveSubTagConstract");
            }
            this.f160343h = bVar;
            C64848y91 y913 = ((C54991o) bVar.mo71262a(C54991o.class)).f154326i2;
            this.f160344i = y913;
            this.f160345j = new C65666s4(y913);
            WxRecyclerAdapter<C0740i2> wxRecyclerAdapter = new WxRecyclerAdapter<>(new FinderLiveSubTagConstract$Presenter$onAttach$1(this), this.f160340e, false);
            wxRecyclerAdapter.f173488o = new FinderLiveSubTagConstract$Presenter$onAttach$2$1(this);
            this.f160342g = wxRecyclerAdapter;
            this.f160346n = viewCallback;
            View findViewById = viewCallback.f160347d.findViewById(C0966R.C0970id.dzl);
            C87412m.m108593f(findViewById, "activity.findViewById(R.…r_live_sub_tag_ui_header)");
            viewCallback.f160349f = (RelativeLayout) findViewById;
            View findViewById2 = viewCallback.f160347d.findViewById(C0966R.C0970id.dzn);
            C87412m.m108593f(findViewById2, "activity.findViewById(R.…sub_tag_ui_header_cancel)");
            viewCallback.f160350g = (WeImageView) findViewById2;
            View findViewById3 = viewCallback.f160347d.findViewById(C0966R.C0970id.dzo);
            C87412m.m108593f(findViewById3, "activity.findViewById(R.…_sub_tag_ui_header_title)");
            viewCallback.f160351h = (TextView) findViewById3;
            View findViewById4 = viewCallback.f160347d.findViewById(C0966R.C0970id.dzm);
            C87412m.m108593f(findViewById4, "activity.findViewById(R.…tag_ui_header_action_btn)");
            viewCallback.f160352i = (TextView) findViewById4;
            View findViewById5 = viewCallback.f160347d.findViewById(C0966R.C0970id.dzk);
            C87412m.m108593f(findViewById5, "activity.findViewById(R.…_live_sub_tag_ui_content)");
            RecyclerView recyclerView = (RecyclerView) findViewById5;
            viewCallback.f160353j = recyclerView;
            recyclerView.setLayoutManager(new LinearLayoutManager(viewCallback.f160347d));
            RecyclerView recyclerView2 = viewCallback.f160353j;
            if (recyclerView2 != null) {
                WxRecyclerAdapter<C0740i2> wxRecyclerAdapter2 = viewCallback.f160348e.f160342g;
                if (wxRecyclerAdapter2 != null) {
                    recyclerView2.setAdapter(wxRecyclerAdapter2);
                    RecyclerView recyclerView3 = viewCallback.f160353j;
                    if (recyclerView3 != null) {
                        ViewGroup.LayoutParams layoutParams = recyclerView3.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                        if (marginLayoutParams != null) {
                            marginLayoutParams.bottomMargin += C75044y4.m89991c(viewCallback.f160347d);
                        }
                        TextView textView = viewCallback.f160351h;
                        if (textView != null) {
                            C64848y91 y914 = viewCallback.f160348e.f160339d;
                            textView.setText(y914 != null ? y914.f186454e : null);
                            RelativeLayout relativeLayout = viewCallback.f160349f;
                            if (relativeLayout != null) {
                                ViewGroup.LayoutParams layoutParams2 = relativeLayout.getLayoutParams();
                                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                                if (marginLayoutParams2 != null) {
                                    marginLayoutParams2.topMargin += C75044y4.m89994f(viewCallback.f160347d);
                                }
                                WeImageView weImageView = viewCallback.f160350g;
                                if (weImageView != null) {
                                    weImageView.setOnClickListener(new FinderLiveSubTagConstract$ViewCallback$initView$3(viewCallback));
                                    viewCallback.mo78464p();
                                    if (viewCallback.f160348e.f160341f) {
                                        TextView textView2 = viewCallback.f160352i;
                                        if (textView2 != null) {
                                            textView2.setText(viewCallback.f160347d.getContext().getResources().getString(C0966R.string.equ));
                                        } else {
                                            C87412m.m108603p("actionBtn");
                                            throw null;
                                        }
                                    } else {
                                        TextView textView3 = viewCallback.f160352i;
                                        if (textView3 != null) {
                                            textView3.setText(viewCallback.f160347d.getContext().getResources().getString(C0966R.string.f8014z_));
                                        } else {
                                            C87412m.m108603p("actionBtn");
                                            throw null;
                                        }
                                    }
                                    TextView textView4 = viewCallback.f160352i;
                                    if (textView4 != null) {
                                        textView4.setOnClickListener(new FinderLiveSubTagConstract$ViewCallback$initView$4(viewCallback));
                                    } else {
                                        C87412m.m108603p("actionBtn");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("cancelBtn");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("header");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("titleTv");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("tagRecyclerView");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("adapter");
                    throw null;
                }
            } else {
                C87412m.m108603p("tagRecyclerView");
                throw null;
            }
        }

        public void onDetach() {
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveSubTagConstract$ViewCallback;", "Lfo1/c;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveSubTagConstract$Presenter;", "Companion", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveSubTagConstract$ViewCallback */
    public static final class ViewCallback implements C8178c<Presenter> {

        /* renamed from: d */
        public final MMActivity f160347d;

        /* renamed from: e */
        public final Presenter f160348e;

        /* renamed from: f */
        public RelativeLayout f160349f;

        /* renamed from: g */
        public WeImageView f160350g;

        /* renamed from: h */
        public TextView f160351h;

        /* renamed from: i */
        public TextView f160352i;

        /* renamed from: j */
        public RecyclerView f160353j;

        @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveSubTagConstract$ViewCallback$Companion;", "", "()V", "TAG", "", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
        /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveSubTagConstract$ViewCallback$Companion */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(C8480h hVar) {
                this();
            }
        }

        static {
            new Companion((C8480h) null);
        }

        public ViewCallback(MMActivity mMActivity, Presenter presenter) {
            C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            C87412m.m108594g(presenter, "presenter");
            this.f160347d = mMActivity;
            this.f160348e = presenter;
        }

        public MMFragmentActivity getActivity() {
            return this.f160347d;
        }

        /* renamed from: p */
        public final void mo78464p() {
            TextView textView = this.f160352i;
            if (textView != null) {
                C64848y91 y912 = this.f160348e.f160344i;
                boolean z = false;
                if (y912 != null) {
                    String str = y912.f186454e;
                    if (!(str == null || str.length() == 0)) {
                        z = true;
                    }
                }
                textView.setEnabled(z);
                return;
            }
            C87412m.m108603p("actionBtn");
            throw null;
        }
    }
}
