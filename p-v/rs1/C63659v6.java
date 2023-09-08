package rs1;

import a14.C53934p0;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C39622i0;
import bl3.C0317e;
import bl3.C39818r;
import bl3.C54492n;
import cm1.C55011a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.plugin.finder.extension.reddot.FinderRedDotManager;
import com.tencent.p014mm.plugin.finder.p056ui.FinderFinderMsgUI;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderNotifyContractNew;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.wcdb.FileUtils;
import com.tencent.xweb.WCWebUpdater;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import dp1.C58413v0;
import er1.C58739j4;
import er1.C58784w3;
import gy3.C8480h;
import gy3.C87412m;
import ls1.C61391g;
import on1.C11548q;
import on1.C11566t;
import os1.C11748p;
import rs1.C13442s8;
import ss1.C13778a;
import te3.C64586nn1;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: rs1.v6 */
public final class C63659v6 extends UIComponent {

    /* renamed from: i */
    public static final String[] f180474i = {"NotificationCenterLike", "NotificationCenterComment", "NotificationCenterFollow"};

    /* renamed from: d */
    public int f180475d = -1;

    /* renamed from: e */
    public int f180476e;

    /* renamed from: f */
    public int f180477f;

    /* renamed from: g */
    public FinderNotifyContractNew.NotifyViewCallback f180478g;

    /* renamed from: h */
    public FinderNotifyContractNew.NotifyPresenter f180479h;

    /* renamed from: rs1.v6$a */
    public static final class C63660a {
        public C63660a(C8480h hVar) {
        }
    }

