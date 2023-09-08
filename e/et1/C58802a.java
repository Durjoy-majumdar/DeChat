package et1;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import bl3.C39818r;
import bl3.C54492n;
import cm1.C55011a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.FinderRedDotManager;
import com.tencent.p014mm.plugin.finder.p056ui.FinderWxMsgUI;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderNotifyContract;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter$onAttach$$inlined$sortBy$1;
import com.tencent.p014mm.plugin.finder.wxmessage.FinderWxNotifyTabUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import ls1.C61391g;
import p749xh.C66276va;
import ss1.C13778a;
import sx3.C77813z;
import te3.C64586nn1;

/* renamed from: et1.a */
public final class C58802a extends UIComponent implements FinderNotifyContract.NotifyViewCallback.UICallbackListener {

    /* renamed from: j */
    public static final String[] f168346j = {"WxMessageLike", "WxMessageComment"};

    /* renamed from: d */
    public int f168347d = -1;

    /* renamed from: e */
    public int f168348e;

    /* renamed from: f */
    public int f168349f;

    /* renamed from: g */
    public boolean f168350g;

    /* renamed from: h */
    public FinderNotifyContract.NotifyViewCallback f168351h;

    /* renamed from: i */
    public FinderNotifyContract.NotifyPresenter f168352i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58802a(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }

    /* renamed from: J */
    public void mo78494J(C66276va vaVar) {
        C87412m.m108594g(vaVar, "mention");
    }

    /* renamed from: c3 */
    public final FinderNotifyContract.NotifyPresenter mo83991c3() {
        Fragment fragment = getFragment();
        FragmentActivity fragmentActivity = null;
        if (!((fragment != null ? fragment.getActivity() : null) instanceof FinderWxMsgUI)) {
            return null;
        }
        Fragment fragment2 = getFragment();
        if (fragment2 != null) {
            fragmentActivity = fragment2.getActivity();
        }
        C87412m.m108592e(fragmentActivity, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.FinderWxMsgUI");
        return ((FinderWxMsgUI) fragmentActivity).f161149o;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.amk;
    }

    public void onCreateAfter(Bundle bundle) {
        List<Boolean> list;
        int i;
        StringBuilder sb;
        Class cls = FinderCommonFeatureService.class;
        Class cls2 = FinderWxNotifyTabUIC.class;
        super.onCreateAfter(bundle);
        C39818r rVar = C39818r.f106831a;
        this.f168348e = ((FinderWxNotifyTabUIC) rVar.mo62443b(getContext()).mo75002a(cls2)).f162681u;
        this.f168352i = mo83991c3();
        Fragment fragment = getFragment();
        FragmentActivity activity = fragment != null ? fragment.getActivity() : null;
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        View rootView = getRootView();
        FinderNotifyContract.NotifyPresenter c3 = mo83991c3();
        C87412m.m108591d(c3);
        FinderNotifyContract.NotifyViewCallback notifyViewCallback = new FinderNotifyContract.NotifyViewCallback((MMActivity) activity, rootView, c3, this, this.f168347d);
        FinderNotifyContract.NotifyPresenter notifyPresenter = this.f168352i;
        if (notifyPresenter != null) {
            notifyPresenter.f160447n.add(notifyViewCallback);
            ArrayList<FinderNotifyContract.NotifyViewCallback> arrayList = notifyPresenter.f160447n;
            if (arrayList.size() > 1) {
                C77813z.m93909o(arrayList, new FinderNotifyContract$NotifyPresenter$onAttach$$inlined$sortBy$1());
            }
            String str = notifyPresenter.f160443g;
            Log.m105924i(str, "onAttach " + notifyPresenter.f160441e);
        }
        notifyViewCallback.mo78491a();
        FinderRedDotManager Nx0 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0();
        String[] strArr = f168346j;
        C64586nn1 R5 = Nx0.mo77246R5(strArr[this.f168347d]);
        boolean z = false;
        this.f168349f = R5 != null ? R5.f184503e : 0;
        Fragment fragment2 = getFragment();
        C87412m.m108591d(fragment2);
        FragmentActivity activity2 = fragment2.getActivity();
        C87412m.m108592e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        C61391g I3 = ((FinderWxNotifyTabUIC) rVar.mo62444c((MMActivity) activity2).mo75002a(cls2)).mo80037I3(this.f168347d);
        if ((I3 instanceof C13778a) && (i = this.f168349f) > 0) {
            if (i > 9999) {
                sb = new StringBuilder();
                sb.append('+');
                sb.append(this.f168349f / 10000);
                sb.append(19975);
            } else {
                sb = new StringBuilder();
                sb.append('+');
                sb.append(this.f168349f);
            }
            String sb4 = sb.toString();
            Log.m105924i(C54492n.TAG, "setRedDot " + this.f168347d + XVFSFile.PATH_SEPARATOR_CHAR + sb4);
            C13778a aVar = (C13778a) I3;
            if (this.f168348e == this.f168347d) {
                z = true;
            }
            aVar.mo9050r(sb4, z);
        }
        int i2 = this.f168348e;
        int i3 = this.f168347d;
        if (i2 == i3) {
            FinderNotifyContract.NotifyPresenter notifyPresenter2 = this.f168352i;
            if (!(notifyPresenter2 == null || (list = notifyPresenter2.f160444h) == null)) {
                Boolean bool = (Boolean) ((ArrayList) list).set(i3, Boolean.TRUE);
            }
            notifyViewCallback.mo78488E0();
            this.f168350g = true;
        } else if (!this.f168350g) {
            Log.m105924i(C54492n.TAG, "refresh index: " + this.f168347d);
            notifyViewCallback.mo78489F0();
            this.f168350g = true;
        }
        if (this.f168349f > 0) {
            ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77239M5(strArr[this.f168347d]);
        }
        this.f168351h = notifyViewCallback;
    }

    public void onPause() {
        WxRecyclerAdapter<C55011a> wxRecyclerAdapter;
        super.onPause();
        FinderNotifyContract.NotifyViewCallback notifyViewCallback = this.f168351h;
        if (notifyViewCallback != null && (wxRecyclerAdapter = notifyViewCallback.f160458j) != null) {
            wxRecyclerAdapter.mo82614x6();
        }
    }

    public void onResume() {
        WxRecyclerAdapter<C55011a> wxRecyclerAdapter;
        super.onResume();
        FinderNotifyContract.NotifyViewCallback notifyViewCallback = this.f168351h;
        if (notifyViewCallback != null && (wxRecyclerAdapter = notifyViewCallback.f160458j) != null) {
            wxRecyclerAdapter.mo82616y6();
        }
    }

    public void onUserVisibleFocused() {
        List<Boolean> list;
        Log.m105924i(C54492n.TAG, "onUserVisibleFocused:" + this.f168350g + "  " + this.f168347d);
        FinderNotifyContract.NotifyPresenter notifyPresenter = this.f168352i;
        if (notifyPresenter != null && (list = notifyPresenter.f160444h) != null) {
            Boolean bool = (Boolean) ((ArrayList) list).set(this.f168347d, Boolean.TRUE);
        }
    }

    public void onUserVisibleUnFocused() {
        Log.m105924i(C54492n.TAG, "onUserVisibleUnFocused:" + this.f168350g + "  " + this.f168347d);
    }
}
