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
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusHistoryUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60898l;
import jq3.C9493c;
import ke3.C88144b;
import o40.C61926c;
import rx3.C13598b0;
import vz2.C78501d;

/* renamed from: yz2.j2 */
public final class C53686j2 extends RefreshLoadMoreLayout.C57879a {

    /* renamed from: a */
    public final /* synthetic */ TextStatusHistoryUI f150771a;

    /* renamed from: b */
    public final /* synthetic */ WxRecyclerAdapter<C9493c> f150772b;

    /* renamed from: yz2.j2$a */
    public static final class C53687a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusHistoryUI f150773d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53687a(TextStatusHistoryUI textStatusHistoryUI) {
            super(0);
            this.f150773d = textStatusHistoryUI;
        }

        public Object invoke() {
            Log.m105924i("MicroMsg.TextStatus.TextStatusHistoryUI", "onLoadMoreBegin");
            C39688b bVar = this.f150773d.f116927g;
            if (bVar != null) {
                bVar.mo62268b();
                return C13598b0.f38549a;
            }
            C87412m.m108603p("dataLoader");
            throw null;
        }
    }

    /* renamed from: yz2.j2$b */
    public static final class C53688b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ TextStatusHistoryUI f150774d;

        public C53688b(TextStatusHistoryUI textStatusHistoryUI) {
            this.f150774d = textStatusHistoryUI;
        }

        public final void onClick(View view) {
            Bundle bundle;
            Intent intent;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusHistoryUI$initView$3$onLoadMoreEnd$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent2 = new Intent();
            FragmentActivity activity = this.f150774d.getActivity();
            if (activity == null || (intent = activity.getIntent()) == null || (bundle = intent.getExtras()) == null) {
                bundle = new Bundle();
            }
            Intent putExtras = intent2.putExtras(bundle);
            C87412m.m108593f(putExtras, "Intent().putExtras(activ…intent?.extras?:Bundle())");
            putExtras.putExtra("story_only", true);
            C88144b.m109791i(this.f150774d.getContext(), "", "com.tencent.mm.ui.AlbumUI", putExtras, (Bundle) null);
            C78501d.m94805g(C78501d.f229945a, 15, (String) null, (String) null, 0, (String) null, 0, 62, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusHistoryUI$initView$3$onLoadMoreEnd$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C53686j2(TextStatusHistoryUI textStatusHistoryUI, WxRecyclerAdapter<C9493c> wxRecyclerAdapter) {
        this.f150771a = textStatusHistoryUI;
        this.f150772b = wxRecyclerAdapter;
    }

    /* renamed from: b */
    public void mo2561b(int i) {
        C61926c.m72668M(new C53687a(this.f150771a));
    }

    /* renamed from: c */
    public void mo2562c(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        Log.m105924i("MicroMsg.TextStatus.TextStatusHistoryUI", "onLoadMoreEnd");
        TextStatusHistoryUI textStatusHistoryUI = this.f150771a;
        C39688b bVar = textStatusHistoryUI.f116927g;
        if (bVar != null) {
            if (!bVar.f106482g) {
                RefreshLoadMoreLayout refreshLoadMoreLayout = textStatusHistoryUI.f116924d;
                if (refreshLoadMoreLayout != null) {
                    RefreshLoadMoreLayout.m66896C(refreshLoadMoreLayout, (RefreshLoadMoreLayout.C7080c) null, 1, (Object) null);
                    if (this.f150772b.f173486j.size() == 0) {
                        WxRecyclerView wxRecyclerView = this.f150771a.f116925e;
                        if (wxRecyclerView != null) {
                            LayoutInflater b = C85868k2.m106137b(wxRecyclerView.getContext());
                            WxRecyclerView wxRecyclerView2 = this.f150771a.f116925e;
                            if (wxRecyclerView2 != null) {
                                View inflate = b.inflate(C0966R.C0971layout.cqp, wxRecyclerView2, false);
                                WxRecyclerAdapter<C9493c> wxRecyclerAdapter = this.f150772b;
                                C87412m.m108593f(inflate, "footer");
                                C60898l.m71327S5(wxRecyclerAdapter, inflate, Integer.MAX_VALUE, false, 4, (Object) null);
                                inflate.findViewById(C0966R.C0970id.fl6).setOnClickListener(new C53688b(this.f150771a));
                            } else {
                                C87412m.m108603p("rvSelfHistory");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("rvSelfHistory");
                            throw null;
                        }
                    }
                    Log.m105924i("MicroMsg.TextStatus.TextStatusHistoryUI", "hasMoreData true");
                } else {
                    C87412m.m108603p("mRefreshLayout");
                    throw null;
                }
            }
            WxRecyclerView wxRecyclerView3 = this.f150771a.f116925e;
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
