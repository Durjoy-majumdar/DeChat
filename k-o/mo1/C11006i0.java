package mo1;

import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC;
import di3.C86312j;
import l31.C61212e;
import rs1.C13442s8;
import rx3.C13604l;
import sx3.C90364q0;

/* renamed from: mo1.i0 */
public final class C11006i0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderProfileHeaderUIC f32722d;

    public C11006i0(FinderProfileHeaderUIC finderProfileHeaderUIC) {
        this.f32722d = finderProfileHeaderUIC;
    }

    public final void run() {
        String stringExtra = this.f32722d.getIntent().getStringExtra("key_extra_info");
        if (stringExtra == null) {
            stringExtra = "";
        }
        C61212e eVar = (C61212e) C86312j.m106911c(C61212e.class);
        FrameLayout frameLayout = this.f32722d.mo3808J3().f42933n0;
        C13604l[] lVarArr = new C13604l[8];
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        C13442s8 f = aVar.mo12873f(this.f32722d.getActivity());
        Integer num = null;
        lVarArr[0] = new C13604l("finder_tab_context_id", f != null ? f.f38100p : null);
        C13442s8 f2 = aVar.mo12873f(this.f32722d.getActivity());
        C13604l lVar = new C13604l("finder_context_id", f2 != null ? f2.f38098n : null);
        int i = 1;
        lVarArr[1] = lVar;
        C13442s8 f3 = aVar.mo12873f(this.f32722d.getActivity());
        lVarArr[2] = new C13604l("behaviour_session_id", f3 != null ? f3.f38099o : null);
        C13442s8 f4 = aVar.mo12873f(this.f32722d.getActivity());
        if (f4 != null) {
            num = Integer.valueOf(f4.f38096i);
        }
        lVarArr[3] = new C13604l("comment_scene", num);
        FinderProfileHeaderUIC finderProfileHeaderUIC = this.f32722d;
        lVarArr[4] = new C13604l("finder_username", finderProfileHeaderUIC.f16213S0);
        lVarArr[5] = new C13604l("profile_state_type", Integer.valueOf(finderProfileHeaderUIC.isSelf() ? 1 : 2));
        if (this.f32722d.getFragmentMode()) {
            i = 2;
        }
        lVarArr[6] = new C13604l("profile_screen_type", Integer.valueOf(i));
        lVarArr[7] = new C13604l("extrainfo", stringExtra);
        eVar.mo86184uZ(frameLayout, "finder_profile_letter", C90364q0.m113147f(lVarArr), 40, 24617);
    }
}