    static {
        new C63660a((C8480h) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63659v6(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.amk;
    }

    public void onCreateAfter(Bundle bundle) {
        int i;
        StringBuilder sb;
        Class cls = FinderCommonFeatureService.class;
        super.onCreateAfter(bundle);
        C39818r rVar = C39818r.f106831a;
        C39622i0 a = rVar.mo62446e(cls).mo75002a(C11748p.class);
        C87412m.m108593f(a, "UICProvider.of(FinderCom…StateCacheVM::class.java)");
        this.f180476e = C11748p.m11445d3((C11748p) a, 1, (String) null, 2, (Object) null);
        Fragment fragment = getFragment();
        C87412m.m108591d(fragment);
        int[] iArr = FinderFinderMsgUI.f161049p;
        int i2 = this.f180475d;
        int i3 = iArr[i2];
        int[] iArr2 = FinderFinderMsgUI.f161048o.get(i2);
        C87412m.m108593f(iArr2, "FinderFinderMsgUI.msgTypes[index]");
        this.f180479h = new FinderNotifyContractNew.NotifyPresenter(fragment, 1, i3, iArr2, this.f180475d);
        Fragment fragment2 = getFragment();
        C87412m.m108591d(fragment2);
        View rootView = getRootView();
        FinderNotifyContractNew.NotifyPresenter notifyPresenter = this.f180479h;
        C87412m.m108591d(notifyPresenter);
        FinderNotifyContractNew.NotifyViewCallback notifyViewCallback = new FinderNotifyContractNew.NotifyViewCallback(fragment2, rootView, notifyPresenter, this.f180475d);
        FinderNotifyContractNew.NotifyPresenter notifyPresenter2 = this.f180479h;
        if (notifyPresenter2 != null) {
            notifyPresenter2.mo78502n(notifyViewCallback);
        }
        FinderRedDotManager Nx0 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0();
        String[] strArr = f180474i;
        C64586nn1 R5 = Nx0.mo77246R5(strArr[this.f180475d]);
        this.f180477f = R5 != null ? R5.f184503e : 0;
        Fragment fragment3 = getFragment();
        C87412m.m108591d(fragment3);
        FragmentActivity activity = fragment3.getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        C61391g I3 = ((C63637s6) rVar.mo62444c((MMActivity) activity).mo75002a(C63637s6.class)).mo80037I3(this.f180475d);
        if ((I3 instanceof C13778a) && (i = this.f180477f) > 0) {
            if (i > 9999) {
                sb = new StringBuilder();
                sb.append('+');
                sb.append(this.f180477f / 10000);
                sb.append(19975);
            } else {
                sb = new StringBuilder();
                sb.append('+');
                sb.append(this.f180477f);
            }
            String sb4 = sb.toString();
            Log.m105924i(C54492n.TAG, "setRedDot " + this.f180475d + XVFSFile.PATH_SEPARATOR_CHAR + sb4);
            ((C13778a) I3).mo9050r(sb4, true);
        }
        notifyViewCallback.mo78505a();
        FinderNotifyContractNew.NotifyPresenter notifyPresenter3 = this.f180479h;
        if (notifyPresenter3 != null) {
            if (this.f180476e == this.f180475d) {
                notifyPresenter3.f160531j = true;
            }
            Log.m105924i(FinderNotifyContractNew.NotifyPresenter.f160524w, "loadFirstScreen:");
            C11548q<C55011a> qVar = notifyPresenter3.f160536r;
            if (qVar != null) {
                C0317e.launch$default(qVar, (C66212f) null, (C53934p0) null, new C11566t(qVar, (C15601d<? super C11566t>) null), 3, (Object) null);
                notifyPresenter3.mo78503q();
            } else {
                C87412m.m108603p("loader");
                throw null;
            }
        }
        int i4 = this.f180475d;
        String str = i4 != 0 ? i4 != 1 ? i4 != 2 ? "" : "NotificationCenterFollow" : "NotificationCenterComment" : "NotificationCenterLike";
        C55718s0 G5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77227G5(str);
        C64586nn1 R52 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77246R5(str);
        C58784w3 w3Var = C58784w3.f168295a;
        Fragment fragment4 = getFragment();
        C58739j4 j4Var = C58739j4.f168176a;
        if (!(G5 == null || R52 == null || fragment4 == null)) {
            C58413v0 v0Var = C58413v0.f167346a;
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            FragmentActivity activity2 = fragment4.getActivity();
            C87412m.m108592e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            C13442s8 f = aVar.mo12873f((MMActivity) activity2);
            C13442s8.C13443a aVar2 = aVar;
            C58413v0.m67781i(v0Var, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY, G5, R52, 1, f != null ? f.mo12861q3() : null, 0, (String) null, 0, 0, 480, (Object) null);
            if (this.f180476e == this.f180475d) {
                FragmentActivity activity3 = fragment4.getActivity();
                C87412m.m108592e(activity3, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                C13442s8 f2 = aVar2.mo12873f((MMActivity) activity3);
                C58413v0.m67781i(v0Var, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY, G5, R52, 3, f2 != null ? f2.mo12861q3() : null, 1, (String) null, 0, 0, FileUtils.S_IRWXU, (Object) null);
            }
        }
        if (this.f180477f > 0) {
            ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77239M5(strArr[this.f180475d]);
        }
        this.f180478g = notifyViewCallback;
    }

    public void onDestroy() {
        super.onDestroy();
        FinderNotifyContractNew.NotifyPresenter notifyPresenter = this.f180479h;
        if (notifyPresenter != null) {
            notifyPresenter.onDetach();
        }
    }

    public void onPause() {
        WxRecyclerAdapter<C55011a> wxRecyclerAdapter;
        super.onPause();
        FinderNotifyContractNew.NotifyViewCallback notifyViewCallback = this.f180478g;
        if (notifyViewCallback != null && (wxRecyclerAdapter = notifyViewCallback.f160553r) != null) {
            wxRecyclerAdapter.mo82614x6();
        }
    }

    public void onResume() {
        WxRecyclerAdapter<C55011a> wxRecyclerAdapter;
        super.onResume();
        FinderNotifyContractNew.NotifyPresenter notifyPresenter = this.f180479h;
        if (notifyPresenter != null) {
            notifyPresenter.f160533o = System.currentTimeMillis();
        }
        FinderNotifyContractNew.NotifyViewCallback notifyViewCallback = this.f180478g;
        if (notifyViewCallback != null && (wxRecyclerAdapter = notifyViewCallback.f160553r) != null) {
            wxRecyclerAdapter.mo82616y6();
        }
    }

    public void onStop() {
        super.onStop();
        FinderNotifyContractNew.NotifyPresenter notifyPresenter = this.f180479h;
        if (notifyPresenter != null) {
            FinderNotifyContractNew.f160522a.getClass();
            FinderNotifyContractNew.f160523b.f155732q = System.currentTimeMillis() - notifyPresenter.f160533o;
        }
    }

    public void onUserVisibleFocused() {
        super.onUserVisibleFocused();
        Log.m105924i(C54492n.TAG, "onUserVisibleFocused:  " + this.f180475d);
        FinderNotifyContractNew.NotifyPresenter notifyPresenter = this.f180479h;
        if (notifyPresenter != null) {
            notifyPresenter.f160531j = true;
        }
    }

    public void onUserVisibleUnFocused() {
        super.onUserVisibleUnFocused();
        Log.m105924i(C54492n.TAG, "onUserVisibleUnFocused:  " + this.f180475d);
    }
}
