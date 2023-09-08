package rs1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderMsgContract;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;
import ht1.C60200t1;
import p749xh.C66276va;

/* renamed from: rs1.jb */
public final class C63560jb extends UIComponent implements FinderMsgContract.MsgViewCallback.UICallbackListener {

    /* renamed from: d */
    public final FinderMsgContract.MsgPresenter f180251d = new FinderMsgContract.MsgPresenter(2, 1, new int[]{3, 2, 7, 8});

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63560jb(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: J */
    public void mo78477J(C66276va vaVar) {
        C87412m.m108594g(vaVar, "mention");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ami;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(C75592q0.m90789s());
        if (z1Var != null) {
            AppCompatActivity activity = getActivity();
            C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((MMActivity) activity).setMMTitle(getActivity().getString(C0966R.string.edp, new Object[]{z1Var.mo62909j3()}));
        }
        AppCompatActivity activity2 = getActivity();
        C87412m.m108592e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((MMActivity) activity2).setBackBtn(new C63557ib(this));
        AppCompatActivity activity3 = getActivity();
        C87412m.m108592e(activity3, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        FinderMsgContract.MsgViewCallback msgViewCallback = new FinderMsgContract.MsgViewCallback((MMActivity) activity3, getRootView(), this.f180251d, this);
        this.f180251d.mo78475q(msgViewCallback);
        msgViewCallback.mo78476a();
        C85801v1 i = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_COMMENT_INT_SYNC;
        i.mo119689j(aVar, 0);
        C85801v1 i2 = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_LIKE_INT_SYNC;
        i2.mo119689j(aVar2, 0);
        C86709a0.m107535s().mo121142i().mo119689j(aVar2, 0);
        C86709a0.m107535s().mo121142i().mo119689j(aVar2, 0);
        C86709a0.m107535s().mo121142i().mo119677K(aVar, 0);
        C86709a0.m107535s().mo121142i().mo119677K(aVar2, 0);
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_OBJECT_LIEK_LIKE_INT_SYNC, 0);
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_OBJECT_RECOMMEND_LIKE_INT_SYNC, 0);
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_FOLLOW_ACCEPT_INT_SYNC, 0);
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_FRIEND_RECOMMEND_INT_SYNC, 0);
        ((C60200t1) C86312j.m106911c(C60200t1.class)).Nt0().mo77239M5("TLWxBubble");
    }

    public void onDestroy() {
        super.onDestroy();
        this.f180251d.onDetach();
    }

    public void onResume() {
        super.onResume();
        FinderMsgContract.MsgPresenter msgPresenter = this.f180251d;
        msgPresenter.getClass();
        msgPresenter.f160384o = System.currentTimeMillis();
    }

    public void onStop() {
        super.onStop();
        FinderMsgContract.MsgPresenter msgPresenter = this.f180251d;
        msgPresenter.f160385p.f155732q = System.currentTimeMillis() - msgPresenter.f160384o;
    }
}
