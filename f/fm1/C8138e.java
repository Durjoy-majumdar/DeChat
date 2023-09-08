package fm1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import gy3.C87412m;
import ns3.C11266d;
import os1.C11739f;
import p147ea.C7606d;
import rs1.C13421r8;
import te3.C64586nn1;
import te3.C64858yi1;
import vc1.C37715b;

/* renamed from: fm1.e */
public final class C8138e extends C13421r8 {

    /* renamed from: g */
    public C64586nn1 f27000g;

    /* renamed from: h */
    public C55718s0 f27001h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8138e(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public String mo9201c3() {
        return !C37715b.f99914a.mo61298a() ? "NearbyEntrance" : "FinderLiveEntrance";
    }

    /* renamed from: d3 */
    public boolean mo9202d3() {
        Class cls = FinderCommonFeatureService.class;
        if (!C37715b.f99914a.mo61298a()) {
            boolean H5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77229H5();
            Log.m105924i("Finder.RedDotUIJumpUIC", "[isIgnore] isEnableShowNearByEntranceRedDot=" + H5);
            if (!H5) {
                return true;
            }
        } else {
            boolean K5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77235K5();
            Log.m105924i("Finder.RedDotUIJumpUIC", "[isIgnore] isEnableShowFinderLiveEntranceRedDot=" + K5);
            if (!K5) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e3 */
    public void mo9203e3() {
        Class cls = C11266d.class;
        C64858yi1 yi12 = this.f37997d;
        int i = yi12 != null ? yi12.f186558s : 0;
        if (i == 0) {
            i = ((C11266d) C86312j.m106911c(cls)).Zb0(94);
            Log.m105924i("Finder.RedDotUIJumpUIC", "prepareLiveSquare use last cache targetTabId=" + i);
        }
        int Pa0 = ((C11266d) C86312j.m106911c(cls)).Pa0(((C7606d) C86312j.m106911c(C7606d.class)).K80(94), i);
        if (!mo9202d3()) {
            C11739f.C11740a c3 = this.f37999f.mo11600c3(Pa0);
            c3.f34376i = C11739f.C11742c.HardRefresh;
            c3.f34374g = 0;
            ((C11266d) C86312j.m106911c(cls)).mo9200sc(i);
        }
    }

    /* renamed from: f3 */
    public final void mo9204f3() {
        Class cls = FinderCommonFeatureService.class;
        if (C37715b.f99914a.mo61298a()) {
            this.f27000g = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77246R5("FinderLiveEntrance");
            this.f27001h = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77227G5("FinderLiveEntrance");
            return;
        }
        this.f27000g = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77246R5("NearbyEntrance");
        this.f27001h = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77227G5("NearbyEntrance");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8138e(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }
}
