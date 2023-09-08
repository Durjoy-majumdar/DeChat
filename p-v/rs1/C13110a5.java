package rs1;

import android.widget.ImageView;
import androidx.lifecycle.C0120a0;
import bl3.C39818r;
import com.google.android.material.tabs.TabLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.jsapi.nfc.JsApiNFCStartHCE;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHomeUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import dp1.C58413v0;
import dp1.C58417y0;
import gy3.C87412m;
import rs1.C13392r4;
import rs1.C13442s8;
import te3.C49712hj1;
import te3.C51978xi1;
import te3.C64586nn1;

/* renamed from: rs1.a5 */
public final class C13110a5<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C13392r4 f37320d;

    public C13110a5(C13392r4 r4Var) {
        this.f37320d = r4Var;
    }

    public void onChanged(Object obj) {
        Object obj2;
        C51978xi1 xi12;
        C2479n0.C2480a aVar = (C2479n0.C2480a) obj;
        Class cls = FinderHomeUIC.class;
        TabLayout tabLayout = (TabLayout) this.f37320d.findViewById(C0966R.C0970id.kci);
        if (tabLayout != null) {
            boolean z = true;
            TabLayout.C55061f g3 = this.f37320d.mo12802g3(tabLayout, 1);
            if (g3 != null && (obj2 = g3.f154600a) != null) {
                C13392r4 r4Var = this.f37320d;
                C13392r4.C13393a aVar2 = (C13392r4.C13393a) obj2;
                StringBuilder sb = new StringBuilder();
                sb.append("[registerRedDot] TAB_TYPE_FRIEND isShow=");
                C49712hj1 hj12 = null;
                sb.append(aVar != null ? Boolean.valueOf(aVar.f12908a) : null);
                Log.m105924i("Finder.HomeActionBarUIC", sb.toString());
                String str = "";
                if (aVar != null && aVar.f12908a) {
                    C64586nn1 nn12 = aVar.f12909b;
                    if (nn12 == null || nn12.f184502d != 15) {
                        z = false;
                    }
                    if (z) {
                        ImageView imageView = aVar2.f37962f;
                        if (imageView != null) {
                            imageView.setImageResource(C0966R.raw.finder_live_icon);
                        }
                        ImageView imageView2 = aVar2.f37961e;
                        if (imageView2 != null) {
                            imageView2.setVisibility(4);
                        }
                        ImageView imageView3 = aVar2.f37962f;
                        if (imageView3 != null) {
                            imageView3.setVisibility(0);
                        }
                    } else {
                        ImageView imageView4 = aVar2.f37961e;
                        if (imageView4 != null) {
                            imageView4.setVisibility(0);
                        }
                        ImageView imageView5 = aVar2.f37962f;
                        if (imageView5 != null) {
                            imageView5.setVisibility(4);
                        }
                        ImageView imageView6 = aVar2.f37961e;
                        if (imageView6 != null) {
                            imageView6.setImageResource(C0966R.C0969drawable.az5);
                        }
                    }
                    C55718s0 s0Var = aVar.f12910c;
                    String str2 = s0Var != null ? s0Var.field_tipsId : null;
                    if (str2 != null) {
                        str = str2;
                    }
                    if (!C87412m.m108589b(r4Var.f37941h, str) && r4Var.f37940g) {
                        C7335d c = C86312j.m106911c(C58417y0.class);
                        C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
                        C58417y0 y0Var = (C58417y0) c;
                        C55718s0 s0Var2 = aVar.f12910c;
                        long j = (s0Var2 == null || (xi12 = s0Var2.field_ctrInfo) == null) ? 0 : xi12.f144686x;
                        C13442s8.C13443a aVar3 = C13442s8.f38060Q0;
                        C13442s8 f = aVar3.mo12873f(r4Var.getActivity());
                        C49712hj1 q3 = f != null ? f.mo12861q3() : null;
                        C39818r rVar = C39818r.f106831a;
                        C58417y0.Nx0(y0Var, "2", 8, 1, 1, 0, 0, str, (String) null, j, q3, ((FinderHomeUIC) rVar.mo62444c(r4Var.getActivity()).mo75002a(cls)).mo5128d3(), 0, 2176, (Object) null);
                        r4Var.f37941h = str;
                        C55718s0 s0Var3 = aVar.f12910c;
                        C64586nn1 nn13 = aVar.f12909b;
                        if (s0Var3 != null && nn13 != null) {
                            C58413v0 v0Var = C58413v0.f167346a;
                            C13442s8 f2 = aVar3.mo12873f(r4Var.getActivity());
                            if (f2 != null) {
                                hj12 = f2.mo12861q3();
                            }
                            C58413v0.m67781i(v0Var, "2", s0Var3, nn13, 1, hj12, 0, (String) null, ((FinderHomeUIC) rVar.mo62444c(r4Var.getActivity()).mo75002a(cls)).mo5128d3(), 0, JsApiNFCStartHCE.CTRL_INDEX, (Object) null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                r4Var.f37941h = str;
                ImageView imageView7 = aVar2.f37961e;
                if (imageView7 != null) {
                    imageView7.setVisibility(4);
                }
                ImageView imageView8 = aVar2.f37962f;
                if (imageView8 != null) {
                    imageView8.setVisibility(4);
                }
            }
        }
    }
}
