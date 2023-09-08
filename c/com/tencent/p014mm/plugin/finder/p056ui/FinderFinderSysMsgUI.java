package com.tencent.p014mm.plugin.finder.p056ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import bd1.C39759i;
import bd1.C54447c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderMsgContract;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import er1.C58791y;
import f40.C86709a0;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.Metadata;
import l31.C61212e;
import o31.C11345b;
import o31.C76986a;
import p749xh.C66276va;
import rx3.C13598b0;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderFinderSysMsgUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$MsgViewCallback$UICallbackListener;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderFinderSysMsgUI */
public final class FinderFinderSysMsgUI extends MMFinderUI implements FinderMsgContract.MsgViewCallback.UICallbackListener {

    /* renamed from: o */
    public final String f161050o = "Finder.FinderFinderSysMsgUI";

    /* renamed from: p */
    public final FinderMsgContract.MsgPresenter f161051p = new FinderMsgContract.MsgPresenter(1, 2, new int[]{4});

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderFinderSysMsgUI$a */
    public static final class C56342a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderFinderSysMsgUI f161052d;

        public C56342a(FinderFinderSysMsgUI finderFinderSysMsgUI) {
            this.f161052d = finderFinderSysMsgUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f161052d.finish();
            return true;
        }
    }

    public FinderFinderSysMsgUI() {
        new HashMap();
    }

    /* renamed from: I7 */
    public int mo2194I7() {
        return 118;
    }

    /* renamed from: J */
    public void mo78477J(C66276va vaVar) {
        C87412m.m108594g(vaVar, "mention");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ami;
    }

    public void initView() {
        setMMTitle(getString(C0966R.string.d4k));
        setBackBtn(new C56342a(this));
        View contentView = getContentView();
        C87412m.m108593f(contentView, "contentView");
        FinderMsgContract.MsgViewCallback msgViewCallback = new FinderMsgContract.MsgViewCallback(this, contentView, this.f161051p, this);
        this.f161051p.mo78475q(msgViewCallback);
        msgViewCallback.mo78476a();
        C66785b bVar = C66785b.f191882e;
        String O5 = bVar.mo90662O5();
        if (O5 == null) {
            O5 = "";
        }
        C54447c cVar = new C54447c(O5);
        cVar.field_systemMsgCount = 0;
        bVar.mo90672m1(cVar, C39759i.SYS_MSG_COUNT);
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_MSG_SYSTEM_INT_SYNC, 0);
        ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0().f158526c.mo2443e(bVar.mo90662O5());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
        C58791y.f168321a.getClass();
        C58791y.f168323c = new WeakReference<>(this);
        if (C13598b0.f38549a == null) {
            C58791y.f168323c = null;
        }
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.FinderFinderSysMsgUI).mo86179qs(this, C76986a.Finder);
    }

    public void onDestroy() {
        super.onDestroy();
        this.f161051p.onDetach();
        C58791y.f168321a.getClass();
        WeakReference<Activity> weakReference = C58791y.f168323c;
        Activity activity = weakReference != null ? weakReference.get() : null;
        if (activity != null && C87412m.m108589b(activity, this)) {
            C58791y.f168323c = null;
        }
    }

    public void onResume() {
        super.onResume();
        FinderMsgContract.MsgPresenter msgPresenter = this.f161051p;
        msgPresenter.getClass();
        msgPresenter.f160384o = System.currentTimeMillis();
    }

    public void onStop() {
        super.onStop();
        FinderMsgContract.MsgPresenter msgPresenter = this.f161051p;
        msgPresenter.f160385p.f155732q = System.currentTimeMillis() - msgPresenter.f160384o;
        Log.m105924i(this.f161050o, "onStop");
    }
}
