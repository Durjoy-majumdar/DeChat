package xl3;

import android.view.View;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.FindMoreFriendsUI;
import com.tencent.p014mm.p136ui.FinderIconViewTipPreference;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2458a;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gt1.C20838b;
import ht1.C60200t1;
import ps3.C12005b;
import te3.C64586nn1;
import te3.C64858yi1;
import zt3.C119157j;

/* renamed from: xl3.b */
public final class C23101b<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C23102c f66376d;

    public C23101b(C23102c cVar) {
        this.f66376d = cVar;
    }

    public void onChanged(Object obj) {
        C64858yi1 yi12;
        C2458a aVar = (C2458a) obj;
        C23102c cVar = this.f66376d;
        FinderIconViewTipPreference finderIconViewTipPreference = cVar.f66381e;
        if (finderIconViewTipPreference == null) {
            Log.m105924i("FinderLiveEntryPreferenceMgr", "handleFinderLiveRedDot return for null");
        } else if (!cVar.f66378b.f55702t.mo72522f(cVar.mo36505b())) {
            Log.m105924i("FinderLiveEntryPreferenceMgr", "handleFinderLiveRedDot return for not show " + cVar.mo36505b());
        } else if (aVar == null) {
            Log.m105924i("FinderLiveEntryPreferenceMgr", "handleFinderLiveRedDot preference:" + finderIconViewTipPreference + ' ' + finderIconViewTipPreference.hashCode() + " return for null");
        } else {
            boolean z = false;
            if (!aVar.f12908a) {
                finderIconViewTipPreference.mo25956f(false);
                cVar.mo36507d();
                cVar.f66378b.mo25923t0("find_friends_by_finder_live", false);
                Log.m105924i("FinderLiveEntryPreferenceMgr", "handleFinderLiveRedDot return for isShow");
            } else if (!((C20838b) C86312j.m106911c(C20838b.class)).mo32540ag()) {
                Log.m105924i("FinderLiveEntryPreferenceMgr", "handleFinderLiveRedDot return for isEnableFindLive");
            } else {
                C64586nn1 nn12 = aVar.f12909b;
                if (nn12 == null) {
                    Log.m105920e("FinderLiveEntryPreferenceMgr", "handleFinderLiveRedDot info is null");
                    return;
                }
                boolean K5 = ((C60200t1) C86312j.m106911c(C60200t1.class)).Nt0().mo77235K5();
                Log.m105924i("FinderLiveEntryPreferenceMgr", "handleFinderLiveRedDot preference:" + finderIconViewTipPreference + ' ' + finderIconViewTipPreference.hashCode() + " [onChanged] isEnableShowNearByEntranceRedDot:" + K5 + " result" + aVar);
                View view = finderIconViewTipPreference.f201747m1;
                if (view != null) {
                    view.setContentDescription(cVar.f66377a.getString(C0966R.string.dku));
                }
                if (nn12.f184502d == 6) {
                    finderIconViewTipPreference.mo25956f(false);
                    finderIconViewTipPreference.mo101936T(0);
                    finderIconViewTipPreference.f215054P = cVar.f66377a.getString(C0966R.string.f360088a12);
                    finderIconViewTipPreference.f215055Q = C0966R.C0969drawable.ake;
                    cVar.mo36504a();
                } else {
                    finderIconViewTipPreference.mo101932N(8);
                    finderIconViewTipPreference.mo101936T(8);
                    finderIconViewTipPreference.f215054P = "";
                    finderIconViewTipPreference.f215055Q = -1;
                    FindMoreFriendsUI findMoreFriendsUI = cVar.f66378b;
                    C55718s0 s0Var = aVar.f12910c;
                    if (!(s0Var == null || (yi12 = s0Var.f158585F) == null || yi12.f186565z != 1)) {
                        z = true;
                    }
                    findMoreFriendsUI.mo25896Y(nn12, finderIconViewTipPreference, false, K5, z, (C64586nn1) null);
                    ((C12005b) C86312j.m106911c(C12005b.class)).mo11141Gx();
                    cVar.mo36508e(K5);
                }
                ((C119157j) C119157j.f356862d).mo183870a(new C38742a(K5));
            }
        }
    }
}
