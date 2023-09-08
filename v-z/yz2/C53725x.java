package yz2;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import b03.C39688b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.textstatus.p112ui.StatusAlbumUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60898l;
import jq3.C9493c;
import ke3.C88144b;
import lz2.C46923f;
import o40.C61926c;
import rx3.C13598b0;
import vz2.C78501d;

/* renamed from: yz2.x */
public final class C53725x extends RefreshLoadMoreLayout.C57879a {

    /* renamed from: a */
    public final /* synthetic */ StatusAlbumUI f150838a;

    /* renamed from: b */
    public final /* synthetic */ WxRecyclerAdapter<C9493c> f150839b;

    /* renamed from: yz2.x$a */
    public static final class C53726a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ StatusAlbumUI f150840d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53726a(StatusAlbumUI statusAlbumUI) {
            super(0);
            this.f150840d = statusAlbumUI;
        }

        public Object invoke() {
            Log.m105924i("MicroMsg.TextStatus.StatusAlbumUI", "onLoadMoreBegin");
            C39688b bVar = this.f150840d.f116886g;
            if (bVar != null) {
                C86709a0.m107524d().mo123460f(new C46923f(bVar.f106481f, (Long) null, (Long) null, (Long) null, (Integer) null, 30, (C8480h) null));
                return C13598b0.f38549a;
            }
            C87412m.m108603p("dataLoader");
            throw null;
        }
    }

    /* renamed from: yz2.x$b */
    public static final class C53727b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ StatusAlbumUI f150841d;

        public C53727b(StatusAlbumUI statusAlbumUI) {
            this.f150841d = statusAlbumUI;
        }

        public final void onClick(View view) {
            Bundle bundle;
            Intent intent;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/StatusAlbumUI$initView$3$onLoadMoreEnd$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent2 = new Intent();
            FragmentActivity activity = this.f150841d.getActivity();
            if (activity == null || (intent = activity.getIntent()) == null || (bundle = intent.getExtras()) == null) {
                bundle = new Bundle();
            }
            Intent putExtras = intent2.putExtras(bundle);
            C87412m.m108593f(putExtras, "Intent().putExtras(activ…intent?.extras?:Bundle())");
            putExtras.putExtra("story_only", true);
            C88144b.m109791i(this.f150841d.getContext(), "", "com.tencent.mm.ui.AlbumUI", putExtras, (Bundle) null);
            C78501d.m94805g(C78501d.f229945a, 15, (String) null, (String) null, 0, (String) null, 0, 62, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/StatusAlbumUI$initView$3$onLoadMoreEnd$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C53725x(StatusAlbumUI statusAlbumUI, WxRecyclerAdapter<C9493c> wxRecyclerAdapter) {
        this.f150838a = statusAlbumUI;
        this.f150839b = wxRecyclerAdapter;
    }

    /* renamed from: b */
    public void mo2561b(int i) {
        C61926c.m72668M(new C53726a(this.f150838a));
    }

    /* renamed from: c */
    public void mo2562c(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        Log.m105924i("MicroMsg.TextStatus.StatusAlbumUI", "onLoadMoreEnd");
        StatusAlbumUI statusAlbumUI = this.f150838a;
        C39688b bVar = statusAlbumUI.f116886g;
        if (bVar != null) {
            if (!bVar.f106482g) {
                RefreshLoadMoreLayout refreshLoadMoreLayout = statusAlbumUI.f116883d;
                if (refreshLoadMoreLayout != null) {
                    RefreshLoadMoreLayout.m66896C(refreshLoadMoreLayout, (RefreshLoadMoreLayout.C7080c) null, 1, (Object) null);
                    if (this.f150839b.f173486j.size() == 0) {
                        WxRecyclerView wxRecyclerView = this.f150838a.f116884e;
                        if (wxRecyclerView != null) {
                            LayoutInflater b = C85868k2.m106137b(wxRecyclerView.getContext());
                            WxRecyclerView wxRecyclerView2 = this.f150838a.f116884e;
                            if (wxRecyclerView2 != null) {
                                View inflate = b.inflate(C0966R.C0971layout.c_2, wxRecyclerView2, false);
                                WxRecyclerAdapter<C9493c> wxRecyclerAdapter = this.f150839b;
                                C87412m.m108593f(inflate, "footer");
                                C60898l.m71327S5(wxRecyclerAdapter, inflate, Integer.MAX_VALUE, false, 4, (Object) null);
                                inflate.findViewById(C0966R.C0970id.fl6).setOnClickListener(new C53727b(this.f150838a));
                            } else {
                                C87412m.m108603p("rvSelfHistory");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("rvSelfHistory");
                            throw null;
                        }
                    }
                    Log.m105924i("MicroMsg.TextStatus.StatusAlbumUI", "hasMoreData true");
                } else {
                    C87412m.m108603p("mRefreshLayout");
                    throw null;
                }
            }
            this.f150838a.mo67424K();
            WxRecyclerView wxRecyclerView3 = this.f150838a.f116884e;
            if (wxRecyclerView3 != null) {
                RecyclerView.C16613e adapter = wxRecyclerView3.getAdapter();
                if (adapter != null) {
                    adapter.notifyDataSetChanged();
                    return;
                }
                return;
            }
            C87412m.m108603p("rvSelfHistory");
            throw null;
        }
        C87412m.m108603p("dataLoader");
        throw null;
    }
}
