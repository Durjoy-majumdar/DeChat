package sk3;

import a14.C53973z1;
import android.widget.TextView;
import bl3.C39818r;
import com.google.android.material.tabs.TabLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.concurrent.CancellationException;
import rk3.C63462a;

/* renamed from: sk3.s0 */
public final class C64016s0 implements TabLayout.C104470c {

    /* renamed from: a */
    public final /* synthetic */ C64009r0 f181494a;

    public C64016s0(C64009r0 r0Var) {
        this.f181494a = r0Var;
    }

    /* renamed from: a */
    public void mo9213a(TabLayout.C55061f fVar) {
        Class cls = C63995m.class;
        C87412m.m108594g(fVar, "tab");
        if (fVar.f154604e == 1) {
            C39818r rVar = C39818r.f106831a;
            if (((C63995m) rVar.mo62444c(this.f181494a.getActivity()).mo75002a(cls)).mo88765g3()) {
                C64009r0 r0Var = this.f181494a;
                TextView textView = r0Var.f181462i;
                if (textView != null) {
                    textView.setTextColor(r0Var.getColor(C0966R.color.BW_0_Alpha_0_5));
                }
                C64009r0 r0Var2 = this.f181494a;
                r0Var2.f181470t = ((C63995m) rVar.mo62444c(r0Var2.getActivity()).mo75002a(cls)).mo88764f3();
                Log.m105924i("MicroMsg.FTSMultiTabViewUIC", "lastShowImageNum >> " + this.f181494a.f181470t);
            }
        }
    }

    /* renamed from: b */
    public void mo9214b(TabLayout.C55061f fVar) {
        TextView textView;
        Class cls = C63995m.class;
        C87412m.m108594g(fVar, "tab");
        C64009r0 r0Var = this.f181494a;
        r0Var.f181460g.get(r0Var.f181466p).mo3550P();
        this.f181494a.mo88774d3().setCurrentItem(fVar.f154604e);
        C64009r0 r0Var2 = this.f181494a;
        int i = fVar.f154604e;
        r0Var2.f181466p = i;
        C63462a aVar = C63462a.f180011a;
        boolean z = true;
        int i2 = (i == 0 || ((C63995m) C39818r.f106831a.mo62444c(r0Var2.getActivity()).mo75002a(cls)).mo88765g3()) ? this.f181494a.f181466p : this.f181494a.f181466p + 1;
        Log.m105924i("MicroMsg.FTSMultiReporter", "setCurrentTab >> " + i2);
        C63462a.f180015e = i2;
        aVar.mo88330e(2);
        this.f181494a.f181460g.get(fVar.f154604e).mo2202O();
        if (fVar.f154604e == 1) {
            C39818r rVar = C39818r.f106831a;
            if (((C63995m) rVar.mo62444c(this.f181494a.getActivity()).mo75002a(cls)).mo88765g3()) {
                C64009r0 r0Var3 = this.f181494a;
                TextView textView2 = r0Var3.f181462i;
                if (textView2 != null) {
                    textView2.setTextColor(r0Var3.getColor(C0966R.color.BW_0_Alpha_0_9));
                }
                C53973z1 z1Var = this.f181494a.f181471u;
                if (z1Var != null) {
                    C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
                }
                TextView textView3 = this.f181494a.f181464n;
                if (textView3 == null || textView3.getVisibility() != 0) {
                    z = false;
                }
                if (z && (textView = this.f181494a.f181464n) != null) {
                    textView.setVisibility(8);
                }
                if (!((C63995m) rVar.mo62444c(this.f181494a.getActivity()).mo75002a(cls)).f181433n) {
                    aVar.mo88330e(99);
                }
            }
        }
        ((C64004q0) C39818r.f106831a.mo62444c(this.f181494a.getActivity()).mo75002a(C64004q0.class)).mo88771c3();
    }

    /* renamed from: c */
    public void mo9215c(TabLayout.C55061f fVar) {
        C87412m.m108594g(fVar, "tab");
    }
}
