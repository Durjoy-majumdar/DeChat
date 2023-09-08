package rs1;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.feed.FinderTimelineMachinePresenter$onAttach$3;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import kf1.C10029wa;
import kf1.C10046xa;
import kf1.C10059ya;
import kf1.C9691db;
import kf1.C9702eb;
import o40.C61926c;
import os1.C11739f;
import os1.C11752r;
import pe3.C89349b;
import te3.C52112yg0;

/* renamed from: rs1.wa */
public final class C13524wa extends UIComponent {

    /* renamed from: d */
    public C10029wa f38355d;

    /* renamed from: rs1.wa$a */
    public static final class C13525a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ C13524wa f38356d;

        public C13525a(C13524wa waVar) {
            this.f38356d = waVar;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f38356d.onBackPressed();
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13524wa(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.aqk;
    }

    public boolean onBackPressed() {
        getActivity().finish();
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((MMActivity) activity).setMMTitle((int) C0966R.string.d0g);
        AppCompatActivity activity2 = getActivity();
        C87412m.m108592e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((MMActivity) activity2).setBackBtn(new C13525a(this));
        AppCompatActivity activity3 = getActivity();
        C87412m.m108592e(activity3, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        this.f38355d = new C10029wa((MMActivity) activity3);
        AppCompatActivity activity4 = getActivity();
        C87412m.m108592e(activity4, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        MMActivity mMActivity = (MMActivity) activity4;
        C10029wa waVar = this.f38355d;
        if (waVar != null) {
            C9702eb ebVar = new C9702eb(mMActivity, waVar, getRootView(), getFragment());
            C10029wa waVar2 = this.f38355d;
            if (waVar2 != null) {
                waVar2.f30737i = ebVar;
                waVar2.mo10486e().mo10304d(waVar2.f30742q.getDataListJustForAdapter());
                waVar2.f30742q.register(ebVar.mo10303c());
                waVar2.f30733e.register(waVar2.f30743r);
                waVar2.f30734f.mo11600c3(4).f34369b.size();
                BaseFeedLoader.requestInit$default(waVar2.f30742q, false, 1, (Object) null);
                waVar2.f30742q.f13851q = new C10046xa(waVar2);
                waVar2.mo10486e().getRecyclerView().mo17043c(new C10059ya(waVar2));
                FinderTimelineMachinePresenter$onAttach$3 finderTimelineMachinePresenter$onAttach$3 = new FinderTimelineMachinePresenter$onAttach$3(waVar2, C40008f.f107254d);
                waVar2.f30745t = finderTimelineMachinePresenter$onAttach$3;
                finderTimelineMachinePresenter$onAttach$3.alive();
                return;
            }
            C87412m.m108603p("presenter");
            throw null;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    public void onDestroy() {
        super.onDestroy();
        C10029wa waVar = this.f38355d;
        if (waVar != null) {
            waVar.onDetach();
        } else {
            C87412m.m108603p("presenter");
            throw null;
        }
    }

    public void onFinished() {
        super.onFinished();
        C10029wa waVar = this.f38355d;
        if (waVar != null) {
            C11739f.m11436j3(waVar.f30734f, 4, 0, waVar.f30738j, waVar.f30742q.getDataListJustForAdapter(), (ArrayList) null, (C89349b) null, false, false, 240, (Object) null);
            C52112yg0 yg02 = waVar.f30740o;
            if (yg02 != null) {
                C11752r rVar = waVar.f30735g;
                rVar.getClass();
                Log.m105924i("Finder.FinderTagCacheVm", "tabType=" + 4 + " lastExitPosition=" + -1 + "  lastDataList size=" + yg02.f145273d.size() + ' ');
                ConcurrentHashMap<Integer, C11752r.C11753a> concurrentHashMap = rVar.f34408d;
                C11752r.C11753a aVar = new C11752r.C11753a(4);
                aVar.f34410b = yg02;
                concurrentHashMap.put(4, aVar);
                return;
            }
            return;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    public void onUserVisibleFocused() {
        super.onUserVisibleFocused();
        C10029wa waVar = this.f38355d;
        if (waVar != null) {
            C61926c.m72656A((String) null, new C9691db(waVar));
        } else {
            C87412m.m108603p("presenter");
            throw null;
        }
    }
}
