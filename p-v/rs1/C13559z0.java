package rs1;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C113200q;
import bl3.C54492n;
import cm1.C0740i2;
import co1.C0898b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.vas.VASActivity;
import com.tencent.p014mm.p136ui.vas.VASCommonFragment;
import com.tencent.p014mm.plugin.finder.biz.FinderBizProfileLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.feed.p052ui.BizProfileTimelineUI;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.preload.MediaPreloadCore;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.drawer.RecyclerViewDrawerSquares;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import fy3.C32226l;
import ge1.C8267d;
import ge1.C8271f;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8800r1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import k20.C60958c;
import k20.C9556a;
import l31.C61212e;
import nj3.C76879j;
import nx0.C11304c;
import o40.C61926c;
import p227rn.C13088a0;
import qo3.C89779i0;
import rx3.C13598b0;

@C113200q(initialMode = 2)
/* renamed from: rs1.z0 */
public final class C13559z0 extends UIComponent implements C8800r1 {

    /* renamed from: d */
    public DialogFragment f38464d;

    /* renamed from: e */
    public C89779i0 f38465e;

    /* renamed from: rs1.z0$a */
    public static final class C13560a extends C87413o implements C32226l<IResponse<C0740i2>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C13559z0 f38466d;

        /* renamed from: e */
        public final /* synthetic */ C0740i2 f38467e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13560a(C13559z0 z0Var, C0740i2 i2Var) {
            super(1);
            this.f38466d = z0Var;
            this.f38467e = i2Var;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((IResponse) obj, LocaleUtil.ITALIAN);
            this.f38466d.mo12958d3(this.f38467e);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13559z0(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final void mo12957c3(MMActivity mMActivity, Intent intent, RecyclerViewDrawerSquares.C45117c cVar, int i) {
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(intent, "intent");
        this.f38464d = ((C13088a0) C86312j.m106911c(C13088a0.class)).Rp0(mMActivity, intent, cVar, i);
        if (cVar != null) {
            cVar.mo3766g(true, true, 0);
        }
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86143M0(this.f38464d);
        DialogFragment dialogFragment = this.f38464d;
        if (dialogFragment != null) {
            dialogFragment.show(mMActivity.getSupportFragmentManager(), "BizContactInfoDialogFragment");
        }
    }

    /* renamed from: d3 */
    public final void mo12958d3(C0740i2 i2Var) {
        DataBuffer dataList;
        C0740i2 i2Var2 = i2Var;
        C87412m.m108594g(i2Var2, "feed");
        Activity context = getContext();
        BizProfileTimelineUI bizProfileTimelineUI = context instanceof BizProfileTimelineUI ? (BizProfileTimelineUI) context : null;
        if (bizProfileTimelineUI != null) {
            C8267d dVar = bizProfileTimelineUI.f14188s;
            if (dVar != null) {
                BaseFeedLoader<C0740i2> baseFeedLoader = dVar.f13124s;
                FinderBizProfileLoader finderBizProfileLoader = baseFeedLoader instanceof FinderBizProfileLoader ? (FinderBizProfileLoader) baseFeedLoader : null;
                if (i2Var2 instanceof BaseFinderFeed) {
                    C0898b bVar = C0898b.f2115a;
                    if (bVar.mo785a().mo786a()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("startPreloadVideo ");
                        sb.append("tryScrollToFeed");
                        sb.append(" feedId:");
                        BaseFinderFeed baseFinderFeed = (BaseFinderFeed) i2Var2;
                        sb.append(C61926c.m72691p(baseFinderFeed.mo3513o().getFeedObject().f164794id));
                        Log.m105924i(C54492n.TAG, sb.toString());
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(baseFinderFeed.mo3513o().getFeedObject());
                        C8267d dVar2 = bizProfileTimelineUI.f14188s;
                        if (dVar2 != null) {
                            MediaPreloadCore mediaPreloadCore = dVar2.f29969o.f161830p;
                            if (mediaPreloadCore != null) {
                                if (dVar2 != null) {
                                    mediaPreloadCore.mo78448j3("tryScrollToFeed", dVar2.f29962e, arrayList, bVar.mo785a().f2118c);
                                } else {
                                    C87412m.m108603p("presenter");
                                    throw null;
                                }
                            }
                        } else {
                            C87412m.m108603p("presenter");
                            throw null;
                        }
                    }
                }
                if (finderBizProfileLoader != null && (dataList = finderBizProfileLoader.getDataList()) != null) {
                    Iterator it = dataList.iterator();
                    int i = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i = -1;
                            break;
                        }
                        if (((C0740i2) it.next()).getItemId() == i2Var.getItemId()) {
                            break;
                        }
                        i++;
                    }
                    if (i != -1) {
                        C89779i0 i0Var = this.f38465e;
                        if (i0Var != null) {
                            i0Var.dismiss();
                        }
                        this.f38465e = null;
                        C8271f fVar = bizProfileTimelineUI.f14189t;
                        if (fVar != null) {
                            RecyclerView.LayoutManager layoutManager = fVar.getRecyclerView().getLayoutManager();
                            if (layoutManager != null) {
                                FinderLinearLayoutManager finderLinearLayoutManager = (FinderLinearLayoutManager) layoutManager;
                                C9556a aVar = new C9556a();
                                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                aVar.mo10233c(0);
                                aVar.mo10233c(Integer.valueOf(i));
                                FinderLinearLayoutManager finderLinearLayoutManager2 = finderLinearLayoutManager;
                                C117292a.m165358d(finderLinearLayoutManager2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderBizProfileDrawerUIC", "tryScrollToFeed", "(Lcom/tencent/mm/plugin/finder/model/RVFeed;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                                finderLinearLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
                                C117292a.m165359e(finderLinearLayoutManager2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderBizProfileDrawerUIC", "tryScrollToFeed", "(Lcom/tencent/mm/plugin/finder/model/RVFeed;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                                return;
                            }
                            return;
                        }
                        C87412m.m108603p("viewCallback");
                        throw null;
                    }
                    if (this.f38465e == null) {
                        this.f38465e = C76879j.m92723Q(getContext(), "", getString(C0966R.string.gas), false, false, (DialogInterface.OnCancelListener) null);
                    }
                    finderBizProfileLoader.f12541p.add(new C13560a(this, i2Var2));
                    BaseFeedLoader.requestLoadMore$default(finderBizProfileLoader, false, 1, (Object) null);
                    return;
                }
                return;
            }
            C87412m.m108603p("presenter");
            throw null;
        }
    }

    public boolean onBackPressed() {
        VASCommonFragment u;
        VASActivity vASActivity;
        DialogFragment dialogFragment = this.f38464d;
        if (!(dialogFragment != null ? dialogFragment.isVisible() : false)) {
            return super.onBackPressed();
        }
        DialogFragment dialogFragment2 = this.f38464d;
        C11304c cVar = dialogFragment2 instanceof C11304c ? (C11304c) dialogFragment2 : null;
        if (cVar == null || (u = cVar.mo11344u()) == null || (vASActivity = u.f348642o) == null) {
            return true;
        }
        vASActivity.finish();
        return true;
    }
}
