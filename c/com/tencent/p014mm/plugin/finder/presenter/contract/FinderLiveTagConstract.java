package com.tencent.p014mm.plugin.finder.presenter.contract;

import android.content.Intent;
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

@Metadata(mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveTagConstract;", "", "()V", "Presenter", "ViewCallback", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveTagConstract */
public final class FinderLiveTagConstract {

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveTagConstract$Presenter;", "Lfo1/a;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveTagConstract$ViewCallback;", "Companion", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveTagConstract$Presenter */
    public static final class Presenter implements C59264a<ViewCallback> {

        /* renamed from: i */
        public static final /* synthetic */ int f160357i = 0;

        /* renamed from: d */
        public final ArrayList<C0740i2> f160358d;

        /* renamed from: e */
        public boolean f160359e;

        /* renamed from: f */
        public WxRecyclerAdapter<C0740i2> f160360f;

        /* renamed from: g */
        public C45795b f160361g;

        /* renamed from: h */
        public ViewCallback f160362h;

        @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveTagConstract$Presenter$Companion;", "", "()V", "TAG", "", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
        /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveTagConstract$Presenter$Companion */
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

        public Presenter(ArrayList<C0740i2> arrayList, boolean z) {
            C87412m.m108594g(arrayList, "tagData");
            this.f160358d = arrayList;
            this.f160359e = z;
        }

        /* renamed from: e */
        public void mo78467e(ViewCallback viewCallback) {
            C87412m.m108594g(viewCallback, "callback");
            Log.m105924i("FinderLiveTagConstract.Presenter", "onAttach tagData:" + this.f160358d + " hasNextAction:" + this.f160359e);
            FinderLiveService.f159376d.getClass();
            C45795b bVar = FinderLiveService.f159348A;
            if (bVar == null) {
                bVar = new C45795b("FinderLiveTagConstract");
            }
            this.f160361g = bVar;
            boolean z = false;
            WxRecyclerAdapter<C0740i2> wxRecyclerAdapter = new WxRecyclerAdapter<>(new FinderLiveTagConstract$Presenter$onAttach$1(), this.f160358d, false);
            wxRecyclerAdapter.f173488o = new FinderLiveTagConstract$Presenter$onAttach$2$1(this);
            this.f160360f = wxRecyclerAdapter;
            this.f160362h = viewCallback;
            Class cls = C54991o.class;
            View findViewById = viewCallback.f160363d.findViewById(C0966R.C0970id.f358236e03);
            C87412m.m108593f(findViewById, "activity.findViewById(R.…inder_live_tag_ui_header)");
            viewCallback.f160365f = (RelativeLayout) findViewById;
            View findViewById2 = viewCallback.f160363d.findViewById(C0966R.C0970id.e05);
            C87412m.m108593f(findViewById2, "activity.findViewById(R.…ive_tag_ui_header_cancel)");
            viewCallback.f160366g = (TextView) findViewById2;
            View findViewById3 = viewCallback.f160363d.findViewById(C0966R.C0970id.e06);
            C87412m.m108593f(findViewById3, "activity.findViewById(R.…live_tag_ui_header_title)");
            TextView textView = (TextView) findViewById3;
            View findViewById4 = viewCallback.f160363d.findViewById(C0966R.C0970id.f358237e04);
            C87412m.m108593f(findViewById4, "activity.findViewById(R.…tag_ui_header_action_btn)");
            viewCallback.f160367h = (TextView) findViewById4;
            View findViewById5 = viewCallback.f160363d.findViewById(C0966R.C0970id.f358235e02);
            C87412m.m108593f(findViewById5, "activity.findViewById(R.…nder_live_tag_ui_content)");
            RecyclerView recyclerView = (RecyclerView) findViewById5;
            viewCallback.f160368i = recyclerView;
            recyclerView.setLayoutManager(new LinearLayoutManager(viewCallback.f160363d));
            RecyclerView recyclerView2 = viewCallback.f160368i;
            String str = null;
            if (recyclerView2 != null) {
                WxRecyclerAdapter<C0740i2> wxRecyclerAdapter2 = viewCallback.f160364e.f160360f;
                if (wxRecyclerAdapter2 != null) {
                    recyclerView2.setAdapter(wxRecyclerAdapter2);
                    RecyclerView recyclerView3 = viewCallback.f160368i;
                    if (recyclerView3 != null) {
                        ViewGroup.LayoutParams layoutParams = recyclerView3.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                        if (marginLayoutParams != null) {
                            marginLayoutParams.bottomMargin += C75044y4.m89991c(viewCallback.f160363d);
                        }
                        TextView textView2 = viewCallback.f160366g;
                        if (textView2 != null) {
                            textView2.setOnClickListener(new FinderLiveTagConstract$ViewCallback$initView$2(viewCallback));
                            RelativeLayout relativeLayout = viewCallback.f160365f;
                            if (relativeLayout != null) {
                                ViewGroup.LayoutParams layoutParams2 = relativeLayout.getLayoutParams();
                                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                                if (marginLayoutParams2 != null) {
                                    marginLayoutParams2.topMargin += C75044y4.m89994f(viewCallback.f160363d);
                                }
                                TextView v = viewCallback.mo78469v();
                                C45795b bVar2 = viewCallback.f160364e.f160361g;
                                if (bVar2 != null) {
                                    if (((C54991o) bVar2.mo71262a(cls)).f154326i2 != null) {
                                        C45795b bVar3 = viewCallback.f160364e.f160361g;
                                        if (bVar3 != null) {
                                            C64848y91 y912 = ((C54991o) bVar3.mo71262a(cls)).f154326i2;
                                            if (y912 != null) {
                                                str = y912.f186454e;
                                            }
                                            if (!(str == null || str.length() == 0)) {
                                                z = true;
                                            }
                                        } else {
                                            C87412m.m108603p("liveData");
                                            throw null;
                                        }
                                    }
                                    v.setEnabled(z);
                                    if (viewCallback.f160364e.f160359e) {
                                        viewCallback.mo78469v().setText(viewCallback.f160363d.getContext().getResources().getString(C0966R.string.equ));
                                        viewCallback.mo78469v().setOnClickListener(new FinderLiveTagConstract$ViewCallback$initView$4(viewCallback));
                                        return;
                                    }
                                    viewCallback.mo78469v().setText(viewCallback.f160363d.getContext().getResources().getString(C0966R.string.f8014z_));
                                    viewCallback.mo78469v().setOnClickListener(new FinderLiveTagConstract$ViewCallback$initView$5(viewCallback));
                                    return;
                                }
                                C87412m.m108603p("liveData");
                                throw null;
                            }
                            C87412m.m108603p("header");
                            throw null;
                        }
                        C87412m.m108603p("cancelBtn");
                        throw null;
                    }
                    C87412m.m108603p("tagRecyclerView");
                    throw null;
                }
                C87412m.m108603p("adapter");
                throw null;
            }
            C87412m.m108603p("tagRecyclerView");
            throw null;
        }

        public void onDetach() {
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveTagConstract$ViewCallback;", "Lfo1/c;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveTagConstract$Presenter;", "Companion", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveTagConstract$ViewCallback */
    public static final class ViewCallback implements C8178c<Presenter> {

        /* renamed from: d */
        public final MMActivity f160363d;

        /* renamed from: e */
        public final Presenter f160364e;

        /* renamed from: f */
        public RelativeLayout f160365f;

        /* renamed from: g */
        public TextView f160366g;

        /* renamed from: h */
        public TextView f160367h;

        /* renamed from: i */
        public RecyclerView f160368i;

        @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveTagConstract$ViewCallback$Companion;", "", "()V", "TAG", "", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
        /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveTagConstract$ViewCallback$Companion */
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
            this.f160363d = mMActivity;
            this.f160364e = presenter;
        }

        public MMFragmentActivity getActivity() {
            return this.f160363d;
        }

        /* renamed from: p */
        public final void mo78468p() {
            Log.m105924i("FinderLiveTagConstract.ViewCallback", "finishWithResult hasNextAction:" + this.f160364e.f160359e);
            if (this.f160364e.f160359e) {
                new Intent();
                Intent intent = new Intent();
                intent.putExtra("KEY_START_LIVE", true);
                this.f160363d.setResult(-1, intent);
                this.f160363d.finish();
                return;
            }
            this.f160363d.setResult(-1);
            this.f160363d.finish();
        }

        /* renamed from: v */
        public final TextView mo78469v() {
            TextView textView = this.f160367h;
            if (textView != null) {
                return textView;
            }
            C87412m.m108603p("actionBtn");
            throw null;
        }
    }
}
