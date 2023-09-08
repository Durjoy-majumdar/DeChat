package xl3;

import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.p136ui.FindMoreFriendsUI;
import com.tencent.p014mm.p136ui.FinderIconViewTipPreference;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2458a;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import fn3.C59263a;
import fy3.C32226l;
import gt1.C20838b;
import gy3.C87412m;
import ht1.C60200t1;
import ky2.C10432i;
import ns3.C11266d;
import p147ea.C20556f;
import p565ir.C60606n;
import ps3.C12005b;
import rx3.C13598b0;
import te3.C64858yi1;

/* renamed from: xl3.c */
public final class C23102c {

    /* renamed from: a */
    public final Context f66377a;

    /* renamed from: b */
    public final FindMoreFriendsUI f66378b;

    /* renamed from: c */
    public boolean f66379c;

    /* renamed from: d */
    public C0120a0<C2458a> f66380d;

    /* renamed from: e */
    public FinderIconViewTipPreference f66381e;

    /* renamed from: f */
    public boolean f66382f = this.f66379c;

    public C23102c(Context context, FindMoreFriendsUI findMoreFriendsUI) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(findMoreFriendsUI, "findMoreFriendsUI");
        this.f66377a = context;
        this.f66378b = findMoreFriendsUI;
    }

    /* renamed from: a */
    public final void mo36504a() {
        this.f66378b.f55702t.mo72529n("find_friends_by_finder_live_above_look", true);
        this.f66378b.f55702t.mo72529n("find_friends_by_finder_live", true);
    }

    /* renamed from: b */
    public final String mo36505b() {
        return this.f66379c ? "find_friends_by_finder_live_above_look" : "find_friends_by_finder_live";
    }

    /* renamed from: c */
    public final boolean mo36506c() {
        if (((C10432i) C86312j.m106911c(C10432i.class)).mo10750e()) {
            mo36504a();
            Log.m105924i("FinderLiveEntryPreferenceMgr", "updateFinderLiveEntry return for isTeenMode.");
            return false;
        } else if (!(!this.f66378b.mo25907j0(9007199254740992L))) {
            mo36504a();
            Log.m105928w("FinderLiveEntryPreferenceMgr", "updateFinderLiveEntry return for enableFinderLiveEntry");
            return false;
        } else if (((C20838b) C86312j.m106911c(C20838b.class)).mo32540ag()) {
            return true;
        } else {
            mo36504a();
            Log.m105928w("FinderLiveEntryPreferenceMgr", "updateFinderLiveEntry return for isEnableFindLive");
            return false;
        }
    }

    /* renamed from: d */
    public final void mo36507d() {
        if (this.f66379c) {
            this.f66378b.f55702t.mo72529n("find_friends_by_finder_live_above_look", false);
            this.f66378b.f55702t.mo72529n("find_friends_by_finder_live", true);
            return;
        }
        this.f66378b.f55702t.mo72529n("find_friends_by_finder_live_above_look", true);
        this.f66378b.f55702t.mo72529n("find_friends_by_finder_live", false);
    }

    /* renamed from: e */
    public final void mo36508e(boolean z) {
        if (z && this.f66378b.f55668C) {
            if (((C60606n) C86312j.m106911c(C60606n.class)).Q30()) {
                Log.m105924i("FinderLiveEntryPreferenceMgr", "#startPreloadTargetPage-new go in");
                C55718s0 G5 = ((C60200t1) C86312j.m106911c(C60200t1.class)).Nt0().mo77227G5("FinderLiveEntrance");
                if (G5 != null) {
                    Log.m105924i("FinderLiveEntryPreferenceMgr", "#startPreloadTargetPage-new pre_load=" + G5.f158585F.f186563x + " object_id=" + G5.f158585F.f186549g + ", ");
                    if (G5.f158585F.f186563x != 0) {
                        C7335d c = C86312j.m106911c(C12005b.class);
                        C87412m.m108593f(c, "getService(INearbyRefreshService::class.java)");
                        ((C12005b) c).mo11145ue(false);
                    }
                    C64858yi1 yi12 = G5.f158585F;
                    int i = yi12.f186559t;
                    long j = yi12.f186549g;
                    if (i == 1) {
                        ((C11266d) C86312j.m106911c(C11266d.class)).mo9195hT().mo11135a((MMActivity) null, j, "", true, 0, (C32226l<? super FinderObject, C13598b0>) null);
                        return;
                    }
                    return;
                }
                return;
            }
            Intent intent = new Intent();
            intent.putExtra("key_context_id", C59263a.m69189a());
            ((C20556f) C86312j.m106911c(C20556f.class)).H00(intent);
        }
    }
}
